package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jy\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/material/SwitchDefaults;", "", "()V", "colors", "Landroidx/compose/material/SwitchColors;", "checkedThumbColor", "Landroidx/compose/ui/graphics/Color;", "checkedTrackColor", "checkedTrackAlpha", "", "uncheckedThumbColor", "uncheckedTrackColor", "uncheckedTrackAlpha", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "colors-SQMK_m0", "(JJFJJFJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material/SwitchColors;", "material_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SwitchDefaults {
    public static final int $stable = 0;
    @NotNull
    public static final SwitchDefaults INSTANCE = new SwitchDefaults();

    private SwitchDefaults() {
    }

    @Composable
    @NotNull
    /* renamed from: colors-SQMK_m0  reason: not valid java name */
    public final SwitchColors m975colorsSQMK_m0(long j2, long j3, float f2, long j4, long j5, float f3, long j6, long j7, long j8, long j9, @Nullable Composer composer, int i2, int i3, int i4) {
        long j10;
        long j11;
        float f4;
        long j12;
        long j13;
        int i5;
        long j14;
        composer.startReplaceableGroup(-1592206455);
        long m770getSecondaryVariant0d7_KjU = (i4 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m770getSecondaryVariant0d7_KjU() : j2;
        long j15 = (i4 & 2) != 0 ? m770getSecondaryVariant0d7_KjU : j3;
        float f5 = (i4 & 4) != 0 ? 0.54f : f2;
        long m771getSurface0d7_KjU = (i4 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m771getSurface0d7_KjU() : j4;
        long m766getOnSurface0d7_KjU = (i4 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m766getOnSurface0d7_KjU() : j5;
        float f6 = (i4 & 32) != 0 ? 0.38f : f3;
        if ((i4 & 64) != 0) {
            j10 = m770getSecondaryVariant0d7_KjU;
            j11 = ColorKt.m1438compositeOverOWjLjI(Color.m1391copywmQWz5c$default(m770getSecondaryVariant0d7_KjU, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m771getSurface0d7_KjU());
        } else {
            j10 = m770getSecondaryVariant0d7_KjU;
            j11 = j6;
        }
        if ((i4 & 128) != 0) {
            f4 = f6;
            j12 = ColorKt.m1438compositeOverOWjLjI(Color.m1391copywmQWz5c$default(j15, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m771getSurface0d7_KjU());
        } else {
            f4 = f6;
            j12 = j7;
        }
        if ((i4 & 256) != 0) {
            j13 = j11;
            i5 = 6;
            j14 = ColorKt.m1438compositeOverOWjLjI(Color.m1391copywmQWz5c$default(m771getSurface0d7_KjU, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m771getSurface0d7_KjU());
        } else {
            j13 = j11;
            i5 = 6;
            j14 = j8;
        }
        DefaultSwitchColors defaultSwitchColors = new DefaultSwitchColors(j10, Color.m1391copywmQWz5c$default(j15, f5, 0.0f, 0.0f, 0.0f, 14, null), m771getSurface0d7_KjU, Color.m1391copywmQWz5c$default(m766getOnSurface0d7_KjU, f4, 0.0f, 0.0f, 0.0f, 14, null), j13, Color.m1391copywmQWz5c$default(j12, f5, 0.0f, 0.0f, 0.0f, 14, null), j14, Color.m1391copywmQWz5c$default((i4 & 512) != 0 ? ColorKt.m1438compositeOverOWjLjI(Color.m1391copywmQWz5c$default(m766getOnSurface0d7_KjU, ContentAlpha.INSTANCE.getDisabled(composer, i5), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m771getSurface0d7_KjU()) : j9, f4, 0.0f, 0.0f, 0.0f, 14, null), null);
        composer.endReplaceableGroup();
        return defaultSwitchColors;
    }
}
