package j;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import j.n2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q.y;

@Deprecated(level = DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
@Metadata(bv = {}, d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0005~³\u0001Î\u0001B\u0012\u0012\u0007\u0010Ë\u0001\u001a\u00020\u001b¢\u0006\u0006\bÌ\u0001\u0010Í\u0001J&\u0010\n\u001a\u00020\t2\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0082\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010#\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0012H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u0012H\u0002¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u00020\u0007*\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b'\u0010$J.\u0010*\u001a\u00020\u0007\"\n\b\u0000\u0010)\u0018\u0001*\u00020(2\u0006\u0010!\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0082\b¢\u0006\u0004\b*\u0010$J\u0019\u0010,\u001a\u00020+2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b,\u0010-J@\u00103\u001a\u00020(2'\u00101\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`02\u0006\u00102\u001a\u00020\u001bH\u0002¢\u0006\u0004\b3\u00104J'\u00107\u001a\u00020\u001b2\u0006\u00105\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u00106\u001a\u00020(H\u0002¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u00072\u0006\u0010\r\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020(H\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u001bH\u0002¢\u0006\u0004\b>\u0010?J\u0013\u0010@\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ\u001b\u0010B\u001a\u0004\u0018\u00010\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bB\u0010CJ\u0019\u0010D\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bD\u0010EJ\u001b\u0010F\u001a\u0004\u0018\u00010\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bF\u0010CJ\u0019\u0010G\u001a\u0004\u0018\u00010 2\u0006\u0010\r\u001a\u00020\u0019H\u0002¢\u0006\u0004\bG\u0010HJ\u001f\u0010I\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\bI\u0010JJ%\u0010K\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bK\u0010LJ#\u0010M\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u00192\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bM\u0010NJ\u0019\u0010P\u001a\u0004\u0018\u00010O2\u0006\u0010\r\u001a\u00020\u0019H\u0002¢\u0006\u0004\bP\u0010QJ*\u0010S\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010R\u001a\u00020O2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0082\u0010¢\u0006\u0004\bS\u0010TJ)\u0010V\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010U\u001a\u00020O2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bV\u0010WJ\u0015\u0010Y\u001a\u0004\u0018\u00010O*\u00020XH\u0002¢\u0006\u0004\bY\u0010ZJ\u0019\u0010\\\u001a\u00020[2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\\\u0010]J\u0015\u0010^\u001a\u0004\u0018\u00010\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b^\u0010AJ\u0019\u0010`\u001a\u00020\u00072\b\u0010_\u001a\u0004\u0018\u00010\u0001H\u0004¢\u0006\u0004\b`\u0010aJ\r\u0010b\u001a\u00020\u001b¢\u0006\u0004\bb\u0010?J\u000f\u0010c\u001a\u00020\u0007H\u0014¢\u0006\u0004\bc\u0010dJ\u0011\u0010g\u001a\u00060ej\u0002`f¢\u0006\u0004\bg\u0010hJ#\u0010j\u001a\u00060ej\u0002`f*\u00020\u00122\n\b\u0002\u0010i\u001a\u0004\u0018\u00010[H\u0004¢\u0006\u0004\bj\u0010kJ6\u0010m\u001a\u00020l2'\u00101\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`0¢\u0006\u0004\bm\u0010nJF\u0010p\u001a\u00020l2\u0006\u00102\u001a\u00020\u001b2\u0006\u0010o\u001a\u00020\u001b2'\u00101\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`0¢\u0006\u0004\bp\u0010qJ\u0013\u0010r\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\br\u0010AJB\u0010w\u001a\u00020\u0007\"\u0004\b\u0000\u0010s2\f\u0010u\u001a\b\u0012\u0004\u0012\u00028\u00000t2\u001c\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000v\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005ø\u0001\u0000¢\u0006\u0004\bw\u0010xJ\u0017\u0010y\u001a\u00020\u00072\u0006\u00106\u001a\u00020(H\u0000¢\u0006\u0004\by\u0010=J\u001f\u0010z\u001a\u00020\u00072\u000e\u0010\"\u001a\n\u0018\u00010ej\u0004\u0018\u0001`fH\u0016¢\u0006\u0004\bz\u0010{J\u000f\u0010|\u001a\u00020[H\u0014¢\u0006\u0004\b|\u0010}J\u0019\u0010~\u001a\u00020\u001b2\b\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0017¢\u0006\u0004\b~\u0010&J\u0018\u0010\u007f\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0019\u0010\u0082\u0001\u001a\u00020\u00072\u0007\u0010\u0081\u0001\u001a\u00020\u0003¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0019\u0010\u0084\u0001\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u0084\u0001\u0010&J\u0019\u0010\u0085\u0001\u001a\u00020\u001b2\b\u0010\"\u001a\u0004\u0018\u00010\u0012¢\u0006\u0005\b\u0085\u0001\u0010&J\u001c\u0010\u0086\u0001\u001a\u00020\u001b2\b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J,\u0010\u0089\u0001\u001a\u00030\u0088\u00012\n\b\u0002\u0010i\u001a\u0004\u0018\u00010[2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0080\b¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u0013\u0010s\u001a\u00060ej\u0002`fH\u0016¢\u0006\u0004\bs\u0010hJ\u001c\u0010\u008b\u0001\u001a\u00020\u001b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0006\b\u008b\u0001\u0010\u0087\u0001J\u001d\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0005\b\u008c\u0001\u0010CJ\u0019\u0010\u008e\u0001\u001a\u00030\u008d\u00012\u0006\u0010R\u001a\u00020\u0002¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u001b\u0010\u0091\u0001\u001a\u00020\u00072\u0007\u0010\u0090\u0001\u001a\u00020\u0012H\u0010¢\u0006\u0006\b\u0091\u0001\u0010\u0080\u0001J\u001c\u0010\u0092\u0001\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0006\b\u0092\u0001\u0010\u0080\u0001J\u001a\u0010\u0093\u0001\u001a\u00020\u001b2\u0007\u0010\u0090\u0001\u001a\u00020\u0012H\u0014¢\u0006\u0005\b\u0093\u0001\u0010&J\u001c\u0010\u0094\u0001\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u001c\u0010\u0096\u0001\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0006\b\u0096\u0001\u0010\u0095\u0001J\u0011\u0010\u0097\u0001\u001a\u00020[H\u0016¢\u0006\u0005\b\u0097\u0001\u0010}J\u0011\u0010\u0098\u0001\u001a\u00020[H\u0007¢\u0006\u0005\b\u0098\u0001\u0010}J\u0011\u0010\u0099\u0001\u001a\u00020[H\u0010¢\u0006\u0005\b\u0099\u0001\u0010}J\u0012\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0012¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u0014\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u0017\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0006H\u0080@ø\u0001\u0000¢\u0006\u0005\b\u009e\u0001\u0010AJT\u0010 \u0001\u001a\u00020\u0007\"\u0004\b\u0000\u0010)\"\u0004\b\u0001\u0010s2\f\u0010u\u001a\b\u0012\u0004\u0012\u00028\u00010t2#\u0010\b\u001a\u001f\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010v\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u009f\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b \u0001\u0010¡\u0001JT\u0010¢\u0001\u001a\u00020\u0007\"\u0004\b\u0000\u0010)\"\u0004\b\u0001\u0010s2\f\u0010u\u001a\b\u0012\u0004\u0012\u00028\u00010t2#\u0010\b\u001a\u001f\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010v\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u009f\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b¢\u0001\u0010¡\u0001R\u001e\u0010¤\u0001\u001a\u0004\u0018\u00010\u0012*\u0004\u0018\u00010\u00068BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b£\u0001\u0010ER\u001b\u0010§\u0001\u001a\u00020\u001b*\u00020\u00198BX\u0082\u0004¢\u0006\b\u001a\u0006\b¥\u0001\u0010¦\u0001R\u0019\u0010«\u0001\u001a\u0007\u0012\u0002\b\u00030¨\u00018F¢\u0006\b\u001a\u0006\b©\u0001\u0010ª\u0001R0\u0010±\u0001\u001a\u0005\u0018\u00010\u008d\u00012\n\u0010¬\u0001\u001a\u0005\u0018\u00010\u008d\u00018@@@X\u0080\u000e¢\u0006\u0010\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068@X\u0080\u0004¢\u0006\b\u001a\u0006\b²\u0001\u0010\u009d\u0001R\u0016\u0010´\u0001\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b³\u0001\u0010?R\u0013\u0010¶\u0001\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\bµ\u0001\u0010?R\u0013\u0010·\u0001\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\b·\u0001\u0010?R\u0019\u0010¹\u0001\u001a\u0004\u0018\u00010\u00128DX\u0084\u0004¢\u0006\b\u001a\u0006\b¸\u0001\u0010\u009b\u0001R\u0016\u0010»\u0001\u001a\u00020\u001b8DX\u0084\u0004¢\u0006\u0007\u001a\u0005\bº\u0001\u0010?R\u0014\u0010¾\u0001\u001a\u00020\u00048F¢\u0006\b\u001a\u0006\b¼\u0001\u0010½\u0001R\u0016\u0010À\u0001\u001a\u00020\u001b8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b¿\u0001\u0010?R\u001b\u0010Ä\u0001\u001a\t\u0012\u0004\u0012\u00020\u00010Á\u00018F¢\u0006\b\u001a\u0006\bÂ\u0001\u0010Ã\u0001R\u0016\u0010Æ\u0001\u001a\u00020\u001b8TX\u0094\u0004¢\u0006\u0007\u001a\u0005\bÅ\u0001\u0010?R\u0016\u0010È\u0001\u001a\u00020\u001b8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bÇ\u0001\u0010?R\u0013\u0010Ê\u0001\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\bÉ\u0001\u0010?\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Ï\u0001"}, d2 = {"Lj/v2;", "Lj/n2;", "Lj/y;", "Lj/f3;", "Lt/c;", "Lkotlin/Function1;", "", "", "block", "", "P0", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Void;", "Lj/v2$c;", "state", "proposedUpdate", "v0", "(Lj/v2$c;Ljava/lang/Object;)Ljava/lang/Object;", "", "", "exceptions", "B0", "(Lj/v2$c;Ljava/util/List;)Ljava/lang/Throwable;", "rootCause", "f0", "(Ljava/lang/Throwable;Ljava/util/List;)V", "Lj/g2;", "update", "", "n1", "(Lj/g2;Ljava/lang/Object;)Z", "q0", "(Lj/g2;Ljava/lang/Object;)V", "Lj/a3;", "list", "cause", "W0", "(Lj/a3;Ljava/lang/Throwable;)V", "n0", "(Ljava/lang/Throwable;)Z", "X0", "Lj/u2;", "T", "Y0", "", "i1", "(Ljava/lang/Object;)I", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "onCancelling", "T0", "(Lkotlin/jvm/functions/Function1;Z)Lj/u2;", "expect", "node", "e0", "(Ljava/lang/Object;Lj/a3;Lj/u2;)Z", "Lj/s1;", "c1", "(Lj/s1;)V", "d1", "(Lj/u2;)V", "N0", "()Z", "O0", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "m0", "(Ljava/lang/Object;)Ljava/lang/Object;", "s0", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "Q0", "E0", "(Lj/g2;)Lj/a3;", "o1", "(Lj/g2;Ljava/lang/Throwable;)Z", "p1", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "q1", "(Lj/g2;Ljava/lang/Object;)Ljava/lang/Object;", "Lj/x;", "w0", "(Lj/g2;)Lj/x;", "child", "r1", "(Lj/v2$c;Lj/x;Ljava/lang/Object;)Z", "lastChild", "r0", "(Lj/v2$c;Lj/x;Ljava/lang/Object;)V", "Lq/y;", "V0", "(Lq/y;)Lj/x;", "", "j1", "(Ljava/lang/Object;)Ljava/lang/String;", "i0", "parent", "J0", "(Lj/n2;)V", "start", "b1", "()V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "u", "()Ljava/util/concurrent/CancellationException;", "message", "k1", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "Lj/p1;", "H", "(Lkotlin/jvm/functions/Function1;)Lj/p1;", "invokeImmediately", "r", "(ZZLkotlin/jvm/functions/Function1;)Lj/p1;", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "R", "Lt/f;", "select", "Lkotlin/coroutines/Continuation;", "y", "(Lt/f;Lkotlin/jvm/functions/Function1;)V", "f1", "cancel", "(Ljava/util/concurrent/CancellationException;)V", "o0", "()Ljava/lang/String;", "a", "l0", "(Ljava/lang/Throwable;)V", "parentJob", "m", "(Lj/f3;)V", "p0", "j0", "k0", "(Ljava/lang/Object;)Z", "Lj/o2;", "t0", "(Ljava/lang/String;Ljava/lang/Throwable;)Lj/o2;", "R0", "S0", "Lj/w;", "X", "(Lj/y;)Lj/w;", "exception", "I0", "Z0", "H0", "a1", "(Ljava/lang/Object;)V", "g0", "toString", "m1", "U0", "l", "()Ljava/lang/Throwable;", "x0", "()Ljava/lang/Object;", "h0", "Lkotlin/Function2;", "e1", "(Lt/f;Lkotlin/jvm/functions/Function2;)V", "g1", "A0", "exceptionOrNull", "K0", "(Lj/g2;)Z", "isCancelling", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "key", "value", "F0", "()Lj/w;", "h1", "(Lj/w;)V", "parentHandle", "G0", "b", "isActive", "e", "isCompleted", "isCancelled", "y0", "completionCause", "z0", "completionCauseHandled", "N", "()Lt/c;", "onJoin", "D0", "onCancelComplete", "Lkotlin/sequences/Sequence;", "k", "()Lkotlin/sequences/Sequence;", "children", "M0", "isScopedCoroutine", "C0", "handlesException", "L0", "isCompletedExceptionally", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "<init>", "(Z)V", "c", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public class v2 implements n2, y, f3, t.c {

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f532j = AtomicReferenceFieldUpdater.newUpdater(v2.class, Object.class, "_state");
    @NotNull
    private volatile /* synthetic */ Object _parentHandle;
    @NotNull
    private volatile /* synthetic */ Object _state;

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0014R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lj/v2$a;", "T", "Lj/r;", "Lj/n2;", "parent", "", "w", "", "I", "Lj/v2;", "r", "Lj/v2;", "job", "Lkotlin/coroutines/Continuation;", "delegate", "<init>", "(Lkotlin/coroutines/Continuation;Lj/v2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class a<T> extends r<T> {
        @NotNull

        /* renamed from: r  reason: collision with root package name */
        public final v2 f533r;

        public a(@NotNull Continuation<? super T> continuation, @NotNull v2 v2Var) {
            super(continuation, 1);
            this.f533r = v2Var;
        }

        @Override // j.r
        @NotNull
        public String I() {
            return "AwaitContinuation";
        }

        @Override // j.r
        @NotNull
        public Throwable w(@NotNull n2 n2Var) {
            Throwable e2;
            Object G0 = this.f533r.G0();
            return (!(G0 instanceof c) || (e2 = ((c) G0).e()) == null) ? G0 instanceof e0 ? ((e0) G0).f424a : n2Var.u() : e2;
        }
    }

    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lj/v2$b;", "Lj/u2;", "", "cause", "", "g0", "Lj/v2;", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "Lj/v2;", "parent", "Lj/v2$c;", "o", "Lj/v2$c;", "state", "Lj/x;", "p", "Lj/x;", "child", "", "q", "Ljava/lang/Object;", "proposedUpdate", "<init>", "(Lj/v2;Lj/v2$c;Lj/x;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class b extends u2 {
        @NotNull

        /* renamed from: n  reason: collision with root package name */
        public final v2 f534n;
        @NotNull

        /* renamed from: o  reason: collision with root package name */
        public final c f535o;
        @NotNull

        /* renamed from: p  reason: collision with root package name */
        public final x f536p;
        @Nullable

        /* renamed from: q  reason: collision with root package name */
        public final Object f537q;

        public b(@NotNull v2 v2Var, @NotNull c cVar, @NotNull x xVar, @Nullable Object obj) {
            this.f534n = v2Var;
            this.f535o = cVar;
            this.f536p = xVar;
            this.f537q = obj;
        }

        @Override // j.g0
        public void g0(@Nullable Throwable th) {
            this.f534n.r0(this.f535o, this.f536p, this.f537q);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            g0(th);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B!\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0006\u0010\u001f\u001a\u00020\u001a\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b/\u00100J\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0010j\b\u0012\u0004\u0012\u00020\u0004`\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u0015\u0010\u001eR(\u0010#\u001a\u0004\u0018\u00010\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010\fR\u0011\u0010%\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b$\u0010\u001dR\u0011\u0010'\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b&\u0010\u001dR\u0014\u0010)\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u001dR(\u0010.\u001a\u0004\u0018\u00010\u00012\b\u0010\u001b\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00061"}, d2 = {"Lj/v2$c;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lj/g2;", "", "proposedException", "", "i", "(Ljava/lang/Throwable;)Ljava/util/List;", "exception", "", "a", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "c", "()Ljava/util/ArrayList;", "Lj/a3;", "j", "Lj/a3;", "k", "()Lj/a3;", "list", "", "value", "g", "()Z", "(Z)V", "isCompleting", "e", "()Ljava/lang/Throwable;", "m", "rootCause", "h", "isSealed", "f", "isCancelling", "b", "isActive", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "()Ljava/lang/Object;", "l", "(Ljava/lang/Object;)V", "exceptionsHolder", "<init>", "(Lj/a3;ZLjava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class c implements g2 {
        @NotNull
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        @NotNull
        private volatile /* synthetic */ int _isCompleting;
        @NotNull
        private volatile /* synthetic */ Object _rootCause;
        @NotNull

        /* renamed from: j  reason: collision with root package name */
        public final a3 f538j;

        public c(@NotNull a3 a3Var, boolean z, @Nullable Throwable th) {
            this.f538j = a3Var;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(@NotNull Throwable th) {
            Throwable e2 = e();
            if (e2 == null) {
                m(th);
            } else if (th == e2) {
            } else {
                Object d2 = d();
                if (d2 == null) {
                    l(th);
                } else if (d2 instanceof Throwable) {
                    if (th == d2) {
                        return;
                    }
                    ArrayList<Throwable> c2 = c();
                    c2.add(d2);
                    c2.add(th);
                    l(c2);
                } else if (d2 instanceof ArrayList) {
                    ((ArrayList) d2).add(th);
                } else {
                    throw new IllegalStateException(("State is " + d2).toString());
                }
            }
        }

        @Override // j.g2
        public boolean b() {
            return e() == null;
        }

        public final ArrayList<Throwable> c() {
            return new ArrayList<>(4);
        }

        public final Object d() {
            return this._exceptionsHolder;
        }

        @Nullable
        public final Throwable e() {
            return (Throwable) this._rootCause;
        }

        public final boolean f() {
            return e() != null;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
        public final boolean g() {
            return this._isCompleting;
        }

        public final boolean h() {
            q.r0 r0Var;
            Object d2 = d();
            r0Var = w2.f562h;
            return d2 == r0Var;
        }

        @NotNull
        public final List<Throwable> i(@Nullable Throwable th) {
            ArrayList<Throwable> arrayList;
            q.r0 r0Var;
            Object d2 = d();
            if (d2 == null) {
                arrayList = c();
            } else if (d2 instanceof Throwable) {
                ArrayList<Throwable> c2 = c();
                c2.add(d2);
                arrayList = c2;
            } else if (!(d2 instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + d2).toString());
            } else {
                arrayList = (ArrayList) d2;
            }
            Throwable e2 = e();
            if (e2 != null) {
                arrayList.add(0, e2);
            }
            if (th != null && !Intrinsics.areEqual(th, e2)) {
                arrayList.add(th);
            }
            r0Var = w2.f562h;
            l(r0Var);
            return arrayList;
        }

        public final void j(boolean z) {
            this._isCompleting = z ? 1 : 0;
        }

        @Override // j.g2
        @NotNull
        public a3 k() {
            return this.f538j;
        }

        public final void l(Object obj) {
            this._exceptionsHolder = obj;
        }

        public final void m(@Nullable Throwable th) {
            this._rootCause = th;
        }

        @NotNull
        public String toString() {
            return "Finishing[cancelling=" + f() + ", completing=" + g() + ", rootCause=" + e() + ", exceptions=" + d() + ", list=" + k() + ']';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"q/y$f", "Lq/y$c;", "Lq/y;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "k", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class d extends y.c {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ v2 f539d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Object f540e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(q.y yVar, v2 v2Var, Object obj) {
            super(yVar);
            this.f539d = v2Var;
            this.f540e = obj;
        }

        @Override // q.d
        @Nullable
        /* renamed from: k */
        public Object i(@NotNull q.y yVar) {
            if (this.f539d.G0() == this.f540e) {
                return null;
            }
            return q.x.a();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlin/sequences/SequenceScope;", "Lj/n2;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", i = {1, 1, 1}, l = {952, 954}, m = "invokeSuspend", n = {"$this$sequence", "this_$iv", "cur$iv"}, s = {"L$0", "L$1", "L$2"})
    /* loaded from: classes2.dex */
    public static final class e extends RestrictedSuspendLambda implements Function2<SequenceScope<? super n2>, Continuation<? super Unit>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public Object f541j;

        /* renamed from: k  reason: collision with root package name */
        public Object f542k;

        /* renamed from: l  reason: collision with root package name */
        public int f543l;

        /* renamed from: m  reason: collision with root package name */
        public /* synthetic */ Object f544m;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            e eVar = new e(continuation);
            eVar.f544m = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SequenceScope<? super n2> sequenceScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0066 -> B:27:0x007c). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0079 -> B:27:0x007c). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f543l
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r1 = r6.f542k
                q.y r1 = (q.y) r1
                java.lang.Object r3 = r6.f541j
                q.w r3 = (q.w) r3
                java.lang.Object r4 = r6.f544m
                kotlin.sequences.SequenceScope r4 = (kotlin.sequences.SequenceScope) r4
                kotlin.ResultKt.throwOnFailure(r7)
                goto L7c
            L1e:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L26:
                kotlin.ResultKt.throwOnFailure(r7)
                goto L81
            L2a:
                kotlin.ResultKt.throwOnFailure(r7)
                java.lang.Object r7 = r6.f544m
                kotlin.sequences.SequenceScope r7 = (kotlin.sequences.SequenceScope) r7
                j.v2 r1 = j.v2.this
                java.lang.Object r1 = r1.G0()
                boolean r4 = r1 instanceof j.x
                if (r4 == 0) goto L48
                j.x r1 = (j.x) r1
                j.y r1 = r1.f565n
                r6.f543l = r3
                java.lang.Object r6 = r7.yield(r1, r6)
                if (r6 != r0) goto L81
                return r0
            L48:
                boolean r3 = r1 instanceof j.g2
                if (r3 == 0) goto L81
                j.g2 r1 = (j.g2) r1
                j.a3 r1 = r1.k()
                if (r1 == 0) goto L81
                java.lang.Object r3 = r1.Q()
                q.y r3 = (q.y) r3
                r4 = r7
                r5 = r3
                r3 = r1
                r1 = r5
            L5e:
                boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
                if (r7 != 0) goto L81
                boolean r7 = r1 instanceof j.x
                if (r7 == 0) goto L7c
                r7 = r1
                j.x r7 = (j.x) r7
                j.y r7 = r7.f565n
                r6.f544m = r4
                r6.f541j = r3
                r6.f542k = r1
                r6.f543l = r2
                java.lang.Object r7 = r4.yield(r7, r6)
                if (r7 != r0) goto L7c
                return r0
            L7c:
                q.y r1 = r1.R()
                goto L5e
            L81:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: j.v2.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public v2(boolean z) {
        this._state = z ? w2.f564j : w2.f563i;
        this._parentHandle = null;
    }

    private final /* synthetic */ <T extends u2> void Y0(a3 a3Var, Throwable th) {
        h0 h0Var = null;
        for (q.y yVar = (q.y) a3Var.Q(); !Intrinsics.areEqual(yVar, a3Var); yVar = yVar.R()) {
            Intrinsics.reifiedOperationMarker(3, "T");
            if (yVar instanceof q.y) {
                u2 u2Var = (u2) yVar;
                try {
                    u2Var.g0(th);
                } catch (Throwable th2) {
                    if (h0Var != null) {
                        ExceptionsKt__ExceptionsKt.addSuppressed(h0Var, th2);
                    } else {
                        h0Var = new h0("Exception in completion handler " + u2Var + " for " + this, th2);
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
        }
        if (h0Var != null) {
            I0(h0Var);
        }
    }

    public static /* synthetic */ CancellationException l1(v2 v2Var, Throwable th, String str, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                str = null;
            }
            return v2Var.k1(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    public static /* synthetic */ o2 u0(v2 v2Var, String str, Throwable th, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                str = null;
            }
            if ((i2 & 2) != 0) {
                th = null;
            }
            if (str == null) {
                str = v2Var.o0();
            }
            return new o2(str, th, v2Var);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defaultCancellationException");
    }

    public final Throwable A0(Object obj) {
        e0 e0Var = obj instanceof e0 ? (e0) obj : null;
        if (e0Var != null) {
            return e0Var.f424a;
        }
        return null;
    }

    public final Throwable B0(c cVar, List<? extends Throwable> list) {
        Object obj;
        boolean z;
        Object obj2 = null;
        if (list.isEmpty()) {
            if (cVar.f()) {
                return new o2(o0(), null, this);
            }
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = list.get(0);
        if (th2 instanceof y3) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 == th2 || !(th3 instanceof y3)) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean C0() {
        return true;
    }

    public boolean D0() {
        return false;
    }

    public final a3 E0(g2 g2Var) {
        a3 k2 = g2Var.k();
        if (k2 == null) {
            if (g2Var instanceof s1) {
                return new a3();
            }
            if (g2Var instanceof u2) {
                d1((u2) g2Var);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + g2Var).toString());
        }
        return k2;
    }

    @Nullable
    public final w F0() {
        return (w) this._parentHandle;
    }

    @Nullable
    public final Object G0() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof q.j0)) {
                return obj;
            }
            ((q.j0) obj).c(this);
        }
    }

    @Override // j.n2
    @NotNull
    public final p1 H(@NotNull Function1<? super Throwable, Unit> function1) {
        return r(false, true, function1);
    }

    public boolean H0(@NotNull Throwable th) {
        return false;
    }

    public void I0(@NotNull Throwable th) {
        throw th;
    }

    public final void J0(@Nullable n2 n2Var) {
        if (n2Var == null) {
            h1(c3.f407j);
            return;
        }
        n2Var.start();
        w X = n2Var.X(this);
        h1(X);
        if (e()) {
            X.dispose();
            h1(c3.f407j);
        }
    }

    public final boolean K0(g2 g2Var) {
        return (g2Var instanceof c) && ((c) g2Var).f();
    }

    public final boolean L0() {
        return G0() instanceof e0;
    }

    @Override // j.n2
    @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    @NotNull
    public n2 M(@NotNull n2 n2Var) {
        return n2.a.h(this, n2Var);
    }

    public boolean M0() {
        return false;
    }

    @Override // j.n2
    @NotNull
    public final t.c N() {
        return this;
    }

    public final boolean N0() {
        Object G0;
        do {
            G0 = G0();
            if (!(G0 instanceof g2)) {
                return false;
            }
        } while (i1(G0) < 0);
        return true;
    }

    public final Object O0(Continuation<? super Unit> continuation) {
        r rVar = new r(IntrinsicsKt.intercepted(continuation), 1);
        rVar.E();
        t.a(rVar, H(new i3(rVar)));
        Object x = rVar.x();
        if (x == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return x == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? x : Unit.INSTANCE;
    }

    public final Void P0(Function1<Object, Unit> function1) {
        while (true) {
            function1.invoke(G0());
        }
    }

    public final Object Q0(Object obj) {
        q.r0 r0Var;
        q.r0 r0Var2;
        q.r0 r0Var3;
        q.r0 r0Var4;
        q.r0 r0Var5;
        q.r0 r0Var6;
        Throwable th = null;
        while (true) {
            Object G0 = G0();
            if (G0 instanceof c) {
                synchronized (G0) {
                    if (((c) G0).h()) {
                        r0Var2 = w2.f558d;
                        return r0Var2;
                    }
                    boolean f2 = ((c) G0).f();
                    if (obj != null || !f2) {
                        if (th == null) {
                            th = s0(obj);
                        }
                        ((c) G0).a(th);
                    }
                    Throwable e2 = f2 ^ true ? ((c) G0).e() : null;
                    if (e2 != null) {
                        W0(((c) G0).k(), e2);
                    }
                    r0Var = w2.f555a;
                    return r0Var;
                }
            } else if (!(G0 instanceof g2)) {
                r0Var3 = w2.f558d;
                return r0Var3;
            } else {
                if (th == null) {
                    th = s0(obj);
                }
                g2 g2Var = (g2) G0;
                if (!g2Var.b()) {
                    Object p1 = p1(G0, new e0(th, false, 2, null));
                    r0Var5 = w2.f555a;
                    if (p1 == r0Var5) {
                        throw new IllegalStateException(("Cannot happen in " + G0).toString());
                    }
                    r0Var6 = w2.f557c;
                    if (p1 != r0Var6) {
                        return p1;
                    }
                } else if (o1(g2Var, th)) {
                    r0Var4 = w2.f555a;
                    return r0Var4;
                }
            }
        }
    }

    @Override // j.f3
    @NotNull
    public CancellationException R() {
        Throwable th;
        Object G0 = G0();
        if (G0 instanceof c) {
            th = ((c) G0).e();
        } else if (G0 instanceof e0) {
            th = ((e0) G0).f424a;
        } else if (G0 instanceof g2) {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + G0).toString());
        } else {
            th = null;
        }
        CancellationException cancellationException = th instanceof CancellationException ? th : null;
        if (cancellationException == null) {
            return new o2("Parent job is " + j1(G0), th, this);
        }
        return cancellationException;
    }

    public final boolean R0(@Nullable Object obj) {
        Object p1;
        q.r0 r0Var;
        q.r0 r0Var2;
        do {
            p1 = p1(G0(), obj);
            r0Var = w2.f555a;
            if (p1 == r0Var) {
                return false;
            }
            if (p1 == w2.f556b) {
                return true;
            }
            r0Var2 = w2.f557c;
        } while (p1 == r0Var2);
        g0(p1);
        return true;
    }

    @Nullable
    public final Object S0(@Nullable Object obj) {
        Object p1;
        q.r0 r0Var;
        q.r0 r0Var2;
        do {
            p1 = p1(G0(), obj);
            r0Var = w2.f555a;
            if (p1 == r0Var) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, A0(obj));
            }
            r0Var2 = w2.f557c;
        } while (p1 == r0Var2);
        return p1;
    }

    public final u2 T0(Function1<? super Throwable, Unit> function1, boolean z) {
        u2 u2Var;
        if (z) {
            u2Var = function1 instanceof p2 ? (p2) function1 : null;
            if (u2Var == null) {
                u2Var = new l2(function1);
            }
        } else {
            u2Var = function1 instanceof u2 ? (u2) function1 : null;
            if (u2Var == null) {
                u2Var = new m2(function1);
            }
        }
        u2Var.i0(this);
        return u2Var;
    }

    @NotNull
    public String U0() {
        return z0.a(this);
    }

    public final x V0(q.y yVar) {
        while (yVar.V()) {
            yVar = yVar.S();
        }
        while (true) {
            yVar = yVar.R();
            if (!yVar.V()) {
                if (yVar instanceof x) {
                    return (x) yVar;
                }
                if (yVar instanceof a3) {
                    return null;
                }
            }
        }
    }

    public final void W0(a3 a3Var, Throwable th) {
        Z0(th);
        h0 h0Var = null;
        for (q.y yVar = (q.y) a3Var.Q(); !Intrinsics.areEqual(yVar, a3Var); yVar = yVar.R()) {
            if (yVar instanceof p2) {
                u2 u2Var = (u2) yVar;
                try {
                    u2Var.g0(th);
                } catch (Throwable th2) {
                    if (h0Var != null) {
                        ExceptionsKt__ExceptionsKt.addSuppressed(h0Var, th2);
                    } else {
                        h0Var = new h0("Exception in completion handler " + u2Var + " for " + this, th2);
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
        }
        if (h0Var != null) {
            I0(h0Var);
        }
        n0(th);
    }

    @Override // j.n2
    @NotNull
    public final w X(@NotNull y yVar) {
        return (w) n2.a.f(this, true, false, new x(yVar), 2, null);
    }

    public final void X0(a3 a3Var, Throwable th) {
        h0 h0Var = null;
        for (q.y yVar = (q.y) a3Var.Q(); !Intrinsics.areEqual(yVar, a3Var); yVar = yVar.R()) {
            if (yVar instanceof u2) {
                u2 u2Var = (u2) yVar;
                try {
                    u2Var.g0(th);
                } catch (Throwable th2) {
                    if (h0Var != null) {
                        ExceptionsKt__ExceptionsKt.addSuppressed(h0Var, th2);
                    } else {
                        h0Var = new h0("Exception in completion handler " + u2Var + " for " + this, th2);
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
        }
        if (h0Var != null) {
            I0(h0Var);
        }
    }

    public void Z0(@Nullable Throwable th) {
    }

    @Override // j.n2
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Added since 1.2.0 for binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean a(Throwable th) {
        Throwable o2Var;
        if (th == null || (o2Var = l1(this, th, null, 1, null)) == null) {
            o2Var = new o2(o0(), null, this);
        }
        l0(o2Var);
        return true;
    }

    public void a1(@Nullable Object obj) {
    }

    @Override // j.n2
    public boolean b() {
        Object G0 = G0();
        return (G0 instanceof g2) && ((g2) G0).b();
    }

    public void b1() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [j.f2] */
    public final void c1(s1 s1Var) {
        a3 a3Var = new a3();
        if (!s1Var.b()) {
            a3Var = new f2(a3Var);
        }
        androidx.concurrent.futures.a.a(f532j, this, s1Var, a3Var);
    }

    @Override // j.n2
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        n2.a.a(this);
    }

    @Override // j.n2
    public void cancel(@Nullable CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new o2(o0(), null, this);
        }
        l0(cancellationException);
    }

    public final void d1(u2 u2Var) {
        u2Var.J(new a3());
        androidx.concurrent.futures.a.a(f532j, this, u2Var, u2Var.R());
    }

    @Override // j.n2
    public final boolean e() {
        return !(G0() instanceof g2);
    }

    public final boolean e0(Object obj, a3 a3Var, u2 u2Var) {
        int e0;
        d dVar = new d(u2Var, this, obj);
        do {
            e0 = a3Var.S().e0(u2Var, a3Var, dVar);
            if (e0 == 1) {
                return true;
            }
        } while (e0 != 2);
        return false;
    }

    public final <T, R> void e1(@NotNull t.f<? super R> fVar, @NotNull Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        Object G0;
        do {
            G0 = G0();
            if (fVar.l()) {
                return;
            }
            if (!(G0 instanceof g2)) {
                if (fVar.i()) {
                    if (G0 instanceof e0) {
                        fVar.v(((e0) G0).f424a);
                        return;
                    } else {
                        r.b.d(function2, w2.o(G0), fVar.o());
                        return;
                    }
                }
                return;
            }
        } while (i1(G0) != 0);
        fVar.m(H(new m3(fVar, function2)));
    }

    public final void f0(Throwable th, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        for (Throwable th2 : list) {
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                ExceptionsKt__ExceptionsKt.addSuppressed(th, th2);
            }
        }
    }

    public final void f1(@NotNull u2 u2Var) {
        Object G0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        s1 s1Var;
        do {
            G0 = G0();
            if (!(G0 instanceof u2)) {
                if (!(G0 instanceof g2) || ((g2) G0).k() == null) {
                    return;
                }
                u2Var.Y();
                return;
            } else if (G0 != u2Var) {
                return;
            } else {
                atomicReferenceFieldUpdater = f532j;
                s1Var = w2.f564j;
            }
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, G0, s1Var));
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r2, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) n2.a.d(this, r2, function2);
    }

    public void g0(@Nullable Object obj) {
    }

    public final <T, R> void g1(@NotNull t.f<? super R> fVar, @NotNull Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        Object G0 = G0();
        if (G0 instanceof e0) {
            fVar.v(((e0) G0).f424a);
        } else {
            r.a.f(function2, w2.o(G0), fVar.o(), null, 4, null);
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
        return (E) n2.a.e(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public final CoroutineContext.Key<?> getKey() {
        return n2.f488b;
    }

    @Nullable
    public final Object h0(@NotNull Continuation<Object> continuation) {
        Object G0;
        do {
            G0 = G0();
            if (!(G0 instanceof g2)) {
                if (G0 instanceof e0) {
                    throw ((e0) G0).f424a;
                }
                return w2.o(G0);
            }
        } while (i1(G0) < 0);
        return i0(continuation);
    }

    public final void h1(@Nullable w wVar) {
        this._parentHandle = wVar;
    }

    public final Object i0(Continuation<Object> continuation) {
        a aVar = new a(IntrinsicsKt.intercepted(continuation), this);
        aVar.E();
        t.a(aVar, H(new h3(aVar)));
        Object x = aVar.x();
        if (x == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return x;
    }

    public final int i1(Object obj) {
        s1 s1Var;
        if (!(obj instanceof s1)) {
            if (obj instanceof f2) {
                if (androidx.concurrent.futures.a.a(f532j, this, obj, ((f2) obj).k())) {
                    b1();
                    return 1;
                }
                return -1;
            }
            return 0;
        } else if (((s1) obj).b()) {
            return 0;
        } else {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f532j;
            s1Var = w2.f564j;
            if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, obj, s1Var)) {
                b1();
                return 1;
            }
            return -1;
        }
    }

    @Override // j.n2
    public final boolean isCancelled() {
        Object G0 = G0();
        return (G0 instanceof e0) || ((G0 instanceof c) && ((c) G0).f());
    }

    public final boolean j0(@Nullable Throwable th) {
        return k0(th);
    }

    public final String j1(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof g2 ? ((g2) obj).b() ? "Active" : "New" : obj instanceof e0 ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.f() ? "Cancelling" : cVar.g() ? "Completing" : "Active";
    }

    @Override // j.n2
    @NotNull
    public final Sequence<n2> k() {
        Sequence<n2> sequence;
        sequence = SequencesKt__SequenceBuilderKt.sequence(new e(null));
        return sequence;
    }

    public final boolean k0(@Nullable Object obj) {
        Object obj2;
        q.r0 r0Var;
        q.r0 r0Var2;
        q.r0 r0Var3;
        obj2 = w2.f555a;
        if (D0() && (obj2 = m0(obj)) == w2.f556b) {
            return true;
        }
        r0Var = w2.f555a;
        if (obj2 == r0Var) {
            obj2 = Q0(obj);
        }
        r0Var2 = w2.f555a;
        if (obj2 == r0Var2 || obj2 == w2.f556b) {
            return true;
        }
        r0Var3 = w2.f558d;
        if (obj2 == r0Var3) {
            return false;
        }
        g0(obj2);
        return true;
    }

    @NotNull
    public final CancellationException k1(@NotNull Throwable th, @Nullable String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = o0();
            }
            cancellationException = new o2(str, th, this);
        }
        return cancellationException;
    }

    @Nullable
    public final Throwable l() {
        Object G0 = G0();
        if (!(G0 instanceof g2)) {
            return A0(G0);
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    public void l0(@NotNull Throwable th) {
        k0(th);
    }

    @Override // j.y
    public final void m(@NotNull f3 f3Var) {
        k0(f3Var);
    }

    public final Object m0(Object obj) {
        q.r0 r0Var;
        Object p1;
        q.r0 r0Var2;
        do {
            Object G0 = G0();
            if (!(G0 instanceof g2) || ((G0 instanceof c) && ((c) G0).g())) {
                r0Var = w2.f555a;
                return r0Var;
            }
            p1 = p1(G0, new e0(s0(obj), false, 2, null));
            r0Var2 = w2.f557c;
        } while (p1 == r0Var2);
        return p1;
    }

    @i2
    @NotNull
    public final String m1() {
        return U0() + '{' + j1(G0()) + '}';
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
        return n2.a.g(this, key);
    }

    @Override // j.n2
    @Nullable
    public final Object n(@NotNull Continuation<? super Unit> continuation) {
        if (N0()) {
            Object O0 = O0(continuation);
            return O0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? O0 : Unit.INSTANCE;
        }
        r2.A(continuation.getContext());
        return Unit.INSTANCE;
    }

    public final boolean n0(Throwable th) {
        if (M0()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        w F0 = F0();
        return (F0 == null || F0 == c3.f407j) ? z : F0.j(th) || z;
    }

    public final boolean n1(g2 g2Var, Object obj) {
        if (androidx.concurrent.futures.a.a(f532j, this, g2Var, w2.g(obj))) {
            Z0(null);
            a1(obj);
            q0(g2Var, obj);
            return true;
        }
        return false;
    }

    @NotNull
    public String o0() {
        return "Job was cancelled";
    }

    public final boolean o1(g2 g2Var, Throwable th) {
        a3 E0 = E0(g2Var);
        if (E0 == null) {
            return false;
        }
        if (androidx.concurrent.futures.a.a(f532j, this, g2Var, new c(E0, false, th))) {
            W0(E0, th);
            return true;
        }
        return false;
    }

    public boolean p0(@NotNull Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return k0(th) && C0();
    }

    public final Object p1(Object obj, Object obj2) {
        q.r0 r0Var;
        q.r0 r0Var2;
        if (!(obj instanceof g2)) {
            r0Var2 = w2.f555a;
            return r0Var2;
        } else if ((!(obj instanceof s1) && !(obj instanceof u2)) || (obj instanceof x) || (obj2 instanceof e0)) {
            return q1((g2) obj, obj2);
        } else {
            if (n1((g2) obj, obj2)) {
                return obj2;
            }
            r0Var = w2.f557c;
            return r0Var;
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return n2.a.i(this, coroutineContext);
    }

    public final void q0(g2 g2Var, Object obj) {
        w F0 = F0();
        if (F0 != null) {
            F0.dispose();
            h1(c3.f407j);
        }
        e0 e0Var = obj instanceof e0 ? (e0) obj : null;
        Throwable th = e0Var != null ? e0Var.f424a : null;
        if (!(g2Var instanceof u2)) {
            a3 k2 = g2Var.k();
            if (k2 != null) {
                X0(k2, th);
                return;
            }
            return;
        }
        try {
            ((u2) g2Var).g0(th);
        } catch (Throwable th2) {
            I0(new h0("Exception in completion handler " + g2Var + " for " + this, th2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable, T] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public final Object q1(g2 g2Var, Object obj) {
        q.r0 r0Var;
        q.r0 r0Var2;
        q.r0 r0Var3;
        a3 E0 = E0(g2Var);
        if (E0 == null) {
            r0Var3 = w2.f557c;
            return r0Var3;
        }
        c cVar = g2Var instanceof c ? (c) g2Var : null;
        if (cVar == null) {
            cVar = new c(E0, false, null);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (cVar) {
            if (cVar.g()) {
                r0Var2 = w2.f555a;
                return r0Var2;
            }
            cVar.j(true);
            if (cVar != g2Var && !androidx.concurrent.futures.a.a(f532j, this, g2Var, cVar)) {
                r0Var = w2.f557c;
                return r0Var;
            }
            boolean f2 = cVar.f();
            e0 e0Var = obj instanceof e0 ? (e0) obj : null;
            if (e0Var != null) {
                cVar.a(e0Var.f424a);
            }
            ?? e2 = Boolean.valueOf(f2 ? false : true).booleanValue() ? cVar.e() : 0;
            objectRef.element = e2;
            Unit unit = Unit.INSTANCE;
            if (e2 != 0) {
                W0(E0, e2);
            }
            x w0 = w0(g2Var);
            return (w0 == null || !r1(cVar, w0, obj)) ? v0(cVar, obj) : w2.f556b;
        }
    }

    @Override // j.n2
    @NotNull
    public final p1 r(boolean z, boolean z2, @NotNull Function1<? super Throwable, Unit> function1) {
        u2 T0 = T0(function1, z);
        while (true) {
            Object G0 = G0();
            if (G0 instanceof s1) {
                s1 s1Var = (s1) G0;
                if (!s1Var.b()) {
                    c1(s1Var);
                } else if (androidx.concurrent.futures.a.a(f532j, this, G0, T0)) {
                    return T0;
                }
            } else {
                if (!(G0 instanceof g2)) {
                    if (z2) {
                        e0 e0Var = G0 instanceof e0 ? (e0) G0 : null;
                        function1.invoke(e0Var != null ? e0Var.f424a : null);
                    }
                    return c3.f407j;
                }
                a3 k2 = ((g2) G0).k();
                if (k2 != null) {
                    p1 p1Var = c3.f407j;
                    if (z && (G0 instanceof c)) {
                        synchronized (G0) {
                            r3 = ((c) G0).e();
                            if (r3 == null || ((function1 instanceof x) && !((c) G0).g())) {
                                if (e0(G0, k2, T0)) {
                                    if (r3 == null) {
                                        return T0;
                                    }
                                    p1Var = T0;
                                }
                            }
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                    if (r3 != null) {
                        if (z2) {
                            function1.invoke(r3);
                        }
                        return p1Var;
                    } else if (e0(G0, k2, T0)) {
                        return T0;
                    }
                } else if (G0 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                } else {
                    d1((u2) G0);
                }
            }
        }
    }

    public final void r0(c cVar, x xVar, Object obj) {
        x V0 = V0(xVar);
        if (V0 == null || !r1(cVar, V0, obj)) {
            g0(v0(cVar, obj));
        }
    }

    public final boolean r1(c cVar, x xVar, Object obj) {
        while (n2.a.f(xVar.f565n, false, false, new b(this, cVar, xVar, obj), 1, null) == c3.f407j) {
            xVar = V0(xVar);
            if (xVar == null) {
                return false;
            }
        }
        return true;
    }

    public final Throwable s0(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new o2(o0(), null, this) : th;
        } else if (obj != null) {
            return ((f3) obj).R();
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        }
    }

    @Override // j.n2
    public final boolean start() {
        int i1;
        do {
            i1 = i1(G0());
            if (i1 == 0) {
                return false;
            }
        } while (i1 != 1);
        return true;
    }

    @NotNull
    public final o2 t0(@Nullable String str, @Nullable Throwable th) {
        if (str == null) {
            str = o0();
        }
        return new o2(str, th, this);
    }

    @NotNull
    public String toString() {
        return m1() + '@' + z0.b(this);
    }

    @Override // j.n2
    @NotNull
    public final CancellationException u() {
        Object G0 = G0();
        if (!(G0 instanceof c)) {
            if (G0 instanceof g2) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            } else if (G0 instanceof e0) {
                return l1(this, ((e0) G0).f424a, null, 1, null);
            } else {
                return new o2(z0.a(this) + " has completed normally", null, this);
            }
        }
        Throwable e2 = ((c) G0).e();
        if (e2 != null) {
            CancellationException k1 = k1(e2, z0.a(this) + " is cancelling");
            if (k1 != null) {
                return k1;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    public final Object v0(c cVar, Object obj) {
        boolean f2;
        Throwable B0;
        e0 e0Var = obj instanceof e0 ? (e0) obj : null;
        Throwable th = e0Var != null ? e0Var.f424a : null;
        synchronized (cVar) {
            f2 = cVar.f();
            List<Throwable> i2 = cVar.i(th);
            B0 = B0(cVar, i2);
            if (B0 != null) {
                f0(B0, i2);
            }
        }
        boolean z = false;
        if (B0 != null && B0 != th) {
            obj = new e0(B0, false, 2, null);
        }
        if (B0 != null) {
            if ((n0(B0) || H0(B0)) ? true : true) {
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                }
                ((e0) obj).b();
            }
        }
        if (!f2) {
            Z0(B0);
        }
        a1(obj);
        androidx.concurrent.futures.a.a(f532j, this, cVar, w2.g(obj));
        q0(cVar, obj);
        return obj;
    }

    public final x w0(g2 g2Var) {
        x xVar = g2Var instanceof x ? (x) g2Var : null;
        if (xVar == null) {
            a3 k2 = g2Var.k();
            if (k2 != null) {
                return V0(k2);
            }
            return null;
        }
        return xVar;
    }

    @Nullable
    public final Object x0() {
        Object G0 = G0();
        if (!(G0 instanceof g2)) {
            if (G0 instanceof e0) {
                throw ((e0) G0).f424a;
            }
            return w2.o(G0);
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    @Override // t.c
    public final <R> void y(@NotNull t.f<? super R> fVar, @NotNull Function1<? super Continuation<? super R>, ? extends Object> function1) {
        Object G0;
        do {
            G0 = G0();
            if (fVar.l()) {
                return;
            }
            if (!(G0 instanceof g2)) {
                if (fVar.i()) {
                    r.b.c(function1, fVar.o());
                    return;
                }
                return;
            }
        } while (i1(G0) != 0);
        fVar.m(H(new n3(fVar, function1)));
    }

    @Nullable
    public final Throwable y0() {
        Object G0 = G0();
        if (G0 instanceof c) {
            Throwable e2 = ((c) G0).e();
            if (e2 != null) {
                return e2;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (!(G0 instanceof g2)) {
            if (G0 instanceof e0) {
                return ((e0) G0).f424a;
            }
            return null;
        } else {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
    }

    public final boolean z0() {
        Object G0 = G0();
        return (G0 instanceof e0) && ((e0) G0).a();
    }
}
