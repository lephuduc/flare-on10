package o;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import j.d2;
import java.util.Iterator;
import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlin.ranges.LongRange;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0007\u001a8\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0010\u001a\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0012\u001a\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0014\u001a-\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0016\"\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0012\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000\u001a#\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0016¢\u0006\u0004\b\u001e\u0010\u0019\u001a\u0010\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\b*\u00020\u001f\u001a\u0010\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\b*\u00020\"\u001a\u0010\u0010&\u001a\b\u0012\u0004\u0012\u00020 0\b*\u00020%\u001a\u0010\u0010(\u001a\b\u0012\u0004\u0012\u00020#0\b*\u00020'\u001aM\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000)\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006ø\u0001\u0000¢\u0006\u0004\b*\u0010\n\u001aM\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000)\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006ø\u0001\u0000¢\u0006\u0004\b+\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"T", "Lkotlin/Function2;", "Lo/j;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "Lo/i;", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "(Lkotlin/jvm/functions/Function2;)Lo/i;", "Lkotlin/Function0;", "c", "Lkotlin/Function1;", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "(Lkotlin/jvm/functions/Function1;)Lo/i;", "", "a", "", "b", "Lkotlin/sequences/Sequence;", "g", "", "elements", "p", "([Ljava/lang/Object;)Lo/i;", "value", "o", "(Ljava/lang/Object;)Lo/i;", "m", "j", "", "", "h", "", "", "i", "Lkotlin/ranges/IntRange;", "e", "Lkotlin/ranges/LongRange;", "f", "Ll/g0;", "l", "k", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes2.dex */
public final /* synthetic */ class l {

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class a implements o.i<Long> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ LongRange f1323j;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10", f = "Builders.kt", i = {0}, l = {R.styleable.AppCompatTheme_tooltipFrameBackground}, m = "collect", n = {"$this$asFlow_u24lambda_u2d19"}, s = {"L$0"})
        /* renamed from: o.l$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0070a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1324j;

            /* renamed from: k  reason: collision with root package name */
            public int f1325k;

            /* renamed from: m  reason: collision with root package name */
            public Object f1327m;

            /* renamed from: n  reason: collision with root package name */
            public Object f1328n;

            public C0070a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1324j = obj;
                this.f1325k |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public a(LongRange longRange) {
            this.f1323j = longRange;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
        @Override // o.i
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull o.j<? super java.lang.Long> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof o.l.a.C0070a
                if (r0 == 0) goto L13
                r0 = r8
                o.l$a$a r0 = (o.l.a.C0070a) r0
                int r1 = r0.f1325k
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f1325k = r1
                goto L18
            L13:
                o.l$a$a r0 = new o.l$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f1324j
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f1325k
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L31
                java.lang.Object r6 = r0.f1328n
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r7 = r0.f1327m
                o.j r7 = (o.j) r7
                kotlin.ResultKt.throwOnFailure(r8)
                goto L42
            L31:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L39:
                kotlin.ResultKt.throwOnFailure(r8)
                kotlin.ranges.LongRange r6 = r6.f1323j
                java.util.Iterator r6 = r6.iterator()
            L42:
                boolean r8 = r6.hasNext()
                if (r8 == 0) goto L60
                r8 = r6
                kotlin.collections.LongIterator r8 = (kotlin.collections.LongIterator) r8
                long r4 = r8.nextLong()
                java.lang.Long r8 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r4)
                r0.f1327m = r7
                r0.f1328n = r6
                r0.f1325k = r3
                java.lang.Object r8 = r7.emit(r8, r0)
                if (r8 != r1) goto L42
                return r1
            L60:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o.l.a.collect(o.j, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class b implements o.i<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Function0 f1329j;

        public b(Function0 function0) {
            this.f1329j = function0;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull o.j<? super T> jVar, @NotNull Continuation<? super Unit> continuation) {
            Object coroutine_suspended;
            Object emit = jVar.emit(this.f1329j.invoke(), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return emit == coroutine_suspended ? emit : Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class c implements o.i<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Function1 f1330j;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2", f = "Builders.kt", i = {}, l = {R.styleable.AppCompatTheme_toolbarStyle, R.styleable.AppCompatTheme_toolbarStyle}, m = "collect", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1331j;

            /* renamed from: k  reason: collision with root package name */
            public int f1332k;

            /* renamed from: m  reason: collision with root package name */
            public Object f1334m;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1331j = obj;
                this.f1332k |= Integer.MIN_VALUE;
                return c.this.collect(null, this);
            }
        }

        public c(Function1 function1) {
            this.f1330j = function1;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0060 A[RETURN] */
        @Override // o.i
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull o.j<? super T> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof o.l.c.a
                if (r0 == 0) goto L13
                r0 = r7
                o.l$c$a r0 = (o.l.c.a) r0
                int r1 = r0.f1332k
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f1332k = r1
                goto L18
            L13:
                o.l$c$a r0 = new o.l$c$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f1331j
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f1332k
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3d
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.ResultKt.throwOnFailure(r7)
                goto L61
            L2c:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L34:
                java.lang.Object r5 = r0.f1334m
                r6 = r5
                o.j r6 = (o.j) r6
                kotlin.ResultKt.throwOnFailure(r7)
                goto L55
            L3d:
                kotlin.ResultKt.throwOnFailure(r7)
                kotlin.jvm.functions.Function1 r5 = r5.f1330j
                r0.f1334m = r6
                r0.f1332k = r4
                r7 = 6
                kotlin.jvm.internal.InlineMarker.mark(r7)
                java.lang.Object r7 = r5.invoke(r0)
                r5 = 7
                kotlin.jvm.internal.InlineMarker.mark(r5)
                if (r7 != r1) goto L55
                return r1
            L55:
                r5 = 0
                r0.f1334m = r5
                r0.f1332k = r3
                java.lang.Object r5 = r6.emit(r7, r0)
                if (r5 != r1) goto L61
                return r1
            L61:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: o.l.c.collect(o.j, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class d implements o.i<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Iterable f1335j;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3", f = "Builders.kt", i = {0}, l = {R.styleable.AppCompatTheme_tooltipFrameBackground}, m = "collect", n = {"$this$asFlow_u24lambda_u2d3"}, s = {"L$0"})
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1336j;

            /* renamed from: k  reason: collision with root package name */
            public int f1337k;

            /* renamed from: m  reason: collision with root package name */
            public Object f1339m;

            /* renamed from: n  reason: collision with root package name */
            public Object f1340n;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1336j = obj;
                this.f1337k |= Integer.MIN_VALUE;
                return d.this.collect(null, this);
            }
        }

        public d(Iterable iterable) {
            this.f1335j = iterable;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
        @Override // o.i
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull o.j<? super T> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof o.l.d.a
                if (r0 == 0) goto L13
                r0 = r6
                o.l$d$a r0 = (o.l.d.a) r0
                int r1 = r0.f1337k
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f1337k = r1
                goto L18
            L13:
                o.l$d$a r0 = new o.l$d$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f1336j
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f1337k
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L31
                java.lang.Object r4 = r0.f1340n
                java.util.Iterator r4 = (java.util.Iterator) r4
                java.lang.Object r5 = r0.f1339m
                o.j r5 = (o.j) r5
                kotlin.ResultKt.throwOnFailure(r6)
                goto L42
            L31:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L39:
                kotlin.ResultKt.throwOnFailure(r6)
                java.lang.Iterable r4 = r4.f1335j
                java.util.Iterator r4 = r4.iterator()
            L42:
                boolean r6 = r4.hasNext()
                if (r6 == 0) goto L59
                java.lang.Object r6 = r4.next()
                r0.f1339m = r5
                r0.f1340n = r4
                r0.f1337k = r3
                java.lang.Object r6 = r5.emit(r6, r0)
                if (r6 != r1) goto L42
                return r1
            L59:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: o.l.d.collect(o.j, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class e implements o.i<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Iterator f1341j;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$4", f = "Builders.kt", i = {0}, l = {R.styleable.AppCompatTheme_tooltipFrameBackground}, m = "collect", n = {"$this$asFlow_u24lambda_u2d5"}, s = {"L$0"})
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1342j;

            /* renamed from: k  reason: collision with root package name */
            public int f1343k;

            /* renamed from: m  reason: collision with root package name */
            public Object f1345m;

            /* renamed from: n  reason: collision with root package name */
            public Object f1346n;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1342j = obj;
                this.f1343k |= Integer.MIN_VALUE;
                return e.this.collect(null, this);
            }
        }

        public e(Iterator it) {
            this.f1341j = it;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
        @Override // o.i
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull o.j<? super T> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof o.l.e.a
                if (r0 == 0) goto L13
                r0 = r6
                o.l$e$a r0 = (o.l.e.a) r0
                int r1 = r0.f1343k
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f1343k = r1
                goto L18
            L13:
                o.l$e$a r0 = new o.l$e$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f1342j
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f1343k
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L31
                java.lang.Object r4 = r0.f1346n
                java.util.Iterator r4 = (java.util.Iterator) r4
                java.lang.Object r5 = r0.f1345m
                o.j r5 = (o.j) r5
                kotlin.ResultKt.throwOnFailure(r6)
                goto L3e
            L31:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L39:
                kotlin.ResultKt.throwOnFailure(r6)
                java.util.Iterator r4 = r4.f1341j
            L3e:
                boolean r6 = r4.hasNext()
                if (r6 == 0) goto L55
                java.lang.Object r6 = r4.next()
                r0.f1345m = r5
                r0.f1346n = r4
                r0.f1343k = r3
                java.lang.Object r6 = r5.emit(r6, r0)
                if (r6 != r1) goto L3e
                return r1
            L55:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: o.l.e.collect(o.j, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class f implements o.i<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Sequence f1347j;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5", f = "Builders.kt", i = {0}, l = {R.styleable.AppCompatTheme_tooltipFrameBackground}, m = "collect", n = {"$this$asFlow_u24lambda_u2d7"}, s = {"L$0"})
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1348j;

            /* renamed from: k  reason: collision with root package name */
            public int f1349k;

            /* renamed from: m  reason: collision with root package name */
            public Object f1351m;

            /* renamed from: n  reason: collision with root package name */
            public Object f1352n;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1348j = obj;
                this.f1349k |= Integer.MIN_VALUE;
                return f.this.collect(null, this);
            }
        }

        public f(Sequence sequence) {
            this.f1347j = sequence;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
        @Override // o.i
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull o.j<? super T> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof o.l.f.a
                if (r0 == 0) goto L13
                r0 = r6
                o.l$f$a r0 = (o.l.f.a) r0
                int r1 = r0.f1349k
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f1349k = r1
                goto L18
            L13:
                o.l$f$a r0 = new o.l$f$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f1348j
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f1349k
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L31
                java.lang.Object r4 = r0.f1352n
                java.util.Iterator r4 = (java.util.Iterator) r4
                java.lang.Object r5 = r0.f1351m
                o.j r5 = (o.j) r5
                kotlin.ResultKt.throwOnFailure(r6)
                goto L42
            L31:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L39:
                kotlin.ResultKt.throwOnFailure(r6)
                kotlin.sequences.Sequence r4 = r4.f1347j
                java.util.Iterator r4 = r4.iterator()
            L42:
                boolean r6 = r4.hasNext()
                if (r6 == 0) goto L59
                java.lang.Object r6 = r4.next()
                r0.f1351m = r5
                r0.f1352n = r4
                r0.f1349k = r3
                java.lang.Object r6 = r5.emit(r6, r0)
                if (r6 != r1) goto L42
                return r1
            L59:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: o.l.f.collect(o.j, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class g implements o.i<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Object[] f1353j;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6", f = "Builders.kt", i = {0, 0}, l = {R.styleable.AppCompatTheme_tooltipFrameBackground}, m = "collect", n = {"$this$asFlow_u24lambda_u2d11", "$this$forEach$iv"}, s = {"L$0", "L$1"})
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1354j;

            /* renamed from: k  reason: collision with root package name */
            public int f1355k;

            /* renamed from: m  reason: collision with root package name */
            public Object f1357m;

            /* renamed from: n  reason: collision with root package name */
            public Object f1358n;

            /* renamed from: o  reason: collision with root package name */
            public int f1359o;

            /* renamed from: p  reason: collision with root package name */
            public int f1360p;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1354j = obj;
                this.f1355k |= Integer.MIN_VALUE;
                return g.this.collect(null, this);
            }
        }

        public g(Object[] objArr) {
            this.f1353j = objArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005d -> B:19:0x0060). Please submit an issue!!! */
        @Override // o.i
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull o.j<? super T> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof o.l.g.a
                if (r0 == 0) goto L13
                r0 = r9
                o.l$g$a r0 = (o.l.g.a) r0
                int r1 = r0.f1355k
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f1355k = r1
                goto L18
            L13:
                o.l$g$a r0 = new o.l$g$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f1354j
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f1355k
                r3 = 1
                if (r2 == 0) goto L3e
                if (r2 != r3) goto L36
                int r7 = r0.f1360p
                int r8 = r0.f1359o
                java.lang.Object r2 = r0.f1358n
                java.lang.Object[] r2 = (java.lang.Object[]) r2
                java.lang.Object r4 = r0.f1357m
                o.j r4 = (o.j) r4
                kotlin.ResultKt.throwOnFailure(r9)
                r9 = r4
                goto L60
            L36:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L3e:
                kotlin.ResultKt.throwOnFailure(r9)
                java.lang.Object[] r7 = r7.f1353j
                r9 = 0
                int r2 = r7.length
                r5 = r2
                r2 = r7
                r7 = r5
                r6 = r9
                r9 = r8
                r8 = r6
            L4b:
                if (r8 >= r7) goto L62
                r4 = r2[r8]
                r0.f1357m = r9
                r0.f1358n = r2
                r0.f1359o = r8
                r0.f1360p = r7
                r0.f1355k = r3
                java.lang.Object r4 = r9.emit(r4, r0)
                if (r4 != r1) goto L60
                return r1
            L60:
                int r8 = r8 + r3
                goto L4b
            L62:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: o.l.g.collect(o.j, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class h implements o.i<Integer> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ int[] f1361j;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7", f = "Builders.kt", i = {0, 0}, l = {R.styleable.AppCompatTheme_tooltipFrameBackground}, m = "collect", n = {"$this$asFlow_u24lambda_u2d13", "$this$forEach$iv"}, s = {"L$0", "L$1"})
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1362j;

            /* renamed from: k  reason: collision with root package name */
            public int f1363k;

            /* renamed from: m  reason: collision with root package name */
            public Object f1365m;

            /* renamed from: n  reason: collision with root package name */
            public Object f1366n;

            /* renamed from: o  reason: collision with root package name */
            public int f1367o;

            /* renamed from: p  reason: collision with root package name */
            public int f1368p;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1362j = obj;
                this.f1363k |= Integer.MIN_VALUE;
                return h.this.collect(null, this);
            }
        }

        public h(int[] iArr) {
            this.f1361j = iArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0061 -> B:19:0x0064). Please submit an issue!!! */
        @Override // o.i
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull o.j<? super java.lang.Integer> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof o.l.h.a
                if (r0 == 0) goto L13
                r0 = r9
                o.l$h$a r0 = (o.l.h.a) r0
                int r1 = r0.f1363k
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f1363k = r1
                goto L18
            L13:
                o.l$h$a r0 = new o.l$h$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f1362j
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f1363k
                r3 = 1
                if (r2 == 0) goto L3e
                if (r2 != r3) goto L36
                int r7 = r0.f1368p
                int r8 = r0.f1367o
                java.lang.Object r2 = r0.f1366n
                int[] r2 = (int[]) r2
                java.lang.Object r4 = r0.f1365m
                o.j r4 = (o.j) r4
                kotlin.ResultKt.throwOnFailure(r9)
                r9 = r4
                goto L64
            L36:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L3e:
                kotlin.ResultKt.throwOnFailure(r9)
                int[] r7 = r7.f1361j
                r9 = 0
                int r2 = r7.length
                r5 = r2
                r2 = r7
                r7 = r5
                r6 = r9
                r9 = r8
                r8 = r6
            L4b:
                if (r8 >= r7) goto L66
                r4 = r2[r8]
                java.lang.Integer r4 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r4)
                r0.f1365m = r9
                r0.f1366n = r2
                r0.f1367o = r8
                r0.f1368p = r7
                r0.f1363k = r3
                java.lang.Object r4 = r9.emit(r4, r0)
                if (r4 != r1) goto L64
                return r1
            L64:
                int r8 = r8 + r3
                goto L4b
            L66:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: o.l.h.collect(o.j, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class i implements o.i<Long> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ long[] f1369j;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8", f = "Builders.kt", i = {0, 0}, l = {R.styleable.AppCompatTheme_tooltipFrameBackground}, m = "collect", n = {"$this$asFlow_u24lambda_u2d15", "$this$forEach$iv"}, s = {"L$0", "L$1"})
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1370j;

            /* renamed from: k  reason: collision with root package name */
            public int f1371k;

            /* renamed from: m  reason: collision with root package name */
            public Object f1373m;

            /* renamed from: n  reason: collision with root package name */
            public Object f1374n;

            /* renamed from: o  reason: collision with root package name */
            public int f1375o;

            /* renamed from: p  reason: collision with root package name */
            public int f1376p;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1370j = obj;
                this.f1371k |= Integer.MIN_VALUE;
                return i.this.collect(null, this);
            }
        }

        public i(long[] jArr) {
            this.f1369j = jArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0061 -> B:19:0x0064). Please submit an issue!!! */
        @Override // o.i
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull o.j<? super java.lang.Long> r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof o.l.i.a
                if (r0 == 0) goto L13
                r0 = r10
                o.l$i$a r0 = (o.l.i.a) r0
                int r1 = r0.f1371k
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f1371k = r1
                goto L18
            L13:
                o.l$i$a r0 = new o.l$i$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f1370j
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f1371k
                r3 = 1
                if (r2 == 0) goto L3e
                if (r2 != r3) goto L36
                int r8 = r0.f1376p
                int r9 = r0.f1375o
                java.lang.Object r2 = r0.f1374n
                long[] r2 = (long[]) r2
                java.lang.Object r4 = r0.f1373m
                o.j r4 = (o.j) r4
                kotlin.ResultKt.throwOnFailure(r10)
                r10 = r4
                goto L64
            L36:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3e:
                kotlin.ResultKt.throwOnFailure(r10)
                long[] r8 = r8.f1369j
                r10 = 0
                int r2 = r8.length
                r6 = r2
                r2 = r8
                r8 = r6
                r7 = r10
                r10 = r9
                r9 = r7
            L4b:
                if (r9 >= r8) goto L66
                r4 = r2[r9]
                java.lang.Long r4 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r4)
                r0.f1373m = r10
                r0.f1374n = r2
                r0.f1375o = r9
                r0.f1376p = r8
                r0.f1371k = r3
                java.lang.Object r4 = r10.emit(r4, r0)
                if (r4 != r1) goto L64
                return r1
            L64:
                int r9 = r9 + r3
                goto L4b
            L66:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: o.l.i.collect(o.j, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class j implements o.i<Integer> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ IntRange f1377j;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9", f = "Builders.kt", i = {0}, l = {R.styleable.AppCompatTheme_tooltipFrameBackground}, m = "collect", n = {"$this$asFlow_u24lambda_u2d17"}, s = {"L$0"})
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1378j;

            /* renamed from: k  reason: collision with root package name */
            public int f1379k;

            /* renamed from: m  reason: collision with root package name */
            public Object f1381m;

            /* renamed from: n  reason: collision with root package name */
            public Object f1382n;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1378j = obj;
                this.f1379k |= Integer.MIN_VALUE;
                return j.this.collect(null, this);
            }
        }

        public j(IntRange intRange) {
            this.f1377j = intRange;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
        @Override // o.i
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull o.j<? super java.lang.Integer> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof o.l.j.a
                if (r0 == 0) goto L13
                r0 = r6
                o.l$j$a r0 = (o.l.j.a) r0
                int r1 = r0.f1379k
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f1379k = r1
                goto L18
            L13:
                o.l$j$a r0 = new o.l$j$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f1378j
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f1379k
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L31
                java.lang.Object r4 = r0.f1382n
                java.util.Iterator r4 = (java.util.Iterator) r4
                java.lang.Object r5 = r0.f1381m
                o.j r5 = (o.j) r5
                kotlin.ResultKt.throwOnFailure(r6)
                goto L42
            L31:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L39:
                kotlin.ResultKt.throwOnFailure(r6)
                kotlin.ranges.IntRange r4 = r4.f1377j
                java.util.Iterator r4 = r4.iterator()
            L42:
                boolean r6 = r4.hasNext()
                if (r6 == 0) goto L60
                r6 = r4
                kotlin.collections.IntIterator r6 = (kotlin.collections.IntIterator) r6
                int r6 = r6.nextInt()
                java.lang.Integer r6 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r6)
                r0.f1381m = r5
                r0.f1382n = r4
                r0.f1379k = r3
                java.lang.Object r6 = r5.emit(r6, r0)
                if (r6 != r1) goto L42
                return r1
            L60:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: o.l.j.collect(o.j, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class k implements o.i<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Object[] f1383j;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1", f = "Builders.kt", i = {0, 0}, l = {R.styleable.AppCompatTheme_tooltipForegroundColor}, m = "collect", n = {"this", "$this$flowOf_u24lambda_u2d8"}, s = {"L$0", "L$1"})
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1384j;

            /* renamed from: k  reason: collision with root package name */
            public int f1385k;

            /* renamed from: m  reason: collision with root package name */
            public Object f1387m;

            /* renamed from: n  reason: collision with root package name */
            public Object f1388n;

            /* renamed from: o  reason: collision with root package name */
            public int f1389o;

            /* renamed from: p  reason: collision with root package name */
            public int f1390p;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1384j = obj;
                this.f1385k |= Integer.MIN_VALUE;
                return k.this.collect(null, this);
            }
        }

        public k(Object[] objArr) {
            this.f1383j = objArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0065 -> B:20:0x0067). Please submit an issue!!! */
        @Override // o.i
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(@org.jetbrains.annotations.NotNull o.j<? super T> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof o.l.k.a
                if (r0 == 0) goto L13
                r0 = r8
                o.l$k$a r0 = (o.l.k.a) r0
                int r1 = r0.f1385k
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f1385k = r1
                goto L18
            L13:
                o.l$k$a r0 = new o.l$k$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f1384j
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f1385k
                r3 = 1
                if (r2 == 0) goto L41
                if (r2 != r3) goto L39
                int r6 = r0.f1390p
                int r7 = r0.f1389o
                java.lang.Object r2 = r0.f1388n
                o.j r2 = (o.j) r2
                java.lang.Object r4 = r0.f1387m
                o.l$k r4 = (o.l.k) r4
                kotlin.ResultKt.throwOnFailure(r8)
                r5 = r1
                r1 = r0
                r0 = r2
                r2 = r5
                goto L67
            L39:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L41:
                kotlin.ResultKt.throwOnFailure(r8)
                r8 = 0
                java.lang.Object[] r2 = r6.f1383j
                int r2 = r2.length
                r5 = r7
                r7 = r6
                r6 = r2
                r2 = r1
                r1 = r0
                r0 = r5
            L4e:
                if (r8 >= r6) goto L6b
                java.lang.Object[] r4 = r7.f1383j
                r4 = r4[r8]
                r1.f1387m = r7
                r1.f1388n = r0
                r1.f1389o = r8
                r1.f1390p = r6
                r1.f1385k = r3
                java.lang.Object r4 = r0.emit(r4, r1)
                if (r4 != r2) goto L65
                return r2
            L65:
                r4 = r7
                r7 = r8
            L67:
                int r8 = r7 + 1
                r7 = r4
                goto L4e
            L6b:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o.l.k.collect(o.j, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: o.l$l  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0071l implements o.i<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Object f1391j;

        public C0071l(Object obj) {
            this.f1391j = obj;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull o.j<? super T> jVar, @NotNull Continuation<? super Unit> continuation) {
            Object coroutine_suspended;
            Object emit = jVar.emit(this.f1391j, continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return emit == coroutine_suspended ? emit : Unit.INSTANCE;
        }
    }

    @NotNull
    public static final <T> o.i<T> a(@NotNull Iterable<? extends T> iterable) {
        return new d(iterable);
    }

    @NotNull
    public static final <T> o.i<T> b(@NotNull Iterator<? extends T> it) {
        return new e(it);
    }

    @d2
    @NotNull
    public static final <T> o.i<T> c(@NotNull Function0<? extends T> function0) {
        return new b(function0);
    }

    @d2
    @NotNull
    public static final <T> o.i<T> d(@NotNull Function1<? super Continuation<? super T>, ? extends Object> function1) {
        return new c(function1);
    }

    @NotNull
    public static final o.i<Integer> e(@NotNull IntRange intRange) {
        return new j(intRange);
    }

    @NotNull
    public static final o.i<Long> f(@NotNull LongRange longRange) {
        return new a(longRange);
    }

    @NotNull
    public static final <T> o.i<T> g(@NotNull Sequence<? extends T> sequence) {
        return new f(sequence);
    }

    @NotNull
    public static final o.i<Integer> h(@NotNull int[] iArr) {
        return new h(iArr);
    }

    @NotNull
    public static final o.i<Long> i(@NotNull long[] jArr) {
        return new i(jArr);
    }

    @NotNull
    public static final <T> o.i<T> j(@NotNull T[] tArr) {
        return new g(tArr);
    }

    @NotNull
    public static final <T> o.i<T> k(@BuilderInference @NotNull Function2<? super l.g0<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new o.b(function2, null, 0, null, 14, null);
    }

    @NotNull
    public static final <T> o.i<T> l(@BuilderInference @NotNull Function2<? super l.g0<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new o.f(function2, null, 0, null, 14, null);
    }

    @NotNull
    public static final <T> o.i<T> m() {
        return o.h.f1299j;
    }

    @NotNull
    public static final <T> o.i<T> n(@BuilderInference @NotNull Function2<? super o.j<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new h0(function2);
    }

    @NotNull
    public static final <T> o.i<T> o(T t2) {
        return new C0071l(t2);
    }

    @NotNull
    public static final <T> o.i<T> p(@NotNull T... tArr) {
        return new k(tArr);
    }
}
