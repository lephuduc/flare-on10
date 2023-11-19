package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt$BottomSheetScaffoldStack$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $body;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $bottomSheet;
    public final /* synthetic */ State<Float> $bottomSheetOffset;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $floatingActionButton;
    public final /* synthetic */ int $floatingActionButtonPosition;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $snackbarHost;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetScaffoldKt$BottomSheetScaffoldStack$3(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, State<Float> state, int i2, int i3) {
        super(2);
        this.$body = function2;
        this.$bottomSheet = function22;
        this.$floatingActionButton = function23;
        this.$snackbarHost = function24;
        this.$bottomSheetOffset = state;
        this.$floatingActionButtonPosition = i2;
        this.$$changed = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        BottomSheetScaffoldKt.m723BottomSheetScaffoldStackSlNgfk0(this.$body, this.$bottomSheet, this.$floatingActionButton, this.$snackbarHost, this.$bottomSheetOffset, this.$floatingActionButtonPosition, composer, this.$$changed | 1);
    }
}
