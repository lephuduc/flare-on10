package androidx.compose.ui.focus;

import androidx.appcompat.R;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.node.ModifiedFocusNode;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0005\u001a\u00020\u0006*\u00020\u00062\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n\u001a\u0014\u0010\u000b\u001a\u00020\t*\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0000\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u000e"}, d2 = {"ModifierLocalFocusProperties", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "Landroidx/compose/ui/focus/FocusProperties;", "getModifierLocalFocusProperties", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "focusProperties", "Landroidx/compose/ui/Modifier;", "scope", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "setUpdatedProperties", "Landroidx/compose/ui/node/ModifiedFocusNode;", "properties", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class FocusPropertiesKt {
    @NotNull
    private static final ProvidableModifierLocal<FocusProperties> ModifierLocalFocusProperties = ModifierLocalKt.modifierLocalOf(FocusPropertiesKt$ModifierLocalFocusProperties$1.INSTANCE);

    @NotNull
    public static final Modifier focusProperties(@NotNull Modifier modifier, @NotNull Function1<? super FocusProperties, Unit> scope) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return modifier.then(new FocusPropertiesModifier(scope, InspectableValueKt.isDebugInspectorInfoEnabled() ? new FocusPropertiesKt$focusProperties$$inlined$debugInspectorInfo$1(scope) : InspectableValueKt.getNoInspectorInfo()));
    }

    @NotNull
    public static final ProvidableModifierLocal<FocusProperties> getModifierLocalFocusProperties() {
        return ModifierLocalFocusProperties;
    }

    public static final void setUpdatedProperties(@NotNull ModifiedFocusNode modifiedFocusNode, @NotNull FocusProperties properties) {
        Intrinsics.checkNotNullParameter(modifiedFocusNode, "<this>");
        Intrinsics.checkNotNullParameter(properties, "properties");
        if (properties.getCanFocus()) {
            FocusTransactionsKt.activateNode(modifiedFocusNode);
        } else {
            FocusTransactionsKt.deactivateNode(modifiedFocusNode);
        }
    }
}
