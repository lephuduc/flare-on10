package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u000b\u001a\u00020\f*\u00020\rH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u000b\u001a\u00020\f*\u00020\u0010H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\r*\u00020\u0010H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0013\u001a\u00020\r*\u00020\u0003H\u0017ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\u0013\u001a\u00020\r*\u00020\fH\u0017ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u001a*\u00020\u001bH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u0003*\u00020\rH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u0019\u0010\u001e\u001a\u00020\u0003*\u00020\u0010H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010\u0015J\f\u0010!\u001a\u00020\"*\u00020#H\u0017J\u0019\u0010$\u001a\u00020\u001b*\u00020\u001aH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010\u001dJ\u0019\u0010&\u001a\u00020\u0010*\u00020\rH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(J\u001c\u0010&\u001a\u00020\u0010*\u00020\u0003H\u0017ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b)\u0010(J\u001c\u0010&\u001a\u00020\u0010*\u00020\fH\u0017ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0002\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Landroidx/compose/ui/unit/Density;", "", "density", "", "getDensity$annotations", "()V", "getDensity", "()F", "fontScale", "getFontScale$annotations", "getFontScale", "roundToPx", "", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp", "toDp-GaN1DYA", "(J)F", "toDp-u2uoSUM", "(F)F", "(I)F", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toDpSize-k-rfVVM", "(J)J", "toPx", "toPx-0680j_4", "toPx--R2X_6o", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSize", "toSize-XkaWNTQ", "toSp", "toSp-0xMU5do", "(F)J", "toSp-kPz2Gy4", "(I)J", "ui-unit_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public interface Density {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Stable
        public static /* synthetic */ void getDensity$annotations() {
        }

        @Stable
        public static /* synthetic */ void getFontScale$annotations() {
        }

        @Stable
        /* renamed from: roundToPx--R2X_6o  reason: not valid java name */
        public static int m3311roundToPxR2X_6o(@NotNull Density density, long j2) {
            int roundToInt;
            Intrinsics.checkNotNullParameter(density, "this");
            roundToInt = MathKt__MathJVMKt.roundToInt(density.mo276toPxR2X_6o(j2));
            return roundToInt;
        }

        @Stable
        /* renamed from: roundToPx-0680j_4  reason: not valid java name */
        public static int m3312roundToPx0680j_4(@NotNull Density density, float f2) {
            int roundToInt;
            Intrinsics.checkNotNullParameter(density, "this");
            float mo277toPx0680j_4 = density.mo277toPx0680j_4(f2);
            if (Float.isInfinite(mo277toPx0680j_4)) {
                return Integer.MAX_VALUE;
            }
            roundToInt = MathKt__MathJVMKt.roundToInt(mo277toPx0680j_4);
            return roundToInt;
        }

        @Stable
        /* renamed from: toDp-GaN1DYA  reason: not valid java name */
        public static float m3313toDpGaN1DYA(@NotNull Density density, long j2) {
            Intrinsics.checkNotNullParameter(density, "this");
            if (TextUnitType.m3534equalsimpl0(TextUnit.m3505getTypeUIouoOA(j2), TextUnitType.Companion.m3539getSpUIouoOA())) {
                return Dp.m3325constructorimpl(TextUnit.m3506getValueimpl(j2) * density.getFontScale());
            }
            throw new IllegalStateException("Only Sp can convert to Px".toString());
        }

        @Stable
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m3314toDpu2uoSUM(@NotNull Density density, float f2) {
            Intrinsics.checkNotNullParameter(density, "this");
            return Dp.m3325constructorimpl(f2 / density.getDensity());
        }

        @Stable
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m3315toDpu2uoSUM(@NotNull Density density, int i2) {
            Intrinsics.checkNotNullParameter(density, "this");
            return Dp.m3325constructorimpl(i2 / density.getDensity());
        }

        @Stable
        /* renamed from: toDpSize-k-rfVVM  reason: not valid java name */
        public static long m3316toDpSizekrfVVM(@NotNull Density density, long j2) {
            Intrinsics.checkNotNullParameter(density, "this");
            return (j2 > Size.Companion.m1238getUnspecifiedNHjbRc() ? 1 : (j2 == Size.Companion.m1238getUnspecifiedNHjbRc() ? 0 : -1)) != 0 ? DpKt.m3347DpSizeYgX7TsA(density.mo273toDpu2uoSUM(Size.m1230getWidthimpl(j2)), density.mo273toDpu2uoSUM(Size.m1227getHeightimpl(j2))) : DpSize.Companion.m3432getUnspecifiedMYxV2XQ();
        }

        @Stable
        /* renamed from: toPx--R2X_6o  reason: not valid java name */
        public static float m3317toPxR2X_6o(@NotNull Density density, long j2) {
            Intrinsics.checkNotNullParameter(density, "this");
            if (TextUnitType.m3534equalsimpl0(TextUnit.m3505getTypeUIouoOA(j2), TextUnitType.Companion.m3539getSpUIouoOA())) {
                return TextUnit.m3506getValueimpl(j2) * density.getFontScale() * density.getDensity();
            }
            throw new IllegalStateException("Only Sp can convert to Px".toString());
        }

        @Stable
        /* renamed from: toPx-0680j_4  reason: not valid java name */
        public static float m3318toPx0680j_4(@NotNull Density density, float f2) {
            Intrinsics.checkNotNullParameter(density, "this");
            return f2 * density.getDensity();
        }

        @Stable
        @NotNull
        public static Rect toRect(@NotNull Density density, @NotNull DpRect receiver) {
            Intrinsics.checkNotNullParameter(density, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            return new Rect(density.mo277toPx0680j_4(receiver.m3408getLeftD9Ej5fM()), density.mo277toPx0680j_4(receiver.m3410getTopD9Ej5fM()), density.mo277toPx0680j_4(receiver.m3409getRightD9Ej5fM()), density.mo277toPx0680j_4(receiver.m3407getBottomD9Ej5fM()));
        }

        @Stable
        /* renamed from: toSize-XkaWNTQ  reason: not valid java name */
        public static long m3319toSizeXkaWNTQ(@NotNull Density density, long j2) {
            Intrinsics.checkNotNullParameter(density, "this");
            return (j2 > DpSize.Companion.m3432getUnspecifiedMYxV2XQ() ? 1 : (j2 == DpSize.Companion.m3432getUnspecifiedMYxV2XQ() ? 0 : -1)) != 0 ? SizeKt.Size(density.mo277toPx0680j_4(DpSize.m3423getWidthD9Ej5fM(j2)), density.mo277toPx0680j_4(DpSize.m3421getHeightD9Ej5fM(j2))) : Size.Companion.m1238getUnspecifiedNHjbRc();
        }

        @Stable
        /* renamed from: toSp-0xMU5do  reason: not valid java name */
        public static long m3320toSp0xMU5do(@NotNull Density density, float f2) {
            Intrinsics.checkNotNullParameter(density, "this");
            return TextUnitKt.getSp(f2 / density.getFontScale());
        }

        @Stable
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m3321toSpkPz2Gy4(@NotNull Density density, float f2) {
            Intrinsics.checkNotNullParameter(density, "this");
            return TextUnitKt.getSp(f2 / (density.getFontScale() * density.getDensity()));
        }

        @Stable
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m3322toSpkPz2Gy4(@NotNull Density density, int i2) {
            Intrinsics.checkNotNullParameter(density, "this");
            return TextUnitKt.getSp(i2 / (density.getFontScale() * density.getDensity()));
        }
    }

    float getDensity();

    float getFontScale();

    @Stable
    /* renamed from: roundToPx--R2X_6o */
    int mo270roundToPxR2X_6o(long j2);

    @Stable
    /* renamed from: roundToPx-0680j_4 */
    int mo271roundToPx0680j_4(float f2);

    @Stable
    /* renamed from: toDp-GaN1DYA */
    float mo272toDpGaN1DYA(long j2);

    @Stable
    /* renamed from: toDp-u2uoSUM */
    float mo273toDpu2uoSUM(float f2);

    @Stable
    /* renamed from: toDp-u2uoSUM */
    float mo274toDpu2uoSUM(int i2);

    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    long mo275toDpSizekrfVVM(long j2);

    @Stable
    /* renamed from: toPx--R2X_6o */
    float mo276toPxR2X_6o(long j2);

    @Stable
    /* renamed from: toPx-0680j_4 */
    float mo277toPx0680j_4(float f2);

    @Stable
    @NotNull
    Rect toRect(@NotNull DpRect dpRect);

    @Stable
    /* renamed from: toSize-XkaWNTQ */
    long mo278toSizeXkaWNTQ(long j2);

    @Stable
    /* renamed from: toSp-0xMU5do */
    long mo279toSp0xMU5do(float f2);

    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    long mo280toSpkPz2Gy4(float f2);

    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    long mo281toSpkPz2Gy4(int i2);
}
