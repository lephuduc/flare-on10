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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TextFieldKt$TextFieldLayout$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$changed2;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ long $cursorColor;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $decoratedLabel;
    public final /* synthetic */ Function3<Modifier, Composer, Integer, Unit> $decoratedPlaceholder;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ long $indicatorColor;
    public final /* synthetic */ float $indicatorWidth;
    public final /* synthetic */ MutableInteractionSource $interactionSource;
    public final /* synthetic */ KeyboardActions $keyboardActions;
    public final /* synthetic */ KeyboardOptions $keyboardOptions;
    public final /* synthetic */ float $labelProgress;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $leading;
    public final /* synthetic */ long $leadingColor;
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ Modifier $modifier;
    public final /* synthetic */ Function1<TextFieldValue, Unit> $onValueChange;
    public final /* synthetic */ boolean $readOnly;
    public final /* synthetic */ Shape $shape;
    public final /* synthetic */ boolean $singleLine;
    public final /* synthetic */ TextStyle $textStyle;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $trailing;
    public final /* synthetic */ long $trailingColor;
    public final /* synthetic */ TextFieldValue $value;
    public final /* synthetic */ VisualTransformation $visualTransformation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldKt$TextFieldLayout$2(Modifier modifier, TextFieldValue textFieldValue, Function1<? super TextFieldValue, Unit> function1, boolean z, boolean z2, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, TextStyle textStyle, boolean z3, int i2, VisualTransformation visualTransformation, MutableInteractionSource mutableInteractionSource, Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, long j2, long j3, float f2, float f3, long j4, long j5, long j6, Shape shape, int i3, int i4, int i5, int i6) {
        super(2);
        this.$modifier = modifier;
        this.$value = textFieldValue;
        this.$onValueChange = function1;
        this.$enabled = z;
        this.$readOnly = z2;
        this.$keyboardOptions = keyboardOptions;
        this.$keyboardActions = keyboardActions;
        this.$textStyle = textStyle;
        this.$singleLine = z3;
        this.$maxLines = i2;
        this.$visualTransformation = visualTransformation;
        this.$interactionSource = mutableInteractionSource;
        this.$decoratedPlaceholder = function3;
        this.$decoratedLabel = function2;
        this.$leading = function22;
        this.$trailing = function23;
        this.$leadingColor = j2;
        this.$trailingColor = j3;
        this.$labelProgress = f2;
        this.$indicatorWidth = f3;
        this.$indicatorColor = j4;
        this.$backgroundColor = j5;
        this.$cursorColor = j6;
        this.$shape = shape;
        this.$$changed = i3;
        this.$$changed1 = i4;
        this.$$changed2 = i5;
        this.$$default = i6;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        TextFieldKt.m1012TextFieldLayoutuBqXD2s(this.$modifier, this.$value, this.$onValueChange, this.$enabled, this.$readOnly, this.$keyboardOptions, this.$keyboardActions, this.$textStyle, this.$singleLine, this.$maxLines, this.$visualTransformation, this.$interactionSource, this.$decoratedPlaceholder, this.$decoratedLabel, this.$leading, this.$trailing, this.$leadingColor, this.$trailingColor, this.$labelProgress, this.$indicatorWidth, this.$indicatorColor, this.$backgroundColor, this.$cursorColor, this.$shape, composer, this.$$changed | 1, this.$$changed1, this.$$changed2, this.$$default);
    }
}
