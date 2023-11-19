package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class BackdropScaffoldKt$BackdropScaffold$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $appBar;
    public final /* synthetic */ long $backLayerBackgroundColor;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $backLayerContent;
    public final /* synthetic */ long $backLayerContentColor;
    public final /* synthetic */ long $frontLayerBackgroundColor;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $frontLayerContent;
    public final /* synthetic */ long $frontLayerContentColor;
    public final /* synthetic */ float $frontLayerElevation;
    public final /* synthetic */ long $frontLayerScrimColor;
    public final /* synthetic */ Shape $frontLayerShape;
    public final /* synthetic */ boolean $gesturesEnabled;
    public final /* synthetic */ float $headerHeight;
    public final /* synthetic */ Modifier $modifier;
    public final /* synthetic */ float $peekHeight;
    public final /* synthetic */ boolean $persistentAppBar;
    public final /* synthetic */ BackdropScaffoldState $scaffoldState;
    public final /* synthetic */ Function3<SnackbarHostState, Composer, Integer, Unit> $snackbarHost;
    public final /* synthetic */ boolean $stickyFrontLayer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BackdropScaffoldKt$BackdropScaffold$2(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Modifier modifier, BackdropScaffoldState backdropScaffoldState, boolean z, float f2, float f3, boolean z2, boolean z3, long j2, long j3, Shape shape, float f4, long j4, long j5, long j6, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3, int i2, int i3, int i4) {
        super(2);
        this.$appBar = function2;
        this.$backLayerContent = function22;
        this.$frontLayerContent = function23;
        this.$modifier = modifier;
        this.$scaffoldState = backdropScaffoldState;
        this.$gesturesEnabled = z;
        this.$peekHeight = f2;
        this.$headerHeight = f3;
        this.$persistentAppBar = z2;
        this.$stickyFrontLayer = z3;
        this.$backLayerBackgroundColor = j2;
        this.$backLayerContentColor = j3;
        this.$frontLayerShape = shape;
        this.$frontLayerElevation = f4;
        this.$frontLayerBackgroundColor = j4;
        this.$frontLayerContentColor = j5;
        this.$frontLayerScrimColor = j6;
        this.$snackbarHost = function3;
        this.$$changed = i2;
        this.$$changed1 = i3;
        this.$$default = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        BackdropScaffoldKt.m698BackdropScaffoldBZszfkY(this.$appBar, this.$backLayerContent, this.$frontLayerContent, this.$modifier, this.$scaffoldState, this.$gesturesEnabled, this.$peekHeight, this.$headerHeight, this.$persistentAppBar, this.$stickyFrontLayer, this.$backLayerBackgroundColor, this.$backLayerContentColor, this.$frontLayerShape, this.$frontLayerElevation, this.$frontLayerBackgroundColor, this.$frontLayerContentColor, this.$frontLayerScrimColor, this.$snackbarHost, composer, this.$$changed | 1, this.$$changed1, this.$$default);
    }
}
