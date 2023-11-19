package androidx.compose.ui.node;

import androidx.appcompat.R;
import androidx.compose.ui.draw.BuildDrawCacheParams;
import androidx.compose.ui.draw.DrawCacheModifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class DrawEntity$updateCache$1 extends Lambda implements Function0<Unit> {
    public final /* synthetic */ DrawEntity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawEntity$updateCache$1(DrawEntity drawEntity) {
        super(0);
        this.this$0 = drawEntity;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        DrawCacheModifier drawCacheModifier;
        BuildDrawCacheParams buildDrawCacheParams;
        drawCacheModifier = this.this$0.cacheDrawModifier;
        if (drawCacheModifier != null) {
            buildDrawCacheParams = this.this$0.buildCacheParams;
            drawCacheModifier.onBuildCache(buildDrawCacheParams);
        }
        this.this$0.invalidateCache = false;
    }
}
