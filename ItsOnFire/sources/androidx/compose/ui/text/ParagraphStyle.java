package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B6\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tø\u0001\u0000¢\u0006\u0002\u0010\nJA\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0014\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0000H\u0007J\u0011\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0000H\u0087\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016R\u001c\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/ui/text/ParagraphStyle;", "", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "textDirection", "Landroidx/compose/ui/text/style/TextDirection;", "lineHeight", "Landroidx/compose/ui/unit/TextUnit;", "textIndent", "Landroidx/compose/ui/text/style/TextIndent;", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getLineHeight-XSAIIZE", "()J", "J", "getTextAlign-buA522U", "()Landroidx/compose/ui/text/style/TextAlign;", "getTextDirection-mmuk1to", "()Landroidx/compose/ui/text/style/TextDirection;", "getTextIndent", "()Landroidx/compose/ui/text/style/TextIndent;", "copy", "copy-Elsmlbk", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;)Landroidx/compose/ui/text/ParagraphStyle;", "equals", "", "other", "hashCode", "", "merge", "plus", "toString", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ParagraphStyle {
    private final long lineHeight;
    @Nullable
    private final TextAlign textAlign;
    @Nullable
    private final TextDirection textDirection;
    @Nullable
    private final TextIndent textIndent;

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent) {
        this.textAlign = textAlign;
        this.textDirection = textDirection;
        this.lineHeight = j2;
        this.textIndent = textIndent;
        if (TextUnit.m3503equalsimpl0(m3010getLineHeightXSAIIZE(), TextUnit.Companion.m3517getUnspecifiedXSAIIZE())) {
            return;
        }
        if (TextUnit.m3506getValueimpl(m3010getLineHeightXSAIIZE()) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + TextUnit.m3506getValueimpl(m3010getLineHeightXSAIIZE()) + ')').toString());
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : textAlign, (i2 & 2) != 0 ? null : textDirection, (i2 & 4) != 0 ? TextUnit.Companion.m3517getUnspecifiedXSAIIZE() : j2, (i2 & 8) != 0 ? null : textIndent, null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign, textDirection, j2, textIndent);
    }

    /* renamed from: copy-Elsmlbk$default  reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m3008copyElsmlbk$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j2, TextIndent textIndent, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            textAlign = paragraphStyle.m3011getTextAlignbuA522U();
        }
        if ((i2 & 2) != 0) {
            textDirection = paragraphStyle.m3012getTextDirectionmmuk1to();
        }
        TextDirection textDirection2 = textDirection;
        if ((i2 & 4) != 0) {
            j2 = paragraphStyle.m3010getLineHeightXSAIIZE();
        }
        long j3 = j2;
        if ((i2 & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        return paragraphStyle.m3009copyElsmlbk(textAlign, textDirection2, j3, textIndent);
    }

    public static /* synthetic */ ParagraphStyle merge$default(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            paragraphStyle2 = null;
        }
        return paragraphStyle.merge(paragraphStyle2);
    }

    @NotNull
    /* renamed from: copy-Elsmlbk  reason: not valid java name */
    public final ParagraphStyle m3009copyElsmlbk(@Nullable TextAlign textAlign, @Nullable TextDirection textDirection, long j2, @Nullable TextIndent textIndent) {
        return new ParagraphStyle(textAlign, textDirection, j2, textIndent, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ParagraphStyle) {
            ParagraphStyle paragraphStyle = (ParagraphStyle) obj;
            return Intrinsics.areEqual(m3011getTextAlignbuA522U(), paragraphStyle.m3011getTextAlignbuA522U()) && Intrinsics.areEqual(m3012getTextDirectionmmuk1to(), paragraphStyle.m3012getTextDirectionmmuk1to()) && TextUnit.m3503equalsimpl0(m3010getLineHeightXSAIIZE(), paragraphStyle.m3010getLineHeightXSAIIZE()) && Intrinsics.areEqual(this.textIndent, paragraphStyle.textIndent);
        }
        return false;
    }

    /* renamed from: getLineHeight-XSAIIZE  reason: not valid java name */
    public final long m3010getLineHeightXSAIIZE() {
        return this.lineHeight;
    }

    @Nullable
    /* renamed from: getTextAlign-buA522U  reason: not valid java name */
    public final TextAlign m3011getTextAlignbuA522U() {
        return this.textAlign;
    }

    @Nullable
    /* renamed from: getTextDirection-mmuk1to  reason: not valid java name */
    public final TextDirection m3012getTextDirectionmmuk1to() {
        return this.textDirection;
    }

    @Nullable
    public final TextIndent getTextIndent() {
        return this.textIndent;
    }

    public int hashCode() {
        TextAlign m3011getTextAlignbuA522U = m3011getTextAlignbuA522U();
        int m3243hashCodeimpl = (m3011getTextAlignbuA522U == null ? 0 : TextAlign.m3243hashCodeimpl(m3011getTextAlignbuA522U.m3245unboximpl())) * 31;
        TextDirection m3012getTextDirectionmmuk1to = m3012getTextDirectionmmuk1to();
        int m3256hashCodeimpl = (((m3243hashCodeimpl + (m3012getTextDirectionmmuk1to == null ? 0 : TextDirection.m3256hashCodeimpl(m3012getTextDirectionmmuk1to.m3258unboximpl()))) * 31) + TextUnit.m3507hashCodeimpl(m3010getLineHeightXSAIIZE())) * 31;
        TextIndent textIndent = this.textIndent;
        return m3256hashCodeimpl + (textIndent != null ? textIndent.hashCode() : 0);
    }

    @Stable
    @NotNull
    public final ParagraphStyle merge(@Nullable ParagraphStyle paragraphStyle) {
        if (paragraphStyle == null) {
            return this;
        }
        long m3010getLineHeightXSAIIZE = TextUnitKt.m3524isUnspecifiedR2X_6o(paragraphStyle.m3010getLineHeightXSAIIZE()) ? m3010getLineHeightXSAIIZE() : paragraphStyle.m3010getLineHeightXSAIIZE();
        TextIndent textIndent = paragraphStyle.textIndent;
        if (textIndent == null) {
            textIndent = this.textIndent;
        }
        TextIndent textIndent2 = textIndent;
        TextAlign m3011getTextAlignbuA522U = paragraphStyle.m3011getTextAlignbuA522U();
        if (m3011getTextAlignbuA522U == null) {
            m3011getTextAlignbuA522U = m3011getTextAlignbuA522U();
        }
        TextAlign textAlign = m3011getTextAlignbuA522U;
        TextDirection m3012getTextDirectionmmuk1to = paragraphStyle.m3012getTextDirectionmmuk1to();
        return new ParagraphStyle(textAlign, m3012getTextDirectionmmuk1to == null ? m3012getTextDirectionmmuk1to() : m3012getTextDirectionmmuk1to, m3010getLineHeightXSAIIZE, textIndent2, null);
    }

    @Stable
    @NotNull
    public final ParagraphStyle plus(@NotNull ParagraphStyle other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return merge(other);
    }

    @NotNull
    public String toString() {
        return "ParagraphStyle(textAlign=" + m3011getTextAlignbuA522U() + ", textDirection=" + m3012getTextDirectionmmuk1to() + ", lineHeight=" + ((Object) TextUnit.m3513toStringimpl(m3010getLineHeightXSAIIZE())) + ", textIndent=" + this.textIndent + ')';
    }
}
