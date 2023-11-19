package androidx.core.view;

import android.app.Activity;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* loaded from: classes.dex */
public final class DragAndDropPermissionsCompat {
    private final DragAndDropPermissions mDragAndDropPermissions;

    @RequiresApi(24)
    /* loaded from: classes.dex */
    public static class Api24Impl {
        private Api24Impl() {
        }

        @DoNotInline
        public static void release(DragAndDropPermissions dragAndDropPermissions) {
            dragAndDropPermissions.release();
        }

        @DoNotInline
        public static DragAndDropPermissions requestDragAndDropPermissions(Activity activity, DragEvent dragEvent) {
            return activity.requestDragAndDropPermissions(dragEvent);
        }
    }

    private DragAndDropPermissionsCompat(DragAndDropPermissions dragAndDropPermissions) {
        this.mDragAndDropPermissions = dragAndDropPermissions;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static DragAndDropPermissionsCompat request(@NonNull Activity activity, @NonNull DragEvent dragEvent) {
        DragAndDropPermissions requestDragAndDropPermissions = Api24Impl.requestDragAndDropPermissions(activity, dragEvent);
        if (requestDragAndDropPermissions != null) {
            return new DragAndDropPermissionsCompat(requestDragAndDropPermissions);
        }
        return null;
    }

    public void release() {
        Api24Impl.release(this.mDragAndDropPermissions);
    }
}
