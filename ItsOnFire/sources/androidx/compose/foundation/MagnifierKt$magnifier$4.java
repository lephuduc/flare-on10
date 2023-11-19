package androidx.compose.foundation;

import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import j.u0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import l.m;
import o.d0;
import o.i;
import o.k;
import o.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class MagnifierKt$magnifier$4 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    public final /* synthetic */ Function1<Density, Offset> $magnifierCenter;
    public final /* synthetic */ PlatformMagnifierFactory $platformMagnifierFactory;
    public final /* synthetic */ Function1<Density, Offset> $sourceCenter;
    public final /* synthetic */ MagnifierStyle $style;
    public final /* synthetic */ float $zoom;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1", f = "Magnifier.kt", i = {0}, l = {320}, m = "invokeSuspend", n = {"magnifier"}, s = {"L$0"})
    /* renamed from: androidx.compose.foundation.MagnifierKt$magnifier$4$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
        public final /* synthetic */ MutableState<Offset> $anchorPositionInRoot$delegate;
        public final /* synthetic */ Density $density;
        public final /* synthetic */ d0<Unit> $onNeedsUpdate;
        public final /* synthetic */ PlatformMagnifierFactory $platformMagnifierFactory;
        public final /* synthetic */ MagnifierStyle $style;
        public final /* synthetic */ State<Function1<Density, Offset>> $updatedMagnifierCenter$delegate;
        public final /* synthetic */ State<Function1<Density, Offset>> $updatedSourceCenter$delegate;
        public final /* synthetic */ State<Float> $updatedZoom$delegate;
        public final /* synthetic */ View $view;
        public final /* synthetic */ float $zoom;
        private /* synthetic */ Object L$0;
        public int label;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1$1", f = "Magnifier.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.MagnifierKt$magnifier$4$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00041 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            public final /* synthetic */ PlatformMagnifier $magnifier;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00041(PlatformMagnifier platformMagnifier, Continuation<? super C00041> continuation) {
                super(2, continuation);
                this.$magnifier = platformMagnifier;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C00041(this.$magnifier, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull Unit unit, @Nullable Continuation<? super Unit> continuation) {
                return ((C00041) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.$magnifier.updateContent();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
        /* renamed from: androidx.compose.foundation.MagnifierKt$magnifier$4$1$2  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends Lambda implements Function0<Unit> {
            public final /* synthetic */ MutableState<Offset> $anchorPositionInRoot$delegate;
            public final /* synthetic */ Density $density;
            public final /* synthetic */ PlatformMagnifier $magnifier;
            public final /* synthetic */ State<Function1<Density, Offset>> $updatedMagnifierCenter$delegate;
            public final /* synthetic */ State<Function1<Density, Offset>> $updatedSourceCenter$delegate;
            public final /* synthetic */ State<Float> $updatedZoom$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(Density density, PlatformMagnifier platformMagnifier, State<? extends Function1<? super Density, Offset>> state, MutableState<Offset> mutableState, State<? extends Function1<? super Density, Offset>> state2, State<Float> state3) {
                super(0);
                this.$density = density;
                this.$magnifier = platformMagnifier;
                this.$updatedSourceCenter$delegate = state;
                this.$anchorPositionInRoot$delegate = mutableState;
                this.$updatedMagnifierCenter$delegate = state2;
                this.$updatedZoom$delegate = state3;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                long m1171unboximpl = ((Offset) MagnifierKt$magnifier$4.m201invoke$lambda3(this.$updatedSourceCenter$delegate).invoke(this.$density)).m1171unboximpl();
                if (!OffsetKt.m1180isSpecifiedk4lQ0M(MagnifierKt$magnifier$4.m199invoke$lambda1(this.$anchorPositionInRoot$delegate)) || !OffsetKt.m1180isSpecifiedk4lQ0M(m1171unboximpl)) {
                    this.$magnifier.dismiss();
                    return;
                }
                PlatformMagnifier platformMagnifier = this.$magnifier;
                long m1166plusMKHz9U = Offset.m1166plusMKHz9U(MagnifierKt$magnifier$4.m199invoke$lambda1(this.$anchorPositionInRoot$delegate), m1171unboximpl);
                Object invoke = MagnifierKt$magnifier$4.m202invoke$lambda4(this.$updatedMagnifierCenter$delegate).invoke(this.$density);
                MutableState<Offset> mutableState = this.$anchorPositionInRoot$delegate;
                long m1171unboximpl2 = ((Offset) invoke).m1171unboximpl();
                platformMagnifier.mo207updateWko1d7g(m1166plusMKHz9U, OffsetKt.m1180isSpecifiedk4lQ0M(m1171unboximpl2) ? Offset.m1166plusMKHz9U(MagnifierKt$magnifier$4.m199invoke$lambda1(mutableState), m1171unboximpl2) : Offset.Companion.m1176getUnspecifiedF1C5BW0(), MagnifierKt$magnifier$4.m203invoke$lambda5(this.$updatedZoom$delegate));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(PlatformMagnifierFactory platformMagnifierFactory, MagnifierStyle magnifierStyle, View view, Density density, float f2, d0<Unit> d0Var, State<? extends Function1<? super Density, Offset>> state, MutableState<Offset> mutableState, State<? extends Function1<? super Density, Offset>> state2, State<Float> state3, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$platformMagnifierFactory = platformMagnifierFactory;
            this.$style = magnifierStyle;
            this.$view = view;
            this.$density = density;
            this.$zoom = f2;
            this.$onNeedsUpdate = d0Var;
            this.$updatedSourceCenter$delegate = state;
            this.$anchorPositionInRoot$delegate = mutableState;
            this.$updatedMagnifierCenter$delegate = state2;
            this.$updatedZoom$delegate = state3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$platformMagnifierFactory, this.$style, this.$view, this.$density, this.$zoom, this.$onNeedsUpdate, this.$updatedSourceCenter$delegate, this.$anchorPositionInRoot$delegate, this.$updatedMagnifierCenter$delegate, this.$updatedZoom$delegate, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
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
            PlatformMagnifier platformMagnifier;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                PlatformMagnifier create = this.$platformMagnifierFactory.create(this.$style, this.$view, this.$density, this.$zoom);
                k.U0(k.e1(this.$onNeedsUpdate, new C00041(create, null)), (u0) this.L$0);
                try {
                    i snapshotFlow = SnapshotStateKt.snapshotFlow(new AnonymousClass2(this.$density, create, this.$updatedSourceCenter$delegate, this.$anchorPositionInRoot$delegate, this.$updatedMagnifierCenter$delegate, this.$updatedZoom$delegate));
                    this.L$0 = create;
                    this.label = 1;
                    if (k.x(snapshotFlow, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    platformMagnifier = create;
                } catch (Throwable th) {
                    th = th;
                    platformMagnifier = create;
                    platformMagnifier.dismiss();
                    throw th;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                platformMagnifier = (PlatformMagnifier) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th2) {
                    th = th2;
                    platformMagnifier.dismiss();
                    throw th;
                }
            }
            platformMagnifier.dismiss();
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.foundation.MagnifierKt$magnifier$4$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends Lambda implements Function1<LayoutCoordinates, Unit> {
        public final /* synthetic */ MutableState<Offset> $anchorPositionInRoot$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MutableState<Offset> mutableState) {
            super(1);
            this.$anchorPositionInRoot$delegate = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
            invoke2(layoutCoordinates);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull LayoutCoordinates it) {
            Intrinsics.checkNotNullParameter(it, "it");
            MagnifierKt$magnifier$4.m200invoke$lambda2(this.$anchorPositionInRoot$delegate, LayoutCoordinatesKt.positionInRoot(it));
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.foundation.MagnifierKt$magnifier$4$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends Lambda implements Function1<DrawScope, Unit> {
        public final /* synthetic */ d0<Unit> $onNeedsUpdate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(d0<Unit> d0Var) {
            super(1);
            this.$onNeedsUpdate = d0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
            invoke2(drawScope);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull DrawScope drawBehind) {
            Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
            this.$onNeedsUpdate.g(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MagnifierKt$magnifier$4(Function1<? super Density, Offset> function1, Function1<? super Density, Offset> function12, float f2, PlatformMagnifierFactory platformMagnifierFactory, MagnifierStyle magnifierStyle) {
        super(3);
        this.$sourceCenter = function1;
        this.$magnifierCenter = function12;
        this.$zoom = f2;
        this.$platformMagnifierFactory = platformMagnifierFactory;
        this.$style = magnifierStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-1  reason: not valid java name */
    public static final long m199invoke$lambda1(MutableState<Offset> mutableState) {
        return mutableState.getValue().m1171unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-2  reason: not valid java name */
    public static final void m200invoke$lambda2(MutableState<Offset> mutableState, long j2) {
        mutableState.setValue(Offset.m1150boximpl(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-3  reason: not valid java name */
    public static final Function1<Density, Offset> m201invoke$lambda3(State<? extends Function1<? super Density, Offset>> state) {
        return (Function1) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-4  reason: not valid java name */
    public static final Function1<Density, Offset> m202invoke$lambda4(State<? extends Function1<? super Density, Offset>> state) {
        return (Function1) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-5  reason: not valid java name */
    public static final float m203invoke$lambda5(State<Float> state) {
        return state.getValue().floatValue();
    }

    @Composable
    @NotNull
    public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(1676523321);
        View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m1150boximpl(Offset.Companion.m1176getUnspecifiedF1C5BW0()), null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(this.$sourceCenter, composer, 0);
        State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(this.$magnifierCenter, composer, 0);
        State rememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(Float.valueOf(this.$zoom), composer, 0);
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = k0.b(1, 0, m.DROP_OLDEST, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        d0 d0Var = (d0) rememberedValue2;
        float f2 = this.$platformMagnifierFactory.getCanUpdateZoom() ? 0.0f : this.$zoom;
        MagnifierStyle magnifierStyle = this.$style;
        EffectsKt.LaunchedEffect(new Object[]{view, density, Float.valueOf(f2), magnifierStyle, Boolean.valueOf(Intrinsics.areEqual(magnifierStyle, MagnifierStyle.Companion.getTextDefault()))}, (Function2<? super u0, ? super Continuation<? super Unit>, ? extends Object>) new AnonymousClass1(this.$platformMagnifierFactory, this.$style, view, density, this.$zoom, d0Var, rememberUpdatedState, mutableState, rememberUpdatedState2, rememberUpdatedState3, null), composer, 8);
        Modifier drawBehind = DrawModifierKt.drawBehind(OnGloballyPositionedModifierKt.onGloballyPositioned(composed, new AnonymousClass2(mutableState)), new AnonymousClass3(d0Var));
        composer.endReplaceableGroup();
        return drawBehind;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }
}
