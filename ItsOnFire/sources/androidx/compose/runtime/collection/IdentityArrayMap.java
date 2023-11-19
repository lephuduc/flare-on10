package androidx.compose.runtime.collection;

import androidx.appcompat.R;
import androidx.compose.runtime.ActualJvm_jvmKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u00032\u00020\u0002B\u000f\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010\u0018J\u0012\u0010\u0019\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0002J\"\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001c\u001a\u00020\u0005H\u0002JD\u0010\u001d\u001a\u00020\u001e26\u0010\u001f\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u001e0 H\u0086\bø\u0001\u0000J\u0018\u0010$\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0017\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010%J\u0006\u0010&\u001a\u00020\u0016J\u0006\u0010'\u001a\u00020\u0016J\u0013\u0010(\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00028\u0000¢\u0006\u0002\u0010\u0018J/\u0010)\u001a\u00020\u001e2!\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00160*H\u0086\bø\u0001\u0000J\u001e\u0010+\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010#\u001a\u00028\u0001H\u0086\u0002¢\u0006\u0002\u0010,R$\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\bX\u0080\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0006R$\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\bX\u0080\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006-"}, d2 = {"Landroidx/compose/runtime/collection/IdentityArrayMap;", "Key", "", "Value", "capacity", "", "(I)V", "keys", "", "getKeys$runtime_release", "()[Ljava/lang/Object;", "setKeys$runtime_release", "([Ljava/lang/Object;)V", "[Ljava/lang/Object;", "size", "getSize$runtime_release", "()I", "setSize$runtime_release", "values", "getValues$runtime_release", "setValues$runtime_release", "contains", "", "key", "(Ljava/lang/Object;)Z", "find", "findExactIndex", "midIndex", "keyHash", "forEach", "", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "isEmpty", "isNotEmpty", "remove", "removeValueIf", "Lkotlin/Function1;", "set", "(Ljava/lang/Object;Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class IdentityArrayMap<Key, Value> {
    @NotNull
    private Object[] keys;
    private int size;
    @NotNull
    private Object[] values;

    public IdentityArrayMap() {
        this(0, 1, null);
    }

    public IdentityArrayMap(int i2) {
        this.keys = new Object[i2];
        this.values = new Object[i2];
    }

    public /* synthetic */ IdentityArrayMap(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 16 : i2);
    }

    private final int find(Object obj) {
        int identityHashCode = ActualJvm_jvmKt.identityHashCode(obj);
        int i2 = this.size - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            Object obj2 = this.keys[i4];
            int identityHashCode2 = ActualJvm_jvmKt.identityHashCode(obj2) - identityHashCode;
            if (identityHashCode2 < 0) {
                i3 = i4 + 1;
            } else if (identityHashCode2 <= 0) {
                return obj == obj2 ? i4 : findExactIndex(i4, obj, identityHashCode);
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

    public final boolean contains(@NotNull Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return find(key) >= 0;
    }

    public final void forEach(@NotNull Function2<? super Key, ? super Value, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int size$runtime_release = getSize$runtime_release();
        int i2 = 0;
        while (i2 < size$runtime_release) {
            int i3 = i2 + 1;
            Object obj = getKeys$runtime_release()[i2];
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
            }
            block.invoke(obj, getValues$runtime_release()[i2]);
            i2 = i3;
        }
    }

    @Nullable
    public final Value get(@NotNull Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int find = find(key);
        if (find >= 0) {
            return (Value) this.values[find];
        }
        return null;
    }

    @NotNull
    public final Object[] getKeys$runtime_release() {
        return this.keys;
    }

    public final int getSize$runtime_release() {
        return this.size;
    }

    @NotNull
    public final Object[] getValues$runtime_release() {
        return this.values;
    }

    public final boolean isEmpty() {
        return this.size == 0;
    }

    public final boolean isNotEmpty() {
        return this.size > 0;
    }

    public final boolean remove(@NotNull Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int find = find(key);
        if (find >= 0) {
            int i2 = this.size;
            Object[] objArr = this.keys;
            Object[] objArr2 = this.values;
            int i3 = find + 1;
            ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, find, i3, i2);
            ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, find, i3, i2);
            int i4 = i2 - 1;
            objArr[i4] = null;
            objArr2[i4] = null;
            this.size = i4;
            return true;
        }
        return false;
    }

    public final void removeValueIf(@NotNull Function1<? super Value, Boolean> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int size$runtime_release = getSize$runtime_release();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size$runtime_release) {
            int i4 = i2 + 1;
            Object obj = getValues$runtime_release()[i2];
            if (!block.invoke(obj).booleanValue()) {
                if (i3 != i2) {
                    getKeys$runtime_release()[i3] = getKeys$runtime_release()[i2];
                    getValues$runtime_release()[i3] = obj;
                }
                i3++;
            }
            i2 = i4;
        }
        if (getSize$runtime_release() > i3) {
            int size$runtime_release2 = getSize$runtime_release();
            for (int i5 = i3; i5 < size$runtime_release2; i5++) {
                getKeys$runtime_release()[i5] = null;
                getValues$runtime_release()[i5] = null;
            }
            setSize$runtime_release(i3);
        }
    }

    public final void set(@NotNull Key key, Value value) {
        Intrinsics.checkNotNullParameter(key, "key");
        int find = find(key);
        if (find >= 0) {
            this.values[find] = value;
            return;
        }
        int i2 = -(find + 1);
        int i3 = this.size;
        Object[] objArr = this.keys;
        boolean z = i3 == objArr.length;
        Object[] objArr2 = z ? new Object[i3 * 2] : objArr;
        int i4 = i2 + 1;
        ArraysKt___ArraysJvmKt.copyInto(objArr, objArr2, i4, i2, i3);
        if (z) {
            ArraysKt___ArraysJvmKt.copyInto$default(this.keys, objArr2, 0, 0, i2, 6, (Object) null);
        }
        objArr2[i2] = key;
        this.keys = objArr2;
        Object[] objArr3 = z ? new Object[this.size * 2] : this.values;
        ArraysKt___ArraysJvmKt.copyInto(this.values, objArr3, i4, i2, this.size);
        if (z) {
            ArraysKt___ArraysJvmKt.copyInto$default(this.values, objArr3, 0, 0, i2, 6, (Object) null);
        }
        objArr3[i2] = value;
        this.values = objArr3;
        this.size++;
    }

    public final void setKeys$runtime_release(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        this.keys = objArr;
    }

    public final void setSize$runtime_release(int i2) {
        this.size = i2;
    }

    public final void setValues$runtime_release(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        this.values = objArr;
    }
}
