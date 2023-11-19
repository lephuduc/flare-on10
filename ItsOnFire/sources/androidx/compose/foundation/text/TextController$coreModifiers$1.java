package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/layout/LayoutCoordinates;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TextController$coreModifiers$1 extends Lambda implements Function1<LayoutCoordinates, Unit> {
    public final /* synthetic */ TextController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextController$coreModifiers$1(TextController textController) {
        super(1);
        this.this$0 = textController;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
        invoke2(layoutCoordinates);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0038, code lost:
        r5 = r4.this$0.selectionRegistrar;
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void invoke2(@org.jetbrains.annotations.NotNull androidx.compose.ui.layout.LayoutCoordinates r5) {
        /*
            r4 = this;
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            androidx.compose.foundation.text.TextController r0 = r4.this$0
            androidx.compose.foundation.text.TextState r0 = r0.getState()
            r0.setLayoutCoordinates(r5)
            androidx.compose.foundation.text.TextController r0 = r4.this$0
            androidx.compose.foundation.text.selection.SelectionRegistrar r0 = androidx.compose.foundation.text.TextController.access$getSelectionRegistrar$p(r0)
            androidx.compose.foundation.text.TextController r1 = r4.this$0
            androidx.compose.foundation.text.TextState r1 = r1.getState()
            long r1 = r1.getSelectableId()
            boolean r0 = androidx.compose.foundation.text.selection.SelectionRegistrarKt.hasSelection(r0, r1)
            if (r0 == 0) goto L57
            long r0 = androidx.compose.ui.layout.LayoutCoordinatesKt.positionInWindow(r5)
            androidx.compose.foundation.text.TextController r5 = r4.this$0
            androidx.compose.foundation.text.TextState r5 = r5.getState()
            long r2 = r5.m622getPreviousGlobalPositionF1C5BW0()
            boolean r5 = androidx.compose.ui.geometry.Offset.m1158equalsimpl0(r0, r2)
            if (r5 != 0) goto L4e
            androidx.compose.foundation.text.TextController r5 = r4.this$0
            androidx.compose.foundation.text.selection.SelectionRegistrar r5 = androidx.compose.foundation.text.TextController.access$getSelectionRegistrar$p(r5)
            if (r5 != 0) goto L41
            goto L4e
        L41:
            androidx.compose.foundation.text.TextController r2 = r4.this$0
            androidx.compose.foundation.text.TextState r2 = r2.getState()
            long r2 = r2.getSelectableId()
            r5.notifyPositionChange(r2)
        L4e:
            androidx.compose.foundation.text.TextController r4 = r4.this$0
            androidx.compose.foundation.text.TextState r4 = r4.getState()
            r4.m624setPreviousGlobalPositionk4lQ0M(r0)
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextController$coreModifiers$1.invoke2(androidx.compose.ui.layout.LayoutCoordinates):void");
    }
}
