package androidx.compose.foundation.gestures;

import androidx.appcompat.R;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class DraggableKt$rememberDraggableState$1$1 extends Lambda implements Function1<Float, Unit> {
    public final /* synthetic */ State<Function1<Float, Unit>> $onDeltaState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DraggableKt$rememberDraggableState$1$1(State<? extends Function1<? super Float, Unit>> state) {
        super(1);
        this.$onDeltaState = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Float f2) {
        invoke(f2.floatValue());
        return Unit.INSTANCE;
    }

    public final void invoke(float f2) {
        this.$onDeltaState.getValue().invoke(Float.valueOf(f2));
    }
}
