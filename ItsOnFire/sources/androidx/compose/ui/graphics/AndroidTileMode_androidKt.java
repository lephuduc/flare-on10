package androidx.compose.ui.graphics;

import android.graphics.Shader;
import android.os.Build;
import androidx.compose.ui.graphics.TileMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u0006*\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0012\u0010\t\u001a\u00020\u0002*\u00020\u0006ø\u0001\u0000¢\u0006\u0002\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"isSupported", "", "Landroidx/compose/ui/graphics/TileMode;", "isSupported-0vamqd0", "(I)Z", "toAndroidTileMode", "Landroid/graphics/Shader$TileMode;", "toAndroidTileMode-0vamqd0", "(I)Landroid/graphics/Shader$TileMode;", "toComposeTileMode", "(Landroid/graphics/Shader$TileMode;)I", "ui-graphics_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class AndroidTileMode_androidKt {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Shader.TileMode.values().length];
            iArr[Shader.TileMode.CLAMP.ordinal()] = 1;
            iArr[Shader.TileMode.MIRROR.ordinal()] = 2;
            iArr[Shader.TileMode.REPEAT.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: isSupported-0vamqd0  reason: not valid java name */
    public static final boolean m1304isSupported0vamqd0(int i2) {
        return Build.VERSION.SDK_INT >= 31 || !TileMode.m1685equalsimpl0(i2, TileMode.Companion.m1690getDecal3opZhB0());
    }

    @NotNull
    /* renamed from: toAndroidTileMode-0vamqd0  reason: not valid java name */
    public static final Shader.TileMode m1305toAndroidTileMode0vamqd0(int i2) {
        TileMode.Companion companion = TileMode.Companion;
        if (!TileMode.m1685equalsimpl0(i2, companion.m1689getClamp3opZhB0())) {
            if (TileMode.m1685equalsimpl0(i2, companion.m1692getRepeated3opZhB0())) {
                return Shader.TileMode.REPEAT;
            }
            if (TileMode.m1685equalsimpl0(i2, companion.m1691getMirror3opZhB0())) {
                return Shader.TileMode.MIRROR;
            }
            if (TileMode.m1685equalsimpl0(i2, companion.m1690getDecal3opZhB0()) && Build.VERSION.SDK_INT >= 31) {
                return TileModeVerificationHelper.INSTANCE.getFrameworkTileModeDecal();
            }
        }
        return Shader.TileMode.CLAMP;
    }

    public static final int toComposeTileMode(@NotNull Shader.TileMode tileMode) {
        Intrinsics.checkNotNullParameter(tileMode, "<this>");
        int i2 = WhenMappings.$EnumSwitchMapping$0[tileMode.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return TileMode.Companion.m1691getMirror3opZhB0();
            }
            if (i2 == 3) {
                return TileMode.Companion.m1692getRepeated3opZhB0();
            }
            if (Build.VERSION.SDK_INT >= 31 && tileMode == Shader.TileMode.DECAL) {
                return TileModeVerificationHelper.INSTANCE.m1693getComposeTileModeDecal3opZhB0();
            }
        }
        return TileMode.Companion.m1689getClamp3opZhB0();
    }
}
