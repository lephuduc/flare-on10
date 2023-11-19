package androidx.compose.ui.viewinterop;

import android.content.Context;
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
public final class AndroidView_androidKt$AndroidView$4 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ Function1<Context, T> $factory;
    public final /* synthetic */ Modifier $modifier;
    public final /* synthetic */ Function1<T, Unit> $update;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidView_androidKt$AndroidView$4(Function1<? super Context, ? extends T> function1, Modifier modifier, Function1<? super T, Unit> function12, int i2, int i3) {
        super(2);
        this.$factory = function1;
        this.$modifier = modifier;
        this.$update = function12;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        AndroidView_androidKt.AndroidView(this.$factory, this.$modifier, this.$update, composer, this.$$changed | 1, this.$$default);
    }
}
