package androidx.compose.foundation.gestures;

import android.content.Context;
import androidx.appcompat.R;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0001\u001a\r\u0010\u0003\u001a\u00020\u0004H\u0001¢\u0006\u0002\u0010\u0005\u001a\u0014\u0010\u0006\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u0000\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\t"}, d2 = {"NoOpOverscrollController", "androidx/compose/foundation/gestures/AndroidOverScrollKt$NoOpOverscrollController$1", "Landroidx/compose/foundation/gestures/AndroidOverScrollKt$NoOpOverscrollController$1;", "rememberOverScrollController", "Landroidx/compose/foundation/gestures/OverScrollController;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/OverScrollController;", "overScroll", "Landroidx/compose/ui/Modifier;", "overScrollController", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class AndroidOverScrollKt {
    @NotNull
    private static final AndroidOverScrollKt$NoOpOverscrollController$1 NoOpOverscrollController = new OverScrollController() { // from class: androidx.compose.foundation.gestures.AndroidOverScrollKt$NoOpOverscrollController$1
        @Override // androidx.compose.foundation.gestures.OverScrollController
        /* renamed from: consumePostFling-TH1AsA0 */
        public void mo217consumePostFlingTH1AsA0(long j2) {
        }

        @Override // androidx.compose.foundation.gestures.OverScrollController
        /* renamed from: consumePostScroll-l7mfB5k */
        public void mo218consumePostScrolll7mfB5k(long j2, long j3, @Nullable Offset offset, int i2) {
        }

        @Override // androidx.compose.foundation.gestures.OverScrollController
        /* renamed from: consumePreFling-AH228Gc */
        public long mo219consumePreFlingAH228Gc(long j2) {
            return Velocity.Companion.m3561getZero9UxMQ8M();
        }

        @Override // androidx.compose.foundation.gestures.OverScrollController
        /* renamed from: consumePreScroll-A0NYTsA */
        public long mo220consumePreScrollA0NYTsA(long j2, @Nullable Offset offset, int i2) {
            return Offset.Companion.m1177getZeroF1C5BW0();
        }

        @Override // androidx.compose.foundation.gestures.OverScrollController
        public void drawOverScroll(@NotNull DrawScope drawScope) {
            Intrinsics.checkNotNullParameter(drawScope, "<this>");
        }

        @Override // androidx.compose.foundation.gestures.OverScrollController
        /* renamed from: refreshContainerInfo-TmRCtEA */
        public void mo221refreshContainerInfoTmRCtEA(long j2, boolean z) {
        }

        @Override // androidx.compose.foundation.gestures.OverScrollController
        public void release() {
        }

        @Override // androidx.compose.foundation.gestures.OverScrollController
        public boolean stopOverscrollAnimation() {
            return false;
        }
    };

    @NotNull
    public static final Modifier overScroll(@NotNull Modifier modifier, @NotNull OverScrollController overScrollController) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(overScrollController, "overScrollController");
        return DrawModifierKt.drawWithContent(modifier, new AndroidOverScrollKt$overScroll$1(overScrollController));
    }

    @Composable
    @NotNull
    public static final OverScrollController rememberOverScrollController(@Nullable Composer composer, int i2) {
        composer.startReplaceableGroup(-1658914945);
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        OverScrollConfiguration overScrollConfiguration = (OverScrollConfiguration) composer.consume(OverScrollConfigurationKt.getLocalOverScrollConfiguration());
        composer.startReplaceableGroup(-3686552);
        boolean changed = composer.changed(context) | composer.changed(overScrollConfiguration);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = overScrollConfiguration != null ? new AndroidEdgeEffectOverScrollController(context, overScrollConfiguration) : NoOpOverscrollController;
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        OverScrollController overScrollController = (OverScrollController) rememberedValue;
        composer.endReplaceableGroup();
        return overScrollController;
    }
}
