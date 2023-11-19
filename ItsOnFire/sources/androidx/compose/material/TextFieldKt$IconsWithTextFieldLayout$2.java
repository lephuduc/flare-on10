package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TextFieldKt$IconsWithTextFieldLayout$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ float $animationProgress;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $leading;
    public final /* synthetic */ long $leadingColor;
    public final /* synthetic */ Function3<Modifier, Composer, Integer, Unit> $placeholder;
    public final /* synthetic */ boolean $singleLine;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $textField;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $trailing;
    public final /* synthetic */ long $trailingColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldKt$IconsWithTextFieldLayout$2(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean z, long j2, long j3, float f2, int i2) {
        super(2);
        this.$textField = function2;
        this.$label = function22;
        this.$placeholder = function3;
        this.$leading = function23;
        this.$trailing = function24;
        this.$singleLine = z;
        this.$leadingColor = j2;
        this.$trailingColor = j3;
        this.$animationProgress = f2;
        this.$$changed = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        TextFieldKt.m1009IconsWithTextFieldLayoutSxpAMN0(this.$textField, this.$label, this.$placeholder, this.$leading, this.$trailing, this.$singleLine, this.$leadingColor, this.$trailingColor, this.$animationProgress, composer, this.$$changed | 1);
    }
}
