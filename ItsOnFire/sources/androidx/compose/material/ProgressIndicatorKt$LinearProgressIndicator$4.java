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
public final class ProgressIndicatorKt$LinearProgressIndicator$4 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ long $color;
    public final /* synthetic */ Modifier $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$LinearProgressIndicator$4(Modifier modifier, long j2, long j3, int i2, int i3) {
        super(2);
        this.$modifier = modifier;
        this.$color = j2;
        this.$backgroundColor = j3;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        ProgressIndicatorKt.m918LinearProgressIndicatorRIQooxk(this.$modifier, this.$color, this.$backgroundColor, composer, this.$$changed | 1, this.$$default);
    }
}
