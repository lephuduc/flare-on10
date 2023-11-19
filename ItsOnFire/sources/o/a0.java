package o;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001aO\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012$\b\u0004\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aO\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012$\b\u0004\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\b\u001a\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\n\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0001H\u0086\b\u001a\"\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\u0005*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001\u001ad\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u000123\b\u0004\u0010\u0010\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\b\u001aj\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\n*\u00020\u0005*\b\u0012\u0004\u0012\u00028\u00000\u000125\b\u0004\u0010\u0010\u001a/\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\b\u001a\"\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001aJ\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\u0016\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\b\u001a~\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0018\u001a\u00028\u00012H\b\u0001\u0010\u001b\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0019ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a~\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0018\u001a\u00028\u00012H\b\u0001\u0010\u001b\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0019ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001d\u001an\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012F\u0010\u001b\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0019ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"T", "Lo/i;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "predicate", "a", "(Lo/i;Lkotlin/jvm/functions/Function2;)Lo/i;", "c", "R", "b", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "Lkotlin/ParameterName;", "name", "value", "transform", "e", "f", "Lkotlin/collections/IndexedValue;", "k", "", "action", "g", "initial", "Lkotlin/Function3;", "accumulator", "operation", "j", "(Lo/i;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Lo/i;", "h", "i", "(Lo/i;Lkotlin/jvm/functions/Function3;)Lo/i;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes2.dex */
public final /* synthetic */ class a0 {

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "o/t$g"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class a implements o.i<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ o.i f1047j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Function2 f1048k;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = 176)
        /* renamed from: o.a0$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0062a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1049j;

            /* renamed from: k  reason: collision with root package name */
            public int f1050k;

            public C0062a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1049j = obj;
                this.f1050k |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "o/t$h", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* loaded from: classes2.dex */
        public static final class b<T> implements o.j {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ o.j f1052j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ Function2 f1053k;

            @Metadata(k = 3, mv = {1, 6, 0}, xi = 176)
            @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {223, 223}, m = "emit", n = {"value", "$this$filter_u24lambda_u2d0"}, s = {"L$0", "L$1"})
            /* renamed from: o.a0$a$b$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0063a extends ContinuationImpl {

                /* renamed from: j  reason: collision with root package name */
                public /* synthetic */ Object f1054j;

                /* renamed from: k  reason: collision with root package name */
                public int f1055k;

                /* renamed from: m  reason: collision with root package name */
                public Object f1057m;

                /* renamed from: n  reason: collision with root package name */
                public Object f1058n;

                public C0063a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f1054j = obj;
                    this.f1055k |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(o.j jVar, Function2 function2) {
                this.f1052j = jVar;
                this.f1053k = function2;
            }

            @Nullable
            public final Object a(Object obj, @NotNull Continuation continuation) {
                InlineMarker.mark(4);
                new C0063a(continuation);
                InlineMarker.mark(5);
                o.j jVar = this.f1052j;
                if (((Boolean) this.f1053k.invoke(obj, continuation)).booleanValue()) {
                    InlineMarker.mark(0);
                    jVar.emit(obj, continuation);
                    InlineMarker.mark(1);
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
            @Override // o.j
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(T r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof o.a0.a.b.C0063a
                    if (r0 == 0) goto L13
                    r0 = r8
                    o.a0$a$b$a r0 = (o.a0.a.b.C0063a) r0
                    int r1 = r0.f1055k
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f1055k = r1
                    goto L18
                L13:
                    o.a0$a$b$a r0 = new o.a0$a$b$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f1054j
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f1055k
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    kotlin.ResultKt.throwOnFailure(r8)
                    goto L6b
                L2c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L34:
                    java.lang.Object r6 = r0.f1058n
                    o.j r6 = (o.j) r6
                    java.lang.Object r7 = r0.f1057m
                    kotlin.ResultKt.throwOnFailure(r8)
                    goto L55
                L3e:
                    kotlin.ResultKt.throwOnFailure(r8)
                    o.j r8 = r6.f1052j
                    kotlin.jvm.functions.Function2 r6 = r6.f1053k
                    r0.f1057m = r7
                    r0.f1058n = r8
                    r0.f1055k = r4
                    java.lang.Object r6 = r6.invoke(r7, r0)
                    if (r6 != r1) goto L52
                    return r1
                L52:
                    r5 = r8
                    r8 = r6
                    r6 = r5
                L55:
                    java.lang.Boolean r8 = (java.lang.Boolean) r8
                    boolean r8 = r8.booleanValue()
                    if (r8 == 0) goto L6b
                    r8 = 0
                    r0.f1057m = r8
                    r0.f1058n = r8
                    r0.f1055k = r3
                    java.lang.Object r6 = r6.emit(r7, r0)
                    if (r6 != r1) goto L6b
                    return r1
                L6b:
                    kotlin.Unit r6 = kotlin.Unit.INSTANCE
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: o.a0.a.b.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(o.i iVar, Function2 function2) {
            this.f1047j = iVar;
            this.f1048k = function2;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull o.j jVar, @NotNull Continuation continuation) {
            Object coroutine_suspended;
            Object collect = this.f1047j.collect(new b(jVar, this.f1048k), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return collect == coroutine_suspended ? collect : Unit.INSTANCE;
        }

        @Nullable
        public Object e(@NotNull o.j jVar, @NotNull Continuation continuation) {
            InlineMarker.mark(4);
            new C0062a(continuation);
            InlineMarker.mark(5);
            o.i iVar = this.f1047j;
            b bVar = new b(jVar, this.f1048k);
            InlineMarker.mark(0);
            iVar.collect(bVar, continuation);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "o/a0$a"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class b implements o.i<Object> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ o.i f1059j;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = 176)
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1060j;

            /* renamed from: k  reason: collision with root package name */
            public int f1061k;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1060j = obj;
                this.f1061k |= Integer.MIN_VALUE;
                return b.this.collect(null, this);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "o/a0$a$b", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* renamed from: o.a0$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0064b<T> implements o.j {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ o.j f1063j;

            @Metadata(k = 3, mv = {1, 6, 0}, xi = 176)
            @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2", f = "Transform.kt", i = {}, l = {224}, m = "emit", n = {}, s = {})
            /* renamed from: o.a0$b$b$a */
            /* loaded from: classes2.dex */
            public static final class a extends ContinuationImpl {

                /* renamed from: j  reason: collision with root package name */
                public /* synthetic */ Object f1064j;

                /* renamed from: k  reason: collision with root package name */
                public int f1065k;

                /* renamed from: l  reason: collision with root package name */
                public Object f1066l;

                /* renamed from: m  reason: collision with root package name */
                public Object f1067m;

                public a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f1064j = obj;
                    this.f1065k |= Integer.MIN_VALUE;
                    return C0064b.this.emit(null, this);
                }
            }

            public C0064b(o.j jVar) {
                this.f1063j = jVar;
            }

            @Nullable
            public final Object a(Object obj, @NotNull Continuation continuation) {
                InlineMarker.mark(4);
                new a(continuation);
                InlineMarker.mark(5);
                o.j jVar = this.f1063j;
                Intrinsics.reifiedOperationMarker(3, "R");
                if (obj instanceof Object) {
                    InlineMarker.mark(0);
                    jVar.emit(obj, continuation);
                    InlineMarker.mark(1);
                }
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
            public final java.lang.Object emit(java.lang.Object r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof o.a0.b.C0064b.a
                    if (r0 == 0) goto L13
                    r0 = r6
                    o.a0$b$b$a r0 = (o.a0.b.C0064b.a) r0
                    int r1 = r0.f1065k
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f1065k = r1
                    goto L18
                L13:
                    o.a0$b$b$a r0 = new o.a0$b$b$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f1064j
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f1065k
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.ResultKt.throwOnFailure(r6)
                    goto L49
                L29:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r5)
                    throw r4
                L31:
                    kotlin.ResultKt.throwOnFailure(r6)
                    o.j r4 = r4.f1063j
                    r6 = 3
                    java.lang.String r2 = "R"
                    kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r6, r2)
                    boolean r6 = r5 instanceof java.lang.Object
                    if (r6 == 0) goto L49
                    r0.f1065k = r3
                    java.lang.Object r4 = r4.emit(r5, r0)
                    if (r4 != r1) goto L49
                    return r1
                L49:
                    kotlin.Unit r4 = kotlin.Unit.INSTANCE
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: o.a0.b.C0064b.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(o.i iVar) {
            this.f1059j = iVar;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull o.j<? super Object> jVar, @NotNull Continuation continuation) {
            Object coroutine_suspended;
            o.i iVar = this.f1059j;
            Intrinsics.needClassReification();
            Object collect = iVar.collect(new C0064b(jVar), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return collect == coroutine_suspended ? collect : Unit.INSTANCE;
        }

        @Nullable
        public Object e(@NotNull o.j jVar, @NotNull Continuation continuation) {
            InlineMarker.mark(4);
            new a(continuation);
            InlineMarker.mark(5);
            o.i iVar = this.f1059j;
            Intrinsics.needClassReification();
            C0064b c0064b = new C0064b(jVar);
            InlineMarker.mark(0);
            iVar.collect(c0064b, continuation);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "o/t$g"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class c implements o.i<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ o.i f1069j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Function2 f1070k;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = 176)
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1071j;

            /* renamed from: k  reason: collision with root package name */
            public int f1072k;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1071j = obj;
                this.f1072k |= Integer.MIN_VALUE;
                return c.this.collect(null, this);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "o/t$h", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* loaded from: classes2.dex */
        public static final class b<T> implements o.j {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ o.j f1074j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ Function2 f1075k;

            @Metadata(k = 3, mv = {1, 6, 0}, xi = 176)
            @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {223, 223}, m = "emit", n = {"value", "$this$filterNot_u24lambda_u2d1"}, s = {"L$0", "L$1"})
            /* loaded from: classes2.dex */
            public static final class a extends ContinuationImpl {

                /* renamed from: j  reason: collision with root package name */
                public /* synthetic */ Object f1076j;

                /* renamed from: k  reason: collision with root package name */
                public int f1077k;

                /* renamed from: m  reason: collision with root package name */
                public Object f1079m;

                /* renamed from: n  reason: collision with root package name */
                public Object f1080n;

                public a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f1076j = obj;
                    this.f1077k |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(o.j jVar, Function2 function2) {
                this.f1074j = jVar;
                this.f1075k = function2;
            }

            @Nullable
            public final Object a(Object obj, @NotNull Continuation continuation) {
                InlineMarker.mark(4);
                new a(continuation);
                InlineMarker.mark(5);
                o.j jVar = this.f1074j;
                if (!((Boolean) this.f1075k.invoke(obj, continuation)).booleanValue()) {
                    InlineMarker.mark(0);
                    jVar.emit(obj, continuation);
                    InlineMarker.mark(1);
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
            @Override // o.j
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(T r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof o.a0.c.b.a
                    if (r0 == 0) goto L13
                    r0 = r8
                    o.a0$c$b$a r0 = (o.a0.c.b.a) r0
                    int r1 = r0.f1077k
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f1077k = r1
                    goto L18
                L13:
                    o.a0$c$b$a r0 = new o.a0$c$b$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f1076j
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f1077k
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    kotlin.ResultKt.throwOnFailure(r8)
                    goto L6b
                L2c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L34:
                    java.lang.Object r6 = r0.f1080n
                    o.j r6 = (o.j) r6
                    java.lang.Object r7 = r0.f1079m
                    kotlin.ResultKt.throwOnFailure(r8)
                    goto L55
                L3e:
                    kotlin.ResultKt.throwOnFailure(r8)
                    o.j r8 = r6.f1074j
                    kotlin.jvm.functions.Function2 r6 = r6.f1075k
                    r0.f1079m = r7
                    r0.f1080n = r8
                    r0.f1077k = r4
                    java.lang.Object r6 = r6.invoke(r7, r0)
                    if (r6 != r1) goto L52
                    return r1
                L52:
                    r5 = r8
                    r8 = r6
                    r6 = r5
                L55:
                    java.lang.Boolean r8 = (java.lang.Boolean) r8
                    boolean r8 = r8.booleanValue()
                    if (r8 != 0) goto L6b
                    r8 = 0
                    r0.f1079m = r8
                    r0.f1080n = r8
                    r0.f1077k = r3
                    java.lang.Object r6 = r6.emit(r7, r0)
                    if (r6 != r1) goto L6b
                    return r1
                L6b:
                    kotlin.Unit r6 = kotlin.Unit.INSTANCE
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: o.a0.c.b.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(o.i iVar, Function2 function2) {
            this.f1069j = iVar;
            this.f1070k = function2;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull o.j jVar, @NotNull Continuation continuation) {
            Object coroutine_suspended;
            Object collect = this.f1069j.collect(new b(jVar, this.f1070k), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return collect == coroutine_suspended ? collect : Unit.INSTANCE;
        }

        @Nullable
        public Object e(@NotNull o.j jVar, @NotNull Continuation continuation) {
            InlineMarker.mark(4);
            new a(continuation);
            InlineMarker.mark(5);
            o.i iVar = this.f1069j;
            b bVar = new b(jVar, this.f1070k);
            InlineMarker.mark(0);
            iVar.collect(bVar, continuation);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "o/t$g"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class d implements o.i<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ o.i f1081j;

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "o/t$h", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* loaded from: classes2.dex */
        public static final class a<T> implements o.j {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ o.j f1082j;

            @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
            @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
            /* renamed from: o.a0$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0065a extends ContinuationImpl {

                /* renamed from: j  reason: collision with root package name */
                public /* synthetic */ Object f1083j;

                /* renamed from: k  reason: collision with root package name */
                public int f1084k;

                public C0065a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f1083j = obj;
                    this.f1084k |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(o.j jVar) {
                this.f1082j = jVar;
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
                    boolean r0 = r6 instanceof o.a0.d.a.C0065a
                    if (r0 == 0) goto L13
                    r0 = r6
                    o.a0$d$a$a r0 = (o.a0.d.a.C0065a) r0
                    int r1 = r0.f1084k
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f1084k = r1
                    goto L18
                L13:
                    o.a0$d$a$a r0 = new o.a0$d$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f1083j
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f1084k
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
                    o.j r4 = r4.f1082j
                    if (r5 == 0) goto L41
                    r0.f1084k = r3
                    java.lang.Object r4 = r4.emit(r5, r0)
                    if (r4 != r1) goto L41
                    return r1
                L41:
                    kotlin.Unit r4 = kotlin.Unit.INSTANCE
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: o.a0.d.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public d(o.i iVar) {
            this.f1081j = iVar;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull o.j jVar, @NotNull Continuation continuation) {
            Object coroutine_suspended;
            Object collect = this.f1081j.collect(new a(jVar), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return collect == coroutine_suspended ? collect : Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "o/t$g"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class e implements o.i<R> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ o.i f1086j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Function2 f1087k;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = 176)
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1088j;

            /* renamed from: k  reason: collision with root package name */
            public int f1089k;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1088j = obj;
                this.f1089k |= Integer.MIN_VALUE;
                return e.this.collect(null, this);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "o/t$h", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* loaded from: classes2.dex */
        public static final class b<T> implements o.j {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ o.j f1091j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ Function2 f1092k;

            @Metadata(k = 3, mv = {1, 6, 0}, xi = 176)
            @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {}, l = {223, 223}, m = "emit", n = {}, s = {})
            /* loaded from: classes2.dex */
            public static final class a extends ContinuationImpl {

                /* renamed from: j  reason: collision with root package name */
                public /* synthetic */ Object f1093j;

                /* renamed from: k  reason: collision with root package name */
                public int f1094k;

                /* renamed from: m  reason: collision with root package name */
                public Object f1096m;

                public a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f1093j = obj;
                    this.f1094k |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(o.j jVar, Function2 function2) {
                this.f1091j = jVar;
                this.f1092k = function2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Nullable
            public final Object a(Object obj, @NotNull Continuation continuation) {
                InlineMarker.mark(4);
                new a(continuation);
                InlineMarker.mark(5);
                o.j jVar = this.f1091j;
                Object invoke = this.f1092k.invoke(obj, continuation);
                InlineMarker.mark(0);
                jVar.emit(invoke, continuation);
                InlineMarker.mark(1);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x005c A[RETURN] */
            @Override // o.j
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(T r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof o.a0.e.b.a
                    if (r0 == 0) goto L13
                    r0 = r8
                    o.a0$e$b$a r0 = (o.a0.e.b.a) r0
                    int r1 = r0.f1094k
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f1094k = r1
                    goto L18
                L13:
                    o.a0$e$b$a r0 = new o.a0$e$b$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f1093j
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f1094k
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
                    java.lang.Object r6 = r0.f1096m
                    o.j r6 = (o.j) r6
                    kotlin.ResultKt.throwOnFailure(r8)
                    goto L51
                L3c:
                    kotlin.ResultKt.throwOnFailure(r8)
                    o.j r8 = r6.f1091j
                    kotlin.jvm.functions.Function2 r6 = r6.f1092k
                    r0.f1096m = r8
                    r0.f1094k = r4
                    java.lang.Object r6 = r6.invoke(r7, r0)
                    if (r6 != r1) goto L4e
                    return r1
                L4e:
                    r5 = r8
                    r8 = r6
                    r6 = r5
                L51:
                    r7 = 0
                    r0.f1096m = r7
                    r0.f1094k = r3
                    java.lang.Object r6 = r6.emit(r8, r0)
                    if (r6 != r1) goto L5d
                    return r1
                L5d:
                    kotlin.Unit r6 = kotlin.Unit.INSTANCE
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: o.a0.e.b.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public e(o.i iVar, Function2 function2) {
            this.f1086j = iVar;
            this.f1087k = function2;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull o.j jVar, @NotNull Continuation continuation) {
            Object coroutine_suspended;
            Object collect = this.f1086j.collect(new b(jVar, this.f1087k), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return collect == coroutine_suspended ? collect : Unit.INSTANCE;
        }

        @Nullable
        public Object e(@NotNull o.j jVar, @NotNull Continuation continuation) {
            InlineMarker.mark(4);
            new a(continuation);
            InlineMarker.mark(5);
            o.i iVar = this.f1086j;
            b bVar = new b(jVar, this.f1087k);
            InlineMarker.mark(0);
            iVar.collect(bVar, continuation);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "o/t$g"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class f implements o.i<R> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ o.i f1097j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Function2 f1098k;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = 176)
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1099j;

            /* renamed from: k  reason: collision with root package name */
            public int f1100k;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1099j = obj;
                this.f1100k |= Integer.MIN_VALUE;
                return f.this.collect(null, this);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "o/t$h", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* loaded from: classes2.dex */
        public static final class b<T> implements o.j {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ o.j f1102j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ Function2 f1103k;

            @Metadata(k = 3, mv = {1, 6, 0}, xi = 176)
            @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0}, l = {223, 224}, m = "emit", n = {"$this$mapNotNull_u24lambda_u2d5"}, s = {"L$0"})
            /* loaded from: classes2.dex */
            public static final class a extends ContinuationImpl {

                /* renamed from: j  reason: collision with root package name */
                public /* synthetic */ Object f1104j;

                /* renamed from: k  reason: collision with root package name */
                public int f1105k;

                /* renamed from: m  reason: collision with root package name */
                public Object f1107m;

                public a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f1104j = obj;
                    this.f1105k |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(o.j jVar, Function2 function2) {
                this.f1102j = jVar;
                this.f1103k = function2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Nullable
            public final Object a(Object obj, @NotNull Continuation continuation) {
                InlineMarker.mark(4);
                new a(continuation);
                InlineMarker.mark(5);
                o.j jVar = this.f1102j;
                Object invoke = this.f1103k.invoke(obj, continuation);
                if (invoke != null) {
                    InlineMarker.mark(0);
                    jVar.emit(invoke, continuation);
                    InlineMarker.mark(1);
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
            @Override // o.j
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(T r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof o.a0.f.b.a
                    if (r0 == 0) goto L13
                    r0 = r8
                    o.a0$f$b$a r0 = (o.a0.f.b.a) r0
                    int r1 = r0.f1105k
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f1105k = r1
                    goto L18
                L13:
                    o.a0$f$b$a r0 = new o.a0$f$b$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f1104j
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f1105k
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    kotlin.ResultKt.throwOnFailure(r8)
                    goto L60
                L2c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L34:
                    java.lang.Object r6 = r0.f1107m
                    o.j r6 = (o.j) r6
                    kotlin.ResultKt.throwOnFailure(r8)
                    goto L51
                L3c:
                    kotlin.ResultKt.throwOnFailure(r8)
                    o.j r8 = r6.f1102j
                    kotlin.jvm.functions.Function2 r6 = r6.f1103k
                    r0.f1107m = r8
                    r0.f1105k = r4
                    java.lang.Object r6 = r6.invoke(r7, r0)
                    if (r6 != r1) goto L4e
                    return r1
                L4e:
                    r5 = r8
                    r8 = r6
                    r6 = r5
                L51:
                    if (r8 != 0) goto L54
                    goto L60
                L54:
                    r7 = 0
                    r0.f1107m = r7
                    r0.f1105k = r3
                    java.lang.Object r6 = r6.emit(r8, r0)
                    if (r6 != r1) goto L60
                    return r1
                L60:
                    kotlin.Unit r6 = kotlin.Unit.INSTANCE
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: o.a0.f.b.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public f(o.i iVar, Function2 function2) {
            this.f1097j = iVar;
            this.f1098k = function2;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull o.j jVar, @NotNull Continuation continuation) {
            Object coroutine_suspended;
            Object collect = this.f1097j.collect(new b(jVar, this.f1098k), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return collect == coroutine_suspended ? collect : Unit.INSTANCE;
        }

        @Nullable
        public Object e(@NotNull o.j jVar, @NotNull Continuation continuation) {
            InlineMarker.mark(4);
            new a(continuation);
            InlineMarker.mark(5);
            o.i iVar = this.f1097j;
            b bVar = new b(jVar, this.f1098k);
            InlineMarker.mark(0);
            iVar.collect(bVar, continuation);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "o/t$g"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class g implements o.i<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ o.i f1108j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Function2 f1109k;

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "o/t$h", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* loaded from: classes2.dex */
        public static final class a<T> implements o.j {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ o.j f1110j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ Function2 f1111k;

            @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
            @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {223, 224}, m = "emit", n = {"value", "$this$onEach_u24lambda_u2d7"}, s = {"L$0", "L$1"})
            /* renamed from: o.a0$g$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0066a extends ContinuationImpl {

                /* renamed from: j  reason: collision with root package name */
                public /* synthetic */ Object f1112j;

                /* renamed from: k  reason: collision with root package name */
                public int f1113k;

                /* renamed from: m  reason: collision with root package name */
                public Object f1115m;

                /* renamed from: n  reason: collision with root package name */
                public Object f1116n;

                public C0066a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f1112j = obj;
                    this.f1113k |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(o.j jVar, Function2 function2) {
                this.f1110j = jVar;
                this.f1111k = function2;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0068 A[RETURN] */
            @Override // o.j
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(T r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof o.a0.g.a.C0066a
                    if (r0 == 0) goto L13
                    r0 = r7
                    o.a0$g$a$a r0 = (o.a0.g.a.C0066a) r0
                    int r1 = r0.f1113k
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f1113k = r1
                    goto L18
                L13:
                    o.a0$g$a$a r0 = new o.a0$g$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f1112j
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f1113k
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    kotlin.ResultKt.throwOnFailure(r7)
                    goto L69
                L2c:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L34:
                    java.lang.Object r5 = r0.f1116n
                    o.j r5 = (o.j) r5
                    java.lang.Object r6 = r0.f1115m
                    kotlin.ResultKt.throwOnFailure(r7)
                    goto L5b
                L3e:
                    kotlin.ResultKt.throwOnFailure(r7)
                    o.j r7 = r5.f1110j
                    kotlin.jvm.functions.Function2 r5 = r5.f1111k
                    r0.f1115m = r6
                    r0.f1116n = r7
                    r0.f1113k = r4
                    r2 = 6
                    kotlin.jvm.internal.InlineMarker.mark(r2)
                    java.lang.Object r5 = r5.invoke(r6, r0)
                    r2 = 7
                    kotlin.jvm.internal.InlineMarker.mark(r2)
                    if (r5 != r1) goto L5a
                    return r1
                L5a:
                    r5 = r7
                L5b:
                    r7 = 0
                    r0.f1115m = r7
                    r0.f1116n = r7
                    r0.f1113k = r3
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L69
                    return r1
                L69:
                    kotlin.Unit r5 = kotlin.Unit.INSTANCE
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: o.a0.g.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public g(o.i iVar, Function2 function2) {
            this.f1108j = iVar;
            this.f1109k = function2;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull o.j jVar, @NotNull Continuation continuation) {
            Object coroutine_suspended;
            Object collect = this.f1108j.collect(new a(jVar, this.f1109k), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return collect == coroutine_suspended ? collect : Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class h implements o.i<R> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Object f1117j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ o.i f1118k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Function3 f1119l;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1", f = "Transform.kt", i = {0, 0, 0}, l = {R.styleable.AppCompatTheme_tooltipForegroundColor, R.styleable.AppCompatTheme_tooltipFrameBackground}, m = "collect", n = {"this", "$this$runningFold_u24lambda_u2d8", "accumulator"}, s = {"L$0", "L$1", "L$2"})
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1120j;

            /* renamed from: k  reason: collision with root package name */
            public int f1121k;

            /* renamed from: m  reason: collision with root package name */
            public Object f1123m;

            /* renamed from: n  reason: collision with root package name */
            public Object f1124n;

            /* renamed from: o  reason: collision with root package name */
            public Object f1125o;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1120j = obj;
                this.f1121k |= Integer.MIN_VALUE;
                return h.this.collect(null, this);
            }
        }

        public h(Object obj, o.i iVar, Function3 function3) {
            this.f1117j = obj;
            this.f1118k = iVar;
            this.f1119l = function3;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0079 A[RETURN] */
        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
        @Override // o.i
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull o.j<? super R> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof o.a0.h.a
                if (r0 == 0) goto L13
                r0 = r7
                o.a0$h$a r0 = (o.a0.h.a) r0
                int r1 = r0.f1121k
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f1121k = r1
                goto L18
            L13:
                o.a0$h$a r0 = new o.a0$h$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f1120j
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f1121k
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.ResultKt.throwOnFailure(r7)
                goto L7a
            L2c:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L34:
                java.lang.Object r5 = r0.f1125o
                kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
                java.lang.Object r6 = r0.f1124n
                o.j r6 = (o.j) r6
                java.lang.Object r2 = r0.f1123m
                o.a0$h r2 = (o.a0.h) r2
                kotlin.ResultKt.throwOnFailure(r7)
                r7 = r5
                r5 = r2
                goto L61
            L46:
                kotlin.ResultKt.throwOnFailure(r7)
                kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
                r7.<init>()
                java.lang.Object r2 = r5.f1117j
                r7.element = r2
                r0.f1123m = r5
                r0.f1124n = r6
                r0.f1125o = r7
                r0.f1121k = r4
                java.lang.Object r2 = r6.emit(r2, r0)
                if (r2 != r1) goto L61
                return r1
            L61:
                o.i r2 = r5.f1118k
                o.a0$i r4 = new o.a0$i
                kotlin.jvm.functions.Function3 r5 = r5.f1119l
                r4.<init>(r7, r5, r6)
                r5 = 0
                r0.f1123m = r5
                r0.f1124n = r5
                r0.f1125o = r5
                r0.f1121k = r3
                java.lang.Object r5 = r2.collect(r4, r0)
                if (r5 != r1) goto L7a
                return r1
            L7a:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: o.a0.h.collect(o.j, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class i<T> implements o.j {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<R> f1126j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Function3<R, T, Continuation<? super R>, Object> f1127k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ o.j<R> f1128l;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1", f = "Transform.kt", i = {0}, l = {R.styleable.AppCompatTheme_textAppearanceListItem, 104}, m = "emit", n = {"this"}, s = {"L$0"})
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public Object f1129j;

            /* renamed from: k  reason: collision with root package name */
            public Object f1130k;

            /* renamed from: l  reason: collision with root package name */
            public /* synthetic */ Object f1131l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ i<T> f1132m;

            /* renamed from: n  reason: collision with root package name */
            public int f1133n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(i<? super T> iVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f1132m = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1131l = obj;
                this.f1133n |= Integer.MIN_VALUE;
                return this.f1132m.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public i(Ref.ObjectRef<R> objectRef, Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> function3, o.j<? super R> jVar) {
            this.f1126j = objectRef;
            this.f1127k = function3;
            this.f1128l = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006f A[RETURN] */
        @Override // o.j
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof o.a0.i.a
                if (r0 == 0) goto L13
                r0 = r9
                o.a0$i$a r0 = (o.a0.i.a) r0
                int r1 = r0.f1133n
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f1133n = r1
                goto L18
            L13:
                o.a0$i$a r0 = new o.a0$i$a
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.f1131l
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f1133n
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.ResultKt.throwOnFailure(r9)
                goto L70
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.f1130k
                kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref.ObjectRef) r7
                java.lang.Object r8 = r0.f1129j
                o.a0$i r8 = (o.a0.i) r8
                kotlin.ResultKt.throwOnFailure(r9)
                goto L5a
            L40:
                kotlin.ResultKt.throwOnFailure(r9)
                kotlin.jvm.internal.Ref$ObjectRef<R> r9 = r7.f1126j
                kotlin.jvm.functions.Function3<R, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r2 = r7.f1127k
                T r5 = r9.element
                r0.f1129j = r7
                r0.f1130k = r9
                r0.f1133n = r4
                java.lang.Object r8 = r2.invoke(r5, r8, r0)
                if (r8 != r1) goto L56
                return r1
            L56:
                r6 = r8
                r8 = r7
                r7 = r9
                r9 = r6
            L5a:
                r7.element = r9
                o.j<R> r7 = r8.f1128l
                kotlin.jvm.internal.Ref$ObjectRef<R> r8 = r8.f1126j
                T r8 = r8.element
                r9 = 0
                r0.f1129j = r9
                r0.f1130k = r9
                r0.f1133n = r3
                java.lang.Object r7 = r7.emit(r8, r0)
                if (r7 != r1) goto L70
                return r1
            L70:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: o.a0.i.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class j implements o.i<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ o.i f1134j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Function3 f1135k;

        public j(o.i iVar, Function3 function3) {
            this.f1134j = iVar;
            this.f1135k = function3;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [T, q.r0] */
        @Override // o.i
        @Nullable
        public Object collect(@NotNull o.j<? super T> jVar, @NotNull Continuation<? super Unit> continuation) {
            Object coroutine_suspended;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = p.u.f1945a;
            Object collect = this.f1134j.collect(new k(objectRef, this.f1135k, jVar), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return collect == coroutine_suspended ? collect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class k<T> implements o.j {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<Object> f1136j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Function3<T, T, Continuation<? super T>, Object> f1137k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ o.j<T> f1138l;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1", f = "Transform.kt", i = {0}, l = {R.styleable.AppCompatTheme_windowMinWidthMinor, s.r.f2159c}, m = "emit", n = {"this"}, s = {"L$0"})
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public Object f1139j;

            /* renamed from: k  reason: collision with root package name */
            public Object f1140k;

            /* renamed from: l  reason: collision with root package name */
            public /* synthetic */ Object f1141l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ k<T> f1142m;

            /* renamed from: n  reason: collision with root package name */
            public int f1143n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(k<? super T> kVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f1142m = kVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1141l = obj;
                this.f1143n |= Integer.MIN_VALUE;
                return this.f1142m.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public k(Ref.ObjectRef<Object> objectRef, Function3<? super T, ? super T, ? super Continuation<? super T>, ? extends Object> function3, o.j<? super T> jVar) {
            this.f1136j = objectRef;
            this.f1137k = function3;
            this.f1138l = jVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0078 A[RETURN] */
        /* JADX WARN: Type inference failed for: r9v6 */
        @Override // o.j
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof o.a0.k.a
                if (r0 == 0) goto L13
                r0 = r9
                o.a0$k$a r0 = (o.a0.k.a) r0
                int r1 = r0.f1143n
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f1143n = r1
                goto L18
            L13:
                o.a0$k$a r0 = new o.a0$k$a
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.f1141l
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f1143n
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.ResultKt.throwOnFailure(r9)
                goto L79
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.f1140k
                kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref.ObjectRef) r7
                java.lang.Object r8 = r0.f1139j
                o.a0$k r8 = (o.a0.k) r8
                kotlin.ResultKt.throwOnFailure(r9)
                goto L5f
            L40:
                kotlin.ResultKt.throwOnFailure(r9)
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r9 = r7.f1136j
                T r2 = r9.element
                q.r0 r5 = p.u.f1945a
                if (r2 != r5) goto L4c
                goto L63
            L4c:
                kotlin.jvm.functions.Function3<T, T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> r5 = r7.f1137k
                r0.f1139j = r7
                r0.f1140k = r9
                r0.f1143n = r4
                java.lang.Object r8 = r5.invoke(r2, r8, r0)
                if (r8 != r1) goto L5b
                return r1
            L5b:
                r6 = r8
                r8 = r7
                r7 = r9
                r9 = r6
            L5f:
                r6 = r9
                r9 = r7
                r7 = r8
                r8 = r6
            L63:
                r9.element = r8
                o.j<T> r8 = r7.f1138l
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r7 = r7.f1136j
                T r7 = r7.element
                r9 = 0
                r0.f1139j = r9
                r0.f1140k = r9
                r0.f1143n = r3
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L79
                return r1
            L79:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: o.a0.k.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class l implements o.i<IndexedValue<? extends T>> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ o.i f1144j;

        public l(o.i iVar) {
            this.f1144j = iVar;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull o.j<? super IndexedValue<? extends T>> jVar, @NotNull Continuation<? super Unit> continuation) {
            Object coroutine_suspended;
            Object collect = this.f1144j.collect(new m(jVar, new Ref.IntRef()), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return collect == coroutine_suspended ? collect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class m<T> implements o.j {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ o.j<IndexedValue<? extends T>> f1145j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Ref.IntRef f1146k;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1", f = "Transform.kt", i = {}, l = {R.styleable.AppCompatTheme_dividerVertical}, m = "emit", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1147j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ m<T> f1148k;

            /* renamed from: l  reason: collision with root package name */
            public int f1149l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(m<? super T> mVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f1148k = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1147j = obj;
                this.f1149l |= Integer.MIN_VALUE;
                return this.f1148k.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public m(o.j<? super IndexedValue<? extends T>> jVar, Ref.IntRef intRef) {
            this.f1145j = jVar;
            this.f1146k = intRef;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        @Override // o.j
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof o.a0.m.a
                if (r0 == 0) goto L13
                r0 = r8
                o.a0$m$a r0 = (o.a0.m.a) r0
                int r1 = r0.f1149l
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f1149l = r1
                goto L18
            L13:
                o.a0$m$a r0 = new o.a0$m$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.f1147j
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f1149l
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.ResultKt.throwOnFailure(r8)
                goto L4e
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                kotlin.ResultKt.throwOnFailure(r8)
                o.j<kotlin.collections.IndexedValue<? extends T>> r8 = r6.f1145j
                kotlin.collections.IndexedValue r2 = new kotlin.collections.IndexedValue
                kotlin.jvm.internal.Ref$IntRef r6 = r6.f1146k
                int r4 = r6.element
                int r5 = r4 + 1
                r6.element = r5
                if (r4 < 0) goto L51
                r2.<init>(r4, r7)
                r0.f1149l = r3
                java.lang.Object r6 = r8.emit(r2, r0)
                if (r6 != r1) goto L4e
                return r1
            L4e:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            L51:
                java.lang.ArithmeticException r6 = new java.lang.ArithmeticException
                java.lang.String r7 = "Index overflow has happened"
                r6.<init>(r7)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o.a0.m.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @NotNull
    public static final <T> o.i<T> a(@NotNull o.i<? extends T> iVar, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return new a(iVar, function2);
    }

    @NotNull
    public static final <T> o.i<T> c(@NotNull o.i<? extends T> iVar, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return new c(iVar, function2);
    }

    @NotNull
    public static final <T> o.i<T> d(@NotNull o.i<? extends T> iVar) {
        return new d(iVar);
    }

    @NotNull
    public static final <T, R> o.i<R> e(@NotNull o.i<? extends T> iVar, @NotNull Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        return new e(iVar, function2);
    }

    @NotNull
    public static final <T, R> o.i<R> f(@NotNull o.i<? extends T> iVar, @NotNull Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        return new f(iVar, function2);
    }

    @NotNull
    public static final <T> o.i<T> g(@NotNull o.i<? extends T> iVar, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new g(iVar, function2);
    }

    @NotNull
    public static final <T, R> o.i<R> h(@NotNull o.i<? extends T> iVar, R r2, @BuilderInference @NotNull Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> function3) {
        return new h(r2, iVar, function3);
    }

    @NotNull
    public static final <T> o.i<T> i(@NotNull o.i<? extends T> iVar, @NotNull Function3<? super T, ? super T, ? super Continuation<? super T>, ? extends Object> function3) {
        return new j(iVar, function3);
    }

    @NotNull
    public static final <T, R> o.i<R> j(@NotNull o.i<? extends T> iVar, R r2, @BuilderInference @NotNull Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> function3) {
        return o.k.y1(iVar, r2, function3);
    }

    @NotNull
    public static final <T> o.i<IndexedValue<T>> k(@NotNull o.i<? extends T> iVar) {
        return new l(iVar);
    }
}
