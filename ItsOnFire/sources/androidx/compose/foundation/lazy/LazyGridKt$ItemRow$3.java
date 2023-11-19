package androidx.compose.foundation.lazy;

import androidx.appcompat.R;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LazyGridKt$ItemRow$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;
    public final /* synthetic */ int $nColumns;
    public final /* synthetic */ List<Pair<Function2<Composer, Integer, Unit>, Integer>> $rowContent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridKt$ItemRow$3(int i2, Arrangement.Horizontal horizontal, List<? extends Pair<? extends Function2<? super Composer, ? super Integer, Unit>, Integer>> list, int i3) {
        super(2);
        this.$nColumns = i2;
        this.$horizontalArrangement = horizontal;
        this.$rowContent = list;
        this.$$changed = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        LazyGridKt.ItemRow(this.$nColumns, this.$horizontalArrangement, this.$rowContent, composer, this.$$changed | 1);
    }
}
