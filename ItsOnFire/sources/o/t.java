package o;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\u001au\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022D\b\u0005\u0010\f\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001au\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022D\b\u0005\u0010\f\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\u0002\b\u000bH\u0081\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000e\u001aU\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022-\u0010\u0011\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0010¢\u0006\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001al\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022D\u0010\u0011\u001a@\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0015\u0012\u0013\u0018\u00010\u0014¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u000e\u001aU\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022-\u0010\u0011\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0010¢\u0006\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0013\u001a\u0010\u0010\u0018\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\u0004H\u0000\u001as\u0010\u0019\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042D\u0010\u0011\u001a@\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0015\u0012\u0013\u0018\u00010\u0014¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\u0002\b\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"T", "R", "Lo/i;", "Lkotlin/Function3;", "Lo/j;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "transform", "g", "(Lo/i;Lkotlin/jvm/functions/Function3;)Lo/i;", "h", "Lkotlin/Function2;", "action", "f", "(Lo/i;Lkotlin/jvm/functions/Function2;)Lo/i;", "", "cause", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "e", "b", "c", "(Lo/j;Lkotlin/jvm/functions/Function3;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes2.dex */
public final /* synthetic */ class t {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", f = "Emitters.kt", i = {0}, l = {216}, m = "invokeSafely$FlowKt__EmittersKt", n = {"cause"}, s = {"L$0"})
    /* loaded from: classes2.dex */
    public static final class a<T> extends ContinuationImpl {

        /* renamed from: j  reason: collision with root package name */
        public Object f1509j;

        /* renamed from: k  reason: collision with root package name */
        public /* synthetic */ Object f1510k;

        /* renamed from: l  reason: collision with root package name */
        public int f1511l;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f1510k = obj;
            this.f1511l |= Integer.MIN_VALUE;
            return t.c(null, null, null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class b implements i<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ i f1512j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Function3 f1513k;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 1, 2}, l = {R.styleable.AppCompatTheme_tooltipForegroundColor, R.styleable.AppCompatTheme_windowFixedHeightMinor, 128}, m = "collect", n = {"this", "$this$onCompletion_u24lambda_u2d2", "e", "sc"}, s = {"L$0", "L$1", "L$0", "L$0"})
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1514j;

            /* renamed from: k  reason: collision with root package name */
            public int f1515k;

            /* renamed from: m  reason: collision with root package name */
            public Object f1517m;

            /* renamed from: n  reason: collision with root package name */
            public Object f1518n;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1514j = obj;
                this.f1515k |= Integer.MIN_VALUE;
                return b.this.collect(null, this);
            }
        }

        public b(i iVar, Function3 function3) {
            this.f1512j = iVar;
            this.f1513k = function3;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0084 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
        @Override // o.i
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull o.j<? super T> r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof o.t.b.a
                if (r0 == 0) goto L13
                r0 = r10
                o.t$b$a r0 = (o.t.b.a) r0
                int r1 = r0.f1515k
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f1515k = r1
                goto L18
            L13:
                o.t$b$a r0 = new o.t$b$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f1514j
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f1515k
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L53
                if (r2 == r5) goto L46
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r8 = r0.f1517m
                p.v r8 = (p.v) r8
                kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L34
                goto L86
            L34:
                r9 = move-exception
                goto L8e
            L36:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3e:
                java.lang.Object r8 = r0.f1517m
                java.lang.Throwable r8 = (java.lang.Throwable) r8
                kotlin.ResultKt.throwOnFailure(r10)
                goto Laa
            L46:
                java.lang.Object r8 = r0.f1518n
                r9 = r8
                o.j r9 = (o.j) r9
                java.lang.Object r8 = r0.f1517m
                o.t$b r8 = (o.t.b) r8
                kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L92
                goto L65
            L53:
                kotlin.ResultKt.throwOnFailure(r10)
                o.i r10 = r8.f1512j     // Catch: java.lang.Throwable -> L92
                r0.f1517m = r8     // Catch: java.lang.Throwable -> L92
                r0.f1518n = r9     // Catch: java.lang.Throwable -> L92
                r0.f1515k = r5     // Catch: java.lang.Throwable -> L92
                java.lang.Object r10 = r10.collect(r9, r0)     // Catch: java.lang.Throwable -> L92
                if (r10 != r1) goto L65
                return r1
            L65:
                p.v r10 = new p.v
                kotlin.coroutines.CoroutineContext r2 = r0.getContext()
                r10.<init>(r9, r2)
                kotlin.jvm.functions.Function3 r8 = r8.f1513k     // Catch: java.lang.Throwable -> L8c
                r0.f1517m = r10     // Catch: java.lang.Throwable -> L8c
                r0.f1518n = r6     // Catch: java.lang.Throwable -> L8c
                r0.f1515k = r3     // Catch: java.lang.Throwable -> L8c
                r9 = 6
                kotlin.jvm.internal.InlineMarker.mark(r9)     // Catch: java.lang.Throwable -> L8c
                java.lang.Object r8 = r8.invoke(r10, r6, r0)     // Catch: java.lang.Throwable -> L8c
                r9 = 7
                kotlin.jvm.internal.InlineMarker.mark(r9)     // Catch: java.lang.Throwable -> L8c
                if (r8 != r1) goto L85
                return r1
            L85:
                r8 = r10
            L86:
                r8.releaseIntercepted()
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            L8c:
                r9 = move-exception
                r8 = r10
            L8e:
                r8.releaseIntercepted()
                throw r9
            L92:
                r9 = move-exception
                r7 = r9
                r9 = r8
                r8 = r7
                o.z0 r10 = new o.z0
                r10.<init>(r8)
                kotlin.jvm.functions.Function3 r9 = r9.f1513k
                r0.f1517m = r8
                r0.f1518n = r6
                r0.f1515k = r4
                java.lang.Object r9 = o.t.a(r10, r9, r8, r0)
                if (r9 != r1) goto Laa
                return r1
            Laa:
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: o.t.b.collect(o.j, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class c implements i<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ i f1519j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Function2 f1520k;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 0, 1}, l = {R.styleable.AppCompatTheme_tooltipForegroundColor, R.styleable.AppCompatTheme_windowFixedWidthMajor}, m = "collect", n = {"this", "$this$onEmpty_u24lambda_u2d3", "isEmpty", "collector"}, s = {"L$0", "L$1", "L$2", "L$0"})
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1521j;

            /* renamed from: k  reason: collision with root package name */
            public int f1522k;

            /* renamed from: m  reason: collision with root package name */
            public Object f1524m;

            /* renamed from: n  reason: collision with root package name */
            public Object f1525n;

            /* renamed from: o  reason: collision with root package name */
            public Object f1526o;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1521j = obj;
                this.f1522k |= Integer.MIN_VALUE;
                return c.this.collect(null, this);
            }
        }

        public c(i iVar, Function2 function2) {
            this.f1519j = iVar;
            this.f1520k = function2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
        /* JADX WARN: Type inference failed for: r6v0, types: [o.t$c, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v1, types: [p.v] */
        /* JADX WARN: Type inference failed for: r6v13 */
        /* JADX WARN: Type inference failed for: r6v14 */
        /* JADX WARN: Type inference failed for: r6v7, types: [p.v] */
        /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, o.j, o.j<? super T>] */
        @Override // o.i
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull o.j<? super T> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof o.t.c.a
                if (r0 == 0) goto L13
                r0 = r8
                o.t$c$a r0 = (o.t.c.a) r0
                int r1 = r0.f1522k
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f1522k = r1
                goto L18
            L13:
                o.t$c$a r0 = new o.t$c$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f1521j
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f1522k
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L4a
                if (r2 == r4) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r6 = r0.f1524m
                p.v r6 = (p.v) r6
                kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L30
                goto L93
            L30:
                r7 = move-exception
                goto L97
            L32:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L3a:
                java.lang.Object r6 = r0.f1526o
                kotlin.jvm.internal.Ref$BooleanRef r6 = (kotlin.jvm.internal.Ref.BooleanRef) r6
                java.lang.Object r7 = r0.f1525n
                o.j r7 = (o.j) r7
                java.lang.Object r2 = r0.f1524m
                o.t$c r2 = (o.t.c) r2
                kotlin.ResultKt.throwOnFailure(r8)
                goto L6c
            L4a:
                kotlin.ResultKt.throwOnFailure(r8)
                kotlin.jvm.internal.Ref$BooleanRef r8 = new kotlin.jvm.internal.Ref$BooleanRef
                r8.<init>()
                r8.element = r4
                o.i r2 = r6.f1519j
                o.t$d r5 = new o.t$d
                r5.<init>(r8, r7)
                r0.f1524m = r6
                r0.f1525n = r7
                r0.f1526o = r8
                r0.f1522k = r4
                java.lang.Object r2 = r2.collect(r5, r0)
                if (r2 != r1) goto L6a
                return r1
            L6a:
                r2 = r6
                r6 = r8
            L6c:
                boolean r6 = r6.element
                if (r6 == 0) goto L9b
                p.v r6 = new p.v
                kotlin.coroutines.CoroutineContext r8 = r0.getContext()
                r6.<init>(r7, r8)
                kotlin.jvm.functions.Function2 r7 = r2.f1520k     // Catch: java.lang.Throwable -> L30
                r0.f1524m = r6     // Catch: java.lang.Throwable -> L30
                r8 = 0
                r0.f1525n = r8     // Catch: java.lang.Throwable -> L30
                r0.f1526o = r8     // Catch: java.lang.Throwable -> L30
                r0.f1522k = r3     // Catch: java.lang.Throwable -> L30
                r8 = 6
                kotlin.jvm.internal.InlineMarker.mark(r8)     // Catch: java.lang.Throwable -> L30
                java.lang.Object r7 = r7.invoke(r6, r0)     // Catch: java.lang.Throwable -> L30
                r8 = 7
                kotlin.jvm.internal.InlineMarker.mark(r8)     // Catch: java.lang.Throwable -> L30
                if (r7 != r1) goto L93
                return r1
            L93:
                r6.releaseIntercepted()
                goto L9b
            L97:
                r6.releaseIntercepted()
                throw r7
            L9b:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o.t.c.collect(o.j, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class d<T> implements j {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f1527j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ j<T> f1528k;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$1$1", f = "Emitters.kt", i = {}, l = {185}, m = "emit", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1529j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ d<T> f1530k;

            /* renamed from: l  reason: collision with root package name */
            public int f1531l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(d<? super T> dVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f1530k = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1529j = obj;
                this.f1531l |= Integer.MIN_VALUE;
                return this.f1530k.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d(Ref.BooleanRef booleanRef, j<? super T> jVar) {
            this.f1527j = booleanRef;
            this.f1528k = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        @Override // o.j
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof o.t.d.a
                if (r0 == 0) goto L13
                r0 = r6
                o.t$d$a r0 = (o.t.d.a) r0
                int r1 = r0.f1531l
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f1531l = r1
                goto L18
            L13:
                o.t$d$a r0 = new o.t$d$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f1529j
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f1531l
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.ResultKt.throwOnFailure(r6)
                goto L44
            L29:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L31:
                kotlin.ResultKt.throwOnFailure(r6)
                kotlin.jvm.internal.Ref$BooleanRef r6 = r4.f1527j
                r2 = 0
                r6.element = r2
                o.j<T> r4 = r4.f1528k
                r0.f1531l = r3
                java.lang.Object r4 = r4.emit(r5, r0)
                if (r4 != r1) goto L44
                return r1
            L44:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: o.t.d.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class e implements i<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Function2 f1532j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ i f1533k;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 0}, l = {R.styleable.AppCompatTheme_viewInflaterClass, 120}, m = "collect", n = {"this", "$this$onStart_u24lambda_u2d1", "safeCollector"}, s = {"L$0", "L$1", "L$2"})
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1534j;

            /* renamed from: k  reason: collision with root package name */
            public int f1535k;

            /* renamed from: m  reason: collision with root package name */
            public Object f1537m;

            /* renamed from: n  reason: collision with root package name */
            public Object f1538n;

            /* renamed from: o  reason: collision with root package name */
            public Object f1539o;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1534j = obj;
                this.f1535k |= Integer.MIN_VALUE;
                return e.this.collect(null, this);
            }
        }

        public e(Function2 function2, i iVar) {
            this.f1532j = function2;
            this.f1533k = iVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0081 A[RETURN] */
        @Override // o.i
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull o.j<? super T> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof o.t.e.a
                if (r0 == 0) goto L13
                r0 = r7
                o.t$e$a r0 = (o.t.e.a) r0
                int r1 = r0.f1535k
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f1535k = r1
                goto L18
            L13:
                o.t$e$a r0 = new o.t$e$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f1534j
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f1535k
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.ResultKt.throwOnFailure(r7)
                goto L82
            L2c:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L34:
                java.lang.Object r5 = r0.f1539o
                p.v r5 = (p.v) r5
                java.lang.Object r6 = r0.f1538n
                o.j r6 = (o.j) r6
                java.lang.Object r2 = r0.f1537m
                o.t$e r2 = (o.t.e) r2
                kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L44
                goto L6d
            L44:
                r6 = move-exception
                goto L87
            L46:
                kotlin.ResultKt.throwOnFailure(r7)
                p.v r7 = new p.v
                kotlin.coroutines.CoroutineContext r2 = r0.getContext()
                r7.<init>(r6, r2)
                kotlin.jvm.functions.Function2 r2 = r5.f1532j     // Catch: java.lang.Throwable -> L85
                r0.f1537m = r5     // Catch: java.lang.Throwable -> L85
                r0.f1538n = r6     // Catch: java.lang.Throwable -> L85
                r0.f1539o = r7     // Catch: java.lang.Throwable -> L85
                r0.f1535k = r4     // Catch: java.lang.Throwable -> L85
                r4 = 6
                kotlin.jvm.internal.InlineMarker.mark(r4)     // Catch: java.lang.Throwable -> L85
                java.lang.Object r2 = r2.invoke(r7, r0)     // Catch: java.lang.Throwable -> L85
                r4 = 7
                kotlin.jvm.internal.InlineMarker.mark(r4)     // Catch: java.lang.Throwable -> L85
                if (r2 != r1) goto L6b
                return r1
            L6b:
                r2 = r5
                r5 = r7
            L6d:
                r5.releaseIntercepted()
                o.i r5 = r2.f1533k
                r7 = 0
                r0.f1537m = r7
                r0.f1538n = r7
                r0.f1539o = r7
                r0.f1535k = r3
                java.lang.Object r5 = r5.collect(r6, r0)
                if (r5 != r1) goto L82
                return r1
            L82:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            L85:
                r6 = move-exception
                r5 = r7
            L87:
                r5.releaseIntercepted()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o.t.e.collect(o.j, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"T", "R", "Lo/j;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1", f = "Emitters.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class f extends SuspendLambda implements Function2<j<? super R>, Continuation<? super Unit>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public int f1540j;

        /* renamed from: k  reason: collision with root package name */
        public /* synthetic */ Object f1541k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ i<T> f1542l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ Function3<j<? super R>, T, Continuation<? super Unit>, Object> f1543m;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 176)
        /* loaded from: classes2.dex */
        public static final class a<T> implements j {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ Function3<j<? super R>, T, Continuation<? super Unit>, Object> f1544j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ j<R> f1545k;

            @Metadata(k = 3, mv = {1, 6, 0}, xi = 176)
            @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1", f = "Emitters.kt", i = {}, l = {42}, m = "emit", n = {}, s = {})
            /* renamed from: o.t$f$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0078a extends ContinuationImpl {

                /* renamed from: j  reason: collision with root package name */
                public /* synthetic */ Object f1546j;

                /* renamed from: k  reason: collision with root package name */
                public final /* synthetic */ a<T> f1547k;

                /* renamed from: l  reason: collision with root package name */
                public int f1548l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0078a(a<? super T> aVar, Continuation<? super C0078a> continuation) {
                    super(continuation);
                    this.f1547k = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f1546j = obj;
                    this.f1548l |= Integer.MIN_VALUE;
                    return this.f1547k.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a(Function3<? super j<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, j<? super R> jVar) {
                this.f1544j = function3;
                this.f1545k = jVar;
            }

            @Nullable
            public final Object a(T t2, @NotNull Continuation<? super Unit> continuation) {
                InlineMarker.mark(4);
                new C0078a(this, continuation);
                InlineMarker.mark(5);
                this.f1544j.invoke(this.f1545k, t2, continuation);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // o.j
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(T r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof o.t.f.a.C0078a
                    if (r0 == 0) goto L13
                    r0 = r6
                    o.t$f$a$a r0 = (o.t.f.a.C0078a) r0
                    int r1 = r0.f1548l
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f1548l = r1
                    goto L18
                L13:
                    o.t$f$a$a r0 = new o.t$f$a$a
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.f1546j
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f1548l
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.ResultKt.throwOnFailure(r6)
                    goto L41
                L29:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r5)
                    throw r4
                L31:
                    kotlin.ResultKt.throwOnFailure(r6)
                    kotlin.jvm.functions.Function3<o.j<? super R>, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r6 = r4.f1544j
                    o.j<R> r4 = r4.f1545k
                    r0.f1548l = r3
                    java.lang.Object r4 = r6.invoke(r4, r5, r0)
                    if (r4 != r1) goto L41
                    return r1
                L41:
                    kotlin.Unit r4 = kotlin.Unit.INSTANCE
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: o.t.f.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(i<? extends T> iVar, Function3<? super j<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f1542l = iVar;
            this.f1543m = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            f fVar = new f(this.f1542l, this.f1543m, continuation);
            fVar.f1541k = obj;
            return fVar;
        }

        @Nullable
        public final Object i(@NotNull Object obj) {
            i<T> iVar = this.f1542l;
            a aVar = new a(this.f1543m, (j) this.f1541k);
            InlineMarker.mark(0);
            iVar.collect(aVar, this);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull j<? super R> jVar, @Nullable Continuation<? super Unit> continuation) {
            return ((f) create(jVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1540j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                i<T> iVar = this.f1542l;
                a aVar = new a(this.f1543m, (j) this.f1541k);
                this.f1540j = 1;
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

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class g implements i<R> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ i f1549j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Function3 f1550k;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = 176)
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1551j;

            /* renamed from: k  reason: collision with root package name */
            public int f1552k;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1551j = obj;
                this.f1552k |= Integer.MIN_VALUE;
                return g.this.collect(null, this);
            }
        }

        public g(i iVar, Function3 function3) {
            this.f1549j = iVar;
            this.f1550k = function3;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull j<? super R> jVar, @NotNull Continuation<? super Unit> continuation) {
            Object coroutine_suspended;
            Object collect = this.f1549j.collect(new h(this.f1550k, jVar), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return collect == coroutine_suspended ? collect : Unit.INSTANCE;
        }

        @Nullable
        public Object e(@NotNull j jVar, @NotNull Continuation continuation) {
            InlineMarker.mark(4);
            new a(continuation);
            InlineMarker.mark(5);
            i iVar = this.f1549j;
            h hVar = new h(this.f1550k, jVar);
            InlineMarker.mark(0);
            iVar.collect(hVar, continuation);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes2.dex */
    public static final class h<T> implements j {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Function3<j<? super R>, T, Continuation<? super Unit>, Object> f1554j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ j<R> f1555k;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = 176)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1", f = "Emitters.kt", i = {}, l = {R.styleable.AppCompatTheme_colorControlActivated}, m = "emit", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1556j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ h<T> f1557k;

            /* renamed from: l  reason: collision with root package name */
            public int f1558l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(h<? super T> hVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f1557k = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1556j = obj;
                this.f1558l |= Integer.MIN_VALUE;
                return this.f1557k.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public h(Function3<? super j<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, j<? super R> jVar) {
            this.f1554j = function3;
            this.f1555k = jVar;
        }

        @Nullable
        public final Object a(T t2, @NotNull Continuation<? super Unit> continuation) {
            InlineMarker.mark(4);
            new a(this, continuation);
            InlineMarker.mark(5);
            this.f1554j.invoke(this.f1555k, t2, continuation);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        @Override // o.j
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof o.t.h.a
                if (r0 == 0) goto L13
                r0 = r6
                o.t$h$a r0 = (o.t.h.a) r0
                int r1 = r0.f1558l
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f1558l = r1
                goto L18
            L13:
                o.t$h$a r0 = new o.t$h$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f1556j
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f1558l
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.ResultKt.throwOnFailure(r6)
                goto L41
            L29:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L31:
                kotlin.ResultKt.throwOnFailure(r6)
                kotlin.jvm.functions.Function3<o.j<? super R>, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r6 = r4.f1554j
                o.j<R> r4 = r4.f1555k
                r0.f1558l = r3
                java.lang.Object r4 = r6.invoke(r4, r5, r0)
                if (r4 != r1) goto L41
                return r1
            L41:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: o.t.h.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public static final void b(@NotNull j<?> jVar) {
        if (jVar instanceof z0) {
            throw ((z0) jVar).f1811j;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object c(o.j<? super T> r4, kotlin.jvm.functions.Function3<? super o.j<? super T>, ? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r5, java.lang.Throwable r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            boolean r0 = r7 instanceof o.t.a
            if (r0 == 0) goto L13
            r0 = r7
            o.t$a r0 = (o.t.a) r0
            int r1 = r0.f1511l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1511l = r1
            goto L18
        L13:
            o.t$a r0 = new o.t$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f1510k
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f1511l
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.f1509j
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L47
            goto L44
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.ResultKt.throwOnFailure(r7)
            r0.f1509j = r6     // Catch: java.lang.Throwable -> L47
            r0.f1511l = r3     // Catch: java.lang.Throwable -> L47
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L47
            if (r4 != r1) goto L44
            return r1
        L44:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L47:
            r4 = move-exception
            if (r6 == 0) goto L4f
            if (r6 == r4) goto L4f
            kotlin.ExceptionsKt.addSuppressed(r4, r6)
        L4f:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.t.c(o.j, kotlin.jvm.functions.Function3, java.lang.Throwable, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public static final <T> i<T> d(@NotNull i<? extends T> iVar, @NotNull Function3<? super j<? super T>, ? super Throwable, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return new b(iVar, function3);
    }

    @NotNull
    public static final <T> i<T> e(@NotNull i<? extends T> iVar, @NotNull Function2<? super j<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new c(iVar, function2);
    }

    @NotNull
    public static final <T> i<T> f(@NotNull i<? extends T> iVar, @NotNull Function2<? super j<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new e(function2, iVar);
    }

    @NotNull
    public static final <T, R> i<R> g(@NotNull i<? extends T> iVar, @BuilderInference @NotNull Function3<? super j<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return k.I0(new f(iVar, function3, null));
    }

    @PublishedApi
    @NotNull
    public static final <T, R> i<R> h(@NotNull i<? extends T> iVar, @BuilderInference @NotNull Function3<? super j<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return new g(iVar, function3);
    }
}
