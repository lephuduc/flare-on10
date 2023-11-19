package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public abstract class zzjb extends zziw implements Set {
    @CheckForNull
    private transient zzja zza;

    public static int zzf(int i2) {
        int max = Math.max(i2, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    @SafeVarargs
    public static zzjb zzi(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[15];
        objArr2[0] = "_in";
        objArr2[1] = "_xa";
        objArr2[2] = "_xu";
        objArr2[3] = "_aq";
        objArr2[4] = "_aa";
        objArr2[5] = "_ai";
        System.arraycopy(objArr, 0, objArr2, 6, 9);
        return zzk(15, objArr2);
    }

    private static zzjb zzk(int i2, Object... objArr) {
        if (i2 != 0) {
            if (i2 == 1) {
                Object obj = objArr[0];
                obj.getClass();
                return new zzjg(obj);
            }
            int zzf = zzf(i2);
            Object[] objArr2 = new Object[zzf];
            int i3 = zzf - 1;
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                Object obj2 = objArr[i6];
                zzjd.zza(obj2, i6);
                int hashCode = obj2.hashCode();
                int zza = zzit.zza(hashCode);
                while (true) {
                    int i7 = zza & i3;
                    Object obj3 = objArr2[i7];
                    if (obj3 == null) {
                        objArr[i5] = obj2;
                        objArr2[i7] = obj2;
                        i4 += hashCode;
                        i5++;
                        break;
                    } else if (!obj3.equals(obj2)) {
                        zza++;
                    }
                }
            }
            Arrays.fill(objArr, i5, i2, (Object) null);
            if (i5 == 1) {
                Object obj4 = objArr[0];
                obj4.getClass();
                return new zzjg(obj4);
            }
            if (zzf(i5) < zzf / 2) {
                return zzk(i5, objArr);
            }
            if (i5 < 10) {
                objArr = Arrays.copyOf(objArr, i5);
            }
            return new zzjf(objArr, i4, objArr2, i3, i5);
        }
        return zzjf.zza;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzjb) && zzj() && ((zzjb) obj).zzj() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i2 += next != null ? next.hashCode() : 0;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.measurement.zziw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract zzjh iterator();

    public final zzja zzg() {
        zzja zzjaVar = this.zza;
        if (zzjaVar == null) {
            zzja zzh = zzh();
            this.zza = zzh;
            return zzh;
        }
        return zzjaVar;
    }

    public zzja zzh() {
        Object[] array = toArray();
        int i2 = zzja.zzd;
        return zzja.zzg(array, array.length);
    }

    public boolean zzj() {
        return false;
    }
}
