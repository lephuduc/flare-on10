package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzkx;
import com.google.android.gms.internal.measurement.zzlb;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class zzlb<MessageType extends zzlb<MessageType, BuilderType>, BuilderType extends zzkx<MessageType, BuilderType>> extends zzjk<MessageType, BuilderType> {
    private static final Map zza = new ConcurrentHashMap();
    private int zzd = -1;
    public zznl zzc = zznl.zzc();

    private final int zza(zzmt zzmtVar) {
        if (zzmtVar == null) {
            return zzmq.zza().zzb(getClass()).zza(this);
        }
        return zzmtVar.zza(this);
    }

    public static zzlb zzbC(Class cls) {
        Map map = zza;
        zzlb zzlbVar = (zzlb) map.get(cls);
        if (zzlbVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzlbVar = (zzlb) map.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (zzlbVar == null) {
            zzlbVar = (zzlb) ((zzlb) zznu.zze(cls)).zzl(6, null, null);
            if (zzlbVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzlbVar);
        }
        return zzlbVar;
    }

    public static zzlg zzbE() {
        return zzlc.zzf();
    }

    public static zzlh zzbF() {
        return zzlx.zzf();
    }

    public static zzlh zzbG(zzlh zzlhVar) {
        int size = zzlhVar.size();
        return zzlhVar.zze(size == 0 ? 10 : size + size);
    }

    public static zzli zzbH() {
        return zzmr.zze();
    }

    public static zzli zzbI(zzli zzliVar) {
        int size = zzliVar.size();
        return zzliVar.zzd(size == 0 ? 10 : size + size);
    }

    public static Object zzbK(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static Object zzbL(zzmi zzmiVar, String str, Object[] objArr) {
        return new zzms(zzmiVar, str, objArr);
    }

    public static void zzbO(Class cls, zzlb zzlbVar) {
        zzlbVar.zzbN();
        zza.put(cls, zzlbVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzmq.zza().zzb(getClass()).zzj(this, (zzlb) obj);
        }
        return false;
    }

    public final int hashCode() {
        if (zzbR()) {
            return zzby();
        }
        int i2 = this.zzb;
        if (i2 == 0) {
            int zzby = zzby();
            this.zzb = zzby;
            return zzby;
        }
        return i2;
    }

    public final String toString() {
        return zzmk.zza(this, super.toString());
    }

    public final zzkx zzbA() {
        return (zzkx) zzl(5, null, null);
    }

    public final zzkx zzbB() {
        zzkx zzkxVar = (zzkx) zzl(5, null, null);
        zzkxVar.zzaB(this);
        return zzkxVar;
    }

    public final zzlb zzbD() {
        return (zzlb) zzl(4, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final /* synthetic */ zzmh zzbJ() {
        return (zzkx) zzl(5, null, null);
    }

    public final void zzbM() {
        zzmq.zza().zzb(getClass()).zzf(this);
        zzbN();
    }

    public final void zzbN() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void zzbP(int i2) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final void zzbQ(zzki zzkiVar) throws IOException {
        zzmq.zza().zzb(getClass()).zzi(this, zzkj.zza(zzkiVar));
    }

    public final boolean zzbR() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    public final /* synthetic */ zzmi zzbV() {
        return (zzlb) zzl(6, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzjk
    public final int zzbu(zzmt zzmtVar) {
        if (zzbR()) {
            int zza2 = zza(zzmtVar);
            if (zza2 >= 0) {
                return zza2;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zza2);
        }
        int i2 = this.zzd & Integer.MAX_VALUE;
        if (i2 != Integer.MAX_VALUE) {
            return i2;
        }
        int zza3 = zza(zzmtVar);
        if (zza3 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | zza3;
            return zza3;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + zza3);
    }

    public final int zzby() {
        return zzmq.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final int zzbz() {
        if (zzbR()) {
            int zza2 = zza(null);
            if (zza2 >= 0) {
                return zza2;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zza2);
        }
        int i2 = this.zzd & Integer.MAX_VALUE;
        if (i2 == Integer.MAX_VALUE) {
            i2 = zza(null);
            if (i2 < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i2);
            }
            this.zzd = (this.zzd & Integer.MIN_VALUE) | i2;
        }
        return i2;
    }

    public abstract Object zzl(int i2, Object obj, Object obj2);
}
