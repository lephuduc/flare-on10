package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import j.l;
import j.n2;
import j.u0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lj/u0;", "Lj/n2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.BringIntoViewResponder$bringIntoView$2", f = "Scrollable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class BringIntoViewResponder$bringIntoView$2 extends SuspendLambda implements Function2<u0, Continuation<? super n2>, Object> {
    public final /* synthetic */ Rect $destRect;
    public final /* synthetic */ Rect $rect;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ BringIntoViewResponder this$0;

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lj/u0;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.BringIntoViewResponder$bringIntoView$2$1", f = "Scrollable.kt", i = {}, l = {455}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.gestures.BringIntoViewResponder$bringIntoView$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Rect $destRect;
        public final /* synthetic */ Rect $rect;
        public int label;
        public final /* synthetic */ BringIntoViewResponder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BringIntoViewResponder bringIntoViewResponder, Rect rect, Rect rect2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = bringIntoViewResponder;
            this.$rect = rect;
            this.$destRect = rect2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$rect, this.$destRect, continuation);
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
                BringIntoViewResponder bringIntoViewResponder = this.this$0;
                Rect rect = this.$rect;
                Rect rect2 = this.$destRect;
                this.label = 1;
                if (bringIntoViewResponder.performBringIntoView(rect, rect2, this) == coroutine_suspended) {
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

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lj/u0;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.BringIntoViewResponder$bringIntoView$2$2", f = "Scrollable.kt", i = {}, l = {460}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.gestures.BringIntoViewResponder$bringIntoView$2$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Rect $destRect;
        public int label;
        public final /* synthetic */ BringIntoViewResponder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BringIntoViewResponder bringIntoViewResponder, Rect rect, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = bringIntoViewResponder;
            this.$destRect = rect;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$destRect, continuation);
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
            androidx.compose.foundation.relocation.BringIntoViewResponder bringIntoViewResponder;
            androidx.compose.foundation.relocation.BringIntoViewResponder bringIntoViewResponder2;
            LayoutCoordinates layoutCoordinates;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                bringIntoViewResponder = this.this$0.parent;
                LayoutCoordinates layoutCoordinates2 = null;
                if (bringIntoViewResponder == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("parent");
                    bringIntoViewResponder = null;
                }
                bringIntoViewResponder2 = this.this$0.parent;
                if (bringIntoViewResponder2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("parent");
                    bringIntoViewResponder2 = null;
                }
                Rect rect = this.$destRect;
                layoutCoordinates = this.this$0.layoutCoordinates;
                if (layoutCoordinates == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutCoordinates");
                } else {
                    layoutCoordinates2 = layoutCoordinates;
                }
                Rect localRect = bringIntoViewResponder2.toLocalRect(rect, layoutCoordinates2);
                this.label = 1;
                if (bringIntoViewResponder.bringIntoView(localRect, this) == coroutine_suspended) {
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
    public BringIntoViewResponder$bringIntoView$2(BringIntoViewResponder bringIntoViewResponder, Rect rect, Rect rect2, Continuation<? super BringIntoViewResponder$bringIntoView$2> continuation) {
        super(2, continuation);
        this.this$0 = bringIntoViewResponder;
        this.$rect = rect;
        this.$destRect = rect2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        BringIntoViewResponder$bringIntoView$2 bringIntoViewResponder$bringIntoView$2 = new BringIntoViewResponder$bringIntoView$2(this.this$0, this.$rect, this.$destRect, continuation);
        bringIntoViewResponder$bringIntoView$2.L$0 = obj;
        return bringIntoViewResponder$bringIntoView$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super n2> continuation) {
        return ((BringIntoViewResponder$bringIntoView$2) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        n2 f2;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            u0 u0Var = (u0) this.L$0;
            l.f(u0Var, null, null, new AnonymousClass1(this.this$0, this.$rect, this.$destRect, null), 3, null);
            f2 = l.f(u0Var, null, null, new AnonymousClass2(this.this$0, this.$destRect, null), 3, null);
            return f2;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
