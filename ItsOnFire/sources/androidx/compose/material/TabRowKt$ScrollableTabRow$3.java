package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TabRowKt$ScrollableTabRow$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ long $contentColor;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $divider;
    public final /* synthetic */ float $edgePadding;
    public final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> $indicator;
    public final /* synthetic */ Modifier $modifier;
    public final /* synthetic */ int $selectedTabIndex;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $tabs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TabRowKt$ScrollableTabRow$3(int i2, Modifier modifier, long j2, long j3, float f2, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, int i3, int i4) {
        super(2);
        this.$selectedTabIndex = i2;
        this.$modifier = modifier;
        this.$backgroundColor = j2;
        this.$contentColor = j3;
        this.$edgePadding = f2;
        this.$indicator = function3;
        this.$divider = function2;
        this.$tabs = function22;
        this.$$changed = i3;
        this.$$default = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        TabRowKt.m998ScrollableTabRowsKfQg0A(this.$selectedTabIndex, this.$modifier, this.$backgroundColor, this.$contentColor, this.$edgePadding, this.$indicator, this.$divider, this.$tabs, composer, this.$$changed | 1, this.$$default);
    }
}
