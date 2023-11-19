package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.Collection;
import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import o.i;
import o.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"androidx/compose/runtime/SnapshotStateKt__DerivedStateKt", "androidx/compose/runtime/SnapshotStateKt__ProduceStateKt", "androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt", "androidx/compose/runtime/SnapshotStateKt__SnapshotMutationPolicyKt", "androidx/compose/runtime/SnapshotStateKt__SnapshotStateKt"}, k = 4, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SnapshotStateKt {
    @Composable
    @NotNull
    public static final <T extends R, R> State<R> collectAsState(@NotNull i<? extends T> iVar, R r2, @Nullable CoroutineContext coroutineContext, @Nullable Composer composer, int i2, int i3) {
        return SnapshotStateKt__SnapshotFlowKt.collectAsState(iVar, r2, coroutineContext, composer, i2, i3);
    }

    @Composable
    @NotNull
    public static final <T> State<T> collectAsState(@NotNull t0<? extends T> t0Var, @Nullable CoroutineContext coroutineContext, @Nullable Composer composer, int i2, int i3) {
        return SnapshotStateKt__SnapshotFlowKt.collectAsState(t0Var, coroutineContext, composer, i2, i3);
    }

    @NotNull
    public static final <T> State<T> derivedStateOf(@NotNull Function0<? extends T> function0) {
        return SnapshotStateKt__DerivedStateKt.derivedStateOf(function0);
    }

    public static final <T> T getValue(@NotNull State<? extends T> state, @Nullable Object obj, @NotNull KProperty<?> kProperty) {
        return (T) SnapshotStateKt__SnapshotStateKt.getValue(state, obj, kProperty);
    }

    @NotNull
    public static final <T> SnapshotStateList<T> mutableStateListOf() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateListOf();
    }

    @NotNull
    public static final <T> SnapshotStateList<T> mutableStateListOf(@NotNull T... tArr) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateListOf(tArr);
    }

    @NotNull
    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateMapOf();
    }

    @NotNull
    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf(@NotNull Pair<? extends K, ? extends V>... pairArr) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateMapOf(pairArr);
    }

    @NotNull
    public static final <T> MutableState<T> mutableStateOf(T t2, @NotNull SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf(t2, snapshotMutationPolicy);
    }

    @NotNull
    public static final <T> SnapshotMutationPolicy<T> neverEqualPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy();
    }

    public static final <R> void observeDerivedStateRecalculations(@NotNull Function1<? super State<?>, Unit> function1, @NotNull Function1<? super State<?>, Unit> function12, @NotNull Function0<? extends R> function0) {
        SnapshotStateKt__DerivedStateKt.observeDerivedStateRecalculations(function1, function12, function0);
    }

    @Composable
    @NotNull
    public static final <T> State<T> produceState(T t2, @Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @BuilderInference @NotNull Function2<? super ProduceStateScope<T>, ? super Continuation<? super Unit>, ? extends Object> function2, @Nullable Composer composer, int i2) {
        return SnapshotStateKt__ProduceStateKt.produceState(t2, obj, obj2, obj3, function2, composer, i2);
    }

    @Composable
    @NotNull
    public static final <T> State<T> produceState(T t2, @Nullable Object obj, @Nullable Object obj2, @BuilderInference @NotNull Function2<? super ProduceStateScope<T>, ? super Continuation<? super Unit>, ? extends Object> function2, @Nullable Composer composer, int i2) {
        return SnapshotStateKt__ProduceStateKt.produceState(t2, obj, obj2, function2, composer, i2);
    }

    @Composable
    @NotNull
    public static final <T> State<T> produceState(T t2, @Nullable Object obj, @BuilderInference @NotNull Function2<? super ProduceStateScope<T>, ? super Continuation<? super Unit>, ? extends Object> function2, @Nullable Composer composer, int i2) {
        return SnapshotStateKt__ProduceStateKt.produceState(t2, obj, function2, composer, i2);
    }

    @Composable
    @NotNull
    public static final <T> State<T> produceState(T t2, @BuilderInference @NotNull Function2<? super ProduceStateScope<T>, ? super Continuation<? super Unit>, ? extends Object> function2, @Nullable Composer composer, int i2) {
        return SnapshotStateKt__ProduceStateKt.produceState(t2, function2, composer, i2);
    }

    @Composable
    @NotNull
    public static final <T> State<T> produceState(T t2, @NotNull Object[] objArr, @BuilderInference @NotNull Function2<? super ProduceStateScope<T>, ? super Continuation<? super Unit>, ? extends Object> function2, @Nullable Composer composer, int i2) {
        return SnapshotStateKt__ProduceStateKt.produceState((Object) t2, objArr, (Function2) function2, composer, i2);
    }

    @NotNull
    public static final <T> SnapshotMutationPolicy<T> referentialEqualityPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy();
    }

    @Composable
    @NotNull
    public static final <T> State<T> rememberUpdatedState(T t2, @Nullable Composer composer, int i2) {
        return SnapshotStateKt__SnapshotStateKt.rememberUpdatedState(t2, composer, i2);
    }

    public static final <T> void setValue(@NotNull MutableState<T> mutableState, @Nullable Object obj, @NotNull KProperty<?> kProperty, T t2) {
        SnapshotStateKt__SnapshotStateKt.setValue(mutableState, obj, kProperty, t2);
    }

    @NotNull
    public static final <T> i<T> snapshotFlow(@NotNull Function0<? extends T> function0) {
        return SnapshotStateKt__SnapshotFlowKt.snapshotFlow(function0);
    }

    @NotNull
    public static final <T> SnapshotMutationPolicy<T> structuralEqualityPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy();
    }

    @NotNull
    public static final <T> SnapshotStateList<T> toMutableStateList(@NotNull Collection<? extends T> collection) {
        return SnapshotStateKt__SnapshotStateKt.toMutableStateList(collection);
    }

    @NotNull
    public static final <K, V> SnapshotStateMap<K, V> toMutableStateMap(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        return SnapshotStateKt__SnapshotStateKt.toMutableStateMap(iterable);
    }
}
