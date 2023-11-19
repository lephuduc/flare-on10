package androidx.compose.ui.input.pointer;

import androidx.appcompat.R;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class PointerIconKt$pointerHoverIcon$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    public final /* synthetic */ PointerIcon $icon;
    public final /* synthetic */ boolean $overrideDescendants;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1", f = "PointerIcon.kt", i = {}, l = {R.styleable.AppCompatTheme_editTextStyle}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ PointerIcon $icon;
        public final /* synthetic */ boolean $overrideDescendants;
        public final /* synthetic */ PointerIconService $pointerIconService;
        private /* synthetic */ Object L$0;
        public int label;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        @DebugMetadata(c = "androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1$1", f = "PointerIcon.kt", i = {0}, l = {R.styleable.AppCompatTheme_listDividerAlertDialog}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"})
        /* renamed from: androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00431 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ PointerIcon $icon;
            public final /* synthetic */ boolean $overrideDescendants;
            public final /* synthetic */ PointerIconService $pointerIconService;
            private /* synthetic */ Object L$0;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00431(boolean z, PointerIconService pointerIconService, PointerIcon pointerIcon, Continuation<? super C00431> continuation) {
                super(2, continuation);
                this.$overrideDescendants = z;
                this.$pointerIconService = pointerIconService;
                this.$icon = pointerIcon;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C00431 c00431 = new C00431(this.$overrideDescendants, this.$pointerIconService, this.$icon, continuation);
                c00431.L$0 = obj;
                return c00431;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C00431) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
                */
            /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
            /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0034 -> B:16:0x0037). Please submit an issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r5.label
                    r2 = 1
                    if (r1 == 0) goto L1b
                    if (r1 != r2) goto L13
                    java.lang.Object r1 = r5.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                    kotlin.ResultKt.throwOnFailure(r6)
                    goto L37
                L13:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L1b:
                    kotlin.ResultKt.throwOnFailure(r6)
                    java.lang.Object r6 = r5.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r6 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r6
                    r1 = r6
                L23:
                    boolean r6 = r5.$overrideDescendants
                    if (r6 == 0) goto L2a
                    androidx.compose.ui.input.pointer.PointerEventPass r6 = androidx.compose.ui.input.pointer.PointerEventPass.Main
                    goto L2c
                L2a:
                    androidx.compose.ui.input.pointer.PointerEventPass r6 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                L2c:
                    r5.L$0 = r1
                    r5.label = r2
                    java.lang.Object r6 = r1.awaitPointerEvent(r6, r5)
                    if (r6 != r0) goto L37
                    return r0
                L37:
                    androidx.compose.ui.input.pointer.PointerEvent r6 = (androidx.compose.ui.input.pointer.PointerEvent) r6
                    int r6 = r6.m2605getType7fucELk()
                    androidx.compose.ui.input.pointer.PointerEventType$Companion r3 = androidx.compose.ui.input.pointer.PointerEventType.Companion
                    int r4 = r3.m2617getEnter7fucELk()
                    boolean r4 = androidx.compose.ui.input.pointer.PointerEventType.m2612equalsimpl0(r6, r4)
                    if (r4 == 0) goto L4b
                    r6 = r2
                    goto L53
                L4b:
                    int r3 = r3.m2619getMove7fucELk()
                    boolean r6 = androidx.compose.ui.input.pointer.PointerEventType.m2612equalsimpl0(r6, r3)
                L53:
                    if (r6 == 0) goto L23
                    androidx.compose.ui.input.pointer.PointerIconService r6 = r5.$pointerIconService
                    androidx.compose.ui.input.pointer.PointerIcon r3 = r5.$icon
                    r6.setCurrent(r3)
                    goto L23
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2.AnonymousClass1.C00431.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, PointerIconService pointerIconService, PointerIcon pointerIcon, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$overrideDescendants = z;
            this.$pointerIconService = pointerIconService;
            this.$icon = pointerIcon;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$overrideDescendants, this.$pointerIconService, this.$icon, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                C00431 c00431 = new C00431(this.$overrideDescendants, this.$pointerIconService, this.$icon, null);
                this.label = 1;
                if (((PointerInputScope) this.L$0).awaitPointerEventScope(c00431, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerIconKt$pointerHoverIcon$2(PointerIcon pointerIcon, boolean z) {
        super(3);
        this.$icon = pointerIcon;
        this.$overrideDescendants = z;
    }

    @Composable
    @NotNull
    public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(-270919819);
        PointerIconService pointerIconService = (PointerIconService) composer.consume(CompositionLocalsKt.getLocalPointerIconService());
        Modifier pointerInput = pointerIconService == null ? Modifier.Companion : SuspendingPointerInputFilterKt.pointerInput(composed, this.$icon, Boolean.valueOf(this.$overrideDescendants), new AnonymousClass1(this.$overrideDescendants, pointerIconService, this.$icon, null));
        composer.endReplaceableGroup();
        return pointerInput;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }
}
