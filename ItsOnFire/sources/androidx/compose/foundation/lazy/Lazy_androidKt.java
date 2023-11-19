package androidx.compose.foundation.lazy;

import androidx.appcompat.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"getDefaultLazyKeyFor", "", FirebaseAnalytics.Param.INDEX, "", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class Lazy_androidKt {
    @NotNull
    public static final Object getDefaultLazyKeyFor(int i2) {
        return new DefaultLazyKey(i2);
    }
}
