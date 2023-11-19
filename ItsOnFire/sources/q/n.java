package q;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a2\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0007j\u0002`\b\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002\u001a*\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0002\u001a1\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0007j\u0002`\b2\u0014\b\u0004\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0007H\u0082\b\u001a\u0018\u0010\u0011\u001a\u00020\u000f*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u001a\u001b\u0010\u0013\u001a\u00020\u000f*\u0006\u0012\u0002\b\u00030\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u000fH\u0082\u0010\"\u0014\u0010\u0016\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018*(\b\u0002\u0010\u001a\"\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00072\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0007¨\u0006\u001b"}, d2 = {"", "E", "exception", "h", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Ljava/lang/Class;", "clz", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Ctor;", "b", "Ljava/lang/reflect/Constructor;", "constructor", "c", "block", "g", "", "defaultValue", "f", "accumulator", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "a", "I", "throwableFields", "Lq/k;", "Lq/k;", "ctorCache", "Ctor", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final int f2030a = f(Throwable.class, -1);
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public static final k f2031b;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t2, T t3) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((Constructor) t3).getParameterTypes().length), Integer.valueOf(((Constructor) t2).getParameterTypes().length));
            return compareValues;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "E", "it", "", "a", "(Ljava/lang/Throwable;)Ljava/lang/Void;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class b extends Lambda implements Function1 {

        /* renamed from: j  reason: collision with root package name */
        public static final b f2032j = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: a */
        public final Void invoke(@NotNull Throwable th) {
            return null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0004\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "e", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "q/n$g"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements Function1<Throwable, Throwable> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Constructor f2033j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Constructor constructor) {
            super(1);
            this.f2033j = constructor;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: a */
        public final Throwable invoke(@NotNull Throwable th) {
            Object m3581constructorimpl;
            Object newInstance;
            try {
                Result.Companion companion = Result.Companion;
                newInstance = this.f2033j.newInstance(th.getMessage(), th);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.Companion;
                m3581constructorimpl = Result.m3581constructorimpl(ResultKt.createFailure(th2));
            }
            if (newInstance != null) {
                m3581constructorimpl = Result.m3581constructorimpl((Throwable) newInstance);
                if (Result.m3587isFailureimpl(m3581constructorimpl)) {
                    m3581constructorimpl = null;
                }
                return (Throwable) m3581constructorimpl;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0004\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "e", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "q/n$g"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class d extends Lambda implements Function1<Throwable, Throwable> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Constructor f2034j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Constructor constructor) {
            super(1);
            this.f2034j = constructor;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: a */
        public final Throwable invoke(@NotNull Throwable th) {
            Object m3581constructorimpl;
            Object newInstance;
            try {
                Result.Companion companion = Result.Companion;
                newInstance = this.f2034j.newInstance(th);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.Companion;
                m3581constructorimpl = Result.m3581constructorimpl(ResultKt.createFailure(th2));
            }
            if (newInstance != null) {
                m3581constructorimpl = Result.m3581constructorimpl((Throwable) newInstance);
                if (Result.m3587isFailureimpl(m3581constructorimpl)) {
                    m3581constructorimpl = null;
                }
                return (Throwable) m3581constructorimpl;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0004\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "e", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "q/n$g"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class e extends Lambda implements Function1<Throwable, Throwable> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Constructor f2035j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Constructor constructor) {
            super(1);
            this.f2035j = constructor;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: a */
        public final Throwable invoke(@NotNull Throwable th) {
            Object m3581constructorimpl;
            Object newInstance;
            try {
                Result.Companion companion = Result.Companion;
                newInstance = this.f2035j.newInstance(th.getMessage());
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.Companion;
                m3581constructorimpl = Result.m3581constructorimpl(ResultKt.createFailure(th2));
            }
            if (newInstance != null) {
                Throwable th3 = (Throwable) newInstance;
                th3.initCause(th);
                m3581constructorimpl = Result.m3581constructorimpl(th3);
                if (Result.m3587isFailureimpl(m3581constructorimpl)) {
                    m3581constructorimpl = null;
                }
                return (Throwable) m3581constructorimpl;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0004\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "e", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "q/n$g"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class f extends Lambda implements Function1<Throwable, Throwable> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Constructor f2036j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Constructor constructor) {
            super(1);
            this.f2036j = constructor;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: a */
        public final Throwable invoke(@NotNull Throwable th) {
            Object m3581constructorimpl;
            Object newInstance;
            try {
                Result.Companion companion = Result.Companion;
                newInstance = this.f2036j.newInstance(new Object[0]);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.Companion;
                m3581constructorimpl = Result.m3581constructorimpl(ResultKt.createFailure(th2));
            }
            if (newInstance != null) {
                Throwable th3 = (Throwable) newInstance;
                th3.initCause(th);
                m3581constructorimpl = Result.m3581constructorimpl(th3);
                if (Result.m3587isFailureimpl(m3581constructorimpl)) {
                    m3581constructorimpl = null;
                }
                return (Throwable) m3581constructorimpl;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "e", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class g extends Lambda implements Function1<Throwable, Throwable> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Function1<Throwable, Throwable> f2037j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(Function1<? super Throwable, ? extends Throwable> function1) {
            super(1);
            this.f2037j = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: a */
        public final Throwable invoke(@NotNull Throwable th) {
            Object m3581constructorimpl;
            Function1<Throwable, Throwable> function1 = this.f2037j;
            try {
                Result.Companion companion = Result.Companion;
                m3581constructorimpl = Result.m3581constructorimpl(function1.invoke(th));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.Companion;
                m3581constructorimpl = Result.m3581constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m3587isFailureimpl(m3581constructorimpl)) {
                m3581constructorimpl = null;
            }
            return (Throwable) m3581constructorimpl;
        }
    }

    static {
        k kVar;
        try {
            kVar = p.a() ? e1.f2005a : q.e.f2000a;
        } catch (Throwable unused) {
            kVar = e1.f2005a;
        }
        f2031b = kVar;
    }

    public static final <E extends Throwable> Function1<Throwable, Throwable> b(Class<E> cls) {
        List<Constructor> sortedWith;
        b bVar = b.f2032j;
        if (f2030a != f(cls, 0)) {
            return bVar;
        }
        sortedWith = ArraysKt___ArraysKt.sortedWith(cls.getConstructors(), new a());
        for (Constructor constructor : sortedWith) {
            Function1<Throwable, Throwable> c2 = c(constructor);
            if (c2 != null) {
                return c2;
            }
        }
        return bVar;
    }

    public static final Function1<Throwable, Throwable> c(Constructor<?> constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length != 0) {
            if (length != 1) {
                if (length == 2 && Intrinsics.areEqual(parameterTypes[0], String.class) && Intrinsics.areEqual(parameterTypes[1], Throwable.class)) {
                    return new c(constructor);
                }
                return null;
            }
            Class<?> cls = parameterTypes[0];
            if (Intrinsics.areEqual(cls, Throwable.class)) {
                return new d(constructor);
            }
            if (Intrinsics.areEqual(cls, String.class)) {
                return new e(constructor);
            }
            return null;
        }
        return new f(constructor);
    }

    public static final int d(Class<?> cls, int i2) {
        Field[] declaredFields;
        do {
            int length = cls.getDeclaredFields().length;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                if (!Modifier.isStatic(declaredFields[i4].getModifiers())) {
                    i3++;
                }
            }
            i2 += i3;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i2;
    }

    public static /* synthetic */ int e(Class cls, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return d(cls, i2);
    }

    public static final int f(Class<?> cls, int i2) {
        Integer m3581constructorimpl;
        JvmClassMappingKt.getKotlinClass(cls);
        try {
            Result.Companion companion = Result.Companion;
            m3581constructorimpl = Result.m3581constructorimpl(Integer.valueOf(e(cls, 0, 1, null)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m3581constructorimpl = Result.m3581constructorimpl(ResultKt.createFailure(th));
        }
        Integer valueOf = Integer.valueOf(i2);
        if (Result.m3587isFailureimpl(m3581constructorimpl)) {
            m3581constructorimpl = valueOf;
        }
        return ((Number) m3581constructorimpl).intValue();
    }

    public static final Function1<Throwable, Throwable> g(Function1<? super Throwable, ? extends Throwable> function1) {
        return new g(function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <E extends Throwable> E h(@NotNull E e2) {
        Object m3581constructorimpl;
        if (e2 instanceof j.m0) {
            try {
                Result.Companion companion = Result.Companion;
                m3581constructorimpl = Result.m3581constructorimpl(((j.m0) e2).a());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m3581constructorimpl = Result.m3581constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m3587isFailureimpl(m3581constructorimpl)) {
                m3581constructorimpl = null;
            }
            return (E) m3581constructorimpl;
        }
        return (E) f2031b.a(e2.getClass()).invoke(e2);
    }
}
