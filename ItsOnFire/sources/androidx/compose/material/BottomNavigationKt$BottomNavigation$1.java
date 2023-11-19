package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
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
public final class BottomNavigationKt$BottomNavigation$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomNavigationKt$BottomNavigation$1(Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, int i2) {
        super(2);
        this.$content = function3;
        this.$$dirty = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    @Composable
    public final void invoke(@Nullable Composer composer, int i2) {
        float f2;
        if (((i2 & 11) ^ 2) == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
        f2 = BottomNavigationKt.BottomNavigationHeight;
        Modifier selectableGroup = SelectableGroupKt.selectableGroup(SizeKt.m392height3ABfNKs(fillMaxWidth$default, f2));
        Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
        Function3<RowScope, Composer, Integer, Unit> function3 = this.$content;
        int i3 = ((this.$$dirty >> 3) & 7168) | 48;
        composer.startReplaceableGroup(-1989997165);
        int i4 = i3 >> 3;
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.Companion.getTop(), composer, (i4 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i4 & 14));
        int i5 = (i3 << 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        composer.startReplaceableGroup(1376089394);
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(selectableGroup);
        int i6 = ((i5 << 9) & 7168) | 6;
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
        materializerOf.invoke(SkippableUpdater.m1056boximpl(SkippableUpdater.m1057constructorimpl(composer)), composer, Integer.valueOf((i6 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
        composer.startReplaceableGroup(2058660585);
        composer.startReplaceableGroup(-326682362);
        if (((((i6 >> 9) & 14) & 11) ^ 2) == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            function3.invoke(RowScopeInstance.INSTANCE, composer, Integer.valueOf(((i3 >> 6) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }
}
