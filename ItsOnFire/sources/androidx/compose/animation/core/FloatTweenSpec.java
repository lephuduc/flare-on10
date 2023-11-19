package androidx.compose.animation.core;

import androidx.compose.animation.core.FloatAnimationSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002J \u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J(\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/compose/animation/core/FloatTweenSpec;", "Landroidx/compose/animation/core/FloatAnimationSpec;", "duration", "", "delay", "easing", "Landroidx/compose/animation/core/Easing;", "(IILandroidx/compose/animation/core/Easing;)V", "getDelay", "()I", "getDuration", "clampPlayTime", "", "playTime", "getDurationNanos", "initialValue", "", "targetValue", "initialVelocity", "getValueFromNanos", "playTimeNanos", "getVelocityFromNanos", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class FloatTweenSpec implements FloatAnimationSpec {
    public static final int $stable = 0;
    private final int delay;
    private final int duration;
    @NotNull
    private final Easing easing;

    public FloatTweenSpec() {
        this(0, 0, null, 7, null);
    }

    public FloatTweenSpec(int i2, int i3, @NotNull Easing easing) {
        Intrinsics.checkNotNullParameter(easing, "easing");
        this.duration = i2;
        this.delay = i3;
        this.easing = easing;
    }

    public /* synthetic */ FloatTweenSpec(int i2, int i3, Easing easing, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? AnimationConstants.DefaultDurationMillis : i2, (i4 & 2) != 0 ? 0 : i3, (i4 & 4) != 0 ? EasingKt.getFastOutSlowInEasing() : easing);
    }

    private final long clampPlayTime(long j2) {
        long coerceIn;
        coerceIn = RangesKt___RangesKt.coerceIn(j2 - this.delay, 0L, this.duration);
        return coerceIn;
    }

    public final int getDelay() {
        return this.delay;
    }

    public final int getDuration() {
        return this.duration;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public long getDurationNanos(float f2, float f3, float f4) {
        return (this.delay + this.duration) * 1000000;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getEndVelocity(float f2, float f3, float f4) {
        return FloatAnimationSpec.DefaultImpls.getEndVelocity(this, f2, f3, f4);
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getValueFromNanos(long j2, float f2, float f3, float f4) {
        float coerceIn;
        long clampPlayTime = clampPlayTime(j2 / 1000000);
        int i2 = this.duration;
        float f5 = i2 == 0 ? 1.0f : ((float) clampPlayTime) / i2;
        Easing easing = this.easing;
        coerceIn = RangesKt___RangesKt.coerceIn(f5, 0.0f, 1.0f);
        return VectorConvertersKt.lerp(f2, f3, easing.transform(coerceIn));
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getVelocityFromNanos(long j2, float f2, float f3, float f4) {
        long clampPlayTime = clampPlayTime(j2 / 1000000);
        int i2 = (clampPlayTime > 0L ? 1 : (clampPlayTime == 0L ? 0 : -1));
        if (i2 < 0) {
            return 0.0f;
        }
        if (i2 == 0) {
            return f4;
        }
        return (getValueFromNanos(clampPlayTime * 1000000, f2, f3, f4) - getValueFromNanos((clampPlayTime - 1) * 1000000, f2, f3, f4)) * 1000.0f;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec, androidx.compose.animation.core.AnimationSpec
    @NotNull
    public <V extends AnimationVector> VectorizedFloatAnimationSpec<V> vectorize(@NotNull TwoWayConverter<Float, V> twoWayConverter) {
        return FloatAnimationSpec.DefaultImpls.vectorize(this, twoWayConverter);
    }
}
