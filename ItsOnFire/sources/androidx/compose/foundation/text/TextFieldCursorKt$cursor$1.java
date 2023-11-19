package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import j.u0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TextFieldCursorKt$cursor$1 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    public final /* synthetic */ Brush $cursorBrush;
    public final /* synthetic */ OffsetMapping $offsetMapping;
    public final /* synthetic */ TextFieldState $state;
    public final /* synthetic */ TextFieldValue $value;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1", f = "TextFieldCursor.kt", i = {}, l = {R.styleable.AppCompatTheme_checkedTextViewStyle}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Animatable<Float, AnimationVector1D> $cursorAlpha;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Animatable<Float, AnimationVector1D> animatable, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$cursorAlpha = animatable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.$cursorAlpha, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            AnimationSpec cursorAnimationSpec;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable<Float, AnimationVector1D> animatable = this.$cursorAlpha;
                Float boxFloat = Boxing.boxFloat(0.0f);
                cursorAnimationSpec = TextFieldCursorKt.getCursorAnimationSpec();
                this.label = 1;
                if (Animatable.animateTo$default(animatable, boxFloat, cursorAnimationSpec, null, null, this, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends Lambda implements Function1<ContentDrawScope, Unit> {
        public final /* synthetic */ Animatable<Float, AnimationVector1D> $cursorAlpha;
        public final /* synthetic */ Brush $cursorBrush;
        public final /* synthetic */ OffsetMapping $offsetMapping;
        public final /* synthetic */ TextFieldState $state;
        public final /* synthetic */ TextFieldValue $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Animatable<Float, AnimationVector1D> animatable, OffsetMapping offsetMapping, TextFieldValue textFieldValue, TextFieldState textFieldState, Brush brush) {
            super(1);
            this.$cursorAlpha = animatable;
            this.$offsetMapping = offsetMapping;
            this.$value = textFieldValue;
            this.$state = textFieldState;
            this.$cursorBrush = brush;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
            invoke2(contentDrawScope);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull ContentDrawScope drawWithContent) {
            float coerceIn;
            float coerceAtMost;
            TextLayoutResult value;
            Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
            drawWithContent.drawContent();
            coerceIn = RangesKt___RangesKt.coerceIn(this.$cursorAlpha.getValue().floatValue(), 0.0f, 1.0f);
            if (coerceIn == 0.0f) {
                return;
            }
            int originalToTransformed = this.$offsetMapping.originalToTransformed(TextRange.m3075getStartimpl(this.$value.m3187getSelectiond9O1mEE()));
            TextLayoutResultProxy layoutResult = this.$state.getLayoutResult();
            Rect rect = null;
            if (layoutResult != null && (value = layoutResult.getValue()) != null) {
                rect = value.getCursorRect(originalToTransformed);
            }
            if (rect == null) {
                rect = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
            }
            float mo277toPx0680j_4 = drawWithContent.mo277toPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness());
            float f2 = mo277toPx0680j_4 / 2;
            coerceAtMost = RangesKt___RangesKt.coerceAtMost(rect.getLeft() + f2, Size.m1230getWidthimpl(drawWithContent.mo1780getSizeNHjbRc()) - f2);
            DrawScope.DefaultImpls.m1820drawLine1RTmtNc$default(drawWithContent, this.$cursorBrush, OffsetKt.Offset(coerceAtMost, rect.getTop()), OffsetKt.Offset(coerceAtMost, rect.getBottom()), mo277toPx0680j_4, 0, null, coerceIn, null, 0, 432, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldCursorKt$cursor$1(Brush brush, TextFieldState textFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping) {
        super(3);
        this.$cursorBrush = brush;
        this.$state = textFieldState;
        this.$value = textFieldValue;
        this.$offsetMapping = offsetMapping;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
        if ((((androidx.compose.ui.graphics.SolidColor) r13).m1651getValue0d7_KjU() == androidx.compose.ui.graphics.Color.Companion.m1428getUnspecified0d7_KjU()) == false) goto L21;
     */
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.ui.Modifier invoke(@org.jetbrains.annotations.NotNull androidx.compose.ui.Modifier r11, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r12, int r13) {
        /*
            r10 = this;
            java.lang.String r13 = "$this$composed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r13)
            r13 = -1201392955(0xffffffffb86432c5, float:-5.440672E-5)
            r12.startReplaceableGroup(r13)
            r13 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r12.startReplaceableGroup(r13)
            java.lang.Object r13 = r12.rememberedValue()
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            r1 = 0
            if (r13 != r0) goto L29
            r13 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            r2 = 2
            androidx.compose.animation.core.Animatable r13 = androidx.compose.animation.core.AnimatableKt.Animatable$default(r13, r0, r2, r1)
            r12.updateRememberedValue(r13)
        L29:
            r12.endReplaceableGroup()
            r3 = r13
            androidx.compose.animation.core.Animatable r3 = (androidx.compose.animation.core.Animatable) r3
            androidx.compose.ui.graphics.Brush r13 = r10.$cursorBrush
            boolean r0 = r13 instanceof androidx.compose.ui.graphics.SolidColor
            r2 = 0
            r4 = 1
            if (r0 == 0) goto L4c
            androidx.compose.ui.graphics.SolidColor r13 = (androidx.compose.ui.graphics.SolidColor) r13
            long r5 = r13.m1651getValue0d7_KjU()
            androidx.compose.ui.graphics.Color$Companion r13 = androidx.compose.ui.graphics.Color.Companion
            long r7 = r13.m1428getUnspecified0d7_KjU()
            int r13 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r13 != 0) goto L49
            r13 = r4
            goto L4a
        L49:
            r13 = r2
        L4a:
            if (r13 != 0) goto L4d
        L4c:
            r2 = r4
        L4d:
            androidx.compose.foundation.text.TextFieldState r13 = r10.$state
            boolean r13 = r13.getHasFocus()
            if (r13 == 0) goto L92
            androidx.compose.ui.text.input.TextFieldValue r13 = r10.$value
            long r4 = r13.m3187getSelectiond9O1mEE()
            boolean r13 = androidx.compose.ui.text.TextRange.m3069getCollapsedimpl(r4)
            if (r13 == 0) goto L92
            if (r2 == 0) goto L92
            androidx.compose.ui.graphics.Brush r4 = r10.$cursorBrush
            androidx.compose.ui.text.input.TextFieldValue r13 = r10.$value
            androidx.compose.ui.text.AnnotatedString r5 = r13.getAnnotatedString()
            androidx.compose.ui.text.input.TextFieldValue r13 = r10.$value
            long r6 = r13.m3187getSelectiond9O1mEE()
            androidx.compose.ui.text.TextRange r6 = androidx.compose.ui.text.TextRange.m3063boximpl(r6)
            androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1 r7 = new androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1
            r7.<init>(r3, r1)
            r9 = 0
            r8 = r12
            androidx.compose.runtime.EffectsKt.LaunchedEffect(r4, r5, r6, r7, r8, r9)
            androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$2 r13 = new androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$2
            androidx.compose.ui.text.input.OffsetMapping r4 = r10.$offsetMapping
            androidx.compose.ui.text.input.TextFieldValue r5 = r10.$value
            androidx.compose.foundation.text.TextFieldState r6 = r10.$state
            androidx.compose.ui.graphics.Brush r7 = r10.$cursorBrush
            r2 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            androidx.compose.ui.Modifier r10 = androidx.compose.ui.draw.DrawModifierKt.drawWithContent(r11, r13)
            goto L94
        L92:
            androidx.compose.ui.Modifier$Companion r10 = androidx.compose.ui.Modifier.Companion
        L94:
            r12.endReplaceableGroup()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1.invoke(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }
}
