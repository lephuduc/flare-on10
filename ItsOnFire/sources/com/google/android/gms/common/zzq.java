package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.Nullable;

@SafeParcelable.Class(creator = "GoogleCertificatesLookupResponseCreator")
/* loaded from: classes.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzr();
    @SafeParcelable.Field(getter = "getResult", id = 1)
    private final boolean zza;
    @Nullable
    @SafeParcelable.Field(getter = "getErrorMessage", id = 2)
    private final String zzb;
    @SafeParcelable.Field(getter = "getStatusValue", id = 3)
    private final int zzc;
    @SafeParcelable.Field(getter = "getFirstPartyStatusValue", id = 4)
    private final int zzd;

    @SafeParcelable.Constructor
    public zzq(@SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) int i3) {
        this.zza = z;
        this.zzb = str;
        this.zzc = zzy.zza(i2) - 1;
        this.zzd = zzd.zza(i3) - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.zza);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Nullable
    public final String zza() {
        return this.zzb;
    }

    public final boolean zzb() {
        return this.zza;
    }

    public final int zzc() {
        return zzd.zza(this.zzd);
    }

    public final int zzd() {
        return zzy.zza(this.zzc);
    }
}
