package androidx.compose.ui.input.pointer;

import androidx.appcompat.R;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SuspendingPointerInputFilterKt$pointerInput$$inlined$debugInspectorInfo$2 extends Lambda implements Function1<InspectorInfo, Unit> {
    public final /* synthetic */ Function2 $block$inlined;
    public final /* synthetic */ Object $key1$inlined;
    public final /* synthetic */ Object $key2$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendingPointerInputFilterKt$pointerInput$$inlined$debugInspectorInfo$2(Object obj, Object obj2, Function2 function2) {
        super(1);
        this.$key1$inlined = obj;
        this.$key2$inlined = obj2;
        this.$block$inlined = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
        inspectorInfo.setName("pointerInput");
        inspectorInfo.getProperties().set("key1", this.$key1$inlined);
        inspectorInfo.getProperties().set("key2", this.$key2$inlined);
        inspectorInfo.getProperties().set("block", this.$block$inlined);
    }
}
