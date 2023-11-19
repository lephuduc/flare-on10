package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzhy implements Runnable {
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zza;
    public final /* synthetic */ zzik zzb;

    public zzhy(zzik zzikVar, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzb = zzikVar;
        this.zza = zzcfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r6 = this;
            com.google.android.gms.measurement.internal.zzik r0 = r6.zzb
            com.google.android.gms.measurement.internal.zzgd r0 = r0.zzt
            com.google.android.gms.measurement.internal.zzkp r0 = r0.zzu()
            com.google.android.gms.internal.measurement.zzqr.zzc()
            com.google.android.gms.measurement.internal.zzgd r1 = r0.zzt
            com.google.android.gms.measurement.internal.zzag r1 = r1.zzf()
            com.google.android.gms.measurement.internal.zzef r2 = com.google.android.gms.measurement.internal.zzeg.zzau
            r3 = 0
            boolean r1 = r1.zzs(r3, r2)
            if (r1 == 0) goto L73
            com.google.android.gms.measurement.internal.zzgd r1 = r0.zzt
            com.google.android.gms.measurement.internal.zzfi r1 = r1.zzm()
            com.google.android.gms.measurement.internal.zzhb r1 = r1.zzc()
            com.google.android.gms.measurement.internal.zzha r2 = com.google.android.gms.measurement.internal.zzha.ANALYTICS_STORAGE
            boolean r1 = r1.zzj(r2)
            if (r1 != 0) goto L39
            com.google.android.gms.measurement.internal.zzgd r0 = r0.zzt
            com.google.android.gms.measurement.internal.zzet r0 = r0.zzaA()
            com.google.android.gms.measurement.internal.zzer r0 = r0.zzl()
            java.lang.String r1 = "Analytics storage consent denied; will not get session id"
            goto L7f
        L39:
            com.google.android.gms.measurement.internal.zzgd r1 = r0.zzt
            com.google.android.gms.measurement.internal.zzfi r1 = r1.zzm()
            com.google.android.gms.measurement.internal.zzgd r2 = r0.zzt
            com.google.android.gms.common.util.Clock r2 = r2.zzax()
            long r4 = r2.currentTimeMillis()
            boolean r1 = r1.zzk(r4)
            if (r1 != 0) goto L82
            com.google.android.gms.measurement.internal.zzgd r1 = r0.zzt
            com.google.android.gms.measurement.internal.zzfi r1 = r1.zzm()
            com.google.android.gms.measurement.internal.zzfe r1 = r1.zzk
            long r1 = r1.zza()
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L62
            goto L82
        L62:
            com.google.android.gms.measurement.internal.zzgd r0 = r0.zzt
            com.google.android.gms.measurement.internal.zzfi r0 = r0.zzm()
            com.google.android.gms.measurement.internal.zzfe r0 = r0.zzk
            long r0 = r0.zza()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L83
        L73:
            com.google.android.gms.measurement.internal.zzgd r0 = r0.zzt
            com.google.android.gms.measurement.internal.zzet r0 = r0.zzaA()
            com.google.android.gms.measurement.internal.zzer r0 = r0.zzl()
            java.lang.String r1 = "getSessionId has been disabled."
        L7f:
            r0.zza(r1)
        L82:
            r0 = r3
        L83:
            if (r0 == 0) goto L97
            com.google.android.gms.measurement.internal.zzik r1 = r6.zzb
            com.google.android.gms.measurement.internal.zzgd r1 = r1.zzt
            com.google.android.gms.measurement.internal.zzlp r1 = r1.zzv()
            com.google.android.gms.internal.measurement.zzcf r6 = r6.zza
            long r2 = r0.longValue()
            r1.zzV(r6, r2)
            return
        L97:
            com.google.android.gms.internal.measurement.zzcf r0 = r6.zza     // Catch: android.os.RemoteException -> L9d
            r0.zze(r3)     // Catch: android.os.RemoteException -> L9d
            return
        L9d:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzik r6 = r6.zzb
            com.google.android.gms.measurement.internal.zzgd r6 = r6.zzt
            com.google.android.gms.measurement.internal.zzet r6 = r6.zzaA()
            com.google.android.gms.measurement.internal.zzer r6 = r6.zzd()
            java.lang.String r1 = "getSessionId failed with exception"
            r6.zzb(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhy.run():void");
    }
}
