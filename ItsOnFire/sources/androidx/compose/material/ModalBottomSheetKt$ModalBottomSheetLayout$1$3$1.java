package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1 extends Lambda implements Function1<LayoutCoordinates, Unit> {
    public final /* synthetic */ MutableState<Float> $sheetHeightState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1(MutableState<Float> mutableState) {
        super(1);
        this.$sheetHeightState = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
        invoke2(layoutCoordinates);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$sheetHeightState.setValue(Float.valueOf(IntSize.m3484getHeightimpl(it.mo2772getSizeYbymL2g())));
    }
}
