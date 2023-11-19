package com.google.firebase.encoders;

import androidx.annotation.NonNull;
import java.io.IOException;

/* loaded from: classes.dex */
public interface ValueEncoder<T> extends Encoder<T, ValueEncoderContext> {
    @Override // com.google.firebase.encoders.Encoder
    /* synthetic */ void encode(@NonNull Object obj, @NonNull ValueEncoderContext valueEncoderContext) throws IOException;
}
