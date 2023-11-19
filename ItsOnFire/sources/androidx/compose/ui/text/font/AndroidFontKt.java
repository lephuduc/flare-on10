package androidx.compose.ui.text.font;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import androidx.annotation.RequiresApi;
import androidx.appcompat.R;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.ExperimentalTextApi;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u0012\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Font", "Landroidx/compose/ui/text/font/Font;", "assetManager", "Landroid/content/res/AssetManager;", "path", "", ActivityChooserModel.ATTRIBUTE_WEIGHT, "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "Font-wCLgNak", "(Landroid/content/res/AssetManager;Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/Font;", "fileDescriptor", "Landroid/os/ParcelFileDescriptor;", "Font-RetOiIg", "(Landroid/os/ParcelFileDescriptor;Landroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/Font;", "file", "Ljava/io/File;", "(Ljava/io/File;Landroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/Font;", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class AndroidFontKt {
    @ExperimentalTextApi
    @NotNull
    @Stable
    @RequiresApi(26)
    /* renamed from: Font-RetOiIg  reason: not valid java name */
    public static final Font m3098FontRetOiIg(@NotNull ParcelFileDescriptor fileDescriptor, @NotNull FontWeight weight, int i2) {
        Intrinsics.checkNotNullParameter(fileDescriptor, "fileDescriptor");
        Intrinsics.checkNotNullParameter(weight, "weight");
        return new AndroidFileDescriptorFont(fileDescriptor, weight, i2, null);
    }

    @Stable
    @ExperimentalTextApi
    @NotNull
    /* renamed from: Font-RetOiIg  reason: not valid java name */
    public static final Font m3099FontRetOiIg(@NotNull File file, @NotNull FontWeight weight, int i2) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(weight, "weight");
        return new AndroidFileFont(file, weight, i2, null);
    }

    /* renamed from: Font-RetOiIg$default  reason: not valid java name */
    public static /* synthetic */ Font m3100FontRetOiIg$default(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i3 & 4) != 0) {
            i2 = FontStyle.Companion.m3117getNormal_LCdwA();
        }
        return m3098FontRetOiIg(parcelFileDescriptor, fontWeight, i2);
    }

    /* renamed from: Font-RetOiIg$default  reason: not valid java name */
    public static /* synthetic */ Font m3101FontRetOiIg$default(File file, FontWeight fontWeight, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i3 & 4) != 0) {
            i2 = FontStyle.Companion.m3117getNormal_LCdwA();
        }
        return m3099FontRetOiIg(file, fontWeight, i2);
    }

    @Stable
    @ExperimentalTextApi
    @NotNull
    /* renamed from: Font-wCLgNak  reason: not valid java name */
    public static final Font m3102FontwCLgNak(@NotNull AssetManager assetManager, @NotNull String path, @NotNull FontWeight weight, int i2) {
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(weight, "weight");
        return new AndroidAssetFont(assetManager, path, weight, i2, null);
    }

    /* renamed from: Font-wCLgNak$default  reason: not valid java name */
    public static /* synthetic */ Font m3103FontwCLgNak$default(AssetManager assetManager, String str, FontWeight fontWeight, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i3 & 8) != 0) {
            i2 = FontStyle.Companion.m3117getNormal_LCdwA();
        }
        return m3102FontwCLgNak(assetManager, str, fontWeight, i2);
    }
}
