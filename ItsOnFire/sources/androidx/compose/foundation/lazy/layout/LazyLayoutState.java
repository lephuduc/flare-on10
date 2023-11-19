package androidx.compose.foundation.lazy.layout;

import androidx.appcompat.R;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\r\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\u0002\u0010$R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\r\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\u001fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006%"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutState;", "", "()V", "itemsProvider", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemsProvider;", "getItemsProvider$foundation_release", "()Lkotlin/jvm/functions/Function0;", "setItemsProvider$foundation_release", "(Lkotlin/jvm/functions/Function0;)V", "layoutInfo", "Landroidx/compose/foundation/lazy/layout/LazyLayoutInfo;", "getLayoutInfo", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutInfo;", "layoutInfoNonObservable", "getLayoutInfoNonObservable$foundation_release", "setLayoutInfoNonObservable$foundation_release", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutInfo;)V", "layoutInfoState", "Landroidx/compose/runtime/MutableState;", "getLayoutInfoState$foundation_release", "()Landroidx/compose/runtime/MutableState;", "onPostMeasureListener", "Landroidx/compose/foundation/lazy/layout/LazyLayoutOnPostMeasureListener;", "getOnPostMeasureListener$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutOnPostMeasureListener;", "setOnPostMeasureListener$foundation_release", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutOnPostMeasureListener;)V", "remeasurement", "Landroidx/compose/ui/layout/Remeasurement;", "remeasurementModifier", "Landroidx/compose/ui/layout/RemeasurementModifier;", "getRemeasurementModifier$foundation_release", "()Landroidx/compose/ui/layout/RemeasurementModifier;", "remeasure", "", "()Lkotlin/Unit;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LazyLayoutState {
    @NotNull
    private Function0<? extends LazyLayoutItemsProvider> itemsProvider;
    @NotNull
    private LazyLayoutInfo layoutInfoNonObservable;
    @NotNull
    private final MutableState<LazyLayoutInfo> layoutInfoState;
    @Nullable
    private LazyLayoutOnPostMeasureListener onPostMeasureListener;
    @Nullable
    private Remeasurement remeasurement;
    @NotNull
    private final RemeasurementModifier remeasurementModifier;

    public LazyLayoutState() {
        MutableState<LazyLayoutInfo> mutableStateOf$default;
        EmptyLazyLayoutInfo emptyLazyLayoutInfo = EmptyLazyLayoutInfo.INSTANCE;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(emptyLazyLayoutInfo, null, 2, null);
        this.layoutInfoState = mutableStateOf$default;
        this.layoutInfoNonObservable = emptyLazyLayoutInfo;
        this.remeasurementModifier = new RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutState$remeasurementModifier$1
            @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
            public boolean all(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
                return RemeasurementModifier.DefaultImpls.all(this, function1);
            }

            @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
            public boolean any(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
                return RemeasurementModifier.DefaultImpls.any(this, function1);
            }

            @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
            public <R> R foldIn(R r2, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> function2) {
                return (R) RemeasurementModifier.DefaultImpls.foldIn(this, r2, function2);
            }

            @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
            public <R> R foldOut(R r2, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> function2) {
                return (R) RemeasurementModifier.DefaultImpls.foldOut(this, r2, function2);
            }

            @Override // androidx.compose.ui.layout.RemeasurementModifier
            public void onRemeasurementAvailable(@NotNull Remeasurement remeasurement) {
                Intrinsics.checkNotNullParameter(remeasurement, "remeasurement");
                LazyLayoutState.this.remeasurement = remeasurement;
            }

            @Override // androidx.compose.ui.Modifier
            @NotNull
            public Modifier then(@NotNull Modifier modifier) {
                return RemeasurementModifier.DefaultImpls.then(this, modifier);
            }
        };
        this.itemsProvider = LazyLayoutState$itemsProvider$1.INSTANCE;
    }

    @NotNull
    public final Function0<LazyLayoutItemsProvider> getItemsProvider$foundation_release() {
        return this.itemsProvider;
    }

    @NotNull
    public final LazyLayoutInfo getLayoutInfo() {
        return this.layoutInfoState.getValue();
    }

    @NotNull
    public final LazyLayoutInfo getLayoutInfoNonObservable$foundation_release() {
        return this.layoutInfoNonObservable;
    }

    @NotNull
    public final MutableState<LazyLayoutInfo> getLayoutInfoState$foundation_release() {
        return this.layoutInfoState;
    }

    @Nullable
    public final LazyLayoutOnPostMeasureListener getOnPostMeasureListener$foundation_release() {
        return this.onPostMeasureListener;
    }

    @NotNull
    public final RemeasurementModifier getRemeasurementModifier$foundation_release() {
        return this.remeasurementModifier;
    }

    @Nullable
    public final Unit remeasure() {
        Remeasurement remeasurement = this.remeasurement;
        if (remeasurement == null) {
            return null;
        }
        remeasurement.forceRemeasure();
        return Unit.INSTANCE;
    }

    public final void setItemsProvider$foundation_release(@NotNull Function0<? extends LazyLayoutItemsProvider> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.itemsProvider = function0;
    }

    public final void setLayoutInfoNonObservable$foundation_release(@NotNull LazyLayoutInfo lazyLayoutInfo) {
        Intrinsics.checkNotNullParameter(lazyLayoutInfo, "<set-?>");
        this.layoutInfoNonObservable = lazyLayoutInfo;
    }

    public final void setOnPostMeasureListener$foundation_release(@Nullable LazyLayoutOnPostMeasureListener lazyLayoutOnPostMeasureListener) {
        this.onPostMeasureListener = lazyLayoutOnPostMeasureListener;
    }
}
