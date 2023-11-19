package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class DrawerKt$ModalDrawer$1$2$3$1 extends Lambda implements Function0<Float> {
    public final /* synthetic */ DrawerState $drawerState;
    public final /* synthetic */ float $maxValue;
    public final /* synthetic */ float $minValue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerKt$ModalDrawer$1$2$3$1(float f2, float f3, DrawerState drawerState) {
        super(0);
        this.$minValue = f2;
        this.$maxValue = f3;
        this.$drawerState = drawerState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Float invoke() {
        float calculateFraction;
        calculateFraction = DrawerKt.calculateFraction(this.$minValue, this.$maxValue, this.$drawerState.getOffset().getValue().floatValue());
        return Float.valueOf(calculateFraction);
    }
}
