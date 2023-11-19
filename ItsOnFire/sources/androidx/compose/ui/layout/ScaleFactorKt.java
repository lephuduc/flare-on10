package androidx.compose.ui.layout;

import androidx.appcompat.R;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a \u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a-\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\"\u0010\u0015\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\f\u0010\u001a\u001a\u00020\f*\u00020\fH\u0002\u001a+\u0010\u001b\u001a\u00020\u0002*\u00020\u00022\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0086\bø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a\"\u0010 \u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\u0019\u001a\"\u0010 \u001a\u00020\u0016*\u00020\u00022\u0006\u0010\"\u001a\u00020\u0016H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010\u0019\"\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\"\u0010\u0007\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006$"}, d2 = {"isSpecified", "", "Landroidx/compose/ui/layout/ScaleFactor;", "isSpecified-FK8aYYs$annotations", "(J)V", "isSpecified-FK8aYYs", "(J)Z", "isUnspecified", "isUnspecified-FK8aYYs$annotations", "isUnspecified-FK8aYYs", "ScaleFactor", "scaleX", "", "scaleY", "(FF)J", "lerp", "start", "stop", "fraction", "lerp--bDIf60", "(JJF)J", "div", "Landroidx/compose/ui/geometry/Size;", "scaleFactor", "div-UQTWf7w", "(JJ)J", "roundToTenths", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-oyDd2qo", "(JLkotlin/jvm/functions/Function0;)J", "times", "times-UQTWf7w", "size", "times-m-w2e94", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ScaleFactorKt {
    @Stable
    public static final long ScaleFactor(float f2, float f3) {
        return ScaleFactor.m2813constructorimpl((Float.floatToIntBits(f3) & 4294967295L) | (Float.floatToIntBits(f2) << 32));
    }

    @Stable
    /* renamed from: div-UQTWf7w  reason: not valid java name */
    public static final long m2827divUQTWf7w(long j2, long j3) {
        return SizeKt.Size(Size.m1230getWidthimpl(j2) / ScaleFactor.m2819getScaleXimpl(j3), Size.m1227getHeightimpl(j2) / ScaleFactor.m2820getScaleYimpl(j3));
    }

    /* renamed from: isSpecified-FK8aYYs  reason: not valid java name */
    public static final boolean m2828isSpecifiedFK8aYYs(long j2) {
        return j2 != ScaleFactor.Companion.m2826getUnspecified_hLwfpc();
    }

    @Stable
    /* renamed from: isSpecified-FK8aYYs$annotations  reason: not valid java name */
    public static /* synthetic */ void m2829isSpecifiedFK8aYYs$annotations(long j2) {
    }

    /* renamed from: isUnspecified-FK8aYYs  reason: not valid java name */
    public static final boolean m2830isUnspecifiedFK8aYYs(long j2) {
        return j2 == ScaleFactor.Companion.m2826getUnspecified_hLwfpc();
    }

    @Stable
    /* renamed from: isUnspecified-FK8aYYs$annotations  reason: not valid java name */
    public static /* synthetic */ void m2831isUnspecifiedFK8aYYs$annotations(long j2) {
    }

    @Stable
    /* renamed from: lerp--bDIf60  reason: not valid java name */
    public static final long m2832lerpbDIf60(long j2, long j3, float f2) {
        return ScaleFactor(MathHelpersKt.lerp(ScaleFactor.m2819getScaleXimpl(j2), ScaleFactor.m2819getScaleXimpl(j3), f2), MathHelpersKt.lerp(ScaleFactor.m2820getScaleYimpl(j2), ScaleFactor.m2820getScaleYimpl(j3), f2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float roundToTenths(float f2) {
        float f3 = 10;
        float f4 = f2 * f3;
        int i2 = (int) f4;
        if (f4 - i2 >= 0.5f) {
            i2++;
        }
        return i2 / f3;
    }

    /* renamed from: takeOrElse-oyDd2qo  reason: not valid java name */
    public static final long m2833takeOrElseoyDd2qo(long j2, @NotNull Function0<ScaleFactor> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return (j2 > ScaleFactor.Companion.m2826getUnspecified_hLwfpc() ? 1 : (j2 == ScaleFactor.Companion.m2826getUnspecified_hLwfpc() ? 0 : -1)) != 0 ? j2 : block.invoke().m2824unboximpl();
    }

    @Stable
    /* renamed from: times-UQTWf7w  reason: not valid java name */
    public static final long m2834timesUQTWf7w(long j2, long j3) {
        return SizeKt.Size(Size.m1230getWidthimpl(j2) * ScaleFactor.m2819getScaleXimpl(j3), Size.m1227getHeightimpl(j2) * ScaleFactor.m2820getScaleYimpl(j3));
    }

    @Stable
    /* renamed from: times-m-w2e94  reason: not valid java name */
    public static final long m2835timesmw2e94(long j2, long j3) {
        return m2834timesUQTWf7w(j3, j2);
    }
}
