package f;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.secure.itsonfire.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lf/c;", "", "Landroid/content/Context;", "context", "", "param", "Landroid/app/PendingIntent;", "a", "<init>", "()V", "app_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class c {
    @NotNull

    /* renamed from: a */
    public static final c f362a = new c();

    /* renamed from: b */
    public static final int f363b = 0;

    @Nullable
    public final PendingIntent a(@NotNull Context context, @NotNull String param) {
        String string;
        int i2;
        b bVar;
        int i3;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(param, "param");
        Intent intent = new Intent();
        if (!Intrinsics.areEqual(param, context.getString(R.string.m1))) {
            if (Intrinsics.areEqual(param, context.getString(R.string.t1))) {
                bVar = b.f360a;
                i3 = R.raw.ps;
            } else if (Intrinsics.areEqual(param, context.getString(R.string.w1))) {
                bVar = b.f360a;
                i3 = R.raw.iv;
            } else if (Intrinsics.areEqual(param, context.getString(R.string.t2))) {
                intent.setAction(context.getString(R.string.av));
                i2 = R.string.t3;
            } else if (!Intrinsics.areEqual(param, context.getString(R.string.f1))) {
                if (Intrinsics.areEqual(param, context.getString(R.string.s1)) || Intrinsics.areEqual(param, context.getString(R.string.s2))) {
                    intent.setAction(context.getString(R.string.av));
                    string = context.getString(R.string.s3);
                    intent.setData(Uri.parse(string));
                }
                return PendingIntent.getActivity(context, 100, intent, 201326592);
            } else {
                intent.setAction(context.getString(R.string.av));
                i2 = R.string.f3;
            }
            return PendingIntent.getActivity(context, 100, bVar.f(context, i3), 201326592);
        }
        intent.setAction(context.getString(R.string.ad));
        i2 = R.string.m2;
        string = context.getString(i2);
        intent.setData(Uri.parse(string));
        return PendingIntent.getActivity(context, 100, intent, 201326592);
    }
}