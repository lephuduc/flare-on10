package o;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¨\u0006\b"}, d2 = {"Lo/o0;", "", "Lo/t0;", "", "subscriptionCount", "Lo/i;", "Lo/m0;", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public interface o0 {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final a f1423a = a.f1424a;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\u0010"}, d2 = {"Lo/o0$a;", "", "", "stopTimeoutMillis", "replayExpirationMillis", "Lo/o0;", "a", "b", "Lo/o0;", "c", "()Lo/o0;", "Eagerly", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "Lazily", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f1424a = new a();
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public static final o0 f1425b = new q0();
        @NotNull

        /* renamed from: c  reason: collision with root package name */
        public static final o0 f1426c = new r0();

        public static /* synthetic */ o0 b(a aVar, long j2, long j3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                j2 = 0;
            }
            if ((i2 & 2) != 0) {
                j3 = Long.MAX_VALUE;
            }
            return aVar.a(j2, j3);
        }

        @NotNull
        public final o0 a(long j2, long j3) {
            return new s0(j2, j3);
        }

        @NotNull
        public final o0 c() {
            return f1425b;
        }

        @NotNull
        public final o0 d() {
            return f1426c;
        }
    }

    @NotNull
    i<m0> a(@NotNull t0<Integer> t0Var);
}
