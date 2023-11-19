package androidx.compose.runtime.snapshots;

import androidx.appcompat.R;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.collection.IdentityScopeMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001:\u0001*B.\u0012'\u0010\u0002\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\tJ\b\u0010\u0018\u001a\u00020\u0005H\u0002J\u0006\u0010\u0019\u001a\u00020\u0005J\u000e\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0001J)\u0010\u001b\u001a\u00020\u00052!\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00150\u0003J,\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u001e0\f\"\b\b\u0000\u0010\u001e*\u00020\u00012\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u0002H\u001e\u0012\u0004\u0012\u00020\u00050\u0003H\u0002J\u001c\u0010 \u001a\u00020\u00052\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\u0006\u0010\"\u001a\u00020\u0010J?\u0010#\u001a\u00020\u0005\"\b\b\u0000\u0010\u001e*\u00020\u00012\u0006\u0010\u001a\u001a\u0002H\u001e2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u0002H\u001e\u0012\u0004\u0012\u00020\u00050\u00032\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010&J\u0006\u0010'\u001a\u00020\u0005J\u0006\u0010(\u001a\u00020\u0005J\u0014\u0010)\u001a\u00020\u00052\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0018\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\r\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R/\u0010\u0002\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "", "onChangedExecutor", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "Lkotlin/ParameterName;", "name", "callback", "(Lkotlin/jvm/functions/Function1;)V", "applyMaps", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ApplyMap;", "applyObserver", "Lkotlin/Function2;", "", "Landroidx/compose/runtime/snapshots/Snapshot;", "applyUnsubscribe", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "currentMap", "isObserving", "", "isPaused", "readObserver", "callOnChanged", "clear", "scope", "clearIf", "predicate", "ensureMap", "T", "onChanged", "notifyChanges", "changes", "snapshot", "observeReads", "onValueChangedForScope", "block", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "start", "stop", "withNoObservations", "ApplyMap", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SnapshotStateObserver {
    public static final int $stable = 8;
    @NotNull
    private final MutableVector<ApplyMap<?>> applyMaps;
    @NotNull
    private final Function2<Set<? extends Object>, Snapshot, Unit> applyObserver;
    @Nullable
    private ObserverHandle applyUnsubscribe;
    @Nullable
    private ApplyMap<?> currentMap;
    private boolean isObserving;
    private boolean isPaused;
    @NotNull
    private final Function1<Function0<Unit>, Unit> onChangedExecutor;
    @NotNull
    private final Function1<Object, Unit> readObserver;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001e\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0002J\u0014\u0010\u001a\u001a\u00020\u00052\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cR\u001e\u0010\u0007\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR!\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000ej\b\u0012\u0004\u0012\u00020\u0002`\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ApplyMap;", "T", "", "onChanged", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "currentScope", "getCurrentScope", "()Ljava/lang/Object;", "setCurrentScope", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "invalidated", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "getInvalidated", "()Ljava/util/HashSet;", "map", "Landroidx/compose/runtime/collection/IdentityScopeMap;", "getMap", "()Landroidx/compose/runtime/collection/IdentityScopeMap;", "getOnChanged", "()Lkotlin/jvm/functions/Function1;", "addValue", "value", "callOnChanged", "scopes", "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class ApplyMap<T> {
        @Nullable
        private T currentScope;
        @NotNull
        private final HashSet<Object> invalidated;
        @NotNull
        private final IdentityScopeMap<T> map;
        @NotNull
        private final Function1<T, Unit> onChanged;

        /* JADX WARN: Multi-variable type inference failed */
        public ApplyMap(@NotNull Function1<? super T, Unit> onChanged) {
            Intrinsics.checkNotNullParameter(onChanged, "onChanged");
            this.onChanged = onChanged;
            this.map = new IdentityScopeMap<>();
            this.invalidated = new HashSet<>();
        }

        public final void addValue(@NotNull Object value) {
            Intrinsics.checkNotNullParameter(value, "value");
            IdentityScopeMap<T> identityScopeMap = this.map;
            T t2 = this.currentScope;
            Intrinsics.checkNotNull(t2);
            identityScopeMap.add(value, t2);
        }

        public final void callOnChanged(@NotNull Collection<? extends Object> scopes) {
            Intrinsics.checkNotNullParameter(scopes, "scopes");
            Iterator<T> it = scopes.iterator();
            while (it.hasNext()) {
                getOnChanged().invoke(it.next());
            }
        }

        @Nullable
        public final T getCurrentScope() {
            return this.currentScope;
        }

        @NotNull
        public final HashSet<Object> getInvalidated() {
            return this.invalidated;
        }

        @NotNull
        public final IdentityScopeMap<T> getMap() {
            return this.map;
        }

        @NotNull
        public final Function1<T, Unit> getOnChanged() {
            return this.onChanged;
        }

        public final void setCurrentScope(@Nullable T t2) {
            this.currentScope = t2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotStateObserver(@NotNull Function1<? super Function0<Unit>, Unit> onChangedExecutor) {
        Intrinsics.checkNotNullParameter(onChangedExecutor, "onChangedExecutor");
        this.onChangedExecutor = onChangedExecutor;
        this.applyObserver = new SnapshotStateObserver$applyObserver$1(this);
        this.readObserver = new SnapshotStateObserver$readObserver$1(this);
        this.applyMaps = new MutableVector<>(new ApplyMap[16], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void callOnChanged() {
        MutableVector<ApplyMap<?>> mutableVector = this.applyMaps;
        int size = mutableVector.getSize();
        if (size > 0) {
            int i2 = 0;
            ApplyMap<?>[] content = mutableVector.getContent();
            do {
                ApplyMap<?> applyMap = content[i2];
                HashSet<Object> invalidated = applyMap.getInvalidated();
                if (!invalidated.isEmpty()) {
                    applyMap.callOnChanged(invalidated);
                    invalidated.clear();
                }
                i2++;
            } while (i2 < size);
        }
    }

    private final <T> ApplyMap<T> ensureMap(Function1<? super T, Unit> function1) {
        int i2;
        MutableVector<ApplyMap<?>> mutableVector = this.applyMaps;
        int size = mutableVector.getSize();
        if (size > 0) {
            ApplyMap<?>[] content = mutableVector.getContent();
            i2 = 0;
            do {
                if (content[i2].getOnChanged() == function1) {
                    break;
                }
                i2++;
            } while (i2 < size);
            i2 = -1;
        } else {
            i2 = -1;
        }
        if (i2 == -1) {
            ApplyMap<T> applyMap = new ApplyMap<>(function1);
            this.applyMaps.add(applyMap);
            return applyMap;
        }
        return (ApplyMap<T>) this.applyMaps.getContent()[i2];
    }

    public final void clear() {
        synchronized (this.applyMaps) {
            MutableVector<ApplyMap<?>> mutableVector = this.applyMaps;
            int size = mutableVector.getSize();
            if (size > 0) {
                int i2 = 0;
                ApplyMap<?>[] content = mutableVector.getContent();
                do {
                    content[i2].getMap().clear();
                    i2++;
                } while (i2 < size);
                Unit unit = Unit.INSTANCE;
            } else {
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    public final void clear(@NotNull Object scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        synchronized (this.applyMaps) {
            MutableVector<ApplyMap<?>> mutableVector = this.applyMaps;
            int size = mutableVector.getSize();
            if (size > 0) {
                ApplyMap<?>[] content = mutableVector.getContent();
                int i2 = 0;
                do {
                    IdentityScopeMap<?> map = content[i2].getMap();
                    int size2 = map.getSize();
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < size2) {
                        int i5 = i3 + 1;
                        int i6 = map.getValueOrder()[i3];
                        IdentityArraySet<?> identityArraySet = map.getScopeSets()[i6];
                        Intrinsics.checkNotNull(identityArraySet);
                        int size3 = identityArraySet.size();
                        int i7 = 0;
                        int i8 = 0;
                        while (i8 < size3) {
                            int i9 = i8 + 1;
                            Object obj = identityArraySet.getValues()[i8];
                            if (obj == null) {
                                throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            }
                            if (!(obj == scope)) {
                                if (i7 != i8) {
                                    identityArraySet.getValues()[i7] = obj;
                                }
                                i7++;
                            }
                            i8 = i9;
                        }
                        int size4 = identityArraySet.size();
                        for (int i10 = i7; i10 < size4; i10++) {
                            identityArraySet.getValues()[i10] = null;
                        }
                        identityArraySet.setSize(i7);
                        if (identityArraySet.size() > 0) {
                            if (i4 != i3) {
                                int i11 = map.getValueOrder()[i4];
                                map.getValueOrder()[i4] = i6;
                                map.getValueOrder()[i3] = i11;
                            }
                            i4++;
                        }
                        i3 = i5;
                    }
                    int size5 = map.getSize();
                    for (int i12 = i4; i12 < size5; i12++) {
                        map.getValues()[map.getValueOrder()[i12]] = null;
                    }
                    map.setSize(i4);
                    i2++;
                } while (i2 < size);
                Unit unit = Unit.INSTANCE;
            } else {
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    public final void clearIf(@NotNull Function1<Object, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        synchronized (this.applyMaps) {
            MutableVector<ApplyMap<?>> mutableVector = this.applyMaps;
            int size = mutableVector.getSize();
            if (size > 0) {
                ApplyMap<?>[] content = mutableVector.getContent();
                int i2 = 0;
                do {
                    IdentityScopeMap<?> map = content[i2].getMap();
                    int size2 = map.getSize();
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < size2) {
                        int i5 = i3 + 1;
                        int i6 = map.getValueOrder()[i3];
                        IdentityArraySet<?> identityArraySet = map.getScopeSets()[i6];
                        Intrinsics.checkNotNull(identityArraySet);
                        int size3 = identityArraySet.size();
                        int i7 = 0;
                        int i8 = 0;
                        while (i8 < size3) {
                            int i9 = i8 + 1;
                            Object obj = identityArraySet.getValues()[i8];
                            if (obj == null) {
                                throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            }
                            if (!predicate.invoke(obj).booleanValue()) {
                                if (i7 != i8) {
                                    identityArraySet.getValues()[i7] = obj;
                                }
                                i7++;
                            }
                            i8 = i9;
                        }
                        int size4 = identityArraySet.size();
                        for (int i10 = i7; i10 < size4; i10++) {
                            identityArraySet.getValues()[i10] = null;
                        }
                        identityArraySet.setSize(i7);
                        if (identityArraySet.size() > 0) {
                            if (i4 != i3) {
                                int i11 = map.getValueOrder()[i4];
                                map.getValueOrder()[i4] = i6;
                                map.getValueOrder()[i3] = i11;
                            }
                            i4++;
                        }
                        i3 = i5;
                    }
                    int size5 = map.getSize();
                    for (int i12 = i4; i12 < size5; i12++) {
                        map.getValues()[map.getValueOrder()[i12]] = null;
                    }
                    map.setSize(i4);
                    i2++;
                } while (i2 < size);
                Unit unit = Unit.INSTANCE;
            } else {
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    public final void notifyChanges(@NotNull Set<? extends Object> changes, @NotNull Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(changes, "changes");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        this.applyObserver.invoke(changes, snapshot);
    }

    public final <T> void observeReads(@NotNull T scope, @NotNull Function1<? super T, Unit> onValueChangedForScope, @NotNull Function0<Unit> block) {
        ApplyMap<?> ensureMap;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onValueChangedForScope, "onValueChangedForScope");
        Intrinsics.checkNotNullParameter(block, "block");
        ApplyMap<?> applyMap = this.currentMap;
        boolean z = this.isPaused;
        synchronized (this.applyMaps) {
            ensureMap = ensureMap(onValueChangedForScope);
        }
        Object currentScope = ensureMap.getCurrentScope();
        ensureMap.setCurrentScope(scope);
        this.currentMap = ensureMap;
        this.isPaused = false;
        synchronized (this.applyMaps) {
            IdentityScopeMap<?> map = ensureMap.getMap();
            int size = map.getSize();
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                int i4 = i2 + 1;
                int i5 = map.getValueOrder()[i2];
                IdentityArraySet<?> identityArraySet = map.getScopeSets()[i5];
                Intrinsics.checkNotNull(identityArraySet);
                int size2 = identityArraySet.size();
                int i6 = size;
                int i7 = 0;
                int i8 = 0;
                while (i8 < size2) {
                    int i9 = i8 + 1;
                    int i10 = size2;
                    Object obj = identityArraySet.getValues()[i8];
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    }
                    if (!(obj == scope)) {
                        if (i7 != i8) {
                            identityArraySet.getValues()[i7] = obj;
                        }
                        i7++;
                    }
                    i8 = i9;
                    size2 = i10;
                }
                int size3 = identityArraySet.size();
                for (int i11 = i7; i11 < size3; i11++) {
                    identityArraySet.getValues()[i11] = null;
                }
                identityArraySet.setSize(i7);
                if (identityArraySet.size() > 0) {
                    if (i3 != i2) {
                        int i12 = map.getValueOrder()[i3];
                        map.getValueOrder()[i3] = i5;
                        map.getValueOrder()[i2] = i12;
                    }
                    i3++;
                }
                i2 = i4;
                size = i6;
            }
            int size4 = map.getSize();
            for (int i13 = i3; i13 < size4; i13++) {
                map.getValues()[map.getValueOrder()[i13]] = null;
            }
            map.setSize(i3);
            Unit unit = Unit.INSTANCE;
        }
        if (this.isObserving) {
            block.invoke();
        } else {
            this.isObserving = true;
            try {
                Snapshot.Companion.observe(this.readObserver, null, block);
            } finally {
                this.isObserving = false;
            }
        }
        this.currentMap = applyMap;
        ensureMap.setCurrentScope(currentScope);
        this.isPaused = z;
    }

    public final void start() {
        this.applyUnsubscribe = Snapshot.Companion.registerApplyObserver(this.applyObserver);
    }

    public final void stop() {
        ObserverHandle observerHandle = this.applyUnsubscribe;
        if (observerHandle == null) {
            return;
        }
        observerHandle.dispose();
    }

    public final void withNoObservations(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        boolean z = this.isPaused;
        this.isPaused = true;
        try {
            block.invoke();
        } finally {
            this.isPaused = z;
        }
    }
}
