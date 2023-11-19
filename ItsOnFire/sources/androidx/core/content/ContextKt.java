package androidx.core.content;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u0003H\u0086\b¢\u0006\u0002\u0010\u0004\u001aQ\u0010\u0005\u001a\u00020\u0006*\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\f2\b\b\u0003\u0010\r\u001a\u00020\f2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u000f¢\u0006\u0002\b\u0011H\u0086\bø\u0001\u0000\u001a;\u0010\u0005\u001a\u00020\u0006*\u00020\u00032\b\b\u0001\u0010\u0012\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u000f¢\u0006\u0002\b\u0011H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"getSystemService", "T", "", "Landroid/content/Context;", "(Landroid/content/Context;)Ljava/lang/Object;", "withStyledAttributes", "", "set", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "", "defStyleRes", "block", "Lkotlin/Function1;", "Landroid/content/res/TypedArray;", "Lkotlin/ExtensionFunctionType;", "resourceId", "core-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ContextKt {
    public static final /* synthetic */ <T> T getSystemService(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.reifiedOperationMarker(4, "T");
        return (T) ContextCompat.getSystemService(context, Object.class);
    }

    public static final void withStyledAttributes(@NotNull Context context, @StyleRes int i2, @NotNull int[] attrs, @NotNull Function1<? super TypedArray, Unit> block) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(block, "block");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, attrs);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(resourceId, attrs)");
        block.invoke(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public static final void withStyledAttributes(@NotNull Context context, @Nullable AttributeSet attributeSet, @NotNull int[] attrs, @AttrRes int i2, @StyleRes int i3, @NotNull Function1<? super TypedArray, Unit> block) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(block, "block");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, attrs, i2, i3);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        block.invoke(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void withStyledAttributes$default(Context context, AttributeSet attributeSet, int[] attrs, int i2, int i3, Function1 block, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            attributeSet = null;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(block, "block");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, attrs, i2, i3);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        block.invoke(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
}
