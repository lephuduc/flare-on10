package androidx.compose.foundation;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.layout.ContentScale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ImageKt$Image$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ Alignment $alignment;
    public final /* synthetic */ float $alpha;
    public final /* synthetic */ ImageBitmap $bitmap;
    public final /* synthetic */ ColorFilter $colorFilter;
    public final /* synthetic */ String $contentDescription;
    public final /* synthetic */ ContentScale $contentScale;
    public final /* synthetic */ int $filterQuality;
    public final /* synthetic */ Modifier $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageKt$Image$2(ImageBitmap imageBitmap, String str, Modifier modifier, Alignment alignment, ContentScale contentScale, float f2, ColorFilter colorFilter, int i2, int i3, int i4) {
        super(2);
        this.$bitmap = imageBitmap;
        this.$contentDescription = str;
        this.$modifier = modifier;
        this.$alignment = alignment;
        this.$contentScale = contentScale;
        this.$alpha = f2;
        this.$colorFilter = colorFilter;
        this.$filterQuality = i2;
        this.$$changed = i3;
        this.$$default = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        ImageKt.m192Image5hnEew(this.$bitmap, this.$contentDescription, this.$modifier, this.$alignment, this.$contentScale, this.$alpha, this.$colorFilter, this.$filterQuality, composer, this.$$changed | 1, this.$$default);
    }
}
