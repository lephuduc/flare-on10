package androidx.compose.ui.node;

import androidx.appcompat.R;
import androidx.compose.ui.focus.FocusNodeUtilsKt;
import androidx.compose.ui.focus.FocusOrder;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.MutableRectKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollDelegatingWrapper;
import androidx.compose.ui.input.pointer.PointerInputFilter;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import androidx.compose.ui.modifier.ModifierLocal;
import androidx.compose.ui.semantics.SemanticsWrapper;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b \u0018\u0000 ë\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005:\u0002ë\u0001B\r\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ \u0010k\u001a\u00020\u00072\u0006\u0010l\u001a\u00020\u00002\u0006\u0010m\u001a\u00020\u00102\u0006\u0010n\u001a\u00020\fH\u0002J%\u0010k\u001a\u00020o2\u0006\u0010l\u001a\u00020\u00002\u0006\u0010p\u001a\u00020oH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bq\u0010rJ\b\u0010s\u001a\u00020\u0007H\u0016J\u0010\u0010t\u001a\u00020G2\u0006\u0010u\u001a\u00020FH&J\u001d\u0010v\u001a\u00020A2\u0006\u0010@\u001a\u00020AH\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bw\u0010xJ\b\u0010y\u001a\u00020\u0007H\u0016J%\u0010z\u001a\u00020#2\u0006\u0010{\u001a\u00020o2\u0006\u0010@\u001a\u00020AH\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b|\u0010}J\u000e\u0010~\u001a\u00020\u00072\u0006\u0010\u007f\u001a\u00020\u0006J\u001b\u0010\u0080\u0001\u001a\u00020\u00072\u0006\u0010\u007f\u001a\u00020\u00062\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001H\u0004J\u0011\u0010\u0083\u0001\u001a\u00020\u00072\u0006\u0010\u007f\u001a\u00020\u0006H\u0002J\u0018\u0010\u0084\u0001\u001a\u00020\u00002\u0007\u0010\u0085\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0003\b\u0086\u0001J\f\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0088\u0001H&J\f\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u008a\u0001H&J\u0015\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u0088\u00012\u0007\u0010\u008c\u0001\u001a\u00020\fH&J\f\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008a\u0001H&J\f\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008f\u0001H&J\u0012\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0088\u0001H\u0000¢\u0006\u0003\b\u0091\u0001J\u0012\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u008a\u0001H\u0000¢\u0006\u0003\b\u0093\u0001J\f\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0088\u0001H&J\f\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u008a\u0001H&J\f\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u008f\u0001H&J\u0018\u0010\u0097\u0001\u001a\n\u0012\u0005\u0012\u00030\u0088\u00010\u0098\u00012\u0007\u0010\u008c\u0001\u001a\u00020\fJ\u001f\u0010\u0099\u0001\u001a\u00020o2\u0006\u0010N\u001a\u00020oH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u009a\u0001\u0010xJ\u001a\u0010\u009b\u0001\u001a\u00020\u00072\u0007\u0010\u009c\u0001\u001a\u00020\u00102\u0006\u0010n\u001a\u00020\fH\u0002J\u0012\u0010\u009d\u0001\u001a\u00020G2\u0006\u0010u\u001a\u00020FH\u0086\u0002J\u000b\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0003H\u0014JC\u0010\u009f\u0001\u001a\u00020\u00072\u0006\u0010{\u001a\u00020o2\u000f\u0010 \u0001\u001a\n\u0012\u0005\u0012\u00030¢\u00010¡\u00012\u0007\u0010£\u0001\u001a\u00020\f2\u0007\u0010¤\u0001\u001a\u00020\fH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b¥\u0001\u0010¦\u0001J:\u0010§\u0001\u001a\u00020\u00072\u0006\u0010{\u001a\u00020o2\u000f\u0010¨\u0001\u001a\n\u0012\u0005\u0012\u00030©\u00010¡\u00012\u0007\u0010¤\u0001\u001a\u00020\fH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\bª\u0001\u0010«\u0001J\t\u0010¬\u0001\u001a\u00020\u0007H\u0016J\u0012\u0010\u00ad\u0001\u001a\u00020\u00072\u0006\u0010\u007f\u001a\u00020\u0006H\u0096\u0002J \u0010®\u0001\u001a\u00020\f2\u0006\u0010{\u001a\u00020oH\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b¯\u0001\u0010°\u0001J\u0007\u0010±\u0001\u001a\u00020\fJ\u001b\u0010²\u0001\u001a\u00030³\u00012\u0007\u0010´\u0001\u001a\u00020\u00032\u0006\u0010n\u001a\u00020\fH\u0016J*\u0010µ\u0001\u001a\u00020o2\u0007\u0010´\u0001\u001a\u00020\u00032\u0007\u0010¶\u0001\u001a\u00020oH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b·\u0001\u0010¸\u0001J \u0010¹\u0001\u001a\u00020o2\u0007\u0010º\u0001\u001a\u00020oH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b»\u0001\u0010xJ \u0010¼\u0001\u001a\u00020o2\u0007\u0010º\u0001\u001a\u00020oH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b½\u0001\u0010xJ\u001f\u0010¾\u0001\u001a\u00020o2\u0006\u0010{\u001a\u00020oH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b¿\u0001\u0010xJ\t\u0010À\u0001\u001a\u00020\u0007H\u0016J\"\u0010Á\u0001\u001a\u00020\u00072\u0019\u0010-\u001a\u0015\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b,J\u001b\u0010Â\u0001\u001a\u00020\u00072\u0007\u0010Ã\u0001\u001a\u00020G2\u0007\u0010Ä\u0001\u001a\u00020GH\u0014J\t\u0010Å\u0001\u001a\u00020\u0007H\u0016J(\u0010Æ\u0001\u001a\u0003HÇ\u0001\"\u0005\b\u0000\u0010Ç\u00012\u000f\u0010È\u0001\u001a\n\u0012\u0005\u0012\u0003HÇ\u00010É\u0001H\u0016¢\u0006\u0003\u0010Ê\u0001J\t\u0010Ë\u0001\u001a\u00020\u0007H\u0016J\u0011\u0010Ì\u0001\u001a\u00020\u00072\u0006\u0010\u007f\u001a\u00020\u0006H\u0016J5\u0010Í\u0001\u001a\u00020\u00012\b\u0010Î\u0001\u001a\u00030Ï\u00012\r\u0010Ð\u0001\u001a\b\u0012\u0004\u0012\u00020\u00010\u001bH\u0084\bø\u0001\u0000ø\u0001\u0003ø\u0001\u0001¢\u0006\u0006\bÑ\u0001\u0010Ò\u0001JC\u0010Ó\u0001\u001a\u00020\u00072\u0006\u0010N\u001a\u00020M2\u0006\u0010f\u001a\u00020#2\u0019\u0010-\u001a\u0015\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b,H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\bÔ\u0001\u0010Õ\u0001J\u0013\u0010Ö\u0001\u001a\u00020\u00072\b\u0010×\u0001\u001a\u00030Ø\u0001H\u0016J\u0013\u0010Ù\u0001\u001a\u00020\u00072\b\u0010Ú\u0001\u001a\u00030Û\u0001H\u0016J\u001c\u0010Ü\u0001\u001a\u00020\u00072\u0007\u0010m\u001a\u00030³\u0001H\u0096@ø\u0001\u0000¢\u0006\u0003\u0010Ý\u0001J+\u0010Þ\u0001\u001a\u00020\u00072\u0007\u0010\u009c\u0001\u001a\u00020\u00102\u0006\u0010n\u001a\u00020\f2\t\b\u0002\u0010ß\u0001\u001a\u00020\fH\u0000¢\u0006\u0003\bà\u0001J\t\u0010á\u0001\u001a\u00020\fH\u0016J\u001f\u0010â\u0001\u001a\u00020o2\u0006\u0010N\u001a\u00020oH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\bã\u0001\u0010xJ\t\u0010ä\u0001\u001a\u00020\u0007H\u0002J \u0010å\u0001\u001a\u00020o2\u0007\u0010æ\u0001\u001a\u00020oH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\bç\u0001\u0010xJ*\u0010è\u0001\u001a\u00020\u00072\u0006\u0010\u007f\u001a\u00020\u00062\u0013\u0010Ð\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0084\bø\u0001\u0003J \u0010é\u0001\u001a\u00020\f2\u0006\u0010{\u001a\u00020oH\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\bê\u0001\u0010°\u0001R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001c\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0019R\u000e\u0010\u001d\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0019R\u000e\u0010\"\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\"\u0010(\u001a\u0004\u0018\u00010'2\b\u0010$\u001a\u0004\u0018\u00010'@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*RD\u0010-\u001a\u0015\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b,2\u0019\u0010$\u001a\u0015\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b,@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u000e\u00100\u001a\u000201X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R$\u00107\u001a\u00020\u000e2\u0006\u00106\u001a\u00020\u000e8F@@X\u0086\u000e¢\u0006\f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0012\u0010<\u001a\u00020=X¦\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u001a\u0010@\u001a\u00020A8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bB\u0010CR\u001c\u0010D\u001a\u0010\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020G\u0018\u00010EX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010H\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0013\u0010K\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\bL\u0010JR)\u0010N\u001a\u00020M2\u0006\u0010$\u001a\u00020M@BX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010P\u001a\u0004\bO\u0010CR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020F0R8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0014\u0010U\u001a\u00020\u00108DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bV\u0010WR\u001a\u0010X\u001a\u00020Y8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bZ\u0010CR\u0014\u0010[\u001a\u00020\\8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0016\u0010_\u001a\u0004\u0018\u00010\u00008PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u001c\u0010b\u001a\u0004\u0018\u00010\u0000X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010a\"\u0004\bd\u0010eR$\u0010f\u001a\u00020#2\u0006\u0010$\u001a\u00020#@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010h\"\u0004\bi\u0010j\u0082\u0002\u0016\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0005\b\u009920\u0001¨\u0006ì\u0001"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeWrapper;", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/node/OwnerScope;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "_isAttached", "", "_measureResult", "Landroidx/compose/ui/layout/MeasureResult;", "_rectCache", "Landroidx/compose/ui/geometry/MutableRect;", "drawEntityHead", "Landroidx/compose/ui/node/DrawEntity;", "getDrawEntityHead", "()Landroidx/compose/ui/node/DrawEntity;", "setDrawEntityHead", "(Landroidx/compose/ui/node/DrawEntity;)V", "hasMeasureResult", "getHasMeasureResult", "()Z", "invalidateParentLayer", "Lkotlin/Function0;", "isAttached", "isClipping", "isShallowPlacing", "setShallowPlacing", "(Z)V", "isValid", "lastLayerAlpha", "", "<set-?>", "lastLayerDrawingWasSkipped", "getLastLayerDrawingWasSkipped$ui_release", "Landroidx/compose/ui/node/OwnedLayer;", "layer", "getLayer", "()Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "getLayerBlock", "()Lkotlin/jvm/functions/Function1;", "layerDensity", "Landroidx/compose/ui/unit/Density;", "layerLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutNode$ui_release", "()Landroidx/compose/ui/node/LayoutNode;", "value", "measureResult", "getMeasureResult", "()Landroidx/compose/ui/layout/MeasureResult;", "setMeasureResult$ui_release", "(Landroidx/compose/ui/layout/MeasureResult;)V", "measureScope", "Landroidx/compose/ui/layout/MeasureScope;", "getMeasureScope", "()Landroidx/compose/ui/layout/MeasureScope;", "minimumTouchTargetSize", "Landroidx/compose/ui/geometry/Size;", "getMinimumTouchTargetSize-NH-jbRc", "()J", "oldAlignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "", "parentCoordinates", "getParentCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "parentLayoutCoordinates", "getParentLayoutCoordinates", "Landroidx/compose/ui/unit/IntOffset;", "position", "getPosition-nOcc-ac", "J", "providedAlignmentLines", "", "getProvidedAlignmentLines", "()Ljava/util/Set;", "rectCache", "getRectCache", "()Landroidx/compose/ui/geometry/MutableRect;", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "snapshotObserver", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "wrapped", "getWrapped$ui_release", "()Landroidx/compose/ui/node/LayoutNodeWrapper;", "wrappedBy", "getWrappedBy$ui_release", "setWrappedBy$ui_release", "(Landroidx/compose/ui/node/LayoutNodeWrapper;)V", "zIndex", "getZIndex", "()F", "setZIndex", "(F)V", "ancestorToLocal", "ancestor", "rect", "clipBounds", "Landroidx/compose/ui/geometry/Offset;", "offset", "ancestorToLocal-R5De75A", "(Landroidx/compose/ui/node/LayoutNodeWrapper;J)J", "attach", "calculateAlignmentLine", "alignmentLine", "calculateMinimumTouchTargetPadding", "calculateMinimumTouchTargetPadding-E7KxVPU", "(J)J", "detach", "distanceInMinimumTouchTarget", "pointerPosition", "distanceInMinimumTouchTarget-tz77jQw", "(JJ)F", "draw", "canvas", "drawBorder", "paint", "Landroidx/compose/ui/graphics/Paint;", "drawContainedDrawModifiers", "findCommonAncestor", "other", "findCommonAncestor$ui_release", "findLastFocusWrapper", "Landroidx/compose/ui/node/ModifiedFocusNode;", "findLastKeyInputWrapper", "Landroidx/compose/ui/node/ModifiedKeyInputNode;", "findNextFocusWrapper", "excludeDeactivated", "findNextKeyInputWrapper", "findNextNestedScrollWrapper", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;", "findParentFocusNode", "findParentFocusNode$ui_release", "findParentKeyInputNode", "findParentKeyInputNode$ui_release", "findPreviousFocusWrapper", "findPreviousKeyInputWrapper", "findPreviousNestedScrollWrapper", "focusableChildren", "", "fromParentPosition", "fromParentPosition-MK-Hz9U", "fromParentRect", "bounds", "get", "getWrappedByCoordinates", "hitTest", "hitTestResult", "Landroidx/compose/ui/node/HitTestResult;", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "isTouchEvent", "isInLayer", "hitTest-M_7yMNQ", "(JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "hitTestSemantics", "hitSemanticsWrappers", "Landroidx/compose/ui/semantics/SemanticsWrapper;", "hitTestSemantics-9KIMszo", "(JLandroidx/compose/ui/node/HitTestResult;Z)V", "invalidateLayer", "invoke", "isPointerInBounds", "isPointerInBounds-k-4lQ0M", "(J)Z", "isTransparent", "localBoundingBoxOf", "Landroidx/compose/ui/geometry/Rect;", "sourceCoordinates", "localPositionOf", "relativeToSource", "localPositionOf-R5De75A", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "localToRoot", "relativeToLocal", "localToRoot-MK-Hz9U", "localToWindow", "localToWindow-MK-Hz9U", "offsetFromEdge", "offsetFromEdge-MK-Hz9U", "onInitialize", "onLayerBlockUpdated", "onMeasureResultChanged", "width", "height", "onModifierChanged", "onModifierLocalRead", "T", "modifierLocal", "Landroidx/compose/ui/modifier/ModifierLocal;", "(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;", "onPlaced", "performDraw", "performingMeasure", "constraints", "Landroidx/compose/ui/unit/Constraints;", "block", "performingMeasure-K40F9xA", "(JLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/layout/Placeable;", "placeAt", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "populateFocusOrder", "focusOrder", "Landroidx/compose/ui/focus/FocusOrder;", "propagateFocusEvent", "focusState", "Landroidx/compose/ui/focus/FocusState;", "propagateRelocationRequest", "(Landroidx/compose/ui/geometry/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rectInParent", "clipToMinimumTouchTargetSize", "rectInParent$ui_release", "shouldSharePointerInputWithSiblings", "toParentPosition", "toParentPosition-MK-Hz9U", "updateLayerParameters", "windowToLocal", "relativeToWindow", "windowToLocal-MK-Hz9U", "withPositionTranslation", "withinLayerBounds", "withinLayerBounds-k-4lQ0M", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public abstract class LayoutNodeWrapper extends Placeable implements Measurable, LayoutCoordinates, OwnerScope, Function1<Canvas, Unit> {
    @NotNull
    public static final String ExpectAttachedLayoutCoordinates = "LayoutCoordinate operations are only valid when isAttached is true";
    @NotNull
    public static final String UnmeasuredError = "Asking for measurement result of unmeasured layout modifier";
    private boolean _isAttached;
    @Nullable
    private MeasureResult _measureResult;
    @Nullable
    private MutableRect _rectCache;
    @Nullable
    private DrawEntity drawEntityHead;
    @NotNull
    private final Function0<Unit> invalidateParentLayer;
    private boolean isClipping;
    private boolean isShallowPlacing;
    private float lastLayerAlpha;
    private boolean lastLayerDrawingWasSkipped;
    @Nullable
    private OwnedLayer layer;
    @Nullable
    private Function1<? super GraphicsLayerScope, Unit> layerBlock;
    @NotNull
    private Density layerDensity;
    @NotNull
    private LayoutDirection layerLayoutDirection;
    @NotNull
    private final LayoutNode layoutNode;
    @Nullable
    private Map<AlignmentLine, Integer> oldAlignmentLines;
    private long position;
    @Nullable
    private LayoutNodeWrapper wrappedBy;
    private float zIndex;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final Function1<LayoutNodeWrapper, Unit> onCommitAffectingLayerParams = LayoutNodeWrapper$Companion$onCommitAffectingLayerParams$1.INSTANCE;
    @NotNull
    private static final Function1<LayoutNodeWrapper, Unit> onCommitAffectingLayer = LayoutNodeWrapper$Companion$onCommitAffectingLayer$1.INSTANCE;
    @NotNull
    private static final ReusableGraphicsLayerScope graphicsLayerScope = new ReusableGraphicsLayerScope();

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeWrapper$Companion;", "", "()V", "ExpectAttachedLayoutCoordinates", "", "UnmeasuredError", "graphicsLayerScope", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "onCommitAffectingLayer", "Lkotlin/Function1;", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "", "onCommitAffectingLayerParams", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public LayoutNodeWrapper(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.layoutNode = layoutNode;
        this.layerDensity = layoutNode.getDensity();
        this.layerLayoutDirection = layoutNode.getLayoutDirection();
        this.lastLayerAlpha = 0.8f;
        this.position = IntOffset.Companion.m3453getZeronOccac();
        this.invalidateParentLayer = new LayoutNodeWrapper$invalidateParentLayer$1(this);
    }

    private final void ancestorToLocal(LayoutNodeWrapper layoutNodeWrapper, MutableRect mutableRect, boolean z) {
        if (layoutNodeWrapper == this) {
            return;
        }
        LayoutNodeWrapper layoutNodeWrapper2 = this.wrappedBy;
        if (layoutNodeWrapper2 != null) {
            layoutNodeWrapper2.ancestorToLocal(layoutNodeWrapper, mutableRect, z);
        }
        fromParentRect(mutableRect, z);
    }

    /* renamed from: ancestorToLocal-R5De75A */
    private final long m2876ancestorToLocalR5De75A(LayoutNodeWrapper layoutNodeWrapper, long j2) {
        if (layoutNodeWrapper == this) {
            return j2;
        }
        LayoutNodeWrapper layoutNodeWrapper2 = this.wrappedBy;
        return (layoutNodeWrapper2 == null || Intrinsics.areEqual(layoutNodeWrapper, layoutNodeWrapper2)) ? m2880fromParentPositionMKHz9U(j2) : m2880fromParentPositionMKHz9U(layoutNodeWrapper2.m2876ancestorToLocalR5De75A(layoutNodeWrapper, j2));
    }

    public final void drawContainedDrawModifiers(Canvas canvas) {
        DrawEntity drawEntity = this.drawEntityHead;
        if (drawEntity == null) {
            performDraw(canvas);
        } else {
            drawEntity.draw(canvas);
        }
    }

    private final void fromParentRect(MutableRect mutableRect, boolean z) {
        float m3443getXimpl = IntOffset.m3443getXimpl(m2882getPositionnOccac());
        mutableRect.setLeft(mutableRect.getLeft() - m3443getXimpl);
        mutableRect.setRight(mutableRect.getRight() - m3443getXimpl);
        float m3444getYimpl = IntOffset.m3444getYimpl(m2882getPositionnOccac());
        mutableRect.setTop(mutableRect.getTop() - m3444getYimpl);
        mutableRect.setBottom(mutableRect.getBottom() - m3444getYimpl);
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mapBounds(mutableRect, true);
            if (this.isClipping && z) {
                mutableRect.intersect(0.0f, 0.0f, IntSize.m3485getWidthimpl(mo2772getSizeYbymL2g()), IntSize.m3484getHeightimpl(mo2772getSizeYbymL2g()));
                mutableRect.isEmpty();
            }
        }
    }

    private final boolean getHasMeasureResult() {
        return this._measureResult != null;
    }

    private final OwnerSnapshotObserver getSnapshotObserver() {
        return LayoutNodeKt.requireOwner(this.layoutNode).getSnapshotObserver();
    }

    /* renamed from: offsetFromEdge-MK-Hz9U */
    private final long m2877offsetFromEdgeMKHz9U(long j2) {
        float m1161getXimpl = Offset.m1161getXimpl(j2);
        float max = Math.max(0.0f, m1161getXimpl < 0.0f ? -m1161getXimpl : m1161getXimpl - getMeasuredWidth());
        float m1162getYimpl = Offset.m1162getYimpl(j2);
        return OffsetKt.Offset(max, Math.max(0.0f, m1162getYimpl < 0.0f ? -m1162getYimpl : m1162getYimpl - getMeasuredHeight()));
    }

    public static /* synthetic */ Object propagateRelocationRequest$suspendImpl(LayoutNodeWrapper layoutNodeWrapper, Rect rect, Continuation continuation) {
        Object coroutine_suspended;
        LayoutNodeWrapper wrappedBy$ui_release = layoutNodeWrapper.getWrappedBy$ui_release();
        if (wrappedBy$ui_release == null) {
            return Unit.INSTANCE;
        }
        Object propagateRelocationRequest = wrappedBy$ui_release.propagateRelocationRequest(rect.m1198translatek4lQ0M(wrappedBy$ui_release.localBoundingBoxOf(layoutNodeWrapper, false).m1196getTopLeftF1C5BW0()), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return propagateRelocationRequest == coroutine_suspended ? propagateRelocationRequest : Unit.INSTANCE;
    }

    public static /* synthetic */ void rectInParent$ui_release$default(LayoutNodeWrapper layoutNodeWrapper, MutableRect mutableRect, boolean z, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        layoutNodeWrapper.rectInParent$ui_release(mutableRect, z, z2);
    }

    public final void updateLayerParameters() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            Function1<? super GraphicsLayerScope, Unit> function1 = this.layerBlock;
            if (function1 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            ReusableGraphicsLayerScope reusableGraphicsLayerScope = graphicsLayerScope;
            reusableGraphicsLayerScope.reset();
            reusableGraphicsLayerScope.setGraphicsDensity$ui_release(this.layoutNode.getDensity());
            getSnapshotObserver().observeReads$ui_release(this, onCommitAffectingLayerParams, new LayoutNodeWrapper$updateLayerParameters$1(function1));
            ownedLayer.mo2898updateLayerPropertiesYPkPJjM(reusableGraphicsLayerScope.getScaleX(), reusableGraphicsLayerScope.getScaleY(), reusableGraphicsLayerScope.getAlpha(), reusableGraphicsLayerScope.getTranslationX(), reusableGraphicsLayerScope.getTranslationY(), reusableGraphicsLayerScope.getShadowElevation(), reusableGraphicsLayerScope.getRotationX(), reusableGraphicsLayerScope.getRotationY(), reusableGraphicsLayerScope.getRotationZ(), reusableGraphicsLayerScope.getCameraDistance(), reusableGraphicsLayerScope.mo1530getTransformOriginSzJe1aQ(), reusableGraphicsLayerScope.getShape(), reusableGraphicsLayerScope.getClip(), reusableGraphicsLayerScope.getRenderEffect(), this.layoutNode.getLayoutDirection(), this.layoutNode.getDensity());
            this.isClipping = reusableGraphicsLayerScope.getClip();
        } else {
            if (!(this.layerBlock == null)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        this.lastLayerAlpha = graphicsLayerScope.getAlpha();
        Owner owner$ui_release = this.layoutNode.getOwner$ui_release();
        if (owner$ui_release == null) {
            return;
        }
        owner$ui_release.onLayoutChange(this.layoutNode);
    }

    public void attach() {
        this._isAttached = true;
        onLayerBlockUpdated(this.layerBlock);
    }

    public abstract int calculateAlignmentLine(@NotNull AlignmentLine alignmentLine);

    /* renamed from: calculateMinimumTouchTargetPadding-E7KxVPU */
    public final long m2878calculateMinimumTouchTargetPaddingE7KxVPU(long j2) {
        return SizeKt.Size(Math.max(0.0f, (Size.m1230getWidthimpl(j2) - getMeasuredWidth()) / 2.0f), Math.max(0.0f, (Size.m1227getHeightimpl(j2) - getMeasuredHeight()) / 2.0f));
    }

    public void detach() {
        this._isAttached = false;
        onLayerBlockUpdated(this.layerBlock);
        LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
        if (parent$ui_release == null) {
            return;
        }
        parent$ui_release.invalidateLayer$ui_release();
    }

    /* renamed from: distanceInMinimumTouchTarget-tz77jQw */
    public final float m2879distanceInMinimumTouchTargettz77jQw(long j2, long j3) {
        if (getMeasuredWidth() < Size.m1230getWidthimpl(j3) || getMeasuredHeight() < Size.m1227getHeightimpl(j3)) {
            long m2878calculateMinimumTouchTargetPaddingE7KxVPU = m2878calculateMinimumTouchTargetPaddingE7KxVPU(j3);
            float m1230getWidthimpl = Size.m1230getWidthimpl(m2878calculateMinimumTouchTargetPaddingE7KxVPU);
            float m1227getHeightimpl = Size.m1227getHeightimpl(m2878calculateMinimumTouchTargetPaddingE7KxVPU);
            long m2877offsetFromEdgeMKHz9U = m2877offsetFromEdgeMKHz9U(j2);
            if ((m1230getWidthimpl > 0.0f || m1227getHeightimpl > 0.0f) && Offset.m1161getXimpl(m2877offsetFromEdgeMKHz9U) <= m1230getWidthimpl && Offset.m1162getYimpl(m2877offsetFromEdgeMKHz9U) <= m1227getHeightimpl) {
                return Math.max(Offset.m1161getXimpl(m2877offsetFromEdgeMKHz9U), Offset.m1162getYimpl(m2877offsetFromEdgeMKHz9U));
            }
            return Float.POSITIVE_INFINITY;
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.drawLayer(canvas);
            return;
        }
        float m3443getXimpl = IntOffset.m3443getXimpl(m2882getPositionnOccac());
        float m3444getYimpl = IntOffset.m3444getYimpl(m2882getPositionnOccac());
        canvas.translate(m3443getXimpl, m3444getYimpl);
        drawContainedDrawModifiers(canvas);
        canvas.translate(-m3443getXimpl, -m3444getYimpl);
    }

    public final void drawBorder(@NotNull Canvas canvas, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
        canvas.drawRect(new Rect(0.5f, 0.5f, IntSize.m3485getWidthimpl(m2796getMeasuredSizeYbymL2g()) - 0.5f, IntSize.m3484getHeightimpl(m2796getMeasuredSizeYbymL2g()) - 0.5f), paint);
    }

    @NotNull
    public final LayoutNodeWrapper findCommonAncestor$ui_release(@NotNull LayoutNodeWrapper other) {
        Intrinsics.checkNotNullParameter(other, "other");
        LayoutNode layoutNode = other.layoutNode;
        LayoutNode layoutNode2 = this.layoutNode;
        if (layoutNode == layoutNode2) {
            LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = layoutNode2.getOuterLayoutNodeWrapper$ui_release();
            LayoutNodeWrapper layoutNodeWrapper = this;
            while (layoutNodeWrapper != outerLayoutNodeWrapper$ui_release && layoutNodeWrapper != other) {
                layoutNodeWrapper = layoutNodeWrapper.wrappedBy;
                Intrinsics.checkNotNull(layoutNodeWrapper);
            }
            return layoutNodeWrapper == other ? other : this;
        }
        while (layoutNode.getDepth$ui_release() > layoutNode2.getDepth$ui_release()) {
            layoutNode = layoutNode.getParent$ui_release();
            Intrinsics.checkNotNull(layoutNode);
        }
        while (layoutNode2.getDepth$ui_release() > layoutNode.getDepth$ui_release()) {
            layoutNode2 = layoutNode2.getParent$ui_release();
            Intrinsics.checkNotNull(layoutNode2);
        }
        while (layoutNode != layoutNode2) {
            layoutNode = layoutNode.getParent$ui_release();
            layoutNode2 = layoutNode2.getParent$ui_release();
            if (layoutNode != null) {
                if (layoutNode2 == null) {
                }
            }
            throw new IllegalArgumentException("layouts are not part of the same hierarchy");
        }
        return layoutNode2 == this.layoutNode ? this : layoutNode == other.layoutNode ? other : layoutNode.getInnerLayoutNodeWrapper$ui_release();
    }

    @Nullable
    public abstract ModifiedFocusNode findLastFocusWrapper();

    @Nullable
    public abstract ModifiedKeyInputNode findLastKeyInputWrapper();

    @Nullable
    public abstract ModifiedFocusNode findNextFocusWrapper(boolean z);

    @Nullable
    public abstract ModifiedKeyInputNode findNextKeyInputWrapper();

    @Nullable
    public abstract NestedScrollDelegatingWrapper findNextNestedScrollWrapper();

    @Nullable
    public final ModifiedFocusNode findParentFocusNode$ui_release() {
        ModifiedFocusNode findLastFocusWrapper;
        LayoutNodeWrapper layoutNodeWrapper = this.wrappedBy;
        ModifiedFocusNode findPreviousFocusWrapper = layoutNodeWrapper == null ? null : layoutNodeWrapper.findPreviousFocusWrapper();
        if (findPreviousFocusWrapper != null) {
            return findPreviousFocusWrapper;
        }
        LayoutNode layoutNode = this.layoutNode;
        do {
            layoutNode = layoutNode.getParent$ui_release();
            if (layoutNode == null) {
                return null;
            }
            findLastFocusWrapper = layoutNode.getOuterLayoutNodeWrapper$ui_release().findLastFocusWrapper();
        } while (findLastFocusWrapper == null);
        return findLastFocusWrapper;
    }

    @Nullable
    public final ModifiedKeyInputNode findParentKeyInputNode$ui_release() {
        ModifiedKeyInputNode findLastKeyInputWrapper;
        LayoutNodeWrapper layoutNodeWrapper = this.wrappedBy;
        ModifiedKeyInputNode findPreviousKeyInputWrapper = layoutNodeWrapper == null ? null : layoutNodeWrapper.findPreviousKeyInputWrapper();
        if (findPreviousKeyInputWrapper != null) {
            return findPreviousKeyInputWrapper;
        }
        LayoutNode layoutNode = this.layoutNode;
        do {
            layoutNode = layoutNode.getParent$ui_release();
            if (layoutNode == null) {
                return null;
            }
            findLastKeyInputWrapper = layoutNode.getOuterLayoutNodeWrapper$ui_release().findLastKeyInputWrapper();
        } while (findLastKeyInputWrapper == null);
        return findLastKeyInputWrapper;
    }

    @Nullable
    public abstract ModifiedFocusNode findPreviousFocusWrapper();

    @Nullable
    public abstract ModifiedKeyInputNode findPreviousKeyInputWrapper();

    @Nullable
    public abstract NestedScrollDelegatingWrapper findPreviousNestedScrollWrapper();

    @NotNull
    public final List<ModifiedFocusNode> focusableChildren(boolean z) {
        List<ModifiedFocusNode> listOf;
        LayoutNodeWrapper wrapped$ui_release = getWrapped$ui_release();
        ModifiedFocusNode findNextFocusWrapper = wrapped$ui_release == null ? null : wrapped$ui_release.findNextFocusWrapper(z);
        if (findNextFocusWrapper != null) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(findNextFocusWrapper);
            return listOf;
        }
        ArrayList arrayList = new ArrayList();
        List<LayoutNode> children$ui_release = this.layoutNode.getChildren$ui_release();
        int size = children$ui_release.size();
        for (int i2 = 0; i2 < size; i2++) {
            FocusNodeUtilsKt.findFocusableChildren(children$ui_release.get(i2), arrayList, z);
        }
        return arrayList;
    }

    /* renamed from: fromParentPosition-MK-Hz9U */
    public long m2880fromParentPositionMKHz9U(long j2) {
        long m3455minusNvtHpc = IntOffsetKt.m3455minusNvtHpc(j2, m2882getPositionnOccac());
        OwnedLayer ownedLayer = this.layer;
        return ownedLayer == null ? m3455minusNvtHpc : ownedLayer.mo2895mapOffset8S9VItk(m3455minusNvtHpc, true);
    }

    @Override // androidx.compose.ui.layout.Measured
    public final int get(@NotNull AlignmentLine alignmentLine) {
        int calculateAlignmentLine;
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        if (getHasMeasureResult() && (calculateAlignmentLine = calculateAlignmentLine(alignmentLine)) != Integer.MIN_VALUE) {
            return calculateAlignmentLine + (alignmentLine instanceof VerticalAlignmentLine ? IntOffset.m3443getXimpl(m2795getApparentToRealOffsetnOccac()) : IntOffset.m3444getYimpl(m2795getApparentToRealOffsetnOccac()));
        }
        return Integer.MIN_VALUE;
    }

    @Nullable
    public final DrawEntity getDrawEntityHead() {
        return this.drawEntityHead;
    }

    public final boolean getLastLayerDrawingWasSkipped$ui_release() {
        return this.lastLayerDrawingWasSkipped;
    }

    @Nullable
    public final OwnedLayer getLayer() {
        return this.layer;
    }

    @Nullable
    public final Function1<GraphicsLayerScope, Unit> getLayerBlock() {
        return this.layerBlock;
    }

    @NotNull
    public final LayoutNode getLayoutNode$ui_release() {
        return this.layoutNode;
    }

    @NotNull
    public final MeasureResult getMeasureResult() {
        MeasureResult measureResult = this._measureResult;
        if (measureResult != null) {
            return measureResult;
        }
        throw new IllegalStateException(UnmeasuredError.toString());
    }

    @NotNull
    public abstract MeasureScope getMeasureScope();

    /* renamed from: getMinimumTouchTargetSize-NH-jbRc */
    public final long m2881getMinimumTouchTargetSizeNHjbRc() {
        return this.layerDensity.mo278toSizeXkaWNTQ(getLayoutNode$ui_release().getViewConfiguration().mo2872getMinimumTouchTargetSizeMYxV2XQ());
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    @Nullable
    public final LayoutCoordinates getParentCoordinates() {
        if (isAttached()) {
            LayoutNodeWrapper layoutNodeWrapper = this.wrappedBy;
            if (layoutNodeWrapper == null) {
                return null;
            }
            return layoutNodeWrapper.getWrappedByCoordinates();
        }
        throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    @Nullable
    public final LayoutCoordinates getParentLayoutCoordinates() {
        if (isAttached()) {
            return this.layoutNode.getOuterLayoutNodeWrapper$ui_release().wrappedBy;
        }
        throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
    }

    /* renamed from: getPosition-nOcc-ac */
    public final long m2882getPositionnOccac() {
        return this.position;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    @NotNull
    public Set<AlignmentLine> getProvidedAlignmentLines() {
        Set<AlignmentLine> emptySet;
        Map<AlignmentLine, Integer> alignmentLines;
        MeasureResult measureResult = this._measureResult;
        Set<AlignmentLine> set = null;
        if (measureResult != null && (alignmentLines = measureResult.getAlignmentLines()) != null) {
            set = alignmentLines.keySet();
        }
        if (set == null) {
            emptySet = SetsKt__SetsKt.emptySet();
            return emptySet;
        }
        return set;
    }

    @NotNull
    public final MutableRect getRectCache() {
        MutableRect mutableRect = this._rectCache;
        if (mutableRect == null) {
            MutableRect mutableRect2 = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
            this._rectCache = mutableRect2;
            return mutableRect2;
        }
        return mutableRect;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: getSize-YbymL2g */
    public final long mo2772getSizeYbymL2g() {
        return m2796getMeasuredSizeYbymL2g();
    }

    @Nullable
    public LayoutNodeWrapper getWrapped$ui_release() {
        return null;
    }

    @Nullable
    public final LayoutNodeWrapper getWrappedBy$ui_release() {
        return this.wrappedBy;
    }

    @Nullable
    public LayoutCoordinates getWrappedByCoordinates() {
        LayoutNodeWrapper layoutNodeWrapper = this.wrappedBy;
        if (layoutNodeWrapper == null) {
            return null;
        }
        return layoutNodeWrapper.getWrappedByCoordinates();
    }

    public final float getZIndex() {
        return this.zIndex;
    }

    /* renamed from: hitTest-M_7yMNQ */
    public abstract void mo2849hitTestM_7yMNQ(long j2, @NotNull HitTestResult<PointerInputFilter> hitTestResult, boolean z, boolean z2);

    /* renamed from: hitTestSemantics-9KIMszo */
    public abstract void mo2851hitTestSemantics9KIMszo(long j2, @NotNull HitTestResult<SemanticsWrapper> hitTestResult, boolean z);

    public void invalidateLayer() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
            return;
        }
        LayoutNodeWrapper layoutNodeWrapper = this.wrappedBy;
        if (layoutNodeWrapper == null) {
            return;
        }
        layoutNodeWrapper.invalidateLayer();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Canvas canvas) {
        invoke2(canvas);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke */
    public void invoke2(@NotNull Canvas canvas) {
        boolean z;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.layoutNode.isPlaced()) {
            getSnapshotObserver().observeReads$ui_release(this, onCommitAffectingLayer, new LayoutNodeWrapper$invoke$1(this, canvas));
            z = false;
        } else {
            z = true;
        }
        this.lastLayerDrawingWasSkipped = z;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final boolean isAttached() {
        if (!this._isAttached || this.layoutNode.isAttached()) {
            return this._isAttached;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: isPointerInBounds-k-4lQ0M */
    public final boolean m2883isPointerInBoundsk4lQ0M(long j2) {
        float m1161getXimpl = Offset.m1161getXimpl(j2);
        float m1162getYimpl = Offset.m1162getYimpl(j2);
        return m1161getXimpl >= 0.0f && m1162getYimpl >= 0.0f && m1161getXimpl < ((float) getMeasuredWidth()) && m1162getYimpl < ((float) getMeasuredHeight());
    }

    public final boolean isShallowPlacing() {
        return this.isShallowPlacing;
    }

    public final boolean isTransparent() {
        if (this.layer == null || this.lastLayerAlpha > 0.0f) {
            LayoutNodeWrapper layoutNodeWrapper = this.wrappedBy;
            Boolean valueOf = layoutNodeWrapper == null ? null : Boolean.valueOf(layoutNodeWrapper.isTransparent());
            if (valueOf == null) {
                return false;
            }
            return valueOf.booleanValue();
        }
        return true;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValid() {
        return this.layer != null;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    @NotNull
    public Rect localBoundingBoxOf(@NotNull LayoutCoordinates sourceCoordinates, boolean z) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        if (isAttached()) {
            if (!sourceCoordinates.isAttached()) {
                throw new IllegalStateException(("LayoutCoordinates " + sourceCoordinates + " is not attached!").toString());
            }
            LayoutNodeWrapper layoutNodeWrapper = (LayoutNodeWrapper) sourceCoordinates;
            LayoutNodeWrapper findCommonAncestor$ui_release = findCommonAncestor$ui_release(layoutNodeWrapper);
            MutableRect rectCache = getRectCache();
            rectCache.setLeft(0.0f);
            rectCache.setTop(0.0f);
            rectCache.setRight(IntSize.m3485getWidthimpl(sourceCoordinates.mo2772getSizeYbymL2g()));
            rectCache.setBottom(IntSize.m3484getHeightimpl(sourceCoordinates.mo2772getSizeYbymL2g()));
            while (layoutNodeWrapper != findCommonAncestor$ui_release) {
                rectInParent$ui_release$default(layoutNodeWrapper, rectCache, z, false, 4, null);
                if (rectCache.isEmpty()) {
                    return Rect.Companion.getZero();
                }
                layoutNodeWrapper = layoutNodeWrapper.wrappedBy;
                Intrinsics.checkNotNull(layoutNodeWrapper);
            }
            ancestorToLocal(findCommonAncestor$ui_release, rectCache, z);
            return MutableRectKt.toRect(rectCache);
        }
        throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-R5De75A */
    public long mo2773localPositionOfR5De75A(@NotNull LayoutCoordinates sourceCoordinates, long j2) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        LayoutNodeWrapper layoutNodeWrapper = (LayoutNodeWrapper) sourceCoordinates;
        LayoutNodeWrapper findCommonAncestor$ui_release = findCommonAncestor$ui_release(layoutNodeWrapper);
        while (layoutNodeWrapper != findCommonAncestor$ui_release) {
            j2 = layoutNodeWrapper.m2885toParentPositionMKHz9U(j2);
            layoutNodeWrapper = layoutNodeWrapper.wrappedBy;
            Intrinsics.checkNotNull(layoutNodeWrapper);
        }
        return m2876ancestorToLocalR5De75A(findCommonAncestor$ui_release, j2);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToRoot-MK-Hz9U */
    public long mo2774localToRootMKHz9U(long j2) {
        if (isAttached()) {
            while (this != null) {
                j2 = this.m2885toParentPositionMKHz9U(j2);
                this = this.wrappedBy;
            }
            return j2;
        }
        throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToWindow-MK-Hz9U */
    public long mo2775localToWindowMKHz9U(long j2) {
        return LayoutNodeKt.requireOwner(this.layoutNode).mo2900calculatePositionInWindowMKHz9U(mo2774localToRootMKHz9U(j2));
    }

    public void onInitialize() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer == null) {
            return;
        }
        ownedLayer.invalidate();
    }

    public final void onLayerBlockUpdated(@Nullable Function1<? super GraphicsLayerScope, Unit> function1) {
        Owner owner$ui_release;
        boolean z = (this.layerBlock == function1 && Intrinsics.areEqual(this.layerDensity, this.layoutNode.getDensity()) && this.layerLayoutDirection == this.layoutNode.getLayoutDirection()) ? false : true;
        this.layerBlock = function1;
        this.layerDensity = this.layoutNode.getDensity();
        this.layerLayoutDirection = this.layoutNode.getLayoutDirection();
        if (!isAttached() || function1 == null) {
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.destroy();
                getLayoutNode$ui_release().setInnerLayerWrapperIsDirty$ui_release(true);
                this.invalidateParentLayer.invoke();
                if (isAttached() && (owner$ui_release = getLayoutNode$ui_release().getOwner$ui_release()) != null) {
                    owner$ui_release.onLayoutChange(getLayoutNode$ui_release());
                }
            }
            this.layer = null;
            this.lastLayerDrawingWasSkipped = false;
        } else if (this.layer != null) {
            if (z) {
                updateLayerParameters();
            }
        } else {
            OwnedLayer createLayer = LayoutNodeKt.requireOwner(this.layoutNode).createLayer(this, this.invalidateParentLayer);
            createLayer.mo2897resizeozmzZPI(m2796getMeasuredSizeYbymL2g());
            createLayer.mo2896movegyyYBs(m2882getPositionnOccac());
            this.layer = createLayer;
            updateLayerParameters();
            this.layoutNode.setInnerLayerWrapperIsDirty$ui_release(true);
            this.invalidateParentLayer.invoke();
        }
    }

    public void onMeasureResultChanged(int i2, int i3) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mo2897resizeozmzZPI(IntSizeKt.IntSize(i2, i3));
        } else {
            LayoutNodeWrapper layoutNodeWrapper = this.wrappedBy;
            if (layoutNodeWrapper != null) {
                layoutNodeWrapper.invalidateLayer();
            }
        }
        Owner owner$ui_release = this.layoutNode.getOwner$ui_release();
        if (owner$ui_release != null) {
            owner$ui_release.onLayoutChange(this.layoutNode);
        }
        m2798setMeasuredSizeozmzZPI(IntSizeKt.IntSize(i2, i3));
        DrawEntity drawEntity = this.drawEntityHead;
        if (drawEntity == null) {
            return;
        }
        drawEntity.onMeasureResultChanged(i2, i3);
    }

    public void onModifierChanged() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer == null) {
            return;
        }
        ownedLayer.invalidate();
    }

    public <T> T onModifierLocalRead(@NotNull ModifierLocal<T> modifierLocal) {
        Intrinsics.checkNotNullParameter(modifierLocal, "modifierLocal");
        LayoutNodeWrapper layoutNodeWrapper = this.wrappedBy;
        T t2 = layoutNodeWrapper == null ? null : (T) layoutNodeWrapper.onModifierLocalRead(modifierLocal);
        return t2 == null ? modifierLocal.getDefaultFactory$ui_release().invoke() : t2;
    }

    public void onPlaced() {
    }

    public void performDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        LayoutNodeWrapper wrapped$ui_release = getWrapped$ui_release();
        if (wrapped$ui_release == null) {
            return;
        }
        wrapped$ui_release.draw(canvas);
    }

    @NotNull
    /* renamed from: performingMeasure-K40F9xA */
    public final Placeable m2884performingMeasureK40F9xA(long j2, @NotNull Function0<? extends Placeable> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        m2799setMeasurementConstraintsBRTryo0(j2);
        Placeable invoke = block.invoke();
        OwnedLayer layer = getLayer();
        if (layer != null) {
            layer.mo2897resizeozmzZPI(m2796getMeasuredSizeYbymL2g());
        }
        return invoke;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x003d, code lost:
        if (r3 == null) goto L13;
     */
    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo2759placeAtf8xVGno(long r3, float r5, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> r6) {
        /*
            r2 = this;
            r2.onLayerBlockUpdated(r6)
            long r0 = r2.m2882getPositionnOccac()
            boolean r6 = androidx.compose.ui.unit.IntOffset.m3442equalsimpl0(r0, r3)
            if (r6 != 0) goto L4d
            r2.position = r3
            androidx.compose.ui.node.OwnedLayer r6 = r2.layer
            if (r6 == 0) goto L17
            r6.mo2896movegyyYBs(r3)
            goto L1f
        L17:
            androidx.compose.ui.node.LayoutNodeWrapper r3 = r2.wrappedBy
            if (r3 != 0) goto L1c
            goto L1f
        L1c:
            r3.invalidateLayer()
        L1f:
            androidx.compose.ui.node.LayoutNodeWrapper r3 = r2.getWrapped$ui_release()
            if (r3 != 0) goto L27
            r3 = 0
            goto L29
        L27:
            androidx.compose.ui.node.LayoutNode r3 = r3.layoutNode
        L29:
            androidx.compose.ui.node.LayoutNode r4 = r2.layoutNode
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L37
            androidx.compose.ui.node.LayoutNode r3 = r2.layoutNode
        L33:
            r3.onAlignmentsChanged$ui_release()
            goto L3f
        L37:
            androidx.compose.ui.node.LayoutNode r3 = r2.layoutNode
            androidx.compose.ui.node.LayoutNode r3 = r3.getParent$ui_release()
            if (r3 != 0) goto L33
        L3f:
            androidx.compose.ui.node.LayoutNode r3 = r2.layoutNode
            androidx.compose.ui.node.Owner r3 = r3.getOwner$ui_release()
            if (r3 != 0) goto L48
            goto L4d
        L48:
            androidx.compose.ui.node.LayoutNode r4 = r2.layoutNode
            r3.onLayoutChange(r4)
        L4d:
            r2.zIndex = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNodeWrapper.mo2759placeAtf8xVGno(long, float, kotlin.jvm.functions.Function1):void");
    }

    public void populateFocusOrder(@NotNull FocusOrder focusOrder) {
        Intrinsics.checkNotNullParameter(focusOrder, "focusOrder");
        LayoutNodeWrapper layoutNodeWrapper = this.wrappedBy;
        if (layoutNodeWrapper == null) {
            return;
        }
        layoutNodeWrapper.populateFocusOrder(focusOrder);
    }

    public void propagateFocusEvent(@NotNull FocusState focusState) {
        Intrinsics.checkNotNullParameter(focusState, "focusState");
        LayoutNodeWrapper layoutNodeWrapper = this.wrappedBy;
        if (layoutNodeWrapper == null) {
            return;
        }
        layoutNodeWrapper.propagateFocusEvent(focusState);
    }

    @Nullable
    public Object propagateRelocationRequest(@NotNull Rect rect, @NotNull Continuation<? super Unit> continuation) {
        return propagateRelocationRequest$suspendImpl(this, rect, continuation);
    }

    public final void rectInParent$ui_release(@NotNull MutableRect bounds, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            if (this.isClipping) {
                if (z2) {
                    long m2881getMinimumTouchTargetSizeNHjbRc = m2881getMinimumTouchTargetSizeNHjbRc();
                    float m1230getWidthimpl = Size.m1230getWidthimpl(m2881getMinimumTouchTargetSizeNHjbRc) / 2.0f;
                    float m1227getHeightimpl = Size.m1227getHeightimpl(m2881getMinimumTouchTargetSizeNHjbRc) / 2.0f;
                    bounds.intersect(-m1230getWidthimpl, -m1227getHeightimpl, IntSize.m3485getWidthimpl(mo2772getSizeYbymL2g()) + m1230getWidthimpl, IntSize.m3484getHeightimpl(mo2772getSizeYbymL2g()) + m1227getHeightimpl);
                } else if (z) {
                    bounds.intersect(0.0f, 0.0f, IntSize.m3485getWidthimpl(mo2772getSizeYbymL2g()), IntSize.m3484getHeightimpl(mo2772getSizeYbymL2g()));
                }
                if (bounds.isEmpty()) {
                    return;
                }
            }
            ownedLayer.mapBounds(bounds, false);
        }
        float m3443getXimpl = IntOffset.m3443getXimpl(m2882getPositionnOccac());
        bounds.setLeft(bounds.getLeft() + m3443getXimpl);
        bounds.setRight(bounds.getRight() + m3443getXimpl);
        float m3444getYimpl = IntOffset.m3444getYimpl(m2882getPositionnOccac());
        bounds.setTop(bounds.getTop() + m3444getYimpl);
        bounds.setBottom(bounds.getBottom() + m3444getYimpl);
    }

    public final void setDrawEntityHead(@Nullable DrawEntity drawEntity) {
        this.drawEntityHead = drawEntity;
    }

    public final void setMeasureResult$ui_release(@NotNull MeasureResult value) {
        LayoutNode parent$ui_release;
        Intrinsics.checkNotNullParameter(value, "value");
        MeasureResult measureResult = this._measureResult;
        if (value != measureResult) {
            this._measureResult = value;
            if (measureResult == null || value.getWidth() != measureResult.getWidth() || value.getHeight() != measureResult.getHeight()) {
                onMeasureResultChanged(value.getWidth(), value.getHeight());
            }
            Map<AlignmentLine, Integer> map = this.oldAlignmentLines;
            if ((!(map == null || map.isEmpty()) || (!value.getAlignmentLines().isEmpty())) && !Intrinsics.areEqual(value.getAlignmentLines(), this.oldAlignmentLines)) {
                LayoutNodeWrapper wrapped$ui_release = getWrapped$ui_release();
                if (Intrinsics.areEqual(wrapped$ui_release == null ? null : wrapped$ui_release.layoutNode, this.layoutNode)) {
                    LayoutNode parent$ui_release2 = this.layoutNode.getParent$ui_release();
                    if (parent$ui_release2 != null) {
                        parent$ui_release2.onAlignmentsChanged$ui_release();
                    }
                    if (this.layoutNode.getAlignmentLines$ui_release().getUsedDuringParentMeasurement$ui_release()) {
                        LayoutNode parent$ui_release3 = this.layoutNode.getParent$ui_release();
                        if (parent$ui_release3 != null) {
                            parent$ui_release3.requestRemeasure$ui_release();
                        }
                    } else if (this.layoutNode.getAlignmentLines$ui_release().getUsedDuringParentLayout$ui_release() && (parent$ui_release = this.layoutNode.getParent$ui_release()) != null) {
                        parent$ui_release.requestRelayout$ui_release();
                    }
                } else {
                    this.layoutNode.onAlignmentsChanged$ui_release();
                }
                this.layoutNode.getAlignmentLines$ui_release().setDirty$ui_release(true);
                Map map2 = this.oldAlignmentLines;
                if (map2 == null) {
                    map2 = new LinkedHashMap();
                    this.oldAlignmentLines = map2;
                }
                map2.clear();
                map2.putAll(value.getAlignmentLines());
            }
        }
    }

    public final void setShallowPlacing(boolean z) {
        this.isShallowPlacing = z;
    }

    public final void setWrappedBy$ui_release(@Nullable LayoutNodeWrapper layoutNodeWrapper) {
        this.wrappedBy = layoutNodeWrapper;
    }

    public final void setZIndex(float f2) {
        this.zIndex = f2;
    }

    public boolean shouldSharePointerInputWithSiblings() {
        return false;
    }

    /* renamed from: toParentPosition-MK-Hz9U */
    public long m2885toParentPositionMKHz9U(long j2) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            j2 = ownedLayer.mo2895mapOffset8S9VItk(j2, false);
        }
        return IntOffsetKt.m3457plusNvtHpc(j2, m2882getPositionnOccac());
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: windowToLocal-MK-Hz9U */
    public long mo2776windowToLocalMKHz9U(long j2) {
        if (isAttached()) {
            LayoutCoordinates findRoot = LayoutCoordinatesKt.findRoot(this);
            return mo2773localPositionOfR5De75A(findRoot, Offset.m1165minusMKHz9U(LayoutNodeKt.requireOwner(this.layoutNode).mo2899calculateLocalPositionMKHz9U(j2), LayoutCoordinatesKt.positionInRoot(findRoot)));
        }
        throw new IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
    }

    public final void withPositionTranslation(@NotNull Canvas canvas, @NotNull Function1<? super Canvas, Unit> block) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(block, "block");
        float m3443getXimpl = IntOffset.m3443getXimpl(m2882getPositionnOccac());
        float m3444getYimpl = IntOffset.m3444getYimpl(m2882getPositionnOccac());
        canvas.translate(m3443getXimpl, m3444getYimpl);
        block.invoke(canvas);
        canvas.translate(-m3443getXimpl, -m3444getYimpl);
    }

    /* renamed from: withinLayerBounds-k-4lQ0M */
    public final boolean m2886withinLayerBoundsk4lQ0M(long j2) {
        if (OffsetKt.m1178isFinitek4lQ0M(j2)) {
            OwnedLayer ownedLayer = this.layer;
            return ownedLayer == null || !this.isClipping || ownedLayer.mo2894isInLayerk4lQ0M(j2);
        }
        return false;
    }
}
