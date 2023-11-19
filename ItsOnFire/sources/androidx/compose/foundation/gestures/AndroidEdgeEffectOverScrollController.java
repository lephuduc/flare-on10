package androidx.compose.foundation.gestures;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.appcompat.R;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001d\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010\u0012J7\u0010+\u001a\u00020'2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-2\b\u0010/\u001a\u0004\u0018\u00010-2\u0006\u00100\u001a\u000201H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103J\u001d\u00104\u001a\u00020)2\u0006\u0010(\u001a\u00020)H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u00106J/\u00107\u001a\u00020-2\u0006\u00108\u001a\u00020-2\b\u0010/\u001a\u0004\u0018\u00010-2\u0006\u00100\u001a\u000201H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b9\u0010:J\b\u0010;\u001a\u00020\u0015H\u0002J\b\u0010<\u001a\u00020'H\u0002J%\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020-2\u0006\u0010@\u001a\u00020-H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bA\u0010BJ%\u0010C\u001a\u00020>2\u0006\u0010?\u001a\u00020-2\u0006\u0010@\u001a\u00020-H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bD\u0010BJ%\u0010E\u001a\u00020>2\u0006\u0010?\u001a\u00020-2\u0006\u0010@\u001a\u00020-H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bF\u0010BJ%\u0010G\u001a\u00020>2\u0006\u0010?\u001a\u00020-2\u0006\u0010@\u001a\u00020-H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bH\u0010BJ%\u0010I\u001a\u00020'2\u0006\u0010J\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bK\u0010LJ\b\u0010M\u001a\u00020'H\u0016J\u001d\u0010N\u001a\u00020\u00152\u0006\u0010O\u001a\u00020-H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bP\u0010QJ\b\u0010R\u001a\u00020\u0015H\u0016J \u0010S\u001a\u00020\u0015*\u00020T2\u0006\u0010U\u001a\u00020\t2\n\u0010V\u001a\u00060Wj\u0002`XH\u0002J \u0010Y\u001a\u00020\u0015*\u00020T2\u0006\u0010Z\u001a\u00020\t2\n\u0010V\u001a\u00060Wj\u0002`XH\u0002J\f\u0010[\u001a\u00020'*\u00020TH\u0016J \u0010\\\u001a\u00020\u0015*\u00020T2\u0006\u0010]\u001a\u00020\t2\n\u0010V\u001a\u00060Wj\u0002`XH\u0002J \u0010^\u001a\u00020\u0015*\u00020T2\u0006\u0010_\u001a\u00020\t2\n\u0010V\u001a\u00060Wj\u0002`XH\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R4\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8B@BX\u0082\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00158B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006`"}, d2 = {"Landroidx/compose/foundation/gestures/AndroidEdgeEffectOverScrollController;", "Landroidx/compose/foundation/gestures/OverScrollController;", "context", "Landroid/content/Context;", "overScrollConfig", "Landroidx/compose/foundation/gestures/OverScrollConfiguration;", "(Landroid/content/Context;Landroidx/compose/foundation/gestures/OverScrollConfiguration;)V", "allEffects", "", "Landroid/widget/EdgeEffect;", "bottomEffect", "bottomEffectNegation", "<set-?>", "Landroidx/compose/ui/geometry/Size;", "containerSize", "getContainerSize-NH-jbRc", "()J", "setContainerSize-uvyYCjk", "(J)V", "containerSize$delegate", "Landroidx/compose/runtime/MutableState;", "", "isContentScrolls", "()Z", "setContentScrolls", "(Z)V", "isContentScrolls$delegate", "leftEffect", "leftEffectNegation", "getOverScrollConfig", "()Landroidx/compose/foundation/gestures/OverScrollConfiguration;", "redrawSignal", "Landroidx/compose/runtime/MutableState;", "", "rightEffect", "rightEffectNegation", "topEffect", "topEffectNegation", "consumePostFling", "", "velocity", "Landroidx/compose/ui/unit/Velocity;", "consumePostFling-TH1AsA0", "consumePostScroll", "initialDragDelta", "Landroidx/compose/ui/geometry/Offset;", "overScrollDelta", "pointerPosition", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "consumePostScroll-l7mfB5k", "(JJLandroidx/compose/ui/geometry/Offset;I)V", "consumePreFling", "consumePreFling-AH228Gc", "(J)J", "consumePreScroll", "scrollDelta", "consumePreScroll-A0NYTsA", "(JLandroidx/compose/ui/geometry/Offset;I)J", "ignoreOverscroll", "invalidateOverScroll", "pullBottom", "", "scroll", "displacement", "pullBottom-0a9Yr6o", "(JJ)F", "pullLeft", "pullLeft-0a9Yr6o", "pullRight", "pullRight-0a9Yr6o", "pullTop", "pullTop-0a9Yr6o", "refreshContainerInfo", "size", "refreshContainerInfo-TmRCtEA", "(JZ)V", "release", "releaseOppositeOverscroll", "delta", "releaseOppositeOverscroll-k-4lQ0M", "(J)Z", "stopOverscrollAnimation", "drawBottom", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "bottom", "canvas", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "drawLeft", "left", "drawOverScroll", "drawRight", "right", "drawTop", "top", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
final class AndroidEdgeEffectOverScrollController implements OverScrollController {
    @NotNull
    private final List<EdgeEffect> allEffects;
    @NotNull
    private final EdgeEffect bottomEffect;
    @NotNull
    private final EdgeEffect bottomEffectNegation;
    @NotNull
    private final MutableState containerSize$delegate;
    @NotNull
    private final MutableState isContentScrolls$delegate;
    @NotNull
    private final EdgeEffect leftEffect;
    @NotNull
    private final EdgeEffect leftEffectNegation;
    @NotNull
    private final OverScrollConfiguration overScrollConfig;
    @NotNull
    private final MutableState<Integer> redrawSignal;
    @NotNull
    private final EdgeEffect rightEffect;
    @NotNull
    private final EdgeEffect rightEffectNegation;
    @NotNull
    private final EdgeEffect topEffect;
    @NotNull
    private final EdgeEffect topEffectNegation;

    public AndroidEdgeEffectOverScrollController(@NotNull Context context, @NotNull OverScrollConfiguration overScrollConfig) {
        List<EdgeEffect> listOf;
        MutableState<Integer> mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(overScrollConfig, "overScrollConfig");
        this.overScrollConfig = overScrollConfig;
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        EdgeEffect create = edgeEffectCompat.create(context, null);
        this.topEffect = create;
        EdgeEffect create2 = edgeEffectCompat.create(context, null);
        this.bottomEffect = create2;
        EdgeEffect create3 = edgeEffectCompat.create(context, null);
        this.leftEffect = create3;
        EdgeEffect create4 = edgeEffectCompat.create(context, null);
        this.rightEffect = create4;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new EdgeEffect[]{create3, create, create4, create2});
        this.allEffects = listOf;
        this.topEffectNegation = edgeEffectCompat.create(context, null);
        this.bottomEffectNegation = edgeEffectCompat.create(context, null);
        this.leftEffectNegation = edgeEffectCompat.create(context, null);
        this.rightEffectNegation = edgeEffectCompat.create(context, null);
        int size = listOf.size();
        for (int i2 = 0; i2 < size; i2++) {
            listOf.get(i2).setColor(ColorKt.m1447toArgb8_81llA(getOverScrollConfig().m257getGlowColor0d7_KjU()));
        }
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        this.redrawSignal = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m1218boximpl(Size.Companion.m1239getZeroNHjbRc()), null, 2, null);
        this.containerSize$delegate = mutableStateOf$default2;
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.isContentScrolls$delegate = mutableStateOf$default3;
    }

    private final boolean drawBottom(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-Size.m1230getWidthimpl(m210getContainerSizeNHjbRc()), (-Size.m1227getHeightimpl(m210getContainerSizeNHjbRc())) + drawScope.mo277toPx0680j_4(this.overScrollConfig.getDrawPadding().mo373calculateBottomPaddingD9Ej5fM()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean drawLeft(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-Size.m1227getHeightimpl(m210getContainerSizeNHjbRc()), drawScope.mo277toPx0680j_4(this.overScrollConfig.getDrawPadding().mo374calculateLeftPaddingu2uoSUM(drawScope.getLayoutDirection())));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean drawRight(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int roundToInt;
        int save = canvas.save();
        roundToInt = MathKt__MathJVMKt.roundToInt(Size.m1230getWidthimpl(m210getContainerSizeNHjbRc()));
        float mo375calculateRightPaddingu2uoSUM = this.overScrollConfig.getDrawPadding().mo375calculateRightPaddingu2uoSUM(drawScope.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, (-roundToInt) + drawScope.mo277toPx0680j_4(mo375calculateRightPaddingu2uoSUM));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean drawTop(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.translate(0.0f, drawScope.mo277toPx0680j_4(this.overScrollConfig.getDrawPadding().mo376calculateTopPaddingD9Ej5fM()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    /* renamed from: getContainerSize-NH-jbRc  reason: not valid java name */
    private final long m210getContainerSizeNHjbRc() {
        return ((Size) this.containerSize$delegate.getValue()).m1235unboximpl();
    }

    private final boolean ignoreOverscroll() {
        return (this.overScrollConfig.getForceShowAlways() || isContentScrolls()) ? false : true;
    }

    private final void invalidateOverScroll() {
        MutableState<Integer> mutableState = this.redrawSignal;
        mutableState.setValue(Integer.valueOf(mutableState.getValue().intValue() + 1));
    }

    private final boolean isContentScrolls() {
        return ((Boolean) this.isContentScrolls$delegate.getValue()).booleanValue();
    }

    /* renamed from: pullBottom-0a9Yr6o  reason: not valid java name */
    private final float m211pullBottom0a9Yr6o(long j2, long j3) {
        float m1161getXimpl = Offset.m1161getXimpl(j3) / Size.m1230getWidthimpl(m210getContainerSizeNHjbRc());
        return (-EdgeEffectCompat.INSTANCE.onPullDistanceCompat(this.bottomEffect, -(Offset.m1162getYimpl(j2) / Size.m1227getHeightimpl(m210getContainerSizeNHjbRc())), 1 - m1161getXimpl)) * Size.m1227getHeightimpl(m210getContainerSizeNHjbRc());
    }

    /* renamed from: pullLeft-0a9Yr6o  reason: not valid java name */
    private final float m212pullLeft0a9Yr6o(long j2, long j3) {
        float m1162getYimpl = Offset.m1162getYimpl(j3) / Size.m1227getHeightimpl(m210getContainerSizeNHjbRc());
        return EdgeEffectCompat.INSTANCE.onPullDistanceCompat(this.leftEffect, Offset.m1161getXimpl(j2) / Size.m1230getWidthimpl(m210getContainerSizeNHjbRc()), 1 - m1162getYimpl) * Size.m1230getWidthimpl(m210getContainerSizeNHjbRc());
    }

    /* renamed from: pullRight-0a9Yr6o  reason: not valid java name */
    private final float m213pullRight0a9Yr6o(long j2, long j3) {
        return (-EdgeEffectCompat.INSTANCE.onPullDistanceCompat(this.rightEffect, -(Offset.m1161getXimpl(j2) / Size.m1230getWidthimpl(m210getContainerSizeNHjbRc())), Offset.m1162getYimpl(j3) / Size.m1227getHeightimpl(m210getContainerSizeNHjbRc()))) * Size.m1230getWidthimpl(m210getContainerSizeNHjbRc());
    }

    /* renamed from: pullTop-0a9Yr6o  reason: not valid java name */
    private final float m214pullTop0a9Yr6o(long j2, long j3) {
        float m1161getXimpl = Offset.m1161getXimpl(j3) / Size.m1230getWidthimpl(m210getContainerSizeNHjbRc());
        return EdgeEffectCompat.INSTANCE.onPullDistanceCompat(this.topEffect, Offset.m1162getYimpl(j2) / Size.m1227getHeightimpl(m210getContainerSizeNHjbRc()), m1161getXimpl) * Size.m1227getHeightimpl(m210getContainerSizeNHjbRc());
    }

    /* renamed from: releaseOppositeOverscroll-k-4lQ0M  reason: not valid java name */
    private final boolean m215releaseOppositeOverscrollk4lQ0M(long j2) {
        boolean z;
        boolean z2 = false;
        if (this.leftEffect.isFinished() || Offset.m1161getXimpl(j2) >= 0.0f) {
            z = false;
        } else {
            this.leftEffect.onRelease();
            z = this.leftEffect.isFinished();
        }
        if (!this.rightEffect.isFinished() && Offset.m1161getXimpl(j2) > 0.0f) {
            this.rightEffect.onRelease();
            z = z || this.rightEffect.isFinished();
        }
        if (!this.topEffect.isFinished() && Offset.m1162getYimpl(j2) < 0.0f) {
            this.topEffect.onRelease();
            z = z || this.topEffect.isFinished();
        }
        if (this.bottomEffect.isFinished() || Offset.m1162getYimpl(j2) <= 0.0f) {
            return z;
        }
        this.bottomEffect.onRelease();
        if (z || this.bottomEffect.isFinished()) {
            z2 = true;
        }
        return z2;
    }

    /* renamed from: setContainerSize-uvyYCjk  reason: not valid java name */
    private final void m216setContainerSizeuvyYCjk(long j2) {
        this.containerSize$delegate.setValue(Size.m1218boximpl(j2));
    }

    private final void setContentScrolls(boolean z) {
        this.isContentScrolls$delegate.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // androidx.compose.foundation.gestures.OverScrollController
    /* renamed from: consumePostFling-TH1AsA0  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo217consumePostFlingTH1AsA0(long r5) {
        /*
            r4 = this;
            boolean r0 = r4.ignoreOverscroll()
            if (r0 == 0) goto L7
            return
        L7:
            float r0 = androidx.compose.ui.unit.Velocity.m3550getXimpl(r5)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L20
            androidx.compose.foundation.gestures.EdgeEffectCompat r0 = androidx.compose.foundation.gestures.EdgeEffectCompat.INSTANCE
            android.widget.EdgeEffect r2 = r4.leftEffect
            float r3 = androidx.compose.ui.unit.Velocity.m3550getXimpl(r5)
            int r3 = kotlin.math.MathKt.roundToInt(r3)
        L1c:
            r0.onAbsorbCompat(r2, r3)
            goto L36
        L20:
            float r0 = androidx.compose.ui.unit.Velocity.m3550getXimpl(r5)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L36
            androidx.compose.foundation.gestures.EdgeEffectCompat r0 = androidx.compose.foundation.gestures.EdgeEffectCompat.INSTANCE
            android.widget.EdgeEffect r2 = r4.rightEffect
            float r3 = androidx.compose.ui.unit.Velocity.m3550getXimpl(r5)
            int r3 = kotlin.math.MathKt.roundToInt(r3)
            int r3 = -r3
            goto L1c
        L36:
            float r0 = androidx.compose.ui.unit.Velocity.m3551getYimpl(r5)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L4e
            androidx.compose.foundation.gestures.EdgeEffectCompat r0 = androidx.compose.foundation.gestures.EdgeEffectCompat.INSTANCE
            android.widget.EdgeEffect r1 = r4.topEffect
            float r2 = androidx.compose.ui.unit.Velocity.m3551getYimpl(r5)
            int r2 = kotlin.math.MathKt.roundToInt(r2)
        L4a:
            r0.onAbsorbCompat(r1, r2)
            goto L64
        L4e:
            float r0 = androidx.compose.ui.unit.Velocity.m3551getYimpl(r5)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L64
            androidx.compose.foundation.gestures.EdgeEffectCompat r0 = androidx.compose.foundation.gestures.EdgeEffectCompat.INSTANCE
            android.widget.EdgeEffect r1 = r4.bottomEffect
            float r2 = androidx.compose.ui.unit.Velocity.m3551getYimpl(r5)
            int r2 = kotlin.math.MathKt.roundToInt(r2)
            int r2 = -r2
            goto L4a
        L64:
            androidx.compose.ui.unit.Velocity$Companion r0 = androidx.compose.ui.unit.Velocity.Companion
            long r0 = r0.m3561getZero9UxMQ8M()
            boolean r5 = androidx.compose.ui.unit.Velocity.m3549equalsimpl0(r5, r0)
            if (r5 != 0) goto L73
            r4.invalidateOverScroll()
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AndroidEdgeEffectOverScrollController.mo217consumePostFlingTH1AsA0(long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // androidx.compose.foundation.gestures.OverScrollController
    /* renamed from: consumePostScroll-l7mfB5k  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo218consumePostScrolll7mfB5k(long r5, long r7, @org.jetbrains.annotations.Nullable androidx.compose.ui.geometry.Offset r9, int r10) {
        /*
            r4 = this;
            boolean r0 = r4.ignoreOverscroll()
            if (r0 == 0) goto L7
            return
        L7:
            androidx.compose.ui.input.nestedscroll.NestedScrollSource$Companion r0 = androidx.compose.ui.input.nestedscroll.NestedScrollSource.Companion
            int r0 = r0.m2572getDragWNlRxjI()
            boolean r10 = androidx.compose.ui.input.nestedscroll.NestedScrollSource.m2567equalsimpl0(r10, r0)
            r0 = 1
            r1 = 0
            if (r10 == 0) goto L62
            if (r9 != 0) goto L20
            long r9 = r4.m210getContainerSizeNHjbRc()
            long r9 = androidx.compose.ui.geometry.SizeKt.m1240getCenteruvyYCjk(r9)
            goto L24
        L20:
            long r9 = r9.m1171unboximpl()
        L24:
            float r2 = androidx.compose.ui.geometry.Offset.m1161getXimpl(r7)
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L31
            r4.m212pullLeft0a9Yr6o(r7, r9)
            goto L3c
        L31:
            float r2 = androidx.compose.ui.geometry.Offset.m1161getXimpl(r7)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L3c
            r4.m213pullRight0a9Yr6o(r7, r9)
        L3c:
            float r2 = androidx.compose.ui.geometry.Offset.m1162getYimpl(r7)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L48
            r4.m214pullTop0a9Yr6o(r7, r9)
            goto L53
        L48:
            float r2 = androidx.compose.ui.geometry.Offset.m1162getYimpl(r7)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L53
            r4.m211pullBottom0a9Yr6o(r7, r9)
        L53:
            androidx.compose.ui.geometry.Offset$Companion r9 = androidx.compose.ui.geometry.Offset.Companion
            long r9 = r9.m1177getZeroF1C5BW0()
            boolean r7 = androidx.compose.ui.geometry.Offset.m1158equalsimpl0(r7, r9)
            if (r7 == 0) goto L60
            goto L62
        L60:
            r7 = r0
            goto L63
        L62:
            r7 = r1
        L63:
            boolean r5 = r4.m215releaseOppositeOverscrollk4lQ0M(r5)
            if (r5 != 0) goto L6d
            if (r7 == 0) goto L6c
            goto L6d
        L6c:
            r0 = r1
        L6d:
            if (r0 == 0) goto L72
            r4.invalidateOverScroll()
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AndroidEdgeEffectOverScrollController.mo218consumePostScrolll7mfB5k(long, long, androidx.compose.ui.geometry.Offset, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c0  */
    @Override // androidx.compose.foundation.gestures.OverScrollController
    /* renamed from: consumePreFling-AH228Gc  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo219consumePreFlingAH228Gc(long r7) {
        /*
            r6 = this;
            boolean r0 = r6.ignoreOverscroll()
            if (r0 == 0) goto Ld
            androidx.compose.ui.unit.Velocity$Companion r6 = androidx.compose.ui.unit.Velocity.Companion
            long r6 = r6.m3561getZero9UxMQ8M()
            return r6
        Ld:
            float r0 = androidx.compose.ui.unit.Velocity.m3550getXimpl(r7)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = 1
            r3 = 0
            if (r0 <= 0) goto L3b
            androidx.compose.foundation.gestures.EdgeEffectCompat r0 = androidx.compose.foundation.gestures.EdgeEffectCompat.INSTANCE
            android.widget.EdgeEffect r4 = r6.leftEffect
            float r4 = r0.getDistanceCompat(r4)
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L26
            r4 = r2
            goto L27
        L26:
            r4 = r3
        L27:
            if (r4 != 0) goto L3b
            android.widget.EdgeEffect r4 = r6.leftEffect
            float r5 = androidx.compose.ui.unit.Velocity.m3550getXimpl(r7)
            int r5 = kotlin.math.MathKt.roundToInt(r5)
        L33:
            r0.onAbsorbCompat(r4, r5)
            float r0 = androidx.compose.ui.unit.Velocity.m3550getXimpl(r7)
            goto L61
        L3b:
            float r0 = androidx.compose.ui.unit.Velocity.m3550getXimpl(r7)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L60
            androidx.compose.foundation.gestures.EdgeEffectCompat r0 = androidx.compose.foundation.gestures.EdgeEffectCompat.INSTANCE
            android.widget.EdgeEffect r4 = r6.rightEffect
            float r4 = r0.getDistanceCompat(r4)
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L51
            r4 = r2
            goto L52
        L51:
            r4 = r3
        L52:
            if (r4 != 0) goto L60
            android.widget.EdgeEffect r4 = r6.rightEffect
            float r5 = androidx.compose.ui.unit.Velocity.m3550getXimpl(r7)
            int r5 = kotlin.math.MathKt.roundToInt(r5)
            int r5 = -r5
            goto L33
        L60:
            r0 = r1
        L61:
            float r4 = androidx.compose.ui.unit.Velocity.m3551getYimpl(r7)
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 <= 0) goto L8c
            androidx.compose.foundation.gestures.EdgeEffectCompat r4 = androidx.compose.foundation.gestures.EdgeEffectCompat.INSTANCE
            android.widget.EdgeEffect r5 = r6.topEffect
            float r5 = r4.getDistanceCompat(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L77
            r5 = r2
            goto L78
        L77:
            r5 = r3
        L78:
            if (r5 != 0) goto L8c
            android.widget.EdgeEffect r1 = r6.topEffect
            float r2 = androidx.compose.ui.unit.Velocity.m3551getYimpl(r7)
            int r2 = kotlin.math.MathKt.roundToInt(r2)
        L84:
            r4.onAbsorbCompat(r1, r2)
            float r1 = androidx.compose.ui.unit.Velocity.m3551getYimpl(r7)
            goto Lb0
        L8c:
            float r4 = androidx.compose.ui.unit.Velocity.m3551getYimpl(r7)
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 >= 0) goto Lb0
            androidx.compose.foundation.gestures.EdgeEffectCompat r4 = androidx.compose.foundation.gestures.EdgeEffectCompat.INSTANCE
            android.widget.EdgeEffect r5 = r6.bottomEffect
            float r5 = r4.getDistanceCompat(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto La1
            goto La2
        La1:
            r2 = r3
        La2:
            if (r2 != 0) goto Lb0
            android.widget.EdgeEffect r1 = r6.bottomEffect
            float r2 = androidx.compose.ui.unit.Velocity.m3551getYimpl(r7)
            int r2 = kotlin.math.MathKt.roundToInt(r2)
            int r2 = -r2
            goto L84
        Lb0:
            long r7 = androidx.compose.ui.unit.VelocityKt.Velocity(r0, r1)
            androidx.compose.ui.unit.Velocity$Companion r0 = androidx.compose.ui.unit.Velocity.Companion
            long r0 = r0.m3561getZero9UxMQ8M()
            boolean r0 = androidx.compose.ui.unit.Velocity.m3549equalsimpl0(r7, r0)
            if (r0 != 0) goto Lc3
            r6.invalidateOverScroll()
        Lc3:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AndroidEdgeEffectOverScrollController.mo219consumePreFlingAH228Gc(long):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f0  */
    @Override // androidx.compose.foundation.gestures.OverScrollController
    /* renamed from: consumePreScroll-A0NYTsA  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo220consumePreScrollA0NYTsA(long r7, @org.jetbrains.annotations.Nullable androidx.compose.ui.geometry.Offset r9, int r10) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AndroidEdgeEffectOverScrollController.mo220consumePreScrollA0NYTsA(long, androidx.compose.ui.geometry.Offset, int):long");
    }

    @Override // androidx.compose.foundation.gestures.OverScrollController
    public void drawOverScroll(@NotNull DrawScope drawScope) {
        boolean z;
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        androidx.compose.ui.graphics.Canvas canvas = drawScope.getDrawContext().getCanvas();
        this.redrawSignal.getValue();
        if (ignoreOverscroll()) {
            return;
        }
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        boolean z2 = true;
        if (!(edgeEffectCompat.getDistanceCompat(this.leftEffectNegation) == 0.0f)) {
            drawRight(drawScope, this.leftEffectNegation, nativeCanvas);
            this.leftEffectNegation.finish();
        }
        if (this.leftEffect.isFinished()) {
            z = false;
        } else {
            z = drawLeft(drawScope, this.leftEffect, nativeCanvas);
            edgeEffectCompat.onPullDistanceCompat(this.leftEffectNegation, edgeEffectCompat.getDistanceCompat(this.leftEffect), 0.0f);
        }
        if (!(edgeEffectCompat.getDistanceCompat(this.topEffectNegation) == 0.0f)) {
            drawBottom(drawScope, this.topEffectNegation, nativeCanvas);
            this.topEffectNegation.finish();
        }
        if (!this.topEffect.isFinished()) {
            z = drawTop(drawScope, this.topEffect, nativeCanvas) || z;
            edgeEffectCompat.onPullDistanceCompat(this.topEffectNegation, edgeEffectCompat.getDistanceCompat(this.topEffect), 0.0f);
        }
        if (!(edgeEffectCompat.getDistanceCompat(this.rightEffectNegation) == 0.0f)) {
            drawLeft(drawScope, this.rightEffectNegation, nativeCanvas);
            this.rightEffectNegation.finish();
        }
        if (!this.rightEffect.isFinished()) {
            z = drawRight(drawScope, this.rightEffect, nativeCanvas) || z;
            edgeEffectCompat.onPullDistanceCompat(this.rightEffectNegation, edgeEffectCompat.getDistanceCompat(this.rightEffect), 0.0f);
        }
        if (!(edgeEffectCompat.getDistanceCompat(this.bottomEffectNegation) == 0.0f)) {
            drawTop(drawScope, this.bottomEffectNegation, nativeCanvas);
            this.bottomEffectNegation.finish();
        }
        if (!this.bottomEffect.isFinished()) {
            if (!drawBottom(drawScope, this.bottomEffect, nativeCanvas) && !z) {
                z2 = false;
            }
            edgeEffectCompat.onPullDistanceCompat(this.bottomEffectNegation, edgeEffectCompat.getDistanceCompat(this.bottomEffect), 0.0f);
            z = z2;
        }
        if (z) {
            invalidateOverScroll();
        }
    }

    @NotNull
    public final OverScrollConfiguration getOverScrollConfig() {
        return this.overScrollConfig;
    }

    @Override // androidx.compose.foundation.gestures.OverScrollController
    /* renamed from: refreshContainerInfo-TmRCtEA  reason: not valid java name */
    public void mo221refreshContainerInfoTmRCtEA(long j2, boolean z) {
        int roundToInt;
        int roundToInt2;
        int roundToInt3;
        int roundToInt4;
        int roundToInt5;
        int roundToInt6;
        int roundToInt7;
        int roundToInt8;
        int roundToInt9;
        int roundToInt10;
        int roundToInt11;
        int roundToInt12;
        int roundToInt13;
        int roundToInt14;
        int roundToInt15;
        int roundToInt16;
        boolean z2 = !Size.m1226equalsimpl0(j2, m210getContainerSizeNHjbRc());
        boolean z3 = isContentScrolls() != z;
        m216setContainerSizeuvyYCjk(j2);
        setContentScrolls(z);
        if (z2) {
            EdgeEffect edgeEffect = this.topEffect;
            roundToInt = MathKt__MathJVMKt.roundToInt(Size.m1230getWidthimpl(j2));
            roundToInt2 = MathKt__MathJVMKt.roundToInt(Size.m1227getHeightimpl(j2));
            edgeEffect.setSize(roundToInt, roundToInt2);
            EdgeEffect edgeEffect2 = this.bottomEffect;
            roundToInt3 = MathKt__MathJVMKt.roundToInt(Size.m1230getWidthimpl(j2));
            roundToInt4 = MathKt__MathJVMKt.roundToInt(Size.m1227getHeightimpl(j2));
            edgeEffect2.setSize(roundToInt3, roundToInt4);
            EdgeEffect edgeEffect3 = this.leftEffect;
            roundToInt5 = MathKt__MathJVMKt.roundToInt(Size.m1227getHeightimpl(j2));
            roundToInt6 = MathKt__MathJVMKt.roundToInt(Size.m1230getWidthimpl(j2));
            edgeEffect3.setSize(roundToInt5, roundToInt6);
            EdgeEffect edgeEffect4 = this.rightEffect;
            roundToInt7 = MathKt__MathJVMKt.roundToInt(Size.m1227getHeightimpl(j2));
            roundToInt8 = MathKt__MathJVMKt.roundToInt(Size.m1230getWidthimpl(j2));
            edgeEffect4.setSize(roundToInt7, roundToInt8);
            EdgeEffect edgeEffect5 = this.topEffectNegation;
            roundToInt9 = MathKt__MathJVMKt.roundToInt(Size.m1230getWidthimpl(j2));
            roundToInt10 = MathKt__MathJVMKt.roundToInt(Size.m1227getHeightimpl(j2));
            edgeEffect5.setSize(roundToInt9, roundToInt10);
            EdgeEffect edgeEffect6 = this.bottomEffectNegation;
            roundToInt11 = MathKt__MathJVMKt.roundToInt(Size.m1230getWidthimpl(j2));
            roundToInt12 = MathKt__MathJVMKt.roundToInt(Size.m1227getHeightimpl(j2));
            edgeEffect6.setSize(roundToInt11, roundToInt12);
            EdgeEffect edgeEffect7 = this.leftEffectNegation;
            roundToInt13 = MathKt__MathJVMKt.roundToInt(Size.m1227getHeightimpl(j2));
            roundToInt14 = MathKt__MathJVMKt.roundToInt(Size.m1230getWidthimpl(j2));
            edgeEffect7.setSize(roundToInt13, roundToInt14);
            EdgeEffect edgeEffect8 = this.rightEffectNegation;
            roundToInt15 = MathKt__MathJVMKt.roundToInt(Size.m1227getHeightimpl(j2));
            roundToInt16 = MathKt__MathJVMKt.roundToInt(Size.m1230getWidthimpl(j2));
            edgeEffect8.setSize(roundToInt15, roundToInt16);
        }
        if (z3 || z2) {
            release();
        }
    }

    @Override // androidx.compose.foundation.gestures.OverScrollController
    public void release() {
        if (ignoreOverscroll()) {
            return;
        }
        List<EdgeEffect> list = this.allEffects;
        int size = list.size();
        int i2 = 0;
        boolean z = false;
        while (i2 < size) {
            int i3 = i2 + 1;
            EdgeEffect edgeEffect = list.get(i2);
            edgeEffect.onRelease();
            z = edgeEffect.isFinished() || z;
            i2 = i3;
        }
        if (z) {
            invalidateOverScroll();
        }
    }

    @Override // androidx.compose.foundation.gestures.OverScrollController
    public boolean stopOverscrollAnimation() {
        boolean z;
        long m1240getCenteruvyYCjk = SizeKt.m1240getCenteruvyYCjk(m210getContainerSizeNHjbRc());
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        if (edgeEffectCompat.getDistanceCompat(this.leftEffect) == 0.0f) {
            z = false;
        } else {
            m212pullLeft0a9Yr6o(Offset.Companion.m1177getZeroF1C5BW0(), m1240getCenteruvyYCjk);
            z = true;
        }
        if (!(edgeEffectCompat.getDistanceCompat(this.rightEffect) == 0.0f)) {
            m213pullRight0a9Yr6o(Offset.Companion.m1177getZeroF1C5BW0(), m1240getCenteruvyYCjk);
            z = true;
        }
        if (!(edgeEffectCompat.getDistanceCompat(this.topEffect) == 0.0f)) {
            m214pullTop0a9Yr6o(Offset.Companion.m1177getZeroF1C5BW0(), m1240getCenteruvyYCjk);
            z = true;
        }
        if (edgeEffectCompat.getDistanceCompat(this.bottomEffect) == 0.0f) {
            return z;
        }
        m211pullBottom0a9Yr6o(Offset.Companion.m1177getZeroF1C5BW0(), m1240getCenteruvyYCjk);
        return true;
    }
}
