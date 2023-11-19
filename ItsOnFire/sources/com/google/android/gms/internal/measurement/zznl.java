package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zznl {
    private static final zznl zza = new zznl(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zznl() {
        this(0, new int[8], new Object[8], true);
    }

    private zznl(int i2, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i2;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zznl zzc() {
        return zza;
    }

    public static zznl zze(zznl zznlVar, zznl zznlVar2) {
        int i2 = zznlVar.zzb + zznlVar2.zzb;
        int[] copyOf = Arrays.copyOf(zznlVar.zzc, i2);
        System.arraycopy(zznlVar2.zzc, 0, copyOf, zznlVar.zzb, zznlVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zznlVar.zzd, i2);
        System.arraycopy(zznlVar2.zzd, 0, copyOf2, zznlVar.zzb, zznlVar2.zzb);
        return new zznl(i2, copyOf, copyOf2, true);
    }

    public static zznl zzf() {
        return new zznl(0, new int[8], new Object[8], true);
    }

    private final void zzl(int i2) {
        int[] iArr = this.zzc;
        if (i2 > iArr.length) {
            int i3 = this.zzb;
            int i4 = i3 + (i3 / 2);
            if (i4 >= i2) {
                i2 = i4;
            }
            if (i2 < 8) {
                i2 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i2);
            this.zzd = Arrays.copyOf(this.zzd, i2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof zznl)) {
            zznl zznlVar = (zznl) obj;
            int i2 = this.zzb;
            if (i2 == zznlVar.zzb) {
                int[] iArr = this.zzc;
                int[] iArr2 = zznlVar.zzc;
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        Object[] objArr = this.zzd;
                        Object[] objArr2 = zznlVar.zzd;
                        int i4 = this.zzb;
                        for (int i5 = 0; i5 < i4; i5++) {
                            if (objArr[i5].equals(objArr2[i5])) {
                            }
                        }
                        return true;
                    } else if (iArr[i3] != iArr2[i3]) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zzb;
        int i3 = i2 + 527;
        int[] iArr = this.zzc;
        int i4 = 17;
        int i5 = 17;
        for (int i6 = 0; i6 < i2; i6++) {
            i5 = (i5 * 31) + iArr[i6];
        }
        int i7 = (i3 * 31) + i5;
        Object[] objArr = this.zzd;
        int i8 = this.zzb;
        for (int i9 = 0; i9 < i8; i9++) {
            i4 = (i4 * 31) + objArr[i9].hashCode();
        }
        return (i7 * 31) + i4;
    }

    public final int zza() {
        int zzy;
        int zzx;
        int i2;
        int i3 = this.zze;
        if (i3 == -1) {
            int i4 = 0;
            for (int i5 = 0; i5 < this.zzb; i5++) {
                int i6 = this.zzc[i5];
                int i7 = i6 >>> 3;
                int i8 = i6 & 7;
                if (i8 != 0) {
                    if (i8 == 1) {
                        ((Long) this.zzd[i5]).longValue();
                        i2 = zzki.zzx(i7 << 3) + 8;
                    } else if (i8 == 2) {
                        int i9 = zzki.zzb;
                        int zzd = ((zzka) this.zzd[i5]).zzd();
                        i2 = zzki.zzx(i7 << 3) + zzki.zzx(zzd) + zzd;
                    } else if (i8 == 3) {
                        int i10 = i7 << 3;
                        int i11 = zzki.zzb;
                        zzy = ((zznl) this.zzd[i5]).zza();
                        int zzx2 = zzki.zzx(i10);
                        zzx = zzx2 + zzx2;
                    } else if (i8 != 5) {
                        throw new IllegalStateException(zzll.zza());
                    } else {
                        ((Integer) this.zzd[i5]).intValue();
                        i2 = zzki.zzx(i7 << 3) + 4;
                    }
                    i4 += i2;
                } else {
                    int i12 = i7 << 3;
                    zzy = zzki.zzy(((Long) this.zzd[i5]).longValue());
                    zzx = zzki.zzx(i12);
                }
                i2 = zzx + zzy;
                i4 += i2;
            }
            this.zze = i4;
            return i4;
        }
        return i3;
    }

    public final int zzb() {
        int i2 = this.zze;
        if (i2 == -1) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.zzb; i4++) {
                int i5 = zzki.zzb;
                int zzd = ((zzka) this.zzd[i4]).zzd();
                int zzx = zzki.zzx(zzd) + zzd;
                int zzx2 = zzki.zzx(16);
                int zzx3 = zzki.zzx(this.zzc[i4] >>> 3);
                int zzx4 = zzki.zzx(8);
                i3 += zzx4 + zzx4 + zzx2 + zzx3 + zzki.zzx(24) + zzx;
            }
            this.zze = i3;
            return i3;
        }
        return i2;
    }

    public final zznl zzd(zznl zznlVar) {
        if (zznlVar.equals(zza)) {
            return this;
        }
        zzg();
        int i2 = this.zzb + zznlVar.zzb;
        zzl(i2);
        System.arraycopy(zznlVar.zzc, 0, this.zzc, this.zzb, zznlVar.zzb);
        System.arraycopy(zznlVar.zzd, 0, this.zzd, this.zzb, zznlVar.zzb);
        this.zzb = i2;
        return this;
    }

    public final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < this.zzb; i3++) {
            zzmk.zzb(sb, i2, String.valueOf(this.zzc[i3] >>> 3), this.zzd[i3]);
        }
    }

    public final void zzj(int i2, Object obj) {
        zzg();
        zzl(this.zzb + 1);
        int[] iArr = this.zzc;
        int i3 = this.zzb;
        iArr[i3] = i2;
        this.zzd[i3] = obj;
        this.zzb = i3 + 1;
    }

    public final void zzk(zzoc zzocVar) throws IOException {
        if (this.zzb != 0) {
            for (int i2 = 0; i2 < this.zzb; i2++) {
                int i3 = this.zzc[i2];
                Object obj = this.zzd[i2];
                int i4 = i3 & 7;
                int i5 = i3 >>> 3;
                if (i4 == 0) {
                    zzocVar.zzt(i5, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    zzocVar.zzm(i5, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    zzocVar.zzd(i5, (zzka) obj);
                } else if (i4 == 3) {
                    zzocVar.zzE(i5);
                    ((zznl) obj).zzk(zzocVar);
                    zzocVar.zzh(i5);
                } else if (i4 != 5) {
                    throw new RuntimeException(zzll.zza());
                } else {
                    zzocVar.zzk(i5, ((Integer) obj).intValue());
                }
            }
        }
    }
}
