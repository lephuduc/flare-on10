package androidx.compose.foundation.lazy.list;

import androidx.appcompat.R;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u0001B\u0018\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0006R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR+\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R%\u0010\u0019\u001a\u00020\u0003X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/lazy/list/PlaceableInfo;", "", "initialOffset", "Landroidx/compose/ui/unit/IntOffset;", "size", "", "(JILkotlin/jvm/internal/DefaultConstructorMarker;)V", "animatedOffset", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector2D;", "getAnimatedOffset", "()Landroidx/compose/animation/core/Animatable;", "<set-?>", "", "inProgress", "getInProgress", "()Z", "setInProgress", "(Z)V", "inProgress$delegate", "Landroidx/compose/runtime/MutableState;", "getSize", "()I", "setSize", "(I)V", "targetOffset", "getTargetOffset-nOcc-ac", "()J", "setTargetOffset--gyyYBs", "(J)V", "J", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class PlaceableInfo {
    @NotNull
    private final Animatable<IntOffset, AnimationVector2D> animatedOffset;
    @NotNull
    private final MutableState inProgress$delegate;
    private int size;
    private long targetOffset;

    private PlaceableInfo(long j2, int i2) {
        MutableState mutableStateOf$default;
        this.size = i2;
        this.animatedOffset = new Animatable<>(IntOffset.m3434boximpl(j2), VectorConvertersKt.getVectorConverter(IntOffset.Companion), null, 4, null);
        this.targetOffset = j2;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.inProgress$delegate = mutableStateOf$default;
    }

    public /* synthetic */ PlaceableInfo(long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, i2);
    }

    @NotNull
    public final Animatable<IntOffset, AnimationVector2D> getAnimatedOffset() {
        return this.animatedOffset;
    }

    public final boolean getInProgress() {
        return ((Boolean) this.inProgress$delegate.getValue()).booleanValue();
    }

    public final int getSize() {
        return this.size;
    }

    /* renamed from: getTargetOffset-nOcc-ac  reason: not valid java name */
    public final long m481getTargetOffsetnOccac() {
        return this.targetOffset;
    }

    public final void setInProgress(boolean z) {
        this.inProgress$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setSize(int i2) {
        this.size = i2;
    }

    /* renamed from: setTargetOffset--gyyYBs  reason: not valid java name */
    public final void m482setTargetOffsetgyyYBs(long j2) {
        this.targetOffset = j2;
    }
}
