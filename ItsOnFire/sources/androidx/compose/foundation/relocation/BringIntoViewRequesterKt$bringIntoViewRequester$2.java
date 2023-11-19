package androidx.compose.foundation.relocation;

import androidx.appcompat.R;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class BringIntoViewRequesterKt$bringIntoViewRequester$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    public final /* synthetic */ BringIntoViewRequester $bringIntoViewRequester;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.foundation.relocation.BringIntoViewRequesterKt$bringIntoViewRequester$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
        public final /* synthetic */ BringIntoViewData $bringIntoViewData;
        public final /* synthetic */ BringIntoViewRequester $bringIntoViewRequester;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BringIntoViewRequester bringIntoViewRequester, BringIntoViewData bringIntoViewData) {
            super(1);
            this.$bringIntoViewRequester = bringIntoViewRequester;
            this.$bringIntoViewData = bringIntoViewData;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            ((BringIntoViewRequesterImpl) this.$bringIntoViewRequester).getBringIntoViewUsages().add(this.$bringIntoViewData);
            final BringIntoViewRequester bringIntoViewRequester = this.$bringIntoViewRequester;
            final BringIntoViewData bringIntoViewData = this.$bringIntoViewData;
            return new DisposableEffectResult() { // from class: androidx.compose.foundation.relocation.BringIntoViewRequesterKt$bringIntoViewRequester$2$1$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    ((BringIntoViewRequesterImpl) BringIntoViewRequester.this).getBringIntoViewUsages().remove(bringIntoViewData);
                }
            };
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.foundation.relocation.BringIntoViewRequesterKt$bringIntoViewRequester$2$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends Lambda implements Function1<LayoutCoordinates, Unit> {
        public final /* synthetic */ BringIntoViewData $bringIntoViewData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BringIntoViewData bringIntoViewData) {
            super(1);
            this.$bringIntoViewData = bringIntoViewData;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
            invoke2(layoutCoordinates);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull LayoutCoordinates it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.$bringIntoViewData.setLayoutCoordinates(it);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringIntoViewRequesterKt$bringIntoViewRequester$2(BringIntoViewRequester bringIntoViewRequester) {
        super(3);
        this.$bringIntoViewRequester = bringIntoViewRequester;
    }

    @Composable
    @NotNull
    public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(-1614341944);
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new BringIntoViewData(new BringRectangleOnScreenRequester(), null, null, 6, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        final BringIntoViewData bringIntoViewData = (BringIntoViewData) rememberedValue;
        composer.startReplaceableGroup(-1614341844);
        BringIntoViewRequester bringIntoViewRequester = this.$bringIntoViewRequester;
        if (bringIntoViewRequester instanceof BringIntoViewRequesterImpl) {
            EffectsKt.DisposableEffect(bringIntoViewRequester, new AnonymousClass1(bringIntoViewRequester, bringIntoViewData), composer, 0);
        }
        composer.endReplaceableGroup();
        Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(BringRectangleOnScreen_androidKt.bringRectangleOnScreenRequester(Modifier.Companion, bringIntoViewData.getBringRectangleOnScreenRequester()), new AnonymousClass2(bringIntoViewData));
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new ModifierLocalConsumer() { // from class: androidx.compose.foundation.relocation.BringIntoViewRequesterKt$bringIntoViewRequester$2$3$1
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

                @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
                public void onModifierLocalsUpdated(@NotNull ModifierLocalReadScope scope) {
                    Intrinsics.checkNotNullParameter(scope, "scope");
                    BringIntoViewData.this.setParent((BringIntoViewResponder) scope.getCurrent(BringIntoViewResponder.Companion.getModifierLocalBringIntoViewResponder()));
                }

                @Override // androidx.compose.ui.Modifier
                @NotNull
                public Modifier then(@NotNull Modifier modifier) {
                    return ModifierLocalConsumer.DefaultImpls.then(this, modifier);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        Modifier then = onGloballyPositioned.then((Modifier) rememberedValue2);
        composer.endReplaceableGroup();
        return then;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }
}
