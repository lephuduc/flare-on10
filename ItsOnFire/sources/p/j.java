package p;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import j.n2;
import j.u0;
import j.v0;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003Bz\u0012B\u0010\u001a\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0011¢\u0006\u0002\b\u0017\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0014J!\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010RS\u0010\u001a\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0011¢\u0006\u0002\b\u00178\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lp/j;", "T", "R", "Lp/h;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Ll/m;", "onBufferOverflow", "Lp/e;", "j", "Lo/j;", "collector", "", "s", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "Lkotlin/jvm/functions/Function3;", "transform", "Lo/i;", "flow", "<init>", "(Lkotlin/jvm/functions/Function3;Lo/i;Lkotlin/coroutines/CoroutineContext;ILl/m;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class j<T, R> extends h<T, R> {
    @NotNull

    /* renamed from: n  reason: collision with root package name */
    public final Function3<o.j<? super R>, T, Continuation<? super Unit>, Object> f1853n;

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"T", "R", "Lj/u0;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class a extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public int f1854j;

        /* renamed from: k  reason: collision with root package name */
        public /* synthetic */ Object f1855k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ j<T, R> f1856l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ o.j<R> f1857m;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        /* renamed from: p.j$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0087a<T> implements o.j {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ Ref.ObjectRef<n2> f1858j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ u0 f1859k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ j<T, R> f1860l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ o.j<R> f1861m;

            @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"T", "R", "Lj/u0;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: p.j$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0088a extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {

                /* renamed from: j  reason: collision with root package name */
                public int f1862j;

                /* renamed from: k  reason: collision with root package name */
                public final /* synthetic */ j<T, R> f1863k;

                /* renamed from: l  reason: collision with root package name */
                public final /* synthetic */ o.j<R> f1864l;

                /* renamed from: m  reason: collision with root package name */
                public final /* synthetic */ T f1865m;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0088a(j<T, R> jVar, o.j<? super R> jVar2, T t2, Continuation<? super C0088a> continuation) {
                    super(2, continuation);
                    this.f1863k = jVar;
                    this.f1864l = jVar2;
                    this.f1865m = t2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0088a(this.f1863k, this.f1864l, this.f1865m, continuation);
                }

                @Nullable
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final Object invoke2(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
                    return ((C0088a) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(u0 u0Var, Continuation<? super Unit> continuation) {
                    return invoke2(u0Var, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.f1862j;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        Function3 function3 = this.f1863k.f1853n;
                        o.j<R> jVar = this.f1864l;
                        T t2 = this.f1865m;
                        this.f1862j = 1;
                        if (function3.invoke(jVar, t2, this) == coroutine_suspended) {
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

            @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
            @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", i = {0, 0}, l = {30}, m = "emit", n = {"this", "value"}, s = {"L$0", "L$1"})
            /* renamed from: p.j$a$a$b */
            /* loaded from: classes2.dex */
            public static final class b extends ContinuationImpl {

                /* renamed from: j  reason: collision with root package name */
                public Object f1866j;

                /* renamed from: k  reason: collision with root package name */
                public Object f1867k;

                /* renamed from: l  reason: collision with root package name */
                public Object f1868l;

                /* renamed from: m  reason: collision with root package name */
                public /* synthetic */ Object f1869m;

                /* renamed from: n  reason: collision with root package name */
                public final /* synthetic */ C0087a<T> f1870n;

                /* renamed from: o  reason: collision with root package name */
                public int f1871o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public b(C0087a<? super T> c0087a, Continuation<? super b> continuation) {
                    super(continuation);
                    this.f1870n = c0087a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f1869m = obj;
                    this.f1871o |= Integer.MIN_VALUE;
                    return this.f1870n.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0087a(Ref.ObjectRef<n2> objectRef, u0 u0Var, j<T, R> jVar, o.j<? super R> jVar2) {
                this.f1858j = objectRef;
                this.f1859k = u0Var;
                this.f1860l = jVar;
                this.f1861m = jVar2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
            @Override // o.j
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(T r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof p.j.a.C0087a.b
                    if (r0 == 0) goto L13
                    r0 = r9
                    p.j$a$a$b r0 = (p.j.a.C0087a.b) r0
                    int r1 = r0.f1871o
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f1871o = r1
                    goto L18
                L13:
                    p.j$a$a$b r0 = new p.j$a$a$b
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.f1869m
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f1871o
                    r3 = 1
                    if (r2 == 0) goto L3e
                    if (r2 != r3) goto L36
                    java.lang.Object r7 = r0.f1868l
                    j.n2 r7 = (j.n2) r7
                    java.lang.Object r7 = r0.f1867k
                    java.lang.Object r8 = r0.f1866j
                    p.j$a$a r8 = (p.j.a.C0087a) r8
                    kotlin.ResultKt.throwOnFailure(r9)
                    r6 = r8
                    r8 = r7
                    r7 = r6
                    goto L60
                L36:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L3e:
                    kotlin.ResultKt.throwOnFailure(r9)
                    kotlin.jvm.internal.Ref$ObjectRef<j.n2> r9 = r7.f1858j
                    T r9 = r9.element
                    j.n2 r9 = (j.n2) r9
                    if (r9 == 0) goto L60
                    p.l r2 = new p.l
                    r2.<init>()
                    r9.cancel(r2)
                    r0.f1866j = r7
                    r0.f1867k = r8
                    r0.f1868l = r9
                    r0.f1871o = r3
                    java.lang.Object r9 = r9.n(r0)
                    if (r9 != r1) goto L60
                    return r1
                L60:
                    kotlin.jvm.internal.Ref$ObjectRef<j.n2> r9 = r7.f1858j
                    j.u0 r0 = r7.f1859k
                    r1 = 0
                    j.w0 r2 = j.w0.UNDISPATCHED
                    p.j$a$a$a r3 = new p.j$a$a$a
                    p.j<T, R> r4 = r7.f1860l
                    o.j<R> r7 = r7.f1861m
                    r5 = 0
                    r3.<init>(r4, r7, r8, r5)
                    r4 = 1
                    j.n2 r7 = j.j.e(r0, r1, r2, r3, r4, r5)
                    r9.element = r7
                    kotlin.Unit r7 = kotlin.Unit.INSTANCE
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: p.j.a.C0087a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(j<T, R> jVar, o.j<? super R> jVar2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f1856l = jVar;
            this.f1857m = jVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f1856l, this.f1857m, continuation);
            aVar.f1855k = obj;
            return aVar;
        }

        @Nullable
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(u0 u0Var, Continuation<? super Unit> continuation) {
            return invoke2(u0Var, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1854j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                j<T, R> jVar = this.f1856l;
                o.i<S> iVar = jVar.f1849m;
                C0087a c0087a = new C0087a(objectRef, (u0) this.f1855k, jVar, this.f1857m);
                this.f1854j = 1;
                if (iVar.collect(c0087a, this) == coroutine_suspended) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public j(@NotNull Function3<? super o.j<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, @NotNull o.i<? extends T> iVar, @NotNull CoroutineContext coroutineContext, int i2, @NotNull l.m mVar) {
        super(iVar, coroutineContext, i2, mVar);
        this.f1853n = function3;
    }

    public /* synthetic */ j(Function3 function3, o.i iVar, CoroutineContext coroutineContext, int i2, l.m mVar, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(function3, iVar, (i3 & 4) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i3 & 8) != 0 ? -2 : i2, (i3 & 16) != 0 ? l.m.SUSPEND : mVar);
    }

    @Override // p.e
    @NotNull
    public e<R> j(@NotNull CoroutineContext coroutineContext, int i2, @NotNull l.m mVar) {
        return new j(this.f1853n, this.f1849m, coroutineContext, i2, mVar);
    }

    @Override // p.h
    @Nullable
    public Object s(@NotNull o.j<? super R> jVar, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object g2 = v0.g(new a(this, jVar, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return g2 == coroutine_suspended ? g2 : Unit.INSTANCE;
    }
}
