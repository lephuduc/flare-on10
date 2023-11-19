package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u0001j\u0002`\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "Landroidx/compose/runtime/CompositionLocal;", "", "Landroidx/compose/runtime/State;", "Landroidx/compose/runtime/CompositionLocalMap;", "invoke", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ComposerImpl$startProviders$currentProviders$1 extends Lambda implements Function2<Composer, Integer, PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>>> {
    public final /* synthetic */ PersistentMap<CompositionLocal<Object>, State<Object>> $parentScope;
    public final /* synthetic */ ProvidedValue<?>[] $values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ComposerImpl$startProviders$currentProviders$1(ProvidedValue<?>[] providedValueArr, PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap) {
        super(2);
        this.$values = providedValueArr;
        this.$parentScope = persistentMap;
    }

    @Composable
    @NotNull
    public final PersistentMap<CompositionLocal<Object>, State<Object>> invoke(@Nullable Composer composer, int i2) {
        PersistentMap<CompositionLocal<Object>, State<Object>> compositionLocalMapOf;
        composer.startReplaceableGroup(2083456980);
        compositionLocalMapOf = ComposerKt.compositionLocalMapOf(this.$values, this.$parentScope, composer, 8);
        composer.endReplaceableGroup();
        return compositionLocalMapOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> invoke(Composer composer, Integer num) {
        return invoke(composer, num.intValue());
    }
}
