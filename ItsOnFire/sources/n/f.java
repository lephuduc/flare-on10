package n;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001B#\u0012\b\u0010)\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b3\u00104J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0005H\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J'\u0010\u0010\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00030\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u000fH\u0082Pø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001eR\u0013\u0010)\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010(R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028F¢\u0006\u0006\u001a\u0004\b#\u0010*R\u0011\u0010\u0006\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b,\u0010-R(\u00102\u001a\u0004\u0018\u00010\u000f2\b\u0010.\u001a\u0004\u0018\u00010\u000f8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b&\u0010/\"\u0004\b0\u00101\u0082\u0002\u0004\n\u0002\b\u0019¨\u00065"}, d2 = {"Ln/f;", "", "", "Ljava/lang/StackTraceElement;", "h", "", "state", "Lkotlin/coroutines/Continuation;", "frame", "", "j", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)V", "toString", "b", "Lkotlin/sequences/SequenceScope;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "k", "(Lkotlin/sequences/SequenceScope;Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ln/n;", "a", "Ln/n;", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "()Ln/n;", "creationStackBottom", "", "J", "sequenceNumber", "Ljava/lang/ref/WeakReference;", "Lkotlin/coroutines/CoroutineContext;", "c", "Ljava/lang/ref/WeakReference;", "_context", "Ljava/lang/String;", "_state", "Ljava/lang/Thread;", "e", "Ljava/lang/Thread;", "lastObservedThread", "f", "_lastObservedFrame", "()Lkotlin/coroutines/CoroutineContext;", "context", "()Ljava/util/List;", "creationStackTrace", "g", "()Ljava/lang/String;", "value", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "i", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)V", "lastObservedFrame", "<init>", "(Lkotlin/coroutines/CoroutineContext;Ln/n;J)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class f {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public final n f994a;
    @JvmField

    /* renamed from: b  reason: collision with root package name */
    public final long f995b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final WeakReference<CoroutineContext> f996c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public String f997d = g.f1010a;
    @JvmField
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public Thread f998e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public WeakReference<CoroutineStackFrame> f999f;

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlin/sequences/SequenceScope;", "Ljava/lang/StackTraceElement;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1", f = "DebugCoroutineInfoImpl.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class a extends RestrictedSuspendLambda implements Function2<SequenceScope<? super StackTraceElement>, Continuation<? super Unit>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public int f1000j;

        /* renamed from: k  reason: collision with root package name */
        public /* synthetic */ Object f1001k;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ n f1003m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n nVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f1003m = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f1003m, continuation);
            aVar.f1001k = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SequenceScope<? super StackTraceElement> sequenceScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1000j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                f fVar = f.this;
                CoroutineStackFrame callerFrame = this.f1003m.getCallerFrame();
                this.f1000j = 1;
                if (fVar.k((SequenceScope) this.f1001k, callerFrame, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl", f = "DebugCoroutineInfoImpl.kt", i = {}, l = {R.styleable.AppCompatTheme_listPreferredItemHeightLarge}, m = "yieldFrames", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class b extends ContinuationImpl {

        /* renamed from: j  reason: collision with root package name */
        public Object f1004j;

        /* renamed from: k  reason: collision with root package name */
        public Object f1005k;

        /* renamed from: l  reason: collision with root package name */
        public Object f1006l;

        /* renamed from: m  reason: collision with root package name */
        public /* synthetic */ Object f1007m;

        /* renamed from: o  reason: collision with root package name */
        public int f1009o;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f1007m = obj;
            this.f1009o |= Integer.MIN_VALUE;
            return f.this.k(null, null, this);
        }
    }

    public f(@Nullable CoroutineContext coroutineContext, @Nullable n nVar, long j2) {
        this.f994a = nVar;
        this.f995b = j2;
        this.f996c = new WeakReference<>(coroutineContext);
    }

    public final List<StackTraceElement> b() {
        Sequence sequence;
        List<StackTraceElement> list;
        List<StackTraceElement> emptyList;
        n nVar = this.f994a;
        if (nVar == null) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        sequence = SequencesKt__SequenceBuilderKt.sequence(new a(nVar, null));
        list = SequencesKt___SequencesKt.toList(sequence);
        return list;
    }

    @Nullable
    public final CoroutineContext c() {
        return this.f996c.get();
    }

    @Nullable
    public final n d() {
        return this.f994a;
    }

    @NotNull
    public final List<StackTraceElement> e() {
        return b();
    }

    @Nullable
    public final CoroutineStackFrame f() {
        WeakReference<CoroutineStackFrame> weakReference = this.f999f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @NotNull
    public final String g() {
        return this.f997d;
    }

    @NotNull
    public final List<StackTraceElement> h() {
        List<StackTraceElement> emptyList;
        CoroutineStackFrame f2 = f();
        if (f2 == null) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        ArrayList arrayList = new ArrayList();
        while (f2 != null) {
            StackTraceElement stackTraceElement = f2.getStackTraceElement();
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
            f2 = f2.getCallerFrame();
        }
        return arrayList;
    }

    public final void i(@Nullable CoroutineStackFrame coroutineStackFrame) {
        this.f999f = coroutineStackFrame != null ? new WeakReference<>(coroutineStackFrame) : null;
    }

    public final void j(@NotNull String str, @NotNull Continuation<?> continuation) {
        if (Intrinsics.areEqual(this.f997d, str) && Intrinsics.areEqual(str, g.f1012c) && f() != null) {
            return;
        }
        this.f997d = str;
        i(continuation instanceof CoroutineStackFrame ? (CoroutineStackFrame) continuation : null);
        this.f998e = Intrinsics.areEqual(str, g.f1011b) ? Thread.currentThread() : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0049 -> B:25:0x0060). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x005a -> B:24:0x005d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(kotlin.sequences.SequenceScope<? super java.lang.StackTraceElement> r6, kotlin.coroutines.jvm.internal.CoroutineStackFrame r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof n.f.b
            if (r0 == 0) goto L13
            r0 = r8
            n.f$b r0 = (n.f.b) r0
            int r1 = r0.f1009o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1009o = r1
            goto L18
        L13:
            n.f$b r0 = new n.f$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f1007m
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f1009o
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r5 = r0.f1006l
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r5 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r5
            java.lang.Object r6 = r0.f1005k
            kotlin.sequences.SequenceScope r6 = (kotlin.sequences.SequenceScope) r6
            java.lang.Object r7 = r0.f1004j
            n.f r7 = (n.f) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L5d
        L35:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3d:
            kotlin.ResultKt.throwOnFailure(r8)
        L40:
            if (r7 != 0) goto L45
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L45:
            java.lang.StackTraceElement r8 = r7.getStackTraceElement()
            if (r8 == 0) goto L60
            r0.f1004j = r5
            r0.f1005k = r6
            r0.f1006l = r7
            r0.f1009o = r3
            java.lang.Object r8 = r6.yield(r8, r0)
            if (r8 != r1) goto L5a
            return r1
        L5a:
            r4 = r7
            r7 = r5
            r5 = r4
        L5d:
            r4 = r7
            r7 = r5
            r5 = r4
        L60:
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r7 = r7.getCallerFrame()
            if (r7 == 0) goto L67
            goto L40
        L67:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n.f.k(kotlin.sequences.SequenceScope, kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public String toString() {
        return "DebugCoroutineInfo(state=" + g() + ",context=" + c() + ')';
    }
}
