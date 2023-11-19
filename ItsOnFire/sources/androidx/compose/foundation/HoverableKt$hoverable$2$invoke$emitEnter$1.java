package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
@DebugMetadata(c = "androidx.compose.foundation.HoverableKt$hoverable$2", f = "Hoverable.kt", i = {0, 0}, l = {androidx.appcompat.R.styleable.AppCompatTheme_colorSwitchThumbNormal}, m = "invoke$emitEnter", n = {"hoverInteraction$delegate", "interaction"}, s = {"L$0", "L$1"})
/* loaded from: classes.dex */
public final class HoverableKt$hoverable$2$invoke$emitEnter$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;

    public HoverableKt$hoverable$2$invoke$emitEnter$1(Continuation<? super HoverableKt$hoverable$2$invoke$emitEnter$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return HoverableKt$hoverable$2.invoke$emitEnter(null, null, this);
    }
}
