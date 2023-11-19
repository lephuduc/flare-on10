package androidx.compose.material;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TabKt$LeadingIconTab$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $icon;
    public final /* synthetic */ MutableInteractionSource $interactionSource;
    public final /* synthetic */ Modifier $modifier;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ Indication $ripple;
    public final /* synthetic */ boolean $selected;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TabKt$LeadingIconTab$2(Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z2, Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, int i2, Function2<? super Composer, ? super Integer, Unit> function22) {
        super(2);
        this.$modifier = modifier;
        this.$selected = z;
        this.$interactionSource = mutableInteractionSource;
        this.$ripple = indication;
        this.$enabled = z2;
        this.$onClick = function0;
        this.$icon = function2;
        this.$$dirty = i2;
        this.$text = function22;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    @Composable
    public final void invoke(@Nullable Composer composer, int i2) {
        float f2;
        float f3;
        float f4;
        TextStyle m3084copyHL5avdY;
        if (((i2 & 11) ^ 2) == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        Modifier modifier = this.$modifier;
        f2 = TabKt.SmallTabHeight;
        Modifier m483selectableO2vRcR0 = SelectableKt.m483selectableO2vRcR0(SizeKt.m392height3ABfNKs(modifier, f2), this.$selected, this.$interactionSource, this.$ripple, this.$enabled, Role.m2975boximpl(Role.Companion.m2987getTabo7Vup1c()), this.$onClick);
        f3 = TabKt.HorizontalTextPadding;
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m366paddingVpY3zN4$default(m483selectableO2vRcR0, f3, 0.0f, 2, null), 0.0f, 1, null);
        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
        Function2<Composer, Integer, Unit> function2 = this.$icon;
        int i3 = this.$$dirty;
        Function2<Composer, Integer, Unit> function22 = this.$text;
        composer.startReplaceableGroup(-1989997165);
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer, 54);
        composer.startReplaceableGroup(1376089394);
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(fillMaxWidth$default);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        composer.disableReusing();
        Composer m1065constructorimpl = Updater.m1065constructorimpl(composer);
        Updater.m1072setimpl(m1065constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m1072setimpl(m1065constructorimpl, density, companion.getSetDensity());
        Updater.m1072setimpl(m1065constructorimpl, layoutDirection, companion.getSetLayoutDirection());
        Updater.m1072setimpl(m1065constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
        composer.enableReusing();
        materializerOf.invoke(SkippableUpdater.m1056boximpl(SkippableUpdater.m1057constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        composer.startReplaceableGroup(-326682362);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        composer.startReplaceableGroup(106889743);
        function2.invoke(composer, Integer.valueOf((i3 >> 9) & 14));
        Modifier.Companion companion2 = Modifier.Companion;
        f4 = TabKt.TextDistanceFromLeadingIcon;
        SpacerKt.Spacer(SizeKt.m403requiredWidth3ABfNKs(companion2, f4), composer, 6);
        m3084copyHL5avdY = r7.m3084copyHL5avdY((r44 & 1) != 0 ? r7.m3087getColor0d7_KjU() : 0L, (r44 & 2) != 0 ? r7.m3088getFontSizeXSAIIZE() : 0L, (r44 & 4) != 0 ? r7.fontWeight : null, (r44 & 8) != 0 ? r7.m3089getFontStyle4Lr2A7w() : null, (r44 & 16) != 0 ? r7.m3090getFontSynthesisZQGJjVo() : null, (r44 & 32) != 0 ? r7.fontFamily : null, (r44 & 64) != 0 ? r7.fontFeatureSettings : null, (r44 & 128) != 0 ? r7.m3091getLetterSpacingXSAIIZE() : 0L, (r44 & 256) != 0 ? r7.m3086getBaselineShift5SSeXJ0() : null, (r44 & 512) != 0 ? r7.textGeometricTransform : null, (r44 & 1024) != 0 ? r7.localeList : null, (r44 & 2048) != 0 ? r7.m3085getBackground0d7_KjU() : 0L, (r44 & 4096) != 0 ? r7.textDecoration : null, (r44 & 8192) != 0 ? r7.shadow : null, (r44 & 16384) != 0 ? r7.m3093getTextAlignbuA522U() : TextAlign.m3239boximpl(TextAlign.Companion.m3246getCentere0LSkKk()), (r44 & 32768) != 0 ? r7.m3094getTextDirectionmmuk1to() : null, (r44 & 65536) != 0 ? r7.m3092getLineHeightXSAIIZE() : 0L, (r44 & 131072) != 0 ? MaterialTheme.INSTANCE.getTypography(composer, 6).getButton().textIndent : null);
        TextKt.ProvideTextStyle(m3084copyHL5avdY, function22, composer, (i3 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }
}
