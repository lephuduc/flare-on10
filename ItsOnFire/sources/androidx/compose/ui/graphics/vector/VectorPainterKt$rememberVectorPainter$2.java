package androidx.compose.ui.graphics.vector;

import androidx.appcompat.R;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class VectorPainterKt$rememberVectorPainter$2 extends Lambda implements Function4<Float, Float, Composer, Integer, Unit> {
    public final /* synthetic */ ImageVector $image;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorPainterKt$rememberVectorPainter$2(ImageVector imageVector) {
        super(4);
        this.$image = imageVector;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(Float f2, Float f3, Composer composer, Integer num) {
        invoke(f2.floatValue(), f3.floatValue(), composer, num.intValue());
        return Unit.INSTANCE;
    }

    @Composable
    public final void invoke(float f2, float f3, @Nullable Composer composer, int i2) {
        if (((i2 & 11) ^ 2) == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            VectorPainterKt.RenderVectorGroup(this.$image.getRoot(), null, composer, 0, 2);
        }
    }
}
