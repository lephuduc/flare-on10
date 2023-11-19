package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SwipeableKt$rememberSwipeableStateFor$swipeableState$1$1 extends Lambda implements Function1<T, Boolean> {
    public static final SwipeableKt$rememberSwipeableStateFor$swipeableState$1$1 INSTANCE = new SwipeableKt$rememberSwipeableStateFor$swipeableState$1$1();

    public SwipeableKt$rememberSwipeableStateFor$swipeableState$1$1() {
        super(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull T it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.TRUE;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
        return invoke((SwipeableKt$rememberSwipeableStateFor$swipeableState$1$1) obj);
    }
}
