package androidx.compose.material;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $content;
    public final /* synthetic */ boolean $expanded;
    public final /* synthetic */ Modifier $modifier;
    public final /* synthetic */ Function0<Unit> $onDismissRequest;
    public final /* synthetic */ ExposedDropdownMenuBoxScope $tmp0_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, boolean z, Function0<Unit> function0, Modifier modifier, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i2, int i3) {
        super(2);
        this.$tmp0_rcvr = exposedDropdownMenuBoxScope;
        this.$expanded = z;
        this.$onDismissRequest = function0;
        this.$modifier = modifier;
        this.$content = function3;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        this.$tmp0_rcvr.ExposedDropdownMenu(this.$expanded, this.$onDismissRequest, this.$modifier, this.$content, composer, this.$$changed | 1, this.$$default);
    }
}
