package androidx.compose.material;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.State;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import j.u0;
import j.v0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1", f = "Slider.kt", i = {}, l = {862}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class SliderKt$rangeSliderPressDragModifier$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ MutableInteractionSource $endInteractionSource;
    public final /* synthetic */ State<Function1<Boolean, Unit>> $gestureEndAction;
    public final /* synthetic */ boolean $isRtl;
    public final /* synthetic */ float $maxPx;
    public final /* synthetic */ Function2<Boolean, Float, Unit> $onDrag;
    public final /* synthetic */ State<Float> $rawOffsetEnd;
    public final /* synthetic */ State<Float> $rawOffsetStart;
    public final /* synthetic */ MutableInteractionSource $startInteractionSource;
    private /* synthetic */ Object L$0;
    public int label;

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lj/u0;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1", f = "Slider.kt", i = {}, l = {863}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
        public final /* synthetic */ PointerInputScope $$this$pointerInput;
        public final /* synthetic */ State<Function1<Boolean, Unit>> $gestureEndAction;
        public final /* synthetic */ boolean $isRtl;
        public final /* synthetic */ float $maxPx;
        public final /* synthetic */ Function2<Boolean, Float, Unit> $onDrag;
        public final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
        public final /* synthetic */ State<Float> $rawOffsetEnd;
        public final /* synthetic */ State<Float> $rawOffsetStart;
        private /* synthetic */ Object L$0;
        public int label;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1", f = "Slider.kt", i = {}, l = {864}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00381 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ u0 $$this$coroutineScope;
            public final /* synthetic */ State<Function1<Boolean, Unit>> $gestureEndAction;
            public final /* synthetic */ boolean $isRtl;
            public final /* synthetic */ float $maxPx;
            public final /* synthetic */ Function2<Boolean, Float, Unit> $onDrag;
            public final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
            public final /* synthetic */ State<Float> $rawOffsetEnd;
            public final /* synthetic */ State<Float> $rawOffsetStart;
            private /* synthetic */ Object L$0;
            public int label;

            @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            @DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$1", f = "Slider.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2}, l = {868, 888, 909}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "thumbCaptured", "draggingStart", "$this$awaitPointerEventScope", "thumbCaptured", "draggingStart", "pointerEvent", "interaction", "posX", "draggingStart", "interaction"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "F$0", "L$0", "L$1"})
            /* renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C00391 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                public final /* synthetic */ u0 $$this$coroutineScope;
                public final /* synthetic */ State<Function1<Boolean, Unit>> $gestureEndAction;
                public final /* synthetic */ boolean $isRtl;
                public final /* synthetic */ float $maxPx;
                public final /* synthetic */ Function2<Boolean, Float, Unit> $onDrag;
                public final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                public final /* synthetic */ State<Float> $rawOffsetEnd;
                public final /* synthetic */ State<Float> $rawOffsetStart;
                public float F$0;
                private /* synthetic */ Object L$0;
                public Object L$1;
                public Object L$2;
                public Object L$3;
                public Object L$4;
                public int label;

                @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lj/u0;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
                @DebugMetadata(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$1$2", f = "Slider.kt", i = {}, l = {926}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$1$2  reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass2 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
                    public final /* synthetic */ Ref.BooleanRef $draggingStart;
                    public final /* synthetic */ PressInteraction $finishInteraction;
                    public final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                    public int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(RangeSliderLogic rangeSliderLogic, Ref.BooleanRef booleanRef, PressInteraction pressInteraction, Continuation<? super AnonymousClass2> continuation) {
                        super(2, continuation);
                        this.$rangeSliderLogic = rangeSliderLogic;
                        this.$draggingStart = booleanRef;
                        this.$finishInteraction = pressInteraction;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        return new AnonymousClass2(this.$rangeSliderLogic, this.$draggingStart, this.$finishInteraction, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
                        return ((AnonymousClass2) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object coroutine_suspended;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = this.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj);
                            MutableInteractionSource activeInteraction = this.$rangeSliderLogic.activeInteraction(this.$draggingStart.element);
                            PressInteraction pressInteraction = this.$finishInteraction;
                            this.label = 1;
                            if (activeInteraction.emit(pressInteraction, this) == coroutine_suspended) {
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

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C00391(boolean z, float f2, State<Float> state, State<Float> state2, RangeSliderLogic rangeSliderLogic, u0 u0Var, State<? extends Function1<? super Boolean, Unit>> state3, Function2<? super Boolean, ? super Float, Unit> function2, Continuation<? super C00391> continuation) {
                    super(2, continuation);
                    this.$isRtl = z;
                    this.$maxPx = f2;
                    this.$rawOffsetEnd = state;
                    this.$rawOffsetStart = state2;
                    this.$rangeSliderLogic = rangeSliderLogic;
                    this.$$this$coroutineScope = u0Var;
                    this.$gestureEndAction = state3;
                    this.$onDrag = function2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    C00391 c00391 = new C00391(this.$isRtl, this.$maxPx, this.$rawOffsetEnd, this.$rawOffsetStart, this.$rangeSliderLogic, this.$$this$coroutineScope, this.$gestureEndAction, this.$onDrag, continuation);
                    c00391.L$0 = obj;
                    return c00391;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C00391) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Removed duplicated region for block: B:34:0x0116  */
                /* JADX WARN: Removed duplicated region for block: B:51:0x0156  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x017e A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:55:0x017f  */
                /* JADX WARN: Removed duplicated region for block: B:58:0x0188 A[Catch: CancellationException -> 0x0195, TryCatch #1 {CancellationException -> 0x0195, blocks: (B:8:0x001d, B:56:0x0180, B:58:0x0188, B:59:0x018e), top: B:68:0x001d }] */
                /* JADX WARN: Removed duplicated region for block: B:59:0x018e A[Catch: CancellationException -> 0x0195, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0195, blocks: (B:8:0x001d, B:56:0x0180, B:58:0x0188, B:59:0x018e), top: B:68:0x001d }] */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r18) {
                    /*
                        Method dump skipped, instructions count: 446
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1.C00381.C00391.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C00381(boolean z, float f2, State<Float> state, State<Float> state2, RangeSliderLogic rangeSliderLogic, u0 u0Var, State<? extends Function1<? super Boolean, Unit>> state3, Function2<? super Boolean, ? super Float, Unit> function2, Continuation<? super C00381> continuation) {
                super(2, continuation);
                this.$isRtl = z;
                this.$maxPx = f2;
                this.$rawOffsetEnd = state;
                this.$rawOffsetStart = state2;
                this.$rangeSliderLogic = rangeSliderLogic;
                this.$$this$coroutineScope = u0Var;
                this.$gestureEndAction = state3;
                this.$onDrag = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C00381 c00381 = new C00381(this.$isRtl, this.$maxPx, this.$rawOffsetEnd, this.$rawOffsetStart, this.$rangeSliderLogic, this.$$this$coroutineScope, this.$gestureEndAction, this.$onDrag, continuation);
                c00381.L$0 = obj;
                return c00381;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C00381) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    C00391 c00391 = new C00391(this.$isRtl, this.$maxPx, this.$rawOffsetEnd, this.$rawOffsetStart, this.$rangeSliderLogic, this.$$this$coroutineScope, this.$gestureEndAction, this.$onDrag, null);
                    this.label = 1;
                    if (((PointerInputScope) this.L$0).awaitPointerEventScope(c00391, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(PointerInputScope pointerInputScope, boolean z, float f2, State<Float> state, State<Float> state2, RangeSliderLogic rangeSliderLogic, State<? extends Function1<? super Boolean, Unit>> state3, Function2<? super Boolean, ? super Float, Unit> function2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$$this$pointerInput = pointerInputScope;
            this.$isRtl = z;
            this.$maxPx = f2;
            this.$rawOffsetEnd = state;
            this.$rawOffsetStart = state2;
            this.$rangeSliderLogic = rangeSliderLogic;
            this.$gestureEndAction = state3;
            this.$onDrag = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$pointerInput, this.$isRtl, this.$maxPx, this.$rawOffsetEnd, this.$rawOffsetStart, this.$rangeSliderLogic, this.$gestureEndAction, this.$onDrag, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                u0 u0Var = (u0) this.L$0;
                PointerInputScope pointerInputScope = this.$$this$pointerInput;
                C00381 c00381 = new C00381(this.$isRtl, this.$maxPx, this.$rawOffsetEnd, this.$rawOffsetStart, this.$rangeSliderLogic, u0Var, this.$gestureEndAction, this.$onDrag, null);
                this.label = 1;
                if (ForEachGestureKt.forEachGesture(pointerInputScope, c00381, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$rangeSliderPressDragModifier$1(MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State<Float> state, State<Float> state2, Function2<? super Boolean, ? super Float, Unit> function2, boolean z, float f2, State<? extends Function1<? super Boolean, Unit>> state3, Continuation<? super SliderKt$rangeSliderPressDragModifier$1> continuation) {
        super(2, continuation);
        this.$startInteractionSource = mutableInteractionSource;
        this.$endInteractionSource = mutableInteractionSource2;
        this.$rawOffsetStart = state;
        this.$rawOffsetEnd = state2;
        this.$onDrag = function2;
        this.$isRtl = z;
        this.$maxPx = f2;
        this.$gestureEndAction = state3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        SliderKt$rangeSliderPressDragModifier$1 sliderKt$rangeSliderPressDragModifier$1 = new SliderKt$rangeSliderPressDragModifier$1(this.$startInteractionSource, this.$endInteractionSource, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onDrag, this.$isRtl, this.$maxPx, this.$gestureEndAction, continuation);
        sliderKt$rangeSliderPressDragModifier$1.L$0 = obj;
        return sliderKt$rangeSliderPressDragModifier$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation<? super Unit> continuation) {
        return ((SliderKt$rangeSliderPressDragModifier$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((PointerInputScope) this.L$0, this.$isRtl, this.$maxPx, this.$rawOffsetEnd, this.$rawOffsetStart, new RangeSliderLogic(this.$startInteractionSource, this.$endInteractionSource, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onDrag), this.$gestureEndAction, this.$onDrag, null);
            this.label = 1;
            if (v0.g(anonymousClass1, this) == coroutine_suspended) {
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
