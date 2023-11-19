package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: Access modifiers changed from: package-private */
@TargetApi(14)
@MainThread
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzij implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ zzik zza;

    public zzij(zzik zzikVar) {
        this.zza = zzikVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onActivityCreated(android.app.Activity r9, android.os.Bundle r10) {
        /*
            r8 = this;
            com.google.android.gms.measurement.internal.zzik r0 = r8.zza     // Catch: java.lang.Throwable -> Lb8 java.lang.RuntimeException -> Lba
            com.google.android.gms.measurement.internal.zzgd r0 = r0.zzt     // Catch: java.lang.Throwable -> Lb8 java.lang.RuntimeException -> Lba
            com.google.android.gms.measurement.internal.zzet r0 = r0.zzaA()     // Catch: java.lang.Throwable -> Lb8 java.lang.RuntimeException -> Lba
            com.google.android.gms.measurement.internal.zzer r0 = r0.zzj()     // Catch: java.lang.Throwable -> Lb8 java.lang.RuntimeException -> Lba
            java.lang.String r1 = "onActivityCreated"
            r0.zza(r1)     // Catch: java.lang.Throwable -> Lb8 java.lang.RuntimeException -> Lba
            android.content.Intent r0 = r9.getIntent()     // Catch: java.lang.Throwable -> Lb8 java.lang.RuntimeException -> Lba
            if (r0 != 0) goto L23
        L17:
            com.google.android.gms.measurement.internal.zzik r8 = r8.zza
            com.google.android.gms.measurement.internal.zzgd r8 = r8.zzt
            com.google.android.gms.measurement.internal.zziz r8 = r8.zzs()
            r8.zzr(r9, r10)
            return
        L23:
            com.google.android.gms.internal.measurement.zzpb.zzc()     // Catch: java.lang.Throwable -> Lb8 java.lang.RuntimeException -> Lba
            com.google.android.gms.measurement.internal.zzik r1 = r8.zza     // Catch: java.lang.Throwable -> Lb8 java.lang.RuntimeException -> Lba
            com.google.android.gms.measurement.internal.zzgd r1 = r1.zzt     // Catch: java.lang.Throwable -> Lb8 java.lang.RuntimeException -> Lba
            com.google.android.gms.measurement.internal.zzag r1 = r1.zzf()     // Catch: java.lang.Throwable -> Lb8 java.lang.RuntimeException -> Lba
            com.google.android.gms.measurement.internal.zzef r2 = com.google.android.gms.measurement.internal.zzeg.zzaF     // Catch: java.lang.Throwable -> Lb8 java.lang.RuntimeException -> Lba
            r3 = 0
            boolean r1 = r1.zzs(r3, r2)     // Catch: java.lang.Throwable -> Lb8 java.lang.RuntimeException -> Lba
            if (r1 != 0) goto L3d
            android.net.Uri r3 = r0.getData()     // Catch: java.lang.Throwable -> Lb8 java.lang.RuntimeException -> Lba
        L3b:
            r4 = r3
            goto L63
        L3d:
            android.net.Uri r1 = r0.getData()     // Catch: java.lang.Throwable -> Lb8 java.lang.RuntimeException -> Lba
            if (r1 == 0) goto L4c
            boolean r2 = r1.isHierarchical()     // Catch: java.lang.Throwable -> Lb8 java.lang.RuntimeException -> Lba
            if (r2 != 0) goto L4a
            goto L4c
        L4a:
            r4 = r1
            goto L63
        L4c:
            android.os.Bundle r1 = r0.getExtras()     // Catch: java.lang.Throwable -> Lb8 java.lang.RuntimeException -> Lba
            if (r1 == 0) goto L3b
            java.lang.String r2 = "com.android.vending.referral_url"
            java.lang.String r1 = r1.getString(r2)     // Catch: java.lang.Throwable -> Lb8 java.lang.RuntimeException -> Lba
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Lb8 java.lang.RuntimeException -> Lba
            if (r2 != 0) goto L3b
            android.net.Uri r3 = android.net.Uri.parse(r1)     // Catch: java.lang.Throwable -> Lb8 java.lang.RuntimeException -> Lba
            goto L3b
        L63:
            if (r4 == 0) goto L17
            boolean r1 = r4.isHierarchical()     // Catch: java.lang.Throwable -> Lb8 java.lang.RuntimeException -> Lba
            if (r1 != 0) goto L6c
            goto L17
        L6c:
            com.google.android.gms.measurement.internal.zzik r1 = r8.zza     // Catch: java.lang.Throwable -> Lb8 java.lang.RuntimeException -> Lba
            com.google.android.gms.measurement.internal.zzgd r1 = r1.zzt     // Catch: java.lang.Throwable -> Lb8 java.lang.RuntimeException -> Lba
            r1.zzv()     // Catch: java.lang.Throwable -> Lb8 java.lang.RuntimeException -> Lba
            java.lang.String r1 = "android.intent.extra.REFERRER_NAME"
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch: java.lang.Throwable -> Lb8 java.lang.RuntimeException -> Lba
            java.lang.String r1 = "android-app://com.google.android.googlequicksearchbox/https/www.google.com"
            boolean r1 = r1.equals(r0)     // Catch: java.lang.Throwable -> Lb8 java.lang.RuntimeException -> Lba
            if (r1 != 0) goto L95
            java.lang.String r1 = "https://www.google.com"
            boolean r1 = r1.equals(r0)     // Catch: java.lang.Throwable -> Lb8 java.lang.RuntimeException -> Lba
            if (r1 != 0) goto L95
            java.lang.String r1 = "android-app://com.google.appcrawler"
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> Lb8 java.lang.RuntimeException -> Lba
            if (r0 == 0) goto L92
            goto L95
        L92:
            java.lang.String r0 = "auto"
            goto L97
        L95:
            java.lang.String r0 = "gs"
        L97:
            r5 = r0
            java.lang.String r0 = "referrer"
            java.lang.String r6 = r4.getQueryParameter(r0)     // Catch: java.lang.Throwable -> Lb8 java.lang.RuntimeException -> Lba
            if (r10 != 0) goto La2
            r0 = 1
            goto La3
        La2:
            r0 = 0
        La3:
            r3 = r0
            com.google.android.gms.measurement.internal.zzik r0 = r8.zza     // Catch: java.lang.Throwable -> Lb8 java.lang.RuntimeException -> Lba
            com.google.android.gms.measurement.internal.zzgd r0 = r0.zzt     // Catch: java.lang.Throwable -> Lb8 java.lang.RuntimeException -> Lba
            com.google.android.gms.measurement.internal.zzga r0 = r0.zzaB()     // Catch: java.lang.Throwable -> Lb8 java.lang.RuntimeException -> Lba
            com.google.android.gms.measurement.internal.zzii r7 = new com.google.android.gms.measurement.internal.zzii     // Catch: java.lang.Throwable -> Lb8 java.lang.RuntimeException -> Lba
            r1 = r7
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lb8 java.lang.RuntimeException -> Lba
            r0.zzp(r7)     // Catch: java.lang.Throwable -> Lb8 java.lang.RuntimeException -> Lba
            goto L17
        Lb8:
            r0 = move-exception
            goto Lce
        Lba:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzik r1 = r8.zza     // Catch: java.lang.Throwable -> Lb8
            com.google.android.gms.measurement.internal.zzgd r1 = r1.zzt     // Catch: java.lang.Throwable -> Lb8
            com.google.android.gms.measurement.internal.zzet r1 = r1.zzaA()     // Catch: java.lang.Throwable -> Lb8
            com.google.android.gms.measurement.internal.zzer r1 = r1.zzd()     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r2 = "Throwable caught in onActivityCreated"
            r1.zzb(r2, r0)     // Catch: java.lang.Throwable -> Lb8
            goto L17
        Lce:
            com.google.android.gms.measurement.internal.zzik r8 = r8.zza
            com.google.android.gms.measurement.internal.zzgd r8 = r8.zzt
            com.google.android.gms.measurement.internal.zziz r8 = r8.zzs()
            r8.zzr(r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzij.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.zza.zzt.zzs().zzs(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityPaused(Activity activity) {
        this.zza.zzt.zzs().zzt(activity);
        zzkp zzu = this.zza.zzt.zzu();
        zzu.zzt.zzaB().zzp(new zzki(zzu, zzu.zzt.zzax().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityResumed(Activity activity) {
        zzkp zzu = this.zza.zzt.zzu();
        zzu.zzt.zzaB().zzp(new zzkh(zzu, zzu.zzt.zzax().elapsedRealtime()));
        this.zza.zzt.zzs().zzu(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.zza.zzt.zzs().zzv(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
