package androidx.compose.material;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TabKt$TabTransition$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ long $activeColor;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $content;
    public final /* synthetic */ long $inactiveColor;
    public final /* synthetic */ boolean $selected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TabKt$TabTransition$1(long j2, long j3, boolean z, Function2<? super Composer, ? super Integer, Unit> function2, int i2) {
        super(2);
        this.$activeColor = j2;
        this.$inactiveColor = j3;
        this.$selected = z;
        this.$content = function2;
        this.$$changed = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        TabKt.m985TabTransitionKlgxPg(this.$activeColor, this.$inactiveColor, this.$selected, this.$content, composer, this.$$changed | 1);
    }
}
