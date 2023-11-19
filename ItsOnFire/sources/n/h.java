package n;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import j.n2;
import j.o0;
import j.r2;
import j.s0;
import j.t0;
import j.v2;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.concurrent.ThreadsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__IndentKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q.q0;

@Metadata(bv = {}, d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\"\n\u0002\b\u000f\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u0095\u0001B\n\b\u0002¢\u0006\u0005\b\u0094\u0001\u0010\bJ\u001d\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ;\u0010\u0013\u001a\u00020\u0004*\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J@\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\b\b\u0000\u0010\u0015*\u00020\u00012\u001e\b\u0004\u0010\u0019\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00028\u00000\u0016H\u0082\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u0011*\u00020\u0001H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0017H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J%\u0010'\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u001aH\u0002¢\u0006\u0004\b'\u0010(J5\u0010-\u001a\b\u0012\u0004\u0012\u00020%0\u001a2\u0006\u0010)\u001a\u00020\u00112\b\u0010+\u001a\u0004\u0018\u00010*2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020%0\u001aH\u0002¢\u0006\u0004\b-\u0010.J?\u00104\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/032\u0006\u00100\u001a\u00020/2\f\u00102\u001a\b\u0012\u0004\u0012\u00020%012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020%0\u001aH\u0002¢\u0006\u0004\b4\u00105J3\u00107\u001a\u00020/2\u0006\u00106\u001a\u00020/2\f\u00102\u001a\b\u0012\u0004\u0012\u00020%012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020%0\u001aH\u0002¢\u0006\u0004\b7\u00108J#\u0010;\u001a\u00020\u00042\n\u0010:\u001a\u0006\u0012\u0002\b\u0003092\u0006\u0010)\u001a\u00020\u0011H\u0002¢\u0006\u0004\b;\u0010<J\u001f\u0010\u0015\u001a\u00020\u00042\u0006\u0010:\u001a\u00020=2\u0006\u0010)\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010>J\u0016\u0010?\u001a\u0004\u0018\u00010=*\u00020=H\u0082\u0010¢\u0006\u0004\b?\u0010@J/\u0010B\u001a\u00020\u00042\n\u0010A\u001a\u0006\u0012\u0002\b\u00030\u00172\n\u0010:\u001a\u0006\u0012\u0002\b\u0003092\u0006\u0010)\u001a\u00020\u0011H\u0002¢\u0006\u0004\bB\u0010CJ\u001d\u0010D\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0017*\u0006\u0012\u0002\b\u000309H\u0002¢\u0006\u0004\bD\u0010EJ\u001a\u0010F\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0017*\u00020=H\u0082\u0010¢\u0006\u0004\bF\u0010GJ\u001b\u0010I\u001a\u0004\u0018\u00010H*\b\u0012\u0004\u0012\u00020%0\u001aH\u0002¢\u0006\u0004\bI\u0010JJ3\u0010L\u001a\b\u0012\u0004\u0012\u00028\u000009\"\u0004\b\u0000\u0010B2\f\u0010K\u001a\b\u0012\u0004\u0012\u00028\u0000092\b\u0010:\u001a\u0004\u0018\u00010HH\u0002¢\u0006\u0004\bL\u0010MJ\u001b\u0010N\u001a\u00020\u00042\n\u0010A\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0002¢\u0006\u0004\bN\u0010OJ'\u0010R\u001a\b\u0012\u0004\u0012\u00020%0\u001a\"\b\b\u0000\u0010B*\u00020P2\u0006\u0010Q\u001a\u00028\u0000H\u0002¢\u0006\u0004\bR\u0010SJ\r\u0010T\u001a\u00020\u0004¢\u0006\u0004\bT\u0010\bJ\r\u0010U\u001a\u00020\u0004¢\u0006\u0004\bU\u0010\bJ\u0015\u0010W\u001a\u00020\u00112\u0006\u0010V\u001a\u00020\n¢\u0006\u0004\bW\u0010XJ\u0013\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u000101¢\u0006\u0004\bY\u0010ZJ\u0015\u0010]\u001a\u00020\u00112\u0006\u0010\\\u001a\u00020[¢\u0006\u0004\b]\u0010^J\u0013\u0010_\u001a\b\u0012\u0004\u0012\u00020[0\u001a¢\u0006\u0004\b_\u0010`J\u0013\u0010b\u001a\b\u0012\u0004\u0012\u00020a0\u001a¢\u0006\u0004\bb\u0010`J\u0015\u0010c\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\bc\u0010$J)\u0010d\u001a\b\u0012\u0004\u0012\u00020%0\u001a2\u0006\u0010\\\u001a\u00020[2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020%0\u001a¢\u0006\u0004\bd\u0010eJ\u001b\u0010f\u001a\u00020\u00042\n\u0010:\u001a\u0006\u0012\u0002\b\u000309H\u0000¢\u0006\u0004\bf\u0010gJ\u001b\u0010h\u001a\u00020\u00042\n\u0010:\u001a\u0006\u0012\u0002\b\u000309H\u0000¢\u0006\u0004\bh\u0010gJ)\u0010i\u001a\b\u0012\u0004\u0012\u00028\u000009\"\u0004\b\u0000\u0010B2\f\u0010K\u001a\b\u0012\u0004\u0012\u00028\u000009H\u0000¢\u0006\u0004\bi\u0010jR\u0014\u0010m\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010q\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0018\u0010s\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010rR$\u0010v\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0017\u0012\u0004\u0012\u00020\u00030t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010uR\u0016\u0010w\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010?R\u0014\u0010z\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010yR#\u0010\u0080\u0001\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR%\u0010\u0083\u0001\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b#\u0010{\u001a\u0005\b\u0081\u0001\u0010}\"\u0005\b\u0082\u0001\u0010\u007fR$\u0010\u0085\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bb\u0010\u0084\u0001R!\u0010\u0086\u0001\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\f0t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010uR\"\u0010\u008a\u0001\u001a\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00170\u0087\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\"\u0010\u008e\u0001\u001a\u00020\u0011*\u00020\n8BX\u0082\u0004¢\u0006\u000f\u0012\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0005\b\u008b\u0001\u0010XR\u001b\u0010\u0091\u0001\u001a\u00020\u0003*\u00020%8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0016\u0010\u0093\u0001\u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u0010}¨\u0006\u0096\u0001"}, d2 = {"Ln/h;", "", "Lkotlin/Function1;", "", "", "t", "()Lkotlin/jvm/functions/Function1;", "M", "()V", "N", "Lj/n2;", "", "Ln/f;", "map", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "", "indent", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "(Lj/n2;Ljava/util/Map;Ljava/lang/StringBuilder;Ljava/lang/String;)V", "R", "Lkotlin/Function2;", "Ln/h$a;", "Lkotlin/coroutines/CoroutineContext;", "create", "", "i", "(Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "P", "(Ljava/lang/Object;)Ljava/lang/String;", "y", "(Ln/h$a;)Z", "Ljava/io/PrintStream;", "out", "j", "(Ljava/io/PrintStream;)V", "Ljava/lang/StackTraceElement;", "frames", "D", "(Ljava/io/PrintStream;Ljava/util/List;)V", "state", "Ljava/lang/Thread;", "thread", "coroutineTrace", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "(Ljava/lang/String;Ljava/lang/Thread;Ljava/util/List;)Ljava/util/List;", "", "indexOfResumeWith", "", "actualTrace", "Lkotlin/Pair;", "o", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)Lkotlin/Pair;", "frameIndex", "p", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)I", "Lkotlin/coroutines/Continuation;", "frame", "S", "(Lkotlin/coroutines/Continuation;Ljava/lang/String;)V", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;Ljava/lang/String;)V", "I", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "owner", "T", "(Ln/h$a;Lkotlin/coroutines/Continuation;Ljava/lang/String;)V", "B", "(Lkotlin/coroutines/Continuation;)Ln/h$a;", "C", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Ln/h$a;", "Ln/n;", "O", "(Ljava/util/List;)Ln/n;", "completion", "e", "(Lkotlin/coroutines/Continuation;Ln/n;)Lkotlin/coroutines/Continuation;", "E", "(Ln/h$a;)V", "", "throwable", "J", "(Ljava/lang/Throwable;)Ljava/util/List;", "x", "Q", "job", "w", "(Lj/n2;)Ljava/lang/String;", "h", "()[Ljava/lang/Object;", "Ln/e;", "info", "m", "(Ln/e;)Ljava/lang/String;", "g", "()Ljava/util/List;", "Ln/k;", "k", "f", "l", "(Ln/e;Ljava/util/List;)Ljava/util/List;", "G", "(Lkotlin/coroutines/Continuation;)V", "H", "F", "(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "b", "Ljava/lang/String;", "ARTIFICIAL_FRAME_MESSAGE", "Ljava/text/SimpleDateFormat;", "c", "Ljava/text/SimpleDateFormat;", "dateFormat", "Ljava/lang/Thread;", "weakRefCleanerThread", "Ln/c;", "Ln/c;", "capturedCoroutinesMap", "installations", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "coroutineStateLock", "Z", "v", "()Z", "L", "(Z)V", "sanitizeStackTraces", "u", "K", "enableCreationStackTraces", "Lkotlin/jvm/functions/Function1;", "dynamicAttach", "callerInfoCache", "", "q", "()Ljava/util/Set;", "capturedCoroutines", "r", "getDebugString$annotations", "(Lj/n2;)V", "debugString", "A", "(Ljava/lang/StackTraceElement;)Z", "isInternalMethod", "z", "isInstalled", "<init>", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class h {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final h f1013a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public static final String f1014b = "Coroutine creation stacktrace";
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public static final SimpleDateFormat f1015c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public static Thread f1016d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public static final n.c<a<?>, Boolean> f1017e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ i f1018f;

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f1019g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    public static final ReentrantReadWriteLock f1020h;

    /* renamed from: i  reason: collision with root package name */
    public static boolean f1021i;
    private static volatile int installations;

    /* renamed from: j  reason: collision with root package name */
    public static boolean f1022j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    public static final Function1<Boolean, Unit> f1023k;
    @NotNull

    /* renamed from: l  reason: collision with root package name */
    public static final n.c<CoroutineStackFrame, n.f> f1024l;

    @Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B'\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J \u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0016R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Ln/h$a;", "T", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "Lkotlin/Result;", "result", "", "resumeWith", "(Ljava/lang/Object;)V", "", "toString", "j", "Lkotlin/coroutines/Continuation;", "delegate", "Ln/f;", "k", "Ln/f;", "info", "l", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "frame", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "<init>", "(Lkotlin/coroutines/Continuation;Ln/f;Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class a<T> implements Continuation<T>, CoroutineStackFrame {
        @JvmField
        @NotNull

        /* renamed from: j  reason: collision with root package name */
        public final Continuation<T> f1025j;
        @JvmField
        @NotNull

        /* renamed from: k  reason: collision with root package name */
        public final n.f f1026k;
        @Nullable

        /* renamed from: l  reason: collision with root package name */
        public final CoroutineStackFrame f1027l;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull Continuation<? super T> continuation, @NotNull n.f fVar, @Nullable CoroutineStackFrame coroutineStackFrame) {
            this.f1025j = continuation;
            this.f1026k = fVar;
            this.f1027l = coroutineStackFrame;
        }

        @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        @Nullable
        public CoroutineStackFrame getCallerFrame() {
            CoroutineStackFrame coroutineStackFrame = this.f1027l;
            if (coroutineStackFrame != null) {
                return coroutineStackFrame.getCallerFrame();
            }
            return null;
        }

        @Override // kotlin.coroutines.Continuation
        @NotNull
        public CoroutineContext getContext() {
            return this.f1025j.getContext();
        }

        @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        @Nullable
        public StackTraceElement getStackTraceElement() {
            CoroutineStackFrame coroutineStackFrame = this.f1027l;
            if (coroutineStackFrame != null) {
                return coroutineStackFrame.getStackTraceElement();
            }
            return null;
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(@NotNull Object obj) {
            h.f1013a.E(this);
            this.f1025j.resumeWith(obj);
        }

        @NotNull
        public String toString() {
            return this.f1025j.toString();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "R", "Ln/h$a;", "owner", "a", "(Ln/h$a;)Ljava/lang/Object;", "n/h$c"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class b extends Lambda implements Function1<a<?>, n.e> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: a */
        public final n.e invoke(@NotNull a<?> aVar) {
            CoroutineContext c2;
            if (h.f1013a.y(aVar) || (c2 = aVar.f1026k.c()) == null) {
                return null;
            }
            return new n.e(aVar.f1026k, c2);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "R", "Ln/h$a;", "owner", "a", "(Ln/h$a;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements Function1<a<?>, R> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Function2<a<?>, CoroutineContext, R> f1028j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function2<? super a<?>, ? super CoroutineContext, ? extends R> function2) {
            super(1);
            this.f1028j = function2;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [R, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: a */
        public final R invoke(@NotNull a<?> aVar) {
            CoroutineContext c2;
            if (h.f1013a.y(aVar) || (c2 = aVar.f1026k.c()) == null) {
                return null;
            }
            return this.f1028j.invoke(aVar, c2);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class d<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t2, T t3) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((a) t2).f1026k.f995b), Long.valueOf(((a) t3).f1026k.f995b));
            return compareValues;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln/h$a;", "it", "", "a", "(Ln/h$a;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class e extends Lambda implements Function1<a<?>, Boolean> {

        /* renamed from: j  reason: collision with root package name */
        public static final e f1029j = new e();

        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: a */
        public final Boolean invoke(@NotNull a<?> aVar) {
            return Boolean.valueOf(!h.f1013a.y(aVar));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class f<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t2, T t3) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((a) t2).f1026k.f995b), Long.valueOf(((a) t3).f1026k.f995b));
            return compareValues;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "R", "Ln/h$a;", "owner", "a", "(Ln/h$a;)Ljava/lang/Object;", "n/h$c"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class g extends Lambda implements Function1<a<?>, k> {
        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: a */
        public final k invoke(@NotNull a<?> aVar) {
            CoroutineContext c2;
            if (h.f1013a.y(aVar) || (c2 = aVar.f1026k.c()) == null) {
                return null;
            }
            return new k(aVar.f1026k, c2);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: n.h$h  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0060h extends Lambda implements Function0<Unit> {

        /* renamed from: j  reason: collision with root package name */
        public static final C0060h f1030j = new C0060h();

        public C0060h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            h.f1024l.f();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [n.i] */
    static {
        h hVar = new h();
        f1013a = hVar;
        f1015c = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        f1017e = new n.c<>(false, 1, null);
        f1018f = new Object(0L) { // from class: n.i
            public volatile long sequenceNumber;

            {
                this.sequenceNumber = r1;
            }
        };
        f1020h = new ReentrantReadWriteLock();
        f1021i = true;
        f1022j = true;
        f1023k = hVar.t();
        f1024l = new n.c<>(true);
        f1019g = AtomicLongFieldUpdater.newUpdater(i.class, "sequenceNumber");
    }

    public static /* synthetic */ void s(n2 n2Var) {
    }

    public final boolean A(StackTraceElement stackTraceElement) {
        boolean startsWith$default;
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(stackTraceElement.getClassName(), "kotlinx.coroutines", false, 2, null);
        return startsWith$default;
    }

    public final a<?> B(Continuation<?> continuation) {
        CoroutineStackFrame coroutineStackFrame = continuation instanceof CoroutineStackFrame ? (CoroutineStackFrame) continuation : null;
        if (coroutineStackFrame != null) {
            return C(coroutineStackFrame);
        }
        return null;
    }

    public final a<?> C(CoroutineStackFrame coroutineStackFrame) {
        while (!(coroutineStackFrame instanceof a)) {
            coroutineStackFrame = coroutineStackFrame.getCallerFrame();
            if (coroutineStackFrame == null) {
                return null;
            }
        }
        return (a) coroutineStackFrame;
    }

    public final void D(PrintStream printStream, List<StackTraceElement> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            printStream.print("\n\tat " + ((StackTraceElement) it.next()));
        }
    }

    public final void E(a<?> aVar) {
        CoroutineStackFrame I;
        f1017e.remove(aVar);
        CoroutineStackFrame f2 = aVar.f1026k.f();
        if (f2 == null || (I = I(f2)) == null) {
            return;
        }
        f1024l.remove(I);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final <T> Continuation<T> F(@NotNull Continuation<? super T> continuation) {
        if (z() && B(continuation) == null) {
            return e(continuation, f1022j ? O(J(new Exception())) : null);
        }
        return continuation;
    }

    public final void G(@NotNull Continuation<?> continuation) {
        S(continuation, n.g.f1011b);
    }

    public final void H(@NotNull Continuation<?> continuation) {
        S(continuation, n.g.f1012c);
    }

    public final CoroutineStackFrame I(CoroutineStackFrame coroutineStackFrame) {
        do {
            coroutineStackFrame = coroutineStackFrame.getCallerFrame();
            if (coroutineStackFrame == null) {
                return null;
            }
        } while (coroutineStackFrame.getStackTraceElement() == null);
        return coroutineStackFrame;
    }

    public final <T extends Throwable> List<StackTraceElement> J(T t2) {
        StackTraceElement[] stackTrace = t2.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i3 = length2 - 1;
                if (Intrinsics.areEqual(stackTrace[length2].getClassName(), "kotlin.coroutines.jvm.internal.DebugProbesKt")) {
                    i2 = length2;
                    break;
                } else if (i3 < 0) {
                    break;
                } else {
                    length2 = i3;
                }
            }
        }
        if (!f1021i) {
            int i4 = length - i2;
            ArrayList arrayList = new ArrayList(i4);
            int i5 = 0;
            while (i5 < i4) {
                arrayList.add(i5 == 0 ? q0.d(f1014b) : stackTrace[i5 + i2]);
                i5++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList((length - i2) + 1);
        arrayList2.add(q0.d(f1014b));
        while (true) {
            i2++;
            while (i2 < length) {
                if (A(stackTrace[i2])) {
                    arrayList2.add(stackTrace[i2]);
                    int i6 = i2 + 1;
                    while (i6 < length && A(stackTrace[i6])) {
                        i6++;
                    }
                    int i7 = i6 - 1;
                    int i8 = i7;
                    while (i8 > i2 && stackTrace[i8].getFileName() == null) {
                        i8--;
                    }
                    if (i8 > i2 && i8 < i7) {
                        arrayList2.add(stackTrace[i8]);
                    }
                    arrayList2.add(stackTrace[i7]);
                    i2 = i6;
                }
            }
            return arrayList2;
            arrayList2.add(stackTrace[i2]);
        }
    }

    public final void K(boolean z) {
        f1022j = z;
    }

    public final void L(boolean z) {
        f1021i = z;
    }

    public final void M() {
        f1016d = ThreadsKt.thread$default(false, true, null, "Coroutines Debugger Cleaner", 0, C0060h.f1030j, 21, null);
    }

    public final void N() {
        Thread thread = f1016d;
        if (thread == null) {
            return;
        }
        f1016d = null;
        thread.interrupt();
        thread.join();
    }

    public final n O(List<StackTraceElement> list) {
        n nVar = null;
        if (!list.isEmpty()) {
            ListIterator<StackTraceElement> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                nVar = new n(nVar, listIterator.previous());
            }
        }
        return nVar;
    }

    public final String P(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(Typography.quote);
        sb.append(obj);
        sb.append(Typography.quote);
        return sb.toString();
    }

    public final void Q() {
        ReentrantReadWriteLock reentrantReadWriteLock = f1020h;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i3 = 0; i3 < readHoldCount; i3++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            h hVar = f1013a;
            if (!hVar.z()) {
                throw new IllegalStateException("Agent was not installed".toString());
            }
            installations--;
            if (installations != 0) {
                return;
            }
            hVar.N();
            f1017e.clear();
            f1024l.clear();
            if (n.a.f959a.a()) {
                while (i2 < readHoldCount) {
                    readLock.lock();
                    i2++;
                }
                writeLock.unlock();
                return;
            }
            Function1<Boolean, Unit> function1 = f1023k;
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
            }
            Unit unit = Unit.INSTANCE;
            while (i2 < readHoldCount) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
        } finally {
            while (i2 < readHoldCount) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
        }
    }

    public final void R(CoroutineStackFrame coroutineStackFrame, String str) {
        ReentrantReadWriteLock.ReadLock readLock = f1020h.readLock();
        readLock.lock();
        try {
            h hVar = f1013a;
            if (hVar.z()) {
                n.c<CoroutineStackFrame, n.f> cVar = f1024l;
                n.f remove = cVar.remove(coroutineStackFrame);
                if (remove == null) {
                    a<?> C = hVar.C(coroutineStackFrame);
                    if (C != null && (remove = C.f1026k) != null) {
                        CoroutineStackFrame f2 = remove.f();
                        CoroutineStackFrame I = f2 != null ? hVar.I(f2) : null;
                        if (I != null) {
                            cVar.remove(I);
                        }
                    }
                    return;
                }
                remove.j(str, (Continuation) coroutineStackFrame);
                CoroutineStackFrame I2 = hVar.I(coroutineStackFrame);
                if (I2 == null) {
                    return;
                }
                cVar.put(I2, remove);
                Unit unit = Unit.INSTANCE;
            }
        } finally {
            readLock.unlock();
        }
    }

    public final void S(Continuation<?> continuation, String str) {
        if (z()) {
            if (Intrinsics.areEqual(str, n.g.f1011b) && KotlinVersion.CURRENT.isAtLeast(1, 3, 30)) {
                CoroutineStackFrame coroutineStackFrame = continuation instanceof CoroutineStackFrame ? (CoroutineStackFrame) continuation : null;
                if (coroutineStackFrame == null) {
                    return;
                }
                R(coroutineStackFrame, str);
                return;
            }
            a<?> B = B(continuation);
            if (B == null) {
                return;
            }
            T(B, continuation, str);
        }
    }

    public final void T(a<?> aVar, Continuation<?> continuation, String str) {
        ReentrantReadWriteLock.ReadLock readLock = f1020h.readLock();
        readLock.lock();
        try {
            if (f1013a.z()) {
                aVar.f1026k.j(str, continuation);
                Unit unit = Unit.INSTANCE;
            }
        } finally {
            readLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0083 A[LOOP:0: B:10:0x007d->B:12:0x0083, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(j.n2 r7, java.util.Map<j.n2, n.f> r8, java.lang.StringBuilder r9, java.lang.String r10) {
        /*
            r6 = this;
            java.lang.Object r0 = r8.get(r7)
            n.f r0 = (n.f) r0
            r1 = 9
            r2 = 10
            if (r0 != 0) goto L2f
            boolean r0 = r7 instanceof q.n0
            if (r0 != 0) goto L75
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            java.lang.String r3 = r6.r(r7)
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r9.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            goto L6b
        L2f:
            java.util.List r3 = r0.h()
            java.lang.Object r3 = kotlin.collections.CollectionsKt.firstOrNull(r3)
            java.lang.StackTraceElement r3 = (java.lang.StackTraceElement) r3
            java.lang.String r0 = r0.g()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r10)
            java.lang.String r5 = r6.r(r7)
            r4.append(r5)
            java.lang.String r5 = ", continuation is "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = " at line "
            r4.append(r0)
            r4.append(r3)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            r9.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L6b:
            r0.append(r10)
            r0.append(r1)
            java.lang.String r10 = r0.toString()
        L75:
            kotlin.sequences.Sequence r7 = r7.k()
            java.util.Iterator r7 = r7.iterator()
        L7d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L8d
            java.lang.Object r0 = r7.next()
            j.n2 r0 = (j.n2) r0
            r6.d(r0, r8, r9, r10)
            goto L7d
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n.h.d(j.n2, java.util.Map, java.lang.StringBuilder, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> Continuation<T> e(Continuation<? super T> continuation, n nVar) {
        if (z()) {
            a<?> aVar = new a<>(continuation, new n.f(continuation.getContext(), nVar, f1019g.incrementAndGet(f1018f)), nVar);
            n.c<a<?>, Boolean> cVar = f1017e;
            cVar.put(aVar, Boolean.TRUE);
            if (!z()) {
                cVar.clear();
            }
            return aVar;
        }
        return continuation;
    }

    public final void f(@NotNull PrintStream printStream) {
        synchronized (printStream) {
            f1013a.j(printStream);
            Unit unit = Unit.INSTANCE;
        }
    }

    @NotNull
    public final List<n.e> g() {
        Sequence asSequence;
        Sequence sortedWith;
        Sequence mapNotNull;
        List<n.e> list;
        ReentrantReadWriteLock reentrantReadWriteLock = f1020h;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i3 = 0; i3 < readHoldCount; i3++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            h hVar = f1013a;
            if (hVar.z()) {
                asSequence = CollectionsKt___CollectionsKt.asSequence(hVar.q());
                sortedWith = SequencesKt___SequencesKt.sortedWith(asSequence, new d());
                mapNotNull = SequencesKt___SequencesKt.mapNotNull(sortedWith, new b());
                list = SequencesKt___SequencesKt.toList(mapNotNull);
                return list;
            }
            throw new IllegalStateException("Debug probes are not installed".toString());
        } finally {
            while (i2 < readHoldCount) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
        }
    }

    @NotNull
    public final Object[] h() {
        String joinToString$default;
        String trimIndent;
        String v2;
        List<n.e> g2 = g();
        int size = g2.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        ArrayList arrayList3 = new ArrayList(size);
        for (n.e eVar : g2) {
            CoroutineContext a2 = eVar.a();
            t0 t0Var = (t0) a2.get(t0.f514k);
            Long l2 = null;
            String P = (t0Var == null || (v2 = t0Var.v()) == null) ? null : P(v2);
            o0 o0Var = (o0) a2.get(o0.Key);
            String P2 = o0Var != null ? P(o0Var) : null;
            StringBuilder sb = new StringBuilder();
            sb.append("\n                {\n                    \"name\": ");
            sb.append(P);
            sb.append(",\n                    \"id\": ");
            s0 s0Var = (s0) a2.get(s0.f511k);
            if (s0Var != null) {
                l2 = Long.valueOf(s0Var.v());
            }
            sb.append(l2);
            sb.append(",\n                    \"dispatcher\": ");
            sb.append(P2);
            sb.append(",\n                    \"sequenceNumber\": ");
            sb.append(eVar.f());
            sb.append(",\n                    \"state\": \"");
            sb.append(eVar.g());
            sb.append("\"\n                } \n                ");
            trimIndent = StringsKt__IndentKt.trimIndent(sb.toString());
            arrayList3.add(trimIndent);
            arrayList2.add(eVar.d());
            arrayList.add(eVar.e());
        }
        Object[] objArr = new Object[4];
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList3, null, null, null, 0, null, null, 63, null);
        sb2.append(joinToString$default);
        sb2.append(']');
        objArr[0] = sb2.toString();
        Object[] array = arrayList.toArray(new Thread[0]);
        if (array != null) {
            objArr[1] = array;
            Object[] array2 = arrayList2.toArray(new CoroutineStackFrame[0]);
            if (array2 != null) {
                objArr[2] = array2;
                Object[] array3 = g2.toArray(new n.e[0]);
                if (array3 != null) {
                    objArr[3] = array3;
                    return objArr;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public final <R> List<R> i(Function2<? super a<?>, ? super CoroutineContext, ? extends R> function2) {
        Sequence asSequence;
        Sequence sortedWith;
        Sequence mapNotNull;
        List<R> list;
        ReentrantReadWriteLock reentrantReadWriteLock = f1020h;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i3 = 0; i3 < readHoldCount; i3++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            h hVar = f1013a;
            if (hVar.z()) {
                asSequence = CollectionsKt___CollectionsKt.asSequence(hVar.q());
                sortedWith = SequencesKt___SequencesKt.sortedWith(asSequence, new d());
                mapNotNull = SequencesKt___SequencesKt.mapNotNull(sortedWith, new c(function2));
                list = SequencesKt___SequencesKt.toList(mapNotNull);
                return list;
            }
            throw new IllegalStateException("Debug probes are not installed".toString());
        } finally {
            InlineMarker.finallyStart(1);
            while (i2 < readHoldCount) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
            InlineMarker.finallyEnd(1);
        }
    }

    public final void j(PrintStream printStream) {
        Sequence asSequence;
        Sequence filter;
        Sequence<a> sortedWith;
        ReentrantReadWriteLock reentrantReadWriteLock = f1020h;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i3 = 0; i3 < readHoldCount; i3++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            h hVar = f1013a;
            if (!hVar.z()) {
                throw new IllegalStateException("Debug probes are not installed".toString());
            }
            printStream.print("Coroutines dump " + f1015c.format(Long.valueOf(System.currentTimeMillis())));
            asSequence = CollectionsKt___CollectionsKt.asSequence(hVar.q());
            filter = SequencesKt___SequencesKt.filter(asSequence, e.f1029j);
            sortedWith = SequencesKt___SequencesKt.sortedWith(filter, new f());
            for (a aVar : sortedWith) {
                n.f fVar = aVar.f1026k;
                List<StackTraceElement> h2 = fVar.h();
                h hVar2 = f1013a;
                List<StackTraceElement> n2 = hVar2.n(fVar.g(), fVar.f998e, h2);
                printStream.print("\n\nCoroutine " + aVar.f1025j + ", state: " + ((Intrinsics.areEqual(fVar.g(), n.g.f1011b) && n2 == h2) ? fVar.g() + " (Last suspension stacktrace, not an actual stacktrace)" : fVar.g()));
                if (h2.isEmpty()) {
                    printStream.print("\n\tat " + q0.d(f1014b));
                    hVar2.D(printStream, fVar.e());
                } else {
                    hVar2.D(printStream, n2);
                }
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            while (i2 < readHoldCount) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
        }
    }

    @NotNull
    public final List<k> k() {
        Sequence asSequence;
        Sequence sortedWith;
        Sequence mapNotNull;
        List<k> list;
        ReentrantReadWriteLock reentrantReadWriteLock = f1020h;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i3 = 0; i3 < readHoldCount; i3++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            h hVar = f1013a;
            if (hVar.z()) {
                asSequence = CollectionsKt___CollectionsKt.asSequence(hVar.q());
                sortedWith = SequencesKt___SequencesKt.sortedWith(asSequence, new d());
                mapNotNull = SequencesKt___SequencesKt.mapNotNull(sortedWith, new g());
                list = SequencesKt___SequencesKt.toList(mapNotNull);
                return list;
            }
            throw new IllegalStateException("Debug probes are not installed".toString());
        } finally {
            while (i2 < readHoldCount) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
        }
    }

    @NotNull
    public final List<StackTraceElement> l(@NotNull n.e eVar, @NotNull List<StackTraceElement> list) {
        return n(eVar.g(), eVar.e(), list);
    }

    @NotNull
    public final String m(@NotNull n.e eVar) {
        String joinToString$default;
        String trimIndent;
        List<StackTraceElement> l2 = l(eVar, eVar.h());
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : l2) {
            StringBuilder sb = new StringBuilder();
            sb.append("\n                {\n                    \"declaringClass\": \"");
            sb.append(stackTraceElement.getClassName());
            sb.append("\",\n                    \"methodName\": \"");
            sb.append(stackTraceElement.getMethodName());
            sb.append("\",\n                    \"fileName\": ");
            String fileName = stackTraceElement.getFileName();
            sb.append(fileName != null ? P(fileName) : null);
            sb.append(",\n                    \"lineNumber\": ");
            sb.append(stackTraceElement.getLineNumber());
            sb.append("\n                }\n                ");
            trimIndent = StringsKt__IndentKt.trimIndent(sb.toString());
            arrayList.add(trimIndent);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, null, 63, null);
        sb2.append(joinToString$default);
        sb2.append(']');
        return sb2.toString();
    }

    public final List<StackTraceElement> n(String str, Thread thread, List<StackTraceElement> list) {
        Object m3581constructorimpl;
        if (!Intrinsics.areEqual(str, n.g.f1011b) || thread == null) {
            return list;
        }
        try {
            Result.Companion companion = Result.Companion;
            m3581constructorimpl = Result.m3581constructorimpl(thread.getStackTrace());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m3581constructorimpl = Result.m3581constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3587isFailureimpl(m3581constructorimpl)) {
            m3581constructorimpl = null;
        }
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) m3581constructorimpl;
        if (stackTraceElementArr == null) {
            return list;
        }
        int length = stackTraceElementArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            if (Intrinsics.areEqual(stackTraceElement.getClassName(), q0.f2046a) && Intrinsics.areEqual(stackTraceElement.getMethodName(), "resumeWith") && Intrinsics.areEqual(stackTraceElement.getFileName(), "ContinuationImpl.kt")) {
                break;
            }
            i2++;
        }
        Pair<Integer, Integer> o2 = o(i2, stackTraceElementArr, list);
        int intValue = o2.component1().intValue();
        int intValue2 = o2.component2().intValue();
        if (intValue == -1) {
            return list;
        }
        ArrayList arrayList = new ArrayList((((list.size() + i2) - intValue) - 1) - intValue2);
        int i3 = i2 - intValue2;
        for (int i4 = 0; i4 < i3; i4++) {
            arrayList.add(stackTraceElementArr[i4]);
        }
        int size = list.size();
        for (int i5 = intValue + 1; i5 < size; i5++) {
            arrayList.add(list.get(i5));
        }
        return arrayList;
    }

    public final Pair<Integer, Integer> o(int i2, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) {
        for (int i3 = 0; i3 < 3; i3++) {
            int p2 = f1013a.p((i2 - 1) - i3, stackTraceElementArr, list);
            if (p2 != -1) {
                return TuplesKt.to(Integer.valueOf(p2), Integer.valueOf(i3));
            }
        }
        return TuplesKt.to(-1, 0);
    }

    public final int p(int i2, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) {
        Object orNull;
        orNull = ArraysKt___ArraysKt.getOrNull(stackTraceElementArr, i2);
        StackTraceElement stackTraceElement = (StackTraceElement) orNull;
        if (stackTraceElement == null) {
            return -1;
        }
        int i3 = 0;
        for (StackTraceElement stackTraceElement2 : list) {
            if (Intrinsics.areEqual(stackTraceElement2.getFileName(), stackTraceElement.getFileName()) && Intrinsics.areEqual(stackTraceElement2.getClassName(), stackTraceElement.getClassName()) && Intrinsics.areEqual(stackTraceElement2.getMethodName(), stackTraceElement.getMethodName())) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public final Set<a<?>> q() {
        return f1017e.keySet();
    }

    public final String r(n2 n2Var) {
        return n2Var instanceof v2 ? ((v2) n2Var).m1() : n2Var.toString();
    }

    public final Function1<Boolean, Unit> t() {
        Object m3581constructorimpl;
        Object newInstance;
        try {
            Result.Companion companion = Result.Companion;
            newInstance = Class.forName("kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(new Object[0]);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m3581constructorimpl = Result.m3581constructorimpl(ResultKt.createFailure(th));
        }
        if (newInstance != null) {
            m3581constructorimpl = Result.m3581constructorimpl((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(newInstance, 1));
            if (Result.m3587isFailureimpl(m3581constructorimpl)) {
                m3581constructorimpl = null;
            }
            return (Function1) m3581constructorimpl;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
    }

    public final boolean u() {
        return f1022j;
    }

    public final boolean v() {
        return f1021i;
    }

    @NotNull
    public final String w(@NotNull n2 n2Var) {
        int collectionSizeOrDefault;
        int mapCapacity;
        int coerceAtLeast;
        ReentrantReadWriteLock reentrantReadWriteLock = f1020h;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i3 = 0; i3 < readHoldCount; i3++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            h hVar = f1013a;
            if (hVar.z()) {
                Set<a<?>> q2 = hVar.q();
                ArrayList arrayList = new ArrayList();
                for (Object obj : q2) {
                    if (((a) obj).f1025j.getContext().get(n2.f488b) != null) {
                        arrayList.add(obj);
                    }
                }
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
                mapCapacity = MapsKt__MapsJVMKt.mapCapacity(collectionSizeOrDefault);
                coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
                LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
                for (Object obj2 : arrayList) {
                    linkedHashMap.put(r2.B(((a) obj2).f1025j.getContext()), ((a) obj2).f1026k);
                }
                StringBuilder sb = new StringBuilder();
                f1013a.d(n2Var, linkedHashMap, sb, "");
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            }
            throw new IllegalStateException("Debug probes are not installed".toString());
        } finally {
            while (i2 < readHoldCount) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
        }
    }

    public final void x() {
        ReentrantReadWriteLock reentrantReadWriteLock = f1020h;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i3 = 0; i3 < readHoldCount; i3++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            installations++;
            if (installations > 1) {
                return;
            }
            f1013a.M();
            if (n.a.f959a.a()) {
                while (i2 < readHoldCount) {
                    readLock.lock();
                    i2++;
                }
                writeLock.unlock();
                return;
            }
            Function1<Boolean, Unit> function1 = f1023k;
            if (function1 != null) {
                function1.invoke(Boolean.TRUE);
            }
            Unit unit = Unit.INSTANCE;
            while (i2 < readHoldCount) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
        } finally {
            while (i2 < readHoldCount) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
        }
    }

    public final boolean y(a<?> aVar) {
        n2 n2Var;
        CoroutineContext c2 = aVar.f1026k.c();
        if (c2 == null || (n2Var = (n2) c2.get(n2.f488b)) == null || !n2Var.e()) {
            return false;
        }
        f1017e.remove(aVar);
        return true;
    }

    public final boolean z() {
        return installations > 0;
    }
}
