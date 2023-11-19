package androidx.compose.animation;

import androidx.compose.runtime.State;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "S", "it", "invoke", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class AnimatedContentScope$slideOutOfContainer$5 extends Lambda implements Function1<Integer, Integer> {
    public final /* synthetic */ Function1<Integer, Integer> $targetOffset;
    public final /* synthetic */ AnimatedContentScope<S> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnimatedContentScope$slideOutOfContainer$5(AnimatedContentScope<S> animatedContentScope, Function1<? super Integer, Integer> function1) {
        super(1);
        this.this$0 = animatedContentScope;
        this.$targetOffset = function1;
    }

    @NotNull
    public final Integer invoke(int i2) {
        long m9calculateOffsetemnUabE;
        State state = (State) this.this$0.getTargetSizeMap$animation_release().get(this.this$0.getTransition$animation_release().getTargetState());
        IntSize intSize = state == null ? null : (IntSize) state.getValue();
        long m3490getZeroYbymL2g = intSize == null ? IntSize.Companion.m3490getZeroYbymL2g() : intSize.m3489unboximpl();
        Function1<Integer, Integer> function1 = this.$targetOffset;
        m9calculateOffsetemnUabE = this.this$0.m9calculateOffsetemnUabE(IntSizeKt.IntSize(i2, i2), m3490getZeroYbymL2g);
        return function1.invoke(Integer.valueOf((-IntOffset.m3444getYimpl(m9calculateOffsetemnUabE)) + IntSize.m3484getHeightimpl(m3490getZeroYbymL2g)));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
        return invoke(num.intValue());
    }
}
