package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zzjx extends zzjw {
    public final byte[] zza;

    public zzjx(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzka) && zzd() == ((zzka) obj).zzd()) {
            if (zzd() == 0) {
                return true;
            }
            if (obj instanceof zzjx) {
                zzjx zzjxVar = (zzjx) obj;
                int zzk = zzk();
                int zzk2 = zzjxVar.zzk();
                if (zzk == 0 || zzk2 == 0 || zzk == zzk2) {
                    int zzd = zzd();
                    if (zzd > zzjxVar.zzd()) {
                        throw new IllegalArgumentException("Length too large: " + zzd + zzd());
                    } else if (zzd > zzjxVar.zzd()) {
                        throw new IllegalArgumentException("Ran off end of other: 0, " + zzd + ", " + zzjxVar.zzd());
                    } else {
                        byte[] bArr = this.zza;
                        byte[] bArr2 = zzjxVar.zza;
                        zzjxVar.zzc();
                        int i2 = 0;
                        int i3 = 0;
                        while (i2 < zzd) {
                            if (bArr[i2] != bArr2[i3]) {
                                return false;
                            }
                            i2++;
                            i3++;
                        }
                        return true;
                    }
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public byte zza(int i2) {
        return this.zza[i2];
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public byte zzb(int i2) {
        return this.zza[i2];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final int zze(int i2, int i3, int i4) {
        return zzlj.zzb(i2, this.zza, 0, i4);
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final zzka zzf(int i2, int i3) {
        int zzj = zzka.zzj(0, i3, zzd());
        return zzj == 0 ? zzka.zzb : new zzju(this.zza, 0, zzj);
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final void zzh(zzjq zzjqVar) throws IOException {
        ((zzkf) zzjqVar).zzc(this.zza, 0, zzd());
    }

    @Override // com.google.android.gms.internal.measurement.zzka
    public final boolean zzi() {
        return zznz.zze(this.zza, 0, zzd());
    }
}
