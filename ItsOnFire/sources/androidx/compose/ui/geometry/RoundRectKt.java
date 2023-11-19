package androidx.compose.ui.geometry;

import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0019\u001a#\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001cø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001aC\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001c2\b\b\u0002\u0010 \u001a\u00020\u001c2\b\b\u0002\u0010!\u001a\u00020\u001c2\b\b\u0002\u0010\"\u001a\u00020\u001cø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$\u001a\u001e\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0012\u001a;\u0010\u0019\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,\u001a6\u0010\u0019\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0012\u001a\u001e\u0010-\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u0012\u001a\u001f\u00101\u001a\u00020\u0002*\u00020\u00022\u0006\u00102\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00028Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0015\u0010\t\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000b\"\u0015\u0010\f\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000b\"\u0015\u0010\r\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b\"\u0015\u0010\u000e\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000b\"\u0015\u0010\u000f\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000b\"\u0015\u0010\u0010\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000b\"\u0015\u0010\u0011\u001a\u00020\u0012*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u0015\u0010\u0015\u001a\u00020\u0012*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014\"\u0015\u0010\u0017\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0004\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"boundingRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/geometry/RoundRect;", "getBoundingRect", "(Landroidx/compose/ui/geometry/RoundRect;)Landroidx/compose/ui/geometry/Rect;", "center", "Landroidx/compose/ui/geometry/Offset;", "getCenter", "(Landroidx/compose/ui/geometry/RoundRect;)J", "isCircle", "", "(Landroidx/compose/ui/geometry/RoundRect;)Z", "isEllipse", "isEmpty", "isFinite", "isRect", "isSimple", "maxDimension", "", "getMaxDimension", "(Landroidx/compose/ui/geometry/RoundRect;)F", "minDimension", "getMinDimension", "safeInnerRect", "getSafeInnerRect", "RoundRect", "rect", "cornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "RoundRect-sniSvfs", "(Landroidx/compose/ui/geometry/Rect;J)Landroidx/compose/ui/geometry/RoundRect;", "topLeft", "topRight", "bottomRight", "bottomLeft", "RoundRect-ZAM2FJo", "(Landroidx/compose/ui/geometry/Rect;JJJJ)Landroidx/compose/ui/geometry/RoundRect;", "radiusX", "radiusY", "left", "top", "right", "bottom", "RoundRect-gG7oq9Y", "(FFFFJ)Landroidx/compose/ui/geometry/RoundRect;", "lerp", "start", "stop", "fraction", "translate", "offset", "translate-Uv8p0NA", "(Landroidx/compose/ui/geometry/RoundRect;J)Landroidx/compose/ui/geometry/RoundRect;", "ui-geometry_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class RoundRectKt {
    @NotNull
    public static final RoundRect RoundRect(float f2, float f3, float f4, float f5, float f6, float f7) {
        long CornerRadius = CornerRadiusKt.CornerRadius(f6, f7);
        return new RoundRect(f2, f3, f4, f5, CornerRadius, CornerRadius, CornerRadius, CornerRadius, null);
    }

    @NotNull
    public static final RoundRect RoundRect(@NotNull Rect rect, float f2, float f3) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f2, f3);
    }

    @NotNull
    /* renamed from: RoundRect-ZAM2FJo  reason: not valid java name */
    public static final RoundRect m1213RoundRectZAM2FJo(@NotNull Rect rect, long j2, long j3, long j4, long j5) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return new RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), j2, j3, j4, j5, null);
    }

    @NotNull
    /* renamed from: RoundRect-gG7oq9Y  reason: not valid java name */
    public static final RoundRect m1215RoundRectgG7oq9Y(float f2, float f3, float f4, float f5, long j2) {
        return RoundRect(f2, f3, f4, f5, CornerRadius.m1136getXimpl(j2), CornerRadius.m1137getYimpl(j2));
    }

    @NotNull
    /* renamed from: RoundRect-sniSvfs  reason: not valid java name */
    public static final RoundRect m1216RoundRectsniSvfs(@NotNull Rect rect, long j2) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return RoundRect(rect, CornerRadius.m1136getXimpl(j2), CornerRadius.m1137getYimpl(j2));
    }

    @NotNull
    public static final Rect getBoundingRect(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return new Rect(roundRect.getLeft(), roundRect.getTop(), roundRect.getRight(), roundRect.getBottom());
    }

    public static final long getCenter(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return OffsetKt.Offset(roundRect.getLeft() + (roundRect.getWidth() / 2.0f), roundRect.getTop() + (roundRect.getHeight() / 2.0f));
    }

    public static final float getMaxDimension(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return Math.max(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    public static final float getMinDimension(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return Math.min(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    @NotNull
    public static final Rect getSafeInnerRect(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return new Rect(roundRect.getLeft() + (Math.max(CornerRadius.m1136getXimpl(roundRect.m1209getBottomLeftCornerRadiuskKHJgLs()), CornerRadius.m1136getXimpl(roundRect.m1211getTopLeftCornerRadiuskKHJgLs())) * 0.29289323f), roundRect.getTop() + (Math.max(CornerRadius.m1137getYimpl(roundRect.m1211getTopLeftCornerRadiuskKHJgLs()), CornerRadius.m1137getYimpl(roundRect.m1212getTopRightCornerRadiuskKHJgLs())) * 0.29289323f), roundRect.getRight() - (Math.max(CornerRadius.m1136getXimpl(roundRect.m1212getTopRightCornerRadiuskKHJgLs()), CornerRadius.m1136getXimpl(roundRect.m1210getBottomRightCornerRadiuskKHJgLs())) * 0.29289323f), roundRect.getBottom() - (Math.max(CornerRadius.m1137getYimpl(roundRect.m1210getBottomRightCornerRadiuskKHJgLs()), CornerRadius.m1137getYimpl(roundRect.m1209getBottomLeftCornerRadiuskKHJgLs())) * 0.29289323f));
    }

    public static final boolean isCircle(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return ((roundRect.getWidth() > roundRect.getHeight() ? 1 : (roundRect.getWidth() == roundRect.getHeight() ? 0 : -1)) == 0) && isEllipse(roundRect);
    }

    public static final boolean isEllipse(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        if (CornerRadius.m1136getXimpl(roundRect.m1211getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m1136getXimpl(roundRect.m1212getTopRightCornerRadiuskKHJgLs())) {
            if (CornerRadius.m1137getYimpl(roundRect.m1211getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m1137getYimpl(roundRect.m1212getTopRightCornerRadiuskKHJgLs())) {
                if (CornerRadius.m1136getXimpl(roundRect.m1212getTopRightCornerRadiuskKHJgLs()) == CornerRadius.m1136getXimpl(roundRect.m1210getBottomRightCornerRadiuskKHJgLs())) {
                    if (CornerRadius.m1137getYimpl(roundRect.m1212getTopRightCornerRadiuskKHJgLs()) == CornerRadius.m1137getYimpl(roundRect.m1210getBottomRightCornerRadiuskKHJgLs())) {
                        if (CornerRadius.m1136getXimpl(roundRect.m1210getBottomRightCornerRadiuskKHJgLs()) == CornerRadius.m1136getXimpl(roundRect.m1209getBottomLeftCornerRadiuskKHJgLs())) {
                            if ((CornerRadius.m1137getYimpl(roundRect.m1210getBottomRightCornerRadiuskKHJgLs()) == CornerRadius.m1137getYimpl(roundRect.m1209getBottomLeftCornerRadiuskKHJgLs())) && roundRect.getWidth() <= CornerRadius.m1136getXimpl(roundRect.m1211getTopLeftCornerRadiuskKHJgLs()) * 2.0d && roundRect.getHeight() <= CornerRadius.m1137getYimpl(roundRect.m1211getTopLeftCornerRadiuskKHJgLs()) * 2.0d) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean isEmpty(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return roundRect.getLeft() >= roundRect.getRight() || roundRect.getTop() >= roundRect.getBottom();
    }

    public static final boolean isFinite(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        float left = roundRect.getLeft();
        if ((Float.isInfinite(left) || Float.isNaN(left)) ? false : true) {
            float top = roundRect.getTop();
            if ((Float.isInfinite(top) || Float.isNaN(top)) ? false : true) {
                float right = roundRect.getRight();
                if ((Float.isInfinite(right) || Float.isNaN(right)) ? false : true) {
                    float bottom = roundRect.getBottom();
                    if ((Float.isInfinite(bottom) || Float.isNaN(bottom)) ? false : true) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
        if ((androidx.compose.ui.geometry.CornerRadius.m1137getYimpl(r6.m1211getTopLeftCornerRadiuskKHJgLs()) == 0.0f) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
        if ((androidx.compose.ui.geometry.CornerRadius.m1137getYimpl(r6.m1212getTopRightCornerRadiuskKHJgLs()) == 0.0f) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
        if ((androidx.compose.ui.geometry.CornerRadius.m1137getYimpl(r6.m1209getBottomLeftCornerRadiuskKHJgLs()) == 0.0f) != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean isRect(@org.jetbrains.annotations.NotNull androidx.compose.ui.geometry.RoundRect r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            long r0 = r6.m1211getTopLeftCornerRadiuskKHJgLs()
            float r0 = androidx.compose.ui.geometry.CornerRadius.m1136getXimpl(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L16
            r0 = r2
            goto L17
        L16:
            r0 = r3
        L17:
            if (r0 != 0) goto L2a
            long r4 = r6.m1211getTopLeftCornerRadiuskKHJgLs()
            float r0 = androidx.compose.ui.geometry.CornerRadius.m1137getYimpl(r4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L27
            r0 = r2
            goto L28
        L27:
            r0 = r3
        L28:
            if (r0 == 0) goto L91
        L2a:
            long r4 = r6.m1212getTopRightCornerRadiuskKHJgLs()
            float r0 = androidx.compose.ui.geometry.CornerRadius.m1136getXimpl(r4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L38
            r0 = r2
            goto L39
        L38:
            r0 = r3
        L39:
            if (r0 != 0) goto L4c
            long r4 = r6.m1212getTopRightCornerRadiuskKHJgLs()
            float r0 = androidx.compose.ui.geometry.CornerRadius.m1137getYimpl(r4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L49
            r0 = r2
            goto L4a
        L49:
            r0 = r3
        L4a:
            if (r0 == 0) goto L91
        L4c:
            long r4 = r6.m1209getBottomLeftCornerRadiuskKHJgLs()
            float r0 = androidx.compose.ui.geometry.CornerRadius.m1136getXimpl(r4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L5a
            r0 = r2
            goto L5b
        L5a:
            r0 = r3
        L5b:
            if (r0 != 0) goto L6e
            long r4 = r6.m1209getBottomLeftCornerRadiuskKHJgLs()
            float r0 = androidx.compose.ui.geometry.CornerRadius.m1137getYimpl(r4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L6b
            r0 = r2
            goto L6c
        L6b:
            r0 = r3
        L6c:
            if (r0 == 0) goto L91
        L6e:
            long r4 = r6.m1210getBottomRightCornerRadiuskKHJgLs()
            float r0 = androidx.compose.ui.geometry.CornerRadius.m1136getXimpl(r4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L7c
            r0 = r2
            goto L7d
        L7c:
            r0 = r3
        L7d:
            if (r0 != 0) goto L92
            long r4 = r6.m1210getBottomRightCornerRadiuskKHJgLs()
            float r6 = androidx.compose.ui.geometry.CornerRadius.m1137getYimpl(r4)
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 != 0) goto L8d
            r6 = r2
            goto L8e
        L8d:
            r6 = r3
        L8e:
            if (r6 == 0) goto L91
            goto L92
        L91:
            r2 = r3
        L92:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.geometry.RoundRectKt.isRect(androidx.compose.ui.geometry.RoundRect):boolean");
    }

    public static final boolean isSimple(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        if (CornerRadius.m1136getXimpl(roundRect.m1211getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m1137getYimpl(roundRect.m1211getTopLeftCornerRadiuskKHJgLs())) {
            if (CornerRadius.m1136getXimpl(roundRect.m1211getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m1136getXimpl(roundRect.m1212getTopRightCornerRadiuskKHJgLs())) {
                if (CornerRadius.m1136getXimpl(roundRect.m1211getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m1137getYimpl(roundRect.m1212getTopRightCornerRadiuskKHJgLs())) {
                    if (CornerRadius.m1136getXimpl(roundRect.m1211getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m1136getXimpl(roundRect.m1210getBottomRightCornerRadiuskKHJgLs())) {
                        if (CornerRadius.m1136getXimpl(roundRect.m1211getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m1137getYimpl(roundRect.m1210getBottomRightCornerRadiuskKHJgLs())) {
                            if (CornerRadius.m1136getXimpl(roundRect.m1211getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m1136getXimpl(roundRect.m1209getBottomLeftCornerRadiuskKHJgLs())) {
                                if (CornerRadius.m1136getXimpl(roundRect.m1211getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m1137getYimpl(roundRect.m1209getBottomLeftCornerRadiuskKHJgLs())) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @NotNull
    public static final RoundRect lerp(@NotNull RoundRect start, @NotNull RoundRect stop, float f2) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        return new RoundRect(MathHelpersKt.lerp(start.getLeft(), stop.getLeft(), f2), MathHelpersKt.lerp(start.getTop(), stop.getTop(), f2), MathHelpersKt.lerp(start.getRight(), stop.getRight(), f2), MathHelpersKt.lerp(start.getBottom(), stop.getBottom(), f2), CornerRadiusKt.m1147lerp3Ry4LBc(start.m1211getTopLeftCornerRadiuskKHJgLs(), stop.m1211getTopLeftCornerRadiuskKHJgLs(), f2), CornerRadiusKt.m1147lerp3Ry4LBc(start.m1212getTopRightCornerRadiuskKHJgLs(), stop.m1212getTopRightCornerRadiuskKHJgLs(), f2), CornerRadiusKt.m1147lerp3Ry4LBc(start.m1210getBottomRightCornerRadiuskKHJgLs(), stop.m1210getBottomRightCornerRadiuskKHJgLs(), f2), CornerRadiusKt.m1147lerp3Ry4LBc(start.m1209getBottomLeftCornerRadiuskKHJgLs(), stop.m1209getBottomLeftCornerRadiuskKHJgLs(), f2), null);
    }

    @NotNull
    /* renamed from: translate-Uv8p0NA  reason: not valid java name */
    public static final RoundRect m1217translateUv8p0NA(@NotNull RoundRect translate, long j2) {
        Intrinsics.checkNotNullParameter(translate, "$this$translate");
        return new RoundRect(translate.getLeft() + Offset.m1161getXimpl(j2), translate.getTop() + Offset.m1162getYimpl(j2), translate.getRight() + Offset.m1161getXimpl(j2), translate.getBottom() + Offset.m1162getYimpl(j2), translate.m1211getTopLeftCornerRadiuskKHJgLs(), translate.m1212getTopRightCornerRadiuskKHJgLs(), translate.m1210getBottomRightCornerRadiuskKHJgLs(), translate.m1209getBottomLeftCornerRadiuskKHJgLs(), null);
    }
}
