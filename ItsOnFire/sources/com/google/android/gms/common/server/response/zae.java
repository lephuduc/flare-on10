package com.google.android.gms.common.server.response;

import androidx.annotation.Nullable;
import com.google.android.gms.common.server.response.FastParser;
import java.io.BufferedReader;
import java.io.IOException;

/* loaded from: classes.dex */
final class zae implements zai<Boolean> {
    @Override // com.google.android.gms.common.server.response.zai
    @Nullable
    public final /* bridge */ /* synthetic */ Boolean zaa(FastParser fastParser, BufferedReader bufferedReader) throws FastParser.ParseException, IOException {
        boolean zay;
        zay = fastParser.zay(bufferedReader, false);
        return Boolean.valueOf(zay);
    }
}
