package androidx.compose.foundation;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class BorderKt$drawRoundRectBorder$1 extends Lambda implements Function1<ContentDrawScope, Unit> {
    public final /* synthetic */ long $borderSize;
    public final /* synthetic */ Stroke $borderStroke;
    public final /* synthetic */ Brush $brush;
    public final /* synthetic */ long $cornerRadius;
    public final /* synthetic */ boolean $fillArea;
    public final /* synthetic */ float $halfStroke;
    public final /* synthetic */ float $strokeWidth;
    public final /* synthetic */ long $topLeft;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorderKt$drawRoundRectBorder$1(boolean z, Brush brush, long j2, float f2, float f3, long j3, long j4, Stroke stroke) {
        super(1);
        this.$fillArea = z;
        this.$brush = brush;
        this.$cornerRadius = j2;
        this.$halfStroke = f2;
        this.$strokeWidth = f3;
        this.$topLeft = j3;
        this.$borderSize = j4;
        this.$borderStroke = stroke;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
        invoke2(contentDrawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull ContentDrawScope onDrawWithContent) {
        long j2;
        long j3;
        long m162shrinkKibmq7A;
        float f2;
        Stroke stroke;
        ColorFilter colorFilter;
        int i2;
        int i3;
        Object obj;
        ContentDrawScope contentDrawScope;
        Brush brush;
        Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
        onDrawWithContent.drawContent();
        if (this.$fillArea) {
            brush = this.$brush;
            j2 = 0;
            j3 = 0;
            m162shrinkKibmq7A = this.$cornerRadius;
            f2 = 0.0f;
            stroke = null;
            colorFilter = null;
            i2 = 0;
            i3 = 246;
            obj = null;
            contentDrawScope = onDrawWithContent;
        } else {
            float m1136getXimpl = CornerRadius.m1136getXimpl(this.$cornerRadius);
            float f3 = this.$halfStroke;
            if (m1136getXimpl < f3) {
                float f4 = this.$strokeWidth;
                float m1230getWidthimpl = Size.m1230getWidthimpl(onDrawWithContent.mo1780getSizeNHjbRc()) - this.$strokeWidth;
                float m1227getHeightimpl = Size.m1227getHeightimpl(onDrawWithContent.mo1780getSizeNHjbRc()) - this.$strokeWidth;
                int m1380getDifferencertfAjoo = ClipOp.Companion.m1380getDifferencertfAjoo();
                Brush brush2 = this.$brush;
                long j4 = this.$cornerRadius;
                DrawContext drawContext = onDrawWithContent.getDrawContext();
                long mo1786getSizeNHjbRc = drawContext.mo1786getSizeNHjbRc();
                drawContext.getCanvas().save();
                drawContext.getTransform().mo1789clipRectN_I0leg(f4, f4, m1230getWidthimpl, m1227getHeightimpl, m1380getDifferencertfAjoo);
                DrawScope.DefaultImpls.m1830drawRoundRectZuiqVtQ$default(onDrawWithContent, brush2, 0L, 0L, j4, 0.0f, null, null, 0, 246, null);
                drawContext.getCanvas().restore();
                drawContext.mo1787setSizeuvyYCjk(mo1786getSizeNHjbRc);
                return;
            }
            Brush brush3 = this.$brush;
            j2 = this.$topLeft;
            j3 = this.$borderSize;
            m162shrinkKibmq7A = BorderKt.m162shrinkKibmq7A(this.$cornerRadius, f3);
            f2 = 0.0f;
            stroke = this.$borderStroke;
            colorFilter = null;
            i2 = 0;
            i3 = 208;
            obj = null;
            contentDrawScope = onDrawWithContent;
            brush = brush3;
        }
        DrawScope.DefaultImpls.m1830drawRoundRectZuiqVtQ$default(contentDrawScope, brush, j2, j3, m162shrinkKibmq7A, f2, stroke, colorFilter, i2, i3, obj);
    }
}
