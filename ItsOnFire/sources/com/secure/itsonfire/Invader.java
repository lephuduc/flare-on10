package com.secure.itsonfire;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.RectF;
import androidx.appcompat.R;
import androidx.compose.material.TextFieldImplKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0005J\u001e\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u0005J\u000e\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020*R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006,"}, d2 = {"Lcom/secure/itsonfire/Invader;", "", "context", "Landroid/content/Context;", "row", "", "column", "screenX", "screenY", "(Landroid/content/Context;IIII)V", "height", "", "isVisible", "", "()Z", "setVisible", "(Z)V", "left", "padding", "position", "Landroid/graphics/RectF;", "getPosition", "()Landroid/graphics/RectF;", "setPosition", "(Landroid/graphics/RectF;)V", "right", "shipMoving", "speed", "width", "getWidth", "()F", "setWidth", "(F)V", "dropDownAndReverse", "", "waveNumber", "takeAim", "playerShipX", "playerShipLength", "waves", "update", "fps", "", "Companion", "app_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class Invader {
    public static Bitmap bitmap1;
    public static Bitmap bitmap2;
    private static int numberOfInvaders;
    private float height;
    private boolean isVisible;
    private final int left;
    private final int padding;
    @NotNull
    private RectF position;
    private final int right;
    private int shipMoving;
    private float speed;
    private float width;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/secure/itsonfire/Invader$Companion;", "", "()V", "bitmap1", "Landroid/graphics/Bitmap;", "getBitmap1", "()Landroid/graphics/Bitmap;", "setBitmap1", "(Landroid/graphics/Bitmap;)V", "bitmap2", "getBitmap2", "setBitmap2", "numberOfInvaders", "", "getNumberOfInvaders", "()I", "setNumberOfInvaders", "(I)V", "app_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Bitmap getBitmap1() {
            Bitmap bitmap = Invader.bitmap1;
            if (bitmap != null) {
                return bitmap;
            }
            Intrinsics.throwUninitializedPropertyAccessException("bitmap1");
            return null;
        }

        @NotNull
        public final Bitmap getBitmap2() {
            Bitmap bitmap = Invader.bitmap2;
            if (bitmap != null) {
                return bitmap;
            }
            Intrinsics.throwUninitializedPropertyAccessException("bitmap2");
            return null;
        }

        public final int getNumberOfInvaders() {
            return Invader.numberOfInvaders;
        }

        public final void setBitmap1(@NotNull Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "<set-?>");
            Invader.bitmap1 = bitmap;
        }

        public final void setBitmap2(@NotNull Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "<set-?>");
            Invader.bitmap2 = bitmap;
        }

        public final void setNumberOfInvaders(int i2) {
            Invader.numberOfInvaders = i2;
        }
    }

    public Invader(@NotNull Context context, int i2, int i3, int i4, int i5) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.width = i4 / 17.0f;
        this.height = i5 / 17.0f;
        int i6 = i4 / 80;
        this.padding = i6;
        float f2 = i3;
        float f3 = this.width;
        float f4 = 100;
        float f5 = i2;
        this.position = new RectF((i6 + f3) * f2, (((i6 / 4) + f3) * f5) + f4, (f2 * (i6 + f3)) + f3, f4 + (f5 * (f3 + (i6 / 4))) + this.height);
        this.speed = 40.0f;
        this.left = 1;
        this.right = 2;
        this.shipMoving = 2;
        this.isVisible = true;
        Companion companion = Companion;
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.invader1);
        Intrinsics.checkNotNullExpressionValue(decodeResource, "decodeResource(\n        …     R.drawable.invader1)");
        companion.setBitmap1(decodeResource);
        Bitmap decodeResource2 = BitmapFactory.decodeResource(context.getResources(), R.drawable.invader2);
        Intrinsics.checkNotNullExpressionValue(decodeResource2, "decodeResource(\n        …     R.drawable.invader2)");
        companion.setBitmap2(decodeResource2);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(companion.getBitmap1(), (int) this.width, (int) this.height, false);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(\n    …nt()),\n            false)");
        companion.setBitmap1(createScaledBitmap);
        Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(companion.getBitmap2(), (int) this.width, (int) this.height, false);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap2, "createScaledBitmap(\n    …nt()),\n            false)");
        companion.setBitmap2(createScaledBitmap2);
        numberOfInvaders++;
    }

    public final void dropDownAndReverse(int i2) {
        int i3 = this.shipMoving;
        int i4 = this.left;
        if (i3 == i4) {
            i4 = this.right;
        }
        this.shipMoving = i4;
        RectF rectF = this.position;
        float f2 = rectF.top;
        float f3 = this.height;
        rectF.top = f2 + f3;
        rectF.bottom += f3;
        this.speed *= (i2 / 20) + 1.1f;
    }

    @NotNull
    public final RectF getPosition() {
        return this.position;
    }

    public final float getWidth() {
        return this.width;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final void setPosition(@NotNull RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<set-?>");
        this.position = rectF;
    }

    public final void setVisible(boolean z) {
        this.isVisible = z;
    }

    public final void setWidth(float f2) {
        this.width = f2;
    }

    public final boolean takeAim(float f2, float f3, int i2) {
        Random random = new Random();
        float f4 = f3 + f2;
        float f5 = this.position.left;
        return (((f4 > f5 && f4 < this.width + f5) || (f2 > f5 && f2 < f5 + this.width)) && random.nextInt((numberOfInvaders * 100) / i2) == 0) || random.nextInt(numberOfInvaders * TextFieldImplKt.AnimationDuration) == 0;
    }

    public final void update(long j2) {
        int i2 = this.shipMoving;
        if (i2 == this.left) {
            this.position.left -= this.speed / ((float) j2);
        }
        if (i2 == this.right) {
            this.position.left += this.speed / ((float) j2);
        }
        RectF rectF = this.position;
        rectF.right = rectF.left + this.width;
    }
}
