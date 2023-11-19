package androidx.compose.foundation.relocation;

import androidx.appcompat.R;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001b\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\fR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterImpl;", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "()V", "bringIntoViewUsages", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/foundation/relocation/BringIntoViewData;", "getBringIntoViewUsages", "()Landroidx/compose/runtime/collection/MutableVector;", "bringIntoView", "", "rect", "Landroidx/compose/ui/geometry/Rect;", "(Landroidx/compose/ui/geometry/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class BringIntoViewRequesterImpl implements BringIntoViewRequester {
    @NotNull
    private final MutableVector<BringIntoViewData> bringIntoViewUsages = new MutableVector<>(new BringIntoViewData[16], 0);

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ae, code lost:
        if (r9 < r11) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005b -> B:33:0x00ad). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0061 -> B:33:0x00ad). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x008c -> B:33:0x00ad). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a9 -> B:32:0x00ab). Please submit an issue!!! */
    @Override // androidx.compose.foundation.relocation.BringIntoViewRequester
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object bringIntoView(@org.jetbrains.annotations.Nullable androidx.compose.ui.geometry.Rect r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1 r0 = (androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1 r0 = new androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            int r9 = r0.I$1
            int r10 = r0.I$0
            java.lang.Object r2 = r0.L$1
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            java.lang.Object r4 = r0.L$0
            androidx.compose.ui.geometry.Rect r4 = (androidx.compose.ui.geometry.Rect) r4
            kotlin.ResultKt.throwOnFailure(r11)
            goto Lab
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            kotlin.ResultKt.throwOnFailure(r11)
            androidx.compose.runtime.collection.MutableVector r9 = r9.getBringIntoViewUsages()
            int r11 = r9.getSize()
            if (r11 <= 0) goto Lb0
            r2 = 0
            java.lang.Object[] r9 = r9.getContent()
            r8 = r2
            r2 = r9
            r9 = r8
        L53:
            r4 = r2[r9]
            androidx.compose.foundation.relocation.BringIntoViewData r4 = (androidx.compose.foundation.relocation.BringIntoViewData) r4
            androidx.compose.ui.layout.LayoutCoordinates r5 = r4.getLayoutCoordinates()
            if (r5 == 0) goto Lad
            boolean r6 = r5.isAttached()
            if (r6 != 0) goto L64
            goto Lad
        L64:
            if (r10 != 0) goto L73
            long r6 = r5.mo2772getSizeYbymL2g()
            long r6 = androidx.compose.ui.unit.IntSizeKt.m3495toSizeozmzZPI(r6)
            androidx.compose.ui.geometry.Rect r6 = androidx.compose.ui.geometry.SizeKt.m1251toRectuvyYCjk(r6)
            goto L74
        L73:
            r6 = r10
        L74:
            androidx.compose.foundation.relocation.BringIntoViewResponder r7 = r4.getParent()
            androidx.compose.ui.geometry.Rect r5 = r7.toLocalRect(r6, r5)
            androidx.compose.foundation.relocation.BringIntoViewResponder r6 = r4.getParent()
            androidx.compose.foundation.relocation.BringIntoViewResponder$Companion r7 = androidx.compose.foundation.relocation.BringIntoViewResponder.Companion
            androidx.compose.foundation.relocation.BringIntoViewResponder r7 = r7.getRootBringIntoViewResponder()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r7)
            if (r6 == 0) goto L94
            androidx.compose.foundation.relocation.BringRectangleOnScreenRequester r4 = r4.getBringRectangleOnScreenRequester()
            r4.bringRectangleOnScreen(r5)
            goto Lad
        L94:
            androidx.compose.foundation.relocation.BringIntoViewResponder r4 = r4.getParent()
            r0.L$0 = r10
            r0.L$1 = r2
            r0.I$0 = r11
            r0.I$1 = r9
            r0.label = r3
            java.lang.Object r4 = r4.bringIntoView(r5, r0)
            if (r4 != r1) goto La9
            return r1
        La9:
            r4 = r10
            r10 = r11
        Lab:
            r11 = r10
            r10 = r4
        Lad:
            int r9 = r9 + r3
            if (r9 < r11) goto L53
        Lb0:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.relocation.BringIntoViewRequesterImpl.bringIntoView(androidx.compose.ui.geometry.Rect, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public final MutableVector<BringIntoViewData> getBringIntoViewUsages() {
        return this.bringIntoViewUsages;
    }
}
