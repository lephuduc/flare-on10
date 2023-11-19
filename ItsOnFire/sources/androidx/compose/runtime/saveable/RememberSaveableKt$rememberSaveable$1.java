package androidx.compose.runtime.saveable;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class RememberSaveableKt$rememberSaveable$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
    public final /* synthetic */ String $finalKey;
    public final /* synthetic */ SaveableStateRegistry $registry;
    public final /* synthetic */ MutableState<Saver<T, Object>> $saverHolder;
    public final /* synthetic */ T $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberSaveableKt$rememberSaveable$1(SaveableStateRegistry saveableStateRegistry, String str, MutableState<Saver<T, Object>> mutableState, T t2) {
        super(1);
        this.$registry = saveableStateRegistry;
        this.$finalKey = str;
        this.$saverHolder = mutableState;
        this.$value = t2;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        RememberSaveableKt$rememberSaveable$1$valueProvider$1 rememberSaveableKt$rememberSaveable$1$valueProvider$1 = new RememberSaveableKt$rememberSaveable$1$valueProvider$1(this.$saverHolder, this.$value, this.$registry);
        RememberSaveableKt.requireCanBeSaved(this.$registry, rememberSaveableKt$rememberSaveable$1$valueProvider$1.invoke());
        final SaveableStateRegistry.Entry registerProvider = this.$registry.registerProvider(this.$finalKey, rememberSaveableKt$rememberSaveable$1$valueProvider$1);
        return new DisposableEffectResult() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$rememberSaveable$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                SaveableStateRegistry.Entry.this.unregister();
            }
        };
    }
}
