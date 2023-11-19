package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TransformedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class CoreTextFieldKt$CoreTextField$semanticsModifier$1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ FocusRequester $focusRequester;
    public final /* synthetic */ ImeOptions $imeOptions;
    public final /* synthetic */ boolean $isPassword;
    public final /* synthetic */ TextFieldSelectionManager $manager;
    public final /* synthetic */ OffsetMapping $offsetMapping;
    public final /* synthetic */ Function1<TextFieldValue, Unit> $onValueChangeWrapper;
    public final /* synthetic */ boolean $readOnly;
    public final /* synthetic */ TextFieldState $state;
    public final /* synthetic */ TransformedText $transformedText;
    public final /* synthetic */ TextFieldValue $value;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<List<TextLayoutResult>, Boolean> {
        public final /* synthetic */ TextFieldState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TextFieldState textFieldState) {
            super(1);
            this.$state = textFieldState;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull List<TextLayoutResult> it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (this.$state.getLayoutResult() != null) {
                TextLayoutResultProxy layoutResult = this.$state.getLayoutResult();
                Intrinsics.checkNotNull(layoutResult);
                it.add(layoutResult.getValue());
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends Lambda implements Function1<AnnotatedString, Boolean> {
        public final /* synthetic */ Function1<TextFieldValue, Unit> $onValueChangeWrapper;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function1<? super TextFieldValue, Unit> function1) {
            super(1);
            this.$onValueChangeWrapper = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull AnnotatedString it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.$onValueChangeWrapper.invoke(new TextFieldValue(it.getText(), TextRangeKt.TextRange(it.getText().length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
            return Boolean.TRUE;
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends Lambda implements Function3<Integer, Integer, Boolean, Boolean> {
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ TextFieldSelectionManager $manager;
        public final /* synthetic */ OffsetMapping $offsetMapping;
        public final /* synthetic */ Function1<TextFieldValue, Unit> $onValueChangeWrapper;
        public final /* synthetic */ TextFieldValue $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(OffsetMapping offsetMapping, boolean z, TextFieldValue textFieldValue, TextFieldSelectionManager textFieldSelectionManager, Function1<? super TextFieldValue, Unit> function1) {
            super(3);
            this.$offsetMapping = offsetMapping;
            this.$enabled = z;
            this.$value = textFieldValue;
            this.$manager = textFieldSelectionManager;
            this.$onValueChangeWrapper = function1;
        }

        @NotNull
        public final Boolean invoke(int i2, int i3, boolean z) {
            int coerceAtMost;
            int coerceAtLeast;
            if (!z) {
                i2 = this.$offsetMapping.transformedToOriginal(i2);
            }
            if (!z) {
                i3 = this.$offsetMapping.transformedToOriginal(i3);
            }
            boolean z2 = false;
            if (this.$enabled && (i2 != TextRange.m3075getStartimpl(this.$value.m3187getSelectiond9O1mEE()) || i3 != TextRange.m3070getEndimpl(this.$value.m3187getSelectiond9O1mEE()))) {
                coerceAtMost = RangesKt___RangesKt.coerceAtMost(i2, i3);
                if (coerceAtMost >= 0) {
                    coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(i2, i3);
                    if (coerceAtLeast <= this.$value.getAnnotatedString().length()) {
                        if (z || i2 == i3) {
                            this.$manager.exitSelectionMode$foundation_release();
                        } else {
                            this.$manager.enterSelectionMode$foundation_release();
                        }
                        this.$onValueChangeWrapper.invoke(new TextFieldValue(this.$value.getAnnotatedString(), TextRangeKt.TextRange(i2, i3), (TextRange) null, 4, (DefaultConstructorMarker) null));
                        z2 = true;
                    }
                }
                this.$manager.exitSelectionMode$foundation_release();
            }
            return Boolean.valueOf(z2);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2, Boolean bool) {
            return invoke(num.intValue(), num2.intValue(), bool.booleanValue());
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$4  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends Lambda implements Function0<Boolean> {
        public final /* synthetic */ FocusRequester $focusRequester;
        public final /* synthetic */ boolean $readOnly;
        public final /* synthetic */ TextFieldState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(TextFieldState textFieldState, FocusRequester focusRequester, boolean z) {
            super(0);
            this.$state = textFieldState;
            this.$focusRequester = focusRequester;
            this.$readOnly = z;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            CoreTextFieldKt.tapToFocus(this.$state, this.$focusRequester, !this.$readOnly);
            return Boolean.TRUE;
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$5  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends Lambda implements Function0<Boolean> {
        public final /* synthetic */ TextFieldSelectionManager $manager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(TextFieldSelectionManager textFieldSelectionManager) {
            super(0);
            this.$manager = textFieldSelectionManager;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            this.$manager.enterSelectionMode$foundation_release();
            return Boolean.TRUE;
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$6  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass6 extends Lambda implements Function0<Boolean> {
        public final /* synthetic */ TextFieldSelectionManager $manager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(TextFieldSelectionManager textFieldSelectionManager) {
            super(0);
            this.$manager = textFieldSelectionManager;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            TextFieldSelectionManager.copy$foundation_release$default(this.$manager, false, 1, null);
            return Boolean.TRUE;
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$7  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass7 extends Lambda implements Function0<Boolean> {
        public final /* synthetic */ TextFieldSelectionManager $manager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(TextFieldSelectionManager textFieldSelectionManager) {
            super(0);
            this.$manager = textFieldSelectionManager;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            this.$manager.cut$foundation_release();
            return Boolean.TRUE;
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$8  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass8 extends Lambda implements Function0<Boolean> {
        public final /* synthetic */ TextFieldSelectionManager $manager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(TextFieldSelectionManager textFieldSelectionManager) {
            super(0);
            this.$manager = textFieldSelectionManager;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            this.$manager.paste$foundation_release();
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CoreTextFieldKt$CoreTextField$semanticsModifier$1(ImeOptions imeOptions, TransformedText transformedText, TextFieldValue textFieldValue, boolean z, boolean z2, boolean z3, TextFieldState textFieldState, Function1<? super TextFieldValue, Unit> function1, OffsetMapping offsetMapping, TextFieldSelectionManager textFieldSelectionManager, FocusRequester focusRequester) {
        super(1);
        this.$imeOptions = imeOptions;
        this.$transformedText = transformedText;
        this.$value = textFieldValue;
        this.$enabled = z;
        this.$isPassword = z2;
        this.$readOnly = z3;
        this.$state = textFieldState;
        this.$onValueChangeWrapper = function1;
        this.$offsetMapping = offsetMapping;
        this.$manager = textFieldSelectionManager;
        this.$focusRequester = focusRequester;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        invoke2(semanticsPropertyReceiver);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.m2993setImeAction4L7nppU(semantics, this.$imeOptions.m3152getImeActioneUduSuo());
        SemanticsPropertiesKt.setEditableText(semantics, this.$transformedText.getText());
        SemanticsPropertiesKt.m2996setTextSelectionRangeFDrldGo(semantics, this.$value.m3187getSelectiond9O1mEE());
        if (!this.$enabled) {
            SemanticsPropertiesKt.disabled(semantics);
        }
        if (this.$isPassword) {
            SemanticsPropertiesKt.password(semantics);
        }
        SemanticsPropertiesKt.getTextLayoutResult$default(semantics, null, new AnonymousClass1(this.$state), 1, null);
        SemanticsPropertiesKt.setText$default(semantics, null, new AnonymousClass2(this.$onValueChangeWrapper), 1, null);
        SemanticsPropertiesKt.setSelection$default(semantics, null, new AnonymousClass3(this.$offsetMapping, this.$enabled, this.$value, this.$manager, this.$onValueChangeWrapper), 1, null);
        SemanticsPropertiesKt.onClick$default(semantics, null, new AnonymousClass4(this.$state, this.$focusRequester, this.$readOnly), 1, null);
        SemanticsPropertiesKt.onLongClick$default(semantics, null, new AnonymousClass5(this.$manager), 1, null);
        if (!TextRange.m3069getCollapsedimpl(this.$value.m3187getSelectiond9O1mEE()) && !this.$isPassword) {
            SemanticsPropertiesKt.copyText$default(semantics, null, new AnonymousClass6(this.$manager), 1, null);
            if (this.$enabled && !this.$readOnly) {
                SemanticsPropertiesKt.cutText$default(semantics, null, new AnonymousClass7(this.$manager), 1, null);
            }
        }
        if (!this.$enabled || this.$readOnly) {
            return;
        }
        SemanticsPropertiesKt.pasteText$default(semantics, null, new AnonymousClass8(this.$manager), 1, null);
    }
}
