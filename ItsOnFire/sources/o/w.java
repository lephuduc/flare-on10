package o;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import j.c2;
import j.d2;
import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\u001ag\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000227\u0010\t\u001a3\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aq\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\r\u001a\u00020\f27\u0010\t\u001a3\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0002H\u0007\u001a\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0011\u001a9\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u001e\u0010\u0014\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0013\"\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a.\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\fH\u0007\u001at\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022D\b\u0001\u0010\t\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0019\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0018¢\u0006\u0002\b\u001bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001aj\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000229\b\u0005\u0010\t\u001a3\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u000b\u001ac\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000223\b\u0001\u0010\t\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u000b\" \u0010%\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"\"\u001a\u0010'\u001a\u00020&8\u0006X\u0087T¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"T", "R", "Lo/i;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/coroutines/Continuation;", "", "transform", "a", "(Lo/i;Lkotlin/jvm/functions/Function2;)Lo/i;", "", "concurrency", "c", "(Lo/i;ILkotlin/jvm/functions/Function2;)Lo/i;", "e", "", "l", "", "flows", "m", "([Lo/i;)Lo/i;", "f", "Lkotlin/Function3;", "Lo/j;", "", "Lkotlin/ExtensionFunctionType;", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "(Lo/i;Lkotlin/jvm/functions/Function3;)Lo/i;", "b", "k", "I", "h", "()I", "getDEFAULT_CONCURRENCY$annotations", "()V", "DEFAULT_CONCURRENCY", "", "DEFAULT_CONCURRENCY_PROPERTY_NAME", "Ljava/lang/String;", "getDEFAULT_CONCURRENCY_PROPERTY_NAME$annotations", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes2.dex */
public final /* synthetic */ class w {

    /* renamed from: a */
    public static final int f1666a = q.t0.b(k.f1321a, 16, 1, Integer.MAX_VALUE);

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "o/a0$e"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class a implements i<i<? extends R>> {

        /* renamed from: j */
        public final /* synthetic */ i f1667j;

        /* renamed from: k */
        public final /* synthetic */ Function2 f1668k;

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "o/a0$e$b", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* renamed from: o.w$a$a */
        /* loaded from: classes2.dex */
        public static final class C0081a<T> implements j {

            /* renamed from: j */
            public final /* synthetic */ j f1669j;

            /* renamed from: k */
            public final /* synthetic */ Function2 f1670k;

            @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
            @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2", f = "Merge.kt", i = {}, l = {223, 223}, m = "emit", n = {}, s = {})
            /* renamed from: o.w$a$a$a */
            /* loaded from: classes2.dex */
            public static final class C0082a extends ContinuationImpl {

                /* renamed from: j */
                public /* synthetic */ Object f1671j;

                /* renamed from: k */
                public int f1672k;

                /* renamed from: l */
                public Object f1673l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0082a(Continuation continuation) {
                    super(continuation);
                    C0081a.this = r1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f1671j = obj;
                    this.f1672k |= Integer.MIN_VALUE;
                    return C0081a.this.emit(null, this);
                }
            }

            public C0081a(j jVar, Function2 function2) {
                this.f1669j = jVar;
                this.f1670k = function2;
            }

            /* JADX WARN: Removed duplicated region for block: B:35:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x005c A[RETURN] */
            @Override // o.j
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof o.w.a.C0081a.C0082a
                    if (r0 == 0) goto L13
                    r0 = r8
                    o.w$a$a$a r0 = (o.w.a.C0081a.C0082a) r0
                    int r1 = r0.f1672k
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f1672k = r1
                    goto L18
                L13:
                    o.w$a$a$a r0 = new o.w$a$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f1671j
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f1672k
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    kotlin.ResultKt.throwOnFailure(r8)
                    goto L5d
                L2c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L34:
                    java.lang.Object r6 = r0.f1673l
                    o.j r6 = (o.j) r6
                    kotlin.ResultKt.throwOnFailure(r8)
                    goto L51
                L3c:
                    kotlin.ResultKt.throwOnFailure(r8)
                    o.j r8 = r6.f1669j
                    kotlin.jvm.functions.Function2 r6 = r6.f1670k
                    r0.f1673l = r8
                    r0.f1672k = r4
                    java.lang.Object r6 = r6.invoke(r7, r0)
                    if (r6 != r1) goto L4e
                    return r1
                L4e:
                    r5 = r8
                    r8 = r6
                    r6 = r5
                L51:
                    r7 = 0
                    r0.f1673l = r7
                    r0.f1672k = r3
                    java.lang.Object r6 = r6.emit(r8, r0)
                    if (r6 != r1) goto L5d
                    return r1
                L5d:
                    kotlin.Unit r6 = kotlin.Unit.INSTANCE
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: o.w.a.C0081a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(i iVar, Function2 function2) {
            this.f1667j = iVar;
            this.f1668k = function2;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull j jVar, @NotNull Continuation continuation) {
            Object coroutine_suspended;
            Object collect = this.f1667j.collect(new C0081a(jVar, this.f1668k), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return collect == coroutine_suspended ? collect : Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "R", "Lo/j;", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapLatest$1", f = "Merge.kt", i = {}, l = {190, 190}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class b extends SuspendLambda implements Function3<j<? super R>, T, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        public int f1675j;

        /* renamed from: k */
        public /* synthetic */ Object f1676k;

        /* renamed from: l */
        public /* synthetic */ Object f1677l;

        /* renamed from: m */
        public final /* synthetic */ Function2<T, Continuation<? super i<? extends R>>, Object> f1678m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function2<? super T, ? super Continuation<? super i<? extends R>>, ? extends Object> function2, Continuation<? super b> continuation) {
            super(3, continuation);
            this.f1678m = function2;
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* renamed from: i */
        public final Object invoke(@NotNull j<? super R> jVar, T t2, @Nullable Continuation<? super Unit> continuation) {
            b bVar = new b(this.f1678m, continuation);
            bVar.f1676k = jVar;
            bVar.f1677l = t2;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            j jVar;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1675j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                jVar = (j) this.f1676k;
                Object obj2 = this.f1677l;
                Function2<T, Continuation<? super i<? extends R>>, Object> function2 = this.f1678m;
                this.f1676k = jVar;
                this.f1675j = 1;
                obj = function2.invoke(obj2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 != 1) {
                if (i2 == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                jVar = (j) this.f1676k;
                ResultKt.throwOnFailure(obj);
            }
            this.f1676k = null;
            this.f1675j = 2;
            if (k.m0(jVar, (i) obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Nullable
        public final Object j(@NotNull Object obj) {
            Object obj2 = this.f1677l;
            InlineMarker.mark(0);
            k.m0((j) this.f1676k, (i) this.f1678m.invoke(obj2, this), this);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "o/a0$e"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class c implements i<i<? extends R>> {

        /* renamed from: j */
        public final /* synthetic */ i f1679j;

        /* renamed from: k */
        public final /* synthetic */ Function2 f1680k;

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "o/a0$e$b", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* loaded from: classes2.dex */
        public static final class a<T> implements j {

            /* renamed from: j */
            public final /* synthetic */ j f1681j;

            /* renamed from: k */
            public final /* synthetic */ Function2 f1682k;

            @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
            @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2", f = "Merge.kt", i = {}, l = {223, 223}, m = "emit", n = {}, s = {})
            /* renamed from: o.w$c$a$a */
            /* loaded from: classes2.dex */
            public static final class C0083a extends ContinuationImpl {

                /* renamed from: j */
                public /* synthetic */ Object f1683j;

                /* renamed from: k */
                public int f1684k;

                /* renamed from: l */
                public Object f1685l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0083a(Continuation continuation) {
                    super(continuation);
                    a.this = r1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f1683j = obj;
                    this.f1684k |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(j jVar, Function2 function2) {
                this.f1681j = jVar;
                this.f1682k = function2;
            }

            /* JADX WARN: Removed duplicated region for block: B:35:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x005c A[RETURN] */
            @Override // o.j
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof o.w.c.a.C0083a
                    if (r0 == 0) goto L13
                    r0 = r8
                    o.w$c$a$a r0 = (o.w.c.a.C0083a) r0
                    int r1 = r0.f1684k
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f1684k = r1
                    goto L18
                L13:
                    o.w$c$a$a r0 = new o.w$c$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f1683j
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f1684k
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    kotlin.ResultKt.throwOnFailure(r8)
                    goto L5d
                L2c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L34:
                    java.lang.Object r6 = r0.f1685l
                    o.j r6 = (o.j) r6
                    kotlin.ResultKt.throwOnFailure(r8)
                    goto L51
                L3c:
                    kotlin.ResultKt.throwOnFailure(r8)
                    o.j r8 = r6.f1681j
                    kotlin.jvm.functions.Function2 r6 = r6.f1682k
                    r0.f1685l = r8
                    r0.f1684k = r4
                    java.lang.Object r6 = r6.invoke(r7, r0)
                    if (r6 != r1) goto L4e
                    return r1
                L4e:
                    r5 = r8
                    r8 = r6
                    r6 = r5
                L51:
                    r7 = 0
                    r0.f1685l = r7
                    r0.f1684k = r3
                    java.lang.Object r6 = r6.emit(r8, r0)
                    if (r6 != r1) goto L5d
                    return r1
                L5d:
                    kotlin.Unit r6 = kotlin.Unit.INSTANCE
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: o.w.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(i iVar, Function2 function2) {
            this.f1679j = iVar;
            this.f1680k = function2;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull j jVar, @NotNull Continuation continuation) {
            Object coroutine_suspended;
            Object collect = this.f1679j.collect(new a(jVar, this.f1680k), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return collect == coroutine_suspended ? collect : Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class d implements i<T> {

        /* renamed from: j */
        public final /* synthetic */ i f1687j;

        public d(i iVar) {
            this.f1687j = iVar;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull j<? super T> jVar, @NotNull Continuation<? super Unit> continuation) {
            Object coroutine_suspended;
            Object collect = this.f1687j.collect(new e(jVar), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return collect == coroutine_suspended ? collect : Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lo/i;", "value", "", "a", "(Lo/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class e<T> implements j {

        /* renamed from: j */
        public final /* synthetic */ j<T> f1688j;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1", f = "Merge.kt", i = {}, l = {R.styleable.AppCompatTheme_listPreferredItemHeightLarge}, m = "emit", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: j */
            public /* synthetic */ Object f1689j;

            /* renamed from: k */
            public final /* synthetic */ e<T> f1690k;

            /* renamed from: l */
            public int f1691l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(e<? super T> eVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f1690k = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1689j = obj;
                this.f1691l |= Integer.MIN_VALUE;
                return this.f1690k.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public e(j<? super T> jVar) {
            this.f1688j = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0031  */
        @Override // o.j
        @org.jetbrains.annotations.Nullable
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(@org.jetbrains.annotations.NotNull o.i<? extends T> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof o.w.e.a
                if (r0 == 0) goto L13
                r0 = r6
                o.w$e$a r0 = (o.w.e.a) r0
                int r1 = r0.f1691l
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f1691l = r1
                goto L18
            L13:
                o.w$e$a r0 = new o.w$e$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f1689j
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f1691l
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.ResultKt.throwOnFailure(r6)
                goto L3f
            L29:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L31:
                kotlin.ResultKt.throwOnFailure(r6)
                o.j<T> r4 = r4.f1688j
                r0.f1691l = r3
                java.lang.Object r4 = o.k.m0(r4, r5, r0)
                if (r4 != r1) goto L3f
                return r1
            L3f:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: o.w.e.emit(o.i, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "R", "Lo/j;", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", i = {}, l = {214, 214}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class f extends SuspendLambda implements Function3<j<? super R>, T, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        public int f1692j;

        /* renamed from: k */
        public /* synthetic */ Object f1693k;

        /* renamed from: l */
        public /* synthetic */ Object f1694l;

        /* renamed from: m */
        public final /* synthetic */ Function2<T, Continuation<? super R>, Object> f1695m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super f> continuation) {
            super(3, continuation);
            this.f1695m = function2;
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* renamed from: i */
        public final Object invoke(@NotNull j<? super R> jVar, T t2, @Nullable Continuation<? super Unit> continuation) {
            f fVar = new f(this.f1695m, continuation);
            fVar.f1693k = jVar;
            fVar.f1694l = t2;
            return fVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            j jVar;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1692j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                jVar = (j) this.f1693k;
                Object obj2 = this.f1694l;
                Function2<T, Continuation<? super R>, Object> function2 = this.f1695m;
                this.f1693k = jVar;
                this.f1692j = 1;
                obj = function2.invoke(obj2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 != 1) {
                if (i2 == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                jVar = (j) this.f1693k;
                ResultKt.throwOnFailure(obj);
            }
            this.f1693k = null;
            this.f1692j = 2;
            if (jVar.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @d2
    @NotNull
    public static final <T, R> i<R> a(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super Continuation<? super i<? extends R>>, ? extends Object> function2) {
        return k.F0(new a(iVar, function2));
    }

    @c2
    @NotNull
    public static final <T, R> i<R> b(@NotNull i<? extends T> iVar, @BuilderInference @NotNull Function2<? super T, ? super Continuation<? super i<? extends R>>, ? extends Object> function2) {
        return k.b2(iVar, new b(function2, null));
    }

    @d2
    @NotNull
    public static final <T, R> i<R> c(@NotNull i<? extends T> iVar, int i2, @NotNull Function2<? super T, ? super Continuation<? super i<? extends R>>, ? extends Object> function2) {
        return k.G0(new c(iVar, function2), i2);
    }

    public static /* synthetic */ i d(i iVar, int i2, Function2 function2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = f1666a;
        }
        return k.C0(iVar, i2, function2);
    }

    @d2
    @NotNull
    public static final <T> i<T> e(@NotNull i<? extends i<? extends T>> iVar) {
        return new d(iVar);
    }

    @d2
    @NotNull
    public static final <T> i<T> f(@NotNull i<? extends i<? extends T>> iVar, int i2) {
        if (i2 > 0) {
            return i2 == 1 ? k.F0(iVar) : new p.g(iVar, i2, null, 0, null, 28, null);
        }
        throw new IllegalArgumentException(("Expected positive concurrency level, but had " + i2).toString());
    }

    public static /* synthetic */ i g(i iVar, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = f1666a;
        }
        return k.G0(iVar, i2);
    }

    public static final int h() {
        return f1666a;
    }

    @d2
    public static /* synthetic */ void i() {
    }

    @d2
    public static /* synthetic */ void j() {
    }

    @c2
    @NotNull
    public static final <T, R> i<R> k(@NotNull i<? extends T> iVar, @BuilderInference @NotNull Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        return k.b2(iVar, new f(function2, null));
    }

    @NotNull
    public static final <T> i<T> l(@NotNull Iterable<? extends i<? extends T>> iterable) {
        return new p.k(iterable, null, 0, null, 14, null);
    }

    @NotNull
    public static final <T> i<T> m(@NotNull i<? extends T>... iVarArr) {
        Iterable asIterable;
        asIterable = ArraysKt___ArraysKt.asIterable(iVarArr);
        return k.Y0(asIterable);
    }

    @c2
    @NotNull
    public static final <T, R> i<R> n(@NotNull i<? extends T> iVar, @BuilderInference @NotNull Function3<? super j<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return new p.j(function3, iVar, null, 0, null, 28, null);
    }
}
