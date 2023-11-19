package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TextFieldImplKt$TextFieldImpl$labelColor$1 extends Lambda implements Function3<InputPhase, Composer, Integer, Color> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ int $$dirty1;
    public final /* synthetic */ TextFieldColors $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ MutableInteractionSource $interactionSource;
    public final /* synthetic */ boolean $isError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$TextFieldImpl$labelColor$1(TextFieldColors textFieldColors, boolean z, boolean z2, MutableInteractionSource mutableInteractionSource, int i2, int i3) {
        super(3);
        this.$colors = textFieldColors;
        this.$enabled = z;
        this.$isError = z2;
        this.$interactionSource = mutableInteractionSource;
        this.$$dirty = i2;
        this.$$dirty1 = i3;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Color invoke(InputPhase inputPhase, Composer composer, Integer num) {
        return Color.m1382boximpl(m1008invokeXeAY9LY(inputPhase, composer, num.intValue()));
    }

    @Composable
    /* renamed from: invoke-XeAY9LY  reason: not valid java name */
    public final long m1008invokeXeAY9LY(@NotNull InputPhase it, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(it, "it");
        composer.startReplaceableGroup(-1061048422);
        TextFieldColors textFieldColors = this.$colors;
        boolean z = this.$enabled;
        boolean z2 = it == InputPhase.UnfocusedEmpty ? false : this.$isError;
        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
        int i3 = this.$$dirty1;
        long m1402unboximpl = textFieldColors.labelColor(z, z2, mutableInteractionSource, composer, ((this.$$dirty >> 3) & 14) | ((i3 >> 15) & 896) | ((i3 >> 18) & 7168)).getValue().m1402unboximpl();
        composer.endReplaceableGroup();
        return m1402unboximpl;
    }
}
