package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/material/BackdropScaffoldState;", "it", "Landroidx/compose/material/BackdropValue;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class BackdropScaffoldState$Companion$Saver$2 extends Lambda implements Function1<BackdropValue, BackdropScaffoldState> {
    public final /* synthetic */ AnimationSpec<Float> $animationSpec;
    public final /* synthetic */ Function1<BackdropValue, Boolean> $confirmStateChange;
    public final /* synthetic */ SnackbarHostState $snackbarHostState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BackdropScaffoldState$Companion$Saver$2(AnimationSpec<Float> animationSpec, Function1<? super BackdropValue, Boolean> function1, SnackbarHostState snackbarHostState) {
        super(1);
        this.$animationSpec = animationSpec;
        this.$confirmStateChange = function1;
        this.$snackbarHostState = snackbarHostState;
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final BackdropScaffoldState invoke(@NotNull BackdropValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new BackdropScaffoldState(it, this.$animationSpec, this.$confirmStateChange, this.$snackbarHostState);
    }
}
