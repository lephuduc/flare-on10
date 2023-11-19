package q;

import j.p1;
import j.z2;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\b\u0010!\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b(\u0010)J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u001b\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000b2\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u00122\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0016J\u001e\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001d\u001a\u00020\rH\u0002R\u0016\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u0004\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Lq/g0;", "Lj/z2;", "Lj/e1;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "isDispatchNeeded", "", "parallelism", "Lj/o0;", "limitedParallelism", "", "time", "", "p", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "timeMillis", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lj/p1;", "o", "t", "Lj/q;", "", "continuation", "w", "", "toString", "v", "", "j", "Ljava/lang/Throwable;", "cause", "k", "Ljava/lang/String;", "errorHint", "q", "()Lj/z2;", "immediate", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class g0 extends z2 implements j.e1 {
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public final Throwable f2013j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    public final String f2014k;

    public g0(@Nullable Throwable th, @Nullable String str) {
        this.f2013j = th;
        this.f2014k = str;
    }

    public /* synthetic */ g0(Throwable th, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i2 & 2) != 0 ? null : str);
    }

    @Override // j.o0
    public boolean isDispatchNeeded(@NotNull CoroutineContext coroutineContext) {
        v();
        throw new KotlinNothingValueException();
    }

    @Override // j.z2, j.o0
    @NotNull
    public j.o0 limitedParallelism(int i2) {
        v();
        throw new KotlinNothingValueException();
    }

    @Override // j.e1
    @NotNull
    public p1 o(long j2, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        v();
        throw new KotlinNothingValueException();
    }

    @Override // j.e1
    @Nullable
    public Object p(long j2, @NotNull Continuation<?> continuation) {
        v();
        throw new KotlinNothingValueException();
    }

    @Override // j.z2
    @NotNull
    public z2 q() {
        return this;
    }

    @Override // j.o0
    @NotNull
    /* renamed from: t */
    public Void dispatch(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        v();
        throw new KotlinNothingValueException();
    }

    @Override // j.z2, j.o0
    @NotNull
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        if (this.f2013j != null) {
            str = ", cause=" + this.f2013j;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r1 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Void v() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.f2013j
            if (r0 == 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.f2014k
            if (r1 == 0) goto L25
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L27
        L25:
            java.lang.String r1 = ""
        L27:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r4 = r4.f2013j
            r1.<init>(r0, r4)
            throw r1
        L36:
            q.f0.e()
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q.g0.v():java.lang.Void");
    }

    @Override // j.e1
    @NotNull
    /* renamed from: w */
    public Void i(long j2, @NotNull j.q<? super Unit> qVar) {
        v();
        throw new KotlinNothingValueException();
    }
}
