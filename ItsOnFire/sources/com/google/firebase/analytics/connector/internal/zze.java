package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class zze implements zza {
    public final Set zza;
    private final AnalyticsConnector.AnalyticsConnectorListener zzb;
    private final AppMeasurementSdk zzc;
    private final zzd zzd;

    public zze(AppMeasurementSdk appMeasurementSdk, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        this.zzb = analyticsConnectorListener;
        this.zzc = appMeasurementSdk;
        zzd zzdVar = new zzd(this);
        this.zzd = zzdVar;
        appMeasurementSdk.registerOnMeasurementEventListener(zzdVar);
        this.zza = new HashSet();
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final AnalyticsConnector.AnalyticsConnectorListener zza() {
        return this.zzb;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0010 A[SYNTHETIC] */
    @Override // com.google.firebase.analytics.connector.internal.zza
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzb(java.util.Set r9) {
        /*
            r8 = this;
            java.util.Set r0 = r8.zza
            r0.clear()
            java.util.Set r8 = r8.zza
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r9 = r9.iterator()
        L10:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto La0
            java.lang.Object r1 = r9.next()
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r0.size()
            r3 = 50
            if (r2 < r3) goto L26
            goto La0
        L26:
            int r2 = com.google.firebase.analytics.connector.internal.zzc.zza
            r2 = 95
            r3 = 0
            if (r1 != 0) goto L2f
        L2d:
            r4 = r3
            goto L62
        L2f:
            int r4 = r1.length()
            if (r4 != 0) goto L36
            goto L2d
        L36:
            int r4 = r1.codePointAt(r3)
            boolean r5 = java.lang.Character.isLetter(r4)
            if (r5 != 0) goto L44
            if (r4 == r2) goto L43
            goto L2d
        L43:
            r4 = r2
        L44:
            int r5 = r1.length()
            int r4 = java.lang.Character.charCount(r4)
        L4c:
            if (r4 >= r5) goto L61
            int r6 = r1.codePointAt(r4)
            if (r6 == r2) goto L5b
            boolean r7 = java.lang.Character.isLetterOrDigit(r6)
            if (r7 != 0) goto L5b
            goto L2d
        L5b:
            int r6 = java.lang.Character.charCount(r6)
            int r4 = r4 + r6
            goto L4c
        L61:
            r4 = 1
        L62:
            if (r4 == 0) goto L10
            int r4 = r1.length()
            if (r4 == 0) goto L10
            int r3 = r1.codePointAt(r3)
            boolean r4 = java.lang.Character.isLetter(r3)
            if (r4 == 0) goto L10
            int r4 = r1.length()
            int r3 = java.lang.Character.charCount(r3)
        L7c:
            if (r3 >= r4) goto L90
            int r5 = r1.codePointAt(r3)
            if (r5 == r2) goto L8a
            boolean r6 = java.lang.Character.isLetterOrDigit(r5)
            if (r6 == 0) goto L10
        L8a:
            int r5 = java.lang.Character.charCount(r5)
            int r3 = r3 + r5
            goto L7c
        L90:
            java.lang.String r2 = com.google.android.gms.measurement.internal.zzhc.zzb(r1)
            if (r2 != 0) goto L97
            goto L98
        L97:
            r1 = r2
        L98:
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            r0.add(r1)
            goto L10
        La0:
            r8.addAll(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.analytics.connector.internal.zze.zzb(java.util.Set):void");
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zzc() {
        this.zza.clear();
    }
}
