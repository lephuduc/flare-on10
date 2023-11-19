package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.AnnotatedString;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/ui/text/AnnotatedString;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SaversKt$AnnotatedStringSaver$1 extends Lambda implements Function2<SaverScope, AnnotatedString, Object> {
    public static final SaversKt$AnnotatedStringSaver$1 INSTANCE = new SaversKt$AnnotatedStringSaver$1();

    public SaversKt$AnnotatedStringSaver$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull SaverScope Saver, @NotNull AnnotatedString it) {
        Saver saver;
        Saver saver2;
        Saver saver3;
        ArrayList arrayListOf;
        Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
        Intrinsics.checkNotNullParameter(it, "it");
        List<AnnotatedString.Range<SpanStyle>> spanStyles = it.getSpanStyles();
        saver = SaversKt.AnnotationRangeListSaver;
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStyles = it.getParagraphStyles();
        saver2 = SaversKt.AnnotationRangeListSaver;
        List<AnnotatedString.Range<? extends Object>> annotations$ui_text_release = it.getAnnotations$ui_text_release();
        saver3 = SaversKt.AnnotationRangeListSaver;
        arrayListOf = CollectionsKt__CollectionsKt.arrayListOf(SaversKt.save(it.getText()), SaversKt.save(spanStyles, saver, Saver), SaversKt.save(paragraphStyles, saver2, Saver), SaversKt.save(annotations$ui_text_release, saver3, Saver));
        return arrayListOf;
    }
}
