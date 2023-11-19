package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.snapshots.Snapshot;
import j.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "frameTime", "Lj/q;", "", "invoke", "(J)Lj/q;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class Recomposer$runFrameLoop$2 extends Lambda implements Function1<Long, q<? super Unit>> {
    public final /* synthetic */ ProduceFrameSignal $frameSignal;
    public final /* synthetic */ List<ControlledComposition> $toApply;
    public final /* synthetic */ List<ControlledComposition> $toRecompose;
    public final /* synthetic */ Recomposer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$runFrameLoop$2(Recomposer recomposer, List<ControlledComposition> list, List<ControlledComposition> list2, ProduceFrameSignal produceFrameSignal) {
        super(1);
        this.this$0 = recomposer;
        this.$toRecompose = list;
        this.$toApply = list2;
        this.$frameSignal = produceFrameSignal;
    }

    @Nullable
    public final q<Unit> invoke(long j2) {
        BroadcastFrameClock broadcastFrameClock;
        Object beginSection;
        List list;
        int i2;
        List list2;
        q<Unit> deriveStateLocked;
        ControlledComposition performRecompose;
        BroadcastFrameClock broadcastFrameClock2;
        broadcastFrameClock = this.this$0.broadcastFrameClock;
        if (broadcastFrameClock.getHasAwaiters()) {
            Recomposer recomposer = this.this$0;
            Trace trace = Trace.INSTANCE;
            beginSection = trace.beginSection("Recomposer:animation");
            try {
                broadcastFrameClock2 = recomposer.broadcastFrameClock;
                broadcastFrameClock2.sendFrame(j2);
                Snapshot.Companion.sendApplyNotifications();
                Unit unit = Unit.INSTANCE;
                trace.endSection(beginSection);
            } finally {
            }
        }
        Recomposer recomposer2 = this.this$0;
        List<ControlledComposition> list3 = this.$toRecompose;
        List<ControlledComposition> list4 = this.$toApply;
        ProduceFrameSignal produceFrameSignal = this.$frameSignal;
        beginSection = Trace.INSTANCE.beginSection("Recomposer:recompose");
        try {
            synchronized (recomposer2.stateLock) {
                recomposer2.recordComposerModificationsLocked();
                list = recomposer2.compositionsAwaitingApply;
                int size = list.size();
                i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    list4.add((ControlledComposition) list.get(i3));
                }
                list2 = recomposer2.compositionsAwaitingApply;
                list2.clear();
                List list5 = recomposer2.compositionInvalidations;
                int size2 = list5.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    list3.add((ControlledComposition) list5.get(i4));
                }
                recomposer2.compositionInvalidations.clear();
                produceFrameSignal.takeFrameRequestLocked();
                Unit unit2 = Unit.INSTANCE;
            }
            IdentityArraySet identityArraySet = new IdentityArraySet();
            int size3 = list3.size();
            int i5 = 0;
            while (i5 < size3) {
                int i6 = i5 + 1;
                performRecompose = recomposer2.performRecompose(list3.get(i5), identityArraySet);
                if (performRecompose != null) {
                    list4.add(performRecompose);
                }
                i5 = i6;
            }
            list3.clear();
            if (!list4.isEmpty()) {
                recomposer2.changeCount = recomposer2.getChangeCount() + 1;
            }
            int size4 = list4.size();
            while (i2 < size4) {
                int i7 = i2 + 1;
                list4.get(i2).applyChanges();
                i2 = i7;
            }
            list4.clear();
            synchronized (recomposer2.stateLock) {
                deriveStateLocked = recomposer2.deriveStateLocked();
            }
            return deriveStateLocked;
        } finally {
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ q<? super Unit> invoke(Long l2) {
        return invoke(l2.longValue());
    }
}
