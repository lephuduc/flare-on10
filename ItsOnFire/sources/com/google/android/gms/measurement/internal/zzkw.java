package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzrd;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzkw extends zzkt {
    public zzkw(zzlh zzlhVar) {
        super(zzlhVar);
    }

    private final String zzd(String str) {
        String zzi = this.zzf.zzm().zzi(str);
        if (TextUtils.isEmpty(zzi)) {
            return (String) zzeg.zzq.zza(null);
        }
        Uri parse = Uri.parse((String) zzeg.zzq.zza(null));
        Uri.Builder buildUpon = parse.buildUpon();
        String authority = parse.getAuthority();
        buildUpon.authority(zzi + "." + authority);
        return buildUpon.build().toString();
    }

    public final zzkv zza(String str) {
        zzrd.zzc();
        zzkv zzkvVar = null;
        if (this.zzt.zzf().zzs(null, zzeg.zzaq)) {
            this.zzt.zzaA().zzj().zza("sgtm feature flag enabled.");
            zzh zzj = this.zzf.zzh().zzj(str);
            if (zzj == null) {
                return new zzkv(zzd(str));
            }
            if (zzj.zzap()) {
                this.zzt.zzaA().zzj().zza("sgtm upload enabled in manifest.");
                com.google.android.gms.internal.measurement.zzff zze = this.zzf.zzm().zze(zzj.zzv());
                if (zze != null) {
                    String zzj2 = zze.zzj();
                    if (!TextUtils.isEmpty(zzj2)) {
                        String zzi = zze.zzi();
                        this.zzt.zzaA().zzj().zzc("sgtm configured with upload_url, server_info", zzj2, true != TextUtils.isEmpty(zzi) ? "N" : "Y");
                        if (TextUtils.isEmpty(zzi)) {
                            this.zzt.zzay();
                            zzkvVar = new zzkv(zzj2);
                        } else {
                            HashMap hashMap = new HashMap();
                            hashMap.put("x-google-sgtm-server-info", zzi);
                            zzkvVar = new zzkv(zzj2, hashMap);
                        }
                    }
                }
            }
            if (zzkvVar != null) {
                return zzkvVar;
            }
        }
        return new zzkv(zzd(str));
    }
}
