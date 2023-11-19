package androidx.compose.foundation.relocation;

import androidx.appcompat.R;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "", "bringIntoView", "", "rect", "Landroidx/compose/ui/geometry/Rect;", "(Landroidx/compose/ui/geometry/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toLocalRect", "layoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Companion", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public interface BringIntoViewResponder {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @ExperimentalFoundationApi
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewResponder$Companion;", "", "()V", "ModifierLocalBringIntoViewResponder", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "getModifierLocalBringIntoViewResponder", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "RootBringIntoViewResponder", "getRootBringIntoViewResponder", "()Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        @NotNull
        private static final ProvidableModifierLocal<BringIntoViewResponder> ModifierLocalBringIntoViewResponder = ModifierLocalKt.modifierLocalOf(BringIntoViewResponder$Companion$ModifierLocalBringIntoViewResponder$1.INSTANCE);
        @NotNull
        private static final BringIntoViewResponder RootBringIntoViewResponder = new BringIntoViewResponder() { // from class: androidx.compose.foundation.relocation.BringIntoViewResponder$Companion$RootBringIntoViewResponder$1
            @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
            @Nullable
            public Object bringIntoView(@NotNull Rect rect, @NotNull Continuation<? super Unit> continuation) {
                return Unit.INSTANCE;
            }

            @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
            @NotNull
            public Rect toLocalRect(@NotNull Rect rect, @NotNull LayoutCoordinates layoutCoordinates) {
                Intrinsics.checkNotNullParameter(rect, "rect");
                Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
                return RectKt.m1201Recttz77jQw(layoutCoordinates.mo2774localToRootMKHz9U(rect.m1196getTopLeftF1C5BW0()), rect.m1194getSizeNHjbRc());
            }
        };

        private Companion() {
        }

        @NotNull
        public final ProvidableModifierLocal<BringIntoViewResponder> getModifierLocalBringIntoViewResponder() {
            return ModifierLocalBringIntoViewResponder;
        }

        @NotNull
        public final BringIntoViewResponder getRootBringIntoViewResponder() {
            return RootBringIntoViewResponder;
        }
    }

    @Nullable
    Object bringIntoView(@NotNull Rect rect, @NotNull Continuation<? super Unit> continuation);

    @NotNull
    Rect toLocalRect(@NotNull Rect rect, @NotNull LayoutCoordinates layoutCoordinates);
}
