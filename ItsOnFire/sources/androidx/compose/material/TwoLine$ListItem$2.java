package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TwoLine$ListItem$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $icon;
    public final /* synthetic */ Modifier $modifier;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $overlineText;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $secondaryText;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $text;
    public final /* synthetic */ TwoLine $tmp0_rcvr;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $trailing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TwoLine$ListItem$2(TwoLine twoLine, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, int i2, int i3) {
        super(2);
        this.$tmp0_rcvr = twoLine;
        this.$modifier = modifier;
        this.$icon = function2;
        this.$text = function22;
        this.$secondaryText = function23;
        this.$overlineText = function24;
        this.$trailing = function25;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        this.$tmp0_rcvr.ListItem(this.$modifier, this.$icon, this.$text, this.$secondaryText, this.$overlineText, this.$trailing, composer, this.$$changed | 1, this.$$default);
    }
}
