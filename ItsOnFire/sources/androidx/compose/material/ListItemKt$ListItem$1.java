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
public final class ListItemKt$ListItem$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $icon;
    public final /* synthetic */ Modifier $modifier;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $overlineText;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $secondaryText;
    public final /* synthetic */ boolean $singleLineSecondaryText;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $text;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $trailing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ListItemKt$ListItem$1(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, boolean z, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, int i2, int i3) {
        super(2);
        this.$modifier = modifier;
        this.$icon = function2;
        this.$secondaryText = function22;
        this.$singleLineSecondaryText = z;
        this.$overlineText = function23;
        this.$trailing = function24;
        this.$text = function25;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        ListItemKt.ListItem(this.$modifier, this.$icon, this.$secondaryText, this.$singleLineSecondaryText, this.$overlineText, this.$trailing, this.$text, composer, this.$$changed | 1, this.$$default);
    }
}
