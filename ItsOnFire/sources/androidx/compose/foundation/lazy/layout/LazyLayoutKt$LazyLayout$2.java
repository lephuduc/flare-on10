package androidx.compose.foundation.lazy.layout;

import androidx.appcompat.R;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LazyLayoutKt$LazyLayout$2 extends Lambda implements Function2<SubcomposeMeasureScope, Constraints, MeasureResult> {
    public final /* synthetic */ LazyLayoutItemContentFactory $itemContentFactory;
    public final /* synthetic */ LazyMeasurePolicy $measurePolicy;
    public final /* synthetic */ LazyLayoutState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutKt$LazyLayout$2(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, LazyLayoutState lazyLayoutState, LazyMeasurePolicy lazyMeasurePolicy) {
        super(2);
        this.$itemContentFactory = lazyLayoutItemContentFactory;
        this.$state = lazyLayoutState;
        this.$measurePolicy = lazyMeasurePolicy;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
        return m437invoke0kLqBqw(subcomposeMeasureScope, constraints.m3299unboximpl());
    }

    @NotNull
    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final MeasureResult m437invoke0kLqBqw(@NotNull SubcomposeMeasureScope SubcomposeLayout, long j2) {
        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
        this.$itemContentFactory.m436onBeforeMeasure0kLqBqw(SubcomposeLayout, j2);
        LazyLayoutPlaceablesProvider lazyLayoutPlaceablesProvider = new LazyLayoutPlaceablesProvider(this.$state.getItemsProvider$foundation_release().invoke(), this.$itemContentFactory, SubcomposeLayout);
        LazyLayoutMeasureResult mo441measure3p2s80s = this.$measurePolicy.mo441measure3p2s80s(SubcomposeLayout, lazyLayoutPlaceablesProvider, j2);
        LazyLayoutOnPostMeasureListener onPostMeasureListener$foundation_release = this.$state.getOnPostMeasureListener$foundation_release();
        if (onPostMeasureListener$foundation_release != null) {
            onPostMeasureListener$foundation_release.onPostMeasure(mo441measure3p2s80s, lazyLayoutPlaceablesProvider);
        }
        this.$state.getLayoutInfoState$foundation_release().setValue(mo441measure3p2s80s);
        this.$state.setLayoutInfoNonObservable$foundation_release(mo441measure3p2s80s);
        return mo441measure3p2s80s;
    }
}
