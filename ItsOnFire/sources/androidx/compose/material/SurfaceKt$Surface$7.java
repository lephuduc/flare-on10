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
public final class SurfaceKt$Surface$7 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ BorderStroke $border;
    public final /* synthetic */ Modifier $clickAndSemanticsModifier;
    public final /* synthetic */ long $color;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $content;
    public final /* synthetic */ long $contentColor;
    public final /* synthetic */ float $elevation;
    public final /* synthetic */ Modifier $modifier;
    public final /* synthetic */ Shape $shape;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SurfaceKt$Surface$7(Modifier modifier, Shape shape, long j2, long j3, BorderStroke borderStroke, float f2, Modifier modifier2, Function2<? super Composer, ? super Integer, Unit> function2, int i2) {
        super(2);
        this.$modifier = modifier;
        this.$shape = shape;
        this.$color = j2;
        this.$contentColor = j3;
        this.$border = borderStroke;
        this.$elevation = f2;
        this.$clickAndSemanticsModifier = modifier2;
        this.$content = function2;
        this.$$changed = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        SurfaceKt.m968SurfaceFjzlyU(this.$modifier, this.$shape, this.$color, this.$contentColor, this.$border, this.$elevation, this.$clickAndSemanticsModifier, this.$content, composer, this.$$changed | 1);
    }
}
