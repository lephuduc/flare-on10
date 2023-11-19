package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J=\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'J3\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.JG\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020\u00042\b\b\u0002\u0010/\u001a\u00020\u00042\b\b\u0002\u00100\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102J3\u00103\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105J3\u00106\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b7\u00105R\u0019\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u0006\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u000f\u0010\rR\u001c\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0011\u0010\rR\u001c\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0013\u0010\rR\u000e\u0010\u0014\u001a\u00020\u0015X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0017\u0010\rR\u0011\u0010\u0018\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\nR\u0019\u0010\u001a\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\u001b\u001a\u00020\u001c8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00068"}, d2 = {"Landroidx/compose/material/ButtonDefaults;", "", "()V", "ButtonHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ButtonVerticalPadding", "ContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "IconSize", "getIconSize-D9Ej5fM", "()F", "IconSpacing", "getIconSpacing-D9Ej5fM", "MinHeight", "getMinHeight-D9Ej5fM", "MinWidth", "getMinWidth-D9Ej5fM", "OutlinedBorderOpacity", "", "OutlinedBorderSize", "getOutlinedBorderSize-D9Ej5fM", "TextButtonContentPadding", "getTextButtonContentPadding", "TextButtonHorizontalPadding", "outlinedBorder", "Landroidx/compose/foundation/BorderStroke;", "getOutlinedBorder", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "buttonColors", "Landroidx/compose/material/ButtonColors;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "disabledBackgroundColor", "disabledContentColor", "buttonColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonColors;", "elevation", "Landroidx/compose/material/ButtonElevation;", "defaultElevation", "pressedElevation", "disabledElevation", "elevation-yajeYGU", "(FFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonElevation;", "hoveredElevation", "focusedElevation", "elevation-R_JCAzs", "(FFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonElevation;", "outlinedButtonColors", "outlinedButtonColors-RGew2ao", "(JJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonColors;", "textButtonColors", "textButtonColors-RGew2ao", "material_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ButtonDefaults {
    public static final int $stable = 0;
    private static final float ButtonHorizontalPadding;
    private static final float ButtonVerticalPadding;
    @NotNull
    private static final PaddingValues ContentPadding;
    @NotNull
    public static final ButtonDefaults INSTANCE = new ButtonDefaults();
    private static final float IconSize;
    private static final float IconSpacing;
    private static final float MinHeight;
    private static final float MinWidth;
    public static final float OutlinedBorderOpacity = 0.12f;
    private static final float OutlinedBorderSize;
    @NotNull
    private static final PaddingValues TextButtonContentPadding;
    private static final float TextButtonHorizontalPadding;

    static {
        float m3325constructorimpl = Dp.m3325constructorimpl(16);
        ButtonHorizontalPadding = m3325constructorimpl;
        float f2 = 8;
        float m3325constructorimpl2 = Dp.m3325constructorimpl(f2);
        ButtonVerticalPadding = m3325constructorimpl2;
        PaddingValues m360PaddingValuesa9UjIt4 = PaddingKt.m360PaddingValuesa9UjIt4(m3325constructorimpl, m3325constructorimpl2, m3325constructorimpl, m3325constructorimpl2);
        ContentPadding = m360PaddingValuesa9UjIt4;
        MinWidth = Dp.m3325constructorimpl(64);
        MinHeight = Dp.m3325constructorimpl(36);
        IconSize = Dp.m3325constructorimpl(18);
        IconSpacing = Dp.m3325constructorimpl(f2);
        OutlinedBorderSize = Dp.m3325constructorimpl(1);
        float m3325constructorimpl3 = Dp.m3325constructorimpl(f2);
        TextButtonHorizontalPadding = m3325constructorimpl3;
        TextButtonContentPadding = PaddingKt.m360PaddingValuesa9UjIt4(m3325constructorimpl3, m360PaddingValuesa9UjIt4.mo376calculateTopPaddingD9Ej5fM(), m3325constructorimpl3, m360PaddingValuesa9UjIt4.mo373calculateBottomPaddingD9Ej5fM());
    }

    private ButtonDefaults() {
    }

    @Composable
    @NotNull
    /* renamed from: buttonColors-ro_MJ88  reason: not valid java name */
    public final ButtonColors m729buttonColorsro_MJ88(long j2, long j3, long j4, long j5, @Nullable Composer composer, int i2, int i3) {
        long j6;
        composer.startReplaceableGroup(2063545420);
        long m767getPrimary0d7_KjU = (i3 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m767getPrimary0d7_KjU() : j2;
        long m785contentColorForek8zF_U = (i3 & 2) != 0 ? ColorsKt.m785contentColorForek8zF_U(m767getPrimary0d7_KjU, composer, i2 & 14) : j3;
        if ((i3 & 4) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            j6 = ColorKt.m1438compositeOverOWjLjI(Color.m1391copywmQWz5c$default(materialTheme.getColors(composer, 6).m766getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, 6).m771getSurface0d7_KjU());
        } else {
            j6 = j4;
        }
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(m767getPrimary0d7_KjU, m785contentColorForek8zF_U, j6, (i3 & 8) != 0 ? Color.m1391copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m766getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j5, null);
        composer.endReplaceableGroup();
        return defaultButtonColors;
    }

    @Composable
    @NotNull
    /* renamed from: elevation-R_JCAzs  reason: not valid java name */
    public final ButtonElevation m730elevationR_JCAzs(float f2, float f3, float f4, float f5, float f6, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(399130879);
        if ((i3 & 1) != 0) {
            f2 = Dp.m3325constructorimpl(2);
        }
        float f7 = f2;
        if ((i3 & 2) != 0) {
            f3 = Dp.m3325constructorimpl(8);
        }
        float f8 = f3;
        int i4 = 0;
        if ((i3 & 4) != 0) {
            f4 = Dp.m3325constructorimpl(0);
        }
        float f9 = f4;
        if ((i3 & 8) != 0) {
            f5 = Dp.m3325constructorimpl(4);
        }
        float f10 = f5;
        if ((i3 & 16) != 0) {
            f6 = Dp.m3325constructorimpl(4);
        }
        float f11 = f6;
        Object[] objArr = {Dp.m3323boximpl(f7), Dp.m3323boximpl(f8), Dp.m3323boximpl(f9), Dp.m3323boximpl(f10), Dp.m3323boximpl(f11)};
        composer.startReplaceableGroup(-3685570);
        boolean z = false;
        while (i4 < 5) {
            Object obj = objArr[i4];
            i4++;
            z |= composer.changed(obj);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DefaultButtonElevation(f7, f8, f9, f10, f11, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DefaultButtonElevation defaultButtonElevation = (DefaultButtonElevation) rememberedValue;
        composer.endReplaceableGroup();
        return defaultButtonElevation;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use another overload of elevation")
    @Composable
    /* renamed from: elevation-yajeYGU  reason: not valid java name */
    public final /* synthetic */ ButtonElevation m731elevationyajeYGU(float f2, float f3, float f4, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(399129837);
        if ((i3 & 1) != 0) {
            f2 = Dp.m3325constructorimpl(2);
        }
        float f5 = f2;
        if ((i3 & 2) != 0) {
            f3 = Dp.m3325constructorimpl(8);
        }
        float f6 = f3;
        if ((i3 & 4) != 0) {
            f4 = Dp.m3325constructorimpl(0);
        }
        float f7 = 4;
        ButtonElevation m730elevationR_JCAzs = m730elevationR_JCAzs(f5, f6, f4, Dp.m3325constructorimpl(f7), Dp.m3325constructorimpl(f7), composer, (i2 & 14) | 27648 | (i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i2 & 896) | (458752 & (i2 << 6)), 0);
        composer.endReplaceableGroup();
        return m730elevationR_JCAzs;
    }

    @NotNull
    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    /* renamed from: getIconSize-D9Ej5fM  reason: not valid java name */
    public final float m732getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* renamed from: getIconSpacing-D9Ej5fM  reason: not valid java name */
    public final float m733getIconSpacingD9Ej5fM() {
        return IconSpacing;
    }

    /* renamed from: getMinHeight-D9Ej5fM  reason: not valid java name */
    public final float m734getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM  reason: not valid java name */
    public final float m735getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    @Composable
    @JvmName(name = "getOutlinedBorder")
    @NotNull
    public final BorderStroke getOutlinedBorder(@Nullable Composer composer, int i2) {
        composer.startReplaceableGroup(-1546585730);
        BorderStroke m166BorderStrokecXLIe8U = BorderStrokeKt.m166BorderStrokecXLIe8U(m736getOutlinedBorderSizeD9Ej5fM(), Color.m1391copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m766getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null));
        composer.endReplaceableGroup();
        return m166BorderStrokecXLIe8U;
    }

    /* renamed from: getOutlinedBorderSize-D9Ej5fM  reason: not valid java name */
    public final float m736getOutlinedBorderSizeD9Ej5fM() {
        return OutlinedBorderSize;
    }

    @NotNull
    public final PaddingValues getTextButtonContentPadding() {
        return TextButtonContentPadding;
    }

    @Composable
    @NotNull
    /* renamed from: outlinedButtonColors-RGew2ao  reason: not valid java name */
    public final ButtonColors m737outlinedButtonColorsRGew2ao(long j2, long j3, long j4, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(706919231);
        long m771getSurface0d7_KjU = (i3 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m771getSurface0d7_KjU() : j2;
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(m771getSurface0d7_KjU, (i3 & 2) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m767getPrimary0d7_KjU() : j3, m771getSurface0d7_KjU, (i3 & 4) != 0 ? Color.m1391copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m766getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j4, null);
        composer.endReplaceableGroup();
        return defaultButtonColors;
    }

    @Composable
    @NotNull
    /* renamed from: textButtonColors-RGew2ao  reason: not valid java name */
    public final ButtonColors m738textButtonColorsRGew2ao(long j2, long j3, long j4, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1409305054);
        long m1427getTransparent0d7_KjU = (i3 & 1) != 0 ? Color.Companion.m1427getTransparent0d7_KjU() : j2;
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(m1427getTransparent0d7_KjU, (i3 & 2) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m767getPrimary0d7_KjU() : j3, m1427getTransparent0d7_KjU, (i3 & 4) != 0 ? Color.m1391copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m766getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j4, null);
        composer.endReplaceableGroup();
        return defaultButtonColors;
    }
}
