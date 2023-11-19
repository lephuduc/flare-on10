package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aa\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\r0\f\"\u0004\b\u0000\u0010\r\"\b\b\u0001\u0010\u000e*\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000e0\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u0001H\r2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\r0\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\r0\u0015H\u0003¢\u0006\u0002\u0010\u0016\u001a\u0097\u0001\u0010\u0017\u001a\u00020\u0018*\u00020\u00182\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00152\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00152\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f0\u001e2#\u0010 \u001a\u001f\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0006\u0012\u0004\u0018\u00010$0\u001e2'\u0010%\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00180\u001e2\u0006\u0010'\u001a\u00020(H\u0000ø\u0001\u0000\u001aJ\u0010\u0017\u001a\u00020\u0018*\u00020\u00182\u0006\u0010)\u001a\u00020*2'\u0010%\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00180\u001e2\b\b\u0002\u0010'\u001a\u00020(H\u0000ø\u0001\u0000\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000\"\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\nX\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"OffsetDisplacementThreshold", "Landroidx/compose/ui/geometry/Offset;", "J", "TextFieldMagnifierOffsetProperty", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getTextFieldMagnifierOffsetProperty", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "UnspecifiedAnimationVector2D", "Landroidx/compose/animation/core/AnimationVector2D;", "UnspecifiedSafeOffsetVectorConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "rememberAnimatedDerivedStateOf", "Landroidx/compose/runtime/State;", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "typeConverter", "visibilityThreshold", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "targetCalculation", "Lkotlin/Function0;", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "textFieldMagnifierAndroidImpl", "Landroidx/compose/ui/Modifier;", "draggingHandle", "Landroidx/compose/foundation/text/Handle;", "fieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "transformTextOffset", "Lkotlin/Function1;", "", "getCursorRect", "Lkotlin/ParameterName;", "name", "offset", "Landroidx/compose/ui/geometry/Rect;", "androidMagnifier", "center", "isTextMagnifierSemanticsEnabled", "", "manager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TextFieldMagnifierKt {
    @NotNull
    private static final SemanticsPropertyKey<Offset> TextFieldMagnifierOffsetProperty = new SemanticsPropertyKey<>("TextFieldMagnifier", null, 2, null);
    @NotNull
    private static final AnimationVector2D UnspecifiedAnimationVector2D = new AnimationVector2D(Float.NaN, Float.NaN);
    @NotNull
    private static final TwoWayConverter<Offset, AnimationVector2D> UnspecifiedSafeOffsetVectorConverter = VectorConvertersKt.TwoWayConverter(TextFieldMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1.INSTANCE, TextFieldMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2.INSTANCE);
    private static final long OffsetDisplacementThreshold = OffsetKt.Offset(0.01f, 0.01f);

    @NotNull
    public static final SemanticsPropertyKey<Offset> getTextFieldMagnifierOffsetProperty() {
        return TextFieldMagnifierOffsetProperty;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final <T, V extends AnimationVector> State<T> rememberAnimatedDerivedStateOf(TwoWayConverter<T, V> twoWayConverter, T t2, AnimationSpec<T> animationSpec, Function0<? extends T> function0, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1513221697);
        if ((i3 & 2) != 0) {
            t2 = null;
        }
        if ((i3 & 4) != 0) {
            animationSpec = new SpringSpec<>(0.0f, 0.0f, t2, 3, null);
        }
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt.derivedStateOf(function0);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        State state = (State) rememberedValue;
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new Animatable(state.getValue(), twoWayConverter, t2);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) rememberedValue2;
        EffectsKt.LaunchedEffect(Unit.INSTANCE, new TextFieldMagnifierKt$rememberAnimatedDerivedStateOf$1(state, animatable, animationSpec, null), composer, 0);
        State<T> asState = animatable.asState();
        composer.endReplaceableGroup();
        return asState;
    }

    @NotNull
    public static final Modifier textFieldMagnifierAndroidImpl(@NotNull Modifier modifier, @NotNull TextFieldSelectionManager manager, @NotNull Function1<? super Function0<Offset>, ? extends Modifier> androidMagnifier, boolean z) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(androidMagnifier, "androidMagnifier");
        TextFieldState state$foundation_release = manager.getState$foundation_release();
        return state$foundation_release == null ? Modifier.Companion : textFieldMagnifierAndroidImpl(modifier, new TextFieldMagnifierKt$textFieldMagnifierAndroidImpl$1(state$foundation_release), new TextFieldMagnifierKt$textFieldMagnifierAndroidImpl$2(manager), new TextFieldMagnifierKt$textFieldMagnifierAndroidImpl$3(manager), new TextFieldMagnifierKt$textFieldMagnifierAndroidImpl$4(state$foundation_release), androidMagnifier, z);
    }

    @NotNull
    public static final Modifier textFieldMagnifierAndroidImpl(@NotNull Modifier modifier, @NotNull Function0<? extends Handle> draggingHandle, @NotNull Function0<TextFieldValue> fieldValue, @NotNull Function1<? super Integer, Integer> transformTextOffset, @NotNull Function1<? super Integer, Rect> getCursorRect, @NotNull Function1<? super Function0<Offset>, ? extends Modifier> androidMagnifier, boolean z) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(draggingHandle, "draggingHandle");
        Intrinsics.checkNotNullParameter(fieldValue, "fieldValue");
        Intrinsics.checkNotNullParameter(transformTextOffset, "transformTextOffset");
        Intrinsics.checkNotNullParameter(getCursorRect, "getCursorRect");
        Intrinsics.checkNotNullParameter(androidMagnifier, "androidMagnifier");
        return ComposedModifierKt.composed$default(modifier, null, new TextFieldMagnifierKt$textFieldMagnifierAndroidImpl$5(androidMagnifier, z, draggingHandle, fieldValue, transformTextOffset, getCursorRect), 1, null);
    }

    public static /* synthetic */ Modifier textFieldMagnifierAndroidImpl$default(Modifier modifier, TextFieldSelectionManager textFieldSelectionManager, Function1 function1, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return textFieldMagnifierAndroidImpl(modifier, textFieldSelectionManager, function1, z);
    }
}
