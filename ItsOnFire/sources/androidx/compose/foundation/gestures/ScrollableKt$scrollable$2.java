package androidx.compose.foundation.gestures;

import androidx.appcompat.R;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ScrollableKt$scrollable$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ FlingBehavior $flingBehavior;
    public final /* synthetic */ MutableInteractionSource $interactionSource;
    public final /* synthetic */ Orientation $orientation;
    public final /* synthetic */ OverScrollController $overScrollController;
    public final /* synthetic */ boolean $reverseDirection;
    public final /* synthetic */ ScrollableState $state;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.foundation.gestures.ScrollableKt$scrollable$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<Float, Unit> {
        public final /* synthetic */ boolean $reverseDirection;
        public final /* synthetic */ ScrollableState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ScrollableState scrollableState, boolean z) {
            super(1);
            this.$state = scrollableState;
            this.$reverseDirection = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Float f2) {
            invoke(f2.floatValue());
            return Unit.INSTANCE;
        }

        public final void invoke(float f2) {
            this.$state.dispatchRawDelta(ScrollableKt$scrollable$2.invoke$reverseIfNeeded(f2, this.$reverseDirection));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableKt$scrollable$2(OverScrollController overScrollController, Orientation orientation, ScrollableState scrollableState, boolean z, boolean z2, MutableInteractionSource mutableInteractionSource, FlingBehavior flingBehavior) {
        super(3);
        this.$overScrollController = overScrollController;
        this.$orientation = orientation;
        this.$state = scrollableState;
        this.$reverseDirection = z;
        this.$enabled = z2;
        this.$interactionSource = mutableInteractionSource;
        this.$flingBehavior = flingBehavior;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$reverseIfNeeded(float f2, boolean z) {
        return z ? f2 * (-1) : f2;
    }

    @Composable
    @NotNull
    public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i2) {
        Modifier modifier;
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(536297813);
        OverScrollController overScrollController = this.$overScrollController;
        Modifier overScroll = overScrollController == null ? null : AndroidOverScrollKt.overScroll(Modifier.Companion, overScrollController);
        if (overScroll == null) {
            overScroll = Modifier.Companion;
        }
        Orientation orientation = this.$orientation;
        ScrollableState scrollableState = this.$state;
        Boolean valueOf = Boolean.valueOf(this.$reverseDirection);
        Orientation orientation2 = this.$orientation;
        ScrollableState scrollableState2 = this.$state;
        boolean z = this.$reverseDirection;
        composer.startReplaceableGroup(-3686095);
        boolean changed = composer.changed(orientation) | composer.changed(scrollableState) | composer.changed(valueOf);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new BringIntoViewResponder(orientation2, scrollableState2, z);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        BringIntoViewResponder bringIntoViewResponder = (BringIntoViewResponder) rememberedValue;
        Modifier modifier2 = this.$enabled ? ModifierLocalScrollableContainerProvider.INSTANCE : Modifier.Companion;
        modifier = ScrollableKt.touchScrollable(Modifier.Companion.then(bringIntoViewResponder).then(overScroll), this.$interactionSource, this.$orientation, this.$reverseDirection, this.$state, this.$flingBehavior, this.$overScrollController, this.$enabled, composer, 0);
        Modifier then = AndroidScrollable_androidKt.mouseScrollable(modifier, this.$orientation, new AnonymousClass1(this.$state, this.$reverseDirection)).then(modifier2);
        composer.endReplaceableGroup();
        return then;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }
}
