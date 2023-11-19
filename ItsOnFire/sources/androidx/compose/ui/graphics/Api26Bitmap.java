package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/Api26Bitmap;", "", "()V", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class Api26Bitmap {
    @NotNull
    public static final Companion Companion = new Companion(null);

    @RequiresApi(26)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J=\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u00020\r*\u00020\u0004H\u0000¢\u0006\u0002\b\u0011J\u0011\u0010\u0010\u001a\u00020\r*\u00020\u0012H\u0000¢\u0006\u0002\b\u0011J\u0011\u0010\u0013\u001a\u00020\u0012*\u00020\rH\u0000¢\u0006\u0002\b\u0014\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/graphics/Api26Bitmap$Companion;", "", "()V", "createBitmap", "Landroid/graphics/Bitmap;", "width", "", "height", "bitmapConfig", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "hasAlpha", "", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "createBitmap-x__-hDU$ui_graphics_release", "(IIIZLandroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroid/graphics/Bitmap;", "composeColorSpace", "composeColorSpace$ui_graphics_release", "Landroid/graphics/ColorSpace;", "toFrameworkColorSpace", "toFrameworkColorSpace$ui_graphics_release", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ColorSpace composeColorSpace$ui_graphics_release(@NotNull Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "<this>");
            android.graphics.ColorSpace colorSpace = bitmap.getColorSpace();
            ColorSpace composeColorSpace$ui_graphics_release = colorSpace == null ? null : composeColorSpace$ui_graphics_release(colorSpace);
            return composeColorSpace$ui_graphics_release == null ? ColorSpaces.INSTANCE.getSrgb() : composeColorSpace$ui_graphics_release;
        }

        @NotNull
        public final ColorSpace composeColorSpace$ui_graphics_release(@NotNull android.graphics.ColorSpace colorSpace) {
            Intrinsics.checkNotNullParameter(colorSpace, "<this>");
            if (!Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.SRGB))) {
                if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.ACES))) {
                    return ColorSpaces.INSTANCE.getAces();
                }
                if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.ACESCG))) {
                    return ColorSpaces.INSTANCE.getAcescg();
                }
                if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.ADOBE_RGB))) {
                    return ColorSpaces.INSTANCE.getAdobeRgb();
                }
                if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.BT2020))) {
                    return ColorSpaces.INSTANCE.getBt2020();
                }
                if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.BT709))) {
                    return ColorSpaces.INSTANCE.getBt709();
                }
                if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.CIE_LAB))) {
                    return ColorSpaces.INSTANCE.getCieLab();
                }
                if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.CIE_XYZ))) {
                    return ColorSpaces.INSTANCE.getCieXyz();
                }
                if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.DCI_P3))) {
                    return ColorSpaces.INSTANCE.getDciP3();
                }
                if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.DISPLAY_P3))) {
                    return ColorSpaces.INSTANCE.getDisplayP3();
                }
                if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB))) {
                    return ColorSpaces.INSTANCE.getExtendedSrgb();
                }
                if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB))) {
                    return ColorSpaces.INSTANCE.getLinearExtendedSrgb();
                }
                if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.LINEAR_SRGB))) {
                    return ColorSpaces.INSTANCE.getLinearSrgb();
                }
                if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.NTSC_1953))) {
                    return ColorSpaces.INSTANCE.getNtsc1953();
                }
                if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB))) {
                    return ColorSpaces.INSTANCE.getProPhotoRgb();
                }
                if (Intrinsics.areEqual(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.SMPTE_C))) {
                    return ColorSpaces.INSTANCE.getSmpteC();
                }
            }
            return ColorSpaces.INSTANCE.getSrgb();
        }

        @NotNull
        /* renamed from: createBitmap-x__-hDU$ui_graphics_release  reason: not valid java name */
        public final Bitmap m1307createBitmapx__hDU$ui_graphics_release(int i2, int i3, int i4, boolean z, @NotNull androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace) {
            Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
            Bitmap createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i2, i3, AndroidImageBitmap_androidKt.m1272toBitmapConfig1JJdX4A(i4), z, toFrameworkColorSpace$ui_graphics_release(colorSpace));
            Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(\n          …olorSpace()\n            )");
            return createBitmap;
        }

        @NotNull
        public final android.graphics.ColorSpace toFrameworkColorSpace$ui_graphics_release(@NotNull androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace) {
            ColorSpace.Named named;
            Intrinsics.checkNotNullParameter(colorSpace, "<this>");
            ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
            if (!Intrinsics.areEqual(colorSpace, colorSpaces.getSrgb())) {
                if (Intrinsics.areEqual(colorSpace, colorSpaces.getAces())) {
                    named = ColorSpace.Named.ACES;
                } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getAcescg())) {
                    named = ColorSpace.Named.ACESCG;
                } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getAdobeRgb())) {
                    named = ColorSpace.Named.ADOBE_RGB;
                } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getBt2020())) {
                    named = ColorSpace.Named.BT2020;
                } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getBt709())) {
                    named = ColorSpace.Named.BT709;
                } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getCieLab())) {
                    named = ColorSpace.Named.CIE_LAB;
                } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getCieXyz())) {
                    named = ColorSpace.Named.CIE_XYZ;
                } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getDciP3())) {
                    named = ColorSpace.Named.DCI_P3;
                } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getDisplayP3())) {
                    named = ColorSpace.Named.DISPLAY_P3;
                } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getExtendedSrgb())) {
                    named = ColorSpace.Named.EXTENDED_SRGB;
                } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getLinearExtendedSrgb())) {
                    named = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
                } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getLinearSrgb())) {
                    named = ColorSpace.Named.LINEAR_SRGB;
                } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getNtsc1953())) {
                    named = ColorSpace.Named.NTSC_1953;
                } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getProPhotoRgb())) {
                    named = ColorSpace.Named.PRO_PHOTO_RGB;
                } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getSmpteC())) {
                    named = ColorSpace.Named.SMPTE_C;
                }
                android.graphics.ColorSpace colorSpace2 = android.graphics.ColorSpace.get(named);
                Intrinsics.checkNotNullExpressionValue(colorSpace2, "get(frameworkNamedSpace)");
                return colorSpace2;
            }
            named = ColorSpace.Named.SRGB;
            android.graphics.ColorSpace colorSpace22 = android.graphics.ColorSpace.get(named);
            Intrinsics.checkNotNullExpressionValue(colorSpace22, "get(frameworkNamedSpace)");
            return colorSpace22;
        }
    }
}
