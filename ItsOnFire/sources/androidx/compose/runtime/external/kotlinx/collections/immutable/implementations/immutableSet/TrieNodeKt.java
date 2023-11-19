package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.appcompat.R;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u0018\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a7\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\"\u0004\b\u0000\u0010\u000b*\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\f\u001a\u0002H\u000bH\u0002¢\u0006\u0002\u0010\r\u001aL\u0010\u000e\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\b\b\u0002\u0010\u0010\u001a\u00020\u00012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00130\u0012H\u0082\b¢\u0006\u0002\u0010\u0014\u001a)\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t*\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\u0016\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\u0017\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"LOG_MAX_BRANCHING_FACTOR", "", "MAX_BRANCHING_FACTOR", "MAX_BRANCHING_FACTOR_MINUS_ONE", "MAX_SHIFT", "indexSegment", FirebaseAnalytics.Param.INDEX, "shift", "addElementAtIndex", "", "", "E", "element", "([Ljava/lang/Object;ILjava/lang/Object;)[Ljava/lang/Object;", "filterTo", "newArray", "newArrayOffset", "predicate", "Lkotlin/Function1;", "", "([Ljava/lang/Object;[Ljava/lang/Object;ILkotlin/jvm/functions/Function1;)I", "removeCellAtIndex", "cellIndex", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "runtime_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TrieNodeKt {
    public static final int LOG_MAX_BRANCHING_FACTOR = 5;
    public static final int MAX_BRANCHING_FACTOR = 32;
    public static final int MAX_BRANCHING_FACTOR_MINUS_ONE = 31;
    public static final int MAX_SHIFT = 30;

    public static final /* synthetic */ Object[] access$addElementAtIndex(Object[] objArr, int i2, Object obj) {
        return addElementAtIndex(objArr, i2, obj);
    }

    public static final /* synthetic */ Object[] access$removeCellAtIndex(Object[] objArr, int i2) {
        return removeCellAtIndex(objArr, i2);
    }

    public static final <E> Object[] addElementAtIndex(Object[] objArr, int i2, E e2) {
        Object[] objArr2 = new Object[objArr.length + 1];
        ArraysKt___ArraysJvmKt.copyInto$default(objArr, objArr2, 0, 0, i2, 6, (Object) null);
        ArraysKt___ArraysJvmKt.copyInto(objArr, objArr2, i2 + 1, i2, objArr.length);
        objArr2[i2] = e2;
        return objArr2;
    }

    private static final int filterTo(Object[] objArr, Object[] objArr2, int i2, Function1<Object, Boolean> function1) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < objArr.length) {
            CommonFunctionsKt.m1077assert(i4 <= i3);
            if (function1.invoke(objArr[i3]).booleanValue()) {
                objArr2[i2 + i4] = objArr[i3];
                i4++;
                CommonFunctionsKt.m1077assert(i2 + i4 <= objArr2.length);
            }
            i3++;
        }
        return i4;
    }

    public static /* synthetic */ int filterTo$default(Object[] objArr, Object[] objArr2, int i2, Function1 function1, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            function1 = TrieNodeKt$filterTo$1.INSTANCE;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < objArr.length) {
            CommonFunctionsKt.m1077assert(i5 <= i4);
            if (((Boolean) function1.invoke(objArr[i4])).booleanValue()) {
                objArr2[i2 + i5] = objArr[i4];
                i5++;
                CommonFunctionsKt.m1077assert(i2 + i5 <= objArr2.length);
            }
            i4++;
        }
        return i5;
    }

    public static final int indexSegment(int i2, int i3) {
        return (i2 >> i3) & 31;
    }

    public static final Object[] removeCellAtIndex(Object[] objArr, int i2) {
        Object[] objArr2 = new Object[objArr.length - 1];
        ArraysKt___ArraysJvmKt.copyInto$default(objArr, objArr2, 0, 0, i2, 6, (Object) null);
        ArraysKt___ArraysJvmKt.copyInto(objArr, objArr2, i2, i2 + 1, objArr.length);
        return objArr2;
    }
}
