package androidx.compose.foundation.lazy.list;

import androidx.appcompat.R;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.State;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.google.firebase.analytics.FirebaseAnalytics;
import j.l;
import j.u0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LazySemanticsKt$lazyListSemantics$1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
    public final /* synthetic */ u0 $coroutineScope;
    public final /* synthetic */ boolean $isVertical;
    public final /* synthetic */ boolean $reverseScrolling;
    public final /* synthetic */ LazyListState $state;
    public final /* synthetic */ State<LazyListItemsProvider> $stateOfItemsProvider;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "needle", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.foundation.lazy.list.LazySemanticsKt$lazyListSemantics$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<Object, Integer> {
        public final /* synthetic */ State<LazyListItemsProvider> $stateOfItemsProvider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(State<? extends LazyListItemsProvider> state) {
            super(1);
            this.$stateOfItemsProvider = state;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Integer invoke(@NotNull Object needle) {
            Intrinsics.checkNotNullParameter(needle, "needle");
            LazySemanticsKt$lazyListSemantics$1$1$key$1 lazySemanticsKt$lazyListSemantics$1$1$key$1 = new LazySemanticsKt$lazyListSemantics$1$1$key$1(this.$stateOfItemsProvider.getValue());
            int itemsCount = this.$stateOfItemsProvider.getValue().getItemsCount();
            int i2 = 0;
            while (i2 < itemsCount) {
                int i3 = i2 + 1;
                if (Intrinsics.areEqual(lazySemanticsKt$lazyListSemantics$1$1$key$1.invoke((LazySemanticsKt$lazyListSemantics$1$1$key$1) Integer.valueOf(i2)), needle)) {
                    return Integer.valueOf(i2);
                }
                i2 = i3;
            }
            return -1;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "x", "", "y", "invoke", "(FF)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.foundation.lazy.list.LazySemanticsKt$lazyListSemantics$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends Lambda implements Function2<Float, Float, Boolean> {
        public final /* synthetic */ u0 $coroutineScope;
        public final /* synthetic */ boolean $isVertical;
        public final /* synthetic */ LazyListState $state;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lj/u0;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "androidx.compose.foundation.lazy.list.LazySemanticsKt$lazyListSemantics$1$2$1", f = "LazySemantics.kt", i = {}, l = {R.styleable.AppCompatTheme_listPreferredItemPaddingLeft}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.lazy.list.LazySemanticsKt$lazyListSemantics$1$2$1  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
            public final /* synthetic */ float $delta;
            public final /* synthetic */ LazyListState $state;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LazyListState lazyListState, float f2, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$state = lazyListState;
                this.$delta = f2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.$state, this.$delta, continuation);
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
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    LazyListState lazyListState = this.$state;
                    float f2 = this.$delta;
                    this.label = 1;
                    if (ScrollExtensionsKt.animateScrollBy$default(lazyListState, f2, null, this, 2, null) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, u0 u0Var, LazyListState lazyListState) {
            super(2);
            this.$isVertical = z;
            this.$coroutineScope = u0Var;
            this.$state = lazyListState;
        }

        @NotNull
        public final Boolean invoke(float f2, float f3) {
            if (this.$isVertical) {
                f2 = f3;
            }
            l.f(this.$coroutineScope, null, null, new AnonymousClass1(this.$state, f2, null), 3, null);
            return Boolean.TRUE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(Float f2, Float f3) {
            return invoke(f2.floatValue(), f3.floatValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", FirebaseAnalytics.Param.INDEX, "", "invoke", "(I)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.foundation.lazy.list.LazySemanticsKt$lazyListSemantics$1$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends Lambda implements Function1<Integer, Boolean> {
        public final /* synthetic */ u0 $coroutineScope;
        public final /* synthetic */ LazyListState $state;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lj/u0;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "androidx.compose.foundation.lazy.list.LazySemanticsKt$lazyListSemantics$1$3$2", f = "LazySemantics.kt", i = {}, l = {R.styleable.AppCompatTheme_searchViewStyle}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.lazy.list.LazySemanticsKt$lazyListSemantics$1$3$2  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
            public final /* synthetic */ int $index;
            public final /* synthetic */ LazyListState $state;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(LazyListState lazyListState, int i2, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$state = lazyListState;
                this.$index = i2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass2(this.$state, this.$index, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    LazyListState lazyListState = this.$state;
                    int i3 = this.$index;
                    this.label = 1;
                    if (LazyListState.scrollToItem$default(lazyListState, i3, 0, this, 2, null) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(LazyListState lazyListState, u0 u0Var) {
            super(1);
            this.$state = lazyListState;
            this.$coroutineScope = u0Var;
        }

        @NotNull
        public final Boolean invoke(int i2) {
            boolean z = i2 >= 0 && i2 < this.$state.getLayoutInfo().getTotalItemsCount();
            LazyListState lazyListState = this.$state;
            if (z) {
                l.f(this.$coroutineScope, null, null, new AnonymousClass2(lazyListState, i2, null), 3, null);
                return Boolean.TRUE;
            }
            throw new IllegalArgumentException(("Can't scroll to index " + i2 + ", it is out of bounds [0, " + lazyListState.getLayoutInfo().getTotalItemsCount() + ')').toString());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazySemanticsKt$lazyListSemantics$1(boolean z, boolean z2, State<? extends LazyListItemsProvider> state, LazyListState lazyListState, u0 u0Var) {
        super(1);
        this.$reverseScrolling = z;
        this.$isVertical = z2;
        this.$stateOfItemsProvider = state;
        this.$state = lazyListState;
        this.$coroutineScope = u0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        invoke2(semanticsPropertyReceiver);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.indexForKey(semantics, new AnonymousClass1(this.$stateOfItemsProvider));
        ScrollAxisRange scrollAxisRange = new ScrollAxisRange(new LazySemanticsKt$lazyListSemantics$1$accessibilityScrollState$1(this.$state), new LazySemanticsKt$lazyListSemantics$1$accessibilityScrollState$2(this.$state, this.$stateOfItemsProvider), this.$reverseScrolling);
        if (this.$isVertical) {
            SemanticsPropertiesKt.setVerticalScrollAxisRange(semantics, scrollAxisRange);
        } else {
            SemanticsPropertiesKt.setHorizontalScrollAxisRange(semantics, scrollAxisRange);
        }
        SemanticsPropertiesKt.scrollBy$default(semantics, null, new AnonymousClass2(this.$isVertical, this.$coroutineScope, this.$state), 1, null);
        SemanticsPropertiesKt.scrollToIndex$default(semantics, null, new AnonymousClass3(this.$state, this.$coroutineScope), 1, null);
        boolean z = this.$isVertical;
        SemanticsPropertiesKt.setCollectionInfo(semantics, new CollectionInfo(z ? -1 : 1, z ? 1 : -1));
    }
}
