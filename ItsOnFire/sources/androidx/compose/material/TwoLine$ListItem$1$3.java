package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TwoLine$ListItem$1$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $secondaryText;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TwoLine$ListItem$1$3(Function2<? super Composer, ? super Integer, Unit> function2, int i2, Function2<? super Composer, ? super Integer, Unit> function22) {
        super(2);
        this.$text = function2;
        this.$$dirty = i2;
        this.$secondaryText = function22;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    @Composable
    public final void invoke(@Nullable Composer composer, int i2) {
        if (((i2 & 11) ^ 2) == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        this.$text.invoke(composer, Integer.valueOf((this.$$dirty >> 6) & 14));
        Function2<Composer, Integer, Unit> function2 = this.$secondaryText;
        Intrinsics.checkNotNull(function2);
        function2.invoke(composer, 0);
    }
}
