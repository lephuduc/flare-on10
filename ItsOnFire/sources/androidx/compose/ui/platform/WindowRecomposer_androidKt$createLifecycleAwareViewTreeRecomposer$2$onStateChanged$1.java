package androidx.compose.ui.platform;

import androidx.compose.runtime.Recomposer;
import androidx.lifecycle.LifecycleOwner;
import j.u0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lj/u0;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@DebugMetadata(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", i = {}, l = {270}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class WindowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2$onStateChanged$1 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
    public final /* synthetic */ LifecycleOwner $lifecycleOwner;
    public final /* synthetic */ Recomposer $recomposer;
    public final /* synthetic */ WindowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2 $self;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2$onStateChanged$1(Recomposer recomposer, LifecycleOwner lifecycleOwner, WindowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2 windowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2, Continuation<? super WindowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2$onStateChanged$1> continuation) {
        super(2, continuation);
        this.$recomposer = recomposer;
        this.$lifecycleOwner = lifecycleOwner;
        this.$self = windowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new WindowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2$onStateChanged$1(this.$recomposer, this.$lifecycleOwner, this.$self, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
        return ((WindowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2$onStateChanged$1) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.Unit, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Recomposer recomposer = this.$recomposer;
                this.label = 1;
                if (recomposer.runRecomposeAndApplyChanges(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            this.$lifecycleOwner.getLifecycle().removeObserver(this.$self);
            this = Unit.INSTANCE;
            return this;
        } catch (Throwable th) {
            this.$lifecycleOwner.getLifecycle().removeObserver(this.$self);
            throw th;
        }
    }
}
