package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class CardKt$Card$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ BorderStroke $border;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $content;
    public final /* synthetic */ long $contentColor;
    public final /* synthetic */ float $elevation;
    public final /* synthetic */ Modifier $modifier;
    public final /* synthetic */ Shape $shape;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CardKt$Card$1(Modifier modifier, Shape shape, long j2, long j3, BorderStroke borderStroke, float f2, Function2<? super Composer, ? super Integer, Unit> function2, int i2, int i3) {
        super(2);
        this.$modifier = modifier;
        this.$shape = shape;
        this.$backgroundColor = j2;
        this.$contentColor = j3;
        this.$border = borderStroke;
        this.$elevation = f2;
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
        CardKt.m742CardFjzlyU(this.$modifier, this.$shape, this.$backgroundColor, this.$contentColor, this.$border, this.$elevation, this.$content, composer, this.$$changed | 1, this.$$default);
    }
}
