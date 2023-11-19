package androidx.compose.ui.text.input;

import androidx.appcompat.R;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0006"}, d2 = {"updateRangeAfterDelete", "Landroidx/compose/ui/text/TextRange;", "target", "deleted", "updateRangeAfterDelete-pWDy79M", "(JJ)J", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class EditingBufferKt {
    /* renamed from: updateRangeAfterDelete-pWDy79M  reason: not valid java name */
    public static final long m3133updateRangeAfterDeletepWDy79M(long j2, long j3) {
        int m3073getMinimpl = TextRange.m3073getMinimpl(j2);
        int m3072getMaximpl = TextRange.m3072getMaximpl(j2);
        if (TextRange.m3077intersects5zctL8(j3, j2)) {
            if (TextRange.m3065contains5zctL8(j3, j2)) {
                m3073getMinimpl = TextRange.m3073getMinimpl(j3);
                m3072getMaximpl = m3073getMinimpl;
            } else {
                if (!TextRange.m3065contains5zctL8(j2, j3)) {
                    if (TextRange.m3066containsimpl(j3, m3073getMinimpl)) {
                        m3073getMinimpl = TextRange.m3073getMinimpl(j3);
                    } else {
                        m3072getMaximpl = TextRange.m3073getMinimpl(j3);
                    }
                }
                m3072getMaximpl -= TextRange.m3071getLengthimpl(j3);
            }
        } else if (m3072getMaximpl > TextRange.m3073getMinimpl(j3)) {
            m3073getMinimpl -= TextRange.m3071getLengthimpl(j3);
            m3072getMaximpl -= TextRange.m3071getLengthimpl(j3);
        }
        return TextRangeKt.TextRange(m3073getMinimpl, m3072getMaximpl);
    }
}
