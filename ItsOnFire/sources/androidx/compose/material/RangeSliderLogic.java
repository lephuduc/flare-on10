package androidx.compose.material;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.State;
import j.l;
import j.u0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016\u0012\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\u001d¢\u0006\u0004\b\"\u0010#J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J&\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00168\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR)\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Landroidx/compose/material/RangeSliderLogic;", "", "", "draggingStart", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "activeInteraction", "", "eventX", "shouldCaptureStartThumb", "posX", "Landroidx/compose/foundation/interaction/Interaction;", "interaction", "Lj/u0;", "scope", "", "captureThumb", "startInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getStartInteractionSource", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "endInteractionSource", "getEndInteractionSource", "Landroidx/compose/runtime/State;", "rawOffsetStart", "Landroidx/compose/runtime/State;", "getRawOffsetStart", "()Landroidx/compose/runtime/State;", "rawOffsetEnd", "getRawOffsetEnd", "Lkotlin/Function2;", "onDrag", "Lkotlin/jvm/functions/Function2;", "getOnDrag", "()Lkotlin/jvm/functions/Function2;", "<init>", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Lkotlin/jvm/functions/Function2;)V", "material_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class RangeSliderLogic {
    @NotNull
    private final MutableInteractionSource endInteractionSource;
    @NotNull
    private final Function2<Boolean, Float, Unit> onDrag;
    @NotNull
    private final State<Float> rawOffsetEnd;
    @NotNull
    private final State<Float> rawOffsetStart;
    @NotNull
    private final MutableInteractionSource startInteractionSource;

    /* JADX WARN: Multi-variable type inference failed */
    public RangeSliderLogic(@NotNull MutableInteractionSource startInteractionSource, @NotNull MutableInteractionSource endInteractionSource, @NotNull State<Float> rawOffsetStart, @NotNull State<Float> rawOffsetEnd, @NotNull Function2<? super Boolean, ? super Float, Unit> onDrag) {
        Intrinsics.checkNotNullParameter(startInteractionSource, "startInteractionSource");
        Intrinsics.checkNotNullParameter(endInteractionSource, "endInteractionSource");
        Intrinsics.checkNotNullParameter(rawOffsetStart, "rawOffsetStart");
        Intrinsics.checkNotNullParameter(rawOffsetEnd, "rawOffsetEnd");
        Intrinsics.checkNotNullParameter(onDrag, "onDrag");
        this.startInteractionSource = startInteractionSource;
        this.endInteractionSource = endInteractionSource;
        this.rawOffsetStart = rawOffsetStart;
        this.rawOffsetEnd = rawOffsetEnd;
        this.onDrag = onDrag;
    }

    @NotNull
    public final MutableInteractionSource activeInteraction(boolean z) {
        return z ? this.startInteractionSource : this.endInteractionSource;
    }

    public final void captureThumb(boolean z, float f2, @NotNull Interaction interaction, @NotNull u0 scope) {
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.onDrag.invoke(Boolean.valueOf(z), Float.valueOf(f2 - (z ? this.rawOffsetStart : this.rawOffsetEnd).getValue().floatValue()));
        l.f(scope, null, null, new RangeSliderLogic$captureThumb$1(this, z, interaction, null), 3, null);
    }

    @NotNull
    public final MutableInteractionSource getEndInteractionSource() {
        return this.endInteractionSource;
    }

    @NotNull
    public final Function2<Boolean, Float, Unit> getOnDrag() {
        return this.onDrag;
    }

    @NotNull
    public final State<Float> getRawOffsetEnd() {
        return this.rawOffsetEnd;
    }

    @NotNull
    public final State<Float> getRawOffsetStart() {
        return this.rawOffsetStart;
    }

    @NotNull
    public final MutableInteractionSource getStartInteractionSource() {
        return this.startInteractionSource;
    }

    public final boolean shouldCaptureStartThumb(float f2) {
        float abs = Math.abs(this.rawOffsetStart.getValue().floatValue() - f2);
        float abs2 = Math.abs(this.rawOffsetEnd.getValue().floatValue() - f2);
        if (abs2 == abs) {
            if (this.rawOffsetStart.getValue().floatValue() > f2) {
                return true;
            }
        } else if (abs < abs2) {
            return true;
        }
        return false;
    }
}
