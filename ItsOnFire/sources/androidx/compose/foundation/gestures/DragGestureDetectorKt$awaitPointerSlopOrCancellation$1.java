package androidx.compose.foundation.gestures;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, 135}, m = "awaitPointerSlopOrCancellation-gDDlDlE", n = {"$this$awaitPointerSlopOrCancellation", "onPointerSlopReached", "pointer", "offset", "touchSlop", "$this$awaitPointerSlopOrCancellation", "onPointerSlopReached", "pointer", "dragEvent", "offset", "touchSlop"}, s = {"L$0", "L$1", "L$2", "J$0", "F$0", "L$0", "L$1", "L$2", "L$3", "J$0", "F$0"})
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 extends ContinuationImpl {
    public float F$0;
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;

    public DragGestureDetectorKt$awaitPointerSlopOrCancellation$1(Continuation<? super DragGestureDetectorKt$awaitPointerSlopOrCancellation$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.m231awaitPointerSlopOrCancellationgDDlDlE(null, 0L, 0, null, this);
    }
}
