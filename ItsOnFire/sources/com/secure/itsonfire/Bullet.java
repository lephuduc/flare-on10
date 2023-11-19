package com.secure.itsonfire;

import android.graphics.RectF;
import androidx.appcompat.R;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0003J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 R\u0014\u0010\b\u001a\u00020\u0003X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u0003X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\nR\u000e\u0010\u0018\u001a\u00020\u0003X\u0082D¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/secure/itsonfire/Bullet;", "", "screenY", "", "speed", "", "heightModifier", "(IFF)V", "down", "getDown", "()I", "heading", "height", "isActive", "", "()Z", "setActive", "(Z)V", "position", "Landroid/graphics/RectF;", "getPosition", "()Landroid/graphics/RectF;", "up", "getUp", "width", "shoot", "startX", "startY", "direction", "update", "", "fps", "", "app_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class Bullet {
    public static final int $stable = 8;
    private final int down;
    private int heading;
    private float height;
    private boolean isActive;
    @NotNull
    private final RectF position;
    private final float speed;
    private final int up;
    private final int width;

    public Bullet(int i2, float f2, float f3) {
        this.speed = f2;
        this.position = new RectF();
        this.down = 1;
        this.heading = -1;
        this.width = 15;
        this.height = i2 / f3;
    }

    public /* synthetic */ Bullet(int i2, float f2, float f3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, (i3 & 2) != 0 ? 350.0f : f2, (i3 & 4) != 0 ? 20.0f : f3);
    }

    public final int getDown() {
        return this.down;
    }

    @NotNull
    public final RectF getPosition() {
        return this.position;
    }

    public final int getUp() {
        return this.up;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final void setActive(boolean z) {
        this.isActive = z;
    }

    public final boolean shoot(float f2, float f3, int i2) {
        if (this.isActive) {
            return false;
        }
        RectF rectF = this.position;
        rectF.left = f2;
        rectF.top = f3;
        rectF.right = f2 + this.width;
        rectF.bottom = f3 + this.height;
        this.heading = i2;
        this.isActive = true;
        return true;
    }

    public final void update(long j2) {
        RectF rectF;
        float f2;
        if (this.heading == this.up) {
            rectF = this.position;
            f2 = rectF.top - (this.speed / ((float) j2));
        } else {
            rectF = this.position;
            f2 = rectF.top + (this.speed / ((float) j2));
        }
        rectF.top = f2;
        RectF rectF2 = this.position;
        rectF2.bottom = rectF2.top + this.height;
    }
}
