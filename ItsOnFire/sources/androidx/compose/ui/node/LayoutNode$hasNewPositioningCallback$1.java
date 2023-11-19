package androidx.compose.ui.node;

import androidx.appcompat.R;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "mod", "Landroidx/compose/ui/Modifier$Element;", "hasNewCallback", "invoke", "(Landroidx/compose/ui/Modifier$Element;Z)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LayoutNode$hasNewPositioningCallback$1 extends Lambda implements Function2<Modifier.Element, Boolean, Boolean> {
    public final /* synthetic */ MutableVector<OnGloballyPositionedModifierWrapper> $onPositionedCallbacks;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNode$hasNewPositioningCallback$1(MutableVector<OnGloballyPositionedModifierWrapper> mutableVector) {
        super(2);
        this.$onPositionedCallbacks = mutableVector;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
        if (r7 == null) goto L22;
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean invoke(@org.jetbrains.annotations.NotNull androidx.compose.ui.Modifier.Element r6, boolean r7) {
        /*
            r5 = this;
            java.lang.String r0 = "mod"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            if (r7 != 0) goto L36
            boolean r7 = r6 instanceof androidx.compose.ui.layout.OnGloballyPositionedModifier
            if (r7 == 0) goto L37
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.OnGloballyPositionedModifierWrapper> r5 = r5.$onPositionedCallbacks
            r7 = 0
            if (r5 != 0) goto L12
            goto L34
        L12:
            int r1 = r5.getSize()
            if (r1 <= 0) goto L32
            java.lang.Object[] r5 = r5.getContent()
            r2 = r0
        L1d:
            r3 = r5[r2]
            r4 = r3
            androidx.compose.ui.node.OnGloballyPositionedModifierWrapper r4 = (androidx.compose.ui.node.OnGloballyPositionedModifierWrapper) r4
            androidx.compose.ui.Modifier$Element r4 = r4.getModifier()
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r4)
            if (r4 == 0) goto L2e
            r7 = r3
            goto L32
        L2e:
            int r2 = r2 + 1
            if (r2 < r1) goto L1d
        L32:
            androidx.compose.ui.node.OnGloballyPositionedModifierWrapper r7 = (androidx.compose.ui.node.OnGloballyPositionedModifierWrapper) r7
        L34:
            if (r7 != 0) goto L37
        L36:
            r0 = 1
        L37:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNode$hasNewPositioningCallback$1.invoke(androidx.compose.ui.Modifier$Element, boolean):java.lang.Boolean");
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Boolean invoke(Modifier.Element element, Boolean bool) {
        return invoke(element, bool.booleanValue());
    }
}
