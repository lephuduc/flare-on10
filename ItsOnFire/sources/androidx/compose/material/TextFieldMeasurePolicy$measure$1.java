package androidx.compose.material;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TextFieldMeasurePolicy$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    public final /* synthetic */ MeasureScope $$receiver;
    public final /* synthetic */ int $baseLineOffset;
    public final /* synthetic */ int $effectiveLabelBaseline;
    public final /* synthetic */ int $height;
    public final /* synthetic */ Placeable $labelPlaceable;
    public final /* synthetic */ int $lastBaseline;
    public final /* synthetic */ Placeable $leadingPlaceable;
    public final /* synthetic */ Placeable $placeholderPlaceable;
    public final /* synthetic */ Placeable $textFieldPlaceable;
    public final /* synthetic */ int $topPadding;
    public final /* synthetic */ Placeable $trailingPlaceable;
    public final /* synthetic */ int $width;
    public final /* synthetic */ TextFieldMeasurePolicy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldMeasurePolicy$measure$1(Placeable placeable, int i2, int i3, int i4, int i5, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, TextFieldMeasurePolicy textFieldMeasurePolicy, int i6, int i7, MeasureScope measureScope) {
        super(1);
        this.$labelPlaceable = placeable;
        this.$baseLineOffset = i2;
        this.$lastBaseline = i3;
        this.$width = i4;
        this.$height = i5;
        this.$textFieldPlaceable = placeable2;
        this.$placeholderPlaceable = placeable3;
        this.$leadingPlaceable = placeable4;
        this.$trailingPlaceable = placeable5;
        this.this$0 = textFieldMeasurePolicy;
        this.$effectiveLabelBaseline = i6;
        this.$topPadding = i7;
        this.$$receiver = measureScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Placeable.PlacementScope layout) {
        boolean z;
        int coerceAtLeast;
        boolean z2;
        float f2;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        if (this.$labelPlaceable == null) {
            int i2 = this.$width;
            int i3 = this.$height;
            Placeable placeable = this.$textFieldPlaceable;
            Placeable placeable2 = this.$placeholderPlaceable;
            Placeable placeable3 = this.$leadingPlaceable;
            Placeable placeable4 = this.$trailingPlaceable;
            z = this.this$0.singleLine;
            TextFieldKt.placeWithoutLabel(layout, i2, i3, placeable, placeable2, placeable3, placeable4, z, this.$$receiver.getDensity());
            return;
        }
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(this.$baseLineOffset - this.$lastBaseline, 0);
        int i4 = this.$width;
        int i5 = this.$height;
        Placeable placeable5 = this.$textFieldPlaceable;
        Placeable placeable6 = this.$labelPlaceable;
        Placeable placeable7 = this.$placeholderPlaceable;
        Placeable placeable8 = this.$leadingPlaceable;
        Placeable placeable9 = this.$trailingPlaceable;
        z2 = this.this$0.singleLine;
        int i6 = this.$topPadding + this.$effectiveLabelBaseline;
        f2 = this.this$0.animationProgress;
        TextFieldKt.placeWithLabel(layout, i4, i5, placeable5, placeable6, placeable7, placeable8, placeable9, z2, coerceAtLeast, i6, f2, this.$$receiver.getDensity());
    }
}
