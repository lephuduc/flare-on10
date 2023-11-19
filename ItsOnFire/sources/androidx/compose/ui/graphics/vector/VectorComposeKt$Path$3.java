package androidx.compose.ui.graphics.vector;

import androidx.appcompat.R;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Brush;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class VectorComposeKt$Path$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ Brush $fill;
    public final /* synthetic */ float $fillAlpha;
    public final /* synthetic */ String $name;
    public final /* synthetic */ List<PathNode> $pathData;
    public final /* synthetic */ int $pathFillType;
    public final /* synthetic */ Brush $stroke;
    public final /* synthetic */ float $strokeAlpha;
    public final /* synthetic */ int $strokeLineCap;
    public final /* synthetic */ int $strokeLineJoin;
    public final /* synthetic */ float $strokeLineMiter;
    public final /* synthetic */ float $strokeLineWidth;
    public final /* synthetic */ float $trimPathEnd;
    public final /* synthetic */ float $trimPathOffset;
    public final /* synthetic */ float $trimPathStart;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VectorComposeKt$Path$3(List<? extends PathNode> list, int i2, String str, Brush brush, float f2, Brush brush2, float f3, float f4, int i3, int i4, float f5, float f6, float f7, float f8, int i5, int i6, int i7) {
        super(2);
        this.$pathData = list;
        this.$pathFillType = i2;
        this.$name = str;
        this.$fill = brush;
        this.$fillAlpha = f2;
        this.$stroke = brush2;
        this.$strokeAlpha = f3;
        this.$strokeLineWidth = f4;
        this.$strokeLineCap = i3;
        this.$strokeLineJoin = i4;
        this.$strokeLineMiter = f5;
        this.$trimPathStart = f6;
        this.$trimPathEnd = f7;
        this.$trimPathOffset = f8;
        this.$$changed = i5;
        this.$$changed1 = i6;
        this.$$default = i7;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        VectorComposeKt.m1911Path9cdaXJ4(this.$pathData, this.$pathFillType, this.$name, this.$fill, this.$fillAlpha, this.$stroke, this.$strokeAlpha, this.$strokeLineWidth, this.$strokeLineCap, this.$strokeLineJoin, this.$strokeLineMiter, this.$trimPathStart, this.$trimPathEnd, this.$trimPathOffset, composer, this.$$changed | 1, this.$$changed1, this.$$default);
    }
}
