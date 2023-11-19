package androidx.compose.material;

import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableKt$draggable$1;
import androidx.compose.foundation.gestures.DraggableKt$draggable$2;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import j.l;
import j.u0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0001H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "T", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SwipeableKt$swipeable$3 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    public final /* synthetic */ Map<Float, T> $anchors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ MutableInteractionSource $interactionSource;
    public final /* synthetic */ Orientation $orientation;
    public final /* synthetic */ ResistanceConfig $resistance;
    public final /* synthetic */ boolean $reverseDirection;
    public final /* synthetic */ SwipeableState<T> $state;
    public final /* synthetic */ Function2<T, T, ThresholdConfig> $thresholds;
    public final /* synthetic */ float $velocityThreshold;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "androidx.compose.material.SwipeableKt$swipeable$3$3", f = "Swipeable.kt", i = {}, l = {607}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material.SwipeableKt$swipeable$3$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Map<Float, T> $anchors;
        public final /* synthetic */ Density $density;
        public final /* synthetic */ ResistanceConfig $resistance;
        public final /* synthetic */ SwipeableState<T> $state;
        public final /* synthetic */ Function2<T, T, ThresholdConfig> $thresholds;
        public final /* synthetic */ float $velocityThreshold;
        public int label;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
        /* renamed from: androidx.compose.material.SwipeableKt$swipeable$3$3$1  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends Lambda implements Function2<Float, Float, Float> {
            public final /* synthetic */ Map<Float, T> $anchors;
            public final /* synthetic */ Density $density;
            public final /* synthetic */ Function2<T, T, ThresholdConfig> $thresholds;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(Map<Float, ? extends T> map, Function2<? super T, ? super T, ? extends ThresholdConfig> function2, Density density) {
                super(2);
                this.$anchors = map;
                this.$thresholds = function2;
                this.$density = density;
            }

            @NotNull
            public final Float invoke(float f2, float f3) {
                Object value;
                Object value2;
                value = MapsKt__MapsKt.getValue(this.$anchors, Float.valueOf(f2));
                value2 = MapsKt__MapsKt.getValue(this.$anchors, Float.valueOf(f3));
                return Float.valueOf(this.$thresholds.invoke(value, value2).computeThreshold(this.$density, f2, f3));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Float invoke(Float f2, Float f3) {
                return invoke(f2.floatValue(), f3.floatValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(SwipeableState<T> swipeableState, Map<Float, ? extends T> map, ResistanceConfig resistanceConfig, Density density, Function2<? super T, ? super T, ? extends ThresholdConfig> function2, float f2, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$state = swipeableState;
            this.$anchors = map;
            this.$resistance = resistanceConfig;
            this.$density = density;
            this.$thresholds = function2;
            this.$velocityThreshold = f2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass3(this.$state, this.$anchors, this.$resistance, this.$density, this.$thresholds, this.$velocityThreshold, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Map anchors$material_release = this.$state.getAnchors$material_release();
                this.$state.setAnchors$material_release(this.$anchors);
                this.$state.setResistance$material_release(this.$resistance);
                this.$state.setThresholds$material_release(new AnonymousClass1(this.$anchors, this.$thresholds, this.$density));
                this.$state.setVelocityThreshold$material_release(this.$density.mo277toPx0680j_4(this.$velocityThreshold));
                SwipeableState<T> swipeableState = this.$state;
                Object obj2 = this.$anchors;
                this.label = 1;
                if (swipeableState.processNewAnchors$material_release(anchors$material_release, obj2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "androidx.compose.material.SwipeableKt$swipeable$3$4", f = "Swipeable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material.SwipeableKt$swipeable$3$4  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends SuspendLambda implements Function3<u0, Float, Continuation<? super Unit>, Object> {
        public final /* synthetic */ SwipeableState<T> $state;
        public /* synthetic */ float F$0;
        private /* synthetic */ Object L$0;
        public int label;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "androidx.compose.material.SwipeableKt$swipeable$3$4$1", f = "Swipeable.kt", i = {}, l = {616}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.material.SwipeableKt$swipeable$3$4$1  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
            public final /* synthetic */ SwipeableState<T> $state;
            public final /* synthetic */ float $velocity;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SwipeableState<T> swipeableState, float f2, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$state = swipeableState;
                this.$velocity = f2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.$state, this.$velocity, continuation);
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
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    SwipeableState<T> swipeableState = this.$state;
                    float f2 = this.$velocity;
                    this.label = 1;
                    if (swipeableState.performFling(f2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(SwipeableState<T> swipeableState, Continuation<? super AnonymousClass4> continuation) {
            super(3, continuation);
            this.$state = swipeableState;
        }

        @Nullable
        public final Object invoke(@NotNull u0 u0Var, float f2, @Nullable Continuation<? super Unit> continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$state, continuation);
            anonymousClass4.L$0 = u0Var;
            anonymousClass4.F$0 = f2;
            return anonymousClass4.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(u0 u0Var, Float f2, Continuation<? super Unit> continuation) {
            return invoke(u0Var, f2.floatValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                l.f((u0) this.L$0, null, null, new AnonymousClass1(this.$state, this.F$0, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwipeableKt$swipeable$3(Map<Float, ? extends T> map, SwipeableState<T> swipeableState, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, ResistanceConfig resistanceConfig, Function2<? super T, ? super T, ? extends ThresholdConfig> function2, float f2) {
        super(3);
        this.$anchors = map;
        this.$state = swipeableState;
        this.$orientation = orientation;
        this.$enabled = z;
        this.$interactionSource = mutableInteractionSource;
        this.$reverseDirection = z2;
        this.$resistance = resistanceConfig;
        this.$thresholds = function2;
        this.$velocityThreshold = f2;
    }

    @Composable
    @NotNull
    public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i2) {
        List distinct;
        Modifier draggable;
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(1735465469);
        if (!this.$anchors.isEmpty()) {
            distinct = CollectionsKt___CollectionsKt.distinct(this.$anchors.values());
            if (distinct.size() == this.$anchors.size()) {
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                this.$state.ensureInit$material_release(this.$anchors);
                Map<Float, T> map = this.$anchors;
                SwipeableState<T> swipeableState = this.$state;
                EffectsKt.LaunchedEffect(map, swipeableState, new AnonymousClass3(swipeableState, map, this.$resistance, density, this.$thresholds, this.$velocityThreshold, null), composer, 8);
                draggable = DraggableKt.draggable(Modifier.Companion, this.$state.getDraggableState$material_release(), this.$orientation, (r20 & 4) != 0 ? true : this.$enabled, (r20 & 8) != 0 ? null : this.$interactionSource, (r20 & 16) != 0 ? false : this.$state.isAnimationRunning(), (r20 & 32) != 0 ? new DraggableKt$draggable$1(null) : null, (r20 & 64) != 0 ? new DraggableKt$draggable$2(null) : new AnonymousClass4(this.$state, null), (r20 & 128) != 0 ? false : this.$reverseDirection);
                composer.endReplaceableGroup();
                return draggable;
            }
            throw new IllegalArgumentException("You cannot have two anchors mapped to the same state.".toString());
        }
        throw new IllegalArgumentException("You must have at least one anchor.".toString());
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }
}
