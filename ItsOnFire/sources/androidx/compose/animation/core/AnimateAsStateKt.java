package androidx.compose.animation.core;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import l.n;
import l.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aK\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0013\u001a\u00020\u00042\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001aM\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u00022\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010\u001d\u001aC\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u0013\u001a\u00020\u00062\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00152\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010\u001f\u001aK\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u0013\u001a\u00020\b2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00152\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"\u001aK\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u0013\u001a\u00020\n2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00152\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010\"\u001aK\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\u0006\u0010\u0013\u001a\u00020\f2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u00152\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010\"\u001aC\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00152\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010(\u001aK\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00100\u00122\u0006\u0010\u0013\u001a\u00020\u00102\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u00152\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010\"\u001as\u0010+\u001a\b\u0012\u0004\u0012\u0002H,0\u0012\"\u0004\b\u0000\u0010,\"\b\b\u0001\u0010-*\u00020.2\u0006\u0010\u0013\u001a\u0002H,2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u0002H,\u0012\u0004\u0012\u0002H-002\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H,0\u00152\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u0001H,2\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u0002H,\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0002\u00101\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\"\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\"\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\"\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"defaultAnimation", "Landroidx/compose/animation/core/SpringSpec;", "", "dpDefaultSpring", "Landroidx/compose/ui/unit/Dp;", "intDefaultSpring", "", "intOffsetDefaultSpring", "Landroidx/compose/ui/unit/IntOffset;", "intSizeDefaultSpring", "Landroidx/compose/ui/unit/IntSize;", "offsetDefaultSpring", "Landroidx/compose/ui/geometry/Offset;", "rectDefaultSpring", "Landroidx/compose/ui/geometry/Rect;", "sizeDefaultSpring", "Landroidx/compose/ui/geometry/Size;", "animateDpAsState", "Landroidx/compose/runtime/State;", "targetValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "finishedListener", "Lkotlin/Function1;", "", "animateDpAsState-Kz89ssw", "(FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateFloatAsState", "visibilityThreshold", "(FLandroidx/compose/animation/core/AnimationSpec;FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateIntAsState", "(ILandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateIntOffsetAsState", "animateIntOffsetAsState-8f6pmRE", "(JLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateIntSizeAsState", "animateIntSizeAsState-zTRF_AQ", "animateOffsetAsState", "animateOffsetAsState-N6fFfp4", "animateRectAsState", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateSizeAsState", "animateSizeAsState-LjSzlW0", "animateValueAsState", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animation-core_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class AnimateAsStateKt {
    @NotNull
    private static final SpringSpec<Float> defaultAnimation = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
    @NotNull
    private static final SpringSpec<Dp> dpDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Dp.m3323boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Dp.Companion)), 3, null);
    @NotNull
    private static final SpringSpec<Size> sizeDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Size.m1218boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Size.Companion)), 3, null);
    @NotNull
    private static final SpringSpec<Offset> offsetDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Offset.m1150boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Offset.Companion)), 3, null);
    @NotNull
    private static final SpringSpec<Rect> rectDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.Companion), 3, null);
    @NotNull
    private static final SpringSpec<Integer> intDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Integer.valueOf(VisibilityThresholdsKt.getVisibilityThreshold(IntCompanionObject.INSTANCE)), 3, null);
    @NotNull
    private static final SpringSpec<IntOffset> intOffsetDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m3434boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 3, null);
    @NotNull
    private static final SpringSpec<IntSize> intSizeDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.m3477boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 3, null);

    @Composable
    @NotNull
    /* renamed from: animateDpAsState-Kz89ssw  reason: not valid java name */
    public static final State<Dp> m93animateDpAsStateKz89ssw(float f2, @Nullable AnimationSpec<Dp> animationSpec, @Nullable Function1<? super Dp, Unit> function1, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1364859110);
        if ((i3 & 2) != 0) {
            animationSpec = dpDefaultSpring;
        }
        AnimationSpec<Dp> animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            function1 = null;
        }
        State<Dp> animateValueAsState = animateValueAsState(Dp.m3323boximpl(f2), VectorConvertersKt.getVectorConverter(Dp.Companion), animationSpec2, null, function1, composer, (i2 & 14) | ((i2 << 3) & 896) | (57344 & (i2 << 6)), 8);
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @Composable
    @NotNull
    public static final State<Float> animateFloatAsState(float f2, @Nullable AnimationSpec<Float> animationSpec, float f3, @Nullable Function1<? super Float, Unit> function1, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(841393235);
        if ((i3 & 2) != 0) {
            animationSpec = defaultAnimation;
        }
        if ((i3 & 4) != 0) {
            f3 = 0.01f;
        }
        Function1<? super Float, Unit> function12 = (i3 & 8) != 0 ? null : function1;
        composer.startReplaceableGroup(841393485);
        if (animationSpec == defaultAnimation) {
            Float valueOf = Float.valueOf(f3);
            composer.startReplaceableGroup(-3686930);
            boolean changed = composer.changed(valueOf);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = AnimationSpecKt.spring$default(0.0f, 0.0f, Float.valueOf(f3), 3, null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            animationSpec = (AnimationSpec) rememberedValue;
        }
        composer.endReplaceableGroup();
        int i4 = i2 << 3;
        State<Float> animateValueAsState = animateValueAsState(Float.valueOf(f2), VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), animationSpec, Float.valueOf(f3), function12, composer, (i2 & 14) | (i4 & 7168) | (i4 & 57344), 0);
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @Composable
    @NotNull
    public static final State<Integer> animateIntAsState(int i2, @Nullable AnimationSpec<Integer> animationSpec, @Nullable Function1<? super Integer, Unit> function1, @Nullable Composer composer, int i3, int i4) {
        composer.startReplaceableGroup(-887370562);
        if ((i4 & 2) != 0) {
            animationSpec = intDefaultSpring;
        }
        AnimationSpec<Integer> animationSpec2 = animationSpec;
        if ((i4 & 4) != 0) {
            function1 = null;
        }
        State<Integer> animateValueAsState = animateValueAsState(Integer.valueOf(i2), VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), animationSpec2, null, function1, composer, (i3 & 14) | ((i3 << 3) & 896) | (57344 & (i3 << 6)), 8);
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @Composable
    @NotNull
    /* renamed from: animateIntOffsetAsState-8f6pmRE  reason: not valid java name */
    public static final State<IntOffset> m94animateIntOffsetAsState8f6pmRE(long j2, @Nullable AnimationSpec<IntOffset> animationSpec, @Nullable Function1<? super IntOffset, Unit> function1, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1370676387);
        if ((i3 & 2) != 0) {
            animationSpec = intOffsetDefaultSpring;
        }
        AnimationSpec<IntOffset> animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            function1 = null;
        }
        State<IntOffset> animateValueAsState = animateValueAsState(IntOffset.m3434boximpl(j2), VectorConvertersKt.getVectorConverter(IntOffset.Companion), animationSpec2, null, function1, composer, (i2 & 14) | ((i2 << 3) & 896) | (57344 & (i2 << 6)), 8);
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @Composable
    @NotNull
    /* renamed from: animateIntSizeAsState-zTRF_AQ  reason: not valid java name */
    public static final State<IntSize> m95animateIntSizeAsStatezTRF_AQ(long j2, @Nullable AnimationSpec<IntSize> animationSpec, @Nullable Function1<? super IntSize, Unit> function1, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1724517475);
        if ((i3 & 2) != 0) {
            animationSpec = intSizeDefaultSpring;
        }
        AnimationSpec<IntSize> animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            function1 = null;
        }
        State<IntSize> animateValueAsState = animateValueAsState(IntSize.m3477boximpl(j2), VectorConvertersKt.getVectorConverter(IntSize.Companion), animationSpec2, null, function1, composer, (i2 & 14) | ((i2 << 3) & 896) | (57344 & (i2 << 6)), 8);
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @Composable
    @NotNull
    /* renamed from: animateOffsetAsState-N6fFfp4  reason: not valid java name */
    public static final State<Offset> m96animateOffsetAsStateN6fFfp4(long j2, @Nullable AnimationSpec<Offset> animationSpec, @Nullable Function1<? super Offset, Unit> function1, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-200212809);
        if ((i3 & 2) != 0) {
            animationSpec = offsetDefaultSpring;
        }
        AnimationSpec<Offset> animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            function1 = null;
        }
        State<Offset> animateValueAsState = animateValueAsState(Offset.m1150boximpl(j2), VectorConvertersKt.getVectorConverter(Offset.Companion), animationSpec2, null, function1, composer, (i2 & 14) | ((i2 << 3) & 896) | (57344 & (i2 << 6)), 8);
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @Composable
    @NotNull
    public static final State<Rect> animateRectAsState(@NotNull Rect targetValue, @Nullable AnimationSpec<Rect> animationSpec, @Nullable Function1<? super Rect, Unit> function1, @Nullable Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        composer.startReplaceableGroup(231660788);
        if ((i3 & 2) != 0) {
            animationSpec = rectDefaultSpring;
        }
        AnimationSpec<Rect> animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            function1 = null;
        }
        State<Rect> animateValueAsState = animateValueAsState(targetValue, VectorConvertersKt.getVectorConverter(Rect.Companion), animationSpec2, null, function1, composer, (i2 & 14) | ((i2 << 3) & 896) | (57344 & (i2 << 6)), 8);
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @Composable
    @NotNull
    /* renamed from: animateSizeAsState-LjSzlW0  reason: not valid java name */
    public static final State<Size> m97animateSizeAsStateLjSzlW0(long j2, @Nullable AnimationSpec<Size> animationSpec, @Nullable Function1<? super Size, Unit> function1, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1414928158);
        if ((i3 & 2) != 0) {
            animationSpec = sizeDefaultSpring;
        }
        AnimationSpec<Size> animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            function1 = null;
        }
        State<Size> animateValueAsState = animateValueAsState(Size.m1218boximpl(j2), VectorConvertersKt.getVectorConverter(Size.Companion), animationSpec2, null, function1, composer, (i2 & 14) | ((i2 << 3) & 896) | (57344 & (i2 << 6)), 8);
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @Composable
    @NotNull
    public static final <T, V extends AnimationVector> State<T> animateValueAsState(T t2, @NotNull TwoWayConverter<T, V> typeConverter, @Nullable AnimationSpec<T> animationSpec, @Nullable T t3, @Nullable Function1<? super T, Unit> function1, @Nullable Composer composer, int i2, int i3) {
        AnimationSpec<T> animationSpec2;
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        composer.startReplaceableGroup(1824613323);
        if ((i3 & 4) != 0) {
            composer.startReplaceableGroup(-3687241);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = AnimationSpecKt.spring$default(0.0f, 0.0f, t3, 3, null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            animationSpec2 = (AnimationSpec) rememberedValue;
        } else {
            animationSpec2 = animationSpec;
        }
        Function1<? super T, Unit> function12 = (i3 & 16) != 0 ? null : function1;
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue2 = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        Object obj = rememberedValue2;
        if (rememberedValue2 == companion.getEmpty()) {
            Animatable animatable = new Animatable(t2, typeConverter, null, 4, null);
            composer.updateRememberedValue(animatable);
            obj = animatable;
        }
        composer.endReplaceableGroup();
        Animatable animatable2 = (Animatable) obj;
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function12, composer, (i2 >> 12) & 14);
        State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(animationSpec2, composer, (i2 >> 6) & 14);
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = q.d(-1, null, null, 6, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        n nVar = (n) rememberedValue3;
        EffectsKt.SideEffect(new AnimateAsStateKt$animateValueAsState$2(nVar, t2), composer, 0);
        EffectsKt.LaunchedEffect(nVar, new AnimateAsStateKt$animateValueAsState$3(nVar, animatable2, rememberUpdatedState2, rememberUpdatedState, null), composer, 8);
        State<T> asState = animatable2.asState();
        composer.endReplaceableGroup();
        return asState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: animateValueAsState$lambda-3  reason: not valid java name */
    public static final <T> Function1<T, Unit> m98animateValueAsState$lambda3(State<? extends Function1<? super T, Unit>> state) {
        return (Function1) ((Function1<? super T, Unit>) state.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: animateValueAsState$lambda-4  reason: not valid java name */
    public static final <T> AnimationSpec<T> m99animateValueAsState$lambda4(State<? extends AnimationSpec<T>> state) {
        return state.getValue();
    }
}
