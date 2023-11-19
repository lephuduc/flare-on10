package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
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
public final class DrawerKt$ModalDrawer$1 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $content;
    public final /* synthetic */ long $drawerBackgroundColor;
    public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $drawerContent;
    public final /* synthetic */ long $drawerContentColor;
    public final /* synthetic */ float $drawerElevation;
    public final /* synthetic */ Shape $drawerShape;
    public final /* synthetic */ DrawerState $drawerState;
    public final /* synthetic */ boolean $gesturesEnabled;
    public final /* synthetic */ u0 $scope;
    public final /* synthetic */ long $scrimColor;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function2<DrawerValue, DrawerValue, ThresholdConfig> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final ThresholdConfig invoke(@NotNull DrawerValue noName_0, @NotNull DrawerValue noName_1) {
            Intrinsics.checkNotNullParameter(noName_0, "$noName_0");
            Intrinsics.checkNotNullParameter(noName_1, "$noName_1");
            return new FractionalThreshold(0.5f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DrawerKt$ModalDrawer$1(DrawerState drawerState, boolean z, int i2, long j2, Shape shape, long j3, long j4, float f2, Function2<? super Composer, ? super Integer, Unit> function2, u0 u0Var, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3) {
        super(3);
        this.$drawerState = drawerState;
        this.$gesturesEnabled = z;
        this.$$dirty = i2;
        this.$scrimColor = j2;
        this.$drawerShape = shape;
        this.$drawerBackgroundColor = j3;
        this.$drawerContentColor = j4;
        this.$drawerElevation = f2;
        this.$content = function2;
        this.$scope = u0Var;
        this.$drawerContent = function3;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r38v0, types: [androidx.compose.runtime.Composer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v19 */
    @Composable
    public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer, int i2) {
        int i3;
        Map mapOf;
        float f2;
        Modifier m973swipeablepPrIpRY;
        float f3;
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
        long mo340getConstraintsmsEJaDk = BoxWithConstraints.mo340getConstraintsmsEJaDk();
        if (!Constraints.m3289getHasBoundedWidthimpl(mo340getConstraintsmsEJaDk)) {
            throw new IllegalStateException("Drawer shouldn't have infinite width");
        }
        float f4 = -Constraints.m3293getMaxWidthimpl(mo340getConstraintsmsEJaDk);
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.to(Float.valueOf(f4), DrawerValue.Closed), TuplesKt.to(Float.valueOf(0.0f), DrawerValue.Open));
        boolean z = composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
        Modifier.Companion companion = Modifier.Companion;
        SwipeableState<DrawerValue> swipeableState$material_release = this.$drawerState.getSwipeableState$material_release();
        Orientation orientation = Orientation.Horizontal;
        f2 = DrawerKt.DrawerVelocityThreshold;
        m973swipeablepPrIpRY = SwipeableKt.m973swipeablepPrIpRY(companion, swipeableState$material_release, mapOf, orientation, (r26 & 8) != 0 ? true : this.$gesturesEnabled, (r26 & 16) != 0 ? false : z, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? SwipeableKt$swipeable$1.INSTANCE : AnonymousClass1.INSTANCE, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m972getVelocityThresholdD9Ej5fM() : f2);
        DrawerState drawerState = this.$drawerState;
        int i4 = this.$$dirty;
        long j2 = this.$scrimColor;
        Shape shape = this.$drawerShape;
        long j3 = this.$drawerBackgroundColor;
        long j4 = this.$drawerContentColor;
        float f5 = this.$drawerElevation;
        Function2<Composer, Integer, Unit> function2 = this.$content;
        boolean z2 = this.$gesturesEnabled;
        u0 u0Var = this.$scope;
        Function3<ColumnScope, Composer, Integer, Unit> function3 = this.$drawerContent;
        composer.startReplaceableGroup(-1990474327);
        Alignment.Companion companion2 = Alignment.Companion;
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
        composer.startReplaceableGroup(1376089394);
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
        Updater.m1072setimpl(m1065constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m1072setimpl(m1065constructorimpl, density, companion3.getSetDensity());
        Updater.m1072setimpl(m1065constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
        Updater.m1072setimpl(m1065constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
        composer.enableReusing();
        materializerOf.invoke(SkippableUpdater.m1056boximpl(SkippableUpdater.m1057constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        composer.startReplaceableGroup(-1253629305);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        composer.startReplaceableGroup(413823892);
        composer.startReplaceableGroup(-1990474327);
        MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
        composer.startReplaceableGroup(1376089394);
        Density density2 = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection2 = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(companion);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor2);
        } else {
            composer.useNode();
        }
        composer.disableReusing();
        Composer m1065constructorimpl2 = Updater.m1065constructorimpl(composer);
        Updater.m1072setimpl(m1065constructorimpl2, rememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
        Updater.m1072setimpl(m1065constructorimpl2, density2, companion3.getSetDensity());
        Updater.m1072setimpl(m1065constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
        Updater.m1072setimpl(m1065constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
        composer.enableReusing();
        materializerOf2.invoke(SkippableUpdater.m1056boximpl(SkippableUpdater.m1057constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        composer.startReplaceableGroup(-1253629305);
        composer.startReplaceableGroup(392275659);
        function2.invoke(composer, Integer.valueOf((i4 >> 27) & 14));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        boolean isOpen = drawerState.isOpen();
        DrawerKt$ModalDrawer$1$2$2 drawerKt$ModalDrawer$1$2$2 = new DrawerKt$ModalDrawer$1$2$2(z2, drawerState, u0Var);
        Float valueOf = Float.valueOf(f4);
        Float valueOf2 = Float.valueOf(0.0f);
        composer.startReplaceableGroup(-3686095);
        boolean changed = composer.changed(valueOf) | composer.changed(valueOf2) | composer.changed(drawerState);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DrawerKt$ModalDrawer$1$2$3$1(f4, 0.0f, drawerState);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DrawerKt.m817ScrimBx497Mc(isOpen, drawerKt$ModalDrawer$1$2$2, rememberedValue, j2, composer, (i4 >> 15) & 7168);
        String m966getString4foXLRw = Strings_androidKt.m966getString4foXLRw(Strings.Companion.m965getNavigationMenuUdPEhr4(), composer, 6);
        Density density3 = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Modifier m409sizeInqDBjuR0 = SizeKt.m409sizeInqDBjuR0(companion, density3.mo274toDpu2uoSUM(Constraints.m3295getMinWidthimpl(mo340getConstraintsmsEJaDk)), density3.mo274toDpu2uoSUM(Constraints.m3294getMinHeightimpl(mo340getConstraintsmsEJaDk)), density3.mo274toDpu2uoSUM(Constraints.m3293getMaxWidthimpl(mo340getConstraintsmsEJaDk)), density3.mo274toDpu2uoSUM(Constraints.m3292getMaxHeightimpl(mo340getConstraintsmsEJaDk)));
        composer.startReplaceableGroup(-3686930);
        boolean changed2 = composer.changed(drawerState);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new DrawerKt$ModalDrawer$1$2$5$1(drawerState);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        Modifier offset = OffsetKt.offset(m409sizeInqDBjuR0, (Function1) rememberedValue2);
        f3 = DrawerKt.EndDrawerPadding;
        int i5 = i4 >> 12;
        SurfaceKt.m969SurfaceFjzlyU(SemanticsModifierKt.semantics$default(PaddingKt.m368paddingqDBjuR0$default(offset, 0.0f, 0.0f, f3, 0.0f, 11, null), false, new DrawerKt$ModalDrawer$1$2$6(m966getString4foXLRw, drawerState, u0Var), 1, null), shape, j3, j4, (BorderStroke) null, f5, ComposableLambdaKt.composableLambda(composer, -819910972, true, new DrawerKt$ModalDrawer$1$2$7(function3, i4)), (Composer) composer, 1572864 | ((i4 >> 9) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i5 & 896) | (i5 & 7168) | (458752 & i4), 16);
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }
}
