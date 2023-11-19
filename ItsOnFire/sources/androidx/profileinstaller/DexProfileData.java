package androidx.profileinstaller;

import androidx.annotation.NonNull;
import java.util.TreeMap;

/* loaded from: classes.dex */
class DexProfileData {
    @NonNull
    public final String apkName;
    public int classSetSize;
    @NonNull
    public int[] classes;
    public final long dexChecksum;
    @NonNull
    public final String dexName;
    public final int hotMethodRegionSize;
    @NonNull
    public final TreeMap<Integer, Integer> methods;
    public final int numMethodIds;

    public DexProfileData(@NonNull String str, @NonNull String str2, long j2, int i2, int i3, int i4, @NonNull int[] iArr, @NonNull TreeMap<Integer, Integer> treeMap) {
        this.apkName = str;
        this.dexName = str2;
        this.dexChecksum = j2;
        this.classSetSize = i2;
        this.hotMethodRegionSize = i3;
        this.numMethodIds = i4;
        this.classes = iArr;
        this.methods = treeMap;
    }
}
