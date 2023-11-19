package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.Placeholder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B&\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¢\u0006\u0002\u0010\tR$\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/text/InlineTextContent;", "", "placeholder", "Landroidx/compose/ui/text/Placeholder;", "children", "Lkotlin/Function1;", "", "", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/text/Placeholder;Lkotlin/jvm/functions/Function3;)V", "getChildren", "()Lkotlin/jvm/functions/Function3;", "Lkotlin/jvm/functions/Function3;", "getPlaceholder", "()Landroidx/compose/ui/text/Placeholder;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class InlineTextContent {
    @NotNull
    private final Function3<String, Composer, Integer, Unit> children;
    @NotNull
    private final Placeholder placeholder;

    /* JADX WARN: Multi-variable type inference failed */
    public InlineTextContent(@NotNull Placeholder placeholder, @NotNull Function3<? super String, ? super Composer, ? super Integer, Unit> children) {
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(children, "children");
        this.placeholder = placeholder;
        this.children = children;
    }

    @NotNull
    public final Function3<String, Composer, Integer, Unit> getChildren() {
        return this.children;
    }

    @NotNull
    public final Placeholder getPlaceholder() {
        return this.placeholder;
    }
}
