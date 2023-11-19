package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class OutlinedTextFieldKt$OutlinedTextFieldLayout$1 extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ int $$dirty1;
    public final /* synthetic */ int $$dirty2;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $decoratedLabel;
    public final /* synthetic */ Function3<Modifier, Composer, Integer, Unit> $decoratedPlaceholder;
    public final /* synthetic */ long $indicatorColor;
    public final /* synthetic */ float $indicatorWidth;
    public final /* synthetic */ float $labelProgress;
    public final /* synthetic */ MutableState<Size> $labelSize;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $leading;
    public final /* synthetic */ long $leadingColor;
    public final /* synthetic */ Shape $shape;
    public final /* synthetic */ boolean $singleLine;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $trailing;
    public final /* synthetic */ long $trailingColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OutlinedTextFieldKt$OutlinedTextFieldLayout$1(MutableState<Size> mutableState, Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, boolean z, long j2, long j3, float f2, int i2, Shape shape, float f3, long j4, int i3, int i4) {
        super(3);
        this.$labelSize = mutableState;
        this.$decoratedPlaceholder = function3;
        this.$decoratedLabel = function2;
        this.$leading = function22;
        this.$trailing = function23;
        this.$singleLine = z;
        this.$leadingColor = j2;
        this.$trailingColor = j3;
        this.$labelProgress = f2;
        this.$$dirty1 = i2;
        this.$shape = shape;
        this.$indicatorWidth = f3;
        this.$indicatorColor = j4;
        this.$$dirty = i3;
        this.$$dirty2 = i4;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
        invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer, num.intValue());
        return Unit.INSTANCE;
    }

    @Composable
    public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> coreTextField, @Nullable Composer composer, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(coreTextField, "coreTextField");
        if ((i2 & 14) == 0) {
            i3 = i2 | (composer.changed(coreTextField) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if (((i3 & 91) ^ 18) == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        long m1235unboximpl = this.$labelSize.getValue().m1235unboximpl();
        Function3<Modifier, Composer, Integer, Unit> function3 = this.$decoratedPlaceholder;
        Function2<Composer, Integer, Unit> function2 = this.$decoratedLabel;
        Function2<Composer, Integer, Unit> function22 = this.$leading;
        Function2<Composer, Integer, Unit> function23 = this.$trailing;
        boolean z = this.$singleLine;
        long j2 = this.$leadingColor;
        long j3 = this.$trailingColor;
        float f2 = this.$labelProgress;
        Object valueOf = Float.valueOf(f2);
        MutableState<Size> mutableState = this.$labelSize;
        float f3 = this.$labelProgress;
        composer.startReplaceableGroup(-3686552);
        boolean changed = composer.changed(valueOf) | composer.changed(mutableState);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new OutlinedTextFieldKt$OutlinedTextFieldLayout$1$1$1(f3, mutableState);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Shape shape = this.$shape;
        float f4 = this.$indicatorWidth;
        long j4 = this.$indicatorColor;
        int i4 = i3 & 14;
        int i5 = this.$$dirty1;
        int i6 = this.$$dirty2;
        OutlinedTextFieldKt.m898IconsWithTextFieldLayoutT2E5_Oc(coreTextField, function3, function2, function22, function23, z, j2, j3, f2, (Function1) rememberedValue, shape, f4, j4, m1235unboximpl, composer, i4 | ((i5 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i5 >> 3) & 896) | ((i5 >> 3) & 7168) | (57344 & (i5 >> 3)) | (458752 & (this.$$dirty >> 9)) | (3670016 & i5) | (29360128 & i5) | (234881024 & i5), ((i6 >> 9) & 14) | ((i5 >> 24) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i6 << 6) & 896));
    }
}
