package androidx.compose.foundation.lazy.layout;

import androidx.appcompat.R;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LazyLayoutItemContentFactory$CachedItemContent$content$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ LazyLayoutItemContentFactory this$0;
    public final /* synthetic */ LazyLayoutItemContentFactory.CachedItemContent this$1;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$content$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
        public final /* synthetic */ LazyLayoutItemContentFactory this$0;
        public final /* synthetic */ LazyLayoutItemContentFactory.CachedItemContent this$1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, LazyLayoutItemContentFactory.CachedItemContent cachedItemContent) {
            super(1);
            this.this$0 = lazyLayoutItemContentFactory;
            this.this$1 = cachedItemContent;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            final LazyLayoutItemContentFactory lazyLayoutItemContentFactory = this.this$0;
            final LazyLayoutItemContentFactory.CachedItemContent cachedItemContent = this.this$1;
            return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$content$1$1$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    Map map;
                    map = LazyLayoutItemContentFactory.this.lambdasCache;
                    map.remove(cachedItemContent.getKey());
                }
            };
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemContentFactory$CachedItemContent$content$1(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, LazyLayoutItemContentFactory.CachedItemContent cachedItemContent) {
        super(2);
        this.this$0 = lazyLayoutItemContentFactory;
        this.this$1 = cachedItemContent;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    @Composable
    public final void invoke(@Nullable Composer composer, int i2) {
        Function0 function0;
        SaveableStateHolder saveableStateHolder;
        if (((i2 & 11) ^ 2) == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        function0 = this.this$0.itemsProvider;
        LazyLayoutItemsProvider lazyLayoutItemsProvider = (LazyLayoutItemsProvider) function0.invoke();
        Integer num = lazyLayoutItemsProvider.getKeyToIndexMap().get(this.this$1.getKey());
        if (num == null) {
            num = null;
        } else {
            this.this$1.setLastKnownIndex(num.intValue());
        }
        int lastKnownIndex = num == null ? this.this$1.getLastKnownIndex() : num.intValue();
        composer.startReplaceableGroup(494375263);
        if (lastKnownIndex < lazyLayoutItemsProvider.getItemsCount()) {
            Object key = lazyLayoutItemsProvider.getKey(lastKnownIndex);
            if (Intrinsics.areEqual(key, this.this$1.getKey())) {
                Function2<Composer, Integer, Unit> content = lazyLayoutItemsProvider.getContent(lastKnownIndex);
                saveableStateHolder = this.this$0.saveableStateHolder;
                saveableStateHolder.SaveableStateProvider(key, content, composer, 520);
            }
        }
        composer.endReplaceableGroup();
        EffectsKt.DisposableEffect(this.this$1.getKey(), new AnonymousClass1(this.this$0, this.this$1), composer, 8);
    }
}
