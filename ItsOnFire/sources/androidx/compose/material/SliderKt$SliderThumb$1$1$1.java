package androidx.compose.material;

import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
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
@DebugMetadata(c = "androidx.compose.material.SliderKt$SliderThumb$1$1$1", f = "Slider.kt", i = {}, l = {1090}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class SliderKt$SliderThumb$1$1$1 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
    public final /* synthetic */ MutableInteractionSource $interactionSource;
    public final /* synthetic */ SnapshotStateList<Interaction> $interactions;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$SliderThumb$1$1$1(MutableInteractionSource mutableInteractionSource, SnapshotStateList<Interaction> snapshotStateList, Continuation<? super SliderKt$SliderThumb$1$1$1> continuation) {
        super(2, continuation);
        this.$interactionSource = mutableInteractionSource;
        this.$interactions = snapshotStateList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new SliderKt$SliderThumb$1$1$1(this.$interactionSource, this.$interactions, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
        return ((SliderKt$SliderThumb$1$1$1) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
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
            j<Interaction> jVar = new j<Interaction>() { // from class: androidx.compose.material.SliderKt$SliderThumb$1$1$1$invokeSuspend$$inlined$collect$1
                @Override // o.j
                @Nullable
                public Object emit(Interaction interaction, @NotNull Continuation<? super Unit> continuation) {
                    SnapshotStateList snapshotStateList2;
                    Object start;
                    Interaction interaction2 = interaction;
                    if (!(interaction2 instanceof PressInteraction.Press)) {
                        if (interaction2 instanceof PressInteraction.Release) {
                            snapshotStateList2 = SnapshotStateList.this;
                            start = ((PressInteraction.Release) interaction2).getPress();
                        } else if (interaction2 instanceof PressInteraction.Cancel) {
                            snapshotStateList2 = SnapshotStateList.this;
                            start = ((PressInteraction.Cancel) interaction2).getPress();
                        } else if (!(interaction2 instanceof DragInteraction.Start)) {
                            if (!(interaction2 instanceof DragInteraction.Stop)) {
                                if (interaction2 instanceof DragInteraction.Cancel) {
                                    snapshotStateList2 = SnapshotStateList.this;
                                    start = ((DragInteraction.Cancel) interaction2).getStart();
                                }
                                return Unit.INSTANCE;
                            }
                            snapshotStateList2 = SnapshotStateList.this;
                            start = ((DragInteraction.Stop) interaction2).getStart();
                        }
                        snapshotStateList2.remove(start);
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
