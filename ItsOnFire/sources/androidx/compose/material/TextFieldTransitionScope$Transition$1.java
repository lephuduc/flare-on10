package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TextFieldTransitionScope$Transition$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ Function7<Float, Color, Color, Dp, Float, Composer, Integer, Unit> $content;
    public final /* synthetic */ Function3<InputPhase, Composer, Integer, Color> $contentColor;
    public final /* synthetic */ long $focusedTextStyleColor;
    public final /* synthetic */ InputPhase $inputState;
    public final /* synthetic */ boolean $showLabel;
    public final /* synthetic */ TextFieldTransitionScope $tmp0_rcvr;
    public final /* synthetic */ long $unfocusedTextStyleColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldTransitionScope$Transition$1(TextFieldTransitionScope textFieldTransitionScope, InputPhase inputPhase, long j2, long j3, Function3<? super InputPhase, ? super Composer, ? super Integer, Color> function3, boolean z, Function7<? super Float, ? super Color, ? super Color, ? super Dp, ? super Float, ? super Composer, ? super Integer, Unit> function7, int i2) {
        super(2);
        this.$tmp0_rcvr = textFieldTransitionScope;
        this.$inputState = inputPhase;
        this.$focusedTextStyleColor = j2;
        this.$unfocusedTextStyleColor = j3;
        this.$contentColor = function3;
        this.$showLabel = z;
        this.$content = function7;
        this.$$changed = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        this.$tmp0_rcvr.m1025TransitionDTcfvLk(this.$inputState, this.$focusedTextStyleColor, this.$unfocusedTextStyleColor, this.$contentColor, this.$showLabel, this.$content, composer, this.$$changed | 1);
    }
}
