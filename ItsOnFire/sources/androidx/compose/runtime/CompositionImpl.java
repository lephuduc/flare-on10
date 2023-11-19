package androidx.compose.runtime;

import androidx.compose.animation.core.a;
import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.collection.IdentityScopeMap;
import androidx.compose.runtime.snapshots.StateObject;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u0001:\u0001eB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010E\u001a\u00020\u001b2\f\u0010F\u001a\b\u0012\u0004\u0012\u0002030GH\u0002J\b\u0010H\u001a\u00020\u001bH\u0016J \u0010I\u001a\u00020\u001b2\u0011\u0010J\u001a\r\u0012\u0004\u0012\u00020\u001b0\u001e¢\u0006\u0002\b\u001fH\u0016¢\u0006\u0002\u0010#J\b\u0010K\u001a\u00020\u001bH\u0016J\b\u0010L\u001a\u00020\u001bH\u0002J\b\u0010M\u001a\u00020\u001bH\u0002J\u0018\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u0002012\b\u0010Q\u001a\u0004\u0018\u000103J\b\u0010R\u001a\u00020\u001bH\u0016J\u0010\u0010S\u001a\u00020\u001b2\u0006\u0010T\u001a\u000203H\u0002J\u0016\u0010U\u001a\u00020\u000f2\f\u0010F\u001a\b\u0012\u0004\u0012\u0002030GH\u0016J\u0016\u0010V\u001a\u00020\u001b2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001eH\u0016J\b\u0010X\u001a\u00020\u000fH\u0016J\u0016\u0010Y\u001a\u00020\u001b2\f\u0010F\u001a\b\u0012\u0004\u0012\u0002030GH\u0016J\u0010\u0010Z\u001a\u00020\u001b2\u0006\u0010T\u001a\u000203H\u0016J\u0010\u0010[\u001a\u00020\u001b2\u0006\u0010T\u001a\u000203H\u0016J\u001d\u0010\\\u001a\u00020\u001b2\u0006\u0010Q\u001a\u0002032\u0006\u0010P\u001a\u000201H\u0000¢\u0006\u0002\b]J \u0010^\u001a\u00020\u001b2\u0011\u0010J\u001a\r\u0012\u0004\u0012\u00020\u001b0\u001e¢\u0006\u0002\b\u001fH\u0016¢\u0006\u0002\u0010#J\u001c\u0010_\u001a\u0016\u0012\u0004\u0012\u000201\u0012\f\u0012\n\u0012\u0004\u0012\u000203\u0018\u00010200H\u0002J\"\u0010`\u001a\u0002Ha\"\u0004\b\u0000\u0010a2\f\u0010W\u001a\b\u0012\u0004\u0012\u0002Ha0\u001eH\u0082\b¢\u0006\u0002\u0010bJ\u0010\u0010c\u001a\u00020\u001b2\u0006\u0010C\u001a\u00020DH\u0002J\b\u0010d\u001a\u00020\u001bH\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011Ra\u0010\u0012\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0005¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u001b0\u0014j\u0002`\u001c0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R'\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\u001b0\u001e¢\u0006\u0002\b\u001fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010'\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030)0(X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010+\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0011R\u0014\u0010-\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0011R\"\u0010/\u001a\u0016\u0012\u0004\u0012\u000201\u0012\f\u0012\n\u0012\u0004\u0012\u000203\u0018\u00010200X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00104\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u0011R\u0014\u00105\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0011R\u0011\u00106\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u0011R\u000e\u00107\u001a\u000203X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00108\u001a\b\u0012\u0004\u0012\u0002010(X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00109\u001a\b\u0012\u0004\u0012\u0002010(X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010:\u001a\u00020\u000fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0011\"\u0004\b<\u0010=R\"\u0010>\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001030?j\n\u0012\u0006\u0012\u0004\u0018\u000103`@X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bA\u0010BR\u000e\u0010C\u001a\u00020DX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006f"}, d2 = {"Landroidx/compose/runtime/CompositionImpl;", "Landroidx/compose/runtime/ControlledComposition;", "parent", "Landroidx/compose/runtime/CompositionContext;", "applier", "Landroidx/compose/runtime/Applier;", "recomposeContext", "Lkotlin/coroutines/CoroutineContext;", "(Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/Applier;Lkotlin/coroutines/CoroutineContext;)V", "_recomposeContext", "abandonSet", "Ljava/util/HashSet;", "Landroidx/compose/runtime/RememberObserver;", "Lkotlin/collections/HashSet;", "areChildrenComposing", "", "getAreChildrenComposing", "()Z", "changes", "", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "Landroidx/compose/runtime/Change;", "composable", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "getComposable", "()Lkotlin/jvm/functions/Function2;", "setComposable", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "composer", "Landroidx/compose/runtime/ComposerImpl;", "derivedStates", "Landroidx/compose/runtime/collection/IdentityScopeMap;", "Landroidx/compose/runtime/DerivedState;", "disposed", "hasInvalidations", "getHasInvalidations", "hasPendingChanges", "getHasPendingChanges", "invalidations", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "Landroidx/compose/runtime/collection/IdentityArraySet;", "", "isComposing", "isDisposed", "isRoot", "lock", "observations", "observationsProcessed", "pendingInvalidScopes", "getPendingInvalidScopes$runtime_release", "setPendingInvalidScopes$runtime_release", "(Z)V", "pendingModifications", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/AtomicReference;", "getRecomposeContext", "()Lkotlin/coroutines/CoroutineContext;", "slotTable", "Landroidx/compose/runtime/SlotTable;", "addPendingInvalidationsLocked", "values", "", "applyChanges", "composeContent", FirebaseAnalytics.Param.CONTENT, "dispose", "drainPendingModificationsForCompositionLocked", "drainPendingModificationsLocked", "invalidate", "Landroidx/compose/runtime/InvalidationResult;", "scope", "instance", "invalidateAll", "invalidateScopeOfLocked", "value", "observesAnyOf", "prepareCompose", "block", "recompose", "recordModificationsOf", "recordReadOf", "recordWriteOf", "removeObservation", "removeObservation$runtime_release", "setContent", "takeInvalidations", "trackAbandonedValues", "T", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "validateRecomposeScopeAnchors", "verifyConsistent", "RememberEventDispatcher", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class CompositionImpl implements ControlledComposition {
    @Nullable
    private final CoroutineContext _recomposeContext;
    @NotNull
    private final HashSet<RememberObserver> abandonSet;
    @NotNull
    private final Applier<?> applier;
    @NotNull
    private final List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> changes;
    @NotNull
    private Function2<? super Composer, ? super Integer, Unit> composable;
    @NotNull
    private final ComposerImpl composer;
    @NotNull
    private final IdentityScopeMap<DerivedState<?>> derivedStates;
    private boolean disposed;
    @NotNull
    private IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> invalidations;
    private final boolean isRoot;
    @NotNull
    private final Object lock;
    @NotNull
    private final IdentityScopeMap<RecomposeScopeImpl> observations;
    @NotNull
    private final IdentityScopeMap<RecomposeScopeImpl> observationsProcessed;
    @NotNull
    private final CompositionContext parent;
    private boolean pendingInvalidScopes;
    @NotNull
    private final AtomicReference<Object> pendingModifications;
    @NotNull
    private final SlotTable slotTable;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u000bJ\u0010\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\u0016\u0010\u0010\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/CompositionImpl$RememberEventDispatcher;", "Landroidx/compose/runtime/RememberManager;", "abandoning", "", "Landroidx/compose/runtime/RememberObserver;", "(Ljava/util/Set;)V", "forgetting", "", "remembering", "sideEffects", "Lkotlin/Function0;", "", "dispatchAbandons", "dispatchRememberObservers", "dispatchSideEffects", "instance", "sideEffect", "effect", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class RememberEventDispatcher implements RememberManager {
        @NotNull
        private final Set<RememberObserver> abandoning;
        @NotNull
        private final List<RememberObserver> forgetting;
        @NotNull
        private final List<RememberObserver> remembering;
        @NotNull
        private final List<Function0<Unit>> sideEffects;

        public RememberEventDispatcher(@NotNull Set<RememberObserver> abandoning) {
            Intrinsics.checkNotNullParameter(abandoning, "abandoning");
            this.abandoning = abandoning;
            this.remembering = new ArrayList();
            this.forgetting = new ArrayList();
            this.sideEffects = new ArrayList();
        }

        public final void dispatchAbandons() {
            if (!this.abandoning.isEmpty()) {
                Iterator<RememberObserver> it = this.abandoning.iterator();
                while (it.hasNext()) {
                    it.remove();
                    it.next().onAbandoned();
                }
            }
        }

        public final void dispatchRememberObservers() {
            int i2;
            if ((!this.forgetting.isEmpty()) && this.forgetting.size() - 1 >= 0) {
                while (true) {
                    int i3 = i2 - 1;
                    RememberObserver rememberObserver = this.forgetting.get(i2);
                    if (!this.abandoning.contains(rememberObserver)) {
                        rememberObserver.onForgotten();
                    }
                    if (i3 < 0) {
                        break;
                    }
                    i2 = i3;
                }
            }
            if (!this.remembering.isEmpty()) {
                List<RememberObserver> list = this.remembering;
                int i4 = 0;
                int size = list.size();
                while (i4 < size) {
                    int i5 = i4 + 1;
                    RememberObserver rememberObserver2 = list.get(i4);
                    this.abandoning.remove(rememberObserver2);
                    rememberObserver2.onRemembered();
                    i4 = i5;
                }
            }
        }

        public final void dispatchSideEffects() {
            if (!this.sideEffects.isEmpty()) {
                List<Function0<Unit>> list = this.sideEffects;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    list.get(i2).invoke();
                }
                this.sideEffects.clear();
            }
        }

        @Override // androidx.compose.runtime.RememberManager
        public void forgetting(@NotNull RememberObserver instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            int lastIndexOf = this.remembering.lastIndexOf(instance);
            if (lastIndexOf < 0) {
                this.forgetting.add(instance);
                return;
            }
            this.remembering.remove(lastIndexOf);
            this.abandoning.remove(instance);
        }

        @Override // androidx.compose.runtime.RememberManager
        public void remembering(@NotNull RememberObserver instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            int lastIndexOf = this.forgetting.lastIndexOf(instance);
            if (lastIndexOf < 0) {
                this.remembering.add(instance);
                return;
            }
            this.forgetting.remove(lastIndexOf);
            this.abandoning.remove(instance);
        }

        @Override // androidx.compose.runtime.RememberManager
        public void sideEffect(@NotNull Function0<Unit> effect) {
            Intrinsics.checkNotNullParameter(effect, "effect");
            this.sideEffects.add(effect);
        }
    }

    public CompositionImpl(@NotNull CompositionContext parent, @NotNull Applier<?> applier, @Nullable CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(applier, "applier");
        this.parent = parent;
        this.applier = applier;
        this.pendingModifications = new AtomicReference<>(null);
        this.lock = new Object();
        HashSet<RememberObserver> hashSet = new HashSet<>();
        this.abandonSet = hashSet;
        SlotTable slotTable = new SlotTable();
        this.slotTable = slotTable;
        this.observations = new IdentityScopeMap<>();
        this.derivedStates = new IdentityScopeMap<>();
        ArrayList arrayList = new ArrayList();
        this.changes = arrayList;
        this.observationsProcessed = new IdentityScopeMap<>();
        this.invalidations = new IdentityArrayMap<>(0, 1, null);
        ComposerImpl composerImpl = new ComposerImpl(applier, parent, slotTable, hashSet, arrayList, this);
        parent.registerComposer$runtime_release(composerImpl);
        this.composer = composerImpl;
        this._recomposeContext = coroutineContext;
        this.isRoot = parent instanceof Recomposer;
        this.composable = ComposableSingletons$CompositionKt.INSTANCE.m1053getLambda1$runtime_release();
    }

    public /* synthetic */ CompositionImpl(CompositionContext compositionContext, Applier applier, CoroutineContext coroutineContext, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(compositionContext, applier, (i2 & 4) != 0 ? null : coroutineContext);
    }

    private final void addPendingInvalidationsLocked(Set<? extends Object> set) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        for (Object obj : set) {
            if (obj instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl) obj).invalidateForResult(null);
            } else {
                addPendingInvalidationsLocked$invalidate(this, objectRef, obj);
                IdentityScopeMap<DerivedState<?>> identityScopeMap = this.derivedStates;
                int find = identityScopeMap.find(obj);
                if (find >= 0) {
                    for (DerivedState derivedState : identityScopeMap.scopeSetAt(find)) {
                        addPendingInvalidationsLocked$invalidate(this, objectRef, derivedState);
                    }
                }
            }
        }
        HashSet hashSet = (HashSet) objectRef.element;
        if (hashSet == null) {
            return;
        }
        IdentityScopeMap<RecomposeScopeImpl> identityScopeMap2 = this.observations;
        int size = identityScopeMap2.getSize();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            int i4 = i2 + 1;
            int i5 = identityScopeMap2.getValueOrder()[i2];
            IdentityArraySet<RecomposeScopeImpl> identityArraySet = identityScopeMap2.getScopeSets()[i5];
            Intrinsics.checkNotNull(identityArraySet);
            int size2 = identityArraySet.size();
            int i6 = 0;
            int i7 = 0;
            while (i6 < size2) {
                int i8 = i6 + 1;
                Object obj2 = identityArraySet.getValues()[i6];
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                }
                if (!hashSet.contains((RecomposeScopeImpl) obj2)) {
                    if (i7 != i6) {
                        identityArraySet.getValues()[i7] = obj2;
                    }
                    i7++;
                }
                i6 = i8;
            }
            int size3 = identityArraySet.size();
            for (int i9 = i7; i9 < size3; i9++) {
                identityArraySet.getValues()[i9] = null;
            }
            identityArraySet.setSize(i7);
            if (identityArraySet.size() > 0) {
                if (i3 != i2) {
                    int i10 = identityScopeMap2.getValueOrder()[i3];
                    identityScopeMap2.getValueOrder()[i3] = i5;
                    identityScopeMap2.getValueOrder()[i2] = i10;
                }
                i3++;
            }
            i2 = i4;
        }
        int size4 = identityScopeMap2.getSize();
        for (int i11 = i3; i11 < size4; i11++) {
            identityScopeMap2.getValues()[identityScopeMap2.getValueOrder()[i11]] = null;
        }
        identityScopeMap2.setSize(i3);
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.HashSet, T] */
    private static final void addPendingInvalidationsLocked$invalidate(CompositionImpl compositionImpl, Ref.ObjectRef<HashSet<RecomposeScopeImpl>> objectRef, Object obj) {
        IdentityScopeMap<RecomposeScopeImpl> identityScopeMap = compositionImpl.observations;
        int find = identityScopeMap.find(obj);
        if (find >= 0) {
            for (RecomposeScopeImpl recomposeScopeImpl : identityScopeMap.scopeSetAt(find)) {
                if (!compositionImpl.observationsProcessed.remove(obj, recomposeScopeImpl) && recomposeScopeImpl.invalidateForResult(obj) != InvalidationResult.IGNORED) {
                    HashSet<RecomposeScopeImpl> hashSet = objectRef.element;
                    HashSet<RecomposeScopeImpl> hashSet2 = hashSet;
                    if (hashSet == null) {
                        ?? hashSet3 = new HashSet();
                        objectRef.element = hashSet3;
                        hashSet2 = hashSet3;
                    }
                    hashSet2.add(recomposeScopeImpl);
                }
            }
        }
    }

    private final void drainPendingModificationsForCompositionLocked() {
        Object andSet = this.pendingModifications.getAndSet(CompositionKt.access$getPendingApplyNoModifications$p());
        if (andSet == null) {
            return;
        }
        if (Intrinsics.areEqual(andSet, CompositionKt.access$getPendingApplyNoModifications$p())) {
            throw new IllegalStateException("pending composition has not been applied".toString());
        }
        if (andSet instanceof Set) {
            addPendingInvalidationsLocked((Set) andSet);
        } else if (!(andSet instanceof Object[])) {
            throw new IllegalStateException(Intrinsics.stringPlus("corrupt pendingModifications drain: ", this.pendingModifications).toString());
        } else {
            Set<? extends Object>[] setArr = (Set[]) andSet;
            int i2 = 0;
            int length = setArr.length;
            while (i2 < length) {
                Set<? extends Object> set = setArr[i2];
                i2++;
                addPendingInvalidationsLocked(set);
            }
        }
    }

    private final void drainPendingModificationsLocked() {
        Object andSet = this.pendingModifications.getAndSet(null);
        if (Intrinsics.areEqual(andSet, CompositionKt.access$getPendingApplyNoModifications$p())) {
            return;
        }
        if (andSet instanceof Set) {
            addPendingInvalidationsLocked((Set) andSet);
        } else if (!(andSet instanceof Object[])) {
            if (andSet != null) {
                throw new IllegalStateException(Intrinsics.stringPlus("corrupt pendingModifications drain: ", this.pendingModifications).toString());
            }
            throw new IllegalStateException("calling recordModificationsOf and applyChanges concurrently is not supported".toString());
        } else {
            Set<? extends Object>[] setArr = (Set[]) andSet;
            int i2 = 0;
            int length = setArr.length;
            while (i2 < length) {
                Set<? extends Object> set = setArr[i2];
                i2++;
                addPendingInvalidationsLocked(set);
            }
        }
    }

    private final boolean getAreChildrenComposing() {
        return this.composer.getAreChildrenComposing$runtime_release();
    }

    private final void invalidateScopeOfLocked(Object obj) {
        IdentityScopeMap<RecomposeScopeImpl> identityScopeMap = this.observations;
        int find = identityScopeMap.find(obj);
        if (find >= 0) {
            for (RecomposeScopeImpl recomposeScopeImpl : identityScopeMap.scopeSetAt(find)) {
                if (recomposeScopeImpl.invalidateForResult(obj) == InvalidationResult.IMMINENT) {
                    this.observationsProcessed.add(obj, recomposeScopeImpl);
                }
            }
        }
    }

    private final IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> takeInvalidations() {
        IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> identityArrayMap = this.invalidations;
        this.invalidations = new IdentityArrayMap<>(0, 1, null);
        return identityArrayMap;
    }

    private final <T> T trackAbandonedValues(Function0<? extends T> function0) {
        try {
            T invoke = function0.invoke();
            InlineMarker.finallyStart(1);
            InlineMarker.finallyEnd(1);
            return invoke;
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            if (!this.abandonSet.isEmpty()) {
                new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
            }
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    private final void validateRecomposeScopeAnchors(SlotTable slotTable) {
        int indexOf;
        Object[] slots = slotTable.getSlots();
        ArrayList arrayList = new ArrayList();
        int length = slots.length;
        int i2 = 0;
        int i3 = 0;
        while (i3 < length) {
            Object obj = slots[i3];
            i3++;
            RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
            if (recomposeScopeImpl != null) {
                arrayList.add(recomposeScopeImpl);
            }
        }
        int size = arrayList.size();
        while (i2 < size) {
            int i4 = i2 + 1;
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) arrayList.get(i2);
            Anchor anchor = recomposeScopeImpl2.getAnchor();
            if (anchor != null && !slotTable.slotsOf$runtime_release(anchor.toIndexFor(slotTable)).contains(recomposeScopeImpl2)) {
                indexOf = ArraysKt___ArraysKt.indexOf((RecomposeScopeImpl[]) slotTable.getSlots(), recomposeScopeImpl2);
                throw new IllegalStateException(("Misaligned anchor " + anchor + " in scope " + recomposeScopeImpl2 + " encountered, scope found at " + indexOf).toString());
            }
            i2 = i4;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyChanges() {
        synchronized (this.lock) {
            RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
            this.applier.onBeginChanges();
            SlotWriter openWriter = this.slotTable.openWriter();
            Applier<?> applier = this.applier;
            List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> list = this.changes;
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                list.get(i3).invoke(applier, openWriter, rememberEventDispatcher);
            }
            this.changes.clear();
            Unit unit = Unit.INSTANCE;
            openWriter.close();
            this.applier.onEndChanges();
            rememberEventDispatcher.dispatchRememberObservers();
            rememberEventDispatcher.dispatchSideEffects();
            if (getPendingInvalidScopes$runtime_release()) {
                setPendingInvalidScopes$runtime_release(false);
                IdentityScopeMap<RecomposeScopeImpl> identityScopeMap = this.observations;
                int size2 = identityScopeMap.getSize();
                int i4 = 0;
                int i5 = 0;
                while (i4 < size2) {
                    int i6 = i4 + 1;
                    int i7 = identityScopeMap.getValueOrder()[i4];
                    IdentityArraySet<RecomposeScopeImpl> identityArraySet = identityScopeMap.getScopeSets()[i7];
                    Intrinsics.checkNotNull(identityArraySet);
                    int size3 = identityArraySet.size();
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < size3) {
                        int i10 = i8 + 1;
                        Object obj = identityArraySet.getValues()[i8];
                        if (obj == null) {
                            throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        }
                        if (!(!((RecomposeScopeImpl) obj).getValid())) {
                            if (i9 != i8) {
                                identityArraySet.getValues()[i9] = obj;
                            }
                            i9++;
                        }
                        i8 = i10;
                    }
                    int size4 = identityArraySet.size();
                    for (int i11 = i9; i11 < size4; i11++) {
                        identityArraySet.getValues()[i11] = null;
                    }
                    identityArraySet.setSize(i9);
                    if (identityArraySet.size() > 0) {
                        if (i5 != i4) {
                            int i12 = identityScopeMap.getValueOrder()[i5];
                            identityScopeMap.getValueOrder()[i5] = i7;
                            identityScopeMap.getValueOrder()[i4] = i12;
                        }
                        i5++;
                    }
                    i4 = i6;
                }
                int size5 = identityScopeMap.getSize();
                for (int i13 = i5; i13 < size5; i13++) {
                    identityScopeMap.getValues()[identityScopeMap.getValueOrder()[i13]] = null;
                }
                identityScopeMap.setSize(i5);
                IdentityScopeMap<DerivedState<?>> identityScopeMap2 = this.derivedStates;
                int size6 = identityScopeMap2.getSize();
                int i14 = 0;
                int i15 = 0;
                while (i14 < size6) {
                    int i16 = i14 + 1;
                    int i17 = identityScopeMap2.getValueOrder()[i14];
                    IdentityArraySet<DerivedState<?>> identityArraySet2 = identityScopeMap2.getScopeSets()[i17];
                    Intrinsics.checkNotNull(identityArraySet2);
                    int size7 = identityArraySet2.size();
                    int i18 = i2;
                    int i19 = i18;
                    while (i18 < size7) {
                        int i20 = i18 + 1;
                        Object obj2 = identityArraySet2.getValues()[i18];
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        }
                        if (!(!this.observations.contains((DerivedState) obj2))) {
                            if (i19 != i18) {
                                identityArraySet2.getValues()[i19] = obj2;
                            }
                            i19++;
                        }
                        i18 = i20;
                    }
                    int size8 = identityArraySet2.size();
                    for (int i21 = i19; i21 < size8; i21++) {
                        identityArraySet2.getValues()[i21] = null;
                    }
                    identityArraySet2.setSize(i19);
                    if (identityArraySet2.size() > 0) {
                        if (i15 != i14) {
                            int i22 = identityScopeMap2.getValueOrder()[i15];
                            identityScopeMap2.getValueOrder()[i15] = i17;
                            identityScopeMap2.getValueOrder()[i14] = i22;
                        }
                        i15++;
                    }
                    i14 = i16;
                    i2 = 0;
                }
                int size9 = identityScopeMap2.getSize();
                for (int i23 = i15; i23 < size9; i23++) {
                    identityScopeMap2.getValues()[identityScopeMap2.getValueOrder()[i23]] = null;
                }
                identityScopeMap2.setSize(i15);
            }
            rememberEventDispatcher.dispatchAbandons();
            drainPendingModificationsLocked();
            Unit unit2 = Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void composeContent(@NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        try {
            synchronized (this.lock) {
                drainPendingModificationsForCompositionLocked();
                this.composer.composeContent$runtime_release(takeInvalidations(), content);
                Unit unit = Unit.INSTANCE;
            }
        } catch (Throwable th) {
            if (!this.abandonSet.isEmpty()) {
                new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
            }
            throw th;
        }
    }

    @Override // androidx.compose.runtime.Composition
    public void dispose() {
        synchronized (this.lock) {
            if (!this.disposed) {
                this.disposed = true;
                setComposable(ComposableSingletons$CompositionKt.INSTANCE.m1054getLambda2$runtime_release());
                boolean z = this.slotTable.getGroupsSize() > 0;
                if (z || (true ^ this.abandonSet.isEmpty())) {
                    RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
                    if (z) {
                        SlotWriter openWriter = this.slotTable.openWriter();
                        ComposerKt.removeCurrentGroup(openWriter, rememberEventDispatcher);
                        Unit unit = Unit.INSTANCE;
                        openWriter.close();
                        this.applier.clear();
                        rememberEventDispatcher.dispatchRememberObservers();
                    }
                    rememberEventDispatcher.dispatchAbandons();
                }
                this.composer.dispose$runtime_release();
            }
            Unit unit2 = Unit.INSTANCE;
        }
        this.parent.unregisterComposition$runtime_release(this);
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> getComposable() {
        return this.composable;
    }

    @Override // androidx.compose.runtime.Composition
    public boolean getHasInvalidations() {
        boolean z;
        synchronized (this.lock) {
            z = this.invalidations.getSize$runtime_release() > 0;
        }
        return z;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean getHasPendingChanges() {
        boolean hasPendingChanges$runtime_release;
        synchronized (this.lock) {
            hasPendingChanges$runtime_release = this.composer.getHasPendingChanges$runtime_release();
        }
        return hasPendingChanges$runtime_release;
    }

    public final boolean getPendingInvalidScopes$runtime_release() {
        return this.pendingInvalidScopes;
    }

    @NotNull
    public final CoroutineContext getRecomposeContext() {
        CoroutineContext coroutineContext = this._recomposeContext;
        return coroutineContext == null ? this.parent.getRecomposeCoroutineContext$runtime_release() : coroutineContext;
    }

    @NotNull
    public final InvalidationResult invalidate(@NotNull RecomposeScopeImpl scope, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        if (scope.getDefaultsInScope()) {
            scope.setDefaultsInvalid(true);
        }
        Anchor anchor = scope.getAnchor();
        if (anchor != null && this.slotTable.ownsAnchor(anchor) && anchor.getValid()) {
            if (anchor.toIndexFor(this.slotTable) < 0) {
                return InvalidationResult.IGNORED;
            }
            if (isComposing() && this.composer.tryImminentInvalidation$runtime_release(scope, obj)) {
                return InvalidationResult.IMMINENT;
            }
            if (obj == null) {
                this.invalidations.set(scope, null);
            } else {
                CompositionKt.access$addValue(this.invalidations, scope, obj);
            }
            this.parent.invalidate$runtime_release(this);
            return isComposing() ? InvalidationResult.DEFERRED : InvalidationResult.SCHEDULED;
        }
        return InvalidationResult.IGNORED;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void invalidateAll() {
        synchronized (this.lock) {
            Object[] slots = this.slotTable.getSlots();
            int i2 = 0;
            int length = slots.length;
            while (i2 < length) {
                Object obj = slots[i2];
                i2++;
                RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
                if (recomposeScopeImpl != null) {
                    recomposeScopeImpl.invalidate();
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean isComposing() {
        return this.composer.isComposing$runtime_release();
    }

    @Override // androidx.compose.runtime.Composition
    public boolean isDisposed() {
        return this.disposed;
    }

    public final boolean isRoot() {
        return this.isRoot;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000f  */
    @Override // androidx.compose.runtime.ControlledComposition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean observesAnyOf(@org.jetbrains.annotations.NotNull java.util.Set<? extends java.lang.Object> r3) {
        /*
            r2 = this;
            java.lang.String r0 = "values"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r3.next()
            androidx.compose.runtime.collection.IdentityScopeMap<androidx.compose.runtime.RecomposeScopeImpl> r1 = r2.observations
            boolean r1 = r1.contains(r0)
            if (r1 != 0) goto L23
            androidx.compose.runtime.collection.IdentityScopeMap<androidx.compose.runtime.DerivedState<?>> r1 = r2.derivedStates
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L9
        L23:
            r2 = 1
            return r2
        L25:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.observesAnyOf(java.util.Set):boolean");
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void prepareCompose(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.composer.prepareCompose$runtime_release(block);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean recompose() {
        boolean recompose$runtime_release;
        synchronized (this.lock) {
            drainPendingModificationsForCompositionLocked();
            recompose$runtime_release = this.composer.recompose$runtime_release(takeInvalidations());
            if (!recompose$runtime_release) {
                drainPendingModificationsLocked();
            }
        }
        return recompose$runtime_release;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Set[]] */
    @Override // androidx.compose.runtime.ControlledComposition
    public void recordModificationsOf(@NotNull Set<? extends Object> values) {
        Object obj;
        ?? plus;
        Set<? extends Object> set;
        Intrinsics.checkNotNullParameter(values, "values");
        do {
            obj = this.pendingModifications.get();
            if (obj == null ? true : Intrinsics.areEqual(obj, CompositionKt.access$getPendingApplyNoModifications$p())) {
                set = values;
            } else if (obj instanceof Set) {
                set = new Set[]{(Set) obj, values};
            } else if (!(obj instanceof Object[])) {
                throw new IllegalStateException(Intrinsics.stringPlus("corrupt pendingModifications: ", this.pendingModifications).toString());
            } else {
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                }
                plus = ArraysKt___ArraysJvmKt.plus((Set<? extends Object>[]) obj, values);
                set = plus;
            }
        } while (!a.a(this.pendingModifications, obj, set));
        if (obj == null) {
            synchronized (this.lock) {
                drainPendingModificationsLocked();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void recordReadOf(@NotNull Object value) {
        RecomposeScopeImpl currentRecomposeScope$runtime_release;
        Intrinsics.checkNotNullParameter(value, "value");
        if (getAreChildrenComposing() || (currentRecomposeScope$runtime_release = this.composer.getCurrentRecomposeScope$runtime_release()) == null) {
            return;
        }
        currentRecomposeScope$runtime_release.setUsed(true);
        this.observations.add(value, currentRecomposeScope$runtime_release);
        if (value instanceof DerivedState) {
            for (StateObject stateObject : ((DerivedState) value).getDependencies()) {
                this.derivedStates.add(stateObject, value);
            }
        }
        currentRecomposeScope$runtime_release.recordRead(value);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void recordWriteOf(@NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (this.lock) {
            invalidateScopeOfLocked(value);
            IdentityScopeMap<DerivedState<?>> identityScopeMap = this.derivedStates;
            int find = identityScopeMap.find(value);
            if (find >= 0) {
                for (DerivedState derivedState : identityScopeMap.scopeSetAt(find)) {
                    invalidateScopeOfLocked(derivedState);
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void removeObservation$runtime_release(@NotNull Object instance, @NotNull RecomposeScopeImpl scope) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.observations.remove(instance, scope);
    }

    public final void setComposable(@NotNull Function2<? super Composer, ? super Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.composable = function2;
    }

    @Override // androidx.compose.runtime.Composition
    public void setContent(@NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        if (!(!this.disposed)) {
            throw new IllegalStateException("The composition is disposed".toString());
        }
        this.composable = content;
        this.parent.composeInitial$runtime_release(this, content);
    }

    public final void setPendingInvalidScopes$runtime_release(boolean z) {
        this.pendingInvalidScopes = z;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void verifyConsistent() {
        synchronized (this.lock) {
            if (!isComposing()) {
                this.slotTable.verifyWellFormed();
                validateRecomposeScopeAnchors(this.slotTable);
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
