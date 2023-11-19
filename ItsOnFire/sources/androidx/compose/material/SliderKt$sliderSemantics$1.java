package androidx.compose.material;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.util.MathHelpersKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SliderKt$sliderSemantics$1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
    public final /* synthetic */ float $coerced;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ Function1<Float, Unit> $onValueChange;
    public final /* synthetic */ int $steps;
    public final /* synthetic */ List<Float> $tickFractions;
    public final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "targetValue", "", "invoke", "(F)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.material.SliderKt$sliderSemantics$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<Float, Boolean> {
        public final /* synthetic */ float $coerced;
        public final /* synthetic */ Function1<Float, Unit> $onValueChange;
        public final /* synthetic */ int $steps;
        public final /* synthetic */ List<Float> $tickFractions;
        public final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(ClosedFloatingPointRange<Float> closedFloatingPointRange, int i2, List<Float> list, float f2, Function1<? super Float, Unit> function1) {
            super(1);
            this.$valueRange = closedFloatingPointRange;
            this.$steps = i2;
            this.$tickFractions = list;
            this.$coerced = f2;
            this.$onValueChange = function1;
        }

        @NotNull
        public final Boolean invoke(float f2) {
            float coerceIn;
            int collectionSizeOrDefault;
            Object obj;
            coerceIn = RangesKt___RangesKt.coerceIn(f2, this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue());
            if (this.$steps > 0) {
                List<Float> list = this.$tickFractions;
                ClosedFloatingPointRange<Float> closedFloatingPointRange = this.$valueRange;
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                for (Number number : list) {
                    arrayList.add(Float.valueOf(MathHelpersKt.lerp(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), number.floatValue())));
                }
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    if (it.hasNext()) {
                        float abs = Math.abs(((Number) next).floatValue() - coerceIn);
                        do {
                            Object next2 = it.next();
                            float abs2 = Math.abs(((Number) next2).floatValue() - coerceIn);
                            if (Float.compare(abs, abs2) > 0) {
                                next = next2;
                                abs = abs2;
                            }
                        } while (it.hasNext());
                        obj = next;
                    } else {
                        obj = next;
                    }
                } else {
                    obj = null;
                }
                Float f3 = (Float) obj;
                if (f3 != null) {
                    coerceIn = f3.floatValue();
                }
            }
            boolean z = true;
            if (coerceIn == this.$coerced) {
                z = false;
            } else {
                this.$onValueChange.invoke(Float.valueOf(coerceIn));
            }
            return Boolean.valueOf(z);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Float f2) {
            return invoke(f2.floatValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$sliderSemantics$1(boolean z, ClosedFloatingPointRange<Float> closedFloatingPointRange, int i2, List<Float> list, float f2, Function1<? super Float, Unit> function1) {
        super(1);
        this.$enabled = z;
        this.$valueRange = closedFloatingPointRange;
        this.$steps = i2;
        this.$tickFractions = list;
        this.$coerced = f2;
        this.$onValueChange = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        invoke2(semanticsPropertyReceiver);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        if (!this.$enabled) {
            SemanticsPropertiesKt.disabled(semantics);
        }
        SemanticsPropertiesKt.setProgress$default(semantics, null, new AnonymousClass1(this.$valueRange, this.$steps, this.$tickFractions, this.$coerced, this.$onValueChange), 1, null);
    }
}
