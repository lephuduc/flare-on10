package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class OutlinedTextFieldKt$OutlinedTextFieldLayout$1$1$1 extends Lambda implements Function1<Size, Unit> {
    public final /* synthetic */ float $labelProgress;
    public final /* synthetic */ MutableState<Size> $labelSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutlinedTextFieldKt$OutlinedTextFieldLayout$1$1$1(float f2, MutableState<Size> mutableState) {
        super(1);
        this.$labelProgress = f2;
        this.$labelSize = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Size size) {
        m910invokeuvyYCjk(size.m1235unboximpl());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-uvyYCjk  reason: not valid java name */
    public final void m910invokeuvyYCjk(long j2) {
        float m1230getWidthimpl = Size.m1230getWidthimpl(j2) * this.$labelProgress;
        float m1227getHeightimpl = Size.m1227getHeightimpl(j2) * this.$labelProgress;
        if (Size.m1230getWidthimpl(this.$labelSize.getValue().m1235unboximpl()) == m1230getWidthimpl) {
            if (Size.m1227getHeightimpl(this.$labelSize.getValue().m1235unboximpl()) == m1227getHeightimpl) {
                return;
            }
        }
        this.$labelSize.setValue(Size.m1218boximpl(SizeKt.Size(m1230getWidthimpl, m1227getHeightimpl)));
    }
}
