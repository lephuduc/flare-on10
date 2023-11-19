package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JG\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/material/CheckboxDefaults;", "", "()V", "colors", "Landroidx/compose/material/CheckboxColors;", "checkedColor", "Landroidx/compose/ui/graphics/Color;", "uncheckedColor", "checkmarkColor", "disabledColor", "disabledIndeterminateColor", "colors-zjMxDiM", "(JJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/CheckboxColors;", "material_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class CheckboxDefaults {
    public static final int $stable = 0;
    @NotNull
    public static final CheckboxDefaults INSTANCE = new CheckboxDefaults();

    private CheckboxDefaults() {
    }

    @Composable
    @NotNull
    /* renamed from: colors-zjMxDiM  reason: not valid java name */
    public final CheckboxColors m743colorszjMxDiM(long j2, long j3, long j4, long j5, long j6, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-533071488);
        long m769getSecondary0d7_KjU = (i3 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m769getSecondary0d7_KjU() : j2;
        long m1391copywmQWz5c$default = (i3 & 2) != 0 ? Color.m1391copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m766getOnSurface0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long m771getSurface0d7_KjU = (i3 & 4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m771getSurface0d7_KjU() : j4;
        long m1391copywmQWz5c$default2 = (i3 & 8) != 0 ? Color.m1391copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m766getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j5;
        long m1391copywmQWz5c$default3 = (i3 & 16) != 0 ? Color.m1391copywmQWz5c$default(m769getSecondary0d7_KjU, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j6;
        int i4 = 0;
        Object[] objArr = {Color.m1382boximpl(m769getSecondary0d7_KjU), Color.m1382boximpl(m1391copywmQWz5c$default), Color.m1382boximpl(m771getSurface0d7_KjU), Color.m1382boximpl(m1391copywmQWz5c$default2), Color.m1382boximpl(m1391copywmQWz5c$default3)};
        composer.startReplaceableGroup(-3685570);
        boolean z = false;
        while (i4 < 5) {
            Object obj = objArr[i4];
            i4++;
            z |= composer.changed(obj);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DefaultCheckboxColors(m771getSurface0d7_KjU, Color.m1391copywmQWz5c$default(m771getSurface0d7_KjU, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), m769getSecondary0d7_KjU, Color.m1391copywmQWz5c$default(m769getSecondary0d7_KjU, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), m1391copywmQWz5c$default2, Color.m1391copywmQWz5c$default(m1391copywmQWz5c$default2, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), m1391copywmQWz5c$default3, m769getSecondary0d7_KjU, m1391copywmQWz5c$default, m1391copywmQWz5c$default2, m1391copywmQWz5c$default3, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DefaultCheckboxColors defaultCheckboxColors = (DefaultCheckboxColors) rememberedValue;
        composer.endReplaceableGroup();
        return defaultCheckboxColors;
    }
}
