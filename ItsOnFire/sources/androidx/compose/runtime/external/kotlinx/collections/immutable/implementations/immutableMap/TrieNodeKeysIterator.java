package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.appcompat.R;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeKeysIterator;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;", "()V", "next", "()Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TrieNodeKeysIterator<K, V> extends TrieNodeBaseIterator<K, V, K> {
    @Override // java.util.Iterator
    public K next() {
        CommonFunctionsKt.m1077assert(hasNextKey());
        setIndex(getIndex() + 2);
        return (K) getBuffer()[getIndex() - 2];
    }
}
