package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TextFieldKt$TextFieldLayout$1 extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ int $$dirty1;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $decoratedLabel;
    public final /* synthetic */ Function3<Modifier, Composer, Integer, Unit> $decoratedPlaceholder;
    public final /* synthetic */ float $labelProgress;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $leading;
    public final /* synthetic */ long $leadingColor;
    public final /* synthetic */ boolean $singleLine;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $trailing;
    public final /* synthetic */ long $trailingColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldKt$TextFieldLayout$1(Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, boolean z, long j2, long j3, float f2, int i2, int i3) {
        super(3);
        this.$decoratedLabel = function2;
        this.$decoratedPlaceholder = function3;
        this.$leading = function22;
        this.$trailing = function23;
        this.$singleLine = z;
        this.$leadingColor = j2;
        this.$trailingColor = j3;
        this.$labelProgress = f2;
        this.$$dirty1 = i2;
        this.$$dirty = i3;
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
        Function2<Composer, Integer, Unit> function2 = this.$decoratedLabel;
        Function3<Modifier, Composer, Integer, Unit> function3 = this.$decoratedPlaceholder;
        Function2<Composer, Integer, Unit> function22 = this.$leading;
        Function2<Composer, Integer, Unit> function23 = this.$trailing;
        boolean z = this.$singleLine;
        long j2 = this.$leadingColor;
        long j3 = this.$trailingColor;
        float f2 = this.$labelProgress;
        int i4 = this.$$dirty1;
        TextFieldKt.m1009IconsWithTextFieldLayoutSxpAMN0(coreTextField, function2, function3, function22, function23, z, j2, j3, f2, composer, ((this.$$dirty >> 9) & 458752) | (i3 & 14) | ((i4 >> 6) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i4 & 896) | ((i4 >> 3) & 7168) | ((i4 >> 3) & 57344) | (3670016 & i4) | (29360128 & i4) | (234881024 & i4));
    }
}
