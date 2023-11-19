package androidx.compose.material;

import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TextKt$Text$4 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $color;
    public final /* synthetic */ FontFamily $fontFamily;
    public final /* synthetic */ long $fontSize;
    public final /* synthetic */ FontStyle $fontStyle;
    public final /* synthetic */ FontWeight $fontWeight;
    public final /* synthetic */ Map<String, InlineTextContent> $inlineContent;
    public final /* synthetic */ long $letterSpacing;
    public final /* synthetic */ long $lineHeight;
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ Modifier $modifier;
    public final /* synthetic */ Function1<TextLayoutResult, Unit> $onTextLayout;
    public final /* synthetic */ int $overflow;
    public final /* synthetic */ boolean $softWrap;
    public final /* synthetic */ TextStyle $style;
    public final /* synthetic */ AnnotatedString $text;
    public final /* synthetic */ TextAlign $textAlign;
    public final /* synthetic */ TextDecoration $textDecoration;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextKt$Text$4(AnnotatedString annotatedString, Modifier modifier, long j2, long j3, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j4, TextDecoration textDecoration, TextAlign textAlign, long j5, int i2, boolean z, int i3, Map<String, InlineTextContent> map, Function1<? super TextLayoutResult, Unit> function1, TextStyle textStyle, int i4, int i5, int i6) {
        super(2);
        this.$text = annotatedString;
        this.$modifier = modifier;
        this.$color = j2;
        this.$fontSize = j3;
        this.$fontStyle = fontStyle;
        this.$fontWeight = fontWeight;
        this.$fontFamily = fontFamily;
        this.$letterSpacing = j4;
        this.$textDecoration = textDecoration;
        this.$textAlign = textAlign;
        this.$lineHeight = j5;
        this.$overflow = i2;
        this.$softWrap = z;
        this.$maxLines = i3;
        this.$inlineContent = map;
        this.$onTextLayout = function1;
        this.$style = textStyle;
        this.$$changed = i4;
        this.$$changed1 = i5;
        this.$$default = i6;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        TextKt.m1026Text4IGK_g(this.$text, this.$modifier, this.$color, this.$fontSize, this.$fontStyle, this.$fontWeight, this.$fontFamily, this.$letterSpacing, this.$textDecoration, this.$textAlign, this.$lineHeight, this.$overflow, this.$softWrap, this.$maxLines, this.$inlineContent, this.$onTextLayout, this.$style, composer, this.$$changed | 1, this.$$changed1, this.$$default);
    }
}
