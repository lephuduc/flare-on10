package androidx.compose.runtime.saveable;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class RememberSaveableKt$rememberSaveable$1$valueProvider$1 extends Lambda implements Function0<Object> {
    public final /* synthetic */ SaveableStateRegistry $registry;
    public final /* synthetic */ MutableState<Saver<T, Object>> $saverHolder;
    public final /* synthetic */ T $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberSaveableKt$rememberSaveable$1$valueProvider$1(MutableState<Saver<T, Object>> mutableState, T t2, SaveableStateRegistry saveableStateRegistry) {
        super(0);
        this.$saverHolder = mutableState;
        this.$value = t2;
        this.$registry = saveableStateRegistry;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Object invoke() {
        Object value = this.$saverHolder.getValue();
        T t2 = this.$value;
        final SaveableStateRegistry saveableStateRegistry = this.$registry;
        return ((Saver) value).save(new SaverScope() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$rememberSaveable$1$valueProvider$1$1$1
            @Override // androidx.compose.runtime.saveable.SaverScope
            public final boolean canBeSaved(@NotNull Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return SaveableStateRegistry.this.canBeSaved(it);
            }
        }, t2);
    }
}
