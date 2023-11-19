package com.secure.itsonfire;

import android.graphics.RectF;
import androidx.appcompat.R;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bR\u000e\u0010\t\u001a\u00020\u0003X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/secure/itsonfire/DefenseBrick;", "", "row", "", "column", "shelterNumber", "screenX", "screenY", "(IIIII)V", "brickPadding", "height", "isVisible", "", "()Z", "setVisible", "(Z)V", "position", "Landroid/graphics/RectF;", "getPosition", "()Landroid/graphics/RectF;", "shelterPadding", "", "startHeight", "width", "app_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class DefenseBrick {
    public static final int $stable = 8;
    private final int height;
    @NotNull
    private final RectF position;
    private final float shelterPadding;
    private final float startHeight;
    private final int width;
    private boolean isVisible = true;
    private final int brickPadding = 1;

    public DefenseBrick(int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        this.width = i5 / 100;
        this.height = i6 / 80;
        float f2 = i5 / 12.0f;
        this.shelterPadding = f2;
        float f3 = i6;
        float f4 = f3 - ((f3 / 10.0f) * 2.0f);
        this.startHeight = f4;
        float f5 = i4;
        this.position = new RectF((i3 * i7) + 1 + (f2 * f5) + f2 + (f2 * f5), (i2 * i8) + 1 + f4, (((i3 * i7) + i7) - 1) + (f2 * f5) + f2 + (f2 * f5), (((i2 * i8) + i8) - 1) + f4);
    }

    @NotNull
    public final RectF getPosition() {
        return this.position;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final void setVisible(boolean z) {
        this.isVisible = z;
    }
}