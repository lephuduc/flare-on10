package androidx.compose.ui.graphics.vector;

import androidx.appcompat.R;
import androidx.compose.ui.graphics.vector.PathNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J>\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nJ>\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nJ\u0006\u0010\u0017\u001a\u00020\u0000J6\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nJ6\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\nJ\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050#J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\nJ\u000e\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\nJ\u0016\u0010(\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\n2\u0006\u0010)\u001a\u00020\nJ\u0016\u0010*\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\n2\u0006\u0010+\u001a\u00020\nJ\u0016\u0010,\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\n2\u0006\u0010)\u001a\u00020\nJ\u0016\u0010-\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\n2\u0006\u0010+\u001a\u00020\nJ&\u0010.\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nJ&\u0010/\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nJ&\u00100\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nJ&\u00101\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nJ\u0016\u00102\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nJ\u0016\u00103\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nJ\u000e\u00104\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\nJ\u000e\u00105\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\nR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathBuilder;", "", "()V", "nodes", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "addNode", "node", "arcTo", "horizontalEllipseRadius", "", "verticalEllipseRadius", "theta", "isMoreThanHalf", "", "isPositiveArc", "x1", "y1", "arcToRelative", "a", "b", "dx1", "dy1", "close", "curveTo", "x2", "y2", "x3", "y3", "curveToRelative", "dx2", "dy2", "dx3", "dy3", "getNodes", "", "horizontalLineTo", "x", "horizontalLineToRelative", "dx", "lineTo", "y", "lineToRelative", "dy", "moveTo", "moveToRelative", "quadTo", "quadToRelative", "reflectiveCurveTo", "reflectiveCurveToRelative", "reflectiveQuadTo", "reflectiveQuadToRelative", "verticalLineTo", "verticalLineToRelative", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class PathBuilder {
    @NotNull
    private final List<PathNode> nodes = new ArrayList();

    private final PathBuilder addNode(PathNode pathNode) {
        this.nodes.add(pathNode);
        return this;
    }

    @NotNull
    public final PathBuilder arcTo(float f2, float f3, float f4, boolean z, boolean z2, float f5, float f6) {
        return addNode(new PathNode.ArcTo(f2, f3, f4, z, z2, f5, f6));
    }

    @NotNull
    public final PathBuilder arcToRelative(float f2, float f3, float f4, boolean z, boolean z2, float f5, float f6) {
        return addNode(new PathNode.RelativeArcTo(f2, f3, f4, z, z2, f5, f6));
    }

    @NotNull
    public final PathBuilder close() {
        return addNode(PathNode.Close.INSTANCE);
    }

    @NotNull
    public final PathBuilder curveTo(float f2, float f3, float f4, float f5, float f6, float f7) {
        return addNode(new PathNode.CurveTo(f2, f3, f4, f5, f6, f7));
    }

    @NotNull
    public final PathBuilder curveToRelative(float f2, float f3, float f4, float f5, float f6, float f7) {
        return addNode(new PathNode.RelativeCurveTo(f2, f3, f4, f5, f6, f7));
    }

    @NotNull
    public final List<PathNode> getNodes() {
        return this.nodes;
    }

    @NotNull
    public final PathBuilder horizontalLineTo(float f2) {
        return addNode(new PathNode.HorizontalTo(f2));
    }

    @NotNull
    public final PathBuilder horizontalLineToRelative(float f2) {
        return addNode(new PathNode.RelativeHorizontalTo(f2));
    }

    @NotNull
    public final PathBuilder lineTo(float f2, float f3) {
        return addNode(new PathNode.LineTo(f2, f3));
    }

    @NotNull
    public final PathBuilder lineToRelative(float f2, float f3) {
        return addNode(new PathNode.RelativeLineTo(f2, f3));
    }

    @NotNull
    public final PathBuilder moveTo(float f2, float f3) {
        return addNode(new PathNode.MoveTo(f2, f3));
    }

    @NotNull
    public final PathBuilder moveToRelative(float f2, float f3) {
        return addNode(new PathNode.RelativeMoveTo(f2, f3));
    }

    @NotNull
    public final PathBuilder quadTo(float f2, float f3, float f4, float f5) {
        return addNode(new PathNode.QuadTo(f2, f3, f4, f5));
    }

    @NotNull
    public final PathBuilder quadToRelative(float f2, float f3, float f4, float f5) {
        return addNode(new PathNode.RelativeQuadTo(f2, f3, f4, f5));
    }

    @NotNull
    public final PathBuilder reflectiveCurveTo(float f2, float f3, float f4, float f5) {
        return addNode(new PathNode.ReflectiveCurveTo(f2, f3, f4, f5));
    }

    @NotNull
    public final PathBuilder reflectiveCurveToRelative(float f2, float f3, float f4, float f5) {
        return addNode(new PathNode.RelativeReflectiveCurveTo(f2, f3, f4, f5));
    }

    @NotNull
    public final PathBuilder reflectiveQuadTo(float f2, float f3) {
        return addNode(new PathNode.ReflectiveQuadTo(f2, f3));
    }

    @NotNull
    public final PathBuilder reflectiveQuadToRelative(float f2, float f3) {
        return addNode(new PathNode.RelativeReflectiveQuadTo(f2, f3));
    }

    @NotNull
    public final PathBuilder verticalLineTo(float f2) {
        return addNode(new PathNode.VerticalTo(f2));
    }

    @NotNull
    public final PathBuilder verticalLineToRelative(float f2) {
        return addNode(new PathNode.RelativeVerticalTo(f2));
    }
}
