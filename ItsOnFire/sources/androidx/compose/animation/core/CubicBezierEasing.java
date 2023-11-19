package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J \u0010\f\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/compose/animation/core/CubicBezierEasing;", "Landroidx/compose/animation/core/Easing;", "a", "", "b", "c", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "(FFFF)V", "equals", "", "other", "", "evaluateCubic", "m", "hashCode", "", "transform", "fraction", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class CubicBezierEasing implements Easing {

    /* renamed from: a  reason: collision with root package name */
    private final float f30a;

    /* renamed from: b  reason: collision with root package name */
    private final float f31b;

    /* renamed from: c  reason: collision with root package name */
    private final float f32c;

    /* renamed from: d  reason: collision with root package name */
    private final float f33d;

    public CubicBezierEasing(float f2, float f3, float f4, float f5) {
        this.f30a = f2;
        this.f31b = f3;
        this.f32c = f4;
        this.f33d = f5;
    }

    private final float evaluateCubic(float f2, float f3, float f4) {
        float f5 = 3;
        float f6 = 1 - f4;
        return (f2 * f5 * f6 * f6 * f4) + (f5 * f3 * f6 * f4 * f4) + (f4 * f4 * f4);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof CubicBezierEasing) {
            CubicBezierEasing cubicBezierEasing = (CubicBezierEasing) obj;
            if (this.f30a == cubicBezierEasing.f30a) {
                if (this.f31b == cubicBezierEasing.f31b) {
                    if (this.f32c == cubicBezierEasing.f32c) {
                        if (this.f33d == cubicBezierEasing.f33d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f30a) * 31) + Float.hashCode(this.f31b)) * 31) + Float.hashCode(this.f32c)) * 31) + Float.hashCode(this.f33d);
    }

    @Override // androidx.compose.animation.core.Easing
    public float transform(float f2) {
        float f3 = 0.0f;
        if (f2 > 0.0f) {
            float f4 = 1.0f;
            if (f2 < 1.0f) {
                while (true) {
                    float f5 = (f3 + f4) / 2;
                    float evaluateCubic = evaluateCubic(this.f30a, this.f32c, f5);
                    if (Math.abs(f2 - evaluateCubic) < 0.001f) {
                        return evaluateCubic(this.f31b, this.f33d, f5);
                    }
                    if (evaluateCubic < f2) {
                        f3 = f5;
                    } else {
                        f4 = f5;
                    }
                }
            }
        }
        return f2;
    }
}
