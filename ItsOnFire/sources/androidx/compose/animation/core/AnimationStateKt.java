package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u001ai\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u0002\"\u0004\b\u0000\u0010\u0005\"\b\b\u0001\u0010\u0006*\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\t2\u0006\u0010\n\u001a\u0002H\u00052\u0006\u0010\u000b\u001a\u0002H\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0001¢\u0006\u0002\u0010\u0010\u001aB\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00022\u0006\u0010\n\u001a\u00020\u00112\b\b\u0002\u0010\u000b\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0001\u001ak\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u0002\"\u0004\b\u0000\u0010\u0005\"\b\b\u0001\u0010\u0006*\u00020\u0007*\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u00022\b\b\u0002\u0010\u0014\u001a\u0002H\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u0001H\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0001¢\u0006\u0002\u0010\u0016\u001aT\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0002*\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0001\u001a3\u0010\u0018\u001a\u0002H\u0006\"\u0004\b\u0000\u0010\u0005\"\b\b\u0001\u0010\u0006*\u00020\u0007*\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\t2\u0006\u0010\u0014\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0019\"\u001d\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003¨\u0006\u001a"}, d2 = {"isFinished", "", "Landroidx/compose/animation/core/AnimationState;", "(Landroidx/compose/animation/core/AnimationState;)Z", "AnimationState", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "initialValue", "initialVelocity", "lastFrameTimeNanos", "", "finishedTimeNanos", "isRunning", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;JJZ)Landroidx/compose/animation/core/AnimationState;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "copy", "value", "velocityVector", "(Landroidx/compose/animation/core/AnimationState;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;JJZ)Landroidx/compose/animation/core/AnimationState;", "velocity", "createZeroVectorFrom", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;)Landroidx/compose/animation/core/AnimationVector;", "animation-core_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class AnimationStateKt {
    @NotNull
    public static final AnimationState<Float, AnimationVector1D> AnimationState(float f2, float f3, long j2, long j3, boolean z) {
        return new AnimationState<>(VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), Float.valueOf(f2), AnimationVectorsKt.AnimationVector(f3), j2, j3, z);
    }

    @NotNull
    public static final <T, V extends AnimationVector> AnimationState<T, V> AnimationState(@NotNull TwoWayConverter<T, V> typeConverter, T t2, T t3, long j2, long j3, boolean z) {
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        return new AnimationState<>(typeConverter, t2, typeConverter.getConvertToVector().invoke(t3), j2, j3, z);
    }

    public static /* synthetic */ AnimationState AnimationState$default(float f2, float f3, long j2, long j3, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        long j4 = (i2 & 4) != 0 ? Long.MIN_VALUE : j2;
        long j5 = (i2 & 8) == 0 ? j3 : Long.MIN_VALUE;
        if ((i2 & 16) != 0) {
            z = false;
        }
        return AnimationState(f2, f3, j4, j5, z);
    }

    @NotNull
    public static final AnimationState<Float, AnimationVector1D> copy(@NotNull AnimationState<Float, AnimationVector1D> animationState, float f2, float f3, long j2, long j3, boolean z) {
        Intrinsics.checkNotNullParameter(animationState, "<this>");
        return new AnimationState<>(animationState.getTypeConverter(), Float.valueOf(f2), AnimationVectorsKt.AnimationVector(f3), j2, j3, z);
    }

    @NotNull
    public static final <T, V extends AnimationVector> AnimationState<T, V> copy(@NotNull AnimationState<T, V> animationState, T t2, @Nullable V v2, long j2, long j3, boolean z) {
        Intrinsics.checkNotNullParameter(animationState, "<this>");
        return new AnimationState<>(animationState.getTypeConverter(), t2, v2, j2, j3, z);
    }

    public static /* synthetic */ AnimationState copy$default(AnimationState animationState, float f2, float f3, long j2, long j3, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = ((Number) animationState.getValue()).floatValue();
        }
        if ((i2 & 2) != 0) {
            f3 = ((AnimationVector1D) animationState.getVelocityVector()).getValue();
        }
        float f4 = f3;
        if ((i2 & 4) != 0) {
            j2 = animationState.getLastFrameTimeNanos();
        }
        long j4 = j2;
        if ((i2 & 8) != 0) {
            j3 = animationState.getFinishedTimeNanos();
        }
        long j5 = j3;
        if ((i2 & 16) != 0) {
            z = animationState.isRunning();
        }
        return copy(animationState, f2, f4, j4, j5, z);
    }

    public static /* synthetic */ AnimationState copy$default(AnimationState animationState, Object obj, AnimationVector animationVector, long j2, long j3, boolean z, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = animationState.getValue();
        }
        if ((i2 & 2) != 0) {
            animationVector = AnimationVectorsKt.copy(animationState.getVelocityVector());
        }
        AnimationVector animationVector2 = animationVector;
        if ((i2 & 4) != 0) {
            j2 = animationState.getLastFrameTimeNanos();
        }
        long j4 = j2;
        if ((i2 & 8) != 0) {
            j3 = animationState.getFinishedTimeNanos();
        }
        long j5 = j3;
        if ((i2 & 16) != 0) {
            z = animationState.isRunning();
        }
        return copy(animationState, obj, animationVector2, j4, j5, z);
    }

    @NotNull
    public static final <T, V extends AnimationVector> V createZeroVectorFrom(@NotNull TwoWayConverter<T, V> twoWayConverter, T t2) {
        Intrinsics.checkNotNullParameter(twoWayConverter, "<this>");
        return (V) AnimationVectorsKt.newInstance(twoWayConverter.getConvertToVector().invoke(t2));
    }

    public static final boolean isFinished(@NotNull AnimationState<?, ?> animationState) {
        Intrinsics.checkNotNullParameter(animationState, "<this>");
        return animationState.getFinishedTimeNanos() != Long.MIN_VALUE;
    }
}
