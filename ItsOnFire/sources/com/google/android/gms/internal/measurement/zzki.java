package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import s.a;

/* loaded from: classes.dex */
public abstract class zzki extends zzjq {
    public static final /* synthetic */ int zzb = 0;
    private static final Logger zzc = Logger.getLogger(zzki.class.getName());
    private static final boolean zzd = zznu.zzx();
    public zzkj zza;

    private zzki() {
    }

    public /* synthetic */ zzki(zzkh zzkhVar) {
    }

    @Deprecated
    public static int zzt(int i2, zzmi zzmiVar, zzmt zzmtVar) {
        int zzbu = ((zzjk) zzmiVar).zzbu(zzmtVar);
        int zzx = zzx(i2 << 3);
        return zzx + zzx + zzbu;
    }

    public static int zzu(int i2) {
        if (i2 >= 0) {
            return zzx(i2);
        }
        return 10;
    }

    public static int zzv(zzmi zzmiVar, zzmt zzmtVar) {
        int zzbu = ((zzjk) zzmiVar).zzbu(zzmtVar);
        return zzx(zzbu) + zzbu;
    }

    public static int zzw(String str) {
        int length;
        try {
            length = zznz.zzc(str);
        } catch (zzny unused) {
            length = str.getBytes(zzlj.zzb).length;
        }
        return zzx(length) + length;
    }

    public static int zzx(int i2) {
        if ((i2 & (-128)) == 0) {
            return 1;
        }
        if ((i2 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i2) == 0) {
            return 3;
        }
        return (i2 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzy(long j2) {
        int i2;
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (j2 < 0) {
            return 10;
        }
        if (((-34359738368L) & j2) != 0) {
            i2 = 6;
            j2 >>>= 28;
        } else {
            i2 = 2;
        }
        if ((a.G & j2) != 0) {
            j2 >>>= 14;
            i2 += 2;
        }
        return (j2 & (-16384)) != 0 ? i2 + 1 : i2;
    }

    public static zzki zzz(byte[] bArr, int i2, int i3) {
        return new zzkf(bArr, 0, i3);
    }

    public final void zzA() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzB(String str, zzny zznyVar) throws IOException {
        zzc.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zznyVar);
        byte[] bytes = str.getBytes(zzlj.zzb);
        try {
            int length = bytes.length;
            zzq(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzkg(e2);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b2) throws IOException;

    public abstract void zzd(int i2, boolean z) throws IOException;

    public abstract void zze(int i2, zzka zzkaVar) throws IOException;

    public abstract void zzf(int i2, int i3) throws IOException;

    public abstract void zzg(int i2) throws IOException;

    public abstract void zzh(int i2, long j2) throws IOException;

    public abstract void zzi(long j2) throws IOException;

    public abstract void zzj(int i2, int i3) throws IOException;

    public abstract void zzk(int i2) throws IOException;

    public abstract void zzl(byte[] bArr, int i2, int i3) throws IOException;

    public abstract void zzm(int i2, String str) throws IOException;

    public abstract void zzo(int i2, int i3) throws IOException;

    public abstract void zzp(int i2, int i3) throws IOException;

    public abstract void zzq(int i2) throws IOException;

    public abstract void zzr(int i2, long j2) throws IOException;

    public abstract void zzs(long j2) throws IOException;
}
