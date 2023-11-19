package androidx.compose.material;

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
import androidx.compose.ui.unit.LayoutDirection;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a¢\u0001\u0010\u0005\u001a\u00020\u00062\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\b\t2\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\u0002\b\t2\u0019\u0010\u000b\u001a\u0015\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f¢\u0006\u0002\b\t2\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\u0002\b\t2\u0013\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\u0002\b\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0087\u0002\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00060\f2\b\b\u0002\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001e\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010 \u001a\u00020!2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\u0002\b\t2\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\u0002\b\t2\u0015\b\u0002\u0010\"\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\u0002\b\t2\u0015\b\u0002\u0010#\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\u0002\b\t2\b\b\u0002\u0010$\u001a\u00020\u00112\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u0002002\b\b\u0002\u00101\u001a\u000202H\u0007¢\u0006\u0002\u00103\u001a\u0087\u0002\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u0002042\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u00060\f2\b\b\u0002\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001e\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010 \u001a\u00020!2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\u0002\b\t2\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\u0002\b\t2\u0015\b\u0002\u0010\"\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\u0002\b\t2\u0015\b\u0002\u0010#\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\u0002\b\t2\b\b\u0002\u0010$\u001a\u00020\u00112\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u0002002\b\b\u0002\u00101\u001a\u000202H\u0007¢\u0006\u0002\u00105\u001a\u009d\u0002\u00106\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010+\u001a\u00020,2\u0006\u0010%\u001a\u00020&2\u0006\u0010-\u001a\u00020.2\u0019\u00107\u001a\u0015\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f¢\u0006\u0002\b\t2\u0013\u00108\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\u0002\b\t2\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\u0002\b\t2\u0013\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\u0002\b\t2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u00109\u001a\u00020\u00162\u0006\u0010:\u001a\u00020\u00012\u0006\u0010;\u001a\u00020\u00132\u0006\u0010<\u001a\u00020\u00132\u0006\u0010=\u001a\u00020\u00132\u0006\u0010/\u001a\u000200H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b>\u0010?\u001aU\u0010@\u001a\u00020,2\u0006\u0010A\u001a\u00020,2\u0006\u0010B\u001a\u00020\u00112\u0006\u0010C\u001a\u00020,2\u0006\u0010D\u001a\u00020,2\u0006\u0010E\u001a\u00020,2\u0006\u0010F\u001a\u00020,2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u0016H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bJ\u0010K\u001aE\u0010L\u001a\u00020,2\u0006\u0010M\u001a\u00020,2\u0006\u0010N\u001a\u00020,2\u0006\u0010O\u001a\u00020,2\u0006\u0010P\u001a\u00020,2\u0006\u0010Q\u001a\u00020,2\u0006\u0010G\u001a\u00020HH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bR\u0010S\u001a)\u0010T\u001a\u00020\r*\u00020\r2\u0006\u0010U\u001a\u00020\u00012\u0006\u0010V\u001a\u00020\u0013H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bW\u0010X\u001at\u0010Y\u001a\u00020\u0006*\u00020Z2\u0006\u0010[\u001a\u00020,2\u0006\u0010\\\u001a\u00020,2\u0006\u0010]\u001a\u00020^2\b\u0010_\u001a\u0004\u0018\u00010^2\b\u0010`\u001a\u0004\u0018\u00010^2\b\u0010a\u001a\u0004\u0018\u00010^2\b\u0010b\u001a\u0004\u0018\u00010^2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010c\u001a\u00020,2\u0006\u0010d\u001a\u00020,2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010I\u001a\u00020\u0016H\u0002\u001aR\u0010e\u001a\u00020\u0006*\u00020Z2\u0006\u0010[\u001a\u00020,2\u0006\u0010\\\u001a\u00020,2\u0006\u0010f\u001a\u00020^2\b\u0010`\u001a\u0004\u0018\u00010^2\b\u0010a\u001a\u0004\u0018\u00010^2\b\u0010b\u001a\u0004\u0018\u00010^2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010I\u001a\u00020\u0016H\u0002\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006g"}, d2 = {"FirstBaselineOffset", "Landroidx/compose/ui/unit/Dp;", "F", "LastBaselineOffset", "TextFieldTopPadding", "IconsWithTextFieldLayout", "", "textField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", Constants.ScionAnalytics.PARAM_LABEL, "placeholder", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier;", "leading", "trailing", "singleLine", "", "leadingColor", "Landroidx/compose/ui/graphics/Color;", "trailingColor", "animationProgress", "", "IconsWithTextFieldLayout-SxpAMN0", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZJJFLandroidx/compose/runtime/Composer;I)V", TextFieldImplKt.TextFieldId, "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "modifier", "enabled", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "leadingIcon", "trailingIcon", "isError", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "maxLines", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material/TextFieldColors;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "TextFieldLayout", "decoratedPlaceholder", "decoratedLabel", "labelProgress", "indicatorWidth", "indicatorColor", "backgroundColor", "cursorColor", "TextFieldLayout-uBqXD2s", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;ZZLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/ui/text/TextStyle;ZILandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JJFFJJJLandroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;IIII)V", "calculateHeight", "textFieldHeight", "hasLabel", "labelBaseline", "leadingHeight", "trailingHeight", "placeholderHeight", "constraints", "Landroidx/compose/ui/unit/Constraints;", "density", "calculateHeight-YbqEFUw", "(IZIIIIJF)I", "calculateWidth", "leadingWidth", "trailingWidth", "textFieldWidth", "labelWidth", "placeholderWidth", "calculateWidth-VsPV1Ek", "(IIIIIJ)I", "drawIndicatorLine", "lineWidth", "color", "drawIndicatorLine-H2RKhps", "(Landroidx/compose/ui/Modifier;FJ)Landroidx/compose/ui/Modifier;", "placeWithLabel", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "width", "height", "textfieldPlaceable", "Landroidx/compose/ui/layout/Placeable;", "labelPlaceable", "placeholderPlaceable", "leadingPlaceable", "trailingPlaceable", "labelEndPosition", "textPosition", "placeWithoutLabel", "textPlaceable", "material_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TextFieldKt {
    private static final float FirstBaselineOffset = Dp.m3325constructorimpl(20);
    private static final float LastBaselineOffset = Dp.m3325constructorimpl(10);
    private static final float TextFieldTopPadding = Dp.m3325constructorimpl(4);

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    /* renamed from: IconsWithTextFieldLayout-SxpAMN0  reason: not valid java name */
    public static final void m1009IconsWithTextFieldLayoutSxpAMN0(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean z, long j2, long j3, float f2, Composer composer, int i2) {
        int i3;
        Modifier.Companion companion;
        int i4;
        Composer composer2;
        Composer composer3;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(178502533);
        if ((i2 & 14) == 0) {
            i3 = (startRestartGroup.changed(function2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i3 |= startRestartGroup.changed(function22) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= startRestartGroup.changed(function3) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            i3 |= startRestartGroup.changed(function23) ? 2048 : 1024;
        }
        if ((57344 & i2) == 0) {
            i3 |= startRestartGroup.changed(function24) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i3 |= startRestartGroup.changed(z) ? 131072 : 65536;
        }
        if ((3670016 & i2) == 0) {
            i3 |= startRestartGroup.changed(j2) ? 1048576 : 524288;
        }
        if ((29360128 & i2) == 0) {
            i3 |= startRestartGroup.changed(j3) ? 8388608 : 4194304;
        }
        if ((234881024 & i2) == 0) {
            i3 |= startRestartGroup.changed(f2) ? 67108864 : 33554432;
        }
        int i6 = i3;
        if (((191739611 & i6) ^ 38347922) == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer3 = startRestartGroup;
        } else {
            Boolean valueOf = Boolean.valueOf(z);
            Float valueOf2 = Float.valueOf(f2);
            int i7 = i6 >> 21;
            startRestartGroup.startReplaceableGroup(-3686552);
            boolean changed = startRestartGroup.changed(valueOf) | startRestartGroup.changed(valueOf2);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new TextFieldMeasurePolicy(z, f2);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            TextFieldMeasurePolicy textFieldMeasurePolicy = (TextFieldMeasurePolicy) rememberedValue;
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
            Updater.m1072setimpl(m1065constructorimpl, textFieldMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1072setimpl(m1065constructorimpl, density, companion3.getSetDensity());
            Updater.m1072setimpl(m1065constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
            Updater.m1072setimpl(m1065constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1056boximpl(SkippableUpdater.m1057constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-804089035);
            startRestartGroup.startReplaceableGroup(-804089035);
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
                startRestartGroup.startReplaceableGroup(-447676355);
                i4 = i6;
                companion = companion2;
                composer2 = startRestartGroup;
                TextFieldImplKt.m1006DecorationeuL9pac(j2, null, null, function23, startRestartGroup, ((i6 >> 18) & 14) | (i6 & 7168), 6);
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
            } else {
                companion = companion2;
                i4 = i6;
                composer2 = startRestartGroup;
            }
            composer2.endReplaceableGroup();
            composer3 = composer2;
            composer3.startReplaceableGroup(-804088631);
            if (function24 != null) {
                Modifier then2 = LayoutIdKt.layoutId(companion, TextFieldImplKt.TrailingId).then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center2 = Alignment.Companion.getCenter();
                composer3.startReplaceableGroup(-1990474327);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer3, 6);
                composer3.startReplaceableGroup(1376089394);
                Density density3 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(then2);
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor3);
                } else {
                    composer3.useNode();
                }
                composer3.disableReusing();
                Composer m1065constructorimpl3 = Updater.m1065constructorimpl(composer3);
                Updater.m1072setimpl(m1065constructorimpl3, rememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m1072setimpl(m1065constructorimpl3, density3, companion3.getSetDensity());
                Updater.m1072setimpl(m1065constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
                Updater.m1072setimpl(m1065constructorimpl3, viewConfiguration3, companion3.getSetViewConfiguration());
                composer3.enableReusing();
                materializerOf3.invoke(SkippableUpdater.m1056boximpl(SkippableUpdater.m1057constructorimpl(composer3)), composer3, 0);
                composer3.startReplaceableGroup(2058660585);
                composer3.startReplaceableGroup(-1253629305);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                composer3.startReplaceableGroup(-447675949);
                i5 = -1253629305;
                TextFieldImplKt.m1006DecorationeuL9pac(j3, null, null, function24, composer3, (i7 & 14) | ((i4 >> 3) & 7168), 6);
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                composer3.endNode();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
            } else {
                i5 = -1253629305;
            }
            composer3.endReplaceableGroup();
            float m3325constructorimpl = Dp.m3325constructorimpl(TextFieldImplKt.getTextFieldPadding() - TextFieldImplKt.getHorizontalIconPadding());
            float textFieldPadding = function23 != null ? m3325constructorimpl : TextFieldImplKt.getTextFieldPadding();
            if (function24 == null) {
                m3325constructorimpl = TextFieldImplKt.getTextFieldPadding();
            }
            Modifier m368paddingqDBjuR0$default = PaddingKt.m368paddingqDBjuR0$default(companion, textFieldPadding, 0.0f, m3325constructorimpl, 0.0f, 10, null);
            composer3.startReplaceableGroup(-804087929);
            if (function3 != null) {
                function3.invoke(LayoutIdKt.layoutId(companion, TextFieldImplKt.PlaceholderId).then(m368paddingqDBjuR0$default), composer3, Integer.valueOf((i4 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
            }
            composer3.endReplaceableGroup();
            composer3.startReplaceableGroup(-804087800);
            if (function22 != null) {
                Modifier then3 = LayoutIdKt.layoutId(companion, TextFieldImplKt.LabelId).then(m368paddingqDBjuR0$default);
                composer3.startReplaceableGroup(-1990474327);
                MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer3, 0);
                composer3.startReplaceableGroup(1376089394);
                Density density4 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection4 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration4 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf4 = LayoutKt.materializerOf(then3);
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor4);
                } else {
                    composer3.useNode();
                }
                composer3.disableReusing();
                Composer m1065constructorimpl4 = Updater.m1065constructorimpl(composer3);
                Updater.m1072setimpl(m1065constructorimpl4, rememberBoxMeasurePolicy3, companion3.getSetMeasurePolicy());
                Updater.m1072setimpl(m1065constructorimpl4, density4, companion3.getSetDensity());
                Updater.m1072setimpl(m1065constructorimpl4, layoutDirection4, companion3.getSetLayoutDirection());
                Updater.m1072setimpl(m1065constructorimpl4, viewConfiguration4, companion3.getSetViewConfiguration());
                composer3.enableReusing();
                materializerOf4.invoke(SkippableUpdater.m1056boximpl(SkippableUpdater.m1057constructorimpl(composer3)), composer3, 0);
                composer3.startReplaceableGroup(2058660585);
                composer3.startReplaceableGroup(i5);
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                composer3.startReplaceableGroup(-447675266);
                function22.invoke(composer3, Integer.valueOf((i4 >> 3) & 14));
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                composer3.endNode();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
            }
            composer3.endReplaceableGroup();
            Modifier then4 = LayoutIdKt.layoutId(companion, TextFieldImplKt.TextFieldId).then(m368paddingqDBjuR0$default);
            composer3.startReplaceableGroup(-1990474327);
            MeasurePolicy rememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), true, composer3, 48);
            composer3.startReplaceableGroup(1376089394);
            Density density5 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection5 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration5 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor5 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf5 = LayoutKt.materializerOf(then4);
            if (!(composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor5);
            } else {
                composer3.useNode();
            }
            composer3.disableReusing();
            Composer m1065constructorimpl5 = Updater.m1065constructorimpl(composer3);
            Updater.m1072setimpl(m1065constructorimpl5, rememberBoxMeasurePolicy4, companion3.getSetMeasurePolicy());
            Updater.m1072setimpl(m1065constructorimpl5, density5, companion3.getSetDensity());
            Updater.m1072setimpl(m1065constructorimpl5, layoutDirection5, companion3.getSetLayoutDirection());
            Updater.m1072setimpl(m1065constructorimpl5, viewConfiguration5, companion3.getSetViewConfiguration());
            composer3.enableReusing();
            materializerOf5.invoke(SkippableUpdater.m1056boximpl(SkippableUpdater.m1057constructorimpl(composer3)), composer3, 0);
            composer3.startReplaceableGroup(2058660585);
            composer3.startReplaceableGroup(i5);
            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
            composer3.startReplaceableGroup(-447675072);
            function2.invoke(composer3, Integer.valueOf(i4 & 14));
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            composer3.endNode();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            composer3.endNode();
            composer3.endReplaceableGroup();
        }
        ScopeUpdateScope endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new TextFieldKt$IconsWithTextFieldLayout$2(function2, function22, function3, function23, function24, z, j2, j3, f2, i2));
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
    /* JADX WARN: Removed duplicated region for block: B:285:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x045d  */
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
    public static final void TextField(@org.jetbrains.annotations.NotNull androidx.compose.ui.text.input.TextFieldValue r74, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> r75, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r76, boolean r77, boolean r78, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.TextStyle r79, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r80, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r81, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r82, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r83, boolean r84, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.input.VisualTransformation r85, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardOptions r86, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardActions r87, boolean r88, int r89, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r90, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r91, @org.jetbrains.annotations.Nullable androidx.compose.material.TextFieldColors r92, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r93, int r94, int r95, int r96) {
        /*
            Method dump skipped, instructions count: 1338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.TextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
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
    /* JADX WARN: Removed duplicated region for block: B:264:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0575  */
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
    public static final void TextField(@org.jetbrains.annotations.NotNull java.lang.String r73, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r74, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r75, boolean r76, boolean r77, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.TextStyle r78, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r79, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r80, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r81, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r82, boolean r83, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.input.VisualTransformation r84, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardOptions r85, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardActions r86, boolean r87, int r88, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r89, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r90, @org.jetbrains.annotations.Nullable androidx.compose.material.TextFieldColors r91, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r92, int r93, int r94, int r95) {
        /*
            Method dump skipped, instructions count: 1428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.TextField(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* renamed from: TextField$lambda-2  reason: not valid java name */
    private static final TextFieldValue m1010TextField$lambda2(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:270:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0167  */
    @androidx.compose.runtime.Composable
    /* renamed from: TextFieldLayout-uBqXD2s  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1012TextFieldLayoutuBqXD2s(@org.jetbrains.annotations.NotNull androidx.compose.ui.Modifier r45, @org.jetbrains.annotations.NotNull androidx.compose.ui.text.input.TextFieldValue r46, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> r47, boolean r48, boolean r49, @org.jetbrains.annotations.NotNull androidx.compose.foundation.text.KeyboardOptions r50, @org.jetbrains.annotations.NotNull androidx.compose.foundation.text.KeyboardActions r51, @org.jetbrains.annotations.NotNull androidx.compose.ui.text.TextStyle r52, boolean r53, int r54, @org.jetbrains.annotations.NotNull androidx.compose.ui.text.input.VisualTransformation r55, @org.jetbrains.annotations.NotNull androidx.compose.foundation.interaction.MutableInteractionSource r56, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function3<? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r57, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r58, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r59, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r60, long r61, long r63, float r65, float r66, long r67, long r69, long r71, @org.jetbrains.annotations.NotNull androidx.compose.ui.graphics.Shape r73, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r74, int r75, int r76, int r77, int r78) {
        /*
            Method dump skipped, instructions count: 1066
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.m1012TextFieldLayoutuBqXD2s(androidx.compose.ui.Modifier, androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, boolean, boolean, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, androidx.compose.ui.text.TextStyle, boolean, int, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, long, long, float, float, long, long, long, androidx.compose.ui.graphics.Shape, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-YbqEFUw  reason: not valid java name */
    public static final int m1017calculateHeightYbqEFUw(int i2, boolean z, int i3, int i4, int i5, int i6, long j2, float f2) {
        int roundToInt;
        float f3 = LastBaselineOffset * f2;
        float f4 = TextFieldTopPadding * f2;
        float textFieldPadding = TextFieldImplKt.getTextFieldPadding() * f2;
        int max = Math.max(i2, i6);
        roundToInt = MathKt__MathJVMKt.roundToInt(z ? i3 + f4 + max + f3 : (textFieldPadding * 2) + max);
        return Math.max(roundToInt, Math.max(Math.max(i4, i5), Constraints.m3294getMinHeightimpl(j2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-VsPV1Ek  reason: not valid java name */
    public static final int m1018calculateWidthVsPV1Ek(int i2, int i3, int i4, int i5, int i6, long j2) {
        return Math.max(i2 + Math.max(i4, Math.max(i5, i6)) + i3, Constraints.m3295getMinWidthimpl(j2));
    }

    @NotNull
    /* renamed from: drawIndicatorLine-H2RKhps  reason: not valid java name */
    public static final Modifier m1019drawIndicatorLineH2RKhps(@NotNull Modifier drawIndicatorLine, float f2, long j2) {
        Intrinsics.checkNotNullParameter(drawIndicatorLine, "$this$drawIndicatorLine");
        return DrawModifierKt.drawBehind(drawIndicatorLine, new TextFieldKt$drawIndicatorLine$1(f2, j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithLabel(Placeable.PlacementScope placementScope, int i2, int i3, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, boolean z, int i4, int i5, float f2, float f3) {
        int roundToInt;
        int roundToInt2;
        roundToInt = MathKt__MathJVMKt.roundToInt(TextFieldImplKt.getTextFieldPadding() * f3);
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, 0, Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), i3), 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, i2 - placeable5.getWidth(), Alignment.Companion.getCenterVertically().align(placeable5.getHeight(), i3), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            if (z) {
                roundToInt = Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), i3);
            }
            roundToInt2 = MathKt__MathJVMKt.roundToInt((roundToInt - i4) * f2);
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, TextFieldImplKt.widthOrZero(placeable4), roundToInt - roundToInt2, 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, TextFieldImplKt.widthOrZero(placeable4), i5, 0.0f, 4, null);
        if (placeable3 == null) {
            return;
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, TextFieldImplKt.widthOrZero(placeable4), i5, 0.0f, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithoutLabel(Placeable.PlacementScope placementScope, int i2, int i3, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, boolean z, float f2) {
        int roundToInt;
        roundToInt = MathKt__MathJVMKt.roundToInt(TextFieldImplKt.getTextFieldPadding() * f2);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, 0, Alignment.Companion.getCenterVertically().align(placeable3.getHeight(), i3), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, i2 - placeable4.getWidth(), Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), i3), 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, TextFieldImplKt.widthOrZero(placeable3), z ? Alignment.Companion.getCenterVertically().align(placeable.getHeight(), i3) : roundToInt, 0.0f, 4, null);
        if (placeable2 == null) {
            return;
        }
        if (z) {
            roundToInt = Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), i3);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, TextFieldImplKt.widthOrZero(placeable3), roundToInt, 0.0f, 4, null);
    }
}
