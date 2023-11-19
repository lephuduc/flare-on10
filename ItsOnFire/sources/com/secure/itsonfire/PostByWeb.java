package com.secure.itsonfire;

import android.util.Log;
import androidx.appcompat.R;
import androidx.compose.runtime.internal.StabilityInferred;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/secure/itsonfire/PostByWeb;", "Ljava/lang/Thread;", "str", "", "(Ljava/lang/String;)V", "mUrl", "Ljava/net/URL;", "request", "", "app_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public class PostByWeb extends Thread {
    public static final int $stable = 8;
    @Nullable
    private URL mUrl;

    public PostByWeb(@Nullable String str) {
        try {
            this.mUrl = new URL(str);
        } catch (MalformedURLException e2) {
            e2.printStackTrace();
        }
        request();
    }

    private final void request() {
        try {
            URL url = this.mUrl;
            Intrinsics.checkNotNull(url);
            URLConnection openConnection = url.openConnection();
            if (openConnection == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setConnectTimeout(9000);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() != 200) {
                Log.e(MalwareInvadersActivity.class.getName(), Intrinsics.stringPlus("[-] Send Resp Code = ", Integer.valueOf(httpURLConnection.getResponseCode())));
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }
}
