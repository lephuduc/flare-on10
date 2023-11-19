package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.BinderThread;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.UidVerifier;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class zzgv extends zzei {
    private final zzlh zza;
    private Boolean zzb;
    private String zzc;

    public zzgv(zzlh zzlhVar, String str) {
        Preconditions.checkNotNull(zzlhVar);
        this.zza = zzlhVar;
        this.zzc = null;
    }

    private final void zzA(zzau zzauVar, zzq zzqVar) {
        this.zza.zzA();
        this.zza.zzE(zzauVar, zzqVar);
    }

    @BinderThread
    private final void zzy(zzq zzqVar, boolean z) {
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzz(zzqVar.zza, false);
        this.zza.zzv().zzY(zzqVar.zzb, zzqVar.zzq);
    }

    @BinderThread
    private final void zzz(String str, boolean z) {
        boolean z2;
        if (TextUtils.isEmpty(str)) {
            this.zza.zzaA().zzd().zza("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.zzb == null) {
                    if (!"com.google.android.gms".equals(this.zzc) && !UidVerifier.isGooglePlayServicesUid(this.zza.zzaw(), Binder.getCallingUid()) && !GoogleSignatureVerifier.getInstance(this.zza.zzaw()).isUidGoogleSigned(Binder.getCallingUid())) {
                        z2 = false;
                        this.zzb = Boolean.valueOf(z2);
                    }
                    z2 = true;
                    this.zzb = Boolean.valueOf(z2);
                }
                if (this.zzb.booleanValue()) {
                    return;
                }
            } catch (SecurityException e2) {
                this.zza.zzaA().zzd().zzb("Measurement Service called with invalid calling package. appId", zzet.zzn(str));
                throw e2;
            }
        }
        if (this.zzc == null && GooglePlayServicesUtilLight.uidHasPackageName(this.zza.zzaw(), Binder.getCallingUid(), str)) {
            this.zzc = str;
        }
        if (str.equals(this.zzc)) {
            return;
        }
        throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
    }

    @VisibleForTesting
    public final zzau zzb(zzau zzauVar, zzq zzqVar) {
        zzas zzasVar;
        if (Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(zzauVar.zza) && (zzasVar = zzauVar.zzb) != null && zzasVar.zza() != 0) {
            String zzg = zzauVar.zzb.zzg("_cis");
            if ("referrer broadcast".equals(zzg) || "referrer API".equals(zzg)) {
                this.zza.zzaA().zzi().zzb("Event has been filtered ", zzauVar.toString());
                return new zzau("_cmpx", zzauVar.zzb, zzauVar.zzc, zzauVar.zzd);
            }
        }
        return zzauVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final String zzd(zzq zzqVar) {
        zzy(zzqVar, false);
        return this.zza.zzx(zzqVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final List zze(zzq zzqVar, boolean z) {
        zzy(zzqVar, false);
        String str = zzqVar.zza;
        Preconditions.checkNotNull(str);
        try {
            List<zzlm> list = (List) this.zza.zzaB().zzh(new zzgs(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzlm zzlmVar : list) {
                if (z || !zzlp.zzaj(zzlmVar.zzc)) {
                    arrayList.add(new zzlk(zzlmVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e2) {
            this.zza.zzaA().zzd().zzc("Failed to get user properties. appId", zzet.zzn(zzqVar.zza), e2);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final List zzf(String str, String str2, zzq zzqVar) {
        zzy(zzqVar, false);
        String str3 = zzqVar.zza;
        Preconditions.checkNotNull(str3);
        try {
            return (List) this.zza.zzaB().zzh(new zzgj(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e2) {
            this.zza.zzaA().zzd().zzb("Failed to get conditional user properties", e2);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final List zzg(String str, String str2, String str3) {
        zzz(str, true);
        try {
            return (List) this.zza.zzaB().zzh(new zzgk(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e2) {
            this.zza.zzaA().zzd().zzb("Failed to get conditional user properties as", e2);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final List zzh(String str, String str2, boolean z, zzq zzqVar) {
        zzy(zzqVar, false);
        String str3 = zzqVar.zza;
        Preconditions.checkNotNull(str3);
        try {
            List<zzlm> list = (List) this.zza.zzaB().zzh(new zzgh(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzlm zzlmVar : list) {
                if (z || !zzlp.zzaj(zzlmVar.zzc)) {
                    arrayList.add(new zzlk(zzlmVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e2) {
            this.zza.zzaA().zzd().zzc("Failed to query user properties. appId", zzet.zzn(zzqVar.zza), e2);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final List zzi(String str, String str2, String str3, boolean z) {
        zzz(str, true);
        try {
            List<zzlm> list = (List) this.zza.zzaB().zzh(new zzgi(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzlm zzlmVar : list) {
                if (z || !zzlp.zzaj(zzlmVar.zzc)) {
                    arrayList.add(new zzlk(zzlmVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e2) {
            this.zza.zzaA().zzd().zzc("Failed to get user properties as. appId", zzet.zzn(str), e2);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final void zzj(zzq zzqVar) {
        zzy(zzqVar, false);
        zzx(new zzgt(this, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final void zzk(zzau zzauVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzauVar);
        zzy(zzqVar, false);
        zzx(new zzgo(this, zzauVar, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final void zzl(zzau zzauVar, String str, String str2) {
        Preconditions.checkNotNull(zzauVar);
        Preconditions.checkNotEmpty(str);
        zzz(str, true);
        zzx(new zzgp(this, zzauVar, str));
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final void zzm(zzq zzqVar) {
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzz(zzqVar.zza, false);
        zzx(new zzgl(this, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final void zzn(zzac zzacVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotNull(zzacVar.zzc);
        zzy(zzqVar, false);
        zzac zzacVar2 = new zzac(zzacVar);
        zzacVar2.zza = zzqVar.zza;
        zzx(new zzgf(this, zzacVar2, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final void zzo(zzac zzacVar) {
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotNull(zzacVar.zzc);
        Preconditions.checkNotEmpty(zzacVar.zza);
        zzz(zzacVar.zza, true);
        zzx(new zzgg(this, new zzac(zzacVar)));
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final void zzp(zzq zzqVar) {
        Preconditions.checkNotEmpty(zzqVar.zza);
        Preconditions.checkNotNull(zzqVar.zzv);
        zzgn zzgnVar = new zzgn(this, zzqVar);
        Preconditions.checkNotNull(zzgnVar);
        if (this.zza.zzaB().zzs()) {
            zzgnVar.run();
        } else {
            this.zza.zzaB().zzq(zzgnVar);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final void zzq(long j2, String str, String str2, String str3) {
        zzx(new zzgu(this, str2, str3, str, j2));
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final void zzr(final Bundle bundle, zzq zzqVar) {
        zzy(zzqVar, false);
        final String str = zzqVar.zza;
        Preconditions.checkNotNull(str);
        zzx(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzge
            @Override // java.lang.Runnable
            public final void run() {
                zzgv.this.zzw(str, bundle);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final void zzs(zzq zzqVar) {
        zzy(zzqVar, false);
        zzx(new zzgm(this, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final void zzt(zzlk zzlkVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzlkVar);
        zzy(zzqVar, false);
        zzx(new zzgr(this, zzlkVar, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @BinderThread
    public final byte[] zzu(zzau zzauVar, String str) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzauVar);
        zzz(str, true);
        this.zza.zzaA().zzc().zzb("Log and bundle. event", this.zza.zzi().zzd(zzauVar.zza));
        long nanoTime = this.zza.zzax().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) this.zza.zzaB().zzi(new zzgq(this, zzauVar, str)).get();
            if (bArr == null) {
                this.zza.zzaA().zzd().zzb("Log and bundle returned null. appId", zzet.zzn(str));
                bArr = new byte[0];
            }
            this.zza.zzaA().zzc().zzd("Log and bundle processed. event, size, time_ms", this.zza.zzi().zzd(zzauVar.zza), Integer.valueOf(bArr.length), Long.valueOf((this.zza.zzax().nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e2) {
            this.zza.zzaA().zzd().zzd("Failed to log and bundle. appId, event, error", zzet.zzn(str), this.zza.zzi().zzd(zzauVar.zza), e2);
            return null;
        }
    }

    public final void zzv(zzau zzauVar, zzq zzqVar) {
        zzer zzj;
        String str;
        String str2;
        if (!this.zza.zzm().zzo(zzqVar.zza)) {
            zzA(zzauVar, zzqVar);
            return;
        }
        this.zza.zzaA().zzj().zzb("EES config found for", zzqVar.zza);
        zzfu zzm = this.zza.zzm();
        String str3 = zzqVar.zza;
        com.google.android.gms.internal.measurement.zzc zzcVar = TextUtils.isEmpty(str3) ? null : (com.google.android.gms.internal.measurement.zzc) zzm.zzd.get(str3);
        if (zzcVar != null) {
            try {
                Map zzt = this.zza.zzu().zzt(zzauVar.zzb.zzc(), true);
                String zza = zzhc.zza(zzauVar.zza);
                if (zza == null) {
                    zza = zzauVar.zza;
                }
                if (zzcVar.zze(new com.google.android.gms.internal.measurement.zzaa(zza, zzauVar.zzd, zzt))) {
                    if (zzcVar.zzg()) {
                        this.zza.zzaA().zzj().zzb("EES edited event", zzauVar.zza);
                        zzauVar = this.zza.zzu().zzj(zzcVar.zza().zzb());
                    }
                    zzA(zzauVar, zzqVar);
                    if (zzcVar.zzf()) {
                        for (com.google.android.gms.internal.measurement.zzaa zzaaVar : zzcVar.zza().zzc()) {
                            this.zza.zzaA().zzj().zzb("EES logging created event", zzaaVar.zzd());
                            zzA(this.zza.zzu().zzj(zzaaVar), zzqVar);
                        }
                        return;
                    }
                    return;
                }
            } catch (com.google.android.gms.internal.measurement.zzd unused) {
                this.zza.zzaA().zzd().zzc("EES error. appId, eventName", zzqVar.zzb, zzauVar.zza);
            }
            zzj = this.zza.zzaA().zzj();
            str = zzauVar.zza;
            str2 = "EES was not applied to event";
        } else {
            zzj = this.zza.zzaA().zzj();
            str = zzqVar.zza;
            str2 = "EES not loaded for";
        }
        zzj.zzb(str2, str);
        zzA(zzauVar, zzqVar);
    }

    public final /* synthetic */ void zzw(String str, Bundle bundle) {
        zzak zzh = this.zza.zzh();
        zzh.zzg();
        zzh.zzW();
        byte[] zzbx = zzh.zzf.zzu().zzl(new zzap(zzh.zzt, "", str, "dep", 0L, 0L, bundle)).zzbx();
        zzh.zzt.zzaA().zzj().zzc("Saving default event parameters, appId, data size", zzh.zzt.zzj().zzd(str), Integer.valueOf(zzbx.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", zzbx);
        try {
            if (zzh.zzh().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                zzh.zzt.zzaA().zzd().zzb("Failed to insert default event parameters (got -1). appId", zzet.zzn(str));
            }
        } catch (SQLiteException e2) {
            zzh.zzt.zzaA().zzd().zzc("Error storing default event parameters. appId", zzet.zzn(str), e2);
        }
    }

    @VisibleForTesting
    public final void zzx(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        if (this.zza.zzaB().zzs()) {
            runnable.run();
        } else {
            this.zza.zzaB().zzp(runnable);
        }
    }
}
