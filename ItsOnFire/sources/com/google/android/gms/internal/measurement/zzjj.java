package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjj;
import com.google.android.gms.internal.measurement.zzjk;

/* loaded from: classes.dex */
public abstract class zzjj<MessageType extends zzjk<MessageType, BuilderType>, BuilderType extends zzjj<MessageType, BuilderType>> implements zzmh {
    @Override // 
    /* renamed from: zzav */
    public abstract zzjj clone();

    public zzjj zzaw(byte[] bArr, int i2, int i3) throws zzll {
        throw null;
    }

    public zzjj zzax(byte[] bArr, int i2, int i3, zzkn zzknVar) throws zzll {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzmh
    public final /* synthetic */ zzmh zzay(byte[] bArr) throws zzll {
        return zzaw(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.measurement.zzmh
    public final /* synthetic */ zzmh zzaz(byte[] bArr, zzkn zzknVar) throws zzll {
        return zzax(bArr, 0, bArr.length, zzknVar);
    }
}
