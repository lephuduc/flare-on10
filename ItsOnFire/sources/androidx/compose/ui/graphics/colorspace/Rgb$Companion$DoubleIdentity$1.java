package androidx.compose.ui.graphics.colorspace;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "invoke", "(D)Ljava/lang/Double;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class Rgb$Companion$DoubleIdentity$1 extends Lambda implements Function1<Double, Double> {
    public static final Rgb$Companion$DoubleIdentity$1 INSTANCE = new Rgb$Companion$DoubleIdentity$1();

    public Rgb$Companion$DoubleIdentity$1() {
        super(1);
    }

    @NotNull
    public final Double invoke(double d2) {
        return Double.valueOf(d2);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Double invoke(Double d2) {
        return invoke(d2.doubleValue());
    }
}
