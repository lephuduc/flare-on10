package l;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import j.p1;
import j.q;
import j.z0;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import l.n;
import l.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q.r0;
import q.y;

@Metadata(bv = {}, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0007)WXYZ[\\B)\u0012 \u0010T\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0013\u0018\u00010Rj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`S¢\u0006\u0004\bU\u0010VJ!\u0010\u0007\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002JT\u0010\u0014\u001a\u00020\u0013\"\u0004\b\u0001\u0010\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00052$\u0010\u0012\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015JZ\u0010\u0017\u001a\u00020\u0013\"\u0004\b\u0001\u0010\u0004* \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018JT\u0010\u0019\u001a\u00020\u000b\"\u0004\b\u0001\u0010\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2$\u0010\u0012\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001d\u001a\u00020\u00132\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0002J\n\u0010\u001e\u001a\u0004\u0018\u00010\u0010H\u0014J\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00102\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0014J\u0013\u0010 \u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0014J\"\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b$\u0010!J\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000#ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b%\u0010&J\u0012\u0010)\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010'H\u0007J\u0016\u0010,\u001a\u00020\u00132\u000e\u0010(\u001a\n\u0018\u00010*j\u0004\u0018\u0001`+J\u0019\u0010-\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010'H\u0000¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020\u00132\u0006\u0010/\u001a\u00020\u000bH\u0014J/\u00106\u001a\u00020\u00132\f\u00103\u001a\b\u0012\u0004\u0012\u000202012\n\u00105\u001a\u0006\u0012\u0002\b\u000304H\u0014ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b6\u00107J\u000f\u00109\u001a\b\u0012\u0004\u0012\u00028\u000008H\u0086\u0002J\u000e\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000:H\u0004J\u0010\u0010=\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010<H\u0014J\b\u0010>\u001a\u00020\u0013H\u0014J\b\u0010?\u001a\u00020\u0013H\u0014R\u0014\u0010B\u001a\u00020\u000b8$X¤\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010D\u001a\u00020\u000b8$X¤\u0004¢\u0006\u0006\u001a\u0004\bC\u0010AR\u0014\u0010F\u001a\u00020\u000b8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bE\u0010AR\u0014\u0010H\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010AR\u0014\u0010I\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010AR\u0014\u0010K\u001a\u00020\u000b8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010AR\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00000L8F¢\u0006\u0006\u001a\u0004\bM\u0010NR \u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#0L8Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\bP\u0010N\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006]"}, d2 = {"Ll/a;", "E", "Ll/c;", "Ll/n;", "R", "", "receiveMode", "n0", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/h0;", "receive", "", "a0", "Lt/f;", "select", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "block", "", "o0", "(Lt/f;ILkotlin/jvm/functions/Function2;)V", "value", "q0", "(Lkotlin/jvm/functions/Function2;Lt/f;ILjava/lang/Object;)V", "c0", "(Lt/f;Lkotlin/jvm/functions/Function2;I)Z", "Lj/q;", "cont", "p0", "l0", "m0", "F", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b0", "Ll/r;", "z", "v", "()Ljava/lang/Object;", "", "cause", "a", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cancel", "Y", "(Ljava/lang/Throwable;)Z", "wasClosed", "h0", "Lq/q;", "Ll/l0;", "list", "Ll/w;", "closed", "i0", "(Ljava/lang/Object;Ll/w;)V", "Ll/p;", "iterator", "Ll/a$g;", "Z", "Ll/j0;", "O", "k0", "j0", "e0", "()Z", "isBufferAlwaysEmpty", "f0", "isBufferEmpty", "d0", "hasReceiveOrClosed", "i", "isClosedForReceive", "isEmpty", "g0", "isEmptyImpl", "Lt/d;", "o", "()Lt/d;", "onReceive", "p", "onReceiveCatching", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "b", "c", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "e", "f", "g", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public abstract class a<E> extends l.c<E> implements n<E> {

    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\f¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0004\u001a\u00020\u0003H\u0096Bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u0013\u0010\u000b\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0005R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\rR$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Ll/a$a;", "E", "Ll/p;", "", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "next", "()Ljava/lang/Object;", "", "result", "e", "f", "Ll/a;", "Ll/a;", "channel", "b", "Ljava/lang/Object;", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "g", "(Ljava/lang/Object;)V", "<init>", "(Ll/a;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: l.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0052a<E> implements p<E> {
        @JvmField
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        public final a<E> f608a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public Object f609b = l.b.f634f;

        public C0052a(@NotNull a<E> aVar) {
            this.f608a = aVar;
        }

        @Override // l.p
        @Nullable
        public Object a(@NotNull Continuation<? super Boolean> continuation) {
            Object obj = this.f609b;
            r0 r0Var = l.b.f634f;
            if (obj == r0Var) {
                obj = this.f608a.l0();
                this.f609b = obj;
                if (obj == r0Var) {
                    return f(continuation);
                }
            }
            return Boxing.boxBoolean(e(obj));
        }

        @Override // l.p
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        @JvmName(name = "next")
        public /* synthetic */ Object b(Continuation continuation) {
            return p.a.a(this, continuation);
        }

        @Nullable
        public final Object d() {
            return this.f609b;
        }

        public final boolean e(Object obj) {
            if (obj instanceof w) {
                w wVar = (w) obj;
                if (wVar.f943m == null) {
                    return false;
                }
                throw q.q0.p(wVar.n0());
            }
            return true;
        }

        public final Object f(Continuation<? super Boolean> continuation) {
            Continuation intercepted;
            Object coroutine_suspended;
            Object createFailure;
            intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
            j.r b2 = j.t.b(intercepted);
            d dVar = new d(this, b2);
            while (true) {
                if (this.f608a.a0(dVar)) {
                    this.f608a.p0(b2, dVar);
                    break;
                }
                Object l0 = this.f608a.l0();
                g(l0);
                if (l0 instanceof w) {
                    w wVar = (w) l0;
                    if (wVar.f943m == null) {
                        Result.Companion companion = Result.Companion;
                        createFailure = Boxing.boxBoolean(false);
                    } else {
                        Result.Companion companion2 = Result.Companion;
                        createFailure = ResultKt.createFailure(wVar.n0());
                    }
                    b2.resumeWith(Result.m3581constructorimpl(createFailure));
                } else if (l0 != l.b.f634f) {
                    Boolean boxBoolean = Boxing.boxBoolean(true);
                    Function1<E, Unit> function1 = this.f608a.f639j;
                    b2.O(boxBoolean, function1 != null ? q.i0.a(function1, l0, b2.getContext()) : null);
                }
            }
            Object x = b2.x();
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (x == coroutine_suspended) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return x;
        }

        public final void g(@Nullable Object obj) {
            this.f609b = obj;
        }

        @Override // l.p
        public E next() {
            E e2 = (E) this.f609b;
            if (e2 instanceof w) {
                throw q.q0.p(((w) e2).n0());
            }
            r0 r0Var = l.b.f634f;
            if (e2 != r0Var) {
                this.f609b = r0Var;
                return e2;
            }
            throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0012\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001f\u0012\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00028\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0011\u001a\u00020\f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Ll/a$b;", "E", "Ll/h0;", "value", "", "j0", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lq/y$d;", "otherOp", "Lq/r0;", "c", "(Ljava/lang/Object;Lq/y$d;)Lq/r0;", "", "q", "(Ljava/lang/Object;)V", "Ll/w;", "closed", "i0", "", "toString", "Lj/q;", "m", "Lj/q;", "cont", "", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "I", "receiveMode", "<init>", "(Lj/q;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static class b<E> extends h0<E> {
        @JvmField
        @NotNull

        /* renamed from: m  reason: collision with root package name */
        public final j.q<Object> f610m;
        @JvmField

        /* renamed from: n  reason: collision with root package name */
        public final int f611n;

        public b(@NotNull j.q<Object> qVar, int i2) {
            this.f610m = qVar;
            this.f611n = i2;
        }

        @Override // l.j0
        @Nullable
        public r0 c(E e2, @Nullable y.d dVar) {
            if (this.f610m.C(j0(e2), dVar != null ? dVar.f2082c : null, h0(e2)) == null) {
                return null;
            }
            if (dVar != null) {
                dVar.d();
            }
            return j.s.f510d;
        }

        @Override // l.h0
        public void i0(@NotNull w<?> wVar) {
            Object createFailure;
            int i2 = this.f611n;
            j.q<Object> qVar = this.f610m;
            if (i2 == 1) {
                createFailure = r.b(r.f724b.a(wVar.f943m));
                Result.Companion companion = Result.Companion;
            } else {
                Result.Companion companion2 = Result.Companion;
                createFailure = ResultKt.createFailure(wVar.n0());
            }
            qVar.resumeWith(Result.m3581constructorimpl(createFailure));
        }

        @Nullable
        public final Object j0(E e2) {
            return this.f611n == 1 ? r.b(r.f724b.c(e2)) : e2;
        }

        @Override // l.j0
        public void q(E e2) {
            this.f610m.Z(j.s.f510d);
        }

        @Override // q.y
        @NotNull
        public String toString() {
            return "ReceiveElement@" + z0.b(this) + "[receiveMode=" + this.f611n + ']';
        }
    }

    @Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00010\u0002B=\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0004j\b\u0012\u0004\u0012\u00028\u0001`\t¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0007\u0010\bR*\u0010\f\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0004j\b\u0012\u0004\u0012\u00028\u0001`\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Ll/a$c;", "E", "Ll/a$b;", "value", "Lkotlin/Function1;", "", "", "h0", "(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "o", "Lkotlin/jvm/functions/Function1;", "onUndeliveredElement", "Lj/q;", "", "cont", "", "receiveMode", "<init>", "(Lj/q;ILkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class c<E> extends b<E> {
        @JvmField
        @NotNull

        /* renamed from: o  reason: collision with root package name */
        public final Function1<E, Unit> f612o;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@NotNull j.q<Object> qVar, int i2, @NotNull Function1<? super E, Unit> function1) {
            super(qVar, i2);
            this.f612o = function1;
        }

        @Override // l.h0
        @Nullable
        public Function1<Throwable, Unit> h0(E e2) {
            return q.i0.a(this.f612o, e2, this.f610m.getContext());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0012\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B#\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00028\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u000e\u001a\u00020\t2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0016J%\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0014\u001a\u00020\u0013H\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Ll/a$d;", "E", "Ll/h0;", "value", "Lq/y$d;", "otherOp", "Lq/r0;", "c", "(Ljava/lang/Object;Lq/y$d;)Lq/r0;", "", "q", "(Ljava/lang/Object;)V", "Ll/w;", "closed", "i0", "Lkotlin/Function1;", "", "h0", "(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "", "toString", "Ll/a$a;", "m", "Ll/a$a;", "iterator", "Lj/q;", "", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "Lj/q;", "cont", "<init>", "(Ll/a$a;Lj/q;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static class d<E> extends h0<E> {
        @JvmField
        @NotNull

        /* renamed from: m  reason: collision with root package name */
        public final C0052a<E> f613m;
        @JvmField
        @NotNull

        /* renamed from: n  reason: collision with root package name */
        public final j.q<Boolean> f614n;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@NotNull C0052a<E> c0052a, @NotNull j.q<? super Boolean> qVar) {
            this.f613m = c0052a;
            this.f614n = qVar;
        }

        @Override // l.j0
        @Nullable
        public r0 c(E e2, @Nullable y.d dVar) {
            if (this.f614n.C(Boolean.TRUE, dVar != null ? dVar.f2082c : null, h0(e2)) == null) {
                return null;
            }
            if (dVar != null) {
                dVar.d();
            }
            return j.s.f510d;
        }

        @Override // l.h0
        @Nullable
        public Function1<Throwable, Unit> h0(E e2) {
            Function1<E, Unit> function1 = this.f613m.f608a.f639j;
            if (function1 != null) {
                return q.i0.a(function1, e2, this.f614n.getContext());
            }
            return null;
        }

        @Override // l.h0
        public void i0(@NotNull w<?> wVar) {
            Object b2 = wVar.f943m == null ? q.a.b(this.f614n, Boolean.FALSE, null, 2, null) : this.f614n.B(wVar.n0());
            if (b2 != null) {
                this.f613m.g(wVar);
                this.f614n.Z(b2);
            }
        }

        @Override // l.j0
        public void q(E e2) {
            this.f613m.g(e2);
            this.f614n.Z(j.s.f510d);
        }

        @Override // q.y
        @NotNull
        public String toString() {
            return "ReceiveHasNext@" + z0.b(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\b\u0012\u0004\u0012\u00028\u00020\u00032\u00020\u0004BT\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0018\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u001c\u0012$\u0010%\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010!0 \u0012\u0006\u0010)\u001a\u00020&ø\u0001\u0000¢\u0006\u0004\b*\u0010+J#\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00028\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0010\u001a\u00020\u000b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016J%\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00122\u0006\u0010\u0005\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0017\u001a\u00020\u0016H\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00020\u00188\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR5\u0010%\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010!0 8\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"Ll/a$e;", "R", "E", "Ll/h0;", "Lj/p1;", "value", "Lq/y$d;", "otherOp", "Lq/r0;", "c", "(Ljava/lang/Object;Lq/y$d;)Lq/r0;", "", "q", "(Ljava/lang/Object;)V", "Ll/w;", "closed", "i0", "dispose", "Lkotlin/Function1;", "", "h0", "(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "", "toString", "Ll/a;", "m", "Ll/a;", "channel", "Lt/f;", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "Lt/f;", "select", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "o", "Lkotlin/jvm/functions/Function2;", "block", "", "p", "I", "receiveMode", "<init>", "(Ll/a;Lt/f;Lkotlin/jvm/functions/Function2;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class e<R, E> extends h0<E> implements p1 {
        @JvmField
        @NotNull

        /* renamed from: m  reason: collision with root package name */
        public final a<E> f615m;
        @JvmField
        @NotNull

        /* renamed from: n  reason: collision with root package name */
        public final t.f<R> f616n;
        @JvmField
        @NotNull

        /* renamed from: o  reason: collision with root package name */
        public final Function2<Object, Continuation<? super R>, Object> f617o;
        @JvmField

        /* renamed from: p  reason: collision with root package name */
        public final int f618p;

        /* JADX WARN: Multi-variable type inference failed */
        public e(@NotNull a<E> aVar, @NotNull t.f<? super R> fVar, @NotNull Function2<Object, ? super Continuation<? super R>, ? extends Object> function2, int i2) {
            this.f615m = aVar;
            this.f616n = fVar;
            this.f617o = function2;
            this.f618p = i2;
        }

        @Override // l.j0
        @Nullable
        public r0 c(E e2, @Nullable y.d dVar) {
            return (r0) this.f616n.d(dVar);
        }

        @Override // j.p1
        public void dispose() {
            if (Y()) {
                this.f615m.j0();
            }
        }

        @Override // l.h0
        @Nullable
        public Function1<Throwable, Unit> h0(E e2) {
            Function1<E, Unit> function1 = this.f615m.f639j;
            if (function1 != null) {
                return q.i0.a(function1, e2, this.f616n.o().getContext());
            }
            return null;
        }

        @Override // l.h0
        public void i0(@NotNull w<?> wVar) {
            if (this.f616n.i()) {
                int i2 = this.f618p;
                if (i2 == 0) {
                    this.f616n.v(wVar.n0());
                } else if (i2 != 1) {
                } else {
                    r.a.f(this.f617o, r.b(r.f724b.a(wVar.f943m)), this.f616n.o(), null, 4, null);
                }
            }
        }

        @Override // l.j0
        public void q(E e2) {
            r.a.e(this.f617o, this.f618p == 1 ? r.b(r.f724b.c(e2)) : e2, this.f616n.o(), h0(e2));
        }

        @Override // q.y
        @NotNull
        public String toString() {
            return "ReceiveSelect@" + z0.b(this) + '[' + this.f616n + ",receiveMode=" + this.f618p + ']';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Ll/a$f;", "Lj/g;", "", "cause", "", "a", "", "toString", "Ll/h0;", "j", "Ll/h0;", "receive", "<init>", "(Ll/a;Ll/h0;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public final class f extends j.g {
        @NotNull

        /* renamed from: j  reason: collision with root package name */
        public final h0<?> f619j;

        public f(@NotNull h0<?> h0Var) {
            this.f619j = h0Var;
        }

        @Override // j.p
        public void a(@Nullable Throwable th) {
            if (this.f619j.Y()) {
                a.this.j0();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            a(th);
            return Unit.INSTANCE;
        }

        @NotNull
        public String toString() {
            return "RemoveReceiveOnCancel[" + this.f619j + ']';
        }
    }

    @Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0016\u0010\f\u001a\u0004\u0018\u00010\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0013"}, d2 = {"Ll/a$g;", "E", "Lq/y$e;", "Ll/l0;", "Lkotlinx/coroutines/internal/RemoveFirstDesc;", "Lq/y;", "affected", "", "e", "Lq/y$d;", "Lkotlinx/coroutines/internal/PrepareOp;", "prepareOp", "j", "", "k", "Lq/w;", "queue", "<init>", "(Lq/w;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class g<E> extends y.e<l0> {
        public g(@NotNull q.w wVar) {
            super(wVar);
        }

        @Override // q.y.e, q.y.a
        @Nullable
        public Object e(@NotNull q.y yVar) {
            if (yVar instanceof w) {
                return yVar;
            }
            if (yVar instanceof l0) {
                return null;
            }
            return l.b.f634f;
        }

        @Override // q.y.a
        @Nullable
        public Object j(@NotNull y.d dVar) {
            r0 j0 = ((l0) dVar.f2080a).j0(dVar);
            if (j0 == null) {
                return q.z.f2088a;
            }
            Object obj = q.c.f1994b;
            if (j0 == obj) {
                return obj;
            }
            return null;
        }

        @Override // q.y.a
        public void k(@NotNull q.y yVar) {
            ((l0) yVar).k0();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"q/y$f", "Lq/y$c;", "Lq/y;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "k", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class h extends y.c {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ a f621d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(q.y yVar, a aVar) {
            super(yVar);
            this.f621d = aVar;
        }

        @Override // q.d
        @Nullable
        /* renamed from: k */
        public Object i(@NotNull q.y yVar) {
            if (this.f621d.f0()) {
                return null;
            }
            return q.x.a();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001JJ\u0010\n\u001a\u00020\t\"\u0004\b\u0001\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"l/a$i", "Lt/d;", "R", "Lt/f;", "select", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "block", "", "L", "(Lt/f;Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class i implements t.d<E> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ a<E> f622j;

        public i(a<E> aVar) {
            this.f622j = aVar;
        }

        @Override // t.d
        public <R> void L(@NotNull t.f<? super R> fVar, @NotNull Function2<? super E, ? super Continuation<? super R>, ? extends Object> function2) {
            this.f622j.o0(fVar, 0, function2);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001JS\u0010\u000b\u001a\u00020\n\"\u0004\b\u0001\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042(\u0010\t\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0016ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"l/a$j", "Lt/d;", "Ll/r;", "R", "Lt/f;", "select", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "block", "", "L", "(Lt/f;Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class j implements t.d<r<? extends E>> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ a<E> f623j;

        public j(a<E> aVar) {
            this.f623j = aVar;
        }

        @Override // t.d
        public <R> void L(@NotNull t.f<? super R> fVar, @NotNull Function2<? super r<? extends E>, ? super Continuation<? super R>, ? extends Object> function2) {
            this.f623j.o0(fVar, 1, function2);
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "kotlinx.coroutines.channels.AbstractChannel", f = "AbstractChannel.kt", i = {}, l = {633}, m = "receiveCatching-JP2dKIU", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class k extends ContinuationImpl {

        /* renamed from: j  reason: collision with root package name */
        public /* synthetic */ Object f624j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ a<E> f625k;

        /* renamed from: l  reason: collision with root package name */
        public int f626l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(a<E> aVar, Continuation<? super k> continuation) {
            super(continuation);
            this.f625k = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            this.f624j = obj;
            this.f626l |= Integer.MIN_VALUE;
            Object z = this.f625k.z(this);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return z == coroutine_suspended ? z : r.b(z);
        }
    }

    public a(@Nullable Function1<? super E, Unit> function1) {
        super(function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.i0
    @Nullable
    public final Object F(@NotNull Continuation<? super E> continuation) {
        Object l0 = l0();
        return (l0 == l.b.f634f || (l0 instanceof w)) ? n0(0, continuation) : l0;
    }

    @Override // l.c
    @Nullable
    public j0<E> O() {
        j0<E> O = super.O();
        if (O != null && !(O instanceof w)) {
            j0();
        }
        return O;
    }

    @Override // l.i0
    /* renamed from: Y */
    public final boolean a(@Nullable Throwable th) {
        boolean G = G(th);
        h0(G);
        return G;
    }

    @NotNull
    public final g<E> Z() {
        return new g<>(r());
    }

    public final boolean a0(h0<? super E> h0Var) {
        boolean b0 = b0(h0Var);
        if (b0) {
            k0();
        }
        return b0;
    }

    public boolean b0(@NotNull h0<? super E> h0Var) {
        int e0;
        q.y S;
        if (!e0()) {
            q.y r2 = r();
            h hVar = new h(h0Var, this);
            do {
                q.y S2 = r2.S();
                if (!(!(S2 instanceof l0))) {
                    return false;
                }
                e0 = S2.e0(h0Var, r2, hVar);
                if (e0 != 1) {
                }
            } while (e0 != 2);
            return false;
        }
        q.y r3 = r();
        do {
            S = r3.S();
            if (!(!(S instanceof l0))) {
                return false;
            }
        } while (!S.I(h0Var, r3));
        return true;
    }

    public final <R> boolean c0(t.f<? super R> fVar, Function2<Object, ? super Continuation<? super R>, ? extends Object> function2, int i2) {
        e eVar = new e(this, fVar, function2, i2);
        boolean a0 = a0(eVar);
        if (a0) {
            fVar.m(eVar);
        }
        return a0;
    }

    @Override // l.i0
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        cancel(null);
    }

    @Override // l.i0
    public final void cancel(@Nullable CancellationException cancellationException) {
        if (i()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new CancellationException(z0.a(this) + " was cancelled");
        }
        a(cancellationException);
    }

    public final boolean d0() {
        return r().R() instanceof j0;
    }

    public abstract boolean e0();

    public abstract boolean f0();

    public final boolean g0() {
        return !(r().R() instanceof l0) && f0();
    }

    public void h0(boolean z) {
        w<?> n2 = n();
        if (n2 == null) {
            throw new IllegalStateException("Cannot happen".toString());
        }
        Object c2 = q.q.c(null, 1, null);
        while (true) {
            q.y S = n2.S();
            if (S instanceof q.w) {
                i0(c2, n2);
                return;
            } else if (S.Y()) {
                c2 = q.q.h(c2, (l0) S);
            } else {
                S.T();
            }
        }
    }

    @Override // l.i0
    public boolean i() {
        return m() != null && f0();
    }

    public void i0(@NotNull Object obj, @NotNull w<?> wVar) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            ((l0) obj).i0(wVar);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            ((l0) arrayList.get(size)).i0(wVar);
        }
    }

    @Override // l.i0
    public boolean isEmpty() {
        return g0();
    }

    @Override // l.i0
    @NotNull
    public final p<E> iterator() {
        return new C0052a(this);
    }

    public void j0() {
    }

    public void k0() {
    }

    @Nullable
    public Object l0() {
        while (true) {
            l0 P = P();
            if (P == null) {
                return l.b.f634f;
            }
            if (P.j0(null) != null) {
                P.g0();
                return P.h0();
            }
            P.k0();
        }
    }

    @Nullable
    public Object m0(@NotNull t.f<?> fVar) {
        g<E> Z = Z();
        Object r2 = fVar.r(Z);
        if (r2 != null) {
            return r2;
        }
        Z.o().g0();
        return Z.o().h0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.a$b] */
    public final <R> Object n0(int i2, Continuation<? super R> continuation) {
        Continuation intercepted;
        Object coroutine_suspended;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        j.r b2 = j.t.b(intercepted);
        c bVar = this.f639j == null ? new b(b2, i2) : new c(b2, i2, this.f639j);
        while (true) {
            if (!a0(bVar)) {
                Object l0 = l0();
                if (!(l0 instanceof w)) {
                    if (l0 != l.b.f634f) {
                        b2.O(bVar.j0(l0), bVar.h0(l0));
                        break;
                    }
                } else {
                    bVar.i0((w) l0);
                    break;
                }
            } else {
                p0(b2, bVar);
                break;
            }
        }
        Object x = b2.x();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (x == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return x;
    }

    @Override // l.i0
    @NotNull
    public final t.d<E> o() {
        return new i(this);
    }

    public final <R> void o0(t.f<? super R> fVar, int i2, Function2<Object, ? super Continuation<? super R>, ? extends Object> function2) {
        while (!fVar.l()) {
            if (!g0()) {
                Object m0 = m0(fVar);
                if (m0 == t.g.d()) {
                    return;
                }
                if (m0 != l.b.f634f && m0 != q.c.f1994b) {
                    q0(function2, fVar, i2, m0);
                }
            } else if (c0(fVar, function2, i2)) {
                return;
            }
        }
    }

    @Override // l.i0
    @NotNull
    public final t.d<r<E>> p() {
        return new j(this);
    }

    public final void p0(j.q<?> qVar, h0<?> h0Var) {
        qVar.A(new f(h0Var));
    }

    @Override // l.i0
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
    @Nullable
    public E poll() {
        return (E) n.a.d(this);
    }

    @Override // l.i0
    @NotNull
    public t.d<E> q() {
        return n.a.b(this);
    }

    public final <R> void q0(Function2<Object, ? super Continuation<? super R>, ? extends Object> function2, t.f<? super R> fVar, int i2, Object obj) {
        Object c2;
        boolean z = obj instanceof w;
        if (z) {
            if (i2 == 0) {
                throw q.q0.p(((w) obj).n0());
            }
            if (i2 != 1 || !fVar.i()) {
                return;
            }
        } else if (i2 != 1) {
            r.b.d(function2, obj, fVar.o());
            return;
        } else if (!z) {
            c2 = r.f724b.c(obj);
            r.b.d(function2, r.b(c2), fVar.o());
        }
        c2 = r.f724b.a(((w) obj).f943m);
        r.b.d(function2, r.b(c2), fVar.o());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.i0
    @NotNull
    public final Object v() {
        Object l0 = l0();
        return l0 == l.b.f634f ? r.f724b.b() : l0 instanceof w ? r.f724b.a(((w) l0).f943m) : r.f724b.c(l0);
    }

    @Override // l.i0
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    @LowPriorityInOverloadResolution
    @Nullable
    public Object w(@NotNull Continuation<? super E> continuation) {
        return n.a.e(this, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // l.i0
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object z(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super l.r<? extends E>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof l.a.k
            if (r0 == 0) goto L13
            r0 = r5
            l.a$k r0 = (l.a.k) r0
            int r1 = r0.f626l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f626l = r1
            goto L18
        L13:
            l.a$k r0 = new l.a$k
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f624j
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f626l
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r5)
            goto L5b
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.ResultKt.throwOnFailure(r5)
            java.lang.Object r5 = r4.l0()
            q.r0 r2 = l.b.f634f
            if (r5 == r2) goto L52
            boolean r4 = r5 instanceof l.w
            if (r4 == 0) goto L4b
            l.r$b r4 = l.r.f724b
            l.w r5 = (l.w) r5
            java.lang.Throwable r5 = r5.f943m
            java.lang.Object r4 = r4.a(r5)
            goto L51
        L4b:
            l.r$b r4 = l.r.f724b
            java.lang.Object r4 = r4.c(r5)
        L51:
            return r4
        L52:
            r0.f626l = r3
            java.lang.Object r5 = r4.n0(r3, r0)
            if (r5 != r1) goto L5b
            return r1
        L5b:
            l.r r5 = (l.r) r5
            java.lang.Object r4 = r5.o()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l.a.z(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
