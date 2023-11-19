package androidx.compose.animation;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "S", "it", "invoke", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class AnimatedContentScope$slideIntoContainer$4 extends Lambda implements Function1<Integer, Integer> {
    public final /* synthetic */ Function1<Integer, Integer> $initialOffset;
    public final /* synthetic */ AnimatedContentScope<S> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnimatedContentScope$slideIntoContainer$4(Function1<? super Integer, Integer> function1, AnimatedContentScope<S> animatedContentScope) {
        super(1);
        this.$initialOffset = function1;
        this.this$0 = animatedContentScope;
    }

    @NotNull
    public final Integer invoke(int i2) {
        long m12getCurrentSizeYbymL2g;
        long m12getCurrentSizeYbymL2g2;
        long m9calculateOffsetemnUabE;
        Function1<Integer, Integer> function1 = this.$initialOffset;
        m12getCurrentSizeYbymL2g = this.this$0.m12getCurrentSizeYbymL2g();
        int m3484getHeightimpl = IntSize.m3484getHeightimpl(m12getCurrentSizeYbymL2g);
        AnimatedContentScope<S> animatedContentScope = this.this$0;
        long IntSize = IntSizeKt.IntSize(i2, i2);
        m12getCurrentSizeYbymL2g2 = this.this$0.m12getCurrentSizeYbymL2g();
        m9calculateOffsetemnUabE = animatedContentScope.m9calculateOffsetemnUabE(IntSize, m12getCurrentSizeYbymL2g2);
        return function1.invoke(Integer.valueOf(m3484getHeightimpl - IntOffset.m3444getYimpl(m9calculateOffsetemnUabE)));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
        return invoke(num.intValue());
    }
}
