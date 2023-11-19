package androidx.compose.ui.input.nestedscroll;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.node.DelegatingLayoutNodeWrapper;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import j.u0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010+\u001a\u00020\u0002¢\u0006\u0004\b,\u0010-J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\b\u0010\u000f\u001a\u00020\u0000H\u0016J\b\u0010\u0010\u001a\u00020\u0000H\u0016R(\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00000\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR4\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d2\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010(\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006."}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;", "Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;", "", "refreshSelfIfNeeded", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "newParent", "refreshChildrenWithParentConnection", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/node/LayoutNode;", "children", "loopChildrenForNestedScroll", "onModifierChanged", "attach", "detach", "findPreviousNestedScrollWrapper", "findNextNestedScrollWrapper", "value", "parentConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "setParentConnection", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V", "lastModifier", "Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;", "Landroidx/compose/ui/input/nestedscroll/ParentWrapperNestedScrollConnection;", "childScrollConnection", "Landroidx/compose/ui/input/nestedscroll/ParentWrapperNestedScrollConnection;", "nestedScrollChildrenResult", "Landroidx/compose/runtime/collection/MutableVector;", "Lkotlin/Function0;", "Lj/u0;", "getCoroutineScopeEvaluation", "()Lkotlin/jvm/functions/Function0;", "setCoroutineScopeEvaluation", "(Lkotlin/jvm/functions/Function0;)V", "coroutineScopeEvaluation", "getModifier", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;", "setModifier", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;)V", "modifier", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "wrapped", "nestedScrollModifier", "<init>", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/input/nestedscroll/NestedScrollModifier;)V", "ui_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class NestedScrollDelegatingWrapper extends DelegatingLayoutNodeWrapper<NestedScrollModifier> {
    @NotNull
    private final ParentWrapperNestedScrollConnection childScrollConnection;
    @Nullable
    private NestedScrollModifier lastModifier;
    @NotNull
    private final MutableVector<NestedScrollDelegatingWrapper> nestedScrollChildrenResult;
    @Nullable
    private NestedScrollConnection parentConnection;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollDelegatingWrapper(@NotNull LayoutNodeWrapper wrapped, @NotNull NestedScrollModifier nestedScrollModifier) {
        super(wrapped, nestedScrollModifier);
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        Intrinsics.checkNotNullParameter(nestedScrollModifier, "nestedScrollModifier");
        NestedScrollConnection nestedScrollConnection = this.parentConnection;
        this.childScrollConnection = new ParentWrapperNestedScrollConnection(nestedScrollConnection == null ? NestedScrollDelegatingWrapperKt.NoOpConnection : nestedScrollConnection, nestedScrollModifier.getConnection());
        this.nestedScrollChildrenResult = new MutableVector<>(new NestedScrollDelegatingWrapper[16], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Function0<u0> getCoroutineScopeEvaluation() {
        return getModifier().getDispatcher().getCalculateNestedScrollScope$ui_release();
    }

    private final void loopChildrenForNestedScroll(MutableVector<LayoutNode> mutableVector) {
        int size = mutableVector.getSize();
        if (size > 0) {
            int i2 = 0;
            LayoutNode[] content = mutableVector.getContent();
            do {
                LayoutNode layoutNode = content[i2];
                NestedScrollDelegatingWrapper findNextNestedScrollWrapper = layoutNode.getOuterLayoutNodeWrapper$ui_release().findNextNestedScrollWrapper();
                if (findNextNestedScrollWrapper != null) {
                    this.nestedScrollChildrenResult.add(findNextNestedScrollWrapper);
                } else {
                    loopChildrenForNestedScroll(layoutNode.get_children$ui_release());
                }
                i2++;
            } while (i2 < size);
        }
    }

    private final void refreshChildrenWithParentConnection(NestedScrollConnection nestedScrollConnection) {
        this.nestedScrollChildrenResult.clear();
        NestedScrollDelegatingWrapper findNextNestedScrollWrapper = getWrapped$ui_release().findNextNestedScrollWrapper();
        if (findNextNestedScrollWrapper != null) {
            this.nestedScrollChildrenResult.add(findNextNestedScrollWrapper);
        } else {
            loopChildrenForNestedScroll(getLayoutNode$ui_release().get_children$ui_release());
        }
        int i2 = 0;
        NestedScrollDelegatingWrapper nestedScrollDelegatingWrapper = this.nestedScrollChildrenResult.isNotEmpty() ? this.nestedScrollChildrenResult.getContent()[0] : null;
        MutableVector<NestedScrollDelegatingWrapper> mutableVector = this.nestedScrollChildrenResult;
        int size = mutableVector.getSize();
        if (size > 0) {
            NestedScrollDelegatingWrapper[] content = mutableVector.getContent();
            do {
                NestedScrollDelegatingWrapper nestedScrollDelegatingWrapper2 = content[i2];
                nestedScrollDelegatingWrapper2.setParentConnection(nestedScrollConnection);
                nestedScrollDelegatingWrapper2.setCoroutineScopeEvaluation(nestedScrollConnection != null ? new NestedScrollDelegatingWrapper$refreshChildrenWithParentConnection$1$1(this) : new NestedScrollDelegatingWrapper$refreshChildrenWithParentConnection$1$2(nestedScrollDelegatingWrapper));
                i2++;
            } while (i2 < size);
        }
    }

    private final void refreshSelfIfNeeded() {
        NestedScrollModifier nestedScrollModifier = this.lastModifier;
        if (((nestedScrollModifier != null && nestedScrollModifier.getConnection() == getModifier().getConnection() && nestedScrollModifier.getDispatcher() == getModifier().getDispatcher()) ? false : true) && isAttached()) {
            NestedScrollDelegatingWrapper findPreviousNestedScrollWrapper = super.findPreviousNestedScrollWrapper();
            setParentConnection(findPreviousNestedScrollWrapper == null ? null : findPreviousNestedScrollWrapper.childScrollConnection);
            Function0<u0> coroutineScopeEvaluation = findPreviousNestedScrollWrapper != null ? findPreviousNestedScrollWrapper.getCoroutineScopeEvaluation() : null;
            if (coroutineScopeEvaluation == null) {
                coroutineScopeEvaluation = getCoroutineScopeEvaluation();
            }
            setCoroutineScopeEvaluation(coroutineScopeEvaluation);
            refreshChildrenWithParentConnection(this.childScrollConnection);
            this.lastModifier = getModifier();
        }
    }

    private final void setCoroutineScopeEvaluation(Function0<? extends u0> function0) {
        getModifier().getDispatcher().setCalculateNestedScrollScope$ui_release(function0);
    }

    private final void setParentConnection(NestedScrollConnection nestedScrollConnection) {
        getModifier().getDispatcher().setParent$ui_release(nestedScrollConnection);
        this.childScrollConnection.setParent(nestedScrollConnection == null ? NestedScrollDelegatingWrapperKt.NoOpConnection : nestedScrollConnection);
        this.parentConnection = nestedScrollConnection;
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public void attach() {
        super.attach();
        refreshSelfIfNeeded();
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public void detach() {
        super.detach();
        refreshChildrenWithParentConnection(this.parentConnection);
        this.lastModifier = null;
    }

    @Override // androidx.compose.ui.node.DelegatingLayoutNodeWrapper, androidx.compose.ui.node.LayoutNodeWrapper
    @NotNull
    public NestedScrollDelegatingWrapper findNextNestedScrollWrapper() {
        return this;
    }

    @Override // androidx.compose.ui.node.DelegatingLayoutNodeWrapper, androidx.compose.ui.node.LayoutNodeWrapper
    @NotNull
    public NestedScrollDelegatingWrapper findPreviousNestedScrollWrapper() {
        return this;
    }

    @Override // androidx.compose.ui.node.DelegatingLayoutNodeWrapper
    @NotNull
    public NestedScrollModifier getModifier() {
        return (NestedScrollModifier) super.getModifier();
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public void onModifierChanged() {
        super.onModifierChanged();
        this.childScrollConnection.setSelf(getModifier().getConnection());
        getModifier().getDispatcher().setParent$ui_release(this.parentConnection);
        refreshSelfIfNeeded();
    }

    @Override // androidx.compose.ui.node.DelegatingLayoutNodeWrapper
    public void setModifier(@NotNull NestedScrollModifier value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.lastModifier = (NestedScrollModifier) super.getModifier();
        super.setModifier((NestedScrollDelegatingWrapper) value);
    }
}
