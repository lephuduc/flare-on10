package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SliderKt$Track$1 extends Lambda implements Function1<DrawScope, Unit> {
    public final /* synthetic */ State<Color> $activeTickColor;
    public final /* synthetic */ State<Color> $activeTrackColor;
    public final /* synthetic */ State<Color> $inactiveTickColor;
    public final /* synthetic */ State<Color> $inactiveTrackColor;
    public final /* synthetic */ float $positionFractionEnd;
    public final /* synthetic */ float $positionFractionStart;
    public final /* synthetic */ float $thumbPx;
    public final /* synthetic */ List<Float> $tickFractions;
    public final /* synthetic */ float $trackStrokeWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$Track$1(float f2, State<Color> state, float f3, float f4, float f5, State<Color> state2, List<Float> list, State<Color> state3, State<Color> state4) {
        super(1);
        this.$thumbPx = f2;
        this.$inactiveTrackColor = state;
        this.$trackStrokeWidth = f3;
        this.$positionFractionEnd = f4;
        this.$positionFractionStart = f5;
        this.$activeTrackColor = state2;
        this.$tickFractions = list;
        this.$inactiveTickColor = state3;
        this.$activeTickColor = state4;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull DrawScope Canvas) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        boolean z = Canvas.getLayoutDirection() == LayoutDirection.Rtl;
        long Offset = OffsetKt.Offset(this.$thumbPx, Offset.m1162getYimpl(Canvas.mo1779getCenterF1C5BW0()));
        long Offset2 = OffsetKt.Offset(Size.m1230getWidthimpl(Canvas.mo1780getSizeNHjbRc()) - this.$thumbPx, Offset.m1162getYimpl(Canvas.mo1779getCenterF1C5BW0()));
        long j2 = z ? Offset2 : Offset;
        long j3 = z ? Offset : Offset2;
        long m1402unboximpl = this.$inactiveTrackColor.getValue().m1402unboximpl();
        float f2 = this.$trackStrokeWidth;
        StrokeCap.Companion companion = StrokeCap.Companion;
        long j4 = j3;
        long j5 = j2;
        DrawScope.DefaultImpls.m1821drawLineNGM6Ib0$default(Canvas, m1402unboximpl, j2, j3, f2, companion.m1670getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        DrawScope.DefaultImpls.m1821drawLineNGM6Ib0$default(Canvas, this.$activeTrackColor.getValue().m1402unboximpl(), OffsetKt.Offset(Offset.m1161getXimpl(j5) + ((Offset.m1161getXimpl(j4) - Offset.m1161getXimpl(j5)) * this.$positionFractionStart), Offset.m1162getYimpl(Canvas.mo1779getCenterF1C5BW0())), OffsetKt.Offset(Offset.m1161getXimpl(j5) + ((Offset.m1161getXimpl(j4) - Offset.m1161getXimpl(j5)) * this.$positionFractionEnd), Offset.m1162getYimpl(Canvas.mo1779getCenterF1C5BW0())), this.$trackStrokeWidth, companion.m1670getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        List<Float> list = this.$tickFractions;
        float f3 = this.$positionFractionEnd;
        float f4 = this.$positionFractionStart;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            float floatValue = ((Number) obj).floatValue();
            Boolean valueOf = Boolean.valueOf(floatValue > f3 || floatValue < f4);
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(valueOf, obj2);
            }
            ((List) obj2).add(obj);
        }
        State<Color> state = this.$inactiveTickColor;
        State<Color> state2 = this.$activeTickColor;
        float f5 = this.$trackStrokeWidth;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            boolean booleanValue = ((Boolean) entry.getKey()).booleanValue();
            List<Number> list2 = (List) entry.getValue();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (Number number : list2) {
                arrayList.add(Offset.m1150boximpl(OffsetKt.Offset(Offset.m1161getXimpl(OffsetKt.m1184lerpWko1d7g(j5, j4, number.floatValue())), Offset.m1162getYimpl(Canvas.mo1779getCenterF1C5BW0()))));
            }
            long j6 = j4;
            long j7 = j5;
            DrawScope.DefaultImpls.m1826drawPointsF8ZwMP8$default(Canvas, arrayList, PointMode.Companion.m1631getPointsr_lszbg(), (booleanValue ? state : state2).getValue().m1402unboximpl(), f5, StrokeCap.Companion.m1670getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
            j5 = j7;
            j4 = j6;
        }
    }
}
