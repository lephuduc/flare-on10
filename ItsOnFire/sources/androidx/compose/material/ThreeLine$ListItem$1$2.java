package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ThreeLine$ListItem$1$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $overlineText;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $secondaryText;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ThreeLine$ListItem$1$2(Function2<? super Composer, ? super Integer, Unit> function2, int i2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23) {
        super(2);
        this.$overlineText = function2;
        this.$$dirty = i2;
        this.$text = function22;
        this.$secondaryText = function23;
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
        composer.startReplaceableGroup(-755940677);
        Function2<Composer, Integer, Unit> function2 = this.$overlineText;
        if (function2 != null) {
            function2.invoke(composer, Integer.valueOf((this.$$dirty >> 12) & 14));
        }
        composer.endReplaceableGroup();
        this.$text.invoke(composer, Integer.valueOf((this.$$dirty >> 6) & 14));
        this.$secondaryText.invoke(composer, Integer.valueOf((this.$$dirty >> 9) & 14));
    }
}
