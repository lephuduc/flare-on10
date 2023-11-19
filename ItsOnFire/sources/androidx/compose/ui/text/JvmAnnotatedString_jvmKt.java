package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a0\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002\u001a,\u0010\t\u001a\u00020\n*\u00020\n2\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u000bH\u0000¨\u0006\r"}, d2 = {"collectRangeTransitions", "", "T", "ranges", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "target", "Ljava/util/SortedSet;", "", "transform", "Landroidx/compose/ui/text/AnnotatedString;", "Lkotlin/Function3;", "", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class JvmAnnotatedString_jvmKt {
    private static final <T> void collectRangeTransitions(List<AnnotatedString.Range<T>> list, SortedSet<Integer> sortedSet) {
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            AnnotatedString.Range<T> range = list.get(i2);
            sortedSet.add(Integer.valueOf(range.getStart()));
            sortedSet.add(Integer.valueOf(range.getEnd()));
            i2 = i3;
        }
    }

    @NotNull
    public static final AnnotatedString transform(@NotNull AnnotatedString annotatedString, @NotNull Function3<? super String, ? super Integer, ? super Integer, String> transform) {
        TreeSet sortedSetOf;
        Map mutableMapOf;
        Intrinsics.checkNotNullParameter(annotatedString, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i2 = 0;
        sortedSetOf = SetsKt__SetsJVMKt.sortedSetOf(0, Integer.valueOf(annotatedString.getText().length()));
        collectRangeTransitions(annotatedString.getSpanStyles(), sortedSetOf);
        collectRangeTransitions(annotatedString.getParagraphStyles(), sortedSetOf);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        mutableMapOf = MapsKt__MapsKt.mutableMapOf(TuplesKt.to(0, 0));
        CollectionsKt___CollectionsKt.windowed$default(sortedSetOf, 2, 0, false, new JvmAnnotatedString_jvmKt$transform$1(objectRef, transform, annotatedString, mutableMapOf), 6, null);
        List<AnnotatedString.Range<SpanStyle>> spanStyles = annotatedString.getSpanStyles();
        ArrayList arrayList = new ArrayList(spanStyles.size());
        int size = spanStyles.size();
        int i3 = 0;
        while (i3 < size) {
            int i4 = i3 + 1;
            AnnotatedString.Range<SpanStyle> range = spanStyles.get(i3);
            SpanStyle item = range.getItem();
            Object obj = mutableMapOf.get(Integer.valueOf(range.getStart()));
            Intrinsics.checkNotNull(obj);
            int intValue = ((Number) obj).intValue();
            Object obj2 = mutableMapOf.get(Integer.valueOf(range.getEnd()));
            Intrinsics.checkNotNull(obj2);
            arrayList.add(new AnnotatedString.Range(item, intValue, ((Number) obj2).intValue()));
            i3 = i4;
        }
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStyles = annotatedString.getParagraphStyles();
        ArrayList arrayList2 = new ArrayList(paragraphStyles.size());
        int size2 = paragraphStyles.size();
        int i5 = 0;
        while (i5 < size2) {
            int i6 = i5 + 1;
            AnnotatedString.Range<ParagraphStyle> range2 = paragraphStyles.get(i5);
            ParagraphStyle item2 = range2.getItem();
            Object obj3 = mutableMapOf.get(Integer.valueOf(range2.getStart()));
            Intrinsics.checkNotNull(obj3);
            int intValue2 = ((Number) obj3).intValue();
            Object obj4 = mutableMapOf.get(Integer.valueOf(range2.getEnd()));
            Intrinsics.checkNotNull(obj4);
            arrayList2.add(new AnnotatedString.Range(item2, intValue2, ((Number) obj4).intValue()));
            i5 = i6;
        }
        List<AnnotatedString.Range<? extends Object>> annotations$ui_text_release = annotatedString.getAnnotations$ui_text_release();
        ArrayList arrayList3 = new ArrayList(annotations$ui_text_release.size());
        int size3 = annotations$ui_text_release.size();
        while (i2 < size3) {
            int i7 = i2 + 1;
            AnnotatedString.Range<? extends Object> range3 = annotations$ui_text_release.get(i2);
            Object item3 = range3.getItem();
            Object obj5 = mutableMapOf.get(Integer.valueOf(range3.getStart()));
            Intrinsics.checkNotNull(obj5);
            int intValue3 = ((Number) obj5).intValue();
            Object obj6 = mutableMapOf.get(Integer.valueOf(range3.getEnd()));
            Intrinsics.checkNotNull(obj6);
            arrayList3.add(new AnnotatedString.Range(item3, intValue3, ((Number) obj6).intValue()));
            i2 = i7;
        }
        return new AnnotatedString((String) objectRef.element, arrayList, arrayList2, arrayList3);
    }
}
