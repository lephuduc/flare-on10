package androidx.compose.foundation.relocation;

import android.view.View;
import androidx.appcompat.R;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class BringRectangleOnScreen_androidKt$bringRectangleOnScreenRequester$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    public final /* synthetic */ BringRectangleOnScreenRequester $bringRectangleOnScreenRequester;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.foundation.relocation.BringRectangleOnScreen_androidKt$bringRectangleOnScreenRequester$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
        public final /* synthetic */ BringRectangleOnScreenRequester $bringRectangleOnScreenRequester;
        public final /* synthetic */ View $view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BringRectangleOnScreenRequester bringRectangleOnScreenRequester, View view) {
            super(1);
            this.$bringRectangleOnScreenRequester = bringRectangleOnScreenRequester;
            this.$view = view;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            this.$bringRectangleOnScreenRequester.setView$foundation_release(this.$view);
            final BringRectangleOnScreenRequester bringRectangleOnScreenRequester = this.$bringRectangleOnScreenRequester;
            return new DisposableEffectResult() { // from class: androidx.compose.foundation.relocation.BringRectangleOnScreen_androidKt$bringRectangleOnScreenRequester$2$1$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    BringRectangleOnScreenRequester.this.setView$foundation_release(null);
                }
            };
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringRectangleOnScreen_androidKt$bringRectangleOnScreenRequester$2(BringRectangleOnScreenRequester bringRectangleOnScreenRequester) {
        super(3);
        this.$bringRectangleOnScreenRequester = bringRectangleOnScreenRequester;
    }

    @Composable
    @NotNull
    public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(-711358161);
        View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        EffectsKt.DisposableEffect(view, new AnonymousClass1(this.$bringRectangleOnScreenRequester, view), composer, 8);
        Modifier.Companion companion = Modifier.Companion;
        composer.endReplaceableGroup();
        return companion;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }
}
