package com.secure.itsonfire;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.util.Log;
import android.view.SurfaceView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.secure.itsonfire.Invader;
import f.e;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010E\u001a\u00020D\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\bF\u0010GJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0003H\u0002J\b\u0010\n\u001a\u00020\u0003H\u0016J\u0006\u0010\u000b\u001a\u00020\u0003J\u0006\u0010\f\u001a\u00020\u0003J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010$\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R$\u0010+\u001a\u0012\u0012\u0004\u0012\u00020)0(j\b\u0012\u0004\u0012\u00020)`*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R$\u00101\u001a\u0012\u0012\u0004\u0012\u0002000(j\b\u0012\u0004\u0012\u000200`*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010,R\u0016\u00102\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010/R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R$\u00106\u001a\u0012\u0012\u0004\u0012\u0002030(j\b\u0012\u0004\u0012\u000203`*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010,R\u0016\u00107\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010/R\u0014\u00108\u001a\u00020-8\u0002X\u0082D¢\u0006\u0006\n\u0004\b8\u0010/R\u0016\u00109\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010/R\u0016\u0010:\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010/R\u0016\u0010;\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010/R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010/R\u0016\u0010@\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010\u001bR\u0016\u0010C\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010A¨\u0006H"}, d2 = {"Lcom/secure/itsonfire/MalwareInvadersView;", "Landroid/view/SurfaceView;", "Ljava/lang/Runnable;", "", "prepareLevel", "menacePlayer", "", "fps", "update", "draw", "run", "pause", "start", "Landroid/view/MotionEvent;", "motionEvent", "", "onTouchEvent", "Landroid/graphics/Point;", "size", "Landroid/graphics/Point;", "Lf/e;", "soundPlayer", "Lf/e;", "Ljava/lang/Thread;", "gameThread", "Ljava/lang/Thread;", "playing", "Z", "paused", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/Canvas;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "paint_player", "paint_enemy", "Lcom/secure/itsonfire/PlayerShip;", "playerShip", "Lcom/secure/itsonfire/PlayerShip;", "Ljava/util/ArrayList;", "Lcom/secure/itsonfire/Invader;", "Lkotlin/collections/ArrayList;", "invaders", "Ljava/util/ArrayList;", "", "numInvaders", "I", "Lcom/secure/itsonfire/DefenseBrick;", "bricks", "numBricks", "Lcom/secure/itsonfire/Bullet;", "playerBullet", "Lcom/secure/itsonfire/Bullet;", "invadersBullets", "nextBullet", "maxInvaderBullets", FirebaseAnalytics.Param.SCORE, "waves", "lives", "Landroid/content/SharedPreferences;", "prefs", "Landroid/content/SharedPreferences;", "highScore", "menaceInterval", "J", "uhOrOh", "lastMenaceTime", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Landroid/graphics/Point;)V", "app_release"}, k = 1, mv = {1, 6, 0})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class MalwareInvadersView extends SurfaceView implements Runnable {
    public static final int $stable = 8;
    @NotNull
    private final ArrayList<DefenseBrick> bricks;
    @NotNull
    private Canvas canvas;
    @NotNull
    private final Thread gameThread;
    private int highScore;
    @NotNull
    private final ArrayList<Invader> invaders;
    @NotNull
    private final ArrayList<Bullet> invadersBullets;
    private long lastMenaceTime;
    private int lives;
    private final int maxInvaderBullets;
    private long menaceInterval;
    private int nextBullet;
    private int numBricks;
    private int numInvaders;
    @NotNull
    private final Paint paint;
    @NotNull
    private final Paint paint_enemy;
    @NotNull
    private final Paint paint_player;
    private boolean paused;
    @NotNull
    private Bullet playerBullet;
    @NotNull
    private PlayerShip playerShip;
    private boolean playing;
    @NotNull
    private final SharedPreferences prefs;
    private int score;
    @NotNull
    private final Point size;
    @NotNull
    private final e soundPlayer;
    private boolean uhOrOh;
    private int waves;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MalwareInvadersView(@NotNull Context context, @NotNull Point size) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(size, "size");
        this.size = size;
        this.soundPlayer = new e(context);
        this.gameThread = new Thread(this);
        this.paused = true;
        this.canvas = new Canvas();
        this.paint = new Paint();
        this.paint_player = new Paint();
        this.paint_enemy = new Paint();
        this.playerShip = new PlayerShip(context, size.x, size.y);
        this.invaders = new ArrayList<>();
        this.bricks = new ArrayList<>();
        this.playerBullet = new Bullet(size.y, 1200.0f, 40.0f);
        this.invadersBullets = new ArrayList<>();
        this.maxInvaderBullets = 10;
        this.waves = 1;
        this.lives = 3;
        SharedPreferences sharedPreferences = context.getSharedPreferences("Malware Invaders", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…    Context.MODE_PRIVATE)");
        this.prefs = sharedPreferences;
        this.highScore = sharedPreferences.getInt("highScore", 0);
        this.menaceInterval = 1000L;
        this.lastMenaceTime = System.currentTimeMillis();
    }

    private final void draw() {
        Canvas canvas;
        Bitmap bitmap2;
        if (getHolder().getSurface().isValid()) {
            Canvas lockCanvas = getHolder().lockCanvas();
            Intrinsics.checkNotNullExpressionValue(lockCanvas, "holder.lockCanvas()");
            this.canvas = lockCanvas;
            lockCanvas.drawColor(Color.argb(255, 0, 0, 0));
            this.paint.setColor(Color.argb(255, 0, 135, 255));
            this.paint_enemy.setColor(Color.argb(255, 255, 0, 0));
            this.paint_player.setColor(Color.argb(255, 0, 255, 0));
            this.canvas.drawBitmap(this.playerShip.getBitmap(), this.playerShip.getPosition().left, this.playerShip.getPosition().top, this.paint);
            Iterator<Invader> it = this.invaders.iterator();
            while (it.hasNext()) {
                Invader next = it.next();
                if (next.isVisible()) {
                    if (this.uhOrOh) {
                        canvas = this.canvas;
                        bitmap2 = Invader.Companion.getBitmap1();
                    } else {
                        canvas = this.canvas;
                        bitmap2 = Invader.Companion.getBitmap2();
                    }
                    canvas.drawBitmap(bitmap2, next.getPosition().left, next.getPosition().top, this.paint);
                }
            }
            Iterator<DefenseBrick> it2 = this.bricks.iterator();
            while (it2.hasNext()) {
                DefenseBrick next2 = it2.next();
                if (next2.isVisible()) {
                    this.canvas.drawRect(next2.getPosition(), this.paint);
                }
            }
            if (this.playerBullet.isActive()) {
                this.canvas.drawRect(this.playerBullet.getPosition(), this.paint_player);
            }
            Iterator<Bullet> it3 = this.invadersBullets.iterator();
            while (it3.hasNext()) {
                Bullet next3 = it3.next();
                if (next3.isActive()) {
                    this.canvas.drawRect(next3.getPosition(), this.paint_enemy);
                }
            }
            this.paint.setColor(Color.argb(255, 0, 135, 255));
            this.paint.setTextSize(70.0f);
            Canvas canvas2 = this.canvas;
            canvas2.drawText("Score: " + this.score + "   Lives: " + this.lives + " Wave: " + this.waves + " HI: " + this.highScore, 20.0f, 75.0f, this.paint);
            getHolder().unlockCanvasAndPost(this.canvas);
        }
    }

    private final void menacePlayer() {
        e eVar;
        int c2;
        if (this.uhOrOh) {
            eVar = this.soundPlayer;
            c2 = e.f364b.f();
        } else {
            eVar = this.soundPlayer;
            c2 = e.f364b.c();
        }
        eVar.m(c2);
        this.lastMenaceTime = System.currentTimeMillis();
        this.uhOrOh = !this.uhOrOh;
    }

    private final void prepareLevel() {
        int i2 = 0;
        Invader.Companion.setNumberOfInvaders(0);
        this.numInvaders = 0;
        int i3 = 0;
        while (i3 < 8) {
            int i4 = i3 + 1;
            for (int i5 = 0; i5 < 4; i5++) {
                ArrayList<Invader> arrayList = this.invaders;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                Point point = this.size;
                arrayList.add(new Invader(context, i5, i3, point.x, point.y));
                this.numInvaders++;
            }
            i3 = i4;
        }
        this.numBricks = 0;
        int i6 = 0;
        while (i6 < 5) {
            int i7 = i6 + 1;
            int i8 = 0;
            while (i8 < 11) {
                int i9 = i8 + 1;
                for (int i10 = 0; i10 < 5; i10++) {
                    ArrayList<DefenseBrick> arrayList2 = this.bricks;
                    Point point2 = this.size;
                    arrayList2.add(new DefenseBrick(i10, i8, i6, point2.x, point2.y));
                    this.numBricks++;
                }
                i8 = i9;
            }
            i6 = i7;
        }
        int i11 = this.maxInvaderBullets;
        while (i2 < i11) {
            i2++;
            this.invadersBullets.add(new Bullet(this.size.y, 0.0f, 0.0f, 6, null));
        }
    }

    private final void update(long j2) {
        boolean z;
        this.playerShip.update(j2);
        Iterator<Invader> it = this.invaders.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            Invader next = it.next();
            if (next.isVisible()) {
                next.update(j2);
                if (next.takeAim(this.playerShip.getPosition().left, this.playerShip.getWidth(), this.waves) && this.invadersBullets.get(this.nextBullet).shoot(next.getPosition().left + (next.getWidth() / 2), next.getPosition().top, this.playerBullet.getDown())) {
                    int i2 = this.nextBullet + 1;
                    this.nextBullet = i2;
                    if (i2 == this.maxInvaderBullets) {
                        this.nextBullet = 0;
                    }
                }
                if (next.getPosition().left > this.size.x - next.getWidth() || next.getPosition().left < 0.0f) {
                    z2 = true;
                }
            }
        }
        if (this.playerBullet.isActive()) {
            this.playerBullet.update(j2);
        }
        Iterator<Bullet> it2 = this.invadersBullets.iterator();
        while (it2.hasNext()) {
            Bullet next2 = it2.next();
            if (next2.isActive()) {
                next2.update(j2);
            }
        }
        if (z2) {
            Iterator<Invader> it3 = this.invaders.iterator();
            z = false;
            while (it3.hasNext()) {
                Invader next3 = it3.next();
                next3.dropDownAndReverse(this.waves);
                if (next3.getPosition().bottom >= this.size.y && next3.isVisible()) {
                    z = true;
                }
            }
        } else {
            z = false;
        }
        if (this.playerBullet.getPosition().bottom < 0.0f) {
            this.playerBullet.setActive(false);
        }
        Iterator<Bullet> it4 = this.invadersBullets.iterator();
        while (it4.hasNext()) {
            Bullet next4 = it4.next();
            if (next4.getPosition().top > this.size.y) {
                next4.setActive(false);
            }
        }
        if (this.playerBullet.isActive()) {
            Iterator<Invader> it5 = this.invaders.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                Invader next5 = it5.next();
                if (next5.isVisible() && RectF.intersects(this.playerBullet.getPosition(), next5.getPosition())) {
                    next5.setVisible(false);
                    this.soundPlayer.m(e.f364b.b());
                    this.playerBullet.setActive(false);
                    Invader.Companion companion = Invader.Companion;
                    companion.setNumberOfInvaders(companion.getNumberOfInvaders() - 1);
                    int i3 = this.score + 10;
                    this.score = i3;
                    if (i3 > this.highScore) {
                        this.highScore = i3;
                    }
                    if (companion.getNumberOfInvaders() == 0) {
                        this.paused = true;
                        this.lives++;
                        this.invaders.clear();
                        this.bricks.clear();
                        this.invadersBullets.clear();
                        prepareLevel();
                        this.waves++;
                    }
                }
            }
        }
        Iterator<Bullet> it6 = this.invadersBullets.iterator();
        while (it6.hasNext()) {
            Bullet next6 = it6.next();
            if (next6.isActive()) {
                Iterator<DefenseBrick> it7 = this.bricks.iterator();
                while (it7.hasNext()) {
                    DefenseBrick next7 = it7.next();
                    if (next7.isVisible() && RectF.intersects(next6.getPosition(), next7.getPosition())) {
                        next6.setActive(false);
                        next7.setVisible(false);
                        this.soundPlayer.m(e.f364b.a());
                    }
                }
            }
        }
        if (this.playerBullet.isActive()) {
            Iterator<DefenseBrick> it8 = this.bricks.iterator();
            while (it8.hasNext()) {
                DefenseBrick next8 = it8.next();
                if (next8.isVisible() && RectF.intersects(this.playerBullet.getPosition(), next8.getPosition())) {
                    this.playerBullet.setActive(false);
                    next8.setVisible(false);
                    this.soundPlayer.m(e.f364b.a());
                }
            }
        }
        Iterator<Bullet> it9 = this.invadersBullets.iterator();
        while (true) {
            if (!it9.hasNext()) {
                break;
            }
            Bullet next9 = it9.next();
            if (next9.isActive() && RectF.intersects(this.playerShip.getPosition(), next9.getPosition())) {
                next9.setActive(false);
                this.lives--;
                this.soundPlayer.m(e.f364b.d());
                if (this.lives == 0) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            this.paused = true;
            this.lives = 3;
            this.score = 0;
            this.waves = 1;
            this.invaders.clear();
            this.bricks.clear();
            this.invadersBullets.clear();
            prepareLevel();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r1 != 6) goto L9;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(@org.jetbrains.annotations.NotNull android.view.MotionEvent r7) {
        /*
            r6 = this;
            java.lang.String r0 = "motionEvent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            android.graphics.Point r0 = r6.size
            int r0 = r0.y
            int r1 = r0 / 8
            int r0 = r0 - r1
            int r1 = r7.getAction()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L31
            if (r1 == r4) goto L22
            if (r1 == r3) goto L31
            r5 = 5
            if (r1 == r5) goto L31
            r3 = 6
            if (r1 == r3) goto L22
            goto L90
        L22:
            float r7 = r7.getY()
            float r0 = (float) r0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 <= 0) goto L90
            com.secure.itsonfire.PlayerShip r6 = r6.playerShip
            r6.setMoving(r2)
            goto L90
        L31:
            r6.paused = r2
            float r1 = r7.getY()
            float r0 = (float) r0
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 <= 0) goto L55
            float r1 = r7.getX()
            android.graphics.Point r2 = r6.size
            int r2 = r2.x
            int r2 = r2 / r3
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L50
            com.secure.itsonfire.PlayerShip r1 = r6.playerShip
            r1.setMoving(r3)
            goto L55
        L50:
            com.secure.itsonfire.PlayerShip r1 = r6.playerShip
            r1.setMoving(r4)
        L55:
            float r7 = r7.getY()
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L90
            com.secure.itsonfire.Bullet r7 = r6.playerBullet
            com.secure.itsonfire.PlayerShip r0 = r6.playerShip
            android.graphics.RectF r0 = r0.getPosition()
            float r0 = r0.left
            com.secure.itsonfire.PlayerShip r1 = r6.playerShip
            float r1 = r1.getWidth()
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            float r0 = r0 + r1
            com.secure.itsonfire.PlayerShip r1 = r6.playerShip
            android.graphics.RectF r1 = r1.getPosition()
            float r1 = r1.top
            com.secure.itsonfire.Bullet r2 = r6.playerBullet
            int r2 = r2.getUp()
            boolean r7 = r7.shoot(r0, r1, r2)
            if (r7 == 0) goto L90
            f.e r6 = r6.soundPlayer
            f.e$a r7 = f.e.f364b
            int r7 = r7.e()
            r6.m(r7)
        L90:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.secure.itsonfire.MalwareInvadersView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void pause() {
        this.playing = false;
        try {
            this.gameThread.join();
        } catch (InterruptedException unused) {
            Log.e("Error:", "joining thread");
        }
        SharedPreferences sharedPreferences = getContext().getSharedPreferences("Malware Invaders", 0);
        if (this.highScore > sharedPreferences.getInt("highScore", 0)) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt("highScore", this.highScore);
            edit.apply();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        long j2 = 0;
        while (this.playing) {
            long currentTimeMillis = System.currentTimeMillis();
            if (!this.paused) {
                update(j2);
            }
            draw();
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (currentTimeMillis2 >= 1) {
                j2 = 1000 / currentTimeMillis2;
            }
            if (!this.paused && currentTimeMillis - this.lastMenaceTime > this.menaceInterval) {
                menacePlayer();
            }
        }
    }

    public final void start() {
        this.playing = true;
        prepareLevel();
        this.gameThread.start();
    }
}