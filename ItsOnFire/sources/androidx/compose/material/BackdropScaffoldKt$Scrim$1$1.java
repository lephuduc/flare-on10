package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class BackdropScaffoldKt$Scrim$1$1 extends Lambda implements Function1<DrawScope, Unit> {
    public final /* synthetic */ State<Float> $alpha$delegate;
    public final /* synthetic */ long $color;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$Scrim$1$1(long j2, State<Float> state) {
        super(1);
        this.$color = j2;
        this.$alpha$delegate = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull DrawScope Canvas) {
        float m700Scrim_3J_VO9M$lambda4;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        long j2 = this.$color;
        m700Scrim_3J_VO9M$lambda4 = BackdropScaffoldKt.m700Scrim_3J_VO9M$lambda4(this.$alpha$delegate);
        DrawScope.DefaultImpls.m1829drawRectnJ9OG0$default(Canvas, j2, 0L, 0L, m700Scrim_3J_VO9M$lambda4, null, null, 0, androidx.appcompat.R.styleable.AppCompatTheme_windowActionBarOverlay, null);
    }
}
