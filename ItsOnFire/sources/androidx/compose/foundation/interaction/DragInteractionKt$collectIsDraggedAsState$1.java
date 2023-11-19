package androidx.compose.foundation.interaction;

import androidx.appcompat.R;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.runtime.MutableState;
import j.u0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.i;
import o.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@DebugMetadata(c = "androidx.compose.foundation.interaction.DragInteractionKt$collectIsDraggedAsState$1", f = "DragInteraction.kt", i = {}, l = {R.styleable.AppCompatTheme_seekBarStyle}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class DragInteractionKt$collectIsDraggedAsState$1 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Boolean> $isDragged;
    public final /* synthetic */ InteractionSource $this_collectIsDraggedAsState;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragInteractionKt$collectIsDraggedAsState$1(InteractionSource interactionSource, MutableState<Boolean> mutableState, Continuation<? super DragInteractionKt$collectIsDraggedAsState$1> continuation) {
        super(2, continuation);
        this.$this_collectIsDraggedAsState = interactionSource;
        this.$isDragged = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new DragInteractionKt$collectIsDraggedAsState$1(this.$this_collectIsDraggedAsState, this.$isDragged, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
        return ((DragInteractionKt$collectIsDraggedAsState$1) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            final ArrayList arrayList = new ArrayList();
            i<Interaction> interactions = this.$this_collectIsDraggedAsState.getInteractions();
            final MutableState<Boolean> mutableState = this.$isDragged;
            j<Interaction> jVar = new j<Interaction>() { // from class: androidx.compose.foundation.interaction.DragInteractionKt$collectIsDraggedAsState$1$invokeSuspend$$inlined$collect$1
                @Override // o.j
                @Nullable
                public Object emit(Interaction interaction, @NotNull Continuation<? super Unit> continuation) {
                    List list;
                    DragInteraction.Start start;
                    Interaction interaction2 = interaction;
                    if (interaction2 instanceof DragInteraction.Start) {
                        arrayList.add(interaction2);
                    } else {
                        if (interaction2 instanceof DragInteraction.Stop) {
                            list = arrayList;
                            start = ((DragInteraction.Stop) interaction2).getStart();
                        } else if (interaction2 instanceof DragInteraction.Cancel) {
                            list = arrayList;
                            start = ((DragInteraction.Cancel) interaction2).getStart();
                        }
                        list.remove(start);
                    }
                    mutableState.setValue(Boxing.boxBoolean(!arrayList.isEmpty()));
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
