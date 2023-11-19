package j;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u0007B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u001f\u0010 J\r\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u001a\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lj/x3;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "Lkotlinx/coroutines/CompletionHandler;", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "()V", "a", "c", "(Ljava/lang/Throwable;)V", "", "state", "", "b", "(I)Ljava/lang/Void;", "Lj/n2;", "j", "Lj/n2;", "job", "Ljava/lang/Thread;", "kotlin.jvm.PlatformType", "k", "Ljava/lang/Thread;", "targetThread", "Lj/p1;", "l", "Lj/p1;", "cancelHandle", "<init>", "(Lj/n2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class x3 implements Function1<Throwable, Unit> {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f575m = AtomicIntegerFieldUpdater.newUpdater(x3.class, "_state");
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    public final n2 f576j;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    public p1 f578l;
    @NotNull
    private volatile /* synthetic */ int _state = 0;

    /* renamed from: k  reason: collision with root package name */
    public final Thread f577k = Thread.currentThread();

    public x3(@NotNull n2 n2Var) {
        this.f576j = n2Var;
    }

    public final void a() {
        while (true) {
            int i2 = this._state;
            if (i2 != 0) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        b(i2);
                        throw new KotlinNothingValueException();
                    }
                }
            } else if (f575m.compareAndSet(this, i2, 1)) {
                p1 p1Var = this.f578l;
                if (p1Var != null) {
                    p1Var.dispose();
                    return;
                }
                return;
            }
        }
    }

    public final Void b(int i2) {
        throw new IllegalStateException(("Illegal state " + i2).toString());
    }

    public void c(@Nullable Throwable th) {
        int i2;
        do {
            i2 = this._state;
            if (i2 != 0) {
                if (i2 == 1 || i2 == 2 || i2 == 3) {
                    return;
                }
                b(i2);
                throw new KotlinNothingValueException();
            }
        } while (!f575m.compareAndSet(this, i2, 2));
        this.f577k.interrupt();
        this._state = 3;
    }

    public final void d() {
        int i2;
        this.f578l = this.f576j.r(true, true, this);
        do {
            i2 = this._state;
            if (i2 != 0) {
                if (i2 == 2 || i2 == 3) {
                    return;
                }
                b(i2);
                throw new KotlinNothingValueException();
            }
        } while (!f575m.compareAndSet(this, i2, 0));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        c(th);
        return Unit.INSTANCE;
    }
}
