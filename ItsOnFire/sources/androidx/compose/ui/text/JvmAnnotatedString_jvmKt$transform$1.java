package androidx.compose.ui.text;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "", "invoke", "(Ljava/util/List;)Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class JvmAnnotatedString_jvmKt$transform$1 extends Lambda implements Function1<List<? extends Integer>, Integer> {
    public final /* synthetic */ Map<Integer, Integer> $offsetMap;
    public final /* synthetic */ Ref.ObjectRef<String> $resultStr;
    public final /* synthetic */ AnnotatedString $this_transform;
    public final /* synthetic */ Function3<String, Integer, Integer, String> $transform;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public JvmAnnotatedString_jvmKt$transform$1(Ref.ObjectRef<String> objectRef, Function3<? super String, ? super Integer, ? super Integer, String> function3, AnnotatedString annotatedString, Map<Integer, Integer> map) {
        super(1);
        this.$resultStr = objectRef;
        this.$transform = function3;
        this.$this_transform = annotatedString;
        this.$offsetMap = map;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.String] */
    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Integer invoke2(@NotNull List<Integer> dstr$start$end) {
        Intrinsics.checkNotNullParameter(dstr$start$end, "$dstr$start$end");
        int intValue = dstr$start$end.get(0).intValue();
        int intValue2 = dstr$start$end.get(1).intValue();
        Ref.ObjectRef<String> objectRef = this.$resultStr;
        objectRef.element = Intrinsics.stringPlus(objectRef.element, this.$transform.invoke(this.$this_transform.getText(), Integer.valueOf(intValue), Integer.valueOf(intValue2)));
        return this.$offsetMap.put(Integer.valueOf(intValue2), Integer.valueOf(this.$resultStr.element.length()));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Integer invoke(List<? extends Integer> list) {
        return invoke2((List<Integer>) list);
    }
}
