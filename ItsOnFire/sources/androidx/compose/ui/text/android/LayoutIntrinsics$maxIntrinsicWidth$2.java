package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LayoutIntrinsics$maxIntrinsicWidth$2 extends Lambda implements Function0<Float> {
    public final /* synthetic */ CharSequence $charSequence;
    public final /* synthetic */ TextPaint $textPaint;
    public final /* synthetic */ LayoutIntrinsics this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutIntrinsics$maxIntrinsicWidth$2(LayoutIntrinsics layoutIntrinsics, CharSequence charSequence, TextPaint textPaint) {
        super(0);
        this.this$0 = layoutIntrinsics;
        this.$charSequence = charSequence;
        this.$textPaint = textPaint;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Float invoke() {
        float floatValue;
        boolean shouldIncreaseMaxIntrinsic;
        BoringLayout.Metrics boringMetrics = this.this$0.getBoringMetrics();
        Float valueOf = boringMetrics == null ? null : Float.valueOf(boringMetrics.width);
        if (valueOf == null) {
            CharSequence charSequence = this.$charSequence;
            floatValue = Layout.getDesiredWidth(charSequence, 0, charSequence.length(), this.$textPaint);
        } else {
            floatValue = valueOf.floatValue();
        }
        shouldIncreaseMaxIntrinsic = LayoutIntrinsicsKt.shouldIncreaseMaxIntrinsic(floatValue, this.$charSequence, this.$textPaint);
        if (shouldIncreaseMaxIntrinsic) {
            floatValue += 0.5f;
        }
        return Float.valueOf(floatValue);
    }
}
