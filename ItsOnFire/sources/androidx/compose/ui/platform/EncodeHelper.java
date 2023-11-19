package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import androidx.appcompat.R;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eJ\u001b\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017J\u001b\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001fJ\u001b\u0010\u0005\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010#\u001a\u00020$J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010%\u001a\u00020&J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010'\u001a\u00020(J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010)\u001a\u00020*J\u001b\u0010\u0005\u001a\u00020\u00062\u0006\u0010+\u001a\u00020,ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010\nJ\u0006\u0010.\u001a\u00020*J\u0006\u0010/\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"Landroidx/compose/ui/platform/EncodeHelper;", "", "()V", "parcel", "Landroid/os/Parcel;", "encode", "", "color", "Landroidx/compose/ui/graphics/Color;", "encode-8_81llA", "(J)V", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "spanStyle", "Landroidx/compose/ui/text/SpanStyle;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "encode-nzbMABs", "(I)V", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "encode-6p3vJLY", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "encode-4Dl_Bck", "(F)V", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "textGeometricTransform", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "textUnit", "Landroidx/compose/ui/unit/TextUnit;", "encode--R2X_6o", "byte", "", "float", "", "int", "", "string", "", "uLong", "Lkotlin/ULong;", "encode-VKZWuLQ", "encodedString", "reset", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class EncodeHelper {
    @NotNull
    private Parcel parcel;

    public EncodeHelper() {
        Parcel obtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
        this.parcel = obtain;
    }

    public final void encode(byte b2) {
        this.parcel.writeByte(b2);
    }

    public final void encode(float f2) {
        this.parcel.writeFloat(f2);
    }

    public final void encode(int i2) {
        this.parcel.writeInt(i2);
    }

    public final void encode(@NotNull Shadow shadow) {
        Intrinsics.checkNotNullParameter(shadow, "shadow");
        m2938encode8_81llA(shadow.m1649getColor0d7_KjU());
        encode(Offset.m1161getXimpl(shadow.m1650getOffsetF1C5BW0()));
        encode(Offset.m1162getYimpl(shadow.m1650getOffsetF1C5BW0()));
        encode(shadow.getBlurRadius());
    }

    public final void encode(@NotNull SpanStyle spanStyle) {
        Intrinsics.checkNotNullParameter(spanStyle, "spanStyle");
        long m3046getColor0d7_KjU = spanStyle.m3046getColor0d7_KjU();
        Color.Companion companion = Color.Companion;
        if (!Color.m1393equalsimpl0(m3046getColor0d7_KjU, companion.m1428getUnspecified0d7_KjU())) {
            encode((byte) 1);
            m2938encode8_81llA(spanStyle.m3046getColor0d7_KjU());
        }
        long m3047getFontSizeXSAIIZE = spanStyle.m3047getFontSizeXSAIIZE();
        TextUnit.Companion companion2 = TextUnit.Companion;
        if (!TextUnit.m3503equalsimpl0(m3047getFontSizeXSAIIZE, companion2.m3517getUnspecifiedXSAIIZE())) {
            encode((byte) 2);
            m2935encodeR2X_6o(spanStyle.m3047getFontSizeXSAIIZE());
        }
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight != null) {
            encode((byte) 3);
            encode(fontWeight);
        }
        FontStyle m3048getFontStyle4Lr2A7w = spanStyle.m3048getFontStyle4Lr2A7w();
        if (m3048getFontStyle4Lr2A7w != null) {
            int m3115unboximpl = m3048getFontStyle4Lr2A7w.m3115unboximpl();
            encode((byte) 4);
            m2940encodenzbMABs(m3115unboximpl);
        }
        FontSynthesis m3049getFontSynthesisZQGJjVo = spanStyle.m3049getFontSynthesisZQGJjVo();
        if (m3049getFontSynthesisZQGJjVo != null) {
            int m3126unboximpl = m3049getFontSynthesisZQGJjVo.m3126unboximpl();
            encode((byte) 5);
            m2937encode6p3vJLY(m3126unboximpl);
        }
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings != null) {
            encode((byte) 6);
            encode(fontFeatureSettings);
        }
        if (!TextUnit.m3503equalsimpl0(spanStyle.m3050getLetterSpacingXSAIIZE(), companion2.m3517getUnspecifiedXSAIIZE())) {
            encode((byte) 7);
            m2935encodeR2X_6o(spanStyle.m3050getLetterSpacingXSAIIZE());
        }
        BaselineShift m3045getBaselineShift5SSeXJ0 = spanStyle.m3045getBaselineShift5SSeXJ0();
        if (m3045getBaselineShift5SSeXJ0 != null) {
            float m3231unboximpl = m3045getBaselineShift5SSeXJ0.m3231unboximpl();
            encode((byte) 8);
            m2936encode4Dl_Bck(m3231unboximpl);
        }
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform != null) {
            encode((byte) 9);
            encode(textGeometricTransform);
        }
        if (!Color.m1393equalsimpl0(spanStyle.m3044getBackground0d7_KjU(), companion.m1428getUnspecified0d7_KjU())) {
            encode((byte) 10);
            m2938encode8_81llA(spanStyle.m3044getBackground0d7_KjU());
        }
        TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration != null) {
            encode((byte) 11);
            encode(textDecoration);
        }
        Shadow shadow = spanStyle.getShadow();
        if (shadow == null) {
            return;
        }
        encode((byte) 12);
        encode(shadow);
    }

    public final void encode(@NotNull FontWeight fontWeight) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        encode(fontWeight.getWeight());
    }

    public final void encode(@NotNull TextDecoration textDecoration) {
        Intrinsics.checkNotNullParameter(textDecoration, "textDecoration");
        encode(textDecoration.getMask());
    }

    public final void encode(@NotNull TextGeometricTransform textGeometricTransform) {
        Intrinsics.checkNotNullParameter(textGeometricTransform, "textGeometricTransform");
        encode(textGeometricTransform.getScaleX());
        encode(textGeometricTransform.getSkewX());
    }

    public final void encode(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        this.parcel.writeString(string);
    }

    /* renamed from: encode--R2X_6o  reason: not valid java name */
    public final void m2935encodeR2X_6o(long j2) {
        long m3505getTypeUIouoOA = TextUnit.m3505getTypeUIouoOA(j2);
        TextUnitType.Companion companion = TextUnitType.Companion;
        byte b2 = 0;
        if (!TextUnitType.m3534equalsimpl0(m3505getTypeUIouoOA, companion.m3540getUnspecifiedUIouoOA())) {
            if (TextUnitType.m3534equalsimpl0(m3505getTypeUIouoOA, companion.m3539getSpUIouoOA())) {
                b2 = 1;
            } else if (TextUnitType.m3534equalsimpl0(m3505getTypeUIouoOA, companion.m3538getEmUIouoOA())) {
                b2 = 2;
            }
        }
        encode(b2);
        if (TextUnitType.m3534equalsimpl0(TextUnit.m3505getTypeUIouoOA(j2), companion.m3540getUnspecifiedUIouoOA())) {
            return;
        }
        encode(TextUnit.m3506getValueimpl(j2));
    }

    /* renamed from: encode-4Dl_Bck  reason: not valid java name */
    public final void m2936encode4Dl_Bck(float f2) {
        encode(f2);
    }

    /* renamed from: encode-6p3vJLY  reason: not valid java name */
    public final void m2937encode6p3vJLY(int i2) {
        FontSynthesis.Companion companion = FontSynthesis.Companion;
        byte b2 = 0;
        if (!FontSynthesis.m3121equalsimpl0(i2, companion.m3128getNoneGVVA2EU())) {
            if (FontSynthesis.m3121equalsimpl0(i2, companion.m3127getAllGVVA2EU())) {
                b2 = 1;
            } else if (FontSynthesis.m3121equalsimpl0(i2, companion.m3130getWeightGVVA2EU())) {
                b2 = 2;
            } else if (FontSynthesis.m3121equalsimpl0(i2, companion.m3129getStyleGVVA2EU())) {
                b2 = 3;
            }
        }
        encode(b2);
    }

    /* renamed from: encode-8_81llA  reason: not valid java name */
    public final void m2938encode8_81llA(long j2) {
        m2939encodeVKZWuLQ(j2);
    }

    /* renamed from: encode-VKZWuLQ  reason: not valid java name */
    public final void m2939encodeVKZWuLQ(long j2) {
        this.parcel.writeLong(j2);
    }

    /* renamed from: encode-nzbMABs  reason: not valid java name */
    public final void m2940encodenzbMABs(int i2) {
        FontStyle.Companion companion = FontStyle.Companion;
        byte b2 = 0;
        if (!FontStyle.m3112equalsimpl0(i2, companion.m3117getNormal_LCdwA()) && FontStyle.m3112equalsimpl0(i2, companion.m3116getItalic_LCdwA())) {
            b2 = 1;
        }
        encode(b2);
    }

    @NotNull
    public final String encodedString() {
        String encodeToString = Base64.encodeToString(this.parcel.marshall(), 0);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(bytes, Base64.DEFAULT)");
        return encodeToString;
    }

    public final void reset() {
        this.parcel.recycle();
        Parcel obtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
        this.parcel = obtain;
    }
}
