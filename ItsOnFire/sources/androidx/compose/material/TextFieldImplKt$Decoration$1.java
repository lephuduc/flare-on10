package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TextFieldImplKt$Decoration$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $content;
    public final /* synthetic */ Float $contentAlpha;
    public final /* synthetic */ long $contentColor;
    public final /* synthetic */ TextStyle $typography;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldImplKt$Decoration$1(long j2, TextStyle textStyle, Float f2, Function2<? super Composer, ? super Integer, Unit> function2, int i2, int i3) {
        super(2);
        this.$contentColor = j2;
        this.$typography = textStyle;
        this.$contentAlpha = f2;
        this.$content = function2;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        TextFieldImplKt.m1006DecorationeuL9pac(this.$contentColor, this.$typography, this.$contentAlpha, this.$content, composer, this.$$changed | 1, this.$$default);
    }
}
