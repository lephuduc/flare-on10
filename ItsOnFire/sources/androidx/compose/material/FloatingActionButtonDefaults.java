package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ=\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"Landroidx/compose/material/FloatingActionButtonDefaults;", "", "()V", "elevation", "Landroidx/compose/material/FloatingActionButtonElevation;", "defaultElevation", "Landroidx/compose/ui/unit/Dp;", "pressedElevation", "elevation-ixp7dh8", "(FFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/FloatingActionButtonElevation;", "hoveredElevation", "focusedElevation", "elevation-xZ9-QkE", "(FFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/FloatingActionButtonElevation;", "material_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class FloatingActionButtonDefaults {
    public static final int $stable = 0;
    @NotNull
    public static final FloatingActionButtonDefaults INSTANCE = new FloatingActionButtonDefaults();

    private FloatingActionButtonDefaults() {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use another overload of elevation")
    @Composable
    /* renamed from: elevation-ixp7dh8  reason: not valid java name */
    public final /* synthetic */ FloatingActionButtonElevation m859elevationixp7dh8(float f2, float f3, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(795786822);
        if ((i3 & 1) != 0) {
            f2 = Dp.m3325constructorimpl(6);
        }
        float f4 = f2;
        if ((i3 & 2) != 0) {
            f3 = Dp.m3325constructorimpl(12);
        }
        float f5 = 8;
        FloatingActionButtonElevation m860elevationxZ9QkE = m860elevationxZ9QkE(f4, f3, Dp.m3325constructorimpl(f5), Dp.m3325constructorimpl(f5), composer, (i2 & 14) | 3456 | (i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (57344 & (i2 << 6)), 0);
        composer.endReplaceableGroup();
        return m860elevationxZ9QkE;
    }

    @Composable
    @NotNull
    /* renamed from: elevation-xZ9-QkE  reason: not valid java name */
    public final FloatingActionButtonElevation m860elevationxZ9QkE(float f2, float f3, float f4, float f5, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(795787729);
        if ((i3 & 1) != 0) {
            f2 = Dp.m3325constructorimpl(6);
        }
        float f6 = f2;
        if ((i3 & 2) != 0) {
            f3 = Dp.m3325constructorimpl(12);
        }
        float f7 = f3;
        if ((i3 & 4) != 0) {
            f4 = Dp.m3325constructorimpl(8);
        }
        float f8 = f4;
        if ((i3 & 8) != 0) {
            f5 = Dp.m3325constructorimpl(8);
        }
        float f9 = f5;
        int i4 = 0;
        Object[] objArr = {Dp.m3323boximpl(f6), Dp.m3323boximpl(f7), Dp.m3323boximpl(f8), Dp.m3323boximpl(f9)};
        composer.startReplaceableGroup(-3685570);
        boolean z = false;
        while (i4 < 4) {
            Object obj = objArr[i4];
            i4++;
            z |= composer.changed(obj);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DefaultFloatingActionButtonElevation(f6, f7, f8, f9, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DefaultFloatingActionButtonElevation defaultFloatingActionButtonElevation = (DefaultFloatingActionButtonElevation) rememberedValue;
        composer.endReplaceableGroup();
        return defaultFloatingActionButtonElevation;
    }
}
