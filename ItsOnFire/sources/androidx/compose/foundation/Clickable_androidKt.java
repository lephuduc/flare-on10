package androidx.compose.foundation;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.Key_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0001¢\u0006\u0002\u0010\u000b\u001a\f\u0010\f\u001a\u00020\u0005*\u00020\rH\u0002\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u001b\u0010\u0004\u001a\u00020\u0005*\u00020\u00068@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"TapIndicationDelay", "", "getTapIndicationDelay", "()J", "isClick", "", "Landroidx/compose/ui/input/key/KeyEvent;", "isClick-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "isComposeRootInScrollableContainer", "Lkotlin/Function0;", "(Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;", "isInScrollableViewGroup", "Landroid/view/View;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class Clickable_androidKt {
    private static final long TapIndicationDelay = ViewConfiguration.getTapTimeout();

    public static final long getTapIndicationDelay() {
        return TapIndicationDelay;
    }

    /* renamed from: isClick-ZmokQxo  reason: not valid java name */
    public static final boolean m185isClickZmokQxo(@NotNull KeyEvent isClick) {
        Intrinsics.checkNotNullParameter(isClick, "$this$isClick");
        if (KeyEventType.m2540equalsimpl0(KeyEvent_androidKt.m2548getTypeZmokQxo(isClick), KeyEventType.Companion.m2545getKeyUpCS__XNY())) {
            int m2555getNativeKeyCodeYVgTNJs = Key_androidKt.m2555getNativeKeyCodeYVgTNJs(KeyEvent_androidKt.m2547getKeyZmokQxo(isClick));
            if (m2555getNativeKeyCodeYVgTNJs == 23 || m2555getNativeKeyCodeYVgTNJs == 66 || m2555getNativeKeyCodeYVgTNJs == 160) {
                return true;
            }
        }
        return false;
    }

    @Composable
    @NotNull
    public static final Function0<Boolean> isComposeRootInScrollableContainer(@Nullable Composer composer, int i2) {
        composer.startReplaceableGroup(-184546112);
        Clickable_androidKt$isComposeRootInScrollableContainer$1 clickable_androidKt$isComposeRootInScrollableContainer$1 = new Clickable_androidKt$isComposeRootInScrollableContainer$1((View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView()));
        composer.endReplaceableGroup();
        return clickable_androidKt$isComposeRootInScrollableContainer$1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r1 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean isInScrollableViewGroup(android.view.View r1) {
        /*
        L0:
            android.view.ViewParent r1 = r1.getParent()
            if (r1 == 0) goto L14
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L14
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            boolean r0 = r1.shouldDelayChildPressedState()
            if (r0 == 0) goto L0
            r1 = 1
            return r1
        L14:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.Clickable_androidKt.isInScrollableViewGroup(android.view.View):boolean");
    }
}
