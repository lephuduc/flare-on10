package p;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import j.n2;
import j.u0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l.e0;
import l.g0;
import l.i0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BA\u0012\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J!\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0013\u001a\u00020\u0012H\u0014R \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lp/g;", "T", "Lp/e;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Ll/m;", "onBufferOverflow", "j", "Lj/u0;", "scope", "Ll/i0;", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "Ll/g0;", "", "i", "(Ll/g0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "e", "Lo/i;", "m", "Lo/i;", "flow", "I", "concurrency", "<init>", "(Lo/i;ILkotlin/coroutines/CoroutineContext;ILl/m;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class g<T> extends e<T> {
    @NotNull

    /* renamed from: m  reason: collision with root package name */
    public final o.i<o.i<T>> f1834m;

    /* renamed from: n  reason: collision with root package name */
    public final int f1835n;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lo/i;", "inner", "", "a", "(Lo/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class a<T> implements o.j {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ n2 f1836j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ u.f f1837k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ g0<T> f1838l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ y<T> f1839m;

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lj/u0;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {R.styleable.AppCompatTheme_editTextColor}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: p.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0086a extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {

            /* renamed from: j  reason: collision with root package name */
            public int f1840j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ o.i<T> f1841k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ y<T> f1842l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ u.f f1843m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0086a(o.i<? extends T> iVar, y<T> yVar, u.f fVar, Continuation<? super C0086a> continuation) {
                super(2, continuation);
                this.f1841k = iVar;
                this.f1842l = yVar;
                this.f1843m = fVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0086a(this.f1841k, this.f1842l, this.f1843m, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
                return ((C0086a) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.Unit, java.lang.Object] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f1840j;
                try {
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        o.i<T> iVar = this.f1841k;
                        y<T> yVar = this.f1842l;
                        this.f1840j = 1;
                        if (iVar.collect(yVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ResultKt.throwOnFailure(obj);
                    }
                    this.f1843m.release();
                    this = Unit.INSTANCE;
                    return this;
                } catch (Throwable th) {
                    this.f1843m.release();
                    throw th;
                }
            }
        }

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2", f = "Merge.kt", i = {0, 0}, l = {R.styleable.AppCompatTheme_dropDownListViewStyle}, m = "emit", n = {"this", "inner"}, s = {"L$0", "L$1"})
        /* loaded from: classes2.dex */
        public static final class b extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public Object f1844j;

            /* renamed from: k  reason: collision with root package name */
            public Object f1845k;

            /* renamed from: l  reason: collision with root package name */
            public /* synthetic */ Object f1846l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ a<T> f1847m;

            /* renamed from: n  reason: collision with root package name */
            public int f1848n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(a<? super T> aVar, Continuation<? super b> continuation) {
                super(continuation);
                this.f1847m = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1846l = obj;
                this.f1848n |= Integer.MIN_VALUE;
                return this.f1847m.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(n2 n2Var, u.f fVar, g0<? super T> g0Var, y<T> yVar) {
            this.f1836j = n2Var;
            this.f1837k = fVar;
            this.f1838l = g0Var;
            this.f1839m = yVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
        @Override // o.j
        @org.jetbrains.annotations.Nullable
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(@org.jetbrains.annotations.NotNull o.i<? extends T> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof p.g.a.b
                if (r0 == 0) goto L13
                r0 = r8
                p.g$a$b r0 = (p.g.a.b) r0
                int r1 = r0.f1848n
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f1848n = r1
                goto L18
            L13:
                p.g$a$b r0 = new p.g$a$b
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.f1846l
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f1848n
                r3 = 1
                if (r2 == 0) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r6 = r0.f1845k
                r7 = r6
                o.i r7 = (o.i) r7
                java.lang.Object r6 = r0.f1844j
                p.g$a r6 = (p.g.a) r6
                kotlin.ResultKt.throwOnFailure(r8)
                goto L53
            L32:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L3a:
                kotlin.ResultKt.throwOnFailure(r8)
                j.n2 r8 = r6.f1836j
                if (r8 == 0) goto L44
                j.r2.z(r8)
            L44:
                u.f r8 = r6.f1837k
                r0.f1844j = r6
                r0.f1845k = r7
                r0.f1848n = r3
                java.lang.Object r8 = r8.b(r0)
                if (r8 != r1) goto L53
                return r1
            L53:
                l.g0<T> r0 = r6.f1838l
                r1 = 0
                r2 = 0
                p.g$a$a r3 = new p.g$a$a
                p.y<T> r8 = r6.f1839m
                u.f r6 = r6.f1837k
                r4 = 0
                r3.<init>(r7, r8, r6, r4)
                r4 = 3
                r5 = 0
                j.j.e(r0, r1, r2, r3, r4, r5)
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p.g.a.emit(o.i, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@NotNull o.i<? extends o.i<? extends T>> iVar, int i2, @NotNull CoroutineContext coroutineContext, int i3, @NotNull l.m mVar) {
        super(coroutineContext, i3, mVar);
        this.f1834m = iVar;
        this.f1835n = i2;
    }

    public /* synthetic */ g(o.i iVar, int i2, CoroutineContext coroutineContext, int i3, l.m mVar, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar, i2, (i4 & 4) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i4 & 8) != 0 ? -2 : i3, (i4 & 16) != 0 ? l.m.SUSPEND : mVar);
    }

    @Override // p.e
    @NotNull
    public String e() {
        return "concurrency=" + this.f1835n;
    }

    @Override // p.e
    @Nullable
    public Object i(@NotNull g0<? super T> g0Var, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object collect = this.f1834m.collect(new a((n2) continuation.getContext().get(n2.f488b), u.h.b(this.f1835n, 0, 2, null), g0Var, new y(g0Var)), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return collect == coroutine_suspended ? collect : Unit.INSTANCE;
    }

    @Override // p.e
    @NotNull
    public e<T> j(@NotNull CoroutineContext coroutineContext, int i2, @NotNull l.m mVar) {
        return new g(this.f1834m, this.f1835n, coroutineContext, i2, mVar);
    }

    @Override // p.e
    @NotNull
    public i0<T> n(@NotNull u0 u0Var) {
        return e0.d(u0Var, this.f1824j, this.f1825k, l());
    }
}
