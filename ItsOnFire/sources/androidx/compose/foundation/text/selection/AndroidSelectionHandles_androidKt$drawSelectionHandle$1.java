package androidx.compose.foundation.text.selection;

import androidx.appcompat.R;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class AndroidSelectionHandles_androidKt$drawSelectionHandle$1 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    public final /* synthetic */ ResolvedTextDirection $direction;
    public final /* synthetic */ boolean $handlesCrossed;
    public final /* synthetic */ boolean $isStartHandle;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<CacheDrawScope, DrawResult> {
        public final /* synthetic */ ResolvedTextDirection $direction;
        public final /* synthetic */ long $handleColor;
        public final /* synthetic */ boolean $handlesCrossed;
        public final /* synthetic */ boolean $isStartHandle;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        /* renamed from: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00221 extends Lambda implements Function1<ContentDrawScope, Unit> {
            public final /* synthetic */ ColorFilter $colorFilter;
            public final /* synthetic */ ResolvedTextDirection $direction;
            public final /* synthetic */ ImageBitmap $handleImage;
            public final /* synthetic */ boolean $handlesCrossed;
            public final /* synthetic */ boolean $isStartHandle;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00221(boolean z, ResolvedTextDirection resolvedTextDirection, boolean z2, ImageBitmap imageBitmap, ColorFilter colorFilter) {
                super(1);
                this.$isStartHandle = z;
                this.$direction = resolvedTextDirection;
                this.$handlesCrossed = z2;
                this.$handleImage = imageBitmap;
                this.$colorFilter = colorFilter;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ContentDrawScope onDrawWithContent) {
                boolean isLeft;
                Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
                onDrawWithContent.drawContent();
                isLeft = AndroidSelectionHandles_androidKt.isLeft(this.$isStartHandle, this.$direction, this.$handlesCrossed);
                if (!isLeft) {
                    DrawScope.DefaultImpls.m1819drawImagegbVJVH8$default(onDrawWithContent, this.$handleImage, 0L, 0.0f, null, this.$colorFilter, 0, 46, null);
                    return;
                }
                ImageBitmap imageBitmap = this.$handleImage;
                ColorFilter colorFilter = this.$colorFilter;
                long mo1779getCenterF1C5BW0 = onDrawWithContent.mo1779getCenterF1C5BW0();
                DrawContext drawContext = onDrawWithContent.getDrawContext();
                long mo1786getSizeNHjbRc = drawContext.mo1786getSizeNHjbRc();
                drawContext.getCanvas().save();
                drawContext.getTransform().mo1793scale0AR0LA0(-1.0f, 1.0f, mo1779getCenterF1C5BW0);
                DrawScope.DefaultImpls.m1819drawImagegbVJVH8$default(onDrawWithContent, imageBitmap, 0L, 0.0f, null, colorFilter, 0, 46, null);
                drawContext.getCanvas().restore();
                drawContext.mo1787setSizeuvyYCjk(mo1786getSizeNHjbRc);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j2, boolean z, ResolvedTextDirection resolvedTextDirection, boolean z2) {
            super(1);
            this.$handleColor = j2;
            this.$isStartHandle = z;
            this.$direction = resolvedTextDirection;
            this.$handlesCrossed = z2;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final DrawResult invoke(@NotNull CacheDrawScope drawWithCache) {
            Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
            return drawWithCache.onDrawWithContent(new C00221(this.$isStartHandle, this.$direction, this.$handlesCrossed, AndroidSelectionHandles_androidKt.createHandleImage(drawWithCache, Size.m1230getWidthimpl(drawWithCache.m1094getSizeNHjbRc()) / 2.0f), ColorFilter.Companion.m1433tintxETnrds$default(ColorFilter.Companion, this.$handleColor, 0, 2, null)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSelectionHandles_androidKt$drawSelectionHandle$1(boolean z, ResolvedTextDirection resolvedTextDirection, boolean z2) {
        super(3);
        this.$isStartHandle = z;
        this.$direction = resolvedTextDirection;
        this.$handlesCrossed = z2;
    }

    @Composable
    @NotNull
    public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(-1183154520);
        Modifier then = composed.then(DrawModifierKt.drawWithCache(Modifier.Companion, new AnonymousClass1(((TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).m681getHandleColor0d7_KjU(), this.$isStartHandle, this.$direction, this.$handlesCrossed)));
        composer.endReplaceableGroup();
        return then;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }
}
