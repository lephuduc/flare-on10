package androidx.compose.ui.text.input;

import androidx.appcompat.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a2\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0002¨\u0006\t"}, d2 = {"toCharArray", "", "", FirebaseAnalytics.Param.DESTINATION, "", "destinationOffset", "", "startIndex", "endIndex", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class GapBufferKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void toCharArray(String str, char[] cArr, int i2, int i3, int i4) {
        for (int i5 = i3; i5 < i4; i5++) {
            cArr[(i2 + i5) - i3] = str.charAt(i5);
        }
    }

    public static /* synthetic */ void toCharArray$default(String str, char[] cArr, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = str.length();
        }
        toCharArray(str, cArr, i2, i3, i4);
    }
}