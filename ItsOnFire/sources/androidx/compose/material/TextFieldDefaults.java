package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jç\u0001\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u00112\b\b\u0002\u0010\u001d\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010 \u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010#\u001a\u00020\u00112\b\b\u0002\u0010$\u001a\u00020\u00112\b\b\u0002\u0010%\u001a\u00020\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'Jç\u0001\u0010(\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00112\b\b\u0002\u0010)\u001a\u00020\u00112\b\b\u0002\u0010*\u001a\u00020\u00112\b\b\u0002\u0010+\u001a\u00020\u00112\b\b\u0002\u0010,\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u00112\b\b\u0002\u0010\u001d\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010 \u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010#\u001a\u00020\u00112\b\b\u0002\u0010$\u001a\u00020\u00112\b\b\u0002\u0010%\u001a\u00020\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010'R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\tR\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, d2 = {"Landroidx/compose/material/TextFieldDefaults;", "", "()V", "BackgroundOpacity", "", "IconOpacity", "MinHeight", "Landroidx/compose/ui/unit/Dp;", "getMinHeight-D9Ej5fM", "()F", "F", "MinWidth", "getMinWidth-D9Ej5fM", "UnfocusedIndicatorLineOpacity", "outlinedTextFieldColors", "Landroidx/compose/material/TextFieldColors;", "textColor", "Landroidx/compose/ui/graphics/Color;", "disabledTextColor", "backgroundColor", "cursorColor", "errorCursorColor", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "trailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "outlinedTextFieldColors-dx8h9Zs", "(JJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material/TextFieldColors;", "textFieldColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "textFieldColors-dx8h9Zs", "material_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TextFieldDefaults {
    public static final int $stable = 0;
    public static final float BackgroundOpacity = 0.12f;
    public static final float IconOpacity = 0.54f;
    public static final float UnfocusedIndicatorLineOpacity = 0.42f;
    @NotNull
    public static final TextFieldDefaults INSTANCE = new TextFieldDefaults();
    private static final float MinHeight = Dp.m3325constructorimpl(56);
    private static final float MinWidth = Dp.m3325constructorimpl(280);

    private TextFieldDefaults() {
    }

    /* renamed from: getMinHeight-D9Ej5fM  reason: not valid java name */
    public final float m1002getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM  reason: not valid java name */
    public final float m1003getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    @Composable
    @NotNull
    /* renamed from: outlinedTextFieldColors-dx8h9Zs  reason: not valid java name */
    public final TextFieldColors m1004outlinedTextFieldColorsdx8h9Zs(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, @Nullable Composer composer, int i2, int i3, int i4, int i5) {
        composer.startReplaceableGroup(-429563994);
        long m1391copywmQWz5c$default = (i5 & 1) != 0 ? Color.m1391copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m1402unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long m1391copywmQWz5c$default2 = (i5 & 2) != 0 ? Color.m1391copywmQWz5c$default(m1391copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long m1427getTransparent0d7_KjU = (i5 & 4) != 0 ? Color.Companion.m1427getTransparent0d7_KjU() : j4;
        long m767getPrimary0d7_KjU = (i5 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m767getPrimary0d7_KjU() : j5;
        long m761getError0d7_KjU = (i5 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m761getError0d7_KjU() : j6;
        long m1391copywmQWz5c$default3 = (i5 & 32) != 0 ? Color.m1391copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m767getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long m1391copywmQWz5c$default4 = (i5 & 64) != 0 ? Color.m1391copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m766getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j8;
        long m1391copywmQWz5c$default5 = (i5 & 128) != 0 ? Color.m1391copywmQWz5c$default(m1391copywmQWz5c$default4, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j9;
        long m761getError0d7_KjU2 = (i5 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m761getError0d7_KjU() : j10;
        long m1391copywmQWz5c$default6 = (i5 & 512) != 0 ? Color.m1391copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m766getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long m1391copywmQWz5c$default7 = (i5 & 1024) != 0 ? Color.m1391copywmQWz5c$default(m1391copywmQWz5c$default6, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long j23 = (i5 & 2048) != 0 ? m1391copywmQWz5c$default6 : j13;
        long m1391copywmQWz5c$default8 = (i5 & 4096) != 0 ? Color.m1391copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m766getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long m1391copywmQWz5c$default9 = (i5 & 8192) != 0 ? Color.m1391copywmQWz5c$default(m1391copywmQWz5c$default8, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long m761getError0d7_KjU3 = (i5 & 16384) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m761getError0d7_KjU() : j16;
        long m1391copywmQWz5c$default10 = (32768 & i5) != 0 ? Color.m1391copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m767getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long m1391copywmQWz5c$default11 = (65536 & i5) != 0 ? Color.m1391copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m766getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j18;
        long m1391copywmQWz5c$default12 = (131072 & i5) != 0 ? Color.m1391copywmQWz5c$default(m1391copywmQWz5c$default11, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j19;
        long m761getError0d7_KjU4 = (262144 & i5) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m761getError0d7_KjU() : j20;
        long m1391copywmQWz5c$default13 = (524288 & i5) != 0 ? Color.m1391copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m766getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j21;
        DefaultTextFieldColors defaultTextFieldColors = new DefaultTextFieldColors(m1391copywmQWz5c$default, m1391copywmQWz5c$default2, m767getPrimary0d7_KjU, m761getError0d7_KjU, m1391copywmQWz5c$default3, m1391copywmQWz5c$default4, m761getError0d7_KjU2, m1391copywmQWz5c$default5, m1391copywmQWz5c$default6, m1391copywmQWz5c$default7, j23, m1391copywmQWz5c$default8, m1391copywmQWz5c$default9, m761getError0d7_KjU3, m1427getTransparent0d7_KjU, m1391copywmQWz5c$default10, m1391copywmQWz5c$default11, m1391copywmQWz5c$default12, m761getError0d7_KjU4, m1391copywmQWz5c$default13, (i5 & 1048576) != 0 ? Color.m1391copywmQWz5c$default(m1391copywmQWz5c$default13, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j22, null);
        composer.endReplaceableGroup();
        return defaultTextFieldColors;
    }

    @Composable
    @NotNull
    /* renamed from: textFieldColors-dx8h9Zs  reason: not valid java name */
    public final TextFieldColors m1005textFieldColorsdx8h9Zs(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, @Nullable Composer composer, int i2, int i3, int i4, int i5) {
        composer.startReplaceableGroup(137434936);
        long m1391copywmQWz5c$default = (i5 & 1) != 0 ? Color.m1391copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m1402unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long m1391copywmQWz5c$default2 = (i5 & 2) != 0 ? Color.m1391copywmQWz5c$default(m1391copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long m1391copywmQWz5c$default3 = (i5 & 4) != 0 ? Color.m1391copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m766getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j4;
        long m767getPrimary0d7_KjU = (i5 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m767getPrimary0d7_KjU() : j5;
        long m761getError0d7_KjU = (i5 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m761getError0d7_KjU() : j6;
        long m1391copywmQWz5c$default4 = (i5 & 32) != 0 ? Color.m1391copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m767getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long m1391copywmQWz5c$default5 = (i5 & 64) != 0 ? Color.m1391copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m766getOnSurface0d7_KjU(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null) : j8;
        long m1391copywmQWz5c$default6 = (i5 & 128) != 0 ? Color.m1391copywmQWz5c$default(m1391copywmQWz5c$default5, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j9;
        long m761getError0d7_KjU2 = (i5 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m761getError0d7_KjU() : j10;
        long m1391copywmQWz5c$default7 = (i5 & 512) != 0 ? Color.m1391copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m766getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long m1391copywmQWz5c$default8 = (i5 & 1024) != 0 ? Color.m1391copywmQWz5c$default(m1391copywmQWz5c$default7, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long j23 = (i5 & 2048) != 0 ? m1391copywmQWz5c$default7 : j13;
        long m1391copywmQWz5c$default9 = (i5 & 4096) != 0 ? Color.m1391copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m766getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long m1391copywmQWz5c$default10 = (i5 & 8192) != 0 ? Color.m1391copywmQWz5c$default(m1391copywmQWz5c$default9, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long m761getError0d7_KjU3 = (i5 & 16384) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m761getError0d7_KjU() : j16;
        long m1391copywmQWz5c$default11 = (32768 & i5) != 0 ? Color.m1391copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m767getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long m1391copywmQWz5c$default12 = (65536 & i5) != 0 ? Color.m1391copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m766getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j18;
        long m1391copywmQWz5c$default13 = (131072 & i5) != 0 ? Color.m1391copywmQWz5c$default(m1391copywmQWz5c$default12, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j19;
        long m761getError0d7_KjU4 = (262144 & i5) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m761getError0d7_KjU() : j20;
        long m1391copywmQWz5c$default14 = (524288 & i5) != 0 ? Color.m1391copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m766getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j21;
        DefaultTextFieldColors defaultTextFieldColors = new DefaultTextFieldColors(m1391copywmQWz5c$default, m1391copywmQWz5c$default2, m767getPrimary0d7_KjU, m761getError0d7_KjU, m1391copywmQWz5c$default4, m1391copywmQWz5c$default5, m761getError0d7_KjU2, m1391copywmQWz5c$default6, m1391copywmQWz5c$default7, m1391copywmQWz5c$default8, j23, m1391copywmQWz5c$default9, m1391copywmQWz5c$default10, m761getError0d7_KjU3, m1391copywmQWz5c$default3, m1391copywmQWz5c$default11, m1391copywmQWz5c$default12, m1391copywmQWz5c$default13, m761getError0d7_KjU4, m1391copywmQWz5c$default14, (i5 & 1048576) != 0 ? Color.m1391copywmQWz5c$default(m1391copywmQWz5c$default14, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j22, null);
        composer.endReplaceableGroup();
        return defaultTextFieldColors;
    }
}
