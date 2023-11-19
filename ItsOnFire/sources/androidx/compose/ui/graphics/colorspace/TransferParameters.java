package androidx.compose.ui.graphics.colorspace;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\""}, d2 = {"Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "", "gamma", "", "a", "b", "c", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "e", "f", "(DDDDDDD)V", "getA", "()D", "getB", "getC", "getD", "getE", "getF", "getGamma", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TransferParameters {

    /* renamed from: a  reason: collision with root package name */
    private final double f36a;

    /* renamed from: b  reason: collision with root package name */
    private final double f37b;

    /* renamed from: c  reason: collision with root package name */
    private final double f38c;

    /* renamed from: d  reason: collision with root package name */
    private final double f39d;

    /* renamed from: e  reason: collision with root package name */
    private final double f40e;

    /* renamed from: f  reason: collision with root package name */
    private final double f41f;
    private final double gamma;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
        if ((r1 == 0.0d) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0093, code lost:
        if ((r1 == 0.0d) != false) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TransferParameters(double r1, double r3, double r5, double r7, double r9, double r11, double r13) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.TransferParameters.<init>(double, double, double, double, double, double, double):void");
    }

    public /* synthetic */ TransferParameters(double d2, double d3, double d4, double d5, double d6, double d7, double d8, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(d2, d3, d4, d5, d6, (i2 & 32) != 0 ? 0.0d : d7, (i2 & 64) != 0 ? 0.0d : d8);
    }

    public final double component1() {
        return this.gamma;
    }

    public final double component2() {
        return this.f36a;
    }

    public final double component3() {
        return this.f37b;
    }

    public final double component4() {
        return this.f38c;
    }

    public final double component5() {
        return this.f39d;
    }

    public final double component6() {
        return this.f40e;
    }

    public final double component7() {
        return this.f41f;
    }

    @NotNull
    public final TransferParameters copy(double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        return new TransferParameters(d2, d3, d4, d5, d6, d7, d8);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TransferParameters) {
            TransferParameters transferParameters = (TransferParameters) obj;
            return Intrinsics.areEqual((Object) Double.valueOf(this.gamma), (Object) Double.valueOf(transferParameters.gamma)) && Intrinsics.areEqual((Object) Double.valueOf(this.f36a), (Object) Double.valueOf(transferParameters.f36a)) && Intrinsics.areEqual((Object) Double.valueOf(this.f37b), (Object) Double.valueOf(transferParameters.f37b)) && Intrinsics.areEqual((Object) Double.valueOf(this.f38c), (Object) Double.valueOf(transferParameters.f38c)) && Intrinsics.areEqual((Object) Double.valueOf(this.f39d), (Object) Double.valueOf(transferParameters.f39d)) && Intrinsics.areEqual((Object) Double.valueOf(this.f40e), (Object) Double.valueOf(transferParameters.f40e)) && Intrinsics.areEqual((Object) Double.valueOf(this.f41f), (Object) Double.valueOf(transferParameters.f41f));
        }
        return false;
    }

    public final double getA() {
        return this.f36a;
    }

    public final double getB() {
        return this.f37b;
    }

    public final double getC() {
        return this.f38c;
    }

    public final double getD() {
        return this.f39d;
    }

    public final double getE() {
        return this.f40e;
    }

    public final double getF() {
        return this.f41f;
    }

    public final double getGamma() {
        return this.gamma;
    }

    public int hashCode() {
        return (((((((((((Double.hashCode(this.gamma) * 31) + Double.hashCode(this.f36a)) * 31) + Double.hashCode(this.f37b)) * 31) + Double.hashCode(this.f38c)) * 31) + Double.hashCode(this.f39d)) * 31) + Double.hashCode(this.f40e)) * 31) + Double.hashCode(this.f41f);
    }

    @NotNull
    public String toString() {
        return "TransferParameters(gamma=" + this.gamma + ", a=" + this.f36a + ", b=" + this.f37b + ", c=" + this.f38c + ", d=" + this.f39d + ", e=" + this.f40e + ", f=" + this.f41f + ')';
    }
}
