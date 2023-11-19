package androidx.compose.ui.res;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import androidx.appcompat.R;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.compat.XmlVectorParser_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ImageVectorCache;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a)\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u00060\u000bR\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\u000f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"errorMessage", "", "loadImageBitmapResource", "Landroidx/compose/ui/graphics/ImageBitmap;", "res", "Landroid/content/res/Resources;", "id", "", "loadVectorResource", "Landroidx/compose/ui/graphics/vector/ImageVector;", "theme", "Landroid/content/res/Resources$Theme;", "(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/vector/ImageVector;", "painterResource", "Landroidx/compose/ui/graphics/painter/Painter;", "(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class PainterResources_androidKt {
    @NotNull
    private static final String errorMessage = "Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG";

    private static final ImageBitmap loadImageBitmapResource(Resources resources, int i2) {
        return ImageResources_androidKt.imageResource(ImageBitmap.Companion, resources, i2);
    }

    @Composable
    private static final ImageVector loadVectorResource(Resources.Theme theme, Resources resources, int i2, Composer composer, int i3) {
        composer.startReplaceableGroup(-995791636);
        ImageVectorCache imageVectorCache = (ImageVectorCache) composer.consume(AndroidCompositionLocals_androidKt.getLocalImageVectorCache());
        ImageVectorCache.Key key = new ImageVectorCache.Key(theme, i2);
        ImageVectorCache.ImageVectorEntry imageVectorEntry = imageVectorCache.get(key);
        if (imageVectorEntry == null) {
            XmlResourceParser xml = resources.getXml(i2);
            Intrinsics.checkNotNullExpressionValue(xml, "res.getXml(id)");
            if (!Intrinsics.areEqual(XmlVectorParser_androidKt.seekToStartTag(xml).getName(), "vector")) {
                throw new IllegalArgumentException(errorMessage);
            }
            imageVectorEntry = VectorResources_androidKt.loadVectorResourceInner(theme, resources, xml);
            imageVectorCache.set(key, imageVectorEntry);
        }
        ImageVector imageVector = imageVectorEntry.getImageVector();
        composer.endReplaceableGroup();
        return imageVector;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0046, code lost:
        if (r6 == true) goto L7;
     */
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.graphics.painter.Painter painterResource(@androidx.annotation.DrawableRes int r9, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r10, int r11) {
        /*
            r0 = -738265664(0xffffffffd3fef5c0, float:-2.19008939E12)
            r10.startReplaceableGroup(r0)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()
            java.lang.Object r0 = r10.consume(r0)
            android.content.Context r0 = (android.content.Context) r0
            android.content.res.Resources r1 = r0.getResources()
            r2 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r10.startReplaceableGroup(r2)
            java.lang.Object r2 = r10.rememberedValue()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r4 = r3.getEmpty()
            if (r2 != r4) goto L2e
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r10.updateRememberedValue(r2)
        L2e:
            r10.endReplaceableGroup()
            android.util.TypedValue r2 = (android.util.TypedValue) r2
            r4 = 1
            r1.getValue(r9, r2, r4)
            java.lang.CharSequence r2 = r2.string
            r5 = 0
            if (r2 != 0) goto L3e
        L3c:
            r4 = r5
            goto L48
        L3e:
            r6 = 2
            r7 = 0
            java.lang.String r8 = ".xml"
            boolean r6 = kotlin.text.StringsKt.endsWith$default(r2, r8, r5, r6, r7)
            if (r6 != r4) goto L3c
        L48:
            java.lang.String r6 = "res"
            if (r4 == 0) goto L70
            r2 = -738265321(0xffffffffd3fef717, float:-2.19013435E12)
            r10.startReplaceableGroup(r2)
            android.content.res.Resources$Theme r0 = r0.getTheme()
            java.lang.String r2 = "context.theme"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r6)
            int r11 = r11 << 6
            r11 = r11 & 896(0x380, float:1.256E-42)
            r11 = r11 | 72
            androidx.compose.ui.graphics.vector.ImageVector r9 = loadVectorResource(r0, r1, r9, r10, r11)
            androidx.compose.ui.graphics.vector.VectorPainter r9 = androidx.compose.ui.graphics.vector.VectorPainterKt.rememberVectorPainter(r9, r10, r5)
        L6c:
            r10.endReplaceableGroup()
            goto Lb2
        L70:
            r11 = -738265196(0xffffffffd3fef794, float:-2.19015073E12)
            r10.startReplaceableGroup(r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r0 = -3686552(0xffffffffffc7bf68, float:NaN)
            r10.startReplaceableGroup(r0)
            boolean r0 = r10.changed(r2)
            boolean r11 = r10.changed(r11)
            r11 = r11 | r0
            java.lang.Object r0 = r10.rememberedValue()
            if (r11 != 0) goto L95
            java.lang.Object r11 = r3.getEmpty()
            if (r0 != r11) goto L9f
        L95:
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r6)
            androidx.compose.ui.graphics.ImageBitmap r0 = loadImageBitmapResource(r1, r9)
            r10.updateRememberedValue(r0)
        L9f:
            r10.endReplaceableGroup()
            r2 = r0
            androidx.compose.ui.graphics.ImageBitmap r2 = (androidx.compose.ui.graphics.ImageBitmap) r2
            androidx.compose.ui.graphics.painter.BitmapPainter r9 = new androidx.compose.ui.graphics.painter.BitmapPainter
            r3 = 0
            r5 = 0
            r7 = 6
            r8 = 0
            r1 = r9
            r1.<init>(r2, r3, r5, r7, r8)
            goto L6c
        Lb2:
            r10.endReplaceableGroup()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.res.PainterResources_androidKt.painterResource(int, androidx.compose.runtime.Composer, int):androidx.compose.ui.graphics.painter.Painter");
    }
}
