package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes.dex */
public class zzll extends IOException {
    public zzll(String str) {
        super(str);
    }

    public static zzlk zza() {
        return new zzlk("Protocol message tag had invalid wire type.");
    }

    public static zzll zzb() {
        return new zzll("Protocol message contained an invalid tag (zero).");
    }

    public static zzll zzc() {
        return new zzll("Protocol message had invalid UTF-8.");
    }

    public static zzll zzd() {
        return new zzll("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzll zze() {
        return new zzll("Failed to parse the message.");
    }

    public static zzll zzf() {
        return new zzll("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
