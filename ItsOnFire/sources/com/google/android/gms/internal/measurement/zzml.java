package com.google.android.gms.internal.measurement;

import androidx.appcompat.R;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzml<T> implements zzmt<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zznu.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzmi zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzlw zzm;
    private final zznk zzn;
    private final zzko zzo;
    private final zzmn zzp;
    private final zzmd zzq;

    private zzml(int[] iArr, Object[] objArr, int i2, int i3, zzmi zzmiVar, boolean z, boolean z2, int[] iArr2, int i4, int i5, zzmn zzmnVar, zzlw zzlwVar, zznk zznkVar, zzko zzkoVar, zzmd zzmdVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i2;
        this.zzf = i3;
        this.zzi = z;
        boolean z3 = false;
        if (zzkoVar != null && zzkoVar.zzc(zzmiVar)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzj = iArr2;
        this.zzk = i4;
        this.zzl = i5;
        this.zzp = zzmnVar;
        this.zzm = zzlwVar;
        this.zzn = zznkVar;
        this.zzo = zzkoVar;
        this.zzg = zzmiVar;
        this.zzq = zzmdVar;
    }

    private final zzlf zzA(int i2) {
        int i3 = i2 / 3;
        return (zzlf) this.zzd[i3 + i3 + 1];
    }

    private final zzmt zzB(int i2) {
        int i3 = i2 / 3;
        int i4 = i3 + i3;
        zzmt zzmtVar = (zzmt) this.zzd[i4];
        if (zzmtVar != null) {
            return zzmtVar;
        }
        zzmt zzb2 = zzmq.zza().zzb((Class) this.zzd[i4 + 1]);
        this.zzd[i4] = zzb2;
        return zzb2;
    }

    private final Object zzC(int i2) {
        int i3 = i2 / 3;
        return this.zzd[i3 + i3];
    }

    private final Object zzD(Object obj, int i2) {
        zzmt zzB = zzB(i2);
        int zzy = zzy(i2) & 1048575;
        if (zzP(obj, i2)) {
            Object object = zzb.getObject(obj, zzy);
            if (zzS(object)) {
                return object;
            }
            Object zze = zzB.zze();
            if (object != null) {
                zzB.zzg(zze, object);
            }
            return zze;
        }
        return zzB.zze();
    }

    private final Object zzE(Object obj, int i2, int i3) {
        zzmt zzB = zzB(i3);
        if (zzT(obj, i2, i3)) {
            Object object = zzb.getObject(obj, zzy(i3) & 1048575);
            if (zzS(object)) {
                return object;
            }
            Object zze = zzB.zze();
            if (object != null) {
                zzB.zzg(zze, object);
            }
            return zze;
        }
        return zzB.zze();
    }

    private static Field zzF(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static void zzG(Object obj) {
        if (!zzS(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzH(Object obj, Object obj2, int i2) {
        if (zzP(obj2, i2)) {
            Unsafe unsafe = zzb;
            long zzy = zzy(i2) & 1048575;
            Object object = unsafe.getObject(obj2, zzy);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i2] + " is present but null: " + obj2.toString());
            }
            zzmt zzB = zzB(i2);
            if (!zzP(obj, i2)) {
                if (zzS(object)) {
                    Object zze = zzB.zze();
                    zzB.zzg(zze, object);
                    unsafe.putObject(obj, zzy, zze);
                } else {
                    unsafe.putObject(obj, zzy, object);
                }
                zzJ(obj, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, zzy);
            if (!zzS(object2)) {
                Object zze2 = zzB.zze();
                zzB.zzg(zze2, object2);
                unsafe.putObject(obj, zzy, zze2);
                object2 = zze2;
            }
            zzB.zzg(object2, object);
        }
    }

    private final void zzI(Object obj, Object obj2, int i2) {
        int i3 = this.zzc[i2];
        if (zzT(obj2, i3, i2)) {
            Unsafe unsafe = zzb;
            long zzy = zzy(i2) & 1048575;
            Object object = unsafe.getObject(obj2, zzy);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i2] + " is present but null: " + obj2.toString());
            }
            zzmt zzB = zzB(i2);
            if (!zzT(obj, i3, i2)) {
                if (zzS(object)) {
                    Object zze = zzB.zze();
                    zzB.zzg(zze, object);
                    unsafe.putObject(obj, zzy, zze);
                } else {
                    unsafe.putObject(obj, zzy, object);
                }
                zzK(obj, i3, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, zzy);
            if (!zzS(object2)) {
                Object zze2 = zzB.zze();
                zzB.zzg(zze2, object2);
                unsafe.putObject(obj, zzy, zze2);
                object2 = zze2;
            }
            zzB.zzg(object2, object);
        }
    }

    private final void zzJ(Object obj, int i2) {
        int zzv = zzv(i2);
        long j2 = 1048575 & zzv;
        if (j2 == 1048575) {
            return;
        }
        zznu.zzq(obj, j2, (1 << (zzv >>> 20)) | zznu.zzc(obj, j2));
    }

    private final void zzK(Object obj, int i2, int i3) {
        zznu.zzq(obj, zzv(i3) & 1048575, i2);
    }

    private final void zzL(Object obj, int i2, Object obj2) {
        zzb.putObject(obj, zzy(i2) & 1048575, obj2);
        zzJ(obj, i2);
    }

    private final void zzM(Object obj, int i2, int i3, Object obj2) {
        zzb.putObject(obj, zzy(i3) & 1048575, obj2);
        zzK(obj, i2, i3);
    }

    private final void zzN(zzoc zzocVar, int i2, Object obj, int i3) throws IOException {
        if (obj == null) {
            return;
        }
        zzmb zzmbVar = (zzmb) zzC(i3);
        throw null;
    }

    private final boolean zzO(Object obj, Object obj2, int i2) {
        return zzP(obj, i2) == zzP(obj2, i2);
    }

    private final boolean zzP(Object obj, int i2) {
        int zzv = zzv(i2);
        long j2 = zzv & 1048575;
        if (j2 != 1048575) {
            return ((1 << (zzv >>> 20)) & zznu.zzc(obj, j2)) != 0;
        }
        int zzy = zzy(i2);
        long j3 = zzy & 1048575;
        switch (zzx(zzy)) {
            case 0:
                return Double.doubleToRawLongBits(zznu.zza(obj, j3)) != 0;
            case 1:
                return Float.floatToRawIntBits(zznu.zzb(obj, j3)) != 0;
            case 2:
                return zznu.zzd(obj, j3) != 0;
            case 3:
                return zznu.zzd(obj, j3) != 0;
            case 4:
                return zznu.zzc(obj, j3) != 0;
            case 5:
                return zznu.zzd(obj, j3) != 0;
            case 6:
                return zznu.zzc(obj, j3) != 0;
            case 7:
                return zznu.zzw(obj, j3);
            case 8:
                Object zzf = zznu.zzf(obj, j3);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                } else if (zzf instanceof zzka) {
                    return !zzka.zzb.equals(zzf);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return zznu.zzf(obj, j3) != null;
            case 10:
                return !zzka.zzb.equals(zznu.zzf(obj, j3));
            case 11:
                return zznu.zzc(obj, j3) != 0;
            case 12:
                return zznu.zzc(obj, j3) != 0;
            case 13:
                return zznu.zzc(obj, j3) != 0;
            case 14:
                return zznu.zzd(obj, j3) != 0;
            case 15:
                return zznu.zzc(obj, j3) != 0;
            case 16:
                return zznu.zzd(obj, j3) != 0;
            case 17:
                return zznu.zzf(obj, j3) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzQ(Object obj, int i2, int i3, int i4, int i5) {
        return i3 == 1048575 ? zzP(obj, i2) : (i4 & i5) != 0;
    }

    private static boolean zzR(Object obj, int i2, zzmt zzmtVar) {
        return zzmtVar.zzk(zznu.zzf(obj, i2 & 1048575));
    }

    private static boolean zzS(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzlb) {
            return ((zzlb) obj).zzbR();
        }
        return true;
    }

    private final boolean zzT(Object obj, int i2, int i3) {
        return zznu.zzc(obj, (long) (zzv(i3) & 1048575)) == i2;
    }

    private static boolean zzU(Object obj, long j2) {
        return ((Boolean) zznu.zzf(obj, j2)).booleanValue();
    }

    private static final void zzV(int i2, Object obj, zzoc zzocVar) throws IOException {
        if (obj instanceof String) {
            zzocVar.zzF(i2, (String) obj);
        } else {
            zzocVar.zzd(i2, (zzka) obj);
        }
    }

    public static zznl zzd(Object obj) {
        zzlb zzlbVar = (zzlb) obj;
        zznl zznlVar = zzlbVar.zzc;
        if (zznlVar == zznl.zzc()) {
            zznl zzf = zznl.zzf();
            zzlbVar.zzc = zzf;
            return zzf;
        }
        return zznlVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0288  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.measurement.zzml zzl(java.lang.Class r31, com.google.android.gms.internal.measurement.zzmf r32, com.google.android.gms.internal.measurement.zzmn r33, com.google.android.gms.internal.measurement.zzlw r34, com.google.android.gms.internal.measurement.zznk r35, com.google.android.gms.internal.measurement.zzko r36, com.google.android.gms.internal.measurement.zzmd r37) {
        /*
            Method dump skipped, instructions count: 990
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzl(java.lang.Class, com.google.android.gms.internal.measurement.zzmf, com.google.android.gms.internal.measurement.zzmn, com.google.android.gms.internal.measurement.zzlw, com.google.android.gms.internal.measurement.zznk, com.google.android.gms.internal.measurement.zzko, com.google.android.gms.internal.measurement.zzmd):com.google.android.gms.internal.measurement.zzml");
    }

    private static double zzm(Object obj, long j2) {
        return ((Double) zznu.zzf(obj, j2)).doubleValue();
    }

    private static float zzn(Object obj, long j2) {
        return ((Float) zznu.zzf(obj, j2)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x020a, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0217, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0224, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0231, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x023e, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x024b, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x024d, code lost:
        r4 = com.google.android.gms.internal.measurement.zzki.zzx(r11 << 3) + com.google.android.gms.internal.measurement.zzki.zzx(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
        if (zzT(r17, r11, r5) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0099, code lost:
        if (zzT(r17, r11, r5) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a1, code lost:
        if (zzT(r17, r11, r5) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0116, code lost:
        if (zzT(r17, r11, r5) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011d, code lost:
        if (zzT(r17, r11, r5) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0124, code lost:
        if (zzT(r17, r11, r5) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0126, code lost:
        r4 = r11 << 3;
        r3 = com.google.android.gms.internal.measurement.zzki.zzu(zzp(r17, r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013a, code lost:
        if (zzT(r17, r11, r5) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0141, code lost:
        if (zzT(r17, r11, r5) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0143, code lost:
        r3 = com.google.android.gms.internal.measurement.zzki.zzy(zzz(r17, r3));
        r4 = com.google.android.gms.internal.measurement.zzki.zzx(r11 << 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0157, code lost:
        if (zzT(r17, r11, r5) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0159, code lost:
        r3 = com.google.android.gms.internal.measurement.zzki.zzx(r11 << 3) + 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0167, code lost:
        if (zzT(r17, r11, r5) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0169, code lost:
        r3 = com.google.android.gms.internal.measurement.zzki.zzx(r11 << 3) + 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x019a, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a8, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b6, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c4, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01d2, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e0, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01f0, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01fd, code lost:
        if (r3 > 0) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzo(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 1252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzo(java.lang.Object):int");
    }

    private static int zzp(Object obj, long j2) {
        return ((Integer) zznu.zzf(obj, j2)).intValue();
    }

    private final int zzq(Object obj, byte[] bArr, int i2, int i3, int i4, long j2, zzjn zzjnVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzC = zzC(i4);
        Object object = unsafe.getObject(obj, j2);
        if (!((zzmc) object).zze()) {
            zzmc zzb2 = zzmc.zza().zzb();
            zzmd.zzb(zzb2, object);
            unsafe.putObject(obj, j2, zzb2);
        }
        zzmb zzmbVar = (zzmb) zzC;
        throw null;
    }

    private final int zzr(Object obj, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, zzjn zzjnVar) throws IOException {
        Object valueOf;
        Object valueOf2;
        int zzm;
        long j3;
        int i10;
        Object valueOf3;
        Object zzE;
        int zzo;
        Unsafe unsafe = zzb;
        long j4 = this.zzc[i9 + 2] & 1048575;
        switch (i8) {
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                if (i6 == 1) {
                    valueOf = Double.valueOf(Double.longBitsToDouble(zzjo.zzp(bArr, i2)));
                    unsafe.putObject(obj, j2, valueOf);
                    zzm = i2 + 8;
                    unsafe.putInt(obj, j4, i5);
                    return zzm;
                }
                return i2;
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                if (i6 == 5) {
                    valueOf2 = Float.valueOf(Float.intBitsToFloat(zzjo.zzb(bArr, i2)));
                    unsafe.putObject(obj, j2, valueOf2);
                    zzm = i2 + 4;
                    unsafe.putInt(obj, j4, i5);
                    return zzm;
                }
                return i2;
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                if (i6 == 0) {
                    zzm = zzjo.zzm(bArr, i2, zzjnVar);
                    j3 = zzjnVar.zzb;
                    valueOf3 = Long.valueOf(j3);
                    unsafe.putObject(obj, j2, valueOf3);
                    unsafe.putInt(obj, j4, i5);
                    return zzm;
                }
                return i2;
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                if (i6 == 0) {
                    zzm = zzjo.zzj(bArr, i2, zzjnVar);
                    i10 = zzjnVar.zza;
                    valueOf3 = Integer.valueOf(i10);
                    unsafe.putObject(obj, j2, valueOf3);
                    unsafe.putInt(obj, j4, i5);
                    return zzm;
                }
                return i2;
            case 56:
            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                if (i6 == 1) {
                    valueOf = Long.valueOf(zzjo.zzp(bArr, i2));
                    unsafe.putObject(obj, j2, valueOf);
                    zzm = i2 + 8;
                    unsafe.putInt(obj, j4, i5);
                    return zzm;
                }
                return i2;
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
            case 64:
                if (i6 == 5) {
                    valueOf2 = Integer.valueOf(zzjo.zzb(bArr, i2));
                    unsafe.putObject(obj, j2, valueOf2);
                    zzm = i2 + 4;
                    unsafe.putInt(obj, j4, i5);
                    return zzm;
                }
                return i2;
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                if (i6 == 0) {
                    zzm = zzjo.zzm(bArr, i2, zzjnVar);
                    valueOf3 = Boolean.valueOf(zzjnVar.zzb != 0);
                    unsafe.putObject(obj, j2, valueOf3);
                    unsafe.putInt(obj, j4, i5);
                    return zzm;
                }
                return i2;
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                if (i6 == 2) {
                    int zzj = zzjo.zzj(bArr, i2, zzjnVar);
                    int i11 = zzjnVar.zza;
                    if (i11 == 0) {
                        unsafe.putObject(obj, j2, "");
                    } else if ((i7 & 536870912) != 0 && !zznz.zze(bArr, zzj, zzj + i11)) {
                        throw zzll.zzc();
                    } else {
                        unsafe.putObject(obj, j2, new String(bArr, zzj, i11, zzlj.zzb));
                        zzj += i11;
                    }
                    unsafe.putInt(obj, j4, i5);
                    return zzj;
                }
                return i2;
            case 60:
                if (i6 == 2) {
                    zzE = zzE(obj, i5, i9);
                    zzo = zzjo.zzo(zzE, zzB(i9), bArr, i2, i3, zzjnVar);
                    zzM(obj, i5, i9, zzE);
                    return zzo;
                }
                return i2;
            case 61:
                if (i6 == 2) {
                    zzm = zzjo.zza(bArr, i2, zzjnVar);
                    valueOf3 = zzjnVar.zzc;
                    unsafe.putObject(obj, j2, valueOf3);
                    unsafe.putInt(obj, j4, i5);
                    return zzm;
                }
                return i2;
            case 63:
                if (i6 == 0) {
                    int zzj2 = zzjo.zzj(bArr, i2, zzjnVar);
                    int i12 = zzjnVar.zza;
                    zzlf zzA = zzA(i9);
                    if (zzA != null && !zzA.zza(i12)) {
                        zzd(obj).zzj(i4, Long.valueOf(i12));
                        return zzj2;
                    }
                    unsafe.putObject(obj, j2, Integer.valueOf(i12));
                    unsafe.putInt(obj, j4, i5);
                    return zzj2;
                }
                return i2;
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                if (i6 == 0) {
                    zzm = zzjo.zzj(bArr, i2, zzjnVar);
                    i10 = zzke.zzb(zzjnVar.zza);
                    valueOf3 = Integer.valueOf(i10);
                    unsafe.putObject(obj, j2, valueOf3);
                    unsafe.putInt(obj, j4, i5);
                    return zzm;
                }
                return i2;
            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                if (i6 == 0) {
                    zzm = zzjo.zzm(bArr, i2, zzjnVar);
                    j3 = zzke.zzc(zzjnVar.zzb);
                    valueOf3 = Long.valueOf(j3);
                    unsafe.putObject(obj, j2, valueOf3);
                    unsafe.putInt(obj, j4, i5);
                    return zzm;
                }
                return i2;
            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                if (i6 == 3) {
                    zzE = zzE(obj, i5, i9);
                    zzo = zzjo.zzn(zzE, zzB(i9), bArr, i2, i3, (i4 & (-8)) | 4, zzjnVar);
                    zzM(obj, i5, i9, zzE);
                    return zzo;
                }
                return i2;
            default:
                return i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x02b6, code lost:
        if (r30.zzb != 0) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02b8, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02ba, code lost:
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02bb, code lost:
        r13.zze(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02be, code lost:
        if (r0 >= r20) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x02c0, code lost:
        r1 = com.google.android.gms.internal.measurement.zzjo.zzj(r18, r0, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x02c6, code lost:
        if (r21 == r30.zza) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x02c9, code lost:
        r0 = com.google.android.gms.internal.measurement.zzjo.zzm(r18, r1, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x02d1, code lost:
        if (r30.zzb == 0) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02d4, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x017a, code lost:
        if (r1 == 0) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x017c, code lost:
        r13.add(com.google.android.gms.internal.measurement.zzka.zzb);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0182, code lost:
        r13.add(com.google.android.gms.internal.measurement.zzka.zzl(r18, r0, r1));
        r0 = r0 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x018a, code lost:
        if (r0 >= r20) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x018c, code lost:
        r1 = com.google.android.gms.internal.measurement.zzjo.zzj(r18, r0, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0192, code lost:
        if (r21 == r30.zza) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0195, code lost:
        r0 = com.google.android.gms.internal.measurement.zzjo.zzj(r18, r1, r30);
        r1 = r30.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x019b, code lost:
        if (r1 < 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x019f, code lost:
        if (r1 > (r18.length - r0)) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a1, code lost:
        if (r1 != 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a8, code lost:
        throw com.google.android.gms.internal.measurement.zzll.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ad, code lost:
        throw com.google.android.gms.internal.measurement.zzll.zzd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ae, code lost:
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:318:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x01f4 -> B:115:0x01f8). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:120:0x020a -> B:112:0x01e9). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:169:0x02ba -> B:170:0x02bb). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:176:0x02d1 -> B:168:0x02b8). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x0182 -> B:84:0x018a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x01a1 -> B:82:0x017c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzs(java.lang.Object r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.measurement.zzjn r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzs(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.zzjn):int");
    }

    private final int zzt(int i2) {
        if (i2 < this.zze || i2 > this.zzf) {
            return -1;
        }
        return zzw(i2, 0);
    }

    private final int zzu(int i2, int i3) {
        if (i2 < this.zze || i2 > this.zzf) {
            return -1;
        }
        return zzw(i2, i3);
    }

    private final int zzv(int i2) {
        return this.zzc[i2 + 2];
    }

    private final int zzw(int i2, int i3) {
        int length = (this.zzc.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = this.zzc[i5];
            if (i2 == i6) {
                return i5;
            }
            if (i2 < i6) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    private static int zzx(int i2) {
        return (i2 >>> 20) & 255;
    }

    private final int zzy(int i2) {
        return this.zzc[i2 + 1];
    }

    private static long zzz(Object obj, long j2) {
        return ((Long) zznu.zzf(obj, j2)).longValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x031b, code lost:
        if ((r4 instanceof com.google.android.gms.internal.measurement.zzka) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x031e, code lost:
        r5 = r6 << 3;
        r4 = com.google.android.gms.internal.measurement.zzki.zzw((java.lang.String) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
        if ((r4 instanceof com.google.android.gms.internal.measurement.zzka) != false) goto L54;
     */
    @Override // com.google.android.gms.internal.measurement.zzmt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 1084
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zza(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cf, code lost:
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e1, code lost:
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e3, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e7, code lost:
        r2 = (r2 * 53) + r7;
     */
    @Override // com.google.android.gms.internal.measurement.zzmt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzb(java.lang.Object):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x030a, code lost:
        if (r0 != r22) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x030c, code lost:
        r15 = r28;
        r14 = r29;
        r12 = r30;
        r1 = r31;
        r13 = r32;
        r11 = r33;
        r9 = r34;
        r8 = r19;
        r5 = r20;
        r3 = r21;
        r2 = r22;
        r6 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0328, code lost:
        r2 = r0;
        r7 = r21;
        r6 = r24;
        r0 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x035c, code lost:
        if (r0 != r15) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0382, code lost:
        if (r0 != r15) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x03fd, code lost:
        if (r6 == 1048575) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x03ff, code lost:
        r27.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0405, code lost:
        r2 = r8.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0409, code lost:
        if (r2 >= r8.zzl) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x040b, code lost:
        r4 = r8.zzj[r2];
        r5 = r8.zzc[r4];
        r5 = com.google.android.gms.internal.measurement.zznu.zzf(r12, r8.zzy(r4) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x041d, code lost:
        if (r5 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0424, code lost:
        if (r8.zzA(r4) != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0426, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0429, code lost:
        r5 = (com.google.android.gms.internal.measurement.zzmc) r5;
        r0 = (com.google.android.gms.internal.measurement.zzmb) r8.zzC(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0431, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0434, code lost:
        if (r9 != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0436, code lost:
        if (r0 != r32) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x043d, code lost:
        throw com.google.android.gms.internal.measurement.zzll.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x043e, code lost:
        if (r0 > r32) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0440, code lost:
        if (r3 != r9) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0442, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0447, code lost:
        throw com.google.android.gms.internal.measurement.zzll.zze();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzc(java.lang.Object r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.measurement.zzjn r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1134
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzjn):int");
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final Object zze() {
        return ((zzlb) this.zzg).zzbD();
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final void zzf(Object obj) {
        int i2;
        if (zzS(obj)) {
            if (obj instanceof zzlb) {
                zzlb zzlbVar = (zzlb) obj;
                zzlbVar.zzbP(Integer.MAX_VALUE);
                zzlbVar.zzb = 0;
                zzlbVar.zzbN();
            }
            int length = this.zzc.length;
            while (i2 < length) {
                int zzy = zzy(i2);
                int i3 = 1048575 & zzy;
                int zzx = zzx(zzy);
                long j2 = i3;
                if (zzx != 9) {
                    if (zzx != 60 && zzx != 68) {
                        switch (zzx) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                                this.zzm.zza(obj, j2);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j2);
                                if (object == null) {
                                    break;
                                } else {
                                    ((zzmc) object).zzc();
                                    unsafe.putObject(obj, j2, object);
                                    break;
                                }
                        }
                    } else {
                        if (!zzT(obj, this.zzc[i2], i2)) {
                        }
                        zzB(i2).zzf(zzb.getObject(obj, j2));
                    }
                }
                i2 = zzP(obj, i2) ? 0 : i2 + 3;
                zzB(i2).zzf(zzb.getObject(obj, j2));
            }
            this.zzn.zzg(obj);
            if (this.zzh) {
                this.zzo.zzb(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final void zzg(Object obj, Object obj2) {
        zzG(obj);
        obj2.getClass();
        for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
            int zzy = zzy(i2);
            int i3 = this.zzc[i2];
            long j2 = 1048575 & zzy;
            switch (zzx(zzy)) {
                case 0:
                    if (zzP(obj2, i2)) {
                        zznu.zzo(obj, j2, zznu.zza(obj2, j2));
                        zzJ(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzP(obj2, i2)) {
                        zznu.zzp(obj, j2, zznu.zzb(obj2, j2));
                        zzJ(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!zzP(obj2, i2)) {
                        break;
                    }
                    zznu.zzr(obj, j2, zznu.zzd(obj2, j2));
                    zzJ(obj, i2);
                    break;
                case 3:
                    if (!zzP(obj2, i2)) {
                        break;
                    }
                    zznu.zzr(obj, j2, zznu.zzd(obj2, j2));
                    zzJ(obj, i2);
                    break;
                case 4:
                    if (!zzP(obj2, i2)) {
                        break;
                    }
                    zznu.zzq(obj, j2, zznu.zzc(obj2, j2));
                    zzJ(obj, i2);
                    break;
                case 5:
                    if (!zzP(obj2, i2)) {
                        break;
                    }
                    zznu.zzr(obj, j2, zznu.zzd(obj2, j2));
                    zzJ(obj, i2);
                    break;
                case 6:
                    if (!zzP(obj2, i2)) {
                        break;
                    }
                    zznu.zzq(obj, j2, zznu.zzc(obj2, j2));
                    zzJ(obj, i2);
                    break;
                case 7:
                    if (zzP(obj2, i2)) {
                        zznu.zzm(obj, j2, zznu.zzw(obj2, j2));
                        zzJ(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zzP(obj2, i2)) {
                        break;
                    }
                    zznu.zzs(obj, j2, zznu.zzf(obj2, j2));
                    zzJ(obj, i2);
                    break;
                case 9:
                case 17:
                    zzH(obj, obj2, i2);
                    break;
                case 10:
                    if (!zzP(obj2, i2)) {
                        break;
                    }
                    zznu.zzs(obj, j2, zznu.zzf(obj2, j2));
                    zzJ(obj, i2);
                    break;
                case 11:
                    if (!zzP(obj2, i2)) {
                        break;
                    }
                    zznu.zzq(obj, j2, zznu.zzc(obj2, j2));
                    zzJ(obj, i2);
                    break;
                case 12:
                    if (!zzP(obj2, i2)) {
                        break;
                    }
                    zznu.zzq(obj, j2, zznu.zzc(obj2, j2));
                    zzJ(obj, i2);
                    break;
                case 13:
                    if (!zzP(obj2, i2)) {
                        break;
                    }
                    zznu.zzq(obj, j2, zznu.zzc(obj2, j2));
                    zzJ(obj, i2);
                    break;
                case 14:
                    if (!zzP(obj2, i2)) {
                        break;
                    }
                    zznu.zzr(obj, j2, zznu.zzd(obj2, j2));
                    zzJ(obj, i2);
                    break;
                case 15:
                    if (!zzP(obj2, i2)) {
                        break;
                    }
                    zznu.zzq(obj, j2, zznu.zzc(obj2, j2));
                    zzJ(obj, i2);
                    break;
                case 16:
                    if (!zzP(obj2, i2)) {
                        break;
                    }
                    zznu.zzr(obj, j2, zznu.zzd(obj2, j2));
                    zzJ(obj, i2);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    this.zzm.zzb(obj, obj2, j2);
                    break;
                case 50:
                    int i4 = zzmv.zza;
                    zznu.zzs(obj, j2, zzmd.zzb(zznu.zzf(obj, j2), zznu.zzf(obj2, j2)));
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                case 56:
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (!zzT(obj2, i3, i2)) {
                        break;
                    }
                    zznu.zzs(obj, j2, zznu.zzf(obj2, j2));
                    zzK(obj, i3, i2);
                    break;
                case 60:
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    zzI(obj, obj2, i2);
                    break;
                case 61:
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                case 63:
                case 64:
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (!zzT(obj2, i3, i2)) {
                        break;
                    }
                    zznu.zzs(obj, j2, zznu.zzf(obj2, j2));
                    zzK(obj, i3, i2);
                    break;
            }
        }
        zzmv.zzB(this.zzn, obj, obj2);
        if (this.zzh) {
            this.zzo.zza(obj2);
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x02e5, code lost:
        if (r0 != r24) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02e7, code lost:
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r15;
        r10 = r18;
        r1 = r23;
        r6 = r25;
        r7 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02fa, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0326, code lost:
        if (r0 != r14) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0347, code lost:
        if (r0 != r14) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    @Override // com.google.android.gms.internal.measurement.zzmt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.measurement.zzjn r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 964
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.zzh(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.zzjn):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.zzmt
    public final void zzi(Object obj, zzoc zzocVar) throws IOException {
        int i2;
        int i3;
        int i4;
        double zza2;
        float zzb2;
        long zzd;
        long zzd2;
        int zzc;
        long zzd3;
        int zzc2;
        boolean zzw;
        int zzc3;
        int zzc4;
        int zzc5;
        long zzd4;
        int zzc6;
        long zzd5;
        int i5 = 0;
        int i6 = 1048575;
        if (this.zzi) {
            if (this.zzh) {
                this.zzo.zza(obj);
                throw null;
            }
            int length = this.zzc.length;
            for (int i7 = 0; i7 < length; i7 += 3) {
                int zzy = zzy(i7);
                int i8 = this.zzc[i7];
                switch (zzx(zzy)) {
                    case 0:
                        if (zzP(obj, i7)) {
                            zza2 = zznu.zza(obj, zzy & 1048575);
                            zzocVar.zzf(i8, zza2);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzP(obj, i7)) {
                            zzb2 = zznu.zzb(obj, zzy & 1048575);
                            zzocVar.zzo(i8, zzb2);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzP(obj, i7)) {
                            zzd = zznu.zzd(obj, zzy & 1048575);
                            zzocVar.zzt(i8, zzd);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzP(obj, i7)) {
                            zzd2 = zznu.zzd(obj, zzy & 1048575);
                            zzocVar.zzJ(i8, zzd2);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzP(obj, i7)) {
                            zzc = zznu.zzc(obj, zzy & 1048575);
                            zzocVar.zzr(i8, zzc);
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzP(obj, i7)) {
                            zzd3 = zznu.zzd(obj, zzy & 1048575);
                            zzocVar.zzm(i8, zzd3);
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzP(obj, i7)) {
                            zzc2 = zznu.zzc(obj, zzy & 1048575);
                            zzocVar.zzk(i8, zzc2);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzP(obj, i7)) {
                            zzw = zznu.zzw(obj, zzy & 1048575);
                            zzocVar.zzb(i8, zzw);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (!zzP(obj, i7)) {
                            break;
                        }
                        zzV(i8, zznu.zzf(obj, zzy & 1048575), zzocVar);
                        break;
                    case 9:
                        if (!zzP(obj, i7)) {
                            break;
                        }
                        zzocVar.zzv(i8, zznu.zzf(obj, zzy & 1048575), zzB(i7));
                        break;
                    case 10:
                        if (!zzP(obj, i7)) {
                            break;
                        }
                        zzocVar.zzd(i8, (zzka) zznu.zzf(obj, zzy & 1048575));
                        break;
                    case 11:
                        if (zzP(obj, i7)) {
                            zzc3 = zznu.zzc(obj, zzy & 1048575);
                            zzocVar.zzH(i8, zzc3);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzP(obj, i7)) {
                            zzc4 = zznu.zzc(obj, zzy & 1048575);
                            zzocVar.zzi(i8, zzc4);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzP(obj, i7)) {
                            zzc5 = zznu.zzc(obj, zzy & 1048575);
                            zzocVar.zzw(i8, zzc5);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzP(obj, i7)) {
                            zzd4 = zznu.zzd(obj, zzy & 1048575);
                            zzocVar.zzy(i8, zzd4);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzP(obj, i7)) {
                            zzc6 = zznu.zzc(obj, zzy & 1048575);
                            zzocVar.zzA(i8, zzc6);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzP(obj, i7)) {
                            zzd5 = zznu.zzd(obj, zzy & 1048575);
                            zzocVar.zzC(i8, zzd5);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (!zzP(obj, i7)) {
                            break;
                        }
                        zzocVar.zzq(i8, zznu.zzf(obj, zzy & 1048575), zzB(i7));
                        break;
                    case 18:
                        zzmv.zzF(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 19:
                        zzmv.zzJ(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 20:
                        zzmv.zzM(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 21:
                        zzmv.zzU(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 22:
                        zzmv.zzL(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 23:
                        zzmv.zzI(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 24:
                        zzmv.zzH(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 25:
                        zzmv.zzD(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 26:
                        zzmv.zzS(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar);
                        break;
                    case 27:
                        zzmv.zzN(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, zzB(i7));
                        break;
                    case 28:
                        zzmv.zzE(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar);
                        break;
                    case 29:
                        zzmv.zzT(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 30:
                        zzmv.zzG(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 31:
                        zzmv.zzO(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 32:
                        zzmv.zzP(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 33:
                        zzmv.zzQ(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 34:
                        zzmv.zzR(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 35:
                        zzmv.zzF(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 36:
                        zzmv.zzJ(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 37:
                        zzmv.zzM(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 38:
                        zzmv.zzU(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 39:
                        zzmv.zzL(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 40:
                        zzmv.zzI(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 41:
                        zzmv.zzH(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 42:
                        zzmv.zzD(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 43:
                        zzmv.zzT(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 44:
                        zzmv.zzG(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 45:
                        zzmv.zzO(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 46:
                        zzmv.zzP(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 47:
                        zzmv.zzQ(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                        zzmv.zzR(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                        zzmv.zzK(i8, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, zzB(i7));
                        break;
                    case 50:
                        zzN(zzocVar, i8, zznu.zzf(obj, zzy & 1048575), i7);
                        break;
                    case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                        if (zzT(obj, i8, i7)) {
                            zza2 = zzm(obj, zzy & 1048575);
                            zzocVar.zzf(i8, zza2);
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                        if (zzT(obj, i8, i7)) {
                            zzb2 = zzn(obj, zzy & 1048575);
                            zzocVar.zzo(i8, zzb2);
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                        if (zzT(obj, i8, i7)) {
                            zzd = zzz(obj, zzy & 1048575);
                            zzocVar.zzt(i8, zzd);
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                        if (zzT(obj, i8, i7)) {
                            zzd2 = zzz(obj, zzy & 1048575);
                            zzocVar.zzJ(i8, zzd2);
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                        if (zzT(obj, i8, i7)) {
                            zzc = zzp(obj, zzy & 1048575);
                            zzocVar.zzr(i8, zzc);
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzT(obj, i8, i7)) {
                            zzd3 = zzz(obj, zzy & 1048575);
                            zzocVar.zzm(i8, zzd3);
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                        if (zzT(obj, i8, i7)) {
                            zzc2 = zzp(obj, zzy & 1048575);
                            zzocVar.zzk(i8, zzc2);
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                        if (zzT(obj, i8, i7)) {
                            zzw = zzU(obj, zzy & 1048575);
                            zzocVar.zzb(i8, zzw);
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                        if (!zzT(obj, i8, i7)) {
                            break;
                        }
                        zzV(i8, zznu.zzf(obj, zzy & 1048575), zzocVar);
                        break;
                    case 60:
                        if (!zzT(obj, i8, i7)) {
                            break;
                        }
                        zzocVar.zzv(i8, zznu.zzf(obj, zzy & 1048575), zzB(i7));
                        break;
                    case 61:
                        if (!zzT(obj, i8, i7)) {
                            break;
                        }
                        zzocVar.zzd(i8, (zzka) zznu.zzf(obj, zzy & 1048575));
                        break;
                    case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                        if (zzT(obj, i8, i7)) {
                            zzc3 = zzp(obj, zzy & 1048575);
                            zzocVar.zzH(i8, zzc3);
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzT(obj, i8, i7)) {
                            zzc4 = zzp(obj, zzy & 1048575);
                            zzocVar.zzi(i8, zzc4);
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzT(obj, i8, i7)) {
                            zzc5 = zzp(obj, zzy & 1048575);
                            zzocVar.zzw(i8, zzc5);
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                        if (zzT(obj, i8, i7)) {
                            zzd4 = zzz(obj, zzy & 1048575);
                            zzocVar.zzy(i8, zzd4);
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                        if (zzT(obj, i8, i7)) {
                            zzc6 = zzp(obj, zzy & 1048575);
                            zzocVar.zzA(i8, zzc6);
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                        if (zzT(obj, i8, i7)) {
                            zzd5 = zzz(obj, zzy & 1048575);
                            zzocVar.zzC(i8, zzd5);
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                        if (!zzT(obj, i8, i7)) {
                            break;
                        }
                        zzocVar.zzq(i8, zznu.zzf(obj, zzy & 1048575), zzB(i7));
                        break;
                }
            }
        } else if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        } else {
            int length2 = this.zzc.length;
            Unsafe unsafe = zzb;
            int i9 = 0;
            int i10 = 0;
            int i11 = 1048575;
            while (i9 < length2) {
                int zzy2 = zzy(i9);
                int[] iArr = this.zzc;
                int i12 = iArr[i9];
                int zzx = zzx(zzy2);
                if (zzx <= 17) {
                    int i13 = iArr[i9 + 2];
                    int i14 = i13 & i6;
                    if (i14 != i11) {
                        i10 = unsafe.getInt(obj, i14);
                        i11 = i14;
                    }
                    i2 = 1 << (i13 >>> 20);
                } else {
                    i2 = i5;
                }
                long j2 = zzy2 & i6;
                switch (zzx) {
                    case 0:
                        i3 = 0;
                        if ((i10 & i2) != 0) {
                            zzocVar.zzf(i12, zznu.zza(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        i3 = 0;
                        if ((i10 & i2) != 0) {
                            zzocVar.zzo(i12, zznu.zzb(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        i3 = 0;
                        if ((i10 & i2) != 0) {
                            zzocVar.zzt(i12, unsafe.getLong(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        i3 = 0;
                        if ((i10 & i2) != 0) {
                            zzocVar.zzJ(i12, unsafe.getLong(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        i3 = 0;
                        if ((i10 & i2) != 0) {
                            zzocVar.zzr(i12, unsafe.getInt(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        i3 = 0;
                        if ((i10 & i2) != 0) {
                            zzocVar.zzm(i12, unsafe.getLong(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        i3 = 0;
                        if ((i10 & i2) != 0) {
                            zzocVar.zzk(i12, unsafe.getInt(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        i3 = 0;
                        if ((i10 & i2) != 0) {
                            zzocVar.zzb(i12, zznu.zzw(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        i3 = 0;
                        if ((i10 & i2) != 0) {
                            zzV(i12, unsafe.getObject(obj, j2), zzocVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        i3 = 0;
                        if ((i10 & i2) != 0) {
                            zzocVar.zzv(i12, unsafe.getObject(obj, j2), zzB(i9));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        i3 = 0;
                        if ((i10 & i2) != 0) {
                            zzocVar.zzd(i12, (zzka) unsafe.getObject(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        i3 = 0;
                        if ((i10 & i2) != 0) {
                            zzocVar.zzH(i12, unsafe.getInt(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        i3 = 0;
                        if ((i10 & i2) != 0) {
                            zzocVar.zzi(i12, unsafe.getInt(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        i3 = 0;
                        if ((i10 & i2) != 0) {
                            zzocVar.zzw(i12, unsafe.getInt(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        i3 = 0;
                        if ((i10 & i2) != 0) {
                            zzocVar.zzy(i12, unsafe.getLong(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        i3 = 0;
                        if ((i10 & i2) != 0) {
                            zzocVar.zzA(i12, unsafe.getInt(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        i3 = 0;
                        if ((i10 & i2) != 0) {
                            zzocVar.zzC(i12, unsafe.getLong(obj, j2));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        i3 = 0;
                        if ((i10 & i2) != 0) {
                            zzocVar.zzq(i12, unsafe.getObject(obj, j2), zzB(i9));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        i3 = 0;
                        zzmv.zzF(this.zzc[i9], (List) unsafe.getObject(obj, j2), zzocVar, false);
                        break;
                    case 19:
                        i3 = 0;
                        zzmv.zzJ(this.zzc[i9], (List) unsafe.getObject(obj, j2), zzocVar, false);
                        break;
                    case 20:
                        i3 = 0;
                        zzmv.zzM(this.zzc[i9], (List) unsafe.getObject(obj, j2), zzocVar, false);
                        break;
                    case 21:
                        i3 = 0;
                        zzmv.zzU(this.zzc[i9], (List) unsafe.getObject(obj, j2), zzocVar, false);
                        break;
                    case 22:
                        i3 = 0;
                        zzmv.zzL(this.zzc[i9], (List) unsafe.getObject(obj, j2), zzocVar, false);
                        break;
                    case 23:
                        i3 = 0;
                        zzmv.zzI(this.zzc[i9], (List) unsafe.getObject(obj, j2), zzocVar, false);
                        break;
                    case 24:
                        i3 = 0;
                        zzmv.zzH(this.zzc[i9], (List) unsafe.getObject(obj, j2), zzocVar, false);
                        break;
                    case 25:
                        i3 = 0;
                        zzmv.zzD(this.zzc[i9], (List) unsafe.getObject(obj, j2), zzocVar, false);
                        break;
                    case 26:
                        zzmv.zzS(this.zzc[i9], (List) unsafe.getObject(obj, j2), zzocVar);
                        i3 = 0;
                        break;
                    case 27:
                        zzmv.zzN(this.zzc[i9], (List) unsafe.getObject(obj, j2), zzocVar, zzB(i9));
                        i3 = 0;
                        break;
                    case 28:
                        zzmv.zzE(this.zzc[i9], (List) unsafe.getObject(obj, j2), zzocVar);
                        i3 = 0;
                        break;
                    case 29:
                        i4 = 0;
                        zzmv.zzT(this.zzc[i9], (List) unsafe.getObject(obj, j2), zzocVar, false);
                        i3 = i4;
                        break;
                    case 30:
                        i4 = 0;
                        zzmv.zzG(this.zzc[i9], (List) unsafe.getObject(obj, j2), zzocVar, false);
                        i3 = i4;
                        break;
                    case 31:
                        i4 = 0;
                        zzmv.zzO(this.zzc[i9], (List) unsafe.getObject(obj, j2), zzocVar, false);
                        i3 = i4;
                        break;
                    case 32:
                        i4 = 0;
                        zzmv.zzP(this.zzc[i9], (List) unsafe.getObject(obj, j2), zzocVar, false);
                        i3 = i4;
                        break;
                    case 33:
                        i4 = 0;
                        zzmv.zzQ(this.zzc[i9], (List) unsafe.getObject(obj, j2), zzocVar, false);
                        i3 = i4;
                        break;
                    case 34:
                        i4 = 0;
                        zzmv.zzR(this.zzc[i9], (List) unsafe.getObject(obj, j2), zzocVar, false);
                        i3 = i4;
                        break;
                    case 35:
                        zzmv.zzF(this.zzc[i9], (List) unsafe.getObject(obj, j2), zzocVar, true);
                        i3 = 0;
                        break;
                    case 36:
                        zzmv.zzJ(this.zzc[i9], (List) unsafe.getObject(obj, j2), zzocVar, true);
                        i3 = 0;
                        break;
                    case 37:
                        zzmv.zzM(this.zzc[i9], (List) unsafe.getObject(obj, j2), zzocVar, true);
                        i3 = 0;
                        break;
                    case 38:
                        zzmv.zzU(this.zzc[i9], (List) unsafe.getObject(obj, j2), zzocVar, true);
                        i3 = 0;
                        break;
                    case 39:
                        zzmv.zzL(this.zzc[i9], (List) unsafe.getObject(obj, j2), zzocVar, true);
                        i3 = 0;
                        break;
                    case 40:
                        zzmv.zzI(this.zzc[i9], (List) unsafe.getObject(obj, j2), zzocVar, true);
                        i3 = 0;
                        break;
                    case 41:
                        zzmv.zzH(this.zzc[i9], (List) unsafe.getObject(obj, j2), zzocVar, true);
                        i3 = 0;
                        break;
                    case 42:
                        zzmv.zzD(this.zzc[i9], (List) unsafe.getObject(obj, j2), zzocVar, true);
                        i3 = 0;
                        break;
                    case 43:
                        zzmv.zzT(this.zzc[i9], (List) unsafe.getObject(obj, j2), zzocVar, true);
                        i3 = 0;
                        break;
                    case 44:
                        zzmv.zzG(this.zzc[i9], (List) unsafe.getObject(obj, j2), zzocVar, true);
                        i3 = 0;
                        break;
                    case 45:
                        zzmv.zzO(this.zzc[i9], (List) unsafe.getObject(obj, j2), zzocVar, true);
                        i3 = 0;
                        break;
                    case 46:
                        zzmv.zzP(this.zzc[i9], (List) unsafe.getObject(obj, j2), zzocVar, true);
                        i3 = 0;
                        break;
                    case 47:
                        zzmv.zzQ(this.zzc[i9], (List) unsafe.getObject(obj, j2), zzocVar, true);
                        i3 = 0;
                        break;
                    case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                        zzmv.zzR(this.zzc[i9], (List) unsafe.getObject(obj, j2), zzocVar, true);
                        i3 = 0;
                        break;
                    case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                        zzmv.zzK(this.zzc[i9], (List) unsafe.getObject(obj, j2), zzocVar, zzB(i9));
                        i3 = 0;
                        break;
                    case 50:
                        zzN(zzocVar, i12, unsafe.getObject(obj, j2), i9);
                        i3 = 0;
                        break;
                    case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                        if (zzT(obj, i12, i9)) {
                            zzocVar.zzf(i12, zzm(obj, j2));
                        }
                        i3 = 0;
                        break;
                    case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                        if (zzT(obj, i12, i9)) {
                            zzocVar.zzo(i12, zzn(obj, j2));
                        }
                        i3 = 0;
                        break;
                    case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                        if (zzT(obj, i12, i9)) {
                            zzocVar.zzt(i12, zzz(obj, j2));
                        }
                        i3 = 0;
                        break;
                    case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                        if (zzT(obj, i12, i9)) {
                            zzocVar.zzJ(i12, zzz(obj, j2));
                        }
                        i3 = 0;
                        break;
                    case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                        if (zzT(obj, i12, i9)) {
                            zzocVar.zzr(i12, zzp(obj, j2));
                        }
                        i3 = 0;
                        break;
                    case 56:
                        if (zzT(obj, i12, i9)) {
                            zzocVar.zzm(i12, zzz(obj, j2));
                        }
                        i3 = 0;
                        break;
                    case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                        if (zzT(obj, i12, i9)) {
                            zzocVar.zzk(i12, zzp(obj, j2));
                        }
                        i3 = 0;
                        break;
                    case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                        if (zzT(obj, i12, i9)) {
                            zzocVar.zzb(i12, zzU(obj, j2));
                        }
                        i3 = 0;
                        break;
                    case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                        if (zzT(obj, i12, i9)) {
                            zzV(i12, unsafe.getObject(obj, j2), zzocVar);
                        }
                        i3 = 0;
                        break;
                    case 60:
                        if (zzT(obj, i12, i9)) {
                            zzocVar.zzv(i12, unsafe.getObject(obj, j2), zzB(i9));
                        }
                        i3 = 0;
                        break;
                    case 61:
                        if (zzT(obj, i12, i9)) {
                            zzocVar.zzd(i12, (zzka) unsafe.getObject(obj, j2));
                        }
                        i3 = 0;
                        break;
                    case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                        if (zzT(obj, i12, i9)) {
                            zzocVar.zzH(i12, zzp(obj, j2));
                        }
                        i3 = 0;
                        break;
                    case 63:
                        if (zzT(obj, i12, i9)) {
                            zzocVar.zzi(i12, zzp(obj, j2));
                        }
                        i3 = 0;
                        break;
                    case 64:
                        if (zzT(obj, i12, i9)) {
                            zzocVar.zzw(i12, zzp(obj, j2));
                        }
                        i3 = 0;
                        break;
                    case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                        if (zzT(obj, i12, i9)) {
                            zzocVar.zzy(i12, zzz(obj, j2));
                        }
                        i3 = 0;
                        break;
                    case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                        if (zzT(obj, i12, i9)) {
                            zzocVar.zzA(i12, zzp(obj, j2));
                        }
                        i3 = 0;
                        break;
                    case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                        if (zzT(obj, i12, i9)) {
                            zzocVar.zzC(i12, zzz(obj, j2));
                        }
                        i3 = 0;
                        break;
                    case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                        if (zzT(obj, i12, i9)) {
                            zzocVar.zzq(i12, unsafe.getObject(obj, j2), zzB(i9));
                        }
                        i3 = 0;
                        break;
                    default:
                        i3 = 0;
                        break;
                }
                i9 += 3;
                i5 = i3;
                i6 = 1048575;
            }
        }
        zznk zznkVar = this.zzn;
        zznkVar.zzi(zznkVar.zzd(obj), zzocVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final boolean zzj(Object obj, Object obj2) {
        int length = this.zzc.length;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int zzy = zzy(i2);
            long j2 = zzy & 1048575;
            switch (zzx(zzy)) {
                case 0:
                    if (zzO(obj, obj2, i2) && Double.doubleToLongBits(zznu.zza(obj, j2)) == Double.doubleToLongBits(zznu.zza(obj2, j2))) {
                        break;
                    }
                    return false;
                case 1:
                    if (zzO(obj, obj2, i2) && Float.floatToIntBits(zznu.zzb(obj, j2)) == Float.floatToIntBits(zznu.zzb(obj2, j2))) {
                        break;
                    }
                    return false;
                case 2:
                    if (zzO(obj, obj2, i2) && zznu.zzd(obj, j2) == zznu.zzd(obj2, j2)) {
                        break;
                    }
                    return false;
                case 3:
                    if (zzO(obj, obj2, i2) && zznu.zzd(obj, j2) == zznu.zzd(obj2, j2)) {
                        break;
                    }
                    return false;
                case 4:
                    if (zzO(obj, obj2, i2) && zznu.zzc(obj, j2) == zznu.zzc(obj2, j2)) {
                        break;
                    }
                    return false;
                case 5:
                    if (zzO(obj, obj2, i2) && zznu.zzd(obj, j2) == zznu.zzd(obj2, j2)) {
                        break;
                    }
                    return false;
                case 6:
                    if (zzO(obj, obj2, i2) && zznu.zzc(obj, j2) == zznu.zzc(obj2, j2)) {
                        break;
                    }
                    return false;
                case 7:
                    if (zzO(obj, obj2, i2) && zznu.zzw(obj, j2) == zznu.zzw(obj2, j2)) {
                        break;
                    }
                    return false;
                case 8:
                    if (zzO(obj, obj2, i2) && zzmv.zzV(zznu.zzf(obj, j2), zznu.zzf(obj2, j2))) {
                        break;
                    }
                    return false;
                case 9:
                    if (zzO(obj, obj2, i2) && zzmv.zzV(zznu.zzf(obj, j2), zznu.zzf(obj2, j2))) {
                        break;
                    }
                    return false;
                case 10:
                    if (zzO(obj, obj2, i2) && zzmv.zzV(zznu.zzf(obj, j2), zznu.zzf(obj2, j2))) {
                        break;
                    }
                    return false;
                case 11:
                    if (zzO(obj, obj2, i2) && zznu.zzc(obj, j2) == zznu.zzc(obj2, j2)) {
                        break;
                    }
                    return false;
                case 12:
                    if (zzO(obj, obj2, i2) && zznu.zzc(obj, j2) == zznu.zzc(obj2, j2)) {
                        break;
                    }
                    return false;
                case 13:
                    if (zzO(obj, obj2, i2) && zznu.zzc(obj, j2) == zznu.zzc(obj2, j2)) {
                        break;
                    }
                    return false;
                case 14:
                    if (zzO(obj, obj2, i2) && zznu.zzd(obj, j2) == zznu.zzd(obj2, j2)) {
                        break;
                    }
                    return false;
                case 15:
                    if (zzO(obj, obj2, i2) && zznu.zzc(obj, j2) == zznu.zzc(obj2, j2)) {
                        break;
                    }
                    return false;
                case 16:
                    if (zzO(obj, obj2, i2) && zznu.zzd(obj, j2) == zznu.zzd(obj2, j2)) {
                        break;
                    }
                    return false;
                case 17:
                    if (zzO(obj, obj2, i2) && zzmv.zzV(zznu.zzf(obj, j2), zznu.zzf(obj2, j2))) {
                        break;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                case 50:
                    if (zzmv.zzV(zznu.zzf(obj, j2), zznu.zzf(obj2, j2))) {
                        break;
                    } else {
                        return false;
                    }
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                case 56:
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                case 60:
                case 61:
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                case 63:
                case 64:
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    long zzv = zzv(i2) & 1048575;
                    if (zznu.zzc(obj, zzv) == zznu.zzc(obj2, zzv) && zzmv.zzV(zznu.zzf(obj, j2), zznu.zzf(obj2, j2))) {
                        break;
                    }
                    return false;
            }
        }
        if (this.zzn.zzd(obj).equals(this.zzn.zzd(obj2))) {
            if (this.zzh) {
                this.zzo.zza(obj);
                this.zzo.zza(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final boolean zzk(Object obj) {
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.zzk) {
            int i7 = this.zzj[i6];
            int i8 = this.zzc[i7];
            int zzy = zzy(i7);
            int i9 = this.zzc[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = zzb.getInt(obj, i10);
                }
                i3 = i5;
                i2 = i10;
            } else {
                i2 = i4;
                i3 = i5;
            }
            if ((268435456 & zzy) != 0 && !zzQ(obj, i7, i2, i3, i11)) {
                return false;
            }
            int zzx = zzx(zzy);
            if (zzx != 9 && zzx != 17) {
                if (zzx != 27) {
                    if (zzx == 60 || zzx == 68) {
                        if (zzT(obj, i8, i7) && !zzR(obj, zzy, zzB(i7))) {
                            return false;
                        }
                    } else if (zzx != 49) {
                        if (zzx == 50 && !((zzmc) zznu.zzf(obj, zzy & 1048575)).isEmpty()) {
                            zzmb zzmbVar = (zzmb) zzC(i7);
                            throw null;
                        }
                    }
                }
                List list = (List) zznu.zzf(obj, zzy & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzmt zzB = zzB(i7);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (!zzB.zzk(list.get(i12))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zzQ(obj, i7, i2, i3, i11) && !zzR(obj, zzy, zzB(i7))) {
                return false;
            }
            i6++;
            i4 = i2;
            i5 = i3;
        }
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        return true;
    }
}
