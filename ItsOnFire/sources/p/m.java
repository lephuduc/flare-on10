package p;

import androidx.appcompat.R;
import j.c0;
import j.t2;
import j.u0;
import j.v0;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import l.e0;
import l.g0;
import l.i0;
import l.m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q.w0;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T1
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0092\u0001\u0010\u000e\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00032\u0016\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0018\u00010\u00030\u000629\u0010\r\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\fH\u0081@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001ap\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004\"\u0004\b\u0000\u0010\u0010\"\u0004\b\u0001\u0010\u0011\"\u0004\b\u0002\u0010\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042(\u0010\r\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015*\u001c\b\u0002\u0010\u0017\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00162\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"R", "T", "Lo/j;", "", "Lo/i;", "flows", "Lkotlin/Function0;", "arrayFactory", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "transform", "a", "(Lo/j;[Lo/i;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T1", "T2", "flow", "flow2", "b", "(Lo/i;Lo/i;Lkotlin/jvm/functions/Function3;)Lo/i;", "Lkotlin/collections/IndexedValue;", "Update", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class m {

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"R", "T", "Lj/u0;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {R.styleable.AppCompatTheme_colorPrimary, R.styleable.AppCompatTheme_listPreferredItemHeight, R.styleable.AppCompatTheme_listPreferredItemPaddingEnd}, m = "invokeSuspend", n = {"latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
    /* loaded from: classes2.dex */
    public static final class a extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public Object f1876j;

        /* renamed from: k  reason: collision with root package name */
        public Object f1877k;

        /* renamed from: l  reason: collision with root package name */
        public int f1878l;

        /* renamed from: m  reason: collision with root package name */
        public int f1879m;

        /* renamed from: n  reason: collision with root package name */
        public int f1880n;

        /* renamed from: o  reason: collision with root package name */
        public /* synthetic */ Object f1881o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ o.i<T>[] f1882p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ Function0<T[]> f1883q;

        /* renamed from: r  reason: collision with root package name */
        public final /* synthetic */ Function3<o.j<? super R>, T[], Continuation<? super Unit>, Object> f1884r;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ o.j<R> f1885s;

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"R", "T", "Lj/u0;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: p.m$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0089a extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {

            /* renamed from: j  reason: collision with root package name */
            public int f1886j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ o.i<T>[] f1887k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ int f1888l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ AtomicInteger f1889m;

            /* renamed from: n  reason: collision with root package name */
            public final /* synthetic */ l.n<IndexedValue<Object>> f1890n;

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "R", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
            /* renamed from: p.m$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0090a<T> implements o.j {

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ l.n<IndexedValue<Object>> f1891j;

                /* renamed from: k  reason: collision with root package name */
                public final /* synthetic */ int f1892k;

                @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
                @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", i = {}, l = {35, 36}, m = "emit", n = {}, s = {})
                /* renamed from: p.m$a$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes2.dex */
                public static final class C0091a extends ContinuationImpl {

                    /* renamed from: j  reason: collision with root package name */
                    public /* synthetic */ Object f1893j;

                    /* renamed from: k  reason: collision with root package name */
                    public final /* synthetic */ C0090a<T> f1894k;

                    /* renamed from: l  reason: collision with root package name */
                    public int f1895l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0091a(C0090a<? super T> c0090a, Continuation<? super C0091a> continuation) {
                        super(continuation);
                        this.f1894k = c0090a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f1893j = obj;
                        this.f1895l |= Integer.MIN_VALUE;
                        return this.f1894k.emit(null, this);
                    }
                }

                public C0090a(l.n<IndexedValue<Object>> nVar, int i2) {
                    this.f1891j = nVar;
                    this.f1892k = i2;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0055 A[RETURN] */
                @Override // o.j
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(T r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof p.m.a.C0089a.C0090a.C0091a
                        if (r0 == 0) goto L13
                        r0 = r7
                        p.m$a$a$a$a r0 = (p.m.a.C0089a.C0090a.C0091a) r0
                        int r1 = r0.f1895l
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f1895l = r1
                        goto L18
                    L13:
                        p.m$a$a$a$a r0 = new p.m$a$a$a$a
                        r0.<init>(r5, r7)
                    L18:
                        java.lang.Object r7 = r0.f1893j
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f1895l
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L38
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        kotlin.ResultKt.throwOnFailure(r7)
                        goto L56
                    L2c:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L34:
                        kotlin.ResultKt.throwOnFailure(r7)
                        goto L4d
                    L38:
                        kotlin.ResultKt.throwOnFailure(r7)
                        l.n<kotlin.collections.IndexedValue<java.lang.Object>> r7 = r5.f1891j
                        kotlin.collections.IndexedValue r2 = new kotlin.collections.IndexedValue
                        int r5 = r5.f1892k
                        r2.<init>(r5, r6)
                        r0.f1895l = r4
                        java.lang.Object r5 = r7.U(r2, r0)
                        if (r5 != r1) goto L4d
                        return r1
                    L4d:
                        r0.f1895l = r3
                        java.lang.Object r5 = j.f4.a(r0)
                        if (r5 != r1) goto L56
                        return r1
                    L56:
                        kotlin.Unit r5 = kotlin.Unit.INSTANCE
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p.m.a.C0089a.C0090a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0089a(o.i<? extends T>[] iVarArr, int i2, AtomicInteger atomicInteger, l.n<IndexedValue<Object>> nVar, Continuation<? super C0089a> continuation) {
                super(2, continuation);
                this.f1887k = iVarArr;
                this.f1888l = i2;
                this.f1889m = atomicInteger;
                this.f1890n = nVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0089a(this.f1887k, this.f1888l, this.f1889m, this.f1890n, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
                return ((C0089a) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                AtomicInteger atomicInteger;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f1886j;
                try {
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        o.i[] iVarArr = this.f1887k;
                        int i3 = this.f1888l;
                        o.i iVar = iVarArr[i3];
                        C0090a c0090a = new C0090a(this.f1890n, i3);
                        this.f1886j = 1;
                        if (iVar.collect(c0090a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ResultKt.throwOnFailure(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        m0.a.a(this.f1890n, null, 1, null);
                    }
                    return Unit.INSTANCE;
                } finally {
                    if (this.f1889m.decrementAndGet() == 0) {
                        m0.a.a(this.f1890n, null, 1, null);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(o.i<? extends T>[] iVarArr, Function0<T[]> function0, Function3<? super o.j<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3, o.j<? super R> jVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f1882p = iVarArr;
            this.f1883q = function0;
            this.f1884r = function3;
            this.f1885s = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f1882p, this.f1883q, this.f1884r, this.f1885s, continuation);
            aVar.f1881o = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00ca  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00cd A[LOOP:0: B:28:0x00cd->B:34:0x00f0, LOOP_START, PHI: r3 r10 
          PHI: (r3v2 int) = (r3v1 int), (r3v3 int) binds: [B:25:0x00c8, B:34:0x00f0] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r10v5 kotlin.collections.IndexedValue) = (r10v4 kotlin.collections.IndexedValue), (r10v18 kotlin.collections.IndexedValue) binds: [B:25:0x00c8, B:34:0x00f0] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Type inference failed for: r2v6, types: [int] */
        /* JADX WARN: Type inference failed for: r2v8, types: [int] */
        /* JADX WARN: Type inference failed for: r7v0, types: [o.i<T>[]] */
        /* JADX WARN: Type inference failed for: r7v4, types: [o.i<T>[], o.i[]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0138 -> B:20:0x00a9). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r24) {
            /*
                Method dump skipped, instructions count: 318
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.m.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class b implements o.i<R> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ o.i f1896j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ o.i f1897k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Function3 f1898l;

        public b(o.i iVar, o.i iVar2, Function3 function3) {
            this.f1896j = iVar;
            this.f1897k = iVar2;
            this.f1898l = function3;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull o.j<? super R> jVar, @NotNull Continuation<? super Unit> continuation) {
            Object coroutine_suspended;
            Object g2 = v0.g(new c(jVar, this.f1896j, this.f1897k, this.f1898l, null), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return g2 == coroutine_suspended ? g2 : Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"T1", "T2", "R", "Lj/u0;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", i = {0}, l = {129}, m = "invokeSuspend", n = {"second"}, s = {"L$0"})
    /* loaded from: classes2.dex */
    public static final class c extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public int f1899j;

        /* renamed from: k  reason: collision with root package name */
        public /* synthetic */ Object f1900k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ o.j<R> f1901l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ o.i<T2> f1902m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ o.i<T1> f1903n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ Function3<T1, T2, Continuation<? super R>, Object> f1904o;

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        /* loaded from: classes2.dex */
        public static final class a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ c0 f1905j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ o.j<R> f1906k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(c0 c0Var, o.j<? super R> jVar) {
                super(1);
                this.f1905j = c0Var;
                this.f1906k = jVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th) {
                if (this.f1905j.b()) {
                    this.f1905j.cancel(new p.a(this.f1906k));
                }
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, d2 = {"T1", "T2", "R", "", "it", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class b extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {

            /* renamed from: j  reason: collision with root package name */
            public int f1907j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ o.i<T1> f1908k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ CoroutineContext f1909l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ Object f1910m;

            /* renamed from: n  reason: collision with root package name */
            public final /* synthetic */ i0<Object> f1911n;

            /* renamed from: o  reason: collision with root package name */
            public final /* synthetic */ o.j<R> f1912o;

            /* renamed from: p  reason: collision with root package name */
            public final /* synthetic */ Function3<T1, T2, Continuation<? super R>, Object> f1913p;

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
            /* loaded from: classes2.dex */
            public static final class a<T> implements o.j {

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ CoroutineContext f1914j;

                /* renamed from: k  reason: collision with root package name */
                public final /* synthetic */ Object f1915k;

                /* renamed from: l  reason: collision with root package name */
                public final /* synthetic */ i0<Object> f1916l;

                /* renamed from: m  reason: collision with root package name */
                public final /* synthetic */ o.j<R> f1917m;

                /* renamed from: n  reason: collision with root package name */
                public final /* synthetic */ Function3<T1, T2, Continuation<? super R>, Object> f1918n;

                @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, d2 = {"T1", "T2", "R", "", "it", "<anonymous>"}, k = 3, mv = {1, 6, 0})
                @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", f = "Combine.kt", i = {}, l = {132, 135, 135}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: p.m$c$b$a$a  reason: collision with other inner class name */
                /* loaded from: classes2.dex */
                public static final class C0092a extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {

                    /* renamed from: j  reason: collision with root package name */
                    public Object f1919j;

                    /* renamed from: k  reason: collision with root package name */
                    public int f1920k;

                    /* renamed from: l  reason: collision with root package name */
                    public final /* synthetic */ i0<Object> f1921l;

                    /* renamed from: m  reason: collision with root package name */
                    public final /* synthetic */ o.j<R> f1922m;

                    /* renamed from: n  reason: collision with root package name */
                    public final /* synthetic */ Function3<T1, T2, Continuation<? super R>, Object> f1923n;

                    /* renamed from: o  reason: collision with root package name */
                    public final /* synthetic */ T1 f1924o;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0092a(i0<? extends Object> i0Var, o.j<? super R> jVar, Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3, T1 t1, Continuation<? super C0092a> continuation) {
                        super(2, continuation);
                        this.f1921l = i0Var;
                        this.f1922m = jVar;
                        this.f1923n = function3;
                        this.f1924o = t1;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        return new C0092a(this.f1921l, this.f1922m, this.f1923n, this.f1924o, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                        return invoke2(unit, continuation);
                    }

                    @Nullable
                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final Object invoke2(@NotNull Unit unit, @Nullable Continuation<? super Unit> continuation) {
                        return ((C0092a) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:29:0x006e A[RETURN] */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @org.jetbrains.annotations.Nullable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
                        /*
                            r8 = this;
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            int r1 = r8.f1920k
                            r2 = 0
                            r3 = 3
                            r4 = 2
                            r5 = 1
                            if (r1 == 0) goto L30
                            if (r1 == r5) goto L26
                            if (r1 == r4) goto L1e
                            if (r1 != r3) goto L16
                            kotlin.ResultKt.throwOnFailure(r9)
                            goto L6f
                        L16:
                            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                            r8.<init>(r9)
                            throw r8
                        L1e:
                            java.lang.Object r1 = r8.f1919j
                            o.j r1 = (o.j) r1
                            kotlin.ResultKt.throwOnFailure(r9)
                            goto L64
                        L26:
                            kotlin.ResultKt.throwOnFailure(r9)
                            l.r r9 = (l.r) r9
                            java.lang.Object r9 = r9.o()
                            goto L3e
                        L30:
                            kotlin.ResultKt.throwOnFailure(r9)
                            l.i0<java.lang.Object> r9 = r8.f1921l
                            r8.f1920k = r5
                            java.lang.Object r9 = r9.z(r8)
                            if (r9 != r0) goto L3e
                            return r0
                        L3e:
                            o.j<R> r1 = r8.f1922m
                            boolean r5 = r9 instanceof l.r.c
                            if (r5 == 0) goto L50
                            java.lang.Throwable r8 = l.r.f(r9)
                            if (r8 != 0) goto L4f
                            p.a r8 = new p.a
                            r8.<init>(r1)
                        L4f:
                            throw r8
                        L50:
                            kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r5 = r8.f1923n
                            T1 r6 = r8.f1924o
                            q.r0 r7 = p.u.f1945a
                            if (r9 != r7) goto L59
                            r9 = r2
                        L59:
                            r8.f1919j = r1
                            r8.f1920k = r4
                            java.lang.Object r9 = r5.invoke(r6, r9, r8)
                            if (r9 != r0) goto L64
                            return r0
                        L64:
                            r8.f1919j = r2
                            r8.f1920k = r3
                            java.lang.Object r8 = r1.emit(r9, r8)
                            if (r8 != r0) goto L6f
                            return r0
                        L6f:
                            kotlin.Unit r8 = kotlin.Unit.INSTANCE
                            return r8
                        */
                        throw new UnsupportedOperationException("Method not decompiled: p.m.c.b.a.C0092a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
                @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1", f = "Combine.kt", i = {}, l = {131}, m = "emit", n = {}, s = {})
                /* renamed from: p.m$c$b$a$b  reason: collision with other inner class name */
                /* loaded from: classes2.dex */
                public static final class C0093b extends ContinuationImpl {

                    /* renamed from: j  reason: collision with root package name */
                    public /* synthetic */ Object f1925j;

                    /* renamed from: k  reason: collision with root package name */
                    public final /* synthetic */ a<T> f1926k;

                    /* renamed from: l  reason: collision with root package name */
                    public int f1927l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0093b(a<? super T> aVar, Continuation<? super C0093b> continuation) {
                        super(continuation);
                        this.f1926k = aVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f1925j = obj;
                        this.f1927l |= Integer.MIN_VALUE;
                        return this.f1926k.emit(null, this);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public a(CoroutineContext coroutineContext, Object obj, i0<? extends Object> i0Var, o.j<? super R> jVar, Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3) {
                    this.f1914j = coroutineContext;
                    this.f1915k = obj;
                    this.f1916l = i0Var;
                    this.f1917m = jVar;
                    this.f1918n = function3;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // o.j
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(T1 r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
                    /*
                        r12 = this;
                        boolean r0 = r14 instanceof p.m.c.b.a.C0093b
                        if (r0 == 0) goto L13
                        r0 = r14
                        p.m$c$b$a$b r0 = (p.m.c.b.a.C0093b) r0
                        int r1 = r0.f1927l
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f1927l = r1
                        goto L18
                    L13:
                        p.m$c$b$a$b r0 = new p.m$c$b$a$b
                        r0.<init>(r12, r14)
                    L18:
                        java.lang.Object r14 = r0.f1925j
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f1927l
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.ResultKt.throwOnFailure(r14)
                        goto L51
                    L29:
                        java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                        java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                        r12.<init>(r13)
                        throw r12
                    L31:
                        kotlin.ResultKt.throwOnFailure(r14)
                        kotlin.coroutines.CoroutineContext r14 = r12.f1914j
                        kotlin.Unit r2 = kotlin.Unit.INSTANCE
                        java.lang.Object r4 = r12.f1915k
                        p.m$c$b$a$a r11 = new p.m$c$b$a$a
                        l.i0<java.lang.Object> r6 = r12.f1916l
                        o.j<R> r7 = r12.f1917m
                        kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r8 = r12.f1918n
                        r10 = 0
                        r5 = r11
                        r9 = r13
                        r5.<init>(r6, r7, r8, r9, r10)
                        r0.f1927l = r3
                        java.lang.Object r12 = p.f.c(r14, r2, r4, r11, r0)
                        if (r12 != r1) goto L51
                        return r1
                    L51:
                        kotlin.Unit r12 = kotlin.Unit.INSTANCE
                        return r12
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p.m.c.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(o.i<? extends T1> iVar, CoroutineContext coroutineContext, Object obj, i0<? extends Object> i0Var, o.j<? super R> jVar, Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f1908k = iVar;
                this.f1909l = coroutineContext;
                this.f1910m = obj;
                this.f1911n = i0Var;
                this.f1912o = jVar;
                this.f1913p = function3;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new b(this.f1908k, this.f1909l, this.f1910m, this.f1911n, this.f1912o, this.f1913p, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return invoke2(unit, continuation);
            }

            @Nullable
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(@NotNull Unit unit, @Nullable Continuation<? super Unit> continuation) {
                return ((b) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f1907j;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    o.i<T1> iVar = this.f1908k;
                    a aVar = new a(this.f1909l, this.f1910m, this.f1911n, this.f1912o, this.f1913p);
                    this.f1907j = 1;
                    if (iVar.collect(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@"}, d2 = {"T1", "T2", "R", "Ll/g0;", "", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1", f = "Combine.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: p.m$c$c  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0094c extends SuspendLambda implements Function2<g0<? super Object>, Continuation<? super Unit>, Object> {

            /* renamed from: j  reason: collision with root package name */
            public int f1928j;

            /* renamed from: k  reason: collision with root package name */
            public /* synthetic */ Object f1929k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ o.i<T2> f1930l;

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
            /* renamed from: p.m$c$c$a */
            /* loaded from: classes2.dex */
            public static final class a<T> implements o.j {

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ g0<Object> f1931j;

                @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
                @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1", f = "Combine.kt", i = {}, l = {R.styleable.AppCompatTheme_ratingBarStyleIndicator}, m = "emit", n = {}, s = {})
                /* renamed from: p.m$c$c$a$a  reason: collision with other inner class name */
                /* loaded from: classes2.dex */
                public static final class C0095a extends ContinuationImpl {

                    /* renamed from: j  reason: collision with root package name */
                    public /* synthetic */ Object f1932j;

                    /* renamed from: k  reason: collision with root package name */
                    public final /* synthetic */ a<T> f1933k;

                    /* renamed from: l  reason: collision with root package name */
                    public int f1934l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0095a(a<? super T> aVar, Continuation<? super C0095a> continuation) {
                        super(continuation);
                        this.f1933k = aVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f1932j = obj;
                        this.f1934l |= Integer.MIN_VALUE;
                        return this.f1933k.emit(null, this);
                    }
                }

                public a(g0<Object> g0Var) {
                    this.f1931j = g0Var;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // o.j
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(T2 r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof p.m.c.C0094c.a.C0095a
                        if (r0 == 0) goto L13
                        r0 = r6
                        p.m$c$c$a$a r0 = (p.m.c.C0094c.a.C0095a) r0
                        int r1 = r0.f1934l
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f1934l = r1
                        goto L18
                    L13:
                        p.m$c$c$a$a r0 = new p.m$c$c$a$a
                        r0.<init>(r4, r6)
                    L18:
                        java.lang.Object r6 = r0.f1932j
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f1934l
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.ResultKt.throwOnFailure(r6)
                        goto L47
                    L29:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L31:
                        kotlin.ResultKt.throwOnFailure(r6)
                        l.g0<java.lang.Object> r4 = r4.f1931j
                        l.m0 r4 = r4.c()
                        if (r5 != 0) goto L3e
                        q.r0 r5 = p.u.f1945a
                    L3e:
                        r0.f1934l = r3
                        java.lang.Object r4 = r4.U(r5, r0)
                        if (r4 != r1) goto L47
                        return r1
                    L47:
                        kotlin.Unit r4 = kotlin.Unit.INSTANCE
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p.m.c.C0094c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0094c(o.i<? extends T2> iVar, Continuation<? super C0094c> continuation) {
                super(2, continuation);
                this.f1930l = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0094c c0094c = new C0094c(this.f1930l, continuation);
                c0094c.f1929k = obj;
                return c0094c;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(g0<? super Object> g0Var, Continuation<? super Unit> continuation) {
                return invoke2((g0<Object>) g0Var, continuation);
            }

            @Nullable
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(@NotNull g0<Object> g0Var, @Nullable Continuation<? super Unit> continuation) {
                return ((C0094c) create(g0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f1928j;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    o.i<T2> iVar = this.f1930l;
                    a aVar = new a((g0) this.f1929k);
                    this.f1928j = 1;
                    if (iVar.collect(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(o.j<? super R> jVar, o.i<? extends T2> iVar, o.i<? extends T1> iVar2, Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f1901l = jVar;
            this.f1902m = iVar;
            this.f1903n = iVar2;
            this.f1904o = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            c cVar = new c(this.f1901l, this.f1902m, this.f1903n, this.f1904o, continuation);
            cVar.f1900k = obj;
            return cVar;
        }

        @Nullable
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(u0 u0Var, Continuation<? super Unit> continuation) {
            return invoke2(u0Var, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v12, types: [l.i0] */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v2, types: [l.i0] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            c0 c2;
            i0 i0Var;
            i0 i0Var2;
            CoroutineContext plus;
            Unit unit;
            b bVar;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i0 i0Var3 = this.f1899j;
            try {
                if (i0Var3 != 0) {
                    if (i0Var3 == 1) {
                        i0Var2 = (i0) this.f1900k;
                        try {
                            ResultKt.throwOnFailure(obj);
                            i0Var3 = i0Var2;
                        } catch (p.a e2) {
                            e = e2;
                        }
                        i0.a.b(i0Var3, null, 1, null);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                u0 u0Var = (u0) this.f1900k;
                i0 g2 = e0.g(u0Var, null, 0, new C0094c(this.f1902m, null), 3, null);
                c2 = t2.c(null, 1, null);
                ((m0) g2).Q(new a(c2, this.f1901l));
                try {
                    CoroutineContext coroutineContext = u0Var.getCoroutineContext();
                    Object b2 = w0.b(coroutineContext);
                    plus = u0Var.getCoroutineContext().plus(c2);
                    unit = Unit.INSTANCE;
                    bVar = new b(this.f1903n, coroutineContext, b2, g2, this.f1901l, this.f1904o, null);
                    this.f1900k = g2;
                    this.f1899j = 1;
                    i0Var = g2;
                    try {
                    } catch (p.a e3) {
                        e = e3;
                        i0Var2 = i0Var;
                        q.b(e, this.f1901l);
                        i0Var3 = i0Var2;
                        i0.a.b(i0Var3, null, 1, null);
                        return Unit.INSTANCE;
                    } catch (Throwable th) {
                        th = th;
                        i0Var3 = i0Var;
                        i0.a.b(i0Var3, null, 1, null);
                        throw th;
                    }
                } catch (p.a e4) {
                    e = e4;
                    i0Var = g2;
                } catch (Throwable th2) {
                    th = th2;
                    i0Var = g2;
                }
                if (f.d(plus, unit, null, bVar, this, 4, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i0Var3 = i0Var;
                i0.a.b(i0Var3, null, 1, null);
                return Unit.INSTANCE;
                q.b(e, this.f1901l);
                i0Var3 = i0Var2;
                i0.a.b(i0Var3, null, 1, null);
                return Unit.INSTANCE;
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @PublishedApi
    @Nullable
    public static final <R, T> Object a(@NotNull o.j<? super R> jVar, @NotNull o.i<? extends T>[] iVarArr, @NotNull Function0<T[]> function0, @NotNull Function3<? super o.j<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object a2 = p.a(new a(iVarArr, function0, function3, jVar, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return a2 == coroutine_suspended ? a2 : Unit.INSTANCE;
    }

    @NotNull
    public static final <T1, T2, R> o.i<R> b(@NotNull o.i<? extends T1> iVar, @NotNull o.i<? extends T2> iVar2, @NotNull Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3) {
        return new b(iVar2, iVar, function3);
    }
}
