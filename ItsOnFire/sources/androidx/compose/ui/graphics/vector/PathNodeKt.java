package androidx.compose.ui.graphics.vector;

import androidx.appcompat.R;
import androidx.compose.ui.graphics.vector.PathNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aB\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\b2!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110#¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b()\u0012\u0004\u0012\u00020!0&H\u0082\b\u001a\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020!0 *\u00020\u00012\u0006\u0010\"\u001a\u00020#H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"ArcToKey", "", "CloseKey", "CurveToKey", "HorizontalToKey", "LineToKey", "MoveToKey", "NUM_ARC_TO_ARGS", "", "NUM_CURVE_TO_ARGS", "NUM_HORIZONTAL_TO_ARGS", "NUM_LINE_TO_ARGS", "NUM_MOVE_TO_ARGS", "NUM_QUAD_TO_ARGS", "NUM_REFLECTIVE_CURVE_TO_ARGS", "NUM_REFLECTIVE_QUAD_TO_ARGS", "NUM_VERTICAL_TO_ARGS", "QuadToKey", "ReflectiveCurveToKey", "ReflectiveQuadToKey", "RelativeArcToKey", "RelativeCloseKey", "RelativeCurveToKey", "RelativeHorizontalToKey", "RelativeLineToKey", "RelativeMoveToKey", "RelativeQuadToKey", "RelativeReflectiveCurveToKey", "RelativeReflectiveQuadToKey", "RelativeVerticalToKey", "VerticalToKey", "pathNodesFromArgs", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "args", "", "numArgs", "nodeFor", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "subArray", "toPathNodes", "ui-graphics_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class PathNodeKt {
    private static final char ArcToKey = 'A';
    private static final char CloseKey = 'Z';
    private static final char CurveToKey = 'C';
    private static final char HorizontalToKey = 'H';
    private static final char LineToKey = 'L';
    private static final char MoveToKey = 'M';
    private static final int NUM_ARC_TO_ARGS = 7;
    private static final int NUM_CURVE_TO_ARGS = 6;
    private static final int NUM_HORIZONTAL_TO_ARGS = 1;
    private static final int NUM_LINE_TO_ARGS = 2;
    private static final int NUM_MOVE_TO_ARGS = 2;
    private static final int NUM_QUAD_TO_ARGS = 4;
    private static final int NUM_REFLECTIVE_CURVE_TO_ARGS = 4;
    private static final int NUM_REFLECTIVE_QUAD_TO_ARGS = 2;
    private static final int NUM_VERTICAL_TO_ARGS = 1;
    private static final char QuadToKey = 'Q';
    private static final char ReflectiveCurveToKey = 'S';
    private static final char ReflectiveQuadToKey = 'T';
    private static final char RelativeArcToKey = 'a';
    private static final char RelativeCloseKey = 'z';
    private static final char RelativeCurveToKey = 'c';
    private static final char RelativeHorizontalToKey = 'h';
    private static final char RelativeLineToKey = 'l';
    private static final char RelativeMoveToKey = 'm';
    private static final char RelativeQuadToKey = 'q';
    private static final char RelativeReflectiveCurveToKey = 's';
    private static final char RelativeReflectiveQuadToKey = 't';
    private static final char RelativeVerticalToKey = 'v';
    private static final char VerticalToKey = 'V';

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [float[], java.lang.Object] */
    private static final List<PathNode> pathNodesFromArgs(float[] fArr, int i2, Function1<? super float[], ? extends PathNode> function1) {
        IntProgression step;
        int collectionSizeOrDefault;
        IntRange until;
        List slice;
        ?? floatArray;
        step = RangesKt___RangesKt.step(new IntRange(0, fArr.length - i2), i2);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(step, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = step.iterator();
        while (it.hasNext()) {
            int nextInt = ((IntIterator) it).nextInt();
            until = RangesKt___RangesKt.until(nextInt, nextInt + i2);
            slice = ArraysKt___ArraysKt.slice(fArr, until);
            floatArray = CollectionsKt___CollectionsKt.toFloatArray(slice);
            Object obj = (PathNode) function1.invoke(floatArray);
            if ((obj instanceof PathNode.MoveTo) && nextInt > 0) {
                obj = new PathNode.LineTo(floatArray[0], floatArray[1]);
            } else if ((obj instanceof PathNode.RelativeMoveTo) && nextInt > 0) {
                obj = new PathNode.RelativeLineTo(floatArray[0], floatArray[1]);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    @NotNull
    public static final List<PathNode> toPathNodes(char c2, @NotNull float[] args) {
        IntProgression step;
        ArrayList arrayList;
        int collectionSizeOrDefault;
        IntRange until;
        List slice;
        float[] floatArray;
        IntProgression step2;
        int collectionSizeOrDefault2;
        IntRange until2;
        List slice2;
        float[] floatArray2;
        IntProgression step3;
        int collectionSizeOrDefault3;
        IntRange until3;
        List slice3;
        float[] floatArray3;
        IntProgression step4;
        int collectionSizeOrDefault4;
        IntRange until4;
        List slice4;
        float[] floatArray4;
        IntProgression step5;
        int collectionSizeOrDefault5;
        IntRange until5;
        List slice5;
        float[] floatArray5;
        IntProgression step6;
        int collectionSizeOrDefault6;
        IntRange until6;
        List slice6;
        float[] floatArray6;
        IntProgression step7;
        int collectionSizeOrDefault7;
        IntRange until7;
        List slice7;
        float[] floatArray7;
        IntProgression step8;
        int collectionSizeOrDefault8;
        IntRange until8;
        List slice8;
        float[] floatArray8;
        IntProgression step9;
        int collectionSizeOrDefault9;
        IntRange until9;
        List slice9;
        float[] floatArray9;
        IntProgression step10;
        int collectionSizeOrDefault10;
        IntRange until10;
        List slice10;
        float[] floatArray10;
        IntProgression step11;
        int collectionSizeOrDefault11;
        IntRange until11;
        List slice11;
        float[] floatArray11;
        IntProgression step12;
        int collectionSizeOrDefault12;
        IntRange until12;
        List slice12;
        float[] floatArray12;
        IntProgression step13;
        int collectionSizeOrDefault13;
        IntRange until13;
        List slice13;
        float[] floatArray13;
        IntProgression step14;
        int collectionSizeOrDefault14;
        IntRange until14;
        List slice14;
        float[] floatArray14;
        IntProgression step15;
        int collectionSizeOrDefault15;
        IntRange until15;
        List slice15;
        float[] floatArray15;
        IntProgression step16;
        int collectionSizeOrDefault16;
        IntRange until16;
        List slice16;
        float[] floatArray16;
        IntProgression step17;
        int collectionSizeOrDefault17;
        IntRange until17;
        List slice17;
        float[] floatArray17;
        IntProgression step18;
        int collectionSizeOrDefault18;
        IntRange until18;
        List slice18;
        float[] floatArray18;
        List<PathNode> listOf;
        Intrinsics.checkNotNullParameter(args, "args");
        if (c2 == 'z' || c2 == 'Z') {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(PathNode.Close.INSTANCE);
            return listOf;
        }
        if (c2 == 'm') {
            step18 = RangesKt___RangesKt.step(new IntRange(0, args.length - 2), 2);
            collectionSizeOrDefault18 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step18, 10);
            arrayList = new ArrayList(collectionSizeOrDefault18);
            Iterator<Integer> it = step18.iterator();
            while (it.hasNext()) {
                int nextInt = ((IntIterator) it).nextInt();
                until18 = RangesKt___RangesKt.until(nextInt, nextInt + 2);
                slice18 = ArraysKt___ArraysKt.slice(args, until18);
                floatArray18 = CollectionsKt___CollectionsKt.toFloatArray(slice18);
                PathNode relativeMoveTo = new PathNode.RelativeMoveTo(floatArray18[0], floatArray18[1]);
                if ((relativeMoveTo instanceof PathNode.MoveTo) && nextInt > 0) {
                    relativeMoveTo = new PathNode.LineTo(floatArray18[0], floatArray18[1]);
                } else if (nextInt > 0) {
                    relativeMoveTo = new PathNode.RelativeLineTo(floatArray18[0], floatArray18[1]);
                }
                arrayList.add(relativeMoveTo);
            }
        } else if (c2 == 'M') {
            step17 = RangesKt___RangesKt.step(new IntRange(0, args.length - 2), 2);
            collectionSizeOrDefault17 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step17, 10);
            arrayList = new ArrayList(collectionSizeOrDefault17);
            Iterator<Integer> it2 = step17.iterator();
            while (it2.hasNext()) {
                int nextInt2 = ((IntIterator) it2).nextInt();
                until17 = RangesKt___RangesKt.until(nextInt2, nextInt2 + 2);
                slice17 = ArraysKt___ArraysKt.slice(args, until17);
                floatArray17 = CollectionsKt___CollectionsKt.toFloatArray(slice17);
                PathNode moveTo = new PathNode.MoveTo(floatArray17[0], floatArray17[1]);
                if (nextInt2 > 0) {
                    moveTo = new PathNode.LineTo(floatArray17[0], floatArray17[1]);
                } else if ((moveTo instanceof PathNode.RelativeMoveTo) && nextInt2 > 0) {
                    moveTo = new PathNode.RelativeLineTo(floatArray17[0], floatArray17[1]);
                }
                arrayList.add(moveTo);
            }
        } else if (c2 == 'l') {
            step16 = RangesKt___RangesKt.step(new IntRange(0, args.length - 2), 2);
            collectionSizeOrDefault16 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step16, 10);
            arrayList = new ArrayList(collectionSizeOrDefault16);
            Iterator<Integer> it3 = step16.iterator();
            while (it3.hasNext()) {
                int nextInt3 = ((IntIterator) it3).nextInt();
                until16 = RangesKt___RangesKt.until(nextInt3, nextInt3 + 2);
                slice16 = ArraysKt___ArraysKt.slice(args, until16);
                floatArray16 = CollectionsKt___CollectionsKt.toFloatArray(slice16);
                PathNode relativeLineTo = new PathNode.RelativeLineTo(floatArray16[0], floatArray16[1]);
                if ((relativeLineTo instanceof PathNode.MoveTo) && nextInt3 > 0) {
                    relativeLineTo = new PathNode.LineTo(floatArray16[0], floatArray16[1]);
                } else if ((relativeLineTo instanceof PathNode.RelativeMoveTo) && nextInt3 > 0) {
                    relativeLineTo = new PathNode.RelativeLineTo(floatArray16[0], floatArray16[1]);
                }
                arrayList.add(relativeLineTo);
            }
        } else if (c2 == 'L') {
            step15 = RangesKt___RangesKt.step(new IntRange(0, args.length - 2), 2);
            collectionSizeOrDefault15 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step15, 10);
            arrayList = new ArrayList(collectionSizeOrDefault15);
            Iterator<Integer> it4 = step15.iterator();
            while (it4.hasNext()) {
                int nextInt4 = ((IntIterator) it4).nextInt();
                until15 = RangesKt___RangesKt.until(nextInt4, nextInt4 + 2);
                slice15 = ArraysKt___ArraysKt.slice(args, until15);
                floatArray15 = CollectionsKt___CollectionsKt.toFloatArray(slice15);
                PathNode lineTo = new PathNode.LineTo(floatArray15[0], floatArray15[1]);
                if ((lineTo instanceof PathNode.MoveTo) && nextInt4 > 0) {
                    lineTo = new PathNode.LineTo(floatArray15[0], floatArray15[1]);
                } else if ((lineTo instanceof PathNode.RelativeMoveTo) && nextInt4 > 0) {
                    lineTo = new PathNode.RelativeLineTo(floatArray15[0], floatArray15[1]);
                }
                arrayList.add(lineTo);
            }
        } else if (c2 == 'h') {
            step14 = RangesKt___RangesKt.step(new IntRange(0, args.length - 1), 1);
            collectionSizeOrDefault14 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step14, 10);
            arrayList = new ArrayList(collectionSizeOrDefault14);
            Iterator<Integer> it5 = step14.iterator();
            while (it5.hasNext()) {
                int nextInt5 = ((IntIterator) it5).nextInt();
                until14 = RangesKt___RangesKt.until(nextInt5, nextInt5 + 1);
                slice14 = ArraysKt___ArraysKt.slice(args, until14);
                floatArray14 = CollectionsKt___CollectionsKt.toFloatArray(slice14);
                PathNode relativeHorizontalTo = new PathNode.RelativeHorizontalTo(floatArray14[0]);
                if ((relativeHorizontalTo instanceof PathNode.MoveTo) && nextInt5 > 0) {
                    relativeHorizontalTo = new PathNode.LineTo(floatArray14[0], floatArray14[1]);
                } else if ((relativeHorizontalTo instanceof PathNode.RelativeMoveTo) && nextInt5 > 0) {
                    relativeHorizontalTo = new PathNode.RelativeLineTo(floatArray14[0], floatArray14[1]);
                }
                arrayList.add(relativeHorizontalTo);
            }
        } else if (c2 == 'H') {
            step13 = RangesKt___RangesKt.step(new IntRange(0, args.length - 1), 1);
            collectionSizeOrDefault13 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step13, 10);
            arrayList = new ArrayList(collectionSizeOrDefault13);
            Iterator<Integer> it6 = step13.iterator();
            while (it6.hasNext()) {
                int nextInt6 = ((IntIterator) it6).nextInt();
                until13 = RangesKt___RangesKt.until(nextInt6, nextInt6 + 1);
                slice13 = ArraysKt___ArraysKt.slice(args, until13);
                floatArray13 = CollectionsKt___CollectionsKt.toFloatArray(slice13);
                PathNode horizontalTo = new PathNode.HorizontalTo(floatArray13[0]);
                if ((horizontalTo instanceof PathNode.MoveTo) && nextInt6 > 0) {
                    horizontalTo = new PathNode.LineTo(floatArray13[0], floatArray13[1]);
                } else if ((horizontalTo instanceof PathNode.RelativeMoveTo) && nextInt6 > 0) {
                    horizontalTo = new PathNode.RelativeLineTo(floatArray13[0], floatArray13[1]);
                }
                arrayList.add(horizontalTo);
            }
        } else if (c2 == 'v') {
            step12 = RangesKt___RangesKt.step(new IntRange(0, args.length - 1), 1);
            collectionSizeOrDefault12 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step12, 10);
            arrayList = new ArrayList(collectionSizeOrDefault12);
            Iterator<Integer> it7 = step12.iterator();
            while (it7.hasNext()) {
                int nextInt7 = ((IntIterator) it7).nextInt();
                until12 = RangesKt___RangesKt.until(nextInt7, nextInt7 + 1);
                slice12 = ArraysKt___ArraysKt.slice(args, until12);
                floatArray12 = CollectionsKt___CollectionsKt.toFloatArray(slice12);
                PathNode relativeVerticalTo = new PathNode.RelativeVerticalTo(floatArray12[0]);
                if ((relativeVerticalTo instanceof PathNode.MoveTo) && nextInt7 > 0) {
                    relativeVerticalTo = new PathNode.LineTo(floatArray12[0], floatArray12[1]);
                } else if ((relativeVerticalTo instanceof PathNode.RelativeMoveTo) && nextInt7 > 0) {
                    relativeVerticalTo = new PathNode.RelativeLineTo(floatArray12[0], floatArray12[1]);
                }
                arrayList.add(relativeVerticalTo);
            }
        } else if (c2 == 'V') {
            step11 = RangesKt___RangesKt.step(new IntRange(0, args.length - 1), 1);
            collectionSizeOrDefault11 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step11, 10);
            arrayList = new ArrayList(collectionSizeOrDefault11);
            Iterator<Integer> it8 = step11.iterator();
            while (it8.hasNext()) {
                int nextInt8 = ((IntIterator) it8).nextInt();
                until11 = RangesKt___RangesKt.until(nextInt8, nextInt8 + 1);
                slice11 = ArraysKt___ArraysKt.slice(args, until11);
                floatArray11 = CollectionsKt___CollectionsKt.toFloatArray(slice11);
                PathNode verticalTo = new PathNode.VerticalTo(floatArray11[0]);
                if ((verticalTo instanceof PathNode.MoveTo) && nextInt8 > 0) {
                    verticalTo = new PathNode.LineTo(floatArray11[0], floatArray11[1]);
                } else if ((verticalTo instanceof PathNode.RelativeMoveTo) && nextInt8 > 0) {
                    verticalTo = new PathNode.RelativeLineTo(floatArray11[0], floatArray11[1]);
                }
                arrayList.add(verticalTo);
            }
        } else {
            char c3 = 5;
            if (c2 == 'c') {
                step10 = RangesKt___RangesKt.step(new IntRange(0, args.length - 6), 6);
                collectionSizeOrDefault10 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step10, 10);
                arrayList = new ArrayList(collectionSizeOrDefault10);
                Iterator<Integer> it9 = step10.iterator();
                while (it9.hasNext()) {
                    int nextInt9 = ((IntIterator) it9).nextInt();
                    until10 = RangesKt___RangesKt.until(nextInt9, nextInt9 + 6);
                    slice10 = ArraysKt___ArraysKt.slice(args, until10);
                    floatArray10 = CollectionsKt___CollectionsKt.toFloatArray(slice10);
                    PathNode relativeCurveTo = new PathNode.RelativeCurveTo(floatArray10[0], floatArray10[1], floatArray10[2], floatArray10[3], floatArray10[4], floatArray10[c3]);
                    arrayList.add((!(relativeCurveTo instanceof PathNode.MoveTo) || nextInt9 <= 0) ? (!(relativeCurveTo instanceof PathNode.RelativeMoveTo) || nextInt9 <= 0) ? relativeCurveTo : new PathNode.RelativeLineTo(floatArray10[0], floatArray10[1]) : new PathNode.LineTo(floatArray10[0], floatArray10[1]));
                    c3 = 5;
                }
            } else if (c2 == 'C') {
                step9 = RangesKt___RangesKt.step(new IntRange(0, args.length - 6), 6);
                collectionSizeOrDefault9 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step9, 10);
                arrayList = new ArrayList(collectionSizeOrDefault9);
                Iterator<Integer> it10 = step9.iterator();
                while (it10.hasNext()) {
                    int nextInt10 = ((IntIterator) it10).nextInt();
                    until9 = RangesKt___RangesKt.until(nextInt10, nextInt10 + 6);
                    slice9 = ArraysKt___ArraysKt.slice(args, until9);
                    floatArray9 = CollectionsKt___CollectionsKt.toFloatArray(slice9);
                    PathNode curveTo = new PathNode.CurveTo(floatArray9[0], floatArray9[1], floatArray9[2], floatArray9[3], floatArray9[4], floatArray9[5]);
                    if ((curveTo instanceof PathNode.MoveTo) && nextInt10 > 0) {
                        curveTo = new PathNode.LineTo(floatArray9[0], floatArray9[1]);
                    } else if ((curveTo instanceof PathNode.RelativeMoveTo) && nextInt10 > 0) {
                        curveTo = new PathNode.RelativeLineTo(floatArray9[0], floatArray9[1]);
                    }
                    arrayList.add(curveTo);
                }
            } else if (c2 == 's') {
                step8 = RangesKt___RangesKt.step(new IntRange(0, args.length - 4), 4);
                collectionSizeOrDefault8 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step8, 10);
                arrayList = new ArrayList(collectionSizeOrDefault8);
                Iterator<Integer> it11 = step8.iterator();
                while (it11.hasNext()) {
                    int nextInt11 = ((IntIterator) it11).nextInt();
                    until8 = RangesKt___RangesKt.until(nextInt11, nextInt11 + 4);
                    slice8 = ArraysKt___ArraysKt.slice(args, until8);
                    floatArray8 = CollectionsKt___CollectionsKt.toFloatArray(slice8);
                    PathNode relativeReflectiveCurveTo = new PathNode.RelativeReflectiveCurveTo(floatArray8[0], floatArray8[1], floatArray8[2], floatArray8[3]);
                    if ((relativeReflectiveCurveTo instanceof PathNode.MoveTo) && nextInt11 > 0) {
                        relativeReflectiveCurveTo = new PathNode.LineTo(floatArray8[0], floatArray8[1]);
                    } else if ((relativeReflectiveCurveTo instanceof PathNode.RelativeMoveTo) && nextInt11 > 0) {
                        relativeReflectiveCurveTo = new PathNode.RelativeLineTo(floatArray8[0], floatArray8[1]);
                    }
                    arrayList.add(relativeReflectiveCurveTo);
                }
            } else if (c2 == 'S') {
                step7 = RangesKt___RangesKt.step(new IntRange(0, args.length - 4), 4);
                collectionSizeOrDefault7 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step7, 10);
                arrayList = new ArrayList(collectionSizeOrDefault7);
                Iterator<Integer> it12 = step7.iterator();
                while (it12.hasNext()) {
                    int nextInt12 = ((IntIterator) it12).nextInt();
                    until7 = RangesKt___RangesKt.until(nextInt12, nextInt12 + 4);
                    slice7 = ArraysKt___ArraysKt.slice(args, until7);
                    floatArray7 = CollectionsKt___CollectionsKt.toFloatArray(slice7);
                    PathNode reflectiveCurveTo = new PathNode.ReflectiveCurveTo(floatArray7[0], floatArray7[1], floatArray7[2], floatArray7[3]);
                    if ((reflectiveCurveTo instanceof PathNode.MoveTo) && nextInt12 > 0) {
                        reflectiveCurveTo = new PathNode.LineTo(floatArray7[0], floatArray7[1]);
                    } else if ((reflectiveCurveTo instanceof PathNode.RelativeMoveTo) && nextInt12 > 0) {
                        reflectiveCurveTo = new PathNode.RelativeLineTo(floatArray7[0], floatArray7[1]);
                    }
                    arrayList.add(reflectiveCurveTo);
                }
            } else if (c2 == 'q') {
                step6 = RangesKt___RangesKt.step(new IntRange(0, args.length - 4), 4);
                collectionSizeOrDefault6 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step6, 10);
                arrayList = new ArrayList(collectionSizeOrDefault6);
                Iterator<Integer> it13 = step6.iterator();
                while (it13.hasNext()) {
                    int nextInt13 = ((IntIterator) it13).nextInt();
                    until6 = RangesKt___RangesKt.until(nextInt13, nextInt13 + 4);
                    slice6 = ArraysKt___ArraysKt.slice(args, until6);
                    floatArray6 = CollectionsKt___CollectionsKt.toFloatArray(slice6);
                    PathNode relativeQuadTo = new PathNode.RelativeQuadTo(floatArray6[0], floatArray6[1], floatArray6[2], floatArray6[3]);
                    if ((relativeQuadTo instanceof PathNode.MoveTo) && nextInt13 > 0) {
                        relativeQuadTo = new PathNode.LineTo(floatArray6[0], floatArray6[1]);
                    } else if ((relativeQuadTo instanceof PathNode.RelativeMoveTo) && nextInt13 > 0) {
                        relativeQuadTo = new PathNode.RelativeLineTo(floatArray6[0], floatArray6[1]);
                    }
                    arrayList.add(relativeQuadTo);
                }
            } else if (c2 == 'Q') {
                step5 = RangesKt___RangesKt.step(new IntRange(0, args.length - 4), 4);
                collectionSizeOrDefault5 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step5, 10);
                arrayList = new ArrayList(collectionSizeOrDefault5);
                Iterator<Integer> it14 = step5.iterator();
                while (it14.hasNext()) {
                    int nextInt14 = ((IntIterator) it14).nextInt();
                    until5 = RangesKt___RangesKt.until(nextInt14, nextInt14 + 4);
                    slice5 = ArraysKt___ArraysKt.slice(args, until5);
                    floatArray5 = CollectionsKt___CollectionsKt.toFloatArray(slice5);
                    PathNode quadTo = new PathNode.QuadTo(floatArray5[0], floatArray5[1], floatArray5[2], floatArray5[3]);
                    if ((quadTo instanceof PathNode.MoveTo) && nextInt14 > 0) {
                        quadTo = new PathNode.LineTo(floatArray5[0], floatArray5[1]);
                    } else if ((quadTo instanceof PathNode.RelativeMoveTo) && nextInt14 > 0) {
                        quadTo = new PathNode.RelativeLineTo(floatArray5[0], floatArray5[1]);
                    }
                    arrayList.add(quadTo);
                }
            } else if (c2 == 't') {
                step4 = RangesKt___RangesKt.step(new IntRange(0, args.length - 2), 2);
                collectionSizeOrDefault4 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step4, 10);
                arrayList = new ArrayList(collectionSizeOrDefault4);
                Iterator<Integer> it15 = step4.iterator();
                while (it15.hasNext()) {
                    int nextInt15 = ((IntIterator) it15).nextInt();
                    until4 = RangesKt___RangesKt.until(nextInt15, nextInt15 + 2);
                    slice4 = ArraysKt___ArraysKt.slice(args, until4);
                    floatArray4 = CollectionsKt___CollectionsKt.toFloatArray(slice4);
                    PathNode relativeReflectiveQuadTo = new PathNode.RelativeReflectiveQuadTo(floatArray4[0], floatArray4[1]);
                    if ((relativeReflectiveQuadTo instanceof PathNode.MoveTo) && nextInt15 > 0) {
                        relativeReflectiveQuadTo = new PathNode.LineTo(floatArray4[0], floatArray4[1]);
                    } else if ((relativeReflectiveQuadTo instanceof PathNode.RelativeMoveTo) && nextInt15 > 0) {
                        relativeReflectiveQuadTo = new PathNode.RelativeLineTo(floatArray4[0], floatArray4[1]);
                    }
                    arrayList.add(relativeReflectiveQuadTo);
                }
            } else if (c2 == 'T') {
                step3 = RangesKt___RangesKt.step(new IntRange(0, args.length - 2), 2);
                collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step3, 10);
                arrayList = new ArrayList(collectionSizeOrDefault3);
                Iterator<Integer> it16 = step3.iterator();
                while (it16.hasNext()) {
                    int nextInt16 = ((IntIterator) it16).nextInt();
                    until3 = RangesKt___RangesKt.until(nextInt16, nextInt16 + 2);
                    slice3 = ArraysKt___ArraysKt.slice(args, until3);
                    floatArray3 = CollectionsKt___CollectionsKt.toFloatArray(slice3);
                    PathNode reflectiveQuadTo = new PathNode.ReflectiveQuadTo(floatArray3[0], floatArray3[1]);
                    if ((reflectiveQuadTo instanceof PathNode.MoveTo) && nextInt16 > 0) {
                        reflectiveQuadTo = new PathNode.LineTo(floatArray3[0], floatArray3[1]);
                    } else if ((reflectiveQuadTo instanceof PathNode.RelativeMoveTo) && nextInt16 > 0) {
                        reflectiveQuadTo = new PathNode.RelativeLineTo(floatArray3[0], floatArray3[1]);
                    }
                    arrayList.add(reflectiveQuadTo);
                }
            } else if (c2 == 'a') {
                step2 = RangesKt___RangesKt.step(new IntRange(0, args.length - 7), 7);
                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step2, 10);
                arrayList = new ArrayList(collectionSizeOrDefault2);
                Iterator<Integer> it17 = step2.iterator();
                while (it17.hasNext()) {
                    int nextInt17 = ((IntIterator) it17).nextInt();
                    until2 = RangesKt___RangesKt.until(nextInt17, nextInt17 + 7);
                    slice2 = ArraysKt___ArraysKt.slice(args, until2);
                    floatArray2 = CollectionsKt___CollectionsKt.toFloatArray(slice2);
                    PathNode relativeArcTo = new PathNode.RelativeArcTo(floatArray2[0], floatArray2[1], floatArray2[2], Float.compare(floatArray2[3], 0.0f) != 0, Float.compare(floatArray2[4], 0.0f) != 0, floatArray2[5], floatArray2[6]);
                    if ((relativeArcTo instanceof PathNode.MoveTo) && nextInt17 > 0) {
                        relativeArcTo = new PathNode.LineTo(floatArray2[0], floatArray2[1]);
                    } else if ((relativeArcTo instanceof PathNode.RelativeMoveTo) && nextInt17 > 0) {
                        relativeArcTo = new PathNode.RelativeLineTo(floatArray2[0], floatArray2[1]);
                    }
                    arrayList.add(relativeArcTo);
                }
            } else if (c2 != 'A') {
                throw new IllegalArgumentException(Intrinsics.stringPlus("Unknown command for: ", Character.valueOf(c2)));
            } else {
                step = RangesKt___RangesKt.step(new IntRange(0, args.length - 7), 7);
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(step, 10);
                arrayList = new ArrayList(collectionSizeOrDefault);
                Iterator<Integer> it18 = step.iterator();
                while (it18.hasNext()) {
                    int nextInt18 = ((IntIterator) it18).nextInt();
                    until = RangesKt___RangesKt.until(nextInt18, nextInt18 + 7);
                    slice = ArraysKt___ArraysKt.slice(args, until);
                    floatArray = CollectionsKt___CollectionsKt.toFloatArray(slice);
                    PathNode arcTo = new PathNode.ArcTo(floatArray[0], floatArray[1], floatArray[2], Float.compare(floatArray[3], 0.0f) != 0, Float.compare(floatArray[4], 0.0f) != 0, floatArray[5], floatArray[6]);
                    if ((arcTo instanceof PathNode.MoveTo) && nextInt18 > 0) {
                        arcTo = new PathNode.LineTo(floatArray[0], floatArray[1]);
                    } else if ((arcTo instanceof PathNode.RelativeMoveTo) && nextInt18 > 0) {
                        arcTo = new PathNode.RelativeLineTo(floatArray[0], floatArray[1]);
                    }
                    arrayList.add(arcTo);
                }
            }
        }
        return arrayList;
    }
}
