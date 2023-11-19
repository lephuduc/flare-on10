package androidx.compose.material;

import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@DebugMetadata(c = "androidx.compose.material.SliderKt$sliderPressModifier$1", f = "Slider.kt", i = {}, l = {798}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class SliderKt$sliderPressModifier$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ DraggableState $draggableState;
    public final /* synthetic */ State<Function1<Float, Unit>> $gestureEndAction;
    public final /* synthetic */ MutableInteractionSource $interactionSource;
    public final /* synthetic */ boolean $isRtl;
    public final /* synthetic */ float $maxPx;
    public final /* synthetic */ State<Float> $rawOffset;
    private /* synthetic */ Object L$0;
    public int label;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/geometry/Offset;", "pos", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "androidx.compose.material.SliderKt$sliderPressModifier$1$1", f = "Slider.kt", i = {0, 0, 1, 1, 2}, l = {800, 805, 808, 818}, m = "invokeSuspend", n = {"$this$detectTapGestures", "pos", "$this$detectTapGestures", "interaction", "interaction"}, s = {"L$0", "J$0", "L$0", "L$1", "L$0"})
    /* renamed from: androidx.compose.material.SliderKt$sliderPressModifier$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {
        public final /* synthetic */ DraggableState $draggableState;
        public final /* synthetic */ State<Function1<Float, Unit>> $gestureEndAction;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ boolean $isRtl;
        public final /* synthetic */ float $maxPx;
        public final /* synthetic */ State<Float> $rawOffset;
        public /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/DragScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "androidx.compose.material.SliderKt$sliderPressModifier$1$1$1", f = "Slider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.material.SliderKt$sliderPressModifier$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00401 extends SuspendLambda implements Function2<DragScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ boolean $isRtl;
            public final /* synthetic */ float $maxPx;
            public final /* synthetic */ long $pos;
            public final /* synthetic */ State<Float> $rawOffset;
            private /* synthetic */ Object L$0;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00401(boolean z, float f2, long j2, State<Float> state, Continuation<? super C00401> continuation) {
                super(2, continuation);
                this.$isRtl = z;
                this.$maxPx = f2;
                this.$pos = j2;
                this.$rawOffset = state;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C00401 c00401 = new C00401(this.$isRtl, this.$maxPx, this.$pos, this.$rawOffset, continuation);
                c00401.L$0 = obj;
                return c00401;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull DragScope dragScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C00401) create(dragScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    ((DragScope) this.L$0).dragBy((this.$isRtl ? this.$maxPx - Offset.m1161getXimpl(this.$pos) : Offset.m1161getXimpl(this.$pos)) - this.$rawOffset.getValue().floatValue());
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(DraggableState draggableState, MutableInteractionSource mutableInteractionSource, State<? extends Function1<? super Float, Unit>> state, boolean z, float f2, State<Float> state2, Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
            this.$draggableState = draggableState;
            this.$interactionSource = mutableInteractionSource;
            this.$gestureEndAction = state;
            this.$isRtl = z;
            this.$maxPx = f2;
            this.$rawOffset = state2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, Continuation<? super Unit> continuation) {
            return m951invoked4ec7I(pressGestureScope, offset.m1171unboximpl(), continuation);
        }

        @Nullable
        /* renamed from: invoke-d-4ec7I  reason: not valid java name */
        public final Object m951invoked4ec7I(@NotNull PressGestureScope pressGestureScope, long j2, @Nullable Continuation<? super Unit> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$draggableState, this.$interactionSource, this.$gestureEndAction, this.$isRtl, this.$maxPx, this.$rawOffset, continuation);
            anonymousClass1.L$0 = pressGestureScope;
            anonymousClass1.J$0 = j2;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x009f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00b8 A[Catch: CancellationException -> 0x00c4, TryCatch #0 {CancellationException -> 0x00c4, blocks: (B:12:0x0027, B:26:0x00a0, B:28:0x00b8, B:29:0x00be, B:23:0x0091), top: B:37:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00be A[Catch: CancellationException -> 0x00c4, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x00c4, blocks: (B:12:0x0027, B:26:0x00a0, B:28:0x00b8, B:29:0x00be, B:23:0x0091), top: B:37:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00d9 A[RETURN] */
        /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.foundation.interaction.PressInteraction$Press, int] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 221
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt$sliderPressModifier$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$sliderPressModifier$1(DraggableState draggableState, MutableInteractionSource mutableInteractionSource, State<? extends Function1<? super Float, Unit>> state, boolean z, float f2, State<Float> state2, Continuation<? super SliderKt$sliderPressModifier$1> continuation) {
        super(2, continuation);
        this.$draggableState = draggableState;
        this.$interactionSource = mutableInteractionSource;
        this.$gestureEndAction = state;
        this.$isRtl = z;
        this.$maxPx = f2;
        this.$rawOffset = state2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        SliderKt$sliderPressModifier$1 sliderKt$sliderPressModifier$1 = new SliderKt$sliderPressModifier$1(this.$draggableState, this.$interactionSource, this.$gestureEndAction, this.$isRtl, this.$maxPx, this.$rawOffset, continuation);
        sliderKt$sliderPressModifier$1.L$0 = obj;
        return sliderKt$sliderPressModifier$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation<? super Unit> continuation) {
        return ((SliderKt$sliderPressModifier$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$draggableState, this.$interactionSource, this.$gestureEndAction, this.$isRtl, this.$maxPx, this.$rawOffset, null);
            this.label = 1;
            if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, anonymousClass1, null, this, 11, null) == coroutine_suspended) {
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
