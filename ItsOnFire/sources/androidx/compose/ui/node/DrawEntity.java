package androidx.compose.ui.node;

import androidx.appcompat.R;
import androidx.compose.ui.draw.BuildDrawCacheParams;
import androidx.compose.ui.draw.DrawCacheModifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020\"J\u0016\u0010'\u001a\u00020\"2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)J\n\u0010+\u001a\u0004\u0018\u00010\nH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006-"}, d2 = {"Landroidx/compose/ui/node/DrawEntity;", "Landroidx/compose/ui/node/OwnerScope;", "layoutNodeWrapper", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "modifier", "Landroidx/compose/ui/draw/DrawModifier;", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/draw/DrawModifier;)V", "buildCacheParams", "Landroidx/compose/ui/draw/BuildDrawCacheParams;", "cacheDrawModifier", "Landroidx/compose/ui/draw/DrawCacheModifier;", "invalidateCache", "", "isValid", "()Z", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "getLayoutNodeWrapper", "()Landroidx/compose/ui/node/LayoutNodeWrapper;", "getModifier", "()Landroidx/compose/ui/draw/DrawModifier;", "next", "getNext", "()Landroidx/compose/ui/node/DrawEntity;", "setNext", "(Landroidx/compose/ui/node/DrawEntity;)V", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "updateCache", "Lkotlin/Function0;", "", "draw", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "onInitialize", "onMeasureResultChanged", "width", "", "height", "updateCacheDrawModifier", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class DrawEntity implements OwnerScope {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final Function1<DrawEntity, Unit> onCommitAffectingDrawEntity = DrawEntity$Companion$onCommitAffectingDrawEntity$1.INSTANCE;
    @NotNull
    private final BuildDrawCacheParams buildCacheParams;
    @Nullable
    private DrawCacheModifier cacheDrawModifier;
    private boolean invalidateCache;
    @NotNull
    private final LayoutNodeWrapper layoutNodeWrapper;
    @NotNull
    private final DrawModifier modifier;
    @Nullable
    private DrawEntity next;
    @NotNull
    private final Function0<Unit> updateCache;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/DrawEntity$Companion;", "", "()V", "onCommitAffectingDrawEntity", "Lkotlin/Function1;", "Landroidx/compose/ui/node/DrawEntity;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public DrawEntity(@NotNull LayoutNodeWrapper layoutNodeWrapper, @NotNull DrawModifier modifier) {
        Intrinsics.checkNotNullParameter(layoutNodeWrapper, "layoutNodeWrapper");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        this.layoutNodeWrapper = layoutNodeWrapper;
        this.modifier = modifier;
        this.cacheDrawModifier = updateCacheDrawModifier();
        this.buildCacheParams = new BuildDrawCacheParams() { // from class: androidx.compose.ui.node.DrawEntity$buildCacheParams$1
            @NotNull
            private final Density density;

            {
                LayoutNode layoutNode;
                layoutNode = DrawEntity.this.getLayoutNode();
                this.density = layoutNode.getDensity();
            }

            @Override // androidx.compose.ui.draw.BuildDrawCacheParams
            @NotNull
            public Density getDensity() {
                return this.density;
            }

            @Override // androidx.compose.ui.draw.BuildDrawCacheParams
            @NotNull
            public LayoutDirection getLayoutDirection() {
                LayoutNode layoutNode;
                layoutNode = DrawEntity.this.getLayoutNode();
                return layoutNode.getLayoutDirection();
            }

            @Override // androidx.compose.ui.draw.BuildDrawCacheParams
            /* renamed from: getSize-NH-jbRc */
            public long mo1093getSizeNHjbRc() {
                return IntSizeKt.m3495toSizeozmzZPI(DrawEntity.this.getLayoutNodeWrapper().mo2772getSizeYbymL2g());
            }
        };
        this.invalidateCache = true;
        this.updateCache = new DrawEntity$updateCache$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutNode getLayoutNode() {
        return this.layoutNodeWrapper.getLayoutNode$ui_release();
    }

    /* renamed from: getSize-YbymL2g  reason: not valid java name */
    private final long m2862getSizeYbymL2g() {
        return this.layoutNodeWrapper.mo2772getSizeYbymL2g();
    }

    private final DrawCacheModifier updateCacheDrawModifier() {
        DrawModifier drawModifier = this.modifier;
        if (drawModifier instanceof DrawCacheModifier) {
            return (DrawCacheModifier) drawModifier;
        }
        return null;
    }

    public final void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        long m3495toSizeozmzZPI = IntSizeKt.m3495toSizeozmzZPI(m2862getSizeYbymL2g());
        if (this.cacheDrawModifier != null && this.invalidateCache) {
            LayoutNodeKt.requireOwner(getLayoutNode()).getSnapshotObserver().observeReads$ui_release(this, onCommitAffectingDrawEntity, this.updateCache);
        }
        LayoutNodeDrawScope mDrawScope$ui_release = getLayoutNode().getMDrawScope$ui_release();
        LayoutNodeWrapper layoutNodeWrapper = this.layoutNodeWrapper;
        DrawEntity drawEntity = mDrawScope$ui_release.drawEntity;
        mDrawScope$ui_release.drawEntity = this;
        CanvasDrawScope canvasDrawScope = mDrawScope$ui_release.canvasDrawScope;
        MeasureScope measureScope = layoutNodeWrapper.getMeasureScope();
        LayoutDirection layoutDirection = layoutNodeWrapper.getMeasureScope().getLayoutDirection();
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope.getDrawParams();
        Density component1 = drawParams.component1();
        LayoutDirection component2 = drawParams.component2();
        Canvas component3 = drawParams.component3();
        long m1782component4NHjbRc = drawParams.m1782component4NHjbRc();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.getDrawParams();
        drawParams2.setDensity(measureScope);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m1785setSizeuvyYCjk(m3495toSizeozmzZPI);
        canvas.save();
        getModifier().draw(mDrawScope$ui_release);
        canvas.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope.getDrawParams();
        drawParams3.setDensity(component1);
        drawParams3.setLayoutDirection(component2);
        drawParams3.setCanvas(component3);
        drawParams3.m1785setSizeuvyYCjk(m1782component4NHjbRc);
        mDrawScope$ui_release.drawEntity = drawEntity;
    }

    @NotNull
    public final LayoutNodeWrapper getLayoutNodeWrapper() {
        return this.layoutNodeWrapper;
    }

    @NotNull
    public final DrawModifier getModifier() {
        return this.modifier;
    }

    @Nullable
    public final DrawEntity getNext() {
        return this.next;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValid() {
        return this.layoutNodeWrapper.isAttached();
    }

    public final void onInitialize() {
        this.cacheDrawModifier = updateCacheDrawModifier();
        this.invalidateCache = true;
        DrawEntity drawEntity = this.next;
        if (drawEntity == null) {
            return;
        }
        drawEntity.onInitialize();
    }

    public final void onMeasureResultChanged(int i2, int i3) {
        this.invalidateCache = true;
        DrawEntity drawEntity = this.next;
        if (drawEntity == null) {
            return;
        }
        drawEntity.onMeasureResultChanged(i2, i3);
    }

    public final void setNext(@Nullable DrawEntity drawEntity) {
        this.next = drawEntity;
    }
}
