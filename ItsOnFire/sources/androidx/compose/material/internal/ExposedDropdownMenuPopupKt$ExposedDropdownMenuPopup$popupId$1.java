package androidx.compose.material.internal;

import androidx.appcompat.R;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$popupId$1 extends Lambda implements Function0<UUID> {
    public static final ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$popupId$1 INSTANCE = new ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$popupId$1();

    public ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$popupId$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final UUID invoke() {
        return UUID.randomUUID();
    }
}
