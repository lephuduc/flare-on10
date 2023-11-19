package androidx.compose.ui.layout;

import androidx.appcompat.R;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¨\u0006\u0005"}, d2 = {"onPlaced", "Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class OnPlacedModifierKt {
    @Stable
    @ExperimentalComposeUiApi
    @NotNull
    public static final Modifier onPlaced(@NotNull Modifier modifier, @NotNull Function1<? super LayoutCoordinates, Unit> onPlaced) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(onPlaced, "onPlaced");
        return modifier.then(new OnPlacedModifierImpl(onPlaced, InspectableValueKt.isDebugInspectorInfoEnabled() ? new OnPlacedModifierKt$onPlaced$$inlined$debugInspectorInfo$1(onPlaced) : InspectableValueKt.getNoInspectorInfo()));
    }
}
