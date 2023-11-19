package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class NavigationRailKt$NavigationRailTransition$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ State<Float> $animationProgress$delegate;
    public final /* synthetic */ Function3<Float, Composer, Integer, Unit> $content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavigationRailKt$NavigationRailTransition$1(Function3<? super Float, ? super Composer, ? super Integer, Unit> function3, int i2, State<Float> state) {
        super(2);
        this.$content = function3;
        this.$$dirty = i2;
        this.$animationProgress$delegate = state;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    @Composable
    public final void invoke(@Nullable Composer composer, int i2) {
        float m891NavigationRailTransition_Klgx_Pg$lambda3;
        if (((i2 & 11) ^ 2) == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        Function3<Float, Composer, Integer, Unit> function3 = this.$content;
        m891NavigationRailTransition_Klgx_Pg$lambda3 = NavigationRailKt.m891NavigationRailTransition_Klgx_Pg$lambda3(this.$animationProgress$delegate);
        function3.invoke(Float.valueOf(m891NavigationRailTransition_Klgx_Pg$lambda3), composer, Integer.valueOf((this.$$dirty >> 6) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
    }
}
