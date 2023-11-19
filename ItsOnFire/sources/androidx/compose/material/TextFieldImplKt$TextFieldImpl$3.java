package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TextFieldImplKt$TextFieldImpl$3 extends Lambda implements Function7<Float, Color, Color, Dp, Float, Composer, Integer, Unit> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ int $$dirty1;
    public final /* synthetic */ TextFieldColors $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ MutableInteractionSource $interactionSource;
    public final /* synthetic */ boolean $isError;
    public final /* synthetic */ KeyboardActions $keyboardActions;
    public final /* synthetic */ KeyboardOptions $keyboardOptions;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $label;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $leading;
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ TextStyle $mergedTextStyle;
    public final /* synthetic */ Modifier $modifier;
    public final /* synthetic */ Function1<TextFieldValue, Unit> $onValueChange;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
    public final /* synthetic */ boolean $readOnly;
    public final /* synthetic */ Shape $shape;
    public final /* synthetic */ boolean $shouldOverrideTextStyleColor;
    public final /* synthetic */ boolean $singleLine;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $trailing;
    public final /* synthetic */ AnnotatedString $transformedText;
    public final /* synthetic */ TextFieldType $type;
    public final /* synthetic */ TextFieldValue $value;
    public final /* synthetic */ VisualTransformation $visualTransformation;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextFieldType.values().length];
            iArr[TextFieldType.Filled.ordinal()] = 1;
            iArr[TextFieldType.Outlined.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldImplKt$TextFieldImpl$3(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, AnnotatedString annotatedString, Modifier modifier, boolean z, int i2, TextFieldColors textFieldColors, boolean z2, MutableInteractionSource mutableInteractionSource, int i3, TextFieldType textFieldType, TextFieldValue textFieldValue, Function1<? super TextFieldValue, Unit> function1, boolean z3, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, TextStyle textStyle, boolean z4, int i4, VisualTransformation visualTransformation, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Shape shape, boolean z5) {
        super(7);
        this.$label = function2;
        this.$placeholder = function22;
        this.$transformedText = annotatedString;
        this.$modifier = modifier;
        this.$isError = z;
        this.$$dirty1 = i2;
        this.$colors = textFieldColors;
        this.$enabled = z2;
        this.$interactionSource = mutableInteractionSource;
        this.$$dirty = i3;
        this.$type = textFieldType;
        this.$value = textFieldValue;
        this.$onValueChange = function1;
        this.$readOnly = z3;
        this.$keyboardOptions = keyboardOptions;
        this.$keyboardActions = keyboardActions;
        this.$mergedTextStyle = textStyle;
        this.$singleLine = z4;
        this.$maxLines = i4;
        this.$visualTransformation = visualTransformation;
        this.$leading = function23;
        this.$trailing = function24;
        this.$shape = shape;
        this.$shouldOverrideTextStyleColor = z5;
    }

    @Override // kotlin.jvm.functions.Function7
    public /* bridge */ /* synthetic */ Unit invoke(Float f2, Color color, Color color2, Dp dp, Float f3, Composer composer, Integer num) {
        m1007invokeh1eTWw(f2.floatValue(), color.m1402unboximpl(), color2.m1402unboximpl(), dp.m3339unboximpl(), f3.floatValue(), composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0314  */
    @androidx.compose.runtime.Composable
    /* renamed from: invoke-h1eT-Ww  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1007invokeh1eTWw(float r49, long r50, long r52, float r54, float r55, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r56, int r57) {
        /*
            Method dump skipped, instructions count: 1056
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldImplKt$TextFieldImpl$3.m1007invokeh1eTWw(float, long, long, float, float, androidx.compose.runtime.Composer, int):void");
    }
}
