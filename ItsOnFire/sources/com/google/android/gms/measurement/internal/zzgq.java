package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzpz;
import com.google.android.gms.internal.measurement.zzqu;
import j.y0;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class zzgq implements Callable {
    public final /* synthetic */ zzau zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzgv zzc;

    public zzgq(zzgv zzgvVar, zzau zzauVar, String str) {
        this.zzc = zzgvVar;
        this.zza = zzauVar;
        this.zzb = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzlh zzlhVar;
        zzlh zzlhVar2;
        zzlm zzlmVar;
        com.google.android.gms.internal.measurement.zzgc zzgcVar;
        zzh zzhVar;
        String str;
        Bundle bundle;
        zzaq zzc;
        long j2;
        zzlhVar = this.zzc.zza;
        zzlhVar.zzA();
        zzlhVar2 = this.zzc.zza;
        zzip zzr = zzlhVar2.zzr();
        zzau zzauVar = this.zza;
        String str2 = this.zzb;
        zzr.zzg();
        zzgd.zzO();
        Preconditions.checkNotNull(zzauVar);
        Preconditions.checkNotEmpty(str2);
        if (!zzr.zzt.zzf().zzs(str2, zzeg.zzU)) {
            zzr.zzt.zzaA().zzc().zzb("Generating ScionPayload disabled. packageName", str2);
            return new byte[0];
        } else if (!"_iap".equals(zzauVar.zza) && !"_iapx".equals(zzauVar.zza)) {
            zzr.zzt.zzaA().zzc().zzc("Generating a payload for this event is not available. package_name, event_name", str2, zzauVar.zza);
            return null;
        } else {
            com.google.android.gms.internal.measurement.zzga zza = com.google.android.gms.internal.measurement.zzgb.zza();
            zzr.zzf.zzh().zzw();
            try {
                zzh zzj = zzr.zzf.zzh().zzj(str2);
                if (zzj == null) {
                    zzr.zzt.zzaA().zzc().zzb("Log and bundle not available. package_name", str2);
                } else if (zzj.zzan()) {
                    com.google.android.gms.internal.measurement.zzgc zzu = com.google.android.gms.internal.measurement.zzgd.zzu();
                    zzu.zzad(1);
                    zzu.zzZ("android");
                    if (!TextUtils.isEmpty(zzj.zzv())) {
                        zzu.zzD(zzj.zzv());
                    }
                    if (!TextUtils.isEmpty(zzj.zzx())) {
                        zzu.zzF((String) Preconditions.checkNotNull(zzj.zzx()));
                    }
                    if (!TextUtils.isEmpty(zzj.zzy())) {
                        zzu.zzG((String) Preconditions.checkNotNull(zzj.zzy()));
                    }
                    if (zzj.zzb() != -2147483648L) {
                        zzu.zzH((int) zzj.zzb());
                    }
                    zzu.zzV(zzj.zzm());
                    zzu.zzP(zzj.zzk());
                    String zzA = zzj.zzA();
                    String zzt = zzj.zzt();
                    if (!TextUtils.isEmpty(zzA)) {
                        zzu.zzU(zzA);
                    } else if (!TextUtils.isEmpty(zzt)) {
                        zzu.zzC(zzt);
                    }
                    zzpz.zzc();
                    if (zzr.zzt.zzf().zzs(null, zzeg.zzaE)) {
                        zzu.zzaj(zzj.zzr());
                    }
                    zzhb zzq = zzr.zzf.zzq(str2);
                    zzu.zzM(zzj.zzj());
                    if (zzr.zzt.zzJ() && zzr.zzt.zzf().zzt(zzu.zzaq()) && zzq.zzj(zzha.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                        zzu.zzO(null);
                    }
                    zzu.zzL(zzq.zzi());
                    if (zzq.zzj(zzha.AD_STORAGE) && zzj.zzam()) {
                        Pair zzd = zzr.zzf.zzs().zzd(zzj.zzv(), zzq);
                        if (zzj.zzam() && !TextUtils.isEmpty((CharSequence) zzd.first)) {
                            try {
                                zzu.zzae(zzip.zza((String) zzd.first, Long.toString(zzauVar.zzd)));
                                Object obj = zzd.second;
                                if (obj != null) {
                                    zzu.zzX(((Boolean) obj).booleanValue());
                                }
                            } catch (SecurityException e2) {
                                zzr.zzt.zzaA().zzc().zzb("Resettable device id encryption failed", e2.getMessage());
                            }
                        }
                    }
                    zzr.zzt.zzg().zzv();
                    zzu.zzN(Build.MODEL);
                    zzr.zzt.zzg().zzv();
                    zzu.zzY(Build.VERSION.RELEASE);
                    zzu.zzak((int) zzr.zzt.zzg().zzb());
                    zzu.zzao(zzr.zzt.zzg().zzc());
                    try {
                        if (zzq.zzj(zzha.ANALYTICS_STORAGE) && zzj.zzw() != null) {
                            zzu.zzE(zzip.zza((String) Preconditions.checkNotNull(zzj.zzw()), Long.toString(zzauVar.zzd)));
                        }
                        if (!TextUtils.isEmpty(zzj.zzz())) {
                            zzu.zzT((String) Preconditions.checkNotNull(zzj.zzz()));
                        }
                        String zzv = zzj.zzv();
                        List zzu2 = zzr.zzf.zzh().zzu(zzv);
                        Iterator it = zzu2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                zzlmVar = null;
                                break;
                            }
                            zzlmVar = (zzlm) it.next();
                            if ("_lte".equals(zzlmVar.zzc)) {
                                break;
                            }
                        }
                        if (zzlmVar == null || zzlmVar.zze == null) {
                            zzlm zzlmVar2 = new zzlm(zzv, y0.f581c, "_lte", zzr.zzt.zzax().currentTimeMillis(), 0L);
                            zzu2.add(zzlmVar2);
                            zzr.zzf.zzh().zzL(zzlmVar2);
                        }
                        zzlj zzu3 = zzr.zzf.zzu();
                        zzu3.zzt.zzaA().zzj().zza("Checking account type status for ad personalization signals");
                        if (zzu3.zzt.zzg().zze()) {
                            String zzv2 = zzj.zzv();
                            Preconditions.checkNotNull(zzv2);
                            if (zzj.zzam() && zzu3.zzf.zzm().zzn(zzv2)) {
                                zzu3.zzt.zzaA().zzc().zza("Turning off ad personalization due to account type");
                                Iterator it2 = zzu2.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    } else if ("_npa".equals(((zzlm) it2.next()).zzc)) {
                                        it2.remove();
                                        break;
                                    }
                                }
                                zzu2.add(new zzlm(zzv2, y0.f581c, "_npa", zzu3.zzt.zzax().currentTimeMillis(), 1L));
                            }
                        }
                        com.google.android.gms.internal.measurement.zzgm[] zzgmVarArr = new com.google.android.gms.internal.measurement.zzgm[zzu2.size()];
                        for (int i2 = 0; i2 < zzu2.size(); i2++) {
                            com.google.android.gms.internal.measurement.zzgl zzd2 = com.google.android.gms.internal.measurement.zzgm.zzd();
                            zzd2.zzf(((zzlm) zzu2.get(i2)).zzc);
                            zzd2.zzg(((zzlm) zzu2.get(i2)).zzd);
                            zzr.zzf.zzu().zzv(zzd2, ((zzlm) zzu2.get(i2)).zze);
                            zzgmVarArr[i2] = (com.google.android.gms.internal.measurement.zzgm) zzd2.zzaD();
                        }
                        zzu.zzj(Arrays.asList(zzgmVarArr));
                        zzeu zzb = zzeu.zzb(zzauVar);
                        zzr.zzt.zzv().zzL(zzb.zzd, zzr.zzf.zzh().zzi(str2));
                        zzr.zzt.zzv().zzN(zzb, zzr.zzt.zzf().zzd(str2));
                        Bundle bundle2 = zzb.zzd;
                        bundle2.putLong("_c", 1L);
                        zzr.zzt.zzaA().zzc().zza("Marking in-app purchase as real-time");
                        bundle2.putLong("_r", 1L);
                        bundle2.putString("_o", zzauVar.zzc);
                        if (zzr.zzt.zzv().zzaf(zzu.zzaq())) {
                            zzr.zzt.zzv().zzP(bundle2, "_dbg", 1L);
                            zzr.zzt.zzv().zzP(bundle2, "_r", 1L);
                        }
                        zzaq zzn = zzr.zzf.zzh().zzn(str2, zzauVar.zza);
                        if (zzn == null) {
                            zzgcVar = zzu;
                            zzhVar = zzj;
                            str = str2;
                            bundle = bundle2;
                            zzc = new zzaq(str2, zzauVar.zza, 0L, 0L, 0L, zzauVar.zzd, 0L, null, null, null, null);
                            j2 = 0;
                        } else {
                            zzgcVar = zzu;
                            zzhVar = zzj;
                            str = str2;
                            bundle = bundle2;
                            long j3 = zzn.zzf;
                            zzc = zzn.zzc(zzauVar.zzd);
                            j2 = j3;
                        }
                        zzr.zzf.zzh().zzE(zzc);
                        zzap zzapVar = new zzap(zzr.zzt, zzauVar.zzc, str, zzauVar.zza, zzauVar.zzd, j2, bundle);
                        com.google.android.gms.internal.measurement.zzfs zze = com.google.android.gms.internal.measurement.zzft.zze();
                        zze.zzm(zzapVar.zzd);
                        zze.zzi(zzapVar.zzb);
                        zze.zzl(zzapVar.zze);
                        zzar zzarVar = new zzar(zzapVar.zzf);
                        while (zzarVar.hasNext()) {
                            String next = zzarVar.next();
                            com.google.android.gms.internal.measurement.zzfw zze2 = com.google.android.gms.internal.measurement.zzfx.zze();
                            zze2.zzj(next);
                            Object zzf = zzapVar.zzf.zzf(next);
                            if (zzf != null) {
                                zzr.zzf.zzu().zzu(zze2, zzf);
                                zze.zze(zze2);
                            }
                        }
                        com.google.android.gms.internal.measurement.zzgc zzgcVar2 = zzgcVar;
                        zzgcVar2.zzk(zze);
                        com.google.android.gms.internal.measurement.zzge zza2 = com.google.android.gms.internal.measurement.zzgg.zza();
                        com.google.android.gms.internal.measurement.zzfu zza3 = com.google.android.gms.internal.measurement.zzfv.zza();
                        zza3.zza(zzc.zzc);
                        zza3.zzb(zzauVar.zza);
                        zza2.zza(zza3);
                        zzgcVar2.zzaa(zza2);
                        zzgcVar2.zzf(zzr.zzf.zzf().zza(zzhVar.zzv(), Collections.emptyList(), zzgcVar2.zzau(), Long.valueOf(zze.zzc()), Long.valueOf(zze.zzc())));
                        if (zze.zzq()) {
                            zzgcVar2.zzai(zze.zzc());
                            zzgcVar2.zzQ(zze.zzc());
                        }
                        long zzn2 = zzhVar.zzn();
                        int i3 = (zzn2 > 0L ? 1 : (zzn2 == 0L ? 0 : -1));
                        if (i3 != 0) {
                            zzgcVar2.zzab(zzn2);
                        }
                        long zzp = zzhVar.zzp();
                        if (zzp != 0) {
                            zzgcVar2.zzac(zzp);
                        } else if (i3 != 0) {
                            zzgcVar2.zzac(zzn2);
                        }
                        String zzD = zzhVar.zzD();
                        zzqu.zzc();
                        String str3 = str;
                        if (zzr.zzt.zzf().zzs(str3, zzeg.zzao) && zzD != null) {
                            zzgcVar2.zzah(zzD);
                        }
                        zzhVar.zzG();
                        zzgcVar2.zzI((int) zzhVar.zzo());
                        zzr.zzt.zzf().zzh();
                        zzgcVar2.zzam(79000L);
                        zzgcVar2.zzal(zzr.zzt.zzax().currentTimeMillis());
                        zzgcVar2.zzag(true);
                        if (zzr.zzt.zzf().zzs(null, zzeg.zzas)) {
                            zzr.zzf.zzC(zzgcVar2.zzaq(), zzgcVar2);
                        }
                        zza.zza(zzgcVar2);
                        zzh zzhVar2 = zzhVar;
                        zzhVar2.zzad(zzgcVar2.zzd());
                        zzhVar2.zzab(zzgcVar2.zzc());
                        zzr.zzf.zzh().zzD(zzhVar2);
                        zzr.zzf.zzh().zzC();
                        try {
                            return zzr.zzf.zzu().zzz(((com.google.android.gms.internal.measurement.zzgb) zza.zzaD()).zzbx());
                        } catch (IOException e3) {
                            zzr.zzt.zzaA().zzd().zzc("Data loss. Failed to bundle and serialize. appId", zzet.zzn(str3), e3);
                            return null;
                        }
                    } catch (SecurityException e4) {
                        zzr.zzt.zzaA().zzc().zzb("app instance id encryption failed", e4.getMessage());
                    }
                } else {
                    zzr.zzt.zzaA().zzc().zzb("Log and bundle disabled. package_name", str2);
                }
                return new byte[0];
            } finally {
                zzr.zzf.zzh().zzx();
            }
        }
    }
}
