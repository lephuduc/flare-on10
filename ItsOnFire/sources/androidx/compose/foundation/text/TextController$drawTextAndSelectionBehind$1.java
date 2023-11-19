package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.text.TextLayoutResult;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TextController$drawTextAndSelectionBehind$1 extends Lambda implements Function1<DrawScope, Unit> {
    public final /* synthetic */ TextController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextController$drawTextAndSelectionBehind$1(TextController textController) {
        super(1);
        this.this$0 = textController;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull DrawScope drawBehind) {
        SelectionRegistrar selectionRegistrar;
        Map<Long, Selection> subselections;
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        TextLayoutResult layoutResult = this.this$0.getState().getLayoutResult();
        if (layoutResult == null) {
            return;
        }
        TextController textController = this.this$0;
        selectionRegistrar = textController.selectionRegistrar;
        Selection selection = null;
        if (selectionRegistrar != null && (subselections = selectionRegistrar.getSubselections()) != null) {
            selection = subselections.get(Long.valueOf(textController.getState().getSelectableId()));
        }
        if (selection != null) {
            int offset = (!selection.getHandlesCrossed() ? selection.getStart() : selection.getEnd()).getOffset();
            int offset2 = (!selection.getHandlesCrossed() ? selection.getEnd() : selection.getStart()).getOffset();
            if (offset != offset2) {
                DrawScope.DefaultImpls.m1825drawPathLG529CI$default(drawBehind, layoutResult.getMultiParagraph().getPathForRange(offset, offset2), textController.getState().m623getSelectionBackgroundColor0d7_KjU(), 0.0f, null, null, 0, 60, null);
            }
        }
        TextDelegate.Companion.paint(drawBehind.getDrawContext().getCanvas(), layoutResult);
    }
}
