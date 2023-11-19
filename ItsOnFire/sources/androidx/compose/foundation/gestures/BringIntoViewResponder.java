package androidx.compose.foundation.gestures;

import androidx.appcompat.R;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.unit.IntSizeKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import j.v0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00032\u00020\u0004B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\u000e\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0019J\u0010\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u0011H\u0016J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!H\u0016J!\u0010\"\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u0019H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010$J\u0018\u0010%\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\f\u0010&\u001a\u00020'*\u00020'H\u0002R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0003X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u0000X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Landroidx/compose/foundation/gestures/BringIntoViewResponder;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "Landroidx/compose/ui/layout/OnGloballyPositionedModifier;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "scrollableState", "Landroidx/compose/foundation/gestures/ScrollableState;", "reverseDirection", "", "(Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/gestures/ScrollableState;Z)V", "key", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getKey", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "layoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "parent", "value", "getValue", "()Landroidx/compose/foundation/gestures/BringIntoViewResponder;", "bringIntoView", "", "rect", "Landroidx/compose/ui/geometry/Rect;", "(Landroidx/compose/ui/geometry/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "computeDestination", "source", "onGloballyPositioned", "coordinates", "onModifierLocalsUpdated", "scope", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "performBringIntoView", FirebaseAnalytics.Param.DESTINATION, "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toLocalRect", "reverseIfNeeded", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
final class BringIntoViewResponder implements ModifierLocalConsumer, ModifierLocalProvider<androidx.compose.foundation.relocation.BringIntoViewResponder>, androidx.compose.foundation.relocation.BringIntoViewResponder, OnGloballyPositionedModifier {
    @NotNull
    private final ProvidableModifierLocal<androidx.compose.foundation.relocation.BringIntoViewResponder> key;
    private LayoutCoordinates layoutCoordinates;
    @NotNull
    private final Orientation orientation;
    private androidx.compose.foundation.relocation.BringIntoViewResponder parent;
    private final boolean reverseDirection;
    @NotNull
    private final ScrollableState scrollableState;
    @NotNull
    private final BringIntoViewResponder value;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            iArr[Orientation.Vertical.ordinal()] = 1;
            iArr[Orientation.Horizontal.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BringIntoViewResponder(@NotNull Orientation orientation, @NotNull ScrollableState scrollableState, boolean z) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(scrollableState, "scrollableState");
        this.orientation = orientation;
        this.scrollableState = scrollableState;
        this.reverseDirection = z;
        this.key = androidx.compose.foundation.relocation.BringIntoViewResponder.Companion.getModifierLocalBringIntoViewResponder();
        this.value = this;
    }

    private final float reverseIfNeeded(float f2) {
        return this.reverseDirection ? f2 * (-1) : f2;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public boolean all(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
        return ModifierLocalConsumer.DefaultImpls.all(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public boolean any(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
        return ModifierLocalConsumer.DefaultImpls.any(this, function1);
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    @Nullable
    public Object bringIntoView(@NotNull Rect rect, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object g2 = v0.g(new BringIntoViewResponder$bringIntoView$2(this, rect, computeDestination(rect), null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return g2 == coroutine_suspended ? g2 : Unit.INSTANCE;
    }

    @NotNull
    public final Rect computeDestination(@NotNull Rect source) {
        float relocationDistance;
        float relocationDistance2;
        Intrinsics.checkNotNullParameter(source, "source");
        LayoutCoordinates layoutCoordinates = this.layoutCoordinates;
        if (layoutCoordinates == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutCoordinates");
            layoutCoordinates = null;
        }
        long m3495toSizeozmzZPI = IntSizeKt.m3495toSizeozmzZPI(layoutCoordinates.mo2772getSizeYbymL2g());
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i2 == 1) {
            relocationDistance = ScrollableKt.relocationDistance(source.getTop(), source.getBottom(), Size.m1227getHeightimpl(m3495toSizeozmzZPI));
            return source.translate(0.0f, relocationDistance);
        } else if (i2 == 2) {
            relocationDistance2 = ScrollableKt.relocationDistance(source.getLeft(), source.getRight(), Size.m1230getWidthimpl(m3495toSizeozmzZPI));
            return source.translate(relocationDistance2, 0.0f);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public <R> R foldIn(R r2, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> function2) {
        return (R) ModifierLocalConsumer.DefaultImpls.foldIn(this, r2, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public <R> R foldOut(R r2, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> function2) {
        return (R) ModifierLocalConsumer.DefaultImpls.foldOut(this, r2, function2);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    @NotNull
    public ProvidableModifierLocal<androidx.compose.foundation.relocation.BringIntoViewResponder> getKey() {
        return this.key;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    @NotNull
    /* renamed from: getValue */
    public androidx.compose.foundation.relocation.BringIntoViewResponder getValue2() {
        return this.value;
    }

    @Override // androidx.compose.ui.layout.OnGloballyPositionedModifier
    public void onGloballyPositioned(@NotNull LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.layoutCoordinates = coordinates;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(@NotNull ModifierLocalReadScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.parent = (androidx.compose.foundation.relocation.BringIntoViewResponder) scope.getCurrent(androidx.compose.foundation.relocation.BringIntoViewResponder.Companion.getModifierLocalBringIntoViewResponder());
    }

    @Nullable
    public final Object performBringIntoView(@NotNull Rect rect, @NotNull Rect rect2, @NotNull Continuation<? super Unit> continuation) {
        float top;
        float top2;
        Object coroutine_suspended;
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i2 == 1) {
            top = rect.getTop();
            top2 = rect2.getTop();
        } else if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        } else {
            top = rect.getLeft();
            top2 = rect2.getLeft();
        }
        Object animateScrollBy$default = ScrollExtensionsKt.animateScrollBy$default(this.scrollableState, reverseIfNeeded(top - top2), null, continuation, 2, null);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return animateScrollBy$default == coroutine_suspended ? animateScrollBy$default : Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.Modifier
    @NotNull
    public Modifier then(@NotNull Modifier modifier) {
        return ModifierLocalConsumer.DefaultImpls.then(this, modifier);
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    @NotNull
    public Rect toLocalRect(@NotNull Rect rect, @NotNull LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
        LayoutCoordinates layoutCoordinates2 = this.layoutCoordinates;
        if (layoutCoordinates2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutCoordinates");
            layoutCoordinates2 = null;
        }
        return rect.m1198translatek4lQ0M(layoutCoordinates2.localBoundingBoxOf(layoutCoordinates, false).m1196getTopLeftF1C5BW0());
    }
}
