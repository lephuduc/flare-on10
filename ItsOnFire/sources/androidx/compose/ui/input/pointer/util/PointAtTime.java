package androidx.compose.ui.input.pointer.util;

import androidx.appcompat.R;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0018\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\u0003HÆ\u0003ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\f\u0010\bJ\t\u0010\r\u001a\u00020\u0005HÆ\u0003J*\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/input/pointer/util/PointAtTime;", "", "point", "Landroidx/compose/ui/geometry/Offset;", "time", "", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getPoint-F1C5BW0", "()J", "J", "getTime", "component1", "component1-F1C5BW0", "component2", "copy", "copy-3MmeM6k", "(JJ)Landroidx/compose/ui/input/pointer/util/PointAtTime;", "equals", "", "other", "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
final class PointAtTime {
    private final long point;
    private final long time;

    private PointAtTime(long j2, long j3) {
        this.point = j2;
        this.time = j3;
    }

    public /* synthetic */ PointAtTime(long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3);
    }

    /* renamed from: copy-3MmeM6k$default  reason: not valid java name */
    public static /* synthetic */ PointAtTime m2736copy3MmeM6k$default(PointAtTime pointAtTime, long j2, long j3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = pointAtTime.point;
        }
        if ((i2 & 2) != 0) {
            j3 = pointAtTime.time;
        }
        return pointAtTime.m2738copy3MmeM6k(j2, j3);
    }

    /* renamed from: component1-F1C5BW0  reason: not valid java name */
    public final long m2737component1F1C5BW0() {
        return this.point;
    }

    public final long component2() {
        return this.time;
    }

    @NotNull
    /* renamed from: copy-3MmeM6k  reason: not valid java name */
    public final PointAtTime m2738copy3MmeM6k(long j2, long j3) {
        return new PointAtTime(j2, j3, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PointAtTime) {
            PointAtTime pointAtTime = (PointAtTime) obj;
            return Offset.m1158equalsimpl0(this.point, pointAtTime.point) && this.time == pointAtTime.time;
        }
        return false;
    }

    /* renamed from: getPoint-F1C5BW0  reason: not valid java name */
    public final long m2739getPointF1C5BW0() {
        return this.point;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (Offset.m1163hashCodeimpl(this.point) * 31) + Long.hashCode(this.time);
    }

    @NotNull
    public String toString() {
        return "PointAtTime(point=" + ((Object) Offset.m1169toStringimpl(this.point)) + ", time=" + this.time + ')';
    }
}
