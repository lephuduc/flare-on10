package androidx.compose.ui.draw;

import androidx.appcompat.R;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class PainterModifierKt$paint$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {
    public final /* synthetic */ Alignment $alignment$inlined;
    public final /* synthetic */ float $alpha$inlined;
    public final /* synthetic */ ColorFilter $colorFilter$inlined;
    public final /* synthetic */ ContentScale $contentScale$inlined;
    public final /* synthetic */ Painter $painter$inlined;
    public final /* synthetic */ boolean $sizeToIntrinsics$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PainterModifierKt$paint$$inlined$debugInspectorInfo$1(Painter painter, boolean z, Alignment alignment, ContentScale contentScale, float f2, ColorFilter colorFilter) {
        super(1);
        this.$painter$inlined = painter;
        this.$sizeToIntrinsics$inlined = z;
        this.$alignment$inlined = alignment;
        this.$contentScale$inlined = contentScale;
        this.$alpha$inlined = f2;
        this.$colorFilter$inlined = colorFilter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
        inspectorInfo.setName("paint");
        inspectorInfo.getProperties().set("painter", this.$painter$inlined);
        inspectorInfo.getProperties().set("sizeToIntrinsics", Boolean.valueOf(this.$sizeToIntrinsics$inlined));
        inspectorInfo.getProperties().set("alignment", this.$alignment$inlined);
        inspectorInfo.getProperties().set("contentScale", this.$contentScale$inlined);
        inspectorInfo.getProperties().set("alpha", Float.valueOf(this.$alpha$inlined));
        inspectorInfo.getProperties().set("colorFilter", this.$colorFilter$inlined);
    }
}
