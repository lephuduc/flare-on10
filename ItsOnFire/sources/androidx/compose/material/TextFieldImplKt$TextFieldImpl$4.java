package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TextFieldImplKt$TextFieldImpl$4 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ TextFieldColors $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ MutableInteractionSource $interactionSource;
    public final /* synthetic */ boolean $isError;
    public final /* synthetic */ KeyboardActions $keyboardActions;
    public final /* synthetic */ KeyboardOptions $keyboardOptions;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $leading;
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ Modifier $modifier;
    public final /* synthetic */ Function1<TextFieldValue, Unit> $onValueChange;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
    public final /* synthetic */ boolean $readOnly;
    public final /* synthetic */ Shape $shape;
    public final /* synthetic */ boolean $singleLine;
    public final /* synthetic */ TextStyle $textStyle;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $trailing;
    public final /* synthetic */ TextFieldType $type;
    public final /* synthetic */ TextFieldValue $value;
    public final /* synthetic */ VisualTransformation $visualTransformation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldImplKt$TextFieldImpl$4(TextFieldType textFieldType, boolean z, boolean z2, TextFieldValue textFieldValue, Function1<? super TextFieldValue, Unit> function1, Modifier modifier, boolean z3, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean z4, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, int i3, int i4, int i5) {
        super(2);
        this.$type = textFieldType;
        this.$enabled = z;
        this.$readOnly = z2;
        this.$value = textFieldValue;
        this.$onValueChange = function1;
        this.$modifier = modifier;
        this.$singleLine = z3;
        this.$textStyle = textStyle;
        this.$label = function2;
        this.$placeholder = function22;
        this.$leading = function23;
        this.$trailing = function24;
        this.$isError = z4;
        this.$visualTransformation = visualTransformation;
        this.$keyboardOptions = keyboardOptions;
        this.$keyboardActions = keyboardActions;
        this.$maxLines = i2;
        this.$interactionSource = mutableInteractionSource;
        this.$shape = shape;
        this.$colors = textFieldColors;
        this.$$changed = i3;
        this.$$changed1 = i4;
        this.$$default = i5;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        TextFieldImplKt.TextFieldImpl(this.$type, this.$enabled, this.$readOnly, this.$value, this.$onValueChange, this.$modifier, this.$singleLine, this.$textStyle, this.$label, this.$placeholder, this.$leading, this.$trailing, this.$isError, this.$visualTransformation, this.$keyboardOptions, this.$keyboardActions, this.$maxLines, this.$interactionSource, this.$shape, this.$colors, composer, this.$$changed | 1, this.$$changed1, this.$$default);
    }
}
