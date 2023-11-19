package androidx.compose.foundation.interaction;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import o.i;
import org.jetbrains.annotations.NotNull;

@Stable
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/interaction/InteractionSource;", "", "Lo/i;", "Landroidx/compose/foundation/interaction/Interaction;", "getInteractions", "()Lo/i;", "interactions", "foundation_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public interface InteractionSource {
    @NotNull
    i<Interaction> getInteractions();
}
