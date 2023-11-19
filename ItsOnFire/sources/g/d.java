package g;

import androidx.compose.material.Typography;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.SystemFontFamily;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0017\u0010\u0004\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/Typography;", "a", "Landroidx/compose/material/Typography;", "()Landroidx/compose/material/Typography;", "Typography", "app_release"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class d {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final Typography f384a;

    static {
        SystemFontFamily systemFontFamily = FontFamily.Companion.getDefault();
        f384a = new Typography(null, null, null, null, null, null, null, null, null, new TextStyle(0L, TextUnitKt.getSp(16), FontWeight.Companion.getNormal(), null, null, systemFontFamily, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262105, null), null, null, null, null, 15871, null);
    }

    @NotNull
    public static final Typography a() {
        return f384a;
    }
}
