package androidx.compose.foundation;

import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.semantics.Role;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ClickableKt$clickable$4 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ Indication $indication;
    public final /* synthetic */ MutableInteractionSource $interactionSource;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ String $onClickLabel;
    public final /* synthetic */ Role $role;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableKt$clickable$4(Function0<Unit> function0, boolean z, MutableInteractionSource mutableInteractionSource, Indication indication, String str, Role role) {
        super(3);
        this.$onClick = function0;
        this.$enabled = z;
        this.$interactionSource = mutableInteractionSource;
        this.$indication = indication;
        this.$onClickLabel = str;
        this.$role = role;
    }

    @Composable
    @NotNull
    public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(1841981045);
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(this.$onClick, composer, 0);
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        composer.startReplaceableGroup(1841981204);
        if (this.$enabled) {
            ClickableKt.PressedInteractionSourceDisposableEffect(this.$interactionSource, mutableState, composer, 48);
        }
        composer.endReplaceableGroup();
        Function0<Boolean> isComposeRootInScrollableContainer = Clickable_androidKt.isComposeRootInScrollableContainer(composer, 0);
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        final MutableState mutableState2 = (MutableState) rememberedValue2;
        State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(new ClickableKt$clickable$4$delayPressInteraction$1(mutableState2, isComposeRootInScrollableContainer), composer, 0);
        Modifier.Companion companion2 = Modifier.Companion;
        Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion2, this.$interactionSource, Boolean.valueOf(this.$enabled), new ClickableKt$clickable$4$gesture$1(this.$enabled, this.$interactionSource, mutableState, rememberUpdatedState2, rememberUpdatedState, null));
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new ModifierLocalConsumer() { // from class: androidx.compose.foundation.ClickableKt$clickable$4$1$1
                @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
                public boolean all(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
                    return ModifierLocalConsumer.DefaultImpls.all(this, function1);
                }

                @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
                public boolean any(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
                    return ModifierLocalConsumer.DefaultImpls.any(this, function1);
                }

                @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
                public <R> R foldIn(R r2, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> function2) {
                    return (R) ModifierLocalConsumer.DefaultImpls.foldIn(this, r2, function2);
                }

                @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
                public <R> R foldOut(R r2, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> function2) {
                    return (R) ModifierLocalConsumer.DefaultImpls.foldOut(this, r2, function2);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
                public void onModifierLocalsUpdated(@NotNull ModifierLocalReadScope scope) {
                    Intrinsics.checkNotNullParameter(scope, "scope");
                    mutableState2.setValue(scope.getCurrent(ScrollableKt.getModifierLocalScrollableContainer()));
                }

                @Override // androidx.compose.ui.Modifier
                @NotNull
                public Modifier then(@NotNull Modifier modifier) {
                    return ModifierLocalConsumer.DefaultImpls.then(this, modifier);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        Modifier m175genericClickableWithoutGestureBILeDI = ClickableKt.m175genericClickableWithoutGestureBILeDI(companion2.then((Modifier) rememberedValue3), pointerInput, this.$interactionSource, this.$indication, this.$enabled, this.$onClickLabel, this.$role, null, null, this.$onClick);
        composer.endReplaceableGroup();
        return m175genericClickableWithoutGestureBILeDI;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }
}
