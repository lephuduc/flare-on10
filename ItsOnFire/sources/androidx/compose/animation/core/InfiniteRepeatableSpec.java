package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001f\b\u0017\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B*\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\tø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J,\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u0019\"\b\b\u0001\u0010\u001a*\u00020\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u001a0\u001dH\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "T", "Landroidx/compose/animation/core/AnimationSpec;", "animation", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "repeatMode", "Landroidx/compose/animation/core/RepeatMode;", "(Landroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;)V", "initialStartOffset", "Landroidx/compose/animation/core/StartOffset;", "(Landroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAnimation", "()Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "getInitialStartOffset-Rmkjzm4", "()J", "J", "getRepeatMode", "()Landroidx/compose/animation/core/RepeatMode;", "equals", "", "other", "", "hashCode", "", "vectorize", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "converter", "Landroidx/compose/animation/core/TwoWayConverter;", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class InfiniteRepeatableSpec<T> implements AnimationSpec<T> {
    public static final int $stable = 8;
    @NotNull
    private final DurationBasedAnimationSpec<T> animation;
    private final long initialStartOffset;
    @NotNull
    private final RepeatMode repeatMode;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This constructor has been deprecated")
    public /* synthetic */ InfiniteRepeatableSpec(DurationBasedAnimationSpec animation, RepeatMode repeatMode) {
        this(animation, repeatMode, StartOffset.m122constructorimpl$default(0, 0, 2, null), (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(animation, "animation");
        Intrinsics.checkNotNullParameter(repeatMode, "repeatMode");
    }

    public /* synthetic */ InfiniteRepeatableSpec(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(durationBasedAnimationSpec, (i2 & 2) != 0 ? RepeatMode.Restart : repeatMode);
    }

    private InfiniteRepeatableSpec(DurationBasedAnimationSpec<T> durationBasedAnimationSpec, RepeatMode repeatMode, long j2) {
        this.animation = durationBasedAnimationSpec;
        this.repeatMode = repeatMode;
        this.initialStartOffset = j2;
    }

    public /* synthetic */ InfiniteRepeatableSpec(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(durationBasedAnimationSpec, (i2 & 2) != 0 ? RepeatMode.Restart : repeatMode, (i2 & 4) != 0 ? StartOffset.m122constructorimpl$default(0, 0, 2, null) : j2, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ InfiniteRepeatableSpec(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(durationBasedAnimationSpec, repeatMode, j2);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof InfiniteRepeatableSpec) {
            InfiniteRepeatableSpec infiniteRepeatableSpec = (InfiniteRepeatableSpec) obj;
            return Intrinsics.areEqual(infiniteRepeatableSpec.animation, this.animation) && infiniteRepeatableSpec.repeatMode == this.repeatMode && StartOffset.m124equalsimpl0(infiniteRepeatableSpec.m104getInitialStartOffsetRmkjzm4(), m104getInitialStartOffsetRmkjzm4());
        }
        return false;
    }

    @NotNull
    public final DurationBasedAnimationSpec<T> getAnimation() {
        return this.animation;
    }

    /* renamed from: getInitialStartOffset-Rmkjzm4  reason: not valid java name */
    public final long m104getInitialStartOffsetRmkjzm4() {
        return this.initialStartOffset;
    }

    @NotNull
    public final RepeatMode getRepeatMode() {
        return this.repeatMode;
    }

    public int hashCode() {
        return (((this.animation.hashCode() * 31) + this.repeatMode.hashCode()) * 31) + StartOffset.m127hashCodeimpl(m104getInitialStartOffsetRmkjzm4());
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    @NotNull
    public <V extends AnimationVector> VectorizedAnimationSpec<V> vectorize(@NotNull TwoWayConverter<T, V> converter) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        return new VectorizedInfiniteRepeatableSpec(this.animation.vectorize((TwoWayConverter) converter), this.repeatMode, m104getInitialStartOffsetRmkjzm4(), (DefaultConstructorMarker) null);
    }
}
