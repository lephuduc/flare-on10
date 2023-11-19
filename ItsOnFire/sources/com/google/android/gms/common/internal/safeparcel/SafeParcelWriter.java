package com.google.android.gms.common.internal.safeparcel;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import androidx.annotation.NonNull;
import androidx.core.internal.view.SupportMenu;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/* loaded from: classes.dex */
public class SafeParcelWriter {
    private SafeParcelWriter() {
    }

    public static int beginObjectHeader(@NonNull Parcel parcel) {
        return zza(parcel, 20293);
    }

    public static void finishObjectHeader(@NonNull Parcel parcel, int i2) {
        zzb(parcel, i2);
    }

    public static void writeBigDecimal(@NonNull Parcel parcel, int i2, @NonNull BigDecimal bigDecimal, boolean z) {
        if (bigDecimal == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
        parcel.writeInt(bigDecimal.scale());
        zzb(parcel, zza);
    }

    public static void writeBigDecimalArray(@NonNull Parcel parcel, int i2, @NonNull BigDecimal[] bigDecimalArr, boolean z) {
        if (bigDecimalArr == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        int length = bigDecimalArr.length;
        parcel.writeInt(length);
        for (int i3 = 0; i3 < length; i3++) {
            parcel.writeByteArray(bigDecimalArr[i3].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i3].scale());
        }
        zzb(parcel, zza);
    }

    public static void writeBigInteger(@NonNull Parcel parcel, int i2, @NonNull BigInteger bigInteger, boolean z) {
        if (bigInteger == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.writeByteArray(bigInteger.toByteArray());
        zzb(parcel, zza);
    }

    public static void writeBigIntegerArray(@NonNull Parcel parcel, int i2, @NonNull BigInteger[] bigIntegerArr, boolean z) {
        if (bigIntegerArr == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.writeInt(bigIntegerArr.length);
        for (BigInteger bigInteger : bigIntegerArr) {
            parcel.writeByteArray(bigInteger.toByteArray());
        }
        zzb(parcel, zza);
    }

    public static void writeBoolean(@NonNull Parcel parcel, int i2, boolean z) {
        zzc(parcel, i2, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void writeBooleanArray(@NonNull Parcel parcel, int i2, @NonNull boolean[] zArr, boolean z) {
        if (zArr == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.writeBooleanArray(zArr);
        zzb(parcel, zza);
    }

    public static void writeBooleanList(@NonNull Parcel parcel, int i2, @NonNull List<Boolean> list, boolean z) {
        if (list == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeInt(list.get(i3).booleanValue() ? 1 : 0);
        }
        zzb(parcel, zza);
    }

    public static void writeBooleanObject(@NonNull Parcel parcel, int i2, @NonNull Boolean bool, boolean z) {
        if (bool != null) {
            zzc(parcel, i2, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z) {
            zzc(parcel, i2, 0);
        }
    }

    public static void writeBundle(@NonNull Parcel parcel, int i2, @NonNull Bundle bundle, boolean z) {
        if (bundle == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.writeBundle(bundle);
        zzb(parcel, zza);
    }

    public static void writeByte(@NonNull Parcel parcel, int i2, byte b2) {
        zzc(parcel, i2, 4);
        parcel.writeInt(b2);
    }

    public static void writeByteArray(@NonNull Parcel parcel, int i2, @NonNull byte[] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.writeByteArray(bArr);
        zzb(parcel, zza);
    }

    public static void writeByteArrayArray(@NonNull Parcel parcel, int i2, @NonNull byte[][] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        zzb(parcel, zza);
    }

    public static void writeByteArraySparseArray(@NonNull Parcel parcel, int i2, @NonNull SparseArray<byte[]> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeInt(sparseArray.keyAt(i3));
            parcel.writeByteArray(sparseArray.valueAt(i3));
        }
        zzb(parcel, zza);
    }

    public static void writeChar(@NonNull Parcel parcel, int i2, char c2) {
        zzc(parcel, i2, 4);
        parcel.writeInt(c2);
    }

    public static void writeCharArray(@NonNull Parcel parcel, int i2, @NonNull char[] cArr, boolean z) {
        if (cArr == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.writeCharArray(cArr);
        zzb(parcel, zza);
    }

    public static void writeDouble(@NonNull Parcel parcel, int i2, double d2) {
        zzc(parcel, i2, 8);
        parcel.writeDouble(d2);
    }

    public static void writeDoubleArray(@NonNull Parcel parcel, int i2, @NonNull double[] dArr, boolean z) {
        if (dArr == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.writeDoubleArray(dArr);
        zzb(parcel, zza);
    }

    public static void writeDoubleList(@NonNull Parcel parcel, int i2, @NonNull List<Double> list, boolean z) {
        if (list == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeDouble(list.get(i3).doubleValue());
        }
        zzb(parcel, zza);
    }

    public static void writeDoubleObject(@NonNull Parcel parcel, int i2, @NonNull Double d2, boolean z) {
        if (d2 != null) {
            zzc(parcel, i2, 8);
            parcel.writeDouble(d2.doubleValue());
        } else if (z) {
            zzc(parcel, i2, 0);
        }
    }

    public static void writeDoubleSparseArray(@NonNull Parcel parcel, int i2, @NonNull SparseArray<Double> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeInt(sparseArray.keyAt(i3));
            parcel.writeDouble(sparseArray.valueAt(i3).doubleValue());
        }
        zzb(parcel, zza);
    }

    public static void writeFloat(@NonNull Parcel parcel, int i2, float f2) {
        zzc(parcel, i2, 4);
        parcel.writeFloat(f2);
    }

    public static void writeFloatArray(@NonNull Parcel parcel, int i2, @NonNull float[] fArr, boolean z) {
        if (fArr == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.writeFloatArray(fArr);
        zzb(parcel, zza);
    }

    public static void writeFloatList(@NonNull Parcel parcel, int i2, @NonNull List<Float> list, boolean z) {
        if (list == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeFloat(list.get(i3).floatValue());
        }
        zzb(parcel, zza);
    }

    public static void writeFloatObject(@NonNull Parcel parcel, int i2, @NonNull Float f2, boolean z) {
        if (f2 != null) {
            zzc(parcel, i2, 4);
            parcel.writeFloat(f2.floatValue());
        } else if (z) {
            zzc(parcel, i2, 0);
        }
    }

    public static void writeFloatSparseArray(@NonNull Parcel parcel, int i2, @NonNull SparseArray<Float> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeInt(sparseArray.keyAt(i3));
            parcel.writeFloat(sparseArray.valueAt(i3).floatValue());
        }
        zzb(parcel, zza);
    }

    public static void writeIBinder(@NonNull Parcel parcel, int i2, @NonNull IBinder iBinder, boolean z) {
        if (iBinder == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.writeStrongBinder(iBinder);
        zzb(parcel, zza);
    }

    public static void writeIBinderArray(@NonNull Parcel parcel, int i2, @NonNull IBinder[] iBinderArr, boolean z) {
        if (iBinderArr == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.writeBinderArray(iBinderArr);
        zzb(parcel, zza);
    }

    public static void writeIBinderList(@NonNull Parcel parcel, int i2, @NonNull List<IBinder> list, boolean z) {
        if (list == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.writeBinderList(list);
        zzb(parcel, zza);
    }

    public static void writeIBinderSparseArray(@NonNull Parcel parcel, int i2, @NonNull SparseArray<IBinder> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeInt(sparseArray.keyAt(i3));
            parcel.writeStrongBinder(sparseArray.valueAt(i3));
        }
        zzb(parcel, zza);
    }

    public static void writeInt(@NonNull Parcel parcel, int i2, int i3) {
        zzc(parcel, i2, 4);
        parcel.writeInt(i3);
    }

    public static void writeIntArray(@NonNull Parcel parcel, int i2, @NonNull int[] iArr, boolean z) {
        if (iArr == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.writeIntArray(iArr);
        zzb(parcel, zza);
    }

    public static void writeIntegerList(@NonNull Parcel parcel, int i2, @NonNull List<Integer> list, boolean z) {
        if (list == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeInt(list.get(i3).intValue());
        }
        zzb(parcel, zza);
    }

    public static void writeIntegerObject(@NonNull Parcel parcel, int i2, @NonNull Integer num, boolean z) {
        if (num != null) {
            zzc(parcel, i2, 4);
            parcel.writeInt(num.intValue());
        } else if (z) {
            zzc(parcel, i2, 0);
        }
    }

    public static void writeList(@NonNull Parcel parcel, int i2, @NonNull List list, boolean z) {
        if (list == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.writeList(list);
        zzb(parcel, zza);
    }

    public static void writeLong(@NonNull Parcel parcel, int i2, long j2) {
        zzc(parcel, i2, 8);
        parcel.writeLong(j2);
    }

    public static void writeLongArray(@NonNull Parcel parcel, int i2, @NonNull long[] jArr, boolean z) {
        if (jArr == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.writeLongArray(jArr);
        zzb(parcel, zza);
    }

    public static void writeLongList(@NonNull Parcel parcel, int i2, @NonNull List<Long> list, boolean z) {
        if (list == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeLong(list.get(i3).longValue());
        }
        zzb(parcel, zza);
    }

    public static void writeLongObject(@NonNull Parcel parcel, int i2, @NonNull Long l2, boolean z) {
        if (l2 != null) {
            zzc(parcel, i2, 8);
            parcel.writeLong(l2.longValue());
        } else if (z) {
            zzc(parcel, i2, 0);
        }
    }

    public static void writeParcel(@NonNull Parcel parcel, int i2, @NonNull Parcel parcel2, boolean z) {
        if (parcel2 == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.appendFrom(parcel2, 0, parcel2.dataSize());
        zzb(parcel, zza);
    }

    public static void writeParcelArray(@NonNull Parcel parcel, int i2, @NonNull Parcel[] parcelArr, boolean z) {
        if (parcelArr == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.writeInt(parcelArr.length);
        for (Parcel parcel2 : parcelArr) {
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzb(parcel, zza);
    }

    public static void writeParcelList(@NonNull Parcel parcel, int i2, @NonNull List<Parcel> list, boolean z) {
        if (list == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            Parcel parcel2 = list.get(i3);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzb(parcel, zza);
    }

    public static void writeParcelSparseArray(@NonNull Parcel parcel, int i2, @NonNull SparseArray<Parcel> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeInt(sparseArray.keyAt(i3));
            Parcel valueAt = sparseArray.valueAt(i3);
            if (valueAt != null) {
                parcel.writeInt(valueAt.dataSize());
                parcel.appendFrom(valueAt, 0, valueAt.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzb(parcel, zza);
    }

    public static void writeParcelable(@NonNull Parcel parcel, int i2, @NonNull Parcelable parcelable, int i3, boolean z) {
        if (parcelable == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcelable.writeToParcel(parcel, i3);
        zzb(parcel, zza);
    }

    public static void writePendingIntent(@NonNull Parcel parcel, int i2, @NonNull PendingIntent pendingIntent, boolean z) {
        if (pendingIntent == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        PendingIntent.writePendingIntentOrNullToParcel(pendingIntent, parcel);
        zzb(parcel, zza);
    }

    public static void writeShort(@NonNull Parcel parcel, int i2, short s2) {
        zzc(parcel, i2, 4);
        parcel.writeInt(s2);
    }

    public static void writeSparseBooleanArray(@NonNull Parcel parcel, int i2, @NonNull SparseBooleanArray sparseBooleanArray, boolean z) {
        if (sparseBooleanArray == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.writeSparseBooleanArray(sparseBooleanArray);
        zzb(parcel, zza);
    }

    public static void writeSparseIntArray(@NonNull Parcel parcel, int i2, @NonNull SparseIntArray sparseIntArray, boolean z) {
        if (sparseIntArray == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        int size = sparseIntArray.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeInt(sparseIntArray.keyAt(i3));
            parcel.writeInt(sparseIntArray.valueAt(i3));
        }
        zzb(parcel, zza);
    }

    public static void writeSparseLongArray(@NonNull Parcel parcel, int i2, @NonNull SparseLongArray sparseLongArray, boolean z) {
        if (sparseLongArray == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        int size = sparseLongArray.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeInt(sparseLongArray.keyAt(i3));
            parcel.writeLong(sparseLongArray.valueAt(i3));
        }
        zzb(parcel, zza);
    }

    public static void writeString(@NonNull Parcel parcel, int i2, @NonNull String str, boolean z) {
        if (str == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.writeString(str);
        zzb(parcel, zza);
    }

    public static void writeStringArray(@NonNull Parcel parcel, int i2, @NonNull String[] strArr, boolean z) {
        if (strArr == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.writeStringArray(strArr);
        zzb(parcel, zza);
    }

    public static void writeStringList(@NonNull Parcel parcel, int i2, @NonNull List<String> list, boolean z) {
        if (list == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.writeStringList(list);
        zzb(parcel, zza);
    }

    public static void writeStringSparseArray(@NonNull Parcel parcel, int i2, @NonNull SparseArray<String> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeInt(sparseArray.keyAt(i3));
            parcel.writeString(sparseArray.valueAt(i3));
        }
        zzb(parcel, zza);
    }

    public static <T extends Parcelable> void writeTypedArray(@NonNull Parcel parcel, int i2, @NonNull T[] tArr, int i3, boolean z) {
        if (tArr == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        parcel.writeInt(tArr.length);
        for (T t2 : tArr) {
            if (t2 == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, t2, i3);
            }
        }
        zzb(parcel, zza);
    }

    public static <T extends Parcelable> void writeTypedList(@NonNull Parcel parcel, int i2, @NonNull List<T> list, boolean z) {
        if (list == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            T t2 = list.get(i3);
            if (t2 == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, t2, 0);
            }
        }
        zzb(parcel, zza);
    }

    public static <T extends Parcelable> void writeTypedSparseArray(@NonNull Parcel parcel, int i2, @NonNull SparseArray<T> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                zzc(parcel, i2, 0);
                return;
            }
            return;
        }
        int zza = zza(parcel, i2);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeInt(sparseArray.keyAt(i3));
            T valueAt = sparseArray.valueAt(i3);
            if (valueAt == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, valueAt, 0);
            }
        }
        zzb(parcel, zza);
    }

    private static int zza(Parcel parcel, int i2) {
        parcel.writeInt(i2 | SupportMenu.CATEGORY_MASK);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void zzb(Parcel parcel, int i2) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i2 - 4);
        parcel.writeInt(dataPosition - i2);
        parcel.setDataPosition(dataPosition);
    }

    private static void zzc(Parcel parcel, int i2, int i3) {
        parcel.writeInt(i2 | (i3 << 16));
    }

    private static void zzd(Parcel parcel, Parcelable parcelable, int i2) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i2);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}
