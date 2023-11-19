package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.ComposerKt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzop;
import com.google.android.gms.internal.measurement.zzpz;
import com.google.android.gms.internal.measurement.zzqu;
import com.google.android.gms.internal.measurement.zzrd;
import com.google.firebase.messaging.Constants;
import j.y0;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class zzlh implements zzgy {
    private static volatile zzlh zzb;
    private long zzA;
    private final Map zzB;
    private final Map zzC;
    private zzir zzD;
    private String zzE;
    @VisibleForTesting
    public long zza;
    private final zzfu zzc;
    private final zzez zzd;
    private zzak zze;
    private zzfb zzf;
    private zzks zzg;
    private zzaa zzh;
    private final zzlj zzi;
    private zzip zzj;
    private zzkb zzk;
    private final zzkw zzl;
    private zzfl zzm;
    private final zzgd zzn;
    private boolean zzp;
    private List zzq;
    private int zzr;
    private int zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private FileLock zzw;
    private FileChannel zzx;
    private List zzy;
    private List zzz;
    private boolean zzo = false;
    private final zzlo zzF = new zzlc(this);

    public zzlh(zzli zzliVar, zzgd zzgdVar) {
        Preconditions.checkNotNull(zzliVar);
        this.zzn = zzgd.zzp(zzliVar.zza, null, null);
        this.zzA = -1L;
        this.zzl = new zzkw(this);
        zzlj zzljVar = new zzlj(this);
        zzljVar.zzX();
        this.zzi = zzljVar;
        zzez zzezVar = new zzez(this);
        zzezVar.zzX();
        this.zzd = zzezVar;
        zzfu zzfuVar = new zzfu(this);
        zzfuVar.zzX();
        this.zzc = zzfuVar;
        this.zzB = new HashMap();
        this.zzC = new HashMap();
        zzaB().zzp(new zzkx(this, zzliVar));
    }

    @VisibleForTesting
    public static final void zzaa(com.google.android.gms.internal.measurement.zzfs zzfsVar, int i2, String str) {
        List zzp = zzfsVar.zzp();
        for (int i3 = 0; i3 < zzp.size(); i3++) {
            if ("_err".equals(((com.google.android.gms.internal.measurement.zzfx) zzp.get(i3)).zzg())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.zzfw zze = com.google.android.gms.internal.measurement.zzfx.zze();
        zze.zzj("_err");
        zze.zzi(Long.valueOf(i2).longValue());
        com.google.android.gms.internal.measurement.zzfw zze2 = com.google.android.gms.internal.measurement.zzfx.zze();
        zze2.zzj("_ev");
        zze2.zzk(str);
        zzfsVar.zzf((com.google.android.gms.internal.measurement.zzfx) zze.zzaD());
        zzfsVar.zzf((com.google.android.gms.internal.measurement.zzfx) zze2.zzaD());
    }

    @VisibleForTesting
    public static final void zzab(com.google.android.gms.internal.measurement.zzfs zzfsVar, @NonNull String str) {
        List zzp = zzfsVar.zzp();
        for (int i2 = 0; i2 < zzp.size(); i2++) {
            if (str.equals(((com.google.android.gms.internal.measurement.zzfx) zzp.get(i2)).zzg())) {
                zzfsVar.zzh(i2);
                return;
            }
        }
    }

    @WorkerThread
    private final zzq zzac(String str) {
        zzer zzc;
        String str2;
        String str3;
        String str4 = str;
        zzak zzakVar = this.zze;
        zzal(zzakVar);
        zzh zzj = zzakVar.zzj(str4);
        if (zzj == null || TextUtils.isEmpty(zzj.zzy())) {
            zzc = zzaA().zzc();
            str2 = "No app data available; dropping";
            str3 = str4;
        } else {
            Boolean zzad = zzad(zzj);
            if (zzad == null || zzad.booleanValue()) {
                String zzA = zzj.zzA();
                String zzy = zzj.zzy();
                long zzb2 = zzj.zzb();
                String zzx = zzj.zzx();
                long zzm = zzj.zzm();
                long zzj2 = zzj.zzj();
                boolean zzan = zzj.zzan();
                String zzz = zzj.zzz();
                zzj.zza();
                return new zzq(str, zzA, zzy, zzb2, zzx, zzm, zzj2, (String) null, zzan, false, zzz, 0L, 0L, 0, zzj.zzam(), false, zzj.zzt(), zzj.zzs(), zzj.zzk(), zzj.zzE(), (String) null, zzq(str).zzi(), "", (String) null, zzj.zzap(), zzj.zzr());
            }
            zzc = zzaA().zzd();
            str2 = "App version does not match; dropping. appId";
            str3 = zzet.zzn(str);
        }
        zzc.zzb(str2, str3);
        return null;
    }

    @WorkerThread
    private final Boolean zzad(zzh zzhVar) {
        try {
            if (zzhVar.zzb() != -2147483648L) {
                if (zzhVar.zzb() == Wrappers.packageManager(this.zzn.zzaw()).getPackageInfo(zzhVar.zzv(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = Wrappers.packageManager(this.zzn.zzaw()).getPackageInfo(zzhVar.zzv(), 0).versionName;
                String zzy = zzhVar.zzy();
                if (zzy != null && zzy.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @WorkerThread
    private final void zzae() {
        zzaB().zzg();
        if (this.zzt || this.zzu || this.zzv) {
            zzaA().zzj().zzd("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zzt), Boolean.valueOf(this.zzu), Boolean.valueOf(this.zzv));
            return;
        }
        zzaA().zzj().zza("Stopping uploading service(s)");
        List<Runnable> list = this.zzq;
        if (list == null) {
            return;
        }
        for (Runnable runnable : list) {
            runnable.run();
        }
        ((List) Preconditions.checkNotNull(this.zzq)).clear();
    }

    @VisibleForTesting
    private final void zzaf(com.google.android.gms.internal.measurement.zzgc zzgcVar, long j2, boolean z) {
        zzak zzakVar = this.zze;
        zzal(zzakVar);
        String str = true != z ? "_lte" : "_se";
        zzlm zzp = zzakVar.zzp(zzgcVar.zzaq(), str);
        zzlm zzlmVar = (zzp == null || zzp.zze == null) ? new zzlm(zzgcVar.zzaq(), y0.f581c, str, zzax().currentTimeMillis(), Long.valueOf(j2)) : new zzlm(zzgcVar.zzaq(), y0.f581c, str, zzax().currentTimeMillis(), Long.valueOf(((Long) zzp.zze).longValue() + j2));
        com.google.android.gms.internal.measurement.zzgl zzd = com.google.android.gms.internal.measurement.zzgm.zzd();
        zzd.zzf(str);
        zzd.zzg(zzax().currentTimeMillis());
        zzd.zze(((Long) zzlmVar.zze).longValue());
        com.google.android.gms.internal.measurement.zzgm zzgmVar = (com.google.android.gms.internal.measurement.zzgm) zzd.zzaD();
        int zza = zzlj.zza(zzgcVar, str);
        if (zza >= 0) {
            zzgcVar.zzan(zza, zzgmVar);
        } else {
            zzgcVar.zzm(zzgmVar);
        }
        if (j2 > 0) {
            zzak zzakVar2 = this.zze;
            zzal(zzakVar2);
            zzakVar2.zzL(zzlmVar);
            zzaA().zzj().zzc("Updated engagement user property. scope, value", true != z ? "lifetime" : "session-scoped", zzlmVar.zze);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x021c  */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzag() {
        /*
            Method dump skipped, instructions count: 598
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlh.zzag():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:356|(4:(12:361|362|(1:364)|384|366|367|368|369|(1:371)|372|373|(1:375))|372|373|(0))|385|(1:387)(1:388)|362|(0)|384|366|367|368|369|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0b2b, code lost:
        if (r10 > (com.google.android.gms.measurement.internal.zzag.zzA() + r8)) goto L384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0bf0, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0bf1, code lost:
        r6 = r0;
        r3 = r3.zzt.zzaA().zzd();
        r7 = "Data loss. Failed to serialize bundle. appId";
        r5 = com.google.android.gms.measurement.internal.zzet.zzn(r5.zzy());
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0447 A[Catch: all -> 0x0cc2, TryCatch #0 {all -> 0x0cc2, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ee, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x0399, B:107:0x03bc, B:104:0x03ab, B:129:0x043b, B:131:0x0447, B:134:0x045c, B:136:0x046d, B:138:0x0479, B:153:0x04da, B:141:0x0489, B:143:0x0495, B:146:0x04aa, B:148:0x04bb, B:150:0x04c7, B:111:0x03c4, B:113:0x03d0, B:115:0x03dc, B:127:0x0421, B:119:0x03f9, B:122:0x040b, B:124:0x0411, B:126:0x041b, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0506, B:159:0x0514, B:161:0x051f, B:172:0x0551, B:162:0x0527, B:164:0x0532, B:166:0x0538, B:169:0x0544, B:171:0x054c, B:173:0x0554, B:174:0x0560, B:177:0x0568, B:179:0x057a, B:180:0x0586, B:182:0x058e, B:186:0x05b3, B:188:0x05d8, B:190:0x05e9, B:192:0x05ef, B:194:0x05fb, B:195:0x062c, B:197:0x0632, B:199:0x0640, B:200:0x0644, B:201:0x0647, B:202:0x064a, B:203:0x0658, B:205:0x065e, B:207:0x066e, B:208:0x0675, B:210:0x0681, B:211:0x0688, B:212:0x068b, B:214:0x06cb, B:215:0x06de, B:217:0x06e4, B:220:0x06fe, B:222:0x0719, B:224:0x0732, B:226:0x0737, B:228:0x073b, B:230:0x073f, B:232:0x0749, B:233:0x0753, B:235:0x0757, B:237:0x075d, B:238:0x076b, B:239:0x0774, B:306:0x09be, B:240:0x0780, B:242:0x0797, B:248:0x07b3, B:250:0x07d7, B:251:0x07df, B:253:0x07e5, B:255:0x07f7, B:262:0x0820, B:263:0x0840, B:265:0x084c, B:267:0x0861, B:269:0x08a2, B:273:0x08ba, B:275:0x08c1, B:277:0x08d0, B:279:0x08d4, B:281:0x08d8, B:283:0x08dc, B:284:0x08ea, B:286:0x08f0, B:288:0x090c, B:289:0x0911, B:305:0x09bb, B:290:0x092b, B:292:0x0933, B:296:0x095a, B:298:0x0988, B:299:0x098f, B:300:0x099d, B:301:0x09a1, B:303:0x09ad, B:293:0x0940, B:260:0x080b, B:246:0x079e, B:307:0x09c9, B:309:0x09d6, B:310:0x09dc, B:311:0x09e4, B:313:0x09ea, B:315:0x0a00, B:317:0x0a11, B:337:0x0a85, B:339:0x0a8b, B:341:0x0aa3, B:344:0x0aaa, B:349:0x0ad9, B:351:0x0b1b, B:354:0x0b50, B:355:0x0b54, B:356:0x0b5f, B:358:0x0ba2, B:359:0x0baf, B:361:0x0bbe, B:365:0x0bd8, B:366:0x0bec, B:368:0x0bf1, B:353:0x0b2d, B:345:0x0ab2, B:347:0x0abe, B:348:0x0ac2, B:369:0x0c07, B:370:0x0c1f, B:373:0x0c27, B:374:0x0c2c, B:375:0x0c3c, B:377:0x0c56, B:378:0x0c71, B:379:0x0c7a, B:384:0x0c9e, B:383:0x0c8b, B:318:0x0a29, B:320:0x0a2f, B:322:0x0a39, B:324:0x0a40, B:330:0x0a50, B:332:0x0a57, B:334:0x0a76, B:336:0x0a7d, B:335:0x0a7a, B:331:0x0a54, B:323:0x0a3d, B:183:0x0593, B:185:0x0599, B:387:0x0cb0), top: B:393:0x000e, inners: #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0489 A[Catch: all -> 0x0cc2, TryCatch #0 {all -> 0x0cc2, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ee, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x0399, B:107:0x03bc, B:104:0x03ab, B:129:0x043b, B:131:0x0447, B:134:0x045c, B:136:0x046d, B:138:0x0479, B:153:0x04da, B:141:0x0489, B:143:0x0495, B:146:0x04aa, B:148:0x04bb, B:150:0x04c7, B:111:0x03c4, B:113:0x03d0, B:115:0x03dc, B:127:0x0421, B:119:0x03f9, B:122:0x040b, B:124:0x0411, B:126:0x041b, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0506, B:159:0x0514, B:161:0x051f, B:172:0x0551, B:162:0x0527, B:164:0x0532, B:166:0x0538, B:169:0x0544, B:171:0x054c, B:173:0x0554, B:174:0x0560, B:177:0x0568, B:179:0x057a, B:180:0x0586, B:182:0x058e, B:186:0x05b3, B:188:0x05d8, B:190:0x05e9, B:192:0x05ef, B:194:0x05fb, B:195:0x062c, B:197:0x0632, B:199:0x0640, B:200:0x0644, B:201:0x0647, B:202:0x064a, B:203:0x0658, B:205:0x065e, B:207:0x066e, B:208:0x0675, B:210:0x0681, B:211:0x0688, B:212:0x068b, B:214:0x06cb, B:215:0x06de, B:217:0x06e4, B:220:0x06fe, B:222:0x0719, B:224:0x0732, B:226:0x0737, B:228:0x073b, B:230:0x073f, B:232:0x0749, B:233:0x0753, B:235:0x0757, B:237:0x075d, B:238:0x076b, B:239:0x0774, B:306:0x09be, B:240:0x0780, B:242:0x0797, B:248:0x07b3, B:250:0x07d7, B:251:0x07df, B:253:0x07e5, B:255:0x07f7, B:262:0x0820, B:263:0x0840, B:265:0x084c, B:267:0x0861, B:269:0x08a2, B:273:0x08ba, B:275:0x08c1, B:277:0x08d0, B:279:0x08d4, B:281:0x08d8, B:283:0x08dc, B:284:0x08ea, B:286:0x08f0, B:288:0x090c, B:289:0x0911, B:305:0x09bb, B:290:0x092b, B:292:0x0933, B:296:0x095a, B:298:0x0988, B:299:0x098f, B:300:0x099d, B:301:0x09a1, B:303:0x09ad, B:293:0x0940, B:260:0x080b, B:246:0x079e, B:307:0x09c9, B:309:0x09d6, B:310:0x09dc, B:311:0x09e4, B:313:0x09ea, B:315:0x0a00, B:317:0x0a11, B:337:0x0a85, B:339:0x0a8b, B:341:0x0aa3, B:344:0x0aaa, B:349:0x0ad9, B:351:0x0b1b, B:354:0x0b50, B:355:0x0b54, B:356:0x0b5f, B:358:0x0ba2, B:359:0x0baf, B:361:0x0bbe, B:365:0x0bd8, B:366:0x0bec, B:368:0x0bf1, B:353:0x0b2d, B:345:0x0ab2, B:347:0x0abe, B:348:0x0ac2, B:369:0x0c07, B:370:0x0c1f, B:373:0x0c27, B:374:0x0c2c, B:375:0x0c3c, B:377:0x0c56, B:378:0x0c71, B:379:0x0c7a, B:384:0x0c9e, B:383:0x0c8b, B:318:0x0a29, B:320:0x0a2f, B:322:0x0a39, B:324:0x0a40, B:330:0x0a50, B:332:0x0a57, B:334:0x0a76, B:336:0x0a7d, B:335:0x0a7a, B:331:0x0a54, B:323:0x0a3d, B:183:0x0593, B:185:0x0599, B:387:0x0cb0), top: B:393:0x000e, inners: #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x07d7 A[Catch: all -> 0x0cc2, TryCatch #0 {all -> 0x0cc2, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ee, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x0399, B:107:0x03bc, B:104:0x03ab, B:129:0x043b, B:131:0x0447, B:134:0x045c, B:136:0x046d, B:138:0x0479, B:153:0x04da, B:141:0x0489, B:143:0x0495, B:146:0x04aa, B:148:0x04bb, B:150:0x04c7, B:111:0x03c4, B:113:0x03d0, B:115:0x03dc, B:127:0x0421, B:119:0x03f9, B:122:0x040b, B:124:0x0411, B:126:0x041b, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0506, B:159:0x0514, B:161:0x051f, B:172:0x0551, B:162:0x0527, B:164:0x0532, B:166:0x0538, B:169:0x0544, B:171:0x054c, B:173:0x0554, B:174:0x0560, B:177:0x0568, B:179:0x057a, B:180:0x0586, B:182:0x058e, B:186:0x05b3, B:188:0x05d8, B:190:0x05e9, B:192:0x05ef, B:194:0x05fb, B:195:0x062c, B:197:0x0632, B:199:0x0640, B:200:0x0644, B:201:0x0647, B:202:0x064a, B:203:0x0658, B:205:0x065e, B:207:0x066e, B:208:0x0675, B:210:0x0681, B:211:0x0688, B:212:0x068b, B:214:0x06cb, B:215:0x06de, B:217:0x06e4, B:220:0x06fe, B:222:0x0719, B:224:0x0732, B:226:0x0737, B:228:0x073b, B:230:0x073f, B:232:0x0749, B:233:0x0753, B:235:0x0757, B:237:0x075d, B:238:0x076b, B:239:0x0774, B:306:0x09be, B:240:0x0780, B:242:0x0797, B:248:0x07b3, B:250:0x07d7, B:251:0x07df, B:253:0x07e5, B:255:0x07f7, B:262:0x0820, B:263:0x0840, B:265:0x084c, B:267:0x0861, B:269:0x08a2, B:273:0x08ba, B:275:0x08c1, B:277:0x08d0, B:279:0x08d4, B:281:0x08d8, B:283:0x08dc, B:284:0x08ea, B:286:0x08f0, B:288:0x090c, B:289:0x0911, B:305:0x09bb, B:290:0x092b, B:292:0x0933, B:296:0x095a, B:298:0x0988, B:299:0x098f, B:300:0x099d, B:301:0x09a1, B:303:0x09ad, B:293:0x0940, B:260:0x080b, B:246:0x079e, B:307:0x09c9, B:309:0x09d6, B:310:0x09dc, B:311:0x09e4, B:313:0x09ea, B:315:0x0a00, B:317:0x0a11, B:337:0x0a85, B:339:0x0a8b, B:341:0x0aa3, B:344:0x0aaa, B:349:0x0ad9, B:351:0x0b1b, B:354:0x0b50, B:355:0x0b54, B:356:0x0b5f, B:358:0x0ba2, B:359:0x0baf, B:361:0x0bbe, B:365:0x0bd8, B:366:0x0bec, B:368:0x0bf1, B:353:0x0b2d, B:345:0x0ab2, B:347:0x0abe, B:348:0x0ac2, B:369:0x0c07, B:370:0x0c1f, B:373:0x0c27, B:374:0x0c2c, B:375:0x0c3c, B:377:0x0c56, B:378:0x0c71, B:379:0x0c7a, B:384:0x0c9e, B:383:0x0c8b, B:318:0x0a29, B:320:0x0a2f, B:322:0x0a39, B:324:0x0a40, B:330:0x0a50, B:332:0x0a57, B:334:0x0a76, B:336:0x0a7d, B:335:0x0a7a, B:331:0x0a54, B:323:0x0a3d, B:183:0x0593, B:185:0x0599, B:387:0x0cb0), top: B:393:0x000e, inners: #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0820 A[Catch: all -> 0x0cc2, TryCatch #0 {all -> 0x0cc2, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ee, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x0399, B:107:0x03bc, B:104:0x03ab, B:129:0x043b, B:131:0x0447, B:134:0x045c, B:136:0x046d, B:138:0x0479, B:153:0x04da, B:141:0x0489, B:143:0x0495, B:146:0x04aa, B:148:0x04bb, B:150:0x04c7, B:111:0x03c4, B:113:0x03d0, B:115:0x03dc, B:127:0x0421, B:119:0x03f9, B:122:0x040b, B:124:0x0411, B:126:0x041b, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0506, B:159:0x0514, B:161:0x051f, B:172:0x0551, B:162:0x0527, B:164:0x0532, B:166:0x0538, B:169:0x0544, B:171:0x054c, B:173:0x0554, B:174:0x0560, B:177:0x0568, B:179:0x057a, B:180:0x0586, B:182:0x058e, B:186:0x05b3, B:188:0x05d8, B:190:0x05e9, B:192:0x05ef, B:194:0x05fb, B:195:0x062c, B:197:0x0632, B:199:0x0640, B:200:0x0644, B:201:0x0647, B:202:0x064a, B:203:0x0658, B:205:0x065e, B:207:0x066e, B:208:0x0675, B:210:0x0681, B:211:0x0688, B:212:0x068b, B:214:0x06cb, B:215:0x06de, B:217:0x06e4, B:220:0x06fe, B:222:0x0719, B:224:0x0732, B:226:0x0737, B:228:0x073b, B:230:0x073f, B:232:0x0749, B:233:0x0753, B:235:0x0757, B:237:0x075d, B:238:0x076b, B:239:0x0774, B:306:0x09be, B:240:0x0780, B:242:0x0797, B:248:0x07b3, B:250:0x07d7, B:251:0x07df, B:253:0x07e5, B:255:0x07f7, B:262:0x0820, B:263:0x0840, B:265:0x084c, B:267:0x0861, B:269:0x08a2, B:273:0x08ba, B:275:0x08c1, B:277:0x08d0, B:279:0x08d4, B:281:0x08d8, B:283:0x08dc, B:284:0x08ea, B:286:0x08f0, B:288:0x090c, B:289:0x0911, B:305:0x09bb, B:290:0x092b, B:292:0x0933, B:296:0x095a, B:298:0x0988, B:299:0x098f, B:300:0x099d, B:301:0x09a1, B:303:0x09ad, B:293:0x0940, B:260:0x080b, B:246:0x079e, B:307:0x09c9, B:309:0x09d6, B:310:0x09dc, B:311:0x09e4, B:313:0x09ea, B:315:0x0a00, B:317:0x0a11, B:337:0x0a85, B:339:0x0a8b, B:341:0x0aa3, B:344:0x0aaa, B:349:0x0ad9, B:351:0x0b1b, B:354:0x0b50, B:355:0x0b54, B:356:0x0b5f, B:358:0x0ba2, B:359:0x0baf, B:361:0x0bbe, B:365:0x0bd8, B:366:0x0bec, B:368:0x0bf1, B:353:0x0b2d, B:345:0x0ab2, B:347:0x0abe, B:348:0x0ac2, B:369:0x0c07, B:370:0x0c1f, B:373:0x0c27, B:374:0x0c2c, B:375:0x0c3c, B:377:0x0c56, B:378:0x0c71, B:379:0x0c7a, B:384:0x0c9e, B:383:0x0c8b, B:318:0x0a29, B:320:0x0a2f, B:322:0x0a39, B:324:0x0a40, B:330:0x0a50, B:332:0x0a57, B:334:0x0a76, B:336:0x0a7d, B:335:0x0a7a, B:331:0x0a54, B:323:0x0a3d, B:183:0x0593, B:185:0x0599, B:387:0x0cb0), top: B:393:0x000e, inners: #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0840 A[Catch: all -> 0x0cc2, TryCatch #0 {all -> 0x0cc2, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ee, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x0399, B:107:0x03bc, B:104:0x03ab, B:129:0x043b, B:131:0x0447, B:134:0x045c, B:136:0x046d, B:138:0x0479, B:153:0x04da, B:141:0x0489, B:143:0x0495, B:146:0x04aa, B:148:0x04bb, B:150:0x04c7, B:111:0x03c4, B:113:0x03d0, B:115:0x03dc, B:127:0x0421, B:119:0x03f9, B:122:0x040b, B:124:0x0411, B:126:0x041b, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0506, B:159:0x0514, B:161:0x051f, B:172:0x0551, B:162:0x0527, B:164:0x0532, B:166:0x0538, B:169:0x0544, B:171:0x054c, B:173:0x0554, B:174:0x0560, B:177:0x0568, B:179:0x057a, B:180:0x0586, B:182:0x058e, B:186:0x05b3, B:188:0x05d8, B:190:0x05e9, B:192:0x05ef, B:194:0x05fb, B:195:0x062c, B:197:0x0632, B:199:0x0640, B:200:0x0644, B:201:0x0647, B:202:0x064a, B:203:0x0658, B:205:0x065e, B:207:0x066e, B:208:0x0675, B:210:0x0681, B:211:0x0688, B:212:0x068b, B:214:0x06cb, B:215:0x06de, B:217:0x06e4, B:220:0x06fe, B:222:0x0719, B:224:0x0732, B:226:0x0737, B:228:0x073b, B:230:0x073f, B:232:0x0749, B:233:0x0753, B:235:0x0757, B:237:0x075d, B:238:0x076b, B:239:0x0774, B:306:0x09be, B:240:0x0780, B:242:0x0797, B:248:0x07b3, B:250:0x07d7, B:251:0x07df, B:253:0x07e5, B:255:0x07f7, B:262:0x0820, B:263:0x0840, B:265:0x084c, B:267:0x0861, B:269:0x08a2, B:273:0x08ba, B:275:0x08c1, B:277:0x08d0, B:279:0x08d4, B:281:0x08d8, B:283:0x08dc, B:284:0x08ea, B:286:0x08f0, B:288:0x090c, B:289:0x0911, B:305:0x09bb, B:290:0x092b, B:292:0x0933, B:296:0x095a, B:298:0x0988, B:299:0x098f, B:300:0x099d, B:301:0x09a1, B:303:0x09ad, B:293:0x0940, B:260:0x080b, B:246:0x079e, B:307:0x09c9, B:309:0x09d6, B:310:0x09dc, B:311:0x09e4, B:313:0x09ea, B:315:0x0a00, B:317:0x0a11, B:337:0x0a85, B:339:0x0a8b, B:341:0x0aa3, B:344:0x0aaa, B:349:0x0ad9, B:351:0x0b1b, B:354:0x0b50, B:355:0x0b54, B:356:0x0b5f, B:358:0x0ba2, B:359:0x0baf, B:361:0x0bbe, B:365:0x0bd8, B:366:0x0bec, B:368:0x0bf1, B:353:0x0b2d, B:345:0x0ab2, B:347:0x0abe, B:348:0x0ac2, B:369:0x0c07, B:370:0x0c1f, B:373:0x0c27, B:374:0x0c2c, B:375:0x0c3c, B:377:0x0c56, B:378:0x0c71, B:379:0x0c7a, B:384:0x0c9e, B:383:0x0c8b, B:318:0x0a29, B:320:0x0a2f, B:322:0x0a39, B:324:0x0a40, B:330:0x0a50, B:332:0x0a57, B:334:0x0a76, B:336:0x0a7d, B:335:0x0a7a, B:331:0x0a54, B:323:0x0a3d, B:183:0x0593, B:185:0x0599, B:387:0x0cb0), top: B:393:0x000e, inners: #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x08b7  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x08b9  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x08c1 A[Catch: all -> 0x0cc2, TryCatch #0 {all -> 0x0cc2, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ee, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x0399, B:107:0x03bc, B:104:0x03ab, B:129:0x043b, B:131:0x0447, B:134:0x045c, B:136:0x046d, B:138:0x0479, B:153:0x04da, B:141:0x0489, B:143:0x0495, B:146:0x04aa, B:148:0x04bb, B:150:0x04c7, B:111:0x03c4, B:113:0x03d0, B:115:0x03dc, B:127:0x0421, B:119:0x03f9, B:122:0x040b, B:124:0x0411, B:126:0x041b, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0506, B:159:0x0514, B:161:0x051f, B:172:0x0551, B:162:0x0527, B:164:0x0532, B:166:0x0538, B:169:0x0544, B:171:0x054c, B:173:0x0554, B:174:0x0560, B:177:0x0568, B:179:0x057a, B:180:0x0586, B:182:0x058e, B:186:0x05b3, B:188:0x05d8, B:190:0x05e9, B:192:0x05ef, B:194:0x05fb, B:195:0x062c, B:197:0x0632, B:199:0x0640, B:200:0x0644, B:201:0x0647, B:202:0x064a, B:203:0x0658, B:205:0x065e, B:207:0x066e, B:208:0x0675, B:210:0x0681, B:211:0x0688, B:212:0x068b, B:214:0x06cb, B:215:0x06de, B:217:0x06e4, B:220:0x06fe, B:222:0x0719, B:224:0x0732, B:226:0x0737, B:228:0x073b, B:230:0x073f, B:232:0x0749, B:233:0x0753, B:235:0x0757, B:237:0x075d, B:238:0x076b, B:239:0x0774, B:306:0x09be, B:240:0x0780, B:242:0x0797, B:248:0x07b3, B:250:0x07d7, B:251:0x07df, B:253:0x07e5, B:255:0x07f7, B:262:0x0820, B:263:0x0840, B:265:0x084c, B:267:0x0861, B:269:0x08a2, B:273:0x08ba, B:275:0x08c1, B:277:0x08d0, B:279:0x08d4, B:281:0x08d8, B:283:0x08dc, B:284:0x08ea, B:286:0x08f0, B:288:0x090c, B:289:0x0911, B:305:0x09bb, B:290:0x092b, B:292:0x0933, B:296:0x095a, B:298:0x0988, B:299:0x098f, B:300:0x099d, B:301:0x09a1, B:303:0x09ad, B:293:0x0940, B:260:0x080b, B:246:0x079e, B:307:0x09c9, B:309:0x09d6, B:310:0x09dc, B:311:0x09e4, B:313:0x09ea, B:315:0x0a00, B:317:0x0a11, B:337:0x0a85, B:339:0x0a8b, B:341:0x0aa3, B:344:0x0aaa, B:349:0x0ad9, B:351:0x0b1b, B:354:0x0b50, B:355:0x0b54, B:356:0x0b5f, B:358:0x0ba2, B:359:0x0baf, B:361:0x0bbe, B:365:0x0bd8, B:366:0x0bec, B:368:0x0bf1, B:353:0x0b2d, B:345:0x0ab2, B:347:0x0abe, B:348:0x0ac2, B:369:0x0c07, B:370:0x0c1f, B:373:0x0c27, B:374:0x0c2c, B:375:0x0c3c, B:377:0x0c56, B:378:0x0c71, B:379:0x0c7a, B:384:0x0c9e, B:383:0x0c8b, B:318:0x0a29, B:320:0x0a2f, B:322:0x0a39, B:324:0x0a40, B:330:0x0a50, B:332:0x0a57, B:334:0x0a76, B:336:0x0a7d, B:335:0x0a7a, B:331:0x0a54, B:323:0x0a3d, B:183:0x0593, B:185:0x0599, B:387:0x0cb0), top: B:393:0x000e, inners: #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x08ea A[Catch: all -> 0x0cc2, TryCatch #0 {all -> 0x0cc2, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ee, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x0399, B:107:0x03bc, B:104:0x03ab, B:129:0x043b, B:131:0x0447, B:134:0x045c, B:136:0x046d, B:138:0x0479, B:153:0x04da, B:141:0x0489, B:143:0x0495, B:146:0x04aa, B:148:0x04bb, B:150:0x04c7, B:111:0x03c4, B:113:0x03d0, B:115:0x03dc, B:127:0x0421, B:119:0x03f9, B:122:0x040b, B:124:0x0411, B:126:0x041b, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0506, B:159:0x0514, B:161:0x051f, B:172:0x0551, B:162:0x0527, B:164:0x0532, B:166:0x0538, B:169:0x0544, B:171:0x054c, B:173:0x0554, B:174:0x0560, B:177:0x0568, B:179:0x057a, B:180:0x0586, B:182:0x058e, B:186:0x05b3, B:188:0x05d8, B:190:0x05e9, B:192:0x05ef, B:194:0x05fb, B:195:0x062c, B:197:0x0632, B:199:0x0640, B:200:0x0644, B:201:0x0647, B:202:0x064a, B:203:0x0658, B:205:0x065e, B:207:0x066e, B:208:0x0675, B:210:0x0681, B:211:0x0688, B:212:0x068b, B:214:0x06cb, B:215:0x06de, B:217:0x06e4, B:220:0x06fe, B:222:0x0719, B:224:0x0732, B:226:0x0737, B:228:0x073b, B:230:0x073f, B:232:0x0749, B:233:0x0753, B:235:0x0757, B:237:0x075d, B:238:0x076b, B:239:0x0774, B:306:0x09be, B:240:0x0780, B:242:0x0797, B:248:0x07b3, B:250:0x07d7, B:251:0x07df, B:253:0x07e5, B:255:0x07f7, B:262:0x0820, B:263:0x0840, B:265:0x084c, B:267:0x0861, B:269:0x08a2, B:273:0x08ba, B:275:0x08c1, B:277:0x08d0, B:279:0x08d4, B:281:0x08d8, B:283:0x08dc, B:284:0x08ea, B:286:0x08f0, B:288:0x090c, B:289:0x0911, B:305:0x09bb, B:290:0x092b, B:292:0x0933, B:296:0x095a, B:298:0x0988, B:299:0x098f, B:300:0x099d, B:301:0x09a1, B:303:0x09ad, B:293:0x0940, B:260:0x080b, B:246:0x079e, B:307:0x09c9, B:309:0x09d6, B:310:0x09dc, B:311:0x09e4, B:313:0x09ea, B:315:0x0a00, B:317:0x0a11, B:337:0x0a85, B:339:0x0a8b, B:341:0x0aa3, B:344:0x0aaa, B:349:0x0ad9, B:351:0x0b1b, B:354:0x0b50, B:355:0x0b54, B:356:0x0b5f, B:358:0x0ba2, B:359:0x0baf, B:361:0x0bbe, B:365:0x0bd8, B:366:0x0bec, B:368:0x0bf1, B:353:0x0b2d, B:345:0x0ab2, B:347:0x0abe, B:348:0x0ac2, B:369:0x0c07, B:370:0x0c1f, B:373:0x0c27, B:374:0x0c2c, B:375:0x0c3c, B:377:0x0c56, B:378:0x0c71, B:379:0x0c7a, B:384:0x0c9e, B:383:0x0c8b, B:318:0x0a29, B:320:0x0a2f, B:322:0x0a39, B:324:0x0a40, B:330:0x0a50, B:332:0x0a57, B:334:0x0a76, B:336:0x0a7d, B:335:0x0a7a, B:331:0x0a54, B:323:0x0a3d, B:183:0x0593, B:185:0x0599, B:387:0x0cb0), top: B:393:0x000e, inners: #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0b1b A[Catch: all -> 0x0cc2, TryCatch #0 {all -> 0x0cc2, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ee, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x0399, B:107:0x03bc, B:104:0x03ab, B:129:0x043b, B:131:0x0447, B:134:0x045c, B:136:0x046d, B:138:0x0479, B:153:0x04da, B:141:0x0489, B:143:0x0495, B:146:0x04aa, B:148:0x04bb, B:150:0x04c7, B:111:0x03c4, B:113:0x03d0, B:115:0x03dc, B:127:0x0421, B:119:0x03f9, B:122:0x040b, B:124:0x0411, B:126:0x041b, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0506, B:159:0x0514, B:161:0x051f, B:172:0x0551, B:162:0x0527, B:164:0x0532, B:166:0x0538, B:169:0x0544, B:171:0x054c, B:173:0x0554, B:174:0x0560, B:177:0x0568, B:179:0x057a, B:180:0x0586, B:182:0x058e, B:186:0x05b3, B:188:0x05d8, B:190:0x05e9, B:192:0x05ef, B:194:0x05fb, B:195:0x062c, B:197:0x0632, B:199:0x0640, B:200:0x0644, B:201:0x0647, B:202:0x064a, B:203:0x0658, B:205:0x065e, B:207:0x066e, B:208:0x0675, B:210:0x0681, B:211:0x0688, B:212:0x068b, B:214:0x06cb, B:215:0x06de, B:217:0x06e4, B:220:0x06fe, B:222:0x0719, B:224:0x0732, B:226:0x0737, B:228:0x073b, B:230:0x073f, B:232:0x0749, B:233:0x0753, B:235:0x0757, B:237:0x075d, B:238:0x076b, B:239:0x0774, B:306:0x09be, B:240:0x0780, B:242:0x0797, B:248:0x07b3, B:250:0x07d7, B:251:0x07df, B:253:0x07e5, B:255:0x07f7, B:262:0x0820, B:263:0x0840, B:265:0x084c, B:267:0x0861, B:269:0x08a2, B:273:0x08ba, B:275:0x08c1, B:277:0x08d0, B:279:0x08d4, B:281:0x08d8, B:283:0x08dc, B:284:0x08ea, B:286:0x08f0, B:288:0x090c, B:289:0x0911, B:305:0x09bb, B:290:0x092b, B:292:0x0933, B:296:0x095a, B:298:0x0988, B:299:0x098f, B:300:0x099d, B:301:0x09a1, B:303:0x09ad, B:293:0x0940, B:260:0x080b, B:246:0x079e, B:307:0x09c9, B:309:0x09d6, B:310:0x09dc, B:311:0x09e4, B:313:0x09ea, B:315:0x0a00, B:317:0x0a11, B:337:0x0a85, B:339:0x0a8b, B:341:0x0aa3, B:344:0x0aaa, B:349:0x0ad9, B:351:0x0b1b, B:354:0x0b50, B:355:0x0b54, B:356:0x0b5f, B:358:0x0ba2, B:359:0x0baf, B:361:0x0bbe, B:365:0x0bd8, B:366:0x0bec, B:368:0x0bf1, B:353:0x0b2d, B:345:0x0ab2, B:347:0x0abe, B:348:0x0ac2, B:369:0x0c07, B:370:0x0c1f, B:373:0x0c27, B:374:0x0c2c, B:375:0x0c3c, B:377:0x0c56, B:378:0x0c71, B:379:0x0c7a, B:384:0x0c9e, B:383:0x0c8b, B:318:0x0a29, B:320:0x0a2f, B:322:0x0a39, B:324:0x0a40, B:330:0x0a50, B:332:0x0a57, B:334:0x0a76, B:336:0x0a7d, B:335:0x0a7a, B:331:0x0a54, B:323:0x0a3d, B:183:0x0593, B:185:0x0599, B:387:0x0cb0), top: B:393:0x000e, inners: #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0ba2 A[Catch: all -> 0x0cc2, TRY_LEAVE, TryCatch #0 {all -> 0x0cc2, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ee, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x0399, B:107:0x03bc, B:104:0x03ab, B:129:0x043b, B:131:0x0447, B:134:0x045c, B:136:0x046d, B:138:0x0479, B:153:0x04da, B:141:0x0489, B:143:0x0495, B:146:0x04aa, B:148:0x04bb, B:150:0x04c7, B:111:0x03c4, B:113:0x03d0, B:115:0x03dc, B:127:0x0421, B:119:0x03f9, B:122:0x040b, B:124:0x0411, B:126:0x041b, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0506, B:159:0x0514, B:161:0x051f, B:172:0x0551, B:162:0x0527, B:164:0x0532, B:166:0x0538, B:169:0x0544, B:171:0x054c, B:173:0x0554, B:174:0x0560, B:177:0x0568, B:179:0x057a, B:180:0x0586, B:182:0x058e, B:186:0x05b3, B:188:0x05d8, B:190:0x05e9, B:192:0x05ef, B:194:0x05fb, B:195:0x062c, B:197:0x0632, B:199:0x0640, B:200:0x0644, B:201:0x0647, B:202:0x064a, B:203:0x0658, B:205:0x065e, B:207:0x066e, B:208:0x0675, B:210:0x0681, B:211:0x0688, B:212:0x068b, B:214:0x06cb, B:215:0x06de, B:217:0x06e4, B:220:0x06fe, B:222:0x0719, B:224:0x0732, B:226:0x0737, B:228:0x073b, B:230:0x073f, B:232:0x0749, B:233:0x0753, B:235:0x0757, B:237:0x075d, B:238:0x076b, B:239:0x0774, B:306:0x09be, B:240:0x0780, B:242:0x0797, B:248:0x07b3, B:250:0x07d7, B:251:0x07df, B:253:0x07e5, B:255:0x07f7, B:262:0x0820, B:263:0x0840, B:265:0x084c, B:267:0x0861, B:269:0x08a2, B:273:0x08ba, B:275:0x08c1, B:277:0x08d0, B:279:0x08d4, B:281:0x08d8, B:283:0x08dc, B:284:0x08ea, B:286:0x08f0, B:288:0x090c, B:289:0x0911, B:305:0x09bb, B:290:0x092b, B:292:0x0933, B:296:0x095a, B:298:0x0988, B:299:0x098f, B:300:0x099d, B:301:0x09a1, B:303:0x09ad, B:293:0x0940, B:260:0x080b, B:246:0x079e, B:307:0x09c9, B:309:0x09d6, B:310:0x09dc, B:311:0x09e4, B:313:0x09ea, B:315:0x0a00, B:317:0x0a11, B:337:0x0a85, B:339:0x0a8b, B:341:0x0aa3, B:344:0x0aaa, B:349:0x0ad9, B:351:0x0b1b, B:354:0x0b50, B:355:0x0b54, B:356:0x0b5f, B:358:0x0ba2, B:359:0x0baf, B:361:0x0bbe, B:365:0x0bd8, B:366:0x0bec, B:368:0x0bf1, B:353:0x0b2d, B:345:0x0ab2, B:347:0x0abe, B:348:0x0ac2, B:369:0x0c07, B:370:0x0c1f, B:373:0x0c27, B:374:0x0c2c, B:375:0x0c3c, B:377:0x0c56, B:378:0x0c71, B:379:0x0c7a, B:384:0x0c9e, B:383:0x0c8b, B:318:0x0a29, B:320:0x0a2f, B:322:0x0a39, B:324:0x0a40, B:330:0x0a50, B:332:0x0a57, B:334:0x0a76, B:336:0x0a7d, B:335:0x0a7a, B:331:0x0a54, B:323:0x0a3d, B:183:0x0593, B:185:0x0599, B:387:0x0cb0), top: B:393:0x000e, inners: #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0bbe A[Catch: SQLiteException -> 0x0bd6, all -> 0x0cc2, TRY_LEAVE, TryCatch #2 {SQLiteException -> 0x0bd6, blocks: (B:359:0x0baf, B:361:0x0bbe), top: B:396:0x0baf, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0c25  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0c56 A[Catch: all -> 0x0cc2, TryCatch #0 {all -> 0x0cc2, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ee, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x0399, B:107:0x03bc, B:104:0x03ab, B:129:0x043b, B:131:0x0447, B:134:0x045c, B:136:0x046d, B:138:0x0479, B:153:0x04da, B:141:0x0489, B:143:0x0495, B:146:0x04aa, B:148:0x04bb, B:150:0x04c7, B:111:0x03c4, B:113:0x03d0, B:115:0x03dc, B:127:0x0421, B:119:0x03f9, B:122:0x040b, B:124:0x0411, B:126:0x041b, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0506, B:159:0x0514, B:161:0x051f, B:172:0x0551, B:162:0x0527, B:164:0x0532, B:166:0x0538, B:169:0x0544, B:171:0x054c, B:173:0x0554, B:174:0x0560, B:177:0x0568, B:179:0x057a, B:180:0x0586, B:182:0x058e, B:186:0x05b3, B:188:0x05d8, B:190:0x05e9, B:192:0x05ef, B:194:0x05fb, B:195:0x062c, B:197:0x0632, B:199:0x0640, B:200:0x0644, B:201:0x0647, B:202:0x064a, B:203:0x0658, B:205:0x065e, B:207:0x066e, B:208:0x0675, B:210:0x0681, B:211:0x0688, B:212:0x068b, B:214:0x06cb, B:215:0x06de, B:217:0x06e4, B:220:0x06fe, B:222:0x0719, B:224:0x0732, B:226:0x0737, B:228:0x073b, B:230:0x073f, B:232:0x0749, B:233:0x0753, B:235:0x0757, B:237:0x075d, B:238:0x076b, B:239:0x0774, B:306:0x09be, B:240:0x0780, B:242:0x0797, B:248:0x07b3, B:250:0x07d7, B:251:0x07df, B:253:0x07e5, B:255:0x07f7, B:262:0x0820, B:263:0x0840, B:265:0x084c, B:267:0x0861, B:269:0x08a2, B:273:0x08ba, B:275:0x08c1, B:277:0x08d0, B:279:0x08d4, B:281:0x08d8, B:283:0x08dc, B:284:0x08ea, B:286:0x08f0, B:288:0x090c, B:289:0x0911, B:305:0x09bb, B:290:0x092b, B:292:0x0933, B:296:0x095a, B:298:0x0988, B:299:0x098f, B:300:0x099d, B:301:0x09a1, B:303:0x09ad, B:293:0x0940, B:260:0x080b, B:246:0x079e, B:307:0x09c9, B:309:0x09d6, B:310:0x09dc, B:311:0x09e4, B:313:0x09ea, B:315:0x0a00, B:317:0x0a11, B:337:0x0a85, B:339:0x0a8b, B:341:0x0aa3, B:344:0x0aaa, B:349:0x0ad9, B:351:0x0b1b, B:354:0x0b50, B:355:0x0b54, B:356:0x0b5f, B:358:0x0ba2, B:359:0x0baf, B:361:0x0bbe, B:365:0x0bd8, B:366:0x0bec, B:368:0x0bf1, B:353:0x0b2d, B:345:0x0ab2, B:347:0x0abe, B:348:0x0ac2, B:369:0x0c07, B:370:0x0c1f, B:373:0x0c27, B:374:0x0c2c, B:375:0x0c3c, B:377:0x0c56, B:378:0x0c71, B:379:0x0c7a, B:384:0x0c9e, B:383:0x0c8b, B:318:0x0a29, B:320:0x0a2f, B:322:0x0a39, B:324:0x0a40, B:330:0x0a50, B:332:0x0a57, B:334:0x0a76, B:336:0x0a7d, B:335:0x0a7a, B:331:0x0a54, B:323:0x0a3d, B:183:0x0593, B:185:0x0599, B:387:0x0cb0), top: B:393:0x000e, inners: #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0383 A[Catch: all -> 0x0cc2, TryCatch #0 {all -> 0x0cc2, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ee, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x0399, B:107:0x03bc, B:104:0x03ab, B:129:0x043b, B:131:0x0447, B:134:0x045c, B:136:0x046d, B:138:0x0479, B:153:0x04da, B:141:0x0489, B:143:0x0495, B:146:0x04aa, B:148:0x04bb, B:150:0x04c7, B:111:0x03c4, B:113:0x03d0, B:115:0x03dc, B:127:0x0421, B:119:0x03f9, B:122:0x040b, B:124:0x0411, B:126:0x041b, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0506, B:159:0x0514, B:161:0x051f, B:172:0x0551, B:162:0x0527, B:164:0x0532, B:166:0x0538, B:169:0x0544, B:171:0x054c, B:173:0x0554, B:174:0x0560, B:177:0x0568, B:179:0x057a, B:180:0x0586, B:182:0x058e, B:186:0x05b3, B:188:0x05d8, B:190:0x05e9, B:192:0x05ef, B:194:0x05fb, B:195:0x062c, B:197:0x0632, B:199:0x0640, B:200:0x0644, B:201:0x0647, B:202:0x064a, B:203:0x0658, B:205:0x065e, B:207:0x066e, B:208:0x0675, B:210:0x0681, B:211:0x0688, B:212:0x068b, B:214:0x06cb, B:215:0x06de, B:217:0x06e4, B:220:0x06fe, B:222:0x0719, B:224:0x0732, B:226:0x0737, B:228:0x073b, B:230:0x073f, B:232:0x0749, B:233:0x0753, B:235:0x0757, B:237:0x075d, B:238:0x076b, B:239:0x0774, B:306:0x09be, B:240:0x0780, B:242:0x0797, B:248:0x07b3, B:250:0x07d7, B:251:0x07df, B:253:0x07e5, B:255:0x07f7, B:262:0x0820, B:263:0x0840, B:265:0x084c, B:267:0x0861, B:269:0x08a2, B:273:0x08ba, B:275:0x08c1, B:277:0x08d0, B:279:0x08d4, B:281:0x08d8, B:283:0x08dc, B:284:0x08ea, B:286:0x08f0, B:288:0x090c, B:289:0x0911, B:305:0x09bb, B:290:0x092b, B:292:0x0933, B:296:0x095a, B:298:0x0988, B:299:0x098f, B:300:0x099d, B:301:0x09a1, B:303:0x09ad, B:293:0x0940, B:260:0x080b, B:246:0x079e, B:307:0x09c9, B:309:0x09d6, B:310:0x09dc, B:311:0x09e4, B:313:0x09ea, B:315:0x0a00, B:317:0x0a11, B:337:0x0a85, B:339:0x0a8b, B:341:0x0aa3, B:344:0x0aaa, B:349:0x0ad9, B:351:0x0b1b, B:354:0x0b50, B:355:0x0b54, B:356:0x0b5f, B:358:0x0ba2, B:359:0x0baf, B:361:0x0bbe, B:365:0x0bd8, B:366:0x0bec, B:368:0x0bf1, B:353:0x0b2d, B:345:0x0ab2, B:347:0x0abe, B:348:0x0ac2, B:369:0x0c07, B:370:0x0c1f, B:373:0x0c27, B:374:0x0c2c, B:375:0x0c3c, B:377:0x0c56, B:378:0x0c71, B:379:0x0c7a, B:384:0x0c9e, B:383:0x0c8b, B:318:0x0a29, B:320:0x0a2f, B:322:0x0a39, B:324:0x0a40, B:330:0x0a50, B:332:0x0a57, B:334:0x0a76, B:336:0x0a7d, B:335:0x0a7a, B:331:0x0a54, B:323:0x0a3d, B:183:0x0593, B:185:0x0599, B:387:0x0cb0), top: B:393:0x000e, inners: #1, #2, #3, #4 }] */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean zzah(java.lang.String r41, long r42) {
        /*
            Method dump skipped, instructions count: 3277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlh.zzah(java.lang.String, long):boolean");
    }

    private final boolean zzai() {
        zzaB().zzg();
        zzB();
        zzak zzakVar = this.zze;
        zzal(zzakVar);
        if (zzakVar.zzF()) {
            return true;
        }
        zzak zzakVar2 = this.zze;
        zzal(zzakVar2);
        return !TextUtils.isEmpty(zzakVar2.zzr());
    }

    private final boolean zzaj(com.google.android.gms.internal.measurement.zzfs zzfsVar, com.google.android.gms.internal.measurement.zzfs zzfsVar2) {
        Preconditions.checkArgument("_e".equals(zzfsVar.zzo()));
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfx zzC = zzlj.zzC((com.google.android.gms.internal.measurement.zzft) zzfsVar.zzaD(), "_sc");
        String zzh = zzC == null ? null : zzC.zzh();
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfx zzC2 = zzlj.zzC((com.google.android.gms.internal.measurement.zzft) zzfsVar2.zzaD(), "_pc");
        String zzh2 = zzC2 != null ? zzC2.zzh() : null;
        if (zzh2 == null || !zzh2.equals(zzh)) {
            return false;
        }
        Preconditions.checkArgument("_e".equals(zzfsVar.zzo()));
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfx zzC3 = zzlj.zzC((com.google.android.gms.internal.measurement.zzft) zzfsVar.zzaD(), "_et");
        if (zzC3 == null || !zzC3.zzw() || zzC3.zzd() <= 0) {
            return true;
        }
        long zzd = zzC3.zzd();
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfx zzC4 = zzlj.zzC((com.google.android.gms.internal.measurement.zzft) zzfsVar2.zzaD(), "_et");
        if (zzC4 != null && zzC4.zzd() > 0) {
            zzd += zzC4.zzd();
        }
        zzal(this.zzi);
        zzlj.zzA(zzfsVar2, "_et", Long.valueOf(zzd));
        zzal(this.zzi);
        zzlj.zzA(zzfsVar, "_fr", 1L);
        return true;
    }

    private static final boolean zzak(zzq zzqVar) {
        return (TextUtils.isEmpty(zzqVar.zzb) && TextUtils.isEmpty(zzqVar.zzq)) ? false : true;
    }

    private static final zzku zzal(zzku zzkuVar) {
        if (zzkuVar != null) {
            if (zzkuVar.zzY()) {
                return zzkuVar;
            }
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzkuVar.getClass())));
        }
        throw new IllegalStateException("Upload Component not created");
    }

    public static zzlh zzt(Context context) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzb == null) {
            synchronized (zzlh.class) {
                if (zzb == null) {
                    zzb = new zzlh((zzli) Preconditions.checkNotNull(new zzli(context)), null);
                }
            }
        }
        return zzb;
    }

    public static /* bridge */ /* synthetic */ void zzy(zzlh zzlhVar, zzli zzliVar) {
        zzlhVar.zzaB().zzg();
        zzlhVar.zzm = new zzfl(zzlhVar);
        zzak zzakVar = new zzak(zzlhVar);
        zzakVar.zzX();
        zzlhVar.zze = zzakVar;
        zzlhVar.zzg().zzq((zzaf) Preconditions.checkNotNull(zzlhVar.zzc));
        zzkb zzkbVar = new zzkb(zzlhVar);
        zzkbVar.zzX();
        zzlhVar.zzk = zzkbVar;
        zzaa zzaaVar = new zzaa(zzlhVar);
        zzaaVar.zzX();
        zzlhVar.zzh = zzaaVar;
        zzip zzipVar = new zzip(zzlhVar);
        zzipVar.zzX();
        zzlhVar.zzj = zzipVar;
        zzks zzksVar = new zzks(zzlhVar);
        zzksVar.zzX();
        zzlhVar.zzg = zzksVar;
        zzlhVar.zzf = new zzfb(zzlhVar);
        if (zzlhVar.zzr != zzlhVar.zzs) {
            zzlhVar.zzaA().zzd().zzc("Not all upload components initialized", Integer.valueOf(zzlhVar.zzr), Integer.valueOf(zzlhVar.zzs));
        }
        zzlhVar.zzo = true;
    }

    @VisibleForTesting
    @WorkerThread
    public final void zzA() {
        zzer zzd;
        Integer valueOf;
        Integer valueOf2;
        String str;
        zzaB().zzg();
        zzB();
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        if (zzZ()) {
            FileChannel fileChannel = this.zzx;
            zzaB().zzg();
            int i2 = 0;
            if (fileChannel == null || !fileChannel.isOpen()) {
                zzaA().zzd().zza("Bad channel to read from");
            } else {
                ByteBuffer allocate = ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0L);
                    int read = fileChannel.read(allocate);
                    if (read == 4) {
                        allocate.flip();
                        i2 = allocate.getInt();
                    } else if (read != -1) {
                        zzaA().zzk().zzb("Unexpected data length. Bytes read", Integer.valueOf(read));
                    }
                } catch (IOException e2) {
                    zzaA().zzd().zzb("Failed to read from channel", e2);
                }
            }
            int zzi = this.zzn.zzh().zzi();
            zzaB().zzg();
            if (i2 > zzi) {
                zzd = zzaA().zzd();
                valueOf = Integer.valueOf(i2);
                valueOf2 = Integer.valueOf(zzi);
                str = "Panic: can't downgrade version. Previous, current version";
            } else if (i2 >= zzi) {
                return;
            } else {
                FileChannel fileChannel2 = this.zzx;
                zzaB().zzg();
                if (fileChannel2 == null || !fileChannel2.isOpen()) {
                    zzaA().zzd().zza("Bad channel to read from");
                } else {
                    ByteBuffer allocate2 = ByteBuffer.allocate(4);
                    allocate2.putInt(zzi);
                    allocate2.flip();
                    try {
                        fileChannel2.truncate(0L);
                        fileChannel2.write(allocate2);
                        fileChannel2.force(true);
                        if (fileChannel2.size() != 4) {
                            zzaA().zzd().zzb("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                        }
                        zzd = zzaA().zzj();
                        valueOf = Integer.valueOf(i2);
                        valueOf2 = Integer.valueOf(zzi);
                        str = "Storage version upgraded. Previous, current version";
                    } catch (IOException e3) {
                        zzaA().zzd().zzb("Failed to write to channel", e3);
                    }
                }
                zzd = zzaA().zzd();
                valueOf = Integer.valueOf(i2);
                valueOf2 = Integer.valueOf(zzi);
                str = "Storage version upgrade failed. Previous, current version";
            }
            zzd.zzc(str, valueOf, valueOf2);
        }
    }

    public final void zzB() {
        if (!this.zzo) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    public final void zzC(String str, com.google.android.gms.internal.measurement.zzgc zzgcVar) {
        int zza;
        int indexOf;
        zzfu zzfuVar = this.zzc;
        zzal(zzfuVar);
        Set zzk = zzfuVar.zzk(str);
        if (zzk != null) {
            zzgcVar.zzi(zzk);
        }
        zzfu zzfuVar2 = this.zzc;
        zzal(zzfuVar2);
        if (zzfuVar2.zzv(str)) {
            zzgcVar.zzp();
        }
        zzfu zzfuVar3 = this.zzc;
        zzal(zzfuVar3);
        if (zzfuVar3.zzy(str)) {
            if (zzg().zzs(str, zzeg.zzar)) {
                String zzas = zzgcVar.zzas();
                if (!TextUtils.isEmpty(zzas) && (indexOf = zzas.indexOf(".")) != -1) {
                    zzgcVar.zzY(zzas.substring(0, indexOf));
                }
            } else {
                zzgcVar.zzu();
            }
        }
        zzfu zzfuVar4 = this.zzc;
        zzal(zzfuVar4);
        if (zzfuVar4.zzz(str) && (zza = zzlj.zza(zzgcVar, "_id")) != -1) {
            zzgcVar.zzB(zza);
        }
        zzfu zzfuVar5 = this.zzc;
        zzal(zzfuVar5);
        if (zzfuVar5.zzx(str)) {
            zzgcVar.zzq();
        }
        zzfu zzfuVar6 = this.zzc;
        zzal(zzfuVar6);
        if (zzfuVar6.zzu(str)) {
            zzgcVar.zzn();
            zzlg zzlgVar = (zzlg) this.zzC.get(str);
            if (zzlgVar == null || zzlgVar.zzb + zzg().zzi(str, zzeg.zzT) < zzax().elapsedRealtime()) {
                zzlgVar = new zzlg(this);
                this.zzC.put(str, zzlgVar);
            }
            zzgcVar.zzR(zzlgVar.zza);
        }
        zzfu zzfuVar7 = this.zzc;
        zzal(zzfuVar7);
        if (zzfuVar7.zzw(str)) {
            zzgcVar.zzy();
        }
    }

    @WorkerThread
    public final void zzD(zzh zzhVar) {
        zzaB().zzg();
        if (TextUtils.isEmpty(zzhVar.zzA()) && TextUtils.isEmpty(zzhVar.zzt())) {
            zzI((String) Preconditions.checkNotNull(zzhVar.zzv()), ComposerKt.providerMapsKey, null, null, null);
            return;
        }
        zzkw zzkwVar = this.zzl;
        Uri.Builder builder = new Uri.Builder();
        String zzA = zzhVar.zzA();
        if (TextUtils.isEmpty(zzA)) {
            zzA = zzhVar.zzt();
        }
        ArrayMap arrayMap = null;
        Uri.Builder appendQueryParameter = builder.scheme((String) zzeg.zze.zza(null)).encodedAuthority((String) zzeg.zzf.zza(null)).path("config/app/".concat(String.valueOf(zzA))).appendQueryParameter("platform", "android");
        zzkwVar.zzt.zzf().zzh();
        appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(79000L)).appendQueryParameter("runtime_version", "0");
        String uri = builder.build().toString();
        try {
            String str = (String) Preconditions.checkNotNull(zzhVar.zzv());
            URL url = new URL(uri);
            zzaA().zzj().zzb("Fetching remote configuration", str);
            zzfu zzfuVar = this.zzc;
            zzal(zzfuVar);
            com.google.android.gms.internal.measurement.zzff zze = zzfuVar.zze(str);
            zzfu zzfuVar2 = this.zzc;
            zzal(zzfuVar2);
            String zzh = zzfuVar2.zzh(str);
            if (zze != null) {
                if (!TextUtils.isEmpty(zzh)) {
                    ArrayMap arrayMap2 = new ArrayMap();
                    arrayMap2.put("If-Modified-Since", zzh);
                    arrayMap = arrayMap2;
                }
                zzfu zzfuVar3 = this.zzc;
                zzal(zzfuVar3);
                String zzf = zzfuVar3.zzf(str);
                if (!TextUtils.isEmpty(zzf)) {
                    if (arrayMap == null) {
                        arrayMap = new ArrayMap();
                    }
                    arrayMap.put("If-None-Match", zzf);
                }
            }
            this.zzt = true;
            zzez zzezVar = this.zzd;
            zzal(zzezVar);
            zzkz zzkzVar = new zzkz(this);
            zzezVar.zzg();
            zzezVar.zzW();
            Preconditions.checkNotNull(url);
            Preconditions.checkNotNull(zzkzVar);
            zzezVar.zzt.zzaB().zzo(new zzey(zzezVar, str, url, null, arrayMap, zzkzVar));
        } catch (MalformedURLException unused) {
            zzaA().zzd().zzc("Failed to parse config URL. Not fetching. appId", zzet.zzn(zzhVar.zzv()), uri);
        }
    }

    @WorkerThread
    public final void zzE(zzau zzauVar, zzq zzqVar) {
        zzau zzauVar2;
        List<zzac> zzt;
        List<zzac> zzt2;
        List<zzac> zzt3;
        zzer zzd;
        String str;
        Object zzn;
        String zzf;
        Object obj;
        String str2;
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzaB().zzg();
        zzB();
        String str3 = zzqVar.zza;
        long j2 = zzauVar.zzd;
        zzeu zzb2 = zzeu.zzb(zzauVar);
        zzaB().zzg();
        zzir zzirVar = null;
        if (this.zzD != null && (str2 = this.zzE) != null && str2.equals(str3)) {
            zzirVar = this.zzD;
        }
        zzlp.zzK(zzirVar, zzb2.zzd, false);
        zzau zza = zzb2.zza();
        zzal(this.zzi);
        if (zzlj.zzB(zza, zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            List list = zzqVar.zzt;
            if (list == null) {
                zzauVar2 = zza;
            } else if (!list.contains(zza.zza)) {
                zzaA().zzc().zzd("Dropping non-safelisted event. appId, event name, origin", str3, zza.zza, zza.zzc);
                return;
            } else {
                Bundle zzc = zza.zzb.zzc();
                zzc.putLong("ga_safelisted", 1L);
                zzauVar2 = new zzau(zza.zza, new zzas(zzc), zza.zzc, zza.zzd);
            }
            zzak zzakVar = this.zze;
            zzal(zzakVar);
            zzakVar.zzw();
            try {
                zzak zzakVar2 = this.zze;
                zzal(zzakVar2);
                Preconditions.checkNotEmpty(str3);
                zzakVar2.zzg();
                zzakVar2.zzW();
                int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
                if (i2 < 0) {
                    zzakVar2.zzt.zzaA().zzk().zzc("Invalid time querying timed out conditional properties", zzet.zzn(str3), Long.valueOf(j2));
                    zzt = Collections.emptyList();
                } else {
                    zzt = zzakVar2.zzt("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str3, String.valueOf(j2)});
                }
                for (zzac zzacVar : zzt) {
                    if (zzacVar != null) {
                        zzaA().zzj().zzd("User property timed out", zzacVar.zza, this.zzn.zzj().zzf(zzacVar.zzc.zzb), zzacVar.zzc.zza());
                        zzau zzauVar3 = zzacVar.zzg;
                        if (zzauVar3 != null) {
                            zzY(new zzau(zzauVar3, j2), zzqVar);
                        }
                        zzak zzakVar3 = this.zze;
                        zzal(zzakVar3);
                        zzakVar3.zza(str3, zzacVar.zzc.zzb);
                    }
                }
                zzak zzakVar4 = this.zze;
                zzal(zzakVar4);
                Preconditions.checkNotEmpty(str3);
                zzakVar4.zzg();
                zzakVar4.zzW();
                if (i2 < 0) {
                    zzakVar4.zzt.zzaA().zzk().zzc("Invalid time querying expired conditional properties", zzet.zzn(str3), Long.valueOf(j2));
                    zzt2 = Collections.emptyList();
                } else {
                    zzt2 = zzakVar4.zzt("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str3, String.valueOf(j2)});
                }
                ArrayList<zzau> arrayList = new ArrayList(zzt2.size());
                for (zzac zzacVar2 : zzt2) {
                    if (zzacVar2 != null) {
                        zzaA().zzj().zzd("User property expired", zzacVar2.zza, this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzc.zza());
                        zzak zzakVar5 = this.zze;
                        zzal(zzakVar5);
                        zzakVar5.zzA(str3, zzacVar2.zzc.zzb);
                        zzau zzauVar4 = zzacVar2.zzk;
                        if (zzauVar4 != null) {
                            arrayList.add(zzauVar4);
                        }
                        zzak zzakVar6 = this.zze;
                        zzal(zzakVar6);
                        zzakVar6.zza(str3, zzacVar2.zzc.zzb);
                    }
                }
                for (zzau zzauVar5 : arrayList) {
                    zzY(new zzau(zzauVar5, j2), zzqVar);
                }
                zzak zzakVar7 = this.zze;
                zzal(zzakVar7);
                String str4 = zzauVar2.zza;
                Preconditions.checkNotEmpty(str3);
                Preconditions.checkNotEmpty(str4);
                zzakVar7.zzg();
                zzakVar7.zzW();
                if (i2 < 0) {
                    zzakVar7.zzt.zzaA().zzk().zzd("Invalid time querying triggered conditional properties", zzet.zzn(str3), zzakVar7.zzt.zzj().zzd(str4), Long.valueOf(j2));
                    zzt3 = Collections.emptyList();
                } else {
                    zzt3 = zzakVar7.zzt("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str3, str4, String.valueOf(j2)});
                }
                ArrayList<zzau> arrayList2 = new ArrayList(zzt3.size());
                for (zzac zzacVar3 : zzt3) {
                    if (zzacVar3 != null) {
                        zzlk zzlkVar = zzacVar3.zzc;
                        zzlm zzlmVar = new zzlm((String) Preconditions.checkNotNull(zzacVar3.zza), zzacVar3.zzb, zzlkVar.zzb, j2, Preconditions.checkNotNull(zzlkVar.zza()));
                        zzak zzakVar8 = this.zze;
                        zzal(zzakVar8);
                        if (zzakVar8.zzL(zzlmVar)) {
                            zzd = zzaA().zzj();
                            str = "User property triggered";
                            zzn = zzacVar3.zza;
                            zzf = this.zzn.zzj().zzf(zzlmVar.zzc);
                            obj = zzlmVar.zze;
                        } else {
                            zzd = zzaA().zzd();
                            str = "Too many active user properties, ignoring";
                            zzn = zzet.zzn(zzacVar3.zza);
                            zzf = this.zzn.zzj().zzf(zzlmVar.zzc);
                            obj = zzlmVar.zze;
                        }
                        zzd.zzd(str, zzn, zzf, obj);
                        zzau zzauVar6 = zzacVar3.zzi;
                        if (zzauVar6 != null) {
                            arrayList2.add(zzauVar6);
                        }
                        zzacVar3.zzc = new zzlk(zzlmVar);
                        zzacVar3.zze = true;
                        zzak zzakVar9 = this.zze;
                        zzal(zzakVar9);
                        zzakVar9.zzK(zzacVar3);
                    }
                }
                zzY(zzauVar2, zzqVar);
                for (zzau zzauVar7 : arrayList2) {
                    zzY(new zzau(zzauVar7, j2), zzqVar);
                }
                zzak zzakVar10 = this.zze;
                zzal(zzakVar10);
                zzakVar10.zzC();
            } finally {
                zzak zzakVar11 = this.zze;
                zzal(zzakVar11);
                zzakVar11.zzx();
            }
        }
    }

    @WorkerThread
    public final void zzF(zzau zzauVar, String str) {
        zzak zzakVar = this.zze;
        zzal(zzakVar);
        zzh zzj = zzakVar.zzj(str);
        if (zzj == null || TextUtils.isEmpty(zzj.zzy())) {
            zzaA().zzc().zzb("No app data available; dropping event", str);
            return;
        }
        Boolean zzad = zzad(zzj);
        if (zzad == null) {
            if (!"_ui".equals(zzauVar.zza)) {
                zzaA().zzk().zzb("Could not find package. appId", zzet.zzn(str));
            }
        } else if (!zzad.booleanValue()) {
            zzaA().zzd().zzb("App version does not match; dropping event. appId", zzet.zzn(str));
            return;
        }
        String zzA = zzj.zzA();
        String zzy = zzj.zzy();
        long zzb2 = zzj.zzb();
        String zzx = zzj.zzx();
        long zzm = zzj.zzm();
        long zzj2 = zzj.zzj();
        boolean zzan = zzj.zzan();
        String zzz = zzj.zzz();
        zzj.zza();
        zzG(zzauVar, new zzq(str, zzA, zzy, zzb2, zzx, zzm, zzj2, (String) null, zzan, false, zzz, 0L, 0L, 0, zzj.zzam(), false, zzj.zzt(), zzj.zzs(), zzj.zzk(), zzj.zzE(), (String) null, zzq(str).zzi(), "", (String) null, zzj.zzap(), zzj.zzr()));
    }

    @WorkerThread
    public final void zzG(zzau zzauVar, zzq zzqVar) {
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzeu zzb2 = zzeu.zzb(zzauVar);
        zzlp zzv = zzv();
        Bundle bundle = zzb2.zzd;
        zzak zzakVar = this.zze;
        zzal(zzakVar);
        zzv.zzL(bundle, zzakVar.zzi(zzqVar.zza));
        zzv().zzN(zzb2, zzg().zzd(zzqVar.zza));
        zzau zza = zzb2.zza();
        if (Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(zza.zza) && "referrer API v2".equals(zza.zzb.zzg("_cis"))) {
            String zzg = zza.zzb.zzg("gclid");
            if (!TextUtils.isEmpty(zzg)) {
                zzW(new zzlk("_lgclid", zza.zzd, zzg, y0.f581c), zzqVar);
            }
        }
        zzE(zza, zzqVar);
    }

    public final void zzH() {
        this.zzs++;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049 A[Catch: all -> 0x0172, TryCatch #1 {all -> 0x017c, blocks: (B:4:0x0010, B:5:0x0012, B:61:0x0164, B:6:0x002c, B:16:0x0049, B:60:0x015c, B:21:0x0063, B:26:0x00b5, B:25:0x00a6, B:29:0x00bd, B:32:0x00c9, B:34:0x00cf, B:37:0x00d9, B:40:0x00e5, B:42:0x00eb, B:47:0x00f8, B:51:0x0114, B:53:0x0129, B:55:0x0148, B:57:0x0153, B:59:0x0159, B:54:0x0137, B:48:0x0101, B:50:0x010c), top: B:70:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0129 A[Catch: all -> 0x0172, TryCatch #1 {all -> 0x017c, blocks: (B:4:0x0010, B:5:0x0012, B:61:0x0164, B:6:0x002c, B:16:0x0049, B:60:0x015c, B:21:0x0063, B:26:0x00b5, B:25:0x00a6, B:29:0x00bd, B:32:0x00c9, B:34:0x00cf, B:37:0x00d9, B:40:0x00e5, B:42:0x00eb, B:47:0x00f8, B:51:0x0114, B:53:0x0129, B:55:0x0148, B:57:0x0153, B:59:0x0159, B:54:0x0137, B:48:0x0101, B:50:0x010c), top: B:70:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0137 A[Catch: all -> 0x0172, TryCatch #1 {all -> 0x017c, blocks: (B:4:0x0010, B:5:0x0012, B:61:0x0164, B:6:0x002c, B:16:0x0049, B:60:0x015c, B:21:0x0063, B:26:0x00b5, B:25:0x00a6, B:29:0x00bd, B:32:0x00c9, B:34:0x00cf, B:37:0x00d9, B:40:0x00e5, B:42:0x00eb, B:47:0x00f8, B:51:0x0114, B:53:0x0129, B:55:0x0148, B:57:0x0153, B:59:0x0159, B:54:0x0137, B:48:0x0101, B:50:0x010c), top: B:70:0x0010 }] */
    @androidx.annotation.VisibleForTesting
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzI(java.lang.String r8, int r9, java.lang.Throwable r10, byte[] r11, java.util.Map r12) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlh.zzI(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    public final void zzJ(boolean z) {
        zzag();
    }

    @VisibleForTesting
    @WorkerThread
    public final void zzK(int i2, Throwable th, byte[] bArr, String str) {
        zzak zzakVar;
        long longValue;
        zzaB().zzg();
        zzB();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                this.zzu = false;
                zzae();
            }
        }
        List<Long> list = (List) Preconditions.checkNotNull(this.zzy);
        this.zzy = null;
        if (i2 != 200) {
            if (i2 == 204) {
                i2 = 204;
            }
            zzaA().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i2), th);
            this.zzk.zzd.zzb(zzax().currentTimeMillis());
            if (i2 != 503 || i2 == 429) {
                this.zzk.zzb.zzb(zzax().currentTimeMillis());
            }
            zzak zzakVar2 = this.zze;
            zzal(zzakVar2);
            zzakVar2.zzy(list);
            zzag();
        }
        if (th == null) {
            try {
                this.zzk.zzc.zzb(zzax().currentTimeMillis());
                this.zzk.zzd.zzb(0L);
                zzag();
                zzaA().zzj().zzc("Successful upload. Got network response. code, size", Integer.valueOf(i2), Integer.valueOf(bArr.length));
                zzak zzakVar3 = this.zze;
                zzal(zzakVar3);
                zzakVar3.zzw();
                try {
                    for (Long l2 : list) {
                        try {
                            zzakVar = this.zze;
                            zzal(zzakVar);
                            longValue = l2.longValue();
                            zzakVar.zzg();
                            zzakVar.zzW();
                            try {
                            } catch (SQLiteException e2) {
                                zzakVar.zzt.zzaA().zzd().zzb("Failed to delete a bundle in a queue table", e2);
                                throw e2;
                                break;
                            }
                        } catch (SQLiteException e3) {
                            List list2 = this.zzz;
                            if (list2 == null || !list2.contains(l2)) {
                                throw e3;
                            }
                        }
                        if (zzakVar.zzh().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                            throw new SQLiteException("Deleted fewer rows from queue than expected");
                            break;
                        }
                    }
                    zzak zzakVar4 = this.zze;
                    zzal(zzakVar4);
                    zzakVar4.zzC();
                    zzak zzakVar5 = this.zze;
                    zzal(zzakVar5);
                    zzakVar5.zzx();
                    this.zzz = null;
                    zzez zzezVar = this.zzd;
                    zzal(zzezVar);
                    if (zzezVar.zza() && zzai()) {
                        zzX();
                    } else {
                        this.zzA = -1L;
                        zzag();
                    }
                    this.zza = 0L;
                } catch (Throwable th2) {
                    zzak zzakVar6 = this.zze;
                    zzal(zzakVar6);
                    zzakVar6.zzx();
                    throw th2;
                }
            } catch (SQLiteException e4) {
                zzaA().zzd().zzb("Database error while trying to delete uploaded bundles", e4);
                this.zza = zzax().elapsedRealtime();
                zzaA().zzj().zzb("Disable upload, time", Long.valueOf(this.zza));
            }
        }
        zzaA().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i2), th);
        this.zzk.zzd.zzb(zzax().currentTimeMillis());
        if (i2 != 503) {
        }
        this.zzk.zzb.zzb(zzax().currentTimeMillis());
        zzak zzakVar22 = this.zze;
        zzal(zzakVar22);
        zzakVar22.zzy(list);
        zzag();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(2:97|98)|(2:100|(8:102|(3:104|(2:106|(1:108))(1:127)|109)(1:128)|110|(1:112)(1:126)|113|114|115|(4:117|(1:119)|120|(1:122))))|129|114|115|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x049c, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x049d, code lost:
        zzaA().zzd().zzc("Application info is null, first open report might be inaccurate. appId", com.google.android.gms.measurement.internal.zzet.zzn(r3), r0);
        r3 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03ce A[Catch: all -> 0x0564, TryCatch #0 {all -> 0x0564, blocks: (B:23:0x00a6, B:25:0x00b6, B:43:0x00fd, B:45:0x0110, B:47:0x0126, B:48:0x014d, B:50:0x01a7, B:52:0x01ac, B:54:0x01b2, B:56:0x01bb, B:68:0x01f5, B:70:0x0200, B:74:0x020d, B:77:0x021b, B:81:0x0226, B:83:0x0229, B:84:0x0249, B:86:0x024e, B:89:0x026d, B:92:0x0280, B:94:0x02a7, B:97:0x02af, B:99:0x02be, B:100:0x02ca, B:128:0x039a, B:130:0x03ce, B:131:0x03d1, B:133:0x03fa, B:172:0x04d1, B:173:0x04d4, B:182:0x0553, B:135:0x040f, B:140:0x0434, B:142:0x043c, B:144:0x0446, B:148:0x0459, B:152:0x046a, B:156:0x0476, B:159:0x048c, B:162:0x049d, B:164:0x04b1, B:166:0x04b7, B:167:0x04be, B:169:0x04c4, B:150:0x0462, B:138:0x0420, B:101:0x02cf, B:103:0x02fa, B:104:0x0307, B:106:0x030e, B:108:0x0314, B:110:0x031e, B:112:0x0324, B:114:0x032a, B:116:0x0330, B:117:0x0335, B:121:0x0357, B:124:0x035c, B:125:0x0370, B:126:0x037e, B:127:0x038c, B:174:0x04eb, B:176:0x051c, B:177:0x051f, B:178:0x0532, B:179:0x0536, B:181:0x053a, B:87:0x025d, B:64:0x01da, B:29:0x00c3, B:31:0x00c7, B:35:0x00d8, B:37:0x00e9, B:39:0x00f3, B:42:0x00fa), top: B:189:0x00a6, inners: #3, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03fa A[Catch: all -> 0x0564, TRY_LEAVE, TryCatch #0 {all -> 0x0564, blocks: (B:23:0x00a6, B:25:0x00b6, B:43:0x00fd, B:45:0x0110, B:47:0x0126, B:48:0x014d, B:50:0x01a7, B:52:0x01ac, B:54:0x01b2, B:56:0x01bb, B:68:0x01f5, B:70:0x0200, B:74:0x020d, B:77:0x021b, B:81:0x0226, B:83:0x0229, B:84:0x0249, B:86:0x024e, B:89:0x026d, B:92:0x0280, B:94:0x02a7, B:97:0x02af, B:99:0x02be, B:100:0x02ca, B:128:0x039a, B:130:0x03ce, B:131:0x03d1, B:133:0x03fa, B:172:0x04d1, B:173:0x04d4, B:182:0x0553, B:135:0x040f, B:140:0x0434, B:142:0x043c, B:144:0x0446, B:148:0x0459, B:152:0x046a, B:156:0x0476, B:159:0x048c, B:162:0x049d, B:164:0x04b1, B:166:0x04b7, B:167:0x04be, B:169:0x04c4, B:150:0x0462, B:138:0x0420, B:101:0x02cf, B:103:0x02fa, B:104:0x0307, B:106:0x030e, B:108:0x0314, B:110:0x031e, B:112:0x0324, B:114:0x032a, B:116:0x0330, B:117:0x0335, B:121:0x0357, B:124:0x035c, B:125:0x0370, B:126:0x037e, B:127:0x038c, B:174:0x04eb, B:176:0x051c, B:177:0x051f, B:178:0x0532, B:179:0x0536, B:181:0x053a, B:87:0x025d, B:64:0x01da, B:29:0x00c3, B:31:0x00c7, B:35:0x00d8, B:37:0x00e9, B:39:0x00f3, B:42:0x00fa), top: B:189:0x00a6, inners: #3, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04b1 A[Catch: all -> 0x0564, TryCatch #0 {all -> 0x0564, blocks: (B:23:0x00a6, B:25:0x00b6, B:43:0x00fd, B:45:0x0110, B:47:0x0126, B:48:0x014d, B:50:0x01a7, B:52:0x01ac, B:54:0x01b2, B:56:0x01bb, B:68:0x01f5, B:70:0x0200, B:74:0x020d, B:77:0x021b, B:81:0x0226, B:83:0x0229, B:84:0x0249, B:86:0x024e, B:89:0x026d, B:92:0x0280, B:94:0x02a7, B:97:0x02af, B:99:0x02be, B:100:0x02ca, B:128:0x039a, B:130:0x03ce, B:131:0x03d1, B:133:0x03fa, B:172:0x04d1, B:173:0x04d4, B:182:0x0553, B:135:0x040f, B:140:0x0434, B:142:0x043c, B:144:0x0446, B:148:0x0459, B:152:0x046a, B:156:0x0476, B:159:0x048c, B:162:0x049d, B:164:0x04b1, B:166:0x04b7, B:167:0x04be, B:169:0x04c4, B:150:0x0462, B:138:0x0420, B:101:0x02cf, B:103:0x02fa, B:104:0x0307, B:106:0x030e, B:108:0x0314, B:110:0x031e, B:112:0x0324, B:114:0x032a, B:116:0x0330, B:117:0x0335, B:121:0x0357, B:124:0x035c, B:125:0x0370, B:126:0x037e, B:127:0x038c, B:174:0x04eb, B:176:0x051c, B:177:0x051f, B:178:0x0532, B:179:0x0536, B:181:0x053a, B:87:0x025d, B:64:0x01da, B:29:0x00c3, B:31:0x00c7, B:35:0x00d8, B:37:0x00e9, B:39:0x00f3, B:42:0x00fa), top: B:189:0x00a6, inners: #3, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04d1 A[Catch: all -> 0x0564, TryCatch #0 {all -> 0x0564, blocks: (B:23:0x00a6, B:25:0x00b6, B:43:0x00fd, B:45:0x0110, B:47:0x0126, B:48:0x014d, B:50:0x01a7, B:52:0x01ac, B:54:0x01b2, B:56:0x01bb, B:68:0x01f5, B:70:0x0200, B:74:0x020d, B:77:0x021b, B:81:0x0226, B:83:0x0229, B:84:0x0249, B:86:0x024e, B:89:0x026d, B:92:0x0280, B:94:0x02a7, B:97:0x02af, B:99:0x02be, B:100:0x02ca, B:128:0x039a, B:130:0x03ce, B:131:0x03d1, B:133:0x03fa, B:172:0x04d1, B:173:0x04d4, B:182:0x0553, B:135:0x040f, B:140:0x0434, B:142:0x043c, B:144:0x0446, B:148:0x0459, B:152:0x046a, B:156:0x0476, B:159:0x048c, B:162:0x049d, B:164:0x04b1, B:166:0x04b7, B:167:0x04be, B:169:0x04c4, B:150:0x0462, B:138:0x0420, B:101:0x02cf, B:103:0x02fa, B:104:0x0307, B:106:0x030e, B:108:0x0314, B:110:0x031e, B:112:0x0324, B:114:0x032a, B:116:0x0330, B:117:0x0335, B:121:0x0357, B:124:0x035c, B:125:0x0370, B:126:0x037e, B:127:0x038c, B:174:0x04eb, B:176:0x051c, B:177:0x051f, B:178:0x0532, B:179:0x0536, B:181:0x053a, B:87:0x025d, B:64:0x01da, B:29:0x00c3, B:31:0x00c7, B:35:0x00d8, B:37:0x00e9, B:39:0x00f3, B:42:0x00fa), top: B:189:0x00a6, inners: #3, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0536 A[Catch: all -> 0x0564, TryCatch #0 {all -> 0x0564, blocks: (B:23:0x00a6, B:25:0x00b6, B:43:0x00fd, B:45:0x0110, B:47:0x0126, B:48:0x014d, B:50:0x01a7, B:52:0x01ac, B:54:0x01b2, B:56:0x01bb, B:68:0x01f5, B:70:0x0200, B:74:0x020d, B:77:0x021b, B:81:0x0226, B:83:0x0229, B:84:0x0249, B:86:0x024e, B:89:0x026d, B:92:0x0280, B:94:0x02a7, B:97:0x02af, B:99:0x02be, B:100:0x02ca, B:128:0x039a, B:130:0x03ce, B:131:0x03d1, B:133:0x03fa, B:172:0x04d1, B:173:0x04d4, B:182:0x0553, B:135:0x040f, B:140:0x0434, B:142:0x043c, B:144:0x0446, B:148:0x0459, B:152:0x046a, B:156:0x0476, B:159:0x048c, B:162:0x049d, B:164:0x04b1, B:166:0x04b7, B:167:0x04be, B:169:0x04c4, B:150:0x0462, B:138:0x0420, B:101:0x02cf, B:103:0x02fa, B:104:0x0307, B:106:0x030e, B:108:0x0314, B:110:0x031e, B:112:0x0324, B:114:0x032a, B:116:0x0330, B:117:0x0335, B:121:0x0357, B:124:0x035c, B:125:0x0370, B:126:0x037e, B:127:0x038c, B:174:0x04eb, B:176:0x051c, B:177:0x051f, B:178:0x0532, B:179:0x0536, B:181:0x053a, B:87:0x025d, B:64:0x01da, B:29:0x00c3, B:31:0x00c7, B:35:0x00d8, B:37:0x00e9, B:39:0x00f3, B:42:0x00fa), top: B:189:0x00a6, inners: #3, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x040f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f5 A[Catch: all -> 0x0564, TryCatch #0 {all -> 0x0564, blocks: (B:23:0x00a6, B:25:0x00b6, B:43:0x00fd, B:45:0x0110, B:47:0x0126, B:48:0x014d, B:50:0x01a7, B:52:0x01ac, B:54:0x01b2, B:56:0x01bb, B:68:0x01f5, B:70:0x0200, B:74:0x020d, B:77:0x021b, B:81:0x0226, B:83:0x0229, B:84:0x0249, B:86:0x024e, B:89:0x026d, B:92:0x0280, B:94:0x02a7, B:97:0x02af, B:99:0x02be, B:100:0x02ca, B:128:0x039a, B:130:0x03ce, B:131:0x03d1, B:133:0x03fa, B:172:0x04d1, B:173:0x04d4, B:182:0x0553, B:135:0x040f, B:140:0x0434, B:142:0x043c, B:144:0x0446, B:148:0x0459, B:152:0x046a, B:156:0x0476, B:159:0x048c, B:162:0x049d, B:164:0x04b1, B:166:0x04b7, B:167:0x04be, B:169:0x04c4, B:150:0x0462, B:138:0x0420, B:101:0x02cf, B:103:0x02fa, B:104:0x0307, B:106:0x030e, B:108:0x0314, B:110:0x031e, B:112:0x0324, B:114:0x032a, B:116:0x0330, B:117:0x0335, B:121:0x0357, B:124:0x035c, B:125:0x0370, B:126:0x037e, B:127:0x038c, B:174:0x04eb, B:176:0x051c, B:177:0x051f, B:178:0x0532, B:179:0x0536, B:181:0x053a, B:87:0x025d, B:64:0x01da, B:29:0x00c3, B:31:0x00c7, B:35:0x00d8, B:37:0x00e9, B:39:0x00f3, B:42:0x00fa), top: B:189:0x00a6, inners: #3, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x024e A[Catch: all -> 0x0564, TryCatch #0 {all -> 0x0564, blocks: (B:23:0x00a6, B:25:0x00b6, B:43:0x00fd, B:45:0x0110, B:47:0x0126, B:48:0x014d, B:50:0x01a7, B:52:0x01ac, B:54:0x01b2, B:56:0x01bb, B:68:0x01f5, B:70:0x0200, B:74:0x020d, B:77:0x021b, B:81:0x0226, B:83:0x0229, B:84:0x0249, B:86:0x024e, B:89:0x026d, B:92:0x0280, B:94:0x02a7, B:97:0x02af, B:99:0x02be, B:100:0x02ca, B:128:0x039a, B:130:0x03ce, B:131:0x03d1, B:133:0x03fa, B:172:0x04d1, B:173:0x04d4, B:182:0x0553, B:135:0x040f, B:140:0x0434, B:142:0x043c, B:144:0x0446, B:148:0x0459, B:152:0x046a, B:156:0x0476, B:159:0x048c, B:162:0x049d, B:164:0x04b1, B:166:0x04b7, B:167:0x04be, B:169:0x04c4, B:150:0x0462, B:138:0x0420, B:101:0x02cf, B:103:0x02fa, B:104:0x0307, B:106:0x030e, B:108:0x0314, B:110:0x031e, B:112:0x0324, B:114:0x032a, B:116:0x0330, B:117:0x0335, B:121:0x0357, B:124:0x035c, B:125:0x0370, B:126:0x037e, B:127:0x038c, B:174:0x04eb, B:176:0x051c, B:177:0x051f, B:178:0x0532, B:179:0x0536, B:181:0x053a, B:87:0x025d, B:64:0x01da, B:29:0x00c3, B:31:0x00c7, B:35:0x00d8, B:37:0x00e9, B:39:0x00f3, B:42:0x00fa), top: B:189:0x00a6, inners: #3, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x025d A[Catch: all -> 0x0564, TryCatch #0 {all -> 0x0564, blocks: (B:23:0x00a6, B:25:0x00b6, B:43:0x00fd, B:45:0x0110, B:47:0x0126, B:48:0x014d, B:50:0x01a7, B:52:0x01ac, B:54:0x01b2, B:56:0x01bb, B:68:0x01f5, B:70:0x0200, B:74:0x020d, B:77:0x021b, B:81:0x0226, B:83:0x0229, B:84:0x0249, B:86:0x024e, B:89:0x026d, B:92:0x0280, B:94:0x02a7, B:97:0x02af, B:99:0x02be, B:100:0x02ca, B:128:0x039a, B:130:0x03ce, B:131:0x03d1, B:133:0x03fa, B:172:0x04d1, B:173:0x04d4, B:182:0x0553, B:135:0x040f, B:140:0x0434, B:142:0x043c, B:144:0x0446, B:148:0x0459, B:152:0x046a, B:156:0x0476, B:159:0x048c, B:162:0x049d, B:164:0x04b1, B:166:0x04b7, B:167:0x04be, B:169:0x04c4, B:150:0x0462, B:138:0x0420, B:101:0x02cf, B:103:0x02fa, B:104:0x0307, B:106:0x030e, B:108:0x0314, B:110:0x031e, B:112:0x0324, B:114:0x032a, B:116:0x0330, B:117:0x0335, B:121:0x0357, B:124:0x035c, B:125:0x0370, B:126:0x037e, B:127:0x038c, B:174:0x04eb, B:176:0x051c, B:177:0x051f, B:178:0x0532, B:179:0x0536, B:181:0x053a, B:87:0x025d, B:64:0x01da, B:29:0x00c3, B:31:0x00c7, B:35:0x00d8, B:37:0x00e9, B:39:0x00f3, B:42:0x00fa), top: B:189:0x00a6, inners: #3, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x026d A[Catch: all -> 0x0564, TRY_LEAVE, TryCatch #0 {all -> 0x0564, blocks: (B:23:0x00a6, B:25:0x00b6, B:43:0x00fd, B:45:0x0110, B:47:0x0126, B:48:0x014d, B:50:0x01a7, B:52:0x01ac, B:54:0x01b2, B:56:0x01bb, B:68:0x01f5, B:70:0x0200, B:74:0x020d, B:77:0x021b, B:81:0x0226, B:83:0x0229, B:84:0x0249, B:86:0x024e, B:89:0x026d, B:92:0x0280, B:94:0x02a7, B:97:0x02af, B:99:0x02be, B:100:0x02ca, B:128:0x039a, B:130:0x03ce, B:131:0x03d1, B:133:0x03fa, B:172:0x04d1, B:173:0x04d4, B:182:0x0553, B:135:0x040f, B:140:0x0434, B:142:0x043c, B:144:0x0446, B:148:0x0459, B:152:0x046a, B:156:0x0476, B:159:0x048c, B:162:0x049d, B:164:0x04b1, B:166:0x04b7, B:167:0x04be, B:169:0x04c4, B:150:0x0462, B:138:0x0420, B:101:0x02cf, B:103:0x02fa, B:104:0x0307, B:106:0x030e, B:108:0x0314, B:110:0x031e, B:112:0x0324, B:114:0x032a, B:116:0x0330, B:117:0x0335, B:121:0x0357, B:124:0x035c, B:125:0x0370, B:126:0x037e, B:127:0x038c, B:174:0x04eb, B:176:0x051c, B:177:0x051f, B:178:0x0532, B:179:0x0536, B:181:0x053a, B:87:0x025d, B:64:0x01da, B:29:0x00c3, B:31:0x00c7, B:35:0x00d8, B:37:0x00e9, B:39:0x00f3, B:42:0x00fa), top: B:189:0x00a6, inners: #3, #5, #6 }] */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzL(com.google.android.gms.measurement.internal.zzq r24) {
        /*
            Method dump skipped, instructions count: 1391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlh.zzL(com.google.android.gms.measurement.internal.zzq):void");
    }

    public final void zzM() {
        this.zzr++;
    }

    @WorkerThread
    public final void zzN(zzac zzacVar) {
        zzq zzac = zzac((String) Preconditions.checkNotNull(zzacVar.zza));
        if (zzac != null) {
            zzO(zzacVar, zzac);
        }
    }

    @WorkerThread
    public final void zzO(zzac zzacVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotEmpty(zzacVar.zza);
        Preconditions.checkNotNull(zzacVar.zzc);
        Preconditions.checkNotEmpty(zzacVar.zzc.zzb);
        zzaB().zzg();
        zzB();
        if (zzak(zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            zzak zzakVar = this.zze;
            zzal(zzakVar);
            zzakVar.zzw();
            try {
                zzd(zzqVar);
                String str = (String) Preconditions.checkNotNull(zzacVar.zza);
                zzak zzakVar2 = this.zze;
                zzal(zzakVar2);
                zzac zzk = zzakVar2.zzk(str, zzacVar.zzc.zzb);
                if (zzk != null) {
                    zzaA().zzc().zzc("Removing conditional user property", zzacVar.zza, this.zzn.zzj().zzf(zzacVar.zzc.zzb));
                    zzak zzakVar3 = this.zze;
                    zzal(zzakVar3);
                    zzakVar3.zza(str, zzacVar.zzc.zzb);
                    if (zzk.zze) {
                        zzak zzakVar4 = this.zze;
                        zzal(zzakVar4);
                        zzakVar4.zzA(str, zzacVar.zzc.zzb);
                    }
                    zzau zzauVar = zzacVar.zzk;
                    if (zzauVar != null) {
                        zzas zzasVar = zzauVar.zzb;
                        zzY((zzau) Preconditions.checkNotNull(zzv().zzz(str, ((zzau) Preconditions.checkNotNull(zzacVar.zzk)).zza, zzasVar != null ? zzasVar.zzc() : null, zzk.zzb, zzacVar.zzk.zzd, true, true)), zzqVar);
                    }
                } else {
                    zzaA().zzk().zzc("Conditional user property doesn't exist", zzet.zzn(zzacVar.zza), this.zzn.zzj().zzf(zzacVar.zzc.zzb));
                }
                zzak zzakVar5 = this.zze;
                zzal(zzakVar5);
                zzakVar5.zzC();
            } finally {
                zzak zzakVar6 = this.zze;
                zzal(zzakVar6);
                zzakVar6.zzx();
            }
        }
    }

    @WorkerThread
    public final void zzP(String str, zzq zzqVar) {
        zzaB().zzg();
        zzB();
        if (zzak(zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
            } else if ("_npa".equals(str) && zzqVar.zzr != null) {
                zzaA().zzc().zza("Falling back to manifest metadata value for ad personalization");
                zzW(new zzlk("_npa", zzax().currentTimeMillis(), Long.valueOf(true != zzqVar.zzr.booleanValue() ? 0L : 1L), y0.f581c), zzqVar);
            } else {
                zzaA().zzc().zzb("Removing user property", this.zzn.zzj().zzf(str));
                zzak zzakVar = this.zze;
                zzal(zzakVar);
                zzakVar.zzw();
                try {
                    zzd(zzqVar);
                    if ("_id".equals(str)) {
                        zzak zzakVar2 = this.zze;
                        zzal(zzakVar2);
                        zzakVar2.zzA((String) Preconditions.checkNotNull(zzqVar.zza), "_lair");
                    }
                    zzak zzakVar3 = this.zze;
                    zzal(zzakVar3);
                    zzakVar3.zzA((String) Preconditions.checkNotNull(zzqVar.zza), str);
                    zzak zzakVar4 = this.zze;
                    zzal(zzakVar4);
                    zzakVar4.zzC();
                    zzaA().zzc().zzb("User property removed", this.zzn.zzj().zzf(str));
                } finally {
                    zzak zzakVar5 = this.zze;
                    zzal(zzakVar5);
                    zzakVar5.zzx();
                }
            }
        }
    }

    @VisibleForTesting
    @WorkerThread
    public final void zzQ(zzq zzqVar) {
        if (this.zzy != null) {
            ArrayList arrayList = new ArrayList();
            this.zzz = arrayList;
            arrayList.addAll(this.zzy);
        }
        zzak zzakVar = this.zze;
        zzal(zzakVar);
        String str = (String) Preconditions.checkNotNull(zzqVar.zza);
        Preconditions.checkNotEmpty(str);
        zzakVar.zzg();
        zzakVar.zzW();
        try {
            SQLiteDatabase zzh = zzakVar.zzh();
            String[] strArr = {str};
            int delete = zzh.delete("apps", "app_id=?", strArr) + zzh.delete("events", "app_id=?", strArr) + zzh.delete("user_attributes", "app_id=?", strArr) + zzh.delete("conditional_properties", "app_id=?", strArr) + zzh.delete("raw_events", "app_id=?", strArr) + zzh.delete("raw_events_metadata", "app_id=?", strArr) + zzh.delete("queue", "app_id=?", strArr) + zzh.delete("audience_filter_values", "app_id=?", strArr) + zzh.delete("main_event_params", "app_id=?", strArr) + zzh.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                zzakVar.zzt.zzaA().zzj().zzc("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e2) {
            zzakVar.zzt.zzaA().zzd().zzc("Error resetting analytics data. appId, error", zzet.zzn(str), e2);
        }
        if (zzqVar.zzh) {
            zzL(zzqVar);
        }
    }

    @WorkerThread
    public final void zzR(String str, zzir zzirVar) {
        zzaB().zzg();
        String str2 = this.zzE;
        if (str2 == null || str2.equals(str) || zzirVar != null) {
            this.zzE = str;
            this.zzD = zzirVar;
        }
    }

    @WorkerThread
    public final void zzS() {
        zzaB().zzg();
        zzak zzakVar = this.zze;
        zzal(zzakVar);
        zzakVar.zzz();
        if (this.zzk.zzc.zza() == 0) {
            this.zzk.zzc.zzb(zzax().currentTimeMillis());
        }
        zzag();
    }

    @WorkerThread
    public final void zzT(zzac zzacVar) {
        zzq zzac = zzac((String) Preconditions.checkNotNull(zzacVar.zza));
        if (zzac != null) {
            zzU(zzacVar, zzac);
        }
    }

    @WorkerThread
    public final void zzU(zzac zzacVar, zzq zzqVar) {
        zzer zzd;
        String str;
        Object zzn;
        String zzf;
        Object zza;
        zzer zzd2;
        String str2;
        Object zzn2;
        String zzf2;
        Object obj;
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotEmpty(zzacVar.zza);
        Preconditions.checkNotNull(zzacVar.zzb);
        Preconditions.checkNotNull(zzacVar.zzc);
        Preconditions.checkNotEmpty(zzacVar.zzc.zzb);
        zzaB().zzg();
        zzB();
        if (zzak(zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            zzac zzacVar2 = new zzac(zzacVar);
            boolean z = false;
            zzacVar2.zze = false;
            zzak zzakVar = this.zze;
            zzal(zzakVar);
            zzakVar.zzw();
            try {
                zzak zzakVar2 = this.zze;
                zzal(zzakVar2);
                zzac zzk = zzakVar2.zzk((String) Preconditions.checkNotNull(zzacVar2.zza), zzacVar2.zzc.zzb);
                if (zzk != null && !zzk.zzb.equals(zzacVar2.zzb)) {
                    zzaA().zzk().zzd("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzb, zzk.zzb);
                }
                if (zzk != null && zzk.zze) {
                    zzacVar2.zzb = zzk.zzb;
                    zzacVar2.zzd = zzk.zzd;
                    zzacVar2.zzh = zzk.zzh;
                    zzacVar2.zzf = zzk.zzf;
                    zzacVar2.zzi = zzk.zzi;
                    zzacVar2.zze = true;
                    zzlk zzlkVar = zzacVar2.zzc;
                    zzacVar2.zzc = new zzlk(zzlkVar.zzb, zzk.zzc.zzc, zzlkVar.zza(), zzk.zzc.zzf);
                } else if (TextUtils.isEmpty(zzacVar2.zzf)) {
                    zzlk zzlkVar2 = zzacVar2.zzc;
                    zzacVar2.zzc = new zzlk(zzlkVar2.zzb, zzacVar2.zzd, zzlkVar2.zza(), zzacVar2.zzc.zzf);
                    zzacVar2.zze = true;
                    z = true;
                }
                if (zzacVar2.zze) {
                    zzlk zzlkVar3 = zzacVar2.zzc;
                    zzlm zzlmVar = new zzlm((String) Preconditions.checkNotNull(zzacVar2.zza), zzacVar2.zzb, zzlkVar3.zzb, zzlkVar3.zzc, Preconditions.checkNotNull(zzlkVar3.zza()));
                    zzak zzakVar3 = this.zze;
                    zzal(zzakVar3);
                    if (zzakVar3.zzL(zzlmVar)) {
                        zzd2 = zzaA().zzc();
                        str2 = "User property updated immediately";
                        zzn2 = zzacVar2.zza;
                        zzf2 = this.zzn.zzj().zzf(zzlmVar.zzc);
                        obj = zzlmVar.zze;
                    } else {
                        zzd2 = zzaA().zzd();
                        str2 = "(2)Too many active user properties, ignoring";
                        zzn2 = zzet.zzn(zzacVar2.zza);
                        zzf2 = this.zzn.zzj().zzf(zzlmVar.zzc);
                        obj = zzlmVar.zze;
                    }
                    zzd2.zzd(str2, zzn2, zzf2, obj);
                    if (z && zzacVar2.zzi != null) {
                        zzY(new zzau(zzacVar2.zzi, zzacVar2.zzd), zzqVar);
                    }
                }
                zzak zzakVar4 = this.zze;
                zzal(zzakVar4);
                if (zzakVar4.zzK(zzacVar2)) {
                    zzd = zzaA().zzc();
                    str = "Conditional property added";
                    zzn = zzacVar2.zza;
                    zzf = this.zzn.zzj().zzf(zzacVar2.zzc.zzb);
                    zza = zzacVar2.zzc.zza();
                } else {
                    zzd = zzaA().zzd();
                    str = "Too many conditional properties, ignoring";
                    zzn = zzet.zzn(zzacVar2.zza);
                    zzf = this.zzn.zzj().zzf(zzacVar2.zzc.zzb);
                    zza = zzacVar2.zzc.zza();
                }
                zzd.zzd(str, zzn, zzf, zza);
                zzak zzakVar5 = this.zze;
                zzal(zzakVar5);
                zzakVar5.zzC();
            } finally {
                zzak zzakVar6 = this.zze;
                zzal(zzakVar6);
                zzakVar6.zzx();
            }
        }
    }

    @WorkerThread
    public final void zzV(String str, zzhb zzhbVar) {
        zzaB().zzg();
        zzB();
        this.zzB.put(str, zzhbVar);
        zzak zzakVar = this.zze;
        zzal(zzakVar);
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzhbVar);
        zzakVar.zzg();
        zzakVar.zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", zzhbVar.zzi());
        try {
            if (zzakVar.zzh().insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                zzakVar.zzt.zzaA().zzd().zzb("Failed to insert/update consent setting (got -1). appId", zzet.zzn(str));
            }
        } catch (SQLiteException e2) {
            zzakVar.zzt.zzaA().zzd().zzc("Error storing consent setting. appId, error", zzet.zzn(str), e2);
        }
    }

    @WorkerThread
    public final void zzW(zzlk zzlkVar, zzq zzqVar) {
        long j2;
        zzaB().zzg();
        zzB();
        if (zzak(zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            int zzl = zzv().zzl(zzlkVar.zzb);
            int i2 = 0;
            if (zzl != 0) {
                zzlp zzv = zzv();
                String str = zzlkVar.zzb;
                zzg();
                String zzD = zzv.zzD(str, 24, true);
                String str2 = zzlkVar.zzb;
                zzv().zzO(this.zzF, zzqVar.zza, zzl, "_ev", zzD, str2 != null ? str2.length() : 0);
                return;
            }
            int zzd = zzv().zzd(zzlkVar.zzb, zzlkVar.zza());
            if (zzd != 0) {
                zzlp zzv2 = zzv();
                String str3 = zzlkVar.zzb;
                zzg();
                String zzD2 = zzv2.zzD(str3, 24, true);
                Object zza = zzlkVar.zza();
                if (zza != null && ((zza instanceof String) || (zza instanceof CharSequence))) {
                    i2 = zza.toString().length();
                }
                zzv().zzO(this.zzF, zzqVar.zza, zzd, "_ev", zzD2, i2);
                return;
            }
            Object zzB = zzv().zzB(zzlkVar.zzb, zzlkVar.zza());
            if (zzB == null) {
                return;
            }
            if ("_sid".equals(zzlkVar.zzb)) {
                long j3 = zzlkVar.zzc;
                String str4 = zzlkVar.zzf;
                String str5 = (String) Preconditions.checkNotNull(zzqVar.zza);
                zzak zzakVar = this.zze;
                zzal(zzakVar);
                zzlm zzp = zzakVar.zzp(str5, "_sno");
                if (zzp != null) {
                    Object obj = zzp.zze;
                    if (obj instanceof Long) {
                        j2 = ((Long) obj).longValue();
                        zzW(new zzlk("_sno", j3, Long.valueOf(j2 + 1), str4), zzqVar);
                    }
                }
                if (zzp != null) {
                    zzaA().zzk().zzb("Retrieved last session number from database does not contain a valid (long) value", zzp.zze);
                }
                zzak zzakVar2 = this.zze;
                zzal(zzakVar2);
                zzaq zzn = zzakVar2.zzn(str5, "_s");
                if (zzn != null) {
                    j2 = zzn.zzc;
                    zzaA().zzj().zzb("Backfill the session number. Last used session number", Long.valueOf(j2));
                } else {
                    j2 = 0;
                }
                zzW(new zzlk("_sno", j3, Long.valueOf(j2 + 1), str4), zzqVar);
            }
            zzlm zzlmVar = new zzlm((String) Preconditions.checkNotNull(zzqVar.zza), (String) Preconditions.checkNotNull(zzlkVar.zzf), zzlkVar.zzb, zzlkVar.zzc, zzB);
            zzaA().zzj().zzc("Setting user property", this.zzn.zzj().zzf(zzlmVar.zzc), zzB);
            zzak zzakVar3 = this.zze;
            zzal(zzakVar3);
            zzakVar3.zzw();
            try {
                if ("_id".equals(zzlmVar.zzc)) {
                    zzak zzakVar4 = this.zze;
                    zzal(zzakVar4);
                    zzlm zzp2 = zzakVar4.zzp(zzqVar.zza, "_id");
                    if (zzp2 != null && !zzlmVar.zze.equals(zzp2.zze)) {
                        zzak zzakVar5 = this.zze;
                        zzal(zzakVar5);
                        zzakVar5.zzA(zzqVar.zza, "_lair");
                    }
                }
                zzd(zzqVar);
                zzak zzakVar6 = this.zze;
                zzal(zzakVar6);
                boolean zzL = zzakVar6.zzL(zzlmVar);
                if (zzg().zzs(null, zzeg.zzaH) && "_sid".equals(zzlkVar.zzb)) {
                    zzlj zzljVar = this.zzi;
                    zzal(zzljVar);
                    long zzd2 = zzljVar.zzd(zzqVar.zzx);
                    zzak zzakVar7 = this.zze;
                    zzal(zzakVar7);
                    zzh zzj = zzakVar7.zzj(zzqVar.zza);
                    if (zzj != null) {
                        zzj.zzaj(zzd2);
                        if (zzj.zzao()) {
                            zzak zzakVar8 = this.zze;
                            zzal(zzakVar8);
                            zzakVar8.zzD(zzj);
                        }
                    }
                }
                zzak zzakVar9 = this.zze;
                zzal(zzakVar9);
                zzakVar9.zzC();
                if (!zzL) {
                    zzaA().zzd().zzc("Too many unique user properties are set. Ignoring user property", this.zzn.zzj().zzf(zzlmVar.zzc), zzlmVar.zze);
                    zzv().zzO(this.zzF, zzqVar.zza, 9, null, null, 0);
                }
            } finally {
                zzak zzakVar10 = this.zze;
                zzal(zzakVar10);
                zzakVar10.zzx();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x02e3, code lost:
        r0 = r0.subList(0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02e8, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02e9, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x04fb, code lost:
        if (r3 == null) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0115, code lost:
        if (r11 == null) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x024b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x028a A[Catch: all -> 0x0520, TryCatch #0 {all -> 0x0520, blocks: (B:128:0x0284, B:130:0x028a, B:132:0x0296, B:133:0x029a, B:135:0x02a0, B:137:0x02b4, B:141:0x02bd, B:143:0x02c3, B:146:0x02d8, B:154:0x02ef, B:156:0x030a, B:160:0x0319, B:162:0x033d, B:166:0x0377, B:168:0x037c, B:170:0x0384, B:171:0x0387, B:173:0x038c, B:174:0x038f, B:176:0x039b, B:177:0x03b1, B:180:0x03bd, B:182:0x03ce, B:184:0x03df, B:185:0x03f4, B:187:0x0401, B:189:0x0416, B:193:0x0426, B:194:0x042a, B:188:0x040f, B:196:0x0479, B:115:0x0255, B:127:0x0281, B:200:0x0494, B:201:0x0497, B:202:0x0498, B:207:0x04d8, B:223:0x04ff, B:225:0x0505, B:227:0x0510, B:211:0x04e1, B:232:0x051c, B:233:0x051f, B:192:0x0422), top: B:240:0x00da, inners: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0505 A[Catch: all -> 0x0520, TryCatch #0 {all -> 0x0520, blocks: (B:128:0x0284, B:130:0x028a, B:132:0x0296, B:133:0x029a, B:135:0x02a0, B:137:0x02b4, B:141:0x02bd, B:143:0x02c3, B:146:0x02d8, B:154:0x02ef, B:156:0x030a, B:160:0x0319, B:162:0x033d, B:166:0x0377, B:168:0x037c, B:170:0x0384, B:171:0x0387, B:173:0x038c, B:174:0x038f, B:176:0x039b, B:177:0x03b1, B:180:0x03bd, B:182:0x03ce, B:184:0x03df, B:185:0x03f4, B:187:0x0401, B:189:0x0416, B:193:0x0426, B:194:0x042a, B:188:0x040f, B:196:0x0479, B:115:0x0255, B:127:0x0281, B:200:0x0494, B:201:0x0497, B:202:0x0498, B:207:0x04d8, B:223:0x04ff, B:225:0x0505, B:227:0x0510, B:211:0x04e1, B:232:0x051c, B:233:0x051f, B:192:0x0422), top: B:240:0x00da, inners: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0255 A[ADDED_TO_REGION, EDGE_INSN: B:281:0x0255->B:115:0x0255 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011f A[Catch: all -> 0x0523, TryCatch #5 {all -> 0x0523, blocks: (B:3:0x0010, B:5:0x0021, B:6:0x002b, B:10:0x0034, B:12:0x003a, B:13:0x0045, B:15:0x004d, B:16:0x0051, B:18:0x005c, B:19:0x0067, B:21:0x0072, B:22:0x0080, B:24:0x009f, B:26:0x00a5, B:27:0x00a8, B:29:0x00b4, B:30:0x00cb, B:32:0x00dc, B:34:0x00e2, B:38:0x00f7, B:51:0x0118, B:55:0x011f, B:56:0x0122, B:57:0x0123, B:61:0x014b, B:65:0x0153, B:70:0x0187, B:192:0x0422), top: B:244:0x0010 }] */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzX() {
        /*
            Method dump skipped, instructions count: 1323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlh.zzX():void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:93:0x02f6
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @androidx.annotation.WorkerThread
    public final void zzY(com.google.android.gms.measurement.internal.zzau r36, com.google.android.gms.measurement.internal.zzq r37) {
        /*
            Method dump skipped, instructions count: 2912
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlh.zzY(com.google.android.gms.measurement.internal.zzau, com.google.android.gms.measurement.internal.zzq):void");
    }

    @VisibleForTesting
    @WorkerThread
    public final boolean zzZ() {
        zzer zzk;
        String str;
        zzaB().zzg();
        FileLock fileLock = this.zzw;
        if (fileLock != null && fileLock.isValid()) {
            zzaA().zzj().zza("Storage concurrent access okay");
            return true;
        }
        this.zze.zzt.zzf();
        try {
            FileChannel channel = new RandomAccessFile(new File(this.zzn.zzaw().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.zzx = channel;
            FileLock tryLock = channel.tryLock();
            this.zzw = tryLock;
            if (tryLock != null) {
                zzaA().zzj().zza("Storage concurrent access okay");
                return true;
            }
            zzaA().zzd().zza("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e2) {
            e = e2;
            zzk = zzaA().zzd();
            str = "Failed to acquire storage lock";
            zzk.zzb(str, e);
            return false;
        } catch (IOException e3) {
            e = e3;
            zzk = zzaA().zzd();
            str = "Failed to access storage lock file";
            zzk.zzb(str, e);
            return false;
        } catch (OverlappingFileLockException e4) {
            e = e4;
            zzk = zzaA().zzk();
            str = "Storage lock already acquired";
            zzk.zzb(str, e);
            return false;
        }
    }

    public final long zza() {
        long currentTimeMillis = zzax().currentTimeMillis();
        zzkb zzkbVar = this.zzk;
        zzkbVar.zzW();
        zzkbVar.zzg();
        long zza = zzkbVar.zze.zza();
        if (zza == 0) {
            zza = zzkbVar.zzt.zzv().zzG().nextInt(86400000) + 1;
            zzkbVar.zze.zzb(zza);
        }
        return ((((currentTimeMillis + zza) / 1000) / 60) / 60) / 24;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final zzet zzaA() {
        return ((zzgd) Preconditions.checkNotNull(this.zzn)).zzaA();
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final zzga zzaB() {
        return ((zzgd) Preconditions.checkNotNull(this.zzn)).zzaB();
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final Context zzaw() {
        return this.zzn.zzaw();
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final Clock zzax() {
        return ((zzgd) Preconditions.checkNotNull(this.zzn)).zzax();
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final zzab zzay() {
        throw null;
    }

    @WorkerThread
    public final zzh zzd(zzq zzqVar) {
        zzaB().zzg();
        zzB();
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        if (!zzqVar.zzw.isEmpty()) {
            this.zzC.put(zzqVar.zza, new zzlg(this, zzqVar.zzw));
        }
        zzak zzakVar = this.zze;
        zzal(zzakVar);
        zzh zzj = zzakVar.zzj(zzqVar.zza);
        zzhb zzd = zzq(zzqVar.zza).zzd(zzhb.zzc(zzqVar.zzv, 100));
        zzha zzhaVar = zzha.AD_STORAGE;
        String zzf = zzd.zzj(zzhaVar) ? this.zzk.zzf(zzqVar.zza, zzqVar.zzo) : "";
        if (zzj == null) {
            zzj = new zzh(this.zzn, zzqVar.zza);
            if (zzd.zzj(zzha.ANALYTICS_STORAGE)) {
                zzj.zzJ(zzw(zzd));
            }
            if (zzd.zzj(zzhaVar)) {
                zzj.zzag(zzf);
            }
        } else if (zzd.zzj(zzhaVar) && zzf != null && !zzf.equals(zzj.zzC())) {
            zzj.zzag(zzf);
            if (zzqVar.zzo && !"00000000-0000-0000-0000-000000000000".equals(this.zzk.zzd(zzqVar.zza, zzd).first)) {
                zzj.zzJ(zzw(zzd));
                zzak zzakVar2 = this.zze;
                zzal(zzakVar2);
                if (zzakVar2.zzp(zzqVar.zza, "_id") != null) {
                    zzak zzakVar3 = this.zze;
                    zzal(zzakVar3);
                    if (zzakVar3.zzp(zzqVar.zza, "_lair") == null) {
                        zzlm zzlmVar = new zzlm(zzqVar.zza, y0.f581c, "_lair", zzax().currentTimeMillis(), 1L);
                        zzak zzakVar4 = this.zze;
                        zzal(zzakVar4);
                        zzakVar4.zzL(zzlmVar);
                    }
                }
            }
        } else if (TextUtils.isEmpty(zzj.zzw()) && zzd.zzj(zzha.ANALYTICS_STORAGE)) {
            zzj.zzJ(zzw(zzd));
        }
        zzj.zzY(zzqVar.zzb);
        zzj.zzH(zzqVar.zzq);
        if (!TextUtils.isEmpty(zzqVar.zzk)) {
            zzj.zzX(zzqVar.zzk);
        }
        long j2 = zzqVar.zze;
        if (j2 != 0) {
            zzj.zzZ(j2);
        }
        if (!TextUtils.isEmpty(zzqVar.zzc)) {
            zzj.zzL(zzqVar.zzc);
        }
        zzj.zzM(zzqVar.zzj);
        String str = zzqVar.zzd;
        if (str != null) {
            zzj.zzK(str);
        }
        zzj.zzU(zzqVar.zzf);
        zzj.zzae(zzqVar.zzh);
        if (!TextUtils.isEmpty(zzqVar.zzg)) {
            zzj.zzaa(zzqVar.zzg);
        }
        zzj.zzI(zzqVar.zzo);
        zzj.zzaf(zzqVar.zzr);
        zzj.zzV(zzqVar.zzs);
        zzqu.zzc();
        if (zzg().zzs(null, zzeg.zzam) || zzg().zzs(zzqVar.zza, zzeg.zzao)) {
            zzj.zzai(zzqVar.zzx);
        }
        zzop.zzc();
        if (zzg().zzs(null, zzeg.zzal)) {
            zzj.zzah(zzqVar.zzt);
        } else {
            zzop.zzc();
            if (zzg().zzs(null, zzeg.zzak)) {
                zzj.zzah(null);
            }
        }
        zzrd.zzc();
        if (zzg().zzs(null, zzeg.zzaq)) {
            zzj.zzak(zzqVar.zzy);
        }
        zzpz.zzc();
        if (zzg().zzs(null, zzeg.zzaE)) {
            zzj.zzal(zzqVar.zzz);
        }
        if (zzj.zzao()) {
            zzak zzakVar5 = this.zze;
            zzal(zzakVar5);
            zzakVar5.zzD(zzj);
        }
        return zzj;
    }

    public final zzaa zzf() {
        zzaa zzaaVar = this.zzh;
        zzal(zzaaVar);
        return zzaaVar;
    }

    public final zzag zzg() {
        return ((zzgd) Preconditions.checkNotNull(this.zzn)).zzf();
    }

    public final zzak zzh() {
        zzak zzakVar = this.zze;
        zzal(zzakVar);
        return zzakVar;
    }

    public final zzeo zzi() {
        return this.zzn.zzj();
    }

    public final zzez zzj() {
        zzez zzezVar = this.zzd;
        zzal(zzezVar);
        return zzezVar;
    }

    public final zzfb zzl() {
        zzfb zzfbVar = this.zzf;
        if (zzfbVar != null) {
            return zzfbVar;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final zzfu zzm() {
        zzfu zzfuVar = this.zzc;
        zzal(zzfuVar);
        return zzfuVar;
    }

    public final zzgd zzp() {
        return this.zzn;
    }

    @WorkerThread
    public final zzhb zzq(String str) {
        String str2;
        zzhb zzhbVar = zzhb.zza;
        zzaB().zzg();
        zzB();
        zzhb zzhbVar2 = (zzhb) this.zzB.get(str);
        if (zzhbVar2 == null) {
            zzak zzakVar = this.zze;
            zzal(zzakVar);
            Preconditions.checkNotNull(str);
            zzakVar.zzg();
            zzakVar.zzW();
            Cursor cursor = null;
            try {
                try {
                    cursor = zzakVar.zzh().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
                    if (cursor.moveToFirst()) {
                        str2 = cursor.getString(0);
                        cursor.close();
                    } else {
                        cursor.close();
                        str2 = "G1";
                    }
                    zzhb zzc = zzhb.zzc(str2, 100);
                    zzV(str, zzc);
                    return zzc;
                } catch (SQLiteException e2) {
                    zzakVar.zzt.zzaA().zzd().zzc("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e2);
                    throw e2;
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
        return zzhbVar2;
    }

    public final zzip zzr() {
        zzip zzipVar = this.zzj;
        zzal(zzipVar);
        return zzipVar;
    }

    public final zzkb zzs() {
        return this.zzk;
    }

    public final zzlj zzu() {
        zzlj zzljVar = this.zzi;
        zzal(zzljVar);
        return zzljVar;
    }

    public final zzlp zzv() {
        return ((zzgd) Preconditions.checkNotNull(this.zzn)).zzv();
    }

    @WorkerThread
    public final String zzw(zzhb zzhbVar) {
        if (zzhbVar.zzj(zzha.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            zzv().zzG().nextBytes(bArr);
            return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        }
        return null;
    }

    public final String zzx(zzq zzqVar) {
        try {
            return (String) zzaB().zzh(new zzla(this, zzqVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            zzaA().zzd().zzc("Failed to get app instance id. appId", zzet.zzn(zzqVar.zza), e2);
            return null;
        }
    }

    @WorkerThread
    public final void zzz(Runnable runnable) {
        zzaB().zzg();
        if (this.zzq == null) {
            this.zzq = new ArrayList();
        }
        this.zzq.add(runnable);
    }
}
