package androidx.core.widget;

import android.widget.ListView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public final class ListViewCompat {

    @RequiresApi(19)
    /* loaded from: classes.dex */
    public static class Api19Impl {
        private Api19Impl() {
        }

        @DoNotInline
        public static boolean canScrollList(ListView listView, int i2) {
            return listView.canScrollList(i2);
        }

        @DoNotInline
        public static void scrollListBy(ListView listView, int i2) {
            listView.scrollListBy(i2);
        }
    }

    private ListViewCompat() {
    }

    public static boolean canScrollList(@NonNull ListView listView, int i2) {
        return Api19Impl.canScrollList(listView, i2);
    }

    public static void scrollListBy(@NonNull ListView listView, int i2) {
        Api19Impl.scrollListBy(listView, i2);
    }
}
