package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J-\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0003\u001a\u00020\u0004X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\u0012\u0013\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/graphics/Brush;", "", "()V", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "J", "applyTo", "", "size", "p", "Landroidx/compose/ui/graphics/Paint;", "alpha", "", "applyTo-Pq9zytI", "(JLandroidx/compose/ui/graphics/Paint;F)V", "Companion", "Landroidx/compose/ui/graphics/SolidColor;", "Landroidx/compose/ui/graphics/ShaderBrush;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public abstract class Brush {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private final long intrinsicSize;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J_\u0010\u0003\u001a\u00020\u00042*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006\"\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJA\u0010\u0003\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u0012J_\u0010\u0013\u001a\u00020\u00042*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006\"\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018JA\u0010\u0013\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0019J_\u0010\u001a\u001a\u00020\u00042*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006\"\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00152\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJA\u0010\u001a\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u00152\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001fJK\u0010 \u001a\u00020\u00042*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006\"\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u0015H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"J-\u0010 \u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u0015H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010#J_\u0010$\u001a\u00020\u00042*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006\"\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010%\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010\u000fJA\u0010$\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\b\b\u0002\u0010%\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010\u0012\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Landroidx/compose/ui/graphics/Brush$Companion;", "", "()V", "horizontalGradient", "Landroidx/compose/ui/graphics/Brush;", "colorStops", "", "Lkotlin/Pair;", "", "Landroidx/compose/ui/graphics/Color;", "startX", "endX", "tileMode", "Landroidx/compose/ui/graphics/TileMode;", "horizontalGradient-8A-3gB4", "([Lkotlin/Pair;FFI)Landroidx/compose/ui/graphics/Brush;", "colors", "", "(Ljava/util/List;FFI)Landroidx/compose/ui/graphics/Brush;", "linearGradient", "start", "Landroidx/compose/ui/geometry/Offset;", "end", "linearGradient-mHitzGk", "([Lkotlin/Pair;JJI)Landroidx/compose/ui/graphics/Brush;", "(Ljava/util/List;JJI)Landroidx/compose/ui/graphics/Brush;", "radialGradient", "center", "radius", "radialGradient-P_Vx-Ks", "([Lkotlin/Pair;JFI)Landroidx/compose/ui/graphics/Brush;", "(Ljava/util/List;JFI)Landroidx/compose/ui/graphics/Brush;", "sweepGradient", "sweepGradient-Uv8p0NA", "([Lkotlin/Pair;J)Landroidx/compose/ui/graphics/Brush;", "(Ljava/util/List;J)Landroidx/compose/ui/graphics/Brush;", "verticalGradient", "startY", "endY", "verticalGradient-8A-3gB4", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: horizontalGradient-8A-3gB4$default  reason: not valid java name */
        public static /* synthetic */ Brush m1347horizontalGradient8A3gB4$default(Companion companion, List list, float f2, float f3, int i2, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                f2 = 0.0f;
            }
            if ((i3 & 4) != 0) {
                f3 = Float.POSITIVE_INFINITY;
            }
            if ((i3 & 8) != 0) {
                i2 = TileMode.Companion.m1689getClamp3opZhB0();
            }
            return companion.m1357horizontalGradient8A3gB4(list, f2, f3, i2);
        }

        /* renamed from: horizontalGradient-8A-3gB4$default  reason: not valid java name */
        public static /* synthetic */ Brush m1348horizontalGradient8A3gB4$default(Companion companion, Pair[] pairArr, float f2, float f3, int i2, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                f2 = 0.0f;
            }
            if ((i3 & 4) != 0) {
                f3 = Float.POSITIVE_INFINITY;
            }
            if ((i3 & 8) != 0) {
                i2 = TileMode.Companion.m1689getClamp3opZhB0();
            }
            return companion.m1358horizontalGradient8A3gB4(pairArr, f2, f3, i2);
        }

        /* renamed from: linearGradient-mHitzGk$default  reason: not valid java name */
        public static /* synthetic */ Brush m1349linearGradientmHitzGk$default(Companion companion, List list, long j2, long j3, int i2, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                j2 = Offset.Companion.m1177getZeroF1C5BW0();
            }
            long j4 = j2;
            if ((i3 & 4) != 0) {
                j3 = Offset.Companion.m1175getInfiniteF1C5BW0();
            }
            long j5 = j3;
            if ((i3 & 8) != 0) {
                i2 = TileMode.Companion.m1689getClamp3opZhB0();
            }
            return companion.m1359linearGradientmHitzGk(list, j4, j5, i2);
        }

        /* renamed from: linearGradient-mHitzGk$default  reason: not valid java name */
        public static /* synthetic */ Brush m1350linearGradientmHitzGk$default(Companion companion, Pair[] pairArr, long j2, long j3, int i2, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                j2 = Offset.Companion.m1177getZeroF1C5BW0();
            }
            long j4 = j2;
            if ((i3 & 4) != 0) {
                j3 = Offset.Companion.m1175getInfiniteF1C5BW0();
            }
            long j5 = j3;
            if ((i3 & 8) != 0) {
                i2 = TileMode.Companion.m1689getClamp3opZhB0();
            }
            return companion.m1360linearGradientmHitzGk(pairArr, j4, j5, i2);
        }

        /* renamed from: radialGradient-P_Vx-Ks$default  reason: not valid java name */
        public static /* synthetic */ Brush m1351radialGradientP_VxKs$default(Companion companion, List list, long j2, float f2, int i2, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                j2 = Offset.Companion.m1176getUnspecifiedF1C5BW0();
            }
            long j3 = j2;
            if ((i3 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            float f3 = f2;
            if ((i3 & 8) != 0) {
                i2 = TileMode.Companion.m1689getClamp3opZhB0();
            }
            return companion.m1361radialGradientP_VxKs(list, j3, f3, i2);
        }

        /* renamed from: radialGradient-P_Vx-Ks$default  reason: not valid java name */
        public static /* synthetic */ Brush m1352radialGradientP_VxKs$default(Companion companion, Pair[] pairArr, long j2, float f2, int i2, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                j2 = Offset.Companion.m1176getUnspecifiedF1C5BW0();
            }
            long j3 = j2;
            if ((i3 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            float f3 = f2;
            if ((i3 & 8) != 0) {
                i2 = TileMode.Companion.m1689getClamp3opZhB0();
            }
            return companion.m1362radialGradientP_VxKs(pairArr, j3, f3, i2);
        }

        /* renamed from: sweepGradient-Uv8p0NA$default  reason: not valid java name */
        public static /* synthetic */ Brush m1353sweepGradientUv8p0NA$default(Companion companion, List list, long j2, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                j2 = Offset.Companion.m1176getUnspecifiedF1C5BW0();
            }
            return companion.m1363sweepGradientUv8p0NA(list, j2);
        }

        /* renamed from: sweepGradient-Uv8p0NA$default  reason: not valid java name */
        public static /* synthetic */ Brush m1354sweepGradientUv8p0NA$default(Companion companion, Pair[] pairArr, long j2, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                j2 = Offset.Companion.m1176getUnspecifiedF1C5BW0();
            }
            return companion.m1364sweepGradientUv8p0NA(pairArr, j2);
        }

        /* renamed from: verticalGradient-8A-3gB4$default  reason: not valid java name */
        public static /* synthetic */ Brush m1355verticalGradient8A3gB4$default(Companion companion, List list, float f2, float f3, int i2, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                f2 = 0.0f;
            }
            if ((i3 & 4) != 0) {
                f3 = Float.POSITIVE_INFINITY;
            }
            if ((i3 & 8) != 0) {
                i2 = TileMode.Companion.m1689getClamp3opZhB0();
            }
            return companion.m1365verticalGradient8A3gB4(list, f2, f3, i2);
        }

        /* renamed from: verticalGradient-8A-3gB4$default  reason: not valid java name */
        public static /* synthetic */ Brush m1356verticalGradient8A3gB4$default(Companion companion, Pair[] pairArr, float f2, float f3, int i2, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                f2 = 0.0f;
            }
            if ((i3 & 4) != 0) {
                f3 = Float.POSITIVE_INFINITY;
            }
            if ((i3 & 8) != 0) {
                i2 = TileMode.Companion.m1689getClamp3opZhB0();
            }
            return companion.m1366verticalGradient8A3gB4(pairArr, f2, f3, i2);
        }

        @Stable
        @NotNull
        /* renamed from: horizontalGradient-8A-3gB4  reason: not valid java name */
        public final Brush m1357horizontalGradient8A3gB4(@NotNull List<Color> colors, float f2, float f3, int i2) {
            Intrinsics.checkNotNullParameter(colors, "colors");
            return m1359linearGradientmHitzGk(colors, OffsetKt.Offset(f2, 0.0f), OffsetKt.Offset(f3, 0.0f), i2);
        }

        @Stable
        @NotNull
        /* renamed from: horizontalGradient-8A-3gB4  reason: not valid java name */
        public final Brush m1358horizontalGradient8A3gB4(@NotNull Pair<Float, Color>[] colorStops, float f2, float f3, int i2) {
            Intrinsics.checkNotNullParameter(colorStops, "colorStops");
            return m1360linearGradientmHitzGk((Pair[]) Arrays.copyOf(colorStops, colorStops.length), OffsetKt.Offset(f2, 0.0f), OffsetKt.Offset(f3, 0.0f), i2);
        }

        @Stable
        @NotNull
        /* renamed from: linearGradient-mHitzGk  reason: not valid java name */
        public final Brush m1359linearGradientmHitzGk(@NotNull List<Color> colors, long j2, long j3, int i2) {
            Intrinsics.checkNotNullParameter(colors, "colors");
            return new LinearGradient(colors, null, j2, j3, i2, null);
        }

        @Stable
        @NotNull
        /* renamed from: linearGradient-mHitzGk  reason: not valid java name */
        public final Brush m1360linearGradientmHitzGk(@NotNull Pair<Float, Color>[] colorStops, long j2, long j3, int i2) {
            Intrinsics.checkNotNullParameter(colorStops, "colorStops");
            ArrayList arrayList = new ArrayList(colorStops.length);
            for (Pair<Float, Color> pair : colorStops) {
                arrayList.add(Color.m1382boximpl(pair.getSecond().m1402unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(colorStops.length);
            for (Pair<Float, Color> pair2 : colorStops) {
                arrayList2.add(Float.valueOf(pair2.getFirst().floatValue()));
            }
            return new LinearGradient(arrayList, arrayList2, j2, j3, i2, null);
        }

        @Stable
        @NotNull
        /* renamed from: radialGradient-P_Vx-Ks  reason: not valid java name */
        public final Brush m1361radialGradientP_VxKs(@NotNull List<Color> colors, long j2, float f2, int i2) {
            Intrinsics.checkNotNullParameter(colors, "colors");
            return new RadialGradient(colors, null, j2, f2, i2, null);
        }

        @Stable
        @NotNull
        /* renamed from: radialGradient-P_Vx-Ks  reason: not valid java name */
        public final Brush m1362radialGradientP_VxKs(@NotNull Pair<Float, Color>[] colorStops, long j2, float f2, int i2) {
            Intrinsics.checkNotNullParameter(colorStops, "colorStops");
            ArrayList arrayList = new ArrayList(colorStops.length);
            for (Pair<Float, Color> pair : colorStops) {
                arrayList.add(Color.m1382boximpl(pair.getSecond().m1402unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(colorStops.length);
            for (Pair<Float, Color> pair2 : colorStops) {
                arrayList2.add(Float.valueOf(pair2.getFirst().floatValue()));
            }
            return new RadialGradient(arrayList, arrayList2, j2, f2, i2, null);
        }

        @Stable
        @NotNull
        /* renamed from: sweepGradient-Uv8p0NA  reason: not valid java name */
        public final Brush m1363sweepGradientUv8p0NA(@NotNull List<Color> colors, long j2) {
            Intrinsics.checkNotNullParameter(colors, "colors");
            return new SweepGradient(j2, colors, null, null);
        }

        @Stable
        @NotNull
        /* renamed from: sweepGradient-Uv8p0NA  reason: not valid java name */
        public final Brush m1364sweepGradientUv8p0NA(@NotNull Pair<Float, Color>[] colorStops, long j2) {
            Intrinsics.checkNotNullParameter(colorStops, "colorStops");
            ArrayList arrayList = new ArrayList(colorStops.length);
            for (Pair<Float, Color> pair : colorStops) {
                arrayList.add(Color.m1382boximpl(pair.getSecond().m1402unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(colorStops.length);
            for (Pair<Float, Color> pair2 : colorStops) {
                arrayList2.add(Float.valueOf(pair2.getFirst().floatValue()));
            }
            return new SweepGradient(j2, arrayList, arrayList2, null);
        }

        @Stable
        @NotNull
        /* renamed from: verticalGradient-8A-3gB4  reason: not valid java name */
        public final Brush m1365verticalGradient8A3gB4(@NotNull List<Color> colors, float f2, float f3, int i2) {
            Intrinsics.checkNotNullParameter(colors, "colors");
            return m1359linearGradientmHitzGk(colors, OffsetKt.Offset(0.0f, f2), OffsetKt.Offset(0.0f, f3), i2);
        }

        @Stable
        @NotNull
        /* renamed from: verticalGradient-8A-3gB4  reason: not valid java name */
        public final Brush m1366verticalGradient8A3gB4(@NotNull Pair<Float, Color>[] colorStops, float f2, float f3, int i2) {
            Intrinsics.checkNotNullParameter(colorStops, "colorStops");
            return m1360linearGradientmHitzGk((Pair[]) Arrays.copyOf(colorStops, colorStops.length), OffsetKt.Offset(0.0f, f2), OffsetKt.Offset(0.0f, f3), i2);
        }
    }

    private Brush() {
        this.intrinsicSize = Size.Companion.m1238getUnspecifiedNHjbRc();
    }

    public /* synthetic */ Brush(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: applyTo-Pq9zytI  reason: not valid java name */
    public abstract void mo1345applyToPq9zytI(long j2, @NotNull Paint paint, float f2);

    /* renamed from: getIntrinsicSize-NH-jbRc  reason: not valid java name */
    public long mo1346getIntrinsicSizeNHjbRc() {
        return this.intrinsicSize;
    }
}
