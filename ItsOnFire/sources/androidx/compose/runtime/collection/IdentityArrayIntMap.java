package androidx.compose.runtime.collection;

import androidx.appcompat.R;
import androidx.compose.runtime.ActualJvm_jvmKt;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\fJ&\u0010\u001d\u001a\u00020\u001e2\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001e0 H\u0086\bø\u0001\u0000J\u0012\u0010!\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0002J\"\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00012\u0006\u0010$\u001a\u00020\fH\u0002J&\u0010%\u001a\u00020\u001a2\u0018\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001a0 H\u0086\bø\u0001\u0000J\u0011\u0010'\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0001H\u0086\u0002J\u000e\u0010(\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u0001J&\u0010)\u001a\u00020\u001a2\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001e0 H\u0086\bø\u0001\u0000R.\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0016\n\u0002\u0010\n\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u00020\f8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u00020\u00138\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0014\u0010\u0002\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006*"}, d2 = {"Landroidx/compose/runtime/collection/IdentityArrayIntMap;", "", "()V", "keys", "", "getKeys$annotations", "getKeys", "()[Ljava/lang/Object;", "setKeys", "([Ljava/lang/Object;)V", "[Ljava/lang/Object;", "size", "", "getSize$annotations", "getSize", "()I", "setSize", "(I)V", "values", "", "getValues$annotations", "getValues", "()[I", "setValues", "([I)V", "add", "", "key", "value", "any", "", "predicate", "Lkotlin/Function2;", "find", "findExactIndex", "midIndex", "valueHash", "forEach", "block", "get", "remove", "removeValueIf", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class IdentityArrayIntMap {
    private int size;
    @NotNull
    private Object[] keys = new Object[4];
    @NotNull
    private int[] values = new int[4];

    private final int find(Object obj) {
        int i2 = this.size - 1;
        int identityHashCode = ActualJvm_jvmKt.identityHashCode(obj);
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            Object obj2 = this.keys[i4];
            int identityHashCode2 = ActualJvm_jvmKt.identityHashCode(obj2) - identityHashCode;
            if (identityHashCode2 < 0) {
                i3 = i4 + 1;
            } else if (identityHashCode2 <= 0) {
                return obj2 == obj ? i4 : findExactIndex(i4, obj, identityHashCode);
            } else {
                i2 = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    private final int findExactIndex(int i2, Object obj, int i3) {
        int i4 = i2 - 1;
        if (i4 >= 0) {
            while (true) {
                int i5 = i4 - 1;
                Object obj2 = this.keys[i4];
                if (obj2 != obj) {
                    if (ActualJvm_jvmKt.identityHashCode(obj2) != i3 || i5 < 0) {
                        break;
                    }
                    i4 = i5;
                } else {
                    return i4;
                }
            }
        }
        int i6 = i2 + 1;
        int i7 = this.size;
        while (i6 < i7) {
            int i8 = i6 + 1;
            Object obj3 = this.keys[i6];
            if (obj3 == obj) {
                return i6;
            }
            if (ActualJvm_jvmKt.identityHashCode(obj3) != i3) {
                return -i8;
            }
            i6 = i8;
        }
        return -(this.size + 1);
    }

    @PublishedApi
    public static /* synthetic */ void getKeys$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getSize$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getValues$annotations() {
    }

    public final void add(@NotNull Object key, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.size > 0) {
            i3 = find(key);
            if (i3 >= 0) {
                this.values[i3] = i2;
                return;
            }
        } else {
            i3 = -1;
        }
        int i4 = -(i3 + 1);
        int i5 = this.size;
        Object[] objArr = this.keys;
        if (i5 == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            int[] iArr = new int[objArr.length * 2];
            int i6 = i4 + 1;
            ArraysKt___ArraysJvmKt.copyInto(objArr, objArr2, i6, i4, i5);
            ArraysKt___ArraysJvmKt.copyInto(this.values, iArr, i6, i4, this.size);
            ArraysKt___ArraysJvmKt.copyInto$default(this.keys, objArr2, 0, 0, i4, 6, (Object) null);
            ArraysKt___ArraysJvmKt.copyInto$default(this.values, iArr, 0, 0, i4, 6, (Object) null);
            this.keys = objArr2;
            this.values = iArr;
        } else {
            int i7 = i4 + 1;
            ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i7, i4, i5);
            int[] iArr2 = this.values;
            ArraysKt___ArraysJvmKt.copyInto(iArr2, iArr2, i7, i4, this.size);
        }
        this.keys[i4] = key;
        this.values[i4] = i2;
        this.size++;
    }

    public final boolean any(@NotNull Function2<Object, ? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int size = getSize();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            Object obj = getKeys()[i2];
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
            }
            if (predicate.invoke(obj, Integer.valueOf(getValues()[i2])).booleanValue()) {
                return true;
            }
            i2 = i3;
        }
        return false;
    }

    public final void forEach(@NotNull Function2<Object, ? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int size = getSize();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            Object obj = getKeys()[i2];
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
            }
            block.invoke(obj, Integer.valueOf(getValues()[i2]));
            i2 = i3;
        }
    }

    public final int get(@NotNull Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int find = find(key);
        if (find >= 0) {
            return this.values[find];
        }
        throw new IllegalStateException("Key not found".toString());
    }

    @NotNull
    public final Object[] getKeys() {
        return this.keys;
    }

    public final int getSize() {
        return this.size;
    }

    @NotNull
    public final int[] getValues() {
        return this.values;
    }

    public final boolean remove(@NotNull Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int find = find(key);
        if (find >= 0) {
            int i2 = this.size;
            if (find < i2 - 1) {
                Object[] objArr = this.keys;
                int i3 = find + 1;
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, find, i3, i2);
                int[] iArr = this.values;
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, find, i3, this.size);
            }
            int i4 = this.size - 1;
            this.size = i4;
            this.keys[i4] = null;
            return true;
        }
        return false;
    }

    public final void removeValueIf(@NotNull Function2<Object, ? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int size = getSize();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            int i4 = i2 + 1;
            Object obj = getKeys()[i2];
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
            }
            int i5 = getValues()[i2];
            if (!predicate.invoke(obj, Integer.valueOf(i5)).booleanValue()) {
                if (i3 != i2) {
                    getKeys()[i3] = obj;
                    getValues()[i3] = i5;
                }
                i3++;
            }
            i2 = i4;
        }
        int size2 = getSize();
        for (int i6 = i3; i6 < size2; i6++) {
            getKeys()[i6] = null;
        }
        setSize(i3);
    }

    public final void setKeys(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        this.keys = objArr;
    }

    public final void setSize(int i2) {
        this.size = i2;
    }

    public final void setValues(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.values = iArr;
    }
}
