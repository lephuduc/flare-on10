package androidx.compose.ui.geometry;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001a-\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a+\u0010\u001a\u001a\u00020\u0002*\u00020\u00022\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0086\bø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a\"\u0010\u001f\u001a\u00020\u0002*\u00020 2\u0006\u0010!\u001a\u00020\u0002H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#\u001a\"\u0010\u001f\u001a\u00020\u0002*\u00020\u00112\u0006\u0010!\u001a\u00020\u0002H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010$\u001a\"\u0010\u001f\u001a\u00020\u0002*\u00020%2\u0006\u0010!\u001a\u00020\u0002H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010&\u001a\u0019\u0010'\u001a\u00020(*\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*\"!\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\"\u0010\u0007\u001a\u00020\b*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000b\"\"\u0010\f\u001a\u00020\b*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u000b\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006+"}, d2 = {"center", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/geometry/Size;", "getCenter-uvyYCjk$annotations", "(J)V", "getCenter-uvyYCjk", "(J)J", "isSpecified", "", "isSpecified-uvyYCjk$annotations", "isSpecified-uvyYCjk", "(J)Z", "isUnspecified", "isUnspecified-uvyYCjk$annotations", "isUnspecified-uvyYCjk", "Size", "width", "", "height", "(FF)J", "lerp", "start", "stop", "fraction", "lerp-VgWVRYQ", "(JJF)J", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-TmRCtEA", "(JLkotlin/jvm/functions/Function0;)J", "times", "", "size", "times-d16Qtg0", "(DJ)J", "(FJ)J", "", "(IJ)J", "toRect", "Landroidx/compose/ui/geometry/Rect;", "toRect-uvyYCjk", "(J)Landroidx/compose/ui/geometry/Rect;", "ui-geometry_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SizeKt {
    @Stable
    public static final long Size(float f2, float f3) {
        return Size.m1221constructorimpl((Float.floatToIntBits(f3) & 4294967295L) | (Float.floatToIntBits(f2) << 32));
    }

    /* renamed from: getCenter-uvyYCjk  reason: not valid java name */
    public static final long m1240getCenteruvyYCjk(long j2) {
        return OffsetKt.Offset(Size.m1230getWidthimpl(j2) / 2.0f, Size.m1227getHeightimpl(j2) / 2.0f);
    }

    @Stable
    /* renamed from: getCenter-uvyYCjk$annotations  reason: not valid java name */
    public static /* synthetic */ void m1241getCenteruvyYCjk$annotations(long j2) {
    }

    /* renamed from: isSpecified-uvyYCjk  reason: not valid java name */
    public static final boolean m1242isSpecifieduvyYCjk(long j2) {
        return j2 != Size.Companion.m1238getUnspecifiedNHjbRc();
    }

    @Stable
    /* renamed from: isSpecified-uvyYCjk$annotations  reason: not valid java name */
    public static /* synthetic */ void m1243isSpecifieduvyYCjk$annotations(long j2) {
    }

    /* renamed from: isUnspecified-uvyYCjk  reason: not valid java name */
    public static final boolean m1244isUnspecifieduvyYCjk(long j2) {
        return j2 == Size.Companion.m1238getUnspecifiedNHjbRc();
    }

    @Stable
    /* renamed from: isUnspecified-uvyYCjk$annotations  reason: not valid java name */
    public static /* synthetic */ void m1245isUnspecifieduvyYCjk$annotations(long j2) {
    }

    @Stable
    /* renamed from: lerp-VgWVRYQ  reason: not valid java name */
    public static final long m1246lerpVgWVRYQ(long j2, long j3, float f2) {
        return Size(MathHelpersKt.lerp(Size.m1230getWidthimpl(j2), Size.m1230getWidthimpl(j3), f2), MathHelpersKt.lerp(Size.m1227getHeightimpl(j2), Size.m1227getHeightimpl(j3), f2));
    }

    /* renamed from: takeOrElse-TmRCtEA  reason: not valid java name */
    public static final long m1247takeOrElseTmRCtEA(long j2, @NotNull Function0<Size> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return (j2 > Size.Companion.m1238getUnspecifiedNHjbRc() ? 1 : (j2 == Size.Companion.m1238getUnspecifiedNHjbRc() ? 0 : -1)) != 0 ? j2 : block.invoke().m1235unboximpl();
    }

    @Stable
    /* renamed from: times-d16Qtg0  reason: not valid java name */
    public static final long m1248timesd16Qtg0(double d2, long j2) {
        return Size.m1233times7Ah8Wj8(j2, (float) d2);
    }

    @Stable
    /* renamed from: times-d16Qtg0  reason: not valid java name */
    public static final long m1249timesd16Qtg0(float f2, long j2) {
        return Size.m1233times7Ah8Wj8(j2, f2);
    }

    @Stable
    /* renamed from: times-d16Qtg0  reason: not valid java name */
    public static final long m1250timesd16Qtg0(int i2, long j2) {
        return Size.m1233times7Ah8Wj8(j2, i2);
    }

    @Stable
    @NotNull
    /* renamed from: toRect-uvyYCjk  reason: not valid java name */
    public static final Rect m1251toRectuvyYCjk(long j2) {
        return RectKt.m1201Recttz77jQw(Offset.Companion.m1177getZeroF1C5BW0(), j2);
    }
}
