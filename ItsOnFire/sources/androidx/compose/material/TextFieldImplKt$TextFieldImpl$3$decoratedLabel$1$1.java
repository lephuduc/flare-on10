package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TextFieldImplKt$TextFieldImpl$3$decoratedLabel$1$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $it;
    public final /* synthetic */ long $labelContentColor;
    public final /* synthetic */ float $labelProgress;
    public final /* synthetic */ long $labelTextStyleColor;
    public final /* synthetic */ boolean $shouldOverrideTextStyleColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldImplKt$TextFieldImpl$3$decoratedLabel$1$1(float f2, long j2, Function2<? super Composer, ? super Integer, Unit> function2, int i2, boolean z, long j3) {
        super(2);
        this.$labelProgress = f2;
        this.$labelContentColor = j2;
        this.$it = function2;
        this.$$dirty = i2;
        this.$shouldOverrideTextStyleColor = z;
        this.$labelTextStyleColor = j3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    @Composable
    public final void invoke(@Nullable Composer composer, int i2) {
        TextStyle m3084copyHL5avdY;
        if (((i2 & 11) ^ 2) == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        TextStyle lerp = TextStyleKt.lerp(materialTheme.getTypography(composer, 6).getSubtitle1(), materialTheme.getTypography(composer, 6).getCaption(), this.$labelProgress);
        boolean z = this.$shouldOverrideTextStyleColor;
        long j2 = this.$labelTextStyleColor;
        if (z) {
            m3084copyHL5avdY = lerp.m3084copyHL5avdY((r44 & 1) != 0 ? lerp.m3087getColor0d7_KjU() : j2, (r44 & 2) != 0 ? lerp.m3088getFontSizeXSAIIZE() : 0L, (r44 & 4) != 0 ? lerp.fontWeight : null, (r44 & 8) != 0 ? lerp.m3089getFontStyle4Lr2A7w() : null, (r44 & 16) != 0 ? lerp.m3090getFontSynthesisZQGJjVo() : null, (r44 & 32) != 0 ? lerp.fontFamily : null, (r44 & 64) != 0 ? lerp.fontFeatureSettings : null, (r44 & 128) != 0 ? lerp.m3091getLetterSpacingXSAIIZE() : 0L, (r44 & 256) != 0 ? lerp.m3086getBaselineShift5SSeXJ0() : null, (r44 & 512) != 0 ? lerp.textGeometricTransform : null, (r44 & 1024) != 0 ? lerp.localeList : null, (r44 & 2048) != 0 ? lerp.m3085getBackground0d7_KjU() : 0L, (r44 & 4096) != 0 ? lerp.textDecoration : null, (r44 & 8192) != 0 ? lerp.shadow : null, (r44 & 16384) != 0 ? lerp.m3093getTextAlignbuA522U() : null, (r44 & 32768) != 0 ? lerp.m3094getTextDirectionmmuk1to() : null, (r44 & 65536) != 0 ? lerp.m3092getLineHeightXSAIIZE() : 0L, (r44 & 131072) != 0 ? lerp.textIndent : null);
            lerp = m3084copyHL5avdY;
        }
        TextFieldImplKt.m1006DecorationeuL9pac(this.$labelContentColor, lerp, null, this.$it, composer, ((this.$$dirty >> 6) & 14) | 384, 0);
    }
}
