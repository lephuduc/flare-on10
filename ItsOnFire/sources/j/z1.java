package j;

import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextKey;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 \u000b2\u00020\u00012\u00020\u0002:\u0001\fB\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H&R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lj/z1;", "Lj/o0;", "Ljava/io/Closeable;", "", "close", "Ljava/util/concurrent/Executor;", "q", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "()V", "j", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public abstract class z1 extends o0 implements Closeable {
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    public static final a f590j = new a(null);

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj/z1$a;", "Lkotlin/coroutines/AbstractCoroutineContextKey;", "Lj/o0;", "Lj/z1;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    @ExperimentalStdlibApi
    /* loaded from: classes2.dex */
    public static final class a extends AbstractCoroutineContextKey<o0, z1> {

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/coroutines/CoroutineContext$Element;", "it", "Lj/z1;", "a", "(Lkotlin/coroutines/CoroutineContext$Element;)Lj/z1;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: j.z1$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0051a extends Lambda implements Function1<CoroutineContext.Element, z1> {

            /* renamed from: j  reason: collision with root package name */
            public static final C0051a f591j = new C0051a();

            public C0051a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            /* renamed from: a */
            public final z1 invoke(@NotNull CoroutineContext.Element element) {
                if (element instanceof z1) {
                    return (z1) element;
                }
                return null;
            }
        }

        public a() {
            super(o0.Key, C0051a.f591j);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public abstract void close();

    @NotNull
    public abstract Executor q();
}
