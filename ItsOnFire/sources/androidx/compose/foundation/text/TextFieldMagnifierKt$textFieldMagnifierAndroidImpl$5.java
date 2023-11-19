package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TextFieldMagnifierKt$textFieldMagnifierAndroidImpl$5 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    public final /* synthetic */ Function1<Function0<Offset>, Modifier> $androidMagnifier;
    public final /* synthetic */ Function0<Handle> $draggingHandle;
    public final /* synthetic */ Function0<TextFieldValue> $fieldValue;
    public final /* synthetic */ Function1<Integer, Rect> $getCursorRect;
    public final /* synthetic */ boolean $isTextMagnifierSemanticsEnabled;
    public final /* synthetic */ Function1<Integer, Integer> $transformTextOffset;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.foundation.text.TextFieldMagnifierKt$textFieldMagnifierAndroidImpl$5$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function0<Offset> {
        public final /* synthetic */ State<Offset> $animatedMagnifierOffset$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(State<Offset> state) {
            super(0);
            this.$animatedMagnifierOffset$delegate = state;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Offset invoke() {
            return Offset.m1150boximpl(m602invokeF1C5BW0());
        }

        /* renamed from: invoke-F1C5BW0  reason: not valid java name */
        public final long m602invokeF1C5BW0() {
            return TextFieldMagnifierKt$textFieldMagnifierAndroidImpl$5.m601invoke$lambda0(this.$animatedMagnifierOffset$delegate);
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.foundation.text.TextFieldMagnifierKt$textFieldMagnifierAndroidImpl$5$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
        public final /* synthetic */ State<Offset> $animatedMagnifierOffset$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(State<Offset> state) {
            super(1);
            this.$animatedMagnifierOffset$delegate = state;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            invoke2(semanticsPropertyReceiver);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            semantics.set(TextFieldMagnifierKt.getTextFieldMagnifierOffsetProperty(), Offset.m1150boximpl(TextFieldMagnifierKt$textFieldMagnifierAndroidImpl$5.m601invoke$lambda0(this.$animatedMagnifierOffset$delegate)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldMagnifierKt$textFieldMagnifierAndroidImpl$5(Function1<? super Function0<Offset>, ? extends Modifier> function1, boolean z, Function0<? extends Handle> function0, Function0<TextFieldValue> function02, Function1<? super Integer, Integer> function12, Function1<? super Integer, Rect> function13) {
        super(3);
        this.$androidMagnifier = function1;
        this.$isTextMagnifierSemanticsEnabled = z;
        this.$draggingHandle = function0;
        this.$fieldValue = function02;
        this.$transformTextOffset = function12;
        this.$getCursorRect = function13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-0  reason: not valid java name */
    public static final long m601invoke$lambda0(State<Offset> state) {
        return state.getValue().m1171unboximpl();
    }

    @Composable
    @NotNull
    public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i2) {
        TwoWayConverter twoWayConverter;
        long j2;
        State rememberAnimatedDerivedStateOf;
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(728603669);
        twoWayConverter = TextFieldMagnifierKt.UnspecifiedSafeOffsetVectorConverter;
        j2 = TextFieldMagnifierKt.OffsetDisplacementThreshold;
        rememberAnimatedDerivedStateOf = TextFieldMagnifierKt.rememberAnimatedDerivedStateOf(twoWayConverter, Offset.m1150boximpl(j2), null, new TextFieldMagnifierKt$textFieldMagnifierAndroidImpl$5$animatedMagnifierOffset$2(this.$draggingHandle, this.$fieldValue, this.$transformTextOffset, this.$getCursorRect), composer, 56, 4);
        Modifier then = composed.then(this.$androidMagnifier.invoke(new AnonymousClass1(rememberAnimatedDerivedStateOf))).then(this.$isTextMagnifierSemanticsEnabled ? SemanticsModifierKt.semantics$default(Modifier.Companion, false, new AnonymousClass2(rememberAnimatedDerivedStateOf), 1, null) : Modifier.Companion);
        composer.endReplaceableGroup();
        return then;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }
}
