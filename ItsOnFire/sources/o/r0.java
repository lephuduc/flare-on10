package o;

import androidx.appcompat.R;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\f"}, d2 = {"Lo/r0;", "Lo/o0;", "Lo/t0;", "", "subscriptionCount", "Lo/i;", "Lo/m0;", "a", "", "toString", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class r0 implements o0 {

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lo/j;", "Lo/m0;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class a extends SuspendLambda implements Function2<j<? super m0>, Continuation<? super Unit>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public int f1489j;

        /* renamed from: k  reason: collision with root package name */
        public /* synthetic */ Object f1490k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ t0<Integer> f1491l;

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "count", "", "a", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: o.r0$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0076a<T> implements j {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ Ref.BooleanRef f1492j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ j<m0> f1493k;

            @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
            @DebugMetadata(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", i = {}, l = {158}, m = "emit", n = {}, s = {})
            /* renamed from: o.r0$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0077a extends ContinuationImpl {

                /* renamed from: j  reason: collision with root package name */
                public /* synthetic */ Object f1494j;

                /* renamed from: k  reason: collision with root package name */
                public final /* synthetic */ C0076a<T> f1495k;

                /* renamed from: l  reason: collision with root package name */
                public int f1496l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0077a(C0076a<? super T> c0076a, Continuation<? super C0077a> continuation) {
                    super(continuation);
                    this.f1495k = c0076a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f1494j = obj;
                    this.f1496l |= Integer.MIN_VALUE;
                    return this.f1495k.a(0, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0076a(Ref.BooleanRef booleanRef, j<? super m0> jVar) {
                this.f1492j = booleanRef;
                this.f1493k = jVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(int r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof o.r0.a.C0076a.C0077a
                    if (r0 == 0) goto L13
                    r0 = r6
                    o.r0$a$a$a r0 = (o.r0.a.C0076a.C0077a) r0
                    int r1 = r0.f1496l
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f1496l = r1
                    goto L18
                L13:
                    o.r0$a$a$a r0 = new o.r0$a$a$a
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.f1494j
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f1496l
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.ResultKt.throwOnFailure(r6)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r5)
                    throw r4
                L31:
                    kotlin.ResultKt.throwOnFailure(r6)
                    if (r5 <= 0) goto L4e
                    kotlin.jvm.internal.Ref$BooleanRef r5 = r4.f1492j
                    boolean r6 = r5.element
                    if (r6 != 0) goto L4e
                    r5.element = r3
                    o.j<o.m0> r4 = r4.f1493k
                    o.m0 r5 = o.m0.START
                    r0.f1496l = r3
                    java.lang.Object r4 = r4.emit(r5, r0)
                    if (r4 != r1) goto L4b
                    return r1
                L4b:
                    kotlin.Unit r4 = kotlin.Unit.INSTANCE
                    return r4
                L4e:
                    kotlin.Unit r4 = kotlin.Unit.INSTANCE
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: o.r0.a.C0076a.a(int, kotlin.coroutines.Continuation):java.lang.Object");
            }

            @Override // o.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Number) obj).intValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t0<Integer> t0Var, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f1491l = t0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f1491l, continuation);
            aVar.f1490k = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull j<? super m0> jVar, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(jVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1489j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                t0<Integer> t0Var = this.f1491l;
                C0076a c0076a = new C0076a(booleanRef, (j) this.f1490k);
                this.f1489j = 1;
                if (t0Var.collect(c0076a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @Override // o.o0
    @NotNull
    public i<m0> a(@NotNull t0<Integer> t0Var) {
        return k.I0(new a(t0Var, null));
    }

    @NotNull
    public String toString() {
        return "SharingStarted.Lazily";
    }
}
