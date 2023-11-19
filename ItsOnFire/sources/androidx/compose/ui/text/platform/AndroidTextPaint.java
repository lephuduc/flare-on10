package androidx.compose.ui.text.platform;

import android.text.TextPaint;
import androidx.appcompat.R;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.style.TextDecoration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001b\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0012\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidTextPaint;", "Landroid/text/TextPaint;", "flags", "", "density", "", "(IF)V", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "setColor", "", "color", "Landroidx/compose/ui/graphics/Color;", "setColor-8_81llA", "(J)V", "setShadow", "setTextDecoration", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class AndroidTextPaint extends TextPaint {
    @NotNull
    private Shadow shadow;
    @NotNull
    private TextDecoration textDecoration;

    public AndroidTextPaint(int i2, float f2) {
        super(i2);
        ((TextPaint) this).density = f2;
        this.textDecoration = TextDecoration.Companion.getNone();
        this.shadow = Shadow.Companion.getNone();
    }

    /* renamed from: setColor-8_81llA  reason: not valid java name */
    public final void m3200setColor8_81llA(long j2) {
        int m1447toArgb8_81llA;
        if (!(j2 != Color.Companion.m1428getUnspecified0d7_KjU()) || getColor() == (m1447toArgb8_81llA = ColorKt.m1447toArgb8_81llA(j2))) {
            return;
        }
        setColor(m1447toArgb8_81llA);
    }

    public final void setShadow(@Nullable Shadow shadow) {
        if (shadow == null) {
            shadow = Shadow.Companion.getNone();
        }
        if (Intrinsics.areEqual(this.shadow, shadow)) {
            return;
        }
        this.shadow = shadow;
        if (Intrinsics.areEqual(shadow, Shadow.Companion.getNone())) {
            clearShadowLayer();
        } else {
            setShadowLayer(this.shadow.getBlurRadius(), Offset.m1161getXimpl(this.shadow.m1650getOffsetF1C5BW0()), Offset.m1162getYimpl(this.shadow.m1650getOffsetF1C5BW0()), ColorKt.m1447toArgb8_81llA(this.shadow.m1649getColor0d7_KjU()));
        }
    }

    public final void setTextDecoration(@Nullable TextDecoration textDecoration) {
        if (textDecoration == null) {
            textDecoration = TextDecoration.Companion.getNone();
        }
        if (Intrinsics.areEqual(this.textDecoration, textDecoration)) {
            return;
        }
        this.textDecoration = textDecoration;
        TextDecoration.Companion companion = TextDecoration.Companion;
        setUnderlineText(textDecoration.contains(companion.getUnderline()));
        setStrikeThruText(this.textDecoration.contains(companion.getLineThrough()));
    }
}
