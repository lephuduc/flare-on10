package androidx.compose.material;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class BottomNavigationKt$BottomNavigationItemBaselineLayout$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $icon;
    public final /* synthetic */ float $iconPositionAnimationProgress;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomNavigationKt$BottomNavigationItemBaselineLayout$3(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, float f2, int i2) {
        super(2);
        this.$icon = function2;
        this.$label = function22;
        this.$iconPositionAnimationProgress = f2;
        this.$$changed = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        BottomNavigationKt.BottomNavigationItemBaselineLayout(this.$icon, this.$label, this.$iconPositionAnimationProgress, composer, this.$$changed | 1);
    }
}
