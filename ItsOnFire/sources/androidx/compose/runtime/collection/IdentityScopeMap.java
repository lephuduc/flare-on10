package androidx.compose.runtime.collection;

import androidx.appcompat.R;
import androidx.compose.runtime.ActualJvm_jvmKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u001b\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00028\u0000¢\u0006\u0002\u0010&J\u0006\u0010'\u001a\u00020(J\u0011\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020\u0002H\u0086\u0002J\u0012\u0010+\u001a\u00020\u000e2\b\u0010$\u001a\u0004\u0018\u00010\u0002H\u0002J\"\u0010,\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u000e2\b\u0010$\u001a\u0004\u0018\u00010\u00022\u0006\u0010.\u001a\u00020\u000eH\u0002J7\u0010/\u001a\u00020(2\u0006\u0010$\u001a\u00020\u00022!\u00100\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020(01H\u0086\bø\u0001\u0000J\u0016\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010$\u001a\u00020\u0002H\u0002J\u001b\u00105\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00028\u0000¢\u0006\u0002\u0010&J/\u00106\u001a\u00020(2!\u00107\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020#01H\u0086\bø\u0001\u0000J\u0016\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u00109\u001a\u00020\u000eH\u0002J\u0011\u0010:\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u000eH\u0082\bR4\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00060\u00058\u0000@\u0000X\u0081\u000e¢\u0006\u0016\n\u0002\u0010\f\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\u000e8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u00020\u00158\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0016\u0010\u0003\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR.\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00058\u0000@\u0000X\u0081\u000e¢\u0006\u0016\n\u0002\u0010!\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006;"}, d2 = {"Landroidx/compose/runtime/collection/IdentityScopeMap;", "T", "", "()V", "scopeSets", "", "Landroidx/compose/runtime/collection/IdentityArraySet;", "getScopeSets$annotations", "getScopeSets", "()[Landroidx/compose/runtime/collection/IdentityArraySet;", "setScopeSets", "([Landroidx/compose/runtime/collection/IdentityArraySet;)V", "[Landroidx/compose/runtime/collection/IdentityArraySet;", "size", "", "getSize$annotations", "getSize", "()I", "setSize", "(I)V", "valueOrder", "", "getValueOrder$annotations", "getValueOrder", "()[I", "setValueOrder", "([I)V", "values", "getValues$annotations", "getValues", "()[Ljava/lang/Object;", "setValues", "([Ljava/lang/Object;)V", "[Ljava/lang/Object;", "add", "", "value", "scope", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "clear", "", "contains", "element", "find", "findExactIndex", "midIndex", "valueHash", "forEachScopeOf", "block", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "getOrCreateIdentitySet", "remove", "removeValueIf", "predicate", "scopeSetAt", FirebaseAnalytics.Param.INDEX, "valueAt", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class IdentityScopeMap<T> {
    @NotNull
    private IdentityArraySet<T>[] scopeSets;
    private int size;
    @NotNull
    private int[] valueOrder;
    @NotNull
    private Object[] values;

    public IdentityScopeMap() {
        int[] iArr = new int[50];
        for (int i2 = 0; i2 < 50; i2++) {
            iArr[i2] = i2;
        }
        this.valueOrder = iArr;
        this.values = new Object[50];
        this.scopeSets = new IdentityArraySet[50];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int find(Object obj) {
        int identityHashCode = ActualJvm_jvmKt.identityHashCode(obj);
        int i2 = this.size - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            Object obj2 = getValues()[getValueOrder()[i4]];
            Intrinsics.checkNotNull(obj2);
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
                Object obj2 = getValues()[getValueOrder()[i4]];
                Intrinsics.checkNotNull(obj2);
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
            Object obj3 = getValues()[getValueOrder()[i6]];
            Intrinsics.checkNotNull(obj3);
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

    private final IdentityArraySet<T> getOrCreateIdentitySet(Object obj) {
        int i2;
        if (this.size > 0) {
            i2 = find(obj);
            if (i2 >= 0) {
                return scopeSetAt(i2);
            }
        } else {
            i2 = -1;
        }
        int i3 = -(i2 + 1);
        int i4 = this.size;
        int[] iArr = this.valueOrder;
        if (i4 < iArr.length) {
            int i5 = iArr[i4];
            this.values[i5] = obj;
            IdentityArraySet<T> identityArraySet = this.scopeSets[i5];
            if (identityArraySet == null) {
                identityArraySet = new IdentityArraySet<>();
                getScopeSets()[i5] = identityArraySet;
            }
            int i6 = this.size;
            if (i3 < i6) {
                int[] iArr2 = this.valueOrder;
                ArraysKt___ArraysJvmKt.copyInto(iArr2, iArr2, i3 + 1, i3, i6);
            }
            this.valueOrder[i3] = i5;
            this.size++;
            return identityArraySet;
        }
        int length = iArr.length * 2;
        Object[] copyOf = Arrays.copyOf(this.scopeSets, length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        this.scopeSets = (IdentityArraySet[]) copyOf;
        IdentityArraySet<T> identityArraySet2 = new IdentityArraySet<>();
        this.scopeSets[i4] = identityArraySet2;
        Object[] copyOf2 = Arrays.copyOf(this.values, length);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
        this.values = copyOf2;
        copyOf2[i4] = obj;
        int[] iArr3 = new int[length];
        for (int i7 = this.size + 1; i7 < length; i7++) {
            iArr3[i7] = i7;
        }
        int i8 = this.size;
        if (i3 < i8) {
            ArraysKt___ArraysJvmKt.copyInto(this.valueOrder, iArr3, i3 + 1, i3, i8);
        }
        iArr3[i3] = i4;
        if (i3 > 0) {
            ArraysKt___ArraysJvmKt.copyInto$default(this.valueOrder, iArr3, 0, 0, i3, 6, (Object) null);
        }
        this.valueOrder = iArr3;
        this.size++;
        return identityArraySet2;
    }

    @PublishedApi
    public static /* synthetic */ void getScopeSets$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getSize$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getValueOrder$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getValues$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IdentityArraySet<T> scopeSetAt(int i2) {
        IdentityArraySet<T> identityArraySet = this.scopeSets[this.valueOrder[i2]];
        Intrinsics.checkNotNull(identityArraySet);
        return identityArraySet;
    }

    private final Object valueAt(int i2) {
        Object obj = getValues()[getValueOrder()[i2]];
        Intrinsics.checkNotNull(obj);
        return obj;
    }

    public final boolean add(@NotNull Object value, @NotNull T scope) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return getOrCreateIdentitySet(value).add(scope);
    }

    public final void clear() {
        int length = this.scopeSets.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            IdentityArraySet<T> identityArraySet = this.scopeSets[i2];
            if (identityArraySet != null) {
                identityArraySet.clear();
            }
            this.valueOrder[i2] = i2;
            this.values[i2] = null;
            i2 = i3;
        }
        this.size = 0;
    }

    public final boolean contains(@NotNull Object element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return find(element) >= 0;
    }

    public final void forEachScopeOf(@NotNull Object value, @NotNull Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(block, "block");
        int find = find(value);
        if (find >= 0) {
            for (Object obj : scopeSetAt(find)) {
                block.invoke(obj);
            }
        }
    }

    @NotNull
    public final IdentityArraySet<T>[] getScopeSets() {
        return this.scopeSets;
    }

    public final int getSize() {
        return this.size;
    }

    @NotNull
    public final int[] getValueOrder() {
        return this.valueOrder;
    }

    @NotNull
    public final Object[] getValues() {
        return this.values;
    }

    public final boolean remove(@NotNull Object value, @NotNull T scope) {
        int i2;
        IdentityArraySet<T> identityArraySet;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(scope, "scope");
        int find = find(value);
        if (find < 0 || (identityArraySet = this.scopeSets[(i2 = this.valueOrder[find])]) == null) {
            return false;
        }
        boolean remove = identityArraySet.remove(scope);
        if (identityArraySet.size() == 0) {
            int i3 = find + 1;
            int i4 = this.size;
            if (i3 < i4) {
                int[] iArr = this.valueOrder;
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, find, i3, i4);
            }
            int[] iArr2 = this.valueOrder;
            int i5 = this.size;
            iArr2[i5 - 1] = i2;
            this.values[i2] = null;
            this.size = i5 - 1;
        }
        return remove;
    }

    public final void removeValueIf(@NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int size = getSize();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            int i4 = i2 + 1;
            int i5 = getValueOrder()[i2];
            IdentityArraySet<T> identityArraySet = getScopeSets()[i5];
            Intrinsics.checkNotNull(identityArraySet);
            int size2 = identityArraySet.size();
            int i6 = 0;
            int i7 = 0;
            while (i6 < size2) {
                int i8 = i6 + 1;
                Object obj = identityArraySet.getValues()[i6];
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                }
                if (!predicate.invoke(obj).booleanValue()) {
                    if (i7 != i6) {
                        identityArraySet.getValues()[i7] = obj;
                    }
                    i7++;
                }
                i6 = i8;
            }
            int size3 = identityArraySet.size();
            for (int i9 = i7; i9 < size3; i9++) {
                identityArraySet.getValues()[i9] = null;
            }
            identityArraySet.setSize(i7);
            if (identityArraySet.size() > 0) {
                if (i3 != i2) {
                    int i10 = getValueOrder()[i3];
                    getValueOrder()[i3] = i5;
                    getValueOrder()[i2] = i10;
                }
                i3++;
            }
            i2 = i4;
        }
        int size4 = getSize();
        for (int i11 = i3; i11 < size4; i11++) {
            getValues()[getValueOrder()[i11]] = null;
        }
        setSize(i3);
    }

    public final void setScopeSets(@NotNull IdentityArraySet<T>[] identityArraySetArr) {
        Intrinsics.checkNotNullParameter(identityArraySetArr, "<set-?>");
        this.scopeSets = identityArraySetArr;
    }

    public final void setSize(int i2) {
        this.size = i2;
    }

    public final void setValueOrder(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.valueOrder = iArr;
    }

    public final void setValues(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        this.values = objArr;
    }
}
