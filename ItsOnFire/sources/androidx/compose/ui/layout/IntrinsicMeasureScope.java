package androidx.compose.ui.layout;

import androidx.appcompat.R;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public interface IntrinsicMeasureScope extends Density {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Stable
        /* renamed from: roundToPx--R2X_6o  reason: not valid java name */
        public static int m2760roundToPxR2X_6o(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, long j2) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "this");
            return Density.DefaultImpls.m3311roundToPxR2X_6o(intrinsicMeasureScope, j2);
        }

        @Stable
        /* renamed from: roundToPx-0680j_4  reason: not valid java name */
        public static int m2761roundToPx0680j_4(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, float f2) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "this");
            return Density.DefaultImpls.m3312roundToPx0680j_4(intrinsicMeasureScope, f2);
        }

        @Stable
        /* renamed from: toDp-GaN1DYA  reason: not valid java name */
        public static float m2762toDpGaN1DYA(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, long j2) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "this");
            return Density.DefaultImpls.m3313toDpGaN1DYA(intrinsicMeasureScope, j2);
        }

        @Stable
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m2763toDpu2uoSUM(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, float f2) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "this");
            return Density.DefaultImpls.m3314toDpu2uoSUM(intrinsicMeasureScope, f2);
        }

        @Stable
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m2764toDpu2uoSUM(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, int i2) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "this");
            return Density.DefaultImpls.m3315toDpu2uoSUM((Density) intrinsicMeasureScope, i2);
        }

        @Stable
        /* renamed from: toDpSize-k-rfVVM  reason: not valid java name */
        public static long m2765toDpSizekrfVVM(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, long j2) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "this");
            return Density.DefaultImpls.m3316toDpSizekrfVVM(intrinsicMeasureScope, j2);
        }

        @Stable
        /* renamed from: toPx--R2X_6o  reason: not valid java name */
        public static float m2766toPxR2X_6o(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, long j2) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "this");
            return Density.DefaultImpls.m3317toPxR2X_6o(intrinsicMeasureScope, j2);
        }

        @Stable
        /* renamed from: toPx-0680j_4  reason: not valid java name */
        public static float m2767toPx0680j_4(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, float f2) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "this");
            return Density.DefaultImpls.m3318toPx0680j_4(intrinsicMeasureScope, f2);
        }

        @Stable
        @NotNull
        public static Rect toRect(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull DpRect receiver) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            return Density.DefaultImpls.toRect(intrinsicMeasureScope, receiver);
        }

        @Stable
        /* renamed from: toSize-XkaWNTQ  reason: not valid java name */
        public static long m2768toSizeXkaWNTQ(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, long j2) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "this");
            return Density.DefaultImpls.m3319toSizeXkaWNTQ(intrinsicMeasureScope, j2);
        }

        @Stable
        /* renamed from: toSp-0xMU5do  reason: not valid java name */
        public static long m2769toSp0xMU5do(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, float f2) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "this");
            return Density.DefaultImpls.m3320toSp0xMU5do(intrinsicMeasureScope, f2);
        }

        @Stable
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m2770toSpkPz2Gy4(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, float f2) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "this");
            return Density.DefaultImpls.m3321toSpkPz2Gy4(intrinsicMeasureScope, f2);
        }

        @Stable
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m2771toSpkPz2Gy4(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, int i2) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "this");
            return Density.DefaultImpls.m3322toSpkPz2Gy4((Density) intrinsicMeasureScope, i2);
        }
    }

    @NotNull
    LayoutDirection getLayoutDirection();
}
