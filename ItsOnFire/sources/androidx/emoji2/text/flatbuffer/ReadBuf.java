package androidx.emoji2.text.flatbuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public interface ReadBuf {
    byte[] data();

    byte get(int i2);

    boolean getBoolean(int i2);

    double getDouble(int i2);

    float getFloat(int i2);

    int getInt(int i2);

    long getLong(int i2);

    short getShort(int i2);

    String getString(int i2, int i3);

    int limit();
}
