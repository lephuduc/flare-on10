package androidx.compose.ui.platform;

import androidx.appcompat.R;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ComposableSingletons$Wrapper_androidKt {
    @NotNull
    public static final ComposableSingletons$Wrapper_androidKt INSTANCE = new ComposableSingletons$Wrapper_androidKt();
    @NotNull

    /* renamed from: lambda-1  reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f19lambda1 = ComposableLambdaKt.composableLambdaInstance(-985537551, false, ComposableSingletons$Wrapper_androidKt$lambda1$1.INSTANCE);

    @NotNull
    /* renamed from: getLambda-1$ui_release  reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m2927getLambda1$ui_release() {
        return f19lambda1;
    }
}
