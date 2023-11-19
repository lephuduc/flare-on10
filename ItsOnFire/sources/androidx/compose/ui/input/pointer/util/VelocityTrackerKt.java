package androidx.compose.ui.input.pointer.util;

import androidx.appcompat.R;
import androidx.compose.ui.input.pointer.HistoricalChange;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a,\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\f\u001a\u00020\u0001H\u0000\u001a\u0012\u0010\r\u001a\u00020\u000e*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"AssumePointerMoveStoppedMilliseconds", "", "DefaultWeight", "", "HistorySize", "HorizonMilliseconds", "MinSampleSize", "polyFitLeastSquares", "Landroidx/compose/ui/input/pointer/util/PolynomialFit;", "x", "", "y", "degree", "addPointerInputChange", "", "Landroidx/compose/ui/input/pointer/util/VelocityTracker;", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/pointer/PointerInputChange;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class VelocityTrackerKt {
    private static final int AssumePointerMoveStoppedMilliseconds = 40;
    private static final float DefaultWeight = 1.0f;
    private static final int HistorySize = 20;
    private static final int HorizonMilliseconds = 100;
    private static final int MinSampleSize = 3;

    public static final void addPointerInputChange(@NotNull VelocityTracker velocityTracker, @NotNull PointerInputChange event) {
        Intrinsics.checkNotNullParameter(velocityTracker, "<this>");
        Intrinsics.checkNotNullParameter(event, "event");
        List<HistoricalChange> historical = event.getHistorical();
        int size = historical.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            HistoricalChange historicalChange = historical.get(i2);
            velocityTracker.m2746addPositionUv8p0NA(historicalChange.getUptimeMillis(), historicalChange.m2590getPositionF1C5BW0());
            i2 = i3;
        }
        velocityTracker.m2746addPositionUv8p0NA(event.getUptimeMillis(), event.m2658getPositionF1C5BW0());
    }

    @NotNull
    public static final PolynomialFit polyFitLeastSquares(@NotNull List<Float> x, @NotNull List<Float> y, int i2) {
        Intrinsics.checkNotNullParameter(x, "x");
        Intrinsics.checkNotNullParameter(y, "y");
        if (i2 >= 1) {
            if (x.size() == y.size()) {
                if (x.isEmpty()) {
                    throw new IllegalArgumentException("At least one point must be provided");
                }
                int size = i2 >= x.size() ? x.size() - 1 : i2;
                int i3 = i2 + 1;
                ArrayList arrayList = new ArrayList(i3);
                int i4 = 0;
                int i5 = 0;
                while (i5 < i3) {
                    i5++;
                    arrayList.add(Float.valueOf(0.0f));
                }
                int size2 = x.size();
                int i6 = size + 1;
                Matrix matrix = new Matrix(i6, size2);
                int i7 = 0;
                while (true) {
                    if (i7 >= size2) {
                        break;
                    }
                    int i8 = i7 + 1;
                    matrix.set(0, i7, 1.0f);
                    for (int i9 = 1; i9 < i6; i9++) {
                        matrix.set(i9, i7, matrix.get(i9 - 1, i7) * x.get(i7).floatValue());
                    }
                    i7 = i8;
                }
                Matrix matrix2 = new Matrix(i6, size2);
                Matrix matrix3 = new Matrix(i6, i6);
                int i10 = 0;
                while (i10 < i6) {
                    int i11 = i10 + 1;
                    for (int i12 = i4; i12 < size2; i12++) {
                        matrix2.set(i10, i12, matrix.get(i10, i12));
                    }
                    int i13 = i4;
                    while (i13 < i10) {
                        int i14 = i13 + 1;
                        float times = matrix2.getRow(i10).times(matrix2.getRow(i13));
                        int i15 = i4;
                        while (i15 < size2) {
                            matrix2.set(i10, i15, matrix2.get(i10, i15) - (matrix2.get(i13, i15) * times));
                            i15++;
                            i4 = 0;
                        }
                        i13 = i14;
                    }
                    float norm = matrix2.getRow(i10).norm();
                    if (norm < 1.0E-6d) {
                        throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
                    }
                    float f2 = 1.0f / norm;
                    for (int i16 = 0; i16 < size2; i16++) {
                        matrix2.set(i10, i16, matrix2.get(i10, i16) * f2);
                    }
                    int i17 = 0;
                    while (i17 < i6) {
                        int i18 = i17 + 1;
                        matrix3.set(i10, i17, i17 < i10 ? 0.0f : matrix2.getRow(i10).times(matrix.getRow(i17)));
                        i17 = i18;
                    }
                    i10 = i11;
                    i4 = 0;
                }
                Vector vector = new Vector(size2);
                for (int i19 = 0; i19 < size2; i19++) {
                    vector.set(i19, y.get(i19).floatValue() * 1.0f);
                }
                int i20 = i6 - 1;
                if (i20 >= 0) {
                    int i21 = i20;
                    while (true) {
                        int i22 = i21 - 1;
                        arrayList.set(i21, Float.valueOf(matrix2.getRow(i21).times(vector)));
                        int i23 = i21 + 1;
                        if (i23 <= i20) {
                            int i24 = i20;
                            while (true) {
                                int i25 = i24 - 1;
                                arrayList.set(i21, Float.valueOf(((Number) arrayList.get(i21)).floatValue() - (matrix3.get(i21, i24) * ((Number) arrayList.get(i24)).floatValue())));
                                if (i24 == i23) {
                                    break;
                                }
                                i24 = i25;
                            }
                        }
                        arrayList.set(i21, Float.valueOf(((Number) arrayList.get(i21)).floatValue() / matrix3.get(i21, i21)));
                        if (i22 < 0) {
                            break;
                        }
                        i21 = i22;
                    }
                }
                float f3 = 0.0f;
                for (int i26 = 0; i26 < size2; i26++) {
                    f3 += y.get(i26).floatValue();
                }
                float f4 = f3 / size2;
                float f5 = 0.0f;
                int i27 = 0;
                float f6 = 0.0f;
                while (i27 < size2) {
                    int i28 = i27 + 1;
                    float floatValue = y.get(i27).floatValue() - ((Number) arrayList.get(0)).floatValue();
                    float f7 = 1.0f;
                    for (int i29 = 1; i29 < i6; i29++) {
                        f7 *= x.get(i27).floatValue();
                        floatValue -= ((Number) arrayList.get(i29)).floatValue() * f7;
                    }
                    f5 += floatValue * 1.0f * floatValue;
                    float floatValue2 = y.get(i27).floatValue() - f4;
                    f6 += floatValue2 * 1.0f * floatValue2;
                    i27 = i28;
                }
                return new PolynomialFit(arrayList, f6 > 1.0E-6f ? 1.0f - (f5 / f6) : 1.0f);
            }
            throw new IllegalArgumentException("x and y must be the same length");
        }
        throw new IllegalArgumentException("The degree must be at positive integer");
    }
}
