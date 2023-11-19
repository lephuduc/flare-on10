package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt$BottomSheetScaffold$1$child$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ int $$dirty1;
    public final /* synthetic */ int $$dirty2;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ MutableState<Float> $bottomSheetHeight$delegate;
    public final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> $content;
    public final /* synthetic */ long $contentColor;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $floatingActionButton;
    public final /* synthetic */ int $floatingActionButtonPosition;
    public final /* synthetic */ BottomSheetScaffoldState $scaffoldState;
    public final /* synthetic */ long $sheetBackgroundColor;
    public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $sheetContent;
    public final /* synthetic */ long $sheetContentColor;
    public final /* synthetic */ float $sheetElevation;
    public final /* synthetic */ float $sheetPeekHeight;
    public final /* synthetic */ Shape $sheetShape;
    public final /* synthetic */ Function3<SnackbarHostState, Composer, Integer, Unit> $snackbarHost;
    public final /* synthetic */ Modifier $swipeable;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $topBar;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$child$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$dirty;
        public final /* synthetic */ int $$dirty2;
        public final /* synthetic */ long $backgroundColor;
        public final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> $content;
        public final /* synthetic */ long $contentColor;
        public final /* synthetic */ float $sheetPeekHeight;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $topBar;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
        /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$child$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00261 extends Lambda implements Function2<Composer, Integer, Unit> {
            public final /* synthetic */ int $$dirty;
            public final /* synthetic */ int $$dirty2;
            public final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> $content;
            public final /* synthetic */ float $sheetPeekHeight;
            public final /* synthetic */ Function2<Composer, Integer, Unit> $topBar;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C00261(Function2<? super Composer, ? super Integer, Unit> function2, int i2, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, float f2, int i3) {
                super(2);
                this.$topBar = function2;
                this.$$dirty = i2;
                this.$content = function3;
                this.$sheetPeekHeight = f2;
                this.$$dirty2 = i3;
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
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
                Function2<Composer, Integer, Unit> function2 = this.$topBar;
                int i3 = this.$$dirty;
                Function3<PaddingValues, Composer, Integer, Unit> function3 = this.$content;
                float f2 = this.$sheetPeekHeight;
                int i4 = this.$$dirty2;
                composer.startReplaceableGroup(-1113030915);
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
                composer.startReplaceableGroup(1376089394);
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(fillMaxSize$default);
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
                Updater.m1072setimpl(m1065constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m1072setimpl(m1065constructorimpl, density, companion.getSetDensity());
                Updater.m1072setimpl(m1065constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                Updater.m1072setimpl(m1065constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                composer.enableReusing();
                materializerOf.invoke(SkippableUpdater.m1056boximpl(SkippableUpdater.m1057constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                composer.startReplaceableGroup(276693625);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                composer.startReplaceableGroup(-1579943837);
                composer.startReplaceableGroup(-1579943829);
                if (function2 != null) {
                    function2.invoke(composer, Integer.valueOf((i3 >> 9) & 14));
                }
                composer.endReplaceableGroup();
                function3.invoke(PaddingKt.m361PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, f2, 7, null), composer, Integer.valueOf((i4 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
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
        public AnonymousClass1(long j2, long j3, int i2, Function2<? super Composer, ? super Integer, Unit> function2, int i3, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, float f2) {
            super(2);
            this.$backgroundColor = j2;
            this.$contentColor = j3;
            this.$$dirty2 = i2;
            this.$topBar = function2;
            this.$$dirty = i3;
            this.$content = function3;
            this.$sheetPeekHeight = f2;
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
            long j2 = this.$backgroundColor;
            long j3 = this.$contentColor;
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -819900219, true, new C00261(this.$topBar, this.$$dirty, this.$content, this.$sheetPeekHeight, this.$$dirty2));
            int i3 = this.$$dirty2;
            SurfaceKt.m969SurfaceFjzlyU((Modifier) null, (Shape) null, j2, j3, (BorderStroke) null, 0.0f, composableLambda, composer, 1572864 | ((i3 << 6) & 896) | ((i3 << 6) & 7168), 51);
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$child$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$dirty;
        public final /* synthetic */ int $$dirty1;
        public final /* synthetic */ MutableState<Float> $bottomSheetHeight$delegate;
        public final /* synthetic */ long $sheetBackgroundColor;
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $sheetContent;
        public final /* synthetic */ long $sheetContentColor;
        public final /* synthetic */ float $sheetElevation;
        public final /* synthetic */ float $sheetPeekHeight;
        public final /* synthetic */ Shape $sheetShape;
        public final /* synthetic */ Modifier $swipeable;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
        /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$child$1$2$2  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00272 extends Lambda implements Function2<Composer, Integer, Unit> {
            public final /* synthetic */ int $$dirty;
            public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $sheetContent;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C00272(Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i2) {
                super(2);
                this.$sheetContent = function3;
                this.$$dirty = i2;
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
                Function3<ColumnScope, Composer, Integer, Unit> function3 = this.$sheetContent;
                int i3 = (this.$$dirty << 9) & 7168;
                composer.startReplaceableGroup(-1113030915);
                Modifier.Companion companion = Modifier.Companion;
                int i4 = i3 >> 3;
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, (i4 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i4 & 14));
                int i5 = (i3 << 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
                composer.startReplaceableGroup(1376089394);
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion);
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
                Updater.m1072setimpl(m1065constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m1072setimpl(m1065constructorimpl, density, companion2.getSetDensity());
                Updater.m1072setimpl(m1065constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                Updater.m1072setimpl(m1065constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                composer.enableReusing();
                materializerOf.invoke(SkippableUpdater.m1056boximpl(SkippableUpdater.m1057constructorimpl(composer)), composer, Integer.valueOf((i6 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                composer.startReplaceableGroup(2058660585);
                composer.startReplaceableGroup(276693625);
                if (((((i6 >> 9) & 14) & 11) ^ 2) == 0 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                } else {
                    function3.invoke(ColumnScopeInstance.INSTANCE, composer, Integer.valueOf(((i3 >> 6) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                }
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Modifier modifier, float f2, MutableState<Float> mutableState, Shape shape, long j2, long j3, float f3, int i2, int i3, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3) {
            super(2);
            this.$swipeable = modifier;
            this.$sheetPeekHeight = f2;
            this.$bottomSheetHeight$delegate = mutableState;
            this.$sheetShape = shape;
            this.$sheetBackgroundColor = j2;
            this.$sheetContentColor = j3;
            this.$sheetElevation = f3;
            this.$$dirty = i2;
            this.$$dirty1 = i3;
            this.$sheetContent = function3;
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
            Modifier m397requiredHeightInVpY3zN4$default = SizeKt.m397requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(this.$swipeable, 0.0f, 1, null), this.$sheetPeekHeight, 0.0f, 2, null);
            MutableState<Float> mutableState = this.$bottomSheetHeight$delegate;
            composer.startReplaceableGroup(-3686930);
            boolean changed = composer.changed(mutableState);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new BottomSheetScaffoldKt$BottomSheetScaffold$1$child$1$2$1$1(mutableState);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(m397requiredHeightInVpY3zN4$default, (Function1) rememberedValue);
            Shape shape = this.$sheetShape;
            long j2 = this.$sheetBackgroundColor;
            long j3 = this.$sheetContentColor;
            float f2 = this.$sheetElevation;
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -819896533, true, new C00272(this.$sheetContent, this.$$dirty));
            int i3 = this.$$dirty;
            int i4 = this.$$dirty1;
            SurfaceKt.m969SurfaceFjzlyU(onGloballyPositioned, shape, j2, j3, (BorderStroke) null, f2, composableLambda, composer, ((i4 << 6) & 7168) | 1572864 | ((i3 >> 21) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i4 << 6) & 896) | (458752 & (i3 >> 12)), 16);
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$child$1$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$dirty;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $floatingActionButton;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Function2<? super Composer, ? super Integer, Unit> function2, int i2) {
            super(2);
            this.$floatingActionButton = function2;
            this.$$dirty = i2;
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
            Function2<Composer, Integer, Unit> function2 = this.$floatingActionButton;
            int i3 = this.$$dirty;
            composer.startReplaceableGroup(-1990474327);
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(1376089394);
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion);
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
            Updater.m1072setimpl(m1065constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1072setimpl(m1065constructorimpl, density, companion2.getSetDensity());
            Updater.m1072setimpl(m1065constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m1072setimpl(m1065constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            composer.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1056boximpl(SkippableUpdater.m1057constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            composer.startReplaceableGroup(-1253629305);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer.startReplaceableGroup(2068277740);
            if (function2 != null) {
                function2.invoke(composer, Integer.valueOf((i3 >> 15) & 14));
            }
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$child$1$4  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$dirty;
        public final /* synthetic */ BottomSheetScaffoldState $scaffoldState;
        public final /* synthetic */ Function3<SnackbarHostState, Composer, Integer, Unit> $snackbarHost;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3, BottomSheetScaffoldState bottomSheetScaffoldState, int i2) {
            super(2);
            this.$snackbarHost = function3;
            this.$scaffoldState = bottomSheetScaffoldState;
            this.$$dirty = i2;
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
            Function3<SnackbarHostState, Composer, Integer, Unit> function3 = this.$snackbarHost;
            BottomSheetScaffoldState bottomSheetScaffoldState = this.$scaffoldState;
            int i3 = this.$$dirty;
            composer.startReplaceableGroup(-1990474327);
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(1376089394);
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion);
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
            Updater.m1072setimpl(m1065constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1072setimpl(m1065constructorimpl, density, companion2.getSetDensity());
            Updater.m1072setimpl(m1065constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m1072setimpl(m1065constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            composer.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1056boximpl(SkippableUpdater.m1057constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            composer.startReplaceableGroup(-1253629305);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer.startReplaceableGroup(2068277895);
            function3.invoke(bottomSheetScaffoldState.getSnackbarHostState(), composer, Integer.valueOf((i3 >> 9) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
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
    public BottomSheetScaffoldKt$BottomSheetScaffold$1$child$1(BottomSheetScaffoldState bottomSheetScaffoldState, int i2, int i3, long j2, long j3, int i4, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, float f2, Modifier modifier, MutableState<Float> mutableState, Shape shape, long j4, long j5, float f3, int i5, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function33) {
        super(2);
        this.$scaffoldState = bottomSheetScaffoldState;
        this.$floatingActionButtonPosition = i2;
        this.$$dirty = i3;
        this.$backgroundColor = j2;
        this.$contentColor = j3;
        this.$$dirty2 = i4;
        this.$topBar = function2;
        this.$content = function3;
        this.$sheetPeekHeight = f2;
        this.$swipeable = modifier;
        this.$bottomSheetHeight$delegate = mutableState;
        this.$sheetShape = shape;
        this.$sheetBackgroundColor = j4;
        this.$sheetContentColor = j5;
        this.$sheetElevation = f3;
        this.$$dirty1 = i5;
        this.$sheetContent = function32;
        this.$floatingActionButton = function22;
        this.$snackbarHost = function33;
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
        } else {
            BottomSheetScaffoldKt.m724access$BottomSheetScaffoldStackSlNgfk0(ComposableLambdaKt.composableLambda(composer, -819899585, true, new AnonymousClass1(this.$backgroundColor, this.$contentColor, this.$$dirty2, this.$topBar, this.$$dirty, this.$content, this.$sheetPeekHeight)), ComposableLambdaKt.composableLambda(composer, -819899921, true, new AnonymousClass2(this.$swipeable, this.$sheetPeekHeight, this.$bottomSheetHeight$delegate, this.$sheetShape, this.$sheetBackgroundColor, this.$sheetContentColor, this.$sheetElevation, this.$$dirty, this.$$dirty1, this.$sheetContent)), ComposableLambdaKt.composableLambda(composer, -819897194, true, new AnonymousClass3(this.$floatingActionButton, this.$$dirty)), ComposableLambdaKt.composableLambda(composer, -819897283, true, new AnonymousClass4(this.$snackbarHost, this.$scaffoldState, this.$$dirty)), this.$scaffoldState.getBottomSheetState().getOffset(), this.$floatingActionButtonPosition, composer, ((this.$$dirty >> 3) & 458752) | 3510);
        }
    }
}
