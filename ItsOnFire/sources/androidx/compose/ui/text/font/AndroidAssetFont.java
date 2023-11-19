package androidx.compose.ui.text.font;

import android.content.res.AssetManager;
import androidx.appcompat.R;
import androidx.appcompat.widget.ActivityChooserModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B,\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\tø\u0001\u0000¢\u0006\u0002\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\b\u001a\u00020\tX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\n \u0017*\u0004\u0018\u00010\u00130\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/text/font/AndroidAssetFont;", "Landroidx/compose/ui/text/font/AndroidFont;", "assetManager", "Landroid/content/res/AssetManager;", "path", "", ActivityChooserModel.ATTRIBUTE_WEIGHT, "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "(Landroid/content/res/AssetManager;Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAssetManager", "()Landroid/content/res/AssetManager;", "getPath", "()Ljava/lang/String;", "getStyle-_-LCdwA", "()I", "I", "typeface", "Landroid/graphics/Typeface;", "getTypeface", "()Landroid/graphics/Typeface;", "typefaceInternal", "kotlin.jvm.PlatformType", "getWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class AndroidAssetFont implements AndroidFont {
    @NotNull
    private final AssetManager assetManager;
    @NotNull
    private final String path;
    private final int style;
    private final android.graphics.Typeface typefaceInternal;
    @NotNull
    private final FontWeight weight;

    private AndroidAssetFont(AssetManager assetManager, String str, FontWeight fontWeight, int i2) {
        this.assetManager = assetManager;
        this.path = str;
        this.weight = fontWeight;
        this.style = i2;
        this.typefaceInternal = android.graphics.Typeface.createFromAsset(assetManager, str);
    }

    public /* synthetic */ AndroidAssetFont(AssetManager assetManager, String str, FontWeight fontWeight, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(assetManager, str, (i3 & 4) != 0 ? FontWeight.Companion.getNormal() : fontWeight, (i3 & 8) != 0 ? FontStyle.Companion.m3117getNormal_LCdwA() : i2, null);
    }

    public /* synthetic */ AndroidAssetFont(AssetManager assetManager, String str, FontWeight fontWeight, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(assetManager, str, fontWeight, i2);
    }

    @NotNull
    public final AssetManager getAssetManager() {
        return this.assetManager;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    @Override // androidx.compose.ui.text.font.Font
    /* renamed from: getStyle-_-LCdwA  reason: not valid java name */
    public int mo3097getStyle_LCdwA() {
        return this.style;
    }

    @Override // androidx.compose.ui.text.font.AndroidFont
    @NotNull
    public android.graphics.Typeface getTypeface() {
        android.graphics.Typeface typefaceInternal = this.typefaceInternal;
        Intrinsics.checkNotNullExpressionValue(typefaceInternal, "typefaceInternal");
        return typefaceInternal;
    }

    @Override // androidx.compose.ui.text.font.Font
    @NotNull
    public FontWeight getWeight() {
        return this.weight;
    }
}
