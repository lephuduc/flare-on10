package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Offset;", "it", "Landroidx/compose/animation/core/AnimationVector2D;", "invoke-tuRUvjQ", "(Landroidx/compose/animation/core/AnimationVector2D;)J"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TextFieldMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2 extends Lambda implements Function1<AnimationVector2D, Offset> {
    public static final TextFieldMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2 INSTANCE = new TextFieldMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2();

    public TextFieldMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Offset invoke(AnimationVector2D animationVector2D) {
        return Offset.m1150boximpl(m599invoketuRUvjQ(animationVector2D));
    }

    /* renamed from: invoke-tuRUvjQ  reason: not valid java name */
    public final long m599invoketuRUvjQ(@NotNull AnimationVector2D it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return OffsetKt.Offset(it.getV1(), it.getV2());
    }
}
