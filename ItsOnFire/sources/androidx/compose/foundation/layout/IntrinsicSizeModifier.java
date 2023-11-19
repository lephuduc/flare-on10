package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bb\u0018\u00002\u00020\u0001J)\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u001c\u0010\u0013\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000fH\u0016J)\u0010\u0015\u001a\u00020\u0016*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u0019\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u001c\u0010\u001a\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000fH\u0016R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicSizeModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "enforceIncoming", "", "getEnforceIncoming", "()Z", "calculateContentConstraints", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "calculateContentConstraints-l58MMJ0", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)J", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
interface IntrinsicSizeModifier extends LayoutModifier {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static boolean all(@NotNull IntrinsicSizeModifier intrinsicSizeModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(intrinsicSizeModifier, "this");
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return LayoutModifier.DefaultImpls.all(intrinsicSizeModifier, predicate);
        }

        public static boolean any(@NotNull IntrinsicSizeModifier intrinsicSizeModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(intrinsicSizeModifier, "this");
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return LayoutModifier.DefaultImpls.any(intrinsicSizeModifier, predicate);
        }

        public static <R> R foldIn(@NotNull IntrinsicSizeModifier intrinsicSizeModifier, R r2, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(intrinsicSizeModifier, "this");
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) LayoutModifier.DefaultImpls.foldIn(intrinsicSizeModifier, r2, operation);
        }

        public static <R> R foldOut(@NotNull IntrinsicSizeModifier intrinsicSizeModifier, R r2, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(intrinsicSizeModifier, "this");
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) LayoutModifier.DefaultImpls.foldOut(intrinsicSizeModifier, r2, operation);
        }

        public static boolean getEnforceIncoming(@NotNull IntrinsicSizeModifier intrinsicSizeModifier) {
            Intrinsics.checkNotNullParameter(intrinsicSizeModifier, "this");
            return true;
        }

        public static int maxIntrinsicHeight(@NotNull IntrinsicSizeModifier intrinsicSizeModifier, @NotNull IntrinsicMeasureScope receiver, @NotNull IntrinsicMeasurable measurable, int i2) {
            Intrinsics.checkNotNullParameter(intrinsicSizeModifier, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            return measurable.maxIntrinsicHeight(i2);
        }

        public static int maxIntrinsicWidth(@NotNull IntrinsicSizeModifier intrinsicSizeModifier, @NotNull IntrinsicMeasureScope receiver, @NotNull IntrinsicMeasurable measurable, int i2) {
            Intrinsics.checkNotNullParameter(intrinsicSizeModifier, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            return measurable.maxIntrinsicWidth(i2);
        }

        @NotNull
        /* renamed from: measure-3p2s80s  reason: not valid java name */
        public static MeasureResult m349measure3p2s80s(@NotNull IntrinsicSizeModifier intrinsicSizeModifier, @NotNull MeasureScope receiver, @NotNull Measurable measurable, long j2) {
            Intrinsics.checkNotNullParameter(intrinsicSizeModifier, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            long mo348calculateContentConstraintsl58MMJ0 = intrinsicSizeModifier.mo348calculateContentConstraintsl58MMJ0(receiver, measurable, j2);
            if (intrinsicSizeModifier.getEnforceIncoming()) {
                mo348calculateContentConstraintsl58MMJ0 = ConstraintsKt.m3305constrainN9IONVI(j2, mo348calculateContentConstraintsl58MMJ0);
            }
            Placeable mo2758measureBRTryo0 = measurable.mo2758measureBRTryo0(mo348calculateContentConstraintsl58MMJ0);
            return MeasureScope.DefaultImpls.layout$default(receiver, mo2758measureBRTryo0.getWidth(), mo2758measureBRTryo0.getHeight(), null, new IntrinsicSizeModifier$measure$1(mo2758measureBRTryo0), 4, null);
        }

        public static int minIntrinsicHeight(@NotNull IntrinsicSizeModifier intrinsicSizeModifier, @NotNull IntrinsicMeasureScope receiver, @NotNull IntrinsicMeasurable measurable, int i2) {
            Intrinsics.checkNotNullParameter(intrinsicSizeModifier, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            return measurable.minIntrinsicHeight(i2);
        }

        public static int minIntrinsicWidth(@NotNull IntrinsicSizeModifier intrinsicSizeModifier, @NotNull IntrinsicMeasureScope receiver, @NotNull IntrinsicMeasurable measurable, int i2) {
            Intrinsics.checkNotNullParameter(intrinsicSizeModifier, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            return measurable.minIntrinsicWidth(i2);
        }

        @NotNull
        public static Modifier then(@NotNull IntrinsicSizeModifier intrinsicSizeModifier, @NotNull Modifier other) {
            Intrinsics.checkNotNullParameter(intrinsicSizeModifier, "this");
            Intrinsics.checkNotNullParameter(other, "other");
            return LayoutModifier.DefaultImpls.then(intrinsicSizeModifier, other);
        }
    }

    /* renamed from: calculateContentConstraints-l58MMJ0  reason: not valid java name */
    long mo348calculateContentConstraintsl58MMJ0(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j2);

    boolean getEnforceIncoming();

    @Override // androidx.compose.ui.layout.LayoutModifier
    int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i2);

    @Override // androidx.compose.ui.layout.LayoutModifier
    int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i2);

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* renamed from: measure-3p2s80s */
    MeasureResult mo21measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j2);

    @Override // androidx.compose.ui.layout.LayoutModifier
    int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i2);

    @Override // androidx.compose.ui.layout.LayoutModifier
    int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i2);
}
