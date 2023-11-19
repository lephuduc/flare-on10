package androidx.lifecycle;

/* loaded from: classes.dex */
public class MutableLiveData<T> extends LiveData<T> {
    public MutableLiveData() {
    }

    public MutableLiveData(T t2) {
        super(t2);
    }

    @Override // androidx.lifecycle.LiveData
    public void postValue(T t2) {
        super.postValue(t2);
    }

    @Override // androidx.lifecycle.LiveData
    public void setValue(T t2) {
        super.setValue(t2);
    }
}
