package androidx.compose.foundation.gestures;

import androidx.appcompat.R;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.core.app.NotificationCompat;
import androidx.core.view.InputDeviceCompat;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import l.n;
import l.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class DraggableKt$draggable$9 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    public final /* synthetic */ Function1<PointerInputChange, Boolean> $canDrag;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ MutableInteractionSource $interactionSource;
    public final /* synthetic */ Function3<u0, Offset, Continuation<? super Unit>, Object> $onDragStarted;
    public final /* synthetic */ Function3<u0, Float, Continuation<? super Unit>, Object> $onDragStopped;
    public final /* synthetic */ Orientation $orientation;
    public final /* synthetic */ boolean $reverseDirection;
    public final /* synthetic */ Function0<Boolean> $startDragImmediately;
    public final /* synthetic */ Function2<Composer, Integer, PointerAwareDraggableState> $stateFactory;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
        public final /* synthetic */ MutableState<DragInteraction.Start> $draggedInteraction;
        public final /* synthetic */ MutableInteractionSource $interactionSource;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MutableState<DragInteraction.Start> mutableState, MutableInteractionSource mutableInteractionSource) {
            super(1);
            this.$draggedInteraction = mutableState;
            this.$interactionSource = mutableInteractionSource;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            final MutableState<DragInteraction.Start> mutableState = this.$draggedInteraction;
            final MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            return new DisposableEffectResult() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$9$1$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    DragInteraction.Start start = (DragInteraction.Start) MutableState.this.getValue();
                    if (start == null) {
                        return;
                    }
                    MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                    if (mutableInteractionSource2 != null) {
                        mutableInteractionSource2.tryEmit(new DragInteraction.Cancel(start));
                    }
                    MutableState.this.setValue(null);
                }
            };
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$2", f = "Draggable.kt", i = {0, 0, 1, 1, 2, 2, 3, 4, 5}, l = {237, 239, 241, 251, 253, InputDeviceCompat.SOURCE_KEYBOARD}, m = "invokeSuspend", n = {"$this$LaunchedEffect", NotificationCompat.CATEGORY_EVENT, "$this$LaunchedEffect", NotificationCompat.CATEGORY_EVENT, "$this$LaunchedEffect", NotificationCompat.CATEGORY_EVENT, "$this$LaunchedEffect", "$this$LaunchedEffect", "$this$LaunchedEffect"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$0", "L$0"})
    /* renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
        public final /* synthetic */ n<DragEvent> $channel;
        public final /* synthetic */ State<DragLogic> $dragLogic$delegate;
        public final /* synthetic */ PointerAwareDraggableState $state;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$2$2", f = "Draggable.kt", i = {0}, l = {246}, m = "invokeSuspend", n = {"$this$drag"}, s = {"L$0"})
        /* renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$2$2  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00102 extends SuspendLambda implements Function2<PointerAwareDragScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ n<DragEvent> $channel;
            public final /* synthetic */ Ref.ObjectRef<DragEvent> $event;
            private /* synthetic */ Object L$0;
            public Object L$1;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00102(Ref.ObjectRef<DragEvent> objectRef, n<DragEvent> nVar, Continuation<? super C00102> continuation) {
                super(2, continuation);
                this.$event = objectRef;
                this.$channel = nVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C00102 c00102 = new C00102(this.$event, this.$channel, continuation);
                c00102.L$0 = obj;
                return c00102;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull PointerAwareDragScope pointerAwareDragScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C00102) create(pointerAwareDragScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0057 -> B:23:0x005a). Please submit an issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r6.label
                    r2 = 1
                    if (r1 == 0) goto L1f
                    if (r1 != r2) goto L17
                    java.lang.Object r1 = r6.L$1
                    kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                    java.lang.Object r3 = r6.L$0
                    androidx.compose.foundation.gestures.PointerAwareDragScope r3 = (androidx.compose.foundation.gestures.PointerAwareDragScope) r3
                    kotlin.ResultKt.throwOnFailure(r7)
                    goto L5a
                L17:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L1f:
                    kotlin.ResultKt.throwOnFailure(r7)
                    java.lang.Object r7 = r6.L$0
                    androidx.compose.foundation.gestures.PointerAwareDragScope r7 = (androidx.compose.foundation.gestures.PointerAwareDragScope) r7
                    r3 = r7
                L27:
                    kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.DragEvent> r7 = r6.$event
                    T r7 = r7.element
                    boolean r1 = r7 instanceof androidx.compose.foundation.gestures.DragEvent.DragStopped
                    if (r1 != 0) goto L5d
                    boolean r1 = r7 instanceof androidx.compose.foundation.gestures.DragEvent.DragCancelled
                    if (r1 != 0) goto L5d
                    boolean r1 = r7 instanceof androidx.compose.foundation.gestures.DragEvent.DragDelta
                    if (r1 == 0) goto L3a
                    androidx.compose.foundation.gestures.DragEvent$DragDelta r7 = (androidx.compose.foundation.gestures.DragEvent.DragDelta) r7
                    goto L3b
                L3a:
                    r7 = 0
                L3b:
                    if (r7 != 0) goto L3e
                    goto L49
                L3e:
                    float r1 = r7.getDelta()
                    long r4 = r7.m223getPointerPositionF1C5BW0()
                    r3.mo256dragByUv8p0NA(r1, r4)
                L49:
                    kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.DragEvent> r1 = r6.$event
                    l.n<androidx.compose.foundation.gestures.DragEvent> r7 = r6.$channel
                    r6.L$0 = r3
                    r6.L$1 = r1
                    r6.label = r2
                    java.lang.Object r7 = r7.F(r6)
                    if (r7 != r0) goto L5a
                    return r0
                L5a:
                    r1.element = r7
                    goto L27
                L5d:
                    kotlin.Unit r6 = kotlin.Unit.INSTANCE
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt$draggable$9.AnonymousClass2.C00102.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(n<DragEvent> nVar, PointerAwareDraggableState pointerAwareDraggableState, State<DragLogic> state, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$channel = nVar;
            this.$state = pointerAwareDraggableState;
            this.$dragLogic$delegate = state;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$channel, this.$state, this.$dragLogic$delegate, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ba A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00c7 A[Catch: CancellationException -> 0x0036, TryCatch #1 {CancellationException -> 0x0036, blocks: (B:31:0x00a2, B:34:0x00bb, B:36:0x00c7, B:41:0x00da, B:43:0x00de, B:12:0x0031), top: B:55:0x0031 }] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00da A[Catch: CancellationException -> 0x0036, TryCatch #1 {CancellationException -> 0x0036, blocks: (B:31:0x00a2, B:34:0x00bb, B:36:0x00c7, B:41:0x00da, B:43:0x00de, B:12:0x0031), top: B:55:0x0031 }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0102 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0103  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0084 -> B:18:0x005c). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00d7 -> B:40:0x00d8). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00ec -> B:18:0x005c). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0100 -> B:40:0x00d8). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
            /*
                Method dump skipped, instructions count: 280
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt$draggable$9.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3", f = "Draggable.kt", i = {}, l = {263}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ State<Function1<PointerInputChange, Boolean>> $canDragState;
        public final /* synthetic */ n<DragEvent> $channel;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ Orientation $orientation;
        public final /* synthetic */ boolean $reverseDirection;
        public final /* synthetic */ State<Function0<Boolean>> $startImmediatelyState;
        private /* synthetic */ Object L$0;
        public int label;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1", f = "Draggable.kt", i = {}, l = {264}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
            public final /* synthetic */ PointerInputScope $$this$pointerInput;
            public final /* synthetic */ State<Function1<PointerInputChange, Boolean>> $canDragState;
            public final /* synthetic */ n<DragEvent> $channel;
            public final /* synthetic */ Orientation $orientation;
            public final /* synthetic */ boolean $reverseDirection;
            public final /* synthetic */ State<Function0<Boolean>> $startImmediatelyState;
            private /* synthetic */ Object L$0;
            public int label;

            @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
            @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1", f = "Draggable.kt", i = {}, l = {265}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C00111 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
                public final /* synthetic */ u0 $$this$coroutineScope;
                public final /* synthetic */ State<Function1<PointerInputChange, Boolean>> $canDragState;
                public final /* synthetic */ n<DragEvent> $channel;
                public final /* synthetic */ Orientation $orientation;
                public final /* synthetic */ boolean $reverseDirection;
                public final /* synthetic */ State<Function0<Boolean>> $startImmediatelyState;
                private /* synthetic */ Object L$0;
                public int label;

                @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
                @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1$1", f = "Draggable.kt", i = {0, 0, 1, 1}, l = {267, 275}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "velocityTracker", "velocityTracker", "isDragSuccessful"}, s = {"L$0", "L$1", "L$0", "I$0"})
                /* renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1$1  reason: invalid class name and collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C00121 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                    public final /* synthetic */ u0 $$this$coroutineScope;
                    public final /* synthetic */ State<Function1<PointerInputChange, Boolean>> $canDragState;
                    public final /* synthetic */ n<DragEvent> $channel;
                    public final /* synthetic */ Orientation $orientation;
                    public final /* synthetic */ boolean $reverseDirection;
                    public final /* synthetic */ State<Function0<Boolean>> $startImmediatelyState;
                    public int I$0;
                    private /* synthetic */ Object L$0;
                    public Object L$1;
                    public Object L$2;
                    public Object L$3;
                    public boolean Z$0;
                    public int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C00121(State<? extends Function1<? super PointerInputChange, Boolean>> state, State<? extends Function0<Boolean>> state2, Orientation orientation, n<DragEvent> nVar, boolean z, u0 u0Var, Continuation<? super C00121> continuation) {
                        super(2, continuation);
                        this.$canDragState = state;
                        this.$startImmediatelyState = state2;
                        this.$orientation = orientation;
                        this.$channel = nVar;
                        this.$reverseDirection = z;
                        this.$$this$coroutineScope = u0Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        C00121 c00121 = new C00121(this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, this.$$this$coroutineScope, continuation);
                        c00121.L$0 = obj;
                        return c00121;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation<? super Unit> continuation) {
                        return ((C00121) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2  */
                    /* JADX WARN: Removed duplicated region for block: B:40:0x00c6  */
                    /* JADX WARN: Removed duplicated region for block: B:51:0x00e3  */
                    /* JADX WARN: Removed duplicated region for block: B:54:0x00eb A[Catch: all -> 0x00ec, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00ec, blocks: (B:49:0x00dd, B:54:0x00eb), top: B:67:0x00dd }] */
                    /* JADX WARN: Removed duplicated region for block: B:57:0x00ef  */
                    /* JADX WARN: Removed duplicated region for block: B:62:0x0103  */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @org.jetbrains.annotations.Nullable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r18) {
                        /*
                            Method dump skipped, instructions count: 265
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt$draggable$9.AnonymousClass3.AnonymousClass1.C00111.C00121.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C00111(State<? extends Function1<? super PointerInputChange, Boolean>> state, State<? extends Function0<Boolean>> state2, Orientation orientation, n<DragEvent> nVar, boolean z, u0 u0Var, Continuation<? super C00111> continuation) {
                    super(2, continuation);
                    this.$canDragState = state;
                    this.$startImmediatelyState = state2;
                    this.$orientation = orientation;
                    this.$channel = nVar;
                    this.$reverseDirection = z;
                    this.$$this$coroutineScope = u0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    C00111 c00111 = new C00111(this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, this.$$this$coroutineScope, continuation);
                    c00111.L$0 = obj;
                    return c00111;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C00111) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        C00121 c00121 = new C00121(this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, this.$$this$coroutineScope, null);
                        this.label = 1;
                        if (((PointerInputScope) this.L$0).awaitPointerEventScope(c00121, this) == coroutine_suspended) {
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
            public AnonymousClass1(PointerInputScope pointerInputScope, State<? extends Function1<? super PointerInputChange, Boolean>> state, State<? extends Function0<Boolean>> state2, Orientation orientation, n<DragEvent> nVar, boolean z, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$$this$pointerInput = pointerInputScope;
                this.$canDragState = state;
                this.$startImmediatelyState = state2;
                this.$orientation = orientation;
                this.$channel = nVar;
                this.$reverseDirection = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$pointerInput, this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, continuation);
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
                    C00111 c00111 = new C00111(this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, u0Var, null);
                    this.label = 1;
                    if (ForEachGestureKt.forEachGesture(pointerInputScope, c00111, this) == coroutine_suspended) {
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
        public AnonymousClass3(boolean z, State<? extends Function1<? super PointerInputChange, Boolean>> state, State<? extends Function0<Boolean>> state2, Orientation orientation, n<DragEvent> nVar, boolean z2, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$enabled = z;
            this.$canDragState = state;
            this.$startImmediatelyState = state2;
            this.$orientation = orientation;
            this.$channel = nVar;
            this.$reverseDirection = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$enabled, this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                if (!this.$enabled) {
                    return Unit.INSTANCE;
                }
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(pointerInputScope, this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, null);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DraggableKt$draggable$9(Function2<? super Composer, ? super Integer, ? extends PointerAwareDraggableState> function2, MutableInteractionSource mutableInteractionSource, Function0<Boolean> function0, Function1<? super PointerInputChange, Boolean> function1, Function3<? super u0, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, Function3<? super u0, ? super Float, ? super Continuation<? super Unit>, ? extends Object> function32, Orientation orientation, boolean z, boolean z2) {
        super(3);
        this.$stateFactory = function2;
        this.$interactionSource = mutableInteractionSource;
        this.$startDragImmediately = function0;
        this.$canDrag = function1;
        this.$onDragStarted = function3;
        this.$onDragStopped = function32;
        this.$orientation = orientation;
        this.$enabled = z;
        this.$reverseDirection = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-2  reason: not valid java name */
    public static final DragLogic m255invoke$lambda2(State<DragLogic> state) {
        return state.getValue();
    }

    @Composable
    @NotNull
    public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(-1197726397);
        PointerAwareDraggableState invoke = this.$stateFactory.invoke(composer, 0);
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
        EffectsKt.DisposableEffect(mutableInteractionSource, new AnonymousClass1(mutableState, mutableInteractionSource), composer, 0);
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = q.d(Integer.MAX_VALUE, null, null, 6, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        n nVar = (n) rememberedValue2;
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(this.$startDragImmediately, composer, 0);
        State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(this.$canDrag, composer, 0);
        EffectsKt.LaunchedEffect(invoke, new AnonymousClass2(nVar, invoke, SnapshotStateKt.rememberUpdatedState(new DragLogic(this.$onDragStarted, this.$onDragStopped, mutableState, this.$interactionSource), composer, 0), null), composer, 0);
        Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput((Modifier) Modifier.Companion, new Object[]{this.$orientation, Boolean.valueOf(this.$enabled), Boolean.valueOf(this.$reverseDirection)}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new AnonymousClass3(this.$enabled, rememberUpdatedState2, rememberUpdatedState, this.$orientation, nVar, this.$reverseDirection, null));
        composer.endReplaceableGroup();
        return pointerInput;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }
}
