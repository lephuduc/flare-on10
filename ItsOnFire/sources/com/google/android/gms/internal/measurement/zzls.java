package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class zzls extends zzlw {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzls() {
        super(null);
    }

    public /* synthetic */ zzls(zzlr zzlrVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzlw
    public final void zza(Object obj, long j2) {
        Object unmodifiableList;
        List list = (List) zznu.zzf(obj, j2);
        if (list instanceof zzlq) {
            unmodifiableList = ((zzlq) list).zze();
        } else if (zza.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof zzmp) && (list instanceof zzli)) {
                zzli zzliVar = (zzli) list;
                if (zzliVar.zzc()) {
                    zzliVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zznu.zzs(obj, j2, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    @Override // com.google.android.gms.internal.measurement.zzlw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzb(java.lang.Object r4, java.lang.Object r5, long r6) {
        /*
            r3 = this;
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zznu.zzf(r5, r6)
            java.util.List r3 = (java.util.List) r3
            int r5 = r3.size()
            java.lang.Object r0 = com.google.android.gms.internal.measurement.zznu.zzf(r4, r6)
            java.util.List r0 = (java.util.List) r0
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L39
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.zzlq
            if (r1 == 0) goto L20
            com.google.android.gms.internal.measurement.zzlp r0 = new com.google.android.gms.internal.measurement.zzlp
            r0.<init>(r5)
            goto L35
        L20:
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.zzmp
            if (r1 == 0) goto L30
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.zzli
            if (r1 == 0) goto L30
            com.google.android.gms.internal.measurement.zzli r0 = (com.google.android.gms.internal.measurement.zzli) r0
            com.google.android.gms.internal.measurement.zzli r5 = r0.zzd(r5)
            r0 = r5
            goto L35
        L30:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r5)
        L35:
            com.google.android.gms.internal.measurement.zznu.zzs(r4, r6, r0)
            goto L8a
        L39:
            java.lang.Class r1 = com.google.android.gms.internal.measurement.zzls.zza
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L57
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r5
            r1.<init>(r2)
            r1.addAll(r0)
        L52:
            com.google.android.gms.internal.measurement.zznu.zzs(r4, r6, r1)
            r0 = r1
            goto L8a
        L57:
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.zznp
            if (r1 == 0) goto L6f
            com.google.android.gms.internal.measurement.zzlp r1 = new com.google.android.gms.internal.measurement.zzlp
            int r2 = r0.size()
            int r2 = r2 + r5
            r1.<init>(r2)
            com.google.android.gms.internal.measurement.zznp r0 = (com.google.android.gms.internal.measurement.zznp) r0
            int r5 = r1.size()
            r1.addAll(r5, r0)
            goto L52
        L6f:
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.zzmp
            if (r1 == 0) goto L8a
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.zzli
            if (r1 == 0) goto L8a
            r1 = r0
            com.google.android.gms.internal.measurement.zzli r1 = (com.google.android.gms.internal.measurement.zzli) r1
            boolean r2 = r1.zzc()
            if (r2 != 0) goto L8a
            int r0 = r0.size()
            int r0 = r0 + r5
            com.google.android.gms.internal.measurement.zzli r0 = r1.zzd(r0)
            goto L35
        L8a:
            int r5 = r0.size()
            int r1 = r3.size()
            if (r5 <= 0) goto L99
            if (r1 <= 0) goto L99
            r0.addAll(r3)
        L99:
            if (r5 > 0) goto L9c
            goto L9d
        L9c:
            r3 = r0
        L9d:
            com.google.android.gms.internal.measurement.zznu.zzs(r4, r6, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzls.zzb(java.lang.Object, java.lang.Object, long):void");
    }
}
