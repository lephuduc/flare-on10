package com.google.android.gms.internal.measurement;

import java.io.IOException;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import s.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzjo {
    public static int zza(byte[] bArr, int i2, zzjn zzjnVar) throws zzll {
        int zzj = zzj(bArr, i2, zzjnVar);
        int i3 = zzjnVar.zza;
        if (i3 >= 0) {
            if (i3 <= bArr.length - zzj) {
                if (i3 == 0) {
                    zzjnVar.zzc = zzka.zzb;
                    return zzj;
                }
                zzjnVar.zzc = zzka.zzl(bArr, zzj, i3);
                return zzj + i3;
            }
            throw zzll.zzf();
        }
        throw zzll.zzd();
    }

    public static int zzb(byte[] bArr, int i2) {
        int i3 = bArr[i2] & UByte.MAX_VALUE;
        int i4 = bArr[i2 + 1] & UByte.MAX_VALUE;
        int i5 = bArr[i2 + 2] & UByte.MAX_VALUE;
        return ((bArr[i2 + 3] & UByte.MAX_VALUE) << 24) | (i4 << 8) | i3 | (i5 << 16);
    }

    public static int zzc(zzmt zzmtVar, byte[] bArr, int i2, int i3, int i4, zzjn zzjnVar) throws IOException {
        Object zze = zzmtVar.zze();
        int zzn = zzn(zze, zzmtVar, bArr, i2, i3, i4, zzjnVar);
        zzmtVar.zzf(zze);
        zzjnVar.zzc = zze;
        return zzn;
    }

    public static int zzd(zzmt zzmtVar, byte[] bArr, int i2, int i3, zzjn zzjnVar) throws IOException {
        Object zze = zzmtVar.zze();
        int zzo = zzo(zze, zzmtVar, bArr, i2, i3, zzjnVar);
        zzmtVar.zzf(zze);
        zzjnVar.zzc = zze;
        return zzo;
    }

    public static int zze(zzmt zzmtVar, int i2, byte[] bArr, int i3, int i4, zzli zzliVar, zzjn zzjnVar) throws IOException {
        int zzd = zzd(zzmtVar, bArr, i3, i4, zzjnVar);
        while (true) {
            zzliVar.add(zzjnVar.zzc);
            if (zzd >= i4) {
                break;
            }
            int zzj = zzj(bArr, zzd, zzjnVar);
            if (i2 != zzjnVar.zza) {
                break;
            }
            zzd = zzd(zzmtVar, bArr, zzj, i4, zzjnVar);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i2, zzli zzliVar, zzjn zzjnVar) throws IOException {
        zzlc zzlcVar = (zzlc) zzliVar;
        int zzj = zzj(bArr, i2, zzjnVar);
        int i3 = zzjnVar.zza + zzj;
        while (zzj < i3) {
            zzj = zzj(bArr, zzj, zzjnVar);
            zzlcVar.zzh(zzjnVar.zza);
        }
        if (zzj == i3) {
            return zzj;
        }
        throw zzll.zzf();
    }

    public static int zzg(byte[] bArr, int i2, zzjn zzjnVar) throws zzll {
        int zzj = zzj(bArr, i2, zzjnVar);
        int i3 = zzjnVar.zza;
        if (i3 >= 0) {
            if (i3 == 0) {
                zzjnVar.zzc = "";
                return zzj;
            }
            zzjnVar.zzc = new String(bArr, zzj, i3, zzlj.zzb);
            return zzj + i3;
        }
        throw zzll.zzd();
    }

    public static int zzh(byte[] bArr, int i2, zzjn zzjnVar) throws zzll {
        int zzj = zzj(bArr, i2, zzjnVar);
        int i3 = zzjnVar.zza;
        if (i3 >= 0) {
            if (i3 == 0) {
                zzjnVar.zzc = "";
                return zzj;
            }
            int i4 = zznz.zza;
            int length = bArr.length;
            if ((((length - zzj) - i3) | zzj | i3) >= 0) {
                int i5 = zzj + i3;
                char[] cArr = new char[i3];
                int i6 = 0;
                while (zzj < i5) {
                    byte b2 = bArr[zzj];
                    if (!zznv.zzd(b2)) {
                        break;
                    }
                    zzj++;
                    cArr[i6] = (char) b2;
                    i6++;
                }
                while (zzj < i5) {
                    int i7 = zzj + 1;
                    byte b3 = bArr[zzj];
                    if (zznv.zzd(b3)) {
                        int i8 = i6 + 1;
                        cArr[i6] = (char) b3;
                        zzj = i7;
                        while (true) {
                            i6 = i8;
                            if (zzj < i5) {
                                byte b4 = bArr[zzj];
                                if (zznv.zzd(b4)) {
                                    zzj++;
                                    i8 = i6 + 1;
                                    cArr[i6] = (char) b4;
                                }
                            }
                        }
                    } else if (b3 < -32) {
                        if (i7 >= i5) {
                            throw zzll.zzc();
                        }
                        zznv.zzc(b3, bArr[i7], cArr, i6);
                        zzj = i7 + 1;
                        i6++;
                    } else if (b3 < -16) {
                        if (i7 >= i5 - 1) {
                            throw zzll.zzc();
                        }
                        int i9 = i7 + 1;
                        zznv.zzb(b3, bArr[i7], bArr[i9], cArr, i6);
                        zzj = i9 + 1;
                        i6++;
                    } else if (i7 >= i5 - 2) {
                        throw zzll.zzc();
                    } else {
                        int i10 = i7 + 1;
                        byte b5 = bArr[i7];
                        int i11 = i10 + 1;
                        zznv.zza(b3, b5, bArr[i10], bArr[i11], cArr, i6);
                        i6 += 2;
                        zzj = i11 + 1;
                    }
                }
                zzjnVar.zzc = new String(cArr, 0, i6);
                return i5;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(zzj), Integer.valueOf(i3)));
        }
        throw zzll.zzd();
    }

    public static int zzi(int i2, byte[] bArr, int i3, int i4, zznl zznlVar, zzjn zzjnVar) throws zzll {
        if ((i2 >>> 3) != 0) {
            int i5 = i2 & 7;
            if (i5 == 0) {
                int zzm = zzm(bArr, i3, zzjnVar);
                zznlVar.zzj(i2, Long.valueOf(zzjnVar.zzb));
                return zzm;
            } else if (i5 == 1) {
                zznlVar.zzj(i2, Long.valueOf(zzp(bArr, i3)));
                return i3 + 8;
            } else if (i5 == 2) {
                int zzj = zzj(bArr, i3, zzjnVar);
                int i6 = zzjnVar.zza;
                if (i6 >= 0) {
                    if (i6 <= bArr.length - zzj) {
                        zznlVar.zzj(i2, i6 == 0 ? zzka.zzb : zzka.zzl(bArr, zzj, i6));
                        return zzj + i6;
                    }
                    throw zzll.zzf();
                }
                throw zzll.zzd();
            } else if (i5 != 3) {
                if (i5 == 5) {
                    zznlVar.zzj(i2, Integer.valueOf(zzb(bArr, i3)));
                    return i3 + 4;
                }
                throw zzll.zzb();
            } else {
                int i7 = (i2 & (-8)) | 4;
                zznl zzf = zznl.zzf();
                int i8 = 0;
                while (true) {
                    if (i3 >= i4) {
                        break;
                    }
                    int zzj2 = zzj(bArr, i3, zzjnVar);
                    int i9 = zzjnVar.zza;
                    i8 = i9;
                    if (i9 == i7) {
                        i3 = zzj2;
                        break;
                    }
                    int zzi = zzi(i8, bArr, zzj2, i4, zzf, zzjnVar);
                    i8 = i9;
                    i3 = zzi;
                }
                if (i3 > i4 || i8 != i7) {
                    throw zzll.zze();
                }
                zznlVar.zzj(i2, zzf);
                return i3;
            }
        }
        throw zzll.zzb();
    }

    public static int zzj(byte[] bArr, int i2, zzjn zzjnVar) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 >= 0) {
            zzjnVar.zza = b2;
            return i3;
        }
        return zzk(b2, bArr, i3, zzjnVar);
    }

    public static int zzk(int i2, byte[] bArr, int i3, zzjn zzjnVar) {
        int i4;
        int i5;
        byte b2 = bArr[i3];
        int i6 = i3 + 1;
        int i7 = i2 & r.f2159c;
        if (b2 < 0) {
            int i8 = i7 | ((b2 & ByteCompanionObject.MAX_VALUE) << 7);
            int i9 = i6 + 1;
            byte b3 = bArr[i6];
            if (b3 >= 0) {
                i4 = b3 << 14;
            } else {
                i7 = i8 | ((b3 & ByteCompanionObject.MAX_VALUE) << 14);
                i6 = i9 + 1;
                byte b4 = bArr[i9];
                if (b4 >= 0) {
                    i5 = b4 << 21;
                } else {
                    i8 = i7 | ((b4 & ByteCompanionObject.MAX_VALUE) << 21);
                    i9 = i6 + 1;
                    byte b5 = bArr[i6];
                    if (b5 >= 0) {
                        i4 = b5 << 28;
                    } else {
                        int i10 = i8 | ((b5 & ByteCompanionObject.MAX_VALUE) << 28);
                        while (true) {
                            int i11 = i9 + 1;
                            if (bArr[i9] >= 0) {
                                zzjnVar.zza = i10;
                                return i11;
                            }
                            i9 = i11;
                        }
                    }
                }
            }
            zzjnVar.zza = i8 | i4;
            return i9;
        }
        i5 = b2 << 7;
        zzjnVar.zza = i7 | i5;
        return i6;
    }

    public static int zzl(int i2, byte[] bArr, int i3, int i4, zzli zzliVar, zzjn zzjnVar) {
        zzlc zzlcVar = (zzlc) zzliVar;
        int zzj = zzj(bArr, i3, zzjnVar);
        while (true) {
            zzlcVar.zzh(zzjnVar.zza);
            if (zzj >= i4) {
                break;
            }
            int zzj2 = zzj(bArr, zzj, zzjnVar);
            if (i2 != zzjnVar.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzjnVar);
        }
        return zzj;
    }

    public static int zzm(byte[] bArr, int i2, zzjn zzjnVar) {
        long j2 = bArr[i2];
        int i3 = i2 + 1;
        if (j2 >= 0) {
            zzjnVar.zzb = j2;
            return i3;
        }
        int i4 = i3 + 1;
        byte b2 = bArr[i3];
        long j3 = (j2 & 127) | ((b2 & ByteCompanionObject.MAX_VALUE) << 7);
        int i5 = 7;
        while (b2 < 0) {
            int i6 = i4 + 1;
            byte b3 = bArr[i4];
            i5 += 7;
            j3 |= (b3 & ByteCompanionObject.MAX_VALUE) << i5;
            i4 = i6;
            b2 = b3;
        }
        zzjnVar.zzb = j3;
        return i4;
    }

    public static int zzn(Object obj, zzmt zzmtVar, byte[] bArr, int i2, int i3, int i4, zzjn zzjnVar) throws IOException {
        int zzc = ((zzml) zzmtVar).zzc(obj, bArr, i2, i3, i4, zzjnVar);
        zzjnVar.zzc = obj;
        return zzc;
    }

    public static int zzo(Object obj, zzmt zzmtVar, byte[] bArr, int i2, int i3, zzjn zzjnVar) throws IOException {
        int i4 = i2 + 1;
        int i5 = bArr[i2];
        if (i5 < 0) {
            i4 = zzk(i5, bArr, i4, zzjnVar);
            i5 = zzjnVar.zza;
        }
        int i6 = i4;
        if (i5 < 0 || i5 > i3 - i6) {
            throw zzll.zzf();
        }
        int i7 = i5 + i6;
        zzmtVar.zzh(obj, bArr, i6, i7, zzjnVar);
        zzjnVar.zzc = obj;
        return i7;
    }

    public static long zzp(byte[] bArr, int i2) {
        return (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48) | ((bArr[i2 + 7] & 255) << 56);
    }
}
