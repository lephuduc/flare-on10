package androidx.compose.ui.platform;

import android.content.res.Configuration;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.compose.ui.InternalComposeUiApi;
import androidx.compose.ui.text.input.PlatformTextInputService;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a5\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0014H\u0002\u001a!\u0010\u001b\u001a\u00020\u001c*\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0012H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\"0\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\"\u0018\u0010\n\u001a\u00020\u000b*\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"textInputServiceFactory", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "Landroidx/compose/ui/text/input/TextInputService;", "getTextInputServiceFactory$annotations", "()V", "getTextInputServiceFactory", "()Lkotlin/jvm/functions/Function1;", "setTextInputServiceFactory", "(Lkotlin/jvm/functions/Function1;)V", "localeLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroid/content/res/Configuration;", "getLocaleLayoutDirection", "(Landroid/content/res/Configuration;)Landroidx/compose/ui/unit/LayoutDirection;", "dot", "", "m1", "Landroidx/compose/ui/graphics/Matrix;", "row", "", "m2", "column", "dot-p89u6pk", "([FI[FI)F", "layoutDirectionFromInt", "layoutDirection", "preTransform", "", "other", "preTransform-JiSxe2E", "([F[F)V", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class AndroidComposeView_androidKt {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    private static Function1<? super PlatformTextInputService, ? extends TextInputService> textInputServiceFactory = AndroidComposeView_androidKt$textInputServiceFactory$1.INSTANCE;

    public static final /* synthetic */ LayoutDirection access$layoutDirectionFromInt(int i2) {
        return layoutDirectionFromInt(i2);
    }

    /* renamed from: access$preTransform-JiSxe2E  reason: not valid java name */
    public static final /* synthetic */ void m2921access$preTransformJiSxe2E(float[] fArr, float[] fArr2) {
        m2923preTransformJiSxe2E(fArr, fArr2);
    }

    /* renamed from: dot-p89u6pk  reason: not valid java name */
    private static final float m2922dotp89u6pk(float[] fArr, int i2, float[] fArr2, int i3) {
        int i4 = i2 * 4;
        return (fArr[i4 + 0] * fArr2[0 + i3]) + (fArr[i4 + 1] * fArr2[4 + i3]) + (fArr[i4 + 2] * fArr2[8 + i3]) + (fArr[i4 + 3] * fArr2[12 + i3]);
    }

    @NotNull
    public static final LayoutDirection getLocaleLayoutDirection(@NotNull Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "<this>");
        return layoutDirectionFromInt(configuration.getLayoutDirection());
    }

    @NotNull
    public static final Function1<PlatformTextInputService, TextInputService> getTextInputServiceFactory() {
        return textInputServiceFactory;
    }

    @InternalComposeUiApi
    public static /* synthetic */ void getTextInputServiceFactory$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutDirection layoutDirectionFromInt(int i2) {
        return (i2 == 0 || i2 != 1) ? LayoutDirection.Ltr : LayoutDirection.Rtl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: preTransform-JiSxe2E  reason: not valid java name */
    public static final void m2923preTransformJiSxe2E(float[] fArr, float[] fArr2) {
        float m2922dotp89u6pk = m2922dotp89u6pk(fArr2, 0, fArr, 0);
        float m2922dotp89u6pk2 = m2922dotp89u6pk(fArr2, 0, fArr, 1);
        float m2922dotp89u6pk3 = m2922dotp89u6pk(fArr2, 0, fArr, 2);
        float m2922dotp89u6pk4 = m2922dotp89u6pk(fArr2, 0, fArr, 3);
        float m2922dotp89u6pk5 = m2922dotp89u6pk(fArr2, 1, fArr, 0);
        float m2922dotp89u6pk6 = m2922dotp89u6pk(fArr2, 1, fArr, 1);
        float m2922dotp89u6pk7 = m2922dotp89u6pk(fArr2, 1, fArr, 2);
        float m2922dotp89u6pk8 = m2922dotp89u6pk(fArr2, 1, fArr, 3);
        float m2922dotp89u6pk9 = m2922dotp89u6pk(fArr2, 2, fArr, 0);
        float m2922dotp89u6pk10 = m2922dotp89u6pk(fArr2, 2, fArr, 1);
        float m2922dotp89u6pk11 = m2922dotp89u6pk(fArr2, 2, fArr, 2);
        float m2922dotp89u6pk12 = m2922dotp89u6pk(fArr2, 2, fArr, 3);
        float m2922dotp89u6pk13 = m2922dotp89u6pk(fArr2, 3, fArr, 0);
        float m2922dotp89u6pk14 = m2922dotp89u6pk(fArr2, 3, fArr, 1);
        float m2922dotp89u6pk15 = m2922dotp89u6pk(fArr2, 3, fArr, 2);
        float m2922dotp89u6pk16 = m2922dotp89u6pk(fArr2, 3, fArr, 3);
        fArr[0] = m2922dotp89u6pk;
        fArr[1] = m2922dotp89u6pk2;
        fArr[2] = m2922dotp89u6pk3;
        fArr[3] = m2922dotp89u6pk4;
        fArr[4] = m2922dotp89u6pk5;
        fArr[5] = m2922dotp89u6pk6;
        fArr[6] = m2922dotp89u6pk7;
        fArr[7] = m2922dotp89u6pk8;
        fArr[8] = m2922dotp89u6pk9;
        fArr[9] = m2922dotp89u6pk10;
        fArr[10] = m2922dotp89u6pk11;
        fArr[11] = m2922dotp89u6pk12;
        fArr[12] = m2922dotp89u6pk13;
        fArr[13] = m2922dotp89u6pk14;
        fArr[14] = m2922dotp89u6pk15;
        fArr[15] = m2922dotp89u6pk16;
    }

    public static final void setTextInputServiceFactory(@NotNull Function1<? super PlatformTextInputService, ? extends TextInputService> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        textInputServiceFactory = function1;
    }
}
