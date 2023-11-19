package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import j.l;
import j.u0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001:\u0001/B \u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0004\b-\u0010.J)\u0010\n\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00108\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019RW\u0010 \u001a4\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000eø\u0001\u0000¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010'\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"Landroidx/compose/animation/SizeAnimationModifier;", "Landroidx/compose/animation/LayoutModifierWithPassThroughIntrinsics;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/unit/IntSize;", "targetSize", "animateTo-mzRDjE0", "(J)J", "animateTo", "Landroidx/compose/animation/core/AnimationSpec;", "animSpec", "Landroidx/compose/animation/core/AnimationSpec;", "getAnimSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "Lj/u0;", "scope", "Lj/u0;", "getScope", "()Lj/u0;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "startSize", "endSize", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/jvm/functions/Function2;", "getListener", "()Lkotlin/jvm/functions/Function2;", "setListener", "(Lkotlin/jvm/functions/Function2;)V", "Landroidx/compose/animation/SizeAnimationModifier$AnimData;", "animData", "Landroidx/compose/animation/SizeAnimationModifier$AnimData;", "getAnimData", "()Landroidx/compose/animation/SizeAnimationModifier$AnimData;", "setAnimData", "(Landroidx/compose/animation/SizeAnimationModifier$AnimData;)V", "<init>", "(Landroidx/compose/animation/core/AnimationSpec;Lj/u0;)V", "AnimData", "animation_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
final class SizeAnimationModifier extends LayoutModifierWithPassThroughIntrinsics {
    @Nullable
    private AnimData animData;
    @NotNull
    private final AnimationSpec<IntSize> animSpec;
    @Nullable
    private Function2<? super IntSize, ? super IntSize, Unit> listener;
    @NotNull
    private final u0 scope;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B$\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0018\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003ø\u0001\u0000J\u0019\u0010\u0010\u001a\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ6\u0010\u0012\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R \u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003ø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR%\u0010\u0006\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/animation/SizeAnimationModifier$AnimData;", "", "anim", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "startSize", "(Landroidx/compose/animation/core/Animatable;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAnim", "()Landroidx/compose/animation/core/Animatable;", "getStartSize-YbymL2g", "()J", "setStartSize-ozmzZPI", "(J)V", "J", "component1", "component2", "component2-YbymL2g", "copy", "copy-O0kMr_c", "(Landroidx/compose/animation/core/Animatable;J)Landroidx/compose/animation/SizeAnimationModifier$AnimData;", "equals", "", "other", "hashCode", "", "toString", "", "animation_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class AnimData {
        public static final int $stable = 8;
        @NotNull
        private final Animatable<IntSize, AnimationVector2D> anim;
        private long startSize;

        private AnimData(Animatable<IntSize, AnimationVector2D> animatable, long j2) {
            this.anim = animatable;
            this.startSize = j2;
        }

        public /* synthetic */ AnimData(Animatable animatable, long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(animatable, j2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: copy-O0kMr_c$default  reason: not valid java name */
        public static /* synthetic */ AnimData m82copyO0kMr_c$default(AnimData animData, Animatable animatable, long j2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                animatable = animData.anim;
            }
            if ((i2 & 2) != 0) {
                j2 = animData.startSize;
            }
            return animData.m84copyO0kMr_c(animatable, j2);
        }

        @NotNull
        public final Animatable<IntSize, AnimationVector2D> component1() {
            return this.anim;
        }

        /* renamed from: component2-YbymL2g  reason: not valid java name */
        public final long m83component2YbymL2g() {
            return this.startSize;
        }

        @NotNull
        /* renamed from: copy-O0kMr_c  reason: not valid java name */
        public final AnimData m84copyO0kMr_c(@NotNull Animatable<IntSize, AnimationVector2D> anim, long j2) {
            Intrinsics.checkNotNullParameter(anim, "anim");
            return new AnimData(anim, j2, null);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AnimData) {
                AnimData animData = (AnimData) obj;
                return Intrinsics.areEqual(this.anim, animData.anim) && IntSize.m3483equalsimpl0(this.startSize, animData.startSize);
            }
            return false;
        }

        @NotNull
        public final Animatable<IntSize, AnimationVector2D> getAnim() {
            return this.anim;
        }

        /* renamed from: getStartSize-YbymL2g  reason: not valid java name */
        public final long m85getStartSizeYbymL2g() {
            return this.startSize;
        }

        public int hashCode() {
            return (this.anim.hashCode() * 31) + IntSize.m3486hashCodeimpl(this.startSize);
        }

        /* renamed from: setStartSize-ozmzZPI  reason: not valid java name */
        public final void m86setStartSizeozmzZPI(long j2) {
            this.startSize = j2;
        }

        @NotNull
        public String toString() {
            return "AnimData(anim=" + this.anim + ", startSize=" + ((Object) IntSize.m3488toStringimpl(this.startSize)) + ')';
        }
    }

    public SizeAnimationModifier(@NotNull AnimationSpec<IntSize> animSpec, @NotNull u0 scope) {
        Intrinsics.checkNotNullParameter(animSpec, "animSpec");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.animSpec = animSpec;
        this.scope = scope;
    }

    /* renamed from: animateTo-mzRDjE0  reason: not valid java name */
    public final long m81animateTomzRDjE0(long j2) {
        AnimData animData = this.animData;
        if (animData == null) {
            animData = null;
        } else if (!IntSize.m3483equalsimpl0(j2, animData.getAnim().getTargetValue().m3489unboximpl())) {
            animData.m86setStartSizeozmzZPI(animData.getAnim().getValue().m3489unboximpl());
            l.f(getScope(), null, null, new SizeAnimationModifier$animateTo$data$1$1(animData, j2, this, null), 3, null);
        }
        if (animData == null) {
            animData = new AnimData(new Animatable(IntSize.m3477boximpl(j2), VectorConvertersKt.getVectorConverter(IntSize.Companion), IntSize.m3477boximpl(IntSizeKt.IntSize(1, 1))), j2, null);
        }
        this.animData = animData;
        return animData.getAnim().getValue().m3489unboximpl();
    }

    @Nullable
    public final AnimData getAnimData() {
        return this.animData;
    }

    @NotNull
    public final AnimationSpec<IntSize> getAnimSpec() {
        return this.animSpec;
    }

    @Nullable
    public final Function2<IntSize, IntSize, Unit> getListener() {
        return this.listener;
    }

    @NotNull
    public final u0 getScope() {
        return this.scope;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo21measure3p2s80s(@NotNull MeasureScope receiver, @NotNull Measurable measurable, long j2) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Placeable mo2758measureBRTryo0 = measurable.mo2758measureBRTryo0(j2);
        long m81animateTomzRDjE0 = m81animateTomzRDjE0(IntSizeKt.IntSize(mo2758measureBRTryo0.getWidth(), mo2758measureBRTryo0.getHeight()));
        return MeasureScope.DefaultImpls.layout$default(receiver, IntSize.m3485getWidthimpl(m81animateTomzRDjE0), IntSize.m3484getHeightimpl(m81animateTomzRDjE0), null, new SizeAnimationModifier$measure$1(mo2758measureBRTryo0), 4, null);
    }

    public final void setAnimData(@Nullable AnimData animData) {
        this.animData = animData;
    }

    public final void setListener(@Nullable Function2<? super IntSize, ? super IntSize, Unit> function2) {
        this.listener = function2;
    }
}
