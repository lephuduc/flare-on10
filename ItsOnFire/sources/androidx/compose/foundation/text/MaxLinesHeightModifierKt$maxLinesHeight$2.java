package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class MaxLinesHeightModifierKt$maxLinesHeight$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ TextStyle $textStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaxLinesHeightModifierKt$maxLinesHeight$2(int i2, TextStyle textStyle) {
        super(3);
        this.$maxLines = i2;
        this.$textStyle = textStyle;
    }

    @Composable
    @NotNull
    public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i2) {
        Modifier m394heightInVpY3zN4$default;
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(-1924217056);
        int i3 = this.$maxLines;
        int i4 = 0;
        if (i3 > 0) {
            if (i3 == Integer.MAX_VALUE) {
                m394heightInVpY3zN4$default = Modifier.Companion;
            } else {
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                Font.ResourceLoader resourceLoader = (Font.ResourceLoader) composer.consume(CompositionLocalsKt.getLocalFontLoader());
                LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                TextStyle textStyle = this.$textStyle;
                Object[] objArr = {density, resourceLoader, textStyle, layoutDirection};
                composer.startReplaceableGroup(-3685570);
                int i5 = 0;
                boolean z = false;
                while (i5 < 4) {
                    Object obj = objArr[i5];
                    i5++;
                    z |= composer.changed(obj);
                }
                Object rememberedValue = composer.rememberedValue();
                if (z || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = Integer.valueOf(IntSize.m3484getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText(TextStyleKt.resolveDefaults(textStyle, layoutDirection), density, resourceLoader, TextFieldDelegateKt.getEmptyTextReplacement(), 1)));
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                int intValue = ((Number) rememberedValue).intValue();
                TextStyle textStyle2 = this.$textStyle;
                Object[] objArr2 = {density, resourceLoader, textStyle2, layoutDirection};
                composer.startReplaceableGroup(-3685570);
                boolean z2 = false;
                while (i4 < 4) {
                    Object obj2 = objArr2[i4];
                    i4++;
                    z2 |= composer.changed(obj2);
                }
                Object rememberedValue2 = composer.rememberedValue();
                if (z2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = Integer.valueOf(IntSize.m3484getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText(TextStyleKt.resolveDefaults(textStyle2, layoutDirection), density, resourceLoader, TextFieldDelegateKt.getEmptyTextReplacement() + '\n' + TextFieldDelegateKt.getEmptyTextReplacement(), 2)));
                    composer.updateRememberedValue(rememberedValue2);
                }
                composer.endReplaceableGroup();
                m394heightInVpY3zN4$default = SizeKt.m394heightInVpY3zN4$default(Modifier.Companion, 0.0f, density.mo274toDpu2uoSUM(intValue + ((((Number) rememberedValue2).intValue() - intValue) * (this.$maxLines - 1))), 1, null);
            }
            composer.endReplaceableGroup();
            return m394heightInVpY3zN4$default;
        }
        throw new IllegalArgumentException("maxLines must be greater than 0".toString());
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }
}
