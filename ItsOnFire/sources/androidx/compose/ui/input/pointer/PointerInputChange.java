package androidx.compose.ui.input.pointer;

import androidx.appcompat.R;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Offset;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001Bh\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0015BR\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\b\u00100\u001a\u000201H\u0007Jm\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u00103\u001a\u00020\u00052\b\b\u0002\u00104\u001a\u00020\u00072\b\b\u0002\u00105\u001a\u00020\t2\b\b\u0002\u00106\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b7\u00108J}\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u00103\u001a\u00020\u00052\b\b\u0002\u00104\u001a\u00020\u00072\b\b\u0002\u00105\u001a\u00020\t2\b\b\u0002\u00106\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b9\u0010:J\u0087\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u00103\u001a\u00020\u00052\b\b\u0002\u00104\u001a\u00020\u00072\b\b\u0002\u00105\u001a\u00020\t2\b\b\u0002\u00106\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0007H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b;\u0010<J\b\u0010=\u001a\u00020>H\u0016R\u0016\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010\u0018\u001a\u00020\u0007X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0019R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\t8GX\u0087\u0004¢\u0006\f\u0012\u0004\b#\u0010\u001d\u001a\u0004\b\"\u0010$R\u001c\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b%\u0010!R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u001c\u0010\u000b\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b'\u0010!R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!R#\u0010\u0014\u001a\u00020\u00078GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u0012\u0004\b*\u0010\u001d\u001a\u0004\b+\u0010!R\u001c\u0010\u000f\u001a\u00020\u0010ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010!\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006?"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "id", "Landroidx/compose/ui/input/pointer/PointerId;", "uptimeMillis", "", "position", "Landroidx/compose/ui/geometry/Offset;", "pressed", "", "previousUptimeMillis", "previousPosition", "previousPressed", "consumed", "Landroidx/compose/ui/input/pointer/ConsumedData;", "type", "Landroidx/compose/ui/input/pointer/PointerType;", "historical", "", "Landroidx/compose/ui/input/pointer/HistoricalChange;", "scrollDelta", "(JJJZJJZLandroidx/compose/ui/input/pointer/ConsumedData;ILjava/util/List;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJJZJJZLandroidx/compose/ui/input/pointer/ConsumedData;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "_historical", "_scrollDelta", "J", "getConsumed", "()Landroidx/compose/ui/input/pointer/ConsumedData;", "getHistorical$annotations", "()V", "getHistorical", "()Ljava/util/List;", "getId-J3iCeTQ", "()J", "isConsumed", "isConsumed$annotations", "()Z", "getPosition-F1C5BW0", "getPressed", "getPreviousPosition-F1C5BW0", "getPreviousPressed", "getPreviousUptimeMillis", "getScrollDelta-F1C5BW0$annotations", "getScrollDelta-F1C5BW0", "getType-T8wyACA", "()I", "I", "getUptimeMillis", "consume", "", "copy", "currentTime", "currentPosition", "currentPressed", "previousTime", "copy-Ezr-O64", "(JJJZJJZLandroidx/compose/ui/input/pointer/ConsumedData;I)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy-96DQgws", "(JJJZJJZLandroidx/compose/ui/input/pointer/ConsumedData;ILjava/util/List;)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy-cunQLAA$ui_release", "(JJJZJJZLandroidx/compose/ui/input/pointer/ConsumedData;ILjava/util/List;J)Landroidx/compose/ui/input/pointer/PointerInputChange;", "toString", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class PointerInputChange {
    @Nullable
    private List<HistoricalChange> _historical;
    private long _scrollDelta;
    @NotNull
    private final ConsumedData consumed;
    private final long id;
    private final long position;
    private final boolean pressed;
    private final long previousPosition;
    private final boolean previousPressed;
    private final long previousUptimeMillis;
    private final int type;
    private final long uptimeMillis;

    private PointerInputChange(long j2, long j3, long j4, boolean z, long j5, long j6, boolean z2, ConsumedData consumedData, int i2) {
        this.id = j2;
        this.uptimeMillis = j3;
        this.position = j4;
        this.pressed = z;
        this.previousUptimeMillis = j5;
        this.previousPosition = j6;
        this.previousPressed = z2;
        this.consumed = consumedData;
        this.type = i2;
        this._scrollDelta = Offset.Companion.m1177getZeroF1C5BW0();
    }

    public /* synthetic */ PointerInputChange(long j2, long j3, long j4, boolean z, long j5, long j6, boolean z2, ConsumedData consumedData, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, z, j5, j6, z2, consumedData, (i3 & 256) != 0 ? PointerType.Companion.m2723getTouchT8wyACA() : i2, null);
    }

    private PointerInputChange(long j2, long j3, long j4, boolean z, long j5, long j6, boolean z2, ConsumedData consumedData, int i2, List<HistoricalChange> list, long j7) {
        this(j2, j3, j4, z, j5, j6, z2, consumedData, i2, null);
        this._historical = list;
        this._scrollDelta = j7;
    }

    public /* synthetic */ PointerInputChange(long j2, long j3, long j4, boolean z, long j5, long j6, boolean z2, ConsumedData consumedData, int i2, List list, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, z, j5, j6, z2, consumedData, i2, list, j7);
    }

    public /* synthetic */ PointerInputChange(long j2, long j3, long j4, boolean z, long j5, long j6, boolean z2, ConsumedData consumedData, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, z, j5, j6, z2, consumedData, i2);
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getHistorical$annotations() {
    }

    @ExperimentalComposeUiApi
    /* renamed from: getScrollDelta-F1C5BW0$annotations  reason: not valid java name */
    public static /* synthetic */ void m2653getScrollDeltaF1C5BW0$annotations() {
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void isConsumed$annotations() {
    }

    @ExperimentalComposeUiApi
    public final void consume() {
        this.consumed.setDownChange(true);
        this.consumed.setPositionChange(true);
    }

    @ExperimentalComposeUiApi
    @NotNull
    /* renamed from: copy-96DQgws  reason: not valid java name */
    public final PointerInputChange m2654copy96DQgws(long j2, long j3, long j4, boolean z, long j5, long j6, boolean z2, @NotNull ConsumedData consumed, int i2, @NotNull List<HistoricalChange> historical) {
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        Intrinsics.checkNotNullParameter(historical, "historical");
        return new PointerInputChange(j2, j3, j4, z, j5, j6, z2, consumed, i2, historical, m2660getScrollDeltaF1C5BW0(), null);
    }

    @NotNull
    /* renamed from: copy-Ezr-O64  reason: not valid java name */
    public final PointerInputChange m2655copyEzrO64(long j2, long j3, long j4, boolean z, long j5, long j6, boolean z2, @NotNull ConsumedData consumed, int i2) {
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        return new PointerInputChange(j2, j3, j4, z, j5, j6, z2, consumed, i2, getHistorical(), m2660getScrollDeltaF1C5BW0(), null);
    }

    @NotNull
    /* renamed from: copy-cunQLAA$ui_release  reason: not valid java name */
    public final PointerInputChange m2656copycunQLAA$ui_release(long j2, long j3, long j4, boolean z, long j5, long j6, boolean z2, @NotNull ConsumedData consumed, int i2, @NotNull List<HistoricalChange> historical, long j7) {
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        Intrinsics.checkNotNullParameter(historical, "historical");
        return new PointerInputChange(j2, j3, j4, z, j5, j6, z2, consumed, i2, historical, j7, null);
    }

    @NotNull
    public final ConsumedData getConsumed() {
        return this.consumed;
    }

    @ExperimentalComposeUiApi
    @NotNull
    public final List<HistoricalChange> getHistorical() {
        List<HistoricalChange> emptyList;
        List<HistoricalChange> list = this._historical;
        if (list == null) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        return list;
    }

    /* renamed from: getId-J3iCeTQ  reason: not valid java name */
    public final long m2657getIdJ3iCeTQ() {
        return this.id;
    }

    /* renamed from: getPosition-F1C5BW0  reason: not valid java name */
    public final long m2658getPositionF1C5BW0() {
        return this.position;
    }

    public final boolean getPressed() {
        return this.pressed;
    }

    /* renamed from: getPreviousPosition-F1C5BW0  reason: not valid java name */
    public final long m2659getPreviousPositionF1C5BW0() {
        return this.previousPosition;
    }

    public final boolean getPreviousPressed() {
        return this.previousPressed;
    }

    public final long getPreviousUptimeMillis() {
        return this.previousUptimeMillis;
    }

    @ExperimentalComposeUiApi
    /* renamed from: getScrollDelta-F1C5BW0  reason: not valid java name */
    public final long m2660getScrollDeltaF1C5BW0() {
        return this._scrollDelta;
    }

    /* renamed from: getType-T8wyACA  reason: not valid java name */
    public final int m2661getTypeT8wyACA() {
        return this.type;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    @ExperimentalComposeUiApi
    public final boolean isConsumed() {
        return this.consumed.getDownChange() || this.consumed.getPositionChange();
    }

    @NotNull
    public String toString() {
        return "PointerInputChange(id=" + ((Object) PointerId.m2648toStringimpl(m2657getIdJ3iCeTQ())) + ", uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) Offset.m1169toStringimpl(m2658getPositionF1C5BW0())) + ", pressed=" + this.pressed + ", previousUptimeMillis=" + this.previousUptimeMillis + ", previousPosition=" + ((Object) Offset.m1169toStringimpl(m2659getPreviousPositionF1C5BW0())) + ", previousPressed=" + this.previousPressed + ", consumed=" + this.consumed + ", type=" + ((Object) PointerType.m2718toStringimpl(m2661getTypeT8wyACA())) + ", historical=" + getHistorical() + ",scrollDelta=" + ((Object) Offset.m1169toStringimpl(m2660getScrollDeltaF1C5BW0())) + ')';
    }
}
