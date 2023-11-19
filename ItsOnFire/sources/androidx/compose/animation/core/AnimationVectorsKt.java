package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0016\u0010\u0000\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003\u001a\u001e\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003\u001a&\u0010\u0000\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003\u001a\u001b\u0010\n\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f*\u0002H\u000bH\u0000¢\u0006\u0002\u0010\r\u001a#\u0010\u000e\u001a\u00020\u000f\"\b\b\u0000\u0010\u000b*\u00020\f*\u0002H\u000b2\u0006\u0010\u0010\u001a\u0002H\u000bH\u0000¢\u0006\u0002\u0010\u0011\u001a\u001b\u0010\u0012\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f*\u0002H\u000bH\u0000¢\u0006\u0002\u0010\r¨\u0006\u0013"}, d2 = {"AnimationVector", "Landroidx/compose/animation/core/AnimationVector1D;", "v1", "", "Landroidx/compose/animation/core/AnimationVector2D;", "v2", "Landroidx/compose/animation/core/AnimationVector3D;", "v3", "Landroidx/compose/animation/core/AnimationVector4D;", "v4", "copy", "T", "Landroidx/compose/animation/core/AnimationVector;", "(Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "copyFrom", "", "source", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)V", "newInstance", "animation-core_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class AnimationVectorsKt {
    @NotNull
    public static final AnimationVector1D AnimationVector(float f2) {
        return new AnimationVector1D(f2);
    }

    @NotNull
    public static final AnimationVector2D AnimationVector(float f2, float f3) {
        return new AnimationVector2D(f2, f3);
    }

    @NotNull
    public static final AnimationVector3D AnimationVector(float f2, float f3, float f4) {
        return new AnimationVector3D(f2, f3, f4);
    }

    @NotNull
    public static final AnimationVector4D AnimationVector(float f2, float f3, float f4, float f5) {
        return new AnimationVector4D(f2, f3, f4, f5);
    }

    @NotNull
    public static final <T extends AnimationVector> T copy(@NotNull T t2) {
        Intrinsics.checkNotNullParameter(t2, "<this>");
        T t3 = (T) newInstance(t2);
        int size$animation_core_release = t3.getSize$animation_core_release();
        for (int i2 = 0; i2 < size$animation_core_release; i2++) {
            t3.set$animation_core_release(i2, t2.get$animation_core_release(i2));
        }
        return t3;
    }

    public static final <T extends AnimationVector> void copyFrom(@NotNull T t2, @NotNull T source) {
        Intrinsics.checkNotNullParameter(t2, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        int size$animation_core_release = t2.getSize$animation_core_release();
        for (int i2 = 0; i2 < size$animation_core_release; i2++) {
            t2.set$animation_core_release(i2, source.get$animation_core_release(i2));
        }
    }

    @NotNull
    public static final <T extends AnimationVector> T newInstance(@NotNull T t2) {
        Intrinsics.checkNotNullParameter(t2, "<this>");
        return (T) t2.newVector$animation_core_release();
    }
}
