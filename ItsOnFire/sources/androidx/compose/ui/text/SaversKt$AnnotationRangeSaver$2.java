package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.text.AnnotatedString;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/AnnotatedString$Range;", "", "it", "invoke"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SaversKt$AnnotationRangeSaver$2 extends Lambda implements Function1<Object, AnnotatedString.Range<? extends Object>> {
    public static final SaversKt$AnnotationRangeSaver$2 INSTANCE = new SaversKt$AnnotationRangeSaver$2();

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnnotationType.values().length];
            iArr[AnnotationType.Paragraph.ordinal()] = 1;
            iArr[AnnotationType.Span.ordinal()] = 2;
            iArr[AnnotationType.VerbatimTts.ordinal()] = 3;
            iArr[AnnotationType.String.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SaversKt$AnnotationRangeSaver$2() {
        super(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final AnnotatedString.Range<? extends Object> invoke(@NotNull Object it) {
        Saver saver;
        Intrinsics.checkNotNullParameter(it, "it");
        List list = (List) it;
        Object obj = list.get(0);
        AnnotationType annotationType = obj == null ? null : (AnnotationType) obj;
        Intrinsics.checkNotNull(annotationType);
        Object obj2 = list.get(2);
        Integer num = obj2 == null ? null : (Integer) obj2;
        Intrinsics.checkNotNull(num);
        int intValue = num.intValue();
        Object obj3 = list.get(3);
        Integer num2 = obj3 == null ? null : (Integer) obj3;
        Intrinsics.checkNotNull(num2);
        int intValue2 = num2.intValue();
        Object obj4 = list.get(4);
        String str = obj4 == null ? null : (String) obj4;
        Intrinsics.checkNotNull(str);
        int i2 = WhenMappings.$EnumSwitchMapping$0[annotationType.ordinal()];
        if (i2 == 1) {
            Object obj5 = list.get(1);
            Saver<ParagraphStyle, Object> paragraphStyleSaver = SaversKt.getParagraphStyleSaver();
            if (!Intrinsics.areEqual(obj5, Boolean.FALSE) && obj5 != null) {
                r0 = (ParagraphStyle) paragraphStyleSaver.restore(obj5);
            }
            Intrinsics.checkNotNull(r0);
            return new AnnotatedString.Range<>(r0, intValue, intValue2, str);
        } else if (i2 == 2) {
            Object obj6 = list.get(1);
            Saver<SpanStyle, Object> spanStyleSaver = SaversKt.getSpanStyleSaver();
            if (!Intrinsics.areEqual(obj6, Boolean.FALSE) && obj6 != null) {
                r0 = (SpanStyle) spanStyleSaver.restore(obj6);
            }
            Intrinsics.checkNotNull(r0);
            return new AnnotatedString.Range<>(r0, intValue, intValue2, str);
        } else if (i2 != 3) {
            if (i2 == 4) {
                Object obj7 = list.get(1);
                r0 = obj7 != null ? (String) obj7 : null;
                Intrinsics.checkNotNull(r0);
                return new AnnotatedString.Range<>(r0, intValue, intValue2, str);
            }
            throw new NoWhenBranchMatchedException();
        } else {
            Object obj8 = list.get(1);
            saver = SaversKt.VerbatimTtsAnnotationSaver;
            if (!Intrinsics.areEqual(obj8, Boolean.FALSE) && obj8 != null) {
                r0 = (VerbatimTtsAnnotation) saver.restore(obj8);
            }
            Intrinsics.checkNotNull(r0);
            return new AnnotatedString.Range<>(r0, intValue, intValue2, str);
        }
    }
}
