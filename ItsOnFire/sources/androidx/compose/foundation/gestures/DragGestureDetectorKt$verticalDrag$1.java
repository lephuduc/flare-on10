package androidx.compose.foundation.gestures;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0}, l = {831}, m = "verticalDrag-jO51t88", n = {"$this$verticalDrag", "onDrag", "pointer$iv$iv"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$verticalDrag$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;

    public DragGestureDetectorKt$verticalDrag$1(Continuation<? super DragGestureDetectorKt$verticalDrag$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.m242verticalDragjO51t88(null, 0L, null, this);
    }
}
