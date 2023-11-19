package androidx.compose.ui.tooling.preview.datasource;

import androidx.appcompat.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LoremIpsum$generateLoremIpsum$1 extends Lambda implements Function0<String> {
    public final /* synthetic */ int $loremIpsumMaxSize;
    public final /* synthetic */ Ref.IntRef $wordsUsed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoremIpsum$generateLoremIpsum$1(Ref.IntRef intRef, int i2) {
        super(0);
        this.$wordsUsed = intRef;
        this.$loremIpsumMaxSize = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final String invoke() {
        List list;
        list = LoremIpsumKt.LOREM_IPSUM_SOURCE;
        Ref.IntRef intRef = this.$wordsUsed;
        int i2 = intRef.element;
        intRef.element = i2 + 1;
        return (String) list.get(i2 % this.$loremIpsumMaxSize);
    }
}
