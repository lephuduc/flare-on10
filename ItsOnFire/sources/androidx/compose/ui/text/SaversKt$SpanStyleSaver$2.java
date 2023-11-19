package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/SpanStyle;", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SaversKt$SpanStyleSaver$2 extends Lambda implements Function1<Object, SpanStyle> {
    public static final SaversKt$SpanStyleSaver$2 INSTANCE = new SaversKt$SpanStyleSaver$2();

    public SaversKt$SpanStyleSaver$2() {
        super(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final SpanStyle invoke(@NotNull Object it) {
        FontWeight restore;
        BaselineShift restore2;
        TextGeometricTransform restore3;
        LocaleList restore4;
        TextDecoration restore5;
        Intrinsics.checkNotNullParameter(it, "it");
        List list = (List) it;
        Object obj = list.get(0);
        Color.Companion companion = Color.Companion;
        Saver<Color, Object> saver = SaversKt.getSaver(companion);
        Boolean bool = Boolean.FALSE;
        Shadow shadow = null;
        Color restore6 = (Intrinsics.areEqual(obj, bool) || obj == null) ? null : saver.restore(obj);
        Intrinsics.checkNotNull(restore6);
        long m1402unboximpl = restore6.m1402unboximpl();
        Object obj2 = list.get(1);
        TextUnit.Companion companion2 = TextUnit.Companion;
        TextUnit restore7 = (Intrinsics.areEqual(obj2, bool) || obj2 == null) ? null : SaversKt.getSaver(companion2).restore(obj2);
        Intrinsics.checkNotNull(restore7);
        long m3515unboximpl = restore7.m3515unboximpl();
        Object obj3 = list.get(2);
        Saver<FontWeight, Object> saver2 = SaversKt.getSaver(FontWeight.Companion);
        if (Intrinsics.areEqual(obj3, bool)) {
            restore = null;
        } else {
            restore = obj3 == null ? null : saver2.restore(obj3);
        }
        Object obj4 = list.get(3);
        FontStyle fontStyle = obj4 == null ? null : (FontStyle) obj4;
        Object obj5 = list.get(4);
        FontSynthesis fontSynthesis = obj5 == null ? null : (FontSynthesis) obj5;
        Object obj6 = list.get(6);
        String str = obj6 == null ? null : (String) obj6;
        Object obj7 = list.get(7);
        TextUnit restore8 = (Intrinsics.areEqual(obj7, bool) || obj7 == null) ? null : SaversKt.getSaver(companion2).restore(obj7);
        Intrinsics.checkNotNull(restore8);
        long m3515unboximpl2 = restore8.m3515unboximpl();
        Object obj8 = list.get(8);
        Saver<BaselineShift, Object> saver3 = SaversKt.getSaver(BaselineShift.Companion);
        if (Intrinsics.areEqual(obj8, bool)) {
            restore2 = null;
        } else {
            restore2 = obj8 == null ? null : saver3.restore(obj8);
        }
        Object obj9 = list.get(9);
        Saver<TextGeometricTransform, Object> saver4 = SaversKt.getSaver(TextGeometricTransform.Companion);
        if (Intrinsics.areEqual(obj9, bool)) {
            restore3 = null;
        } else {
            restore3 = obj9 == null ? null : saver4.restore(obj9);
        }
        Object obj10 = list.get(10);
        Saver<LocaleList, Object> saver5 = SaversKt.getSaver(LocaleList.Companion);
        if (Intrinsics.areEqual(obj10, bool)) {
            restore4 = null;
        } else {
            restore4 = obj10 == null ? null : saver5.restore(obj10);
        }
        Object obj11 = list.get(11);
        Color restore9 = (Intrinsics.areEqual(obj11, bool) || obj11 == null) ? null : SaversKt.getSaver(companion).restore(obj11);
        Intrinsics.checkNotNull(restore9);
        long m1402unboximpl2 = restore9.m1402unboximpl();
        Object obj12 = list.get(12);
        Saver<TextDecoration, Object> saver6 = SaversKt.getSaver(TextDecoration.Companion);
        if (Intrinsics.areEqual(obj12, bool)) {
            restore5 = null;
        } else {
            restore5 = obj12 == null ? null : saver6.restore(obj12);
        }
        Object obj13 = list.get(13);
        Saver<Shadow, Object> saver7 = SaversKt.getSaver(Shadow.Companion);
        if (!Intrinsics.areEqual(obj13, bool) && obj13 != null) {
            shadow = saver7.restore(obj13);
        }
        return new SpanStyle(m1402unboximpl, m3515unboximpl, restore, fontStyle, fontSynthesis, null, str, m3515unboximpl2, restore2, restore3, restore4, m1402unboximpl2, restore5, shadow, 32, null);
    }
}
