package com.google.android.gms.internal.measurement;

import java.io.IOException;
import s.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzkf extends zzki {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    public zzkf(byte[] bArr, int i2, int i3) {
        super(null);
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int length = bArr.length;
        if (((length - i3) | i3) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i3)));
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i3;
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final int zza() {
        return this.zzd - this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzb(byte b2) throws IOException {
        try {
            byte[] bArr = this.zzc;
            int i2 = this.zze;
            this.zze = i2 + 1;
            bArr[i2] = b2;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e2);
        }
    }

    public final void zzc(byte[] bArr, int i2, int i3) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.zzc, this.zze, i3);
            this.zze += i3;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), Integer.valueOf(i3)), e2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzd(int i2, boolean z) throws IOException {
        zzq(i2 << 3);
        zzb(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zze(int i2, zzka zzkaVar) throws IOException {
        zzq((i2 << 3) | 2);
        zzq(zzkaVar.zzd());
        zzkaVar.zzh(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzf(int i2, int i3) throws IOException {
        zzq((i2 << 3) | 5);
        zzg(i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzg(int i2) throws IOException {
        try {
            byte[] bArr = this.zzc;
            int i3 = this.zze;
            int i4 = i3 + 1;
            bArr[i3] = (byte) (i2 & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i2 >> 8) & 255);
            int i6 = i5 + 1;
            bArr[i5] = (byte) ((i2 >> 16) & 255);
            this.zze = i6 + 1;
            bArr[i6] = (byte) ((i2 >> 24) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzh(int i2, long j2) throws IOException {
        zzq((i2 << 3) | 1);
        zzi(j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzi(long j2) throws IOException {
        try {
            byte[] bArr = this.zzc;
            int i2 = this.zze;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (((int) j2) & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) (((int) (j2 >> 8)) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) (((int) (j2 >> 16)) & 255);
            int i6 = i5 + 1;
            bArr[i5] = (byte) (((int) (j2 >> 24)) & 255);
            int i7 = i6 + 1;
            bArr[i6] = (byte) (((int) (j2 >> 32)) & 255);
            int i8 = i7 + 1;
            bArr[i7] = (byte) (((int) (j2 >> 40)) & 255);
            int i9 = i8 + 1;
            bArr[i8] = (byte) (((int) (j2 >> 48)) & 255);
            this.zze = i9 + 1;
            bArr[i9] = (byte) (((int) (j2 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzj(int i2, int i3) throws IOException {
        zzq(i2 << 3);
        zzk(i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzk(int i2) throws IOException {
        if (i2 >= 0) {
            zzq(i2);
        } else {
            zzs(i2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzl(byte[] bArr, int i2, int i3) throws IOException {
        zzc(bArr, 0, i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzm(int i2, String str) throws IOException {
        zzq((i2 << 3) | 2);
        zzn(str);
    }

    public final void zzn(String str) throws IOException {
        int i2 = this.zze;
        try {
            int zzx = zzki.zzx(str.length() * 3);
            int zzx2 = zzki.zzx(str.length());
            if (zzx2 != zzx) {
                zzq(zznz.zzc(str));
                byte[] bArr = this.zzc;
                int i3 = this.zze;
                this.zze = zznz.zzb(str, bArr, i3, this.zzd - i3);
                return;
            }
            int i4 = i2 + zzx2;
            this.zze = i4;
            int zzb = zznz.zzb(str, this.zzc, i4, this.zzd - i4);
            this.zze = i2;
            zzq((zzb - i2) - zzx2);
            this.zze = zzb;
        } catch (zzny e2) {
            this.zze = i2;
            zzB(str, e2);
        } catch (IndexOutOfBoundsException e3) {
            throw new zzkg(e3);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzo(int i2, int i3) throws IOException {
        zzq((i2 << 3) | i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzp(int i2, int i3) throws IOException {
        zzq(i2 << 3);
        zzq(i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzq(int i2) throws IOException {
        while ((i2 & (-128)) != 0) {
            try {
                byte[] bArr = this.zzc;
                int i3 = this.zze;
                this.zze = i3 + 1;
                bArr[i3] = (byte) ((i2 & r.f2159c) | 128);
                i2 >>>= 7;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e2);
            }
        }
        byte[] bArr2 = this.zzc;
        int i4 = this.zze;
        this.zze = i4 + 1;
        bArr2[i4] = (byte) i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzr(int i2, long j2) throws IOException {
        zzq(i2 << 3);
        zzs(j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzs(long j2) throws IOException {
        boolean z;
        z = zzki.zzd;
        if (z && this.zzd - this.zze >= 10) {
            while ((j2 & (-128)) != 0) {
                byte[] bArr = this.zzc;
                int i2 = this.zze;
                this.zze = i2 + 1;
                zznu.zzn(bArr, i2, (byte) ((((int) j2) & r.f2159c) | 128));
                j2 >>>= 7;
            }
            byte[] bArr2 = this.zzc;
            int i3 = this.zze;
            this.zze = i3 + 1;
            zznu.zzn(bArr2, i3, (byte) j2);
            return;
        }
        while ((j2 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.zzc;
                int i4 = this.zze;
                this.zze = i4 + 1;
                bArr3[i4] = (byte) ((((int) j2) & r.f2159c) | 128);
                j2 >>>= 7;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e2);
            }
        }
        byte[] bArr4 = this.zzc;
        int i5 = this.zze;
        this.zze = i5 + 1;
        bArr4[i5] = (byte) j2;
    }
}
