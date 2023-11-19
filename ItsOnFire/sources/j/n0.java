package j;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0007\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0001H\u0002\u001a \u0010\u000b\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0006H\u0002\u001a6\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0080\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a:\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0080\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a(\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018*\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0000\u001a\u0013\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018*\u00020\u001aH\u0080\u0010\"\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u001d\"\u001a\u0010!\u001a\u0004\u0018\u00010\u001c*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lj/u0;", "Lkotlin/coroutines/CoroutineContext;", "context", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "addedContext", "e", "", "c", "originalContext", "appendContext", "isNewCoroutine", "a", "T", "", "countOrElement", "Lkotlin/Function0;", "block", "i", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lkotlin/coroutines/Continuation;", "continuation", "h", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "oldValue", "Lj/c4;", "g", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "f", "", "Ljava/lang/String;", "DEBUG_THREAD_NAME_SEPARATOR", "b", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/String;", "coroutineName", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class n0 {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final String f482a = " @";

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/coroutines/CoroutineContext;", "result", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class a extends Lambda implements Function2<CoroutineContext, CoroutineContext.Element, CoroutineContext> {

        /* renamed from: j  reason: collision with root package name */
        public static final a f483j = new a();

        public a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final CoroutineContext invoke(@NotNull CoroutineContext coroutineContext, @NotNull CoroutineContext.Element element) {
            return element instanceof l0 ? coroutineContext.plus(((l0) element).I()) : coroutineContext.plus(element);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/coroutines/CoroutineContext;", "result", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class b extends Lambda implements Function2<CoroutineContext, CoroutineContext.Element, CoroutineContext> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<CoroutineContext> f484j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ boolean f485k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Ref.ObjectRef<CoroutineContext> objectRef, boolean z) {
            super(2);
            this.f484j = objectRef;
            this.f485k = z;
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [T, kotlin.coroutines.CoroutineContext] */
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final CoroutineContext invoke(@NotNull CoroutineContext coroutineContext, @NotNull CoroutineContext.Element element) {
            if (element instanceof l0) {
                CoroutineContext.Element element2 = this.f484j.element.get(element.getKey());
                if (element2 == null) {
                    return coroutineContext.plus(this.f485k ? ((l0) element).I() : (l0) element);
                }
                Ref.ObjectRef<CoroutineContext> objectRef = this.f484j;
                objectRef.element = objectRef.element.minusKey(element.getKey());
                return coroutineContext.plus(((l0) element).h(element2));
            }
            return coroutineContext.plus(element);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "result", "Lkotlin/coroutines/CoroutineContext$Element;", "it", "a", "(ZLkotlin/coroutines/CoroutineContext$Element;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements Function2<Boolean, CoroutineContext.Element, Boolean> {

        /* renamed from: j  reason: collision with root package name */
        public static final c f486j = new c();

        public c() {
            super(2);
        }

        @NotNull
        public final Boolean a(boolean z, @NotNull CoroutineContext.Element element) {
            return Boolean.valueOf(z || (element instanceof l0));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, CoroutineContext.Element element) {
            return a(bool.booleanValue(), element);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    public static final CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, boolean z) {
        boolean c2 = c(coroutineContext);
        boolean c3 = c(coroutineContext2);
        if (c2 || c3) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = coroutineContext2;
            EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
            CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(emptyCoroutineContext, new b(objectRef, z));
            if (c3) {
                objectRef.element = ((CoroutineContext) objectRef.element).fold(emptyCoroutineContext, a.f483j);
            }
            return coroutineContext3.plus((CoroutineContext) objectRef.element);
        }
        return coroutineContext.plus(coroutineContext2);
    }

    @Nullable
    public static final String b(@NotNull CoroutineContext coroutineContext) {
        return null;
    }

    public static final boolean c(CoroutineContext coroutineContext) {
        return ((Boolean) coroutineContext.fold(Boolean.FALSE, c.f486j)).booleanValue();
    }

    @c2
    @NotNull
    public static final CoroutineContext d(@NotNull u0 u0Var, @NotNull CoroutineContext coroutineContext) {
        CoroutineContext a2 = a(u0Var.getCoroutineContext(), coroutineContext, true);
        return (a2 == m1.a() || a2.get(ContinuationInterceptor.Key) != null) ? a2 : a2.plus(m1.a());
    }

    @i2
    @NotNull
    public static final CoroutineContext e(@NotNull CoroutineContext coroutineContext, @NotNull CoroutineContext coroutineContext2) {
        return !c(coroutineContext2) ? coroutineContext.plus(coroutineContext2) : a(coroutineContext, coroutineContext2, false);
    }

    @Nullable
    public static final c4<?> f(@NotNull CoroutineStackFrame coroutineStackFrame) {
        while (!(coroutineStackFrame instanceof i1) && (coroutineStackFrame = coroutineStackFrame.getCallerFrame()) != null) {
            if (coroutineStackFrame instanceof c4) {
                return (c4) coroutineStackFrame;
            }
        }
        return null;
    }

    @Nullable
    public static final c4<?> g(@NotNull Continuation<?> continuation, @NotNull CoroutineContext coroutineContext, @Nullable Object obj) {
        if (continuation instanceof CoroutineStackFrame) {
            if (coroutineContext.get(d4.f415j) != null) {
                c4<?> f2 = f((CoroutineStackFrame) continuation);
                if (f2 != null) {
                    f2.z1(coroutineContext, obj);
                }
                return f2;
            }
            return null;
        }
        return null;
    }

    public static final <T> T h(@NotNull Continuation<?> continuation, @Nullable Object obj, @NotNull Function0<? extends T> function0) {
        CoroutineContext context = continuation.getContext();
        Object c2 = q.w0.c(context, obj);
        c4<?> g2 = c2 != q.w0.f2057a ? g(continuation, context, c2) : null;
        try {
            return function0.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            if (g2 == null || g2.y1()) {
                q.w0.a(context, c2);
            }
            InlineMarker.finallyEnd(1);
        }
    }

    public static final <T> T i(@NotNull CoroutineContext coroutineContext, @Nullable Object obj, @NotNull Function0<? extends T> function0) {
        Object c2 = q.w0.c(coroutineContext, obj);
        try {
            return function0.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            q.w0.a(coroutineContext, c2);
            InlineMarker.finallyEnd(1);
        }
    }
}
