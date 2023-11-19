package com.google.android.datatransport.runtime.dagger.internal;

import h.c;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class AbstractMapFactory<K, V, V2> implements Factory<Map<K, V2>> {
    private final Map<K, c<V>> contributingMap;

    /* loaded from: classes.dex */
    public static abstract class Builder<K, V, V2> {
        public final LinkedHashMap<K, c<V>> map;

        public Builder(int i2) {
            this.map = DaggerCollections.newLinkedHashMapWithExpectedSize(i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder<K, V, V2> put(K k2, c<V> cVar) {
            this.map.put(Preconditions.checkNotNull(k2, "key"), Preconditions.checkNotNull(cVar, "provider"));
            return this;
        }

        public Builder<K, V, V2> putAll(c<Map<K, V2>> cVar) {
            if (cVar instanceof DelegateFactory) {
                return putAll(((DelegateFactory) cVar).getDelegate());
            }
            this.map.putAll(((AbstractMapFactory) cVar).contributingMap);
            return this;
        }
    }

    public AbstractMapFactory(Map<K, c<V>> map) {
        this.contributingMap = Collections.unmodifiableMap(map);
    }

    public final Map<K, c<V>> contributingMap() {
        return this.contributingMap;
    }
}
