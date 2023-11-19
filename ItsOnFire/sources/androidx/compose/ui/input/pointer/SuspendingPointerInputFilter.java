package androidx.compose.ui.input.pointer;

import androidx.appcompat.R;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.input.pointer.PointerInputModifier;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntSize;
import androidx.core.app.NotificationCompat;
import j.e2;
import j.q;
import j.r;
import j.u0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001iB\u0019\u0012\u0006\u0010?\u001a\u00020>\u0012\b\b\u0002\u0010^\u001a\u00020\u0004¢\u0006\u0004\bg\u0010hJ-\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u001a\u0010\n\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u00030\bR\u00020\u0000\u0012\u0004\u0012\u00020\t0\u0007H\u0082\bJ\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u001a\u0010\u0013\u001a\u00020\u0010*\u00020\u000fH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\u00020\u0010*\u00020\u0014H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u000f*\u00020\u0014H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\u000f*\u00020\u001aH\u0097\u0001ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u0019\u001a\u00020\u000f*\u00020\u0010H\u0097\u0001ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001dJ\u001a\u0010\"\u001a\u00020\u001f*\u00020\u001eH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u001a*\u00020\u000fH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010\u001cJ\u001a\u0010$\u001a\u00020\u001a*\u00020\u0014H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010\u0018J\r\u0010(\u001a\u00020'*\u00020&H\u0097\u0001J\u001a\u0010*\u001a\u00020\u001e*\u00020\u001fH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010!J\u001a\u0010-\u001a\u00020\u0014*\u00020\u000fH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,J\u001d\u0010-\u001a\u00020\u0014*\u00020\u001aH\u0097\u0001ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b.\u0010,J\u001d\u0010-\u001a\u00020\u0014*\u00020\u0010H\u0097\u0001ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b.\u0010/J-\u00104\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u00101\u001a\u000200H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103J\b\u00105\u001a\u00020\tH\u0016JB\u0010<\u001a\u00028\u0000\"\u0004\b\u0000\u001062'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u000208\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000009\u0012\u0006\u0012\u0004\u0018\u00010:07¢\u0006\u0002\b;H\u0096@ø\u0001\u0000¢\u0006\u0004\b<\u0010=R\u001a\u0010?\u001a\u00020>8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\"\u0010F\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u00030\bR\u00020\u00000E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\"\u0010H\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u00030\bR\u00020\u00000E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010GR\u0018\u0010I\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010DR\u001f\u0010J\u001a\u0002008\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bJ\u0010KR(\u0010M\u001a\u00020L8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\bM\u0010N\u0012\u0004\bS\u0010T\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010V\u001a\u00020U8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u0014\u0010^\u001a\u00020\u001a8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0014\u0010`\u001a\u00020\u001a8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b_\u0010]R\u0014\u0010c\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bR\u001d\u0010f\u001a\u00020\u001e8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bd\u0010e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006j"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilter;", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "Landroidx/compose/ui/input/pointer/PointerInputModifier;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilter$PointerEventHandlerCoroutine;", "", "block", "forEachCurrentPointerHandler", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "dispatchPointerEvent", "Landroidx/compose/ui/unit/Dp;", "", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp-GaN1DYA", "(J)F", "toDp", "", "toDp-u2uoSUM", "(F)F", "(I)F", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toDpSize", "toPx-0680j_4", "toPx", "toPx--R2X_6o", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "toSize-XkaWNTQ", "toSize", "toSp-0xMU5do", "(F)J", "toSp", "toSp-kPz2Gy4", "(I)J", "Landroidx/compose/ui/unit/IntSize;", "bounds", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancel", "R", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "awaitPointerEventScope", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "currentEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "Landroidx/compose/runtime/collection/MutableVector;", "pointerHandlers", "Landroidx/compose/runtime/collection/MutableVector;", "dispatchingPointerHandlers", "lastPointerEvent", "boundsSize", "J", "Lj/u0;", "coroutineScope", "Lj/u0;", "getCoroutineScope", "()Lj/u0;", "setCoroutineScope", "(Lj/u0;)V", "getCoroutineScope$annotations", "()V", "", "interceptOutOfBoundsChildEvents", "Z", "getInterceptOutOfBoundsChildEvents", "()Z", "setInterceptOutOfBoundsChildEvents", "(Z)V", "getDensity", "()F", "density", "getFontScale", "fontScale", "getPointerInputFilter", "()Landroidx/compose/ui/input/pointer/PointerInputFilter;", "pointerInputFilter", "getExtendedTouchPadding-NH-jbRc", "()J", "extendedTouchPadding", "<init>", "(Landroidx/compose/ui/platform/ViewConfiguration;Landroidx/compose/ui/unit/Density;)V", "PointerEventHandlerCoroutine", "ui_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class SuspendingPointerInputFilter extends PointerInputFilter implements PointerInputModifier, PointerInputScope, Density {
    private final /* synthetic */ Density $$delegate_0;
    private long boundsSize;
    @NotNull
    private u0 coroutineScope;
    @NotNull
    private PointerEvent currentEvent;
    @NotNull
    private final MutableVector<PointerEventHandlerCoroutine<?>> dispatchingPointerHandlers;
    private boolean interceptOutOfBoundsChildEvents;
    @Nullable
    private PointerEvent lastPointerEvent;
    @NotNull
    private final MutableVector<PointerEventHandlerCoroutine<?>> pointerHandlers;
    @NotNull
    private final ViewConfiguration viewConfiguration;

    @Metadata(bv = {}, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0015\u0012\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b]\u0010^J\u001a\u0010\t\u001a\u00020\u0006*\u00020\u0005H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u0006*\u00020\nH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u0005*\u00020\nH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\u0005*\u00020\u0010H\u0097\u0001ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u000f\u001a\u00020\u0005*\u00020\u0006H\u0097\u0001ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0013J\u001a\u0010\u0018\u001a\u00020\u0015*\u00020\u0014H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u0010*\u00020\u0005H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u0012J\u001a\u0010\u001a\u001a\u00020\u0010*\u00020\nH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u000eJ\r\u0010\u001e\u001a\u00020\u001d*\u00020\u001cH\u0097\u0001J\u001a\u0010 \u001a\u00020\u0014*\u00020\u0015H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u001a\u0010#\u001a\u00020\n*\u00020\u0005H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"J\u001d\u0010#\u001a\u00020\n*\u00020\u0010H\u0097\u0001ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b$\u0010\"J\u001d\u0010#\u001a\u00020\n*\u00020\u0006H\u0097\u0001ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b$\u0010%J\u0016\u0010+\u001a\u00020*2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(J\u0010\u0010.\u001a\u00020*2\b\u0010-\u001a\u0004\u0018\u00010,J \u00101\u001a\u00020*2\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/H\u0016ø\u0001\u0000¢\u0006\u0004\b1\u00102J\u001b\u00103\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0096@ø\u0001\u0000¢\u0006\u0004\b3\u00104JL\u0010<\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0001\u001052\u0006\u00107\u001a\u0002062'\u0010;\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010908¢\u0006\u0002\b:H\u0096@ø\u0001\u0000¢\u0006\u0004\b<\u0010=JJ\u0010>\u001a\u00028\u0001\"\u0004\b\u0001\u001052\u0006\u00107\u001a\u0002062'\u0010;\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010908¢\u0006\u0002\b:H\u0096@ø\u0001\u0000¢\u0006\u0004\b>\u0010=R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001e\u0010B\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010G\u001a\u00020F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0014\u0010M\u001a\u00020\u00108\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010O\u001a\u00020\u00108\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bN\u0010LR\u0014\u0010R\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u001d\u0010V\u001a\u00020S8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010Z\u001a\u00020W8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u001d\u0010\\\u001a\u00020\u00148VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b[\u0010U\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006_"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilter$PointerEventHandlerCoroutine;", "R", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/coroutines/Continuation;", "Landroidx/compose/ui/unit/Dp;", "", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp-GaN1DYA", "(J)F", "toDp", "", "toDp-u2uoSUM", "(F)F", "(I)F", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toDpSize", "toPx-0680j_4", "toPx", "toPx--R2X_6o", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "toSize-XkaWNTQ", "toSize", "toSp-0xMU5do", "(F)J", "toSp", "toSp-kPz2Gy4", "(I)J", "Landroidx/compose/ui/input/pointer/PointerEvent;", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "", "offerPointerEvent", "", "cause", "cancel", "Lkotlin/Result;", "result", "resumeWith", "(Ljava/lang/Object;)V", "awaitPointerEvent", "(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "", "timeMillis", "Lkotlin/Function2;", "", "Lkotlin/ExtensionFunctionType;", "block", "withTimeoutOrNull", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withTimeout", "completion", "Lkotlin/coroutines/Continuation;", "Lj/q;", "pointerAwaiter", "Lj/q;", "awaitPass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getDensity", "()F", "density", "getFontScale", "fontScale", "getCurrentEvent", "()Landroidx/compose/ui/input/pointer/PointerEvent;", "currentEvent", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "size", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "getExtendedTouchPadding-NH-jbRc", "extendedTouchPadding", "<init>", "(Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilter;Lkotlin/coroutines/Continuation;)V", "ui_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public final class PointerEventHandlerCoroutine<R> implements AwaitPointerEventScope, Density, Continuation<R> {
        private final /* synthetic */ SuspendingPointerInputFilter $$delegate_0;
        @NotNull
        private PointerEventPass awaitPass;
        @NotNull
        private final Continuation<R> completion;
        @NotNull
        private final CoroutineContext context;
        @Nullable
        private q<? super PointerEvent> pointerAwaiter;
        public final /* synthetic */ SuspendingPointerInputFilter this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public PointerEventHandlerCoroutine(@NotNull SuspendingPointerInputFilter this$0, Continuation<? super R> completion) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(completion, "completion");
            this.this$0 = this$0;
            this.completion = completion;
            this.$$delegate_0 = this$0;
            this.awaitPass = PointerEventPass.Main;
            this.context = EmptyCoroutineContext.INSTANCE;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        @Nullable
        public Object awaitPointerEvent(@NotNull PointerEventPass pointerEventPass, @NotNull Continuation<? super PointerEvent> continuation) {
            Continuation intercepted;
            Object coroutine_suspended;
            intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
            r rVar = new r(intercepted, 1);
            rVar.E();
            this.awaitPass = pointerEventPass;
            this.pointerAwaiter = rVar;
            Object x = rVar.x();
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (x == coroutine_suspended) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return x;
        }

        public final void cancel(@Nullable Throwable th) {
            q<? super PointerEvent> qVar = this.pointerAwaiter;
            if (qVar != null) {
                qVar.a(th);
            }
            this.pointerAwaiter = null;
        }

        @Override // kotlin.coroutines.Continuation
        @NotNull
        public CoroutineContext getContext() {
            return this.context;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        @NotNull
        public PointerEvent getCurrentEvent() {
            return this.this$0.currentEvent;
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.$$delegate_0.getDensity();
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /* renamed from: getExtendedTouchPadding-NH-jbRc */
        public long mo2575getExtendedTouchPaddingNHjbRc() {
            return this.this$0.mo2680getExtendedTouchPaddingNHjbRc();
        }

        @Override // androidx.compose.ui.unit.Density
        public float getFontScale() {
            return this.$$delegate_0.getFontScale();
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /* renamed from: getSize-YbymL2g */
        public long mo2576getSizeYbymL2g() {
            return this.this$0.boundsSize;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        @NotNull
        public ViewConfiguration getViewConfiguration() {
            return this.this$0.getViewConfiguration();
        }

        public final void offerPointerEvent(@NotNull PointerEvent event, @NotNull PointerEventPass pass) {
            q<? super PointerEvent> qVar;
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(pass, "pass");
            if (pass != this.awaitPass || (qVar = this.pointerAwaiter) == null) {
                return;
            }
            this.pointerAwaiter = null;
            Result.Companion companion = Result.Companion;
            qVar.resumeWith(Result.m3581constructorimpl(event));
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(@NotNull Object obj) {
            MutableVector mutableVector = this.this$0.pointerHandlers;
            SuspendingPointerInputFilter suspendingPointerInputFilter = this.this$0;
            synchronized (mutableVector) {
                suspendingPointerInputFilter.pointerHandlers.remove(this);
                Unit unit = Unit.INSTANCE;
            }
            this.completion.resumeWith(obj);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: roundToPx--R2X_6o */
        public int mo270roundToPxR2X_6o(long j2) {
            return this.$$delegate_0.mo270roundToPxR2X_6o(j2);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: roundToPx-0680j_4 */
        public int mo271roundToPx0680j_4(float f2) {
            return this.$$delegate_0.mo271roundToPx0680j_4(f2);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toDp-GaN1DYA */
        public float mo272toDpGaN1DYA(long j2) {
            return this.$$delegate_0.mo272toDpGaN1DYA(j2);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toDp-u2uoSUM */
        public float mo273toDpu2uoSUM(float f2) {
            return this.$$delegate_0.mo273toDpu2uoSUM(f2);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toDp-u2uoSUM */
        public float mo274toDpu2uoSUM(int i2) {
            return this.$$delegate_0.mo274toDpu2uoSUM(i2);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toDpSize-k-rfVVM */
        public long mo275toDpSizekrfVVM(long j2) {
            return this.$$delegate_0.mo275toDpSizekrfVVM(j2);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toPx--R2X_6o */
        public float mo276toPxR2X_6o(long j2) {
            return this.$$delegate_0.mo276toPxR2X_6o(j2);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toPx-0680j_4 */
        public float mo277toPx0680j_4(float f2) {
            return this.$$delegate_0.mo277toPx0680j_4(f2);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        @NotNull
        public Rect toRect(@NotNull DpRect dpRect) {
            Intrinsics.checkNotNullParameter(dpRect, "<this>");
            return this.$$delegate_0.toRect(dpRect);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toSize-XkaWNTQ */
        public long mo278toSizeXkaWNTQ(long j2) {
            return this.$$delegate_0.mo278toSizeXkaWNTQ(j2);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toSp-0xMU5do */
        public long mo279toSp0xMU5do(float f2) {
            return this.$$delegate_0.mo279toSp0xMU5do(f2);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toSp-kPz2Gy4 */
        public long mo280toSpkPz2Gy4(float f2) {
            return this.$$delegate_0.mo280toSpkPz2Gy4(f2);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toSp-kPz2Gy4 */
        public long mo281toSpkPz2Gy4(int i2) {
            return this.$$delegate_0.mo281toSpkPz2Gy4(i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
        /* JADX WARN: Type inference failed for: r1v0, types: [long] */
        /* JADX WARN: Type inference failed for: r1v1, types: [j.n2] */
        /* JADX WARN: Type inference failed for: r1v3, types: [j.n2] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v8 */
        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public <T> java.lang.Object withTimeout(long r16, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.AwaitPointerEventScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r18, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r19) {
            /*
                r15 = this;
                r0 = r15
                r1 = r16
                r3 = r19
                boolean r4 = r3 instanceof androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1
                if (r4 == 0) goto L18
                r4 = r3
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1 r4 = (androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1) r4
                int r5 = r4.label
                r6 = -2147483648(0xffffffff80000000, float:-0.0)
                r7 = r5 & r6
                if (r7 == 0) goto L18
                int r5 = r5 - r6
                r4.label = r5
                goto L1d
            L18:
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1 r4 = new androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1
                r4.<init>(r15, r3)
            L1d:
                java.lang.Object r3 = r4.result
                java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r6 = r4.label
                r7 = 1
                r8 = 0
                if (r6 == 0) goto L3e
                if (r6 != r7) goto L36
                java.lang.Object r0 = r4.L$0
                r1 = r0
                j.n2 r1 = (j.n2) r1
                kotlin.ResultKt.throwOnFailure(r3)     // Catch: java.lang.Throwable -> L34
                goto L7e
            L34:
                r0 = move-exception
                goto L82
            L36:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L3e:
                kotlin.ResultKt.throwOnFailure(r3)
                r9 = 0
                int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
                if (r3 > 0) goto L5e
                j.q<? super androidx.compose.ui.input.pointer.PointerEvent> r3 = r0.pointerAwaiter
                if (r3 != 0) goto L4c
                goto L5e
            L4c:
                kotlin.Result$Companion r6 = kotlin.Result.Companion
                androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r6 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
                r6.<init>(r1)
                java.lang.Object r6 = kotlin.ResultKt.createFailure(r6)
                java.lang.Object r6 = kotlin.Result.m3581constructorimpl(r6)
                r3.resumeWith(r6)
            L5e:
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilter r3 = r0.this$0
                j.u0 r9 = r3.getCoroutineScope()
                r10 = 0
                r11 = 0
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1 r12 = new androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1
                r12.<init>(r1, r15, r8)
                r13 = 3
                r14 = 0
                j.n2 r1 = j.j.e(r9, r10, r11, r12, r13, r14)
                r4.L$0 = r1     // Catch: java.lang.Throwable -> L34
                r4.label = r7     // Catch: java.lang.Throwable -> L34
                r2 = r18
                java.lang.Object r3 = r2.invoke(r15, r4)     // Catch: java.lang.Throwable -> L34
                if (r3 != r5) goto L7e
                return r5
            L7e:
                j.n2.a.b(r1, r8, r7, r8)
                return r3
            L82:
                j.n2.a.b(r1, r8, r7, r8)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputFilter.PointerEventHandlerCoroutine.withTimeout(long, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public <T> java.lang.Object withTimeoutOrNull(long r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.AwaitPointerEventScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r8) {
            /*
                r4 = this;
                boolean r0 = r8 instanceof androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1
                if (r0 == 0) goto L13
                r0 = r8
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1
                r0.<init>(r4, r8)
            L18:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.ResultKt.throwOnFailure(r8)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3d
                goto L3e
            L29:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L31:
                kotlin.ResultKt.throwOnFailure(r8)
                r0.label = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3d
                java.lang.Object r8 = r4.withTimeout(r5, r7, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3d
                if (r8 != r1) goto L3e
                return r1
            L3d:
                r8 = 0
            L3e:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputFilter.PointerEventHandlerCoroutine.withTimeoutOrNull(long, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PointerEventPass.values().length];
            iArr[PointerEventPass.Initial.ordinal()] = 1;
            iArr[PointerEventPass.Final.ordinal()] = 2;
            iArr[PointerEventPass.Main.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SuspendingPointerInputFilter(@NotNull ViewConfiguration viewConfiguration, @NotNull Density density) {
        PointerEvent pointerEvent;
        Intrinsics.checkNotNullParameter(viewConfiguration, "viewConfiguration");
        Intrinsics.checkNotNullParameter(density, "density");
        this.viewConfiguration = viewConfiguration;
        this.$$delegate_0 = density;
        pointerEvent = SuspendingPointerInputFilterKt.EmptyPointerEvent;
        this.currentEvent = pointerEvent;
        this.pointerHandlers = new MutableVector<>(new PointerEventHandlerCoroutine[16], 0);
        this.dispatchingPointerHandlers = new MutableVector<>(new PointerEventHandlerCoroutine[16], 0);
        this.boundsSize = IntSize.Companion.m3490getZeroYbymL2g();
        this.coroutineScope = e2.f425j;
    }

    public /* synthetic */ SuspendingPointerInputFilter(ViewConfiguration viewConfiguration, Density density, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewConfiguration, (i2 & 2) != 0 ? DensityKt.Density$default(1.0f, 0.0f, 2, null) : density);
    }

    private final void dispatchPointerEvent(PointerEvent pointerEvent, PointerEventPass pointerEventPass) {
        MutableVector<PointerEventHandlerCoroutine<?>> mutableVector;
        int size;
        synchronized (this.pointerHandlers) {
            MutableVector<PointerEventHandlerCoroutine<?>> mutableVector2 = this.dispatchingPointerHandlers;
            mutableVector2.addAll(mutableVector2.getSize(), this.pointerHandlers);
        }
        try {
            int i2 = WhenMappings.$EnumSwitchMapping$0[pointerEventPass.ordinal()];
            if (i2 == 1 || i2 == 2) {
                MutableVector<PointerEventHandlerCoroutine<?>> mutableVector3 = this.dispatchingPointerHandlers;
                int size2 = mutableVector3.getSize();
                if (size2 > 0) {
                    int i3 = 0;
                    PointerEventHandlerCoroutine<?>[] content = mutableVector3.getContent();
                    do {
                        content[i3].offerPointerEvent(pointerEvent, pointerEventPass);
                        i3++;
                    } while (i3 < size2);
                }
            } else if (i2 == 3 && (size = (mutableVector = this.dispatchingPointerHandlers).getSize()) > 0) {
                int i4 = size - 1;
                PointerEventHandlerCoroutine<?>[] content2 = mutableVector.getContent();
                do {
                    content2[i4].offerPointerEvent(pointerEvent, pointerEventPass);
                    i4--;
                } while (i4 >= 0);
            }
        } finally {
            this.dispatchingPointerHandlers.clear();
        }
    }

    private final void forEachCurrentPointerHandler(PointerEventPass pointerEventPass, Function1<? super PointerEventHandlerCoroutine<?>, Unit> function1) {
        MutableVector<PointerEventHandlerCoroutine<?>> mutableVector;
        int size;
        synchronized (this.pointerHandlers) {
            try {
                MutableVector<PointerEventHandlerCoroutine<?>> mutableVector2 = this.dispatchingPointerHandlers;
                mutableVector2.addAll(mutableVector2.getSize(), this.pointerHandlers);
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        try {
            int i2 = WhenMappings.$EnumSwitchMapping$0[pointerEventPass.ordinal()];
            if (i2 == 1 || i2 == 2) {
                MutableVector<PointerEventHandlerCoroutine<?>> mutableVector3 = this.dispatchingPointerHandlers;
                int size2 = mutableVector3.getSize();
                if (size2 > 0) {
                    int i3 = 0;
                    PointerEventHandlerCoroutine<?>[] content = mutableVector3.getContent();
                    do {
                        function1.invoke(content[i3]);
                        i3++;
                    } while (i3 < size2);
                }
            } else if (i2 == 3 && (size = (mutableVector = this.dispatchingPointerHandlers).getSize()) > 0) {
                int i4 = size - 1;
                PointerEventHandlerCoroutine<?>[] content2 = mutableVector.getContent();
                do {
                    function1.invoke(content2[i4]);
                    i4--;
                } while (i4 >= 0);
            }
        } finally {
            InlineMarker.finallyStart(1);
            this.dispatchingPointerHandlers.clear();
            InlineMarker.finallyEnd(1);
        }
    }

    public static /* synthetic */ void getCoroutineScope$annotations() {
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public boolean all(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
        return PointerInputModifier.DefaultImpls.all(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public boolean any(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
        return PointerInputModifier.DefaultImpls.any(this, function1);
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    @Nullable
    public <R> Object awaitPointerEventScope(@NotNull Function2<? super AwaitPointerEventScope, ? super Continuation<? super R>, ? extends Object> function2, @NotNull Continuation<? super R> continuation) {
        Continuation intercepted;
        Object coroutine_suspended;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        r rVar = new r(intercepted, 1);
        rVar.E();
        PointerEventHandlerCoroutine pointerEventHandlerCoroutine = new PointerEventHandlerCoroutine(this, rVar);
        synchronized (this.pointerHandlers) {
            this.pointerHandlers.add(pointerEventHandlerCoroutine);
            Continuation<Unit> createCoroutine = ContinuationKt.createCoroutine(function2, pointerEventHandlerCoroutine, pointerEventHandlerCoroutine);
            Result.Companion companion = Result.Companion;
            createCoroutine.resumeWith(Result.m3581constructorimpl(Unit.INSTANCE));
        }
        rVar.A(new SuspendingPointerInputFilter$awaitPointerEventScope$2$2(pointerEventHandlerCoroutine));
        Object x = rVar.x();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (x == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return x;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public <R> R foldIn(R r2, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> function2) {
        return (R) PointerInputModifier.DefaultImpls.foldIn(this, r2, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public <R> R foldOut(R r2, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> function2) {
        return (R) PointerInputModifier.DefaultImpls.foldOut(this, r2, function2);
    }

    @NotNull
    public final u0 getCoroutineScope() {
        return this.coroutineScope;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    /* renamed from: getExtendedTouchPadding-NH-jbRc */
    public long mo2680getExtendedTouchPaddingNHjbRc() {
        long mo278toSizeXkaWNTQ = mo278toSizeXkaWNTQ(getViewConfiguration().mo2872getMinimumTouchTargetSizeMYxV2XQ());
        long m2678getSizeYbymL2g = m2678getSizeYbymL2g();
        return SizeKt.Size(Math.max(0.0f, Size.m1230getWidthimpl(mo278toSizeXkaWNTQ) - IntSize.m3485getWidthimpl(m2678getSizeYbymL2g)) / 2.0f, Math.max(0.0f, Size.m1227getHeightimpl(mo278toSizeXkaWNTQ) - IntSize.m3484getHeightimpl(m2678getSizeYbymL2g)) / 2.0f);
    }

    @Override // androidx.compose.ui.unit.Density
    public float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputFilter, androidx.compose.ui.input.pointer.PointerInputScope
    public boolean getInterceptOutOfBoundsChildEvents() {
        return this.interceptOutOfBoundsChildEvents;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputModifier
    @NotNull
    public PointerInputFilter getPointerInputFilter() {
        return this;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    @NotNull
    public ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    public void onCancel() {
        List<PointerInputChange> changes;
        boolean z;
        PointerInputChange m2655copyEzrO64;
        PointerEvent pointerEvent = this.lastPointerEvent;
        if (pointerEvent == null) {
            return;
        }
        int size = pointerEvent.getChanges().size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z = true;
                break;
            }
            int i3 = i2 + 1;
            if (!(!changes.get(i2).getPressed())) {
                z = false;
                break;
            }
            i2 = i3;
        }
        if (z) {
            return;
        }
        List<PointerInputChange> changes2 = pointerEvent.getChanges();
        ArrayList arrayList = new ArrayList(changes2.size());
        int size2 = changes2.size();
        int i4 = 0;
        while (i4 < size2) {
            int i5 = i4 + 1;
            PointerInputChange pointerInputChange = changes2.get(i4);
            m2655copyEzrO64 = pointerInputChange.m2655copyEzrO64((r30 & 1) != 0 ? pointerInputChange.m2657getIdJ3iCeTQ() : 0L, (r30 & 2) != 0 ? pointerInputChange.uptimeMillis : 0L, (r30 & 4) != 0 ? pointerInputChange.m2658getPositionF1C5BW0() : 0L, (r30 & 8) != 0 ? pointerInputChange.pressed : false, (r30 & 16) != 0 ? pointerInputChange.previousUptimeMillis : pointerInputChange.getUptimeMillis(), (r30 & 32) != 0 ? pointerInputChange.m2659getPreviousPositionF1C5BW0() : pointerInputChange.m2658getPositionF1C5BW0(), (r30 & 64) != 0 ? pointerInputChange.previousPressed : pointerInputChange.getPressed(), (r30 & 128) != 0 ? pointerInputChange.consumed : new ConsumedData(false, pointerInputChange.getPressed(), 1, null), (r30 & 256) != 0 ? pointerInputChange.m2661getTypeT8wyACA() : 0);
            if (m2655copyEzrO64 != null) {
                arrayList.add(m2655copyEzrO64);
            }
            i4 = i5;
        }
        PointerEvent pointerEvent2 = new PointerEvent(arrayList);
        this.currentEvent = pointerEvent2;
        dispatchPointerEvent(pointerEvent2, PointerEventPass.Initial);
        dispatchPointerEvent(pointerEvent2, PointerEventPass.Main);
        dispatchPointerEvent(pointerEvent2, PointerEventPass.Final);
        this.lastPointerEvent = null;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo2679onPointerEventH0pRuoY(@NotNull PointerEvent pointerEvent, @NotNull PointerEventPass pass, long j2) {
        Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent");
        Intrinsics.checkNotNullParameter(pass, "pass");
        this.boundsSize = j2;
        if (pass == PointerEventPass.Initial) {
            this.currentEvent = pointerEvent;
        }
        dispatchPointerEvent(pointerEvent, pass);
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z = true;
                break;
            }
            int i3 = i2 + 1;
            if (!PointerEventKt.changedToUpIgnoreConsumed(changes.get(i2))) {
                break;
            }
            i2 = i3;
        }
        if (!(!z)) {
            pointerEvent = null;
        }
        this.lastPointerEvent = pointerEvent;
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: roundToPx--R2X_6o */
    public int mo270roundToPxR2X_6o(long j2) {
        return this.$$delegate_0.mo270roundToPxR2X_6o(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: roundToPx-0680j_4 */
    public int mo271roundToPx0680j_4(float f2) {
        return this.$$delegate_0.mo271roundToPx0680j_4(f2);
    }

    public final void setCoroutineScope(@NotNull u0 u0Var) {
        Intrinsics.checkNotNullParameter(u0Var, "<set-?>");
        this.coroutineScope = u0Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public void setInterceptOutOfBoundsChildEvents(boolean z) {
        this.interceptOutOfBoundsChildEvents = z;
    }

    @Override // androidx.compose.ui.Modifier
    @NotNull
    public Modifier then(@NotNull Modifier modifier) {
        return PointerInputModifier.DefaultImpls.then(this, modifier);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-GaN1DYA */
    public float mo272toDpGaN1DYA(long j2) {
        return this.$$delegate_0.mo272toDpGaN1DYA(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo273toDpu2uoSUM(float f2) {
        return this.$$delegate_0.mo273toDpu2uoSUM(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo274toDpu2uoSUM(int i2) {
        return this.$$delegate_0.mo274toDpu2uoSUM(i2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    public long mo275toDpSizekrfVVM(long j2) {
        return this.$$delegate_0.mo275toDpSizekrfVVM(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toPx--R2X_6o */
    public float mo276toPxR2X_6o(long j2) {
        return this.$$delegate_0.mo276toPxR2X_6o(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toPx-0680j_4 */
    public float mo277toPx0680j_4(float f2) {
        return this.$$delegate_0.mo277toPx0680j_4(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    @NotNull
    public Rect toRect(@NotNull DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return this.$$delegate_0.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSize-XkaWNTQ */
    public long mo278toSizeXkaWNTQ(long j2) {
        return this.$$delegate_0.mo278toSizeXkaWNTQ(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-0xMU5do */
    public long mo279toSp0xMU5do(float f2) {
        return this.$$delegate_0.mo279toSp0xMU5do(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo280toSpkPz2Gy4(float f2) {
        return this.$$delegate_0.mo280toSpkPz2Gy4(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo281toSpkPz2Gy4(int i2) {
        return this.$$delegate_0.mo281toSpkPz2Gy4(i2);
    }
}
