package p;

import androidx.appcompat.R;
import j.i2;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import org.jetbrains.annotations.NotNull;

@i2
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J,\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H&¨\u0006\n"}, d2 = {"Lp/r;", "T", "Lo/i;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Ll/m;", "onBufferOverflow", "b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public interface r<T> extends o.i<T> {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class a {
        public static /* synthetic */ o.i a(r rVar, CoroutineContext coroutineContext, int i2, l.m mVar, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 1) != 0) {
                    coroutineContext = EmptyCoroutineContext.INSTANCE;
                }
                if ((i3 & 2) != 0) {
                    i2 = -3;
                }
                if ((i3 & 4) != 0) {
                    mVar = l.m.SUSPEND;
                }
                return rVar.b(coroutineContext, i2, mVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
        }
    }

    @NotNull
    o.i<T> b(@NotNull CoroutineContext coroutineContext, int i2, @NotNull l.m mVar);
}
