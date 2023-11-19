package androidx.compose.ui.platform;

import androidx.appcompat.R;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $content;
    public final /* synthetic */ AndroidComposeView $owner;
    public final /* synthetic */ AndroidUriHandler $uriHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$3(AndroidComposeView androidComposeView, AndroidUriHandler androidUriHandler, Function2<? super Composer, ? super Integer, Unit> function2, int i2) {
        super(2);
        this.$owner = androidComposeView;
        this.$uriHandler = androidUriHandler;
        this.$content = function2;
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
        } else {
            CompositionLocalsKt.ProvideCommonCompositionLocals(this.$owner, this.$uriHandler, this.$content, composer, ((this.$$dirty << 3) & 896) | 72);
        }
    }
}
