package androidx.compose.material;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class BadgeKt$Badge$1$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ int $$dirty$1;
    public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
    public final /* synthetic */ RowScope $this_Row;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.material.BadgeKt$Badge$1$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$dirty;
        public final /* synthetic */ int $$dirty$1;
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
        public final /* synthetic */ RowScope $this_Row;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, RowScope rowScope, int i2, int i3) {
            super(2);
            this.$content = function3;
            this.$this_Row = rowScope;
            this.$$dirty = i2;
            this.$$dirty$1 = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        @Composable
        public final void invoke(@Nullable Composer composer, int i2) {
            if (((i2 & 11) ^ 2) == 0 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            this.$content.invoke(this.$this_Row, composer, Integer.valueOf(((this.$$dirty$1 >> 6) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (this.$$dirty & 14)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BadgeKt$Badge$1$1(Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, RowScope rowScope, int i2, int i3) {
        super(2);
        this.$content = function3;
        this.$this_Row = rowScope;
        this.$$dirty = i2;
        this.$$dirty$1 = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    @Composable
    public final void invoke(@Nullable Composer composer, int i2) {
        long j2;
        TextStyle m3084copyHL5avdY;
        if (((i2 & 11) ^ 2) == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        TextStyle button = MaterialTheme.INSTANCE.getTypography(composer, 6).getButton();
        j2 = BadgeKt.BadgeContentFontSize;
        m3084copyHL5avdY = button.m3084copyHL5avdY((r44 & 1) != 0 ? button.m3087getColor0d7_KjU() : 0L, (r44 & 2) != 0 ? button.m3088getFontSizeXSAIIZE() : j2, (r44 & 4) != 0 ? button.fontWeight : null, (r44 & 8) != 0 ? button.m3089getFontStyle4Lr2A7w() : null, (r44 & 16) != 0 ? button.m3090getFontSynthesisZQGJjVo() : null, (r44 & 32) != 0 ? button.fontFamily : null, (r44 & 64) != 0 ? button.fontFeatureSettings : null, (r44 & 128) != 0 ? button.m3091getLetterSpacingXSAIIZE() : 0L, (r44 & 256) != 0 ? button.m3086getBaselineShift5SSeXJ0() : null, (r44 & 512) != 0 ? button.textGeometricTransform : null, (r44 & 1024) != 0 ? button.localeList : null, (r44 & 2048) != 0 ? button.m3085getBackground0d7_KjU() : 0L, (r44 & 4096) != 0 ? button.textDecoration : null, (r44 & 8192) != 0 ? button.shadow : null, (r44 & 16384) != 0 ? button.m3093getTextAlignbuA522U() : null, (r44 & 32768) != 0 ? button.m3094getTextDirectionmmuk1to() : null, (r44 & 65536) != 0 ? button.m3092getLineHeightXSAIIZE() : 0L, (r44 & 131072) != 0 ? button.textIndent : null);
        TextKt.ProvideTextStyle(m3084copyHL5avdY, ComposableLambdaKt.composableLambda(composer, -819888416, true, new AnonymousClass1(this.$content, this.$this_Row, this.$$dirty, this.$$dirty$1)), composer, 48);
    }
}
