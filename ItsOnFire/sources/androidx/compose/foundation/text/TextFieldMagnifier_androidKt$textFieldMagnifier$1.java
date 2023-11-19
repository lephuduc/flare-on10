package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.foundation.MagnifierKt;
import androidx.compose.foundation.MagnifierStyle;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "center", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Offset;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TextFieldMagnifier_androidKt$textFieldMagnifier$1 extends Lambda implements Function1<Function0<? extends Offset>, Modifier> {
    public static final TextFieldMagnifier_androidKt$textFieldMagnifier$1 INSTANCE = new TextFieldMagnifier_androidKt$textFieldMagnifier$1();

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/unit/Density;", "invoke-tuRUvjQ", "(Landroidx/compose/ui/unit/Density;)J"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.foundation.text.TextFieldMagnifier_androidKt$textFieldMagnifier$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<Density, Offset> {
        public final /* synthetic */ Function0<Offset> $center;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Offset> function0) {
            super(1);
            this.$center = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Offset invoke(Density density) {
            return Offset.m1150boximpl(m604invoketuRUvjQ(density));
        }

        /* renamed from: invoke-tuRUvjQ  reason: not valid java name */
        public final long m604invoketuRUvjQ(@NotNull Density magnifier) {
            Intrinsics.checkNotNullParameter(magnifier, "$this$magnifier");
            return this.$center.invoke().m1171unboximpl();
        }
    }

    public TextFieldMagnifier_androidKt$textFieldMagnifier$1() {
        super(1);
    }

    @NotNull
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Modifier invoke2(@NotNull Function0<Offset> center) {
        Intrinsics.checkNotNullParameter(center, "center");
        return MagnifierKt.magnifier$default(Modifier.Companion, new AnonymousClass1(center), null, 0.0f, MagnifierStyle.Companion.getTextDefault(), 6, null);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Modifier invoke(Function0<? extends Offset> function0) {
        return invoke2((Function0<Offset>) function0);
    }
}
