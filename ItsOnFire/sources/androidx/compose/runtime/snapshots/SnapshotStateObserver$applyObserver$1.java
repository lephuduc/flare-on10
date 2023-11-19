package androidx.compose.runtime.snapshots;

import androidx.appcompat.R;
import androidx.compose.runtime.collection.IdentityScopeMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "applied", "", "", "<anonymous parameter 1>", "Landroidx/compose/runtime/snapshots/Snapshot;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SnapshotStateObserver$applyObserver$1 extends Lambda implements Function2<Set<? extends Object>, Snapshot, Unit> {
    public final /* synthetic */ SnapshotStateObserver this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.runtime.snapshots.SnapshotStateObserver$applyObserver$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ SnapshotStateObserver this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SnapshotStateObserver snapshotStateObserver) {
            super(0);
            this.this$0 = snapshotStateObserver;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.this$0.callOnChanged();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateObserver$applyObserver$1(SnapshotStateObserver snapshotStateObserver) {
        super(2);
        this.this$0 = snapshotStateObserver;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Set<? extends Object> set, Snapshot snapshot) {
        invoke2(set, snapshot);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Set<? extends Object> applied, @NotNull Snapshot noName_1) {
        MutableVector mutableVector;
        MutableVector mutableVector2;
        int i2;
        Function1 function1;
        Intrinsics.checkNotNullParameter(applied, "applied");
        Intrinsics.checkNotNullParameter(noName_1, "$noName_1");
        mutableVector = this.this$0.applyMaps;
        SnapshotStateObserver snapshotStateObserver = this.this$0;
        synchronized (mutableVector) {
            mutableVector2 = snapshotStateObserver.applyMaps;
            int size = mutableVector2.getSize();
            i2 = 0;
            if (size > 0) {
                Object[] content = mutableVector2.getContent();
                int i3 = 0;
                do {
                    SnapshotStateObserver.ApplyMap applyMap = (SnapshotStateObserver.ApplyMap) content[i2];
                    HashSet<Object> invalidated = applyMap.getInvalidated();
                    IdentityScopeMap map = applyMap.getMap();
                    for (Object obj : applied) {
                        int find = map.find(obj);
                        if (find >= 0) {
                            for (Object obj2 : map.scopeSetAt(find)) {
                                invalidated.add(obj2);
                                i3 = 1;
                            }
                        }
                    }
                    i2++;
                } while (i2 < size);
                i2 = i3;
            }
            Unit unit = Unit.INSTANCE;
        }
        if (i2 != 0) {
            function1 = this.this$0.onChangedExecutor;
            function1.invoke(new AnonymousClass2(this.this$0));
        }
    }
}
