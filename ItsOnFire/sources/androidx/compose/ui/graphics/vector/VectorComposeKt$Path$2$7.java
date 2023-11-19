package androidx.compose.ui.graphics.vector;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class VectorComposeKt$Path$2$7 extends Lambda implements Function2<PathComponent, Float, Unit> {
    public static final VectorComposeKt$Path$2$7 INSTANCE = new VectorComposeKt$Path$2$7();

    public VectorComposeKt$Path$2$7() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f2) {
        invoke(pathComponent, f2.floatValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull PathComponent set, float f2) {
        Intrinsics.checkNotNullParameter(set, "$this$set");
        set.setStrokeAlpha(f2);
    }
}
