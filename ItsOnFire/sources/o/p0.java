package o;

import kotlin.Metadata;
import kotlin.time.Duration;
import o.o0;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, d2 = {"Lo/o0$a;", "Lkotlin/time/Duration;", "stopTimeout", "replayExpiration", "Lo/o0;", "a", "(Lo/o0$a;JJ)Lo/o0;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class p0 {
    @NotNull
    public static final o0 a(@NotNull o0.a aVar, long j2, long j3) {
        return new s0(Duration.m4926getInWholeMillisecondsimpl(j2), Duration.m4926getInWholeMillisecondsimpl(j3));
    }

    public static /* synthetic */ o0 b(o0.a aVar, long j2, long j3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = Duration.Companion.m5010getZEROUwyO8pc();
        }
        if ((i2 & 2) != 0) {
            j3 = Duration.Companion.m5008getINFINITEUwyO8pc();
        }
        return a(aVar, j2, j3);
    }
}
