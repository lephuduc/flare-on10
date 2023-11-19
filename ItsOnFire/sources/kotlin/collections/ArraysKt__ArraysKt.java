package kotlin.collections;

import androidx.appcompat.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShortArray;
import kotlin.collections.unsigned.UArraysKt___UArraysKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\f\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0018\u00010\u00032\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0018\u00010\u0003H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u0007\u001a\u00020\b\"\u0004\b\u0000\u0010\u0002*\f\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0018\u00010\u0003H\u0001¢\u0006\u0004\b\t\u0010\n\u001a?\u0010\u000b\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\n\u0010\r\u001a\u00060\u000ej\u0002`\u000f2\u0010\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a+\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0015\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00030\u0003¢\u0006\u0002\u0010\u0016\u001a;\u0010\u0017\u001a\u0002H\u0018\"\u0010\b\u0000\u0010\u0019*\u0006\u0012\u0002\b\u00030\u0003*\u0002H\u0018\"\u0004\b\u0001\u0010\u0018*\u0002H\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001bH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a)\u0010\u001d\u001a\u00020\u0001*\b\u0012\u0002\b\u0003\u0018\u00010\u0003H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000¢\u0006\u0002\u0010\u001e\u001aG\u0010\u001f\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\u00150 \"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0018*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00180 0\u0003¢\u0006\u0002\u0010!\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\""}, d2 = {"contentDeepEqualsImpl", "", "T", "", "other", "contentDeepEquals", "([Ljava/lang/Object;[Ljava/lang/Object;)Z", "contentDeepToStringImpl", "", "contentDeepToString", "([Ljava/lang/Object;)Ljava/lang/String;", "contentDeepToStringInternal", "", "result", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "processed", "", "contentDeepToStringInternal$ArraysKt__ArraysKt", "([Ljava/lang/Object;Ljava/lang/StringBuilder;Ljava/util/List;)V", "flatten", "", "([[Ljava/lang/Object;)Ljava/util/List;", "ifEmpty", "R", "C", "defaultValue", "Lkotlin/Function0;", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isNullOrEmpty", "([Ljava/lang/Object;)Z", "unzip", "Lkotlin/Pair;", "([Lkotlin/Pair;)Lkotlin/Pair;", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkedTextViewStyle, xs = "kotlin/collections/ArraysKt")
/* loaded from: classes.dex */
public class ArraysKt__ArraysKt extends ArraysKt__ArraysJVMKt {
    @SinceKotlin(version = "1.3")
    @PublishedApi
    @JvmName(name = "contentDeepEquals")
    public static final <T> boolean contentDeepEquals(@Nullable T[] tArr, @Nullable T[] tArr2) {
        boolean m4158contentEqualslec5QzE;
        boolean m4154contentEqualsKJPZfPQ;
        boolean m4153contentEqualsFGO6Aew;
        boolean m4156contentEqualskV0jMPg;
        if (tArr == tArr2) {
            return true;
        }
        if (tArr == null || tArr2 == null || tArr.length != tArr2.length) {
            return false;
        }
        int length = tArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            T t2 = tArr[i2];
            T t3 = tArr2[i2];
            if (t2 != t3) {
                if (t2 == null || t3 == null) {
                    return false;
                }
                if ((t2 instanceof Object[]) && (t3 instanceof Object[])) {
                    if (!contentDeepEquals((Object[]) t2, (Object[]) t3)) {
                        return false;
                    }
                } else if ((t2 instanceof byte[]) && (t3 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) t2, (byte[]) t3)) {
                        return false;
                    }
                } else if ((t2 instanceof short[]) && (t3 instanceof short[])) {
                    if (!Arrays.equals((short[]) t2, (short[]) t3)) {
                        return false;
                    }
                } else if ((t2 instanceof int[]) && (t3 instanceof int[])) {
                    if (!Arrays.equals((int[]) t2, (int[]) t3)) {
                        return false;
                    }
                } else if ((t2 instanceof long[]) && (t3 instanceof long[])) {
                    if (!Arrays.equals((long[]) t2, (long[]) t3)) {
                        return false;
                    }
                } else if ((t2 instanceof float[]) && (t3 instanceof float[])) {
                    if (!Arrays.equals((float[]) t2, (float[]) t3)) {
                        return false;
                    }
                } else if ((t2 instanceof double[]) && (t3 instanceof double[])) {
                    if (!Arrays.equals((double[]) t2, (double[]) t3)) {
                        return false;
                    }
                } else if ((t2 instanceof char[]) && (t3 instanceof char[])) {
                    if (!Arrays.equals((char[]) t2, (char[]) t3)) {
                        return false;
                    }
                } else if ((t2 instanceof boolean[]) && (t3 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) t2, (boolean[]) t3)) {
                        return false;
                    }
                } else if ((t2 instanceof UByteArray) && (t3 instanceof UByteArray)) {
                    m4156contentEqualskV0jMPg = UArraysKt___UArraysKt.m4156contentEqualskV0jMPg(((UByteArray) t2).m3665unboximpl(), ((UByteArray) t3).m3665unboximpl());
                    if (!m4156contentEqualskV0jMPg) {
                        return false;
                    }
                } else if ((t2 instanceof UShortArray) && (t3 instanceof UShortArray)) {
                    m4153contentEqualsFGO6Aew = UArraysKt___UArraysKt.m4153contentEqualsFGO6Aew(((UShortArray) t2).m3925unboximpl(), ((UShortArray) t3).m3925unboximpl());
                    if (!m4153contentEqualsFGO6Aew) {
                        return false;
                    }
                } else if ((t2 instanceof UIntArray) && (t3 instanceof UIntArray)) {
                    m4154contentEqualsKJPZfPQ = UArraysKt___UArraysKt.m4154contentEqualsKJPZfPQ(((UIntArray) t2).m3743unboximpl(), ((UIntArray) t3).m3743unboximpl());
                    if (!m4154contentEqualsKJPZfPQ) {
                        return false;
                    }
                } else if ((t2 instanceof ULongArray) && (t3 instanceof ULongArray)) {
                    m4158contentEqualslec5QzE = UArraysKt___UArraysKt.m4158contentEqualslec5QzE(((ULongArray) t2).m3821unboximpl(), ((ULongArray) t3).m3821unboximpl());
                    if (!m4158contentEqualslec5QzE) {
                        return false;
                    }
                } else if (!Intrinsics.areEqual(t2, t3)) {
                    return false;
                }
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.3")
    @JvmName(name = "contentDeepToString")
    @NotNull
    @PublishedApi
    public static final <T> String contentDeepToString(@Nullable T[] tArr) {
        int coerceAtMost;
        if (tArr == null) {
            return "null";
        }
        coerceAtMost = RangesKt___RangesKt.coerceAtMost(tArr.length, 429496729);
        StringBuilder sb = new StringBuilder((coerceAtMost * 5) + 2);
        contentDeepToStringInternal$ArraysKt__ArraysKt(tArr, sb, new ArrayList());
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    private static final <T> void contentDeepToStringInternal$ArraysKt__ArraysKt(T[] tArr, StringBuilder sb, List<Object[]> list) {
        int lastIndex;
        String m4170contentToString2csIQuQ;
        if (list.contains(tArr)) {
            sb.append("[...]");
            return;
        }
        list.add(tArr);
        sb.append('[');
        int length = tArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i2 != 0) {
                sb.append(", ");
            }
            T t2 = tArr[i2];
            if (t2 == null) {
                m4170contentToString2csIQuQ = "null";
            } else if (t2 instanceof Object[]) {
                contentDeepToStringInternal$ArraysKt__ArraysKt((Object[]) t2, sb, list);
            } else {
                if (t2 instanceof byte[]) {
                    m4170contentToString2csIQuQ = Arrays.toString((byte[]) t2);
                } else if (t2 instanceof short[]) {
                    m4170contentToString2csIQuQ = Arrays.toString((short[]) t2);
                } else if (t2 instanceof int[]) {
                    m4170contentToString2csIQuQ = Arrays.toString((int[]) t2);
                } else if (t2 instanceof long[]) {
                    m4170contentToString2csIQuQ = Arrays.toString((long[]) t2);
                } else if (t2 instanceof float[]) {
                    m4170contentToString2csIQuQ = Arrays.toString((float[]) t2);
                } else if (t2 instanceof double[]) {
                    m4170contentToString2csIQuQ = Arrays.toString((double[]) t2);
                } else if (t2 instanceof char[]) {
                    m4170contentToString2csIQuQ = Arrays.toString((char[]) t2);
                } else if (t2 instanceof boolean[]) {
                    m4170contentToString2csIQuQ = Arrays.toString((boolean[]) t2);
                } else {
                    m4170contentToString2csIQuQ = t2 instanceof UByteArray ? UArraysKt___UArraysKt.m4170contentToString2csIQuQ(((UByteArray) t2).m3665unboximpl()) : t2 instanceof UShortArray ? UArraysKt___UArraysKt.m4174contentToStringd6D3K8(((UShortArray) t2).m3925unboximpl()) : t2 instanceof UIntArray ? UArraysKt___UArraysKt.m4173contentToStringXUkPCBk(((UIntArray) t2).m3743unboximpl()) : t2 instanceof ULongArray ? UArraysKt___UArraysKt.m4176contentToStringuLth9ew(((ULongArray) t2).m3821unboximpl()) : t2.toString();
                }
                Intrinsics.checkNotNullExpressionValue(m4170contentToString2csIQuQ, "toString(this)");
            }
            sb.append(m4170contentToString2csIQuQ);
        }
        sb.append(']');
        lastIndex = CollectionsKt__CollectionsKt.getLastIndex(list);
        list.remove(lastIndex);
    }

    @NotNull
    public static final <T> List<T> flatten(@NotNull T[][] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int i2 = 0;
        for (T[] tArr2 : tArr) {
            i2 += tArr2.length;
        }
        ArrayList arrayList = new ArrayList(i2);
        for (T[] tArr3 : tArr) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, tArr3);
        }
        return arrayList;
    }

    /* JADX WARN: Incorrect types in method signature: <C:[Ljava/lang/Object;:TR;R:Ljava/lang/Object;>(TC;Lkotlin/jvm/functions/Function0<+TR;>;)TR; */
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final Object ifEmpty(Object[] objArr, Function0 defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return objArr.length == 0 ? defaultValue.invoke() : objArr;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final boolean isNullOrEmpty(Object[] objArr) {
        if (objArr != null) {
            if (!(objArr.length == 0)) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final <T, R> Pair<List<T>, List<R>> unzip(@NotNull Pair<? extends T, ? extends R>[] pairArr) {
        Intrinsics.checkNotNullParameter(pairArr, "<this>");
        ArrayList arrayList = new ArrayList(pairArr.length);
        ArrayList arrayList2 = new ArrayList(pairArr.length);
        for (Pair<? extends T, ? extends R> pair : pairArr) {
            arrayList.add(pair.getFirst());
            arrayList2.add(pair.getSecond());
        }
        return TuplesKt.to(arrayList, arrayList2);
    }
}
