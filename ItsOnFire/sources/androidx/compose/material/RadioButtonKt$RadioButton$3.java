package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class RadioButtonKt$RadioButton$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ RadioButtonColors $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ MutableInteractionSource $interactionSource;
    public final /* synthetic */ Modifier $modifier;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ boolean $selected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadioButtonKt$RadioButton$3(boolean z, Function0<Unit> function0, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, RadioButtonColors radioButtonColors, int i2, int i3) {
        super(2);
        this.$selected = z;
        this.$onClick = function0;
        this.$modifier = modifier;
        this.$enabled = z2;
        this.$interactionSource = mutableInteractionSource;
        this.$colors = radioButtonColors;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        RadioButtonKt.RadioButton(this.$selected, this.$onClick, this.$modifier, this.$enabled, this.$interactionSource, this.$colors, composer, this.$$changed | 1, this.$$default);
    }
}
