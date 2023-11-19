package androidx.compose.runtime;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ComposableSingletons$CompositionKt {
    @NotNull
    public static final ComposableSingletons$CompositionKt INSTANCE = new ComposableSingletons$CompositionKt();
    @NotNull

    /* renamed from: lambda-1  reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f15lambda1 = ComposableLambdaKt.composableLambdaInstance(-985543095, false, ComposableSingletons$CompositionKt$lambda1$1.INSTANCE);
    @NotNull

    /* renamed from: lambda-2  reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f16lambda2 = ComposableLambdaKt.composableLambdaInstance(-985548681, false, ComposableSingletons$CompositionKt$lambda2$1.INSTANCE);

    @NotNull
    /* renamed from: getLambda-1$runtime_release  reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m1053getLambda1$runtime_release() {
        return f15lambda1;
    }

    @NotNull
    /* renamed from: getLambda-2$runtime_release  reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m1054getLambda2$runtime_release() {
        return f16lambda2;
    }
}
