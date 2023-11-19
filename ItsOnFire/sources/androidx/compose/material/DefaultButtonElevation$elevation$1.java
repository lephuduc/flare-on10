package androidx.compose.material;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import j.u0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.i;
import o.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
@DebugMetadata(c = "androidx.compose.material.DefaultButtonElevation$elevation$1", f = "Button.kt", i = {}, l = {617}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class DefaultButtonElevation$elevation$1 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
    public final /* synthetic */ InteractionSource $interactionSource;
    public final /* synthetic */ SnapshotStateList<Interaction> $interactions;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultButtonElevation$elevation$1(InteractionSource interactionSource, SnapshotStateList<Interaction> snapshotStateList, Continuation<? super DefaultButtonElevation$elevation$1> continuation) {
        super(2, continuation);
        this.$interactionSource = interactionSource;
        this.$interactions = snapshotStateList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new DefaultButtonElevation$elevation$1(this.$interactionSource, this.$interactions, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
        return ((DefaultButtonElevation$elevation$1) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            i<Interaction> interactions = this.$interactionSource.getInteractions();
            final SnapshotStateList<Interaction> snapshotStateList = this.$interactions;
            j<Interaction> jVar = new j<Interaction>() { // from class: androidx.compose.material.DefaultButtonElevation$elevation$1$invokeSuspend$$inlined$collect$1
                @Override // o.j
                @Nullable
                public Object emit(Interaction interaction, @NotNull Continuation<? super Unit> continuation) {
                    SnapshotStateList snapshotStateList2;
                    Object press;
                    Interaction interaction2 = interaction;
                    if (!(interaction2 instanceof HoverInteraction.Enter)) {
                        if (interaction2 instanceof HoverInteraction.Exit) {
                            snapshotStateList2 = SnapshotStateList.this;
                            press = ((HoverInteraction.Exit) interaction2).getEnter();
                        } else if (!(interaction2 instanceof FocusInteraction.Focus)) {
                            if (interaction2 instanceof FocusInteraction.Unfocus) {
                                snapshotStateList2 = SnapshotStateList.this;
                                press = ((FocusInteraction.Unfocus) interaction2).getFocus();
                            } else if (!(interaction2 instanceof PressInteraction.Press)) {
                                if (!(interaction2 instanceof PressInteraction.Release)) {
                                    if (interaction2 instanceof PressInteraction.Cancel) {
                                        snapshotStateList2 = SnapshotStateList.this;
                                        press = ((PressInteraction.Cancel) interaction2).getPress();
                                    }
                                    return Unit.INSTANCE;
                                }
                                snapshotStateList2 = SnapshotStateList.this;
                                press = ((PressInteraction.Release) interaction2).getPress();
                            }
                        }
                        snapshotStateList2.remove(press);
                        return Unit.INSTANCE;
                    }
                    SnapshotStateList.this.add(interaction2);
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (interactions.collect(jVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
