package androidx.compose.material;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class OutlinedTextFieldKt$outlineCutout$1 extends Lambda implements Function1<ContentDrawScope, Unit> {
    public final /* synthetic */ long $labelSize;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutlinedTextFieldKt$outlineCutout$1(long j2) {
        super(1);
        this.$labelSize = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
        invoke2(contentDrawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull ContentDrawScope drawWithContent) {
        float f2;
        float f3;
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        float m1230getWidthimpl = Size.m1230getWidthimpl(this.$labelSize);
        if (m1230getWidthimpl <= 0.0f) {
            drawWithContent.drawContent();
            return;
        }
        f2 = OutlinedTextFieldKt.OutlinedTextFieldInnerPadding;
        float mo277toPx0680j_4 = drawWithContent.mo277toPx0680j_4(f2);
        float mo277toPx0680j_42 = drawWithContent.mo277toPx0680j_4(TextFieldImplKt.getTextFieldPadding()) - mo277toPx0680j_4;
        float f4 = 2;
        float f5 = m1230getWidthimpl + mo277toPx0680j_42 + (mo277toPx0680j_4 * f4);
        LayoutDirection layoutDirection = drawWithContent.getLayoutDirection();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i2 = iArr[layoutDirection.ordinal()];
        if (i2 == 1) {
            f3 = mo277toPx0680j_42;
        } else if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        } else {
            f3 = Size.m1230getWidthimpl(drawWithContent.mo1780getSizeNHjbRc()) - f5;
        }
        int i3 = iArr[drawWithContent.getLayoutDirection().ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f5 = Size.m1230getWidthimpl(drawWithContent.mo1780getSizeNHjbRc()) - mo277toPx0680j_42;
        }
        float m1227getHeightimpl = Size.m1227getHeightimpl(this.$labelSize);
        float f6 = (-m1227getHeightimpl) / f4;
        float f7 = m1227getHeightimpl / f4;
        int m1380getDifferencertfAjoo = ClipOp.Companion.m1380getDifferencertfAjoo();
        DrawContext drawContext = drawWithContent.getDrawContext();
        long mo1786getSizeNHjbRc = drawContext.mo1786getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo1789clipRectN_I0leg(f3, f6, f5, f7, m1380getDifferencertfAjoo);
        drawWithContent.drawContent();
        drawContext.getCanvas().restore();
        drawContext.mo1787setSizeuvyYCjk(mo1786getSizeNHjbRc);
    }
}
