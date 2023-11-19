package androidx.compose.ui.graphics.drawscope;

import androidx.appcompat.R;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DrawScopeMarker
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u0000 l2\u00020\u0001:\u0001lJs\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#Js\u0010\u0011\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'J[\u0010(\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010)\u001a\u00020\u00162\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+J[\u0010(\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010)\u001a\u00020\u00162\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-JQ\u0010.\u001a\u00020\u00122\u0006\u0010/\u001a\u0002002\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102Jo\u0010.\u001a\u00020\u00122\u0006\u0010/\u001a\u0002002\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u0002042\b\b\u0002\u00108\u001a\u0002062\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H'ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b9\u0010:Jy\u0010.\u001a\u00020\u00122\u0006\u0010/\u001a\u0002002\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u0002042\b\b\u0002\u00108\u001a\u0002062\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010;\u001a\u00020<H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b=\u0010>Jm\u0010?\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010@\u001a\u00020\u00032\u0006\u0010A\u001a\u00020\u00032\b\b\u0002\u0010B\u001a\u00020\u00162\b\b\u0002\u0010C\u001a\u00020D2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F2\b\b\u0002\u0010\u001b\u001a\u00020\u00162\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bG\u0010HJm\u0010?\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%2\u0006\u0010@\u001a\u00020\u00032\u0006\u0010A\u001a\u00020\u00032\b\b\u0002\u0010B\u001a\u00020\u00162\b\b\u0002\u0010C\u001a\u00020D2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F2\b\b\u0002\u0010\u001b\u001a\u00020\u00162\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bI\u0010JJ[\u0010K\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bL\u0010MJ[\u0010K\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bN\u0010OJO\u0010P\u001a\u00020\u00122\u0006\u0010Q\u001a\u00020R2\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bS\u0010TJO\u0010P\u001a\u00020\u00122\u0006\u0010Q\u001a\u00020R2\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bU\u0010VJs\u0010W\u001a\u00020\u00122\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00030Y2\u0006\u0010Z\u001a\u00020[2\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010B\u001a\u00020\u00162\b\b\u0002\u0010C\u001a\u00020D2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F2\b\b\u0002\u0010\u001b\u001a\u00020\u00162\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\\\u0010]Js\u0010W\u001a\u00020\u00122\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00030Y2\u0006\u0010Z\u001a\u00020[2\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010B\u001a\u00020\u00162\b\b\u0002\u0010C\u001a\u00020D2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F2\b\b\u0002\u0010\u001b\u001a\u00020\u00162\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b^\u0010_J[\u0010`\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\ba\u0010MJ[\u0010`\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bb\u0010OJe\u0010c\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010d\u001a\u00020e2\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bf\u0010gJe\u0010c\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010d\u001a\u00020e2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001b\u001a\u00020\u00162\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bh\u0010iJ\u001a\u0010j\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010k\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001R\u001d\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0005\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006m"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/unit/Density;", "center", "Landroidx/compose/ui/geometry/Offset;", "getCenter-F1C5BW0", "()J", "drawContext", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "getDrawContext", "()Landroidx/compose/ui/graphics/drawscope/DrawContext;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "size", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "drawArc", "", "brush", "Landroidx/compose/ui/graphics/Brush;", "startAngle", "", "sweepAngle", "useCenter", "", "topLeft", "alpha", "style", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "drawArc-illE91I", "(Landroidx/compose/ui/graphics/Brush;FFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "color", "Landroidx/compose/ui/graphics/Color;", "drawArc-yD3GUKo", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle", "radius", "drawCircle-V9BoPsw", "(Landroidx/compose/ui/graphics/Brush;FJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle-VaOC9Bg", "(JFJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawImage", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "drawImage-gbVJVH8", "(Landroidx/compose/ui/graphics/ImageBitmap;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "srcOffset", "Landroidx/compose/ui/unit/IntOffset;", "srcSize", "Landroidx/compose/ui/unit/IntSize;", "dstOffset", "dstSize", "drawImage-9jGpkUE", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "drawImage-AZ2fEMs", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;II)V", "drawLine", "start", "end", "strokeWidth", "cap", "Landroidx/compose/ui/graphics/StrokeCap;", "pathEffect", "Landroidx/compose/ui/graphics/PathEffect;", "drawLine-1RTmtNc", "(Landroidx/compose/ui/graphics/Brush;JJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawLine-NGM6Ib0", "(JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval", "drawOval-AsUm42w", "(Landroidx/compose/ui/graphics/Brush;JJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval-n-J9OG0", "(JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath", "path", "Landroidx/compose/ui/graphics/Path;", "drawPath-GBMwjPU", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath-LG529CI", "(Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints", "points", "", "pointMode", "Landroidx/compose/ui/graphics/PointMode;", "drawPoints-Gsft0Ws", "(Ljava/util/List;ILandroidx/compose/ui/graphics/Brush;FILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints-F8ZwMP8", "(Ljava/util/List;IJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawRect", "drawRect-AsUm42w", "drawRect-n-J9OG0", "drawRoundRect", "cornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "drawRoundRect-ZuiqVtQ", "(Landroidx/compose/ui/graphics/Brush;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRoundRect-u-Aw5IA", "(JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "offsetSize", "offset", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public interface DrawScope extends Density {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\n\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope$Companion;", "", "()V", "DefaultBlendMode", "Landroidx/compose/ui/graphics/BlendMode;", "getDefaultBlendMode-0nO6VwU", "()I", "I", "DefaultFilterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "getDefaultFilterQuality-f-v9h1I", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int DefaultBlendMode = BlendMode.Companion.m1342getSrcOver0nO6VwU();
        private static final int DefaultFilterQuality = FilterQuality.Companion.m1478getLowfv9h1I();

        private Companion() {
        }

        /* renamed from: getDefaultBlendMode-0nO6VwU  reason: not valid java name */
        public final int m1810getDefaultBlendMode0nO6VwU() {
            return DefaultBlendMode;
        }

        /* renamed from: getDefaultFilterQuality-f-v9h1I  reason: not valid java name */
        public final int m1811getDefaultFilterQualityfv9h1I() {
            return DefaultFilterQuality;
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        /* renamed from: drawArc-illE91I$default  reason: not valid java name */
        public static /* synthetic */ void m1812drawArcillE91I$default(DrawScope drawScope, Brush brush, float f2, float f3, boolean z, long j2, long j3, float f4, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-illE91I");
            }
            long m1177getZeroF1C5BW0 = (i3 & 16) != 0 ? Offset.Companion.m1177getZeroF1C5BW0() : j2;
            drawScope.mo1760drawArcillE91I(brush, f2, f3, z, m1177getZeroF1C5BW0, (i3 & 32) != 0 ? m1834offsetSizePENXr5M(drawScope, drawScope.mo1780getSizeNHjbRc(), m1177getZeroF1C5BW0) : j3, (i3 & 64) != 0 ? 1.0f : f4, (i3 & 128) != 0 ? Fill.INSTANCE : drawStyle, (i3 & 256) != 0 ? null : colorFilter, (i3 & 512) != 0 ? DrawScope.Companion.m1810getDefaultBlendMode0nO6VwU() : i2);
        }

        /* renamed from: drawArc-yD3GUKo$default  reason: not valid java name */
        public static /* synthetic */ void m1813drawArcyD3GUKo$default(DrawScope drawScope, long j2, float f2, float f3, boolean z, long j3, long j4, float f4, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
            }
            long m1177getZeroF1C5BW0 = (i3 & 16) != 0 ? Offset.Companion.m1177getZeroF1C5BW0() : j3;
            drawScope.mo1761drawArcyD3GUKo(j2, f2, f3, z, m1177getZeroF1C5BW0, (i3 & 32) != 0 ? m1834offsetSizePENXr5M(drawScope, drawScope.mo1780getSizeNHjbRc(), m1177getZeroF1C5BW0) : j4, (i3 & 64) != 0 ? 1.0f : f4, (i3 & 128) != 0 ? Fill.INSTANCE : drawStyle, (i3 & 256) != 0 ? null : colorFilter, (i3 & 512) != 0 ? DrawScope.Companion.m1810getDefaultBlendMode0nO6VwU() : i2);
        }

        /* renamed from: drawCircle-V9BoPsw$default  reason: not valid java name */
        public static /* synthetic */ void m1814drawCircleV9BoPsw$default(DrawScope drawScope, Brush brush, float f2, long j2, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-V9BoPsw");
            }
            drawScope.mo1762drawCircleV9BoPsw(brush, (i3 & 2) != 0 ? Size.m1229getMinDimensionimpl(drawScope.mo1780getSizeNHjbRc()) / 2.0f : f2, (i3 & 4) != 0 ? drawScope.mo1779getCenterF1C5BW0() : j2, (i3 & 8) != 0 ? 1.0f : f3, (i3 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i3 & 32) != 0 ? null : colorFilter, (i3 & 64) != 0 ? DrawScope.Companion.m1810getDefaultBlendMode0nO6VwU() : i2);
        }

        /* renamed from: drawCircle-VaOC9Bg$default  reason: not valid java name */
        public static /* synthetic */ void m1815drawCircleVaOC9Bg$default(DrawScope drawScope, long j2, float f2, long j3, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
            }
            drawScope.mo1763drawCircleVaOC9Bg(j2, (i3 & 2) != 0 ? Size.m1229getMinDimensionimpl(drawScope.mo1780getSizeNHjbRc()) / 2.0f : f2, (i3 & 4) != 0 ? drawScope.mo1779getCenterF1C5BW0() : j3, (i3 & 8) != 0 ? 1.0f : f3, (i3 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i3 & 32) != 0 ? null : colorFilter, (i3 & 64) != 0 ? DrawScope.Companion.m1810getDefaultBlendMode0nO6VwU() : i2);
        }

        /* renamed from: drawImage-9jGpkUE$default  reason: not valid java name */
        public static /* synthetic */ void m1816drawImage9jGpkUE$default(DrawScope drawScope, ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-9jGpkUE");
            }
            long m3453getZeronOccac = (i3 & 2) != 0 ? IntOffset.Companion.m3453getZeronOccac() : j2;
            long IntSize = (i3 & 4) != 0 ? IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight()) : j3;
            drawScope.mo1764drawImage9jGpkUE(imageBitmap, m3453getZeronOccac, IntSize, (i3 & 8) != 0 ? IntOffset.Companion.m3453getZeronOccac() : j4, (i3 & 16) != 0 ? IntSize : j5, (i3 & 32) != 0 ? 1.0f : f2, (i3 & 64) != 0 ? Fill.INSTANCE : drawStyle, (i3 & 128) != 0 ? null : colorFilter, (i3 & 256) != 0 ? DrawScope.Companion.m1810getDefaultBlendMode0nO6VwU() : i2);
        }

        /* renamed from: drawImage-AZ2fEMs  reason: not valid java name */
        public static void m1817drawImageAZ2fEMs(@NotNull DrawScope drawScope, @NotNull ImageBitmap image, long j2, long j3, long j4, long j5, float f2, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i2, int i3) {
            Intrinsics.checkNotNullParameter(drawScope, "this");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(style, "style");
            m1818drawImageAZ2fEMs$default(drawScope, image, j2, j3, j4, j5, f2, style, colorFilter, i2, 0, 512, null);
        }

        /* renamed from: drawImage-AZ2fEMs$default  reason: not valid java name */
        public static /* synthetic */ void m1818drawImageAZ2fEMs$default(DrawScope drawScope, ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
            }
            long m3453getZeronOccac = (i4 & 2) != 0 ? IntOffset.Companion.m3453getZeronOccac() : j2;
            long IntSize = (i4 & 4) != 0 ? IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight()) : j3;
            drawScope.mo1765drawImageAZ2fEMs(imageBitmap, m3453getZeronOccac, IntSize, (i4 & 8) != 0 ? IntOffset.Companion.m3453getZeronOccac() : j4, (i4 & 16) != 0 ? IntSize : j5, (i4 & 32) != 0 ? 1.0f : f2, (i4 & 64) != 0 ? Fill.INSTANCE : drawStyle, (i4 & 128) != 0 ? null : colorFilter, (i4 & 256) != 0 ? DrawScope.Companion.m1810getDefaultBlendMode0nO6VwU() : i2, (i4 & 512) != 0 ? DrawScope.Companion.m1811getDefaultFilterQualityfv9h1I() : i3);
        }

        /* renamed from: drawImage-gbVJVH8$default  reason: not valid java name */
        public static /* synthetic */ void m1819drawImagegbVJVH8$default(DrawScope drawScope, ImageBitmap imageBitmap, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
            }
            drawScope.mo1766drawImagegbVJVH8(imageBitmap, (i3 & 2) != 0 ? Offset.Companion.m1177getZeroF1C5BW0() : j2, (i3 & 4) != 0 ? 1.0f : f2, (i3 & 8) != 0 ? Fill.INSTANCE : drawStyle, (i3 & 16) != 0 ? null : colorFilter, (i3 & 32) != 0 ? DrawScope.Companion.m1810getDefaultBlendMode0nO6VwU() : i2);
        }

        /* renamed from: drawLine-1RTmtNc$default  reason: not valid java name */
        public static /* synthetic */ void m1820drawLine1RTmtNc$default(DrawScope drawScope, Brush brush, long j2, long j3, float f2, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
            }
            drawScope.mo1767drawLine1RTmtNc(brush, j2, j3, (i4 & 8) != 0 ? 0.0f : f2, (i4 & 16) != 0 ? Stroke.Companion.m1870getDefaultCapKaPHkGw() : i2, (i4 & 32) != 0 ? null : pathEffect, (i4 & 64) != 0 ? 1.0f : f3, (i4 & 128) != 0 ? null : colorFilter, (i4 & 256) != 0 ? DrawScope.Companion.m1810getDefaultBlendMode0nO6VwU() : i3);
        }

        /* renamed from: drawLine-NGM6Ib0$default  reason: not valid java name */
        public static /* synthetic */ void m1821drawLineNGM6Ib0$default(DrawScope drawScope, long j2, long j3, long j4, float f2, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
            }
            drawScope.mo1768drawLineNGM6Ib0(j2, j3, j4, (i4 & 8) != 0 ? 0.0f : f2, (i4 & 16) != 0 ? Stroke.Companion.m1870getDefaultCapKaPHkGw() : i2, (i4 & 32) != 0 ? null : pathEffect, (i4 & 64) != 0 ? 1.0f : f3, (i4 & 128) != 0 ? null : colorFilter, (i4 & 256) != 0 ? DrawScope.Companion.m1810getDefaultBlendMode0nO6VwU() : i3);
        }

        /* renamed from: drawOval-AsUm42w$default  reason: not valid java name */
        public static /* synthetic */ void m1822drawOvalAsUm42w$default(DrawScope drawScope, Brush brush, long j2, long j3, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-AsUm42w");
            }
            long m1177getZeroF1C5BW0 = (i3 & 2) != 0 ? Offset.Companion.m1177getZeroF1C5BW0() : j2;
            drawScope.mo1769drawOvalAsUm42w(brush, m1177getZeroF1C5BW0, (i3 & 4) != 0 ? m1834offsetSizePENXr5M(drawScope, drawScope.mo1780getSizeNHjbRc(), m1177getZeroF1C5BW0) : j3, (i3 & 8) != 0 ? 1.0f : f2, (i3 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i3 & 32) != 0 ? null : colorFilter, (i3 & 64) != 0 ? DrawScope.Companion.m1810getDefaultBlendMode0nO6VwU() : i2);
        }

        /* renamed from: drawOval-n-J9OG0$default  reason: not valid java name */
        public static /* synthetic */ void m1823drawOvalnJ9OG0$default(DrawScope drawScope, long j2, long j3, long j4, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-n-J9OG0");
            }
            long m1177getZeroF1C5BW0 = (i3 & 2) != 0 ? Offset.Companion.m1177getZeroF1C5BW0() : j3;
            drawScope.mo1770drawOvalnJ9OG0(j2, m1177getZeroF1C5BW0, (i3 & 4) != 0 ? m1834offsetSizePENXr5M(drawScope, drawScope.mo1780getSizeNHjbRc(), m1177getZeroF1C5BW0) : j4, (i3 & 8) != 0 ? 1.0f : f2, (i3 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i3 & 32) != 0 ? null : colorFilter, (i3 & 64) != 0 ? DrawScope.Companion.m1810getDefaultBlendMode0nO6VwU() : i2);
        }

        /* renamed from: drawPath-GBMwjPU$default  reason: not valid java name */
        public static /* synthetic */ void m1824drawPathGBMwjPU$default(DrawScope drawScope, Path path, Brush brush, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
            }
            if ((i3 & 4) != 0) {
                f2 = 1.0f;
            }
            float f3 = f2;
            if ((i3 & 8) != 0) {
                drawStyle = Fill.INSTANCE;
            }
            DrawStyle drawStyle2 = drawStyle;
            if ((i3 & 16) != 0) {
                colorFilter = null;
            }
            ColorFilter colorFilter2 = colorFilter;
            if ((i3 & 32) != 0) {
                i2 = DrawScope.Companion.m1810getDefaultBlendMode0nO6VwU();
            }
            drawScope.mo1771drawPathGBMwjPU(path, brush, f3, drawStyle2, colorFilter2, i2);
        }

        /* renamed from: drawPath-LG529CI$default  reason: not valid java name */
        public static /* synthetic */ void m1825drawPathLG529CI$default(DrawScope drawScope, Path path, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-LG529CI");
            }
            drawScope.mo1772drawPathLG529CI(path, j2, (i3 & 4) != 0 ? 1.0f : f2, (i3 & 8) != 0 ? Fill.INSTANCE : drawStyle, (i3 & 16) != 0 ? null : colorFilter, (i3 & 32) != 0 ? DrawScope.Companion.m1810getDefaultBlendMode0nO6VwU() : i2);
        }

        /* renamed from: drawPoints-F8ZwMP8$default  reason: not valid java name */
        public static /* synthetic */ void m1826drawPointsF8ZwMP8$default(DrawScope drawScope, List list, int i2, long j2, float f2, int i3, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i4, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-F8ZwMP8");
            }
            drawScope.mo1773drawPointsF8ZwMP8(list, i2, j2, (i5 & 8) != 0 ? 0.0f : f2, (i5 & 16) != 0 ? StrokeCap.Companion.m1669getButtKaPHkGw() : i3, (i5 & 32) != 0 ? null : pathEffect, (i5 & 64) != 0 ? 1.0f : f3, (i5 & 128) != 0 ? null : colorFilter, (i5 & 256) != 0 ? DrawScope.Companion.m1810getDefaultBlendMode0nO6VwU() : i4);
        }

        /* renamed from: drawPoints-Gsft0Ws$default  reason: not valid java name */
        public static /* synthetic */ void m1827drawPointsGsft0Ws$default(DrawScope drawScope, List list, int i2, Brush brush, float f2, int i3, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i4, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-Gsft0Ws");
            }
            drawScope.mo1774drawPointsGsft0Ws(list, i2, brush, (i5 & 8) != 0 ? 0.0f : f2, (i5 & 16) != 0 ? StrokeCap.Companion.m1669getButtKaPHkGw() : i3, (i5 & 32) != 0 ? null : pathEffect, (i5 & 64) != 0 ? 1.0f : f3, (i5 & 128) != 0 ? null : colorFilter, (i5 & 256) != 0 ? DrawScope.Companion.m1810getDefaultBlendMode0nO6VwU() : i4);
        }

        /* renamed from: drawRect-AsUm42w$default  reason: not valid java name */
        public static /* synthetic */ void m1828drawRectAsUm42w$default(DrawScope drawScope, Brush brush, long j2, long j3, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
            }
            long m1177getZeroF1C5BW0 = (i3 & 2) != 0 ? Offset.Companion.m1177getZeroF1C5BW0() : j2;
            drawScope.mo1775drawRectAsUm42w(brush, m1177getZeroF1C5BW0, (i3 & 4) != 0 ? m1834offsetSizePENXr5M(drawScope, drawScope.mo1780getSizeNHjbRc(), m1177getZeroF1C5BW0) : j3, (i3 & 8) != 0 ? 1.0f : f2, (i3 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i3 & 32) != 0 ? null : colorFilter, (i3 & 64) != 0 ? DrawScope.Companion.m1810getDefaultBlendMode0nO6VwU() : i2);
        }

        /* renamed from: drawRect-n-J9OG0$default  reason: not valid java name */
        public static /* synthetic */ void m1829drawRectnJ9OG0$default(DrawScope drawScope, long j2, long j3, long j4, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
            }
            long m1177getZeroF1C5BW0 = (i3 & 2) != 0 ? Offset.Companion.m1177getZeroF1C5BW0() : j3;
            drawScope.mo1776drawRectnJ9OG0(j2, m1177getZeroF1C5BW0, (i3 & 4) != 0 ? m1834offsetSizePENXr5M(drawScope, drawScope.mo1780getSizeNHjbRc(), m1177getZeroF1C5BW0) : j4, (i3 & 8) != 0 ? 1.0f : f2, (i3 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i3 & 32) != 0 ? null : colorFilter, (i3 & 64) != 0 ? DrawScope.Companion.m1810getDefaultBlendMode0nO6VwU() : i2);
        }

        /* renamed from: drawRoundRect-ZuiqVtQ$default  reason: not valid java name */
        public static /* synthetic */ void m1830drawRoundRectZuiqVtQ$default(DrawScope drawScope, Brush brush, long j2, long j3, long j4, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
            }
            long m1177getZeroF1C5BW0 = (i3 & 2) != 0 ? Offset.Companion.m1177getZeroF1C5BW0() : j2;
            drawScope.mo1777drawRoundRectZuiqVtQ(brush, m1177getZeroF1C5BW0, (i3 & 4) != 0 ? m1834offsetSizePENXr5M(drawScope, drawScope.mo1780getSizeNHjbRc(), m1177getZeroF1C5BW0) : j3, (i3 & 8) != 0 ? CornerRadius.Companion.m1146getZerokKHJgLs() : j4, (i3 & 16) != 0 ? 1.0f : f2, (i3 & 32) != 0 ? Fill.INSTANCE : drawStyle, (i3 & 64) != 0 ? null : colorFilter, (i3 & 128) != 0 ? DrawScope.Companion.m1810getDefaultBlendMode0nO6VwU() : i2);
        }

        /* renamed from: drawRoundRect-u-Aw5IA$default  reason: not valid java name */
        public static /* synthetic */ void m1831drawRoundRectuAw5IA$default(DrawScope drawScope, long j2, long j3, long j4, long j5, DrawStyle drawStyle, float f2, ColorFilter colorFilter, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-u-Aw5IA");
            }
            long m1177getZeroF1C5BW0 = (i3 & 2) != 0 ? Offset.Companion.m1177getZeroF1C5BW0() : j3;
            drawScope.mo1778drawRoundRectuAw5IA(j2, m1177getZeroF1C5BW0, (i3 & 4) != 0 ? m1834offsetSizePENXr5M(drawScope, drawScope.mo1780getSizeNHjbRc(), m1177getZeroF1C5BW0) : j4, (i3 & 8) != 0 ? CornerRadius.Companion.m1146getZerokKHJgLs() : j5, (i3 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i3 & 32) != 0 ? 1.0f : f2, (i3 & 64) != 0 ? null : colorFilter, (i3 & 128) != 0 ? DrawScope.Companion.m1810getDefaultBlendMode0nO6VwU() : i2);
        }

        /* renamed from: getCenter-F1C5BW0  reason: not valid java name */
        public static long m1832getCenterF1C5BW0(@NotNull DrawScope drawScope) {
            Intrinsics.checkNotNullParameter(drawScope, "this");
            return SizeKt.m1240getCenteruvyYCjk(drawScope.getDrawContext().mo1786getSizeNHjbRc());
        }

        /* renamed from: getSize-NH-jbRc  reason: not valid java name */
        public static long m1833getSizeNHjbRc(@NotNull DrawScope drawScope) {
            Intrinsics.checkNotNullParameter(drawScope, "this");
            return drawScope.getDrawContext().mo1786getSizeNHjbRc();
        }

        /* renamed from: offsetSize-PENXr5M  reason: not valid java name */
        private static long m1834offsetSizePENXr5M(DrawScope drawScope, long j2, long j3) {
            return SizeKt.Size(Size.m1230getWidthimpl(j2) - Offset.m1161getXimpl(j3), Size.m1227getHeightimpl(j2) - Offset.m1162getYimpl(j3));
        }

        @Stable
        /* renamed from: roundToPx--R2X_6o  reason: not valid java name */
        public static int m1835roundToPxR2X_6o(@NotNull DrawScope drawScope, long j2) {
            Intrinsics.checkNotNullParameter(drawScope, "this");
            return Density.DefaultImpls.m3311roundToPxR2X_6o(drawScope, j2);
        }

        @Stable
        /* renamed from: roundToPx-0680j_4  reason: not valid java name */
        public static int m1836roundToPx0680j_4(@NotNull DrawScope drawScope, float f2) {
            Intrinsics.checkNotNullParameter(drawScope, "this");
            return Density.DefaultImpls.m3312roundToPx0680j_4(drawScope, f2);
        }

        @Stable
        /* renamed from: toDp-GaN1DYA  reason: not valid java name */
        public static float m1837toDpGaN1DYA(@NotNull DrawScope drawScope, long j2) {
            Intrinsics.checkNotNullParameter(drawScope, "this");
            return Density.DefaultImpls.m3313toDpGaN1DYA(drawScope, j2);
        }

        @Stable
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m1838toDpu2uoSUM(@NotNull DrawScope drawScope, float f2) {
            Intrinsics.checkNotNullParameter(drawScope, "this");
            return Density.DefaultImpls.m3314toDpu2uoSUM(drawScope, f2);
        }

        @Stable
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m1839toDpu2uoSUM(@NotNull DrawScope drawScope, int i2) {
            Intrinsics.checkNotNullParameter(drawScope, "this");
            return Density.DefaultImpls.m3315toDpu2uoSUM((Density) drawScope, i2);
        }

        @Stable
        /* renamed from: toDpSize-k-rfVVM  reason: not valid java name */
        public static long m1840toDpSizekrfVVM(@NotNull DrawScope drawScope, long j2) {
            Intrinsics.checkNotNullParameter(drawScope, "this");
            return Density.DefaultImpls.m3316toDpSizekrfVVM(drawScope, j2);
        }

        @Stable
        /* renamed from: toPx--R2X_6o  reason: not valid java name */
        public static float m1841toPxR2X_6o(@NotNull DrawScope drawScope, long j2) {
            Intrinsics.checkNotNullParameter(drawScope, "this");
            return Density.DefaultImpls.m3317toPxR2X_6o(drawScope, j2);
        }

        @Stable
        /* renamed from: toPx-0680j_4  reason: not valid java name */
        public static float m1842toPx0680j_4(@NotNull DrawScope drawScope, float f2) {
            Intrinsics.checkNotNullParameter(drawScope, "this");
            return Density.DefaultImpls.m3318toPx0680j_4(drawScope, f2);
        }

        @Stable
        @NotNull
        public static Rect toRect(@NotNull DrawScope drawScope, @NotNull DpRect receiver) {
            Intrinsics.checkNotNullParameter(drawScope, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            return Density.DefaultImpls.toRect(drawScope, receiver);
        }

        @Stable
        /* renamed from: toSize-XkaWNTQ  reason: not valid java name */
        public static long m1843toSizeXkaWNTQ(@NotNull DrawScope drawScope, long j2) {
            Intrinsics.checkNotNullParameter(drawScope, "this");
            return Density.DefaultImpls.m3319toSizeXkaWNTQ(drawScope, j2);
        }

        @Stable
        /* renamed from: toSp-0xMU5do  reason: not valid java name */
        public static long m1844toSp0xMU5do(@NotNull DrawScope drawScope, float f2) {
            Intrinsics.checkNotNullParameter(drawScope, "this");
            return Density.DefaultImpls.m3320toSp0xMU5do(drawScope, f2);
        }

        @Stable
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m1845toSpkPz2Gy4(@NotNull DrawScope drawScope, float f2) {
            Intrinsics.checkNotNullParameter(drawScope, "this");
            return Density.DefaultImpls.m3321toSpkPz2Gy4(drawScope, f2);
        }

        @Stable
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m1846toSpkPz2Gy4(@NotNull DrawScope drawScope, int i2) {
            Intrinsics.checkNotNullParameter(drawScope, "this");
            return Density.DefaultImpls.m3322toSpkPz2Gy4((Density) drawScope, i2);
        }
    }

    /* renamed from: drawArc-illE91I */
    void mo1760drawArcillE91I(@NotNull Brush brush, float f2, float f3, boolean z, long j2, long j3, float f4, @NotNull DrawStyle drawStyle, @Nullable ColorFilter colorFilter, int i2);

    /* renamed from: drawArc-yD3GUKo */
    void mo1761drawArcyD3GUKo(long j2, float f2, float f3, boolean z, long j3, long j4, float f4, @NotNull DrawStyle drawStyle, @Nullable ColorFilter colorFilter, int i2);

    /* renamed from: drawCircle-V9BoPsw */
    void mo1762drawCircleV9BoPsw(@NotNull Brush brush, float f2, long j2, float f3, @NotNull DrawStyle drawStyle, @Nullable ColorFilter colorFilter, int i2);

    /* renamed from: drawCircle-VaOC9Bg */
    void mo1763drawCircleVaOC9Bg(long j2, float f2, long j3, float f3, @NotNull DrawStyle drawStyle, @Nullable ColorFilter colorFilter, int i2);

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @ReplaceWith(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    /* renamed from: drawImage-9jGpkUE */
    /* synthetic */ void mo1764drawImage9jGpkUE(ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2);

    /* renamed from: drawImage-AZ2fEMs */
    void mo1765drawImageAZ2fEMs(@NotNull ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, float f2, @NotNull DrawStyle drawStyle, @Nullable ColorFilter colorFilter, int i2, int i3);

    /* renamed from: drawImage-gbVJVH8 */
    void mo1766drawImagegbVJVH8(@NotNull ImageBitmap imageBitmap, long j2, float f2, @NotNull DrawStyle drawStyle, @Nullable ColorFilter colorFilter, int i2);

    /* renamed from: drawLine-1RTmtNc */
    void mo1767drawLine1RTmtNc(@NotNull Brush brush, long j2, long j3, float f2, int i2, @Nullable PathEffect pathEffect, float f3, @Nullable ColorFilter colorFilter, int i3);

    /* renamed from: drawLine-NGM6Ib0 */
    void mo1768drawLineNGM6Ib0(long j2, long j3, long j4, float f2, int i2, @Nullable PathEffect pathEffect, float f3, @Nullable ColorFilter colorFilter, int i3);

    /* renamed from: drawOval-AsUm42w */
    void mo1769drawOvalAsUm42w(@NotNull Brush brush, long j2, long j3, float f2, @NotNull DrawStyle drawStyle, @Nullable ColorFilter colorFilter, int i2);

    /* renamed from: drawOval-n-J9OG0 */
    void mo1770drawOvalnJ9OG0(long j2, long j3, long j4, float f2, @NotNull DrawStyle drawStyle, @Nullable ColorFilter colorFilter, int i2);

    /* renamed from: drawPath-GBMwjPU */
    void mo1771drawPathGBMwjPU(@NotNull Path path, @NotNull Brush brush, float f2, @NotNull DrawStyle drawStyle, @Nullable ColorFilter colorFilter, int i2);

    /* renamed from: drawPath-LG529CI */
    void mo1772drawPathLG529CI(@NotNull Path path, long j2, float f2, @NotNull DrawStyle drawStyle, @Nullable ColorFilter colorFilter, int i2);

    /* renamed from: drawPoints-F8ZwMP8 */
    void mo1773drawPointsF8ZwMP8(@NotNull List<Offset> list, int i2, long j2, float f2, int i3, @Nullable PathEffect pathEffect, float f3, @Nullable ColorFilter colorFilter, int i4);

    /* renamed from: drawPoints-Gsft0Ws */
    void mo1774drawPointsGsft0Ws(@NotNull List<Offset> list, int i2, @NotNull Brush brush, float f2, int i3, @Nullable PathEffect pathEffect, float f3, @Nullable ColorFilter colorFilter, int i4);

    /* renamed from: drawRect-AsUm42w */
    void mo1775drawRectAsUm42w(@NotNull Brush brush, long j2, long j3, float f2, @NotNull DrawStyle drawStyle, @Nullable ColorFilter colorFilter, int i2);

    /* renamed from: drawRect-n-J9OG0 */
    void mo1776drawRectnJ9OG0(long j2, long j3, long j4, float f2, @NotNull DrawStyle drawStyle, @Nullable ColorFilter colorFilter, int i2);

    /* renamed from: drawRoundRect-ZuiqVtQ */
    void mo1777drawRoundRectZuiqVtQ(@NotNull Brush brush, long j2, long j3, long j4, float f2, @NotNull DrawStyle drawStyle, @Nullable ColorFilter colorFilter, int i2);

    /* renamed from: drawRoundRect-u-Aw5IA */
    void mo1778drawRoundRectuAw5IA(long j2, long j3, long j4, long j5, @NotNull DrawStyle drawStyle, float f2, @Nullable ColorFilter colorFilter, int i2);

    /* renamed from: getCenter-F1C5BW0 */
    long mo1779getCenterF1C5BW0();

    @NotNull
    DrawContext getDrawContext();

    @NotNull
    LayoutDirection getLayoutDirection();

    /* renamed from: getSize-NH-jbRc */
    long mo1780getSizeNHjbRc();
}
