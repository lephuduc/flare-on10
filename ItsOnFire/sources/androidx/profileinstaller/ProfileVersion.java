package androidx.profileinstaller;

import com.google.firebase.messaging.TopicOperation;
import java.util.Arrays;

/* loaded from: classes.dex */
class ProfileVersion {
    public static final int MIN_SUPPORTED_SDK = 24;
    public static final byte[] V010_P = {48, 49, 48, 0};
    public static final byte[] V009_O_MR1 = {48, 48, 57, 0};
    public static final byte[] V005_O = {48, 48, 53, 0};
    public static final byte[] V001_N = {48, 48, 49, 0};
    public static final byte[] METADATA_V001_N = {48, 48, 49, 0};

    private ProfileVersion() {
    }

    public static String dexKeySeparator(byte[] bArr) {
        return (Arrays.equals(bArr, V001_N) || Arrays.equals(bArr, V005_O)) ? ":" : TopicOperation.OPERATION_PAIR_DIVIDER;
    }
}
