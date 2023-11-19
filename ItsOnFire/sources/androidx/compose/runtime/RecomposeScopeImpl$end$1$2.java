package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArrayIntMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "composition", "Landroidx/compose/runtime/Composition;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class RecomposeScopeImpl$end$1$2 extends Lambda implements Function1<Composition, Unit> {
    public final /* synthetic */ IdentityArrayIntMap $instances;
    public final /* synthetic */ int $token;
    public final /* synthetic */ RecomposeScopeImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecomposeScopeImpl$end$1$2(RecomposeScopeImpl recomposeScopeImpl, int i2, IdentityArrayIntMap identityArrayIntMap) {
        super(1);
        this.this$0 = recomposeScopeImpl;
        this.$token = i2;
        this.$instances = identityArrayIntMap;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Composition composition) {
        invoke2(composition);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
        r13 = r2.trackedDependencies;
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void invoke2(@org.jetbrains.annotations.NotNull androidx.compose.runtime.Composition r15) {
        /*
            r14 = this;
            java.lang.String r0 = "composition"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            androidx.compose.runtime.RecomposeScopeImpl r0 = r14.this$0
            int r0 = androidx.compose.runtime.RecomposeScopeImpl.access$getCurrentToken$p(r0)
            int r1 = r14.$token
            if (r0 != r1) goto Laa
            androidx.compose.runtime.collection.IdentityArrayIntMap r0 = r14.$instances
            androidx.compose.runtime.RecomposeScopeImpl r1 = r14.this$0
            androidx.compose.runtime.collection.IdentityArrayIntMap r1 = androidx.compose.runtime.RecomposeScopeImpl.access$getTrackedInstances$p(r1)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto Laa
            boolean r0 = r15 instanceof androidx.compose.runtime.CompositionImpl
            if (r0 == 0) goto Laa
            androidx.compose.runtime.collection.IdentityArrayIntMap r0 = r14.$instances
            int r1 = r14.$token
            androidx.compose.runtime.RecomposeScopeImpl r2 = r14.this$0
            int r3 = r0.getSize()
            r4 = 0
            r5 = r4
            r6 = r5
        L2e:
            r7 = 0
            if (r5 >= r3) goto L89
            int r8 = r5 + 1
            java.lang.Object[] r9 = r0.getKeys()
            r9 = r9[r5]
            if (r9 == 0) goto L81
            int[] r10 = r0.getValues()
            r10 = r10[r5]
            if (r10 == r1) goto L45
            r11 = 1
            goto L46
        L45:
            r11 = r4
        L46:
            if (r11 == 0) goto L6d
            r12 = r15
            androidx.compose.runtime.CompositionImpl r12 = (androidx.compose.runtime.CompositionImpl) r12
            r12.removeObservation$runtime_release(r9, r2)
            boolean r12 = r9 instanceof androidx.compose.runtime.DerivedState
            if (r12 == 0) goto L56
            r12 = r9
            androidx.compose.runtime.DerivedState r12 = (androidx.compose.runtime.DerivedState) r12
            goto L57
        L56:
            r12 = r7
        L57:
            if (r12 != 0) goto L5a
            goto L6d
        L5a:
            androidx.compose.runtime.collection.IdentityArrayMap r13 = androidx.compose.runtime.RecomposeScopeImpl.access$getTrackedDependencies$p(r2)
            if (r13 != 0) goto L61
            goto L6d
        L61:
            r13.remove(r12)
            int r12 = r13.getSize$runtime_release()
            if (r12 != 0) goto L6d
            androidx.compose.runtime.RecomposeScopeImpl.access$setTrackedDependencies$p(r2, r7)
        L6d:
            if (r11 != 0) goto L7f
            if (r6 == r5) goto L7d
            java.lang.Object[] r5 = r0.getKeys()
            r5[r6] = r9
            int[] r5 = r0.getValues()
            r5[r6] = r10
        L7d:
            int r6 = r6 + 1
        L7f:
            r5 = r8
            goto L2e
        L81:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException
            java.lang.String r15 = "null cannot be cast to non-null type kotlin.Any"
            r14.<init>(r15)
            throw r14
        L89:
            int r15 = r0.getSize()
            r1 = r6
        L8e:
            if (r1 >= r15) goto L9a
            int r2 = r1 + 1
            java.lang.Object[] r3 = r0.getKeys()
            r3[r1] = r7
            r1 = r2
            goto L8e
        L9a:
            r0.setSize(r6)
            androidx.compose.runtime.collection.IdentityArrayIntMap r15 = r14.$instances
            int r15 = r15.getSize()
            if (r15 != 0) goto Laa
            androidx.compose.runtime.RecomposeScopeImpl r14 = r14.this$0
            androidx.compose.runtime.RecomposeScopeImpl.access$setTrackedInstances$p(r14, r7)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.RecomposeScopeImpl$end$1$2.invoke2(androidx.compose.runtime.Composition):void");
    }
}
