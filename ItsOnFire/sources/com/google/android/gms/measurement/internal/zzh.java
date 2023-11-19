package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzh {
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    @Nullable
    private String zzE;
    private boolean zzF;
    private long zzG;
    private long zzH;
    private final zzgd zza;
    private final String zzb;
    @Nullable
    private String zzc;
    @Nullable
    private String zzd;
    @Nullable
    private String zze;
    @Nullable
    private String zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    @Nullable
    private String zzj;
    private long zzk;
    @Nullable
    private String zzl;
    private long zzm;
    private long zzn;
    private boolean zzo;
    private boolean zzp;
    @Nullable
    private String zzq;
    @Nullable
    private Boolean zzr;
    private long zzs;
    @Nullable
    private List zzt;
    @Nullable
    private String zzu;
    private boolean zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    @WorkerThread
    public zzh(zzgd zzgdVar, String str) {
        Preconditions.checkNotNull(zzgdVar);
        Preconditions.checkNotEmpty(str);
        this.zza = zzgdVar;
        this.zzb = str;
        zzgdVar.zzaB().zzg();
    }

    @Nullable
    @WorkerThread
    public final String zzA() {
        this.zza.zzaB().zzg();
        return this.zzd;
    }

    @Nullable
    @WorkerThread
    public final String zzB() {
        this.zza.zzaB().zzg();
        return this.zzE;
    }

    @Nullable
    @WorkerThread
    public final String zzC() {
        this.zza.zzaB().zzg();
        return this.zze;
    }

    @Nullable
    @WorkerThread
    public final String zzD() {
        this.zza.zzaB().zzg();
        return this.zzu;
    }

    @Nullable
    @WorkerThread
    public final List zzE() {
        this.zza.zzaB().zzg();
        return this.zzt;
    }

    @WorkerThread
    public final void zzF() {
        this.zza.zzaB().zzg();
        this.zzF = false;
    }

    @WorkerThread
    public final void zzG() {
        this.zza.zzaB().zzg();
        long j2 = this.zzg + 1;
        if (j2 > 2147483647L) {
            this.zza.zzaA().zzk().zzb("Bundle index overflow. appId", zzet.zzn(this.zzb));
            j2 = 0;
        }
        this.zzF = true;
        this.zzg = j2;
    }

    @WorkerThread
    public final void zzH(@Nullable String str) {
        this.zza.zzaB().zzg();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.zzF |= true ^ zzg.zza(this.zzq, str);
        this.zzq = str;
    }

    @WorkerThread
    public final void zzI(boolean z) {
        this.zza.zzaB().zzg();
        this.zzF |= this.zzp != z;
        this.zzp = z;
    }

    @WorkerThread
    public final void zzJ(@Nullable String str) {
        this.zza.zzaB().zzg();
        this.zzF |= !zzg.zza(this.zzc, str);
        this.zzc = str;
    }

    @WorkerThread
    public final void zzK(@Nullable String str) {
        this.zza.zzaB().zzg();
        this.zzF |= !zzg.zza(this.zzl, str);
        this.zzl = str;
    }

    @WorkerThread
    public final void zzL(@Nullable String str) {
        this.zza.zzaB().zzg();
        this.zzF |= !zzg.zza(this.zzj, str);
        this.zzj = str;
    }

    @WorkerThread
    public final void zzM(long j2) {
        this.zza.zzaB().zzg();
        this.zzF |= this.zzk != j2;
        this.zzk = j2;
    }

    @WorkerThread
    public final void zzN(long j2) {
        this.zza.zzaB().zzg();
        this.zzF |= this.zzG != j2;
        this.zzG = j2;
    }

    @WorkerThread
    public final void zzO(long j2) {
        this.zza.zzaB().zzg();
        this.zzF |= this.zzB != j2;
        this.zzB = j2;
    }

    @WorkerThread
    public final void zzP(long j2) {
        this.zza.zzaB().zzg();
        this.zzF |= this.zzC != j2;
        this.zzC = j2;
    }

    @WorkerThread
    public final void zzQ(long j2) {
        this.zza.zzaB().zzg();
        this.zzF |= this.zzA != j2;
        this.zzA = j2;
    }

    @WorkerThread
    public final void zzR(long j2) {
        this.zza.zzaB().zzg();
        this.zzF |= this.zzz != j2;
        this.zzz = j2;
    }

    @WorkerThread
    public final void zzS(long j2) {
        this.zza.zzaB().zzg();
        this.zzF |= this.zzD != j2;
        this.zzD = j2;
    }

    @WorkerThread
    public final void zzT(long j2) {
        this.zza.zzaB().zzg();
        this.zzF |= this.zzy != j2;
        this.zzy = j2;
    }

    @WorkerThread
    public final void zzU(long j2) {
        this.zza.zzaB().zzg();
        this.zzF |= this.zzn != j2;
        this.zzn = j2;
    }

    @WorkerThread
    public final void zzV(long j2) {
        this.zza.zzaB().zzg();
        this.zzF |= this.zzs != j2;
        this.zzs = j2;
    }

    @WorkerThread
    public final void zzW(long j2) {
        this.zza.zzaB().zzg();
        this.zzF |= this.zzH != j2;
        this.zzH = j2;
    }

    @WorkerThread
    public final void zzX(@Nullable String str) {
        this.zza.zzaB().zzg();
        this.zzF |= !zzg.zza(this.zzf, str);
        this.zzf = str;
    }

    @WorkerThread
    public final void zzY(@Nullable String str) {
        this.zza.zzaB().zzg();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.zzF |= true ^ zzg.zza(this.zzd, str);
        this.zzd = str;
    }

    @WorkerThread
    public final void zzZ(long j2) {
        this.zza.zzaB().zzg();
        this.zzF |= this.zzm != j2;
        this.zzm = j2;
    }

    @WorkerThread
    public final long zza() {
        this.zza.zzaB().zzg();
        return 0L;
    }

    @WorkerThread
    public final void zzaa(@Nullable String str) {
        this.zza.zzaB().zzg();
        this.zzF |= !zzg.zza(this.zzE, str);
        this.zzE = str;
    }

    @WorkerThread
    public final void zzab(long j2) {
        this.zza.zzaB().zzg();
        this.zzF |= this.zzi != j2;
        this.zzi = j2;
    }

    @WorkerThread
    public final void zzac(long j2) {
        Preconditions.checkArgument(j2 >= 0);
        this.zza.zzaB().zzg();
        this.zzF |= this.zzg != j2;
        this.zzg = j2;
    }

    @WorkerThread
    public final void zzad(long j2) {
        this.zza.zzaB().zzg();
        this.zzF |= this.zzh != j2;
        this.zzh = j2;
    }

    @WorkerThread
    public final void zzae(boolean z) {
        this.zza.zzaB().zzg();
        this.zzF |= this.zzo != z;
        this.zzo = z;
    }

    @WorkerThread
    public final void zzaf(@Nullable Boolean bool) {
        this.zza.zzaB().zzg();
        this.zzF |= !zzg.zza(this.zzr, bool);
        this.zzr = bool;
    }

    @WorkerThread
    public final void zzag(@Nullable String str) {
        this.zza.zzaB().zzg();
        this.zzF |= !zzg.zza(this.zze, str);
        this.zze = str;
    }

    @WorkerThread
    public final void zzah(@Nullable List list) {
        this.zza.zzaB().zzg();
        if (zzg.zza(this.zzt, list)) {
            return;
        }
        this.zzF = true;
        this.zzt = list != null ? new ArrayList(list) : null;
    }

    @WorkerThread
    public final void zzai(@Nullable String str) {
        this.zza.zzaB().zzg();
        this.zzF |= !zzg.zza(this.zzu, str);
        this.zzu = str;
    }

    @WorkerThread
    public final void zzaj(long j2) {
        this.zza.zzaB().zzg();
        this.zzF |= this.zzx != j2;
        this.zzx = j2;
    }

    @WorkerThread
    public final void zzak(boolean z) {
        this.zza.zzaB().zzg();
        this.zzF |= this.zzv != z;
        this.zzv = z;
    }

    @WorkerThread
    public final void zzal(long j2) {
        this.zza.zzaB().zzg();
        this.zzF |= this.zzw != j2;
        this.zzw = j2;
    }

    @WorkerThread
    public final boolean zzam() {
        this.zza.zzaB().zzg();
        return this.zzp;
    }

    @WorkerThread
    public final boolean zzan() {
        this.zza.zzaB().zzg();
        return this.zzo;
    }

    @WorkerThread
    public final boolean zzao() {
        this.zza.zzaB().zzg();
        return this.zzF;
    }

    @WorkerThread
    public final boolean zzap() {
        this.zza.zzaB().zzg();
        return this.zzv;
    }

    @WorkerThread
    public final long zzb() {
        this.zza.zzaB().zzg();
        return this.zzk;
    }

    @WorkerThread
    public final long zzc() {
        this.zza.zzaB().zzg();
        return this.zzG;
    }

    @WorkerThread
    public final long zzd() {
        this.zza.zzaB().zzg();
        return this.zzB;
    }

    @WorkerThread
    public final long zze() {
        this.zza.zzaB().zzg();
        return this.zzC;
    }

    @WorkerThread
    public final long zzf() {
        this.zza.zzaB().zzg();
        return this.zzA;
    }

    @WorkerThread
    public final long zzg() {
        this.zza.zzaB().zzg();
        return this.zzz;
    }

    @WorkerThread
    public final long zzh() {
        this.zza.zzaB().zzg();
        return this.zzD;
    }

    @WorkerThread
    public final long zzi() {
        this.zza.zzaB().zzg();
        return this.zzy;
    }

    @WorkerThread
    public final long zzj() {
        this.zza.zzaB().zzg();
        return this.zzn;
    }

    @WorkerThread
    public final long zzk() {
        this.zza.zzaB().zzg();
        return this.zzs;
    }

    @WorkerThread
    public final long zzl() {
        this.zza.zzaB().zzg();
        return this.zzH;
    }

    @WorkerThread
    public final long zzm() {
        this.zza.zzaB().zzg();
        return this.zzm;
    }

    @WorkerThread
    public final long zzn() {
        this.zza.zzaB().zzg();
        return this.zzi;
    }

    @WorkerThread
    public final long zzo() {
        this.zza.zzaB().zzg();
        return this.zzg;
    }

    @WorkerThread
    public final long zzp() {
        this.zza.zzaB().zzg();
        return this.zzh;
    }

    @WorkerThread
    public final long zzq() {
        this.zza.zzaB().zzg();
        return this.zzx;
    }

    @WorkerThread
    public final long zzr() {
        this.zza.zzaB().zzg();
        return this.zzw;
    }

    @Nullable
    @WorkerThread
    public final Boolean zzs() {
        this.zza.zzaB().zzg();
        return this.zzr;
    }

    @Nullable
    @WorkerThread
    public final String zzt() {
        this.zza.zzaB().zzg();
        return this.zzq;
    }

    @Nullable
    @WorkerThread
    public final String zzu() {
        this.zza.zzaB().zzg();
        String str = this.zzE;
        zzaa(null);
        return str;
    }

    @WorkerThread
    public final String zzv() {
        this.zza.zzaB().zzg();
        return this.zzb;
    }

    @Nullable
    @WorkerThread
    public final String zzw() {
        this.zza.zzaB().zzg();
        return this.zzc;
    }

    @Nullable
    @WorkerThread
    public final String zzx() {
        this.zza.zzaB().zzg();
        return this.zzl;
    }

    @Nullable
    @WorkerThread
    public final String zzy() {
        this.zza.zzaB().zzg();
        return this.zzj;
    }

    @Nullable
    @WorkerThread
    public final String zzz() {
        this.zza.zzaB().zzg();
        return this.zzf;
    }
}
