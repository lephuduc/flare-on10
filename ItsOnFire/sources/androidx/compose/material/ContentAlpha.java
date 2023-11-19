package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u000eR\u0011\u0010\u0003\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006¨\u0006\u000f"}, d2 = {"Landroidx/compose/material/ContentAlpha;", "", "()V", "disabled", "", "getDisabled", "(Landroidx/compose/runtime/Composer;I)F", "high", "getHigh", "medium", "getMedium", "contentAlpha", "highContrastAlpha", "lowContrastAlpha", "(FFLandroidx/compose/runtime/Composer;I)F", "material_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ContentAlpha {
    public static final int $stable = 0;
    @NotNull
    public static final ContentAlpha INSTANCE = new ContentAlpha();

    private ContentAlpha() {
    }

    @Composable
    private final float contentAlpha(float f2, float f3, Composer composer, int i2) {
        composer.startReplaceableGroup(-1499253717);
        long m1402unboximpl = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m1402unboximpl();
        if (!MaterialTheme.INSTANCE.getColors(composer, 6).isLight() ? ColorKt.m1445luminance8_81llA(m1402unboximpl) >= 0.5d : ColorKt.m1445luminance8_81llA(m1402unboximpl) <= 0.5d) {
            f2 = f3;
        }
        composer.endReplaceableGroup();
        return f2;
    }

    @Composable
    @JvmName(name = "getDisabled")
    public final float getDisabled(@Nullable Composer composer, int i2) {
        composer.startReplaceableGroup(-651892877);
        float contentAlpha = contentAlpha(0.38f, 0.38f, composer, ((i2 << 6) & 896) | 54);
        composer.endReplaceableGroup();
        return contentAlpha;
    }

    @Composable
    @JvmName(name = "getHigh")
    public final float getHigh(@Nullable Composer composer, int i2) {
        composer.startReplaceableGroup(-1305244065);
        float contentAlpha = contentAlpha(1.0f, 0.87f, composer, ((i2 << 6) & 896) | 54);
        composer.endReplaceableGroup();
        return contentAlpha;
    }

    @Composable
    @JvmName(name = "getMedium")
    public final float getMedium(@Nullable Composer composer, int i2) {
        composer.startReplaceableGroup(575700177);
        float contentAlpha = contentAlpha(0.74f, 0.6f, composer, ((i2 << 6) & 896) | 54);
        composer.endReplaceableGroup();
        return contentAlpha;
    }
}
