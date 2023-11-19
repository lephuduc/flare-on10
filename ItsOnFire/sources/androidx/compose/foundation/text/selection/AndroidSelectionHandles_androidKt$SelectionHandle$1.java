package androidx.compose.foundation.text.selection;

import androidx.appcompat.R;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class AndroidSelectionHandles_androidKt$SelectionHandle$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $content;
    public final /* synthetic */ ResolvedTextDirection $direction;
    public final /* synthetic */ boolean $handlesCrossed;
    public final /* synthetic */ boolean $isStartHandle;
    public final /* synthetic */ Modifier $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidSelectionHandles_androidKt$SelectionHandle$1(Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z, ResolvedTextDirection resolvedTextDirection, boolean z2, int i2) {
        super(2);
        this.$content = function2;
        this.$modifier = modifier;
        this.$isStartHandle = z;
        this.$direction = resolvedTextDirection;
        this.$handlesCrossed = z2;
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
        if (this.$content == null) {
            composer.startReplaceableGroup(386443455);
            Modifier modifier = this.$modifier;
            boolean z = this.$isStartHandle;
            ResolvedTextDirection resolvedTextDirection = this.$direction;
            boolean z2 = this.$handlesCrossed;
            int i3 = this.$$dirty;
            AndroidSelectionHandles_androidKt.DefaultSelectionHandle(modifier, z, resolvedTextDirection, z2, composer, ((i3 >> 12) & 14) | (i3 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i3 & 896) | (i3 & 7168));
        } else {
            composer.startReplaceableGroup(386443693);
            this.$content.invoke(composer, Integer.valueOf((this.$$dirty >> 15) & 14));
        }
        composer.endReplaceableGroup();
    }
}
