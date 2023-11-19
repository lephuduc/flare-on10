package androidx.compose.ui.text.font;

import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@RequiresApi(26)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFileDescriptorHelper;", "", "()V", "create", "Landroid/graphics/Typeface;", "fileDescriptor", "Landroid/os/ParcelFileDescriptor;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
final class AndroidFileDescriptorHelper {
    @NotNull
    public static final AndroidFileDescriptorHelper INSTANCE = new AndroidFileDescriptorHelper();

    private AndroidFileDescriptorHelper() {
    }

    @DoNotInline
    @RequiresApi(26)
    @NotNull
    public final android.graphics.Typeface create(@NotNull ParcelFileDescriptor fileDescriptor) {
        Intrinsics.checkNotNullParameter(fileDescriptor, "fileDescriptor");
        android.graphics.Typeface build = new Typeface.Builder(fileDescriptor.getFileDescriptor()).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder(fileDescriptor.fileDescriptor).build()");
        return build;
    }
}
