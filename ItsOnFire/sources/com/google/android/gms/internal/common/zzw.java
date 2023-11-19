package com.google.android.gms.internal.common;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzw extends zzj {
    public final CharSequence zzb;
    public final zzo zzc;
    public final boolean zzd;
    public int zze = 0;
    public int zzf;

    public zzw(zzx zzxVar, CharSequence charSequence) {
        zzo zzoVar;
        boolean z;
        zzoVar = zzxVar.zza;
        this.zzc = zzoVar;
        z = zzxVar.zzb;
        this.zzd = z;
        this.zzf = Integer.MAX_VALUE;
        this.zzb = charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
        if (r0 >= r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
        r5.zzb.charAt(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r0 >= r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
        r5.zzb.charAt(r1 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r5.zzd == false) goto L33;
     */
    @Override // com.google.android.gms.internal.common.zzj
    @javax.annotation.CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ java.lang.Object zza() {
        /*
            r5 = this;
        L0:
            int r0 = r5.zze
        L2:
            int r1 = r5.zze
            r2 = -1
            if (r1 == r2) goto L6a
            int r1 = r5.zzd(r1)
            if (r1 != r2) goto L17
            java.lang.CharSequence r1 = r5.zzb
            int r1 = r1.length()
            r5.zze = r2
            r3 = r2
            goto L1d
        L17:
            int r3 = r5.zzc(r1)
            r5.zze = r3
        L1d:
            if (r3 != r0) goto L2e
            int r3 = r3 + 1
            r5.zze = r3
            java.lang.CharSequence r1 = r5.zzb
            int r1 = r1.length()
            if (r3 <= r1) goto L2
            r5.zze = r2
            goto L2
        L2e:
            if (r0 >= r1) goto L35
            java.lang.CharSequence r3 = r5.zzb
            r3.charAt(r0)
        L35:
            if (r0 >= r1) goto L3e
            java.lang.CharSequence r3 = r5.zzb
            int r4 = r1 + (-1)
            r3.charAt(r4)
        L3e:
            boolean r3 = r5.zzd
            if (r3 == 0) goto L45
            if (r0 != r1) goto L45
            goto L0
        L45:
            int r3 = r5.zzf
            r4 = 1
            if (r3 != r4) goto L5c
            java.lang.CharSequence r1 = r5.zzb
            int r1 = r1.length()
            r5.zze = r2
            if (r1 <= r0) goto L5f
            java.lang.CharSequence r2 = r5.zzb
            int r3 = r1 + (-1)
            r2.charAt(r3)
            goto L5f
        L5c:
            int r3 = r3 + r2
            r5.zzf = r3
        L5f:
            java.lang.CharSequence r5 = r5.zzb
            java.lang.CharSequence r5 = r5.subSequence(r0, r1)
            java.lang.String r5 = r5.toString()
            goto L6e
        L6a:
            r5.zzb()
            r5 = 0
        L6e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.common.zzw.zza():java.lang.Object");
    }

    public abstract int zzc(int i2);

    public abstract int zzd(int i2);
}
