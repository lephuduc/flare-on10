package androidx.compose.material;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.state.ToggleableState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B`\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0017ø\u0001\u0000¢\u0006\u0002\u0010\u0016J&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0017ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0017ø\u0001\u0000¢\u0006\u0002\u0010\u0019R\u0019\u0010\n\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000fR\u0019\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000fR\u0019\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000fR\u0019\u0010\f\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000fR\u0019\u0010\u0007\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000fR\u0019\u0010\r\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000fR\u0019\u0010\t\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000fR\u0019\u0010\b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000fR\u0019\u0010\u000b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000fR\u0019\u0010\u0006\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000fR\u0019\u0010\u0004\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/material/DefaultCheckboxColors;", "Landroidx/compose/material/CheckboxColors;", "checkedCheckmarkColor", "Landroidx/compose/ui/graphics/Color;", "uncheckedCheckmarkColor", "checkedBoxColor", "uncheckedBoxColor", "disabledCheckedBoxColor", "disabledUncheckedBoxColor", "disabledIndeterminateBoxColor", "checkedBorderColor", "uncheckedBorderColor", "disabledBorderColor", "disabledIndeterminateBorderColor", "(JJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "borderColor", "Landroidx/compose/runtime/State;", "enabled", "", "state", "Landroidx/compose/ui/state/ToggleableState;", "(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "boxColor", "checkmarkColor", "(Landroidx/compose/ui/state/ToggleableState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "material_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
final class DefaultCheckboxColors implements CheckboxColors {
    private final long checkedBorderColor;
    private final long checkedBoxColor;
    private final long checkedCheckmarkColor;
    private final long disabledBorderColor;
    private final long disabledCheckedBoxColor;
    private final long disabledIndeterminateBorderColor;
    private final long disabledIndeterminateBoxColor;
    private final long disabledUncheckedBoxColor;
    private final long uncheckedBorderColor;
    private final long uncheckedBoxColor;
    private final long uncheckedCheckmarkColor;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            iArr[ToggleableState.On.ordinal()] = 1;
            iArr[ToggleableState.Indeterminate.ordinal()] = 2;
            iArr[ToggleableState.Off.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private DefaultCheckboxColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        this.checkedCheckmarkColor = j2;
        this.uncheckedCheckmarkColor = j3;
        this.checkedBoxColor = j4;
        this.uncheckedBoxColor = j5;
        this.disabledCheckedBoxColor = j6;
        this.disabledUncheckedBoxColor = j7;
        this.disabledIndeterminateBoxColor = j8;
        this.checkedBorderColor = j9;
        this.uncheckedBorderColor = j10;
        this.disabledBorderColor = j11;
        this.disabledIndeterminateBorderColor = j12;
    }

    public /* synthetic */ DefaultCheckboxColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12);
    }

    @Override // androidx.compose.material.CheckboxColors
    @Composable
    @NotNull
    public State<Color> borderColor(boolean z, @NotNull ToggleableState state, @Nullable Composer composer, int i2) {
        long j2;
        State<Color> rememberUpdatedState;
        Intrinsics.checkNotNullParameter(state, "state");
        composer.startReplaceableGroup(-796406023);
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int ordinal = state.ordinal();
        if (z) {
            int i3 = iArr[ordinal];
            if (i3 == 1 || i3 == 2) {
                j2 = this.checkedBorderColor;
            } else if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            } else {
                j2 = this.uncheckedBorderColor;
            }
        } else {
            int i4 = iArr[ordinal];
            if (i4 != 1) {
                if (i4 == 2) {
                    j2 = this.disabledIndeterminateBorderColor;
                } else if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            j2 = this.disabledBorderColor;
        }
        long j3 = j2;
        if (z) {
            composer.startReplaceableGroup(-796405338);
            rememberUpdatedState = SingleValueAnimationKt.m80animateColorAsStateKTwxG1Y(j3, AnimationSpecKt.tween$default(state == ToggleableState.Off ? 100 : 50, 0, null, 6, null), null, composer, 0, 4);
        } else {
            composer.startReplaceableGroup(-796405152);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1382boximpl(j3), composer, 0);
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.CheckboxColors
    @Composable
    @NotNull
    public State<Color> boxColor(boolean z, @NotNull ToggleableState state, @Nullable Composer composer, int i2) {
        long j2;
        State<Color> rememberUpdatedState;
        Intrinsics.checkNotNullParameter(state, "state");
        composer.startReplaceableGroup(-2010644300);
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int ordinal = state.ordinal();
        if (z) {
            int i3 = iArr[ordinal];
            if (i3 == 1 || i3 == 2) {
                j2 = this.checkedBoxColor;
            } else if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            } else {
                j2 = this.uncheckedBoxColor;
            }
        } else {
            int i4 = iArr[ordinal];
            if (i4 == 1) {
                j2 = this.disabledCheckedBoxColor;
            } else if (i4 == 2) {
                j2 = this.disabledIndeterminateBoxColor;
            } else if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            } else {
                j2 = this.disabledUncheckedBoxColor;
            }
        }
        long j3 = j2;
        if (z) {
            composer.startReplaceableGroup(-2010643579);
            rememberUpdatedState = SingleValueAnimationKt.m80animateColorAsStateKTwxG1Y(j3, AnimationSpecKt.tween$default(state == ToggleableState.Off ? 100 : 50, 0, null, 6, null), null, composer, 0, 4);
        } else {
            composer.startReplaceableGroup(-2010643393);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1382boximpl(j3), composer, 0);
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.CheckboxColors
    @Composable
    @NotNull
    public State<Color> checkmarkColor(@NotNull ToggleableState state, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(state, "state");
        composer.startReplaceableGroup(-1523203684);
        ToggleableState toggleableState = ToggleableState.Off;
        State<Color> m80animateColorAsStateKTwxG1Y = SingleValueAnimationKt.m80animateColorAsStateKTwxG1Y(state == toggleableState ? this.uncheckedCheckmarkColor : this.checkedCheckmarkColor, AnimationSpecKt.tween$default(state == toggleableState ? 100 : 50, 0, null, 6, null), null, composer, 0, 4);
        composer.endReplaceableGroup();
        return m80animateColorAsStateKTwxG1Y;
    }
}
