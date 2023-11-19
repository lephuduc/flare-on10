package o;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import j.n2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aj\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012B\u0010\f\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0002¢\u0006\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001ae\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u000f23\b\u0002\u0010\u0013\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0011ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u007f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012W\u0010\u0013\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0016¢\u0006\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a3\u0010\u001b\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001b\u0010\u001f\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u001d\u0010\"\u001a\u00020\u0012*\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\"\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"T", "Lo/i;", "Lkotlin/Function3;", "Lo/j;", "", "Lkotlin/ParameterName;", "name", "cause", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "action", "a", "(Lo/i;Lkotlin/jvm/functions/Function3;)Lo/i;", "", "retries", "Lkotlin/Function2;", "", "predicate", "e", "(Lo/i;JLkotlin/jvm/functions/Function2;)Lo/i;", "Lkotlin/Function4;", "attempt", "g", "(Lo/i;Lkotlin/jvm/functions/Function4;)Lo/i;", "collector", "b", "(Lo/i;Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "c", "(Ljava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)Z", "other", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "(Ljava/lang/Throwable;Ljava/lang/Throwable;)Z", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes2.dex */
public final /* synthetic */ class u {

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class a implements i<T> {

        /* renamed from: j */
        public final /* synthetic */ i f1559j;

        /* renamed from: k */
        public final /* synthetic */ Function3 f1560k;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", i = {0, 0}, l = {R.styleable.AppCompatTheme_toolbarStyle, R.styleable.AppCompatTheme_tooltipForegroundColor}, m = "collect", n = {"this", "$this$catch_u24lambda_u2d0"}, s = {"L$0", "L$1"})
        /* renamed from: o.u$a$a */
        /* loaded from: classes2.dex */
        public static final class C0079a extends ContinuationImpl {

            /* renamed from: j */
            public /* synthetic */ Object f1561j;

            /* renamed from: k */
            public int f1562k;

            /* renamed from: m */
            public Object f1564m;

            /* renamed from: n */
            public Object f1565n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0079a(Continuation continuation) {
                super(continuation);
                a.this = r1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1561j = obj;
                this.f1562k |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public a(i iVar, Function3 function3) {
            this.f1559j = iVar;
            this.f1560k = function3;
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0057  */
        @Override // o.i
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull o.j<? super T> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof o.u.a.C0079a
                if (r0 == 0) goto L13
                r0 = r7
                o.u$a$a r0 = (o.u.a.C0079a) r0
                int r1 = r0.f1562k
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f1562k = r1
                goto L18
            L13:
                o.u$a$a r0 = new o.u$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f1561j
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f1562k
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L41
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.ResultKt.throwOnFailure(r7)
                goto L6f
            L2c:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L34:
                java.lang.Object r5 = r0.f1565n
                r6 = r5
                o.j r6 = (o.j) r6
                java.lang.Object r5 = r0.f1564m
                o.u$a r5 = (o.u.a) r5
                kotlin.ResultKt.throwOnFailure(r7)
                goto L53
            L41:
                kotlin.ResultKt.throwOnFailure(r7)
                o.i r7 = r5.f1559j
                r0.f1564m = r5
                r0.f1565n = r6
                r0.f1562k = r4
                java.lang.Object r7 = o.k.v(r7, r6, r0)
                if (r7 != r1) goto L53
                return r1
            L53:
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L6f
                kotlin.jvm.functions.Function3 r5 = r5.f1560k
                r2 = 0
                r0.f1564m = r2
                r0.f1565n = r2
                r0.f1562k = r3
                r2 = 6
                kotlin.jvm.internal.InlineMarker.mark(r2)
                java.lang.Object r5 = r5.invoke(r6, r7, r0)
                r6 = 7
                kotlin.jvm.internal.InlineMarker.mark(r6)
                if (r5 != r1) goto L6f
                return r1
            L6f:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: o.u.a.collect(o.j, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", i = {0}, l = {156}, m = "catchImpl", n = {"fromDownstream"}, s = {"L$0"})
    /* loaded from: classes2.dex */
    public static final class b<T> extends ContinuationImpl {

        /* renamed from: j */
        public Object f1566j;

        /* renamed from: k */
        public /* synthetic */ Object f1567k;

        /* renamed from: l */
        public int f1568l;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f1567k = obj;
            this.f1568l |= Integer.MIN_VALUE;
            return k.v(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class c<T> implements j {

        /* renamed from: j */
        public final /* synthetic */ j<T> f1569j;

        /* renamed from: k */
        public final /* synthetic */ Ref.ObjectRef<Throwable> f1570k;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", i = {0}, l = {158}, m = "emit", n = {"this"}, s = {"L$0"})
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: j */
            public Object f1571j;

            /* renamed from: k */
            public /* synthetic */ Object f1572k;

            /* renamed from: l */
            public final /* synthetic */ c<T> f1573l;

            /* renamed from: m */
            public int f1574m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(c<? super T> cVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f1573l = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1572k = obj;
                this.f1574m |= Integer.MIN_VALUE;
                return this.f1573l.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(j<? super T> jVar, Ref.ObjectRef<Throwable> objectRef) {
            this.f1569j = jVar;
            this.f1570k = objectRef;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0035  */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Throwable, T] */
        @Override // o.j
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof o.u.c.a
                if (r0 == 0) goto L13
                r0 = r6
                o.u$c$a r0 = (o.u.c.a) r0
                int r1 = r0.f1574m
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f1574m = r1
                goto L18
            L13:
                o.u$c$a r0 = new o.u$c$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f1572k
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f1574m
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r4 = r0.f1571j
                o.u$c r4 = (o.u.c) r4
                kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L48
                goto L45
            L2d:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L35:
                kotlin.ResultKt.throwOnFailure(r6)
                o.j<T> r6 = r4.f1569j     // Catch: java.lang.Throwable -> L48
                r0.f1571j = r4     // Catch: java.lang.Throwable -> L48
                r0.f1574m = r3     // Catch: java.lang.Throwable -> L48
                java.lang.Object r4 = r6.emit(r5, r0)     // Catch: java.lang.Throwable -> L48
                if (r4 != r1) goto L45
                return r1
            L45:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
            L48:
                r5 = move-exception
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Throwable> r4 = r4.f1570k
                r4.element = r5
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: o.u.c.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"T", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1", f = "Errors.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class d extends SuspendLambda implements Function2<Throwable, Continuation<? super Boolean>, Object> {

        /* renamed from: j */
        public int f1575j;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* renamed from: i */
        public final Object invoke(@NotNull Throwable th, @Nullable Continuation<? super Boolean> continuation) {
            return ((d) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f1575j == 0) {
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(true);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@"}, d2 = {"T", "Lo/j;", "", "cause", "", "attempt", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3", f = "Errors.kt", i = {}, l = {R.styleable.AppCompatTheme_searchViewStyle}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class e extends SuspendLambda implements Function4<j<? super T>, Throwable, Long, Continuation<? super Boolean>, Object> {

        /* renamed from: j */
        public int f1576j;

        /* renamed from: k */
        public /* synthetic */ Object f1577k;

        /* renamed from: l */
        public /* synthetic */ long f1578l;

        /* renamed from: m */
        public final /* synthetic */ long f1579m;

        /* renamed from: n */
        public final /* synthetic */ Function2<Throwable, Continuation<? super Boolean>, Object> f1580n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(long j2, Function2<? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super e> continuation) {
            super(4, continuation);
            this.f1579m = j2;
            this.f1580n = function2;
        }

        @Nullable
        public final Object i(@NotNull j<? super T> jVar, @NotNull Throwable th, long j2, @Nullable Continuation<? super Boolean> continuation) {
            e eVar = new e(this.f1579m, this.f1580n, continuation);
            eVar.f1577k = th;
            eVar.f1578l = j2;
            return eVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Throwable th, Long l2, Continuation<? super Boolean> continuation) {
            return i((j) obj, th, l2.longValue(), continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0037, code lost:
            if (((java.lang.Boolean) r8).booleanValue() != false) goto L8;
         */
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
                int r1 = r7.f1576j
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.ResultKt.throwOnFailure(r8)
                goto L31
            Lf:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L17:
                kotlin.ResultKt.throwOnFailure(r8)
                java.lang.Object r8 = r7.f1577k
                java.lang.Throwable r8 = (java.lang.Throwable) r8
                long r3 = r7.f1578l
                long r5 = r7.f1579m
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L3a
                kotlin.jvm.functions.Function2<java.lang.Throwable, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r1 = r7.f1580n
                r7.f1576j = r2
                java.lang.Object r8 = r1.invoke(r8, r7)
                if (r8 != r0) goto L31
                return r0
            L31:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r7 = r8.booleanValue()
                if (r7 == 0) goto L3a
                goto L3b
            L3a:
                r2 = 0
            L3b:
                java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: o.u.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class f implements i<T> {

        /* renamed from: j */
        public final /* synthetic */ i f1581j;

        /* renamed from: k */
        public final /* synthetic */ Function4 f1582k;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", f = "Errors.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {R.styleable.AppCompatTheme_windowActionBar, R.styleable.AppCompatTheme_windowActionModeOverlay}, m = "collect", n = {"this", "$this$retryWhen_u24lambda_u2d2", "attempt", "shallRetry", "this", "$this$retryWhen_u24lambda_u2d2", "cause", "attempt"}, s = {"L$0", "L$1", "J$0", "I$0", "L$0", "L$1", "L$2", "J$0"})
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: j */
            public /* synthetic */ Object f1583j;

            /* renamed from: k */
            public int f1584k;

            /* renamed from: m */
            public Object f1586m;

            /* renamed from: n */
            public Object f1587n;

            /* renamed from: o */
            public Object f1588o;

            /* renamed from: p */
            public long f1589p;

            /* renamed from: q */
            public int f1590q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Continuation continuation) {
                super(continuation);
                f.this = r1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1583j = obj;
                this.f1584k |= Integer.MIN_VALUE;
                return f.this.collect(null, this);
            }
        }

        public f(i iVar, Function4 function4) {
            this.f1581j = iVar;
            this.f1582k = function4;
        }

        /* JADX WARN: Removed duplicated region for block: B:44:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0075 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00b1  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x007c -> B:64:0x00ab). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x009a -> B:60:0x009d). Please submit an issue!!! */
        @Override // o.i
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull o.j<? super T> r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
            /*
                r12 = this;
                boolean r0 = r14 instanceof o.u.f.a
                if (r0 == 0) goto L13
                r0 = r14
                o.u$f$a r0 = (o.u.f.a) r0
                int r1 = r0.f1584k
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f1584k = r1
                goto L18
            L13:
                o.u$f$a r0 = new o.u$f$a
                r0.<init>(r14)
            L18:
                java.lang.Object r14 = r0.f1583j
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f1584k
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L5a
                if (r2 == r4) goto L43
                if (r2 != r3) goto L3b
                long r12 = r0.f1589p
                java.lang.Object r2 = r0.f1588o
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                java.lang.Object r5 = r0.f1587n
                o.j r5 = (o.j) r5
                java.lang.Object r6 = r0.f1586m
                o.u$f r6 = (o.u.f) r6
                kotlin.ResultKt.throwOnFailure(r14)
                goto L9d
            L3b:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L43:
                int r12 = r0.f1590q
                long r5 = r0.f1589p
                java.lang.Object r13 = r0.f1587n
                o.j r13 = (o.j) r13
                java.lang.Object r2 = r0.f1586m
                o.u$f r2 = (o.u.f) r2
                kotlin.ResultKt.throwOnFailure(r14)
                r9 = r14
                r14 = r12
                r10 = r5
                r5 = r13
                r6 = r2
                r12 = r10
                r2 = r9
                goto L7a
            L5a:
                kotlin.ResultKt.throwOnFailure(r14)
                r5 = 0
            L5f:
                r14 = 0
                o.i r2 = r12.f1581j
                r0.f1586m = r12
                r0.f1587n = r13
                r7 = 0
                r0.f1588o = r7
                r0.f1589p = r5
                r0.f1590q = r14
                r0.f1584k = r4
                java.lang.Object r2 = o.k.v(r2, r13, r0)
                if (r2 != r1) goto L76
                return r1
            L76:
                r9 = r5
                r6 = r12
                r5 = r13
                r12 = r9
            L7a:
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                if (r2 == 0) goto Lab
                kotlin.jvm.functions.Function4 r14 = r6.f1582k
                java.lang.Long r7 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r12)
                r0.f1586m = r6
                r0.f1587n = r5
                r0.f1588o = r2
                r0.f1589p = r12
                r0.f1584k = r3
                r8 = 6
                kotlin.jvm.internal.InlineMarker.mark(r8)
                java.lang.Object r14 = r14.invoke(r5, r2, r7, r0)
                r7 = 7
                kotlin.jvm.internal.InlineMarker.mark(r7)
                if (r14 != r1) goto L9d
                return r1
            L9d:
                java.lang.Boolean r14 = (java.lang.Boolean) r14
                boolean r14 = r14.booleanValue()
                if (r14 == 0) goto Laa
                r7 = 1
                long r12 = r12 + r7
                r14 = r4
                goto Lab
            Laa:
                throw r2
            Lab:
                r9 = r12
                r13 = r5
                r12 = r6
                r5 = r9
                if (r14 != 0) goto L5f
                kotlin.Unit r12 = kotlin.Unit.INSTANCE
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: o.u.f.collect(o.j, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @NotNull
    public static final <T> i<T> a(@NotNull i<? extends T> iVar, @NotNull Function3<? super j<? super T>, ? super Throwable, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return new a(iVar, function3);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0037  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object b(@org.jetbrains.annotations.NotNull o.i<? extends T> r4, @org.jetbrains.annotations.NotNull o.j<? super T> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Throwable> r6) {
        /*
            boolean r0 = r6 instanceof o.u.b
            if (r0 == 0) goto L13
            r0 = r6
            o.u$b r0 = (o.u.b) r0
            int r1 = r0.f1568l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1568l = r1
            goto L18
        L13:
            o.u$b r0 = new o.u$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f1567k
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f1568l
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f1566j
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r5 = move-exception
            goto L53
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            o.u$c r2 = new o.u$c     // Catch: java.lang.Throwable -> L51
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L51
            r0.f1566j = r6     // Catch: java.lang.Throwable -> L51
            r0.f1568l = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: java.lang.Throwable -> L51
            if (r4 != r1) goto L4f
            return r1
        L4f:
            r4 = 0
            return r4
        L51:
            r5 = move-exception
            r4 = r6
        L53:
            T r4 = r4.element
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = d(r5, r4)
            if (r6 != 0) goto L76
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            boolean r6 = c(r5, r6)
            if (r6 != 0) goto L76
            if (r4 != 0) goto L6a
            return r5
        L6a:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L72
            kotlin.ExceptionsKt.addSuppressed(r4, r5)
            throw r4
        L72:
            kotlin.ExceptionsKt.addSuppressed(r5, r4)
            throw r5
        L76:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.u.b(o.i, o.j, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final boolean c(Throwable th, CoroutineContext coroutineContext) {
        n2 n2Var = (n2) coroutineContext.get(n2.f488b);
        if (n2Var == null || !n2Var.isCancelled()) {
            return false;
        }
        return d(th, n2Var.u());
    }

    public static final boolean d(Throwable th, Throwable th2) {
        return th2 != null && Intrinsics.areEqual(th2, th);
    }

    @NotNull
    public static final <T> i<T> e(@NotNull i<? extends T> iVar, long j2, @NotNull Function2<? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        if (j2 > 0) {
            return k.x1(iVar, new e(j2, function2, null));
        }
        throw new IllegalArgumentException(("Expected positive amount of retries, but had " + j2).toString());
    }

    public static /* synthetic */ i f(i iVar, long j2, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = Long.MAX_VALUE;
        }
        if ((i2 & 2) != 0) {
            function2 = new d(null);
        }
        return k.v1(iVar, j2, function2);
    }

    @NotNull
    public static final <T> i<T> g(@NotNull i<? extends T> iVar, @NotNull Function4<? super j<? super T>, ? super Throwable, ? super Long, ? super Continuation<? super Boolean>, ? extends Object> function4) {
        return new f(iVar, function4);
    }
}
