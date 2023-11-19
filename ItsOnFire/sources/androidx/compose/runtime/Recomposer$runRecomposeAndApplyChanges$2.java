package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.snapshots.Snapshot;
import j.q;
import j.u0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Lj/u0;", "Landroidx/compose/runtime/MonotonicFrameClock;", "parentFrameClock", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@DebugMetadata(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", i = {0, 0, 0, 1, 1, 1}, l = {407, 425}, m = "invokeSuspend", n = {"parentFrameClock", "toRecompose", "toApply", "parentFrameClock", "toRecompose", "toApply"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
/* loaded from: classes.dex */
public final class Recomposer$runRecomposeAndApplyChanges$2 extends SuspendLambda implements Function3<u0, MonotonicFrameClock, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ Recomposer this$0;

    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "frameTime", "Lj/q;", "", "invoke", "(J)Lj/q;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* renamed from: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends Lambda implements Function1<Long, q<? super Unit>> {
        public final /* synthetic */ List<ControlledComposition> $toApply;
        public final /* synthetic */ List<ControlledComposition> $toRecompose;
        public final /* synthetic */ Recomposer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Recomposer recomposer, List<ControlledComposition> list, List<ControlledComposition> list2) {
            super(1);
            this.this$0 = recomposer;
            this.$toRecompose = list;
            this.$toApply = list2;
        }

        @Nullable
        public final q<Unit> invoke(long j2) {
            BroadcastFrameClock broadcastFrameClock;
            Object beginSection;
            int i2;
            q<Unit> deriveStateLocked;
            ControlledComposition performRecompose;
            BroadcastFrameClock broadcastFrameClock2;
            broadcastFrameClock = this.this$0.broadcastFrameClock;
            if (broadcastFrameClock.getHasAwaiters()) {
                Recomposer recomposer = this.this$0;
                Trace trace = Trace.INSTANCE;
                beginSection = trace.beginSection("Recomposer:animation");
                try {
                    broadcastFrameClock2 = recomposer.broadcastFrameClock;
                    broadcastFrameClock2.sendFrame(j2);
                    Snapshot.Companion.sendApplyNotifications();
                    Unit unit = Unit.INSTANCE;
                    trace.endSection(beginSection);
                } finally {
                }
            }
            Recomposer recomposer2 = this.this$0;
            List<ControlledComposition> list = this.$toRecompose;
            List<ControlledComposition> list2 = this.$toApply;
            beginSection = Trace.INSTANCE.beginSection("Recomposer:recompose");
            try {
                synchronized (recomposer2.stateLock) {
                    recomposer2.recordComposerModificationsLocked();
                    List list3 = recomposer2.compositionInvalidations;
                    int size = list3.size();
                    i2 = 0;
                    for (int i3 = 0; i3 < size; i3++) {
                        list.add((ControlledComposition) list3.get(i3));
                    }
                    recomposer2.compositionInvalidations.clear();
                    Unit unit2 = Unit.INSTANCE;
                }
                IdentityArraySet identityArraySet = new IdentityArraySet();
                IdentityArraySet identityArraySet2 = new IdentityArraySet();
                while (!list.isEmpty()) {
                    int size2 = list.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        int i5 = i4 + 1;
                        ControlledComposition controlledComposition = list.get(i4);
                        identityArraySet2.add(controlledComposition);
                        performRecompose = recomposer2.performRecompose(controlledComposition, identityArraySet);
                        if (performRecompose != null) {
                            list2.add(performRecompose);
                        }
                        i4 = i5;
                    }
                    list.clear();
                    if (identityArraySet.isNotEmpty()) {
                        synchronized (recomposer2.stateLock) {
                            List list4 = recomposer2.knownCompositions;
                            int size3 = list4.size();
                            int i6 = 0;
                            while (i6 < size3) {
                                int i7 = i6 + 1;
                                ControlledComposition controlledComposition2 = (ControlledComposition) list4.get(i6);
                                if (!identityArraySet2.contains(controlledComposition2) && controlledComposition2.observesAnyOf(identityArraySet)) {
                                    list.add(controlledComposition2);
                                }
                                i6 = i7;
                            }
                            Unit unit3 = Unit.INSTANCE;
                        }
                    }
                }
                if (!list2.isEmpty()) {
                    recomposer2.changeCount = recomposer2.getChangeCount() + 1;
                    int size4 = list2.size();
                    while (i2 < size4) {
                        int i8 = i2 + 1;
                        list2.get(i2).applyChanges();
                        i2 = i8;
                    }
                    list2.clear();
                }
                synchronized (recomposer2.stateLock) {
                    deriveStateLocked = recomposer2.deriveStateLocked();
                }
                return deriveStateLocked;
            } finally {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ q<? super Unit> invoke(Long l2) {
            return invoke(l2.longValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeAndApplyChanges$2(Recomposer recomposer, Continuation<? super Recomposer$runRecomposeAndApplyChanges$2> continuation) {
        super(3, continuation);
        this.this$0 = recomposer;
    }

    @Override // kotlin.jvm.functions.Function3
    @Nullable
    public final Object invoke(@NotNull u0 u0Var, @NotNull MonotonicFrameClock monotonicFrameClock, @Nullable Continuation<? super Unit> continuation) {
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = new Recomposer$runRecomposeAndApplyChanges$2(this.this$0, continuation);
        recomposer$runRecomposeAndApplyChanges$2.L$0 = monotonicFrameClock;
        return recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0083 -> B:11:0x004f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0099 -> B:11:0x004f). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L2a
            if (r1 != r2) goto L22
            java.lang.Object r1 = r10.L$2
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r4 = r10.L$1
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r10.L$0
            androidx.compose.runtime.MonotonicFrameClock r5 = (androidx.compose.runtime.MonotonicFrameClock) r5
            kotlin.ResultKt.throwOnFailure(r11)
            r11 = r5
            r9 = r4
            r4 = r1
            r1 = r9
            goto L4f
        L22:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2a:
            java.lang.Object r1 = r10.L$2
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r4 = r10.L$1
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r10.L$0
            androidx.compose.runtime.MonotonicFrameClock r5 = (androidx.compose.runtime.MonotonicFrameClock) r5
            kotlin.ResultKt.throwOnFailure(r11)
            r11 = r5
            r9 = r4
            r4 = r1
            r1 = r9
            goto L68
        L3e:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.Object r11 = r10.L$0
            androidx.compose.runtime.MonotonicFrameClock r11 = (androidx.compose.runtime.MonotonicFrameClock) r11
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L4f:
            androidx.compose.runtime.Recomposer r5 = r10.this$0
            boolean r5 = androidx.compose.runtime.Recomposer.access$getShouldKeepRecomposing(r5)
            if (r5 == 0) goto L9f
            androidx.compose.runtime.Recomposer r5 = r10.this$0
            r10.L$0 = r11
            r10.L$1 = r1
            r10.L$2 = r4
            r10.label = r3
            java.lang.Object r5 = androidx.compose.runtime.Recomposer.access$awaitWorkAvailable(r5, r10)
            if (r5 != r0) goto L68
            return r0
        L68:
            androidx.compose.runtime.Recomposer r5 = r10.this$0
            java.lang.Object r5 = androidx.compose.runtime.Recomposer.access$getStateLock$p(r5)
            androidx.compose.runtime.Recomposer r6 = r10.this$0
            monitor-enter(r5)
            boolean r7 = androidx.compose.runtime.Recomposer.access$getHasFrameWorkLocked(r6)     // Catch: java.lang.Throwable -> L9c
            r8 = 0
            if (r7 != 0) goto L82
            androidx.compose.runtime.Recomposer.access$recordComposerModificationsLocked(r6)     // Catch: java.lang.Throwable -> L9c
            boolean r6 = androidx.compose.runtime.Recomposer.access$getHasFrameWorkLocked(r6)     // Catch: java.lang.Throwable -> L9c
            if (r6 != 0) goto L82
            r8 = r3
        L82:
            monitor-exit(r5)
            if (r8 == 0) goto L86
            goto L4f
        L86:
            androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2$2 r5 = new androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2$2
            androidx.compose.runtime.Recomposer r6 = r10.this$0
            r5.<init>(r6, r1, r4)
            r10.L$0 = r11
            r10.L$1 = r1
            r10.L$2 = r4
            r10.label = r2
            java.lang.Object r5 = r11.withFrameNanos(r5, r10)
            if (r5 != r0) goto L4f
            return r0
        L9c:
            r10 = move-exception
            monitor-exit(r5)
            throw r10
        L9f:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
