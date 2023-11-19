package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: S
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class AnimatedContentKt$AnimatedContent$5$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ Function4<AnimatedVisibilityScope, S, Composer, Integer, Unit> $content;
    public final /* synthetic */ SnapshotStateList<S> $currentlyVisible;
    public final /* synthetic */ AnimatedContentScope<S> $rootScope;
    public final /* synthetic */ S $stateForContent;
    public final /* synthetic */ Transition<S> $this_AnimatedContent;
    public final /* synthetic */ Function1<AnimatedContentScope<S>, ContentTransform> $transitionSpec;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function3<MeasureScope, Measurable, Constraints, MeasureResult> {
        public final /* synthetic */ ContentTransform $specOnEnter;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
        /* renamed from: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00031 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
            public final /* synthetic */ Placeable $placeable;
            public final /* synthetic */ ContentTransform $specOnEnter;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00031(Placeable placeable, ContentTransform contentTransform) {
                super(1);
                this.$placeable = placeable;
                this.$specOnEnter = contentTransform;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                layout.place(this.$placeable, 0, 0, this.$specOnEnter.getTargetContentZIndex());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ContentTransform contentTransform) {
            super(3);
            this.$specOnEnter = contentTransform;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
            return m4invoke3p2s80s(measureScope, measurable, constraints.m3299unboximpl());
        }

        @NotNull
        /* renamed from: invoke-3p2s80s  reason: not valid java name */
        public final MeasureResult m4invoke3p2s80s(@NotNull MeasureScope layout, @NotNull Measurable measurable, long j2) {
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            Placeable mo2758measureBRTryo0 = measurable.mo2758measureBRTryo0(j2);
            return MeasureScope.DefaultImpls.layout$default(layout, mo2758measureBRTryo0.getWidth(), mo2758measureBRTryo0.getHeight(), null, new C00031(mo2758measureBRTryo0, this.$specOnEnter), 4, null);
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends Lambda implements Function1<S, Boolean> {
        public final /* synthetic */ S $stateForContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(S s2) {
            super(1);
            this.$stateForContent = s2;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(S s2) {
            return Boolean.valueOf(Intrinsics.areEqual(s2, this.$stateForContent));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
            return invoke((AnonymousClass3) obj);
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1$4  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
        public final /* synthetic */ int $$dirty;
        public final /* synthetic */ Function4<AnimatedVisibilityScope, S, Composer, Integer, Unit> $content;
        public final /* synthetic */ SnapshotStateList<S> $currentlyVisible;
        public final /* synthetic */ AnimatedContentScope<S> $rootScope;
        public final /* synthetic */ S $stateForContent;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
        /* renamed from: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1$4$1  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
            public final /* synthetic */ SnapshotStateList<S> $currentlyVisible;
            public final /* synthetic */ AnimatedContentScope<S> $rootScope;
            public final /* synthetic */ S $stateForContent;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SnapshotStateList<S> snapshotStateList, S s2, AnimatedContentScope<S> animatedContentScope) {
                super(1);
                this.$currentlyVisible = snapshotStateList;
                this.$stateForContent = s2;
                this.$rootScope = animatedContentScope;
            }

            @NotNull
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final DisposableEffectResult invoke2(@NotNull DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                final SnapshotStateList<S> snapshotStateList = this.$currentlyVisible;
                final S s2 = this.$stateForContent;
                final AnimatedContentScope<S> animatedContentScope = this.$rootScope;
                return new DisposableEffectResult() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1$4$1$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        SnapshotStateList.this.remove(s2);
                        animatedContentScope.getTargetSizeMap$animation_release().remove(s2);
                    }
                };
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                return invoke2(disposableEffectScope);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(AnimatedContentScope<S> animatedContentScope, S s2, Function4<? super AnimatedVisibilityScope, ? super S, ? super Composer, ? super Integer, Unit> function4, int i2, SnapshotStateList<S> snapshotStateList) {
            super(3);
            this.$rootScope = animatedContentScope;
            this.$stateForContent = s2;
            this.$content = function4;
            this.$$dirty = i2;
            this.$currentlyVisible = snapshotStateList;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        @Composable
        public final void invoke(@NotNull AnimatedVisibilityScope AnimatedVisibility, @Nullable Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if ((i2 & 14) == 0) {
                i2 |= composer.changed(AnimatedVisibility) ? 4 : 2;
            }
            if (((i2 & 91) ^ 18) == 0 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            int i3 = i2 & 14;
            EffectsKt.DisposableEffect(AnimatedVisibility, new AnonymousClass1(this.$currentlyVisible, this.$stateForContent, this.$rootScope), composer, i3);
            this.$rootScope.getTargetSizeMap$animation_release().put(this.$stateForContent, ((AnimatedVisibilityScopeImpl) AnimatedVisibility).getTargetSize$animation_release());
            this.$content.invoke(AnimatedVisibility, this.$stateForContent, composer, Integer.valueOf(((this.$$dirty >> 9) & 896) | i3));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnimatedContentKt$AnimatedContent$5$1(Transition<S> transition, S s2, int i2, Function1<? super AnimatedContentScope<S>, ContentTransform> function1, AnimatedContentScope<S> animatedContentScope, Function4<? super AnimatedVisibilityScope, ? super S, ? super Composer, ? super Integer, Unit> function4, SnapshotStateList<S> snapshotStateList) {
        super(2);
        this.$this_AnimatedContent = transition;
        this.$stateForContent = s2;
        this.$$dirty = i2;
        this.$transitionSpec = function1;
        this.$rootScope = animatedContentScope;
        this.$content = function4;
        this.$currentlyVisible = snapshotStateList;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    @Composable
    public final void invoke(@Nullable Composer composer, int i2) {
        if (((i2 & 11) ^ 2) == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        Function1<AnimatedContentScope<S>, ContentTransform> function1 = this.$transitionSpec;
        Object obj = this.$rootScope;
        composer.startReplaceableGroup(-3687241);
        ContentTransform rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = function1.invoke(obj);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        ContentTransform contentTransform = (ContentTransform) rememberedValue;
        Boolean valueOf = Boolean.valueOf(Intrinsics.areEqual(this.$this_AnimatedContent.getSegment().getTargetState(), this.$stateForContent));
        Function1<AnimatedContentScope<S>, ContentTransform> function12 = this.$transitionSpec;
        Object obj2 = this.$rootScope;
        composer.startReplaceableGroup(-3686930);
        boolean changed = composer.changed(valueOf);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = function12.invoke(obj2).getInitialContentExit();
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        ExitTransition exitTransition = (ExitTransition) rememberedValue2;
        S s2 = this.$stateForContent;
        Transition<S> transition = this.$this_AnimatedContent;
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new AnimatedContentScope.ChildData(Intrinsics.areEqual(s2, transition.getTargetState()));
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        AnimatedContentScope.ChildData childData = (AnimatedContentScope.ChildData) rememberedValue3;
        EnterTransition targetContentEnter = contentTransform.getTargetContentEnter();
        Modifier layout = LayoutModifierKt.layout(Modifier.Companion, new AnonymousClass1(contentTransform));
        childData.setTarget(Intrinsics.areEqual(this.$stateForContent, this.$this_AnimatedContent.getTargetState()));
        AnimatedVisibilityKt.AnimatedVisibility(this.$this_AnimatedContent, new AnonymousClass3(this.$stateForContent), layout.then(childData), targetContentEnter, exitTransition, ComposableLambdaKt.composableLambda(composer, -819913132, true, new AnonymousClass4(this.$rootScope, this.$stateForContent, this.$content, this.$$dirty, this.$currentlyVisible)), composer, (this.$$dirty & 14) | 196608, 0);
    }
}
