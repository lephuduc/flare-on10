package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzpe;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes.dex */
public final class zzet extends zzgx {
    private char zza;
    private long zzb;
    @GuardedBy("this")
    private String zzc;
    private final zzer zzd;
    private final zzer zze;
    private final zzer zzf;
    private final zzer zzg;
    private final zzer zzh;
    private final zzer zzi;
    private final zzer zzj;
    private final zzer zzk;
    private final zzer zzl;

    public zzet(zzgd zzgdVar) {
        super(zzgdVar);
        this.zza = (char) 0;
        this.zzb = -1L;
        this.zzd = new zzer(this, 6, false, false);
        this.zze = new zzer(this, 6, true, false);
        this.zzf = new zzer(this, 6, false, true);
        this.zzg = new zzer(this, 5, false, false);
        this.zzh = new zzer(this, 5, true, false);
        this.zzi = new zzer(this, 5, false, true);
        this.zzj = new zzer(this, 4, false, false);
        this.zzk = new zzer(this, 3, false, false);
        this.zzl = new zzer(this, 2, false, false);
    }

    public static Object zzn(String str) {
        if (str == null) {
            return null;
        }
        return new zzes(str);
    }

    public static String zzo(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String zzp = zzp(z, obj);
        String zzp2 = zzp(z, obj2);
        String zzp3 = zzp(z, obj3);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(zzp)) {
            sb.append(str2);
            sb.append(zzp);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(zzp2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(zzp2);
        }
        if (!TextUtils.isEmpty(zzp3)) {
            sb.append(str3);
            sb.append(zzp3);
        }
        return sb.toString();
    }

    @VisibleForTesting
    public static String zzp(boolean z, Object obj) {
        String str;
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i2 = 0;
        if (obj instanceof Long) {
            if (z) {
                Long l2 = (Long) obj;
                if (Math.abs(l2.longValue()) < 100) {
                    return obj.toString();
                }
                char charAt = obj.toString().charAt(0);
                String valueOf = String.valueOf(Math.abs(l2.longValue()));
                long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
                long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
                StringBuilder sb = new StringBuilder();
                String str2 = charAt == '-' ? "-" : "";
                sb.append(str2);
                sb.append(round);
                sb.append("...");
                sb.append(str2);
                sb.append(round2);
                return sb.toString();
            }
            return obj.toString();
        } else if (obj instanceof Boolean) {
            return obj.toString();
        } else {
            if (!(obj instanceof Throwable)) {
                if (!(obj instanceof zzes)) {
                    return z ? "-" : obj.toString();
                }
                str = ((zzes) obj).zza;
                return str;
            }
            Throwable th = (Throwable) obj;
            StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
            String zzq = zzq(zzgd.class.getCanonicalName());
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i2];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && zzq(className).equals(zzq)) {
                    sb2.append(": ");
                    sb2.append(stackTraceElement);
                    break;
                }
                i2++;
            }
            return sb2.toString();
        }
    }

    @VisibleForTesting
    public static String zzq(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            zzpe.zzc();
            return ((Boolean) zzeg.zzay.zza(null)).booleanValue() ? "" : str;
        }
        return str.substring(0, lastIndexOf);
    }

    public final zzer zzc() {
        return this.zzk;
    }

    public final zzer zzd() {
        return this.zzd;
    }

    public final zzer zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.measurement.internal.zzgx
    public final boolean zzf() {
        return false;
    }

    public final zzer zzh() {
        return this.zze;
    }

    public final zzer zzi() {
        return this.zzj;
    }

    public final zzer zzj() {
        return this.zzl;
    }

    public final zzer zzk() {
        return this.zzg;
    }

    public final zzer zzl() {
        return this.zzi;
    }

    public final zzer zzm() {
        return this.zzh;
    }

    @EnsuresNonNull({"logTagDoNotUseDirectly"})
    @VisibleForTesting
    public final String zzr() {
        String str;
        synchronized (this) {
            if (this.zzc == null) {
                this.zzc = this.zzt.zzy() != null ? this.zzt.zzy() : this.zzt.zzf().zzn();
            }
            Preconditions.checkNotNull(this.zzc);
            str = this.zzc;
        }
        return str;
    }

    public final void zzu(int i2, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(zzr(), i2)) {
            Log.println(i2, zzr(), zzo(false, str, obj, obj2, obj3));
        }
        if (z2 || i2 < 5) {
            return;
        }
        Preconditions.checkNotNull(str);
        zzga zzo = this.zzt.zzo();
        if (zzo == null) {
            Log.println(6, zzr(), "Scheduler not set. Not logging error/warn");
        } else if (!zzo.zzy()) {
            Log.println(6, zzr(), "Scheduler not initialized. Not logging error/warn");
        } else {
            if (i2 >= 9) {
                i2 = 8;
            }
            zzo.zzp(new zzeq(this, i2, str, obj, obj2, obj3));
        }
    }
}
