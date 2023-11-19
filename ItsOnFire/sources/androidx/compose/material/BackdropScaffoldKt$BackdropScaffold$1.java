package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
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
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import j.u0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class BackdropScaffoldKt$BackdropScaffold$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ int $$dirty1;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $backLayer;
    public final /* synthetic */ Function1<Constraints, Constraints> $calculateBackLayerConstraints;
    public final /* synthetic */ long $frontLayerBackgroundColor;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $frontLayerContent;
    public final /* synthetic */ long $frontLayerContentColor;
    public final /* synthetic */ float $frontLayerElevation;
    public final /* synthetic */ long $frontLayerScrimColor;
    public final /* synthetic */ Shape $frontLayerShape;
    public final /* synthetic */ boolean $gesturesEnabled;
    public final /* synthetic */ float $headerHeight;
    public final /* synthetic */ float $headerHeightPx;
    public final /* synthetic */ Modifier $modifier;
    public final /* synthetic */ float $peekHeight;
    public final /* synthetic */ float $peekHeightPx;
    public final /* synthetic */ BackdropScaffoldState $scaffoldState;
    public final /* synthetic */ Function3<SnackbarHostState, Composer, Integer, Unit> $snackbarHost;
    public final /* synthetic */ boolean $stickyFrontLayer;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function4<Constraints, Float, Composer, Integer, Unit> {
        public final /* synthetic */ int $$dirty;
        public final /* synthetic */ int $$dirty1;
        public final /* synthetic */ long $frontLayerBackgroundColor;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $frontLayerContent;
        public final /* synthetic */ long $frontLayerContentColor;
        public final /* synthetic */ float $frontLayerElevation;
        public final /* synthetic */ long $frontLayerScrimColor;
        public final /* synthetic */ Shape $frontLayerShape;
        public final /* synthetic */ boolean $gesturesEnabled;
        public final /* synthetic */ float $headerHeight;
        public final /* synthetic */ float $headerHeightPx;
        public final /* synthetic */ float $peekHeight;
        public final /* synthetic */ float $peekHeightPx;
        public final /* synthetic */ BackdropScaffoldState $scaffoldState;
        public final /* synthetic */ u0 $scope;
        public final /* synthetic */ Function3<SnackbarHostState, Composer, Integer, Unit> $snackbarHost;
        public final /* synthetic */ boolean $stickyFrontLayer;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
        /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends Lambda implements Function2<Composer, Integer, Unit> {
            public final /* synthetic */ int $$dirty;
            public final /* synthetic */ int $$dirty1;
            public final /* synthetic */ Function2<Composer, Integer, Unit> $frontLayerContent;
            public final /* synthetic */ long $frontLayerScrimColor;
            public final /* synthetic */ boolean $gesturesEnabled;
            public final /* synthetic */ float $peekHeight;
            public final /* synthetic */ BackdropScaffoldState $scaffoldState;
            public final /* synthetic */ u0 $scope;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(float f2, Function2<? super Composer, ? super Integer, Unit> function2, int i2, long j2, BackdropScaffoldState backdropScaffoldState, int i3, boolean z, u0 u0Var) {
                super(2);
                this.$peekHeight = f2;
                this.$frontLayerContent = function2;
                this.$$dirty = i2;
                this.$frontLayerScrimColor = j2;
                this.$scaffoldState = backdropScaffoldState;
                this.$$dirty1 = i3;
                this.$gesturesEnabled = z;
                this.$scope = u0Var;
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
                Modifier m368paddingqDBjuR0$default = PaddingKt.m368paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, this.$peekHeight, 7, null);
                Function2<Composer, Integer, Unit> function2 = this.$frontLayerContent;
                int i3 = this.$$dirty;
                long j2 = this.$frontLayerScrimColor;
                BackdropScaffoldState backdropScaffoldState = this.$scaffoldState;
                int i4 = this.$$dirty1;
                boolean z = this.$gesturesEnabled;
                u0 u0Var = this.$scope;
                composer.startReplaceableGroup(-1990474327);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(1376089394);
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m368paddingqDBjuR0$default);
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
                Updater.m1072setimpl(m1065constructorimpl, density, companion.getSetDensity());
                Updater.m1072setimpl(m1065constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                Updater.m1072setimpl(m1065constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                composer.enableReusing();
                materializerOf.invoke(SkippableUpdater.m1056boximpl(SkippableUpdater.m1057constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                composer.startReplaceableGroup(-1253629305);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composer.startReplaceableGroup(967343144);
                function2.invoke(composer, Integer.valueOf((i3 >> 6) & 14));
                BackdropScaffoldKt.m699Scrim3JVO9M(j2, new BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1(z, backdropScaffoldState, u0Var), backdropScaffoldState.getTargetValue() == BackdropValue.Revealed, composer, (i4 >> 18) & 14);
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(float f2, boolean z, boolean z2, BackdropScaffoldState backdropScaffoldState, float f3, int i2, Shape shape, long j2, long j3, float f4, int i3, float f5, u0 u0Var, float f6, Function2<? super Composer, ? super Integer, Unit> function2, long j4, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3) {
            super(4);
            this.$headerHeightPx = f2;
            this.$stickyFrontLayer = z;
            this.$gesturesEnabled = z2;
            this.$scaffoldState = backdropScaffoldState;
            this.$peekHeightPx = f3;
            this.$$dirty = i2;
            this.$frontLayerShape = shape;
            this.$frontLayerBackgroundColor = j2;
            this.$frontLayerContentColor = j3;
            this.$frontLayerElevation = f4;
            this.$$dirty1 = i3;
            this.$headerHeight = f5;
            this.$scope = u0Var;
            this.$peekHeight = f6;
            this.$frontLayerContent = function2;
            this.$frontLayerScrimColor = j4;
            this.$snackbarHost = function3;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(Constraints constraints, Float f2, Composer composer, Integer num) {
            m703invokejYbf7pk(constraints.m3299unboximpl(), f2.floatValue(), composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x01c3  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x01cf  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x01d3  */
        @androidx.compose.runtime.Composable
        /* renamed from: invoke-jYbf7pk  reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m703invokejYbf7pk(long r33, float r35, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r36, int r37) {
            /*
                Method dump skipped, instructions count: 577
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1.AnonymousClass1.m703invokejYbf7pk(long, float, androidx.compose.runtime.Composer, int):void");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BackdropScaffoldKt$BackdropScaffold$1(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function1<? super Constraints, Constraints> function1, float f2, boolean z, boolean z2, BackdropScaffoldState backdropScaffoldState, float f3, int i2, Shape shape, long j2, long j3, float f4, int i3, float f5, float f6, Function2<? super Composer, ? super Integer, Unit> function22, long j4, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3) {
        super(2);
        this.$modifier = modifier;
        this.$backLayer = function2;
        this.$calculateBackLayerConstraints = function1;
        this.$headerHeightPx = f2;
        this.$stickyFrontLayer = z;
        this.$gesturesEnabled = z2;
        this.$scaffoldState = backdropScaffoldState;
        this.$peekHeightPx = f3;
        this.$$dirty = i2;
        this.$frontLayerShape = shape;
        this.$frontLayerBackgroundColor = j2;
        this.$frontLayerContentColor = j3;
        this.$frontLayerElevation = f4;
        this.$$dirty1 = i3;
        this.$headerHeight = f5;
        this.$peekHeight = f6;
        this.$frontLayerContent = function22;
        this.$frontLayerScrimColor = j4;
        this.$snackbarHost = function3;
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
        composer.startReplaceableGroup(-723524056);
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        u0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        BackdropScaffoldKt.BackdropStack(SizeKt.fillMaxSize$default(this.$modifier, 0.0f, 1, null), this.$backLayer, this.$calculateBackLayerConstraints, ComposableLambdaKt.composableLambda(composer, -819899836, true, new AnonymousClass1(this.$headerHeightPx, this.$stickyFrontLayer, this.$gesturesEnabled, this.$scaffoldState, this.$peekHeightPx, this.$$dirty, this.$frontLayerShape, this.$frontLayerBackgroundColor, this.$frontLayerContentColor, this.$frontLayerElevation, this.$$dirty1, this.$headerHeight, coroutineScope, this.$peekHeight, this.$frontLayerContent, this.$frontLayerScrimColor, this.$snackbarHost)), composer, 3120);
    }
}
