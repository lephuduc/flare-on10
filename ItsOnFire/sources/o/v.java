package o;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.BuilderInference;
import kotlin.Metadata;
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

@Metadata(bv = {}, d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002\u001aJ\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a$\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002\u001a+\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000e\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aJ\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000b\u001ar\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0013*\b\u0012\u0004\u0012\u00028\u00000\u00012D\b\u0001\u0010\u0018\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0014¢\u0006\u0002\b\u0017ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aX\u0010\u001b\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000123\b\u0004\u0010\t\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0080Hø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"T", "Lo/i;", "", "count", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "predicate", "e", "(Lo/i;Lkotlin/jvm/functions/Function2;)Lo/i;", "g", "Lo/j;", "value", "", "f", "(Lo/j;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "h", "R", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "Lkotlin/ExtensionFunctionType;", "transform", "i", "(Lo/i;Lkotlin/jvm/functions/Function3;)Lo/i;", "b", "(Lo/i;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes2.dex */
public final /* synthetic */ class v {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 176)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", i = {0}, l = {136}, m = "collectWhile", n = {"collector"}, s = {"L$0"})
    /* loaded from: classes2.dex */
    public static final class a<T> extends ContinuationImpl {

        /* renamed from: j  reason: collision with root package name */
        public Object f1600j;

        /* renamed from: k  reason: collision with root package name */
        public /* synthetic */ Object f1601k;

        /* renamed from: l  reason: collision with root package name */
        public int f1602l;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f1601k = obj;
            this.f1602l |= Integer.MIN_VALUE;
            return v.b(null, null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"o/v$b", "Lo/j;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class b implements o.j<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Function2<T, Continuation<? super Boolean>, Object> f1603j;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = 176)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1", f = "Limit.kt", i = {0}, l = {130}, m = "emit", n = {"this"}, s = {"L$0"})
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public Object f1604j;

            /* renamed from: k  reason: collision with root package name */
            public /* synthetic */ Object f1605k;

            /* renamed from: m  reason: collision with root package name */
            public int f1607m;

            public a(Continuation<? super a> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1605k = obj;
                this.f1607m |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
            this.f1603j = function2;
        }

        @Nullable
        public Object a(T t2, @NotNull Continuation<? super Unit> continuation) {
            InlineMarker.mark(4);
            new a(continuation);
            InlineMarker.mark(5);
            if (((Boolean) this.f1603j.invoke(t2, continuation)).booleanValue()) {
                return Unit.INSTANCE;
            }
            throw new p.a(this);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
        @Override // o.j
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object emit(T r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof o.v.b.a
                if (r0 == 0) goto L13
                r0 = r6
                o.v$b$a r0 = (o.v.b.a) r0
                int r1 = r0.f1607m
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f1607m = r1
                goto L18
            L13:
                o.v$b$a r0 = new o.v$b$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f1605k
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f1607m
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r4 = r0.f1604j
                o.v$b r4 = (o.v.b) r4
                kotlin.ResultKt.throwOnFailure(r6)
                goto L45
            L2d:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L35:
                kotlin.ResultKt.throwOnFailure(r6)
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r6 = r4.f1603j
                r0.f1604j = r4
                r0.f1607m = r3
                java.lang.Object r6 = r6.invoke(r5, r0)
                if (r6 != r1) goto L45
                return r1
            L45:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r5 = r6.booleanValue()
                if (r5 == 0) goto L50
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
            L50:
                p.a r5 = new p.a
                r5.<init>(r4)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: o.v.b.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class c implements o.i<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ o.i f1608j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ int f1609k;

        public c(o.i iVar, int i2) {
            this.f1608j = iVar;
            this.f1609k = i2;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull o.j<? super T> jVar, @NotNull Continuation<? super Unit> continuation) {
            Object coroutine_suspended;
            Object collect = this.f1608j.collect(new d(new Ref.IntRef(), this.f1609k, jVar), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return collect == coroutine_suspended ? collect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class d<T> implements o.j {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Ref.IntRef f1610j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ int f1611k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ o.j<T> f1612l;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", f = "Limit.kt", i = {}, l = {25}, m = "emit", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1613j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ d<T> f1614k;

            /* renamed from: l  reason: collision with root package name */
            public int f1615l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(d<? super T> dVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f1614k = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1613j = obj;
                this.f1615l |= Integer.MIN_VALUE;
                return this.f1614k.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d(Ref.IntRef intRef, int i2, o.j<? super T> jVar) {
            this.f1610j = intRef;
            this.f1611k = i2;
            this.f1612l = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        @Override // o.j
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof o.v.d.a
                if (r0 == 0) goto L13
                r0 = r7
                o.v$d$a r0 = (o.v.d.a) r0
                int r1 = r0.f1615l
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f1615l = r1
                goto L18
            L13:
                o.v$d$a r0 = new o.v$d$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f1613j
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f1615l
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.ResultKt.throwOnFailure(r7)
                goto L47
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.ResultKt.throwOnFailure(r7)
                kotlin.jvm.internal.Ref$IntRef r7 = r5.f1610j
                int r2 = r7.element
                int r4 = r5.f1611k
                if (r2 < r4) goto L4a
                o.j<T> r5 = r5.f1612l
                r0.f1615l = r3
                java.lang.Object r5 = r5.emit(r6, r0)
                if (r5 != r1) goto L47
                return r1
            L47:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            L4a:
                int r2 = r2 + r3
                r7.element = r2
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: o.v.d.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class e implements o.i<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ o.i f1616j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Function2 f1617k;

        public e(o.i iVar, Function2 function2) {
            this.f1616j = iVar;
            this.f1617k = function2;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull o.j<? super T> jVar, @NotNull Continuation<? super Unit> continuation) {
            Object coroutine_suspended;
            Object collect = this.f1616j.collect(new f(new Ref.BooleanRef(), jVar, this.f1617k), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return collect == coroutine_suspended ? collect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class f<T> implements o.j {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f1618j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ o.j<T> f1619k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Function2<T, Continuation<? super Boolean>, Object> f1620l;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", i = {1, 1}, l = {37, 38, 40}, m = "emit", n = {"this", "value"}, s = {"L$0", "L$1"})
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public Object f1621j;

            /* renamed from: k  reason: collision with root package name */
            public Object f1622k;

            /* renamed from: l  reason: collision with root package name */
            public /* synthetic */ Object f1623l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ f<T> f1624m;

            /* renamed from: n  reason: collision with root package name */
            public int f1625n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(f<? super T> fVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f1624m = fVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1623l = obj;
                this.f1625n |= Integer.MIN_VALUE;
                return this.f1624m.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f(Ref.BooleanRef booleanRef, o.j<? super T> jVar, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
            this.f1618j = booleanRef;
            this.f1619k = jVar;
            this.f1620l = function2;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
        @Override // o.j
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof o.v.f.a
                if (r0 == 0) goto L13
                r0 = r8
                o.v$f$a r0 = (o.v.f.a) r0
                int r1 = r0.f1625n
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f1625n = r1
                goto L18
            L13:
                o.v$f$a r0 = new o.v$f$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.f1623l
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f1625n
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                kotlin.ResultKt.throwOnFailure(r8)
                goto L87
            L2f:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L37:
                java.lang.Object r7 = r0.f1622k
                java.lang.Object r6 = r0.f1621j
                o.v$f r6 = (o.v.f) r6
                kotlin.ResultKt.throwOnFailure(r8)
                goto L6b
            L41:
                kotlin.ResultKt.throwOnFailure(r8)
                goto L59
            L45:
                kotlin.ResultKt.throwOnFailure(r8)
                kotlin.jvm.internal.Ref$BooleanRef r8 = r6.f1618j
                boolean r8 = r8.element
                if (r8 == 0) goto L5c
                o.j<T> r6 = r6.f1619k
                r0.f1625n = r5
                java.lang.Object r6 = r6.emit(r7, r0)
                if (r6 != r1) goto L59
                return r1
            L59:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            L5c:
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r8 = r6.f1620l
                r0.f1621j = r6
                r0.f1622k = r7
                r0.f1625n = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L6b
                return r1
            L6b:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8a
                kotlin.jvm.internal.Ref$BooleanRef r8 = r6.f1618j
                r8.element = r5
                o.j<T> r6 = r6.f1619k
                r8 = 0
                r0.f1621j = r8
                r0.f1622k = r8
                r0.f1625n = r3
                java.lang.Object r6 = r6.emit(r7, r0)
                if (r6 != r1) goto L87
                return r1
            L87:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            L8a:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o.v.f.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", i = {0}, l = {R.styleable.AppCompatTheme_listChoiceBackgroundIndicator}, m = "emitAbort$FlowKt__LimitKt", n = {"$this$emitAbort"}, s = {"L$0"})
    /* loaded from: classes2.dex */
    public static final class g<T> extends ContinuationImpl {

        /* renamed from: j  reason: collision with root package name */
        public Object f1626j;

        /* renamed from: k  reason: collision with root package name */
        public /* synthetic */ Object f1627k;

        /* renamed from: l  reason: collision with root package name */
        public int f1628l;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f1627k = obj;
            this.f1628l |= Integer.MIN_VALUE;
            return v.f(null, null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class h implements o.i<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ o.i f1629j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ int f1630k;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", f = "Limit.kt", i = {0}, l = {R.styleable.AppCompatTheme_tooltipFrameBackground}, m = "collect", n = {"$this$take_u24lambda_u2d4"}, s = {"L$0"})
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1631j;

            /* renamed from: k  reason: collision with root package name */
            public int f1632k;

            /* renamed from: m  reason: collision with root package name */
            public Object f1634m;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1631j = obj;
                this.f1632k |= Integer.MIN_VALUE;
                return h.this.collect(null, this);
            }
        }

        public h(o.i iVar, int i2) {
            this.f1629j = iVar;
            this.f1630k = i2;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|25|6|7|(0)(0)|12|13|14) */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
            r5 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
            p.q.b(r5, r6);
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
        /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, o.j, o.j<? super T>] */
        /* JADX WARN: Type inference failed for: r6v1, types: [o.j] */
        /* JADX WARN: Type inference failed for: r6v2 */
        @Override // o.i
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull o.j<? super T> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof o.v.h.a
                if (r0 == 0) goto L13
                r0 = r7
                o.v$h$a r0 = (o.v.h.a) r0
                int r1 = r0.f1632k
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f1632k = r1
                goto L18
            L13:
                o.v$h$a r0 = new o.v$h$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f1631j
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f1632k
                r3 = 1
                if (r2 == 0) goto L36
                if (r2 != r3) goto L2e
                java.lang.Object r5 = r0.f1634m
                r6 = r5
                o.j r6 = (o.j) r6
                kotlin.ResultKt.throwOnFailure(r7)     // Catch: p.a -> L52
                goto L56
            L2e:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L36:
                kotlin.ResultKt.throwOnFailure(r7)
                kotlin.jvm.internal.Ref$IntRef r7 = new kotlin.jvm.internal.Ref$IntRef
                r7.<init>()
                o.i r2 = r5.f1629j     // Catch: p.a -> L52
                o.v$i r4 = new o.v$i     // Catch: p.a -> L52
                int r5 = r5.f1630k     // Catch: p.a -> L52
                r4.<init>(r7, r5, r6)     // Catch: p.a -> L52
                r0.f1634m = r6     // Catch: p.a -> L52
                r0.f1632k = r3     // Catch: p.a -> L52
                java.lang.Object r5 = r2.collect(r4, r0)     // Catch: p.a -> L52
                if (r5 != r1) goto L56
                return r1
            L52:
                r5 = move-exception
                p.q.b(r5, r6)
            L56:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: o.v.h.collect(o.j, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class i<T> implements o.j {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Ref.IntRef f1635j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ int f1636k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ o.j<T> f1637l;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", f = "Limit.kt", i = {}, l = {61, 63}, m = "emit", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1638j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ i<T> f1639k;

            /* renamed from: l  reason: collision with root package name */
            public int f1640l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(i<? super T> iVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f1639k = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1638j = obj;
                this.f1640l |= Integer.MIN_VALUE;
                return this.f1639k.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public i(Ref.IntRef intRef, int i2, o.j<? super T> jVar) {
            this.f1635j = intRef;
            this.f1636k = i2;
            this.f1637l = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
        @Override // o.j
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof o.v.i.a
                if (r0 == 0) goto L13
                r0 = r7
                o.v$i$a r0 = (o.v.i.a) r0
                int r1 = r0.f1640l
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f1640l = r1
                goto L18
            L13:
                o.v$i$a r0 = new o.v$i$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f1638j
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f1640l
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.ResultKt.throwOnFailure(r7)
                goto L5d
            L2c:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L34:
                kotlin.ResultKt.throwOnFailure(r7)
                goto L51
            L38:
                kotlin.ResultKt.throwOnFailure(r7)
                kotlin.jvm.internal.Ref$IntRef r7 = r5.f1635j
                int r2 = r7.element
                int r2 = r2 + r4
                r7.element = r2
                int r7 = r5.f1636k
                o.j<T> r5 = r5.f1637l
                if (r2 >= r7) goto L54
                r0.f1640l = r4
                java.lang.Object r5 = r5.emit(r6, r0)
                if (r5 != r1) goto L51
                return r1
            L51:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            L54:
                r0.f1640l = r3
                java.lang.Object r5 = o.v.a(r5, r6, r0)
                if (r5 != r1) goto L5d
                return r1
            L5d:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: o.v.i.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class j implements o.i<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ o.i f1641j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Function2 f1642k;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", f = "Limit.kt", i = {0}, l = {R.styleable.AppCompatTheme_windowMinWidthMajor}, m = "collect", n = {"collector$iv"}, s = {"L$0"})
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1643j;

            /* renamed from: k  reason: collision with root package name */
            public int f1644k;

            /* renamed from: m  reason: collision with root package name */
            public Object f1646m;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1643j = obj;
                this.f1644k |= Integer.MIN_VALUE;
                return j.this.collect(null, this);
            }
        }

        public j(o.i iVar, Function2 function2) {
            this.f1641j = iVar;
            this.f1642k = function2;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        @Override // o.i
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull o.j<? super T> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof o.v.j.a
                if (r0 == 0) goto L13
                r0 = r6
                o.v$j$a r0 = (o.v.j.a) r0
                int r1 = r0.f1644k
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f1644k = r1
                goto L18
            L13:
                o.v$j$a r0 = new o.v$j$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f1643j
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f1644k
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r4 = r0.f1646m
                o.v$k r4 = (o.v.k) r4
                kotlin.ResultKt.throwOnFailure(r6)     // Catch: p.a -> L2d
                goto L53
            L2d:
                r5 = move-exception
                goto L50
            L2f:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L37:
                kotlin.ResultKt.throwOnFailure(r6)
                o.i r6 = r4.f1641j
                o.v$k r2 = new o.v$k
                kotlin.jvm.functions.Function2 r4 = r4.f1642k
                r2.<init>(r4, r5)
                r0.f1646m = r2     // Catch: p.a -> L4e
                r0.f1644k = r3     // Catch: p.a -> L4e
                java.lang.Object r4 = r6.collect(r2, r0)     // Catch: p.a -> L4e
                if (r4 != r1) goto L53
                return r1
            L4e:
                r5 = move-exception
                r4 = r2
            L50:
                p.q.b(r5, r4)
            L53:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: o.v.j.collect(o.j, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"o/v$b", "Lo/j;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class k implements o.j<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Function2 f1647j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ o.j f1648k;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda-6$$inlined$collectWhile$1", f = "Limit.kt", i = {0, 0, 1}, l = {142, 143}, m = "emit", n = {"this", "value", "this"}, s = {"L$0", "L$1", "L$0"})
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public Object f1649j;

            /* renamed from: k  reason: collision with root package name */
            public /* synthetic */ Object f1650k;

            /* renamed from: l  reason: collision with root package name */
            public int f1651l;

            /* renamed from: n  reason: collision with root package name */
            public Object f1653n;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1650k = obj;
                this.f1651l |= Integer.MIN_VALUE;
                return k.this.emit(null, this);
            }
        }

        public k(Function2 function2, o.j jVar) {
            this.f1647j = function2;
            this.f1648k = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
        @Override // o.j
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object emit(T r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof o.v.k.a
                if (r0 == 0) goto L13
                r0 = r7
                o.v$k$a r0 = (o.v.k.a) r0
                int r1 = r0.f1651l
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f1651l = r1
                goto L18
            L13:
                o.v$k$a r0 = new o.v$k$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f1650k
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f1651l
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L42
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r5 = r0.f1649j
                o.v$k r5 = (o.v.k) r5
                kotlin.ResultKt.throwOnFailure(r7)
                goto L75
            L30:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L38:
                java.lang.Object r6 = r0.f1653n
                java.lang.Object r5 = r0.f1649j
                o.v$k r5 = (o.v.k) r5
                kotlin.ResultKt.throwOnFailure(r7)
                goto L5c
            L42:
                kotlin.ResultKt.throwOnFailure(r7)
                kotlin.jvm.functions.Function2 r7 = r5.f1647j
                r0.f1649j = r5
                r0.f1653n = r6
                r0.f1651l = r4
                r2 = 6
                kotlin.jvm.internal.InlineMarker.mark(r2)
                java.lang.Object r7 = r7.invoke(r6, r0)
                r2 = 7
                kotlin.jvm.internal.InlineMarker.mark(r2)
                if (r7 != r1) goto L5c
                return r1
            L5c:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 == 0) goto L74
                o.j r7 = r5.f1648k
                r0.f1649j = r5
                r2 = 0
                r0.f1653n = r2
                r0.f1651l = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L75
                return r1
            L74:
                r4 = 0
            L75:
                if (r4 == 0) goto L7a
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            L7a:
                p.a r6 = new p.a
                r6.<init>(r5)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o.v.k.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"T", "R", "Lo/j;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", f = "Limit.kt", i = {0}, l = {152}, m = "invokeSuspend", n = {"collector$iv"}, s = {"L$0"})
    /* loaded from: classes2.dex */
    public static final class l extends SuspendLambda implements Function2<o.j<? super R>, Continuation<? super Unit>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public int f1654j;

        /* renamed from: k  reason: collision with root package name */
        public /* synthetic */ Object f1655k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ o.i<T> f1656l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ Function3<o.j<? super R>, T, Continuation<? super Boolean>, Object> f1657m;

        @Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"o/v$b", "Lo/j;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes2.dex */
        public static final class a implements o.j<T> {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ Function3 f1658j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ o.j f1659k;

            @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
            @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1", f = "Limit.kt", i = {0}, l = {142}, m = "emit", n = {"this"}, s = {"L$0"})
            /* renamed from: o.v$l$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0080a extends ContinuationImpl {

                /* renamed from: j  reason: collision with root package name */
                public Object f1660j;

                /* renamed from: k  reason: collision with root package name */
                public /* synthetic */ Object f1661k;

                /* renamed from: l  reason: collision with root package name */
                public int f1662l;

                public C0080a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f1661k = obj;
                    this.f1662l |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(Function3 function3, o.j jVar) {
                this.f1658j = function3;
                this.f1659k = jVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
            @Override // o.j
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.lang.Object emit(T r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof o.v.l.a.C0080a
                    if (r0 == 0) goto L13
                    r0 = r6
                    o.v$l$a$a r0 = (o.v.l.a.C0080a) r0
                    int r1 = r0.f1662l
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f1662l = r1
                    goto L18
                L13:
                    o.v$l$a$a r0 = new o.v$l$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f1661k
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f1662l
                    r3 = 1
                    if (r2 == 0) goto L35
                    if (r2 != r3) goto L2d
                    java.lang.Object r4 = r0.f1660j
                    o.v$l$a r4 = (o.v.l.a) r4
                    kotlin.ResultKt.throwOnFailure(r6)
                    goto L4f
                L2d:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r5)
                    throw r4
                L35:
                    kotlin.ResultKt.throwOnFailure(r6)
                    kotlin.jvm.functions.Function3 r6 = r4.f1658j
                    o.j r2 = r4.f1659k
                    r0.f1660j = r4
                    r0.f1662l = r3
                    r3 = 6
                    kotlin.jvm.internal.InlineMarker.mark(r3)
                    java.lang.Object r6 = r6.invoke(r2, r5, r0)
                    r5 = 7
                    kotlin.jvm.internal.InlineMarker.mark(r5)
                    if (r6 != r1) goto L4f
                    return r1
                L4f:
                    java.lang.Boolean r6 = (java.lang.Boolean) r6
                    boolean r5 = r6.booleanValue()
                    if (r5 == 0) goto L5a
                    kotlin.Unit r4 = kotlin.Unit.INSTANCE
                    return r4
                L5a:
                    p.a r5 = new p.a
                    r5.<init>(r4)
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: o.v.l.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(o.i<? extends T> iVar, Function3<? super o.j<? super R>, ? super T, ? super Continuation<? super Boolean>, ? extends Object> function3, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f1656l = iVar;
            this.f1657m = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            l lVar = new l(this.f1656l, this.f1657m, continuation);
            lVar.f1655k = obj;
            return lVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull o.j<? super R> jVar, @Nullable Continuation<? super Unit> continuation) {
            return ((l) create(jVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            a aVar;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1654j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                o.i<T> iVar = this.f1656l;
                a aVar2 = new a(this.f1657m, (o.j) this.f1655k);
                try {
                    this.f1655k = aVar2;
                    this.f1654j = 1;
                    if (iVar.collect(aVar2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (p.a e2) {
                    e = e2;
                    aVar = aVar2;
                    p.q.b(e, aVar);
                    return Unit.INSTANCE;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                aVar = (a) this.f1655k;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (p.a e3) {
                    e = e3;
                    p.q.b(e, aVar);
                    return Unit.INSTANCE;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object b(@org.jetbrains.annotations.NotNull o.i<? extends T> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            boolean r0 = r6 instanceof o.v.a
            if (r0 == 0) goto L13
            r0 = r6
            o.v$a r0 = (o.v.a) r0
            int r1 = r0.f1602l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1602l = r1
            goto L18
        L13:
            o.v$a r0 = new o.v$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f1601k
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f1602l
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f1600j
            o.v$b r4 = (o.v.b) r4
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: p.a -> L2d
            goto L4f
        L2d:
            r5 = move-exception
            goto L4c
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.ResultKt.throwOnFailure(r6)
            o.v$b r6 = new o.v$b
            r6.<init>(r5)
            r0.f1600j = r6     // Catch: p.a -> L4a
            r0.f1602l = r3     // Catch: p.a -> L4a
            java.lang.Object r4 = r4.collect(r6, r0)     // Catch: p.a -> L4a
            if (r4 != r1) goto L4f
            return r1
        L4a:
            r5 = move-exception
            r4 = r6
        L4c:
            p.q.b(r5, r4)
        L4f:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.v.b(o.i, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <T> Object c(o.i<? extends T> iVar, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        b bVar = new b(function2);
        try {
            InlineMarker.mark(0);
            iVar.collect(bVar, continuation);
            InlineMarker.mark(1);
        } catch (p.a e2) {
            p.q.b(e2, bVar);
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public static final <T> o.i<T> d(@NotNull o.i<? extends T> iVar, int i2) {
        if (i2 >= 0) {
            return new c(iVar, i2);
        }
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i2).toString());
    }

    @NotNull
    public static final <T> o.i<T> e(@NotNull o.i<? extends T> iVar, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return new e(iVar, function2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object f(o.j<? super T> r4, T r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            boolean r0 = r6 instanceof o.v.g
            if (r0 == 0) goto L13
            r0 = r6
            o.v$g r0 = (o.v.g) r0
            int r1 = r0.f1628l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1628l = r1
            goto L18
        L13:
            o.v$g r0 = new o.v$g
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f1627k
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f1628l
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            java.lang.Object r4 = r0.f1626j
            o.j r4 = (o.j) r4
            kotlin.ResultKt.throwOnFailure(r6)
            goto L43
        L35:
            kotlin.ResultKt.throwOnFailure(r6)
            r0.f1626j = r4
            r0.f1628l = r3
            java.lang.Object r5 = r4.emit(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            p.a r5 = new p.a
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.v.f(o.j, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public static final <T> o.i<T> g(@NotNull o.i<? extends T> iVar, int i2) {
        if (i2 > 0) {
            return new h(iVar, i2);
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " should be positive").toString());
    }

    @NotNull
    public static final <T> o.i<T> h(@NotNull o.i<? extends T> iVar, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return new j(iVar, function2);
    }

    @NotNull
    public static final <T, R> o.i<R> i(@NotNull o.i<? extends T> iVar, @BuilderInference @NotNull Function3<? super o.j<? super R>, ? super T, ? super Continuation<? super Boolean>, ? extends Object> function3) {
        return o.k.I0(new l(iVar, function3, null));
    }
}
