package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a=\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001aA\u0010\u0010\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001c\u0010\u0016\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0018H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0019\u001a\u001c\u0010\u001a\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0018H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0019\u001a\u0014\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0001H\u0007\u001a!\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a-\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u001aA\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\u0015\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"PaddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "all", "Landroidx/compose/ui/unit/Dp;", "PaddingValues-0680j_4", "(F)Landroidx/compose/foundation/layout/PaddingValues;", "horizontal", "vertical", "PaddingValues-YgX7TsA", "(FF)Landroidx/compose/foundation/layout/PaddingValues;", "start", "top", "end", "bottom", "PaddingValues-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "absolutePadding", "Landroidx/compose/ui/Modifier;", "left", "right", "absolutePadding-qDBjuR0", "(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;", "calculateEndPadding", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateStartPadding", "padding", "paddingValues", "padding-3ABfNKs", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "padding-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "padding-qDBjuR0", "foundation-layout_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class PaddingKt {
    @Stable
    @NotNull
    /* renamed from: PaddingValues-0680j_4  reason: not valid java name */
    public static final PaddingValues m357PaddingValues0680j_4(float f2) {
        return new PaddingValuesImpl(f2, f2, f2, f2, null);
    }

    @Stable
    @NotNull
    /* renamed from: PaddingValues-YgX7TsA  reason: not valid java name */
    public static final PaddingValues m358PaddingValuesYgX7TsA(float f2, float f3) {
        return new PaddingValuesImpl(f2, f3, f2, f3, null);
    }

    /* renamed from: PaddingValues-YgX7TsA$default  reason: not valid java name */
    public static /* synthetic */ PaddingValues m359PaddingValuesYgX7TsA$default(float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.m3325constructorimpl(0);
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.m3325constructorimpl(0);
        }
        return m358PaddingValuesYgX7TsA(f2, f3);
    }

    @Stable
    @NotNull
    /* renamed from: PaddingValues-a9UjIt4  reason: not valid java name */
    public static final PaddingValues m360PaddingValuesa9UjIt4(float f2, float f3, float f4, float f5) {
        return new PaddingValuesImpl(f2, f3, f4, f5, null);
    }

    /* renamed from: PaddingValues-a9UjIt4$default  reason: not valid java name */
    public static /* synthetic */ PaddingValues m361PaddingValuesa9UjIt4$default(float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.m3325constructorimpl(0);
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.m3325constructorimpl(0);
        }
        if ((i2 & 4) != 0) {
            f4 = Dp.m3325constructorimpl(0);
        }
        if ((i2 & 8) != 0) {
            f5 = Dp.m3325constructorimpl(0);
        }
        return m360PaddingValuesa9UjIt4(f2, f3, f4, f5);
    }

    @Stable
    @NotNull
    /* renamed from: absolutePadding-qDBjuR0  reason: not valid java name */
    public static final Modifier m362absolutePaddingqDBjuR0(@NotNull Modifier absolutePadding, float f2, float f3, float f4, float f5) {
        Intrinsics.checkNotNullParameter(absolutePadding, "$this$absolutePadding");
        return absolutePadding.then(new PaddingModifier(f2, f3, f4, f5, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new PaddingKt$absolutePaddingqDBjuR0$$inlined$debugInspectorInfo$1(f2, f3, f4, f5) : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: absolutePadding-qDBjuR0$default  reason: not valid java name */
    public static /* synthetic */ Modifier m363absolutePaddingqDBjuR0$default(Modifier modifier, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.m3325constructorimpl(0);
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.m3325constructorimpl(0);
        }
        if ((i2 & 4) != 0) {
            f4 = Dp.m3325constructorimpl(0);
        }
        if ((i2 & 8) != 0) {
            f5 = Dp.m3325constructorimpl(0);
        }
        return m362absolutePaddingqDBjuR0(modifier, f2, f3, f4, f5);
    }

    @Stable
    public static final float calculateEndPadding(@NotNull PaddingValues paddingValues, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(paddingValues, "<this>");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return layoutDirection == LayoutDirection.Ltr ? paddingValues.mo375calculateRightPaddingu2uoSUM(layoutDirection) : paddingValues.mo374calculateLeftPaddingu2uoSUM(layoutDirection);
    }

    @Stable
    public static final float calculateStartPadding(@NotNull PaddingValues paddingValues, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(paddingValues, "<this>");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return layoutDirection == LayoutDirection.Ltr ? paddingValues.mo374calculateLeftPaddingu2uoSUM(layoutDirection) : paddingValues.mo375calculateRightPaddingu2uoSUM(layoutDirection);
    }

    @Stable
    @NotNull
    public static final Modifier padding(@NotNull Modifier modifier, @NotNull PaddingValues paddingValues) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        return modifier.then(new PaddingValuesModifier(paddingValues, InspectableValueKt.isDebugInspectorInfoEnabled() ? new PaddingKt$padding$$inlined$debugInspectorInfo$1(paddingValues) : InspectableValueKt.getNoInspectorInfo()));
    }

    @Stable
    @NotNull
    /* renamed from: padding-3ABfNKs  reason: not valid java name */
    public static final Modifier m364padding3ABfNKs(@NotNull Modifier padding, float f2) {
        Intrinsics.checkNotNullParameter(padding, "$this$padding");
        return padding.then(new PaddingModifier(f2, f2, f2, f2, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new PaddingKt$padding3ABfNKs$$inlined$debugInspectorInfo$1(f2) : InspectableValueKt.getNoInspectorInfo(), null));
    }

    @Stable
    @NotNull
    /* renamed from: padding-VpY3zN4  reason: not valid java name */
    public static final Modifier m365paddingVpY3zN4(@NotNull Modifier padding, float f2, float f3) {
        Intrinsics.checkNotNullParameter(padding, "$this$padding");
        return padding.then(new PaddingModifier(f2, f3, f2, f3, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new PaddingKt$paddingVpY3zN4$$inlined$debugInspectorInfo$1(f2, f3) : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: padding-VpY3zN4$default  reason: not valid java name */
    public static /* synthetic */ Modifier m366paddingVpY3zN4$default(Modifier modifier, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.m3325constructorimpl(0);
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.m3325constructorimpl(0);
        }
        return m365paddingVpY3zN4(modifier, f2, f3);
    }

    @Stable
    @NotNull
    /* renamed from: padding-qDBjuR0  reason: not valid java name */
    public static final Modifier m367paddingqDBjuR0(@NotNull Modifier padding, float f2, float f3, float f4, float f5) {
        Intrinsics.checkNotNullParameter(padding, "$this$padding");
        return padding.then(new PaddingModifier(f2, f3, f4, f5, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new PaddingKt$paddingqDBjuR0$$inlined$debugInspectorInfo$1(f2, f3, f4, f5) : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: padding-qDBjuR0$default  reason: not valid java name */
    public static /* synthetic */ Modifier m368paddingqDBjuR0$default(Modifier modifier, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.m3325constructorimpl(0);
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.m3325constructorimpl(0);
        }
        if ((i2 & 4) != 0) {
            f4 = Dp.m3325constructorimpl(0);
        }
        if ((i2 & 8) != 0) {
            f5 = Dp.m3325constructorimpl(0);
        }
        return m367paddingqDBjuR0(modifier, f2, f3, f4, f5);
    }
}
