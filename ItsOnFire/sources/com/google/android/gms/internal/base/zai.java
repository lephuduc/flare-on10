package com.google.android.gms.internal.base;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zai extends Drawable implements Drawable.Callback {
    private int zaa;
    private long zab;
    private int zac;
    private int zad;
    private int zae;
    private int zaf;
    private boolean zag;
    private boolean zah;
    private zah zai;
    private Drawable zaj;
    private Drawable zak;
    private boolean zal;
    private boolean zam;
    private boolean zan;
    private int zao;

    public zai(@Nullable Drawable drawable, @Nullable Drawable drawable2) {
        this(null);
        drawable = drawable == null ? zag.zaa : drawable;
        this.zaj = drawable;
        drawable.setCallback(this);
        zah zahVar = this.zai;
        zahVar.zab = drawable.getChangingConfigurations() | zahVar.zab;
        drawable2 = drawable2 == null ? zag.zaa : drawable2;
        this.zak = drawable2;
        drawable2.setCallback(this);
        this.zai.zab |= drawable2.getChangingConfigurations();
    }

    public zai(@Nullable zah zahVar) {
        this.zaa = 0;
        this.zad = 255;
        this.zaf = 0;
        this.zag = true;
        this.zai = new zah(zahVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
        if (r0 == 0) goto L22;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r7) {
        /*
            r6 = this;
            int r0 = r6.zaa
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L38
            if (r0 == r1) goto La
            goto L41
        La:
            long r0 = r6.zab
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L41
            long r0 = android.os.SystemClock.uptimeMillis()
            long r4 = r6.zab
            long r0 = r0 - r4
            float r0 = (float) r0
            int r1 = r6.zae
            float r1 = (float) r1
            float r0 = r0 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 < 0) goto L25
            goto L26
        L25:
            r3 = r2
        L26:
            if (r3 == 0) goto L2a
            r6.zaa = r2
        L2a:
            float r0 = java.lang.Math.min(r0, r1)
            int r1 = r6.zac
            float r1 = (float) r1
            float r1 = r1 * r0
            r0 = 0
            float r1 = r1 + r0
            int r0 = (int) r1
            r6.zaf = r0
            goto L41
        L38:
            long r3 = android.os.SystemClock.uptimeMillis()
            r6.zab = r3
            r6.zaa = r1
            r3 = r2
        L41:
            int r0 = r6.zaf
            boolean r1 = r6.zag
            android.graphics.drawable.Drawable r4 = r6.zaj
            android.graphics.drawable.Drawable r5 = r6.zak
            if (r3 == 0) goto L60
            if (r1 == 0) goto L50
            if (r0 != 0) goto L55
            goto L51
        L50:
            r2 = r0
        L51:
            r4.draw(r7)
            r0 = r2
        L55:
            int r6 = r6.zad
            if (r0 != r6) goto L5f
            r5.setAlpha(r6)
            r5.draw(r7)
        L5f:
            return
        L60:
            if (r1 == 0) goto L68
            int r2 = r6.zad
            int r2 = r2 - r0
            r4.setAlpha(r2)
        L68:
            r4.draw(r7)
            if (r1 == 0) goto L72
            int r1 = r6.zad
            r4.setAlpha(r1)
        L72:
            if (r0 <= 0) goto L7f
            r5.setAlpha(r0)
            r5.draw(r7)
            int r7 = r6.zad
            r5.setAlpha(r7)
        L7f:
            r6.invalidateSelf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.base.zai.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        zah zahVar = this.zai;
        return zahVar.zab | changingConfigurations | zahVar.zaa;
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public final Drawable.ConstantState getConstantState() {
        if (zac()) {
            this.zai.zaa = getChangingConfigurations();
            return this.zai;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.max(this.zaj.getIntrinsicHeight(), this.zak.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.max(this.zaj.getIntrinsicWidth(), this.zak.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (!this.zan) {
            this.zao = Drawable.resolveOpacity(this.zaj.getOpacity(), this.zak.getOpacity());
            this.zan = true;
        }
        return this.zao;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.zah && super.mutate() == this) {
            if (!zac()) {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
            this.zaj.mutate();
            this.zak.mutate();
            this.zah = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.zaj.setBounds(rect);
        this.zak.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        if (this.zaf == this.zad) {
            this.zaf = i2;
        }
        this.zad = i2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.zaj.setColorFilter(colorFilter);
        this.zak.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final Drawable zaa() {
        return this.zak;
    }

    public final void zab(int i2) {
        this.zac = this.zad;
        this.zaf = 0;
        this.zae = 250;
        this.zaa = 1;
        invalidateSelf();
    }

    public final boolean zac() {
        if (!this.zal) {
            boolean z = false;
            if (this.zaj.getConstantState() != null && this.zak.getConstantState() != null) {
                z = true;
            }
            this.zam = z;
            this.zal = true;
        }
        return this.zam;
    }
}
