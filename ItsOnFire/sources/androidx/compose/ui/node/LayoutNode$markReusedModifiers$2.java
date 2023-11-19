package androidx.compose.ui.node;

import androidx.appcompat.R;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "mod", "Landroidx/compose/ui/Modifier$Element;", "invoke", "(Lkotlin/Unit;Landroidx/compose/ui/Modifier$Element;)V"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LayoutNode$markReusedModifiers$2 extends Lambda implements Function2<Unit, Modifier.Element, Unit> {
    public final /* synthetic */ LayoutNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNode$markReusedModifiers$2(LayoutNode layoutNode) {
        super(2);
        this.this$0 = layoutNode;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Unit unit, Modifier.Element element) {
        invoke2(unit, element);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object[]] */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Unit noName_0, @NotNull Modifier.Element mod) {
        MutableVector mutableVector;
        DelegatingLayoutNodeWrapper delegatingLayoutNodeWrapper;
        Intrinsics.checkNotNullParameter(noName_0, "$noName_0");
        Intrinsics.checkNotNullParameter(mod, "mod");
        mutableVector = this.this$0.wrapperCache;
        int size = mutableVector.getSize();
        if (size > 0) {
            int i2 = size - 1;
            ?? content = mutableVector.getContent();
            do {
                delegatingLayoutNodeWrapper = content[i2];
                DelegatingLayoutNodeWrapper delegatingLayoutNodeWrapper2 = (DelegatingLayoutNodeWrapper) delegatingLayoutNodeWrapper;
                if (delegatingLayoutNodeWrapper2.getModifier() == mod && !delegatingLayoutNodeWrapper2.getToBeReusedForSameModifier()) {
                    break;
                }
                i2--;
            } while (i2 >= 0);
            delegatingLayoutNodeWrapper = null;
        } else {
            delegatingLayoutNodeWrapper = null;
        }
        DelegatingLayoutNodeWrapper delegatingLayoutNodeWrapper3 = delegatingLayoutNodeWrapper;
        while (delegatingLayoutNodeWrapper3 != null) {
            delegatingLayoutNodeWrapper3.setToBeReusedForSameModifier(true);
            if (delegatingLayoutNodeWrapper3.isChained()) {
                LayoutNodeWrapper wrappedBy$ui_release = delegatingLayoutNodeWrapper3.getWrappedBy$ui_release();
                if (wrappedBy$ui_release instanceof DelegatingLayoutNodeWrapper) {
                    delegatingLayoutNodeWrapper3 = (DelegatingLayoutNodeWrapper) wrappedBy$ui_release;
                }
            }
            delegatingLayoutNodeWrapper3 = null;
        }
    }
}
