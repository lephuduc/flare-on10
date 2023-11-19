package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class AndroidAlertDialog_androidKt$AlertDialog$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $buttons;
    public final /* synthetic */ long $contentColor;
    public final /* synthetic */ Modifier $modifier;
    public final /* synthetic */ Shape $shape;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $text;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidAlertDialog_androidKt$AlertDialog$3(Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, long j2, long j3, int i2) {
        super(2);
        this.$buttons = function2;
        this.$modifier = modifier;
        this.$title = function22;
        this.$text = function23;
        this.$shape = shape;
        this.$backgroundColor = j2;
        this.$contentColor = j3;
        this.$$dirty = i2;
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
        Function2<Composer, Integer, Unit> function2 = this.$buttons;
        Modifier modifier = this.$modifier;
        Function2<Composer, Integer, Unit> function22 = this.$title;
        Function2<Composer, Integer, Unit> function23 = this.$text;
        Shape shape = this.$shape;
        long j2 = this.$backgroundColor;
        long j3 = this.$contentColor;
        int i3 = this.$$dirty;
        AlertDialogKt.m682AlertDialogContentWMdw5o4(function2, modifier, function22, function23, shape, j2, j3, composer, ((i3 >> 3) & 14) | ((i3 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i3 >> 3) & 896) | ((i3 >> 3) & 7168) | (57344 & (i3 >> 3)) | (458752 & (i3 >> 3)) | ((i3 >> 3) & 3670016), 0);
    }
}
