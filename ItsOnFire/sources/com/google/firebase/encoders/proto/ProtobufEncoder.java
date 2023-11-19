package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class ProtobufEncoder {
    private final ObjectEncoder<Object> fallbackEncoder;
    private final Map<Class<?>, ObjectEncoder<?>> objectEncoders;
    private final Map<Class<?>, ValueEncoder<?>> valueEncoders;

    /* loaded from: classes.dex */
    public static final class Builder implements EncoderConfig<Builder> {
        private static final ObjectEncoder<Object> DEFAULT_FALLBACK_ENCODER = new ObjectEncoder() { // from class: com.google.firebase.encoders.proto.b
            @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
            public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
                ProtobufEncoder.Builder.lambda$static$0(obj, objectEncoderContext);
            }
        };
        private final Map<Class<?>, ObjectEncoder<?>> objectEncoders = new HashMap();
        private final Map<Class<?>, ValueEncoder<?>> valueEncoders = new HashMap();
        private ObjectEncoder<Object> fallbackEncoder = DEFAULT_FALLBACK_ENCODER;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$static$0(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public ProtobufEncoder build() {
            return new ProtobufEncoder(new HashMap(this.objectEncoders), new HashMap(this.valueEncoders), this.fallbackEncoder);
        }

        @NonNull
        public Builder configureWith(@NonNull Configurator configurator) {
            configurator.configure(this);
            return this;
        }

        @Override // com.google.firebase.encoders.config.EncoderConfig
        @NonNull
        public <U> Builder registerEncoder(@NonNull Class<U> cls, @NonNull ObjectEncoder<? super U> objectEncoder) {
            this.objectEncoders.put(cls, objectEncoder);
            this.valueEncoders.remove(cls);
            return this;
        }

        @Override // com.google.firebase.encoders.config.EncoderConfig
        @NonNull
        public <U> Builder registerEncoder(@NonNull Class<U> cls, @NonNull ValueEncoder<? super U> valueEncoder) {
            this.valueEncoders.put(cls, valueEncoder);
            this.objectEncoders.remove(cls);
            return this;
        }

        @NonNull
        public Builder registerFallbackEncoder(@NonNull ObjectEncoder<Object> objectEncoder) {
            this.fallbackEncoder = objectEncoder;
            return this;
        }
    }

    public ProtobufEncoder(Map<Class<?>, ObjectEncoder<?>> map, Map<Class<?>, ValueEncoder<?>> map2, ObjectEncoder<Object> objectEncoder) {
        this.objectEncoders = map;
        this.valueEncoders = map2;
        this.fallbackEncoder = objectEncoder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public void encode(@NonNull Object obj, @NonNull OutputStream outputStream) throws IOException {
        new ProtobufDataEncoderContext(outputStream, this.objectEncoders, this.valueEncoders, this.fallbackEncoder).encode(obj);
    }

    @NonNull
    public byte[] encode(@NonNull Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            encode(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
