package androidx.compose.material;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ComposableSingletons$AppBarKt {
    @NotNull
    public static final ComposableSingletons$AppBarKt INSTANCE = new ComposableSingletons$AppBarKt();
    @NotNull

    /* renamed from: lambda-1  reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f4lambda1 = ComposableLambdaKt.composableLambdaInstance(-985530804, false, ComposableSingletons$AppBarKt$lambda1$1.INSTANCE);

    @NotNull
    /* renamed from: getLambda-1$material_release  reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m790getLambda1$material_release() {
        return f4lambda1;
    }
}
