package androidx.compose.ui.node;

import androidx.appcompat.R;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0082\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005JR\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\u00132\u0017\u0010#\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001e0$¢\u0006\u0002\b%H\u0080\bø\u0001\u0000ø\u0001\u0003ø\u0001\u0001¢\u0006\u0004\b&\u0010'Jt\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u00100\u001a\u00020\u000b2\b\b\u0002\u00101\u001a\u0002022\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\b\b\u0002\u00105\u001a\u000206H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b7\u00108Jt\u0010(\u001a\u00020\u001e2\u0006\u00109\u001a\u00020:2\u0006\u0010+\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u00100\u001a\u00020\u000b2\b\b\u0002\u00101\u001a\u0002022\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\b\b\u0002\u00105\u001a\u000206H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b;\u0010<J\\\u0010=\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020*2\b\b\u0002\u0010>\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u00100\u001a\u00020\u000b2\b\b\u0002\u00101\u001a\u0002022\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\b\b\u0002\u00105\u001a\u000206H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b?\u0010@J\\\u0010=\u001a\u00020\u001e2\u0006\u00109\u001a\u00020:2\b\b\u0002\u0010>\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u00100\u001a\u00020\u000b2\b\b\u0002\u00101\u001a\u0002022\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\b\b\u0002\u00105\u001a\u000206H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bA\u0010BJ\b\u0010C\u001a\u00020\u001eH\u0016JR\u0010D\u001a\u00020\u001e2\u0006\u0010E\u001a\u00020F2\b\b\u0002\u0010/\u001a\u00020\u00072\b\b\u0002\u00100\u001a\u00020\u000b2\b\b\u0002\u00101\u001a\u0002022\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\b\b\u0002\u00105\u001a\u000206H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bG\u0010HJp\u0010D\u001a\u00020\u001e2\u0006\u0010E\u001a\u00020F2\b\b\u0002\u0010I\u001a\u00020J2\b\b\u0002\u0010K\u001a\u00020L2\b\b\u0002\u0010M\u001a\u00020J2\b\b\u0002\u0010N\u001a\u00020L2\b\b\u0002\u00100\u001a\u00020\u000b2\b\b\u0002\u00101\u001a\u0002022\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\b\b\u0002\u00105\u001a\u000206H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bO\u0010PJz\u0010D\u001a\u00020\u001e2\u0006\u0010E\u001a\u00020F2\b\b\u0002\u0010I\u001a\u00020J2\b\b\u0002\u0010K\u001a\u00020L2\b\b\u0002\u0010M\u001a\u00020J2\b\b\u0002\u0010N\u001a\u00020L2\b\b\u0002\u00100\u001a\u00020\u000b2\b\b\u0002\u00101\u001a\u0002022\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u0010Q\u001a\u00020RH\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bS\u0010TJn\u0010U\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020*2\u0006\u0010V\u001a\u00020\u00072\u0006\u0010W\u001a\u00020\u00072\b\b\u0002\u0010X\u001a\u00020\u000b2\b\b\u0002\u0010Y\u001a\u00020Z2\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\\2\b\b\u0002\u00100\u001a\u00020\u000b2\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\b\b\u0002\u00105\u001a\u000206H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b]\u0010^Jn\u0010U\u001a\u00020\u001e2\u0006\u00109\u001a\u00020:2\u0006\u0010V\u001a\u00020\u00072\u0006\u0010W\u001a\u00020\u00072\b\b\u0002\u0010X\u001a\u00020\u000b2\b\b\u0002\u0010Y\u001a\u00020Z2\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\\2\b\b\u0002\u00100\u001a\u00020\u000b2\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\b\b\u0002\u00105\u001a\u000206H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b_\u0010`J\\\u0010a\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020*2\b\b\u0002\u0010/\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u00100\u001a\u00020\u000b2\b\b\u0002\u00101\u001a\u0002022\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\b\b\u0002\u00105\u001a\u000206H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bb\u0010cJ\\\u0010a\u001a\u00020\u001e2\u0006\u00109\u001a\u00020:2\b\b\u0002\u0010/\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u00100\u001a\u00020\u000b2\b\b\u0002\u00101\u001a\u0002022\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\b\b\u0002\u00105\u001a\u000206H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bd\u0010eJP\u0010f\u001a\u00020\u001e2\u0006\u0010g\u001a\u00020h2\u0006\u0010)\u001a\u00020*2\b\b\u0002\u00100\u001a\u00020\u000b2\b\b\u0002\u00101\u001a\u0002022\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\b\b\u0002\u00105\u001a\u000206H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bi\u0010jJP\u0010f\u001a\u00020\u001e2\u0006\u0010g\u001a\u00020h2\u0006\u00109\u001a\u00020:2\b\b\u0002\u00100\u001a\u00020\u000b2\b\b\u0002\u00101\u001a\u0002022\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\b\b\u0002\u00105\u001a\u000206H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bk\u0010lJt\u0010m\u001a\u00020\u001e2\f\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00070o2\u0006\u0010p\u001a\u00020q2\u0006\u0010)\u001a\u00020*2\b\b\u0002\u0010X\u001a\u00020\u000b2\b\b\u0002\u0010Y\u001a\u00020Z2\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\\2\b\b\u0002\u00100\u001a\u00020\u000b2\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\b\b\u0002\u00105\u001a\u000206H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\br\u0010sJt\u0010m\u001a\u00020\u001e2\f\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00070o2\u0006\u0010p\u001a\u00020q2\u0006\u00109\u001a\u00020:2\b\b\u0002\u0010X\u001a\u00020\u000b2\b\b\u0002\u0010Y\u001a\u00020Z2\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\\2\b\b\u0002\u00100\u001a\u00020\u000b2\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\b\b\u0002\u00105\u001a\u000206H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bt\u0010uJ\\\u0010v\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020*2\b\b\u0002\u0010/\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u00100\u001a\u00020\u000b2\b\b\u0002\u00101\u001a\u0002022\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\b\b\u0002\u00105\u001a\u000206H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bw\u0010cJ\\\u0010v\u001a\u00020\u001e2\u0006\u00109\u001a\u00020:2\b\b\u0002\u0010/\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u00100\u001a\u00020\u000b2\b\b\u0002\u00101\u001a\u0002022\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\b\b\u0002\u00105\u001a\u000206H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bx\u0010eJf\u0010y\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020*2\b\b\u0002\u0010/\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010z\u001a\u00020{2\b\b\u0002\u00100\u001a\u00020\u000b2\b\b\u0002\u00101\u001a\u0002022\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\b\b\u0002\u00105\u001a\u000206H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b|\u0010}Jf\u0010y\u001a\u00020\u001e2\u0006\u00109\u001a\u00020:2\b\b\u0002\u0010/\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010z\u001a\u00020{2\b\b\u0002\u00101\u001a\u0002022\b\b\u0002\u00100\u001a\u00020\u000b2\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\b\b\u0002\u00105\u001a\u000206H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b~\u0010\u007fJ\u001f\u0010\u0080\u0001\u001a\u00030\u0081\u0001*\u00030\u0082\u0001H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u001f\u0010\u0080\u0001\u001a\u00030\u0081\u0001*\u00030\u0085\u0001H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001f\u0010\u0088\u0001\u001a\u00030\u0082\u0001*\u00030\u0085\u0001H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J!\u0010\u0088\u0001\u001a\u00030\u0082\u0001*\u00020\u000bH\u0097\u0001ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\"\u0010\u0088\u0001\u001a\u00030\u0082\u0001*\u00030\u0081\u0001H\u0097\u0001ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\b\u008b\u0001\u0010\u008d\u0001J\u001e\u0010\u008e\u0001\u001a\u00030\u008f\u0001*\u00020\u001bH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u001e\u0010\u0092\u0001\u001a\u00020\u000b*\u00030\u0082\u0001H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0093\u0001\u0010\u008c\u0001J\u001e\u0010\u0092\u0001\u001a\u00020\u000b*\u00030\u0085\u0001H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0094\u0001\u0010\u008a\u0001J\u0010\u0010\u0095\u0001\u001a\u00030\u0096\u0001*\u00030\u0097\u0001H\u0097\u0001J\u001e\u0010\u0098\u0001\u001a\u00020\u001b*\u00030\u008f\u0001H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0099\u0001\u0010\u0091\u0001J\u001f\u0010\u009a\u0001\u001a\u00030\u0085\u0001*\u00030\u0082\u0001H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J!\u0010\u009a\u0001\u001a\u00030\u0085\u0001*\u00020\u000bH\u0097\u0001ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\b\u009d\u0001\u0010\u009c\u0001J\"\u0010\u009a\u0001\u001a\u00030\u0085\u0001*\u00030\u0081\u0001H\u0097\u0001ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u00020\u00078VX\u0096\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u000b8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\rR\u0012\u0010\u0016\u001a\u00020\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001c\u0010\t\u0082\u0002\u0016\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0005\b\u009920\u0001¨\u0006\u009f\u0001"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "canvasDrawScope", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "(Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;)V", "center", "Landroidx/compose/ui/geometry/Offset;", "getCenter-F1C5BW0", "()J", "density", "", "getDensity", "()F", "drawContext", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "getDrawContext", "()Landroidx/compose/ui/graphics/drawscope/DrawContext;", "drawEntity", "Landroidx/compose/ui/node/DrawEntity;", "fontScale", "getFontScale", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "size", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "draw", "", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "layoutNodeWrapper", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "draw-eZhPAX0$ui_release", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/node/DrawEntity;Lkotlin/jvm/functions/Function1;)V", "drawArc", "brush", "Landroidx/compose/ui/graphics/Brush;", "startAngle", "sweepAngle", "useCenter", "", "topLeft", "alpha", "style", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "drawArc-illE91I", "(Landroidx/compose/ui/graphics/Brush;FFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "color", "Landroidx/compose/ui/graphics/Color;", "drawArc-yD3GUKo", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle", "radius", "drawCircle-V9BoPsw", "(Landroidx/compose/ui/graphics/Brush;FJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle-VaOC9Bg", "(JFJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawContent", "drawImage", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "drawImage-gbVJVH8", "(Landroidx/compose/ui/graphics/ImageBitmap;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "srcOffset", "Landroidx/compose/ui/unit/IntOffset;", "srcSize", "Landroidx/compose/ui/unit/IntSize;", "dstOffset", "dstSize", "drawImage-9jGpkUE", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "drawImage-AZ2fEMs", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;II)V", "drawLine", "start", "end", "strokeWidth", "cap", "Landroidx/compose/ui/graphics/StrokeCap;", "pathEffect", "Landroidx/compose/ui/graphics/PathEffect;", "drawLine-1RTmtNc", "(Landroidx/compose/ui/graphics/Brush;JJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawLine-NGM6Ib0", "(JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval", "drawOval-AsUm42w", "(Landroidx/compose/ui/graphics/Brush;JJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval-n-J9OG0", "(JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath", "path", "Landroidx/compose/ui/graphics/Path;", "drawPath-GBMwjPU", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath-LG529CI", "(Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints", "points", "", "pointMode", "Landroidx/compose/ui/graphics/PointMode;", "drawPoints-Gsft0Ws", "(Ljava/util/List;ILandroidx/compose/ui/graphics/Brush;FILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints-F8ZwMP8", "(Ljava/util/List;IJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawRect", "drawRect-AsUm42w", "drawRect-n-J9OG0", "drawRoundRect", "cornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "drawRoundRect-ZuiqVtQ", "(Landroidx/compose/ui/graphics/Brush;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRoundRect-u-Aw5IA", "(JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "roundToPx", "", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp", "toDp-GaN1DYA", "(J)F", "toDp-u2uoSUM", "(F)F", "(I)F", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toPx", "toPx-0680j_4", "toPx--R2X_6o", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSize", "toSize-XkaWNTQ", "toSp", "toSp-0xMU5do", "(F)J", "toSp-kPz2Gy4", "(I)J", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LayoutNodeDrawScope implements DrawScope, ContentDrawScope {
    @NotNull
    private final CanvasDrawScope canvasDrawScope;
    @Nullable
    private DrawEntity drawEntity;

    public LayoutNodeDrawScope() {
        this(null, 1, null);
    }

    public LayoutNodeDrawScope(@NotNull CanvasDrawScope canvasDrawScope) {
        Intrinsics.checkNotNullParameter(canvasDrawScope, "canvasDrawScope");
        this.canvasDrawScope = canvasDrawScope;
    }

    public /* synthetic */ LayoutNodeDrawScope(CanvasDrawScope canvasDrawScope, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }

    /* renamed from: draw-eZhPAX0$ui_release  reason: not valid java name */
    public final void m2873draweZhPAX0$ui_release(@NotNull Canvas canvas, long j2, @NotNull LayoutNodeWrapper layoutNodeWrapper, @NotNull DrawEntity drawEntity, @NotNull Function1<? super DrawScope, Unit> block) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(layoutNodeWrapper, "layoutNodeWrapper");
        Intrinsics.checkNotNullParameter(drawEntity, "drawEntity");
        Intrinsics.checkNotNullParameter(block, "block");
        DrawEntity drawEntity2 = this.drawEntity;
        this.drawEntity = drawEntity;
        CanvasDrawScope canvasDrawScope = this.canvasDrawScope;
        MeasureScope measureScope = layoutNodeWrapper.getMeasureScope();
        LayoutDirection layoutDirection = layoutNodeWrapper.getMeasureScope().getLayoutDirection();
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope.getDrawParams();
        Density component1 = drawParams.component1();
        LayoutDirection component2 = drawParams.component2();
        Canvas component3 = drawParams.component3();
        long m1782component4NHjbRc = drawParams.m1782component4NHjbRc();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.getDrawParams();
        drawParams2.setDensity(measureScope);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m1785setSizeuvyYCjk(j2);
        canvas.save();
        block.invoke(canvasDrawScope);
        canvas.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope.getDrawParams();
        drawParams3.setDensity(component1);
        drawParams3.setLayoutDirection(component2);
        drawParams3.setCanvas(component3);
        drawParams3.m1785setSizeuvyYCjk(m1782component4NHjbRc);
        this.drawEntity = drawEntity2;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-illE91I */
    public void mo1760drawArcillE91I(@NotNull Brush brush, float f2, float f3, boolean z, long j2, long j3, float f4, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i2) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.canvasDrawScope.mo1760drawArcillE91I(brush, f2, f3, z, j2, j3, f4, style, colorFilter, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-yD3GUKo */
    public void mo1761drawArcyD3GUKo(long j2, float f2, float f3, boolean z, long j3, long j4, float f4, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i2) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.canvasDrawScope.mo1761drawArcyD3GUKo(j2, f2, f3, z, j3, j4, f4, style, colorFilter, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-V9BoPsw */
    public void mo1762drawCircleV9BoPsw(@NotNull Brush brush, float f2, long j2, float f3, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i2) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.canvasDrawScope.mo1762drawCircleV9BoPsw(brush, f2, j2, f3, style, colorFilter, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-VaOC9Bg */
    public void mo1763drawCircleVaOC9Bg(long j2, float f2, long j3, float f3, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i2) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.canvasDrawScope.mo1763drawCircleVaOC9Bg(j2, f2, j3, f3, style, colorFilter, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.ContentDrawScope
    public void drawContent() {
        Canvas canvas = getDrawContext().getCanvas();
        DrawEntity drawEntity = this.drawEntity;
        Intrinsics.checkNotNull(drawEntity);
        DrawEntity next = drawEntity.getNext();
        if (next != null) {
            next.draw(canvas);
        } else {
            drawEntity.getLayoutNodeWrapper().performDraw(canvas);
        }
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @ReplaceWith(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    /* renamed from: drawImage-9jGpkUE */
    public /* synthetic */ void mo1764drawImage9jGpkUE(ImageBitmap image, long j2, long j3, long j4, long j5, float f2, DrawStyle style, ColorFilter colorFilter, int i2) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(style, "style");
        this.canvasDrawScope.mo1764drawImage9jGpkUE(image, j2, j3, j4, j5, f2, style, colorFilter, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-AZ2fEMs */
    public void mo1765drawImageAZ2fEMs(@NotNull ImageBitmap image, long j2, long j3, long j4, long j5, float f2, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i2, int i3) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(style, "style");
        this.canvasDrawScope.mo1765drawImageAZ2fEMs(image, j2, j3, j4, j5, f2, style, colorFilter, i2, i3);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-gbVJVH8 */
    public void mo1766drawImagegbVJVH8(@NotNull ImageBitmap image, long j2, float f2, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i2) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(style, "style");
        this.canvasDrawScope.mo1766drawImagegbVJVH8(image, j2, f2, style, colorFilter, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-1RTmtNc */
    public void mo1767drawLine1RTmtNc(@NotNull Brush brush, long j2, long j3, float f2, int i2, @Nullable PathEffect pathEffect, float f3, @Nullable ColorFilter colorFilter, int i3) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        this.canvasDrawScope.mo1767drawLine1RTmtNc(brush, j2, j3, f2, i2, pathEffect, f3, colorFilter, i3);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-NGM6Ib0 */
    public void mo1768drawLineNGM6Ib0(long j2, long j3, long j4, float f2, int i2, @Nullable PathEffect pathEffect, float f3, @Nullable ColorFilter colorFilter, int i3) {
        this.canvasDrawScope.mo1768drawLineNGM6Ib0(j2, j3, j4, f2, i2, pathEffect, f3, colorFilter, i3);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-AsUm42w */
    public void mo1769drawOvalAsUm42w(@NotNull Brush brush, long j2, long j3, float f2, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i2) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.canvasDrawScope.mo1769drawOvalAsUm42w(brush, j2, j3, f2, style, colorFilter, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-n-J9OG0 */
    public void mo1770drawOvalnJ9OG0(long j2, long j3, long j4, float f2, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i2) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.canvasDrawScope.mo1770drawOvalnJ9OG0(j2, j3, j4, f2, style, colorFilter, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-GBMwjPU */
    public void mo1771drawPathGBMwjPU(@NotNull Path path, @NotNull Brush brush, float f2, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i2) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.canvasDrawScope.mo1771drawPathGBMwjPU(path, brush, f2, style, colorFilter, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-LG529CI */
    public void mo1772drawPathLG529CI(@NotNull Path path, long j2, float f2, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i2) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(style, "style");
        this.canvasDrawScope.mo1772drawPathLG529CI(path, j2, f2, style, colorFilter, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-F8ZwMP8 */
    public void mo1773drawPointsF8ZwMP8(@NotNull List<Offset> points, int i2, long j2, float f2, int i3, @Nullable PathEffect pathEffect, float f3, @Nullable ColorFilter colorFilter, int i4) {
        Intrinsics.checkNotNullParameter(points, "points");
        this.canvasDrawScope.mo1773drawPointsF8ZwMP8(points, i2, j2, f2, i3, pathEffect, f3, colorFilter, i4);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-Gsft0Ws */
    public void mo1774drawPointsGsft0Ws(@NotNull List<Offset> points, int i2, @NotNull Brush brush, float f2, int i3, @Nullable PathEffect pathEffect, float f3, @Nullable ColorFilter colorFilter, int i4) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(brush, "brush");
        this.canvasDrawScope.mo1774drawPointsGsft0Ws(points, i2, brush, f2, i3, pathEffect, f3, colorFilter, i4);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-AsUm42w */
    public void mo1775drawRectAsUm42w(@NotNull Brush brush, long j2, long j3, float f2, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i2) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.canvasDrawScope.mo1775drawRectAsUm42w(brush, j2, j3, f2, style, colorFilter, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-n-J9OG0 */
    public void mo1776drawRectnJ9OG0(long j2, long j3, long j4, float f2, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i2) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.canvasDrawScope.mo1776drawRectnJ9OG0(j2, j3, j4, f2, style, colorFilter, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-ZuiqVtQ */
    public void mo1777drawRoundRectZuiqVtQ(@NotNull Brush brush, long j2, long j3, long j4, float f2, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i2) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        this.canvasDrawScope.mo1777drawRoundRectZuiqVtQ(brush, j2, j3, j4, f2, style, colorFilter, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-u-Aw5IA */
    public void mo1778drawRoundRectuAw5IA(long j2, long j3, long j4, long j5, @NotNull DrawStyle style, float f2, @Nullable ColorFilter colorFilter, int i2) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.canvasDrawScope.mo1778drawRoundRectuAw5IA(j2, j3, j4, j5, style, f2, colorFilter, i2);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: getCenter-F1C5BW0 */
    public long mo1779getCenterF1C5BW0() {
        return this.canvasDrawScope.mo1779getCenterF1C5BW0();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.canvasDrawScope.getDensity();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    @NotNull
    public DrawContext getDrawContext() {
        return this.canvasDrawScope.getDrawContext();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getFontScale() {
        return this.canvasDrawScope.getFontScale();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return this.canvasDrawScope.getLayoutDirection();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: getSize-NH-jbRc */
    public long mo1780getSizeNHjbRc() {
        return this.canvasDrawScope.mo1780getSizeNHjbRc();
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: roundToPx--R2X_6o */
    public int mo270roundToPxR2X_6o(long j2) {
        return this.canvasDrawScope.mo270roundToPxR2X_6o(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: roundToPx-0680j_4 */
    public int mo271roundToPx0680j_4(float f2) {
        return this.canvasDrawScope.mo271roundToPx0680j_4(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-GaN1DYA */
    public float mo272toDpGaN1DYA(long j2) {
        return this.canvasDrawScope.mo272toDpGaN1DYA(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo273toDpu2uoSUM(float f2) {
        return this.canvasDrawScope.mo273toDpu2uoSUM(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo274toDpu2uoSUM(int i2) {
        return this.canvasDrawScope.mo274toDpu2uoSUM(i2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    public long mo275toDpSizekrfVVM(long j2) {
        return this.canvasDrawScope.mo275toDpSizekrfVVM(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toPx--R2X_6o */
    public float mo276toPxR2X_6o(long j2) {
        return this.canvasDrawScope.mo276toPxR2X_6o(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toPx-0680j_4 */
    public float mo277toPx0680j_4(float f2) {
        return this.canvasDrawScope.mo277toPx0680j_4(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    @NotNull
    public Rect toRect(@NotNull DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return this.canvasDrawScope.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSize-XkaWNTQ */
    public long mo278toSizeXkaWNTQ(long j2) {
        return this.canvasDrawScope.mo278toSizeXkaWNTQ(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-0xMU5do */
    public long mo279toSp0xMU5do(float f2) {
        return this.canvasDrawScope.mo279toSp0xMU5do(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo280toSpkPz2Gy4(float f2) {
        return this.canvasDrawScope.mo280toSpkPz2Gy4(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo281toSpkPz2Gy4(int i2) {
        return this.canvasDrawScope.mo281toSpkPz2Gy4(i2);
    }
}
