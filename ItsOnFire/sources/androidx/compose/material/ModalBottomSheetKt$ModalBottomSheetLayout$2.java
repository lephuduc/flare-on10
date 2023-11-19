package androidx.compose.material;

import androidx.compose.foundation.layout.ColumnScope;
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
public final class ModalBottomSheetKt$ModalBottomSheetLayout$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $content;
    public final /* synthetic */ Modifier $modifier;
    public final /* synthetic */ long $scrimColor;
    public final /* synthetic */ long $sheetBackgroundColor;
    public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $sheetContent;
    public final /* synthetic */ long $sheetContentColor;
    public final /* synthetic */ float $sheetElevation;
    public final /* synthetic */ Shape $sheetShape;
    public final /* synthetic */ ModalBottomSheetState $sheetState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ModalBottomSheetKt$ModalBottomSheetLayout$2(Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, ModalBottomSheetState modalBottomSheetState, Shape shape, float f2, long j2, long j3, long j4, Function2<? super Composer, ? super Integer, Unit> function2, int i2, int i3) {
        super(2);
        this.$sheetContent = function3;
        this.$modifier = modifier;
        this.$sheetState = modalBottomSheetState;
        this.$sheetShape = shape;
        this.$sheetElevation = f2;
        this.$sheetBackgroundColor = j2;
        this.$sheetContentColor = j3;
        this.$scrimColor = j4;
        this.$content = function2;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        ModalBottomSheetKt.m880ModalBottomSheetLayoutBzaUkTc(this.$sheetContent, this.$modifier, this.$sheetState, this.$sheetShape, this.$sheetElevation, this.$sheetBackgroundColor, this.$sheetContentColor, this.$scrimColor, this.$content, composer, this.$$changed | 1, this.$$default);
    }
}
