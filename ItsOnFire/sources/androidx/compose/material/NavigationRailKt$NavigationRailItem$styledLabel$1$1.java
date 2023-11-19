package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class NavigationRailKt$NavigationRailItem$styledLabel$1$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavigationRailKt$NavigationRailItem$styledLabel$1$1(Function2<? super Composer, ? super Integer, Unit> function2, int i2) {
        super(2);
        this.$label = function2;
        this.$$dirty = i2;
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
        m3084copyHL5avdY = r3.m3084copyHL5avdY((r44 & 1) != 0 ? r3.m3087getColor0d7_KjU() : 0L, (r44 & 2) != 0 ? r3.m3088getFontSizeXSAIIZE() : 0L, (r44 & 4) != 0 ? r3.fontWeight : null, (r44 & 8) != 0 ? r3.m3089getFontStyle4Lr2A7w() : null, (r44 & 16) != 0 ? r3.m3090getFontSynthesisZQGJjVo() : null, (r44 & 32) != 0 ? r3.fontFamily : null, (r44 & 64) != 0 ? r3.fontFeatureSettings : null, (r44 & 128) != 0 ? r3.m3091getLetterSpacingXSAIIZE() : 0L, (r44 & 256) != 0 ? r3.m3086getBaselineShift5SSeXJ0() : null, (r44 & 512) != 0 ? r3.textGeometricTransform : null, (r44 & 1024) != 0 ? r3.localeList : null, (r44 & 2048) != 0 ? r3.m3085getBackground0d7_KjU() : 0L, (r44 & 4096) != 0 ? r3.textDecoration : null, (r44 & 8192) != 0 ? r3.shadow : null, (r44 & 16384) != 0 ? r3.m3093getTextAlignbuA522U() : TextAlign.m3239boximpl(TextAlign.Companion.m3246getCentere0LSkKk()), (r44 & 32768) != 0 ? r3.m3094getTextDirectionmmuk1to() : null, (r44 & 65536) != 0 ? r3.m3092getLineHeightXSAIIZE() : 0L, (r44 & 131072) != 0 ? MaterialTheme.INSTANCE.getTypography(composer, 6).getCaption().textIndent : null);
        TextKt.ProvideTextStyle(m3084copyHL5avdY, this.$label, composer, (this.$$dirty >> 12) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
    }
}
