package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzma implements zzmu {
    private static final zzmg zza = new zzly();
    private final zzmg zzb;

    public zzma() {
        zzmg zzmgVar;
        zzmg[] zzmgVarArr = new zzmg[2];
        zzmgVarArr[0] = zzkw.zza();
        try {
            zzmgVar = (zzmg) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzmgVar = zza;
        }
        zzmgVarArr[1] = zzmgVar;
        zzlz zzlzVar = new zzlz(zzmgVarArr);
        byte[] bArr = zzlj.zzd;
        this.zzb = zzlzVar;
    }

    private static boolean zzb(zzmf zzmfVar) {
        return zzmfVar.zzc() == 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final zzmt zza(Class cls) {
        zzmn zza2;
        zzlw zzc;
        zznk zzy;
        zzko zza3;
        zzmd zza4;
        zznk zzy2;
        zzko zza5;
        zzmv.zzC(cls);
        zzmf zzb = this.zzb.zzb(cls);
        if (zzb.zzb()) {
            if (zzlb.class.isAssignableFrom(cls)) {
                zzy2 = zzmv.zzz();
                zza5 = zzkq.zzb();
            } else {
                zzy2 = zzmv.zzy();
                zza5 = zzkq.zza();
            }
            return zzmm.zzc(zzy2, zza5, zzb.zza());
        }
        if (zzlb.class.isAssignableFrom(cls)) {
            boolean zzb2 = zzb(zzb);
            zza2 = zzmo.zzb();
            zzc = zzlw.zzd();
            zzy = zzmv.zzz();
            zza3 = zzb2 ? zzkq.zzb() : null;
            zza4 = zzme.zzb();
        } else {
            boolean zzb3 = zzb(zzb);
            zza2 = zzmo.zza();
            zzc = zzlw.zzc();
            zzy = zzmv.zzy();
            zza3 = zzb3 ? zzkq.zza() : null;
            zza4 = zzme.zza();
        }
        return zzml.zzl(cls, zzb, zza2, zzc, zzy, zza3, zza4);
    }
}
