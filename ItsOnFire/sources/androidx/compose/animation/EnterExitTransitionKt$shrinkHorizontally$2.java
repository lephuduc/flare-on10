package androidx.compose.animation;

import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntSize;", "it", "invoke-mzRDjE0", "(J)J"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class EnterExitTransitionKt$shrinkHorizontally$2 extends Lambda implements Function1<IntSize, IntSize> {
    public final /* synthetic */ Function1<Integer, Integer> $targetWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EnterExitTransitionKt$shrinkHorizontally$2(Function1<? super Integer, Integer> function1) {
        super(1);
        this.$targetWidth = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
        return IntSize.m3477boximpl(m62invokemzRDjE0(intSize.m3489unboximpl()));
    }

    /* renamed from: invoke-mzRDjE0  reason: not valid java name */
    public final long m62invokemzRDjE0(long j2) {
        return IntSizeKt.IntSize(this.$targetWidth.invoke(Integer.valueOf(IntSize.m3485getWidthimpl(j2))).intValue(), IntSize.m3484getHeightimpl(j2));
    }
}
