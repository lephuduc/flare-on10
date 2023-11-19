package androidx.compose.ui.input.pointer;

import androidx.appcompat.R;
import androidx.compose.ui.geometry.Offset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\\\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0012J\u0019\u0010\"\u001a\u00020\u0003HÆ\u0003ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b#\u0010\u0018J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\u0019\u0010%\u001a\u00020\u0007HÆ\u0003ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b&\u0010\u0018J\u0019\u0010'\u001a\u00020\u0007HÆ\u0003ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b(\u0010\u0018J\t\u0010)\u001a\u00020\nHÆ\u0003J\u0019\u0010*\u001a\u00020\fHÆ\u0003ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b+\u0010\u001fJ\t\u0010,\u001a\u00020\nHÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J\u0019\u0010.\u001a\u00020\u0007HÆ\u0003ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b/\u0010\u0018Jv\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0007HÆ\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102J\u0013\u00103\u001a\u00020\n2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u000208HÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u001c\u0010\b\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001b\u0010\u0018R\u001c\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001c\u0010\u0018R\u001c\u0010\u0011\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001d\u0010\u0018R\u001c\u0010\u000b\u001a\u00020\fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputEventData;", "", "id", "Landroidx/compose/ui/input/pointer/PointerId;", "uptime", "", "positionOnScreen", "Landroidx/compose/ui/geometry/Offset;", "position", "down", "", "type", "Landroidx/compose/ui/input/pointer/PointerType;", "issuesEnterExit", "historical", "", "Landroidx/compose/ui/input/pointer/HistoricalChange;", "scrollDelta", "(JJJJZIZLjava/util/List;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDown", "()Z", "getHistorical", "()Ljava/util/List;", "getId-J3iCeTQ", "()J", "J", "getIssuesEnterExit", "getPosition-F1C5BW0", "getPositionOnScreen-F1C5BW0", "getScrollDelta-F1C5BW0", "getType-T8wyACA", "()I", "I", "getUptime", "component1", "component1-J3iCeTQ", "component2", "component3", "component3-F1C5BW0", "component4", "component4-F1C5BW0", "component5", "component6", "component6-T8wyACA", "component7", "component8", "component9", "component9-F1C5BW0", "copy", "copy-JzxSYW4", "(JJJJZIZLjava/util/List;J)Landroidx/compose/ui/input/pointer/PointerInputEventData;", "equals", "other", "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class PointerInputEventData {
    private final boolean down;
    @NotNull
    private final List<HistoricalChange> historical;
    private final long id;
    private final boolean issuesEnterExit;
    private final long position;
    private final long positionOnScreen;
    private final long scrollDelta;
    private final int type;
    private final long uptime;

    private PointerInputEventData(long j2, long j3, long j4, long j5, boolean z, int i2, boolean z2, List<HistoricalChange> list, long j6) {
        this.id = j2;
        this.uptime = j3;
        this.positionOnScreen = j4;
        this.position = j5;
        this.down = z;
        this.type = i2;
        this.issuesEnterExit = z2;
        this.historical = list;
        this.scrollDelta = j6;
    }

    public /* synthetic */ PointerInputEventData(long j2, long j3, long j4, long j5, boolean z, int i2, boolean z2, List list, long j6, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, z, i2, (i3 & 64) != 0 ? false : z2, (i3 & 128) != 0 ? new ArrayList() : list, (i3 & 256) != 0 ? Offset.Companion.m1177getZeroF1C5BW0() : j6, null);
    }

    public /* synthetic */ PointerInputEventData(long j2, long j3, long j4, long j5, boolean z, int i2, boolean z2, List list, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, z, i2, z2, list, j6);
    }

    /* renamed from: component1-J3iCeTQ  reason: not valid java name */
    public final long m2665component1J3iCeTQ() {
        return this.id;
    }

    public final long component2() {
        return this.uptime;
    }

    /* renamed from: component3-F1C5BW0  reason: not valid java name */
    public final long m2666component3F1C5BW0() {
        return this.positionOnScreen;
    }

    /* renamed from: component4-F1C5BW0  reason: not valid java name */
    public final long m2667component4F1C5BW0() {
        return this.position;
    }

    public final boolean component5() {
        return this.down;
    }

    /* renamed from: component6-T8wyACA  reason: not valid java name */
    public final int m2668component6T8wyACA() {
        return this.type;
    }

    public final boolean component7() {
        return this.issuesEnterExit;
    }

    @NotNull
    public final List<HistoricalChange> component8() {
        return this.historical;
    }

    /* renamed from: component9-F1C5BW0  reason: not valid java name */
    public final long m2669component9F1C5BW0() {
        return this.scrollDelta;
    }

    @NotNull
    /* renamed from: copy-JzxSYW4  reason: not valid java name */
    public final PointerInputEventData m2670copyJzxSYW4(long j2, long j3, long j4, long j5, boolean z, int i2, boolean z2, @NotNull List<HistoricalChange> historical, long j6) {
        Intrinsics.checkNotNullParameter(historical, "historical");
        return new PointerInputEventData(j2, j3, j4, j5, z, i2, z2, historical, j6, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PointerInputEventData) {
            PointerInputEventData pointerInputEventData = (PointerInputEventData) obj;
            return PointerId.m2646equalsimpl0(this.id, pointerInputEventData.id) && this.uptime == pointerInputEventData.uptime && Offset.m1158equalsimpl0(this.positionOnScreen, pointerInputEventData.positionOnScreen) && Offset.m1158equalsimpl0(this.position, pointerInputEventData.position) && this.down == pointerInputEventData.down && PointerType.m2716equalsimpl0(this.type, pointerInputEventData.type) && this.issuesEnterExit == pointerInputEventData.issuesEnterExit && Intrinsics.areEqual(this.historical, pointerInputEventData.historical) && Offset.m1158equalsimpl0(this.scrollDelta, pointerInputEventData.scrollDelta);
        }
        return false;
    }

    public final boolean getDown() {
        return this.down;
    }

    @NotNull
    public final List<HistoricalChange> getHistorical() {
        return this.historical;
    }

    /* renamed from: getId-J3iCeTQ  reason: not valid java name */
    public final long m2671getIdJ3iCeTQ() {
        return this.id;
    }

    public final boolean getIssuesEnterExit() {
        return this.issuesEnterExit;
    }

    /* renamed from: getPosition-F1C5BW0  reason: not valid java name */
    public final long m2672getPositionF1C5BW0() {
        return this.position;
    }

    /* renamed from: getPositionOnScreen-F1C5BW0  reason: not valid java name */
    public final long m2673getPositionOnScreenF1C5BW0() {
        return this.positionOnScreen;
    }

    /* renamed from: getScrollDelta-F1C5BW0  reason: not valid java name */
    public final long m2674getScrollDeltaF1C5BW0() {
        return this.scrollDelta;
    }

    /* renamed from: getType-T8wyACA  reason: not valid java name */
    public final int m2675getTypeT8wyACA() {
        return this.type;
    }

    public final long getUptime() {
        return this.uptime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int m2647hashCodeimpl = ((((((PointerId.m2647hashCodeimpl(this.id) * 31) + Long.hashCode(this.uptime)) * 31) + Offset.m1163hashCodeimpl(this.positionOnScreen)) * 31) + Offset.m1163hashCodeimpl(this.position)) * 31;
        boolean z = this.down;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int m2717hashCodeimpl = (((m2647hashCodeimpl + i2) * 31) + PointerType.m2717hashCodeimpl(this.type)) * 31;
        boolean z2 = this.issuesEnterExit;
        return ((((m2717hashCodeimpl + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.historical.hashCode()) * 31) + Offset.m1163hashCodeimpl(this.scrollDelta);
    }

    @NotNull
    public String toString() {
        return "PointerInputEventData(id=" + ((Object) PointerId.m2648toStringimpl(this.id)) + ", uptime=" + this.uptime + ", positionOnScreen=" + ((Object) Offset.m1169toStringimpl(this.positionOnScreen)) + ", position=" + ((Object) Offset.m1169toStringimpl(this.position)) + ", down=" + this.down + ", type=" + ((Object) PointerType.m2718toStringimpl(this.type)) + ", issuesEnterExit=" + this.issuesEnterExit + ", historical=" + this.historical + ", scrollDelta=" + ((Object) Offset.m1169toStringimpl(this.scrollDelta)) + ')';
    }
}
