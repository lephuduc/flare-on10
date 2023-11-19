package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationVector2D;", "it", "Landroidx/compose/ui/geometry/Offset;", "invoke-k-4lQ0M", "(J)Landroidx/compose/animation/core/AnimationVector2D;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TextFieldMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1 extends Lambda implements Function1<Offset, AnimationVector2D> {
    public static final TextFieldMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1 INSTANCE = new TextFieldMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1();

    public TextFieldMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ AnimationVector2D invoke(Offset offset) {
        return m598invokek4lQ0M(offset.m1171unboximpl());
    }

    @NotNull
    /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
    public final AnimationVector2D m598invokek4lQ0M(long j2) {
        AnimationVector2D animationVector2D;
        if (OffsetKt.m1180isSpecifiedk4lQ0M(j2)) {
            return new AnimationVector2D(Offset.m1161getXimpl(j2), Offset.m1162getYimpl(j2));
        }
        animationVector2D = TextFieldMagnifierKt.UnspecifiedAnimationVector2D;
        return animationVector2D;
    }
}
