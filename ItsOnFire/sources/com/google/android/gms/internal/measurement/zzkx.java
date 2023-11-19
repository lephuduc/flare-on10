package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzkx;
import com.google.android.gms.internal.measurement.zzlb;
import java.io.IOException;

/* loaded from: classes.dex */
public class zzkx<MessageType extends zzlb<MessageType, BuilderType>, BuilderType extends zzkx<MessageType, BuilderType>> extends zzjj<MessageType, BuilderType> {
    public zzlb zza;
    private final zzlb zzb;

    public zzkx(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzbR()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = messagetype.zzbD();
    }

    private static void zza(Object obj, Object obj2) {
        zzmq.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.zzjj
    /* renamed from: zzaA */
    public final zzkx zzav() {
        zzkx zzkxVar = (zzkx) this.zzb.zzl(5, null, null);
        zzkxVar.zza = zzaF();
        return zzkxVar;
    }

    public final zzkx zzaB(zzlb zzlbVar) {
        if (!this.zzb.equals(zzlbVar)) {
            if (!this.zza.zzbR()) {
                zzaI();
            }
            zza(this.zza, zzlbVar);
        }
        return this;
    }

    public final zzkx zzaC(byte[] bArr, int i2, int i3, zzkn zzknVar) throws zzll {
        if (!this.zza.zzbR()) {
            zzaI();
        }
        try {
            zzmq.zza().zzb(this.zza.getClass()).zzh(this.zza, bArr, 0, i3, new zzjn(zzknVar));
            return this;
        } catch (zzll e2) {
            throw e2;
        } catch (IOException e3) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e3);
        } catch (IndexOutOfBoundsException unused) {
            throw zzll.zzf();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (r2 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final MessageType zzaD() {
        /*
            r4 = this;
            com.google.android.gms.internal.measurement.zzlb r4 = r4.zzaF()
            r0 = 1
            r1 = 0
            java.lang.Object r2 = r4.zzl(r0, r1, r1)
            java.lang.Byte r2 = (java.lang.Byte) r2
            byte r2 = r2.byteValue()
            if (r2 != r0) goto L13
            goto L30
        L13:
            if (r2 == 0) goto L31
            com.google.android.gms.internal.measurement.zzmq r2 = com.google.android.gms.internal.measurement.zzmq.zza()
            java.lang.Class r3 = r4.getClass()
            com.google.android.gms.internal.measurement.zzmt r2 = r2.zzb(r3)
            boolean r2 = r2.zzk(r4)
            if (r0 == r2) goto L29
            r0 = r1
            goto L2a
        L29:
            r0 = r4
        L2a:
            r3 = 2
            r4.zzl(r3, r0, r1)
            if (r2 == 0) goto L31
        L30:
            return r4
        L31:
            com.google.android.gms.internal.measurement.zznj r0 = new com.google.android.gms.internal.measurement.zznj
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzkx.zzaD():com.google.android.gms.internal.measurement.zzlb");
    }

    @Override // com.google.android.gms.internal.measurement.zzmh
    /* renamed from: zzaE */
    public MessageType zzaF() {
        if (this.zza.zzbR()) {
            this.zza.zzbM();
            return (MessageType) this.zza;
        }
        return (MessageType) this.zza;
    }

    public final void zzaH() {
        if (this.zza.zzbR()) {
            return;
        }
        zzaI();
    }

    public void zzaI() {
        zzlb zzbD = this.zzb.zzbD();
        zza(zzbD, this.zza);
        this.zza = zzbD;
    }

    @Override // com.google.android.gms.internal.measurement.zzjj
    public final /* bridge */ /* synthetic */ zzjj zzaw(byte[] bArr, int i2, int i3) throws zzll {
        zzaC(bArr, 0, i3, zzkn.zza);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzjj
    public final /* bridge */ /* synthetic */ zzjj zzax(byte[] bArr, int i2, int i3, zzkn zzknVar) throws zzll {
        zzaC(bArr, 0, i3, zzknVar);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    public final /* bridge */ /* synthetic */ zzmi zzbV() {
        throw null;
    }
}
