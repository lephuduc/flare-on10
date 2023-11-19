package com.google.android.datatransport.runtime.dagger.internal;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class MapBuilder<K, V> {
    private final Map<K, V> contributions;

    private MapBuilder(int i2) {
        this.contributions = DaggerCollections.newLinkedHashMapWithExpectedSize(i2);
    }

    public static <K, V> MapBuilder<K, V> newMapBuilder(int i2) {
        return new MapBuilder<>(i2);
    }

    public Map<K, V> build() {
        return this.contributions.size() != 0 ? Collections.unmodifiableMap(this.contributions) : Collections.emptyMap();
    }

    public MapBuilder<K, V> put(K k2, V v2) {
        this.contributions.put(k2, v2);
        return this;
    }

    public MapBuilder<K, V> putAll(Map<K, V> map) {
        this.contributions.putAll(map);
        return this;
    }
}
