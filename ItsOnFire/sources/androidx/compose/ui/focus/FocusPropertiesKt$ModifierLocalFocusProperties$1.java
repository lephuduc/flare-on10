package androidx.compose.ui.focus;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/focus/FocusProperties;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class FocusPropertiesKt$ModifierLocalFocusProperties$1 extends Lambda implements Function0<FocusProperties> {
    public static final FocusPropertiesKt$ModifierLocalFocusProperties$1 INSTANCE = new FocusPropertiesKt$ModifierLocalFocusProperties$1();

    public FocusPropertiesKt$ModifierLocalFocusProperties$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final FocusProperties invoke() {
        return DefaultFocusProperties.INSTANCE;
    }
}
