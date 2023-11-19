package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@KeepForSdk
/* loaded from: classes.dex */
public final class CollectionUtils {
    private CollectionUtils() {
    }

    @KeepForSdk
    public static boolean isEmpty(@Nullable Collection<?> collection) {
        if (collection == null) {
            return true;
        }
        return collection.isEmpty();
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf() {
        return Collections.emptyList();
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(@NonNull T t2) {
        return Collections.singletonList(t2);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(@NonNull T... tArr) {
        int length = tArr.length;
        return length != 0 ? length != 1 ? Collections.unmodifiableList(Arrays.asList(tArr)) : listOf(tArr[0]) : listOf();
    }

    @NonNull
    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(@NonNull K k2, @NonNull V v2, @NonNull K k3, @NonNull V v3, @NonNull K k4, @NonNull V v4) {
        Map zza = zza(3, false);
        zza.put(k2, v2);
        zza.put(k3, v3);
        zza.put(k4, v4);
        return Collections.unmodifiableMap(zza);
    }

    @NonNull
    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(@NonNull K k2, @NonNull V v2, @NonNull K k3, @NonNull V v3, @NonNull K k4, @NonNull V v4, @NonNull K k5, @NonNull V v5, @NonNull K k6, @NonNull V v6, @NonNull K k7, @NonNull V v7) {
        Map zza = zza(6, false);
        zza.put(k2, v2);
        zza.put(k3, v3);
        zza.put(k4, v4);
        zza.put(k5, v5);
        zza.put(k6, v6);
        zza.put(k7, v7);
        return Collections.unmodifiableMap(zza);
    }

    @NonNull
    @KeepForSdk
    public static <K, V> Map<K, V> mapOfKeyValueArrays(@NonNull K[] kArr, @NonNull V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length != length2) {
            throw new IllegalArgumentException("Key and values array lengths not equal: " + length + " != " + length2);
        } else if (length != 0) {
            if (length != 1) {
                Map zza = zza(length, false);
                for (int i2 = 0; i2 < kArr.length; i2++) {
                    zza.put(kArr[i2], vArr[i2]);
                }
                return Collections.unmodifiableMap(zza);
            }
            return Collections.singletonMap(kArr[0], vArr[0]);
        } else {
            return Collections.emptyMap();
        }
    }

    @NonNull
    @KeepForSdk
    public static <T> Set<T> mutableSetOfWithSize(int i2) {
        return i2 == 0 ? new ArraySet() : zzb(i2, true);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(@NonNull T t2, @NonNull T t3, @NonNull T t4) {
        Set zzb = zzb(3, false);
        zzb.add(t2);
        zzb.add(t3);
        zzb.add(t4);
        return Collections.unmodifiableSet(zzb);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(@NonNull T... tArr) {
        int length = tArr.length;
        if (length != 0) {
            if (length != 1) {
                if (length == 2) {
                    T t2 = tArr[0];
                    T t3 = tArr[1];
                    Set zzb = zzb(2, false);
                    zzb.add(t2);
                    zzb.add(t3);
                    return Collections.unmodifiableSet(zzb);
                } else if (length != 3) {
                    if (length != 4) {
                        Set zzb2 = zzb(length, false);
                        Collections.addAll(zzb2, tArr);
                        return Collections.unmodifiableSet(zzb2);
                    }
                    T t4 = tArr[0];
                    T t5 = tArr[1];
                    T t6 = tArr[2];
                    T t7 = tArr[3];
                    Set zzb3 = zzb(4, false);
                    zzb3.add(t4);
                    zzb3.add(t5);
                    zzb3.add(t6);
                    zzb3.add(t7);
                    return Collections.unmodifiableSet(zzb3);
                } else {
                    return setOf(tArr[0], tArr[1], tArr[2]);
                }
            }
            return Collections.singleton(tArr[0]);
        }
        return Collections.emptySet();
    }

    private static Map zza(int i2, boolean z) {
        return i2 <= 256 ? new ArrayMap(i2) : new HashMap(i2, 1.0f);
    }

    private static Set zzb(int i2, boolean z) {
        return i2 <= (true != z ? 256 : 128) ? new ArraySet(i2) : new HashSet(i2, true != z ? 1.0f : 0.75f);
    }
}
