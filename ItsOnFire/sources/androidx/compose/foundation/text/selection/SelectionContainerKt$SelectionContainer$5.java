package androidx.compose.foundation.text.selection;

import androidx.appcompat.R;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SelectionContainerKt$SelectionContainer$5 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $children;
    public final /* synthetic */ Modifier $modifier;
    public final /* synthetic */ Function1<Selection, Unit> $onSelectionChange;
    public final /* synthetic */ Selection $selection;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SelectionContainerKt$SelectionContainer$5(Modifier modifier, Selection selection, Function1<? super Selection, Unit> function1, Function2<? super Composer, ? super Integer, Unit> function2, int i2, int i3) {
        super(2);
        this.$modifier = modifier;
        this.$selection = selection;
        this.$onSelectionChange = function1;
        this.$children = function2;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        SelectionContainerKt.SelectionContainer(this.$modifier, this.$selection, this.$onSelectionChange, this.$children, composer, this.$$changed | 1, this.$$default);
    }
}
