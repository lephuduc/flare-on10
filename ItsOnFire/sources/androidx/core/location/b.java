package androidx.core.location;

import android.location.Location;
import androidx.core.util.Consumer;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Consumer f63j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Location f64k;

    public /* synthetic */ b(Consumer consumer, Location location) {
        this.f63j = consumer;
        this.f64k = location;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f63j.accept(this.f64k);
    }
}
