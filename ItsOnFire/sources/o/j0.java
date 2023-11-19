package o;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.analytics.FirebaseAnalytics;
import j.p1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010 \n\u0002\b\u000b\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006:\u0001eB\u001f\u0012\u0006\u0010J\u001a\u00020\u0016\u0012\u0006\u0010L\u001a\u00020\u0016\u0012\u0006\u0010F\u001a\u00020E¢\u0006\u0004\bm\u0010nJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\b\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0012\u0010\u0013\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J9\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00142\u0010\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J(\u0010$\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000eH\u0002J\b\u0010%\u001a\u00020\fH\u0002J\u0012\u0010'\u001a\u0004\u0018\u00010\u00112\u0006\u0010&\u001a\u00020\u0003H\u0002J\u0010\u0010(\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u0003H\u0002J\u0012\u0010*\u001a\u0004\u0018\u00010\u00112\u0006\u0010)\u001a\u00020\u000eH\u0002J\u001b\u0010+\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b+\u0010,J3\u0010/\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010-0\u00142\u0014\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010-0\u0014H\u0002¢\u0006\u0004\b/\u00100J!\u00104\u001a\u0002032\f\u00102\u001a\b\u0012\u0004\u0012\u00028\u000001H\u0096@ø\u0001\u0000¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b6\u0010\nJ\u001b\u00107\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b7\u0010\u001cJ\u000f\u00108\u001a\u00020\u000eH\u0000¢\u0006\u0004\b8\u00109J%\u0010;\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010-0\u00142\u0006\u0010:\u001a\u00020\u000eH\u0000¢\u0006\u0004\b;\u0010<J\b\u0010=\u001a\u00020\u0003H\u0014J\u001f\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00142\u0006\u0010>\u001a\u00020\u0016H\u0014¢\u0006\u0004\b?\u0010@J\b\u0010A\u001a\u00020\fH\u0016J&\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000G2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020\u00162\u0006\u0010F\u001a\u00020EH\u0016R\u0014\u0010J\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010?R\u0014\u0010L\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010?R\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR \u0010Q\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010S\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010\rR\u0016\u0010U\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010\rR\u0016\u0010W\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010?R\u0016\u0010Y\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010?R\u0014\u0010[\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bZ\u00109R\u0014\u0010^\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0014\u0010`\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b_\u0010]R\u0014\u0010b\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u00109R\u0014\u0010c\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u00109R\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR\u001a\u0010l\u001a\u00028\u00008DX\u0084\u0004¢\u0006\f\u0012\u0004\bj\u0010k\u001a\u0004\bh\u0010i\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006o"}, d2 = {"Lo/j0;", "T", "Lp/b;", "Lo/l0;", "Lo/d0;", "Lo/c;", "Lp/r;", "value", "", "X", "(Ljava/lang/Object;)Z", "Y", "", "J", "", "newHead", "G", "", "item", "M", "", "curBuffer", "", "curSize", "newSize", "W", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "L", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lo/j0$a;", "emitter", "D", "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", "b0", "E", "slot", "a0", "Z", FirebaseAnalytics.Param.INDEX, "S", "C", "(Lo/l0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/Continuation;", "resumesIn", "N", "([Lkotlin/coroutines/Continuation;)[Lkotlin/coroutines/Continuation;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "g", "emit", "d0", "()J", "oldIndex", "c0", "(J)[Lkotlin/coroutines/Continuation;", "H", "size", "I", "(I)[Lo/l0;", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "Lkotlin/coroutines/CoroutineContext;", "context", "capacity", "Ll/m;", "onBufferOverflow", "Lo/i;", "b", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "replay", "o", "bufferCapacity", "p", "Ll/m;", "q", "[Ljava/lang/Object;", "buffer", "r", "replayIndex", "s", "minCollectorIndex", "t", "bufferSize", "u", "queueSize", "P", "head", "U", "()I", "replaySize", "V", "totalSize", "O", "bufferEndIndex", "queueEndIndex", "", "a", "()Ljava/util/List;", "replayCache", "Q", "()Ljava/lang/Object;", "getLastReplayedLocked$annotations", "()V", "lastReplayedLocked", "<init>", "(IILl/m;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public class j0<T> extends p.b<l0> implements d0<T>, o.c<T>, p.r<T> {

    /* renamed from: n  reason: collision with root package name */
    public final int f1301n;

    /* renamed from: o  reason: collision with root package name */
    public final int f1302o;
    @NotNull

    /* renamed from: p  reason: collision with root package name */
    public final l.m f1303p;
    @Nullable

    /* renamed from: q  reason: collision with root package name */
    public Object[] f1304q;

    /* renamed from: r  reason: collision with root package name */
    public long f1305r;

    /* renamed from: s  reason: collision with root package name */
    public long f1306s;

    /* renamed from: t  reason: collision with root package name */
    public int f1307t;

    /* renamed from: u  reason: collision with root package name */
    public int f1308u;

    @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B3\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lo/j0$a;", "Lj/p1;", "", "dispose", "Lo/j0;", "j", "Lo/j0;", "flow", "", "k", "J", FirebaseAnalytics.Param.INDEX, "", "l", "Ljava/lang/Object;", "value", "Lkotlin/coroutines/Continuation;", "m", "Lkotlin/coroutines/Continuation;", "cont", "<init>", "(Lo/j0;JLjava/lang/Object;Lkotlin/coroutines/Continuation;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class a implements p1 {
        @JvmField
        @NotNull

        /* renamed from: j  reason: collision with root package name */
        public final j0<?> f1309j;
        @JvmField

        /* renamed from: k  reason: collision with root package name */
        public long f1310k;
        @JvmField
        @Nullable

        /* renamed from: l  reason: collision with root package name */
        public final Object f1311l;
        @JvmField
        @NotNull

        /* renamed from: m  reason: collision with root package name */
        public final Continuation<Unit> f1312m;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull j0<?> j0Var, long j2, @Nullable Object obj, @NotNull Continuation<? super Unit> continuation) {
            this.f1309j = j0Var;
            this.f1310k = j2;
            this.f1311l = obj;
            this.f1312m = continuation;
        }

        @Override // j.p1
        public void dispose() {
            this.f1309j.D(this);
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f1313a;

        static {
            int[] iArr = new int[l.m.values().length];
            iArr[l.m.SUSPEND.ordinal()] = 1;
            iArr[l.m.DROP_LATEST.ordinal()] = 2;
            iArr[l.m.DROP_OLDEST.ordinal()] = 3;
            f1313a = iArr;
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {373, 380, 383}, m = "collect$suspendImpl", n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "this", "collector", "slot", "collectorJob"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    /* loaded from: classes2.dex */
    public static final class c extends ContinuationImpl {

        /* renamed from: j  reason: collision with root package name */
        public Object f1314j;

        /* renamed from: k  reason: collision with root package name */
        public Object f1315k;

        /* renamed from: l  reason: collision with root package name */
        public Object f1316l;

        /* renamed from: m  reason: collision with root package name */
        public Object f1317m;

        /* renamed from: n  reason: collision with root package name */
        public /* synthetic */ Object f1318n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ j0<T> f1319o;

        /* renamed from: p  reason: collision with root package name */
        public int f1320p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(j0<T> j0Var, Continuation<? super c> continuation) {
            super(continuation);
            this.f1319o = j0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f1318n = obj;
            this.f1320p |= Integer.MIN_VALUE;
            return j0.F(this.f1319o, null, this);
        }
    }

    public j0(int i2, int i3, @NotNull l.m mVar) {
        this.f1301n = i2;
        this.f1302o = i3;
        this.f1303p = mVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(3:(6:(1:(1:11)(2:41|42))(1:43)|12|13|14|15|(3:16|(3:28|29|(2:31|32)(1:33))(4:18|(1:20)|21|(2:23|24)(1:26))|27))(4:44|45|46|47)|37|38)(5:53|54|55|(2:57|(1:59))|61)|48|49|15|(3:16|(0)(0)|27)))|64|6|(0)(0)|48|49|15|(3:16|(0)(0)|27)) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d2, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d3, code lost:
        r5 = r8;
        r8 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object F(o.j0 r8, o.j r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.j0.F(o.j0, o.j, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object K(j0 j0Var, Object obj, Continuation continuation) {
        Object coroutine_suspended;
        if (j0Var.g(obj)) {
            return Unit.INSTANCE;
        }
        Object L = j0Var.L(obj, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return L == coroutine_suspended ? L : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long P() {
        return Math.min(this.f1306s, this.f1305r);
    }

    public static /* synthetic */ void R() {
    }

    public final Object C(l0 l0Var, Continuation<? super Unit> continuation) {
        Continuation intercepted;
        Unit unit;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        j.r rVar = new j.r(intercepted, 1);
        rVar.E();
        synchronized (this) {
            if (Z(l0Var) < 0) {
                l0Var.f1393b = rVar;
            } else {
                Result.Companion companion = Result.Companion;
                rVar.resumeWith(Result.m3581constructorimpl(Unit.INSTANCE));
            }
            unit = Unit.INSTANCE;
        }
        Object x = rVar.x();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (x == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return x == coroutine_suspended2 ? x : unit;
    }

    public final void D(a aVar) {
        Object f2;
        synchronized (this) {
            if (aVar.f1310k < P()) {
                return;
            }
            Object[] objArr = this.f1304q;
            Intrinsics.checkNotNull(objArr);
            f2 = k0.f(objArr, aVar.f1310k);
            if (f2 != aVar) {
                return;
            }
            k0.h(objArr, aVar.f1310k, k0.f1322a);
            E();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void E() {
        Object f2;
        if (this.f1302o != 0 || this.f1308u > 1) {
            Object[] objArr = this.f1304q;
            Intrinsics.checkNotNull(objArr);
            while (this.f1308u > 0) {
                f2 = k0.f(objArr, (P() + V()) - 1);
                if (f2 != k0.f1322a) {
                    return;
                }
                this.f1308u--;
                k0.h(objArr, P() + V(), null);
            }
        }
    }

    public final void G(long j2) {
        p.d[] f2;
        if (p.b.e(this) != 0 && (f2 = p.b.f(this)) != null) {
            for (p.d dVar : f2) {
                if (dVar != null) {
                    l0 l0Var = (l0) dVar;
                    long j3 = l0Var.f1392a;
                    if (j3 >= 0 && j3 < j2) {
                        l0Var.f1392a = j2;
                    }
                }
            }
        }
        this.f1306s = j2;
    }

    @Override // p.b
    @NotNull
    /* renamed from: H */
    public l0 j() {
        return new l0();
    }

    @Override // p.b
    @NotNull
    /* renamed from: I */
    public l0[] k(int i2) {
        return new l0[i2];
    }

    public final void J() {
        Object[] objArr = this.f1304q;
        Intrinsics.checkNotNull(objArr);
        k0.h(objArr, P(), null);
        this.f1307t--;
        long P = P() + 1;
        if (this.f1305r < P) {
            this.f1305r = P;
        }
        if (this.f1306s < P) {
            G(P);
        }
    }

    public final Object L(T t2, Continuation<? super Unit> continuation) {
        Continuation intercepted;
        Continuation<Unit>[] continuationArr;
        a aVar;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        j.r rVar = new j.r(intercepted, 1);
        rVar.E();
        Continuation<Unit>[] continuationArr2 = p.c.f1823a;
        synchronized (this) {
            if (X(t2)) {
                Result.Companion companion = Result.Companion;
                rVar.resumeWith(Result.m3581constructorimpl(Unit.INSTANCE));
                continuationArr = N(continuationArr2);
                aVar = null;
            } else {
                a aVar2 = new a(this, V() + P(), t2, rVar);
                M(aVar2);
                this.f1308u++;
                if (this.f1302o == 0) {
                    continuationArr2 = N(continuationArr2);
                }
                continuationArr = continuationArr2;
                aVar = aVar2;
            }
        }
        if (aVar != null) {
            j.t.a(rVar, aVar);
        }
        for (Continuation<Unit> continuation2 : continuationArr) {
            if (continuation2 != null) {
                Result.Companion companion2 = Result.Companion;
                continuation2.resumeWith(Result.m3581constructorimpl(Unit.INSTANCE));
            }
        }
        Object x = rVar.x();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (x == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return x == coroutine_suspended2 ? x : Unit.INSTANCE;
    }

    public final void M(Object obj) {
        int V = V();
        Object[] objArr = this.f1304q;
        if (objArr == null) {
            objArr = W(null, 0, 2);
        } else if (V >= objArr.length) {
            objArr = W(objArr, V, objArr.length * 2);
        }
        k0.h(objArr, P() + V, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    public final Continuation<Unit>[] N(Continuation<Unit>[] continuationArr) {
        p.d[] f2;
        l0 l0Var;
        Continuation<? super Unit> continuation;
        int length = continuationArr.length;
        if (p.b.e(this) != 0 && (f2 = p.b.f(this)) != null) {
            int i2 = 0;
            int length2 = f2.length;
            continuationArr = continuationArr;
            while (i2 < length2) {
                p.d dVar = f2[i2];
                if (dVar != null && (continuation = (l0Var = (l0) dVar).f1393b) != null && Z(l0Var) >= 0) {
                    int length3 = continuationArr.length;
                    continuationArr = continuationArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(continuationArr, Math.max(2, continuationArr.length * 2));
                        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                        continuationArr = copyOf;
                    }
                    continuationArr[length] = continuation;
                    l0Var.f1393b = null;
                    length++;
                }
                i2++;
                continuationArr = continuationArr;
            }
        }
        return continuationArr;
    }

    public final long O() {
        return P() + this.f1307t;
    }

    public final T Q() {
        Object f2;
        Object[] objArr = this.f1304q;
        Intrinsics.checkNotNull(objArr);
        f2 = k0.f(objArr, (this.f1305r + U()) - 1);
        return (T) f2;
    }

    public final Object S(long j2) {
        Object f2;
        Object[] objArr = this.f1304q;
        Intrinsics.checkNotNull(objArr);
        f2 = k0.f(objArr, j2);
        return f2 instanceof a ? ((a) f2).f1311l : f2;
    }

    public final long T() {
        return P() + this.f1307t + this.f1308u;
    }

    public final int U() {
        return (int) ((P() + this.f1307t) - this.f1305r);
    }

    public final int V() {
        return this.f1307t + this.f1308u;
    }

    public final Object[] W(Object[] objArr, int i2, int i3) {
        Object f2;
        if (i3 > 0) {
            Object[] objArr2 = new Object[i3];
            this.f1304q = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long P = P();
            for (int i4 = 0; i4 < i2; i4++) {
                long j2 = i4 + P;
                f2 = k0.f(objArr, j2);
                k0.h(objArr2, j2, f2);
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    public final boolean X(T t2) {
        if (n() == 0) {
            return Y(t2);
        }
        if (this.f1307t >= this.f1302o && this.f1306s <= this.f1305r) {
            int i2 = b.f1313a[this.f1303p.ordinal()];
            if (i2 == 1) {
                return false;
            }
            if (i2 == 2) {
                return true;
            }
        }
        M(t2);
        int i3 = this.f1307t + 1;
        this.f1307t = i3;
        if (i3 > this.f1302o) {
            J();
        }
        if (U() > this.f1301n) {
            b0(this.f1305r + 1, this.f1306s, O(), T());
        }
        return true;
    }

    public final boolean Y(T t2) {
        if (this.f1301n == 0) {
            return true;
        }
        M(t2);
        int i2 = this.f1307t + 1;
        this.f1307t = i2;
        if (i2 > this.f1301n) {
            J();
        }
        this.f1306s = P() + this.f1307t;
        return true;
    }

    public final long Z(l0 l0Var) {
        long j2 = l0Var.f1392a;
        if (j2 < O()) {
            return j2;
        }
        if (this.f1302o <= 0 && j2 <= P() && this.f1308u != 0) {
            return j2;
        }
        return -1L;
    }

    @Override // o.i0
    @NotNull
    public List<T> a() {
        Object f2;
        List<T> emptyList;
        synchronized (this) {
            int U = U();
            if (U == 0) {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
                return emptyList;
            }
            ArrayList arrayList = new ArrayList(U);
            Object[] objArr = this.f1304q;
            Intrinsics.checkNotNull(objArr);
            for (int i2 = 0; i2 < U; i2++) {
                f2 = k0.f(objArr, this.f1305r + i2);
                arrayList.add(f2);
            }
            return arrayList;
        }
    }

    public final Object a0(l0 l0Var) {
        Object obj;
        Continuation<Unit>[] continuationArr = p.c.f1823a;
        synchronized (this) {
            long Z = Z(l0Var);
            if (Z < 0) {
                obj = k0.f1322a;
            } else {
                long j2 = l0Var.f1392a;
                Object S = S(Z);
                l0Var.f1392a = Z + 1;
                continuationArr = c0(j2);
                obj = S;
            }
        }
        for (Continuation<Unit> continuation : continuationArr) {
            if (continuation != null) {
                Result.Companion companion = Result.Companion;
                continuation.resumeWith(Result.m3581constructorimpl(Unit.INSTANCE));
            }
        }
        return obj;
    }

    @Override // p.r
    @NotNull
    public i<T> b(@NotNull CoroutineContext coroutineContext, int i2, @NotNull l.m mVar) {
        return k0.e(this, coroutineContext, i2, mVar);
    }

    public final void b0(long j2, long j3, long j4, long j5) {
        long min = Math.min(j3, j2);
        for (long P = P(); P < min; P++) {
            Object[] objArr = this.f1304q;
            Intrinsics.checkNotNull(objArr);
            k0.h(objArr, P, null);
        }
        this.f1305r = j2;
        this.f1306s = j3;
        this.f1307t = (int) (j4 - min);
        this.f1308u = (int) (j5 - j4);
    }

    @NotNull
    public final Continuation<Unit>[] c0(long j2) {
        long j3;
        long j4;
        Object f2;
        Object f3;
        long j5;
        p.d[] f4;
        if (j2 > this.f1306s) {
            return p.c.f1823a;
        }
        long P = P();
        long j6 = this.f1307t + P;
        if (this.f1302o == 0 && this.f1308u > 0) {
            j6++;
        }
        if (p.b.e(this) != 0 && (f4 = p.b.f(this)) != null) {
            for (p.d dVar : f4) {
                if (dVar != null) {
                    long j7 = ((l0) dVar).f1392a;
                    if (j7 >= 0 && j7 < j6) {
                        j6 = j7;
                    }
                }
            }
        }
        if (j6 <= this.f1306s) {
            return p.c.f1823a;
        }
        long O = O();
        int min = n() > 0 ? Math.min(this.f1308u, this.f1302o - ((int) (O - j6))) : this.f1308u;
        Continuation<Unit>[] continuationArr = p.c.f1823a;
        long j8 = this.f1308u + O;
        if (min > 0) {
            continuationArr = new Continuation[min];
            Object[] objArr = this.f1304q;
            Intrinsics.checkNotNull(objArr);
            long j9 = O;
            int i2 = 0;
            while (true) {
                if (O >= j8) {
                    j3 = j6;
                    j4 = j8;
                    break;
                }
                f3 = k0.f(objArr, O);
                j3 = j6;
                q.r0 r0Var = k0.f1322a;
                if (f3 == r0Var) {
                    j4 = j8;
                    j5 = 1;
                } else if (f3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                } else {
                    a aVar = (a) f3;
                    int i3 = i2 + 1;
                    j4 = j8;
                    continuationArr[i2] = aVar.f1312m;
                    k0.h(objArr, O, r0Var);
                    k0.h(objArr, j9, aVar.f1311l);
                    j5 = 1;
                    j9++;
                    if (i3 >= min) {
                        break;
                    }
                    i2 = i3;
                }
                O += j5;
                j6 = j3;
                j8 = j4;
            }
            O = j9;
        } else {
            j3 = j6;
            j4 = j8;
        }
        int i4 = (int) (O - P);
        long j10 = n() == 0 ? O : j3;
        long max = Math.max(this.f1305r, O - Math.min(this.f1301n, i4));
        if (this.f1302o == 0 && max < j4) {
            Object[] objArr2 = this.f1304q;
            Intrinsics.checkNotNull(objArr2);
            f2 = k0.f(objArr2, max);
            if (Intrinsics.areEqual(f2, k0.f1322a)) {
                O++;
                max++;
            }
        }
        b0(max, j10, O, j4);
        E();
        return (continuationArr.length == 0) ^ true ? N(continuationArr) : continuationArr;
    }

    @Override // o.i0, o.i
    @Nullable
    public Object collect(@NotNull j<? super T> jVar, @NotNull Continuation<?> continuation) {
        return F(this, jVar, continuation);
    }

    @Override // o.d0
    public void d() {
        synchronized (this) {
            b0(O(), this.f1306s, O(), T());
            Unit unit = Unit.INSTANCE;
        }
    }

    public final long d0() {
        long j2 = this.f1305r;
        if (j2 < this.f1306s) {
            this.f1306s = j2;
        }
        return j2;
    }

    @Override // o.d0, o.j
    @Nullable
    public Object emit(T t2, @NotNull Continuation<? super Unit> continuation) {
        return K(this, t2, continuation);
    }

    @Override // o.d0
    public boolean g(T t2) {
        int i2;
        boolean z;
        Continuation<Unit>[] continuationArr = p.c.f1823a;
        synchronized (this) {
            if (X(t2)) {
                continuationArr = N(continuationArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (Continuation<Unit> continuation : continuationArr) {
            if (continuation != null) {
                Result.Companion companion = Result.Companion;
                continuation.resumeWith(Result.m3581constructorimpl(Unit.INSTANCE));
            }
        }
        return z;
    }
}
