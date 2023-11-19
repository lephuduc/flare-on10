package androidx.compose.ui.graphics.vector;

import androidx.appcompat.R;
import androidx.compose.runtime.Composer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class VectorComposeKt$Group$4 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ List<PathNode> $clipPathData;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $content;
    public final /* synthetic */ String $name;
    public final /* synthetic */ float $pivotX;
    public final /* synthetic */ float $pivotY;
    public final /* synthetic */ float $rotation;
    public final /* synthetic */ float $scaleX;
    public final /* synthetic */ float $scaleY;
    public final /* synthetic */ float $translationX;
    public final /* synthetic */ float $translationY;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VectorComposeKt$Group$4(String str, float f2, float f3, float f4, float f5, float f6, float f7, float f8, List<? extends PathNode> list, Function2<? super Composer, ? super Integer, Unit> function2, int i2, int i3) {
        super(2);
        this.$name = str;
        this.$rotation = f2;
        this.$pivotX = f3;
        this.$pivotY = f4;
        this.$scaleX = f5;
        this.$scaleY = f6;
        this.$translationX = f7;
        this.$translationY = f8;
        this.$clipPathData = list;
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
        VectorComposeKt.Group(this.$name, this.$rotation, this.$pivotX, this.$pivotY, this.$scaleX, this.$scaleY, this.$translationX, this.$translationY, this.$clipPathData, this.$content, composer, this.$$changed | 1, this.$$default);
    }
}
