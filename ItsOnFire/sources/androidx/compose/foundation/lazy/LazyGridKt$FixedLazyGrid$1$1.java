package androidx.compose.foundation.lazy;

import androidx.appcompat.R;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LazyGridKt$FixedLazyGrid$1$1 extends Lambda implements Function1<LazyListScope, Unit> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ Function1<LazyGridScope, Unit> $content;
    public final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;
    public final /* synthetic */ int $nColumns;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.foundation.lazy.LazyGridKt$FixedLazyGrid$1$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
        public final /* synthetic */ int $$dirty;
        public final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;
        public final /* synthetic */ int $nColumns;
        public final /* synthetic */ LazyGridScopeImpl $scope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LazyGridScopeImpl lazyGridScopeImpl, int i2, Arrangement.Horizontal horizontal, int i3) {
            super(4);
            this.$scope = lazyGridScopeImpl;
            this.$nColumns = i2;
            this.$horizontalArrangement = horizontal;
            this.$$dirty = i3;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        @Composable
        public final void invoke(@NotNull LazyItemScope items, int i2, @Nullable Composer composer, int i3) {
            int i4;
            Intrinsics.checkNotNullParameter(items, "$this$items");
            if ((i3 & 14) == 0) {
                i4 = (composer.changed(items) ? 4 : 2) | i3;
            } else {
                i4 = i3;
            }
            if ((i3 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                i4 |= composer.changed(i2) ? 32 : 16;
            }
            if (((i4 & 731) ^ 146) == 0 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            List<Pair<Function2<Composer, Integer, Unit>, Integer>> contentFor = this.$scope.contentFor(i2, items);
            if (!contentFor.isEmpty()) {
                int i5 = this.$nColumns;
                Arrangement.Horizontal horizontal = this.$horizontalArrangement;
                int i6 = this.$$dirty;
                LazyGridKt.ItemRow(i5, horizontal, contentFor, composer, ((i6 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i6 & 14) | 512);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridKt$FixedLazyGrid$1$1(int i2, Function1<? super LazyGridScope, Unit> function1, Arrangement.Horizontal horizontal, int i3) {
        super(1);
        this.$nColumns = i2;
        this.$content = function1;
        this.$horizontalArrangement = horizontal;
        this.$$dirty = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
        invoke2(lazyListScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyGridScopeImpl lazyGridScopeImpl = new LazyGridScopeImpl(this.$nColumns);
        this.$content.invoke(lazyGridScopeImpl);
        LazyListScope.DefaultImpls.items$default(LazyColumn, !lazyGridScopeImpl.getHasCustomSpans$foundation_release() ? lazyGridScopeImpl.getTotalSize() == 0 ? 0 : ((lazyGridScopeImpl.getTotalSize() - 1) / this.$nColumns) + 1 : lazyGridScopeImpl.getTotalSize(), null, ComposableLambdaKt.composableLambdaInstance(-985540832, true, new AnonymousClass1(lazyGridScopeImpl, this.$nColumns, this.$horizontalArrangement, this.$$dirty)), 2, null);
    }
}
