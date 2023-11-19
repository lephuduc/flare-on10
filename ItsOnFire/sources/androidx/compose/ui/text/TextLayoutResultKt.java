package androidx.compose.ui.text;

import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"createTextLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "layoutInput", "Landroidx/compose/ui/text/TextLayoutInput;", "multiParagraph", "Landroidx/compose/ui/text/MultiParagraph;", "size", "Landroidx/compose/ui/unit/IntSize;", "createTextLayoutResult-H0pRuoY", "(Landroidx/compose/ui/text/TextLayoutInput;Landroidx/compose/ui/text/MultiParagraph;J)Landroidx/compose/ui/text/TextLayoutResult;", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TextLayoutResultKt {
    @Deprecated(message = "Unused public function which was added for testing. The function does not do anything usable for Compose text APIs. The function is now deprecated and will be removed soon")
    @NotNull
    /* renamed from: createTextLayoutResult-H0pRuoY  reason: not valid java name */
    public static final TextLayoutResult m3061createTextLayoutResultH0pRuoY(@NotNull TextLayoutInput layoutInput, @NotNull MultiParagraph multiParagraph, long j2) {
        Intrinsics.checkNotNullParameter(layoutInput, "layoutInput");
        Intrinsics.checkNotNullParameter(multiParagraph, "multiParagraph");
        return new TextLayoutResult(layoutInput, multiParagraph, j2, null);
    }

    /* renamed from: createTextLayoutResult-H0pRuoY$default  reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m3062createTextLayoutResultH0pRuoY$default(TextLayoutInput textLayoutInput, MultiParagraph multiParagraph, long j2, int i2, Object obj) {
        TextLayoutInput textLayoutInput2;
        List emptyList;
        if ((i2 & 1) != 0) {
            AnnotatedString annotatedString = new AnnotatedString("", null, null, 6, null);
            TextStyle textStyle = new TextStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262143, null);
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            textLayoutInput2 = new TextLayoutInput(annotatedString, textStyle, emptyList, 1, false, TextOverflow.Companion.m3278getClipgIe3tQ8(), DensityKt.Density$default(1.0f, 0.0f, 2, null), LayoutDirection.Ltr, new Font.ResourceLoader() { // from class: androidx.compose.ui.text.TextLayoutResultKt$createTextLayoutResult$1
                @Override // androidx.compose.ui.text.font.Font.ResourceLoader
                @NotNull
                public Object load(@NotNull Font font) {
                    Intrinsics.checkNotNullParameter(font, "font");
                    return Boolean.FALSE;
                }
            }, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), null);
        } else {
            textLayoutInput2 = textLayoutInput;
        }
        return m3061createTextLayoutResultH0pRuoY(textLayoutInput2, (i2 & 2) != 0 ? new MultiParagraph(textLayoutInput2.getText(), textLayoutInput2.getStyle(), null, 0, false, 0.0f, textLayoutInput2.getDensity(), textLayoutInput2.getResourceLoader(), 28, null) : multiParagraph, (i2 & 4) != 0 ? IntSize.Companion.m3490getZeroYbymL2g() : j2);
    }
}
