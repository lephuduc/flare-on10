package androidx.compose.runtime.internal;

import androidx.appcompat.R;
import androidx.compose.runtime.Composer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "nc", "Landroidx/compose/runtime/Composer;", "<anonymous parameter 1>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ComposableLambdaNImpl$invoke$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ Object[] $args;
    public final /* synthetic */ int $realParams;
    public final /* synthetic */ ComposableLambdaNImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableLambdaNImpl$invoke$1(Object[] objArr, int i2, ComposableLambdaNImpl composableLambdaNImpl) {
        super(2);
        this.$args = objArr;
        this.$realParams = i2;
        this.this$0 = composableLambdaNImpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull Composer nc, int i2) {
        IntRange until;
        List slice;
        IntRange until2;
        List slice2;
        Intrinsics.checkNotNullParameter(nc, "nc");
        Object[] objArr = this.$args;
        until = RangesKt___RangesKt.until(0, this.$realParams);
        slice = ArraysKt___ArraysKt.slice(objArr, until);
        Object[] array = slice.toArray(new Object[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        Object obj = this.$args[this.$realParams + 1];
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
        int intValue = ((Integer) obj).intValue();
        Object[] objArr2 = this.$args;
        until2 = RangesKt___RangesKt.until(this.$realParams + 2, objArr2.length);
        slice2 = ArraysKt___ArraysKt.slice(objArr2, until2);
        Object[] array2 = slice2.toArray(new Object[0]);
        if (array2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        ComposableLambdaNImpl composableLambdaNImpl = this.this$0;
        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
        spreadBuilder.addSpread(array);
        spreadBuilder.add(nc);
        spreadBuilder.add(Integer.valueOf(intValue | 1));
        spreadBuilder.addSpread(array2);
        composableLambdaNImpl.invoke(spreadBuilder.toArray(new Object[spreadBuilder.size()]));
    }
}
