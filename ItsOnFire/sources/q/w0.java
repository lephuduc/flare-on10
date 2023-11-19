package q;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import j.s3;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0000\"\u0014\u0010\u000b\u001a\u00020\t8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n\"*\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e\"2\u0010\u0011\u001a \u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0010\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00100\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e\"&\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00120\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000e¨\u0006\u0015"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "context", "", "b", "countOrElement", "c", "oldState", "", "a", "Lq/r0;", "Lq/r0;", "NO_THREAD_ELEMENTS", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/jvm/functions/Function2;", "countAll", "Lj/s3;", "findOne", "Lq/c1;", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "updateState", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class w0 {
    @JvmField
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final r0 f2057a = new r0("NO_THREAD_ELEMENTS");
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public static final Function2<Object, CoroutineContext.Element, Object> f2058b = a.f2061j;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public static final Function2<s3<?>, CoroutineContext.Element, s3<?>> f2059c = b.f2062j;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public static final Function2<c1, CoroutineContext.Element, c1> f2060d = c.f2063j;

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "countOrElement", "Lkotlin/coroutines/CoroutineContext$Element;", "element", "a", "(Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext$Element;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class a extends Lambda implements Function2<Object, CoroutineContext.Element, Object> {

        /* renamed from: j  reason: collision with root package name */
        public static final a f2061j = new a();

        public a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* renamed from: a */
        public final Object invoke(@Nullable Object obj, @NotNull CoroutineContext.Element element) {
            if (element instanceof s3) {
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? element : Integer.valueOf(intValue + 1);
            }
            return obj;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\f\u0010\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lj/s3;", "found", "Lkotlin/coroutines/CoroutineContext$Element;", "element", "a", "(Lj/s3;Lkotlin/coroutines/CoroutineContext$Element;)Lj/s3;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class b extends Lambda implements Function2<s3<?>, CoroutineContext.Element, s3<?>> {

        /* renamed from: j  reason: collision with root package name */
        public static final b f2062j = new b();

        public b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* renamed from: a */
        public final s3<?> invoke(@Nullable s3<?> s3Var, @NotNull CoroutineContext.Element element) {
            if (s3Var != null) {
                return s3Var;
            }
            if (element instanceof s3) {
                return (s3) element;
            }
            return null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lq/c1;", "state", "Lkotlin/coroutines/CoroutineContext$Element;", "element", "a", "(Lq/c1;Lkotlin/coroutines/CoroutineContext$Element;)Lq/c1;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements Function2<c1, CoroutineContext.Element, c1> {

        /* renamed from: j  reason: collision with root package name */
        public static final c f2063j = new c();

        public c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* renamed from: a */
        public final c1 invoke(@NotNull c1 c1Var, @NotNull CoroutineContext.Element element) {
            if (element instanceof s3) {
                s3<?> s3Var = (s3) element;
                c1Var.a(s3Var, s3Var.Y(c1Var.f1995a));
            }
            return c1Var;
        }
    }

    public static final void a(@NotNull CoroutineContext coroutineContext, @Nullable Object obj) {
        if (obj == f2057a) {
            return;
        }
        if (obj instanceof c1) {
            ((c1) obj).b(coroutineContext);
            return;
        }
        Object fold = coroutineContext.fold(null, f2059c);
        if (fold == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        }
        ((s3) fold).K(coroutineContext, obj);
    }

    @NotNull
    public static final Object b(@NotNull CoroutineContext coroutineContext) {
        Object fold = coroutineContext.fold(0, f2058b);
        Intrinsics.checkNotNull(fold);
        return fold;
    }

    @Nullable
    public static final Object c(@NotNull CoroutineContext coroutineContext, @Nullable Object obj) {
        if (obj == null) {
            obj = b(coroutineContext);
        }
        return obj == 0 ? f2057a : obj instanceof Integer ? coroutineContext.fold(new c1(coroutineContext, ((Number) obj).intValue()), f2060d) : ((s3) obj).Y(coroutineContext);
    }
}
