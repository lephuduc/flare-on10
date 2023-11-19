package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class BottomNavigationKt$BottomNavigationItem$2$1 extends Lambda implements Function3<Float, Composer, Integer, Unit> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ boolean $alwaysShowLabel;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $icon;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $styledLabel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomNavigationKt$BottomNavigationItem$2$1(boolean z, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, int i2) {
        super(3);
        this.$alwaysShowLabel = z;
        this.$icon = function2;
        this.$styledLabel = function22;
        this.$$dirty = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Float f2, Composer composer, Integer num) {
        invoke(f2.floatValue(), composer, num.intValue());
        return Unit.INSTANCE;
    }

    @Composable
    public final void invoke(float f2, @Nullable Composer composer, int i2) {
        if ((i2 & 14) == 0) {
            i2 |= composer.changed(f2) ? 4 : 2;
        }
        if (((i2 & 91) ^ 18) == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (this.$alwaysShowLabel) {
            f2 = 1.0f;
        }
        BottomNavigationKt.BottomNavigationItemBaselineLayout(this.$icon, this.$styledLabel, f2, composer, (this.$$dirty >> 9) & 14);
    }
}
