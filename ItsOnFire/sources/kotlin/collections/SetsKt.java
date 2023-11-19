package kotlin.collections;

import androidx.appcompat.R;
import java.util.Set;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"kotlin/collections/SetsKt__SetsJVMKt", "kotlin/collections/SetsKt__SetsKt", "kotlin/collections/SetsKt___SetsKt"}, k = 4, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkedTextViewStyle)
/* loaded from: classes.dex */
public final class SetsKt extends SetsKt___SetsKt {
    private SetsKt() {
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @NotNull
    public static /* bridge */ /* synthetic */ Set build(@NotNull Set set) {
        return SetsKt__SetsJVMKt.build(set);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @NotNull
    public static /* bridge */ /* synthetic */ Set createSetBuilder(int i2) {
        return SetsKt__SetsJVMKt.createSetBuilder(i2);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ Set emptySet() {
        return SetsKt__SetsKt.emptySet();
    }

    @NotNull
    public static /* bridge */ /* synthetic */ Set setOf(Object obj) {
        return SetsKt__SetsJVMKt.setOf(obj);
    }
}
