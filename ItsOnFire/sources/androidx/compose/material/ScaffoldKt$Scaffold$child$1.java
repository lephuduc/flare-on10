package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ScaffoldKt$Scaffold$child$1 extends Lambda implements Function3<Modifier, Composer, Integer, Unit> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ int $$dirty1;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $bottomBar;
    public final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> $content;
    public final /* synthetic */ long $contentColor;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $floatingActionButton;
    public final /* synthetic */ int $floatingActionButtonPosition;
    public final /* synthetic */ boolean $isFloatingActionButtonDocked;
    public final /* synthetic */ ScaffoldState $scaffoldState;
    public final /* synthetic */ Function3<SnackbarHostState, Composer, Integer, Unit> $snackbarHost;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $topBar;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.material.ScaffoldKt$Scaffold$child$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$dirty;
        public final /* synthetic */ int $$dirty1;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $bottomBar;
        public final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> $content;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $floatingActionButton;
        public final /* synthetic */ int $floatingActionButtonPosition;
        public final /* synthetic */ boolean $isFloatingActionButtonDocked;
        public final /* synthetic */ ScaffoldState $scaffoldState;
        public final /* synthetic */ Function3<SnackbarHostState, Composer, Integer, Unit> $snackbarHost;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $topBar;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
        /* renamed from: androidx.compose.material.ScaffoldKt$Scaffold$child$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00361 extends Lambda implements Function2<Composer, Integer, Unit> {
            public final /* synthetic */ int $$dirty;
            public final /* synthetic */ ScaffoldState $scaffoldState;
            public final /* synthetic */ Function3<SnackbarHostState, Composer, Integer, Unit> $snackbarHost;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C00361(Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3, ScaffoldState scaffoldState, int i2) {
                super(2);
                this.$snackbarHost = function3;
                this.$scaffoldState = scaffoldState;
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
                } else {
                    this.$snackbarHost.invoke(this.$scaffoldState.getSnackbarHostState(), composer, Integer.valueOf((this.$$dirty >> 9) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(boolean z, int i2, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, int i3, int i4, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function32, ScaffoldState scaffoldState) {
            super(2);
            this.$isFloatingActionButtonDocked = z;
            this.$floatingActionButtonPosition = i2;
            this.$topBar = function2;
            this.$content = function3;
            this.$floatingActionButton = function22;
            this.$bottomBar = function23;
            this.$$dirty = i3;
            this.$$dirty1 = i4;
            this.$snackbarHost = function32;
            this.$scaffoldState = scaffoldState;
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
            boolean z = this.$isFloatingActionButtonDocked;
            int i3 = this.$floatingActionButtonPosition;
            Function2<Composer, Integer, Unit> function2 = this.$topBar;
            Function3<PaddingValues, Composer, Integer, Unit> function3 = this.$content;
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -819902883, true, new C00361(this.$snackbarHost, this.$scaffoldState, this.$$dirty));
            Function2<Composer, Integer, Unit> function22 = this.$floatingActionButton;
            Function2<Composer, Integer, Unit> function23 = this.$bottomBar;
            int i4 = this.$$dirty;
            ScaffoldKt.m943ScaffoldLayoutMDYNRJg(z, i3, function2, function3, composableLambda, function22, function23, composer, ((this.$$dirty1 >> 12) & 7168) | ((i4 >> 21) & 14) | 24576 | ((i4 >> 15) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i4 & 896) | (458752 & i4) | ((i4 << 9) & 3670016));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScaffoldKt$Scaffold$child$1(long j2, long j3, int i2, boolean z, int i3, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, int i4, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function32, ScaffoldState scaffoldState) {
        super(3);
        this.$backgroundColor = j2;
        this.$contentColor = j3;
        this.$$dirty1 = i2;
        this.$isFloatingActionButtonDocked = z;
        this.$floatingActionButtonPosition = i3;
        this.$topBar = function2;
        this.$content = function3;
        this.$floatingActionButton = function22;
        this.$bottomBar = function23;
        this.$$dirty = i4;
        this.$snackbarHost = function32;
        this.$scaffoldState = scaffoldState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer, Integer num) {
        invoke(modifier, composer, num.intValue());
        return Unit.INSTANCE;
    }

    @Composable
    public final void invoke(@NotNull Modifier childModifier, @Nullable Composer composer, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(childModifier, "childModifier");
        if ((i2 & 14) == 0) {
            i3 = i2 | (composer.changed(childModifier) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if (((i3 & 91) ^ 18) == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        long j2 = this.$backgroundColor;
        long j3 = this.$contentColor;
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -819889840, true, new AnonymousClass1(this.$isFloatingActionButtonDocked, this.$floatingActionButtonPosition, this.$topBar, this.$content, this.$floatingActionButton, this.$bottomBar, this.$$dirty, this.$$dirty1, this.$snackbarHost, this.$scaffoldState));
        int i4 = this.$$dirty1;
        SurfaceKt.m969SurfaceFjzlyU(childModifier, (Shape) null, j2, j3, (BorderStroke) null, 0.0f, composableLambda, composer, 1572864 | (i3 & 14) | ((i4 >> 9) & 896) | ((i4 >> 9) & 7168), 50);
    }
}
