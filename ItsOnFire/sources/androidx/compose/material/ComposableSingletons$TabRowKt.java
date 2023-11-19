package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ComposableSingletons$TabRowKt {
    @NotNull
    public static final ComposableSingletons$TabRowKt INSTANCE = new ComposableSingletons$TabRowKt();
    @NotNull

    /* renamed from: lambda-1  reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f12lambda1 = ComposableLambdaKt.composableLambdaInstance(-985535993, false, ComposableSingletons$TabRowKt$lambda1$1.INSTANCE);
    @NotNull

    /* renamed from: lambda-2  reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f13lambda2 = ComposableLambdaKt.composableLambdaInstance(-985539575, false, ComposableSingletons$TabRowKt$lambda2$1.INSTANCE);

    @NotNull
    /* renamed from: getLambda-1$material_release  reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m798getLambda1$material_release() {
        return f12lambda1;
    }

    @NotNull
    /* renamed from: getLambda-2$material_release  reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m799getLambda2$material_release() {
        return f13lambda2;
    }
}
