package o;

import androidx.appcompat.R;
import androidx.compose.animation.core.AnimationConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import j.d2;
import j.f1;
import kotlin.Metadata;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.time.Duration;
import l.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a2\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0005H\u0007\u001a3\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a<\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a9\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\f\u001a&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000f\u001a\u00020\u0002H\u0007\u001a$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u0002H\u0000\u001a3\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0017\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"T", "Lo/i;", "", "timeoutMillis", "a", "Lkotlin/Function1;", "b", "Lkotlin/time/Duration;", "timeout", "c", "(Lo/i;J)Lo/i;", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "(Lo/i;Lkotlin/jvm/functions/Function1;)Lo/i;", "timeoutMillisSelector", "e", "periodMillis", "h", "Lj/u0;", "delayMillis", "initialDelayMillis", "Ll/i0;", "", "f", "period", "i", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes2.dex */
public final /* synthetic */ class r {

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Long;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class a extends Lambda implements Function1<T, Long> {

        /* renamed from: j */
        public final /* synthetic */ long f1440j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j2) {
            super(1);
            this.f1440j = j2;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: a */
        public final Long invoke(T t2) {
            return Long.valueOf(this.f1440j);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "emittedItem", "", "a", "(Ljava/lang/Object;)Ljava/lang/Long;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class b extends Lambda implements Function1<T, Long> {

        /* renamed from: j */
        public final /* synthetic */ Function1<T, Duration> f1441j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super T, Duration> function1) {
            super(1);
            this.f1441j = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: a */
        public final Long invoke(T t2) {
            return Long.valueOf(f1.e(this.f1441j.invoke(t2).m4962unboximpl()));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@"}, d2 = {"T", "Lj/u0;", "Lo/j;", "downstream", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {222, 355}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "timeoutMillis", "downstream", "values", "lastValue", "timeoutMillis"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    /* loaded from: classes2.dex */
    public static final class c extends SuspendLambda implements Function3<j.u0, j<? super T>, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        public Object f1442j;

        /* renamed from: k */
        public Object f1443k;

        /* renamed from: l */
        public int f1444l;

        /* renamed from: m */
        public /* synthetic */ Object f1445m;

        /* renamed from: n */
        public /* synthetic */ Object f1446n;

        /* renamed from: o */
        public final /* synthetic */ Function1<T, Long> f1447o;

        /* renamed from: p */
        public final /* synthetic */ i<T> f1448p;

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@"}, d2 = {"T", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", i = {}, l = {233}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class a extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

            /* renamed from: j */
            public int f1449j;

            /* renamed from: k */
            public final /* synthetic */ j<T> f1450k;

            /* renamed from: l */
            public final /* synthetic */ Ref.ObjectRef<Object> f1451l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(j<? super T> jVar, Ref.ObjectRef<Object> objectRef, Continuation<? super a> continuation) {
                super(1, continuation);
                this.f1450k = jVar;
                this.f1451l = objectRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                return new a(this.f1450k, this.f1451l, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final Object invoke(@Nullable Continuation<? super Unit> continuation) {
                return ((a) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f1449j;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    j<T> jVar = this.f1450k;
                    q.r0 r0Var = p.u.f1945a;
                    Object obj2 = this.f1451l.element;
                    if (obj2 == r0Var) {
                        obj2 = null;
                    }
                    this.f1449j = 1;
                    if (jVar.emit(obj2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                this.f1451l.element = null;
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, d2 = {"T", "Ll/r;", "", "value", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", i = {0}, l = {243}, m = "invokeSuspend", n = {"$this$onFailure_u2dWpGqRn0$iv"}, s = {"L$0"})
        /* loaded from: classes2.dex */
        public static final class b extends SuspendLambda implements Function2<l.r<? extends Object>, Continuation<? super Unit>, Object> {

            /* renamed from: j */
            public Object f1452j;

            /* renamed from: k */
            public int f1453k;

            /* renamed from: l */
            public /* synthetic */ Object f1454l;

            /* renamed from: m */
            public final /* synthetic */ Ref.ObjectRef<Object> f1455m;

            /* renamed from: n */
            public final /* synthetic */ j<T> f1456n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(Ref.ObjectRef<Object> objectRef, j<? super T> jVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f1455m = objectRef;
                this.f1456n = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                b bVar = new b(this.f1455m, this.f1456n, continuation);
                bVar.f1454l = obj;
                return bVar;
            }

            @Nullable
            public final Object i(@NotNull Object obj, @Nullable Continuation<? super Unit> continuation) {
                return ((b) create(l.r.b(obj), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(l.r<? extends Object> rVar, Continuation<? super Unit> continuation) {
                return i(rVar.o(), continuation);
            }

            /* JADX WARN: Type inference failed for: r6v4, types: [T, q.r0] */
            /* JADX WARN: Type inference failed for: r7v3, types: [T, java.lang.Object] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                Ref.ObjectRef<Object> objectRef;
                Ref.ObjectRef<Object> objectRef2;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f1453k;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    ?? o2 = ((l.r) this.f1454l).o();
                    objectRef = this.f1455m;
                    boolean z = o2 instanceof r.c;
                    if (!z) {
                        objectRef.element = o2;
                    }
                    j<T> jVar = this.f1456n;
                    if (z) {
                        Throwable f2 = l.r.f(o2);
                        if (f2 != null) {
                            throw f2;
                        }
                        Object obj2 = objectRef.element;
                        if (obj2 != null) {
                            if (obj2 == p.u.f1945a) {
                                obj2 = null;
                            }
                            this.f1454l = o2;
                            this.f1452j = objectRef;
                            this.f1453k = 1;
                            if (jVar.emit(obj2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            objectRef2 = objectRef;
                        }
                        objectRef.element = p.u.f1947c;
                    }
                    return Unit.INSTANCE;
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    objectRef2 = (Ref.ObjectRef) this.f1452j;
                    ResultKt.throwOnFailure(obj);
                }
                objectRef = objectRef2;
                objectRef.element = p.u.f1947c;
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, d2 = {"T", "Ll/g0;", "", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", f = "Delay.kt", i = {}, l = {211}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: o.r$c$c */
        /* loaded from: classes2.dex */
        public static final class C0073c extends SuspendLambda implements Function2<l.g0<? super Object>, Continuation<? super Unit>, Object> {

            /* renamed from: j */
            public int f1457j;

            /* renamed from: k */
            public /* synthetic */ Object f1458k;

            /* renamed from: l */
            public final /* synthetic */ i<T> f1459l;

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
            /* renamed from: o.r$c$c$a */
            /* loaded from: classes2.dex */
            public static final class a<T> implements j {

                /* renamed from: j */
                public final /* synthetic */ l.g0<Object> f1460j;

                @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
                @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", f = "Delay.kt", i = {}, l = {211}, m = "emit", n = {}, s = {})
                /* renamed from: o.r$c$c$a$a */
                /* loaded from: classes2.dex */
                public static final class C0074a extends ContinuationImpl {

                    /* renamed from: j */
                    public /* synthetic */ Object f1461j;

                    /* renamed from: k */
                    public final /* synthetic */ a<T> f1462k;

                    /* renamed from: l */
                    public int f1463l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0074a(a<? super T> aVar, Continuation<? super C0074a> continuation) {
                        super(continuation);
                        this.f1462k = aVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f1461j = obj;
                        this.f1463l |= Integer.MIN_VALUE;
                        return this.f1462k.emit(null, this);
                    }
                }

                public a(l.g0<Object> g0Var) {
                    this.f1460j = g0Var;
                }

                /* JADX WARN: Removed duplicated region for block: B:32:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:36:0x0031  */
                @Override // o.j
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(T r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof o.r.c.C0073c.a.C0074a
                        if (r0 == 0) goto L13
                        r0 = r6
                        o.r$c$c$a$a r0 = (o.r.c.C0073c.a.C0074a) r0
                        int r1 = r0.f1463l
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f1463l = r1
                        goto L18
                    L13:
                        o.r$c$c$a$a r0 = new o.r$c$c$a$a
                        r0.<init>(r4, r6)
                    L18:
                        java.lang.Object r6 = r0.f1461j
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f1463l
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.ResultKt.throwOnFailure(r6)
                        goto L43
                    L29:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L31:
                        kotlin.ResultKt.throwOnFailure(r6)
                        l.g0<java.lang.Object> r4 = r4.f1460j
                        if (r5 != 0) goto L3a
                        q.r0 r5 = p.u.f1945a
                    L3a:
                        r0.f1463l = r3
                        java.lang.Object r4 = r4.U(r5, r0)
                        if (r4 != r1) goto L43
                        return r1
                    L43:
                        kotlin.Unit r4 = kotlin.Unit.INSTANCE
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.r.c.C0073c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0073c(i<? extends T> iVar, Continuation<? super C0073c> continuation) {
                super(2, continuation);
                this.f1459l = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0073c c0073c = new C0073c(this.f1459l, continuation);
                c0073c.f1458k = obj;
                return c0073c;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(l.g0<? super Object> g0Var, Continuation<? super Unit> continuation) {
                return invoke2((l.g0<Object>) g0Var, continuation);
            }

            @Nullable
            /* renamed from: invoke */
            public final Object invoke2(@NotNull l.g0<Object> g0Var, @Nullable Continuation<? super Unit> continuation) {
                return ((C0073c) create(g0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f1457j;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    i<T> iVar = this.f1459l;
                    a aVar = new a((l.g0) this.f1458k);
                    this.f1457j = 1;
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
        public c(Function1<? super T, Long> function1, i<? extends T> iVar, Continuation<? super c> continuation) {
            super(3, continuation);
            this.f1447o = function1;
            this.f1448p = iVar;
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* renamed from: i */
        public final Object invoke(@NotNull j.u0 u0Var, @NotNull j<? super T> jVar, @Nullable Continuation<? super Unit> continuation) {
            c cVar = new c(this.f1447o, this.f1448p, continuation);
            cVar.f1445m = u0Var;
            cVar.f1446n = jVar;
            return cVar.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(14:9|(5:11|(1:13)|14|(1:16)(1:30)|(2:28|29)(2:18|(5:20|(1:22)|23|(1:25)|27)))|31|32|33|34|(1:36)|37|38|(1:40)|(1:42)|6|7|(2:46|47)(0)) */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x00e9, code lost:
            r15 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x00ea, code lost:
            r7.p0(r15);
         */
        /* JADX WARN: Removed duplicated region for block: B:101:0x00fc A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:102:0x00fd  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x00d2 A[Catch: all -> 0x00e9, TryCatch #0 {all -> 0x00e9, blocks: (B:90:0x00ce, B:92:0x00d2, B:93:0x00dc), top: B:104:0x00ce }] */
        /* JADX WARN: Removed duplicated region for block: B:99:0x00f7  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:100:0x00fa -> B:60:0x0022). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 256
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.r.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Ll/g0;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$3", f = "Delay.kt", i = {0, 1, 2}, l = {314, 316, 317}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$0"})
    /* loaded from: classes2.dex */
    public static final class d extends SuspendLambda implements Function2<l.g0<? super Unit>, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        public int f1464j;

        /* renamed from: k */
        public /* synthetic */ Object f1465k;

        /* renamed from: l */
        public final /* synthetic */ long f1466l;

        /* renamed from: m */
        public final /* synthetic */ long f1467m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j2, long j3, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f1466l = j2;
            this.f1467m = j3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            d dVar = new d(this.f1466l, this.f1467m, continuation);
            dVar.f1465k = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull l.g0<? super Unit> g0Var, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(g0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:38:0x004f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x005c A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x005a -> B:36:0x003f). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f1464j
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2a
                if (r1 == r4) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L22
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L1a:
                java.lang.Object r1 = r7.f1465k
                l.g0 r1 = (l.g0) r1
                kotlin.ResultKt.throwOnFailure(r8)
                goto L50
            L22:
                java.lang.Object r1 = r7.f1465k
                l.g0 r1 = (l.g0) r1
                kotlin.ResultKt.throwOnFailure(r8)
                goto L3f
            L2a:
                kotlin.ResultKt.throwOnFailure(r8)
                java.lang.Object r8 = r7.f1465k
                r1 = r8
                l.g0 r1 = (l.g0) r1
                long r5 = r7.f1466l
                r7.f1465k = r1
                r7.f1464j = r4
                java.lang.Object r8 = j.f1.b(r5, r7)
                if (r8 != r0) goto L3f
                return r0
            L3f:
                l.m0 r8 = r1.c()
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                r7.f1465k = r1
                r7.f1464j = r3
                java.lang.Object r8 = r8.U(r4, r7)
                if (r8 != r0) goto L50
                return r0
            L50:
                long r4 = r7.f1467m
                r7.f1465k = r1
                r7.f1464j = r2
                java.lang.Object r8 = j.f1.b(r4, r7)
                if (r8 != r0) goto L3f
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.r.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@"}, d2 = {"T", "Lj/u0;", "Lo/j;", "downstream", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", f = "Delay.kt", i = {0, 0, 0, 0}, l = {352}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "ticker"}, s = {"L$0", "L$1", "L$2", "L$3"})
    /* loaded from: classes2.dex */
    public static final class e extends SuspendLambda implements Function3<j.u0, j<? super T>, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        public Object f1468j;

        /* renamed from: k */
        public Object f1469k;

        /* renamed from: l */
        public int f1470l;

        /* renamed from: m */
        public /* synthetic */ Object f1471m;

        /* renamed from: n */
        public /* synthetic */ Object f1472n;

        /* renamed from: o */
        public final /* synthetic */ long f1473o;

        /* renamed from: p */
        public final /* synthetic */ i<T> f1474p;

        @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, d2 = {"T", "Ll/r;", "", "result", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", f = "Delay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class a extends SuspendLambda implements Function2<l.r<? extends Object>, Continuation<? super Unit>, Object> {

            /* renamed from: j */
            public int f1475j;

            /* renamed from: k */
            public /* synthetic */ Object f1476k;

            /* renamed from: l */
            public final /* synthetic */ Ref.ObjectRef<Object> f1477l;

            /* renamed from: m */
            public final /* synthetic */ l.i0<Unit> f1478m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Ref.ObjectRef<Object> objectRef, l.i0<Unit> i0Var, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f1477l = objectRef;
                this.f1478m = i0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                a aVar = new a(this.f1477l, this.f1478m, continuation);
                aVar.f1476k = obj;
                return aVar;
            }

            @Nullable
            public final Object i(@NotNull Object obj, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(l.r.b(obj), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(l.r<? extends Object> rVar, Continuation<? super Unit> continuation) {
                return i(rVar.o(), continuation);
            }

            /* JADX WARN: Type inference failed for: r2v4, types: [T, q.r0] */
            /* JADX WARN: Type inference failed for: r3v4, types: [T, java.lang.Object] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f1475j == 0) {
                    ResultKt.throwOnFailure(obj);
                    ?? o2 = ((l.r) this.f1476k).o();
                    Ref.ObjectRef<Object> objectRef = this.f1477l;
                    boolean z = o2 instanceof r.c;
                    if (!z) {
                        objectRef.element = o2;
                    }
                    l.i0<Unit> i0Var = this.f1478m;
                    if (z) {
                        Throwable f2 = l.r.f(o2);
                        if (f2 != null) {
                            throw f2;
                        }
                        i0Var.cancel(new p.l());
                        objectRef.element = p.u.f1947c;
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"T", "", "it", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2", f = "Delay.kt", i = {}, l = {AnimationConstants.DefaultDurationMillis}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class b extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {

            /* renamed from: j */
            public int f1479j;

            /* renamed from: k */
            public final /* synthetic */ Ref.ObjectRef<Object> f1480k;

            /* renamed from: l */
            public final /* synthetic */ j<T> f1481l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(Ref.ObjectRef<Object> objectRef, j<? super T> jVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f1480k = objectRef;
                this.f1481l = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new b(this.f1480k, this.f1481l, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull Unit unit, @Nullable Continuation<? super Unit> continuation) {
                return ((b) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f1479j;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef<Object> objectRef = this.f1480k;
                    Object obj2 = objectRef.element;
                    if (obj2 == null) {
                        return Unit.INSTANCE;
                    }
                    objectRef.element = null;
                    j<T> jVar = this.f1481l;
                    if (obj2 == p.u.f1945a) {
                        obj2 = null;
                    }
                    this.f1479j = 1;
                    if (jVar.emit(obj2, this) == coroutine_suspended) {
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

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, d2 = {"T", "Ll/g0;", "", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1", f = "Delay.kt", i = {}, l = {280}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class c extends SuspendLambda implements Function2<l.g0<? super Object>, Continuation<? super Unit>, Object> {

            /* renamed from: j */
            public int f1482j;

            /* renamed from: k */
            public /* synthetic */ Object f1483k;

            /* renamed from: l */
            public final /* synthetic */ i<T> f1484l;

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
            /* loaded from: classes2.dex */
            public static final class a<T> implements j {

                /* renamed from: j */
                public final /* synthetic */ l.g0<Object> f1485j;

                @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
                @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1", f = "Delay.kt", i = {}, l = {280}, m = "emit", n = {}, s = {})
                /* renamed from: o.r$e$c$a$a */
                /* loaded from: classes2.dex */
                public static final class C0075a extends ContinuationImpl {

                    /* renamed from: j */
                    public /* synthetic */ Object f1486j;

                    /* renamed from: k */
                    public final /* synthetic */ a<T> f1487k;

                    /* renamed from: l */
                    public int f1488l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0075a(a<? super T> aVar, Continuation<? super C0075a> continuation) {
                        super(continuation);
                        this.f1487k = aVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f1486j = obj;
                        this.f1488l |= Integer.MIN_VALUE;
                        return this.f1487k.emit(null, this);
                    }
                }

                public a(l.g0<Object> g0Var) {
                    this.f1485j = g0Var;
                }

                /* JADX WARN: Removed duplicated region for block: B:32:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:36:0x0031  */
                @Override // o.j
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(T r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof o.r.e.c.a.C0075a
                        if (r0 == 0) goto L13
                        r0 = r6
                        o.r$e$c$a$a r0 = (o.r.e.c.a.C0075a) r0
                        int r1 = r0.f1488l
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f1488l = r1
                        goto L18
                    L13:
                        o.r$e$c$a$a r0 = new o.r$e$c$a$a
                        r0.<init>(r4, r6)
                    L18:
                        java.lang.Object r6 = r0.f1486j
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f1488l
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.ResultKt.throwOnFailure(r6)
                        goto L43
                    L29:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L31:
                        kotlin.ResultKt.throwOnFailure(r6)
                        l.g0<java.lang.Object> r4 = r4.f1485j
                        if (r5 != 0) goto L3a
                        q.r0 r5 = p.u.f1945a
                    L3a:
                        r0.f1488l = r3
                        java.lang.Object r4 = r4.U(r5, r0)
                        if (r4 != r1) goto L43
                        return r1
                    L43:
                        kotlin.Unit r4 = kotlin.Unit.INSTANCE
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.r.e.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(i<? extends T> iVar, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f1484l = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                c cVar = new c(this.f1484l, continuation);
                cVar.f1483k = obj;
                return cVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(l.g0<? super Object> g0Var, Continuation<? super Unit> continuation) {
                return invoke2((l.g0<Object>) g0Var, continuation);
            }

            @Nullable
            /* renamed from: invoke */
            public final Object invoke2(@NotNull l.g0<Object> g0Var, @Nullable Continuation<? super Unit> continuation) {
                return ((c) create(g0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f1482j;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    i<T> iVar = this.f1484l;
                    a aVar = new a((l.g0) this.f1483k);
                    this.f1482j = 1;
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
        public e(long j2, i<? extends T> iVar, Continuation<? super e> continuation) {
            super(3, continuation);
            this.f1473o = j2;
            this.f1474p = iVar;
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* renamed from: i */
        public final Object invoke(@NotNull j.u0 u0Var, @NotNull j<? super T> jVar, @Nullable Continuation<? super Unit> continuation) {
            e eVar = new e(this.f1473o, this.f1474p, continuation);
            eVar.f1471m = u0Var;
            eVar.f1472n = jVar;
            return eVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            l.i0 g2;
            j jVar;
            l.i0 i0Var;
            Ref.ObjectRef objectRef;
            l.i0 i0Var2;
            Object coroutine_suspended2;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1470l;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                j.u0 u0Var = (j.u0) this.f1471m;
                l.i0 g3 = l.e0.g(u0Var, null, -1, new c(this.f1474p, null), 1, null);
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                g2 = r.g(u0Var, this.f1473o, 0L, 2, null);
                jVar = (j) this.f1472n;
                i0Var = g3;
                objectRef = objectRef2;
                i0Var2 = g2;
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                i0Var2 = (l.i0) this.f1469k;
                objectRef = (Ref.ObjectRef) this.f1468j;
                i0Var = (l.i0) this.f1472n;
                jVar = (j) this.f1471m;
                ResultKt.throwOnFailure(obj);
            }
            while (objectRef.element != p.u.f1947c) {
                this.f1471m = jVar;
                this.f1472n = i0Var;
                this.f1468j = objectRef;
                this.f1469k = i0Var2;
                this.f1470l = 1;
                t.b bVar = new t.b(this);
                try {
                    bVar.g(i0Var.p(), new a(objectRef, i0Var2, null));
                    bVar.g(i0Var2.o(), new b(objectRef, jVar, null));
                } catch (Throwable th) {
                    bVar.p0(th);
                }
                Object o0 = bVar.o0();
                coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (o0 == coroutine_suspended2) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                    continue;
                }
                if (o0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d2
    @NotNull
    public static final <T> i<T> a(@NotNull i<? extends T> iVar, long j2) {
        int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i2 >= 0) {
            return i2 == 0 ? iVar : e(iVar, new a(j2));
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative".toString());
    }

    @d2
    @OverloadResolutionByLambdaReturnType
    @NotNull
    public static final <T> i<T> b(@NotNull i<? extends T> iVar, @NotNull Function1<? super T, Long> function1) {
        return e(iVar, function1);
    }

    @d2
    @NotNull
    public static final <T> i<T> c(@NotNull i<? extends T> iVar, long j2) {
        return k.a0(iVar, f1.e(j2));
    }

    @d2
    @JvmName(name = "debounceDuration")
    @NotNull
    @OverloadResolutionByLambdaReturnType
    public static final <T> i<T> d(@NotNull i<? extends T> iVar, @NotNull Function1<? super T, Duration> function1) {
        return e(iVar, new b(function1));
    }

    public static final <T> i<T> e(i<? extends T> iVar, Function1<? super T, Long> function1) {
        return p.p.b(new c(function1, iVar, null));
    }

    @NotNull
    public static final l.i0<Unit> f(@NotNull j.u0 u0Var, long j2, long j3) {
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("Expected non-negative delay, but has " + j2 + " ms").toString());
        }
        if (j3 >= 0) {
            return l.e0.g(u0Var, null, 0, new d(j3, j2, null), 1, null);
        }
        throw new IllegalArgumentException(("Expected non-negative initial delay, but has " + j3 + " ms").toString());
    }

    public static /* synthetic */ l.i0 g(j.u0 u0Var, long j2, long j3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j3 = j2;
        }
        return k.x0(u0Var, j2, j3);
    }

    @d2
    @NotNull
    public static final <T> i<T> h(@NotNull i<? extends T> iVar, long j2) {
        if (j2 > 0) {
            return p.p.b(new e(j2, iVar, null));
        }
        throw new IllegalArgumentException("Sample period should be positive".toString());
    }

    @d2
    @NotNull
    public static final <T> i<T> i(@NotNull i<? extends T> iVar, long j2) {
        return k.A1(iVar, f1.e(j2));
    }
}
