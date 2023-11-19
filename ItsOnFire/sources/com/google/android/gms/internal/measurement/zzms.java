package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzms implements zzmf {
    private final zzmi zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzms(zzmi zzmiVar, String str, Object[] objArr) {
        this.zza = zzmiVar;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        int i2 = charAt & 8191;
        int i3 = 1;
        int i4 = 13;
        while (true) {
            int i5 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.zzd = i2 | (charAt2 << i4);
                return;
            }
            i2 |= (charAt2 & 8191) << i4;
            i4 += 13;
            i3 = i5;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    public final zzmi zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    public final int zzc() {
        return (this.zzd & 1) == 1 ? 1 : 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}
