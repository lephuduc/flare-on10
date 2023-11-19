package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TextFieldKt$TextField$2$1 extends Lambda implements Function1<TextFieldValue, Unit> {
    public final /* synthetic */ Function1<String, Unit> $onValueChange;
    public final /* synthetic */ MutableState<TextFieldValue> $textFieldValueState$delegate;
    public final /* synthetic */ String $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldKt$TextField$2$1(String str, Function1<? super String, Unit> function1, MutableState<TextFieldValue> mutableState) {
        super(1);
        this.$value = str;
        this.$onValueChange = function1;
        this.$textFieldValueState$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
        invoke2(textFieldValue);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull TextFieldValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$textFieldValueState$delegate.setValue(it);
        if (Intrinsics.areEqual(this.$value, it.getText())) {
            return;
        }
        this.$onValueChange.invoke(it.getText());
    }
}
