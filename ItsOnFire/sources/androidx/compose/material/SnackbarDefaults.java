package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u00068Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00068Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\n\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Landroidx/compose/material/SnackbarDefaults;", "", "()V", "SnackbarOverlayAlpha", "", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "getBackgroundColor", "(Landroidx/compose/runtime/Composer;I)J", "primaryActionColor", "getPrimaryActionColor", "material_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SnackbarDefaults {
    public static final int $stable = 0;
    @NotNull
    public static final SnackbarDefaults INSTANCE = new SnackbarDefaults();
    private static final float SnackbarOverlayAlpha = 0.8f;

    private SnackbarDefaults() {
    }

    @Composable
    @JvmName(name = "getBackgroundColor")
    public final long getBackgroundColor(@Nullable Composer composer, int i2) {
        composer.startReplaceableGroup(-465860777);
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        long m1438compositeOverOWjLjI = ColorKt.m1438compositeOverOWjLjI(Color.m1391copywmQWz5c$default(materialTheme.getColors(composer, 6).m766getOnSurface0d7_KjU(), SnackbarOverlayAlpha, 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, 6).m771getSurface0d7_KjU());
        composer.endReplaceableGroup();
        return m1438compositeOverOWjLjI;
    }

    @Composable
    @JvmName(name = "getPrimaryActionColor")
    public final long getPrimaryActionColor(@Nullable Composer composer, int i2) {
        long m768getPrimaryVariant0d7_KjU;
        composer.startReplaceableGroup(894573386);
        Colors colors = MaterialTheme.INSTANCE.getColors(composer, 6);
        if (colors.isLight()) {
            m768getPrimaryVariant0d7_KjU = ColorKt.m1438compositeOverOWjLjI(Color.m1391copywmQWz5c$default(colors.m771getSurface0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), colors.m767getPrimary0d7_KjU());
        } else {
            m768getPrimaryVariant0d7_KjU = colors.m768getPrimaryVariant0d7_KjU();
        }
        composer.endReplaceableGroup();
        return m768getPrimaryVariant0d7_KjU;
    }
}
