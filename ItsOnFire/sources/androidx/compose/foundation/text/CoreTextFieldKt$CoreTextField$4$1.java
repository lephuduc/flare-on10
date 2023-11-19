package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.foundation.text.TextFieldDelegate;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class CoreTextFieldKt$CoreTextField$4$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ Modifier $cursorModifier;
    public final /* synthetic */ Modifier $drawModifier;
    public final /* synthetic */ Modifier $magnifierModifier;
    public final /* synthetic */ TextFieldSelectionManager $manager;
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ Modifier $onPositionedModifier;
    public final /* synthetic */ Function1<TextLayoutResult, Unit> $onTextLayout;
    public final /* synthetic */ boolean $readOnly;
    public final /* synthetic */ TextFieldScrollerPosition $scrollerPosition;
    public final /* synthetic */ boolean $showHandleAndMagnifier;
    public final /* synthetic */ TextFieldState $state;
    public final /* synthetic */ TextStyle $textStyle;
    public final /* synthetic */ TextFieldValue $value;
    public final /* synthetic */ VisualTransformation $visualTransformation;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ TextFieldSelectionManager $manager;
        public final /* synthetic */ Function1<TextLayoutResult, Unit> $onTextLayout;
        public final /* synthetic */ boolean $readOnly;
        public final /* synthetic */ boolean $showHandleAndMagnifier;
        public final /* synthetic */ TextFieldState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(TextFieldSelectionManager textFieldSelectionManager, TextFieldState textFieldState, boolean z, boolean z2, Function1<? super TextLayoutResult, Unit> function1) {
            super(2);
            this.$manager = textFieldSelectionManager;
            this.$state = textFieldState;
            this.$showHandleAndMagnifier = z;
            this.$readOnly = z2;
            this.$onTextLayout = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        @Composable
        public final void invoke(@Nullable Composer composer, int i2) {
            if (((i2 & 11) ^ 2) == 0 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            final TextFieldState textFieldState = this.$state;
            final Function1<TextLayoutResult, Unit> function1 = this.$onTextLayout;
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.4.1.1.2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i3) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicHeight(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i3) {
                    Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    TextFieldState.this.getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                    return TextFieldState.this.getTextDelegate().getMaxIntrinsicWidth();
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                @NotNull
                /* renamed from: measure-3p2s80s */
                public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope receiver, @NotNull List<? extends Measurable> measurables, long j2) {
                    int roundToInt;
                    int roundToInt2;
                    Map<AlignmentLine, Integer> mapOf;
                    Intrinsics.checkNotNullParameter(receiver, "$receiver");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    TextFieldDelegate.Companion companion = TextFieldDelegate.Companion;
                    TextDelegate textDelegate = TextFieldState.this.getTextDelegate();
                    LayoutDirection layoutDirection = receiver.getLayoutDirection();
                    TextLayoutResultProxy layoutResult = TextFieldState.this.getLayoutResult();
                    Triple<Integer, Integer, TextLayoutResult> m590layout_EkL_Y$foundation_release = companion.m590layout_EkL_Y$foundation_release(textDelegate, j2, layoutDirection, layoutResult == null ? null : layoutResult.getValue());
                    int intValue = m590layout_EkL_Y$foundation_release.component1().intValue();
                    int intValue2 = m590layout_EkL_Y$foundation_release.component2().intValue();
                    TextLayoutResult component3 = m590layout_EkL_Y$foundation_release.component3();
                    TextLayoutResultProxy layoutResult2 = TextFieldState.this.getLayoutResult();
                    if (!Intrinsics.areEqual(layoutResult2 != null ? layoutResult2.getValue() : null, component3)) {
                        TextFieldState.this.setLayoutResult(new TextLayoutResultProxy(component3));
                        function1.invoke(component3);
                    }
                    HorizontalAlignmentLine firstBaseline = AlignmentLineKt.getFirstBaseline();
                    roundToInt = MathKt__MathJVMKt.roundToInt(component3.getFirstBaseline());
                    HorizontalAlignmentLine lastBaseline = AlignmentLineKt.getLastBaseline();
                    roundToInt2 = MathKt__MathJVMKt.roundToInt(component3.getLastBaseline());
                    mapOf = MapsKt__MapsKt.mapOf(TuplesKt.to(firstBaseline, Integer.valueOf(roundToInt)), TuplesKt.to(lastBaseline, Integer.valueOf(roundToInt2)));
                    return receiver.layout(intValue, intValue2, mapOf, CoreTextFieldKt$CoreTextField$4$1$1$2$measure$1.INSTANCE);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i3) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicHeight(this, intrinsicMeasureScope, list, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i3) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicWidth(this, intrinsicMeasureScope, list, i3);
                }
            };
            composer.startReplaceableGroup(1376089394);
            Modifier.Companion companion = Modifier.Companion;
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            composer.disableReusing();
            Composer m1065constructorimpl = Updater.m1065constructorimpl(composer);
            Updater.m1072setimpl(m1065constructorimpl, measurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1072setimpl(m1065constructorimpl, density, companion2.getSetDensity());
            Updater.m1072setimpl(m1065constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m1072setimpl(m1065constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            composer.enableReusing();
            boolean z = false;
            materializerOf.invoke(SkippableUpdater.m1056boximpl(SkippableUpdater.m1057constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            composer.startReplaceableGroup(1017239479);
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            TextFieldSelectionManager textFieldSelectionManager = this.$manager;
            if (this.$state.getHandleState() == HandleState.Selection && this.$state.getLayoutCoordinates() != null) {
                LayoutCoordinates layoutCoordinates = this.$state.getLayoutCoordinates();
                Intrinsics.checkNotNull(layoutCoordinates);
                if (layoutCoordinates.isAttached() && this.$showHandleAndMagnifier) {
                    z = true;
                }
            }
            CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager, z, composer, 8);
            if (this.$state.getHandleState() == HandleState.Cursor && !this.$readOnly && this.$showHandleAndMagnifier) {
                CoreTextFieldKt.TextFieldCursorHandle(this.$manager, composer, 8);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CoreTextFieldKt$CoreTextField$4$1(int i2, TextStyle textStyle, TextFieldScrollerPosition textFieldScrollerPosition, TextFieldValue textFieldValue, VisualTransformation visualTransformation, Modifier modifier, Modifier modifier2, Modifier modifier3, Modifier modifier4, TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager, boolean z, boolean z2, Function1<? super TextLayoutResult, Unit> function1) {
        super(2);
        this.$maxLines = i2;
        this.$textStyle = textStyle;
        this.$scrollerPosition = textFieldScrollerPosition;
        this.$value = textFieldValue;
        this.$visualTransformation = visualTransformation;
        this.$cursorModifier = modifier;
        this.$drawModifier = modifier2;
        this.$onPositionedModifier = modifier3;
        this.$magnifierModifier = modifier4;
        this.$state = textFieldState;
        this.$manager = textFieldSelectionManager;
        this.$showHandleAndMagnifier = z;
        this.$readOnly = z2;
        this.$onTextLayout = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    @Composable
    public final void invoke(@Nullable Composer composer, int i2) {
        if (((i2 & 11) ^ 2) == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            SimpleLayoutKt.SimpleLayout(TextFieldSizeKt.textFieldMinSize(TextFieldScrollKt.textFieldScroll(MaxLinesHeightModifierKt.maxLinesHeight(Modifier.Companion, this.$maxLines, this.$textStyle), this.$scrollerPosition, this.$value, this.$visualTransformation, new CoreTextFieldKt$CoreTextField$4$1$coreTextFieldModifier$1(this.$state)).then(this.$cursorModifier).then(this.$drawModifier), this.$textStyle).then(this.$onPositionedModifier).then(this.$magnifierModifier), ComposableLambdaKt.composableLambda(composer, -819904786, true, new AnonymousClass1(this.$manager, this.$state, this.$showHandleAndMagnifier, this.$readOnly, this.$onTextLayout)), composer, 48, 0);
        }
    }
}
