package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
final class EmojiInputFilter implements InputFilter {
    private EmojiCompat.InitCallback mInitCallback;
    private final TextView mTextView;

    @RequiresApi(19)
    /* loaded from: classes.dex */
    public static class InitCallbackImpl extends EmojiCompat.InitCallback {
        private final Reference<EmojiInputFilter> mEmojiInputFilterReference;
        private final Reference<TextView> mViewRef;

        public InitCallbackImpl(TextView textView, EmojiInputFilter emojiInputFilter) {
            this.mViewRef = new WeakReference(textView);
            this.mEmojiInputFilterReference = new WeakReference(emojiInputFilter);
        }

        private boolean isInputFilterCurrentlyRegisteredOnTextView(@Nullable TextView textView, @Nullable InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        public void onInitialized() {
            super.onInitialized();
            TextView textView = this.mViewRef.get();
            if (isInputFilterCurrentlyRegisteredOnTextView(textView, this.mEmojiInputFilterReference.get()) && textView.isAttachedToWindow()) {
                CharSequence process = EmojiCompat.get().process(textView.getText());
                int selectionStart = Selection.getSelectionStart(process);
                int selectionEnd = Selection.getSelectionEnd(process);
                textView.setText(process);
                if (process instanceof Spannable) {
                    EmojiInputFilter.updateSelection((Spannable) process, selectionStart, selectionEnd);
                }
            }
        }
    }

    public EmojiInputFilter(@NonNull TextView textView) {
        this.mTextView = textView;
    }

    private EmojiCompat.InitCallback getInitCallback() {
        if (this.mInitCallback == null) {
            this.mInitCallback = new InitCallbackImpl(this.mTextView, this);
        }
        return this.mInitCallback;
    }

    public static void updateSelection(Spannable spannable, int i2, int i3) {
        if (i2 >= 0 && i3 >= 0) {
            Selection.setSelection(spannable, i2, i3);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        } else if (i3 >= 0) {
            Selection.setSelection(spannable, i3);
        }
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
        if (this.mTextView.isInEditMode()) {
            return charSequence;
        }
        int loadState = EmojiCompat.get().getLoadState();
        if (loadState != 0) {
            boolean z = true;
            if (loadState == 1) {
                if (i5 == 0 && i4 == 0 && spanned.length() == 0 && charSequence == this.mTextView.getText()) {
                    z = false;
                }
                if (!z || charSequence == null) {
                    return charSequence;
                }
                if (i2 != 0 || i3 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i2, i3);
                }
                return EmojiCompat.get().process(charSequence, 0, charSequence.length());
            } else if (loadState != 3) {
                return charSequence;
            }
        }
        EmojiCompat.get().registerInitCallback(getInitCallback());
        return charSequence;
    }
}
