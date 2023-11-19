package androidx.compose.ui.layout;

import androidx.appcompat.R;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TestModifierUpdaterKt$TestModifierUpdaterLayout$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ Function1<TestModifierUpdater, Unit> $onAttached;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TestModifierUpdaterKt$TestModifierUpdaterLayout$2(Function1<? super TestModifierUpdater, Unit> function1, int i2) {
        super(2);
        this.$onAttached = function1;
        this.$$changed = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        TestModifierUpdaterKt.TestModifierUpdaterLayout(this.$onAttached, composer, this.$$changed | 1);
    }
}
