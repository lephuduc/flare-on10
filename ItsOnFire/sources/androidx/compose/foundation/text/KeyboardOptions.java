package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB0\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\tø\u0001\u0000¢\u0006\u0002\u0010\nJ;\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0017\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u001cJ\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/foundation/text/KeyboardOptions;", "", "capitalization", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "autoCorrect", "", "keyboardType", "Landroidx/compose/ui/text/input/KeyboardType;", "imeAction", "Landroidx/compose/ui/text/input/ImeAction;", "(IZIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAutoCorrect", "()Z", "getCapitalization-IUNYP9k", "()I", "I", "getImeAction-eUduSuo", "getKeyboardType-PjHm6EE", "copy", "copy-3m2b7yw", "(IZII)Landroidx/compose/foundation/text/KeyboardOptions;", "equals", "other", "hashCode", "", "toImeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "singleLine", "toImeOptions$foundation_release", "toString", "", "Companion", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class KeyboardOptions {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final KeyboardOptions Default = new KeyboardOptions(0, false, 0, 0, 15, null);
    private final boolean autoCorrect;
    private final int capitalization;
    private final int imeAction;
    private final int keyboardType;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text/KeyboardOptions$Companion;", "", "()V", "Default", "Landroidx/compose/foundation/text/KeyboardOptions;", "getDefault", "()Landroidx/compose/foundation/text/KeyboardOptions;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KeyboardOptions getDefault() {
            return KeyboardOptions.Default;
        }
    }

    private KeyboardOptions(int i2, boolean z, int i3, int i4) {
        this.capitalization = i2;
        this.autoCorrect = z;
        this.keyboardType = i3;
        this.imeAction = i4;
    }

    public /* synthetic */ KeyboardOptions(int i2, boolean z, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? KeyboardCapitalization.Companion.m3164getNoneIUNYP9k() : i2, (i5 & 2) != 0 ? true : z, (i5 & 4) != 0 ? KeyboardType.Companion.m3180getTextPjHm6EE() : i3, (i5 & 8) != 0 ? ImeAction.Companion.m3141getDefaulteUduSuo() : i4, null);
    }

    public /* synthetic */ KeyboardOptions(int i2, boolean z, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, z, i3, i4);
    }

    /* renamed from: copy-3m2b7yw$default  reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m543copy3m2b7yw$default(KeyboardOptions keyboardOptions, int i2, boolean z, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = keyboardOptions.m545getCapitalizationIUNYP9k();
        }
        if ((i5 & 2) != 0) {
            z = keyboardOptions.autoCorrect;
        }
        if ((i5 & 4) != 0) {
            i3 = keyboardOptions.m547getKeyboardTypePjHm6EE();
        }
        if ((i5 & 8) != 0) {
            i4 = keyboardOptions.m546getImeActioneUduSuo();
        }
        return keyboardOptions.m544copy3m2b7yw(i2, z, i3, i4);
    }

    public static /* synthetic */ ImeOptions toImeOptions$foundation_release$default(KeyboardOptions keyboardOptions, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = ImeOptions.Companion.getDefault().getSingleLine();
        }
        return keyboardOptions.toImeOptions$foundation_release(z);
    }

    @NotNull
    /* renamed from: copy-3m2b7yw  reason: not valid java name */
    public final KeyboardOptions m544copy3m2b7yw(int i2, boolean z, int i3, int i4) {
        return new KeyboardOptions(i2, z, i3, i4, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KeyboardOptions) {
            KeyboardOptions keyboardOptions = (KeyboardOptions) obj;
            return KeyboardCapitalization.m3159equalsimpl0(m545getCapitalizationIUNYP9k(), keyboardOptions.m545getCapitalizationIUNYP9k()) && this.autoCorrect == keyboardOptions.autoCorrect && KeyboardType.m3170equalsimpl0(m547getKeyboardTypePjHm6EE(), keyboardOptions.m547getKeyboardTypePjHm6EE()) && ImeAction.m3137equalsimpl0(m546getImeActioneUduSuo(), keyboardOptions.m546getImeActioneUduSuo());
        }
        return false;
    }

    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    /* renamed from: getCapitalization-IUNYP9k  reason: not valid java name */
    public final int m545getCapitalizationIUNYP9k() {
        return this.capitalization;
    }

    /* renamed from: getImeAction-eUduSuo  reason: not valid java name */
    public final int m546getImeActioneUduSuo() {
        return this.imeAction;
    }

    /* renamed from: getKeyboardType-PjHm6EE  reason: not valid java name */
    public final int m547getKeyboardTypePjHm6EE() {
        return this.keyboardType;
    }

    public int hashCode() {
        return (((((KeyboardCapitalization.m3160hashCodeimpl(m545getCapitalizationIUNYP9k()) * 31) + Boolean.hashCode(this.autoCorrect)) * 31) + KeyboardType.m3171hashCodeimpl(m547getKeyboardTypePjHm6EE())) * 31) + ImeAction.m3138hashCodeimpl(m546getImeActioneUduSuo());
    }

    @NotNull
    public final ImeOptions toImeOptions$foundation_release(boolean z) {
        return new ImeOptions(z, m545getCapitalizationIUNYP9k(), this.autoCorrect, m547getKeyboardTypePjHm6EE(), m546getImeActioneUduSuo(), null);
    }

    @NotNull
    public String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) KeyboardCapitalization.m3161toStringimpl(m545getCapitalizationIUNYP9k())) + ", autoCorrect=" + this.autoCorrect + ", keyboardType=" + ((Object) KeyboardType.m3172toStringimpl(m547getKeyboardTypePjHm6EE())) + ", imeAction=" + ((Object) ImeAction.m3139toStringimpl(m546getImeActioneUduSuo())) + ')';
    }
}
