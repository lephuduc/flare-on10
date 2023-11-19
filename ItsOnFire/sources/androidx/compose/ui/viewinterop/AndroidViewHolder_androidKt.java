package androidx.compose.ui.viewinterop;

import android.view.View;
import androidx.appcompat.R;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;
import kotlin.math.MathKt__MathJVMKt;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Unmeasured", "", "layoutAccordingTo", "", "Landroid/view/View;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class AndroidViewHolder_androidKt {
    private static final int Unmeasured = Integer.MIN_VALUE;

    public static final /* synthetic */ void access$layoutAccordingTo(View view, LayoutNode layoutNode) {
        layoutAccordingTo(view, layoutNode);
    }

    public static final void layoutAccordingTo(View view, LayoutNode layoutNode) {
        int roundToInt;
        int roundToInt2;
        long positionInRoot = LayoutCoordinatesKt.positionInRoot(layoutNode.getCoordinates());
        roundToInt = MathKt__MathJVMKt.roundToInt(Offset.m1161getXimpl(positionInRoot));
        roundToInt2 = MathKt__MathJVMKt.roundToInt(Offset.m1162getYimpl(positionInRoot));
        view.layout(roundToInt, roundToInt2, view.getMeasuredWidth() + roundToInt, view.getMeasuredHeight() + roundToInt2);
    }
}
