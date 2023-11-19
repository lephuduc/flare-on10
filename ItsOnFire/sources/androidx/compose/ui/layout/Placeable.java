package androidx.compose.ui.layout;

import androidx.appcompat.R;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001:\u0001)B\u0005¢\u0006\u0002\u0010\u0002J@\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020!2\u0019\u0010\"\u001a\u0015\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001e\u0018\u00010#¢\u0006\u0002\b%H$ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'J\b\u0010(\u001a\u00020\u001eH\u0002R\u001d\u0010\u0003\u001a\u00020\u00048DX\u0084\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f@DX\u0084\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000bR/\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u0017@DX\u0084\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\u0013R\u001e\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/Measured;", "()V", "apparentToRealOffset", "Landroidx/compose/ui/unit/IntOffset;", "getApparentToRealOffset-nOcc-ac", "()J", "<set-?>", "", "height", "getHeight", "()I", "measuredHeight", "getMeasuredHeight", "value", "Landroidx/compose/ui/unit/IntSize;", "measuredSize", "getMeasuredSize-YbymL2g", "setMeasuredSize-ozmzZPI", "(J)V", "J", "measuredWidth", "getMeasuredWidth", "Landroidx/compose/ui/unit/Constraints;", "measurementConstraints", "getMeasurementConstraints-msEJaDk", "setMeasurementConstraints-BRTryo0", "width", "getWidth", "placeAt", "", "position", "zIndex", "", "layerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "recalculateWidthAndHeight", "PlacementScope", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public abstract class Placeable implements Measured {
    public static final int $stable = 8;
    private int height;
    private long measuredSize = IntSizeKt.IntSize(0, 0);
    private long measurementConstraints = PlaceableKt.access$getDefaultConstraints$p();
    private int width;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b'\u0018\u0000 %2\u00020\u0001:\u0001%B\u0005¢\u0006\u0002\u0010\u0002J)\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u0011JJ\u0010\u0016\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u001b\b\b\u0010\u0017\u001a\u0015\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f\u0018\u00010\u0018¢\u0006\u0002\b\u001aH\u0080\bø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJJ\u0010\u001d\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u001b\b\b\u0010\u0017\u001a\u0015\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f\u0018\u00010\u0018¢\u0006\u0002\b\u001aH\u0080\bø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001cJ)\u0010\u001f\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010\u0013J$\u0010\u001f\u001a\u00020\f*\u00020\r2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u0011JD\u0010!\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0019\b\u0002\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f0\u0018¢\u0006\u0002\b\u001aø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010\u001cJ?\u0010!\u001a\u00020\f*\u00020\r2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0019\b\u0002\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f0\u0018¢\u0006\u0002\b\u001aJD\u0010#\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0019\b\u0002\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f0\u0018¢\u0006\u0002\b\u001aø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010\u001cJ?\u0010#\u001a\u00020\f*\u00020\r2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0019\b\u0002\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f0\u0018¢\u0006\u0002\b\u001aR\u0012\u0010\u0003\u001a\u00020\u0004X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¤\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006&"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "()V", "parentLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "parentWidth", "", "getParentWidth", "()I", "place", "", "Landroidx/compose/ui/layout/Placeable;", "position", "Landroidx/compose/ui/unit/IntOffset;", "zIndex", "", "place-70tqf50", "(Landroidx/compose/ui/layout/Placeable;JF)V", "x", "y", "placeApparentToRealOffset", "layerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "placeApparentToRealOffset-aW-9-wM$ui_release", "(Landroidx/compose/ui/layout/Placeable;JFLkotlin/jvm/functions/Function1;)V", "placeAutoMirrored", "placeAutoMirrored-aW-9-wM$ui_release", "placeRelative", "placeRelative-70tqf50", "placeRelativeWithLayer", "placeRelativeWithLayer-aW-9-wM", "placeWithLayer", "placeWithLayer-aW-9-wM", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static abstract class PlacementScope {
        public static final int $stable = 0;
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        private static LayoutDirection parentLayoutDirection = LayoutDirection.Ltr;
        private static int parentWidth;

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J7\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0019\b\u0004\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\u000f¢\u0006\u0002\b\u0010H\u0086\bø\u0001\u0000R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@RX\u0094\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b@RX\u0094\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope$Companion;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "()V", "<set-?>", "Landroidx/compose/ui/unit/LayoutDirection;", "parentLayoutDirection", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "", "parentWidth", "getParentWidth", "()I", "executeWithRtlMirroringValues", "", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        /* loaded from: classes.dex */
        public static final class Companion extends PlacementScope {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final void executeWithRtlMirroringValues(int i2, @NotNull LayoutDirection parentLayoutDirection, @NotNull Function1<? super PlacementScope, Unit> block) {
                Intrinsics.checkNotNullParameter(parentLayoutDirection, "parentLayoutDirection");
                Intrinsics.checkNotNullParameter(block, "block");
                Companion companion = PlacementScope.Companion;
                int parentWidth = companion.getParentWidth();
                LayoutDirection parentLayoutDirection2 = companion.getParentLayoutDirection();
                PlacementScope.parentWidth = i2;
                PlacementScope.parentLayoutDirection = parentLayoutDirection;
                block.invoke(this);
                PlacementScope.parentWidth = parentWidth;
                PlacementScope.parentLayoutDirection = parentLayoutDirection2;
            }

            @Override // androidx.compose.ui.layout.Placeable.PlacementScope
            @NotNull
            public LayoutDirection getParentLayoutDirection() {
                return PlacementScope.parentLayoutDirection;
            }

            @Override // androidx.compose.ui.layout.Placeable.PlacementScope
            public int getParentWidth() {
                return PlacementScope.parentWidth;
            }
        }

        public static /* synthetic */ void place$default(PlacementScope placementScope, Placeable placeable, int i2, int i3, float f2, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i4 & 4) != 0) {
                f2 = 0.0f;
            }
            placementScope.place(placeable, i2, i3, f2);
        }

        /* renamed from: place-70tqf50$default  reason: not valid java name */
        public static /* synthetic */ void m2800place70tqf50$default(PlacementScope placementScope, Placeable placeable, long j2, float f2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i2 & 2) != 0) {
                f2 = 0.0f;
            }
            placementScope.m2804place70tqf50(placeable, j2, f2);
        }

        public static /* synthetic */ void placeRelative$default(PlacementScope placementScope, Placeable placeable, int i2, int i3, float f2, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i4 & 4) != 0) {
                f2 = 0.0f;
            }
            placementScope.placeRelative(placeable, i2, i3, f2);
        }

        /* renamed from: placeRelative-70tqf50$default  reason: not valid java name */
        public static /* synthetic */ void m2801placeRelative70tqf50$default(PlacementScope placementScope, Placeable placeable, long j2, float f2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if ((i2 & 2) != 0) {
                f2 = 0.0f;
            }
            placementScope.m2807placeRelative70tqf50(placeable, j2, f2);
        }

        public static /* synthetic */ void placeRelativeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i2, int i3, float f2, Function1 function1, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i4 & 4) != 0) {
                f2 = 0.0f;
            }
            float f3 = f2;
            Function1 function12 = function1;
            if ((i4 & 8) != 0) {
                function12 = PlaceableKt.access$getDefaultLayerBlock$p();
            }
            placementScope.placeRelativeWithLayer(placeable, i2, i3, f3, function12);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM$default  reason: not valid java name */
        public static /* synthetic */ void m2802placeRelativeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j2, float f2, Function1 function1, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i2 & 2) != 0) {
                f2 = 0.0f;
            }
            float f3 = f2;
            Function1 function12 = function1;
            if ((i2 & 4) != 0) {
                function12 = PlaceableKt.access$getDefaultLayerBlock$p();
            }
            placementScope.m2808placeRelativeWithLayeraW9wM(placeable, j2, f3, function12);
        }

        public static /* synthetic */ void placeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i2, int i3, float f2, Function1 function1, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i4 & 4) != 0) {
                f2 = 0.0f;
            }
            float f3 = f2;
            Function1 function12 = function1;
            if ((i4 & 8) != 0) {
                function12 = PlaceableKt.access$getDefaultLayerBlock$p();
            }
            placementScope.placeWithLayer(placeable, i2, i3, f3, function12);
        }

        /* renamed from: placeWithLayer-aW-9-wM$default  reason: not valid java name */
        public static /* synthetic */ void m2803placeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j2, float f2, Function1 function1, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i2 & 2) != 0) {
                f2 = 0.0f;
            }
            float f3 = f2;
            Function1 function12 = function1;
            if ((i2 & 4) != 0) {
                function12 = PlaceableKt.access$getDefaultLayerBlock$p();
            }
            placementScope.m2809placeWithLayeraW9wM(placeable, j2, f3, function12);
        }

        @NotNull
        public abstract LayoutDirection getParentLayoutDirection();

        public abstract int getParentWidth();

        public final void place(@NotNull Placeable placeable, int i2, int i3, float f2) {
            Intrinsics.checkNotNullParameter(placeable, "<this>");
            long IntOffset = IntOffsetKt.IntOffset(i2, i3);
            long m2795getApparentToRealOffsetnOccac = placeable.m2795getApparentToRealOffsetnOccac();
            placeable.mo2759placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m3443getXimpl(IntOffset) + IntOffset.m3443getXimpl(m2795getApparentToRealOffsetnOccac), IntOffset.m3444getYimpl(IntOffset) + IntOffset.m3444getYimpl(m2795getApparentToRealOffsetnOccac)), f2, null);
        }

        /* renamed from: place-70tqf50  reason: not valid java name */
        public final void m2804place70tqf50(@NotNull Placeable receiver, long j2, float f2) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            long m2795getApparentToRealOffsetnOccac = receiver.m2795getApparentToRealOffsetnOccac();
            receiver.mo2759placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m3443getXimpl(j2) + IntOffset.m3443getXimpl(m2795getApparentToRealOffsetnOccac), IntOffset.m3444getYimpl(j2) + IntOffset.m3444getYimpl(m2795getApparentToRealOffsetnOccac)), f2, null);
        }

        /* renamed from: placeApparentToRealOffset-aW-9-wM$ui_release  reason: not valid java name */
        public final void m2805placeApparentToRealOffsetaW9wM$ui_release(@NotNull Placeable receiver, long j2, float f2, @Nullable Function1<? super GraphicsLayerScope, Unit> function1) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            long m2795getApparentToRealOffsetnOccac = receiver.m2795getApparentToRealOffsetnOccac();
            receiver.mo2759placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m3443getXimpl(j2) + IntOffset.m3443getXimpl(m2795getApparentToRealOffsetnOccac), IntOffset.m3444getYimpl(j2) + IntOffset.m3444getYimpl(m2795getApparentToRealOffsetnOccac)), f2, function1);
        }

        /* renamed from: placeAutoMirrored-aW-9-wM$ui_release  reason: not valid java name */
        public final void m2806placeAutoMirroredaW9wM$ui_release(@NotNull Placeable receiver, long j2, float f2, @Nullable Function1<? super GraphicsLayerScope, Unit> function1) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (getParentLayoutDirection() != LayoutDirection.Ltr && getParentWidth() != 0) {
                j2 = IntOffsetKt.IntOffset((getParentWidth() - IntSize.m3485getWidthimpl(receiver.m2796getMeasuredSizeYbymL2g())) - IntOffset.m3443getXimpl(j2), IntOffset.m3444getYimpl(j2));
            }
            long m2795getApparentToRealOffsetnOccac = receiver.m2795getApparentToRealOffsetnOccac();
            receiver.mo2759placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m3443getXimpl(j2) + IntOffset.m3443getXimpl(m2795getApparentToRealOffsetnOccac), IntOffset.m3444getYimpl(j2) + IntOffset.m3444getYimpl(m2795getApparentToRealOffsetnOccac)), f2, function1);
        }

        public final void placeRelative(@NotNull Placeable placeable, int i2, int i3, float f2) {
            Intrinsics.checkNotNullParameter(placeable, "<this>");
            long IntOffset = IntOffsetKt.IntOffset(i2, i3);
            if (getParentLayoutDirection() != LayoutDirection.Ltr && getParentWidth() != 0) {
                IntOffset = IntOffsetKt.IntOffset((getParentWidth() - IntSize.m3485getWidthimpl(placeable.m2796getMeasuredSizeYbymL2g())) - IntOffset.m3443getXimpl(IntOffset), IntOffset.m3444getYimpl(IntOffset));
            }
            long m2795getApparentToRealOffsetnOccac = placeable.m2795getApparentToRealOffsetnOccac();
            placeable.mo2759placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m3443getXimpl(IntOffset) + IntOffset.m3443getXimpl(m2795getApparentToRealOffsetnOccac), IntOffset.m3444getYimpl(IntOffset) + IntOffset.m3444getYimpl(m2795getApparentToRealOffsetnOccac)), f2, null);
        }

        /* renamed from: placeRelative-70tqf50  reason: not valid java name */
        public final void m2807placeRelative70tqf50(@NotNull Placeable receiver, long j2, float f2) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (getParentLayoutDirection() != LayoutDirection.Ltr && getParentWidth() != 0) {
                j2 = IntOffsetKt.IntOffset((getParentWidth() - IntSize.m3485getWidthimpl(receiver.m2796getMeasuredSizeYbymL2g())) - IntOffset.m3443getXimpl(j2), IntOffset.m3444getYimpl(j2));
            }
            long m2795getApparentToRealOffsetnOccac = receiver.m2795getApparentToRealOffsetnOccac();
            receiver.mo2759placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m3443getXimpl(j2) + IntOffset.m3443getXimpl(m2795getApparentToRealOffsetnOccac), IntOffset.m3444getYimpl(j2) + IntOffset.m3444getYimpl(m2795getApparentToRealOffsetnOccac)), f2, null);
        }

        public final void placeRelativeWithLayer(@NotNull Placeable placeable, int i2, int i3, float f2, @NotNull Function1<? super GraphicsLayerScope, Unit> layerBlock) {
            Intrinsics.checkNotNullParameter(placeable, "<this>");
            Intrinsics.checkNotNullParameter(layerBlock, "layerBlock");
            long IntOffset = IntOffsetKt.IntOffset(i2, i3);
            if (getParentLayoutDirection() != LayoutDirection.Ltr && getParentWidth() != 0) {
                IntOffset = IntOffsetKt.IntOffset((getParentWidth() - IntSize.m3485getWidthimpl(placeable.m2796getMeasuredSizeYbymL2g())) - IntOffset.m3443getXimpl(IntOffset), IntOffset.m3444getYimpl(IntOffset));
            }
            long m2795getApparentToRealOffsetnOccac = placeable.m2795getApparentToRealOffsetnOccac();
            placeable.mo2759placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m3443getXimpl(IntOffset) + IntOffset.m3443getXimpl(m2795getApparentToRealOffsetnOccac), IntOffset.m3444getYimpl(IntOffset) + IntOffset.m3444getYimpl(m2795getApparentToRealOffsetnOccac)), f2, layerBlock);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM  reason: not valid java name */
        public final void m2808placeRelativeWithLayeraW9wM(@NotNull Placeable receiver, long j2, float f2, @NotNull Function1<? super GraphicsLayerScope, Unit> layerBlock) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(layerBlock, "layerBlock");
            if (getParentLayoutDirection() != LayoutDirection.Ltr && getParentWidth() != 0) {
                j2 = IntOffsetKt.IntOffset((getParentWidth() - IntSize.m3485getWidthimpl(receiver.m2796getMeasuredSizeYbymL2g())) - IntOffset.m3443getXimpl(j2), IntOffset.m3444getYimpl(j2));
            }
            long m2795getApparentToRealOffsetnOccac = receiver.m2795getApparentToRealOffsetnOccac();
            receiver.mo2759placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m3443getXimpl(j2) + IntOffset.m3443getXimpl(m2795getApparentToRealOffsetnOccac), IntOffset.m3444getYimpl(j2) + IntOffset.m3444getYimpl(m2795getApparentToRealOffsetnOccac)), f2, layerBlock);
        }

        public final void placeWithLayer(@NotNull Placeable placeable, int i2, int i3, float f2, @NotNull Function1<? super GraphicsLayerScope, Unit> layerBlock) {
            Intrinsics.checkNotNullParameter(placeable, "<this>");
            Intrinsics.checkNotNullParameter(layerBlock, "layerBlock");
            long IntOffset = IntOffsetKt.IntOffset(i2, i3);
            long m2795getApparentToRealOffsetnOccac = placeable.m2795getApparentToRealOffsetnOccac();
            placeable.mo2759placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m3443getXimpl(IntOffset) + IntOffset.m3443getXimpl(m2795getApparentToRealOffsetnOccac), IntOffset.m3444getYimpl(IntOffset) + IntOffset.m3444getYimpl(m2795getApparentToRealOffsetnOccac)), f2, layerBlock);
        }

        /* renamed from: placeWithLayer-aW-9-wM  reason: not valid java name */
        public final void m2809placeWithLayeraW9wM(@NotNull Placeable receiver, long j2, float f2, @NotNull Function1<? super GraphicsLayerScope, Unit> layerBlock) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(layerBlock, "layerBlock");
            long m2795getApparentToRealOffsetnOccac = receiver.m2795getApparentToRealOffsetnOccac();
            receiver.mo2759placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m3443getXimpl(j2) + IntOffset.m3443getXimpl(m2795getApparentToRealOffsetnOccac), IntOffset.m3444getYimpl(j2) + IntOffset.m3444getYimpl(m2795getApparentToRealOffsetnOccac)), f2, layerBlock);
        }
    }

    private final void recalculateWidthAndHeight() {
        int coerceIn;
        int coerceIn2;
        coerceIn = RangesKt___RangesKt.coerceIn(IntSize.m3485getWidthimpl(m2796getMeasuredSizeYbymL2g()), Constraints.m3295getMinWidthimpl(m2797getMeasurementConstraintsmsEJaDk()), Constraints.m3293getMaxWidthimpl(m2797getMeasurementConstraintsmsEJaDk()));
        this.width = coerceIn;
        coerceIn2 = RangesKt___RangesKt.coerceIn(IntSize.m3484getHeightimpl(m2796getMeasuredSizeYbymL2g()), Constraints.m3294getMinHeightimpl(m2797getMeasurementConstraintsmsEJaDk()), Constraints.m3292getMaxHeightimpl(m2797getMeasurementConstraintsmsEJaDk()));
        this.height = coerceIn2;
    }

    /* renamed from: getApparentToRealOffset-nOcc-ac  reason: not valid java name */
    public final long m2795getApparentToRealOffsetnOccac() {
        return IntOffsetKt.IntOffset((this.width - IntSize.m3485getWidthimpl(m2796getMeasuredSizeYbymL2g())) / 2, (this.height - IntSize.m3484getHeightimpl(m2796getMeasuredSizeYbymL2g())) / 2);
    }

    public final int getHeight() {
        return this.height;
    }

    @Override // androidx.compose.ui.layout.Measured
    public int getMeasuredHeight() {
        return IntSize.m3484getHeightimpl(m2796getMeasuredSizeYbymL2g());
    }

    /* renamed from: getMeasuredSize-YbymL2g  reason: not valid java name */
    public final long m2796getMeasuredSizeYbymL2g() {
        return this.measuredSize;
    }

    @Override // androidx.compose.ui.layout.Measured
    public int getMeasuredWidth() {
        return IntSize.m3485getWidthimpl(m2796getMeasuredSizeYbymL2g());
    }

    /* renamed from: getMeasurementConstraints-msEJaDk  reason: not valid java name */
    public final long m2797getMeasurementConstraintsmsEJaDk() {
        return this.measurementConstraints;
    }

    public final int getWidth() {
        return this.width;
    }

    /* renamed from: placeAt-f8xVGno */
    public abstract void mo2759placeAtf8xVGno(long j2, float f2, @Nullable Function1<? super GraphicsLayerScope, Unit> function1);

    /* renamed from: setMeasuredSize-ozmzZPI  reason: not valid java name */
    public final void m2798setMeasuredSizeozmzZPI(long j2) {
        if (IntSize.m3483equalsimpl0(this.measuredSize, j2)) {
            return;
        }
        this.measuredSize = j2;
        recalculateWidthAndHeight();
    }

    /* renamed from: setMeasurementConstraints-BRTryo0  reason: not valid java name */
    public final void m2799setMeasurementConstraintsBRTryo0(long j2) {
        if (Constraints.m3286equalsimpl0(this.measurementConstraints, j2)) {
            return;
        }
        this.measurementConstraints = j2;
        recalculateWidthAndHeight();
    }
}
