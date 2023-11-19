package androidx.compose.ui.node;

import androidx.appcompat.R;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.input.pointer.PointerInputFilter;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.semantics.SemanticsWrapper;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000À\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u0096\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\b\u0096\u0002\u0097\u0002\u0098\u0002\u0099\u0002B\u000f\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010©\u0001\u001a\u00020xH\u0002J\u0018\u0010ª\u0001\u001a\u00020x2\u0007\u0010\u0086\u0001\u001a\u00020wH\u0000¢\u0006\u0003\b«\u0001J\u001d\u0010¬\u0001\u001a\u0010\u0012\u0005\u0012\u00030®\u0001\u0012\u0004\u0012\u0002000\u00ad\u0001H\u0000¢\u0006\u0003\b¯\u0001J\t\u0010°\u0001\u001a\u00020xH\u0002J\u0014\u0010±\u0001\u001a\u00030²\u00012\b\b\u0002\u0010/\u001a\u000200H\u0002J\u000f\u0010³\u0001\u001a\u00020xH\u0000¢\u0006\u0003\b´\u0001J\u000f\u0010µ\u0001\u001a\u00020xH\u0000¢\u0006\u0003\b¶\u0001J\u0019\u0010·\u0001\u001a\u00020x2\b\u0010¸\u0001\u001a\u00030¹\u0001H\u0000¢\u0006\u0003\bº\u0001J\u001f\u0010»\u0001\u001a\u00020x2\u0013\u0010¼\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020x0vH\u0082\bJ\u001f\u0010½\u0001\u001a\u00020x2\u0013\u0010¼\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020x0vH\u0082\bJ\t\u0010¾\u0001\u001a\u00020xH\u0016J\u0010\u0010¿\u0001\u001a\t\u0012\u0005\u0012\u00030À\u00010!H\u0016J\u0016\u0010Á\u0001\u001a\t\u0012\u0005\u0012\u00030\u0081\u00010\fH\u0000¢\u0006\u0003\bÂ\u0001J\u0019\u0010Ã\u0001\u001a\u00020x2\b\u0010Ä\u0001\u001a\u00030Å\u0001H\u0000¢\u0006\u0003\bÆ\u0001J\t\u0010Ç\u0001\u001a\u00020\u0007H\u0002JI\u0010È\u0001\u001a\u00020x2\b\u0010É\u0001\u001a\u00030Ê\u00012\u000f\u0010Ë\u0001\u001a\n\u0012\u0005\u0012\u00030Í\u00010Ì\u00012\t\b\u0002\u0010Î\u0001\u001a\u00020\u00072\t\b\u0002\u0010Ï\u0001\u001a\u00020\u0007H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\bÐ\u0001\u0010Ñ\u0001JI\u0010Ò\u0001\u001a\u00020x2\b\u0010É\u0001\u001a\u00030Ê\u00012\u000f\u0010Ó\u0001\u001a\n\u0012\u0005\u0012\u00030Ô\u00010Ì\u00012\t\b\u0002\u0010Î\u0001\u001a\u00020\u00072\t\b\u0002\u0010Ï\u0001\u001a\u00020\u0007H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\bÕ\u0001\u0010Ñ\u0001J\"\u00109\u001a\u00020x2\u000e\u0010¼\u0001\u001a\t\u0012\u0004\u0012\u00020x0Ö\u0001H\u0080\bø\u0001\u0002¢\u0006\u0003\b×\u0001J!\u0010Ø\u0001\u001a\u00020x2\u0007\u0010Ù\u0001\u001a\u0002002\u0007\u0010Ú\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0003\bÛ\u0001J\u000f\u0010Ü\u0001\u001a\u00020xH\u0000¢\u0006\u0003\bÝ\u0001J\u000f\u0010Þ\u0001\u001a\u00020xH\u0000¢\u0006\u0003\bß\u0001J\t\u0010à\u0001\u001a\u00020xH\u0002J\u000f\u0010á\u0001\u001a\u00020xH\u0000¢\u0006\u0003\bâ\u0001J\t\u0010ã\u0001\u001a\u00020xH\u0002J\u0011\u0010ä\u0001\u001a\u00020x2\u0006\u0010k\u001a\u00020jH\u0002J\t\u0010å\u0001\u001a\u00020xH\u0002J\u0012\u0010æ\u0001\u001a\u0002002\u0007\u0010\u009f\u0001\u001a\u000200H\u0016J\u0011\u0010ç\u0001\u001a\u0002002\u0006\u00107\u001a\u000200H\u0016J#\u0010è\u0001\u001a\u00030é\u00012\b\u0010ê\u0001\u001a\u00030ë\u0001H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\bì\u0001\u0010í\u0001J\u0012\u0010î\u0001\u001a\u0002002\u0007\u0010\u009f\u0001\u001a\u000200H\u0016J\u0011\u0010ï\u0001\u001a\u0002002\u0006\u00107\u001a\u000200H\u0016J*\u0010ð\u0001\u001a\u00020x2\u0007\u0010ñ\u0001\u001a\u0002002\u0007\u0010ò\u0001\u001a\u0002002\u0007\u0010ó\u0001\u001a\u000200H\u0000¢\u0006\u0003\bô\u0001J\u000f\u0010õ\u0001\u001a\u00020xH\u0000¢\u0006\u0003\bö\u0001J\t\u0010÷\u0001\u001a\u00020xH\u0002J\t\u0010ø\u0001\u001a\u00020xH\u0002J\u000f\u0010ù\u0001\u001a\u00020xH\u0000¢\u0006\u0003\bú\u0001J\t\u0010û\u0001\u001a\u00020xH\u0002J!\u0010ü\u0001\u001a\u00020x2\u0007\u0010ý\u0001\u001a\u0002002\u0007\u0010þ\u0001\u001a\u000200H\u0000¢\u0006\u0003\bÿ\u0001J\t\u0010\u0080\u0002\u001a\u00020xH\u0002J#\u0010\u0081\u0002\u001a\u00020\u00072\f\b\u0002\u0010ê\u0001\u001a\u0005\u0018\u00010ë\u0001H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0003\b\u0082\u0002J\u000f\u0010\u0083\u0002\u001a\u00020xH\u0000¢\u0006\u0003\b\u0084\u0002J!\u0010\u0085\u0002\u001a\u00020x2\u0007\u0010Ù\u0001\u001a\u0002002\u0007\u0010ó\u0001\u001a\u000200H\u0000¢\u0006\u0003\b\u0086\u0002J\u000f\u0010\u0087\u0002\u001a\u00020xH\u0000¢\u0006\u0003\b\u0088\u0002J\u000f\u0010\u0089\u0002\u001a\u00020xH\u0000¢\u0006\u0003\b\u008a\u0002J\u000f\u0010\u008b\u0002\u001a\u00020xH\u0000¢\u0006\u0003\b\u008c\u0002J\u0012\u0010\u008d\u0002\u001a\u00020x2\u0007\u0010\u008e\u0002\u001a\u00020\u0000H\u0002J\"\u0010\u008f\u0002\u001a\t\u0012\u0002\b\u0003\u0018\u00010¢\u00012\u0007\u0010k\u001a\u00030\u0090\u00022\u0007\u0010\u0091\u0002\u001a\u00020\u0014H\u0002J\t\u0010\u0092\u0002\u001a\u00020\u0007H\u0002J\n\u0010\u0093\u0002\u001a\u00030²\u0001H\u0016J\u001f\u0010\u0094\u0002\u001a\u00020x2\u000e\u0010¼\u0001\u001a\t\u0012\u0004\u0012\u00020x0Ö\u0001H\u0000¢\u0006\u0003\b\u0095\u0002R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\nX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\f8@X\u0080\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00000\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u0018X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00000!8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R$\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020)@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u000200X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u00000!8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b6\u0010#R\u0014\u00107\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00102R\u000e\u00109\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010:\u001a\u0004\u0018\u00010\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u001a\u0010=\u001a\u00020\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u001e\"\u0004\b?\u0010\bR\u0014\u0010@\u001a\u00020\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010<R\u0014\u0010B\u001a\u00020CX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010\u001eR\u001e\u0010H\u001a\u00020\u00072\u0006\u0010G\u001a\u00020\u0007@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\bH\u0010\u001eR\u0014\u0010I\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010\u001eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010K\u001a\u00020J2\u0006\u0010(\u001a\u00020J@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001a\u0010P\u001a\u00020QX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u0014\u0010V\u001a\u00020W8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR$\u0010[\u001a\u00020Z2\u0006\u0010(\u001a\u00020Z@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u0014\u0010`\u001a\u00020aX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bb\u0010cR\u001a\u0010d\u001a\u00020eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR*\u0010k\u001a\u00020j2\u0006\u0010(\u001a\u00020j@VX\u0096\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bl\u0010\u000e\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u001a\u0010q\u001a\u00020\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u0010\u001e\"\u0004\bs\u0010\bR\u000e\u0010t\u001a\u000200X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010u\u001a\u0010\u0012\u0004\u0012\u00020w\u0012\u0004\u0012\u00020x\u0018\u00010vX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R(\u0010}\u001a\u0010\u0012\u0004\u0012\u00020w\u0012\u0004\u0012\u00020x\u0018\u00010vX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b~\u0010z\"\u0004\b\u007f\u0010|R\u0018\u0010\u0080\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0081\u0001\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0082\u0001\u001a\u00020\u00148@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010<R\u0010\u0010\u0084\u0001\u001a\u00030\u0085\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R%\u0010\u0086\u0001\u001a\u0004\u0018\u00010w2\b\u0010G\u001a\u0004\u0018\u00010w@BX\u0080\u000e¢\u0006\n\n\u0000\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0019\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u00008@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001a\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008d\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0019\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R \u0010\u0093\u0001\u001a\u0002002\u0006\u0010G\u001a\u000200@BX\u0080\u000e¢\u0006\t\n\u0000\u001a\u0005\b\u0094\u0001\u00102R\u000f\u0010\u0095\u0001\u001a\u000200X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0096\u0001\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0097\u0001\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0098\u0001\u001a\u00030\u0099\u0001X\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R\u000f\u0010\u009e\u0001\u001a\u000200X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u009f\u0001\u001a\u0002008VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b \u0001\u00102R\u001a\u0010¡\u0001\u001a\r\u0012\t\u0012\u0007\u0012\u0002\b\u00030¢\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010£\u0001\u001a\u00030¤\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010¥\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000\f8@X\u0081\u0004¢\u0006\u000e\u0012\u0005\b¦\u0001\u0010\u000e\u001a\u0005\b§\u0001\u0010\u0010R\u000f\u0010¨\u0001\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006\u009a\u0002"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/Remeasurement;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/layout/LayoutInfo;", "Landroidx/compose/ui/node/ComposeUiNode;", "isVirtual", "", "(Z)V", "ZComparator", "Ljava/util/Comparator;", "_children", "Landroidx/compose/runtime/collection/MutableVector;", "get_children$ui_release$annotations", "()V", "get_children$ui_release", "()Landroidx/compose/runtime/collection/MutableVector;", "_foldedChildren", "_foldedParent", "_innerLayerWrapper", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "_unfoldedChildren", "_zSortedChildren", "alignmentLines", "Landroidx/compose/ui/node/LayoutNodeAlignmentLines;", "getAlignmentLines$ui_release", "()Landroidx/compose/ui/node/LayoutNodeAlignmentLines;", "canMultiMeasure", "getCanMultiMeasure$ui_release$annotations", "getCanMultiMeasure$ui_release", "()Z", "setCanMultiMeasure$ui_release", "children", "", "getChildren$ui_release", "()Ljava/util/List;", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "value", "Landroidx/compose/ui/unit/Density;", "density", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "depth", "", "getDepth$ui_release", "()I", "setDepth$ui_release", "(I)V", "foldedChildren", "getFoldedChildren$ui_release", "height", "getHeight", "ignoreRemeasureRequests", "innerLayerWrapper", "getInnerLayerWrapper", "()Landroidx/compose/ui/node/LayoutNodeWrapper;", "innerLayerWrapperIsDirty", "getInnerLayerWrapperIsDirty$ui_release", "setInnerLayerWrapperIsDirty$ui_release", "innerLayoutNodeWrapper", "getInnerLayoutNodeWrapper$ui_release", "intrinsicsPolicy", "Landroidx/compose/ui/node/IntrinsicsPolicy;", "getIntrinsicsPolicy$ui_release", "()Landroidx/compose/ui/node/IntrinsicsPolicy;", "isAttached", "<set-?>", "isPlaced", "isValid", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutState", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "getLayoutState$ui_release", "()Landroidx/compose/ui/node/LayoutNode$LayoutState;", "setLayoutState$ui_release", "(Landroidx/compose/ui/node/LayoutNode$LayoutState;)V", "mDrawScope", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "getMDrawScope$ui_release", "()Landroidx/compose/ui/node/LayoutNodeDrawScope;", "Landroidx/compose/ui/layout/MeasurePolicy;", "measurePolicy", "getMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "setMeasurePolicy", "(Landroidx/compose/ui/layout/MeasurePolicy;)V", "measureScope", "Landroidx/compose/ui/layout/MeasureScope;", "getMeasureScope$ui_release", "()Landroidx/compose/ui/layout/MeasureScope;", "measuredByParent", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "getMeasuredByParent$ui_release", "()Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "setMeasuredByParent$ui_release", "(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V", "Landroidx/compose/ui/Modifier;", "modifier", "getModifier$annotations", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "needsOnPositionedDispatch", "getNeedsOnPositionedDispatch$ui_release", "setNeedsOnPositionedDispatch$ui_release", "nextChildPlaceOrder", "onAttach", "Lkotlin/Function1;", "Landroidx/compose/ui/node/Owner;", "", "getOnAttach$ui_release", "()Lkotlin/jvm/functions/Function1;", "setOnAttach$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "onDetach", "getOnDetach$ui_release", "setOnDetach$ui_release", "onPositionedCallbacks", "Landroidx/compose/ui/node/OnGloballyPositionedModifierWrapper;", "outerLayoutNodeWrapper", "getOuterLayoutNodeWrapper$ui_release", "outerMeasurablePlaceable", "Landroidx/compose/ui/node/OuterMeasurablePlaceable;", "owner", "getOwner$ui_release", "()Landroidx/compose/ui/node/Owner;", "parent", "getParent$ui_release", "()Landroidx/compose/ui/node/LayoutNode;", "parentData", "", "getParentData", "()Ljava/lang/Object;", "parentInfo", "getParentInfo", "()Landroidx/compose/ui/layout/LayoutInfo;", "placeOrder", "getPlaceOrder$ui_release", "previousPlaceOrder", "relayoutWithoutParentInProgress", "unfoldedVirtualChildrenListDirty", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "setViewConfiguration", "(Landroidx/compose/ui/platform/ViewConfiguration;)V", "virtualChildrenCount", "width", "getWidth", "wrapperCache", "Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "zIndex", "", "zSortedChildren", "getZSortedChildren$annotations", "getZSortedChildren", "zSortedChildrenInvalidated", "alignmentLinesQueriedByModifier", "attach", "attach$ui_release", "calculateAlignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "calculateAlignmentLines$ui_release", "copyWrappersToCache", "debugTreeToString", "", "detach", "detach$ui_release", "dispatchOnPositionedCallbacks", "dispatchOnPositionedCallbacks$ui_release", "draw", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "draw$ui_release", "forEachDelegate", "block", "forEachDelegateIncludingInner", "forceRemeasure", "getModifierInfo", "Landroidx/compose/ui/layout/ModifierInfo;", "getOrCreateOnPositionedCallbacks", "getOrCreateOnPositionedCallbacks$ui_release", "handleMeasureResult", "measureResult", "Landroidx/compose/ui/layout/MeasureResult;", "handleMeasureResult$ui_release", "hasNewPositioningCallback", "hitTest", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "hitTestResult", "Landroidx/compose/ui/node/HitTestResult;", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "isTouchEvent", "isInLayer", "hitTest-M_7yMNQ$ui_release", "(JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "hitTestSemantics", "hitSemanticsWrappers", "Landroidx/compose/ui/semantics/SemanticsWrapper;", "hitTestSemantics-M_7yMNQ$ui_release", "Lkotlin/Function0;", "ignoreRemeasureRequests$ui_release", "insertAt", FirebaseAnalytics.Param.INDEX, "instance", "insertAt$ui_release", "invalidateLayer", "invalidateLayer$ui_release", "invalidateLayers", "invalidateLayers$ui_release", "invalidateUnfoldedVirtualChildren", "layoutChildren", "layoutChildren$ui_release", "markNodeAndSubtreeAsPlaced", "markReusedModifiers", "markSubtreeAsNotPlaced", "maxIntrinsicHeight", "maxIntrinsicWidth", "measure", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "minIntrinsicHeight", "minIntrinsicWidth", "move", Constants.MessagePayloadKeys.FROM, "to", "count", "move$ui_release", "onAlignmentsChanged", "onAlignmentsChanged$ui_release", "onBeforeLayoutChildren", "onDensityOrLayoutDirectionChanged", "onNodePlaced", "onNodePlaced$ui_release", "onZSortedChildrenInvalidated", "place", "x", "y", "place$ui_release", "recreateUnfoldedChildrenIfDirty", "remeasure", "remeasure-_Sx5XlM$ui_release", "removeAll", "removeAll$ui_release", "removeAt", "removeAt$ui_release", "replace", "replace$ui_release", "requestRelayout", "requestRelayout$ui_release", "requestRemeasure", "requestRemeasure$ui_release", "rescheduleRemeasureOrRelayout", "it", "reuseLayoutNodeWrapper", "Landroidx/compose/ui/Modifier$Element;", "wrapper", "shouldInvalidateParentLayer", "toString", "withNoSnapshotReadObservation", "withNoSnapshotReadObservation$ui_release", "Companion", "LayoutState", "NoIntrinsicsMeasurePolicy", "UsageByParent", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LayoutNode implements Measurable, Remeasurement, OwnerScope, LayoutInfo, ComposeUiNode {
    public static final int NotPlacedPlaceOrder = Integer.MAX_VALUE;
    @NotNull
    private final Comparator<LayoutNode> ZComparator;
    @NotNull
    private final MutableVector<LayoutNode> _foldedChildren;
    @Nullable
    private LayoutNode _foldedParent;
    @Nullable
    private LayoutNodeWrapper _innerLayerWrapper;
    @Nullable
    private MutableVector<LayoutNode> _unfoldedChildren;
    @NotNull
    private final MutableVector<LayoutNode> _zSortedChildren;
    @NotNull
    private final LayoutNodeAlignmentLines alignmentLines;
    private boolean canMultiMeasure;
    @NotNull
    private Density density;
    private int depth;
    private boolean ignoreRemeasureRequests;
    private boolean innerLayerWrapperIsDirty;
    @NotNull
    private final LayoutNodeWrapper innerLayoutNodeWrapper;
    @NotNull
    private final IntrinsicsPolicy intrinsicsPolicy;
    private boolean isPlaced;
    private final boolean isVirtual;
    @NotNull
    private LayoutDirection layoutDirection;
    @NotNull
    private LayoutState layoutState;
    @NotNull
    private MeasurePolicy measurePolicy;
    @NotNull
    private final MeasureScope measureScope;
    @NotNull
    private UsageByParent measuredByParent;
    @NotNull
    private Modifier modifier;
    private boolean needsOnPositionedDispatch;
    private int nextChildPlaceOrder;
    @Nullable
    private Function1<? super Owner, Unit> onAttach;
    @Nullable
    private Function1<? super Owner, Unit> onDetach;
    @Nullable
    private MutableVector<OnGloballyPositionedModifierWrapper> onPositionedCallbacks;
    @NotNull
    private final OuterMeasurablePlaceable outerMeasurablePlaceable;
    @Nullable
    private Owner owner;
    private int placeOrder;
    private int previousPlaceOrder;
    private boolean relayoutWithoutParentInProgress;
    private boolean unfoldedVirtualChildrenListDirty;
    @NotNull
    private ViewConfiguration viewConfiguration;
    private int virtualChildrenCount;
    @NotNull
    private MutableVector<DelegatingLayoutNodeWrapper<?>> wrapperCache;
    private float zIndex;
    private boolean zSortedChildrenInvalidated;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final NoIntrinsicsMeasurePolicy ErrorMeasurePolicy = new NoIntrinsicsMeasurePolicy() { // from class: androidx.compose.ui.node.LayoutNode$Companion$ErrorMeasurePolicy$1
        @Override // androidx.compose.ui.layout.MeasurePolicy
        /* renamed from: measure-3p2s80s */
        public /* bridge */ /* synthetic */ MeasureResult mo6measure3p2s80s(MeasureScope measureScope, List list, long j2) {
            mo6measure3p2s80s(measureScope, (List<? extends Measurable>) list, j2);
            throw new KotlinNothingValueException();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        @NotNull
        /* renamed from: measure-3p2s80s */
        public Void mo6measure3p2s80s(@NotNull MeasureScope receiver, @NotNull List<? extends Measurable> measurables, long j2) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            throw new IllegalStateException("Undefined measure and it is required".toString());
        }
    };
    @NotNull
    private static final Function0<LayoutNode> Constructor = LayoutNode$Companion$Constructor$1.INSTANCE;
    @NotNull
    private static final ViewConfiguration DummyViewConfiguration = new ViewConfiguration() { // from class: androidx.compose.ui.node.LayoutNode$Companion$DummyViewConfiguration$1
        @Override // androidx.compose.ui.platform.ViewConfiguration
        public long getDoubleTapMinTimeMillis() {
            return 40L;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        public long getDoubleTapTimeoutMillis() {
            return 300L;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        public long getLongPressTimeoutMillis() {
            return 400L;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        /* renamed from: getMinimumTouchTargetSize-MYxV2XQ  reason: not valid java name */
        public long mo2872getMinimumTouchTargetSizeMYxV2XQ() {
            return DpSize.Companion.m3433getZeroMYxV2XQ();
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        public float getTouchSlop() {
            return 16.0f;
        }
    };

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$Companion;", "", "()V", "Constructor", "Lkotlin/Function0;", "Landroidx/compose/ui/node/LayoutNode;", "getConstructor$ui_release", "()Lkotlin/jvm/functions/Function0;", "DummyViewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getDummyViewConfiguration$ui_release", "()Landroidx/compose/ui/platform/ViewConfiguration;", "ErrorMeasurePolicy", "Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "NotPlacedPlaceOrder", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Function0<LayoutNode> getConstructor$ui_release() {
            return LayoutNode.Constructor;
        }

        @NotNull
        public final ViewConfiguration getDummyViewConfiguration$ui_release() {
            return LayoutNode.DummyViewConfiguration;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$LayoutState;", "", "(Ljava/lang/String;I)V", "NeedsRemeasure", "Measuring", "NeedsRelayout", "LayingOut", "Ready", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public enum LayoutState {
        NeedsRemeasure,
        Measuring,
        NeedsRelayout,
        LayingOut,
        Ready
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\r\u001a\u00020\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\"\u0010\u000f\u001a\u00020\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\u0010\u001a\u00020\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000e\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "(Ljava/lang/String;)V", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "", "maxIntrinsicWidth", "height", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static abstract class NoIntrinsicsMeasurePolicy implements MeasurePolicy {
        @NotNull
        private final String error;

        public NoIntrinsicsMeasurePolicy(@NotNull String error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
            return ((Number) maxIntrinsicHeight(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i2)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        @NotNull
        public Void maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            throw new IllegalStateException(this.error.toString());
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
            return ((Number) maxIntrinsicWidth(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i2)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        @NotNull
        public Void maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            throw new IllegalStateException(this.error.toString());
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
            return ((Number) minIntrinsicHeight(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i2)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        @NotNull
        public Void minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            throw new IllegalStateException(this.error.toString());
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
            return ((Number) minIntrinsicWidth(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i2)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        @NotNull
        public Void minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            throw new IllegalStateException(this.error.toString());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "", "(Ljava/lang/String;I)V", "InMeasureBlock", "InLayoutBlock", "NotUsed", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public enum UsageByParent {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutState.values().length];
            iArr[LayoutState.NeedsRemeasure.ordinal()] = 1;
            iArr[LayoutState.NeedsRelayout.ordinal()] = 2;
            iArr[LayoutState.Ready.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LayoutNode() {
        this(false, 1, null);
    }

    public LayoutNode(boolean z) {
        this.isVirtual = z;
        this._foldedChildren = new MutableVector<>(new LayoutNode[16], 0);
        this.layoutState = LayoutState.Ready;
        this.wrapperCache = new MutableVector<>(new DelegatingLayoutNodeWrapper[16], 0);
        this._zSortedChildren = new MutableVector<>(new LayoutNode[16], 0);
        this.zSortedChildrenInvalidated = true;
        this.measurePolicy = ErrorMeasurePolicy;
        this.intrinsicsPolicy = new IntrinsicsPolicy(this);
        this.density = DensityKt.Density$default(1.0f, 0.0f, 2, null);
        this.measureScope = new LayoutNode$measureScope$1(this);
        this.layoutDirection = LayoutDirection.Ltr;
        this.viewConfiguration = DummyViewConfiguration;
        this.alignmentLines = new LayoutNodeAlignmentLines(this);
        this.placeOrder = Integer.MAX_VALUE;
        this.previousPlaceOrder = Integer.MAX_VALUE;
        this.measuredByParent = UsageByParent.NotUsed;
        InnerPlaceable innerPlaceable = new InnerPlaceable(this);
        this.innerLayoutNodeWrapper = innerPlaceable;
        this.outerMeasurablePlaceable = new OuterMeasurablePlaceable(this, innerPlaceable);
        this.innerLayerWrapperIsDirty = true;
        this.modifier = Modifier.Companion;
        this.ZComparator = new Comparator() { // from class: androidx.compose.ui.node.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m2865ZComparator$lambda34;
                m2865ZComparator$lambda34 = LayoutNode.m2865ZComparator$lambda34((LayoutNode) obj, (LayoutNode) obj2);
                return m2865ZComparator$lambda34;
            }
        };
    }

    public /* synthetic */ LayoutNode(boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z);
    }

    /* renamed from: ZComparator$lambda-34 */
    public static final int m2865ZComparator$lambda34(LayoutNode layoutNode, LayoutNode layoutNode2) {
        float f2 = layoutNode.zIndex;
        float f3 = layoutNode2.zIndex;
        return (f2 > f3 ? 1 : (f2 == f3 ? 0 : -1)) == 0 ? Intrinsics.compare(layoutNode.placeOrder, layoutNode2.placeOrder) : Float.compare(f2, f3);
    }

    private final void alignmentLinesQueriedByModifier() {
        if (this.layoutState != LayoutState.Measuring) {
            this.alignmentLines.setUsedByModifierLayout$ui_release(true);
            return;
        }
        this.alignmentLines.setUsedByModifierMeasurement$ui_release(true);
        if (this.alignmentLines.getDirty$ui_release()) {
            this.layoutState = LayoutState.NeedsRelayout;
        }
    }

    private final void copyWrappersToCache() {
        LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = getOuterLayoutNodeWrapper$ui_release();
        LayoutNodeWrapper innerLayoutNodeWrapper$ui_release = getInnerLayoutNodeWrapper$ui_release();
        while (!Intrinsics.areEqual(outerLayoutNodeWrapper$ui_release, innerLayoutNodeWrapper$ui_release)) {
            this.wrapperCache.add((DelegatingLayoutNodeWrapper) outerLayoutNodeWrapper$ui_release);
            outerLayoutNodeWrapper$ui_release.setDrawEntityHead(null);
            outerLayoutNodeWrapper$ui_release = outerLayoutNodeWrapper$ui_release.getWrapped$ui_release();
            Intrinsics.checkNotNull(outerLayoutNodeWrapper$ui_release);
        }
        this.innerLayoutNodeWrapper.setDrawEntityHead(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String debugTreeToString(int r7) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r2 = r1
        L7:
            if (r2 >= r7) goto L11
            int r2 = r2 + 1
            java.lang.String r3 = "  "
            r0.append(r3)
            goto L7
        L11:
            java.lang.String r2 = "|-"
            r0.append(r2)
            java.lang.String r2 = r6.toString()
            r0.append(r2)
            r2 = 10
            r0.append(r2)
            androidx.compose.runtime.collection.MutableVector r6 = r6.get_children$ui_release()
            int r2 = r6.getSize()
            if (r2 <= 0) goto L42
            java.lang.Object[] r6 = r6.getContent()
            r3 = r1
        L31:
            r4 = r6[r3]
            androidx.compose.ui.node.LayoutNode r4 = (androidx.compose.ui.node.LayoutNode) r4
            int r5 = r7 + 1
            java.lang.String r4 = r4.debugTreeToString(r5)
            r0.append(r4)
            int r3 = r3 + 1
            if (r3 < r2) goto L31
        L42:
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "tree.toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            if (r7 != 0) goto L5c
            int r7 = r6.length()
            int r7 = r7 + (-1)
            java.lang.String r6 = r6.substring(r1, r7)
            java.lang.String r7 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
        L5c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNode.debugTreeToString(int):java.lang.String");
    }

    public static /* synthetic */ String debugTreeToString$default(LayoutNode layoutNode, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return layoutNode.debugTreeToString(i2);
    }

    private final void forEachDelegate(Function1<? super LayoutNodeWrapper, Unit> function1) {
        LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = getOuterLayoutNodeWrapper$ui_release();
        LayoutNodeWrapper innerLayoutNodeWrapper$ui_release = getInnerLayoutNodeWrapper$ui_release();
        while (!Intrinsics.areEqual(outerLayoutNodeWrapper$ui_release, innerLayoutNodeWrapper$ui_release)) {
            function1.invoke(outerLayoutNodeWrapper$ui_release);
            outerLayoutNodeWrapper$ui_release = outerLayoutNodeWrapper$ui_release.getWrapped$ui_release();
            Intrinsics.checkNotNull(outerLayoutNodeWrapper$ui_release);
        }
    }

    private final void forEachDelegateIncludingInner(Function1<? super LayoutNodeWrapper, Unit> function1) {
        LayoutNodeWrapper wrapped$ui_release = getInnerLayoutNodeWrapper$ui_release().getWrapped$ui_release();
        for (LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = getOuterLayoutNodeWrapper$ui_release(); !Intrinsics.areEqual(outerLayoutNodeWrapper$ui_release, wrapped$ui_release) && outerLayoutNodeWrapper$ui_release != null; outerLayoutNodeWrapper$ui_release = outerLayoutNodeWrapper$ui_release.getWrapped$ui_release()) {
            function1.invoke(outerLayoutNodeWrapper$ui_release);
        }
    }

    @Deprecated(message = "Temporary API to support ConstraintLayout prototyping.")
    public static /* synthetic */ void getCanMultiMeasure$ui_release$annotations() {
    }

    private final LayoutNodeWrapper getInnerLayerWrapper() {
        if (this.innerLayerWrapperIsDirty) {
            LayoutNodeWrapper layoutNodeWrapper = this.innerLayoutNodeWrapper;
            LayoutNodeWrapper wrappedBy$ui_release = getOuterLayoutNodeWrapper$ui_release().getWrappedBy$ui_release();
            this._innerLayerWrapper = null;
            while (true) {
                if (Intrinsics.areEqual(layoutNodeWrapper, wrappedBy$ui_release)) {
                    break;
                }
                if ((layoutNodeWrapper == null ? null : layoutNodeWrapper.getLayer()) != null) {
                    this._innerLayerWrapper = layoutNodeWrapper;
                    break;
                }
                layoutNodeWrapper = layoutNodeWrapper == null ? null : layoutNodeWrapper.getWrappedBy$ui_release();
            }
        }
        LayoutNodeWrapper layoutNodeWrapper2 = this._innerLayerWrapper;
        if (layoutNodeWrapper2 == null || layoutNodeWrapper2.getLayer() != null) {
            return layoutNodeWrapper2;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static /* synthetic */ void getModifier$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getZSortedChildren$annotations() {
    }

    public static /* synthetic */ void get_children$ui_release$annotations() {
    }

    private final boolean hasNewPositioningCallback() {
        return ((Boolean) getModifier().foldOut(Boolean.FALSE, new LayoutNode$hasNewPositioningCallback$1(this.onPositionedCallbacks))).booleanValue();
    }

    /* renamed from: hitTest-M_7yMNQ$ui_release$default */
    public static /* synthetic */ void m2866hitTestM_7yMNQ$ui_release$default(LayoutNode layoutNode, long j2, HitTestResult hitTestResult, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        boolean z3 = z;
        if ((i2 & 8) != 0) {
            z2 = true;
        }
        layoutNode.m2869hitTestM_7yMNQ$ui_release(j2, hitTestResult, z3, z2);
    }

    private final void invalidateUnfoldedVirtualChildren() {
        LayoutNode parent$ui_release;
        if (this.virtualChildrenCount > 0) {
            this.unfoldedVirtualChildrenListDirty = true;
        }
        if (!this.isVirtual || (parent$ui_release = getParent$ui_release()) == null) {
            return;
        }
        parent$ui_release.unfoldedVirtualChildrenListDirty = true;
    }

    private final void markNodeAndSubtreeAsPlaced() {
        this.isPlaced = true;
        LayoutNodeWrapper wrapped$ui_release = getInnerLayoutNodeWrapper$ui_release().getWrapped$ui_release();
        for (LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = getOuterLayoutNodeWrapper$ui_release(); !Intrinsics.areEqual(outerLayoutNodeWrapper$ui_release, wrapped$ui_release) && outerLayoutNodeWrapper$ui_release != null; outerLayoutNodeWrapper$ui_release = outerLayoutNodeWrapper$ui_release.getWrapped$ui_release()) {
            if (outerLayoutNodeWrapper$ui_release.getLastLayerDrawingWasSkipped$ui_release()) {
                outerLayoutNodeWrapper$ui_release.invalidateLayer();
            }
        }
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            int i2 = 0;
            LayoutNode[] content = mutableVector.getContent();
            do {
                LayoutNode layoutNode = content[i2];
                if (layoutNode.getPlaceOrder$ui_release() != Integer.MAX_VALUE) {
                    layoutNode.markNodeAndSubtreeAsPlaced();
                    rescheduleRemeasureOrRelayout(layoutNode);
                }
                i2++;
            } while (i2 < size);
        }
    }

    private final void markReusedModifiers(Modifier modifier) {
        MutableVector<DelegatingLayoutNodeWrapper<?>> mutableVector = this.wrapperCache;
        int size = mutableVector.getSize();
        if (size <= 0) {
            modifier.foldIn(Unit.INSTANCE, new LayoutNode$markReusedModifiers$2(this));
        }
        DelegatingLayoutNodeWrapper<?>[] content = mutableVector.getContent();
        int i2 = 0;
        do {
            content[i2].setToBeReusedForSameModifier(false);
            i2++;
        } while (i2 < size);
        modifier.foldIn(Unit.INSTANCE, new LayoutNode$markReusedModifiers$2(this));
    }

    public final void markSubtreeAsNotPlaced() {
        if (isPlaced()) {
            int i2 = 0;
            this.isPlaced = false;
            MutableVector<LayoutNode> mutableVector = get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector.getContent();
                do {
                    content[i2].markSubtreeAsNotPlaced();
                    i2++;
                } while (i2 < size);
            }
        }
    }

    private final void onBeforeLayoutChildren() {
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            int i2 = 0;
            LayoutNode[] content = mutableVector.getContent();
            do {
                LayoutNode layoutNode = content[i2];
                if (layoutNode.getLayoutState$ui_release() == LayoutState.NeedsRemeasure && layoutNode.getMeasuredByParent$ui_release() == UsageByParent.InMeasureBlock && m2868remeasure_Sx5XlM$ui_release$default(layoutNode, null, 1, null)) {
                    requestRemeasure$ui_release();
                }
                i2++;
            } while (i2 < size);
        }
    }

    private final void onDensityOrLayoutDirectionChanged() {
        requestRemeasure$ui_release();
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
        invalidateLayers$ui_release();
    }

    public final void onZSortedChildrenInvalidated() {
        if (!this.isVirtual) {
            this.zSortedChildrenInvalidated = true;
            return;
        }
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release == null) {
            return;
        }
        parent$ui_release.onZSortedChildrenInvalidated();
    }

    private final void recreateUnfoldedChildrenIfDirty() {
        if (this.unfoldedVirtualChildrenListDirty) {
            int i2 = 0;
            this.unfoldedVirtualChildrenListDirty = false;
            MutableVector<LayoutNode> mutableVector = this._unfoldedChildren;
            if (mutableVector == null) {
                MutableVector<LayoutNode> mutableVector2 = new MutableVector<>(new LayoutNode[16], 0);
                this._unfoldedChildren = mutableVector2;
                mutableVector = mutableVector2;
            }
            mutableVector.clear();
            MutableVector<LayoutNode> mutableVector3 = this._foldedChildren;
            int size = mutableVector3.getSize();
            if (size > 0) {
                LayoutNode[] content = mutableVector3.getContent();
                do {
                    LayoutNode layoutNode = content[i2];
                    if (layoutNode.isVirtual) {
                        mutableVector.addAll(mutableVector.getSize(), layoutNode.get_children$ui_release());
                    } else {
                        mutableVector.add(layoutNode);
                    }
                    i2++;
                } while (i2 < size);
            }
        }
    }

    /* renamed from: remeasure-_Sx5XlM$ui_release$default */
    public static /* synthetic */ boolean m2868remeasure_Sx5XlM$ui_release$default(LayoutNode layoutNode, Constraints constraints, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            constraints = layoutNode.outerMeasurablePlaceable.m2892getLastConstraintsDWUhwKw();
        }
        return layoutNode.m2871remeasure_Sx5XlM$ui_release(constraints);
    }

    private final void rescheduleRemeasureOrRelayout(LayoutNode layoutNode) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[layoutNode.layoutState.ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                throw new IllegalStateException(Intrinsics.stringPlus("Unexpected state ", layoutNode.layoutState));
            }
            return;
        }
        layoutNode.layoutState = LayoutState.Ready;
        if (i2 == 1) {
            layoutNode.requestRemeasure$ui_release();
        } else {
            layoutNode.requestRelayout$ui_release();
        }
    }

    public final DelegatingLayoutNodeWrapper<?> reuseLayoutNodeWrapper(Modifier.Element element, LayoutNodeWrapper layoutNodeWrapper) {
        int i2;
        if (this.wrapperCache.isEmpty()) {
            return null;
        }
        MutableVector<DelegatingLayoutNodeWrapper<?>> mutableVector = this.wrapperCache;
        int size = mutableVector.getSize();
        int i3 = -1;
        if (size > 0) {
            i2 = size - 1;
            DelegatingLayoutNodeWrapper<?>[] content = mutableVector.getContent();
            do {
                DelegatingLayoutNodeWrapper<?> delegatingLayoutNodeWrapper = content[i2];
                if (delegatingLayoutNodeWrapper.getToBeReusedForSameModifier() && delegatingLayoutNodeWrapper.getModifier() == element) {
                    break;
                }
                i2--;
            } while (i2 >= 0);
            i2 = -1;
        } else {
            i2 = -1;
        }
        if (i2 < 0) {
            MutableVector<DelegatingLayoutNodeWrapper<?>> mutableVector2 = this.wrapperCache;
            int size2 = mutableVector2.getSize();
            if (size2 > 0) {
                int i4 = size2 - 1;
                DelegatingLayoutNodeWrapper<?>[] content2 = mutableVector2.getContent();
                while (true) {
                    DelegatingLayoutNodeWrapper<?> delegatingLayoutNodeWrapper2 = content2[i4];
                    if (!(!delegatingLayoutNodeWrapper2.getToBeReusedForSameModifier() && Intrinsics.areEqual(JvmActuals_jvmKt.nativeClass(delegatingLayoutNodeWrapper2.getModifier()), JvmActuals_jvmKt.nativeClass(element)))) {
                        i4--;
                        if (i4 < 0) {
                            break;
                        }
                    } else {
                        i3 = i4;
                        break;
                    }
                }
            }
            i2 = i3;
        }
        if (i2 < 0) {
            return null;
        }
        int i5 = i2 - 1;
        DelegatingLayoutNodeWrapper<?> removeAt = this.wrapperCache.removeAt(i2);
        removeAt.setWrapped(layoutNodeWrapper);
        removeAt.setModifierTo(element);
        removeAt.onInitialize();
        while (removeAt.isChained()) {
            DelegatingLayoutNodeWrapper<?> removeAt2 = this.wrapperCache.removeAt(i5);
            removeAt2.setModifierTo(element);
            removeAt2.onInitialize();
            i5--;
            removeAt = removeAt2;
        }
        return removeAt;
    }

    private final boolean shouldInvalidateParentLayer() {
        LayoutNodeWrapper wrapped$ui_release = getInnerLayoutNodeWrapper$ui_release().getWrapped$ui_release();
        for (LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = getOuterLayoutNodeWrapper$ui_release(); !Intrinsics.areEqual(outerLayoutNodeWrapper$ui_release, wrapped$ui_release) && outerLayoutNodeWrapper$ui_release != null; outerLayoutNodeWrapper$ui_release = outerLayoutNodeWrapper$ui_release.getWrapped$ui_release()) {
            if (outerLayoutNodeWrapper$ui_release.getLayer() != null) {
                return false;
            }
            if (outerLayoutNodeWrapper$ui_release.getDrawEntityHead() != null) {
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00c4 A[LOOP:1: B:111:0x00be->B:113:0x00c4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attach$ui_release(@org.jetbrains.annotations.NotNull androidx.compose.ui.node.Owner r7) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNode.attach$ui_release(androidx.compose.ui.node.Owner):void");
    }

    @NotNull
    public final Map<AlignmentLine, Integer> calculateAlignmentLines$ui_release() {
        if (!this.outerMeasurablePlaceable.getDuringAlignmentLinesQuery$ui_release()) {
            alignmentLinesQueriedByModifier();
        }
        layoutChildren$ui_release();
        return this.alignmentLines.getLastCalculation();
    }

    public final void detach$ui_release() {
        Owner owner = this.owner;
        if (owner == null) {
            LayoutNode parent$ui_release = getParent$ui_release();
            throw new IllegalStateException(Intrinsics.stringPlus("Cannot detach node that is already detached!  Tree: ", parent$ui_release != null ? debugTreeToString$default(parent$ui_release, 0, 1, null) : null).toString());
        }
        LayoutNode parent$ui_release2 = getParent$ui_release();
        if (parent$ui_release2 != null) {
            parent$ui_release2.invalidateLayer$ui_release();
            parent$ui_release2.requestRemeasure$ui_release();
        }
        this.alignmentLines.reset$ui_release();
        Function1<? super Owner, Unit> function1 = this.onDetach;
        if (function1 != null) {
            function1.invoke(owner);
        }
        LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = getOuterLayoutNodeWrapper$ui_release();
        LayoutNodeWrapper innerLayoutNodeWrapper$ui_release = getInnerLayoutNodeWrapper$ui_release();
        while (!Intrinsics.areEqual(outerLayoutNodeWrapper$ui_release, innerLayoutNodeWrapper$ui_release)) {
            outerLayoutNodeWrapper$ui_release.detach();
            outerLayoutNodeWrapper$ui_release = outerLayoutNodeWrapper$ui_release.getWrapped$ui_release();
            Intrinsics.checkNotNull(outerLayoutNodeWrapper$ui_release);
        }
        this.innerLayoutNodeWrapper.detach();
        if (SemanticsNodeKt.getOuterSemantics(this) != null) {
            owner.onSemanticsChange();
        }
        owner.onDetach(this);
        this.owner = null;
        this.depth = 0;
        MutableVector<LayoutNode> mutableVector = this._foldedChildren;
        int size = mutableVector.getSize();
        if (size <= 0) {
            this.placeOrder = Integer.MAX_VALUE;
            this.previousPlaceOrder = Integer.MAX_VALUE;
            this.isPlaced = false;
        }
        LayoutNode[] content = mutableVector.getContent();
        int i2 = 0;
        do {
            content[i2].detach$ui_release();
            i2++;
        } while (i2 < size);
        this.placeOrder = Integer.MAX_VALUE;
        this.previousPlaceOrder = Integer.MAX_VALUE;
        this.isPlaced = false;
    }

    public final void dispatchOnPositionedCallbacks$ui_release() {
        MutableVector<OnGloballyPositionedModifierWrapper> mutableVector;
        int size;
        if (this.layoutState == LayoutState.Ready && isPlaced() && (mutableVector = this.onPositionedCallbacks) != null && (size = mutableVector.getSize()) > 0) {
            int i2 = 0;
            OnGloballyPositionedModifierWrapper[] content = mutableVector.getContent();
            do {
                OnGloballyPositionedModifierWrapper onGloballyPositionedModifierWrapper = content[i2];
                onGloballyPositionedModifierWrapper.getModifier().onGloballyPositioned(onGloballyPositionedModifierWrapper);
                i2++;
            } while (i2 < size);
        }
    }

    public final void draw$ui_release(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        getOuterLayoutNodeWrapper$ui_release().draw(canvas);
    }

    @Override // androidx.compose.ui.layout.Remeasurement
    public void forceRemeasure() {
        requestRemeasure$ui_release();
        Owner owner = this.owner;
        if (owner == null) {
            return;
        }
        Owner.DefaultImpls.measureAndLayout$default(owner, false, 1, null);
    }

    @NotNull
    public final LayoutNodeAlignmentLines getAlignmentLines$ui_release() {
        return this.alignmentLines;
    }

    public final boolean getCanMultiMeasure$ui_release() {
        return this.canMultiMeasure;
    }

    @NotNull
    public final List<LayoutNode> getChildren$ui_release() {
        return get_children$ui_release().asMutableList();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    @NotNull
    public LayoutCoordinates getCoordinates() {
        return this.innerLayoutNodeWrapper;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo, androidx.compose.ui.node.ComposeUiNode
    @NotNull
    public Density getDensity() {
        return this.density;
    }

    public final int getDepth$ui_release() {
        return this.depth;
    }

    @NotNull
    public final List<LayoutNode> getFoldedChildren$ui_release() {
        return this._foldedChildren.asMutableList();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public int getHeight() {
        return this.outerMeasurablePlaceable.getHeight();
    }

    public final boolean getInnerLayerWrapperIsDirty$ui_release() {
        return this.innerLayerWrapperIsDirty;
    }

    @NotNull
    public final LayoutNodeWrapper getInnerLayoutNodeWrapper$ui_release() {
        return this.innerLayoutNodeWrapper;
    }

    @NotNull
    public final IntrinsicsPolicy getIntrinsicsPolicy$ui_release() {
        return this.intrinsicsPolicy;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo, androidx.compose.ui.node.ComposeUiNode
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    @NotNull
    public final LayoutState getLayoutState$ui_release() {
        return this.layoutState;
    }

    @NotNull
    public final LayoutNodeDrawScope getMDrawScope$ui_release() {
        return LayoutNodeKt.requireOwner(this).getSharedDrawScope();
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    @NotNull
    public MeasurePolicy getMeasurePolicy() {
        return this.measurePolicy;
    }

    @NotNull
    public final MeasureScope getMeasureScope$ui_release() {
        return this.measureScope;
    }

    @NotNull
    public final UsageByParent getMeasuredByParent$ui_release() {
        return this.measuredByParent;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    @NotNull
    public Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    @NotNull
    public List<ModifierInfo> getModifierInfo() {
        MutableVector mutableVector = new MutableVector(new ModifierInfo[16], 0);
        LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = getOuterLayoutNodeWrapper$ui_release();
        LayoutNodeWrapper innerLayoutNodeWrapper$ui_release = getInnerLayoutNodeWrapper$ui_release();
        while (!Intrinsics.areEqual(outerLayoutNodeWrapper$ui_release, innerLayoutNodeWrapper$ui_release)) {
            DelegatingLayoutNodeWrapper delegatingLayoutNodeWrapper = (DelegatingLayoutNodeWrapper) outerLayoutNodeWrapper$ui_release;
            OwnedLayer layer = outerLayoutNodeWrapper$ui_release.getLayer();
            mutableVector.add(new ModifierInfo(((DelegatingLayoutNodeWrapper) outerLayoutNodeWrapper$ui_release).getModifier(), outerLayoutNodeWrapper$ui_release, layer));
            for (DrawEntity drawEntityHead = outerLayoutNodeWrapper$ui_release.getDrawEntityHead(); drawEntityHead != null; drawEntityHead = drawEntityHead.getNext()) {
                mutableVector.add(new ModifierInfo(drawEntityHead.getModifier(), outerLayoutNodeWrapper$ui_release, layer));
            }
            outerLayoutNodeWrapper$ui_release = outerLayoutNodeWrapper$ui_release.getWrapped$ui_release();
            Intrinsics.checkNotNull(outerLayoutNodeWrapper$ui_release);
        }
        for (DrawEntity drawEntityHead2 = this.innerLayoutNodeWrapper.getDrawEntityHead(); drawEntityHead2 != null; drawEntityHead2 = drawEntityHead2.getNext()) {
            DrawModifier modifier = drawEntityHead2.getModifier();
            LayoutNodeWrapper layoutNodeWrapper = this.innerLayoutNodeWrapper;
            mutableVector.add(new ModifierInfo(modifier, layoutNodeWrapper, layoutNodeWrapper.getLayer()));
        }
        return mutableVector.asMutableList();
    }

    public final boolean getNeedsOnPositionedDispatch$ui_release() {
        return this.needsOnPositionedDispatch;
    }

    @Nullable
    public final Function1<Owner, Unit> getOnAttach$ui_release() {
        return this.onAttach;
    }

    @Nullable
    public final Function1<Owner, Unit> getOnDetach$ui_release() {
        return this.onDetach;
    }

    @NotNull
    public final MutableVector<OnGloballyPositionedModifierWrapper> getOrCreateOnPositionedCallbacks$ui_release() {
        MutableVector<OnGloballyPositionedModifierWrapper> mutableVector = this.onPositionedCallbacks;
        if (mutableVector == null) {
            MutableVector<OnGloballyPositionedModifierWrapper> mutableVector2 = new MutableVector<>(new OnGloballyPositionedModifierWrapper[16], 0);
            this.onPositionedCallbacks = mutableVector2;
            return mutableVector2;
        }
        return mutableVector;
    }

    @NotNull
    public final LayoutNodeWrapper getOuterLayoutNodeWrapper$ui_release() {
        return this.outerMeasurablePlaceable.getOuterWrapper();
    }

    @Nullable
    public final Owner getOwner$ui_release() {
        return this.owner;
    }

    @Nullable
    public final LayoutNode getParent$ui_release() {
        LayoutNode layoutNode = this._foldedParent;
        boolean z = false;
        if (layoutNode != null && layoutNode.isVirtual) {
            z = true;
        }
        if (z) {
            if (layoutNode == null) {
                return null;
            }
            return layoutNode.getParent$ui_release();
        }
        return layoutNode;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    @Nullable
    public Object getParentData() {
        return this.outerMeasurablePlaceable.getParentData();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    @Nullable
    public LayoutInfo getParentInfo() {
        return getParent$ui_release();
    }

    public final int getPlaceOrder$ui_release() {
        return this.placeOrder;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo, androidx.compose.ui.node.ComposeUiNode
    @NotNull
    public ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public int getWidth() {
        return this.outerMeasurablePlaceable.getWidth();
    }

    @NotNull
    public final MutableVector<LayoutNode> getZSortedChildren() {
        if (this.zSortedChildrenInvalidated) {
            this._zSortedChildren.clear();
            MutableVector<LayoutNode> mutableVector = this._zSortedChildren;
            mutableVector.addAll(mutableVector.getSize(), get_children$ui_release());
            this._zSortedChildren.sortWith(this.ZComparator);
            this.zSortedChildrenInvalidated = false;
        }
        return this._zSortedChildren;
    }

    @NotNull
    public final MutableVector<LayoutNode> get_children$ui_release() {
        if (this.virtualChildrenCount == 0) {
            return this._foldedChildren;
        }
        recreateUnfoldedChildrenIfDirty();
        MutableVector<LayoutNode> mutableVector = this._unfoldedChildren;
        Intrinsics.checkNotNull(mutableVector);
        return mutableVector;
    }

    public final void handleMeasureResult$ui_release(@NotNull MeasureResult measureResult) {
        Intrinsics.checkNotNullParameter(measureResult, "measureResult");
        this.innerLayoutNodeWrapper.setMeasureResult$ui_release(measureResult);
    }

    /* renamed from: hitTest-M_7yMNQ$ui_release */
    public final void m2869hitTestM_7yMNQ$ui_release(long j2, @NotNull HitTestResult<PointerInputFilter> hitTestResult, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
        getOuterLayoutNodeWrapper$ui_release().mo2849hitTestM_7yMNQ(getOuterLayoutNodeWrapper$ui_release().m2880fromParentPositionMKHz9U(j2), hitTestResult, z, z2);
    }

    /* renamed from: hitTestSemantics-M_7yMNQ$ui_release */
    public final void m2870hitTestSemanticsM_7yMNQ$ui_release(long j2, @NotNull HitTestResult<SemanticsWrapper> hitSemanticsWrappers, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(hitSemanticsWrappers, "hitSemanticsWrappers");
        getOuterLayoutNodeWrapper$ui_release().mo2851hitTestSemantics9KIMszo(getOuterLayoutNodeWrapper$ui_release().m2880fromParentPositionMKHz9U(j2), hitSemanticsWrappers, z2);
    }

    public final void ignoreRemeasureRequests$ui_release(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.ignoreRemeasureRequests = true;
        block.invoke();
        this.ignoreRemeasureRequests = false;
    }

    public final void insertAt$ui_release(int i2, @NotNull LayoutNode instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (!(instance._foldedParent == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot insert ");
            sb.append(instance);
            sb.append(" because it already has a parent. This tree: ");
            sb.append(debugTreeToString$default(this, 0, 1, null));
            sb.append(" Other tree: ");
            LayoutNode layoutNode = instance._foldedParent;
            sb.append((Object) (layoutNode != null ? debugTreeToString$default(layoutNode, 0, 1, null) : null));
            throw new IllegalStateException(sb.toString().toString());
        }
        if (!(instance.owner == null)) {
            throw new IllegalStateException(("Cannot insert " + instance + " because it already has an owner. This tree: " + debugTreeToString$default(this, 0, 1, null) + " Other tree: " + debugTreeToString$default(instance, 0, 1, null)).toString());
        }
        instance._foldedParent = this;
        this._foldedChildren.add(i2, instance);
        onZSortedChildrenInvalidated();
        if (instance.isVirtual) {
            if (!(!this.isVirtual)) {
                throw new IllegalArgumentException("Virtual LayoutNode can't be added into a virtual parent".toString());
            }
            this.virtualChildrenCount++;
        }
        invalidateUnfoldedVirtualChildren();
        instance.getOuterLayoutNodeWrapper$ui_release().setWrappedBy$ui_release(this.innerLayoutNodeWrapper);
        Owner owner = this.owner;
        if (owner != null) {
            instance.attach$ui_release(owner);
        }
    }

    public final void invalidateLayer$ui_release() {
        LayoutNodeWrapper innerLayerWrapper = getInnerLayerWrapper();
        if (innerLayerWrapper != null) {
            innerLayerWrapper.invalidateLayer();
            return;
        }
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release == null) {
            return;
        }
        parent$ui_release.invalidateLayer$ui_release();
    }

    public final void invalidateLayers$ui_release() {
        LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = getOuterLayoutNodeWrapper$ui_release();
        LayoutNodeWrapper innerLayoutNodeWrapper$ui_release = getInnerLayoutNodeWrapper$ui_release();
        while (!Intrinsics.areEqual(outerLayoutNodeWrapper$ui_release, innerLayoutNodeWrapper$ui_release)) {
            OwnedLayer layer = outerLayoutNodeWrapper$ui_release.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
            outerLayoutNodeWrapper$ui_release = outerLayoutNodeWrapper$ui_release.getWrapped$ui_release();
            Intrinsics.checkNotNull(outerLayoutNodeWrapper$ui_release);
        }
        OwnedLayer layer2 = this.innerLayoutNodeWrapper.getLayer();
        if (layer2 == null) {
            return;
        }
        layer2.invalidate();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public boolean isAttached() {
        return this.owner != null;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public boolean isPlaced() {
        return this.isPlaced;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValid() {
        return isAttached();
    }

    public final void layoutChildren$ui_release() {
        this.alignmentLines.recalculateQueryOwner$ui_release();
        LayoutState layoutState = this.layoutState;
        LayoutState layoutState2 = LayoutState.NeedsRelayout;
        if (layoutState == layoutState2) {
            onBeforeLayoutChildren();
        }
        if (this.layoutState == layoutState2) {
            this.layoutState = LayoutState.LayingOut;
            LayoutNodeKt.requireOwner(this).getSnapshotObserver().observeLayoutSnapshotReads$ui_release(this, new LayoutNode$layoutChildren$1(this));
            this.layoutState = LayoutState.Ready;
        }
        if (this.alignmentLines.getUsedDuringParentLayout$ui_release()) {
            this.alignmentLines.setPreviousUsedDuringParentLayout$ui_release(true);
        }
        if (this.alignmentLines.getDirty$ui_release() && this.alignmentLines.getRequired$ui_release()) {
            this.alignmentLines.recalculate();
        }
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int i2) {
        return this.outerMeasurablePlaceable.maxIntrinsicHeight(i2);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int i2) {
        return this.outerMeasurablePlaceable.maxIntrinsicWidth(i2);
    }

    @Override // androidx.compose.ui.layout.Measurable
    @NotNull
    /* renamed from: measure-BRTryo0 */
    public Placeable mo2758measureBRTryo0(long j2) {
        return this.outerMeasurablePlaceable.mo2758measureBRTryo0(j2);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int i2) {
        return this.outerMeasurablePlaceable.minIntrinsicHeight(i2);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int i2) {
        return this.outerMeasurablePlaceable.minIntrinsicWidth(i2);
    }

    public final void move$ui_release(int i2, int i3, int i4) {
        if (i2 == i3) {
            return;
        }
        int i5 = 0;
        while (i5 < i4) {
            int i6 = i5 + 1;
            int i7 = i2 > i3 ? i2 + i5 : i2;
            this._foldedChildren.add(i2 > i3 ? i5 + i3 : (i3 + i4) - 2, this._foldedChildren.removeAt(i7));
            i5 = i6;
        }
        onZSortedChildrenInvalidated();
        invalidateUnfoldedVirtualChildren();
        requestRemeasure$ui_release();
    }

    public final void onAlignmentsChanged$ui_release() {
        if (this.alignmentLines.getDirty$ui_release()) {
            return;
        }
        this.alignmentLines.setDirty$ui_release(true);
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release == null) {
            return;
        }
        if (this.alignmentLines.getUsedDuringParentMeasurement$ui_release()) {
            parent$ui_release.requestRemeasure$ui_release();
        } else if (this.alignmentLines.getPreviousUsedDuringParentLayout$ui_release()) {
            parent$ui_release.requestRelayout$ui_release();
        }
        if (this.alignmentLines.getUsedByModifierMeasurement$ui_release()) {
            requestRemeasure$ui_release();
        }
        if (this.alignmentLines.getUsedByModifierLayout$ui_release()) {
            parent$ui_release.requestRelayout$ui_release();
        }
        parent$ui_release.onAlignmentsChanged$ui_release();
    }

    public final void onNodePlaced$ui_release() {
        LayoutNode parent$ui_release = getParent$ui_release();
        float zIndex = this.innerLayoutNodeWrapper.getZIndex();
        LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = getOuterLayoutNodeWrapper$ui_release();
        LayoutNodeWrapper innerLayoutNodeWrapper$ui_release = getInnerLayoutNodeWrapper$ui_release();
        while (!Intrinsics.areEqual(outerLayoutNodeWrapper$ui_release, innerLayoutNodeWrapper$ui_release)) {
            zIndex += outerLayoutNodeWrapper$ui_release.getZIndex();
            outerLayoutNodeWrapper$ui_release = outerLayoutNodeWrapper$ui_release.getWrapped$ui_release();
            Intrinsics.checkNotNull(outerLayoutNodeWrapper$ui_release);
        }
        if (!(zIndex == this.zIndex)) {
            this.zIndex = zIndex;
            if (parent$ui_release != null) {
                parent$ui_release.onZSortedChildrenInvalidated();
            }
            if (parent$ui_release != null) {
                parent$ui_release.invalidateLayer$ui_release();
            }
        }
        if (!isPlaced()) {
            if (parent$ui_release != null) {
                parent$ui_release.invalidateLayer$ui_release();
            }
            markNodeAndSubtreeAsPlaced();
        }
        if (parent$ui_release == null) {
            this.placeOrder = 0;
        } else if (!this.relayoutWithoutParentInProgress && parent$ui_release.layoutState == LayoutState.LayingOut) {
            if (!(this.placeOrder == Integer.MAX_VALUE)) {
                throw new IllegalStateException("Place was called on a node which was placed already".toString());
            }
            int i2 = parent$ui_release.nextChildPlaceOrder;
            this.placeOrder = i2;
            parent$ui_release.nextChildPlaceOrder = i2 + 1;
        }
        layoutChildren$ui_release();
    }

    public final void place$ui_release(int i2, int i3) {
        Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.Companion;
        int measuredWidth = this.outerMeasurablePlaceable.getMeasuredWidth();
        LayoutDirection layoutDirection = getLayoutDirection();
        int parentWidth = companion.getParentWidth();
        LayoutDirection parentLayoutDirection = companion.getParentLayoutDirection();
        Placeable.PlacementScope.parentWidth = measuredWidth;
        Placeable.PlacementScope.parentLayoutDirection = layoutDirection;
        Placeable.PlacementScope.placeRelative$default(companion, this.outerMeasurablePlaceable, i2, i3, 0.0f, 4, null);
        Placeable.PlacementScope.parentWidth = parentWidth;
        Placeable.PlacementScope.parentLayoutDirection = parentLayoutDirection;
    }

    /* renamed from: remeasure-_Sx5XlM$ui_release */
    public final boolean m2871remeasure_Sx5XlM$ui_release(@Nullable Constraints constraints) {
        if (constraints != null) {
            return this.outerMeasurablePlaceable.m2893remeasureBRTryo0(constraints.m3299unboximpl());
        }
        return false;
    }

    public final void removeAll$ui_release() {
        boolean z = this.owner != null;
        int size = this._foldedChildren.getSize() - 1;
        if (size >= 0) {
            while (true) {
                int i2 = size - 1;
                LayoutNode layoutNode = this._foldedChildren.getContent()[size];
                if (z) {
                    layoutNode.detach$ui_release();
                }
                layoutNode._foldedParent = null;
                if (i2 < 0) {
                    break;
                }
                size = i2;
            }
        }
        this._foldedChildren.clear();
        onZSortedChildrenInvalidated();
        this.virtualChildrenCount = 0;
        invalidateUnfoldedVirtualChildren();
    }

    public final void removeAt$ui_release(int i2, int i3) {
        if (!(i3 >= 0)) {
            throw new IllegalArgumentException(("count (" + i3 + ") must be greater than 0").toString());
        }
        boolean z = this.owner != null;
        int i4 = (i3 + i2) - 1;
        if (i2 > i4) {
            return;
        }
        while (true) {
            int i5 = i4 - 1;
            LayoutNode removeAt = this._foldedChildren.removeAt(i4);
            onZSortedChildrenInvalidated();
            if (z) {
                removeAt.detach$ui_release();
            }
            removeAt._foldedParent = null;
            if (removeAt.isVirtual) {
                this.virtualChildrenCount--;
            }
            invalidateUnfoldedVirtualChildren();
            if (i4 == i2) {
                return;
            }
            i4 = i5;
        }
    }

    public final void replace$ui_release() {
        try {
            this.relayoutWithoutParentInProgress = true;
            this.outerMeasurablePlaceable.replace();
        } finally {
            this.relayoutWithoutParentInProgress = false;
        }
    }

    public final void requestRelayout$ui_release() {
        Owner owner;
        if (this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        owner.onRequestRelayout(this);
    }

    public final void requestRemeasure$ui_release() {
        Owner owner = this.owner;
        if (owner == null || this.ignoreRemeasureRequests || this.isVirtual) {
            return;
        }
        owner.onRequestMeasure(this);
    }

    public final void setCanMultiMeasure$ui_release(boolean z) {
        this.canMultiMeasure = z;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setDensity(@NotNull Density value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(this.density, value)) {
            return;
        }
        this.density = value;
        onDensityOrLayoutDirectionChanged();
    }

    public final void setDepth$ui_release(int i2) {
        this.depth = i2;
    }

    public final void setInnerLayerWrapperIsDirty$ui_release(boolean z) {
        this.innerLayerWrapperIsDirty = z;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setLayoutDirection(@NotNull LayoutDirection value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.layoutDirection != value) {
            this.layoutDirection = value;
            onDensityOrLayoutDirectionChanged();
        }
    }

    public final void setLayoutState$ui_release(@NotNull LayoutState layoutState) {
        Intrinsics.checkNotNullParameter(layoutState, "<set-?>");
        this.layoutState = layoutState;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setMeasurePolicy(@NotNull MeasurePolicy value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(this.measurePolicy, value)) {
            return;
        }
        this.measurePolicy = value;
        this.intrinsicsPolicy.updateFrom(getMeasurePolicy());
        requestRemeasure$ui_release();
    }

    public final void setMeasuredByParent$ui_release(@NotNull UsageByParent usageByParent) {
        Intrinsics.checkNotNullParameter(usageByParent, "<set-?>");
        this.measuredByParent = usageByParent;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x00b3  */
    @Override // androidx.compose.ui.node.ComposeUiNode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setModifier(@org.jetbrains.annotations.NotNull androidx.compose.ui.Modifier r8) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNode.setModifier(androidx.compose.ui.Modifier):void");
    }

    public final void setNeedsOnPositionedDispatch$ui_release(boolean z) {
        this.needsOnPositionedDispatch = z;
    }

    public final void setOnAttach$ui_release(@Nullable Function1<? super Owner, Unit> function1) {
        this.onAttach = function1;
    }

    public final void setOnDetach$ui_release(@Nullable Function1<? super Owner, Unit> function1) {
        this.onDetach = function1;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setViewConfiguration(@NotNull ViewConfiguration viewConfiguration) {
        Intrinsics.checkNotNullParameter(viewConfiguration, "<set-?>");
        this.viewConfiguration = viewConfiguration;
    }

    @NotNull
    public String toString() {
        return JvmActuals_jvmKt.simpleIdentityToString(this, null) + " children: " + getChildren$ui_release().size() + " measurePolicy: " + getMeasurePolicy();
    }

    public final void withNoSnapshotReadObservation$ui_release(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        LayoutNodeKt.requireOwner(this).getSnapshotObserver().withNoSnapshotReadObservation$ui_release(block);
    }
}
