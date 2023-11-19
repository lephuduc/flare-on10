package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001d\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u008b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u008b\u0001\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001b\u001a\u001f\u0010\t\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\n\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0014\u0010 \u001a\u00020!*\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002H\u0000\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00028Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"LocalColors", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/Colors;", "getLocalColors", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "primarySurface", "Landroidx/compose/ui/graphics/Color;", "getPrimarySurface", "(Landroidx/compose/material/Colors;)J", "contentColorFor", "backgroundColor", "contentColorFor-ek8zF_U", "(JLandroidx/compose/runtime/Composer;I)J", "darkColors", "primary", "primaryVariant", "secondary", "secondaryVariant", "background", "surface", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "onPrimary", "onSecondary", "onBackground", "onSurface", "onError", "darkColors-2qZNXz8", "(JJJJJJJJJJJJ)Landroidx/compose/material/Colors;", "lightColors", "lightColors-2qZNXz8", "contentColorFor-4WTKRHQ", "(Landroidx/compose/material/Colors;J)J", "updateColorsFrom", "", "other", "material_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ColorsKt {
    @NotNull
    private static final ProvidableCompositionLocal<Colors> LocalColors = CompositionLocalKt.staticCompositionLocalOf(ColorsKt$LocalColors$1.INSTANCE);

    /* renamed from: contentColorFor-4WTKRHQ  reason: not valid java name */
    public static final long m784contentColorFor4WTKRHQ(@NotNull Colors contentColorFor, long j2) {
        Intrinsics.checkNotNullParameter(contentColorFor, "$this$contentColorFor");
        return (Color.m1393equalsimpl0(j2, contentColorFor.m767getPrimary0d7_KjU()) || Color.m1393equalsimpl0(j2, contentColorFor.m768getPrimaryVariant0d7_KjU())) ? contentColorFor.m764getOnPrimary0d7_KjU() : (Color.m1393equalsimpl0(j2, contentColorFor.m769getSecondary0d7_KjU()) || Color.m1393equalsimpl0(j2, contentColorFor.m770getSecondaryVariant0d7_KjU())) ? contentColorFor.m765getOnSecondary0d7_KjU() : Color.m1393equalsimpl0(j2, contentColorFor.m760getBackground0d7_KjU()) ? contentColorFor.m762getOnBackground0d7_KjU() : Color.m1393equalsimpl0(j2, contentColorFor.m771getSurface0d7_KjU()) ? contentColorFor.m766getOnSurface0d7_KjU() : Color.m1393equalsimpl0(j2, contentColorFor.m761getError0d7_KjU()) ? contentColorFor.m763getOnError0d7_KjU() : Color.Companion.m1428getUnspecified0d7_KjU();
    }

    @Composable
    @ReadOnlyComposable
    /* renamed from: contentColorFor-ek8zF_U  reason: not valid java name */
    public static final long m785contentColorForek8zF_U(long j2, @Nullable Composer composer, int i2) {
        long m784contentColorFor4WTKRHQ = m784contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColors(composer, 6), j2);
        return (m784contentColorFor4WTKRHQ > Color.Companion.m1428getUnspecified0d7_KjU() ? 1 : (m784contentColorFor4WTKRHQ == Color.Companion.m1428getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? m784contentColorFor4WTKRHQ : ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m1402unboximpl();
    }

    @NotNull
    /* renamed from: darkColors-2qZNXz8  reason: not valid java name */
    public static final Colors m786darkColors2qZNXz8(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        return new Colors(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, false, null);
    }

    /* renamed from: darkColors-2qZNXz8$default  reason: not valid java name */
    public static /* synthetic */ Colors m787darkColors2qZNXz8$default(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, int i2, Object obj) {
        long Color = (i2 & 1) != 0 ? ColorKt.Color(4290479868L) : j2;
        long Color2 = (i2 & 2) != 0 ? ColorKt.Color(4281794739L) : j3;
        long Color3 = (i2 & 4) != 0 ? ColorKt.Color(4278442694L) : j4;
        return m786darkColors2qZNXz8(Color, Color2, Color3, (i2 & 8) != 0 ? Color3 : j5, (i2 & 16) != 0 ? ColorKt.Color(4279374354L) : j6, (i2 & 32) != 0 ? ColorKt.Color(4279374354L) : j7, (i2 & 64) != 0 ? ColorKt.Color(4291782265L) : j8, (i2 & 128) != 0 ? Color.Companion.m1418getBlack0d7_KjU() : j9, (i2 & 256) != 0 ? Color.Companion.m1418getBlack0d7_KjU() : j10, (i2 & 512) != 0 ? Color.Companion.m1429getWhite0d7_KjU() : j11, (i2 & 1024) != 0 ? Color.Companion.m1429getWhite0d7_KjU() : j12, (i2 & 2048) != 0 ? Color.Companion.m1418getBlack0d7_KjU() : j13);
    }

    @NotNull
    public static final ProvidableCompositionLocal<Colors> getLocalColors() {
        return LocalColors;
    }

    public static final long getPrimarySurface(@NotNull Colors colors) {
        Intrinsics.checkNotNullParameter(colors, "<this>");
        return colors.isLight() ? colors.m767getPrimary0d7_KjU() : colors.m771getSurface0d7_KjU();
    }

    @NotNull
    /* renamed from: lightColors-2qZNXz8  reason: not valid java name */
    public static final Colors m788lightColors2qZNXz8(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        return new Colors(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, true, null);
    }

    public static final void updateColorsFrom(@NotNull Colors colors, @NotNull Colors other) {
        Intrinsics.checkNotNullParameter(colors, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        colors.m779setPrimary8_81llA$material_release(other.m767getPrimary0d7_KjU());
        colors.m780setPrimaryVariant8_81llA$material_release(other.m768getPrimaryVariant0d7_KjU());
        colors.m781setSecondary8_81llA$material_release(other.m769getSecondary0d7_KjU());
        colors.m782setSecondaryVariant8_81llA$material_release(other.m770getSecondaryVariant0d7_KjU());
        colors.m772setBackground8_81llA$material_release(other.m760getBackground0d7_KjU());
        colors.m783setSurface8_81llA$material_release(other.m771getSurface0d7_KjU());
        colors.m773setError8_81llA$material_release(other.m761getError0d7_KjU());
        colors.m776setOnPrimary8_81llA$material_release(other.m764getOnPrimary0d7_KjU());
        colors.m777setOnSecondary8_81llA$material_release(other.m765getOnSecondary0d7_KjU());
        colors.m774setOnBackground8_81llA$material_release(other.m762getOnBackground0d7_KjU());
        colors.m778setOnSurface8_81llA$material_release(other.m766getOnSurface0d7_KjU());
        colors.m775setOnError8_81llA$material_release(other.m763getOnError0d7_KjU());
        colors.setLight$material_release(other.isLight());
    }
}
