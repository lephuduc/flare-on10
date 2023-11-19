package androidx.compose.ui.platform;

import androidx.appcompat.R;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.text.input.TextInputService;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0003¢\u0006\u0002\u0010\tJ\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f2\u0006\u0010\r\u001a\u00020\u0005H\u0086\u0004R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/platform/LocalSoftwareKeyboardController;", "", "()V", "LocalSoftwareKeyboardController", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "current", "getCurrent$annotations", "getCurrent", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/platform/SoftwareKeyboardController;", "delegatingController", "provides", "Landroidx/compose/runtime/ProvidedValue;", "softwareKeyboardController", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LocalSoftwareKeyboardController {
    public static final int $stable = 0;
    @NotNull
    public static final LocalSoftwareKeyboardController INSTANCE = new LocalSoftwareKeyboardController();
    @NotNull
    private static final ProvidableCompositionLocal<SoftwareKeyboardController> LocalSoftwareKeyboardController = CompositionLocalKt.compositionLocalOf$default(null, LocalSoftwareKeyboardController$LocalSoftwareKeyboardController$1.INSTANCE, 1, null);

    private LocalSoftwareKeyboardController() {
    }

    @Composable
    private final SoftwareKeyboardController delegatingController(Composer composer, int i2) {
        composer.startReplaceableGroup(1255403937);
        TextInputService textInputService = (TextInputService) composer.consume(CompositionLocalsKt.getLocalTextInputService());
        if (textInputService == null) {
            composer.endReplaceableGroup();
            return null;
        }
        composer.startReplaceableGroup(-3686930);
        boolean changed = composer.changed(textInputService);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DelegatingSoftwareKeyboardController(textInputService);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) rememberedValue;
        composer.endReplaceableGroup();
        return delegatingSoftwareKeyboardController;
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getCurrent$annotations() {
    }

    @Composable
    @JvmName(name = "getCurrent")
    @Nullable
    public final SoftwareKeyboardController getCurrent(@Nullable Composer composer, int i2) {
        composer.startReplaceableGroup(1850767929);
        SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composer.consume(LocalSoftwareKeyboardController);
        if (softwareKeyboardController == null) {
            softwareKeyboardController = delegatingController(composer, i2 & 14);
        }
        composer.endReplaceableGroup();
        return softwareKeyboardController;
    }

    @NotNull
    public final ProvidedValue<SoftwareKeyboardController> provides(@NotNull SoftwareKeyboardController softwareKeyboardController) {
        Intrinsics.checkNotNullParameter(softwareKeyboardController, "softwareKeyboardController");
        return LocalSoftwareKeyboardController.provides(softwareKeyboardController);
    }
}
