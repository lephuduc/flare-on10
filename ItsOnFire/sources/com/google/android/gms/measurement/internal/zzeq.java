package com.google.android.gms.measurement.internal;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzeq implements Runnable {
    public final /* synthetic */ int zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ Object zzc;
    public final /* synthetic */ Object zzd;
    public final /* synthetic */ Object zze;
    public final /* synthetic */ zzet zzf;

    public zzeq(zzet zzetVar, int i2, String str, Object obj, Object obj2, Object obj3) {
        this.zzf = zzetVar;
        this.zza = i2;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        this.zze = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c2;
        long j2;
        char c3;
        long j3;
        zzet zzetVar;
        char c4;
        zzfi zzm = this.zzf.zzt.zzm();
        if (!zzm.zzy()) {
            Log.println(6, this.zzf.zzr(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        zzet zzetVar2 = this.zzf;
        c2 = zzetVar2.zza;
        if (c2 == 0) {
            if (zzetVar2.zzt.zzf().zzy()) {
                zzetVar = this.zzf;
                zzetVar.zzt.zzay();
                c4 = 'C';
            } else {
                zzetVar = this.zzf;
                zzetVar.zzt.zzay();
                c4 = 'c';
            }
            zzetVar.zza = c4;
        }
        zzet zzetVar3 = this.zzf;
        j2 = zzetVar3.zzb;
        if (j2 < 0) {
            zzetVar3.zzt.zzf().zzh();
            zzetVar3.zzb = 79000L;
        }
        char charAt = "01VDIWEA?".charAt(this.zza);
        zzet zzetVar4 = this.zzf;
        c3 = zzetVar4.zza;
        j3 = zzetVar4.zzb;
        String str = "2" + charAt + c3 + j3 + ":" + zzet.zzo(true, this.zzb, this.zzc, this.zzd, this.zze);
        if (str.length() > 1024) {
            str = this.zzb.substring(0, 1024);
        }
        zzfg zzfgVar = zzm.zzb;
        if (zzfgVar != null) {
            zzfgVar.zzb(str, 1L);
        }
    }
}
