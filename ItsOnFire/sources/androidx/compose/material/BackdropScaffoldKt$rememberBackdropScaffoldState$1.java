package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class BackdropScaffoldKt$rememberBackdropScaffoldState$1 extends Lambda implements Function1<BackdropValue, Boolean> {
    public static final BackdropScaffoldKt$rememberBackdropScaffoldState$1 INSTANCE = new BackdropScaffoldKt$rememberBackdropScaffoldState$1();

    public BackdropScaffoldKt$rememberBackdropScaffoldState$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull BackdropValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.TRUE;
    }
}
