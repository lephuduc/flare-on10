package com.google.android.gms.internal.measurement;

import java.util.Comparator;
import kotlin.UByte;

/* loaded from: classes.dex */
final class zzjs implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzka zzkaVar = (zzka) obj;
        zzka zzkaVar2 = (zzka) obj2;
        zzjr zzjrVar = new zzjr(zzkaVar);
        zzjr zzjrVar2 = new zzjr(zzkaVar2);
        while (zzjrVar.hasNext() && zzjrVar2.hasNext()) {
            int compareTo = Integer.valueOf(zzjrVar.zza() & UByte.MAX_VALUE).compareTo(Integer.valueOf(zzjrVar2.zza() & UByte.MAX_VALUE));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzkaVar.zzd()).compareTo(Integer.valueOf(zzkaVar2.zzd()));
    }
}
