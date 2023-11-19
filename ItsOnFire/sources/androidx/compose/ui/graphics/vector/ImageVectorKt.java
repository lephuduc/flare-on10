package androidx.compose.ui.graphics.vector;

import androidx.appcompat.R;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.vector.ImageVector;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0089\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u0012H\u0086\bø\u0001\u0000\u001a\u009e\u0001\u0010\u0013\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020 2\u0017\u0010!\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u0012H\u0086\bø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b#\u0010$\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"group", "Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "name", "", "rotate", "", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "clipPathData", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "block", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "path", "fill", "Landroidx/compose/ui/graphics/Brush;", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineJoin", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineMiter", "pathFillType", "Landroidx/compose/ui/graphics/PathFillType;", "pathBuilder", "Landroidx/compose/ui/graphics/vector/PathBuilder;", "path-R_LF-3I", "(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFILkotlin/jvm/functions/Function1;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ImageVectorKt {
    @NotNull
    public static final ImageVector.Builder group(@NotNull ImageVector.Builder builder, @NotNull String name, float f2, float f3, float f4, float f5, float f6, float f7, float f8, @NotNull List<? extends PathNode> clipPathData, @NotNull Function1<? super ImageVector.Builder, Unit> block) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(clipPathData, "clipPathData");
        Intrinsics.checkNotNullParameter(block, "block");
        builder.addGroup(name, f2, f3, f4, f5, f6, f7, f8, clipPathData);
        block.invoke(builder);
        builder.clearGroup();
        return builder;
    }

    public static /* synthetic */ ImageVector.Builder group$default(ImageVector.Builder builder, String str, float f2, float f3, float f4, float f5, float f6, float f7, float f8, List list, Function1 block, int i2, Object obj) {
        String name = (i2 & 1) != 0 ? "" : str;
        float f9 = (i2 & 2) != 0 ? 0.0f : f2;
        float f10 = (i2 & 4) != 0 ? 0.0f : f3;
        float f11 = (i2 & 8) != 0 ? 0.0f : f4;
        float f12 = (i2 & 16) != 0 ? 1.0f : f5;
        float f13 = (i2 & 32) == 0 ? f6 : 1.0f;
        float f14 = (i2 & 64) != 0 ? 0.0f : f7;
        float f15 = (i2 & 128) != 0 ? 0.0f : f8;
        List<PathNode> clipPathData = (i2 & 256) != 0 ? VectorKt.getEmptyPath() : list;
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(clipPathData, "clipPathData");
        Intrinsics.checkNotNullParameter(block, "block");
        builder.addGroup(name, f9, f10, f11, f12, f13, f14, f15, clipPathData);
        block.invoke(builder);
        builder.clearGroup();
        return builder;
    }

    @NotNull
    /* renamed from: path-R_LF-3I  reason: not valid java name */
    public static final ImageVector.Builder m1888pathR_LF3I(@NotNull ImageVector.Builder path, @NotNull String name, @Nullable Brush brush, float f2, @Nullable Brush brush2, float f3, float f4, int i2, int i3, float f5, int i4, @NotNull Function1<? super PathBuilder, Unit> pathBuilder) {
        ImageVector.Builder m1887addPathoIyEayM;
        Intrinsics.checkNotNullParameter(path, "$this$path");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(pathBuilder, "pathBuilder");
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder.invoke(pathBuilder2);
        m1887addPathoIyEayM = path.m1887addPathoIyEayM(pathBuilder2.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : i4, (r30 & 4) != 0 ? "" : name, (r30 & 8) != 0 ? null : brush, (r30 & 16) != 0 ? 1.0f : f2, (r30 & 32) == 0 ? brush2 : null, (r30 & 64) != 0 ? 1.0f : f3, (r30 & 128) != 0 ? 0.0f : f4, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : i2, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : i3, (r30 & 1024) != 0 ? 4.0f : f5, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        return m1887addPathoIyEayM;
    }

    /* renamed from: path-R_LF-3I$default  reason: not valid java name */
    public static /* synthetic */ ImageVector.Builder m1889pathR_LF3I$default(ImageVector.Builder path, String str, Brush brush, float f2, Brush brush2, float f3, float f4, int i2, int i3, float f5, int i4, Function1 pathBuilder, int i5, Object obj) {
        ImageVector.Builder m1887addPathoIyEayM;
        String name = (i5 & 1) != 0 ? "" : str;
        Brush brush3 = (i5 & 2) != 0 ? null : brush;
        float f6 = (i5 & 4) != 0 ? 1.0f : f2;
        Brush brush4 = (i5 & 8) != 0 ? null : brush2;
        float f7 = (i5 & 16) != 0 ? 1.0f : f3;
        float f8 = (i5 & 32) != 0 ? 0.0f : f4;
        int defaultStrokeLineCap = (i5 & 64) != 0 ? VectorKt.getDefaultStrokeLineCap() : i2;
        int defaultStrokeLineJoin = (i5 & 128) != 0 ? VectorKt.getDefaultStrokeLineJoin() : i3;
        float f9 = (i5 & 256) != 0 ? 4.0f : f5;
        int defaultFillType = (i5 & 512) != 0 ? VectorKt.getDefaultFillType() : i4;
        Intrinsics.checkNotNullParameter(path, "$this$path");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(pathBuilder, "pathBuilder");
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder.invoke(pathBuilder2);
        m1887addPathoIyEayM = path.m1887addPathoIyEayM(pathBuilder2.getNodes(), (r30 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType, (r30 & 4) != 0 ? "" : name, (r30 & 8) != 0 ? null : brush3, (r30 & 16) != 0 ? 1.0f : f6, (r30 & 32) == 0 ? brush4 : null, (r30 & 64) != 0 ? 1.0f : f7, (r30 & 128) != 0 ? 0.0f : f8, (r30 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : defaultStrokeLineCap, (r30 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : defaultStrokeLineJoin, (r30 & 1024) != 0 ? 4.0f : f9, (r30 & 2048) != 0 ? 0.0f : 0.0f, (r30 & 4096) == 0 ? 0.0f : 1.0f, (r30 & 8192) == 0 ? 0.0f : 0.0f);
        return m1887addPathoIyEayM;
    }
}
