package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a>\u0010\u0002\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00040\u0003\"\u0004\b\u0000\u0010\u00052\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u0002H\u0005\u0012\u0006\b\u0001\u0012\u00020\u00060\u0003H\u0002\u001aa\u0010\b\u001a\u0002H\u0005\"\b\b\u0000\u0010\u0005*\u00020\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\n\"\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u0002H\u0005\u0012\u0006\b\u0001\u0012\u00020\u00060\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001ag\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\n\"\u0004\u0018\u00010\u00062\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u0002H\u0005\u0012\u0006\b\u0001\u0012\u00020\u00060\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00040\u000fH\u0007¢\u0006\u0002\u0010\u0012\u001a\u0016\u0010\u0013\u001a\u00020\u0014*\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"MaxSupportedRadix", "", "mutableStateSaver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/runtime/MutableState;", "T", "", "inner", "rememberSaveable", "inputs", "", "saver", "key", "", "init", "Lkotlin/Function0;", "([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;", "stateSaver", "([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/MutableState;", "requireCanBeSaved", "", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "value", "runtime-saveable_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class RememberSaveableKt {
    private static final int MaxSupportedRadix = 36;

    private static final <T> Saver<MutableState<T>, MutableState<Object>> mutableStateSaver(Saver<T, ? extends Object> saver) {
        return SaverKt.Saver(new RememberSaveableKt$mutableStateSaver$1$1(saver), new RememberSaveableKt$mutableStateSaver$1$2(saver));
    }

    @Composable
    @NotNull
    public static final <T> MutableState<T> rememberSaveable(@NotNull Object[] inputs, @NotNull Saver<T, ? extends Object> stateSaver, @Nullable String str, @NotNull Function0<? extends MutableState<T>> init, @Nullable Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        Intrinsics.checkNotNullParameter(stateSaver, "stateSaver");
        Intrinsics.checkNotNullParameter(init, "init");
        composer.startReplaceableGroup(1059368946);
        if ((i3 & 4) != 0) {
            str = null;
        }
        MutableState<T> mutableState = (MutableState) m1078rememberSaveable(Arrays.copyOf(inputs, inputs.length), (Saver<Object, ? extends Object>) mutableStateSaver(stateSaver), str, (Function0<? extends Object>) init, composer, (i2 & 896) | 8 | (i2 & 7168), 0);
        composer.endReplaceableGroup();
        return mutableState;
    }

    @Composable
    @NotNull
    /* renamed from: rememberSaveable  reason: collision with other method in class */
    public static final <T> T m1078rememberSaveable(@NotNull Object[] inputs, @Nullable Saver<T, ? extends Object> saver, @Nullable String str, @NotNull Function0<? extends T> init, @Nullable Composer composer, int i2, int i3) {
        Object consumeRestored;
        int checkRadix;
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        Intrinsics.checkNotNullParameter(init, "init");
        composer.startReplaceableGroup(1059366159);
        if ((i3 & 2) != 0) {
            saver = SaverKt.autoSaver();
        }
        if ((i3 & 4) != 0) {
            str = null;
        }
        composer.startReplaceableGroup(1059366416);
        int i4 = 0;
        if (str == null || str.length() == 0) {
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            checkRadix = CharsKt__CharJVMKt.checkRadix(MaxSupportedRadix);
            str = Integer.toString(currentCompositeKeyHash, checkRadix);
            Intrinsics.checkNotNullExpressionValue(str, "toString(this, checkRadix(radix))");
        }
        String str2 = str;
        composer.endReplaceableGroup();
        if (saver != null) {
            SaveableStateRegistry saveableStateRegistry = (SaveableStateRegistry) composer.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry());
            Object[] copyOf = Arrays.copyOf(inputs, inputs.length);
            composer.startReplaceableGroup(-3685570);
            int length = copyOf.length;
            boolean z = false;
            while (i4 < length) {
                Object obj = copyOf[i4];
                i4++;
                z |= composer.changed(obj);
            }
            T t2 = (T) composer.rememberedValue();
            if (z || t2 == Composer.Companion.getEmpty()) {
                t2 = (saveableStateRegistry == null || (consumeRestored = saveableStateRegistry.consumeRestored(str2)) == null) ? null : saver.restore(consumeRestored);
                if (t2 == null) {
                    t2 = init.invoke();
                }
                composer.updateRememberedValue(t2);
            }
            composer.endReplaceableGroup();
            composer.startReplaceableGroup(-3687241);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(saver, null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            MutableState mutableState = (MutableState) rememberedValue;
            mutableState.setValue(saver);
            if (saveableStateRegistry != null) {
                EffectsKt.DisposableEffect(saveableStateRegistry, str2, t2, new RememberSaveableKt$rememberSaveable$1(saveableStateRegistry, str2, mutableState, t2), composer, 0);
            }
            composer.endReplaceableGroup();
            return t2;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requireCanBeSaved(SaveableStateRegistry saveableStateRegistry, Object obj) {
        StringBuilder sb;
        String str;
        String sb2;
        if (obj == null || saveableStateRegistry.canBeSaved(obj)) {
            return;
        }
        if (obj instanceof SnapshotMutableState) {
            SnapshotMutableState snapshotMutableState = (SnapshotMutableState) obj;
            if (snapshotMutableState.getPolicy() != SnapshotStateKt.neverEqualPolicy() && snapshotMutableState.getPolicy() != SnapshotStateKt.structuralEqualityPolicy() && snapshotMutableState.getPolicy() != SnapshotStateKt.referentialEqualityPolicy()) {
                sb2 = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                throw new IllegalArgumentException(sb2);
            }
            sb = new StringBuilder();
            sb.append("MutableState containing ");
            sb.append(snapshotMutableState.getValue());
            str = " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
        } else {
            sb = new StringBuilder();
            sb.append(obj);
            str = " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
        }
        sb.append(str);
        sb2 = sb.toString();
        throw new IllegalArgumentException(sb2);
    }
}
