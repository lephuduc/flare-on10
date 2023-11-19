package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import j.u0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class DrawerKt$BottomDrawer$1 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $content;
    public final /* synthetic */ long $drawerBackgroundColor;
    public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $drawerContent;
    public final /* synthetic */ long $drawerContentColor;
    public final /* synthetic */ float $drawerElevation;
    public final /* synthetic */ Shape $drawerShape;
    public final /* synthetic */ BottomDrawerState $drawerState;
    public final /* synthetic */ boolean $gesturesEnabled;
    public final /* synthetic */ u0 $scope;
    public final /* synthetic */ long $scrimColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DrawerKt$BottomDrawer$1(boolean z, BottomDrawerState bottomDrawerState, Function2<? super Composer, ? super Integer, Unit> function2, int i2, long j2, Shape shape, long j3, long j4, float f2, u0 u0Var, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3) {
        super(3);
        this.$gesturesEnabled = z;
        this.$drawerState = bottomDrawerState;
        this.$content = function2;
        this.$$dirty = i2;
        this.$scrimColor = j2;
        this.$drawerShape = shape;
        this.$drawerBackgroundColor = j3;
        this.$drawerContentColor = j4;
        this.$drawerElevation = f2;
        this.$scope = u0Var;
        this.$drawerContent = function3;
    }

    /* renamed from: invoke$lambda-1  reason: not valid java name */
    private static final float m822invoke$lambda1(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-2  reason: not valid java name */
    public static final void m823invoke$lambda2(MutableState<Float> mutableState, float f2) {
        mutableState.setValue(Float.valueOf(f2));
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r29v0, types: [androidx.compose.runtime.Composer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2 */
    @Composable
    public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer, int i2) {
        int i3;
        Modifier m973swipeablepPrIpRY;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i2 & 14) == 0) {
            i3 = i2 | (composer.changed(BoxWithConstraints) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if (((i3 & 91) ^ 18) == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        float m3292getMaxHeightimpl = Constraints.m3292getMaxHeightimpl(BoxWithConstraints.mo340getConstraintsmsEJaDk());
        Float valueOf = Float.valueOf(m3292getMaxHeightimpl);
        composer.startReplaceableGroup(-3686930);
        boolean changed = composer.changed(valueOf);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(m3292getMaxHeightimpl), null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = rememberedValue;
        boolean z = Constraints.m3293getMaxWidthimpl(BoxWithConstraints.mo340getConstraintsmsEJaDk()) > Constraints.m3292getMaxHeightimpl(BoxWithConstraints.mo340getConstraintsmsEJaDk());
        float f2 = 0.5f * m3292getMaxHeightimpl;
        float max = Math.max(0.0f, m3292getMaxHeightimpl - m822invoke$lambda1(mutableState));
        Map mapOf = (m822invoke$lambda1(mutableState) < f2 || z) ? MapsKt__MapsKt.mapOf(TuplesKt.to(Float.valueOf(m3292getMaxHeightimpl), BottomDrawerValue.Closed), TuplesKt.to(Float.valueOf(max), BottomDrawerValue.Expanded)) : MapsKt__MapsKt.mapOf(TuplesKt.to(Float.valueOf(m3292getMaxHeightimpl), BottomDrawerValue.Closed), TuplesKt.to(Float.valueOf(f2), BottomDrawerValue.Open), TuplesKt.to(Float.valueOf(max), BottomDrawerValue.Expanded));
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Modifier modifier = Modifier.Companion;
        Modifier m410sizeInqDBjuR0$default = SizeKt.m410sizeInqDBjuR0$default(modifier, 0.0f, 0.0f, density.mo274toDpu2uoSUM(Constraints.m3293getMaxWidthimpl(BoxWithConstraints.mo340getConstraintsmsEJaDk())), density.mo274toDpu2uoSUM(Constraints.m3292getMaxHeightimpl(BoxWithConstraints.mo340getConstraintsmsEJaDk())), 3, null);
        m973swipeablepPrIpRY = SwipeableKt.m973swipeablepPrIpRY(modifier.then(this.$gesturesEnabled ? NestedScrollModifierKt.nestedScroll$default(modifier, this.$drawerState.getNestedScrollConnection$material_release(), null, 2, null) : modifier), this.$drawerState, mapOf, Orientation.Vertical, (r26 & 8) != 0 ? true : this.$gesturesEnabled, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? SwipeableKt$swipeable$1.INSTANCE : null, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m972getVelocityThresholdD9Ej5fM() : 0.0f);
        Function2<Composer, Integer, Unit> function2 = this.$content;
        int i4 = this.$$dirty;
        long j2 = this.$scrimColor;
        BottomDrawerState bottomDrawerState = this.$drawerState;
        Shape shape = this.$drawerShape;
        long j3 = this.$drawerBackgroundColor;
        long j4 = this.$drawerContentColor;
        float f3 = this.$drawerElevation;
        boolean z2 = this.$gesturesEnabled;
        u0 u0Var = this.$scope;
        Function3<ColumnScope, Composer, Integer, Unit> function3 = this.$drawerContent;
        composer.startReplaceableGroup(-1990474327);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
        composer.startReplaceableGroup(1376089394);
        Density density2 = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m973swipeablepPrIpRY);
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
        Updater.m1072setimpl(m1065constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m1072setimpl(m1065constructorimpl, density2, companion.getSetDensity());
        Updater.m1072setimpl(m1065constructorimpl, layoutDirection, companion.getSetLayoutDirection());
        Updater.m1072setimpl(m1065constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
        composer.enableReusing();
        materializerOf.invoke(SkippableUpdater.m1056boximpl(SkippableUpdater.m1057constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        composer.startReplaceableGroup(-1253629305);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        composer.startReplaceableGroup(1720989587);
        function2.invoke(composer, Integer.valueOf((i4 >> 27) & 14));
        DrawerKt.m814BottomDrawerScrim3JVO9M(j2, new DrawerKt$BottomDrawer$1$1$1(z2, bottomDrawerState, u0Var), bottomDrawerState.getTargetValue() != BottomDrawerValue.Closed, composer, (i4 >> 24) & 14);
        String m966getString4foXLRw = Strings_androidKt.m966getString4foXLRw(Strings.Companion.m965getNavigationMenuUdPEhr4(), composer, 6);
        composer.startReplaceableGroup(-3686930);
        boolean changed2 = composer.changed(bottomDrawerState);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new DrawerKt$BottomDrawer$1$1$2$1(bottomDrawerState);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        Modifier offset = OffsetKt.offset(m410sizeInqDBjuR0$default, (Function1) rememberedValue2);
        composer.startReplaceableGroup(-3686930);
        boolean changed3 = composer.changed(mutableState);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
            rememberedValue3 = new DrawerKt$BottomDrawer$1$1$3$1(mutableState);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        int i5 = i4 >> 12;
        SurfaceKt.m969SurfaceFjzlyU(SemanticsModifierKt.semantics$default(OnGloballyPositionedModifierKt.onGloballyPositioned(offset, (Function1) rememberedValue3), false, new DrawerKt$BottomDrawer$1$1$4(m966getString4foXLRw, bottomDrawerState, u0Var), 1, null), shape, j3, j4, (BorderStroke) null, f3, ComposableLambdaKt.composableLambda(composer, -819908581, true, new DrawerKt$BottomDrawer$1$1$5(function3, i4)), (Composer) composer, 1572864 | ((i4 >> 9) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i5 & 896) | (i5 & 7168) | (458752 & i4), 16);
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }
}
