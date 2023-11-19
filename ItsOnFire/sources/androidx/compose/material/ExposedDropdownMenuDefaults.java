package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0007¢\u0006\u0002\u0010\tJñ\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\r2\b\b\u0002\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001e\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\r2\b\b\u0002\u0010 \u001a\u00020\r2\b\b\u0002\u0010!\u001a\u00020\r2\b\b\u0002\u0010\"\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$Jñ\u0001\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010&\u001a\u00020\r2\b\b\u0002\u0010'\u001a\u00020\r2\b\b\u0002\u0010(\u001a\u00020\r2\b\b\u0002\u0010)\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\r2\b\b\u0002\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001e\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\r2\b\b\u0002\u0010 \u001a\u00020\r2\b\b\u0002\u0010!\u001a\u00020\r2\b\b\u0002\u0010\"\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010$\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"Landroidx/compose/material/ExposedDropdownMenuDefaults;", "", "()V", "TrailingIcon", "", "expanded", "", "onIconClick", "Lkotlin/Function0;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "outlinedTextFieldColors", "Landroidx/compose/material/TextFieldColors;", "textColor", "Landroidx/compose/ui/graphics/Color;", "disabledTextColor", "backgroundColor", "cursorColor", "errorCursorColor", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "trailingIconColor", "focusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "outlinedTextFieldColors-DlUQjxs", "(JJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material/TextFieldColors;", "textFieldColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "textFieldColors-DlUQjxs", "material_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class ExposedDropdownMenuDefaults {
    public static final int $stable = 0;
    @NotNull
    public static final ExposedDropdownMenuDefaults INSTANCE = new ExposedDropdownMenuDefaults();

    private ExposedDropdownMenuDefaults() {
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void TrailingIcon(boolean r13, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> r14, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r15, int r16, int r17) {
        /*
            r12 = this;
            r2 = r13
            r0 = -572921624(0xffffffffddd9e8e8, float:-1.9627569E18)
            r1 = r15
            androidx.compose.runtime.Composer r0 = r15.startRestartGroup(r0)
            r1 = r17 & 1
            if (r1 == 0) goto L10
            r1 = r16 | 6
            goto L22
        L10:
            r1 = r16 & 14
            if (r1 != 0) goto L20
            boolean r1 = r0.changed(r13)
            if (r1 == 0) goto L1c
            r1 = 4
            goto L1d
        L1c:
            r1 = 2
        L1d:
            r1 = r16 | r1
            goto L22
        L20:
            r1 = r16
        L22:
            r3 = r17 & 2
            if (r3 == 0) goto L29
            r1 = r1 | 48
            goto L3b
        L29:
            r4 = r16 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L3b
            r4 = r14
            boolean r5 = r0.changed(r14)
            if (r5 == 0) goto L37
            r5 = 32
            goto L39
        L37:
            r5 = 16
        L39:
            r1 = r1 | r5
            goto L3c
        L3b:
            r4 = r14
        L3c:
            r5 = r1 & 91
            r5 = r5 ^ 18
            if (r5 != 0) goto L4e
            boolean r5 = r0.getSkipping()
            if (r5 != 0) goto L49
            goto L4e
        L49:
            r0.skipToGroupEnd()
            r3 = r4
            goto L79
        L4e:
            if (r3 == 0) goto L54
            androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$1 r3 = androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$1.INSTANCE
            r11 = r3
            goto L55
        L54:
            r11 = r4
        L55:
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.Companion
            androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$2 r4 = androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$2.INSTANCE
            androidx.compose.ui.Modifier r4 = androidx.compose.ui.semantics.SemanticsModifierKt.clearAndSetSemantics(r3, r4)
            r5 = 0
            r6 = 0
            r3 = -819901756(0xffffffffcf214ac4, float:-2.70603162E9)
            androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$3 r7 = new androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$3
            r7.<init>(r13)
            r8 = 1
            androidx.compose.runtime.internal.ComposableLambda r7 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r0, r3, r8, r7)
            int r1 = r1 >> 3
            r1 = r1 & 14
            r9 = r1 | 24576(0x6000, float:3.4438E-41)
            r10 = 12
            r3 = r11
            r8 = r0
            androidx.compose.material.IconButtonKt.IconButton(r3, r4, r5, r6, r7, r8, r9, r10)
        L79:
            androidx.compose.runtime.ScopeUpdateScope r6 = r0.endRestartGroup()
            if (r6 != 0) goto L80
            goto L8f
        L80:
            androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$4 r7 = new androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$4
            r0 = r7
            r1 = r12
            r2 = r13
            r4 = r16
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            r6.updateScope(r7)
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ExposedDropdownMenuDefaults.TrailingIcon(boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    @NotNull
    /* renamed from: outlinedTextFieldColors-DlUQjxs  reason: not valid java name */
    public final TextFieldColors m837outlinedTextFieldColorsDlUQjxs(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, @Nullable Composer composer, int i2, int i3, int i4, int i5) {
        composer.startReplaceableGroup(-371518423);
        long m1391copywmQWz5c$default = (i5 & 1) != 0 ? Color.m1391copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m1402unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long m1391copywmQWz5c$default2 = (i5 & 2) != 0 ? Color.m1391copywmQWz5c$default(m1391copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long m1427getTransparent0d7_KjU = (i5 & 4) != 0 ? Color.Companion.m1427getTransparent0d7_KjU() : j4;
        long m767getPrimary0d7_KjU = (i5 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m767getPrimary0d7_KjU() : j5;
        long m761getError0d7_KjU = (i5 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m761getError0d7_KjU() : j6;
        long m1391copywmQWz5c$default3 = (i5 & 32) != 0 ? Color.m1391copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m767getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long m1391copywmQWz5c$default4 = (i5 & 64) != 0 ? Color.m1391copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m766getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j8;
        long m1391copywmQWz5c$default5 = (i5 & 128) != 0 ? Color.m1391copywmQWz5c$default(m1391copywmQWz5c$default4, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j9;
        long m761getError0d7_KjU2 = (i5 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m761getError0d7_KjU() : j10;
        long m1391copywmQWz5c$default6 = (i5 & 512) != 0 ? Color.m1391copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m766getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long m1391copywmQWz5c$default7 = (i5 & 1024) != 0 ? Color.m1391copywmQWz5c$default(m1391copywmQWz5c$default6, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long j24 = (i5 & 2048) != 0 ? m1391copywmQWz5c$default6 : j13;
        long m1391copywmQWz5c$default8 = (i5 & 4096) != 0 ? Color.m1391copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m766getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long m1391copywmQWz5c$default9 = (i5 & 8192) != 0 ? Color.m1391copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m767getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long m1391copywmQWz5c$default10 = (i5 & 16384) != 0 ? Color.m1391copywmQWz5c$default(m1391copywmQWz5c$default8, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long m761getError0d7_KjU3 = (32768 & i5) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m761getError0d7_KjU() : j17;
        long m1391copywmQWz5c$default11 = (65536 & i5) != 0 ? Color.m1391copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m767getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j18;
        long m1391copywmQWz5c$default12 = (131072 & i5) != 0 ? Color.m1391copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m766getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j19;
        long m1391copywmQWz5c$default13 = (262144 & i5) != 0 ? Color.m1391copywmQWz5c$default(m1391copywmQWz5c$default12, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long m761getError0d7_KjU4 = (524288 & i5) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m761getError0d7_KjU() : j21;
        long m1391copywmQWz5c$default14 = (1048576 & i5) != 0 ? Color.m1391copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m766getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j22;
        DefaultTextFieldForExposedDropdownMenusColors defaultTextFieldForExposedDropdownMenusColors = new DefaultTextFieldForExposedDropdownMenusColors(m1391copywmQWz5c$default, m1391copywmQWz5c$default2, m767getPrimary0d7_KjU, m761getError0d7_KjU, m1391copywmQWz5c$default3, m1391copywmQWz5c$default4, m761getError0d7_KjU2, m1391copywmQWz5c$default5, m1391copywmQWz5c$default6, m1391copywmQWz5c$default7, j24, m1391copywmQWz5c$default8, m1391copywmQWz5c$default9, m1391copywmQWz5c$default10, m761getError0d7_KjU3, m1427getTransparent0d7_KjU, m1391copywmQWz5c$default11, m1391copywmQWz5c$default12, m1391copywmQWz5c$default13, m761getError0d7_KjU4, m1391copywmQWz5c$default14, (i5 & 2097152) != 0 ? Color.m1391copywmQWz5c$default(m1391copywmQWz5c$default14, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j23, null);
        composer.endReplaceableGroup();
        return defaultTextFieldForExposedDropdownMenusColors;
    }

    @Composable
    @NotNull
    /* renamed from: textFieldColors-DlUQjxs  reason: not valid java name */
    public final TextFieldColors m838textFieldColorsDlUQjxs(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, @Nullable Composer composer, int i2, int i3, int i4, int i5) {
        composer.startReplaceableGroup(-1389007282);
        long m1391copywmQWz5c$default = (i5 & 1) != 0 ? Color.m1391copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m1402unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long m1391copywmQWz5c$default2 = (i5 & 2) != 0 ? Color.m1391copywmQWz5c$default(m1391copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long m1391copywmQWz5c$default3 = (i5 & 4) != 0 ? Color.m1391copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m766getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j4;
        long m767getPrimary0d7_KjU = (i5 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m767getPrimary0d7_KjU() : j5;
        long m761getError0d7_KjU = (i5 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m761getError0d7_KjU() : j6;
        long m1391copywmQWz5c$default4 = (i5 & 32) != 0 ? Color.m1391copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m767getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long m1391copywmQWz5c$default5 = (i5 & 64) != 0 ? Color.m1391copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m766getOnSurface0d7_KjU(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null) : j8;
        long m1391copywmQWz5c$default6 = (i5 & 128) != 0 ? Color.m1391copywmQWz5c$default(m1391copywmQWz5c$default5, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j9;
        long m761getError0d7_KjU2 = (i5 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m761getError0d7_KjU() : j10;
        long m1391copywmQWz5c$default7 = (i5 & 512) != 0 ? Color.m1391copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m766getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long m1391copywmQWz5c$default8 = (i5 & 1024) != 0 ? Color.m1391copywmQWz5c$default(m1391copywmQWz5c$default7, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long j24 = (i5 & 2048) != 0 ? m1391copywmQWz5c$default7 : j13;
        long m1391copywmQWz5c$default9 = (i5 & 4096) != 0 ? Color.m1391copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m766getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long m1391copywmQWz5c$default10 = (i5 & 8192) != 0 ? Color.m1391copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m767getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long m1391copywmQWz5c$default11 = (i5 & 16384) != 0 ? Color.m1391copywmQWz5c$default(m1391copywmQWz5c$default9, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long m761getError0d7_KjU3 = (32768 & i5) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m761getError0d7_KjU() : j17;
        long m1391copywmQWz5c$default12 = (65536 & i5) != 0 ? Color.m1391copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m767getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j18;
        long m1391copywmQWz5c$default13 = (131072 & i5) != 0 ? Color.m1391copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m766getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j19;
        long m1391copywmQWz5c$default14 = (262144 & i5) != 0 ? Color.m1391copywmQWz5c$default(m1391copywmQWz5c$default13, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long m761getError0d7_KjU4 = (524288 & i5) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m761getError0d7_KjU() : j21;
        long m1391copywmQWz5c$default15 = (1048576 & i5) != 0 ? Color.m1391copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m766getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j22;
        DefaultTextFieldForExposedDropdownMenusColors defaultTextFieldForExposedDropdownMenusColors = new DefaultTextFieldForExposedDropdownMenusColors(m1391copywmQWz5c$default, m1391copywmQWz5c$default2, m767getPrimary0d7_KjU, m761getError0d7_KjU, m1391copywmQWz5c$default4, m1391copywmQWz5c$default5, m761getError0d7_KjU2, m1391copywmQWz5c$default6, m1391copywmQWz5c$default7, m1391copywmQWz5c$default8, j24, m1391copywmQWz5c$default9, m1391copywmQWz5c$default10, m1391copywmQWz5c$default11, m761getError0d7_KjU3, m1391copywmQWz5c$default3, m1391copywmQWz5c$default12, m1391copywmQWz5c$default13, m1391copywmQWz5c$default14, m761getError0d7_KjU4, m1391copywmQWz5c$default15, (i5 & 2097152) != 0 ? Color.m1391copywmQWz5c$default(m1391copywmQWz5c$default15, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j23, null);
        composer.endReplaceableGroup();
        return defaultTextFieldForExposedDropdownMenusColors;
    }
}
