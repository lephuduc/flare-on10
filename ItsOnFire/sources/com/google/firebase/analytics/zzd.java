package com.google.firebase.analytics;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.measurement.zzef;
import com.google.android.gms.measurement.internal.zzhf;
import com.google.android.gms.measurement.internal.zzhg;
import com.google.android.gms.measurement.internal.zzil;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzd implements zzil {
    public final /* synthetic */ zzef zza;

    public zzd(zzef zzefVar) {
        this.zza = zzefVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    public final int zza(String str) {
        return this.zza.zza(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    public final long zzb() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    @Nullable
    public final Object zzg(int i2) {
        return this.zza.zzi(i2);
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    @Nullable
    public final String zzh() {
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    @Nullable
    public final String zzi() {
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    @Nullable
    public final String zzj() {
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    @Nullable
    public final String zzk() {
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    public final List zzm(@Nullable String str, @Nullable String str2) {
        return this.zza.zzq(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    public final Map zzo(@Nullable String str, @Nullable String str2, boolean z) {
        return this.zza.zzr(str, str2, z);
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    public final void zzp(String str) {
        this.zza.zzv(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    public final void zzq(String str, @Nullable String str2, @Nullable Bundle bundle) {
        this.zza.zzw(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    public final void zzr(String str) {
        this.zza.zzx(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    public final void zzs(String str, String str2, Bundle bundle) {
        this.zza.zzz(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    public final void zzt(String str, String str2, Bundle bundle, long j2) {
        this.zza.zzA(str, str2, bundle, j2);
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    public final void zzu(zzhg zzhgVar) {
        this.zza.zzC(zzhgVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    public final void zzv(Bundle bundle) {
        this.zza.zzE(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    public final void zzw(zzhf zzhfVar) {
        this.zza.zzK(zzhfVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    public final void zzx(zzhg zzhgVar) {
        this.zza.zzP(zzhgVar);
    }
}
