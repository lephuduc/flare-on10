package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TextFieldMagnifierKt$textFieldMagnifierAndroidImpl$5$animatedMagnifierOffset$2 extends Lambda implements Function0<Offset> {
    public final /* synthetic */ Function0<Handle> $draggingHandle;
    public final /* synthetic */ Function0<TextFieldValue> $fieldValue;
    public final /* synthetic */ Function1<Integer, Rect> $getCursorRect;
    public final /* synthetic */ Function1<Integer, Integer> $transformTextOffset;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Handle.values().length];
            iArr[Handle.Cursor.ordinal()] = 1;
            iArr[Handle.SelectionStart.ordinal()] = 2;
            iArr[Handle.SelectionEnd.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldMagnifierKt$textFieldMagnifierAndroidImpl$5$animatedMagnifierOffset$2(Function0<? extends Handle> function0, Function0<TextFieldValue> function02, Function1<? super Integer, Integer> function1, Function1<? super Integer, Rect> function12) {
        super(0);
        this.$draggingHandle = function0;
        this.$fieldValue = function02;
        this.$transformTextOffset = function1;
        this.$getCursorRect = function12;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Offset invoke() {
        return Offset.m1150boximpl(m603invokeF1C5BW0());
    }

    /* renamed from: invoke-F1C5BW0  reason: not valid java name */
    public final long m603invokeF1C5BW0() {
        int m3075getStartimpl;
        Handle invoke = this.$draggingHandle.invoke();
        int i2 = invoke == null ? -1 : WhenMappings.$EnumSwitchMapping$0[invoke.ordinal()];
        if (i2 != -1) {
            if (i2 == 1 || i2 == 2) {
                m3075getStartimpl = TextRange.m3075getStartimpl(this.$fieldValue.invoke().m3187getSelectiond9O1mEE());
            } else if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            } else {
                m3075getStartimpl = TextRange.m3070getEndimpl(this.$fieldValue.invoke().m3187getSelectiond9O1mEE());
            }
            Rect invoke2 = this.$getCursorRect.invoke(Integer.valueOf(this.$transformTextOffset.invoke(Integer.valueOf(m3075getStartimpl)).intValue()));
            Offset m1150boximpl = invoke2 == null ? null : Offset.m1150boximpl(invoke2.m1191getCenterF1C5BW0());
            return m1150boximpl == null ? Offset.Companion.m1176getUnspecifiedF1C5BW0() : m1150boximpl.m1171unboximpl();
        }
        return Offset.Companion.m1176getUnspecifiedF1C5BW0();
    }
}
