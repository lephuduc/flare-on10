package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.style.BaselineShift;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/ui/text/style/BaselineShift;", "invoke-8a2Sb4w", "(Landroidx/compose/runtime/saveable/SaverScope;F)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SaversKt$BaselineShiftSaver$1 extends Lambda implements Function2<SaverScope, BaselineShift, Object> {
    public static final SaversKt$BaselineShiftSaver$1 INSTANCE = new SaversKt$BaselineShiftSaver$1();

    public SaversKt$BaselineShiftSaver$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(SaverScope saverScope, BaselineShift baselineShift) {
        return m3032invoke8a2Sb4w(saverScope, baselineShift.m3231unboximpl());
    }

    @Nullable
    /* renamed from: invoke-8a2Sb4w  reason: not valid java name */
    public final Object m3032invoke8a2Sb4w(@NotNull SaverScope Saver, float f2) {
        Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
        return Float.valueOf(f2);
    }
}
