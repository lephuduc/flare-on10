package androidx.compose.foundation.gestures;

import androidx.appcompat.R;
import com.google.firebase.messaging.ServiceStarter;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior", f = "Scrollable.kt", i = {0}, l = {ServiceStarter.ERROR_SECURITY_EXCEPTION}, m = "performFling", n = {"velocityLeft"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class DefaultFlingBehavior$performFling$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DefaultFlingBehavior this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFlingBehavior$performFling$1(DefaultFlingBehavior defaultFlingBehavior, Continuation<? super DefaultFlingBehavior$performFling$1> continuation) {
        super(continuation);
        this.this$0 = defaultFlingBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.performFling(null, 0.0f, this);
    }
}
