package androidx.compose.foundation;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import j.l;
import j.u0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class FocusableKt$focusable$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ MutableInteractionSource $interactionSource;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.foundation.FocusableKt$focusable$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
        public final /* synthetic */ MutableState<FocusInteraction.Focus> $focusedInteraction;
        public final /* synthetic */ MutableInteractionSource $interactionSource;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MutableState<FocusInteraction.Focus> mutableState, MutableInteractionSource mutableInteractionSource) {
            super(1);
            this.$focusedInteraction = mutableState;
            this.$interactionSource = mutableInteractionSource;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            final MutableState<FocusInteraction.Focus> mutableState = this.$focusedInteraction;
            final MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            return new DisposableEffectResult() { // from class: androidx.compose.foundation.FocusableKt$focusable$2$1$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    FocusInteraction.Focus focus = (FocusInteraction.Focus) MutableState.this.getValue();
                    if (focus == null) {
                        return;
                    }
                    FocusInteraction.Unfocus unfocus = new FocusInteraction.Unfocus(focus);
                    MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                    if (mutableInteractionSource2 != null) {
                        mutableInteractionSource2.tryEmit(unfocus);
                    }
                    MutableState.this.setValue(null);
                }
            };
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.foundation.FocusableKt$focusable$2$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableState<FocusInteraction.Focus> $focusedInteraction;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ u0 $scope;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "androidx.compose.foundation.FocusableKt$focusable$2$2$1", f = "Focusable.kt", i = {}, l = {androidx.appcompat.R.styleable.AppCompatTheme_listPreferredItemHeightSmall}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.FocusableKt$focusable$2$2$1  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
            public final /* synthetic */ MutableState<FocusInteraction.Focus> $focusedInteraction;
            public final /* synthetic */ MutableInteractionSource $interactionSource;
            public Object L$0;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MutableState<FocusInteraction.Focus> mutableState, MutableInteractionSource mutableInteractionSource, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$focusedInteraction = mutableState;
                this.$interactionSource = mutableInteractionSource;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.$focusedInteraction, this.$interactionSource, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                MutableState<FocusInteraction.Focus> mutableState;
                MutableState<FocusInteraction.Focus> mutableState2;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    FocusInteraction.Focus value = this.$focusedInteraction.getValue();
                    if (value != null) {
                        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                        mutableState = this.$focusedInteraction;
                        FocusInteraction.Unfocus unfocus = new FocusInteraction.Unfocus(value);
                        if (mutableInteractionSource != null) {
                            this.L$0 = mutableState;
                            this.label = 1;
                            if (mutableInteractionSource.emit(unfocus, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutableState2 = mutableState;
                        }
                        mutableState.setValue(null);
                    }
                    return Unit.INSTANCE;
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    mutableState2 = (MutableState) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                mutableState = mutableState2;
                mutableState.setValue(null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, u0 u0Var, MutableState<FocusInteraction.Focus> mutableState, MutableInteractionSource mutableInteractionSource) {
            super(1);
            this.$enabled = z;
            this.$scope = u0Var;
            this.$focusedInteraction = mutableState;
            this.$interactionSource = mutableInteractionSource;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            if (!this.$enabled) {
                l.f(this.$scope, null, null, new AnonymousClass1(this.$focusedInteraction, this.$interactionSource, null), 3, null);
            }
            return new DisposableEffectResult() { // from class: androidx.compose.foundation.FocusableKt$focusable$2$2$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                }
            };
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.foundation.FocusableKt$focusable$2$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
        public final /* synthetic */ MutableState<Boolean> $isFocused$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(MutableState<Boolean> mutableState) {
            super(1);
            this.$isFocused$delegate = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            invoke2(semanticsPropertyReceiver);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            SemanticsPropertiesKt.setFocused(semantics, FocusableKt$focusable$2.m188invoke$lambda2(this.$isFocused$delegate));
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.foundation.FocusableKt$focusable$2$4  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends Lambda implements Function1<FocusState, Unit> {
        public final /* synthetic */ BringIntoViewRequester $bringIntoViewRequester;
        public final /* synthetic */ MutableState<FocusInteraction.Focus> $focusedInteraction;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ MutableState<Boolean> $isFocused$delegate;
        public final /* synthetic */ u0 $scope;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "androidx.compose.foundation.FocusableKt$focusable$2$4$1", f = "Focusable.kt", i = {1}, l = {102, androidx.appcompat.R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, 108}, m = "invokeSuspend", n = {"interaction"}, s = {"L$0"})
        /* renamed from: androidx.compose.foundation.FocusableKt$focusable$2$4$1  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
            public final /* synthetic */ BringIntoViewRequester $bringIntoViewRequester;
            public final /* synthetic */ MutableState<FocusInteraction.Focus> $focusedInteraction;
            public final /* synthetic */ MutableInteractionSource $interactionSource;
            public Object L$0;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MutableState<FocusInteraction.Focus> mutableState, MutableInteractionSource mutableInteractionSource, BringIntoViewRequester bringIntoViewRequester, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$focusedInteraction = mutableState;
                this.$interactionSource = mutableInteractionSource;
                this.$bringIntoViewRequester = bringIntoViewRequester;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.$focusedInteraction, this.$interactionSource, this.$bringIntoViewRequester, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x007f A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r8.label
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r1 == 0) goto L2f
                    if (r1 == r4) goto L27
                    if (r1 == r3) goto L1f
                    if (r1 != r2) goto L17
                    kotlin.ResultKt.throwOnFailure(r9)
                    goto L80
                L17:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L1f:
                    java.lang.Object r1 = r8.L$0
                    androidx.compose.foundation.interaction.FocusInteraction$Focus r1 = (androidx.compose.foundation.interaction.FocusInteraction.Focus) r1
                    kotlin.ResultKt.throwOnFailure(r9)
                    goto L6e
                L27:
                    java.lang.Object r1 = r8.L$0
                    androidx.compose.runtime.MutableState r1 = (androidx.compose.runtime.MutableState) r1
                    kotlin.ResultKt.throwOnFailure(r9)
                    goto L55
                L2f:
                    kotlin.ResultKt.throwOnFailure(r9)
                    androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.FocusInteraction$Focus> r9 = r8.$focusedInteraction
                    java.lang.Object r9 = r9.getValue()
                    androidx.compose.foundation.interaction.FocusInteraction$Focus r9 = (androidx.compose.foundation.interaction.FocusInteraction.Focus) r9
                    if (r9 != 0) goto L3d
                    goto L59
                L3d:
                    androidx.compose.foundation.interaction.MutableInteractionSource r1 = r8.$interactionSource
                    androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.FocusInteraction$Focus> r6 = r8.$focusedInteraction
                    androidx.compose.foundation.interaction.FocusInteraction$Unfocus r7 = new androidx.compose.foundation.interaction.FocusInteraction$Unfocus
                    r7.<init>(r9)
                    if (r1 != 0) goto L49
                    goto L56
                L49:
                    r8.L$0 = r6
                    r8.label = r4
                    java.lang.Object r9 = r1.emit(r7, r8)
                    if (r9 != r0) goto L54
                    return r0
                L54:
                    r1 = r6
                L55:
                    r6 = r1
                L56:
                    r6.setValue(r5)
                L59:
                    androidx.compose.foundation.interaction.FocusInteraction$Focus r1 = new androidx.compose.foundation.interaction.FocusInteraction$Focus
                    r1.<init>()
                    androidx.compose.foundation.interaction.MutableInteractionSource r9 = r8.$interactionSource
                    if (r9 != 0) goto L63
                    goto L6e
                L63:
                    r8.L$0 = r1
                    r8.label = r3
                    java.lang.Object r9 = r9.emit(r1, r8)
                    if (r9 != r0) goto L6e
                    return r0
                L6e:
                    androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.FocusInteraction$Focus> r9 = r8.$focusedInteraction
                    r9.setValue(r1)
                    androidx.compose.foundation.relocation.BringIntoViewRequester r9 = r8.$bringIntoViewRequester
                    r8.L$0 = r5
                    r8.label = r2
                    java.lang.Object r8 = androidx.compose.foundation.relocation.BringIntoViewRequester.DefaultImpls.bringIntoView$default(r9, r5, r8, r4, r5)
                    if (r8 != r0) goto L80
                    return r0
                L80:
                    kotlin.Unit r8 = kotlin.Unit.INSTANCE
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.FocusableKt$focusable$2.AnonymousClass4.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "androidx.compose.foundation.FocusableKt$focusable$2$4$2", f = "Focusable.kt", i = {}, l = {androidx.appcompat.R.styleable.AppCompatTheme_tooltipForegroundColor}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.FocusableKt$focusable$2$4$2  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
            public final /* synthetic */ MutableState<FocusInteraction.Focus> $focusedInteraction;
            public final /* synthetic */ MutableInteractionSource $interactionSource;
            public Object L$0;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(MutableState<FocusInteraction.Focus> mutableState, MutableInteractionSource mutableInteractionSource, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$focusedInteraction = mutableState;
                this.$interactionSource = mutableInteractionSource;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass2(this.$focusedInteraction, this.$interactionSource, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                MutableState<FocusInteraction.Focus> mutableState;
                MutableState<FocusInteraction.Focus> mutableState2;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    FocusInteraction.Focus value = this.$focusedInteraction.getValue();
                    if (value != null) {
                        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                        mutableState = this.$focusedInteraction;
                        FocusInteraction.Unfocus unfocus = new FocusInteraction.Unfocus(value);
                        if (mutableInteractionSource != null) {
                            this.L$0 = mutableState;
                            this.label = 1;
                            if (mutableInteractionSource.emit(unfocus, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutableState2 = mutableState;
                        }
                        mutableState.setValue(null);
                    }
                    return Unit.INSTANCE;
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    mutableState2 = (MutableState) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                mutableState = mutableState2;
                mutableState.setValue(null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(u0 u0Var, MutableState<Boolean> mutableState, MutableState<FocusInteraction.Focus> mutableState2, MutableInteractionSource mutableInteractionSource, BringIntoViewRequester bringIntoViewRequester) {
            super(1);
            this.$scope = u0Var;
            this.$isFocused$delegate = mutableState;
            this.$focusedInteraction = mutableState2;
            this.$interactionSource = mutableInteractionSource;
            this.$bringIntoViewRequester = bringIntoViewRequester;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
            invoke2(focusState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull FocusState it) {
            Intrinsics.checkNotNullParameter(it, "it");
            FocusableKt$focusable$2.m189invoke$lambda3(this.$isFocused$delegate, it.isFocused());
            if (FocusableKt$focusable$2.m188invoke$lambda2(this.$isFocused$delegate)) {
                l.f(this.$scope, null, null, new AnonymousClass1(this.$focusedInteraction, this.$interactionSource, this.$bringIntoViewRequester, null), 3, null);
            } else {
                l.f(this.$scope, null, null, new AnonymousClass2(this.$focusedInteraction, this.$interactionSource, null), 3, null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusableKt$focusable$2(MutableInteractionSource mutableInteractionSource, boolean z) {
        super(3);
        this.$interactionSource = mutableInteractionSource;
        this.$enabled = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-2  reason: not valid java name */
    public static final boolean m188invoke$lambda2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-3  reason: not valid java name */
    public static final void m189invoke$lambda3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    @Composable
    @NotNull
    public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(1407538527);
        composer.startReplaceableGroup(-723524056);
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        u0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue2;
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) rememberedValue3;
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue4 = composer.rememberedValue();
        if (rememberedValue4 == companion.getEmpty()) {
            rememberedValue4 = BringIntoViewRequesterKt.BringIntoViewRequester();
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceableGroup();
        BringIntoViewRequester bringIntoViewRequester = (BringIntoViewRequester) rememberedValue4;
        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
        EffectsKt.DisposableEffect(mutableInteractionSource, new AnonymousClass1(mutableState, mutableInteractionSource), composer, 0);
        EffectsKt.DisposableEffect(Boolean.valueOf(this.$enabled), new AnonymousClass2(this.$enabled, coroutineScope, mutableState, this.$interactionSource), composer, 0);
        Modifier focusTarget = this.$enabled ? FocusModifierKt.focusTarget(FocusChangedModifierKt.onFocusChanged(BringIntoViewRequesterKt.bringIntoViewRequester(SemanticsModifierKt.semantics$default(Modifier.Companion, false, new AnonymousClass3(mutableState2), 1, null), bringIntoViewRequester), new AnonymousClass4(coroutineScope, mutableState2, mutableState, this.$interactionSource, bringIntoViewRequester))) : Modifier.Companion;
        composer.endReplaceableGroup();
        return focusTarget;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }
}
