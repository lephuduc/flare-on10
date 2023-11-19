package t;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t.a;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: P
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0001J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0001J5\u0010\r\u001a\u00020\u0005*\u00020\t2\u001c\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00070\nH\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJG\u0010\u0012\u001a\u00020\u0005\"\u0004\b\u0001\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00010\u00102\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0011H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J[\u0010\u0017\u001a\u00020\u0005\"\u0004\b\u0001\u0010\u0014\"\u0004\b\u0002\u0010\u000f*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00152\u0006\u0010\u0016\u001a\u00028\u00012\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0011H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J8\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00192\u001c\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00070\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R3\u0010*\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050$0#j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050$`%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"Lt/j;", "R", "Lt/a;", "", "e", "", "c", "", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "Lt/c;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "block", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "(Lt/c;Lkotlin/jvm/functions/Function1;)V", "Q", "Lt/d;", "Lkotlin/Function2;", "g", "(Lt/d;Lkotlin/jvm/functions/Function2;)V", "P", "Lt/e;", "param", "u", "(Lt/e;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "", "timeMillis", "p", "(JLkotlin/jvm/functions/Function1;)V", "Lt/b;", "j", "Lt/b;", "b", "()Lt/b;", "instance", "Ljava/util/ArrayList;", "Lkotlin/Function0;", "Lkotlin/collections/ArrayList;", "k", "Ljava/util/ArrayList;", "a", "()Ljava/util/ArrayList;", "clauses", "uCont", "<init>", "(Lkotlin/coroutines/Continuation;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@PublishedApi
/* loaded from: classes2.dex */
public final class j<R> implements t.a<R> {
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    public final t.b<R> f2179j;
    @NotNull

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList<Function0<Unit>> f2180k = new ArrayList<>();

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u0000H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "R", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class a extends Lambda implements Function0<Unit> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ t.c f2181j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ j<R> f2182k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Function1<Continuation<? super R>, Object> f2183l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(t.c cVar, j<? super R> jVar, Function1<? super Continuation<? super R>, ? extends Object> function1) {
            super(0);
            this.f2181j = cVar;
            this.f2182k = jVar;
            this.f2183l = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f2181j.y(this.f2182k.b(), this.f2183l);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0003 \u0000H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Q", "R", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class b extends Lambda implements Function0<Unit> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ t.d<Q> f2184j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ j<R> f2185k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Function2<Q, Continuation<? super R>, Object> f2186l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(t.d<? extends Q> dVar, j<? super R> jVar, Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2) {
            super(0);
            this.f2184j = dVar;
            this.f2185k = jVar;
            this.f2186l = function2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f2184j.L(this.f2185k.b(), this.f2186l);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0006\b\u0002\u0010\u0004 \u0000H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "P", "Q", "R", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements Function0<Unit> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ e<P, Q> f2187j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ j<R> f2188k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ P f2189l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ Function2<Q, Continuation<? super R>, Object> f2190m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(e<? super P, ? extends Q> eVar, j<? super R> jVar, P p2, Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2) {
            super(0);
            this.f2187j = eVar;
            this.f2188k = jVar;
            this.f2189l = p2;
            this.f2190m = function2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f2187j.S(this.f2188k.b(), this.f2189l, this.f2190m);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u0000H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "R", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class d extends Lambda implements Function0<Unit> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ j<R> f2191j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ long f2192k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Function1<Continuation<? super R>, Object> f2193l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(j<? super R> jVar, long j2, Function1<? super Continuation<? super R>, ? extends Object> function1) {
            super(0);
            this.f2191j = jVar;
            this.f2192k = j2;
            this.f2193l = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f2191j.b().p(this.f2192k, this.f2193l);
        }
    }

    public j(@NotNull Continuation<? super R> continuation) {
        this.f2179j = new t.b<>(continuation);
    }

    @NotNull
    public final ArrayList<Function0<Unit>> a() {
        return this.f2180k;
    }

    @NotNull
    public final t.b<R> b() {
        return this.f2179j;
    }

    @PublishedApi
    public final void c(@NotNull Throwable th) {
        this.f2179j.p0(th);
    }

    @PublishedApi
    @Nullable
    public final Object d() {
        if (!this.f2179j.l()) {
            try {
                Collections.shuffle(this.f2180k);
                Iterator<T> it = this.f2180k.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
            } catch (Throwable th) {
                this.f2179j.p0(th);
            }
        }
        return this.f2179j.o0();
    }

    @Override // t.a
    public <Q> void g(@NotNull t.d<? extends Q> dVar, @NotNull Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2) {
        this.f2180k.add(new b(dVar, this, function2));
    }

    @Override // t.a
    public void n(@NotNull t.c cVar, @NotNull Function1<? super Continuation<? super R>, ? extends Object> function1) {
        this.f2180k.add(new a(cVar, this, function1));
    }

    @Override // t.a
    public void p(long j2, @NotNull Function1<? super Continuation<? super R>, ? extends Object> function1) {
        this.f2180k.add(new d(this, j2, function1));
    }

    @Override // t.a
    public <P, Q> void u(@NotNull e<? super P, ? extends Q> eVar, P p2, @NotNull Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2) {
        this.f2180k.add(new c(eVar, this, p2, function2));
    }

    @Override // t.a
    public <P, Q> void w(@NotNull e<? super P, ? extends Q> eVar, @NotNull Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2) {
        a.C0097a.a(this, eVar, function2);
    }
}
