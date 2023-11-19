package androidx.compose.ui.semantics;

import androidx.appcompat.R;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.messaging.Constants;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004B\u0019\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\bJ\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0016R\u0015\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/semantics/AccessibilityAction;", "T", "Lkotlin/Function;", "", "", Constants.ScionAnalytics.PARAM_LABEL, "", "action", "(Ljava/lang/String;Lkotlin/Function;)V", "getAction", "()Lkotlin/Function;", "Lkotlin/Function;", "getLabel", "()Ljava/lang/String;", "equals", "other", "hashCode", "", "toString", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class AccessibilityAction<T extends Function<? extends Boolean>> {
    public static final int $stable = 0;
    @Nullable
    private final T action;
    @Nullable
    private final String label;

    public AccessibilityAction(@Nullable String str, @Nullable T t2) {
        this.label = str;
        this.action = t2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccessibilityAction) {
            AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
            return Intrinsics.areEqual(this.label, accessibilityAction.label) && Intrinsics.areEqual(this.action, accessibilityAction.action);
        }
        return false;
    }

    @Nullable
    public final T getAction() {
        return this.action;
    }

    @Nullable
    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        String str = this.label;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        T t2 = this.action;
        return hashCode + (t2 != null ? t2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AccessibilityAction(label=" + ((Object) this.label) + ", action=" + this.action + ')';
    }
}
