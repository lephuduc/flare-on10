package s;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.analytics.FirebaseAnalytics;
import j.z0;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q.m0;
import q.r0;

@Metadata(bv = {}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \t2\u00020\u00012\u00020\u0002:\u0003\u0006\u0013%B+\u0012\u0006\u0010H\u001a\u00020\f\u0012\u0006\u0010J\u001a\u00020\f\u0012\b\b\u0002\u0010M\u001a\u00020\u000f\u0012\b\b\u0002\u0010P\u001a\u00020B¢\u0006\u0004\b[\u0010\\J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0018\u00010\bR\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\bR\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082\b¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\fH\u0082\b¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\fH\u0082\b¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u000fH\u0082\b¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019H\u0082\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005H\u0082\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000fH\u0082\b¢\u0006\u0004\b\u001e\u0010\u0018J\u0017\u0010 \u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0005H\u0002¢\u0006\u0004\b$\u0010\u001dJ\u000f\u0010%\u001a\u00020\fH\u0002¢\u0006\u0004\b%\u0010\u0015J+\u0010'\u001a\u0004\u0018\u00010\u0003*\b\u0018\u00010\bR\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0005H\u0002¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\b\u0018\u00010\bR\u00020\u0000H\u0002¢\u0006\u0004\b)\u0010\nJ)\u0010,\u001a\u00020\u00192\n\u0010\u000b\u001a\u00060\bR\u00020\u00002\u0006\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020\f¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\u00020\u00052\n\u0010\u000b\u001a\u00060\bR\u00020\u0000¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0086\b¢\u0006\u0004\b0\u0010\u0012J\u001b\u00104\u001a\u00020\u00192\n\u00103\u001a\u000601j\u0002`2H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0019H\u0016¢\u0006\u0004\b6\u0010\u001bJ\u0015\u00108\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u000f¢\u0006\u0004\b8\u00109J-\u0010=\u001a\u00020\u00192\n\u0010:\u001a\u000601j\u0002`22\b\b\u0002\u0010<\u001a\u00020;2\b\b\u0002\u0010&\u001a\u00020\u0005¢\u0006\u0004\b=\u0010>J!\u0010?\u001a\u00020\u00032\n\u0010:\u001a\u000601j\u0002`22\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\u0019¢\u0006\u0004\bA\u0010\u001bJ\u000f\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DJ\u0015\u0010E\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u0010GR\u0014\u0010J\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bI\u0010GR\u0014\u0010M\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010P\u001a\u00020B8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010S\u001a\u00020Q8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010RR\u0014\u0010T\u001a\u00020Q8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010RR\u001e\u0010W\u001a\f\u0012\b\u0012\u00060\bR\u00020\u00000U8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010VR\u0015\u0010X\u001a\u00020\f8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010\u0015R\u0015\u0010Y\u001a\u00020\f8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010\u0015R\u0011\u0010Z\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bZ\u0010\u001d¨\u0006]"}, d2 = {"Ls/a;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "Ls/k;", "task", "", "a", "(Ls/k;)Z", "Ls/a$c;", "q", "()Ls/a$c;", "worker", "", "p", "(Ls/a$c;)I", "", "state", "f", "(J)I", "c", "o", "()I", "i", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "()J", "", "h", "()V", "z", "()Z", "t", "skipUnpark", "w", "(Z)V", "A", "(J)Z", "C", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "tailDispatch", "y", "(Ls/a$c;Ls/k;Z)Ls/k;", "g", "oldIndex", "newIndex", "s", "(Ls/a$c;II)V", "r", "(Ls/a$c;)Z", "b", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "command", "execute", "(Ljava/lang/Runnable;)V", "close", "timeout", "v", "(J)V", "block", "Ls/l;", "taskContext", "j", "(Ljava/lang/Runnable;Ls/l;Z)V", "e", "(Ljava/lang/Runnable;Ls/l;)Ls/k;", "x", "", "toString", "()Ljava/lang/String;", "u", "(Ls/k;)V", "I", "corePoolSize", "k", "maxPoolSize", "l", "J", "idleWorkerKeepAliveNs", "m", "Ljava/lang/String;", "schedulerName", "Ls/f;", "Ls/f;", "globalCpuQueue", "globalBlockingQueue", "Lq/m0;", "Lq/m0;", "workers", "createdWorkers", "availableCpuPermits", "isTerminated", "<init>", "(IIJLjava/lang/String;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class a implements Executor, Closeable {
    public static final long A = 4398044413952L;
    public static final int B = 42;
    public static final long C = 9223367638808264704L;
    public static final int D = 1;
    public static final int E = 2097150;
    public static final long F = 2097151;
    public static final long G = -2097152;
    public static final long H = 2097152;

    /* renamed from: v  reason: collision with root package name */
    public static final int f2094v = -1;
    public static final int w = 0;
    public static final int x = 1;
    public static final int y = 21;
    public static final long z = 2097151;
    @NotNull
    private volatile /* synthetic */ int _isTerminated;
    @NotNull
    public volatile /* synthetic */ long controlState;
    @JvmField

    /* renamed from: j  reason: collision with root package name */
    public final int f2095j;
    @JvmField

    /* renamed from: k  reason: collision with root package name */
    public final int f2096k;
    @JvmField

    /* renamed from: l  reason: collision with root package name */
    public final long f2097l;
    @JvmField
    @NotNull

    /* renamed from: m  reason: collision with root package name */
    public final String f2098m;
    @JvmField
    @NotNull

    /* renamed from: n  reason: collision with root package name */
    public final f f2099n;
    @JvmField
    @NotNull

    /* renamed from: o  reason: collision with root package name */
    public final f f2100o;
    @JvmField
    @NotNull

    /* renamed from: p  reason: collision with root package name */
    public final m0<c> f2101p;
    @NotNull
    private volatile /* synthetic */ long parkedWorkersStack;
    @NotNull

    /* renamed from: q  reason: collision with root package name */
    public static final C0096a f2089q = new C0096a(null);
    @JvmField
    @NotNull

    /* renamed from: u  reason: collision with root package name */
    public static final r0 f2093u = new r0("NOT_IN_STACK");

    /* renamed from: r  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f2090r = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");

    /* renamed from: s  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f2091s = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2092t = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007¨\u0006\u0018"}, d2 = {"Ls/a$a;", "", "", "BLOCKING_MASK", "J", "", "BLOCKING_SHIFT", "I", "CLAIMED", "CPU_PERMITS_MASK", "CPU_PERMITS_SHIFT", "CREATED_MASK", "MAX_SUPPORTED_POOL_SIZE", "MIN_SUPPORTED_POOL_SIZE", "Lq/r0;", "NOT_IN_STACK", "Lq/r0;", "PARKED", "PARKED_INDEX_MASK", "PARKED_VERSION_INC", "PARKED_VERSION_MASK", "TERMINATED", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: s.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0096a {
        public C0096a() {
        }

        public /* synthetic */ C0096a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2102a;

        static {
            int[] iArr = new int[d.values().length];
            iArr[d.PARKING.ordinal()] = 1;
            iArr[d.BLOCKING.ordinal()] = 2;
            iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            iArr[d.DORMANT.ordinal()] = 4;
            iArr[d.TERMINATED.ordinal()] = 5;
            f2102a = iArr;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0004\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bD\u0010EB\u0011\b\u0016\u0012\u0006\u0010'\u001a\u00020\n¢\u0006\u0004\bD\u0010FJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\tJ\u000f\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\tJ\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\tJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001f\u0010\tJ\u0017\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\u001cJ\u0019\u0010\"\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010\u0011J\u0011\u0010#\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b#\u0010$J\u0019\u0010&\u001a\u0004\u0018\u00010\u000f2\u0006\u0010%\u001a\u00020\u0004H\u0002¢\u0006\u0004\b&\u0010\u0011R*\u0010(\u001a\u00020\n2\u0006\u0010'\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010\u001cR\u0014\u0010/\u001a\u00020-8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010.R\u0016\u00101\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0016\u00100R\u0016\u00104\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u00103R$\u00106\u001a\u0004\u0018\u0001058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0016\u0010<\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u00103R\u0016\u0010=\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010)R\u0016\u0010?\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010>R\u0012\u0010C\u001a\u00020@8Æ\u0002¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006G"}, d2 = {"Ls/a$c;", "Ljava/lang/Thread;", "Ls/a$d;", "newState", "", "t", "(Ls/a$d;)Z", "", "run", "()V", "", "upperBound", "l", "(I)I", "scanLocalQueue", "Ls/k;", "f", "(Z)Ls/k;", "r", "()Z", "o", "s", "k", "task", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "(Ls/k;)V", "taskMode", "c", "(I)V", "b", "m", "v", "mode", "j", "e", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "()Ls/k;", "blockingOnly", "u", FirebaseAnalytics.Param.INDEX, "indexInArray", "I", "g", "()I", "p", "Ls/q;", "Ls/q;", "localQueue", "Ls/a$d;", "state", "", "J", "terminationDeadline", "", "nextParkedWorker", "Ljava/lang/Object;", "h", "()Ljava/lang/Object;", "q", "(Ljava/lang/Object;)V", "minDelayUntilStealableTaskNs", "rngState", "Z", "mayHaveLocalTasks", "Ls/a;", "i", "()Ls/a;", "scheduler", "<init>", "(Ls/a;)V", "(Ls/a;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public final class c extends Thread {

        /* renamed from: q  reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f2103q = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");
        private volatile int indexInArray;
        @JvmField
        @NotNull

        /* renamed from: j  reason: collision with root package name */
        public final q f2104j;
        @JvmField
        @NotNull

        /* renamed from: k  reason: collision with root package name */
        public d f2105k;

        /* renamed from: l  reason: collision with root package name */
        public long f2106l;

        /* renamed from: m  reason: collision with root package name */
        public long f2107m;

        /* renamed from: n  reason: collision with root package name */
        public int f2108n;
        @Nullable
        private volatile Object nextParkedWorker;
        @JvmField

        /* renamed from: o  reason: collision with root package name */
        public boolean f2109o;
        @NotNull
        public volatile /* synthetic */ int workerCtl;

        public c() {
            setDaemon(true);
            this.f2104j = new q();
            this.f2105k = d.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = a.f2093u;
            this.f2108n = Random.Default.nextInt();
        }

        public c(a aVar, int i2) {
            this();
            p(i2);
        }

        public final void b(int i2) {
            if (i2 == 0) {
                return;
            }
            a.f2091s.addAndGet(a.this, a.G);
            if (this.f2105k != d.TERMINATED) {
                this.f2105k = d.DORMANT;
            }
        }

        public final void c(int i2) {
            if (i2 != 0 && t(d.BLOCKING)) {
                a.this.x();
            }
        }

        public final void d(k kVar) {
            int f2 = kVar.f2138k.f();
            j(f2);
            c(f2);
            a.this.u(kVar);
            b(f2);
        }

        public final k e(boolean z) {
            k n2;
            k n3;
            if (z) {
                boolean z2 = l(a.this.f2095j * 2) == 0;
                if (z2 && (n3 = n()) != null) {
                    return n3;
                }
                k h2 = this.f2104j.h();
                if (h2 != null) {
                    return h2;
                }
                if (!z2 && (n2 = n()) != null) {
                    return n2;
                }
            } else {
                k n4 = n();
                if (n4 != null) {
                    return n4;
                }
            }
            return u(false);
        }

        @Nullable
        public final k f(boolean z) {
            k g2;
            if (r()) {
                return e(z);
            }
            if (!z || (g2 = this.f2104j.h()) == null) {
                g2 = a.this.f2100o.g();
            }
            return g2 == null ? u(true) : g2;
        }

        public final int g() {
            return this.indexInArray;
        }

        @Nullable
        public final Object h() {
            return this.nextParkedWorker;
        }

        @NotNull
        public final a i() {
            return a.this;
        }

        public final void j(int i2) {
            this.f2106l = 0L;
            if (this.f2105k == d.PARKING) {
                this.f2105k = d.BLOCKING;
            }
        }

        public final boolean k() {
            return this.nextParkedWorker != a.f2093u;
        }

        public final int l(int i2) {
            int i3 = this.f2108n;
            int i4 = i3 ^ (i3 << 13);
            int i5 = i4 ^ (i4 >> 17);
            int i6 = i5 ^ (i5 << 5);
            this.f2108n = i6;
            int i7 = i2 - 1;
            return (i7 & i2) == 0 ? i7 & i6 : (Integer.MAX_VALUE & i6) % i2;
        }

        public final void m() {
            if (this.f2106l == 0) {
                this.f2106l = System.nanoTime() + a.this.f2097l;
            }
            LockSupport.parkNanos(a.this.f2097l);
            if (System.nanoTime() - this.f2106l >= 0) {
                this.f2106l = 0L;
                v();
            }
        }

        public final k n() {
            f fVar;
            if (l(2) == 0) {
                k g2 = a.this.f2099n.g();
                if (g2 != null) {
                    return g2;
                }
                fVar = a.this.f2100o;
            } else {
                k g3 = a.this.f2100o.g();
                if (g3 != null) {
                    return g3;
                }
                fVar = a.this.f2099n;
            }
            return fVar.g();
        }

        public final void o() {
            loop0: while (true) {
                boolean z = false;
                while (!a.this.isTerminated() && this.f2105k != d.TERMINATED) {
                    k f2 = f(this.f2109o);
                    if (f2 != null) {
                        this.f2107m = 0L;
                        d(f2);
                    } else {
                        this.f2109o = false;
                        if (this.f2107m == 0) {
                            s();
                        } else if (z) {
                            t(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f2107m);
                            this.f2107m = 0L;
                        } else {
                            z = true;
                        }
                    }
                }
            }
            t(d.TERMINATED);
        }

        public final void p(int i2) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.f2098m);
            sb.append("-worker-");
            sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
            setName(sb.toString());
            this.indexInArray = i2;
        }

        public final void q(@Nullable Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean r() {
            boolean z;
            if (this.f2105k != d.CPU_ACQUIRED) {
                a aVar = a.this;
                while (true) {
                    long j2 = aVar.controlState;
                    if (((int) ((a.C & j2) >> 42)) != 0) {
                        if (a.f2091s.compareAndSet(aVar, j2, j2 - 4398046511104L)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    return false;
                }
                this.f2105k = d.CPU_ACQUIRED;
            }
            return true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            o();
        }

        public final void s() {
            if (!k()) {
                a.this.r(this);
                return;
            }
            this.workerCtl = -1;
            while (k() && this.workerCtl == -1 && !a.this.isTerminated() && this.f2105k != d.TERMINATED) {
                t(d.PARKING);
                Thread.interrupted();
                m();
            }
        }

        public final boolean t(@NotNull d dVar) {
            d dVar2 = this.f2105k;
            boolean z = dVar2 == d.CPU_ACQUIRED;
            if (z) {
                a.f2091s.addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f2105k = dVar;
            }
            return z;
        }

        public final k u(boolean z) {
            int i2 = (int) (a.this.controlState & 2097151);
            if (i2 < 2) {
                return null;
            }
            int l2 = l(i2);
            a aVar = a.this;
            long j2 = Long.MAX_VALUE;
            for (int i3 = 0; i3 < i2; i3++) {
                l2++;
                if (l2 > i2) {
                    l2 = 1;
                }
                c b2 = aVar.f2101p.b(l2);
                if (b2 != null && b2 != this) {
                    q qVar = this.f2104j;
                    q qVar2 = b2.f2104j;
                    long k2 = z ? qVar.k(qVar2) : qVar.l(qVar2);
                    if (k2 == -1) {
                        return this.f2104j.h();
                    }
                    if (k2 > 0) {
                        j2 = Math.min(j2, k2);
                    }
                }
            }
            if (j2 == Long.MAX_VALUE) {
                j2 = 0;
            }
            this.f2107m = j2;
            return null;
        }

        public final void v() {
            a aVar = a.this;
            synchronized (aVar.f2101p) {
                if (aVar.isTerminated()) {
                    return;
                }
                if (((int) (aVar.controlState & 2097151)) <= aVar.f2095j) {
                    return;
                }
                if (f2103q.compareAndSet(this, -1, 1)) {
                    int i2 = this.indexInArray;
                    p(0);
                    aVar.s(this, i2, 0);
                    int andDecrement = (int) (a.f2091s.getAndDecrement(aVar) & 2097151);
                    if (andDecrement != i2) {
                        c b2 = aVar.f2101p.b(andDecrement);
                        Intrinsics.checkNotNull(b2);
                        c cVar = b2;
                        aVar.f2101p.c(i2, cVar);
                        cVar.p(i2);
                        aVar.s(cVar, andDecrement, i2);
                    }
                    aVar.f2101p.c(andDecrement, null);
                    Unit unit = Unit.INSTANCE;
                    this.f2105k = d.TERMINATED;
                }
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Ls/a$d;", "", "<init>", "(Ljava/lang/String;I)V", "CPU_ACQUIRED", "BLOCKING", "PARKING", "DORMANT", "TERMINATED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public a(int i2, int i3, long j2, @NotNull String str) {
        this.f2095j = i2;
        this.f2096k = i3;
        this.f2097l = j2;
        this.f2098m = str;
        if (!(i2 >= 1)) {
            throw new IllegalArgumentException(("Core pool size " + i2 + " should be at least 1").toString());
        }
        if (!(i3 >= i2)) {
            throw new IllegalArgumentException(("Max pool size " + i3 + " should be greater than or equals to core pool size " + i2).toString());
        }
        if (!(i3 <= 2097150)) {
            throw new IllegalArgumentException(("Max pool size " + i3 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (!(j2 > 0)) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j2 + " must be positive").toString());
        }
        this.f2099n = new f();
        this.f2100o = new f();
        this.parkedWorkersStack = 0L;
        this.f2101p = new m0<>(i2 + 1);
        this.controlState = i2 << 42;
        this._isTerminated = 0;
    }

    public /* synthetic */ a(int i2, int i3, long j2, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, (i4 & 4) != 0 ? o.f2145e : j2, (i4 & 8) != 0 ? o.f2141a : str);
    }

    public static /* synthetic */ boolean B(a aVar, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = aVar.controlState;
        }
        return aVar.A(j2);
    }

    public static /* synthetic */ void k(a aVar, Runnable runnable, l lVar, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            lVar = o.f2149i;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        aVar.j(runnable, lVar, z2);
    }

    public final boolean A(long j2) {
        int coerceAtLeast;
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(((int) (2097151 & j2)) - ((int) ((j2 & A) >> 21)), 0);
        if (coerceAtLeast < this.f2095j) {
            int d2 = d();
            if (d2 == 1 && this.f2095j > 1) {
                d();
            }
            if (d2 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean C() {
        c q2;
        do {
            q2 = q();
            if (q2 == null) {
                return false;
            }
        } while (!c.f2103q.compareAndSet(q2, -1, 0));
        LockSupport.unpark(q2);
        return true;
    }

    public final boolean a(k kVar) {
        return (kVar.f2138k.f() == 1 ? this.f2100o : this.f2099n).a(kVar);
    }

    public final int b(long j2) {
        return (int) ((j2 & C) >> 42);
    }

    public final int c(long j2) {
        return (int) ((j2 & A) >> 21);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        v(10000L);
    }

    public final int d() {
        int coerceAtLeast;
        synchronized (this.f2101p) {
            if (isTerminated()) {
                return -1;
            }
            long j2 = this.controlState;
            int i2 = (int) (j2 & 2097151);
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(i2 - ((int) ((j2 & A) >> 21)), 0);
            if (coerceAtLeast >= this.f2095j) {
                return 0;
            }
            if (i2 >= this.f2096k) {
                return 0;
            }
            int i3 = ((int) (this.controlState & 2097151)) + 1;
            if (i3 > 0 && this.f2101p.b(i3) == null) {
                c cVar = new c(this, i3);
                this.f2101p.c(i3, cVar);
                if (i3 == ((int) (2097151 & f2091s.incrementAndGet(this)))) {
                    cVar.start();
                    return coerceAtLeast + 1;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    @NotNull
    public final k e(@NotNull Runnable runnable, @NotNull l lVar) {
        long a2 = o.f2146f.a();
        if (runnable instanceof k) {
            k kVar = (k) runnable;
            kVar.f2137j = a2;
            kVar.f2138k = lVar;
            return kVar;
        }
        return new n(runnable, a2, lVar);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable runnable) {
        k(this, runnable, null, false, 6, null);
    }

    public final int f(long j2) {
        return (int) (j2 & 2097151);
    }

    public final c g() {
        Thread currentThread = Thread.currentThread();
        c cVar = currentThread instanceof c ? (c) currentThread : null;
        if (cVar == null || !Intrinsics.areEqual(a.this, this)) {
            return null;
        }
        return cVar;
    }

    public final void h() {
        f2091s.addAndGet(this, G);
    }

    public final int i() {
        return (int) (f2091s.getAndDecrement(this) & 2097151);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final void j(@NotNull Runnable runnable, @NotNull l lVar, boolean z2) {
        j.b b2 = j.c.b();
        if (b2 != null) {
            b2.e();
        }
        k e2 = e(runnable, lVar);
        c g2 = g();
        k y2 = y(g2, e2, z2);
        if (y2 != null && !a(y2)) {
            throw new RejectedExecutionException(this.f2098m + " was terminated");
        }
        boolean z3 = z2 && g2 != null;
        if (e2.f2138k.f() != 0) {
            w(z3);
        } else if (z3) {
        } else {
            x();
        }
    }

    public final int l() {
        return (int) ((this.controlState & C) >> 42);
    }

    public final int m() {
        return (int) (this.controlState & 2097151);
    }

    public final long n() {
        return f2091s.addAndGet(this, H);
    }

    public final int o() {
        return (int) (f2091s.incrementAndGet(this) & 2097151);
    }

    public final int p(c cVar) {
        Object h2 = cVar.h();
        while (h2 != f2093u) {
            if (h2 == null) {
                return 0;
            }
            c cVar2 = (c) h2;
            int g2 = cVar2.g();
            if (g2 != 0) {
                return g2;
            }
            h2 = cVar2.h();
        }
        return -1;
    }

    public final c q() {
        while (true) {
            long j2 = this.parkedWorkersStack;
            c b2 = this.f2101p.b((int) (2097151 & j2));
            if (b2 == null) {
                return null;
            }
            long j3 = (H + j2) & G;
            int p2 = p(b2);
            if (p2 >= 0 && f2090r.compareAndSet(this, j2, p2 | j3)) {
                b2.q(f2093u);
                return b2;
            }
        }
    }

    public final boolean r(@NotNull c cVar) {
        long j2;
        long j3;
        int g2;
        if (cVar.h() != f2093u) {
            return false;
        }
        do {
            j2 = this.parkedWorkersStack;
            j3 = (H + j2) & G;
            g2 = cVar.g();
            cVar.q(this.f2101p.b((int) (2097151 & j2)));
        } while (!f2090r.compareAndSet(this, j2, j3 | g2));
        return true;
    }

    public final void s(@NotNull c cVar, int i2, int i3) {
        while (true) {
            long j2 = this.parkedWorkersStack;
            int i4 = (int) (2097151 & j2);
            long j3 = (H + j2) & G;
            if (i4 == i2) {
                i4 = i3 == 0 ? p(cVar) : i3;
            }
            if (i4 >= 0 && f2090r.compareAndSet(this, j2, j3 | i4)) {
                return;
            }
        }
    }

    public final long t() {
        return f2091s.addAndGet(this, 4398046511104L);
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        char c2;
        ArrayList arrayList = new ArrayList();
        int a2 = this.f2101p.a();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < a2; i7++) {
            c b2 = this.f2101p.b(i7);
            if (b2 != null) {
                int f2 = b2.f2104j.f();
                int i8 = b.f2102a[b2.f2105k.ordinal()];
                if (i8 != 1) {
                    if (i8 == 2) {
                        i3++;
                        sb = new StringBuilder();
                        sb.append(f2);
                        c2 = 'b';
                    } else if (i8 == 3) {
                        i2++;
                        sb = new StringBuilder();
                        sb.append(f2);
                        c2 = 'c';
                    } else if (i8 == 4) {
                        i5++;
                        if (f2 > 0) {
                            sb = new StringBuilder();
                            sb.append(f2);
                            c2 = 'd';
                        }
                    } else if (i8 == 5) {
                        i6++;
                    }
                    sb.append(c2);
                    arrayList.add(sb.toString());
                } else {
                    i4++;
                }
            }
        }
        long j2 = this.controlState;
        return this.f2098m + '@' + z0.b(this) + "[Pool Size {core = " + this.f2095j + ", max = " + this.f2096k + "}, Worker States {CPU = " + i2 + ", blocking = " + i3 + ", parked = " + i4 + ", dormant = " + i5 + ", terminated = " + i6 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f2099n.c() + ", global blocking queue size = " + this.f2100o.c() + ", Control State {created workers= " + ((int) (2097151 & j2)) + ", blocking tasks = " + ((int) ((A & j2) >> 21)) + ", CPUs acquired = " + (this.f2095j - ((int) ((C & j2) >> 42))) + "}]";
    }

    public final void u(@NotNull k kVar) {
        try {
            kVar.run();
        } catch (Throwable th) {
            try {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                j.b b2 = j.c.b();
                if (b2 == null) {
                }
            } finally {
                j.b b3 = j.c.b();
                if (b3 != null) {
                    b3.f();
                }
            }
        }
    }

    public final void v(long j2) {
        int i2;
        k g2;
        if (f2092t.compareAndSet(this, 0, 1)) {
            c g3 = g();
            synchronized (this.f2101p) {
                i2 = (int) (this.controlState & 2097151);
            }
            if (1 <= i2) {
                int i3 = 1;
                while (true) {
                    c b2 = this.f2101p.b(i3);
                    Intrinsics.checkNotNull(b2);
                    c cVar = b2;
                    if (cVar != g3) {
                        while (cVar.isAlive()) {
                            LockSupport.unpark(cVar);
                            cVar.join(j2);
                        }
                        cVar.f2104j.g(this.f2100o);
                    }
                    if (i3 == i2) {
                        break;
                    }
                    i3++;
                }
            }
            this.f2100o.b();
            this.f2099n.b();
            while (true) {
                if (g3 != null) {
                    g2 = g3.f(true);
                    if (g2 != null) {
                        continue;
                        u(g2);
                    }
                }
                g2 = this.f2099n.g();
                if (g2 == null && (g2 = this.f2100o.g()) == null) {
                    break;
                }
                u(g2);
            }
            if (g3 != null) {
                g3.t(d.TERMINATED);
            }
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }

    public final void w(boolean z2) {
        long addAndGet = f2091s.addAndGet(this, H);
        if (z2 || C() || A(addAndGet)) {
            return;
        }
        C();
    }

    public final void x() {
        if (C() || B(this, 0L, 1, null)) {
            return;
        }
        C();
    }

    public final k y(c cVar, k kVar, boolean z2) {
        if (cVar == null || cVar.f2105k == d.TERMINATED) {
            return kVar;
        }
        if (kVar.f2138k.f() == 0 && cVar.f2105k == d.BLOCKING) {
            return kVar;
        }
        cVar.f2109o = true;
        return cVar.f2104j.a(kVar, z2);
    }

    public final boolean z() {
        long j2;
        do {
            j2 = this.controlState;
            if (((int) ((C & j2) >> 42)) == 0) {
                return false;
            }
        } while (!f2091s.compareAndSet(this, j2, j2 - 4398046511104L));
        return true;
    }
}
