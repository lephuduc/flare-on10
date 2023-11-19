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
public final class VectorComposeKt$Group$2$6 extends Lambda implements Function2<GroupComponent, Float, Unit> {
    public static final VectorComposeKt$Group$2$6 INSTANCE = new VectorComposeKt$Group$2$6();

    public VectorComposeKt$Group$2$6() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2) {
        invoke(groupComponent, f2.floatValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull GroupComponent set, float f2) {
        Intrinsics.checkNotNullParameter(set, "$this$set");
        set.setScaleY(f2);
    }
}
