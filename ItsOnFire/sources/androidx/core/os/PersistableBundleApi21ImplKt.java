package androidx.core.os;

import android.os.PersistableBundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresApi(21)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J$\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0007¨\u0006\r"}, d2 = {"Landroidx/core/os/PersistableBundleApi21ImplKt;", "", "()V", "createPersistableBundle", "Landroid/os/PersistableBundle;", "capacity", "", "putValue", "", "persistableBundle", "key", "", "value", "core-ktx_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
final class PersistableBundleApi21ImplKt {
    @NotNull
    public static final PersistableBundleApi21ImplKt INSTANCE = new PersistableBundleApi21ImplKt();

    private PersistableBundleApi21ImplKt() {
    }

    @JvmStatic
    @DoNotInline
    @NotNull
    public static final PersistableBundle createPersistableBundle(int i2) {
        return new PersistableBundle(i2);
    }

    @JvmStatic
    @DoNotInline
    public static final void putValue(@NotNull PersistableBundle persistableBundle, @Nullable String str, @Nullable Object obj) {
        String str2;
        Intrinsics.checkNotNullParameter(persistableBundle, "persistableBundle");
        if (obj == null) {
            str2 = null;
        } else if (obj instanceof Boolean) {
            PersistableBundleApi22ImplKt.putBoolean(persistableBundle, str, ((Boolean) obj).booleanValue());
            return;
        } else if (obj instanceof Double) {
            persistableBundle.putDouble(str, ((Number) obj).doubleValue());
            return;
        } else if (obj instanceof Integer) {
            persistableBundle.putInt(str, ((Number) obj).intValue());
            return;
        } else if (obj instanceof Long) {
            persistableBundle.putLong(str, ((Number) obj).longValue());
            return;
        } else if (!(obj instanceof String)) {
            if (obj instanceof boolean[]) {
                PersistableBundleApi22ImplKt.putBooleanArray(persistableBundle, str, (boolean[]) obj);
                return;
            } else if (obj instanceof double[]) {
                persistableBundle.putDoubleArray(str, (double[]) obj);
                return;
            } else if (obj instanceof int[]) {
                persistableBundle.putIntArray(str, (int[]) obj);
                return;
            } else if (obj instanceof long[]) {
                persistableBundle.putLongArray(str, (long[]) obj);
                return;
            } else if (!(obj instanceof Object[])) {
                String canonicalName = obj.getClass().getCanonicalName();
                throw new IllegalArgumentException("Illegal value type " + canonicalName + " for key \"" + str + Typography.quote);
            } else {
                Class<?> componentType = obj.getClass().getComponentType();
                Intrinsics.checkNotNull(componentType);
                if (String.class.isAssignableFrom(componentType)) {
                    persistableBundle.putStringArray(str, (String[]) obj);
                    return;
                }
                String canonicalName2 = componentType.getCanonicalName();
                throw new IllegalArgumentException("Illegal value array type " + canonicalName2 + " for key \"" + str + Typography.quote);
            }
        } else {
            str2 = (String) obj;
        }
        persistableBundle.putString(str, str2);
    }
}
