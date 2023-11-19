package androidx.compose.ui.platform;

import j.u0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import l.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lj/u0;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@DebugMetadata(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", i = {0}, l = {63}, m = "invokeSuspend", n = {"$this$consume$iv$iv"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class GlobalSnapshotManager$ensureStarted$1 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
    public final /* synthetic */ n<Unit> $channel;
    public Object L$0;
    public Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSnapshotManager$ensureStarted$1(n<Unit> nVar, Continuation<? super GlobalSnapshotManager$ensureStarted$1> continuation) {
        super(2, continuation);
        this.$channel = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new GlobalSnapshotManager$ensureStarted$1(this.$channel, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
        return ((GlobalSnapshotManager$ensureStarted$1) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[Catch: all -> 0x0051, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:6:0x0013, B:15:0x0036, B:17:0x003f, B:12:0x0029, B:11:0x0024), top: B:26:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0033 -> B:15:0x0036). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L1f
            if (r1 != r2) goto L17
            java.lang.Object r1 = r5.L$1
            l.p r1 = (l.p) r1
            java.lang.Object r3 = r5.L$0
            l.i0 r3 = (l.i0) r3
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L51
            goto L36
        L17:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L1f:
            kotlin.ResultKt.throwOnFailure(r6)
            l.n<kotlin.Unit> r3 = r5.$channel
            l.p r6 = r3.iterator()     // Catch: java.lang.Throwable -> L51
            r1 = r6
        L29:
            r5.L$0 = r3     // Catch: java.lang.Throwable -> L51
            r5.L$1 = r1     // Catch: java.lang.Throwable -> L51
            r5.label = r2     // Catch: java.lang.Throwable -> L51
            java.lang.Object r6 = r1.a(r5)     // Catch: java.lang.Throwable -> L51
            if (r6 != r0) goto L36
            return r0
        L36:
            r4 = 0
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L51
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L51
            if (r6 == 0) goto L4b
            java.lang.Object r6 = r1.next()     // Catch: java.lang.Throwable -> L51
            kotlin.Unit r6 = (kotlin.Unit) r6     // Catch: java.lang.Throwable -> L51
            androidx.compose.runtime.snapshots.Snapshot$Companion r6 = androidx.compose.runtime.snapshots.Snapshot.Companion     // Catch: java.lang.Throwable -> L51
            r6.sendApplyNotifications()     // Catch: java.lang.Throwable -> L51
            goto L29
        L4b:
            l.s.b(r3, r4)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L51:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L53
        L53:
            r6 = move-exception
            l.s.b(r3, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
