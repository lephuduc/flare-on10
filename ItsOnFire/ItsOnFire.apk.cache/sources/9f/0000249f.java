package com.secure.itsonfire;

import android.app.Activity;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.widget.Toast;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/secure/itsonfire/MalwareInvadersActivity;", "Landroid/app/Activity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lcom/secure/itsonfire/MalwareInvadersView;", "j", "Lcom/secure/itsonfire/MalwareInvadersView;", "malwareInvadersView", "<init>", "()V", "app_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class MalwareInvadersActivity extends Activity {

    /* renamed from: k  reason: collision with root package name */
    public static final int f350k = 8;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private MalwareInvadersView f351j;

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Toast.makeText(this, "Destroy the Malware Invaders in Time!", 1).show();
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        MalwareInvadersView malwareInvadersView = new MalwareInvadersView(this, point);
        this.f351j = malwareInvadersView;
        setContentView(malwareInvadersView);
        MalwareInvadersView malwareInvadersView2 = this.f351j;
        if (malwareInvadersView2 == null) {
            return;
        }
        malwareInvadersView2.start();
    }
}