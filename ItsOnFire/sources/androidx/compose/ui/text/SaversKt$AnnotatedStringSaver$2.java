package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/AnnotatedString;", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SaversKt$AnnotatedStringSaver$2 extends Lambda implements Function1<Object, AnnotatedString> {
    public static final SaversKt$AnnotatedStringSaver$2 INSTANCE = new SaversKt$AnnotatedStringSaver$2();

    public SaversKt$AnnotatedStringSaver$2() {
        super(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final AnnotatedString invoke(@NotNull Object it) {
        Saver saver;
        Saver saver2;
        Saver saver3;
        Intrinsics.checkNotNullParameter(it, "it");
        List list = (List) it;
        Object obj = list.get(0);
        List list2 = null;
        String str = obj == null ? null : (String) obj;
        Intrinsics.checkNotNull(str);
        Object obj2 = list.get(1);
        saver = SaversKt.AnnotationRangeListSaver;
        Boolean bool = Boolean.FALSE;
        List list3 = (Intrinsics.areEqual(obj2, bool) || obj2 == null) ? null : (List) saver.restore(obj2);
        Intrinsics.checkNotNull(list3);
        Object obj3 = list.get(2);
        saver2 = SaversKt.AnnotationRangeListSaver;
        List list4 = (Intrinsics.areEqual(obj3, bool) || obj3 == null) ? null : (List) saver2.restore(obj3);
        Intrinsics.checkNotNull(list4);
        Object obj4 = list.get(3);
        saver3 = SaversKt.AnnotationRangeListSaver;
        if (!Intrinsics.areEqual(obj4, bool) && obj4 != null) {
            list2 = (List) saver3.restore(obj4);
        }
        Intrinsics.checkNotNull(list2);
        return new AnnotatedString(str, list3, list4, list2);
    }
}
