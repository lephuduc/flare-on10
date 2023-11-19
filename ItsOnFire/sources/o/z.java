package o;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import j.n2;
import j.r2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {}, d1 = {"\u0000r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a6\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001aM\u0010\u0014\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0000*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a1\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aC\u0010\u001e\u001a\u00020\u001d\"\u0004\b\u0000\u0010\u0000*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00160\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0010\u001a\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000!\u001aU\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2-\u0010(\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0%\u0012\u0006\u0012\u0004\u0018\u00010&0#¢\u0006\u0002\b'ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"T", "Lo/i;", "Lj/u0;", "scope", "Lo/o0;", "started", "", "replay", "Lo/i0;", "g", "Lo/n0;", "c", "(Lo/i;I)Lo/n0;", "Lkotlin/coroutines/CoroutineContext;", "context", "upstream", "Lo/d0;", "shared", "initialValue", "Lj/n2;", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "(Lj/u0;Lkotlin/coroutines/CoroutineContext;Lo/i;Lo/d0;Lo/o0;Ljava/lang/Object;)Lj/n2;", "Lo/t0;", "j", "(Lo/i;Lj/u0;Lo/o0;Ljava/lang/Object;)Lo/t0;", "i", "(Lo/i;Lj/u0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lj/z;", "result", "", "e", "(Lj/u0;Lkotlin/coroutines/CoroutineContext;Lo/i;Lj/z;)V", "a", "Lo/e0;", "b", "Lkotlin/Function2;", "Lo/j;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "action", "f", "(Lo/i0;Lkotlin/jvm/functions/Function2;)Lo/i0;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes2.dex */
public final /* synthetic */ class z {

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lj/u0;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", i = {}, l = {214, 218, 219, 225}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class a extends SuspendLambda implements Function2<j.u0, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        public int f1791j;

        /* renamed from: k */
        public final /* synthetic */ o0 f1792k;

        /* renamed from: l */
        public final /* synthetic */ i<T> f1793l;

        /* renamed from: m */
        public final /* synthetic */ d0<T> f1794m;

        /* renamed from: n */
        public final /* synthetic */ T f1795n;

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"T", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: o.z$a$a */
        /* loaded from: classes2.dex */
        public static final class C0084a extends SuspendLambda implements Function2<Integer, Continuation<? super Boolean>, Object> {

            /* renamed from: j */
            public int f1796j;

            /* renamed from: k */
            public /* synthetic */ int f1797k;

            public C0084a(Continuation<? super C0084a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0084a c0084a = new C0084a(continuation);
                c0084a.f1797k = ((Number) obj).intValue();
                return c0084a;
            }

            @Nullable
            public final Object i(int i2, @Nullable Continuation<? super Boolean> continuation) {
                return ((C0084a) create(Integer.valueOf(i2), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Boolean> continuation) {
                return i(num.intValue(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f1796j == 0) {
                    ResultKt.throwOnFailure(obj);
                    return Boxing.boxBoolean(this.f1797k > 0);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"T", "Lo/m0;", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", i = {}, l = {227}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class b extends SuspendLambda implements Function2<m0, Continuation<? super Unit>, Object> {

            /* renamed from: j */
            public int f1798j;

            /* renamed from: k */
            public /* synthetic */ Object f1799k;

            /* renamed from: l */
            public final /* synthetic */ i<T> f1800l;

            /* renamed from: m */
            public final /* synthetic */ d0<T> f1801m;

            /* renamed from: n */
            public final /* synthetic */ T f1802n;

            @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
            /* renamed from: o.z$a$b$a */
            /* loaded from: classes2.dex */
            public /* synthetic */ class C0085a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f1803a;

                static {
                    int[] iArr = new int[m0.values().length];
                    iArr[m0.START.ordinal()] = 1;
                    iArr[m0.STOP.ordinal()] = 2;
                    iArr[m0.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                    f1803a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(i<? extends T> iVar, d0<T> d0Var, T t2, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f1800l = iVar;
                this.f1801m = d0Var;
                this.f1802n = t2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                b bVar = new b(this.f1800l, this.f1801m, this.f1802n, continuation);
                bVar.f1799k = obj;
                return bVar;
            }

            @Nullable
            public final Object i(@NotNull m0 m0Var, @Nullable Continuation<? super Unit> continuation) {
                return ((b) create(m0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(m0 m0Var, Continuation<? super Unit> continuation) {
                return i(m0Var, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f1798j;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    int i3 = C0085a.f1803a[((m0) this.f1799k).ordinal()];
                    if (i3 == 1) {
                        i<T> iVar = this.f1800l;
                        i0 i0Var = this.f1801m;
                        this.f1798j = 1;
                        if (iVar.collect(i0Var, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i3 == 3) {
                        T t2 = this.f1802n;
                        q.r0 r0Var = k0.f1322a;
                        d0<T> d0Var = this.f1801m;
                        if (t2 == r0Var) {
                            d0Var.d();
                        } else {
                            d0Var.g(t2);
                        }
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
        public a(o0 o0Var, i<? extends T> iVar, d0<T> d0Var, T t2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f1792k = o0Var;
            this.f1793l = iVar;
            this.f1794m = d0Var;
            this.f1795n = t2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f1792k, this.f1793l, this.f1794m, this.f1795n, continuation);
        }

        @Nullable
        /* renamed from: invoke */
        public final Object invoke2(@NotNull j.u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(j.u0 u0Var, Continuation<? super Unit> continuation) {
            return invoke2(u0Var, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:56:0x0068 A[RETURN] */
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
                int r1 = r7.f1791j
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L25
                if (r1 == r5) goto L21
                if (r1 == r4) goto L1d
                if (r1 == r3) goto L21
                if (r1 != r2) goto L15
                goto L21
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L1d:
                kotlin.ResultKt.throwOnFailure(r8)
                goto L5c
            L21:
                kotlin.ResultKt.throwOnFailure(r8)
                goto L8d
            L25:
                kotlin.ResultKt.throwOnFailure(r8)
                o.o0 r8 = r7.f1792k
                o.o0$a r1 = o.o0.f1423a
                o.o0 r6 = r1.c()
                if (r8 != r6) goto L3f
                o.i<T> r8 = r7.f1793l
                o.d0<T> r1 = r7.f1794m
                r7.f1791j = r5
                java.lang.Object r7 = r8.collect(r1, r7)
                if (r7 != r0) goto L8d
                return r0
            L3f:
                o.o0 r8 = r7.f1792k
                o.o0 r1 = r1.d()
                r5 = 0
                if (r8 != r1) goto L69
                o.d0<T> r8 = r7.f1794m
                o.t0 r8 = r8.h()
                o.z$a$a r1 = new o.z$a$a
                r1.<init>(r5)
                r7.f1791j = r4
                java.lang.Object r8 = o.k.u0(r8, r1, r7)
                if (r8 != r0) goto L5c
                return r0
            L5c:
                o.i<T> r8 = r7.f1793l
                o.d0<T> r1 = r7.f1794m
                r7.f1791j = r3
                java.lang.Object r7 = r8.collect(r1, r7)
                if (r7 != r0) goto L8d
                return r0
            L69:
                o.o0 r8 = r7.f1792k
                o.d0<T> r1 = r7.f1794m
                o.t0 r1 = r1.h()
                o.i r8 = r8.a(r1)
                o.i r8 = o.k.g0(r8)
                o.z$a$b r1 = new o.z$a$b
                o.i<T> r3 = r7.f1793l
                o.d0<T> r4 = r7.f1794m
                T r6 = r7.f1795n
                r1.<init>(r3, r4, r6, r5)
                r7.f1791j = r2
                java.lang.Object r7 = o.k.A(r8, r1, r7)
                if (r7 != r0) goto L8d
                return r0
            L8d:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: o.z.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lj/u0;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", i = {}, l = {340}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class b extends SuspendLambda implements Function2<j.u0, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        public int f1804j;

        /* renamed from: k */
        public /* synthetic */ Object f1805k;

        /* renamed from: l */
        public final /* synthetic */ i<T> f1806l;

        /* renamed from: m */
        public final /* synthetic */ j.z<t0<T>> f1807m;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        /* loaded from: classes2.dex */
        public static final class a<T> implements j {

            /* renamed from: j */
            public final /* synthetic */ Ref.ObjectRef<e0<T>> f1808j;

            /* renamed from: k */
            public final /* synthetic */ j.u0 f1809k;

            /* renamed from: l */
            public final /* synthetic */ j.z<t0<T>> f1810l;

            public a(Ref.ObjectRef<e0<T>> objectRef, j.u0 u0Var, j.z<t0<T>> zVar) {
                this.f1808j = objectRef;
                this.f1809k = u0Var;
                this.f1810l = zVar;
            }

            /* JADX WARN: Type inference failed for: r3v1, types: [T, o.t0, o.e0] */
            @Override // o.j
            @Nullable
            public final Object emit(T t2, @NotNull Continuation<? super Unit> continuation) {
                Unit unit;
                e0<T> e0Var = this.f1808j.element;
                if (e0Var != null) {
                    e0Var.setValue(t2);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    j.u0 u0Var = this.f1809k;
                    Ref.ObjectRef<e0<T>> objectRef = this.f1808j;
                    j.z<t0<T>> zVar = this.f1810l;
                    ?? r3 = (T) v0.a(t2);
                    zVar.P(new g0(r3, r2.B(u0Var.getCoroutineContext())));
                    objectRef.element = r3;
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(i<? extends T> iVar, j.z<t0<T>> zVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f1806l = iVar;
            this.f1807m = zVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = new b(this.f1806l, this.f1807m, continuation);
            bVar.f1805k = obj;
            return bVar;
        }

        @Nullable
        /* renamed from: invoke */
        public final Object invoke2(@NotNull j.u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(j.u0 u0Var, Continuation<? super Unit> continuation) {
            return invoke2(u0Var, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v4, types: [kotlin.Unit, java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1804j;
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    j.u0 u0Var = (j.u0) this.f1805k;
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    i<T> iVar = this.f1806l;
                    a aVar = new a(objectRef, u0Var, this.f1807m);
                    this.f1804j = 1;
                    if (iVar.collect(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                this = Unit.INSTANCE;
                return this;
            } catch (Throwable th) {
                this.f1807m.d(th);
                throw th;
            }
        }
    }

    @NotNull
    public static final <T> i0<T> a(@NotNull d0<T> d0Var) {
        return new f0(d0Var, null);
    }

    @NotNull
    public static final <T> t0<T> b(@NotNull e0<T> e0Var) {
        return new g0(e0Var, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x002d, code lost:
        if (r3 == 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> o.n0<T> c(o.i<? extends T> r7, int r8) {
        /*
            l.n$b r0 = l.n.f684c
            int r0 = r0.a()
            int r0 = kotlin.ranges.RangesKt.coerceAtLeast(r8, r0)
            int r0 = r0 - r8
            boolean r1 = r7 instanceof p.e
            if (r1 == 0) goto L3d
            r1 = r7
            p.e r1 = (p.e) r1
            o.i r2 = r1.k()
            if (r2 == 0) goto L3d
            o.n0 r7 = new o.n0
            int r3 = r1.f1825k
            r4 = -3
            r5 = 0
            if (r3 == r4) goto L27
            r4 = -2
            if (r3 == r4) goto L27
            if (r3 == 0) goto L27
            r0 = r3
            goto L35
        L27:
            l.m r4 = r1.f1826l
            l.m r6 = l.m.SUSPEND
            if (r4 != r6) goto L30
            if (r3 != 0) goto L35
            goto L34
        L30:
            if (r8 != 0) goto L34
            r0 = 1
            goto L35
        L34:
            r0 = r5
        L35:
            l.m r8 = r1.f1826l
            kotlin.coroutines.CoroutineContext r1 = r1.f1824j
            r7.<init>(r2, r0, r8, r1)
            return r7
        L3d:
            o.n0 r8 = new o.n0
            l.m r1 = l.m.SUSPEND
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            r8.<init>(r7, r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.z.c(o.i, int):o.n0");
    }

    public static final <T> n2 d(j.u0 u0Var, CoroutineContext coroutineContext, i<? extends T> iVar, d0<T> d0Var, o0 o0Var, T t2) {
        return j.j.d(u0Var, coroutineContext, Intrinsics.areEqual(o0Var, o0.f1423a.c()) ? j.w0.DEFAULT : j.w0.UNDISPATCHED, new a(o0Var, iVar, d0Var, t2, null));
    }

    public static final <T> void e(j.u0 u0Var, CoroutineContext coroutineContext, i<? extends T> iVar, j.z<t0<T>> zVar) {
        j.l.f(u0Var, coroutineContext, null, new b(iVar, zVar, null), 2, null);
    }

    @NotNull
    public static final <T> i0<T> f(@NotNull i0<? extends T> i0Var, @NotNull Function2<? super j<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new y0(i0Var, function2);
    }

    @NotNull
    public static final <T> i0<T> g(@NotNull i<? extends T> iVar, @NotNull j.u0 u0Var, @NotNull o0 o0Var, int i2) {
        n0 c2 = c(iVar, i2);
        d0 a2 = k0.a(i2, c2.f1416b, c2.f1417c);
        return new f0(a2, d(u0Var, c2.f1418d, c2.f1415a, a2, o0Var, k0.f1322a));
    }

    public static /* synthetic */ i0 h(i iVar, j.u0 u0Var, o0 o0Var, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return k.F1(iVar, u0Var, o0Var, i2);
    }

    @Nullable
    public static final <T> Object i(@NotNull i<? extends T> iVar, @NotNull j.u0 u0Var, @NotNull Continuation<? super t0<? extends T>> continuation) {
        n0 c2 = c(iVar, 1);
        j.z c3 = j.b0.c(null, 1, null);
        e(u0Var, c2.f1418d, c2.f1415a, c3);
        return c3.x(continuation);
    }

    @NotNull
    public static final <T> t0<T> j(@NotNull i<? extends T> iVar, @NotNull j.u0 u0Var, @NotNull o0 o0Var, T t2) {
        n0 c2 = c(iVar, 1);
        e0 a2 = v0.a(t2);
        return new g0(a2, d(u0Var, c2.f1418d, c2.f1415a, a2, o0Var, t2));
    }
}
