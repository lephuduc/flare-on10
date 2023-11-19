package androidx.compose.foundation.relocation;

import androidx.appcompat.R;
import androidx.compose.foundation.relocation.BringIntoViewResponder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class BringIntoViewResponder$Companion$ModifierLocalBringIntoViewResponder$1 extends Lambda implements Function0<BringIntoViewResponder> {
    public static final BringIntoViewResponder$Companion$ModifierLocalBringIntoViewResponder$1 INSTANCE = new BringIntoViewResponder$Companion$ModifierLocalBringIntoViewResponder$1();

    public BringIntoViewResponder$Companion$ModifierLocalBringIntoViewResponder$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final BringIntoViewResponder invoke() {
        return BringIntoViewResponder.Companion.$$INSTANCE.getRootBringIntoViewResponder();
    }
}
