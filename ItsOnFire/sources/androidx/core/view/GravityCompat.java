package androidx.core.view;

import android.graphics.Rect;
import android.view.Gravity;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public final class GravityCompat {
    public static final int END = 8388613;
    public static final int RELATIVE_HORIZONTAL_GRAVITY_MASK = 8388615;
    public static final int RELATIVE_LAYOUT_DIRECTION = 8388608;
    public static final int START = 8388611;

    @RequiresApi(17)
    /* loaded from: classes.dex */
    public static class Api17Impl {
        private Api17Impl() {
        }

        @DoNotInline
        public static void apply(int i2, int i3, int i4, Rect rect, int i5, int i6, Rect rect2, int i7) {
            Gravity.apply(i2, i3, i4, rect, i5, i6, rect2, i7);
        }

        @DoNotInline
        public static void apply(int i2, int i3, int i4, Rect rect, Rect rect2, int i5) {
            Gravity.apply(i2, i3, i4, rect, rect2, i5);
        }

        @DoNotInline
        public static void applyDisplay(int i2, Rect rect, Rect rect2, int i3) {
            Gravity.applyDisplay(i2, rect, rect2, i3);
        }
    }

    private GravityCompat() {
    }

    public static void apply(int i2, int i3, int i4, @NonNull Rect rect, int i5, int i6, @NonNull Rect rect2, int i7) {
        Api17Impl.apply(i2, i3, i4, rect, i5, i6, rect2, i7);
    }

    public static void apply(int i2, int i3, int i4, @NonNull Rect rect, @NonNull Rect rect2, int i5) {
        Api17Impl.apply(i2, i3, i4, rect, rect2, i5);
    }

    public static void applyDisplay(int i2, @NonNull Rect rect, @NonNull Rect rect2, int i3) {
        Api17Impl.applyDisplay(i2, rect, rect2, i3);
    }

    public static int getAbsoluteGravity(int i2, int i3) {
        return Gravity.getAbsoluteGravity(i2, i3);
    }
}
