package com.secure.itsonfire;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.RectF;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001'B\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010#\u001a\u00020\u0006¢\u0006\u0004\b$\u0010%J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001b\u0010\u0012R\"\u0010\u001c\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\b\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006("}, d2 = {"Lcom/secure/itsonfire/PlayerShip;", "", "", "fps", "", "update", "", "screenX", "I", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "setBitmap", "(Landroid/graphics/Bitmap;)V", "", "width", "F", "getWidth", "()F", "height", "Landroid/graphics/RectF;", "position", "Landroid/graphics/RectF;", "getPosition", "()Landroid/graphics/RectF;", "speed", "moving", "getMoving", "()I", "setMoving", "(I)V", "Landroid/content/Context;", "context", "screenY", "<init>", "(Landroid/content/Context;II)V", "Companion", "a", "app_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class PlayerShip {
    public static final int left = 1;
    public static final int right = 2;
    public static final int stopped = 0;
    @NotNull
    private Bitmap bitmap;
    private final float height;
    private int moving;
    @NotNull
    private final RectF position;
    private final int screenX;
    private final float speed;
    private final float width;
    @NotNull
    public static final a Companion = new a(null);
    public static final int $stable = 8;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/secure/itsonfire/PlayerShip$a;", "", "", "left", "I", "right", "stopped", "<init>", "()V", "app_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PlayerShip(@NotNull Context context, int i2, int i3) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.screenX = i2;
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.playership);
        Intrinsics.checkNotNullExpressionValue(decodeResource, "decodeResource(\n        …   R.drawable.playership)");
        this.bitmap = decodeResource;
        float f2 = i2 / 20.0f;
        this.width = f2;
        float f3 = i3;
        float f4 = f3 / 10.0f;
        this.height = f4;
        this.position = new RectF(i2 / 2.0f, f3 - f4, (i2 / 2) + f2, f3);
        this.speed = 450.0f;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(this.bitmap, (int) f2, (int) f4, false);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(bitma…nt() ,\n            false)");
        this.bitmap = createScaledBitmap;
    }

    @NotNull
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public final int getMoving() {
        return this.moving;
    }

    @NotNull
    public final RectF getPosition() {
        return this.position;
    }

    public final float getWidth() {
        return this.width;
    }

    public final void setBitmap(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "<set-?>");
        this.bitmap = bitmap;
    }

    public final void setMoving(int i2) {
        this.moving = i2;
    }

    public final void update(long j2) {
        int i2 = this.moving;
        if (i2 == 1) {
            RectF rectF = this.position;
            float f2 = rectF.left;
            if (f2 > 0.0f) {
                rectF.left = f2 - (this.speed / ((float) j2));
                RectF rectF2 = this.position;
                rectF2.right = rectF2.left + this.width;
            }
        }
        if (i2 == 2) {
            RectF rectF3 = this.position;
            float f3 = rectF3.left;
            if (f3 < this.screenX - this.width) {
                rectF3.left = f3 + (this.speed / ((float) j2));
            }
        }
        RectF rectF22 = this.position;
        rectF22.right = rectF22.left + this.width;
    }
}