package androidx.compose.runtime.internal;

import androidx.appcompat.R;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "nc", "Landroidx/compose/runtime/Composer;", "<anonymous parameter 1>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ComposableLambdaImpl$invoke$17 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $changed;
    public final /* synthetic */ int $changed1;
    public final /* synthetic */ Object $p1;
    public final /* synthetic */ Object $p10;
    public final /* synthetic */ Object $p11;
    public final /* synthetic */ Object $p12;
    public final /* synthetic */ Object $p13;
    public final /* synthetic */ Object $p14;
    public final /* synthetic */ Object $p15;
    public final /* synthetic */ Object $p16;
    public final /* synthetic */ Object $p17;
    public final /* synthetic */ Object $p2;
    public final /* synthetic */ Object $p3;
    public final /* synthetic */ Object $p4;
    public final /* synthetic */ Object $p5;
    public final /* synthetic */ Object $p6;
    public final /* synthetic */ Object $p7;
    public final /* synthetic */ Object $p8;
    public final /* synthetic */ Object $p9;
    public final /* synthetic */ ComposableLambdaImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableLambdaImpl$invoke$17(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, int i2, int i3) {
        super(2);
        this.this$0 = composableLambdaImpl;
        this.$p1 = obj;
        this.$p2 = obj2;
        this.$p3 = obj3;
        this.$p4 = obj4;
        this.$p5 = obj5;
        this.$p6 = obj6;
        this.$p7 = obj7;
        this.$p8 = obj8;
        this.$p9 = obj9;
        this.$p10 = obj10;
        this.$p11 = obj11;
        this.$p12 = obj12;
        this.$p13 = obj13;
        this.$p14 = obj14;
        this.$p15 = obj15;
        this.$p16 = obj16;
        this.$p17 = obj17;
        this.$changed = i2;
        this.$changed1 = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull Composer nc, int i2) {
        Intrinsics.checkNotNullParameter(nc, "nc");
        this.this$0.invoke(this.$p1, this.$p2, this.$p3, this.$p4, this.$p5, this.$p6, this.$p7, this.$p8, this.$p9, this.$p10, this.$p11, this.$p12, this.$p13, this.$p14, this.$p15, this.$p16, this.$p17, nc, this.$changed | 1, this.$changed1);
    }
}
