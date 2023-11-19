package androidx.compose.ui.input.pointer.util;

import androidx.appcompat.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J#\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/input/pointer/util/PolynomialFit;", "", "coefficients", "", "", "confidence", "(Ljava/util/List;F)V", "getCoefficients", "()Ljava/util/List;", "getConfidence", "()F", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class PolynomialFit {
    @NotNull
    private final List<Float> coefficients;
    private final float confidence;

    public PolynomialFit(@NotNull List<Float> coefficients, float f2) {
        Intrinsics.checkNotNullParameter(coefficients, "coefficients");
        this.coefficients = coefficients;
        this.confidence = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PolynomialFit copy$default(PolynomialFit polynomialFit, List list, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = polynomialFit.coefficients;
        }
        if ((i2 & 2) != 0) {
            f2 = polynomialFit.confidence;
        }
        return polynomialFit.copy(list, f2);
    }

    @NotNull
    public final List<Float> component1() {
        return this.coefficients;
    }

    public final float component2() {
        return this.confidence;
    }

    @NotNull
    public final PolynomialFit copy(@NotNull List<Float> coefficients, float f2) {
        Intrinsics.checkNotNullParameter(coefficients, "coefficients");
        return new PolynomialFit(coefficients, f2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PolynomialFit) {
            PolynomialFit polynomialFit = (PolynomialFit) obj;
            return Intrinsics.areEqual(this.coefficients, polynomialFit.coefficients) && Intrinsics.areEqual((Object) Float.valueOf(this.confidence), (Object) Float.valueOf(polynomialFit.confidence));
        }
        return false;
    }

    @NotNull
    public final List<Float> getCoefficients() {
        return this.coefficients;
    }

    public final float getConfidence() {
        return this.confidence;
    }

    public int hashCode() {
        return (this.coefficients.hashCode() * 31) + Float.hashCode(this.confidence);
    }

    @NotNull
    public String toString() {
        return "PolynomialFit(coefficients=" + this.coefficients + ", confidence=" + this.confidence + ')';
    }
}
