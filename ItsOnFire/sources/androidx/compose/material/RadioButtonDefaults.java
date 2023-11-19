package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J3\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/compose/material/RadioButtonDefaults;", "", "()V", "colors", "Landroidx/compose/material/RadioButtonColors;", "selectedColor", "Landroidx/compose/ui/graphics/Color;", "unselectedColor", "disabledColor", "colors-RGew2ao", "(JJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/RadioButtonColors;", "material_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class RadioButtonDefaults {
    public static final int $stable = 0;
    @NotNull
    public static final RadioButtonDefaults INSTANCE = new RadioButtonDefaults();

    private RadioButtonDefaults() {
    }

    @Composable
    @NotNull
    /* renamed from: colors-RGew2ao  reason: not valid java name */
    public final RadioButtonColors m941colorsRGew2ao(long j2, long j3, long j4, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1165740135);
        long m769getSecondary0d7_KjU = (i3 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m769getSecondary0d7_KjU() : j2;
        long m1391copywmQWz5c$default = (i3 & 2) != 0 ? Color.m1391copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m766getOnSurface0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long m1391copywmQWz5c$default2 = (i3 & 4) != 0 ? Color.m1391copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m766getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j4;
        Color m1382boximpl = Color.m1382boximpl(m769getSecondary0d7_KjU);
        Color m1382boximpl2 = Color.m1382boximpl(m1391copywmQWz5c$default);
        Color m1382boximpl3 = Color.m1382boximpl(m1391copywmQWz5c$default2);
        composer.startReplaceableGroup(-3686095);
        boolean changed = composer.changed(m1382boximpl) | composer.changed(m1382boximpl2) | composer.changed(m1382boximpl3);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DefaultRadioButtonColors(m769getSecondary0d7_KjU, m1391copywmQWz5c$default, m1391copywmQWz5c$default2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DefaultRadioButtonColors defaultRadioButtonColors = (DefaultRadioButtonColors) rememberedValue;
        composer.endReplaceableGroup();
        return defaultRadioButtonColors;
    }
}
