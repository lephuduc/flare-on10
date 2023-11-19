package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/TextPainter;", "", "()V", "paint", "", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TextPainter {
    @NotNull
    public static final TextPainter INSTANCE = new TextPainter();

    private TextPainter() {
    }

    public final void paint(@NotNull Canvas canvas, @NotNull TextLayoutResult textLayoutResult) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        boolean z = textLayoutResult.getHasVisualOverflow() && TextOverflow.m3271equalsimpl0(textLayoutResult.getLayoutInput().m3055getOverflowgIe3tQ8(), TextOverflow.Companion.m3278getClipgIe3tQ8());
        if (z) {
            Rect m1201Recttz77jQw = RectKt.m1201Recttz77jQw(Offset.Companion.m1177getZeroF1C5BW0(), SizeKt.Size(IntSize.m3485getWidthimpl(textLayoutResult.m3059getSizeYbymL2g()), IntSize.m3484getHeightimpl(textLayoutResult.m3059getSizeYbymL2g())));
            canvas.save();
            Canvas.DefaultImpls.m1371clipRectmtrdDE$default(canvas, m1201Recttz77jQw, 0, 2, null);
        }
        try {
            textLayoutResult.getMultiParagraph().m3001paintRPmYEkk(canvas, textLayoutResult.getLayoutInput().getStyle().m3087getColor0d7_KjU(), textLayoutResult.getLayoutInput().getStyle().getShadow(), textLayoutResult.getLayoutInput().getStyle().getTextDecoration());
        } finally {
            if (z) {
                canvas.restore();
            }
        }
    }
}
