package l;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import j.e2;
import j.e3;
import j.m1;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007\u001a1\u0010\f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a1\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"", "delayMillis", "initialDelayMillis", "Lkotlin/coroutines/CoroutineContext;", "context", "Ll/q0;", "mode", "Ll/i0;", "", "e", "Ll/m0;", "channel", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "(JJLl/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class p0 {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", i = {0, 0, 1, 1, 2, 2}, l = {R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, 108, 109}, m = "fixedDelayTicker", n = {"channel", "delayMillis", "channel", "delayMillis", "channel", "delayMillis"}, s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0"})
    /* loaded from: classes2.dex */
    public static final class a extends ContinuationImpl {

        /* renamed from: j  reason: collision with root package name */
        public long f706j;

        /* renamed from: k  reason: collision with root package name */
        public Object f707k;

        /* renamed from: l  reason: collision with root package name */
        public /* synthetic */ Object f708l;

        /* renamed from: m  reason: collision with root package name */
        public int f709m;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f708l = obj;
            this.f709m |= Integer.MIN_VALUE;
            return p0.c(0L, 0L, null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3}, l = {R.styleable.AppCompatTheme_listPreferredItemPaddingRight, R.styleable.AppCompatTheme_panelMenuListWidth, R.styleable.AppCompatTheme_ratingBarStyleSmall, R.styleable.AppCompatTheme_seekBarStyle}, m = "fixedPeriodTicker", n = {"channel", "delayMillis", "deadline", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs"}, s = {"L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1"})
    /* loaded from: classes2.dex */
    public static final class b extends ContinuationImpl {

        /* renamed from: j  reason: collision with root package name */
        public long f710j;

        /* renamed from: k  reason: collision with root package name */
        public long f711k;

        /* renamed from: l  reason: collision with root package name */
        public Object f712l;

        /* renamed from: m  reason: collision with root package name */
        public /* synthetic */ Object f713m;

        /* renamed from: n  reason: collision with root package name */
        public int f714n;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f713m = obj;
            this.f714n |= Integer.MIN_VALUE;
            return p0.d(0L, 0L, null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Ll/g0;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.channels.TickerChannelsKt$ticker$3", f = "TickerChannels.kt", i = {}, l = {R.styleable.AppCompatTheme_imageButtonStyle, R.styleable.AppCompatTheme_listChoiceBackgroundIndicator}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class c extends SuspendLambda implements Function2<g0<? super Unit>, Continuation<? super Unit>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public int f715j;

        /* renamed from: k  reason: collision with root package name */
        public /* synthetic */ Object f716k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ q0 f717l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ long f718m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ long f719n;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        /* loaded from: classes2.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f720a;

            static {
                int[] iArr = new int[q0.values().length];
                iArr[q0.FIXED_PERIOD.ordinal()] = 1;
                iArr[q0.FIXED_DELAY.ordinal()] = 2;
                f720a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(q0 q0Var, long j2, long j3, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f717l = q0Var;
            this.f718m = j2;
            this.f719n = j3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            c cVar = new c(this.f717l, this.f718m, this.f719n, continuation);
            cVar.f716k = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull g0<? super Unit> g0Var, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(g0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f715j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                g0 g0Var = (g0) this.f716k;
                int i3 = a.f720a[this.f717l.ordinal()];
                if (i3 == 1) {
                    long j2 = this.f718m;
                    long j3 = this.f719n;
                    m0 c2 = g0Var.c();
                    this.f715j = 1;
                    if (p0.d(j2, j3, c2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i3 == 2) {
                    long j4 = this.f718m;
                    long j5 = this.f719n;
                    m0 c3 = g0Var.c();
                    this.f715j = 2;
                    if (p0.c(j4, j5, c3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x007d -> B:14:0x0034). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(long r6, long r8, l.m0<? super kotlin.Unit> r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            boolean r0 = r11 instanceof l.p0.a
            if (r0 == 0) goto L13
            r0 = r11
            l.p0$a r0 = (l.p0.a) r0
            int r1 = r0.f709m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f709m = r1
            goto L18
        L13:
            l.p0$a r0 = new l.p0$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f708l
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f709m
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L53
            if (r2 == r5) goto L48
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            long r6 = r0.f706j
            java.lang.Object r8 = r0.f707k
            l.m0 r8 = (l.m0) r8
            kotlin.ResultKt.throwOnFailure(r11)
        L34:
            r10 = r8
            goto L63
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            long r6 = r0.f706j
            java.lang.Object r8 = r0.f707k
            l.m0 r8 = (l.m0) r8
            kotlin.ResultKt.throwOnFailure(r11)
            goto L73
        L48:
            long r6 = r0.f706j
            java.lang.Object r8 = r0.f707k
            r10 = r8
            l.m0 r10 = (l.m0) r10
            kotlin.ResultKt.throwOnFailure(r11)
            goto L63
        L53:
            kotlin.ResultKt.throwOnFailure(r11)
            r0.f707k = r10
            r0.f706j = r6
            r0.f709m = r5
            java.lang.Object r8 = j.f1.b(r8, r0)
            if (r8 != r1) goto L63
            return r1
        L63:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            r0.f707k = r10
            r0.f706j = r6
            r0.f709m = r4
            java.lang.Object r8 = r10.U(r8, r0)
            if (r8 != r1) goto L72
            return r1
        L72:
            r8 = r10
        L73:
            r0.f707k = r8
            r0.f706j = r6
            r0.f709m = r3
            java.lang.Object r9 = j.f1.b(r6, r0)
            if (r9 != r1) goto L34
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.p0.c(long, long, l.m0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0114 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00fc -> B:31:0x00aa). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0112 -> B:15:0x003d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(long r18, long r20, l.m0<? super kotlin.Unit> r22, kotlin.coroutines.Continuation<? super kotlin.Unit> r23) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l.p0.d(long, long, l.m0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @e3
    @NotNull
    public static final i0<Unit> e(long j2, long j3, @NotNull CoroutineContext coroutineContext, @NotNull q0 q0Var) {
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("Expected non-negative delay, but has " + j2 + " ms").toString());
        }
        if (j3 >= 0) {
            return e0.d(e2.f425j, m1.g().plus(coroutineContext), 0, new c(q0Var, j2, j3, null));
        }
        throw new IllegalArgumentException(("Expected non-negative initial delay, but has " + j3 + " ms").toString());
    }

    public static /* synthetic */ i0 f(long j2, long j3, CoroutineContext coroutineContext, q0 q0Var, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j3 = j2;
        }
        if ((i2 & 4) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i2 & 8) != 0) {
            q0Var = q0.FIXED_PERIOD;
        }
        return e(j2, j3, coroutineContext, q0Var);
    }
}
