package androidx.compose.ui.input.pointer;

import androidx.appcompat.R;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J@\u0010\u0016\u001a\u0002H\u0017\"\u0004\b\u0000\u0010\u00172'\u0010\u0018\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00170\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0019¢\u0006\u0002\b\u001dH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001eR\u001d\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R*\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u0010X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/ui/unit/Density;", "extendedTouchPadding", "Landroidx/compose/ui/geometry/Size;", "getExtendedTouchPadding-NH-jbRc", "()J", "<anonymous parameter 0>", "", "interceptOutOfBoundsChildEvents", "getInterceptOutOfBoundsChildEvents$annotations", "()V", "getInterceptOutOfBoundsChildEvents", "()Z", "setInterceptOutOfBoundsChildEvents", "(Z)V", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "awaitPointerEventScope", "R", "block", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public interface PointerInputScope extends Density {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        /* renamed from: getExtendedTouchPadding-NH-jbRc  reason: not valid java name */
        public static long m2682getExtendedTouchPaddingNHjbRc(@NotNull PointerInputScope pointerInputScope) {
            Intrinsics.checkNotNullParameter(pointerInputScope, "this");
            return Size.Companion.m1239getZeroNHjbRc();
        }

        public static boolean getInterceptOutOfBoundsChildEvents(@NotNull PointerInputScope pointerInputScope) {
            Intrinsics.checkNotNullParameter(pointerInputScope, "this");
            return false;
        }

        public static /* synthetic */ void getInterceptOutOfBoundsChildEvents$annotations() {
        }

        @Stable
        /* renamed from: roundToPx--R2X_6o  reason: not valid java name */
        public static int m2683roundToPxR2X_6o(@NotNull PointerInputScope pointerInputScope, long j2) {
            Intrinsics.checkNotNullParameter(pointerInputScope, "this");
            return Density.DefaultImpls.m3311roundToPxR2X_6o(pointerInputScope, j2);
        }

        @Stable
        /* renamed from: roundToPx-0680j_4  reason: not valid java name */
        public static int m2684roundToPx0680j_4(@NotNull PointerInputScope pointerInputScope, float f2) {
            Intrinsics.checkNotNullParameter(pointerInputScope, "this");
            return Density.DefaultImpls.m3312roundToPx0680j_4(pointerInputScope, f2);
        }

        public static void setInterceptOutOfBoundsChildEvents(@NotNull PointerInputScope pointerInputScope, boolean z) {
            Intrinsics.checkNotNullParameter(pointerInputScope, "this");
        }

        @Stable
        /* renamed from: toDp-GaN1DYA  reason: not valid java name */
        public static float m2685toDpGaN1DYA(@NotNull PointerInputScope pointerInputScope, long j2) {
            Intrinsics.checkNotNullParameter(pointerInputScope, "this");
            return Density.DefaultImpls.m3313toDpGaN1DYA(pointerInputScope, j2);
        }

        @Stable
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m2686toDpu2uoSUM(@NotNull PointerInputScope pointerInputScope, float f2) {
            Intrinsics.checkNotNullParameter(pointerInputScope, "this");
            return Density.DefaultImpls.m3314toDpu2uoSUM(pointerInputScope, f2);
        }

        @Stable
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m2687toDpu2uoSUM(@NotNull PointerInputScope pointerInputScope, int i2) {
            Intrinsics.checkNotNullParameter(pointerInputScope, "this");
            return Density.DefaultImpls.m3315toDpu2uoSUM((Density) pointerInputScope, i2);
        }

        @Stable
        /* renamed from: toDpSize-k-rfVVM  reason: not valid java name */
        public static long m2688toDpSizekrfVVM(@NotNull PointerInputScope pointerInputScope, long j2) {
            Intrinsics.checkNotNullParameter(pointerInputScope, "this");
            return Density.DefaultImpls.m3316toDpSizekrfVVM(pointerInputScope, j2);
        }

        @Stable
        /* renamed from: toPx--R2X_6o  reason: not valid java name */
        public static float m2689toPxR2X_6o(@NotNull PointerInputScope pointerInputScope, long j2) {
            Intrinsics.checkNotNullParameter(pointerInputScope, "this");
            return Density.DefaultImpls.m3317toPxR2X_6o(pointerInputScope, j2);
        }

        @Stable
        /* renamed from: toPx-0680j_4  reason: not valid java name */
        public static float m2690toPx0680j_4(@NotNull PointerInputScope pointerInputScope, float f2) {
            Intrinsics.checkNotNullParameter(pointerInputScope, "this");
            return Density.DefaultImpls.m3318toPx0680j_4(pointerInputScope, f2);
        }

        @Stable
        @NotNull
        public static Rect toRect(@NotNull PointerInputScope pointerInputScope, @NotNull DpRect receiver) {
            Intrinsics.checkNotNullParameter(pointerInputScope, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            return Density.DefaultImpls.toRect(pointerInputScope, receiver);
        }

        @Stable
        /* renamed from: toSize-XkaWNTQ  reason: not valid java name */
        public static long m2691toSizeXkaWNTQ(@NotNull PointerInputScope pointerInputScope, long j2) {
            Intrinsics.checkNotNullParameter(pointerInputScope, "this");
            return Density.DefaultImpls.m3319toSizeXkaWNTQ(pointerInputScope, j2);
        }

        @Stable
        /* renamed from: toSp-0xMU5do  reason: not valid java name */
        public static long m2692toSp0xMU5do(@NotNull PointerInputScope pointerInputScope, float f2) {
            Intrinsics.checkNotNullParameter(pointerInputScope, "this");
            return Density.DefaultImpls.m3320toSp0xMU5do(pointerInputScope, f2);
        }

        @Stable
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m2693toSpkPz2Gy4(@NotNull PointerInputScope pointerInputScope, float f2) {
            Intrinsics.checkNotNullParameter(pointerInputScope, "this");
            return Density.DefaultImpls.m3321toSpkPz2Gy4(pointerInputScope, f2);
        }

        @Stable
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m2694toSpkPz2Gy4(@NotNull PointerInputScope pointerInputScope, int i2) {
            Intrinsics.checkNotNullParameter(pointerInputScope, "this");
            return Density.DefaultImpls.m3322toSpkPz2Gy4((Density) pointerInputScope, i2);
        }
    }

    @Nullable
    <R> Object awaitPointerEventScope(@NotNull Function2<? super AwaitPointerEventScope, ? super Continuation<? super R>, ? extends Object> function2, @NotNull Continuation<? super R> continuation);

    /* renamed from: getExtendedTouchPadding-NH-jbRc  reason: not valid java name */
    long mo2680getExtendedTouchPaddingNHjbRc();

    boolean getInterceptOutOfBoundsChildEvents();

    /* renamed from: getSize-YbymL2g  reason: not valid java name */
    long m2681getSizeYbymL2g();

    @NotNull
    ViewConfiguration getViewConfiguration();

    void setInterceptOutOfBoundsChildEvents(boolean z);
}
