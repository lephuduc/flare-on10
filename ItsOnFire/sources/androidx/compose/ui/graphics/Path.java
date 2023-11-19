package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0015\bf\u0018\u0000 J2\u00020\u0001:\u0001JJ \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H&J \u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H&J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J'\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u001aH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u000fH&J\u0010\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020!H&J(\u0010\"\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\tH&J(\u0010$\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\tH\u0016J\b\u0010%\u001a\u00020\rH&J8\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u0011H&J\b\u0010-\u001a\u00020\u000fH&J\u0018\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\u00112\u0006\u00100\u001a\u00020\u0011H&J\u0018\u00101\u001a\u00020\r2\u0006\u0010/\u001a\u00020\u00112\u0006\u00100\u001a\u00020\u0011H&J-\u00102\u001a\u00020\t2\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u000206H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b7\u00108J(\u00109\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\u0011H&J8\u0010:\u001a\u00020\r2\u0006\u0010;\u001a\u00020\u00112\u0006\u0010<\u001a\u00020\u00112\u0006\u0010=\u001a\u00020\u00112\u0006\u0010>\u001a\u00020\u00112\u0006\u0010?\u001a\u00020\u00112\u0006\u0010@\u001a\u00020\u0011H&J\u0018\u0010A\u001a\u00020\r2\u0006\u0010B\u001a\u00020\u00112\u0006\u0010C\u001a\u00020\u0011H&J\u0018\u0010D\u001a\u00020\r2\u0006\u0010B\u001a\u00020\u00112\u0006\u0010C\u001a\u00020\u0011H&J(\u0010E\u001a\u00020\r2\u0006\u0010;\u001a\u00020\u00112\u0006\u0010<\u001a\u00020\u00112\u0006\u0010=\u001a\u00020\u00112\u0006\u0010>\u001a\u00020\u0011H&J\b\u0010F\u001a\u00020\rH&J\u001d\u0010G\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bH\u0010IR!\u0010\u0002\u001a\u00020\u0003X¦\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0012\u0010\u000b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\n\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006K"}, d2 = {"Landroidx/compose/ui/graphics/Path;", "", "fillType", "Landroidx/compose/ui/graphics/PathFillType;", "getFillType-Rg-k1Os", "()I", "setFillType-oQ8Xj4U", "(I)V", "isConvex", "", "()Z", "isEmpty", "addArc", "", "oval", "Landroidx/compose/ui/geometry/Rect;", "startAngleDegrees", "", "sweepAngleDegrees", "addArcRad", "startAngleRadians", "sweepAngleRadians", "addOval", "addPath", "path", "offset", "Landroidx/compose/ui/geometry/Offset;", "addPath-Uv8p0NA", "(Landroidx/compose/ui/graphics/Path;J)V", "addRect", "rect", "addRoundRect", "roundRect", "Landroidx/compose/ui/geometry/RoundRect;", "arcTo", "forceMoveTo", "arcToRad", "close", "cubicTo", "x1", "y1", "x2", "y2", "x3", "y3", "getBounds", "lineTo", "x", "y", "moveTo", "op", "path1", "path2", "operation", "Landroidx/compose/ui/graphics/PathOperation;", "op-N5in7k0", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;I)Z", "quadraticBezierTo", "relativeCubicTo", "dx1", "dy1", "dx2", "dy2", "dx3", "dy3", "relativeLineTo", "dx", "dy", "relativeMoveTo", "relativeQuadraticBezierTo", "reset", "translate", "translate-k-4lQ0M", "(J)V", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public interface Path {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J+\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/graphics/Path$Companion;", "", "()V", "combine", "Landroidx/compose/ui/graphics/Path;", "operation", "Landroidx/compose/ui/graphics/PathOperation;", "path1", "path2", "combine-xh6zSI8", "(ILandroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        /* renamed from: combine-xh6zSI8  reason: not valid java name */
        public final Path m1598combinexh6zSI8(int i2, @NotNull Path path1, @NotNull Path path2) {
            Intrinsics.checkNotNullParameter(path1, "path1");
            Intrinsics.checkNotNullParameter(path2, "path2");
            Path Path = AndroidPath_androidKt.Path();
            if (Path.mo1295opN5in7k0(path1, path2, i2)) {
                return Path;
            }
            throw new IllegalArgumentException("Path.combine() failed.  This may be due an invalid path; in particular, check for NaN values.");
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        /* renamed from: addPath-Uv8p0NA$default  reason: not valid java name */
        public static /* synthetic */ void m1599addPathUv8p0NA$default(Path path, Path path2, long j2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
            }
            if ((i2 & 2) != 0) {
                j2 = Offset.Companion.m1177getZeroF1C5BW0();
            }
            path.mo1293addPathUv8p0NA(path2, j2);
        }

        public static void arcToRad(@NotNull Path path, @NotNull Rect rect, float f2, float f3, boolean z) {
            Intrinsics.checkNotNullParameter(path, "this");
            Intrinsics.checkNotNullParameter(rect, "rect");
            path.arcTo(rect, DegreesKt.degrees(f2), DegreesKt.degrees(f3), z);
        }
    }

    void addArc(@NotNull Rect rect, float f2, float f3);

    void addArcRad(@NotNull Rect rect, float f2, float f3);

    void addOval(@NotNull Rect rect);

    /* renamed from: addPath-Uv8p0NA */
    void mo1293addPathUv8p0NA(@NotNull Path path, long j2);

    void addRect(@NotNull Rect rect);

    void addRoundRect(@NotNull RoundRect roundRect);

    void arcTo(@NotNull Rect rect, float f2, float f3, boolean z);

    void arcToRad(@NotNull Rect rect, float f2, float f3, boolean z);

    void close();

    void cubicTo(float f2, float f3, float f4, float f5, float f6, float f7);

    @NotNull
    Rect getBounds();

    /* renamed from: getFillType-Rg-k1Os */
    int mo1294getFillTypeRgk1Os();

    boolean isConvex();

    boolean isEmpty();

    void lineTo(float f2, float f3);

    void moveTo(float f2, float f3);

    /* renamed from: op-N5in7k0 */
    boolean mo1295opN5in7k0(@NotNull Path path, @NotNull Path path2, int i2);

    void quadraticBezierTo(float f2, float f3, float f4, float f5);

    void relativeCubicTo(float f2, float f3, float f4, float f5, float f6, float f7);

    void relativeLineTo(float f2, float f3);

    void relativeMoveTo(float f2, float f3);

    void relativeQuadraticBezierTo(float f2, float f3, float f4, float f5);

    void reset();

    /* renamed from: setFillType-oQ8Xj4U */
    void mo1296setFillTypeoQ8Xj4U(int i2);

    /* renamed from: translate-k-4lQ0M */
    void mo1297translatek4lQ0M(long j2);
}
