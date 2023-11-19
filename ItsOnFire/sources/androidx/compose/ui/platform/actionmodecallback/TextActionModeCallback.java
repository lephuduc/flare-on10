package androidx.compose.ui.platform.actionmodecallback;

import android.view.ActionMode;
import android.view.Menu;
import androidx.appcompat.R;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007¢\u0006\u0002\u0010\u000bJ\u001a\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u001a\u0010 \u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010!\u001a\u0004\u0018\u00010\"J\u0006\u0010#\u001a\u00020\u0006J\u0006\u0010$\u001a\u00020\u001bR(\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006%"}, d2 = {"Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;", "", "rect", "Landroidx/compose/ui/geometry/Rect;", "onCopyRequested", "Lkotlin/Function0;", "", "Landroidx/compose/ui/platform/ActionCallback;", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "(Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getOnCopyRequested", "()Lkotlin/jvm/functions/Function0;", "setOnCopyRequested", "(Lkotlin/jvm/functions/Function0;)V", "getOnCutRequested", "setOnCutRequested", "getOnPasteRequested", "setOnPasteRequested", "getOnSelectAllRequested", "setOnSelectAllRequested", "getRect", "()Landroidx/compose/ui/geometry/Rect;", "setRect", "(Landroidx/compose/ui/geometry/Rect;)V", "onActionItemClicked", "", "mode", "Landroid/view/ActionMode;", "item", "Landroid/view/MenuItem;", "onCreateActionMode", "menu", "Landroid/view/Menu;", "onDestroyActionMode", "onPrepareActionMode", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TextActionModeCallback {
    @Nullable
    private Function0<Unit> onCopyRequested;
    @Nullable
    private Function0<Unit> onCutRequested;
    @Nullable
    private Function0<Unit> onPasteRequested;
    @Nullable
    private Function0<Unit> onSelectAllRequested;
    @NotNull
    private Rect rect;

    public TextActionModeCallback() {
        this(null, null, null, null, null, 31, null);
    }

    public TextActionModeCallback(@NotNull Rect rect, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02, @Nullable Function0<Unit> function03, @Nullable Function0<Unit> function04) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        this.rect = rect;
        this.onCopyRequested = function0;
        this.onPasteRequested = function02;
        this.onCutRequested = function03;
        this.onSelectAllRequested = function04;
    }

    public /* synthetic */ TextActionModeCallback(Rect rect, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Rect.Companion.getZero() : rect, (i2 & 2) != 0 ? null : function0, (i2 & 4) != 0 ? null : function02, (i2 & 8) != 0 ? null : function03, (i2 & 16) == 0 ? function04 : null);
    }

    @Nullable
    public final Function0<Unit> getOnCopyRequested() {
        return this.onCopyRequested;
    }

    @Nullable
    public final Function0<Unit> getOnCutRequested() {
        return this.onCutRequested;
    }

    @Nullable
    public final Function0<Unit> getOnPasteRequested() {
        return this.onPasteRequested;
    }

    @Nullable
    public final Function0<Unit> getOnSelectAllRequested() {
        return this.onSelectAllRequested;
    }

    @NotNull
    public final Rect getRect() {
        return this.rect;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:
        if (r2 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
        if (r2 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0020, code lost:
        if (r2 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0025, code lost:
        if (r2 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0028, code lost:
        r2.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002b, code lost:
        if (r3 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002e, code lost:
        r3.finish();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0031, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onActionItemClicked(@org.jetbrains.annotations.Nullable android.view.ActionMode r3, @org.jetbrains.annotations.Nullable android.view.MenuItem r4) {
        /*
            r2 = this;
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r4 = r4.getItemId()
            r0 = 1
            if (r4 == 0) goto L23
            if (r4 == r0) goto L1e
            r1 = 2
            if (r4 == r1) goto L19
            r1 = 3
            if (r4 == r1) goto L14
            r2 = 0
            return r2
        L14:
            kotlin.jvm.functions.Function0<kotlin.Unit> r2 = r2.onSelectAllRequested
            if (r2 != 0) goto L28
            goto L2b
        L19:
            kotlin.jvm.functions.Function0<kotlin.Unit> r2 = r2.onCutRequested
            if (r2 != 0) goto L28
            goto L2b
        L1e:
            kotlin.jvm.functions.Function0<kotlin.Unit> r2 = r2.onPasteRequested
            if (r2 != 0) goto L28
            goto L2b
        L23:
            kotlin.jvm.functions.Function0<kotlin.Unit> r2 = r2.onCopyRequested
            if (r2 != 0) goto L28
            goto L2b
        L28:
            r2.invoke()
        L2b:
            if (r3 != 0) goto L2e
            goto L31
        L2e:
            r3.finish()
        L31:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.actionmodecallback.TextActionModeCallback.onActionItemClicked(android.view.ActionMode, android.view.MenuItem):boolean");
    }

    public final boolean onCreateActionMode(@Nullable ActionMode actionMode, @Nullable Menu menu) {
        if (menu != null) {
            if (actionMode != null) {
                if (this.onCopyRequested != null) {
                    menu.add(0, 0, 0, 17039361).setShowAsAction(1);
                }
                if (this.onPasteRequested != null) {
                    menu.add(0, 1, 1, 17039371).setShowAsAction(1);
                }
                if (this.onCutRequested != null) {
                    menu.add(0, 2, 2, 17039363).setShowAsAction(1);
                }
                if (this.onSelectAllRequested != null) {
                    menu.add(0, 3, 3, 17039373).setShowAsAction(1);
                }
                return true;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void onDestroyActionMode() {
    }

    public final boolean onPrepareActionMode() {
        return false;
    }

    public final void setOnCopyRequested(@Nullable Function0<Unit> function0) {
        this.onCopyRequested = function0;
    }

    public final void setOnCutRequested(@Nullable Function0<Unit> function0) {
        this.onCutRequested = function0;
    }

    public final void setOnPasteRequested(@Nullable Function0<Unit> function0) {
        this.onPasteRequested = function0;
    }

    public final void setOnSelectAllRequested(@Nullable Function0<Unit> function0) {
        this.onSelectAllRequested = function0;
    }

    public final void setRect(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<set-?>");
        this.rect = rect;
    }
}
