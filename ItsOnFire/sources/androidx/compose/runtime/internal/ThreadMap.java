package androidx.compose.runtime.internal;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/internal/ThreadMap;", "", "size", "", "keys", "", "values", "", "(I[J[Ljava/lang/Object;)V", "[Ljava/lang/Object;", "find", "key", "", "get", "newWith", "value", "trySet", "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ThreadMap {
    @NotNull
    private final long[] keys;
    private final int size;
    @NotNull
    private final Object[] values;

    public ThreadMap(int i2, @NotNull long[] keys, @NotNull Object[] values) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(values, "values");
        this.size = i2;
        this.keys = keys;
        this.values = values;
    }

    private final int find(long j2) {
        int i2 = this.size - 1;
        if (i2 != -1) {
            int i3 = 0;
            if (i2 == 0) {
                long j3 = this.keys[0];
                if (j3 == j2) {
                    return 0;
                }
                return j3 > j2 ? -2 : -1;
            }
            while (i3 <= i2) {
                int i4 = (i3 + i2) >>> 1;
                int i5 = ((this.keys[i4] - j2) > 0L ? 1 : ((this.keys[i4] - j2) == 0L ? 0 : -1));
                if (i5 < 0) {
                    i3 = i4 + 1;
                } else if (i5 <= 0) {
                    return i4;
                } else {
                    i2 = i4 - 1;
                }
            }
            return -(i3 + 1);
        }
        return -1;
    }

    @Nullable
    public final Object get(long j2) {
        int find = find(j2);
        if (find >= 0) {
            return this.values[find];
        }
        return null;
    }

    @NotNull
    public final ThreadMap newWith(long j2, @Nullable Object obj) {
        int i2 = this.size;
        Object[] objArr = this.values;
        int length = objArr.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            }
            Object obj2 = objArr[i4];
            i4++;
            if (obj2 != null) {
                i5++;
            }
        }
        int i6 = i5 + 1;
        long[] jArr = new long[i6];
        Object[] objArr2 = new Object[i6];
        if (i6 > 1) {
            int i7 = 0;
            while (true) {
                if (i3 >= i6 || i7 >= i2) {
                    break;
                }
                long j3 = this.keys[i7];
                Object obj3 = this.values[i7];
                if (j3 > j2) {
                    jArr[i3] = j2;
                    objArr2[i3] = obj;
                    i3++;
                    break;
                }
                if (obj3 != null) {
                    jArr[i3] = j3;
                    objArr2[i3] = obj3;
                    i3++;
                }
                i7++;
            }
            if (i7 == i2) {
                int i8 = i6 - 1;
                jArr[i8] = j2;
                objArr2[i8] = obj;
            } else {
                while (i3 < i6) {
                    long j4 = this.keys[i7];
                    Object obj4 = this.values[i7];
                    if (obj4 != null) {
                        jArr[i3] = j4;
                        objArr2[i3] = obj4;
                        i3++;
                    }
                    i7++;
                }
            }
        } else {
            jArr[0] = j2;
            objArr2[0] = obj;
        }
        return new ThreadMap(i6, jArr, objArr2);
    }

    public final boolean trySet(long j2, @Nullable Object obj) {
        int find = find(j2);
        if (find < 0) {
            return false;
        }
        this.values[find] = obj;
        return true;
    }
}
