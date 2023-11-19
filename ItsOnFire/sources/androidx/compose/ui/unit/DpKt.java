package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b:\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a%\u00105\u001a\u00020\u00012\u0006\u00106\u001a\u00020\b2\u0006\u00107\u001a\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b8\u00109\u001a%\u0010:\u001a\u00020\u00022\u0006\u00102\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b;\u00109\u001a-\u0010<\u001a\u00020\b2\u0006\u0010=\u001a\u00020\b2\u0006\u0010>\u001a\u00020\b2\u0006\u0010?\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b@\u0010A\u001a-\u0010<\u001a\u00020\u00012\u0006\u0010=\u001a\u00020\u00012\u0006\u0010>\u001a\u00020\u00012\u0006\u0010?\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bB\u0010C\u001a-\u0010<\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u00022\u0006\u0010>\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bD\u0010C\u001a&\u0010E\u001a\u00020\b2\u0006\u0010F\u001a\u00020\b2\u0006\u0010G\u001a\u00020\bH\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bH\u0010I\u001a&\u0010J\u001a\u00020\b2\u0006\u0010F\u001a\u00020\b2\u0006\u0010G\u001a\u00020\bH\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bK\u0010I\u001a\"\u0010L\u001a\u00020\b*\u00020\b2\u0006\u0010M\u001a\u00020\bH\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bN\u0010I\u001a\"\u0010O\u001a\u00020\b*\u00020\b2\u0006\u0010P\u001a\u00020\bH\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bQ\u0010I\u001a*\u0010R\u001a\u00020\b*\u00020\b2\u0006\u0010M\u001a\u00020\b2\u0006\u0010P\u001a\u00020\bH\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bS\u0010A\u001a+\u0010T\u001a\u00020\b*\u00020\b2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\b0VH\u0086\bø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\bW\u0010X\u001a+\u0010T\u001a\u00020\u0001*\u00020\u00012\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00010VH\u0086\bø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\bY\u0010Z\u001a+\u0010T\u001a\u00020\u0002*\u00020\u00022\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00020VH\u0086\bø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b[\u0010Z\u001a\"\u0010\\\u001a\u00020\b*\u00020\t2\u0006\u0010]\u001a\u00020\bH\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b^\u0010_\u001a\"\u0010\\\u001a\u00020\b*\u00020\u000e2\u0006\u0010]\u001a\u00020\bH\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b^\u0010I\u001a\"\u0010\\\u001a\u00020\u0002*\u00020\u000e2\u0006\u0010.\u001a\u00020\u0002H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b`\u0010a\u001a\"\u0010\\\u001a\u00020\b*\u00020\u00112\u0006\u0010]\u001a\u00020\bH\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b^\u0010b\u001a\"\u0010\\\u001a\u00020\u0002*\u00020\u00112\u0006\u0010.\u001a\u00020\u0002H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b`\u0010c\"!\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\"\u0010\u0007\u001a\u00020\b*\u00020\t8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\"\u0010\u0007\u001a\u00020\b*\u00020\u000e8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\n\u0010\u000f\u001a\u0004\b\f\u0010\u0010\"\"\u0010\u0007\u001a\u00020\b*\u00020\u00118Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\n\u0010\u0012\u001a\u0004\b\f\u0010\u0013\"\"\u0010\u0014\u001a\u00020\b*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\"\u0010\u001a\u001a\u00020\u001b*\u00020\b8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u001e\"\"\u0010\u001f\u001a\u00020\u001b*\u00020\b8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b \u0010\u000f\u001a\u0004\b!\u0010\u001e\"\"\u0010\u001f\u001a\u00020\u001b*\u00020\u00018Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\"\u0010\u0004\u001a\u0004\b#\u0010$\"\"\u0010\u001f\u001a\u00020\u001b*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010$\"\"\u0010'\u001a\u00020\u001b*\u00020\b8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b(\u0010\u000f\u001a\u0004\b)\u0010\u001e\"\"\u0010'\u001a\u00020\u001b*\u00020\u00018Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b*\u0010\u0004\u001a\u0004\b+\u0010$\"\"\u0010'\u001a\u00020\u001b*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b,\u0010\u0004\u001a\u0004\b-\u0010$\"\"\u0010.\u001a\u00020\u0002*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b/\u0010\u0017\u001a\u0004\b0\u00101\"\"\u00102\u001a\u00020\b*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b3\u0010\u0017\u001a\u0004\b4\u0010\u0019\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006d"}, d2 = {"center", "Landroidx/compose/ui/unit/DpOffset;", "Landroidx/compose/ui/unit/DpSize;", "getCenter-EaSLcWc$annotations", "(J)V", "getCenter-EaSLcWc", "(J)J", "dp", "Landroidx/compose/ui/unit/Dp;", "", "getDp$annotations", "(D)V", "getDp", "(D)F", "", "(F)V", "(F)F", "", "(I)V", "(I)F", "height", "Landroidx/compose/ui/unit/DpRect;", "getHeight$annotations", "(Landroidx/compose/ui/unit/DpRect;)V", "getHeight", "(Landroidx/compose/ui/unit/DpRect;)F", "isFinite", "", "isFinite-0680j_4$annotations", "isFinite-0680j_4", "(F)Z", "isSpecified", "isSpecified-0680j_4$annotations", "isSpecified-0680j_4", "isSpecified-jo-Fl9I$annotations", "isSpecified-jo-Fl9I", "(J)Z", "isSpecified-EaSLcWc$annotations", "isSpecified-EaSLcWc", "isUnspecified", "isUnspecified-0680j_4$annotations", "isUnspecified-0680j_4", "isUnspecified-jo-Fl9I$annotations", "isUnspecified-jo-Fl9I", "isUnspecified-EaSLcWc$annotations", "isUnspecified-EaSLcWc", "size", "getSize$annotations", "getSize", "(Landroidx/compose/ui/unit/DpRect;)J", "width", "getWidth$annotations", "getWidth", "DpOffset", "x", "y", "DpOffset-YgX7TsA", "(FF)J", "DpSize", "DpSize-YgX7TsA", "lerp", "start", "stop", "fraction", "lerp-Md-fbLM", "(FFF)F", "lerp-xhh869w", "(JJF)J", "lerp-IDex15A", "max", "a", "b", "max-YgX7TsA", "(FF)F", "min", "min-YgX7TsA", "coerceAtLeast", "minimumValue", "coerceAtLeast-YgX7TsA", "coerceAtMost", "maximumValue", "coerceAtMost-YgX7TsA", "coerceIn", "coerceIn-2z7ARbQ", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-D5KLDUw", "(FLkotlin/jvm/functions/Function0;)F", "takeOrElse-gVKV90s", "(JLkotlin/jvm/functions/Function0;)J", "takeOrElse-itqla9I", "times", "other", "times-3ABfNKs", "(DF)F", "times-6HolHcs", "(FJ)J", "(IF)F", "(IJ)J", "ui-unit_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class DpKt {
    @Stable
    /* renamed from: DpOffset-YgX7TsA  reason: not valid java name */
    public static final long m3346DpOffsetYgX7TsA(float f2, float f3) {
        return DpOffset.m3381constructorimpl((Float.floatToIntBits(f3) & 4294967295L) | (Float.floatToIntBits(f2) << 32));
    }

    @Stable
    /* renamed from: DpSize-YgX7TsA  reason: not valid java name */
    public static final long m3347DpSizeYgX7TsA(float f2, float f3) {
        return DpSize.m3414constructorimpl((Float.floatToIntBits(f3) & 4294967295L) | (Float.floatToIntBits(f2) << 32));
    }

    @Stable
    /* renamed from: coerceAtLeast-YgX7TsA  reason: not valid java name */
    public static final float m3348coerceAtLeastYgX7TsA(float f2, float f3) {
        float coerceAtLeast;
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(f2, f3);
        return Dp.m3325constructorimpl(coerceAtLeast);
    }

    @Stable
    /* renamed from: coerceAtMost-YgX7TsA  reason: not valid java name */
    public static final float m3349coerceAtMostYgX7TsA(float f2, float f3) {
        float coerceAtMost;
        coerceAtMost = RangesKt___RangesKt.coerceAtMost(f2, f3);
        return Dp.m3325constructorimpl(coerceAtMost);
    }

    @Stable
    /* renamed from: coerceIn-2z7ARbQ  reason: not valid java name */
    public static final float m3350coerceIn2z7ARbQ(float f2, float f3, float f4) {
        float coerceIn;
        coerceIn = RangesKt___RangesKt.coerceIn(f2, f3, f4);
        return Dp.m3325constructorimpl(coerceIn);
    }

    /* renamed from: getCenter-EaSLcWc  reason: not valid java name */
    public static final long m3351getCenterEaSLcWc(long j2) {
        return m3346DpOffsetYgX7TsA(Dp.m3325constructorimpl(DpSize.m3423getWidthD9Ej5fM(j2) / 2.0f), Dp.m3325constructorimpl(DpSize.m3421getHeightD9Ej5fM(j2) / 2.0f));
    }

    @Stable
    /* renamed from: getCenter-EaSLcWc$annotations  reason: not valid java name */
    public static /* synthetic */ void m3352getCenterEaSLcWc$annotations(long j2) {
    }

    public static final float getDp(double d2) {
        return Dp.m3325constructorimpl((float) d2);
    }

    public static final float getDp(float f2) {
        return Dp.m3325constructorimpl(f2);
    }

    public static final float getDp(int i2) {
        return Dp.m3325constructorimpl(i2);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(double d2) {
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(float f2) {
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(int i2) {
    }

    public static final float getHeight(@NotNull DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return Dp.m3325constructorimpl(dpRect.m3407getBottomD9Ej5fM() - dpRect.m3410getTopD9Ej5fM());
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations(DpRect dpRect) {
    }

    public static final long getSize(@NotNull DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return m3347DpSizeYgX7TsA(Dp.m3325constructorimpl(dpRect.m3409getRightD9Ej5fM() - dpRect.m3408getLeftD9Ej5fM()), Dp.m3325constructorimpl(dpRect.m3407getBottomD9Ej5fM() - dpRect.m3410getTopD9Ej5fM()));
    }

    @Stable
    public static /* synthetic */ void getSize$annotations(DpRect dpRect) {
    }

    public static final float getWidth(@NotNull DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return Dp.m3325constructorimpl(dpRect.m3409getRightD9Ej5fM() - dpRect.m3408getLeftD9Ej5fM());
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations(DpRect dpRect) {
    }

    /* renamed from: isFinite-0680j_4  reason: not valid java name */
    public static final boolean m3353isFinite0680j_4(float f2) {
        return !(f2 == Float.POSITIVE_INFINITY);
    }

    @Stable
    /* renamed from: isFinite-0680j_4$annotations  reason: not valid java name */
    public static /* synthetic */ void m3354isFinite0680j_4$annotations(float f2) {
    }

    /* renamed from: isSpecified-0680j_4  reason: not valid java name */
    public static final boolean m3355isSpecified0680j_4(float f2) {
        return !Float.isNaN(f2);
    }

    @Stable
    /* renamed from: isSpecified-0680j_4$annotations  reason: not valid java name */
    public static /* synthetic */ void m3356isSpecified0680j_4$annotations(float f2) {
    }

    /* renamed from: isSpecified-EaSLcWc  reason: not valid java name */
    public static final boolean m3357isSpecifiedEaSLcWc(long j2) {
        return j2 != DpSize.Companion.m3432getUnspecifiedMYxV2XQ();
    }

    @Stable
    /* renamed from: isSpecified-EaSLcWc$annotations  reason: not valid java name */
    public static /* synthetic */ void m3358isSpecifiedEaSLcWc$annotations(long j2) {
    }

    /* renamed from: isSpecified-jo-Fl9I  reason: not valid java name */
    public static final boolean m3359isSpecifiedjoFl9I(long j2) {
        return j2 != DpOffset.Companion.m3395getUnspecifiedRKDOV3M();
    }

    @Stable
    /* renamed from: isSpecified-jo-Fl9I$annotations  reason: not valid java name */
    public static /* synthetic */ void m3360isSpecifiedjoFl9I$annotations(long j2) {
    }

    /* renamed from: isUnspecified-0680j_4  reason: not valid java name */
    public static final boolean m3361isUnspecified0680j_4(float f2) {
        return Float.isNaN(f2);
    }

    @Stable
    /* renamed from: isUnspecified-0680j_4$annotations  reason: not valid java name */
    public static /* synthetic */ void m3362isUnspecified0680j_4$annotations(float f2) {
    }

    /* renamed from: isUnspecified-EaSLcWc  reason: not valid java name */
    public static final boolean m3363isUnspecifiedEaSLcWc(long j2) {
        return j2 == DpSize.Companion.m3432getUnspecifiedMYxV2XQ();
    }

    @Stable
    /* renamed from: isUnspecified-EaSLcWc$annotations  reason: not valid java name */
    public static /* synthetic */ void m3364isUnspecifiedEaSLcWc$annotations(long j2) {
    }

    /* renamed from: isUnspecified-jo-Fl9I  reason: not valid java name */
    public static final boolean m3365isUnspecifiedjoFl9I(long j2) {
        return j2 == DpOffset.Companion.m3395getUnspecifiedRKDOV3M();
    }

    @Stable
    /* renamed from: isUnspecified-jo-Fl9I$annotations  reason: not valid java name */
    public static /* synthetic */ void m3366isUnspecifiedjoFl9I$annotations(long j2) {
    }

    @Stable
    /* renamed from: lerp-IDex15A  reason: not valid java name */
    public static final long m3367lerpIDex15A(long j2, long j3, float f2) {
        return m3347DpSizeYgX7TsA(m3368lerpMdfbLM(DpSize.m3423getWidthD9Ej5fM(j2), DpSize.m3423getWidthD9Ej5fM(j3), f2), m3368lerpMdfbLM(DpSize.m3421getHeightD9Ej5fM(j2), DpSize.m3421getHeightD9Ej5fM(j3), f2));
    }

    @Stable
    /* renamed from: lerp-Md-fbLM  reason: not valid java name */
    public static final float m3368lerpMdfbLM(float f2, float f3, float f4) {
        return Dp.m3325constructorimpl(MathHelpersKt.lerp(f2, f3, f4));
    }

    @Stable
    /* renamed from: lerp-xhh869w  reason: not valid java name */
    public static final long m3369lerpxhh869w(long j2, long j3, float f2) {
        return m3346DpOffsetYgX7TsA(m3368lerpMdfbLM(DpOffset.m3386getXD9Ej5fM(j2), DpOffset.m3386getXD9Ej5fM(j3), f2), m3368lerpMdfbLM(DpOffset.m3388getYD9Ej5fM(j2), DpOffset.m3388getYD9Ej5fM(j3), f2));
    }

    @Stable
    /* renamed from: max-YgX7TsA  reason: not valid java name */
    public static final float m3370maxYgX7TsA(float f2, float f3) {
        return Dp.m3325constructorimpl(Math.max(f2, f3));
    }

    @Stable
    /* renamed from: min-YgX7TsA  reason: not valid java name */
    public static final float m3371minYgX7TsA(float f2, float f3) {
        return Dp.m3325constructorimpl(Math.min(f2, f3));
    }

    /* renamed from: takeOrElse-D5KLDUw  reason: not valid java name */
    public static final float m3372takeOrElseD5KLDUw(float f2, @NotNull Function0<Dp> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return Float.isNaN(f2) ^ true ? f2 : block.invoke().m3339unboximpl();
    }

    /* renamed from: takeOrElse-gVKV90s  reason: not valid java name */
    public static final long m3373takeOrElsegVKV90s(long j2, @NotNull Function0<DpOffset> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return (j2 > DpOffset.Companion.m3395getUnspecifiedRKDOV3M() ? 1 : (j2 == DpOffset.Companion.m3395getUnspecifiedRKDOV3M() ? 0 : -1)) != 0 ? j2 : block.invoke().m3394unboximpl();
    }

    /* renamed from: takeOrElse-itqla9I  reason: not valid java name */
    public static final long m3374takeOrElseitqla9I(long j2, @NotNull Function0<DpSize> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return (j2 > DpSize.Companion.m3432getUnspecifiedMYxV2XQ() ? 1 : (j2 == DpSize.Companion.m3432getUnspecifiedMYxV2XQ() ? 0 : -1)) != 0 ? j2 : block.invoke().m3431unboximpl();
    }

    @Stable
    /* renamed from: times-3ABfNKs  reason: not valid java name */
    public static final float m3375times3ABfNKs(double d2, float f2) {
        return Dp.m3325constructorimpl(((float) d2) * f2);
    }

    @Stable
    /* renamed from: times-3ABfNKs  reason: not valid java name */
    public static final float m3376times3ABfNKs(float f2, float f3) {
        return Dp.m3325constructorimpl(f2 * f3);
    }

    @Stable
    /* renamed from: times-3ABfNKs  reason: not valid java name */
    public static final float m3377times3ABfNKs(int i2, float f2) {
        return Dp.m3325constructorimpl(i2 * f2);
    }

    @Stable
    /* renamed from: times-6HolHcs  reason: not valid java name */
    public static final long m3378times6HolHcs(float f2, long j2) {
        return DpSize.m3428timesGh9hcWk(j2, f2);
    }

    @Stable
    /* renamed from: times-6HolHcs  reason: not valid java name */
    public static final long m3379times6HolHcs(int i2, long j2) {
        return DpSize.m3429timesGh9hcWk(j2, i2);
    }
}
