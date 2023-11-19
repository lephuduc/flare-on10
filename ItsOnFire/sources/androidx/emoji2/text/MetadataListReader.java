package androidx.emoji2.text;

import android.content.res.AssetManager;
import androidx.annotation.AnyThread;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.flatbuffer.MetadataList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.UShort;

/* JADX INFO: Access modifiers changed from: package-private */
@AnyThread
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class MetadataListReader {
    private static final int EMJI_TAG = 1164798569;
    private static final int EMJI_TAG_DEPRECATED = 1701669481;
    private static final int META_TABLE_NAME = 1835365473;

    /* loaded from: classes.dex */
    public static class ByteBufferReader implements OpenTypeReader {
        @NonNull
        private final ByteBuffer mByteBuffer;

        public ByteBufferReader(@NonNull ByteBuffer byteBuffer) {
            this.mByteBuffer = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public long getPosition() {
            return this.mByteBuffer.position();
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public int readTag() throws IOException {
            return this.mByteBuffer.getInt();
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public long readUnsignedInt() throws IOException {
            return MetadataListReader.toUnsignedInt(this.mByteBuffer.getInt());
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public int readUnsignedShort() throws IOException {
            return MetadataListReader.toUnsignedShort(this.mByteBuffer.getShort());
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public void skip(int i2) throws IOException {
            ByteBuffer byteBuffer = this.mByteBuffer;
            byteBuffer.position(byteBuffer.position() + i2);
        }
    }

    /* loaded from: classes.dex */
    public static class InputStreamOpenTypeReader implements OpenTypeReader {
        @NonNull
        private final byte[] mByteArray;
        @NonNull
        private final ByteBuffer mByteBuffer;
        @NonNull
        private final InputStream mInputStream;
        private long mPosition = 0;

        public InputStreamOpenTypeReader(@NonNull InputStream inputStream) {
            this.mInputStream = inputStream;
            byte[] bArr = new byte[4];
            this.mByteArray = bArr;
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            this.mByteBuffer = wrap;
            wrap.order(ByteOrder.BIG_ENDIAN);
        }

        private void read(@IntRange(from = 0, to = 4) int i2) throws IOException {
            if (this.mInputStream.read(this.mByteArray, 0, i2) != i2) {
                throw new IOException("read failed");
            }
            this.mPosition += i2;
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public long getPosition() {
            return this.mPosition;
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public int readTag() throws IOException {
            this.mByteBuffer.position(0);
            read(4);
            return this.mByteBuffer.getInt();
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public long readUnsignedInt() throws IOException {
            this.mByteBuffer.position(0);
            read(4);
            return MetadataListReader.toUnsignedInt(this.mByteBuffer.getInt());
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public int readUnsignedShort() throws IOException {
            this.mByteBuffer.position(0);
            read(2);
            return MetadataListReader.toUnsignedShort(this.mByteBuffer.getShort());
        }

        @Override // androidx.emoji2.text.MetadataListReader.OpenTypeReader
        public void skip(int i2) throws IOException {
            while (i2 > 0) {
                int skip = (int) this.mInputStream.skip(i2);
                if (skip < 1) {
                    throw new IOException("Skip didn't move at least 1 byte forward");
                }
                i2 -= skip;
                this.mPosition += skip;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class OffsetInfo {
        private final long mLength;
        private final long mStartOffset;

        public OffsetInfo(long j2, long j3) {
            this.mStartOffset = j2;
            this.mLength = j3;
        }

        public long getLength() {
            return this.mLength;
        }

        public long getStartOffset() {
            return this.mStartOffset;
        }
    }

    /* loaded from: classes.dex */
    public interface OpenTypeReader {
        public static final int UINT16_BYTE_COUNT = 2;
        public static final int UINT32_BYTE_COUNT = 4;

        long getPosition();

        int readTag() throws IOException;

        long readUnsignedInt() throws IOException;

        int readUnsignedShort() throws IOException;

        void skip(int i2) throws IOException;
    }

    private MetadataListReader() {
    }

    private static OffsetInfo findOffsetInfo(OpenTypeReader openTypeReader) throws IOException {
        long j2;
        openTypeReader.skip(4);
        int readUnsignedShort = openTypeReader.readUnsignedShort();
        if (readUnsignedShort <= 100) {
            openTypeReader.skip(6);
            int i2 = 0;
            while (true) {
                if (i2 >= readUnsignedShort) {
                    j2 = -1;
                    break;
                }
                int readTag = openTypeReader.readTag();
                openTypeReader.skip(4);
                j2 = openTypeReader.readUnsignedInt();
                openTypeReader.skip(4);
                if (META_TABLE_NAME == readTag) {
                    break;
                }
                i2++;
            }
            if (j2 != -1) {
                openTypeReader.skip((int) (j2 - openTypeReader.getPosition()));
                openTypeReader.skip(12);
                long readUnsignedInt = openTypeReader.readUnsignedInt();
                for (int i3 = 0; i3 < readUnsignedInt; i3++) {
                    int readTag2 = openTypeReader.readTag();
                    long readUnsignedInt2 = openTypeReader.readUnsignedInt();
                    long readUnsignedInt3 = openTypeReader.readUnsignedInt();
                    if (EMJI_TAG == readTag2 || EMJI_TAG_DEPRECATED == readTag2) {
                        return new OffsetInfo(readUnsignedInt2 + j2, readUnsignedInt3);
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    public static MetadataList read(AssetManager assetManager, String str) throws IOException {
        InputStream open = assetManager.open(str);
        try {
            MetadataList read = read(open);
            if (open != null) {
                open.close();
            }
            return read;
        } catch (Throwable th) {
            if (open != null) {
                try {
                    open.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static MetadataList read(InputStream inputStream) throws IOException {
        InputStreamOpenTypeReader inputStreamOpenTypeReader = new InputStreamOpenTypeReader(inputStream);
        OffsetInfo findOffsetInfo = findOffsetInfo(inputStreamOpenTypeReader);
        inputStreamOpenTypeReader.skip((int) (findOffsetInfo.getStartOffset() - inputStreamOpenTypeReader.getPosition()));
        ByteBuffer allocate = ByteBuffer.allocate((int) findOffsetInfo.getLength());
        int read = inputStream.read(allocate.array());
        if (read == findOffsetInfo.getLength()) {
            return MetadataList.getRootAsMetadataList(allocate);
        }
        throw new IOException("Needed " + findOffsetInfo.getLength() + " bytes, got " + read);
    }

    public static MetadataList read(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) findOffsetInfo(new ByteBufferReader(duplicate)).getStartOffset());
        return MetadataList.getRootAsMetadataList(duplicate);
    }

    public static long toUnsignedInt(int i2) {
        return i2 & 4294967295L;
    }

    public static int toUnsignedShort(short s2) {
        return s2 & UShort.MAX_VALUE;
    }
}
