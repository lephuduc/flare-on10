package androidx.compose.runtime;

import j.c0;
import j.n2;
import j.r2;
import j.u0;
import j.v0;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a(\u0010\t\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\t\u0010\n\u001a2\u0010\t\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\t\u0010\r\u001a<\u0010\t\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\t\u0010\u000f\u001aF\u0010\t\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\t\u0010\u0011\u001a@\u0010\t\u001a\u00020\u00012\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b0\u0012\"\u0004\u0018\u00010\u000b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\t\u0010\u0014\u001a;\u0010\u0019\u001a\u00020\u00012'\u0010\u0018\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0015¢\u0006\u0002\b\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aE\u0010\u0019\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u000b2'\u0010\u0018\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0015¢\u0006\u0002\b\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001b\u001aO\u0010\u0019\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2'\u0010\u0018\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0015¢\u0006\u0002\b\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001c\u001aY\u0010\u0019\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2'\u0010\u0018\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0015¢\u0006\u0002\b\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001d\u001aS\u0010\u0019\u001a\u00020\u00012\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b0\u0012\"\u0004\u0018\u00010\u000b2'\u0010\u0018\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0015¢\u0006\u0002\b\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001e\u001a\u0018\u0010#\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0001\u001a(\u0010&\u001a\u00020\u00162\u0013\b\u0002\u0010%\u001a\r\u0012\u0004\u0012\u00020\u001f0\u0000¢\u0006\u0002\b$H\u0087\bø\u0001\u0001¢\u0006\u0004\b&\u0010'\"\u0014\u0010(\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)\"\u0014\u0010+\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010,\"\u0014\u0010-\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010,\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006."}, d2 = {"Lkotlin/Function0;", "", "effect", "SideEffect", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function1;", "Landroidx/compose/runtime/DisposableEffectScope;", "Landroidx/compose/runtime/DisposableEffectResult;", "Lkotlin/ExtensionFunctionType;", "DisposableEffect", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "key1", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "key2", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "key3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "keys", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function2;", "Lj/u0;", "Lkotlin/coroutines/Continuation;", "block", "LaunchedEffect", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroidx/compose/runtime/Composer;", "composer", "createCompositionCoroutineScope", "Landroidx/compose/runtime/DisallowComposableCalls;", "getContext", "rememberCoroutineScope", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Lj/u0;", "InternalDisposableEffectScope", "Landroidx/compose/runtime/DisposableEffectScope;", "", "DisposableEffectNoParamError", "Ljava/lang/String;", "LaunchedEffectNoParamError", "runtime_release"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class EffectsKt {
    @NotNull
    private static final String DisposableEffectNoParamError = "DisposableEffect must provide one or more 'key' parameters that define the identity of the DisposableEffect and determine when its previous effect should be disposed and a new effect started for the new key.";
    @NotNull
    private static final DisposableEffectScope InternalDisposableEffectScope = new DisposableEffectScope();
    @NotNull
    private static final String LaunchedEffectNoParamError = "LaunchedEffect must provide one or more 'key' parameters that define the identity of the LaunchedEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";

    @Composable
    public static final void DisposableEffect(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @NotNull Function1<? super DisposableEffectScope, ? extends DisposableEffectResult> effect, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        composer.startReplaceableGroup(592134824);
        composer.startReplaceableGroup(-3686095);
        boolean changed = composer.changed(obj) | composer.changed(obj2) | composer.changed(obj3);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new DisposableEffectImpl(effect));
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void DisposableEffect(@Nullable Object obj, @Nullable Object obj2, @NotNull Function1<? super DisposableEffectScope, ? extends DisposableEffectResult> effect, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        composer.startReplaceableGroup(592132916);
        composer.startReplaceableGroup(-3686552);
        boolean changed = composer.changed(obj) | composer.changed(obj2);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new DisposableEffectImpl(effect));
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void DisposableEffect(@Nullable Object obj, @NotNull Function1<? super DisposableEffectScope, ? extends DisposableEffectResult> effect, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        composer.startReplaceableGroup(592131046);
        composer.startReplaceableGroup(-3686930);
        boolean changed = composer.changed(obj);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new DisposableEffectImpl(effect));
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = DisposableEffectNoParamError)
    @Composable
    public static final void DisposableEffect(@NotNull Function1<? super DisposableEffectScope, ? extends DisposableEffectResult> effect, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        composer.startReplaceableGroup(592129228);
        throw new IllegalStateException(DisposableEffectNoParamError.toString());
    }

    @Composable
    public static final void DisposableEffect(@NotNull Object[] keys, @NotNull Function1<? super DisposableEffectScope, ? extends DisposableEffectResult> effect, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(effect, "effect");
        composer.startReplaceableGroup(592136745);
        Object[] copyOf = Arrays.copyOf(keys, keys.length);
        composer.startReplaceableGroup(-3685570);
        int length = copyOf.length;
        int i3 = 0;
        boolean z = false;
        while (i3 < length) {
            Object obj = copyOf[i3];
            i3++;
            z |= composer.changed(obj);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new DisposableEffectImpl(effect));
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void LaunchedEffect(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @NotNull Function2<? super u0, ? super Continuation<? super Unit>, ? extends Object> block, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(block, "block");
        composer.startReplaceableGroup(1036444259);
        CoroutineContext applyCoroutineContext = composer.getApplyCoroutineContext();
        composer.startReplaceableGroup(-3686095);
        boolean changed = composer.changed(obj) | composer.changed(obj2) | composer.changed(obj3);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new LaunchedEffectImpl(applyCoroutineContext, block));
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void LaunchedEffect(@Nullable Object obj, @Nullable Object obj2, @NotNull Function2<? super u0, ? super Continuation<? super Unit>, ? extends Object> block, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(block, "block");
        composer.startReplaceableGroup(1036443237);
        CoroutineContext applyCoroutineContext = composer.getApplyCoroutineContext();
        composer.startReplaceableGroup(-3686552);
        boolean changed = composer.changed(obj) | composer.changed(obj2);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new LaunchedEffectImpl(applyCoroutineContext, block));
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void LaunchedEffect(@Nullable Object obj, @NotNull Function2<? super u0, ? super Continuation<? super Unit>, ? extends Object> block, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(block, "block");
        composer.startReplaceableGroup(1036442245);
        CoroutineContext applyCoroutineContext = composer.getApplyCoroutineContext();
        composer.startReplaceableGroup(-3686930);
        boolean changed = composer.changed(obj);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new LaunchedEffectImpl(applyCoroutineContext, block));
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = LaunchedEffectNoParamError)
    @Composable
    public static final void LaunchedEffect(@NotNull Function2<? super u0, ? super Continuation<? super Unit>, ? extends Object> block, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(block, "block");
        Composer startRestartGroup = composer.startRestartGroup(1036441364);
        if ((i2 & 1) != 0 || !startRestartGroup.getSkipping()) {
            throw new IllegalStateException(LaunchedEffectNoParamError.toString());
        }
        startRestartGroup.skipToGroupEnd();
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new EffectsKt$LaunchedEffect$1(block, i2));
    }

    @Composable
    public static final void LaunchedEffect(@NotNull Object[] keys, @NotNull Function2<? super u0, ? super Continuation<? super Unit>, ? extends Object> block, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(block, "block");
        composer.startReplaceableGroup(1036445312);
        CoroutineContext applyCoroutineContext = composer.getApplyCoroutineContext();
        Object[] copyOf = Arrays.copyOf(keys, keys.length);
        composer.startReplaceableGroup(-3685570);
        int length = copyOf.length;
        int i3 = 0;
        boolean z = false;
        while (i3 < length) {
            Object obj = copyOf[i3];
            i3++;
            z |= composer.changed(obj);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new LaunchedEffectImpl(applyCoroutineContext, block));
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void SideEffect(@NotNull Function0<Unit> effect, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        composer.startReplaceableGroup(-2102467972);
        composer.recordSideEffect(effect);
        composer.endReplaceableGroup();
    }

    @PublishedApi
    @NotNull
    public static final u0 createCompositionCoroutineScope(@NotNull CoroutineContext coroutineContext, @NotNull Composer composer) {
        c0 c0Var;
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(composer, "composer");
        n2.b bVar = n2.f488b;
        if (coroutineContext.get(bVar) != null) {
            c0 c2 = r2.c(null, 1, null);
            c2.d(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
            c0Var = c2;
        } else {
            CoroutineContext applyCoroutineContext = composer.getApplyCoroutineContext();
            c0Var = applyCoroutineContext.plus(r2.a((n2) applyCoroutineContext.get(bVar))).plus(coroutineContext);
        }
        return v0.a(c0Var);
    }

    @Composable
    @NotNull
    public static final u0 rememberCoroutineScope(@Nullable Function0<? extends CoroutineContext> function0, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-723524056);
        if ((i3 & 1) != 0) {
            function0 = EffectsKt$rememberCoroutineScope$1.INSTANCE;
        }
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new CompositionScopedCoroutineScopeCanceller(createCompositionCoroutineScope(function0.invoke(), composer));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        u0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        return coroutineScope;
    }
}
