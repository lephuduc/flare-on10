package androidx.compose.runtime.snapshots;

import androidx.appcompat.R;
import androidx.compose.runtime.SnapshotThreadLocal;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\b\u0010\"\u001a\u00020\bH\u0002\u001a6\u0010\"\u001a\u0002H#\"\u0004\b\u0000\u0010#2!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u0002H#0\u000fH\u0002¢\u0006\u0002\u0010%\u001a'\u0010&\u001a\u0002H#\"\b\b\u0000\u0010#*\u00020'2\u0006\u0010(\u001a\u0002H#2\u0006\u0010)\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010*\u001a\b\u0010+\u001a\u00020\u0007H\u0000\u001aB\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f2\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f2\u0014\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u000fH\u0002\u001aB\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f2\u0014\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f2\u0014\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u000fH\u0002\u001a\u0018\u00101\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u00072\u0006\u00102\u001a\u000203H\u0001\u001a.\u00104\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020'\u0018\u0001052\u0006\u0010+\u001a\u0002062\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u00020\u0010H\u0002\u001a\b\u00109\u001a\u00020:H\u0002\u001a1\u0010;\u001a\u0004\u0018\u0001H#\"\b\b\u0000\u0010#*\u00020'2\u0006\u0010(\u001a\u0002H#2\u0006\u0010<\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0002\u0010=\u001a\b\u0010>\u001a\u00020:H\u0002\u001a%\u0010?\u001a\u0002H#\"\u0004\b\u0000\u0010#2\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H#0@H\u0081\bø\u0001\u0000¢\u0006\u0002\u0010A\u001a>\u0010B\u001a\u0002H#\"\u0004\b\u0000\u0010#2\u0006\u0010C\u001a\u00020\u00072!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u0002H#0\u000fH\u0002¢\u0006\u0002\u0010D\u001a:\u0010E\u001a\u0002H#\"\b\b\u0000\u0010#*\u00020\u00072!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u0002H#0\u000fH\u0002¢\u0006\u0002\u0010F\u001a\"\u0010G\u001a\u0004\u0018\u00010'2\u0006\u00102\u001a\u0002032\u0006\u0010<\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0010H\u0002\u001a \u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0010H\u0002\u001a \u0010H\u001a\u00020I2\u0006\u0010+\u001a\u00020\u00012\u0006\u0010K\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0010H\u0002\u001a\u0010\u0010L\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u0007H\u0002\u001a\u001c\u0010M\u001a\u00020\u0010*\u00020\u00102\u0006\u0010N\u001a\u00020\u00012\u0006\u0010O\u001a\u00020\u0001H\u0000\u001a+\u0010P\u001a\u0002H#\"\b\b\u0000\u0010#*\u00020'*\u0002H#2\u0006\u00102\u001a\u0002032\u0006\u0010)\u001a\u00020\u0007H\u0000¢\u0006\u0002\u0010Q\u001a+\u0010R\u001a\u0002H#\"\b\b\u0000\u0010#*\u00020'*\u0002H#2\u0006\u00102\u001a\u0002032\u0006\u0010)\u001a\u00020\u0007H\u0000¢\u0006\u0002\u0010Q\u001aN\u0010S\u001a\u0002HT\"\b\b\u0000\u0010#*\u00020'\"\u0004\b\u0001\u0010T*\u0002H#2\u0006\u00102\u001a\u0002032\u0006\u0010U\u001a\u0002H#2\u0017\u0010$\u001a\u0013\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u0002HT0\u000f¢\u0006\u0002\bVH\u0080\bø\u0001\u0000¢\u0006\u0002\u0010W\u001a3\u0010X\u001a\u0002H#\"\b\b\u0000\u0010#*\u00020'*\u0002H#2\u0006\u00102\u001a\u0002032\u0006\u0010)\u001a\u00020\u00072\u0006\u0010U\u001a\u0002H#H\u0000¢\u0006\u0002\u0010Y\u001a!\u0010;\u001a\u0002H#\"\b\b\u0000\u0010#*\u00020'*\u0002H#2\u0006\u00102\u001a\u000203¢\u0006\u0002\u0010Z\u001a)\u0010;\u001a\u0002H#\"\b\b\u0000\u0010#*\u00020'*\u0002H#2\u0006\u00102\u001a\u0002032\u0006\u0010)\u001a\u00020\u0007¢\u0006\u0002\u0010Q\u001aH\u0010[\u001a\u0002HT\"\b\b\u0000\u0010#*\u00020'\"\u0004\b\u0001\u0010T*\u0002H#2!\u0010$\u001a\u001d\u0012\u0013\u0012\u0011H#¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b((\u0012\u0004\u0012\u0002HT0\u000fH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\\\u001aF\u0010]\u001a\u0002HT\"\b\b\u0000\u0010#*\u00020'\"\u0004\b\u0001\u0010T*\u0002H#2\u0006\u00102\u001a\u0002032\u0017\u0010$\u001a\u0013\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u0002HT0\u000f¢\u0006\u0002\bVH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010^\u001aN\u0010]\u001a\u0002HT\"\b\b\u0000\u0010#*\u00020'\"\u0004\b\u0001\u0010T*\u0002H#2\u0006\u00102\u001a\u0002032\u0006\u0010)\u001a\u00020\u00072\u0017\u0010$\u001a\u0013\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u0002HT0\u000f¢\u0006\u0002\bVH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010_\u001a+\u0010`\u001a\u0002H#\"\b\b\u0000\u0010#*\u00020'*\u0002H#2\u0006\u00102\u001a\u0002032\u0006\u0010)\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010Q\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\",\u0010\u0002\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\".\u0010\t\u001a\"\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nj\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b`\rX\u0082\u0004¢\u0006\u0002\n\u0000\")\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\b0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000\" \u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u000f0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001c\u0010\u0015\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u000e\u0010\u001a\u001a\u00020\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000\"\u001c\u0010\u001c\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u001f\"\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070!X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006a"}, d2 = {"INVALID_SNAPSHOT", "", "applyObservers", "", "Lkotlin/Function2;", "", "", "Landroidx/compose/runtime/snapshots/Snapshot;", "", "currentGlobalSnapshot", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/snapshots/GlobalSnapshot;", "kotlin.jvm.PlatformType", "Landroidx/compose/runtime/AtomicReference;", "emptyLambda", "Lkotlin/Function1;", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "Lkotlin/ParameterName;", "name", "invalid", "globalWriteObservers", "lock", "getLock$annotations", "()V", "getLock", "()Ljava/lang/Object;", "nextSnapshotId", "openSnapshots", "snapshotInitializer", "getSnapshotInitializer$annotations", "getSnapshotInitializer", "()Landroidx/compose/runtime/snapshots/Snapshot;", "threadSnapshot", "Landroidx/compose/runtime/SnapshotThreadLocal;", "advanceGlobalSnapshot", "T", "block", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "current", "Landroidx/compose/runtime/snapshots/StateRecord;", "r", "snapshot", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;", "currentSnapshot", "mergedReadObserver", "readObserver", "parentObserver", "mergedWriteObserver", "writeObserver", "notifyWrite", "state", "Landroidx/compose/runtime/snapshots/StateObject;", "optimisticMerges", "", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "applyingSnapshot", "invalidSnapshots", "readError", "", "readable", "id", "(Landroidx/compose/runtime/snapshots/StateRecord;ILandroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/StateRecord;", "reportReadonlySnapshotWrite", "sync", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "takeNewGlobalSnapshot", "previousGlobalSnapshot", "(Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "takeNewSnapshot", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/Snapshot;", "used", "valid", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "candidateSnapshot", "validateOpen", "addRange", Constants.MessagePayloadKeys.FROM, "until", "newOverwritableRecord", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;", "newWritableRecord", "overwritable", "R", "candidate", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/StateRecord;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "overwritableRecord", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;)Landroidx/compose/runtime/snapshots/StateRecord;", "withCurrent", "(Landroidx/compose/runtime/snapshots/StateRecord;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "writable", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "writableRecord", "runtime_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SnapshotKt {
    private static final int INVALID_SNAPSHOT = 0;
    @NotNull
    private static final List<Function2<Set<? extends Object>, Snapshot, Unit>> applyObservers;
    @NotNull
    private static final AtomicReference<GlobalSnapshot> currentGlobalSnapshot;
    @NotNull
    private static final List<Function1<Object, Unit>> globalWriteObservers;
    private static int nextSnapshotId;
    @NotNull
    private static SnapshotIdSet openSnapshots;
    @NotNull
    private static final Snapshot snapshotInitializer;
    @NotNull
    private static final Function1<SnapshotIdSet, Unit> emptyLambda = SnapshotKt$emptyLambda$1.INSTANCE;
    @NotNull
    private static final SnapshotThreadLocal<Snapshot> threadSnapshot = new SnapshotThreadLocal<>();
    @NotNull
    private static final Object lock = new Object();

    static {
        SnapshotIdSet.Companion companion = SnapshotIdSet.Companion;
        openSnapshots = companion.getEMPTY();
        nextSnapshotId = 1;
        applyObservers = new ArrayList();
        globalWriteObservers = new ArrayList();
        int i2 = nextSnapshotId;
        nextSnapshotId = i2 + 1;
        GlobalSnapshot globalSnapshot = new GlobalSnapshot(i2, companion.getEMPTY());
        openSnapshots = openSnapshots.set(globalSnapshot.getId());
        AtomicReference<GlobalSnapshot> atomicReference = new AtomicReference<>(globalSnapshot);
        currentGlobalSnapshot = atomicReference;
        GlobalSnapshot globalSnapshot2 = atomicReference.get();
        Intrinsics.checkNotNullExpressionValue(globalSnapshot2, "currentGlobalSnapshot.get()");
        snapshotInitializer = globalSnapshot2;
    }

    @NotNull
    public static final SnapshotIdSet addRange(@NotNull SnapshotIdSet snapshotIdSet, int i2, int i3) {
        Intrinsics.checkNotNullParameter(snapshotIdSet, "<this>");
        while (i2 < i3) {
            snapshotIdSet = snapshotIdSet.set(i2);
            i2++;
        }
        return snapshotIdSet;
    }

    public static final <T> T advanceGlobalSnapshot(Function1<? super SnapshotIdSet, ? extends T> function1) {
        T t2;
        List mutableList;
        GlobalSnapshot previousGlobalSnapshot = currentGlobalSnapshot.get();
        synchronized (getLock()) {
            Intrinsics.checkNotNullExpressionValue(previousGlobalSnapshot, "previousGlobalSnapshot");
            t2 = (T) takeNewGlobalSnapshot(previousGlobalSnapshot, function1);
        }
        Set<StateObject> modified$runtime_release = previousGlobalSnapshot.getModified$runtime_release();
        if (modified$runtime_release != null) {
            synchronized (getLock()) {
                mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) applyObservers);
            }
            int size = mutableList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((Function2) mutableList.get(i2)).invoke(modified$runtime_release, previousGlobalSnapshot);
            }
        }
        return t2;
    }

    public static final void advanceGlobalSnapshot() {
        advanceGlobalSnapshot(SnapshotKt$advanceGlobalSnapshot$2.INSTANCE);
    }

    @PublishedApi
    @NotNull
    public static final <T extends StateRecord> T current(@NotNull T r2, @NotNull Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(r2, "r");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        T t2 = (T) readable(r2, snapshot.getId(), snapshot.getInvalid$runtime_release());
        if (t2 != null) {
            return t2;
        }
        readError();
        throw new KotlinNothingValueException();
    }

    @NotNull
    public static final Snapshot currentSnapshot() {
        Snapshot snapshot = threadSnapshot.get();
        if (snapshot == null) {
            GlobalSnapshot globalSnapshot = currentGlobalSnapshot.get();
            Intrinsics.checkNotNullExpressionValue(globalSnapshot, "currentGlobalSnapshot.get()");
            return globalSnapshot;
        }
        return snapshot;
    }

    @NotNull
    public static final Object getLock() {
        return lock;
    }

    @PublishedApi
    public static /* synthetic */ void getLock$annotations() {
    }

    @NotNull
    public static final Snapshot getSnapshotInitializer() {
        return snapshotInitializer;
    }

    @PublishedApi
    public static /* synthetic */ void getSnapshotInitializer$annotations() {
    }

    public static final Function1<Object, Unit> mergedReadObserver(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
        return (function1 == null || function12 == null || Intrinsics.areEqual(function1, function12)) ? function1 == null ? function12 : function1 : new SnapshotKt$mergedReadObserver$1(function1, function12);
    }

    public static final Function1<Object, Unit> mergedWriteObserver(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
        return (function1 == null || function12 == null || Intrinsics.areEqual(function1, function12)) ? function1 == null ? function12 : function1 : new SnapshotKt$mergedWriteObserver$1(function1, function12);
    }

    @NotNull
    public static final <T extends StateRecord> T newOverwritableRecord(@NotNull T t2, @NotNull StateObject state, @NotNull Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(t2, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        T t3 = (T) used(state, snapshot.getId(), openSnapshots);
        if (t3 == null) {
            t3 = null;
        } else {
            t3.setSnapshotId$runtime_release(Integer.MAX_VALUE);
        }
        if (t3 == null) {
            T t4 = (T) t2.create();
            t4.setSnapshotId$runtime_release(Integer.MAX_VALUE);
            t4.setNext$runtime_release(state.getFirstStateRecord());
            state.prependStateRecord(t4);
            return t4;
        }
        return t3;
    }

    @NotNull
    public static final <T extends StateRecord> T newWritableRecord(@NotNull T t2, @NotNull StateObject state, @NotNull Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(t2, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        T t3 = (T) newOverwritableRecord(t2, state, snapshot);
        t3.assign(t2);
        t3.setSnapshotId$runtime_release(snapshot.getId());
        return t3;
    }

    @PublishedApi
    public static final void notifyWrite(@NotNull Snapshot snapshot, @NotNull StateObject state) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        Intrinsics.checkNotNullParameter(state, "state");
        Function1<Object, Unit> writeObserver$runtime_release = snapshot.getWriteObserver$runtime_release();
        if (writeObserver$runtime_release == null) {
            return;
        }
        writeObserver$runtime_release.invoke(state);
    }

    public static final Map<StateRecord, StateRecord> optimisticMerges(MutableSnapshot mutableSnapshot, MutableSnapshot mutableSnapshot2, SnapshotIdSet snapshotIdSet) {
        StateRecord readable;
        Set<StateObject> modified$runtime_release = mutableSnapshot2.getModified$runtime_release();
        int id = mutableSnapshot.getId();
        if (modified$runtime_release == null) {
            return null;
        }
        SnapshotIdSet or = mutableSnapshot2.getInvalid$runtime_release().set(mutableSnapshot2.getId()).or(mutableSnapshot2.getPreviousIds$runtime_release());
        HashMap hashMap = null;
        for (StateObject stateObject : modified$runtime_release) {
            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
            StateRecord readable2 = readable(firstStateRecord, id, snapshotIdSet);
            if (readable2 != null && (readable = readable(firstStateRecord, id, or)) != null && !Intrinsics.areEqual(readable2, readable)) {
                StateRecord readable3 = readable(firstStateRecord, mutableSnapshot2.getId(), mutableSnapshot2.getInvalid$runtime_release());
                if (readable3 == null) {
                    readError();
                    throw new KotlinNothingValueException();
                }
                StateRecord mergeRecords = stateObject.mergeRecords(readable, readable2, readable3);
                if (mergeRecords == null) {
                    return null;
                }
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                hashMap.put(readable2, mergeRecords);
                hashMap = hashMap;
            }
        }
        return hashMap;
    }

    public static final <T extends StateRecord, R> R overwritable(@NotNull T t2, @NotNull StateObject state, @NotNull T candidate, @NotNull Function1<? super T, ? extends R> block) {
        Snapshot current;
        R invoke;
        Intrinsics.checkNotNullParameter(t2, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(candidate, "candidate");
        Intrinsics.checkNotNullParameter(block, "block");
        getSnapshotInitializer();
        synchronized (getLock()) {
            try {
                current = Snapshot.Companion.getCurrent();
                invoke = block.invoke(overwritableRecord(t2, state, current, candidate));
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        notifyWrite(current, state);
        return invoke;
    }

    @NotNull
    public static final <T extends StateRecord> T overwritableRecord(@NotNull T t2, @NotNull StateObject state, @NotNull Snapshot snapshot, @NotNull T candidate) {
        Intrinsics.checkNotNullParameter(t2, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        Intrinsics.checkNotNullParameter(candidate, "candidate");
        if (snapshot.getReadOnly()) {
            snapshot.recordModified$runtime_release(state);
        }
        int id = snapshot.getId();
        if (candidate.getSnapshotId$runtime_release() == id) {
            return candidate;
        }
        T t3 = (T) newOverwritableRecord(t2, state, snapshot);
        t3.setSnapshotId$runtime_release(id);
        snapshot.recordModified$runtime_release(state);
        return t3;
    }

    public static final Void readError() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    public static final <T extends StateRecord> T readable(T t2, int i2, SnapshotIdSet snapshotIdSet) {
        T t3 = null;
        while (t2 != null) {
            if (valid(t2, i2, snapshotIdSet) && (t3 == null || t3.getSnapshotId$runtime_release() < t2.getSnapshotId$runtime_release())) {
                t3 = t2;
            }
            t2 = (T) t2.getNext$runtime_release();
        }
        if (t3 != null) {
            return t3;
        }
        return null;
    }

    @NotNull
    public static final <T extends StateRecord> T readable(@NotNull T t2, @NotNull StateObject state) {
        Intrinsics.checkNotNullParameter(t2, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        return (T) readable(t2, state, currentSnapshot());
    }

    @NotNull
    public static final <T extends StateRecord> T readable(@NotNull T t2, @NotNull StateObject state, @NotNull Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(t2, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        Function1<Object, Unit> readObserver$runtime_release = snapshot.getReadObserver$runtime_release();
        if (readObserver$runtime_release != null) {
            readObserver$runtime_release.invoke(state);
        }
        T t3 = (T) readable(t2, snapshot.getId(), snapshot.getInvalid$runtime_release());
        if (t3 != null) {
            return t3;
        }
        readError();
        throw new KotlinNothingValueException();
    }

    public static final Void reportReadonlySnapshotWrite() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    @PublishedApi
    public static final <T> T sync(@NotNull Function0<? extends T> block) {
        T invoke;
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (getLock()) {
            try {
                invoke = block.invoke();
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        return invoke;
    }

    public static final <T> T takeNewGlobalSnapshot(Snapshot snapshot, Function1<? super SnapshotIdSet, ? extends T> function1) {
        T invoke = function1.invoke(openSnapshots.clear(snapshot.getId()));
        synchronized (getLock()) {
            int i2 = nextSnapshotId;
            nextSnapshotId = i2 + 1;
            openSnapshots = openSnapshots.clear(snapshot.getId());
            currentGlobalSnapshot.set(new GlobalSnapshot(i2, openSnapshots));
            openSnapshots = openSnapshots.set(i2);
            Unit unit = Unit.INSTANCE;
        }
        return invoke;
    }

    public static final <T extends Snapshot> T takeNewSnapshot(Function1<? super SnapshotIdSet, ? extends T> function1) {
        return (T) advanceGlobalSnapshot(new SnapshotKt$takeNewSnapshot$1(function1));
    }

    private static final StateRecord used(StateObject stateObject, int i2, SnapshotIdSet snapshotIdSet) {
        int lowest = snapshotIdSet.lowest(i2);
        StateRecord stateRecord = null;
        for (StateRecord firstStateRecord = stateObject.getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext$runtime_release()) {
            if (firstStateRecord.getSnapshotId$runtime_release() == 0) {
                return firstStateRecord;
            }
            if (valid(firstStateRecord, lowest, snapshotIdSet)) {
                if (stateRecord != null) {
                    return firstStateRecord.getSnapshotId$runtime_release() < stateRecord.getSnapshotId$runtime_release() ? firstStateRecord : stateRecord;
                }
                stateRecord = firstStateRecord;
            }
        }
        return null;
    }

    private static final boolean valid(int i2, int i3, SnapshotIdSet snapshotIdSet) {
        return (i3 == 0 || i3 > i2 || snapshotIdSet.get(i3)) ? false : true;
    }

    private static final boolean valid(StateRecord stateRecord, int i2, SnapshotIdSet snapshotIdSet) {
        return valid(i2, stateRecord.getSnapshotId$runtime_release(), snapshotIdSet);
    }

    public static final void validateOpen(Snapshot snapshot) {
        if (!openSnapshots.get(snapshot.getId())) {
            throw new IllegalStateException("Snapshot is not open".toString());
        }
    }

    public static final <T extends StateRecord, R> R withCurrent(@NotNull T t2, @NotNull Function1<? super T, ? extends R> block) {
        Intrinsics.checkNotNullParameter(t2, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return block.invoke(current(t2, Snapshot.Companion.getCurrent()));
    }

    public static final <T extends StateRecord, R> R writable(@NotNull T t2, @NotNull StateObject state, @NotNull Snapshot snapshot, @NotNull Function1<? super T, ? extends R> block) {
        R invoke;
        Intrinsics.checkNotNullParameter(t2, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (getLock()) {
            try {
                invoke = block.invoke(writableRecord(t2, state, snapshot));
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        notifyWrite(snapshot, state);
        return invoke;
    }

    public static final <T extends StateRecord, R> R writable(@NotNull T t2, @NotNull StateObject state, @NotNull Function1<? super T, ? extends R> block) {
        Snapshot current;
        R invoke;
        Intrinsics.checkNotNullParameter(t2, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(block, "block");
        getSnapshotInitializer();
        synchronized (getLock()) {
            try {
                current = Snapshot.Companion.getCurrent();
                invoke = block.invoke(writableRecord(t2, state, current));
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        notifyWrite(current, state);
        return invoke;
    }

    @PublishedApi
    @NotNull
    public static final <T extends StateRecord> T writableRecord(@NotNull T t2, @NotNull StateObject state, @NotNull Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(t2, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        if (snapshot.getReadOnly()) {
            snapshot.recordModified$runtime_release(state);
        }
        T t3 = (T) readable(t2, snapshot.getId(), snapshot.getInvalid$runtime_release());
        if (t3 == null) {
            readError();
            throw new KotlinNothingValueException();
        } else if (t3.getSnapshotId$runtime_release() == snapshot.getId()) {
            return t3;
        } else {
            T t4 = (T) newWritableRecord(t3, state, snapshot);
            snapshot.recordModified$runtime_release(state);
            return t4;
        }
    }
}
