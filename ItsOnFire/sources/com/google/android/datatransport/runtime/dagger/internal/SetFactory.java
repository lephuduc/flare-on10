package com.google.android.datatransport.runtime.dagger.internal;

import h.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class SetFactory<T> implements Factory<Set<T>> {
    private static final Factory<Set<Object>> EMPTY_FACTORY = InstanceFactory.create(Collections.emptySet());
    private final List<c<Collection<T>>> collectionProviders;
    private final List<c<T>> individualProviders;

    /* loaded from: classes.dex */
    public static final class Builder<T> {
        public static final /* synthetic */ boolean $assertionsDisabled = false;
        private final List<c<Collection<T>>> collectionProviders;
        private final List<c<T>> individualProviders;

        private Builder(int i2, int i3) {
            this.individualProviders = DaggerCollections.presizedList(i2);
            this.collectionProviders = DaggerCollections.presizedList(i3);
        }

        public Builder<T> addCollectionProvider(c<? extends Collection<? extends T>> cVar) {
            this.collectionProviders.add(cVar);
            return this;
        }

        public Builder<T> addProvider(c<? extends T> cVar) {
            this.individualProviders.add(cVar);
            return this;
        }

        public SetFactory<T> build() {
            return new SetFactory<>(this.individualProviders, this.collectionProviders);
        }
    }

    private SetFactory(List<c<T>> list, List<c<Collection<T>>> list2) {
        this.individualProviders = list;
        this.collectionProviders = list2;
    }

    public static <T> Builder<T> builder(int i2, int i3) {
        return new Builder<>(i2, i3);
    }

    public static <T> Factory<Set<T>> empty() {
        return (Factory<Set<T>>) EMPTY_FACTORY;
    }

    @Override // h.c
    public Set<T> get() {
        int size = this.individualProviders.size();
        ArrayList arrayList = new ArrayList(this.collectionProviders.size());
        int size2 = this.collectionProviders.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Collection<T> collection = this.collectionProviders.get(i2).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet newHashSetWithExpectedSize = DaggerCollections.newHashSetWithExpectedSize(size);
        int size3 = this.individualProviders.size();
        for (int i3 = 0; i3 < size3; i3++) {
            newHashSetWithExpectedSize.add(Preconditions.checkNotNull(this.individualProviders.get(i3).get()));
        }
        int size4 = arrayList.size();
        for (int i4 = 0; i4 < size4; i4++) {
            for (Object obj : (Collection) arrayList.get(i4)) {
                newHashSetWithExpectedSize.add(Preconditions.checkNotNull(obj));
            }
        }
        return Collections.unmodifiableSet(newHashSetWithExpectedSize);
    }
}
