package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0017R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0017"}, d2 = {"Lo/s0;", "Lo/o0;", "Lo/t0;", "", "subscriptionCount", "Lo/i;", "Lo/m0;", "a", "", "toString", "", "other", "", "equals", "hashCode", "", "b", "J", "stopTimeout", "c", "replayExpiration", "<init>", "(JJ)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class s0 implements o0 {

    /* renamed from: b  reason: collision with root package name */
    public final long f1501b;

    /* renamed from: c  reason: collision with root package name */
    public final long f1502c;

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lo/j;", "Lo/m0;", "", "count", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", i = {1, 2, 3}, l = {178, 180, 182, 183, 185}, m = "invokeSuspend", n = {"$this$transformLatest", "$this$transformLatest", "$this$transformLatest"}, s = {"L$0", "L$0", "L$0"})
    /* loaded from: classes2.dex */
    public static final class a extends SuspendLambda implements Function3<j<? super m0>, Integer, Continuation<? super Unit>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public int f1503j;

        /* renamed from: k  reason: collision with root package name */
        public /* synthetic */ Object f1504k;

        /* renamed from: l  reason: collision with root package name */
        public /* synthetic */ int f1505l;

        public a(Continuation<? super a> continuation) {
            super(3, continuation);
        }

        @Nullable
        public final Object i(@NotNull j<? super m0> jVar, int i2, @Nullable Continuation<? super Unit> continuation) {
            a aVar = new a(continuation);
            aVar.f1504k = jVar;
            aVar.f1505l = i2;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(j<? super m0> jVar, Integer num, Continuation<? super Unit> continuation) {
            return i(jVar, num.intValue(), continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x008d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.f1503j
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L3c
                if (r1 == r6) goto L38
                if (r1 == r5) goto L30
                if (r1 == r4) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                goto L38
            L18:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L20:
                java.lang.Object r1 = r9.f1504k
                o.j r1 = (o.j) r1
                kotlin.ResultKt.throwOnFailure(r10)
                goto L8e
            L28:
                java.lang.Object r1 = r9.f1504k
                o.j r1 = (o.j) r1
                kotlin.ResultKt.throwOnFailure(r10)
                goto L7d
            L30:
                java.lang.Object r1 = r9.f1504k
                o.j r1 = (o.j) r1
                kotlin.ResultKt.throwOnFailure(r10)
                goto L64
            L38:
                kotlin.ResultKt.throwOnFailure(r10)
                goto L9c
            L3c:
                kotlin.ResultKt.throwOnFailure(r10)
                java.lang.Object r10 = r9.f1504k
                r1 = r10
                o.j r1 = (o.j) r1
                int r10 = r9.f1505l
                if (r10 <= 0) goto L53
                o.m0 r10 = o.m0.START
                r9.f1503j = r6
                java.lang.Object r9 = r1.emit(r10, r9)
                if (r9 != r0) goto L9c
                return r0
            L53:
                o.s0 r10 = o.s0.this
                long r6 = o.s0.c(r10)
                r9.f1504k = r1
                r9.f1503j = r5
                java.lang.Object r10 = j.f1.b(r6, r9)
                if (r10 != r0) goto L64
                return r0
            L64:
                o.s0 r10 = o.s0.this
                long r5 = o.s0.b(r10)
                r7 = 0
                int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r10 <= 0) goto L8e
                o.m0 r10 = o.m0.STOP
                r9.f1504k = r1
                r9.f1503j = r4
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L7d
                return r0
            L7d:
                o.s0 r10 = o.s0.this
                long r4 = o.s0.b(r10)
                r9.f1504k = r1
                r9.f1503j = r3
                java.lang.Object r10 = j.f1.b(r4, r9)
                if (r10 != r0) goto L8e
                return r0
            L8e:
                o.m0 r10 = o.m0.STOP_AND_RESET_REPLAY_CACHE
                r3 = 0
                r9.f1504k = r3
                r9.f1503j = r2
                java.lang.Object r9 = r1.emit(r10, r9)
                if (r9 != r0) goto L9c
                return r0
            L9c:
                kotlin.Unit r9 = kotlin.Unit.INSTANCE
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: o.s0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lo/m0;", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class b extends SuspendLambda implements Function2<m0, Continuation<? super Boolean>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public int f1507j;

        /* renamed from: k  reason: collision with root package name */
        public /* synthetic */ Object f1508k;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = new b(continuation);
            bVar.f1508k = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* renamed from: i */
        public final Object invoke(@NotNull m0 m0Var, @Nullable Continuation<? super Boolean> continuation) {
            return ((b) create(m0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f1507j == 0) {
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(((m0) this.f1508k) != m0.START);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public s0(long j2, long j3) {
        this.f1501b = j2;
        this.f1502c = j3;
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("stopTimeout(" + j2 + " ms) cannot be negative").toString());
        }
        if (j3 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("replayExpiration(" + j3 + " ms) cannot be negative").toString());
    }

    @Override // o.o0
    @NotNull
    public i<m0> a(@NotNull t0<Integer> t0Var) {
        return k.g0(k.k0(k.b2(t0Var, new a(null)), new b(null)));
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof s0) {
            s0 s0Var = (s0) obj;
            if (this.f1501b == s0Var.f1501b && this.f1502c == s0Var.f1502c) {
                return true;
            }
        }
        return false;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return (Long.hashCode(this.f1501b) * 31) + Long.hashCode(this.f1502c);
    }

    @NotNull
    public String toString() {
        List createListBuilder;
        List build;
        String joinToString$default;
        createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder(2);
        if (this.f1501b > 0) {
            createListBuilder.add("stopTimeout=" + this.f1501b + "ms");
        }
        if (this.f1502c < Long.MAX_VALUE) {
            createListBuilder.add("replayExpiration=" + this.f1502c + "ms");
        }
        build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
        StringBuilder sb = new StringBuilder();
        sb.append("SharingStarted.WhileSubscribed(");
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(build, null, null, null, 0, null, null, 63, null);
        sb.append(joinToString$default);
        sb.append(')');
        return sb.toString();
    }
}
