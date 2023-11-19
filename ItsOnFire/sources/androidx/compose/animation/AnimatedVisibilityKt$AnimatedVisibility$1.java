package androidx.compose.animation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class AnimatedVisibilityKt$AnimatedVisibility$1 extends Lambda implements Function1<Boolean, Boolean> {
    public static final AnimatedVisibilityKt$AnimatedVisibility$1 INSTANCE = new AnimatedVisibilityKt$AnimatedVisibility$1();

    public AnimatedVisibilityKt$AnimatedVisibility$1() {
        super(1);
    }

    @NotNull
    public final Boolean invoke(boolean z) {
        return Boolean.valueOf(z);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
        return invoke(bool.booleanValue());
    }
}
