package androidx.compose.ui.graphics;

import android.graphics.BitmapShader;
import android.graphics.Shader;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.geometry.Offset;
import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a1\u0010\u0000\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001aO\u0010\n\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001aO\u0010\u0016\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00122\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a?\u0010\u001b\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0017\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000fH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0019\u0010\u001e\u001a\u00020\u001f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0001ø\u0001\u0000\u001a!\u0010 \u001a\u00020!2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\"\u001a\u00020\u001fH\u0001ø\u0001\u0000\u001a3\u0010#\u001a\u0004\u0018\u00010$2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\"\u001a\u00020\u001fH\u0001ø\u0001\u0000\u001a)\u0010&\u001a\u00020'2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000fH\u0002ø\u0001\u0000*\n\u0010(\"\u00020\u00012\u00020\u0001\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"ActualImageShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "tileModeX", "Landroidx/compose/ui/graphics/TileMode;", "tileModeY", "ActualImageShader-F49vj9s", "(Landroidx/compose/ui/graphics/ImageBitmap;II)Landroid/graphics/Shader;", "ActualLinearGradientShader", Constants.MessagePayloadKeys.FROM, "Landroidx/compose/ui/geometry/Offset;", "to", "colors", "", "Landroidx/compose/ui/graphics/Color;", "colorStops", "", "tileMode", "ActualLinearGradientShader-VjE6UOU", "(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "ActualRadialGradientShader", "center", "radius", "ActualRadialGradientShader-8uybcMk", "(JFLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "ActualSweepGradientShader", "ActualSweepGradientShader-9KIMszo", "(JLjava/util/List;Ljava/util/List;)Landroid/graphics/Shader;", "countTransparentColors", "", "makeTransparentColors", "", "numTransparentColors", "makeTransparentStops", "", "stops", "validateColorStops", "", "Shader", "ui-graphics_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class AndroidShader_androidKt {
    @NotNull
    /* renamed from: ActualImageShader-F49vj9s  reason: not valid java name */
    public static final Shader m1300ActualImageShaderF49vj9s(@NotNull ImageBitmap image, int i2, int i3) {
        Intrinsics.checkNotNullParameter(image, "image");
        return new BitmapShader(AndroidImageBitmap_androidKt.asAndroidBitmap(image), AndroidTileMode_androidKt.m1305toAndroidTileMode0vamqd0(i2), AndroidTileMode_androidKt.m1305toAndroidTileMode0vamqd0(i3));
    }

    @NotNull
    /* renamed from: ActualLinearGradientShader-VjE6UOU  reason: not valid java name */
    public static final Shader m1301ActualLinearGradientShaderVjE6UOU(long j2, long j3, @NotNull List<Color> colors, @Nullable List<Float> list, int i2) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        validateColorStops(colors, list);
        int countTransparentColors = countTransparentColors(colors);
        return new android.graphics.LinearGradient(Offset.m1161getXimpl(j2), Offset.m1162getYimpl(j2), Offset.m1161getXimpl(j3), Offset.m1162getYimpl(j3), makeTransparentColors(colors, countTransparentColors), makeTransparentStops(list, colors, countTransparentColors), AndroidTileMode_androidKt.m1305toAndroidTileMode0vamqd0(i2));
    }

    @NotNull
    /* renamed from: ActualRadialGradientShader-8uybcMk  reason: not valid java name */
    public static final Shader m1302ActualRadialGradientShader8uybcMk(long j2, float f2, @NotNull List<Color> colors, @Nullable List<Float> list, int i2) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        validateColorStops(colors, list);
        int countTransparentColors = countTransparentColors(colors);
        return new android.graphics.RadialGradient(Offset.m1161getXimpl(j2), Offset.m1162getYimpl(j2), f2, makeTransparentColors(colors, countTransparentColors), makeTransparentStops(list, colors, countTransparentColors), AndroidTileMode_androidKt.m1305toAndroidTileMode0vamqd0(i2));
    }

    @NotNull
    /* renamed from: ActualSweepGradientShader-9KIMszo  reason: not valid java name */
    public static final Shader m1303ActualSweepGradientShader9KIMszo(long j2, @NotNull List<Color> colors, @Nullable List<Float> list) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        validateColorStops(colors, list);
        int countTransparentColors = countTransparentColors(colors);
        return new android.graphics.SweepGradient(Offset.m1161getXimpl(j2), Offset.m1162getYimpl(j2), makeTransparentColors(colors, countTransparentColors), makeTransparentStops(list, colors, countTransparentColors));
    }

    @VisibleForTesting
    public static final int countTransparentColors(@NotNull List<Color> colors) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        return 0;
    }

    @VisibleForTesting
    @NotNull
    public static final int[] makeTransparentColors(@NotNull List<Color> colors, int i2) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        int size = colors.size();
        int[] iArr = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr[i3] = ColorKt.m1447toArgb8_81llA(colors.get(i3).m1402unboximpl());
        }
        return iArr;
    }

    @VisibleForTesting
    @Nullable
    public static final float[] makeTransparentStops(@Nullable List<Float> list, @NotNull List<Color> colors, int i2) {
        Float f2;
        int lastIndex;
        int lastIndex2;
        float floatValue;
        int lastIndex3;
        float[] floatArray;
        Intrinsics.checkNotNullParameter(colors, "colors");
        if (i2 == 0) {
            if (list == null) {
                return null;
            }
            floatArray = CollectionsKt___CollectionsKt.toFloatArray(list);
            return floatArray;
        }
        float[] fArr = new float[colors.size() + i2];
        fArr[0] = (list == null || (f2 = list.get(0)) == null) ? 0.0f : f2.floatValue();
        lastIndex = CollectionsKt__CollectionsKt.getLastIndex(colors);
        int i3 = 1;
        int i4 = 1;
        while (i3 < lastIndex) {
            int i5 = i3 + 1;
            long m1402unboximpl = colors.get(i3).m1402unboximpl();
            Float f3 = list == null ? null : list.get(i3);
            if (f3 == null) {
                lastIndex3 = CollectionsKt__CollectionsKt.getLastIndex(colors);
                floatValue = i3 / lastIndex3;
            } else {
                floatValue = f3.floatValue();
            }
            int i6 = i4 + 1;
            fArr[i4] = floatValue;
            if (Color.m1394getAlphaimpl(m1402unboximpl) == 0.0f) {
                i4 = i6 + 1;
                fArr[i6] = floatValue;
                i3 = i5;
            } else {
                i3 = i5;
                i4 = i6;
            }
        }
        float f4 = 1.0f;
        if (list != null) {
            lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(colors);
            Float f5 = list.get(lastIndex2);
            if (f5 != null) {
                f4 = f5.floatValue();
            }
        }
        fArr[i4] = f4;
        return fArr;
    }

    private static final void validateColorStops(List<Color> list, List<Float> list2) {
        int size = list.size();
        if (list2 == null) {
            if (size < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (size != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}
