package androidx.compose.ui.input.nestedscroll;

import androidx.appcompat.R;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifier;
import j.u0;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class NestedScrollModifierKt$nestedScroll$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    public final /* synthetic */ NestedScrollConnection $connection;
    public final /* synthetic */ NestedScrollDispatcher $dispatcher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollModifierKt$nestedScroll$2(NestedScrollDispatcher nestedScrollDispatcher, NestedScrollConnection nestedScrollConnection) {
        super(3);
        this.$dispatcher = nestedScrollDispatcher;
        this.$connection = nestedScrollConnection;
    }

    @Composable
    @NotNull
    public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(100476458);
        composer.startReplaceableGroup(-723524056);
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        final u0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        final NestedScrollDispatcher nestedScrollDispatcher = this.$dispatcher;
        composer.startReplaceableGroup(100476571);
        if (nestedScrollDispatcher == null) {
            composer.startReplaceableGroup(-3687241);
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new NestedScrollDispatcher();
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            nestedScrollDispatcher = (NestedScrollDispatcher) rememberedValue2;
        }
        composer.endReplaceableGroup();
        final NestedScrollConnection nestedScrollConnection = this.$connection;
        composer.startReplaceableGroup(-3686095);
        boolean changed = composer.changed(nestedScrollConnection) | composer.changed(nestedScrollDispatcher) | composer.changed(coroutineScope);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed || rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new NestedScrollModifier(nestedScrollConnection, coroutineScope) { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt$nestedScroll$2$1$1
                public final /* synthetic */ NestedScrollConnection $connection;
                public final /* synthetic */ u0 $scope;
                @NotNull
                private final NestedScrollConnection connection;
                @NotNull
                private final NestedScrollDispatcher dispatcher;

                {
                    this.$connection = nestedScrollConnection;
                    this.$scope = coroutineScope;
                    NestedScrollDispatcher.this.setOriginNestedScrollScope$ui_release(coroutineScope);
                    this.dispatcher = NestedScrollDispatcher.this;
                    this.connection = nestedScrollConnection;
                }

                @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
                public boolean all(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
                    return NestedScrollModifier.DefaultImpls.all(this, function1);
                }

                @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
                public boolean any(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
                    return NestedScrollModifier.DefaultImpls.any(this, function1);
                }

                @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
                public <R> R foldIn(R r2, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> function2) {
                    return (R) NestedScrollModifier.DefaultImpls.foldIn(this, r2, function2);
                }

                @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
                public <R> R foldOut(R r2, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> function2) {
                    return (R) NestedScrollModifier.DefaultImpls.foldOut(this, r2, function2);
                }

                @Override // androidx.compose.ui.input.nestedscroll.NestedScrollModifier
                @NotNull
                public NestedScrollConnection getConnection() {
                    return this.connection;
                }

                @Override // androidx.compose.ui.input.nestedscroll.NestedScrollModifier
                @NotNull
                public NestedScrollDispatcher getDispatcher() {
                    return this.dispatcher;
                }

                @Override // androidx.compose.ui.Modifier
                @NotNull
                public Modifier then(@NotNull Modifier modifier) {
                    return NestedScrollModifier.DefaultImpls.then(this, modifier);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        NestedScrollModifierKt$nestedScroll$2$1$1 nestedScrollModifierKt$nestedScroll$2$1$1 = (NestedScrollModifierKt$nestedScroll$2$1$1) rememberedValue3;
        composer.endReplaceableGroup();
        return nestedScrollModifierKt$nestedScroll$2$1$1;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }
}
