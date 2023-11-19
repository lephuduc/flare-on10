package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B7\u0012\u001e\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00070\u0005\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0002\u0010\u000bJ-\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0018J-\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001dR\u0014\u0010\n\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\t\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR&\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\u0010R\u0010\u0010\u0011\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006\u001e"}, d2 = {"Landroidx/compose/animation/core/VectorizedKeyframesSpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "keyframes", "", "", "Lkotlin/Pair;", "Landroidx/compose/animation/core/Easing;", "durationMillis", "delayMillis", "(Ljava/util/Map;II)V", "getDelayMillis", "()I", "getDurationMillis", "valueVector", "Landroidx/compose/animation/core/AnimationVector;", "velocityVector", "getValueFromNanos", "playTimeNanos", "", "initialValue", "targetValue", "initialVelocity", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "init", "", "value", "(Landroidx/compose/animation/core/AnimationVector;)V", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class VectorizedKeyframesSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {
    public static final int $stable = 8;
    private final int delayMillis;
    private final int durationMillis;
    @NotNull
    private final Map<Integer, Pair<V, Easing>> keyframes;
    private V valueVector;
    private V velocityVector;

    /* JADX WARN: Multi-variable type inference failed */
    public VectorizedKeyframesSpec(@NotNull Map<Integer, ? extends Pair<? extends V, ? extends Easing>> keyframes, int i2, int i3) {
        Intrinsics.checkNotNullParameter(keyframes, "keyframes");
        this.keyframes = keyframes;
        this.durationMillis = i2;
        this.delayMillis = i3;
    }

    public /* synthetic */ VectorizedKeyframesSpec(Map map, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, i2, (i4 & 4) != 0 ? 0 : i3);
    }

    private final void init(V v2) {
        if (this.valueVector == null) {
            this.valueVector = (V) AnimationVectorsKt.newInstance(v2);
            this.velocityVector = (V) AnimationVectorsKt.newInstance(v2);
        }
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDelayMillis() {
        return this.delayMillis;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDurationMillis() {
        return this.durationMillis;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec, androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(@NotNull V v2, @NotNull V v3, @NotNull V v4) {
        return VectorizedDurationBasedAnimationSpec.DefaultImpls.getDurationNanos(this, v2, v3, v4);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    @NotNull
    public V getEndVelocity(@NotNull V v2, @NotNull V v3, @NotNull V v4) {
        return (V) VectorizedDurationBasedAnimationSpec.DefaultImpls.getEndVelocity(this, v2, v3, v4);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    @NotNull
    public V getValueFromNanos(long j2, @NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
        long clampPlayTime;
        Object value;
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        clampPlayTime = VectorizedAnimationSpecKt.clampPlayTime(this, j2 / 1000000);
        int i2 = (int) clampPlayTime;
        if (this.keyframes.containsKey(Integer.valueOf(i2))) {
            value = MapsKt__MapsKt.getValue(this.keyframes, Integer.valueOf(i2));
            return (V) ((Pair) value).getFirst();
        } else if (i2 >= getDurationMillis()) {
            return targetValue;
        } else {
            if (i2 <= 0) {
                return initialValue;
            }
            int durationMillis = getDurationMillis();
            Easing linearEasing = EasingKt.getLinearEasing();
            int i3 = 0;
            V v2 = initialValue;
            int i4 = 0;
            for (Map.Entry<Integer, Pair<V, Easing>> entry : this.keyframes.entrySet()) {
                int intValue = entry.getKey().intValue();
                Pair<V, Easing> value2 = entry.getValue();
                if (i2 > intValue && intValue >= i4) {
                    v2 = value2.getFirst();
                    linearEasing = value2.getSecond();
                    i4 = intValue;
                } else if (i2 < intValue && intValue <= durationMillis) {
                    targetValue = value2.getFirst();
                    durationMillis = intValue;
                }
            }
            float transform = linearEasing.transform((i2 - i4) / (durationMillis - i4));
            init(initialValue);
            int size$animation_core_release = v2.getSize$animation_core_release();
            while (true) {
                V v3 = null;
                if (i3 >= size$animation_core_release) {
                    break;
                }
                int i5 = i3 + 1;
                V v4 = this.valueVector;
                if (v4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("valueVector");
                } else {
                    v3 = v4;
                }
                v3.set$animation_core_release(i3, VectorConvertersKt.lerp(v2.get$animation_core_release(i3), targetValue.get$animation_core_release(i3), transform));
                i3 = i5;
            }
            V v5 = this.valueVector;
            if (v5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("valueVector");
                return null;
            }
            return v5;
        }
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    @NotNull
    public V getVelocityFromNanos(long j2, @NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
        long clampPlayTime;
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        clampPlayTime = VectorizedAnimationSpecKt.clampPlayTime(this, j2 / 1000000);
        if (clampPlayTime <= 0) {
            return initialVelocity;
        }
        AnimationVector valueFromMillis = VectorizedAnimationSpecKt.getValueFromMillis(this, clampPlayTime - 1, initialValue, targetValue, initialVelocity);
        AnimationVector valueFromMillis2 = VectorizedAnimationSpecKt.getValueFromMillis(this, clampPlayTime, initialValue, targetValue, initialVelocity);
        init(initialValue);
        int i2 = 0;
        int size$animation_core_release = valueFromMillis.getSize$animation_core_release();
        while (true) {
            V v2 = null;
            if (i2 >= size$animation_core_release) {
                break;
            }
            int i3 = i2 + 1;
            V v3 = this.velocityVector;
            if (v3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            } else {
                v2 = v3;
            }
            v2.set$animation_core_release(i2, (valueFromMillis.get$animation_core_release(i2) - valueFromMillis2.get$animation_core_release(i2)) * 1000.0f);
            i2 = i3;
        }
        V v4 = this.velocityVector;
        if (v4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            return null;
        }
        return v4;
    }

    @Override // androidx.compose.animation.core.VectorizedFiniteAnimationSpec, androidx.compose.animation.core.VectorizedAnimationSpec
    public boolean isInfinite() {
        return VectorizedDurationBasedAnimationSpec.DefaultImpls.isInfinite(this);
    }
}
