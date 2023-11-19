package androidx.compose.material;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.math.MathKt__MathJVMKt;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aÖ\u0001\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\b\b2\u0019\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n¢\u0006\u0002\b\b2\u0013\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0013\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0017H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0087\u0002\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020!2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00050\n2\b\b\u0002\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u00102\b\b\u0002\u0010%\u001a\u00020\u00102\b\b\u0002\u0010&\u001a\u00020'2\u0015\b\u0002\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0015\b\u0002\u0010(\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0015\b\u0002\u0010)\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0002\b\b2\b\b\u0002\u0010*\u001a\u00020\u00102\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u0002002\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u00101\u001a\u0002022\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u00105\u001a\u000206H\u0007¢\u0006\u0002\u00107\u001a\u0087\u0002\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u0002082\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u00050\n2\b\b\u0002\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u00102\b\b\u0002\u0010%\u001a\u00020\u00102\b\b\u0002\u0010&\u001a\u00020'2\u0015\b\u0002\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0015\b\u0002\u0010(\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0015\b\u0002\u0010)\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0002\b\b2\b\b\u0002\u0010*\u001a\u00020\u00102\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u0002002\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u00101\u001a\u0002022\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u00105\u001a\u000206H\u0007¢\u0006\u0002\u00109\u001a\u009d\u0002\u0010:\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020!2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u00102\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u0010&\u001a\u00020'2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u00101\u001a\u0002022\u0006\u0010+\u001a\u00020,2\u0006\u00103\u001a\u0002042\u0019\u0010;\u001a\u0015\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n¢\u0006\u0002\b\b2\u0013\u0010<\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0013\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010=\u001a\u00020\u00152\u0006\u0010>\u001a\u00020\u00012\u0006\u0010?\u001a\u00020\u00122\u0006\u0010@\u001a\u00020\u00122\u0006\u0010A\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bB\u0010C\u001aM\u0010D\u001a\u0002022\u0006\u0010E\u001a\u0002022\u0006\u0010F\u001a\u0002022\u0006\u0010G\u001a\u0002022\u0006\u0010H\u001a\u0002022\u0006\u0010I\u001a\u0002022\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\u0015H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bM\u0010N\u001aE\u0010O\u001a\u0002022\u0006\u0010P\u001a\u0002022\u0006\u0010Q\u001a\u0002022\u0006\u0010R\u001a\u0002022\u0006\u0010S\u001a\u0002022\u0006\u0010T\u001a\u0002022\u0006\u0010J\u001a\u00020KH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bU\u0010V\u001a!\u0010W\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0017H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bX\u0010Y\u001a9\u0010Z\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0017H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b[\u0010\\\u001al\u0010]\u001a\u00020\u0005*\u00020^2\u0006\u0010_\u001a\u0002022\u0006\u0010`\u001a\u0002022\b\u0010a\u001a\u0004\u0018\u00010b2\b\u0010c\u001a\u0004\u0018\u00010b2\u0006\u0010d\u001a\u00020b2\b\u0010e\u001a\u0004\u0018\u00010b2\b\u0010f\u001a\u0004\u0018\u00010b2\u0006\u0010g\u001a\u00020b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010L\u001a\u00020\u0015H\u0002\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006h"}, d2 = {"OutlinedTextFieldInnerPadding", "Landroidx/compose/ui/unit/Dp;", "F", "OutlinedTextFieldTopPadding", "IconsWithTextFieldLayout", "", "textField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier;", Constants.ScionAnalytics.PARAM_LABEL, "leading", "trailing", "singleLine", "", "leadingColor", "Landroidx/compose/ui/graphics/Color;", "trailingColor", "animationProgress", "", "onLabelMeasured", "Landroidx/compose/ui/geometry/Size;", "shape", "Landroidx/compose/ui/graphics/Shape;", "borderWidth", "borderColor", "labelSize", "IconsWithTextFieldLayout-T2E5_Oc", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZJJFLkotlin/jvm/functions/Function1;Landroidx/compose/ui/graphics/Shape;FJJLandroidx/compose/runtime/Composer;II)V", "OutlinedTextField", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "modifier", "enabled", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "leadingIcon", "trailingIcon", "isError", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "maxLines", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "colors", "Landroidx/compose/material/TextFieldColors;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "OutlinedTextFieldLayout", "decoratedPlaceholder", "decoratedLabel", "labelProgress", "indicatorWidth", "indicatorColor", "cursorColor", "backgroundColor", "OutlinedTextFieldLayout-uBqXD2s", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;ZZLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/ui/text/TextStyle;ZILandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JJFFJJJLandroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;IIII)V", "calculateHeight", "leadingPlaceableHeight", "trailingPlaceableHeight", "textFieldPlaceableHeight", "labelPlaceableHeight", "placeholderPlaceableHeight", "constraints", "Landroidx/compose/ui/unit/Constraints;", "density", "calculateHeight-MK6IjOU", "(IIIIIJF)I", "calculateWidth", "leadingPlaceableWidth", "trailingPlaceableWidth", "textFieldPlaceableWidth", "labelPlaceableWidth", "placeholderPlaceableWidth", "calculateWidth-VsPV1Ek", "(IIIIIJ)I", "outlineCutout", "outlineCutout-d16Qtg0", "(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;", "outlinedBorder", "outlinedBorder-gLEpSso", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;FJJ)Landroidx/compose/ui/Modifier;", "place", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "height", "width", "leadingPlaceable", "Landroidx/compose/ui/layout/Placeable;", "trailingPlaceable", "textFieldPlaceable", "labelPlaceable", "placeholderPlaceable", "borderPlaceable", "material_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class OutlinedTextFieldKt {
    private static final float OutlinedTextFieldInnerPadding = Dp.m3325constructorimpl(4);
    private static final float OutlinedTextFieldTopPadding = Dp.m3325constructorimpl(8);

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    /* renamed from: IconsWithTextFieldLayout-T2E5_Oc  reason: not valid java name */
    public static final void m898IconsWithTextFieldLayoutT2E5_Oc(Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean z, long j2, long j3, float f2, Function1<? super Size, Unit> function1, Shape shape, float f3, long j4, long j5, Composer composer, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        Modifier.Companion companion;
        Composer composer2;
        int i7;
        Composer composer3;
        int i8;
        Composer composer4;
        Composer startRestartGroup = composer.startRestartGroup(178502739);
        if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(function2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i4 |= startRestartGroup.changed(function3) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i4 |= startRestartGroup.changed(function22) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            i4 |= startRestartGroup.changed(function23) ? 2048 : 1024;
        }
        if ((57344 & i2) == 0) {
            i4 |= startRestartGroup.changed(function24) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i4 |= startRestartGroup.changed(z) ? 131072 : 65536;
        }
        if ((3670016 & i2) == 0) {
            i4 |= startRestartGroup.changed(j2) ? 1048576 : 524288;
        }
        if ((i2 & 29360128) == 0) {
            i4 |= startRestartGroup.changed(j3) ? 8388608 : 4194304;
        }
        if ((i2 & 234881024) == 0) {
            i4 |= startRestartGroup.changed(f2) ? 67108864 : 33554432;
        }
        if ((i2 & 1879048192) == 0) {
            i4 |= startRestartGroup.changed(function1) ? 536870912 : 268435456;
        }
        if ((i3 & 14) == 0) {
            i5 = (startRestartGroup.changed(shape) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i5 |= startRestartGroup.changed(f3) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i5 |= startRestartGroup.changed(j4) ? 256 : 128;
        }
        if ((i3 & 7168) == 0) {
            i5 |= startRestartGroup.changed(j5) ? 2048 : 1024;
        }
        if (((1533916891 & i4) ^ 306783378) == 0 && ((i5 & 5851) ^ 1170) == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer4 = startRestartGroup;
        } else {
            Boolean valueOf = Boolean.valueOf(z);
            Float valueOf2 = Float.valueOf(f2);
            int i9 = i4 >> 18;
            startRestartGroup.startReplaceableGroup(-3686095);
            boolean changed = startRestartGroup.changed(valueOf) | startRestartGroup.changed(function1) | startRestartGroup.changed(valueOf2);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new OutlinedTextFieldMeasurePolicy(function1, z, f2);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = (OutlinedTextFieldMeasurePolicy) rememberedValue;
            startRestartGroup.startReplaceableGroup(1376089394);
            Modifier.Companion companion2 = Modifier.Companion;
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion2);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m1065constructorimpl = Updater.m1065constructorimpl(startRestartGroup);
            Updater.m1072setimpl(m1065constructorimpl, outlinedTextFieldMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1072setimpl(m1065constructorimpl, density, companion3.getSetDensity());
            Updater.m1072setimpl(m1065constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
            Updater.m1072setimpl(m1065constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1056boximpl(SkippableUpdater.m1057constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-804088231);
            BoxKt.Box(m909outlinedBordergLEpSso(LayoutIdKt.layoutId(companion2, "border"), shape, f3, j4, j5), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-804088054);
            if (function23 != null) {
                Modifier then = LayoutIdKt.layoutId(companion2, TextFieldImplKt.LeadingId).then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center = Alignment.Companion.getCenter();
                startRestartGroup.startReplaceableGroup(-1990474327);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(1376089394);
                Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(then);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m1065constructorimpl2 = Updater.m1065constructorimpl(startRestartGroup);
                Updater.m1072setimpl(m1065constructorimpl2, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m1072setimpl(m1065constructorimpl2, density2, companion3.getSetDensity());
                Updater.m1072setimpl(m1065constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                Updater.m1072setimpl(m1065constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m1056boximpl(SkippableUpdater.m1057constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-1253629305);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(-447675374);
                i6 = i4;
                companion = companion2;
                composer2 = startRestartGroup;
                i7 = 6;
                TextFieldImplKt.m1006DecorationeuL9pac(j2, null, null, function23, startRestartGroup, (i4 & 7168) | (i9 & 14), 6);
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
            } else {
                i6 = i4;
                companion = companion2;
                composer2 = startRestartGroup;
                i7 = 6;
            }
            composer2.endReplaceableGroup();
            Composer composer5 = composer2;
            composer5.startReplaceableGroup(-804087650);
            if (function24 != null) {
                Modifier then2 = LayoutIdKt.layoutId(companion, TextFieldImplKt.TrailingId).then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center2 = Alignment.Companion.getCenter();
                composer5.startReplaceableGroup(-1990474327);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer5, i7);
                composer5.startReplaceableGroup(1376089394);
                Density density3 = (Density) composer5.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(then2);
                if (!(composer5.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer5.startReusableNode();
                if (composer5.getInserting()) {
                    composer5.createNode(constructor3);
                } else {
                    composer5.useNode();
                }
                composer5.disableReusing();
                Composer m1065constructorimpl3 = Updater.m1065constructorimpl(composer5);
                Updater.m1072setimpl(m1065constructorimpl3, rememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m1072setimpl(m1065constructorimpl3, density3, companion3.getSetDensity());
                Updater.m1072setimpl(m1065constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
                Updater.m1072setimpl(m1065constructorimpl3, viewConfiguration3, companion3.getSetViewConfiguration());
                composer5.enableReusing();
                materializerOf3.invoke(SkippableUpdater.m1056boximpl(SkippableUpdater.m1057constructorimpl(composer5)), composer5, 0);
                composer5.startReplaceableGroup(2058660585);
                composer5.startReplaceableGroup(-1253629305);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                composer5.startReplaceableGroup(-447674968);
                i8 = -1990474327;
                composer3 = composer5;
                TextFieldImplKt.m1006DecorationeuL9pac(j3, null, null, function24, composer5, ((i6 >> 21) & 14) | ((i6 >> 3) & 7168), 6);
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                composer3.endNode();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
            } else {
                composer3 = composer5;
                i8 = -1990474327;
            }
            composer3.endReplaceableGroup();
            float m3325constructorimpl = Dp.m3325constructorimpl(TextFieldImplKt.getTextFieldPadding() - TextFieldImplKt.getHorizontalIconPadding());
            float textFieldPadding = function23 != null ? m3325constructorimpl : TextFieldImplKt.getTextFieldPadding();
            if (function24 == null) {
                m3325constructorimpl = TextFieldImplKt.getTextFieldPadding();
            }
            Modifier m368paddingqDBjuR0$default = PaddingKt.m368paddingqDBjuR0$default(companion, textFieldPadding, 0.0f, m3325constructorimpl, 0.0f, 10, null);
            composer4 = composer3;
            composer4.startReplaceableGroup(-804086949);
            if (function3 != null) {
                function3.invoke(LayoutIdKt.layoutId(companion, TextFieldImplKt.PlaceholderId).then(m368paddingqDBjuR0$default), composer4, Integer.valueOf(i6 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
            }
            composer4.endReplaceableGroup();
            Modifier then3 = LayoutIdKt.layoutId(companion, TextFieldImplKt.TextFieldId).then(m368paddingqDBjuR0$default);
            composer4.startReplaceableGroup(i8);
            Alignment.Companion companion4 = Alignment.Companion;
            MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), true, composer4, 48);
            composer4.startReplaceableGroup(1376089394);
            Density density4 = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection4 = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration4 = (ViewConfiguration) composer4.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf4 = LayoutKt.materializerOf(then3);
            if (!(composer4.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer4.startReusableNode();
            if (composer4.getInserting()) {
                composer4.createNode(constructor4);
            } else {
                composer4.useNode();
            }
            composer4.disableReusing();
            Composer m1065constructorimpl4 = Updater.m1065constructorimpl(composer4);
            Updater.m1072setimpl(m1065constructorimpl4, rememberBoxMeasurePolicy3, companion3.getSetMeasurePolicy());
            Updater.m1072setimpl(m1065constructorimpl4, density4, companion3.getSetDensity());
            Updater.m1072setimpl(m1065constructorimpl4, layoutDirection4, companion3.getSetLayoutDirection());
            Updater.m1072setimpl(m1065constructorimpl4, viewConfiguration4, companion3.getSetViewConfiguration());
            composer4.enableReusing();
            materializerOf4.invoke(SkippableUpdater.m1056boximpl(SkippableUpdater.m1057constructorimpl(composer4)), composer4, 0);
            composer4.startReplaceableGroup(2058660585);
            composer4.startReplaceableGroup(-1253629305);
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            composer4.startReplaceableGroup(-447674213);
            function2.invoke(composer4, Integer.valueOf(i6 & 14));
            composer4.endReplaceableGroup();
            composer4.endReplaceableGroup();
            composer4.endReplaceableGroup();
            composer4.endNode();
            composer4.endReplaceableGroup();
            composer4.endReplaceableGroup();
            if (function22 != null) {
                Modifier layoutId = LayoutIdKt.layoutId(companion, TextFieldImplKt.LabelId);
                composer4.startReplaceableGroup(-1990474327);
                MeasurePolicy rememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composer4, 0);
                composer4.startReplaceableGroup(1376089394);
                Density density5 = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection5 = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration5 = (ViewConfiguration) composer4.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor5 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf5 = LayoutKt.materializerOf(layoutId);
                if (!(composer4.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer4.startReusableNode();
                if (composer4.getInserting()) {
                    composer4.createNode(constructor5);
                } else {
                    composer4.useNode();
                }
                composer4.disableReusing();
                Composer m1065constructorimpl5 = Updater.m1065constructorimpl(composer4);
                Updater.m1072setimpl(m1065constructorimpl5, rememberBoxMeasurePolicy4, companion3.getSetMeasurePolicy());
                Updater.m1072setimpl(m1065constructorimpl5, density5, companion3.getSetDensity());
                Updater.m1072setimpl(m1065constructorimpl5, layoutDirection5, companion3.getSetLayoutDirection());
                Updater.m1072setimpl(m1065constructorimpl5, viewConfiguration5, companion3.getSetViewConfiguration());
                composer4.enableReusing();
                materializerOf5.invoke(SkippableUpdater.m1056boximpl(SkippableUpdater.m1057constructorimpl(composer4)), composer4, 0);
                composer4.startReplaceableGroup(2058660585);
                composer4.startReplaceableGroup(-1253629305);
                composer4.startReplaceableGroup(-447674092);
                function22.invoke(composer4, Integer.valueOf((i6 >> 6) & 14));
                composer4.endReplaceableGroup();
                composer4.endReplaceableGroup();
                composer4.endReplaceableGroup();
                composer4.endNode();
                composer4.endReplaceableGroup();
                composer4.endReplaceableGroup();
            }
            composer4.endReplaceableGroup();
            composer4.endReplaceableGroup();
            composer4.endNode();
            composer4.endReplaceableGroup();
        }
        ScopeUpdateScope endRestartGroup = composer4.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new OutlinedTextFieldKt$IconsWithTextFieldLayout$2(function2, function3, function22, function23, function24, z, j2, j3, f2, function1, shape, f3, j4, j5, i2, i3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x01ac, code lost:
        if (r10.changed(r87) == false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0132  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void OutlinedTextField(@org.jetbrains.annotations.NotNull androidx.compose.ui.text.input.TextFieldValue r74, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> r75, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r76, boolean r77, boolean r78, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.TextStyle r79, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r80, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r81, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r82, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r83, boolean r84, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.input.VisualTransformation r85, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardOptions r86, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardActions r87, boolean r88, int r89, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r90, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r91, @org.jetbrains.annotations.Nullable androidx.compose.material.TextFieldColors r92, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r93, int r94, int r95, int r96) {
        /*
            Method dump skipped, instructions count: 1305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x01ac, code lost:
        if (r0.changed(r86) == false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:302:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0132  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void OutlinedTextField(@org.jetbrains.annotations.NotNull java.lang.String r73, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r74, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r75, boolean r76, boolean r77, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.TextStyle r78, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r79, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r80, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r81, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r82, boolean r83, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.input.VisualTransformation r84, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardOptions r85, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardActions r86, boolean r87, int r88, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r89, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r90, @org.jetbrains.annotations.Nullable androidx.compose.material.TextFieldColors r91, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r92, int r93, int r94, int r95) {
        /*
            Method dump skipped, instructions count: 1362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* renamed from: OutlinedTextField$lambda-2  reason: not valid java name */
    private static final TextFieldValue m899OutlinedTextField$lambda2(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:278:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0164  */
    @androidx.compose.runtime.Composable
    /* renamed from: OutlinedTextFieldLayout-uBqXD2s  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m901OutlinedTextFieldLayoutuBqXD2s(@org.jetbrains.annotations.NotNull androidx.compose.ui.Modifier r40, @org.jetbrains.annotations.NotNull androidx.compose.ui.text.input.TextFieldValue r41, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> r42, boolean r43, boolean r44, @org.jetbrains.annotations.NotNull androidx.compose.foundation.text.KeyboardOptions r45, @org.jetbrains.annotations.NotNull androidx.compose.foundation.text.KeyboardActions r46, @org.jetbrains.annotations.NotNull androidx.compose.ui.text.TextStyle r47, boolean r48, int r49, @org.jetbrains.annotations.NotNull androidx.compose.ui.text.input.VisualTransformation r50, @org.jetbrains.annotations.NotNull androidx.compose.foundation.interaction.MutableInteractionSource r51, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function3<? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r52, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r53, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r54, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r55, long r56, long r58, float r60, float r61, long r62, long r64, long r66, @org.jetbrains.annotations.NotNull androidx.compose.ui.graphics.Shape r68, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r69, int r70, int r71, int r72, int r73) {
        /*
            Method dump skipped, instructions count: 1146
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.m901OutlinedTextFieldLayoutuBqXD2s(androidx.compose.ui.Modifier, androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, boolean, boolean, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, androidx.compose.ui.text.TextStyle, boolean, int, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, long, long, float, float, long, long, long, androidx.compose.ui.graphics.Shape, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-MK6IjOU  reason: not valid java name */
    public static final int m906calculateHeightMK6IjOU(int i2, int i3, int i4, int i5, int i6, long j2, float f2) {
        int roundToInt;
        int max = Math.max(i4, i6);
        float textFieldPadding = TextFieldImplKt.getTextFieldPadding() * f2;
        float max2 = max + textFieldPadding + Math.max(textFieldPadding, i5 / 2.0f);
        int m3294getMinHeightimpl = Constraints.m3294getMinHeightimpl(j2);
        roundToInt = MathKt__MathJVMKt.roundToInt(max2);
        return Math.max(m3294getMinHeightimpl, Math.max(i2, Math.max(i3, roundToInt)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-VsPV1Ek  reason: not valid java name */
    public static final int m907calculateWidthVsPV1Ek(int i2, int i3, int i4, int i5, int i6, long j2) {
        return Math.max(i2 + Math.max(i4, Math.max(i5, i6)) + i3, Constraints.m3295getMinWidthimpl(j2));
    }

    /* renamed from: outlineCutout-d16Qtg0  reason: not valid java name */
    private static final Modifier m908outlineCutoutd16Qtg0(Modifier modifier, long j2) {
        return DrawModifierKt.drawWithContent(modifier, new OutlinedTextFieldKt$outlineCutout$1(j2));
    }

    /* renamed from: outlinedBorder-gLEpSso  reason: not valid java name */
    private static final Modifier m909outlinedBordergLEpSso(Modifier modifier, Shape shape, float f2, long j2, long j3) {
        return BorderKt.m157borderxT4_qwU(m908outlineCutoutd16Qtg0(modifier, j3), f2, j2, shape);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void place(Placeable.PlacementScope placementScope, int i2, int i3, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, float f2, boolean z, float f3) {
        int roundToInt;
        int roundToInt2;
        int roundToInt3;
        roundToInt = MathKt__MathJVMKt.roundToInt(TextFieldImplKt.getTextFieldPadding() * f3);
        float horizontalIconPadding = TextFieldImplKt.getHorizontalIconPadding() * f3;
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, Alignment.Companion.getCenterVertically().align(placeable.getHeight(), i2), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i3 - placeable2.getWidth(), Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), i2), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            float f4 = 1 - f2;
            float align = ((z ? Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), i2) : roundToInt) * f4) - ((placeable4.getHeight() / 2) * f2);
            roundToInt2 = MathKt__MathJVMKt.roundToInt(placeable == null ? 0.0f : f4 * (TextFieldImplKt.widthOrZero(placeable) - horizontalIconPadding));
            roundToInt3 = MathKt__MathJVMKt.roundToInt(align);
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, roundToInt2 + roundToInt, roundToInt3, 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, TextFieldImplKt.widthOrZero(placeable), z ? Alignment.Companion.getCenterVertically().align(placeable3.getHeight(), i2) : roundToInt, 0.0f, 4, null);
        if (placeable5 != null) {
            if (z) {
                roundToInt = Alignment.Companion.getCenterVertically().align(placeable5.getHeight(), i2);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, TextFieldImplKt.widthOrZero(placeable), roundToInt, 0.0f, 4, null);
        }
        Placeable.PlacementScope.m2800place70tqf50$default(placementScope, placeable6, IntOffset.Companion.m3453getZeronOccac(), 0.0f, 2, null);
    }
}
