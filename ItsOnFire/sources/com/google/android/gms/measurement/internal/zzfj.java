package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.measurement.zzra;
import com.google.firebase.messaging.Constants;
import j.y0;

/* loaded from: classes.dex */
final class zzfj implements Runnable {
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzbr zza;
    public final /* synthetic */ ServiceConnection zzb;
    public final /* synthetic */ zzfk zzc;

    public zzfj(zzfk zzfkVar, com.google.android.gms.internal.measurement.zzbr zzbrVar, ServiceConnection serviceConnection) {
        this.zzc = zzfkVar;
        this.zza = zzbrVar;
        this.zzb = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        Bundle bundle;
        zzer zzd;
        String str2;
        zzfk zzfkVar = this.zzc;
        zzfl zzflVar = zzfkVar.zza;
        str = zzfkVar.zzb;
        com.google.android.gms.internal.measurement.zzbr zzbrVar = this.zza;
        ServiceConnection serviceConnection = this.zzb;
        zzflVar.zza.zzaB().zzg();
        Bundle bundle2 = new Bundle();
        bundle2.putString("package_name", str);
        try {
            bundle = zzbrVar.zzd(bundle2);
        } catch (Exception e2) {
            zzflVar.zza.zzaA().zzd().zzb("Exception occurred while retrieving the Install Referrer", e2.getMessage());
        }
        if (bundle == null) {
            zzflVar.zza.zzaA().zzd().zza("Install Referrer Service returned a null response");
            bundle = null;
        }
        zzflVar.zza.zzaB().zzg();
        zzgd.zzO();
        if (bundle != null) {
            long j2 = bundle.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j2 == 0) {
                zzd = zzflVar.zza.zzaA().zzk();
                str2 = "Service response is missing Install Referrer install timestamp";
            } else {
                String string = bundle.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    zzd = zzflVar.zza.zzaA().zzd();
                    str2 = "No referrer defined in Install Referrer response";
                } else {
                    zzflVar.zza.zzaA().zzj().zzb("InstallReferrer API result", string);
                    zzlp zzv = zzflVar.zza.zzv();
                    Uri parse = Uri.parse("?".concat(string));
                    zzra.zzc();
                    Bundle zzs = zzv.zzs(parse, zzflVar.zza.zzf().zzs(null, zzeg.zzaw));
                    if (zzs == null) {
                        zzd = zzflVar.zza.zzaA().zzd();
                        str2 = "No campaign params defined in Install Referrer result";
                    } else {
                        String string2 = zzs.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j3 = bundle.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j3 == 0) {
                                zzd = zzflVar.zza.zzaA().zzd();
                                str2 = "Install Referrer is missing click timestamp for ad campaign";
                            } else {
                                zzs.putLong("click_timestamp", j3);
                            }
                        }
                        if (j2 == zzflVar.zza.zzm().zzd.zza()) {
                            zzflVar.zza.zzaA().zzj().zza("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (zzflVar.zza.zzJ()) {
                            zzflVar.zza.zzm().zzd.zzb(j2);
                            zzflVar.zza.zzaA().zzj().zzb("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            zzs.putString("_cis", "referrer API v2");
                            zzflVar.zza.zzq().zzF(y0.f581c, Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, zzs, str);
                        }
                    }
                }
            }
            zzd.zza(str2);
        }
        ConnectionTracker.getInstance().unbindService(zzflVar.zza.zzaw(), serviceConnection);
    }
}
