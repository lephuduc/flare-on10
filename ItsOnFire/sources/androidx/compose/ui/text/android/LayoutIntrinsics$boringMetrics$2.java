package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.TextPaint;
import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/text/BoringLayout$Metrics;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LayoutIntrinsics$boringMetrics$2 extends Lambda implements Function0<BoringLayout.Metrics> {
    public final /* synthetic */ CharSequence $charSequence;
    public final /* synthetic */ int $textDirectionHeuristic;
    public final /* synthetic */ TextPaint $textPaint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutIntrinsics$boringMetrics$2(int i2, CharSequence charSequence, TextPaint textPaint) {
        super(0);
        this.$textDirectionHeuristic = i2;
        this.$charSequence = charSequence;
        this.$textPaint = textPaint;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final BoringLayout.Metrics invoke() {
        return BoringLayoutFactory.INSTANCE.measure(this.$charSequence, this.$textPaint, TextLayoutKt.getTextDirectionHeuristic(this.$textDirectionHeuristic));
    }
}
