package androidx.compose.ui.graphics;

import android.graphics.PorterDuff;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.BlendMode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\t\u001a\u00020\n*\u00020\u0002H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"isSupported", "", "Landroidx/compose/ui/graphics/BlendMode;", "isSupported-s9anfk8", "(I)Z", "toAndroidBlendMode", "Landroid/graphics/BlendMode;", "toAndroidBlendMode-s9anfk8", "(I)Landroid/graphics/BlendMode;", "toPorterDuffMode", "Landroid/graphics/PorterDuff$Mode;", "toPorterDuffMode-s9anfk8", "(I)Landroid/graphics/PorterDuff$Mode;", "ui-graphics_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class AndroidBlendMode_androidKt {
    /* renamed from: isSupported-s9anfk8  reason: not valid java name */
    public static final boolean m1252isSupporteds9anfk8(int i2) {
        return true;
    }

    @RequiresApi(29)
    @NotNull
    /* renamed from: toAndroidBlendMode-s9anfk8  reason: not valid java name */
    public static final android.graphics.BlendMode m1253toAndroidBlendModes9anfk8(int i2) {
        BlendMode.Companion companion = BlendMode.Companion;
        if (BlendMode.m1311equalsimpl0(i2, companion.m1315getClear0nO6VwU())) {
            return android.graphics.BlendMode.CLEAR;
        }
        if (BlendMode.m1311equalsimpl0(i2, companion.m1338getSrc0nO6VwU())) {
            return android.graphics.BlendMode.SRC;
        }
        if (BlendMode.m1311equalsimpl0(i2, companion.m1321getDst0nO6VwU())) {
            return android.graphics.BlendMode.DST;
        }
        if (!BlendMode.m1311equalsimpl0(i2, companion.m1342getSrcOver0nO6VwU())) {
            if (BlendMode.m1311equalsimpl0(i2, companion.m1325getDstOver0nO6VwU())) {
                return android.graphics.BlendMode.DST_OVER;
            }
            if (BlendMode.m1311equalsimpl0(i2, companion.m1340getSrcIn0nO6VwU())) {
                return android.graphics.BlendMode.SRC_IN;
            }
            if (BlendMode.m1311equalsimpl0(i2, companion.m1323getDstIn0nO6VwU())) {
                return android.graphics.BlendMode.DST_IN;
            }
            if (BlendMode.m1311equalsimpl0(i2, companion.m1341getSrcOut0nO6VwU())) {
                return android.graphics.BlendMode.SRC_OUT;
            }
            if (BlendMode.m1311equalsimpl0(i2, companion.m1324getDstOut0nO6VwU())) {
                return android.graphics.BlendMode.DST_OUT;
            }
            if (BlendMode.m1311equalsimpl0(i2, companion.m1339getSrcAtop0nO6VwU())) {
                return android.graphics.BlendMode.SRC_ATOP;
            }
            if (BlendMode.m1311equalsimpl0(i2, companion.m1322getDstAtop0nO6VwU())) {
                return android.graphics.BlendMode.DST_ATOP;
            }
            if (BlendMode.m1311equalsimpl0(i2, companion.m1343getXor0nO6VwU())) {
                return android.graphics.BlendMode.XOR;
            }
            if (BlendMode.m1311equalsimpl0(i2, companion.m1334getPlus0nO6VwU())) {
                return android.graphics.BlendMode.PLUS;
            }
            if (BlendMode.m1311equalsimpl0(i2, companion.m1331getModulate0nO6VwU())) {
                return android.graphics.BlendMode.MODULATE;
            }
            if (BlendMode.m1311equalsimpl0(i2, companion.m1336getScreen0nO6VwU())) {
                return android.graphics.BlendMode.SCREEN;
            }
            if (BlendMode.m1311equalsimpl0(i2, companion.m1333getOverlay0nO6VwU())) {
                return android.graphics.BlendMode.OVERLAY;
            }
            if (BlendMode.m1311equalsimpl0(i2, companion.m1319getDarken0nO6VwU())) {
                return android.graphics.BlendMode.DARKEN;
            }
            if (BlendMode.m1311equalsimpl0(i2, companion.m1329getLighten0nO6VwU())) {
                return android.graphics.BlendMode.LIGHTEN;
            }
            if (BlendMode.m1311equalsimpl0(i2, companion.m1318getColorDodge0nO6VwU())) {
                return android.graphics.BlendMode.COLOR_DODGE;
            }
            if (BlendMode.m1311equalsimpl0(i2, companion.m1317getColorBurn0nO6VwU())) {
                return android.graphics.BlendMode.COLOR_BURN;
            }
            if (BlendMode.m1311equalsimpl0(i2, companion.m1327getHardlight0nO6VwU())) {
                return android.graphics.BlendMode.HARD_LIGHT;
            }
            if (BlendMode.m1311equalsimpl0(i2, companion.m1337getSoftlight0nO6VwU())) {
                return android.graphics.BlendMode.SOFT_LIGHT;
            }
            if (BlendMode.m1311equalsimpl0(i2, companion.m1320getDifference0nO6VwU())) {
                return android.graphics.BlendMode.DIFFERENCE;
            }
            if (BlendMode.m1311equalsimpl0(i2, companion.m1326getExclusion0nO6VwU())) {
                return android.graphics.BlendMode.EXCLUSION;
            }
            if (BlendMode.m1311equalsimpl0(i2, companion.m1332getMultiply0nO6VwU())) {
                return android.graphics.BlendMode.MULTIPLY;
            }
            if (BlendMode.m1311equalsimpl0(i2, companion.m1328getHue0nO6VwU())) {
                return android.graphics.BlendMode.HUE;
            }
            if (BlendMode.m1311equalsimpl0(i2, companion.m1335getSaturation0nO6VwU())) {
                return android.graphics.BlendMode.SATURATION;
            }
            if (BlendMode.m1311equalsimpl0(i2, companion.m1316getColor0nO6VwU())) {
                return android.graphics.BlendMode.COLOR;
            }
            if (BlendMode.m1311equalsimpl0(i2, companion.m1330getLuminosity0nO6VwU())) {
                return android.graphics.BlendMode.LUMINOSITY;
            }
        }
        return android.graphics.BlendMode.SRC_OVER;
    }

    @NotNull
    /* renamed from: toPorterDuffMode-s9anfk8  reason: not valid java name */
    public static final PorterDuff.Mode m1254toPorterDuffModes9anfk8(int i2) {
        BlendMode.Companion companion = BlendMode.Companion;
        if (BlendMode.m1311equalsimpl0(i2, companion.m1315getClear0nO6VwU())) {
            return PorterDuff.Mode.CLEAR;
        }
        if (BlendMode.m1311equalsimpl0(i2, companion.m1338getSrc0nO6VwU())) {
            return PorterDuff.Mode.SRC;
        }
        if (BlendMode.m1311equalsimpl0(i2, companion.m1321getDst0nO6VwU())) {
            return PorterDuff.Mode.DST;
        }
        if (!BlendMode.m1311equalsimpl0(i2, companion.m1342getSrcOver0nO6VwU())) {
            if (BlendMode.m1311equalsimpl0(i2, companion.m1325getDstOver0nO6VwU())) {
                return PorterDuff.Mode.DST_OVER;
            }
            if (BlendMode.m1311equalsimpl0(i2, companion.m1340getSrcIn0nO6VwU())) {
                return PorterDuff.Mode.SRC_IN;
            }
            if (BlendMode.m1311equalsimpl0(i2, companion.m1323getDstIn0nO6VwU())) {
                return PorterDuff.Mode.DST_IN;
            }
            if (BlendMode.m1311equalsimpl0(i2, companion.m1341getSrcOut0nO6VwU())) {
                return PorterDuff.Mode.SRC_OUT;
            }
            if (BlendMode.m1311equalsimpl0(i2, companion.m1324getDstOut0nO6VwU())) {
                return PorterDuff.Mode.DST_OUT;
            }
            if (BlendMode.m1311equalsimpl0(i2, companion.m1339getSrcAtop0nO6VwU())) {
                return PorterDuff.Mode.SRC_ATOP;
            }
            if (BlendMode.m1311equalsimpl0(i2, companion.m1322getDstAtop0nO6VwU())) {
                return PorterDuff.Mode.DST_ATOP;
            }
            if (BlendMode.m1311equalsimpl0(i2, companion.m1343getXor0nO6VwU())) {
                return PorterDuff.Mode.XOR;
            }
            if (BlendMode.m1311equalsimpl0(i2, companion.m1334getPlus0nO6VwU())) {
                return PorterDuff.Mode.ADD;
            }
            if (BlendMode.m1311equalsimpl0(i2, companion.m1336getScreen0nO6VwU())) {
                return PorterDuff.Mode.SCREEN;
            }
            if (BlendMode.m1311equalsimpl0(i2, companion.m1333getOverlay0nO6VwU())) {
                return PorterDuff.Mode.OVERLAY;
            }
            if (BlendMode.m1311equalsimpl0(i2, companion.m1319getDarken0nO6VwU())) {
                return PorterDuff.Mode.DARKEN;
            }
            if (BlendMode.m1311equalsimpl0(i2, companion.m1329getLighten0nO6VwU())) {
                return PorterDuff.Mode.LIGHTEN;
            }
            if (BlendMode.m1311equalsimpl0(i2, companion.m1331getModulate0nO6VwU())) {
                return PorterDuff.Mode.MULTIPLY;
            }
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
