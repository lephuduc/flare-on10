package com.google.android.gms.internal.measurement;

import android.net.Uri;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzhy {
    public final Uri zza;
    public final String zzb;
    public final String zzc;
    public final boolean zzd;
    public final boolean zze;

    public zzhy(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    private zzhy(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, @Nullable zzig zzigVar) {
        this.zza = uri;
        this.zzb = "";
        this.zzc = "";
        this.zzd = z;
        this.zze = z3;
    }

    public final zzhy zza() {
        return new zzhy(null, this.zza, this.zzb, this.zzc, this.zzd, false, true, false, null);
    }

    public final zzhy zzb() {
        if (this.zzb.isEmpty()) {
            return new zzhy(null, this.zza, this.zzb, this.zzc, true, false, this.zze, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final zzib zzc(String str, double d2) {
        return new zzhw(this, "measurement.test.double_flag", Double.valueOf(-3.0d), true);
    }

    public final zzib zzd(String str, long j2) {
        return new zzhu(this, str, Long.valueOf(j2), true);
    }

    public final zzib zze(String str, String str2) {
        return new zzhx(this, str, str2, true);
    }

    public final zzib zzf(String str, boolean z) {
        return new zzhv(this, str, Boolean.valueOf(z), true);
    }
}
