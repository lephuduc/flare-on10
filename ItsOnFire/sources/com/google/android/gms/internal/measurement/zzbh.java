package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbh extends zzaw {
    public zzbh() {
        this.zza.add(zzbl.FOR_IN);
        this.zza.add(zzbl.FOR_IN_CONST);
        this.zza.add(zzbl.FOR_IN_LET);
        this.zza.add(zzbl.FOR_LET);
        this.zza.add(zzbl.FOR_OF);
        this.zza.add(zzbl.FOR_OF_CONST);
        this.zza.add(zzbl.FOR_OF_LET);
        this.zza.add(zzbl.WHILE);
    }

    private static zzap zzc(zzbf zzbfVar, Iterator it, zzap zzapVar) {
        if (it != null) {
            while (it.hasNext()) {
                zzap zzc = zzbfVar.zza((zzap) it.next()).zzc((zzae) zzapVar);
                if (zzc instanceof zzag) {
                    zzag zzagVar = (zzag) zzc;
                    if ("break".equals(zzagVar.zzc())) {
                        return zzap.zzf;
                    }
                    if ("return".equals(zzagVar.zzc())) {
                        return zzagVar;
                    }
                }
            }
        }
        return zzap.zzf;
    }

    private static zzap zzd(zzbf zzbfVar, zzap zzapVar, zzap zzapVar2) {
        return zzc(zzbfVar, zzapVar.zzl(), zzapVar2);
    }

    private static zzap zze(zzbf zzbfVar, zzap zzapVar, zzap zzapVar2) {
        if (zzapVar instanceof Iterable) {
            return zzc(zzbfVar, ((Iterable) zzapVar).iterator(), zzapVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    @Override // com.google.android.gms.internal.measurement.zzaw
    public final zzap zza(String str, zzg zzgVar, List list) {
        zzbl zzblVar = zzbl.ADD;
        int ordinal = zzh.zze(str).ordinal();
        if (ordinal == 65) {
            zzh.zzh(zzbl.WHILE.name(), 4, list);
            zzap zzapVar = (zzap) list.get(0);
            zzap zzapVar2 = (zzap) list.get(1);
            zzap zzb = zzgVar.zzb((zzap) list.get(3));
            if (zzgVar.zzb((zzap) list.get(2)).zzg().booleanValue()) {
                zzap zzc = zzgVar.zzc((zzae) zzb);
                if (zzc instanceof zzag) {
                    zzag zzagVar = (zzag) zzc;
                    if (!"break".equals(zzagVar.zzc())) {
                        if ("return".equals(zzagVar.zzc())) {
                            return zzagVar;
                        }
                    }
                    return zzap.zzf;
                }
            }
            while (zzgVar.zzb(zzapVar).zzg().booleanValue()) {
                zzap zzc2 = zzgVar.zzc((zzae) zzb);
                if (zzc2 instanceof zzag) {
                    zzag zzagVar2 = (zzag) zzc2;
                    if ("break".equals(zzagVar2.zzc())) {
                        break;
                    } else if ("return".equals(zzagVar2.zzc())) {
                        return zzagVar2;
                    }
                }
                zzgVar.zzb(zzapVar2);
            }
            return zzap.zzf;
        }
        switch (ordinal) {
            case 26:
                zzh.zzh(zzbl.FOR_IN.name(), 3, list);
                if (list.get(0) instanceof zzat) {
                    return zzd(new zzbg(zzgVar, ((zzap) list.get(0)).zzi()), zzgVar.zzb((zzap) list.get(1)), zzgVar.zzb((zzap) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
            case 27:
                zzh.zzh(zzbl.FOR_IN_CONST.name(), 3, list);
                if (list.get(0) instanceof zzat) {
                    return zzd(new zzbd(zzgVar, ((zzap) list.get(0)).zzi()), zzgVar.zzb((zzap) list.get(1)), zzgVar.zzb((zzap) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
            case 28:
                zzh.zzh(zzbl.FOR_IN_LET.name(), 3, list);
                if (list.get(0) instanceof zzat) {
                    return zzd(new zzbe(zzgVar, ((zzap) list.get(0)).zzi()), zzgVar.zzb((zzap) list.get(1)), zzgVar.zzb((zzap) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
            case 29:
                zzh.zzh(zzbl.FOR_LET.name(), 4, list);
                zzap zzb2 = zzgVar.zzb((zzap) list.get(0));
                if (zzb2 instanceof zzae) {
                    zzae zzaeVar = (zzae) zzb2;
                    zzap zzapVar3 = (zzap) list.get(1);
                    zzap zzapVar4 = (zzap) list.get(2);
                    zzap zzb3 = zzgVar.zzb((zzap) list.get(3));
                    zzg zza = zzgVar.zza();
                    for (int i2 = 0; i2 < zzaeVar.zzc(); i2++) {
                        String zzi = zzaeVar.zze(i2).zzi();
                        zza.zzg(zzi, zzgVar.zzd(zzi));
                    }
                    while (zzgVar.zzb(zzapVar3).zzg().booleanValue()) {
                        zzap zzc3 = zzgVar.zzc((zzae) zzb3);
                        if (zzc3 instanceof zzag) {
                            zzag zzagVar3 = (zzag) zzc3;
                            if ("break".equals(zzagVar3.zzc())) {
                                return zzap.zzf;
                            }
                            if ("return".equals(zzagVar3.zzc())) {
                                return zzagVar3;
                            }
                        }
                        zzg zza2 = zzgVar.zza();
                        for (int i3 = 0; i3 < zzaeVar.zzc(); i3++) {
                            String zzi2 = zzaeVar.zze(i3).zzi();
                            zza2.zzg(zzi2, zza.zzd(zzi2));
                        }
                        zza2.zzb(zzapVar4);
                        zza = zza2;
                    }
                    return zzap.zzf;
                }
                throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
            case 30:
                zzh.zzh(zzbl.FOR_OF.name(), 3, list);
                if (list.get(0) instanceof zzat) {
                    return zze(new zzbg(zzgVar, ((zzap) list.get(0)).zzi()), zzgVar.zzb((zzap) list.get(1)), zzgVar.zzb((zzap) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
            case 31:
                zzh.zzh(zzbl.FOR_OF_CONST.name(), 3, list);
                if (list.get(0) instanceof zzat) {
                    return zze(new zzbd(zzgVar, ((zzap) list.get(0)).zzi()), zzgVar.zzb((zzap) list.get(1)), zzgVar.zzb((zzap) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
            case 32:
                zzh.zzh(zzbl.FOR_OF_LET.name(), 3, list);
                if (list.get(0) instanceof zzat) {
                    return zze(new zzbe(zzgVar, ((zzap) list.get(0)).zzi()), zzgVar.zzb((zzap) list.get(1)), zzgVar.zzb((zzap) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
            default:
                return super.zzb(str);
        }
    }
}
