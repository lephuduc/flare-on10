package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;

/* loaded from: classes.dex */
public final class BitmapCompat {

    @RequiresApi(17)
    /* loaded from: classes.dex */
    public static class Api17Impl {
        private Api17Impl() {
        }

        @DoNotInline
        public static boolean hasMipMap(Bitmap bitmap) {
            return bitmap.hasMipMap();
        }

        @DoNotInline
        public static void setHasMipMap(Bitmap bitmap, boolean z) {
            bitmap.setHasMipMap(z);
        }
    }

    @RequiresApi(19)
    /* loaded from: classes.dex */
    public static class Api19Impl {
        private Api19Impl() {
        }

        @DoNotInline
        public static int getAllocationByteCount(Bitmap bitmap) {
            return bitmap.getAllocationByteCount();
        }
    }

    @RequiresApi(27)
    /* loaded from: classes.dex */
    public static class Api27Impl {
        private Api27Impl() {
        }

        @DoNotInline
        public static Bitmap copyBitmapIfHardware(Bitmap bitmap) {
            if (bitmap.getConfig() == Bitmap.Config.HARDWARE) {
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                if (Build.VERSION.SDK_INT >= 31) {
                    config = Api31Impl.getHardwareBitmapConfig(bitmap);
                }
                return bitmap.copy(config, true);
            }
            return bitmap;
        }

        @DoNotInline
        public static Bitmap createBitmapWithSourceColorspace(int i2, int i3, Bitmap bitmap, boolean z) {
            Bitmap.Config config = bitmap.getConfig();
            ColorSpace colorSpace = bitmap.getColorSpace();
            ColorSpace colorSpace2 = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
            if (z && !bitmap.getColorSpace().equals(colorSpace2)) {
                config = Bitmap.Config.RGBA_F16;
                colorSpace = colorSpace2;
            } else if (bitmap.getConfig() == Bitmap.Config.HARDWARE) {
                config = Bitmap.Config.ARGB_8888;
                if (Build.VERSION.SDK_INT >= 31) {
                    config = Api31Impl.getHardwareBitmapConfig(bitmap);
                }
            }
            return Bitmap.createBitmap(i2, i3, config, bitmap.hasAlpha(), colorSpace);
        }

        @DoNotInline
        public static boolean isAlreadyF16AndLinear(Bitmap bitmap) {
            return bitmap.getConfig() == Bitmap.Config.RGBA_F16 && bitmap.getColorSpace().equals(ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB));
        }
    }

    @RequiresApi(29)
    /* loaded from: classes.dex */
    public static class Api29Impl {
        private Api29Impl() {
        }

        @DoNotInline
        public static void setPaintBlendMode(Paint paint) {
            paint.setBlendMode(BlendMode.SRC);
        }
    }

    @RequiresApi(31)
    /* loaded from: classes.dex */
    public static class Api31Impl {
        private Api31Impl() {
        }

        @DoNotInline
        public static Bitmap.Config getHardwareBitmapConfig(Bitmap bitmap) {
            HardwareBuffer hardwareBuffer;
            hardwareBuffer = bitmap.getHardwareBuffer();
            return hardwareBuffer.getFormat() == 22 ? Bitmap.Config.RGBA_F16 : Bitmap.Config.ARGB_8888;
        }
    }

    private BitmapCompat() {
    }

    @NonNull
    public static Bitmap createScaledBitmap(@NonNull Bitmap bitmap, int i2, int i3, @Nullable Rect rect, boolean z) {
        int i4;
        int i5;
        if (i2 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("dstW and dstH must be > 0!");
        }
        if (rect == null || (!rect.isEmpty() && rect.left >= 0 && rect.right <= bitmap.getWidth() && rect.top >= 0 && rect.bottom <= bitmap.getHeight())) {
            Bitmap copyBitmapIfHardware = Api27Impl.copyBitmapIfHardware(bitmap);
            int width = rect != null ? rect.width() : bitmap.getWidth();
            int height = rect != null ? rect.height() : bitmap.getHeight();
            float f2 = i2 / width;
            float f3 = i3 / height;
            int i6 = rect != null ? rect.left : 0;
            int i7 = rect != null ? rect.top : 0;
            if (i6 == 0 && i7 == 0 && i2 == bitmap.getWidth() && i3 == bitmap.getHeight()) {
                return (bitmap.isMutable() && bitmap == copyBitmapIfHardware) ? bitmap.copy(bitmap.getConfig(), true) : copyBitmapIfHardware;
            }
            Paint paint = new Paint(1);
            paint.setFilterBitmap(true);
            Api29Impl.setPaintBlendMode(paint);
            if (width == i2 && height == i3) {
                Bitmap createBitmap = Bitmap.createBitmap(i2, i3, copyBitmapIfHardware.getConfig());
                new Canvas(createBitmap).drawBitmap(copyBitmapIfHardware, -i6, -i7, paint);
                return createBitmap;
            }
            double log = Math.log(2.0d);
            int i8 = (f2 > 1.0f ? 1 : (f2 == 1.0f ? 0 : -1));
            int i9 = i6;
            double log2 = Math.log(f2) / log;
            int ceil = (int) (i8 > 0 ? Math.ceil(log2) : Math.floor(log2));
            int ceil2 = (int) (f3 > 1.0f ? Math.ceil(Math.log(f3) / log) : Math.floor(Math.log(f3) / log));
            Bitmap bitmap2 = null;
            if (!z || Api27Impl.isAlreadyF16AndLinear(bitmap)) {
                i4 = i9;
                i5 = 0;
            } else {
                Bitmap createBitmapWithSourceColorspace = Api27Impl.createBitmapWithSourceColorspace(ceil > 0 ? sizeAtStep(width, i2, 1, ceil) : width, ceil2 > 0 ? sizeAtStep(height, i3, 1, ceil2) : height, bitmap, true);
                new Canvas(createBitmapWithSourceColorspace).drawBitmap(copyBitmapIfHardware, -i9, -i7, paint);
                i5 = 1;
                i7 = 0;
                i4 = 0;
                bitmap2 = copyBitmapIfHardware;
                copyBitmapIfHardware = createBitmapWithSourceColorspace;
            }
            Rect rect2 = new Rect(i4, i7, width, height);
            Rect rect3 = new Rect();
            int i10 = ceil;
            int i11 = ceil2;
            while (true) {
                if (i10 == 0 && i11 == 0) {
                    break;
                }
                if (i10 < 0) {
                    i10++;
                } else if (i10 > 0) {
                    i10--;
                }
                if (i11 < 0) {
                    i11++;
                } else if (i11 > 0) {
                    i11--;
                }
                Bitmap bitmap3 = copyBitmapIfHardware;
                Paint paint2 = paint;
                rect3.set(0, 0, sizeAtStep(width, i2, i10, ceil), sizeAtStep(height, i3, i11, ceil2));
                boolean z2 = i10 == 0 && i11 == 0;
                boolean z3 = bitmap2 != null && bitmap2.getWidth() == i2 && bitmap2.getHeight() == i3;
                if (bitmap2 == null || bitmap2 == bitmap || ((z && !Api27Impl.isAlreadyF16AndLinear(bitmap2)) || (z2 && !(z3 && i5 == 0)))) {
                    if (bitmap2 != bitmap && bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    copyBitmapIfHardware = Api27Impl.createBitmapWithSourceColorspace(sizeAtStep(width, i2, i10 > 0 ? i5 : i10, ceil), sizeAtStep(height, i3, i11 > 0 ? i5 : i11, ceil2), bitmap, z && !z2);
                } else {
                    copyBitmapIfHardware = bitmap2;
                }
                new Canvas(copyBitmapIfHardware).drawBitmap(bitmap3, rect2, rect3, paint2);
                rect2.set(rect3);
                bitmap2 = bitmap3;
                paint = paint2;
            }
            if (bitmap2 != bitmap && bitmap2 != null) {
                bitmap2.recycle();
            }
            return copyBitmapIfHardware;
        }
        throw new IllegalArgumentException("srcRect must be contained by srcBm!");
    }

    public static int getAllocationByteCount(@NonNull Bitmap bitmap) {
        return Api19Impl.getAllocationByteCount(bitmap);
    }

    public static boolean hasMipMap(@NonNull Bitmap bitmap) {
        return Api17Impl.hasMipMap(bitmap);
    }

    public static void setHasMipMap(@NonNull Bitmap bitmap, boolean z) {
        Api17Impl.setHasMipMap(bitmap, z);
    }

    @VisibleForTesting
    public static int sizeAtStep(int i2, int i3, int i4, int i5) {
        return i4 == 0 ? i3 : i4 > 0 ? i2 * (1 << (i5 - i4)) : i3 << ((-i4) - 1);
    }
}
