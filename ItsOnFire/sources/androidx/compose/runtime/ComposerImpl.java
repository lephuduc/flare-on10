package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.snapshots.ListUtilsKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000À\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\u0010\f\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0011\n\u0002\b/\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\"\b\u0000\u0018\u00002\u00020\u0001:\u0004±\u0002²\u0002B\u0092\u0001\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012Y\u0010\u000b\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u00150\f\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u0018J\t\u0010\u0084\u0001\u001a\u00020\u0014H\u0002J\t\u0010\u0085\u0001\u001a\u00020\u0014H\u0002JK\u0010\u0086\u0001\u001a\u00020\u0014\"\u0005\b\u0000\u0010\u0087\u0001\"\u0005\b\u0001\u0010\u0088\u00012\b\u0010\u0089\u0001\u001a\u0003H\u0087\u00012\"\u0010\u008a\u0001\u001a\u001d\u0012\u0005\u0012\u0003H\u0088\u0001\u0012\u0005\u0012\u0003H\u0087\u0001\u0012\u0004\u0012\u00020\u00140\u008b\u0001¢\u0006\u0003\b\u008c\u0001H\u0016¢\u0006\u0003\u0010\u008d\u0001J\t\u0010\u008e\u0001\u001a\u00020\u0005H\u0016J5\u0010\u008f\u0001\u001a\u0003H\u0088\u0001\"\u0005\b\u0000\u0010\u0088\u00012\u0007\u0010\u0090\u0001\u001a\u00020 2\u000f\u0010\u008a\u0001\u001a\n\u0012\u0005\u0012\u0003H\u0088\u00010\u0091\u0001H\u0087\bø\u0001\u0000¢\u0006\u0003\u0010\u0092\u0001J\u0014\u0010\u0093\u0001\u001a\u00020 2\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010=H\u0017J\u0012\u0010\u0093\u0001\u001a\u00020 2\u0007\u0010\u0089\u0001\u001a\u00020 H\u0017J\u0013\u0010\u0093\u0001\u001a\u00020 2\b\u0010\u0089\u0001\u001a\u00030\u0094\u0001H\u0017J\u0013\u0010\u0093\u0001\u001a\u00020 2\b\u0010\u0089\u0001\u001a\u00030\u0095\u0001H\u0017J\u0013\u0010\u0093\u0001\u001a\u00020 2\b\u0010\u0089\u0001\u001a\u00030\u0096\u0001H\u0017J\u0013\u0010\u0093\u0001\u001a\u00020 2\b\u0010\u0089\u0001\u001a\u00030\u0097\u0001H\u0017J\u0012\u0010\u0093\u0001\u001a\u00020 2\u0007\u0010\u0089\u0001\u001a\u00020$H\u0017J\u0013\u0010\u0093\u0001\u001a\u00020 2\b\u0010\u0089\u0001\u001a\u00030\u0098\u0001H\u0017J\u0013\u0010\u0093\u0001\u001a\u00020 2\b\u0010\u0089\u0001\u001a\u00030\u0099\u0001H\u0017J\t\u0010\u009a\u0001\u001a\u00020\u0014H\u0002J\t\u0010\u009b\u0001\u001a\u00020\u0014H\u0002J\b\u0010(\u001a\u00020\u0014H\u0016JG\u0010\u009c\u0001\u001a\u00020\u00142\u001d\u0010\u009d\u0001\u001a\u0018\u0012\u0004\u0012\u000205\u0012\r\u0012\u000b\u0012\u0004\u0012\u00020=\u0018\u00010\u009f\u00010\u009e\u00012\u0014\u0010 \u0001\u001a\u000f\u0012\u0004\u0012\u00020\u00140\u0091\u0001¢\u0006\u0003\b¡\u0001H\u0000¢\u0006\u0006\b¢\u0001\u0010£\u0001J$\u0010¤\u0001\u001a\u00020$2\u0007\u0010¥\u0001\u001a\u00020$2\u0007\u0010¦\u0001\u001a\u00020$2\u0007\u0010§\u0001\u001a\u00020$H\u0002J'\u0010¨\u0001\u001a\u0003H\u0088\u0001\"\u0005\b\u0000\u0010\u0088\u00012\u000e\u0010©\u0001\u001a\t\u0012\u0005\u0012\u0003H\u0088\u00010bH\u0017¢\u0006\u0003\u0010ª\u0001J!\u0010«\u0001\u001a\u00020\u0014\"\u0005\b\u0000\u0010\u0088\u00012\u000f\u0010¬\u0001\u001a\n\u0012\u0005\u0012\u0003H\u0088\u00010\u0091\u0001H\u0016J)\u0010\u00ad\u0001\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010=0b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010=0c0aj\u0002`dH\u0002J\t\u0010®\u0001\u001a\u00020\u0014H\u0016J\u000f\u0010¯\u0001\u001a\u00020\u0014H\u0000¢\u0006\u0003\b°\u0001JF\u0010±\u0001\u001a\u00020\u00142\u001d\u0010\u009d\u0001\u001a\u0018\u0012\u0004\u0012\u000205\u0012\r\u0012\u000b\u0012\u0004\u0012\u00020=\u0018\u00010\u009f\u00010\u009e\u00012\u0016\u0010 \u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0091\u0001¢\u0006\u0003\b¡\u0001H\u0002¢\u0006\u0003\u0010£\u0001J\u001b\u0010²\u0001\u001a\u00020\u00142\u0007\u0010¥\u0001\u001a\u00020$2\u0007\u0010³\u0001\u001a\u00020$H\u0002J\t\u0010´\u0001\u001a\u00020\u0014H\u0016J\u0012\u0010µ\u0001\u001a\u00020\u00142\u0007\u0010¶\u0001\u001a\u00020 H\u0002J\t\u0010·\u0001\u001a\u00020\u0014H\u0017J\t\u0010¸\u0001\u001a\u00020\u0014H\u0002J\t\u0010¹\u0001\u001a\u00020\u0014H\u0017J\t\u0010º\u0001\u001a\u00020\u0014H\u0016J\t\u0010»\u0001\u001a\u00020\u0014H\u0017J\t\u0010¼\u0001\u001a\u00020\u0014H\u0017J\f\u0010½\u0001\u001a\u0005\u0018\u00010¾\u0001H\u0017J\t\u0010¿\u0001\u001a\u00020\u0014H\u0016J\t\u0010À\u0001\u001a\u00020\u0014H\u0002J\t\u0010Á\u0001\u001a\u00020\u0014H\u0002J\u001d\u0010Â\u0001\u001a\u00020\u00142\u0007\u0010¶\u0001\u001a\u00020 2\t\u0010Ã\u0001\u001a\u0004\u0018\u00010fH\u0002J\u001a\u0010Ä\u0001\u001a\u00020\u00142\u0007\u0010Å\u0001\u001a\u00020$2\u0006\u0010N\u001a\u00020 H\u0002J\t\u0010Æ\u0001\u001a\u00020\u0014H\u0002J\u0012\u0010Ç\u0001\u001a\u00020$2\u0007\u0010È\u0001\u001a\u00020$H\u0002J\u001f\u0010É\u0001\u001a\u00020=2\t\u0010Ê\u0001\u001a\u0004\u0018\u00010=2\t\u0010Ë\u0001\u001a\u0004\u0018\u00010=H\u0017J\u000b\u0010Ì\u0001\u001a\u0004\u0018\u00010=H\u0001J-\u0010Í\u0001\u001a\u00020$2\u0007\u0010Î\u0001\u001a\u00020$2\u0007\u0010¥\u0001\u001a\u00020$2\u0007\u0010¦\u0001\u001a\u00020$2\u0007\u0010Ï\u0001\u001a\u00020$H\u0002J\u001f\u0010Ð\u0001\u001a\u00020\u00142\u000e\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00020\u00140\u0091\u0001H\u0000¢\u0006\u0003\bÑ\u0001J\t\u0010Ò\u0001\u001a\u00020\u0014H\u0002J!\u0010Ò\u0001\u001a\u00020\u00142\u0010\u0010Ó\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010=0Ô\u0001H\u0002¢\u0006\u0003\u0010Õ\u0001J\t\u0010Ö\u0001\u001a\u00020\u0014H\u0002J\u0014\u0010×\u0001\u001a\u00020\u00142\t\b\u0002\u0010Ø\u0001\u001a\u00020 H\u0002J\t\u0010Ù\u0001\u001a\u00020\u0014H\u0002J.\u0010Ú\u0001\u001a\u00020 2\u001d\u0010\u009d\u0001\u001a\u0018\u0012\u0004\u0012\u000205\u0012\r\u0012\u000b\u0012\u0004\u0012\u00020=\u0018\u00010\u009f\u00010\u009e\u0001H\u0000¢\u0006\u0003\bÛ\u0001J\t\u0010Ü\u0001\u001a\u00020\u0014H\u0002J_\u0010Ý\u0001\u001a\u00020\u00142T\u0010Þ\u0001\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u0015H\u0002J_\u0010ß\u0001\u001a\u00020\u00142T\u0010Þ\u0001\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u0015H\u0002J\t\u0010à\u0001\u001a\u00020\u0014H\u0002J\u0014\u0010á\u0001\u001a\u00020\u00142\t\u0010\u0081\u0001\u001a\u0004\u0018\u00010=H\u0002J\t\u0010â\u0001\u001a\u00020\u0014H\u0002J\t\u0010ã\u0001\u001a\u00020\u0014H\u0002J_\u0010ä\u0001\u001a\u00020\u00142T\u0010Þ\u0001\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u0015H\u0002J\u0012\u0010å\u0001\u001a\u00020\u00142\u0007\u0010æ\u0001\u001a\u00020HH\u0002J_\u0010ç\u0001\u001a\u00020\u00142T\u0010Þ\u0001\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u0015H\u0002J$\u0010è\u0001\u001a\u00020\u00142\u0007\u0010é\u0001\u001a\u00020$2\u0007\u0010ê\u0001\u001a\u00020$2\u0007\u0010ë\u0001\u001a\u00020$H\u0002J\u0012\u0010ì\u0001\u001a\u00020\u00142\u0007\u0010í\u0001\u001a\u00020$H\u0002J\u001a\u0010î\u0001\u001a\u00020\u00142\u0006\u0010^\u001a\u00020$2\u0007\u0010ë\u0001\u001a\u00020$H\u0002J\u0019\u0010ï\u0001\u001a\u00020\u00142\u000e\u0010ð\u0001\u001a\t\u0012\u0004\u0012\u00020\u00140\u0091\u0001H\u0016J\t\u0010ñ\u0001\u001a\u00020\u0014H\u0002J_\u0010ò\u0001\u001a\u00020\u00142T\u0010Þ\u0001\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u0015H\u0002Jj\u0010ó\u0001\u001a\u00020\u00142\t\b\u0002\u0010Ø\u0001\u001a\u00020 2T\u0010Þ\u0001\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u0015H\u0002J\t\u0010ô\u0001\u001a\u00020\u0014H\u0002J$\u0010õ\u0001\u001a\u00020\u00142\u0007\u0010ö\u0001\u001a\u00020$2\u0007\u0010÷\u0001\u001a\u00020$2\u0007\u0010ø\u0001\u001a\u00020$H\u0002J\u0012\u0010ù\u0001\u001a\u00020\u00142\u0007\u0010ú\u0001\u001a\u00020sH\u0016J\t\u0010û\u0001\u001a\u00020\u0014H\u0002J\u000b\u0010ü\u0001\u001a\u0004\u0018\u00010=H\u0016JP\u0010ý\u0001\u001a\u0003H\u0088\u0001\"\u0005\b\u0000\u0010\u0088\u00012\u000e\u0010©\u0001\u001a\t\u0012\u0005\u0012\u0003H\u0088\u00010b2'\u0010ú\u0001\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010=0b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010=0c0aj\u0002`dH\u0002¢\u0006\u0003\u0010þ\u0001J\t\u0010ÿ\u0001\u001a\u00020\u0014H\u0017J\t\u0010\u0080\u0002\u001a\u00020\u0014H\u0002J\t\u0010\u0081\u0002\u001a\u00020\u0014H\u0002J\t\u0010\u0082\u0002\u001a\u00020\u0014H\u0017J\u0013\u0010\u0083\u0002\u001a\u00020\u00142\b\u0010\u0083\u0002\u001a\u00030\u0084\u0002H\u0017J\t\u0010\u0085\u0002\u001a\u00020\u0014H\u0017J\u001c\u0010\u0086\u0002\u001a\u00020\u00142\u0007\u0010©\u0001\u001a\u00020$2\b\u0010\u0083\u0002\u001a\u00030\u0084\u0002H\u0017J1\u0010\u0087\u0002\u001a\u00020\u00142\u0007\u0010©\u0001\u001a\u00020$2\t\u0010\u0088\u0002\u001a\u0004\u0018\u00010=2\u0007\u0010¶\u0001\u001a\u00020 2\t\u0010\u0089\u0002\u001a\u0004\u0018\u00010=H\u0002J\t\u0010\u008a\u0002\u001a\u00020\u0014H\u0017J\u0012\u0010\u008b\u0002\u001a\u00020\u00142\u0007\u0010©\u0001\u001a\u00020$H\u0002J\u001d\u0010\u008b\u0002\u001a\u00020\u00142\u0007\u0010©\u0001\u001a\u00020$2\t\u0010\u008c\u0002\u001a\u0004\u0018\u00010=H\u0002J\u001d\u0010\u008d\u0002\u001a\u00020\u00142\u0007\u0010©\u0001\u001a\u00020$2\t\u0010\u008c\u0002\u001a\u0004\u0018\u00010=H\u0017J\t\u0010\u008e\u0002\u001a\u00020\u0014H\u0016J&\u0010\u008f\u0002\u001a\u00020\u00142\u0015\u0010\u0090\u0002\u001a\u0010\u0012\u000b\b\u0001\u0012\u0007\u0012\u0002\b\u00030\u0091\u00020Ô\u0001H\u0017¢\u0006\u0003\u0010\u0092\u0002J\u001d\u0010\u0093\u0002\u001a\u00020\u00142\u0007\u0010¶\u0001\u001a\u00020 2\t\u0010\u0089\u0002\u001a\u0004\u0018\u00010=H\u0002J\u0012\u0010\u0094\u0002\u001a\u00020\u00142\u0007\u0010©\u0001\u001a\u00020$H\u0017J\u0012\u0010\u0095\u0002\u001a\u00020\u00012\u0007\u0010©\u0001\u001a\u00020$H\u0017J\u001d\u0010\u0096\u0002\u001a\u00020\u00142\u0007\u0010©\u0001\u001a\u00020$2\t\u0010\u008c\u0002\u001a\u0004\u0018\u00010=H\u0016J\t\u0010\u0097\u0002\u001a\u00020\u0014H\u0016J\t\u0010\u0098\u0002\u001a\u00020\u0014H\u0002J#\u0010\u0099\u0002\u001a\u00020 2\u0007\u0010ú\u0001\u001a\u0002052\t\u0010\u009a\u0002\u001a\u0004\u0018\u00010=H\u0000¢\u0006\u0003\b\u009b\u0002J\u0014\u0010\u009c\u0002\u001a\u00020\u00142\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010=H\u0001J(\u0010\u009d\u0002\u001a\u00020\u00142\u0007\u0010\u009e\u0002\u001a\u00020$2\t\u0010\u008c\u0002\u001a\u0004\u0018\u00010=2\t\u0010\u0089\u0002\u001a\u0004\u0018\u00010=H\u0002J\u0012\u0010\u009f\u0002\u001a\u00020\u00142\u0007\u0010 \u0002\u001a\u00020$H\u0002J(\u0010¡\u0002\u001a\u00020\u00142\u0007\u0010\u009e\u0002\u001a\u00020$2\t\u0010\u008c\u0002\u001a\u0004\u0018\u00010=2\t\u0010\u0089\u0002\u001a\u0004\u0018\u00010=H\u0002J\u0012\u0010¢\u0002\u001a\u00020\u00142\u0007\u0010\u009e\u0002\u001a\u00020$H\u0002J\u001b\u0010£\u0002\u001a\u00020\u00142\u0007\u0010¥\u0001\u001a\u00020$2\u0007\u0010ë\u0001\u001a\u00020$H\u0002J\u001b\u0010¤\u0002\u001a\u00020\u00142\u0007\u0010¥\u0001\u001a\u00020$2\u0007\u0010¥\u0002\u001a\u00020$H\u0002J{\u0010¦\u0002\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010=0b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010=0c0aj\u0002`d2'\u0010§\u0002\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010=0b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010=0c0aj\u0002`d2'\u0010¨\u0002\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010=0b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010=0c0aj\u0002`dH\u0002J\u0014\u0010©\u0002\u001a\u00020\u00142\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010=H\u0016J\u0014\u0010ª\u0002\u001a\u00020\u00142\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010=H\u0001J\u0012\u0010«\u0002\u001a\u00020$2\u0007\u0010¥\u0001\u001a\u00020$H\u0002J\t\u0010¬\u0002\u001a\u00020\u0014H\u0016J\t\u0010\u00ad\u0002\u001a\u00020\u0014H\u0002J\t\u0010®\u0002\u001a\u00020\u0014H\u0002J\u0016\u0010¯\u0002\u001a\u00020$*\u00020q2\u0007\u0010¥\u0001\u001a\u00020$H\u0002J\u0018\u0010°\u0002\u001a\u0004\u0018\u00010=*\u00020q2\u0007\u0010È\u0001\u001a\u00020$H\u0002R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020 8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020$8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&Ra\u0010\u000b\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u00150\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R&\u00100\u001a\u00020$2\u0006\u0010/\u001a\u00020$8\u0016@RX\u0097\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b1\u00102\u001a\u0004\b3\u0010&R\u0016\u00104\u001a\u0004\u0018\u0001058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u001a\u00108\u001a\u00020 8VX\u0097\u0004¢\u0006\f\u0012\u0004\b9\u00102\u001a\u0004\b:\u0010\"R\u0016\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=0<X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020?X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020?X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010B\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\bC\u0010\"R\u0014\u0010D\u001a\u00020 8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bE\u0010\"R\u000e\u0010F\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020HX\u0082\u000e¢\u0006\u0002\n\u0000Ra\u0010I\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u00150\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010J\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LRa\u0010M\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u00150<X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010N\u001a\u00020 2\u0006\u0010/\u001a\u00020 8\u0016@RX\u0097\u000e¢\u0006\u000e\n\u0000\u0012\u0004\bO\u00102\u001a\u0004\bP\u0010\"R\u0014\u0010Q\u001a\b\u0012\u0004\u0012\u0002050<X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010R\u001a\b\u0012\u0004\u0012\u00020S0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010T\u001a\u00020 2\u0006\u0010/\u001a\u00020 @BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\bU\u0010\"R\u001e\u0010V\u001a\u00020 2\u0006\u0010/\u001a\u00020 @BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\bW\u0010\"R\u0010\u0010X\u001a\u0004\u0018\u00010YX\u0082\u000e¢\u0006\u0002\n\u0000R.\u0010Z\u001a\"\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$\u0018\u00010[j\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$\u0018\u0001`\\X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010]\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010^\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010_\u001a\u00020?X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010`\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010=0b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010=0c0aj\u0002`dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010e\u001a\u0004\u0018\u00010fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010g\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010f0<X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010h\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010i\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010j\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010k\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010l\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000Rj\u0010m\u001a^\u0012\u0004\u0012\u00020$\u0012$\u0012\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010=0b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010=0c0aj\u0002`d0[j.\u0012\u0004\u0012\u00020$\u0012$\u0012\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010=0b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010=0c0aj\u0002`d`\\X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010n\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010o\u001a\u00020?X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010p\u001a\u00020qX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010r\u001a\u0004\u0018\u00010s8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bt\u0010uR\u000e\u0010v\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010w\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010x\u001a\u00020 8VX\u0097\u0004¢\u0006\f\u0012\u0004\by\u00102\u001a\u0004\bz\u0010\"R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010{\u001a\u00020|X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010}\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010~\u001a\u00020?X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u007f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0080\u0001\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0081\u0001\u001a\u0004\u0018\u00010=*\u00020q8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006³\u0002"}, d2 = {"Landroidx/compose/runtime/ComposerImpl;", "Landroidx/compose/runtime/Composer;", "applier", "Landroidx/compose/runtime/Applier;", "parentContext", "Landroidx/compose/runtime/CompositionContext;", "slotTable", "Landroidx/compose/runtime/SlotTable;", "abandonSet", "", "Landroidx/compose/runtime/RememberObserver;", "changes", "", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "Landroidx/compose/runtime/Change;", "composition", "Landroidx/compose/runtime/ControlledComposition;", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/SlotTable;Ljava/util/Set;Ljava/util/List;Landroidx/compose/runtime/ControlledComposition;)V", "getApplier", "()Landroidx/compose/runtime/Applier;", "applyCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getApplyCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "areChildrenComposing", "", "getAreChildrenComposing$runtime_release", "()Z", "changeCount", "", "getChangeCount$runtime_release", "()I", "childrenComposing", "collectParameterInformation", "getComposition", "()Landroidx/compose/runtime/ControlledComposition;", "compositionData", "Landroidx/compose/runtime/tooling/CompositionData;", "getCompositionData", "()Landroidx/compose/runtime/tooling/CompositionData;", "<set-?>", "compoundKeyHash", "getCompoundKeyHash$annotations", "()V", "getCompoundKeyHash", "currentRecomposeScope", "Landroidx/compose/runtime/RecomposeScopeImpl;", "getCurrentRecomposeScope$runtime_release", "()Landroidx/compose/runtime/RecomposeScopeImpl;", "defaultsInvalid", "getDefaultsInvalid$annotations", "getDefaultsInvalid", "downNodes", "Landroidx/compose/runtime/Stack;", "", "entersStack", "Landroidx/compose/runtime/IntStack;", "groupNodeCount", "groupNodeCountStack", "hasInvalidations", "getHasInvalidations", "hasPendingChanges", "getHasPendingChanges$runtime_release", "hasProvider", "insertAnchor", "Landroidx/compose/runtime/Anchor;", "insertFixups", "insertTable", "getInsertTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "insertUpFixups", "inserting", "getInserting$annotations", "getInserting", "invalidateStack", "invalidations", "Landroidx/compose/runtime/Invalidation;", "isComposing", "isComposing$runtime_release", "isDisposed", "isDisposed$runtime_release", "nodeCountOverrides", "", "nodeCountVirtualOverrides", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "nodeExpected", "nodeIndex", "nodeIndexStack", "parentProvider", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "Landroidx/compose/runtime/CompositionLocal;", "Landroidx/compose/runtime/State;", "Landroidx/compose/runtime/CompositionLocalMap;", "pending", "Landroidx/compose/runtime/Pending;", "pendingStack", "pendingUps", "previousCount", "previousMoveFrom", "previousMoveTo", "previousRemove", "providerUpdates", "providersInvalid", "providersInvalidStack", "reader", "Landroidx/compose/runtime/SlotReader;", "recomposeScope", "Landroidx/compose/runtime/RecomposeScope;", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "reusing", "reusingGroup", "skipping", "getSkipping$annotations", "getSkipping", "snapshot", "Landroidx/compose/runtime/snapshots/Snapshot;", "startedGroup", "startedGroups", "writer", "writersReaderDelta", "node", "getNode", "(Landroidx/compose/runtime/SlotReader;)Ljava/lang/Object;", "abortRoot", "addRecomposeScope", "apply", "V", "T", "value", "block", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "buildContext", "cache", "invalid", "Lkotlin/Function0;", "(ZLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "changed", "", "", "", "", "", "", "cleanUpCompose", "clearUpdatedNodeCounts", "composeContent", "invalidationsRequested", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "Landroidx/compose/runtime/collection/IdentityArraySet;", FirebaseAnalytics.Param.CONTENT, "Landroidx/compose/runtime/Composable;", "composeContent$runtime_release", "(Landroidx/compose/runtime/collection/IdentityArrayMap;Lkotlin/jvm/functions/Function2;)V", "compoundKeyOf", "group", "recomposeGroup", "recomposeKey", "consume", "key", "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "createNode", "factory", "currentCompositionLocalScope", "disableReusing", "dispose", "dispose$runtime_release", "doCompose", "doRecordDownsFor", "nearestCommonRoot", "enableReusing", "end", "isNode", "endDefaults", "endGroup", "endMovableGroup", "endNode", "endProviders", "endReplaceableGroup", "endRestartGroup", "Landroidx/compose/runtime/ScopeUpdateScope;", "endReusableGroup", "endRoot", "ensureWriter", "enterGroup", "newPending", "exitGroup", "expectedNodeCount", "finalizeCompose", "insertedGroupVirtualIndex", FirebaseAnalytics.Param.INDEX, "joinKey", "left", "right", "nextSlot", "nodeIndexOf", "groupLocation", "recomposeIndex", "prepareCompose", "prepareCompose$runtime_release", "realizeDowns", "nodes", "", "([Ljava/lang/Object;)V", "realizeMovement", "realizeOperationLocation", "forParent", "realizeUps", "recompose", "recompose$runtime_release", "recomposeToGroupEnd", "record", "change", "recordApplierOperation", "recordDelete", "recordDown", "recordEndGroup", "recordEndRoot", "recordFixup", "recordInsert", "anchor", "recordInsertUpFixup", "recordMoveNode", Constants.MessagePayloadKeys.FROM, "to", "count", "recordReaderMoving", FirebaseAnalytics.Param.LOCATION, "recordRemoveNode", "recordSideEffect", "effect", "recordSlotEditing", "recordSlotEditingOperation", "recordSlotTableOperation", "recordUp", "recordUpsAndDowns", "oldGroup", "newGroup", "commonRoot", "recordUsed", "scope", "registerInsertUpFixup", "rememberedValue", "resolveCompositionLocal", "(Landroidx/compose/runtime/CompositionLocal;Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;)Ljava/lang/Object;", "skipCurrentGroup", "skipGroup", "skipReaderToGroupEnd", "skipToGroupEnd", "sourceInformation", "", "sourceInformationMarkerEnd", "sourceInformationMarkerStart", "start", "objectKey", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "startDefaults", "startGroup", "dataKey", "startMovableGroup", "startNode", "startProviders", "values", "Landroidx/compose/runtime/ProvidedValue;", "([Landroidx/compose/runtime/ProvidedValue;)V", "startReaderGroup", "startReplaceableGroup", "startRestartGroup", "startReusableGroup", "startReusableNode", "startRoot", "tryImminentInvalidation", "instance", "tryImminentInvalidation$runtime_release", "updateCachedValue", "updateCompoundKeyWhenWeEnterGroup", "groupKey", "updateCompoundKeyWhenWeEnterGroupKeyHash", "keyHash", "updateCompoundKeyWhenWeExitGroup", "updateCompoundKeyWhenWeExitGroupKeyHash", "updateNodeCount", "updateNodeCountOverrides", "newCount", "updateProviderMapGroup", "parentScope", "currentProviders", "updateRememberedValue", "updateValue", "updatedNodeCount", "useNode", "validateNodeExpected", "validateNodeNotExpected", "groupCompoundKeyPart", "nodeAt", "CompositionContextHolder", "CompositionContextImpl", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ComposerImpl implements Composer {
    @NotNull
    private final Set<RememberObserver> abandonSet;
    @NotNull
    private final Applier<?> applier;
    @NotNull
    private final List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> changes;
    private int childrenComposing;
    private boolean collectParameterInformation;
    @NotNull
    private final ControlledComposition composition;
    private int compoundKeyHash;
    @NotNull
    private Stack<Object> downNodes;
    @NotNull
    private final IntStack entersStack;
    private int groupNodeCount;
    @NotNull
    private IntStack groupNodeCountStack;
    private boolean hasProvider;
    @NotNull
    private Anchor insertAnchor;
    @NotNull
    private final List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> insertFixups;
    @NotNull
    private final SlotTable insertTable;
    @NotNull
    private final Stack<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> insertUpFixups;
    private boolean inserting;
    @NotNull
    private final Stack<RecomposeScopeImpl> invalidateStack;
    @NotNull
    private final List<Invalidation> invalidations;
    private boolean isComposing;
    private boolean isDisposed;
    @Nullable
    private int[] nodeCountOverrides;
    @Nullable
    private HashMap<Integer, Integer> nodeCountVirtualOverrides;
    private boolean nodeExpected;
    private int nodeIndex;
    @NotNull
    private IntStack nodeIndexStack;
    @NotNull
    private final CompositionContext parentContext;
    @NotNull
    private PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> parentProvider;
    @Nullable
    private Pending pending;
    @NotNull
    private final Stack<Pending> pendingStack;
    private int pendingUps;
    private int previousCount;
    private int previousMoveFrom;
    private int previousMoveTo;
    private int previousRemove;
    @NotNull
    private final HashMap<Integer, PersistentMap<CompositionLocal<Object>, State<Object>>> providerUpdates;
    private boolean providersInvalid;
    @NotNull
    private final IntStack providersInvalidStack;
    @NotNull
    private SlotReader reader;
    private boolean reusing;
    private int reusingGroup;
    @NotNull
    private final SlotTable slotTable;
    @NotNull
    private Snapshot snapshot;
    private boolean startedGroup;
    @NotNull
    private final IntStack startedGroups;
    @NotNull
    private SlotWriter writer;
    private int writersReaderDelta;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016R\u0015\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/ComposerImpl$CompositionContextHolder;", "Landroidx/compose/runtime/RememberObserver;", "ref", "Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "Landroidx/compose/runtime/ComposerImpl;", "(Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;)V", "getRef", "()Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "onAbandoned", "", "onForgotten", "onRemembered", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class CompositionContextHolder implements RememberObserver {
        @NotNull
        private final CompositionContextImpl ref;

        public CompositionContextHolder(@NotNull CompositionContextImpl ref) {
            Intrinsics.checkNotNullParameter(ref, "ref");
            this.ref = ref;
        }

        @NotNull
        public final CompositionContextImpl getRef() {
            return this.ref;
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onAbandoned() {
            this.ref.dispose();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onForgotten() {
            this.ref.dispose();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onRemembered() {
        }
    }

    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J*\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0011\u0010.\u001a\r\u0012\u0004\u0012\u00020+0/¢\u0006\u0002\b0H\u0010¢\u0006\u0004\b1\u00102J\u0006\u00103\u001a\u00020+J\r\u00104\u001a\u00020+H\u0010¢\u0006\u0002\b5J-\u0010\u0015\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00120\u000fj\u0002`\u0013H\u0010¢\u0006\u0002\b6J\u0015\u00107\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0010¢\u0006\u0002\b8J\u0015\u00109\u001a\u00020+2\u0006\u0010:\u001a\u00020;H\u0010¢\u0006\u0002\b<J\u001b\u0010=\u001a\u00020+2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\"0\nH\u0010¢\u0006\u0002\b?J\u0015\u0010@\u001a\u00020+2\u0006\u0010A\u001a\u00020BH\u0010¢\u0006\u0002\bCJ\u0015\u0010D\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0010¢\u0006\u0002\bEJ\r\u0010F\u001a\u00020+H\u0010¢\u0006\u0002\bGJ\u0015\u0010H\u001a\u00020+2\u0006\u0010A\u001a\u00020BH\u0010¢\u0006\u0002\bIJ\u0015\u0010J\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0010¢\u0006\u0002\bKJ.\u0010L\u001a\u00020+2&\u0010:\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00120\u000fj\u0002`\u0013R\u0014\u0010\u0004\u001a\u00020\u0005X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rRk\u0010\u0014\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00120\u000fj\u0002`\u00132&\u0010\u000e\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00120\u000fj\u0002`\u00138B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0002\u001a\u00020\u0003X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001e8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R(\u0010!\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\n\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u001e8PX\u0090\u0004¢\u0006\f\u0012\u0004\b'\u0010(\u001a\u0004\b)\u0010 ¨\u0006M"}, d2 = {"Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "Landroidx/compose/runtime/CompositionContext;", "compoundHashKey", "", "collectingParameterInformation", "", "(Landroidx/compose/runtime/ComposerImpl;IZ)V", "getCollectingParameterInformation$runtime_release", "()Z", "composers", "", "Landroidx/compose/runtime/ComposerImpl;", "getComposers", "()Ljava/util/Set;", "<set-?>", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "Landroidx/compose/runtime/CompositionLocal;", "", "Landroidx/compose/runtime/State;", "Landroidx/compose/runtime/CompositionLocalMap;", "compositionLocalScope", "getCompositionLocalScope", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "setCompositionLocalScope", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;)V", "compositionLocalScope$delegate", "Landroidx/compose/runtime/MutableState;", "getCompoundHashKey$runtime_release", "()I", "effectCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getEffectCoroutineContext$runtime_release", "()Lkotlin/coroutines/CoroutineContext;", "inspectionTables", "Landroidx/compose/runtime/tooling/CompositionData;", "getInspectionTables", "setInspectionTables", "(Ljava/util/Set;)V", "recomposeCoroutineContext", "getRecomposeCoroutineContext$runtime_release$annotations", "()V", "getRecomposeCoroutineContext$runtime_release", "composeInitial", "", "composition", "Landroidx/compose/runtime/ControlledComposition;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "composeInitial$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;Lkotlin/jvm/functions/Function2;)V", "dispose", "doneComposing", "doneComposing$runtime_release", "getCompositionLocalScope$runtime_release", "invalidate", "invalidate$runtime_release", "invalidateScope", "scope", "Landroidx/compose/runtime/RecomposeScopeImpl;", "invalidateScope$runtime_release", "recordInspectionTable", "table", "recordInspectionTable$runtime_release", "registerComposer", "composer", "Landroidx/compose/runtime/Composer;", "registerComposer$runtime_release", "registerComposition", "registerComposition$runtime_release", "startComposing", "startComposing$runtime_release", "unregisterComposer", "unregisterComposer$runtime_release", "unregisterComposition", "unregisterComposition$runtime_release", "updateCompositionLocalScope", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public final class CompositionContextImpl extends CompositionContext {
        private final boolean collectingParameterInformation;
        @NotNull
        private final Set<ComposerImpl> composers;
        @NotNull
        private final MutableState compositionLocalScope$delegate;
        private final int compoundHashKey;
        @Nullable
        private Set<Set<CompositionData>> inspectionTables;
        public final /* synthetic */ ComposerImpl this$0;

        public CompositionContextImpl(ComposerImpl this$0, int i2, boolean z) {
            MutableState mutableStateOf$default;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.this$0 = this$0;
            this.compoundHashKey = i2;
            this.collectingParameterInformation = z;
            this.composers = new LinkedHashSet();
            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ExtensionsKt.persistentHashMapOf(), null, 2, null);
            this.compositionLocalScope$delegate = mutableStateOf$default;
        }

        private final PersistentMap<CompositionLocal<Object>, State<Object>> getCompositionLocalScope() {
            return (PersistentMap) this.compositionLocalScope$delegate.getValue();
        }

        public static /* synthetic */ void getRecomposeCoroutineContext$runtime_release$annotations() {
        }

        private final void setCompositionLocalScope(PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap) {
            this.compositionLocalScope$delegate.setValue(persistentMap);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void composeInitial$runtime_release(@NotNull ControlledComposition composition, @NotNull Function2<? super Composer, ? super Integer, Unit> content) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            Intrinsics.checkNotNullParameter(content, "content");
            this.this$0.parentContext.composeInitial$runtime_release(composition, content);
        }

        public final void dispose() {
            if (!this.composers.isEmpty()) {
                Set<Set<CompositionData>> set = this.inspectionTables;
                if (set != null) {
                    for (ComposerImpl composerImpl : getComposers()) {
                        for (Set<CompositionData> set2 : set) {
                            set2.remove(composerImpl.slotTable);
                        }
                    }
                }
                this.composers.clear();
            }
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void doneComposing$runtime_release() {
            ComposerImpl composerImpl = this.this$0;
            composerImpl.childrenComposing--;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public boolean getCollectingParameterInformation$runtime_release() {
            return this.collectingParameterInformation;
        }

        @NotNull
        public final Set<ComposerImpl> getComposers() {
            return this.composers;
        }

        @Override // androidx.compose.runtime.CompositionContext
        @NotNull
        public PersistentMap<CompositionLocal<Object>, State<Object>> getCompositionLocalScope$runtime_release() {
            return getCompositionLocalScope();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public int getCompoundHashKey$runtime_release() {
            return this.compoundHashKey;
        }

        @Override // androidx.compose.runtime.CompositionContext
        @NotNull
        public CoroutineContext getEffectCoroutineContext$runtime_release() {
            return this.this$0.parentContext.getEffectCoroutineContext$runtime_release();
        }

        @Nullable
        public final Set<Set<CompositionData>> getInspectionTables() {
            return this.inspectionTables;
        }

        @Override // androidx.compose.runtime.CompositionContext
        @NotNull
        public CoroutineContext getRecomposeCoroutineContext$runtime_release() {
            return CompositionKt.getRecomposeCoroutineContext(this.this$0.getComposition());
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void invalidate$runtime_release(@NotNull ControlledComposition composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            this.this$0.parentContext.invalidate$runtime_release(this.this$0.getComposition());
            this.this$0.parentContext.invalidate$runtime_release(composition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void invalidateScope$runtime_release(@NotNull RecomposeScopeImpl scope) {
            Intrinsics.checkNotNullParameter(scope, "scope");
            this.this$0.parentContext.invalidateScope$runtime_release(scope);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void recordInspectionTable$runtime_release(@NotNull Set<CompositionData> table) {
            Intrinsics.checkNotNullParameter(table, "table");
            Set<Set<CompositionData>> set = this.inspectionTables;
            if (set == null) {
                set = new HashSet<>();
                setInspectionTables(set);
            }
            set.add(table);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void registerComposer$runtime_release(@NotNull Composer composer) {
            Intrinsics.checkNotNullParameter(composer, "composer");
            super.registerComposer$runtime_release((ComposerImpl) composer);
            this.composers.add(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void registerComposition$runtime_release(@NotNull ControlledComposition composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            this.this$0.parentContext.registerComposition$runtime_release(composition);
        }

        public final void setInspectionTables(@Nullable Set<Set<CompositionData>> set) {
            this.inspectionTables = set;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void startComposing$runtime_release() {
            this.this$0.childrenComposing++;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void unregisterComposer$runtime_release(@NotNull Composer composer) {
            Intrinsics.checkNotNullParameter(composer, "composer");
            Set<Set<CompositionData>> set = this.inspectionTables;
            if (set != null) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(((ComposerImpl) composer).slotTable);
                }
            }
            this.composers.remove(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void unregisterComposition$runtime_release(@NotNull ControlledComposition composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            this.this$0.parentContext.unregisterComposition$runtime_release(composition);
        }

        public final void updateCompositionLocalScope(@NotNull PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> scope) {
            Intrinsics.checkNotNullParameter(scope, "scope");
            setCompositionLocalScope(scope);
        }
    }

    public ComposerImpl(@NotNull Applier<?> applier, @NotNull CompositionContext parentContext, @NotNull SlotTable slotTable, @NotNull Set<RememberObserver> abandonSet, @NotNull List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> changes, @NotNull ControlledComposition composition) {
        Intrinsics.checkNotNullParameter(applier, "applier");
        Intrinsics.checkNotNullParameter(parentContext, "parentContext");
        Intrinsics.checkNotNullParameter(slotTable, "slotTable");
        Intrinsics.checkNotNullParameter(abandonSet, "abandonSet");
        Intrinsics.checkNotNullParameter(changes, "changes");
        Intrinsics.checkNotNullParameter(composition, "composition");
        this.applier = applier;
        this.parentContext = parentContext;
        this.slotTable = slotTable;
        this.abandonSet = abandonSet;
        this.changes = changes;
        this.composition = composition;
        this.pendingStack = new Stack<>();
        this.nodeIndexStack = new IntStack();
        this.groupNodeCountStack = new IntStack();
        this.invalidations = new ArrayList();
        this.entersStack = new IntStack();
        this.parentProvider = ExtensionsKt.persistentHashMapOf();
        this.providerUpdates = new HashMap<>();
        this.providersInvalidStack = new IntStack();
        this.reusingGroup = -1;
        this.snapshot = SnapshotKt.currentSnapshot();
        this.invalidateStack = new Stack<>();
        SlotReader openReader = slotTable.openReader();
        openReader.close();
        this.reader = openReader;
        SlotTable slotTable2 = new SlotTable();
        this.insertTable = slotTable2;
        SlotWriter openWriter = slotTable2.openWriter();
        openWriter.close();
        this.writer = openWriter;
        SlotReader openReader2 = slotTable2.openReader();
        try {
            Anchor anchor = openReader2.anchor(0);
            openReader2.close();
            this.insertAnchor = anchor;
            this.insertFixups = new ArrayList();
            this.downNodes = new Stack<>();
            this.startedGroups = new IntStack();
            this.insertUpFixups = new Stack<>();
            this.previousRemove = -1;
            this.previousMoveFrom = -1;
            this.previousMoveTo = -1;
        } catch (Throwable th) {
            openReader2.close();
            throw th;
        }
    }

    private final void abortRoot() {
        cleanUpCompose();
        this.pendingStack.clear();
        this.nodeIndexStack.clear();
        this.groupNodeCountStack.clear();
        this.entersStack.clear();
        this.providersInvalidStack.clear();
        this.reader.close();
        this.compoundKeyHash = 0;
        this.childrenComposing = 0;
        this.nodeExpected = false;
        this.isComposing = false;
    }

    private final void addRecomposeScope() {
        Invalidation removeLocation;
        if (getInserting()) {
            RecomposeScopeImpl recomposeScopeImpl = new RecomposeScopeImpl((CompositionImpl) getComposition());
            this.invalidateStack.push(recomposeScopeImpl);
            updateValue(recomposeScopeImpl);
            recomposeScopeImpl.start(this.snapshot.getId());
            return;
        }
        removeLocation = ComposerKt.removeLocation(this.invalidations, this.reader.getParent());
        Object next = this.reader.next();
        if (next == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
        }
        RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) next;
        recomposeScopeImpl2.setRequiresRecompose(removeLocation != null);
        this.invalidateStack.push(recomposeScopeImpl2);
        recomposeScopeImpl2.start(this.snapshot.getId());
    }

    private final void cleanUpCompose() {
        this.pending = null;
        this.nodeIndex = 0;
        this.groupNodeCount = 0;
        this.writersReaderDelta = 0;
        this.compoundKeyHash = 0;
        this.nodeExpected = false;
        this.startedGroup = false;
        this.startedGroups.clear();
        this.invalidateStack.clear();
        clearUpdatedNodeCounts();
    }

    private final void clearUpdatedNodeCounts() {
        this.nodeCountOverrides = null;
        this.nodeCountVirtualOverrides = null;
    }

    private final int compoundKeyOf(int i2, int i3, int i4) {
        return i2 == i3 ? i4 : Integer.rotateLeft(compoundKeyOf(this.reader.parent(i2), i3, i4), 3) ^ groupCompoundKeyPart(this.reader, i2);
    }

    private final PersistentMap<CompositionLocal<Object>, State<Object>> currentCompositionLocalScope() {
        if (getInserting() && this.hasProvider) {
            int parent = this.writer.getParent();
            while (parent > 0) {
                if (this.writer.groupKey(parent) == 202 && Intrinsics.areEqual(this.writer.groupObjectKey(parent), ComposerKt.getCompositionLocalMap())) {
                    Object groupAux = this.writer.groupAux(parent);
                    if (groupAux != null) {
                        return (PersistentMap) groupAux;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                }
                parent = this.writer.parent(parent);
            }
        }
        if (this.slotTable.getGroupsSize() > 0) {
            int parent2 = this.reader.getParent();
            while (parent2 > 0) {
                if (this.reader.groupKey(parent2) == 202 && Intrinsics.areEqual(this.reader.groupObjectKey(parent2), ComposerKt.getCompositionLocalMap())) {
                    PersistentMap<CompositionLocal<Object>, State<Object>> persistentMap = this.providerUpdates.get(Integer.valueOf(parent2));
                    if (persistentMap == null) {
                        Object groupAux2 = this.reader.groupAux(parent2);
                        if (groupAux2 != null) {
                            return (PersistentMap) groupAux2;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                    }
                    return persistentMap;
                }
                parent2 = this.reader.parent(parent2);
            }
        }
        return this.parentProvider;
    }

    private final void doCompose(IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> identityArrayMap, Function2<? super Composer, ? super Integer, Unit> function2) {
        if (!(!this.isComposing)) {
            ComposerKt.composeRuntimeError("Reentrant composition is not supported".toString());
            throw new KotlinNothingValueException();
        }
        Object beginSection = Trace.INSTANCE.beginSection("Compose:recompose");
        try {
            this.snapshot = SnapshotKt.currentSnapshot();
            int size$runtime_release = identityArrayMap.getSize$runtime_release();
            int i2 = 0;
            while (i2 < size$runtime_release) {
                int i3 = i2 + 1;
                Object obj = identityArrayMap.getKeys$runtime_release()[i2];
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                }
                IdentityArraySet identityArraySet = (IdentityArraySet) identityArrayMap.getValues$runtime_release()[i2];
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                Anchor anchor = recomposeScopeImpl.getAnchor();
                Integer valueOf = anchor == null ? null : Integer.valueOf(anchor.getLocation$runtime_release());
                if (valueOf == null) {
                    return;
                }
                this.invalidations.add(new Invalidation(recomposeScopeImpl, valueOf.intValue(), identityArraySet));
                i2 = i3;
            }
            List<Invalidation> list = this.invalidations;
            if (list.size() > 1) {
                CollectionsKt__MutableCollectionsJVMKt.sortWith(list, new Comparator() { // from class: androidx.compose.runtime.ComposerImpl$doCompose$lambda-25$$inlined$sortBy$1
                    @Override // java.util.Comparator
                    public final int compare(T t2, T t3) {
                        int compareValues;
                        compareValues = ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((Invalidation) t2).getLocation()), Integer.valueOf(((Invalidation) t3).getLocation()));
                        return compareValues;
                    }
                });
            }
            this.nodeIndex = 0;
            this.isComposing = true;
            startRoot();
            SnapshotStateKt.observeDerivedStateRecalculations(new ComposerImpl$doCompose$2$3(this), new ComposerImpl$doCompose$2$4(this), new ComposerImpl$doCompose$2$5(function2, this));
            endRoot();
            this.isComposing = false;
            this.invalidations.clear();
            this.providerUpdates.clear();
            Unit unit = Unit.INSTANCE;
        } finally {
            Trace.INSTANCE.endSection(beginSection);
        }
    }

    private final void doRecordDownsFor(int i2, int i3) {
        if (i2 <= 0 || i2 == i3) {
            return;
        }
        doRecordDownsFor(this.reader.parent(i2), i3);
        if (this.reader.isNode(i2)) {
            recordDown(nodeAt(this.reader, i2));
        }
    }

    private final void end(boolean z) {
        int groupKey;
        Object groupObjectKey;
        Object groupAux;
        List<KeyInfo> list;
        if (getInserting()) {
            int parent = this.writer.getParent();
            groupKey = this.writer.groupKey(parent);
            groupObjectKey = this.writer.groupObjectKey(parent);
            groupAux = this.writer.groupAux(parent);
        } else {
            int parent2 = this.reader.getParent();
            groupKey = this.reader.groupKey(parent2);
            groupObjectKey = this.reader.groupObjectKey(parent2);
            groupAux = this.reader.groupAux(parent2);
        }
        updateCompoundKeyWhenWeExitGroup(groupKey, groupObjectKey, groupAux);
        int i2 = this.groupNodeCount;
        Pending pending = this.pending;
        int i3 = 0;
        if (pending != null && pending.getKeyInfos().size() > 0) {
            List<KeyInfo> keyInfos = pending.getKeyInfos();
            List<KeyInfo> used = pending.getUsed();
            Set fastToSet = ListUtilsKt.fastToSet(used);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = used.size();
            int size2 = keyInfos.size();
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (i4 < size2) {
                KeyInfo keyInfo = keyInfos.get(i4);
                if (!fastToSet.contains(keyInfo)) {
                    recordRemoveNode(pending.nodePositionOf(keyInfo) + pending.getStartIndex(), keyInfo.getNodes());
                    pending.updateNodeCount(keyInfo.getLocation(), i3);
                    recordReaderMoving(keyInfo.getLocation());
                    this.reader.reposition(keyInfo.getLocation());
                    recordDelete();
                    this.reader.skipGroup();
                    ComposerKt.removeRange(this.invalidations, keyInfo.getLocation(), keyInfo.getLocation() + this.reader.groupSize(keyInfo.getLocation()));
                } else if (!linkedHashSet.contains(keyInfo)) {
                    if (i5 < size) {
                        KeyInfo keyInfo2 = used.get(i5);
                        if (keyInfo2 != keyInfo) {
                            int nodePositionOf = pending.nodePositionOf(keyInfo2);
                            linkedHashSet.add(keyInfo2);
                            if (nodePositionOf != i6) {
                                int updatedNodeCountOf = pending.updatedNodeCountOf(keyInfo2);
                                list = used;
                                recordMoveNode(pending.getStartIndex() + nodePositionOf, i6 + pending.getStartIndex(), updatedNodeCountOf);
                                pending.registerMoveNode(nodePositionOf, i6, updatedNodeCountOf);
                            } else {
                                list = used;
                            }
                        } else {
                            list = used;
                            i4++;
                        }
                        i5++;
                        i6 += pending.updatedNodeCountOf(keyInfo2);
                        used = list;
                    }
                    i3 = 0;
                }
                i4++;
                i3 = 0;
            }
            realizeMovement();
            if (keyInfos.size() > 0) {
                recordReaderMoving(this.reader.getGroupEnd());
                this.reader.skipToGroupEnd();
            }
        }
        int i7 = this.nodeIndex;
        while (!this.reader.isGroupEnd()) {
            int currentGroup = this.reader.getCurrentGroup();
            recordDelete();
            recordRemoveNode(i7, this.reader.skipGroup());
            ComposerKt.removeRange(this.invalidations, currentGroup, this.reader.getCurrentGroup());
        }
        boolean inserting = getInserting();
        if (inserting) {
            if (z) {
                registerInsertUpFixup();
                i2 = 1;
            }
            this.reader.endEmpty();
            int parent3 = this.writer.getParent();
            this.writer.endGroup();
            if (!this.reader.getInEmpty()) {
                int insertedGroupVirtualIndex = insertedGroupVirtualIndex(parent3);
                this.writer.endInsert();
                this.writer.close();
                recordInsert(this.insertAnchor);
                this.inserting = false;
                if (!this.slotTable.isEmpty()) {
                    updateNodeCount(insertedGroupVirtualIndex, 0);
                    updateNodeCountOverrides(insertedGroupVirtualIndex, i2);
                }
            }
        } else {
            if (z) {
                recordUp();
            }
            recordEndGroup();
            int parent4 = this.reader.getParent();
            if (i2 != updatedNodeCount(parent4)) {
                updateNodeCountOverrides(parent4, i2);
            }
            if (z) {
                i2 = 1;
            }
            this.reader.endGroup();
            realizeMovement();
        }
        exitGroup(i2, inserting);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endGroup() {
        end(false);
    }

    private final void endRoot() {
        endGroup();
        this.parentContext.doneComposing$runtime_release();
        endGroup();
        recordEndRoot();
        finalizeCompose();
        this.reader.close();
    }

    private final void ensureWriter() {
        if (this.writer.getClosed()) {
            SlotWriter openWriter = this.insertTable.openWriter();
            this.writer = openWriter;
            openWriter.skipToGroupEnd();
            this.hasProvider = false;
        }
    }

    private final void enterGroup(boolean z, Pending pending) {
        this.pendingStack.push(this.pending);
        this.pending = pending;
        this.nodeIndexStack.push(this.nodeIndex);
        if (z) {
            this.nodeIndex = 0;
        }
        this.groupNodeCountStack.push(this.groupNodeCount);
        this.groupNodeCount = 0;
    }

    private final void exitGroup(int i2, boolean z) {
        Pending pop = this.pendingStack.pop();
        if (pop != null && !z) {
            pop.setGroupIndex(pop.getGroupIndex() + 1);
        }
        this.pending = pop;
        this.nodeIndex = this.nodeIndexStack.pop() + i2;
        this.groupNodeCount = this.groupNodeCountStack.pop() + i2;
    }

    private final void finalizeCompose() {
        realizeUps();
        if (!this.pendingStack.isEmpty()) {
            ComposerKt.composeRuntimeError("Start/end imbalance".toString());
            throw new KotlinNothingValueException();
        } else if (this.startedGroups.isEmpty()) {
            cleanUpCompose();
        } else {
            ComposerKt.composeRuntimeError("Missed recording an endGroup()".toString());
            throw new KotlinNothingValueException();
        }
    }

    @InternalComposeApi
    public static /* synthetic */ void getCompoundKeyHash$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getDefaultsInvalid$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getInserting$annotations() {
    }

    private final Object getNode(SlotReader slotReader) {
        return slotReader.node(slotReader.getParent());
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getSkipping$annotations() {
    }

    private final int groupCompoundKeyPart(SlotReader slotReader, int i2) {
        Object groupAux;
        if (!slotReader.hasObjectKey(i2)) {
            int groupKey = slotReader.groupKey(i2);
            return (groupKey != 207 || (groupAux = slotReader.groupAux(i2)) == null || Intrinsics.areEqual(groupAux, Composer.Companion.getEmpty())) ? groupKey : groupAux.hashCode();
        }
        Object groupObjectKey = slotReader.groupObjectKey(i2);
        if (groupObjectKey == null) {
            return 0;
        }
        return groupObjectKey instanceof Enum ? ((Enum) groupObjectKey).ordinal() : groupObjectKey.hashCode();
    }

    private final int insertedGroupVirtualIndex(int i2) {
        return (-2) - i2;
    }

    private final Object nodeAt(SlotReader slotReader, int i2) {
        return slotReader.node(i2);
    }

    private final int nodeIndexOf(int i2, int i3, int i4, int i5) {
        int parent = this.reader.parent(i3);
        while (parent != i4 && !this.reader.isNode(parent)) {
            parent = this.reader.parent(parent);
        }
        if (this.reader.isNode(parent)) {
            i5 = 0;
        }
        if (parent == i3) {
            return i5;
        }
        int updatedNodeCount = (updatedNodeCount(parent) - this.reader.nodeCount(i3)) + i5;
        loop1: while (i5 < updatedNodeCount && parent != i2) {
            parent++;
            while (parent < i2) {
                int groupSize = this.reader.groupSize(parent) + parent;
                if (i2 < groupSize) {
                    break;
                }
                i5 += updatedNodeCount(parent);
                parent = groupSize;
            }
            break loop1;
        }
        return i5;
    }

    private final void realizeDowns() {
        if (this.downNodes.isNotEmpty()) {
            realizeDowns(this.downNodes.toArray());
            this.downNodes.clear();
        }
    }

    private final void realizeDowns(Object[] objArr) {
        record(new ComposerImpl$realizeDowns$1(objArr));
    }

    private final void realizeMovement() {
        Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> composerImpl$realizeMovement$2;
        int i2 = this.previousCount;
        this.previousCount = 0;
        if (i2 > 0) {
            int i3 = this.previousRemove;
            if (i3 >= 0) {
                this.previousRemove = -1;
                composerImpl$realizeMovement$2 = new ComposerImpl$realizeMovement$1(i3, i2);
            } else {
                int i4 = this.previousMoveFrom;
                this.previousMoveFrom = -1;
                int i5 = this.previousMoveTo;
                this.previousMoveTo = -1;
                composerImpl$realizeMovement$2 = new ComposerImpl$realizeMovement$2(i4, i5, i2);
            }
            recordApplierOperation(composerImpl$realizeMovement$2);
        }
    }

    private final void realizeOperationLocation(boolean z) {
        int parent = z ? this.reader.getParent() : this.reader.getCurrentGroup();
        int i2 = parent - this.writersReaderDelta;
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException("Tried to seek backward".toString());
        }
        if (i2 > 0) {
            record(new ComposerImpl$realizeOperationLocation$2(i2));
            this.writersReaderDelta = parent;
        }
    }

    public static /* synthetic */ void realizeOperationLocation$default(ComposerImpl composerImpl, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        composerImpl.realizeOperationLocation(z);
    }

    private final void realizeUps() {
        int i2 = this.pendingUps;
        if (i2 > 0) {
            this.pendingUps = 0;
            record(new ComposerImpl$realizeUps$1(i2));
        }
    }

    private final void recomposeToGroupEnd() {
        Invalidation firstInRange;
        boolean z = this.isComposing;
        this.isComposing = true;
        int parent = this.reader.getParent();
        int groupSize = this.reader.groupSize(parent) + parent;
        int i2 = this.nodeIndex;
        int compoundKeyHash = getCompoundKeyHash();
        int i3 = this.groupNodeCount;
        firstInRange = ComposerKt.firstInRange(this.invalidations, this.reader.getCurrentGroup(), groupSize);
        boolean z2 = false;
        int i4 = parent;
        while (firstInRange != null) {
            int location = firstInRange.getLocation();
            ComposerKt.removeLocation(this.invalidations, location);
            if (firstInRange.isInvalid()) {
                this.reader.reposition(location);
                int currentGroup = this.reader.getCurrentGroup();
                recordUpsAndDowns(i4, currentGroup, parent);
                this.nodeIndex = nodeIndexOf(location, currentGroup, parent, i2);
                this.compoundKeyHash = compoundKeyOf(this.reader.parent(currentGroup), parent, compoundKeyHash);
                firstInRange.getScope().compose(this);
                this.reader.restoreParent(parent);
                i4 = currentGroup;
                z2 = true;
            } else {
                this.invalidateStack.push(firstInRange.getScope());
                firstInRange.getScope().rereadTrackedInstances();
                this.invalidateStack.pop();
            }
            firstInRange = ComposerKt.firstInRange(this.invalidations, this.reader.getCurrentGroup(), groupSize);
        }
        if (z2) {
            recordUpsAndDowns(i4, parent, parent);
            this.reader.skipToGroupEnd();
            int updatedNodeCount = updatedNodeCount(parent);
            this.nodeIndex = i2 + updatedNodeCount;
            this.groupNodeCount = i3 + updatedNodeCount;
        } else {
            skipReaderToGroupEnd();
        }
        this.compoundKeyHash = compoundKeyHash;
        this.isComposing = z;
    }

    private final void record(Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> function3) {
        this.changes.add(function3);
    }

    private final void recordApplierOperation(Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> function3) {
        realizeUps();
        realizeDowns();
        record(function3);
    }

    private final void recordDelete() {
        Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> function3;
        function3 = ComposerKt.removeCurrentGroupInstance;
        recordSlotEditingOperation(function3);
        this.writersReaderDelta += this.reader.getGroupSize();
    }

    private final void recordDown(Object obj) {
        this.downNodes.push(obj);
    }

    private final void recordEndGroup() {
        Function3 function3;
        int parent = this.reader.getParent();
        if (!(this.startedGroups.peekOr(-1) <= parent)) {
            ComposerKt.composeRuntimeError("Missed recording an endGroup".toString());
            throw new KotlinNothingValueException();
        } else if (this.startedGroups.peekOr(-1) == parent) {
            this.startedGroups.pop();
            function3 = ComposerKt.endGroupInstance;
            recordSlotTableOperation$default(this, false, function3, 1, null);
        }
    }

    private final void recordEndRoot() {
        Function3 function3;
        if (this.startedGroup) {
            function3 = ComposerKt.endGroupInstance;
            recordSlotTableOperation$default(this, false, function3, 1, null);
            this.startedGroup = false;
        }
    }

    private final void recordFixup(Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> function3) {
        this.insertFixups.add(function3);
    }

    private final void recordInsert(Anchor anchor) {
        List mutableList;
        if (this.insertFixups.isEmpty()) {
            recordSlotEditingOperation(new ComposerImpl$recordInsert$1(this.insertTable, anchor));
            return;
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) this.insertFixups);
        this.insertFixups.clear();
        realizeUps();
        realizeDowns();
        recordSlotEditingOperation(new ComposerImpl$recordInsert$2(this.insertTable, anchor, mutableList));
    }

    private final void recordInsertUpFixup(Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> function3) {
        this.insertUpFixups.push(function3);
    }

    private final void recordMoveNode(int i2, int i3, int i4) {
        if (i4 > 0) {
            int i5 = this.previousCount;
            if (i5 > 0 && this.previousMoveFrom == i2 - i5 && this.previousMoveTo == i3 - i5) {
                this.previousCount = i5 + i4;
                return;
            }
            realizeMovement();
            this.previousMoveFrom = i2;
            this.previousMoveTo = i3;
            this.previousCount = i4;
        }
    }

    private final void recordReaderMoving(int i2) {
        this.writersReaderDelta = i2 - (this.reader.getCurrentGroup() - this.writersReaderDelta);
    }

    private final void recordRemoveNode(int i2, int i3) {
        if (i3 > 0) {
            if (!(i2 >= 0)) {
                ComposerKt.composeRuntimeError(Intrinsics.stringPlus("Invalid remove index ", Integer.valueOf(i2)).toString());
                throw new KotlinNothingValueException();
            } else if (this.previousRemove == i2) {
                this.previousCount += i3;
            } else {
                realizeMovement();
                this.previousRemove = i2;
                this.previousCount = i3;
            }
        }
    }

    private final void recordSlotEditing() {
        SlotReader slotReader;
        int parent;
        Function3 function3;
        if (this.slotTable.isEmpty() || this.startedGroups.peekOr(-1) == (parent = (slotReader = this.reader).getParent())) {
            return;
        }
        if (!this.startedGroup) {
            function3 = ComposerKt.startRootGroup;
            recordSlotTableOperation$default(this, false, function3, 1, null);
            this.startedGroup = true;
        }
        Anchor anchor = slotReader.anchor(parent);
        this.startedGroups.push(parent);
        recordSlotTableOperation$default(this, false, new ComposerImpl$recordSlotEditing$1(anchor), 1, null);
    }

    private final void recordSlotEditingOperation(Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> function3) {
        realizeOperationLocation$default(this, false, 1, null);
        recordSlotEditing();
        record(function3);
    }

    private final void recordSlotTableOperation(boolean z, Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> function3) {
        realizeOperationLocation(z);
        record(function3);
    }

    public static /* synthetic */ void recordSlotTableOperation$default(ComposerImpl composerImpl, boolean z, Function3 function3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        composerImpl.recordSlotTableOperation(z, function3);
    }

    private final void recordUp() {
        if (this.downNodes.isNotEmpty()) {
            this.downNodes.pop();
        } else {
            this.pendingUps++;
        }
    }

    private final void recordUpsAndDowns(int i2, int i3, int i4) {
        int nearestCommonRootOf;
        SlotReader slotReader = this.reader;
        nearestCommonRootOf = ComposerKt.nearestCommonRootOf(slotReader, i2, i3, i4);
        while (i2 > 0 && i2 != nearestCommonRootOf) {
            if (slotReader.isNode(i2)) {
                recordUp();
            }
            i2 = slotReader.parent(i2);
        }
        doRecordDownsFor(i3, nearestCommonRootOf);
    }

    private final void registerInsertUpFixup() {
        this.insertFixups.add(this.insertUpFixups.pop());
    }

    private final <T> T resolveCompositionLocal(CompositionLocal<T> compositionLocal, PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap) {
        return ComposerKt.contains(persistentMap, compositionLocal) ? (T) ComposerKt.getValueOf(persistentMap, compositionLocal) : compositionLocal.getDefaultValueHolder$runtime_release().getValue();
    }

    private final void skipGroup() {
        this.groupNodeCount += this.reader.skipGroup();
    }

    private final void skipReaderToGroupEnd() {
        this.groupNodeCount = this.reader.getParentNodes();
        this.reader.skipToGroupEnd();
    }

    private final void start(int i2, Object obj, boolean z, Object obj2) {
        validateNodeNotExpected();
        updateCompoundKeyWhenWeEnterGroup(i2, obj, obj2);
        Pending pending = null;
        if (getInserting()) {
            this.reader.beginEmpty();
            int currentGroup = this.writer.getCurrentGroup();
            if (z) {
                this.writer.startNode(Composer.Companion.getEmpty());
            } else if (obj2 != null) {
                SlotWriter slotWriter = this.writer;
                if (obj == null) {
                    obj = Composer.Companion.getEmpty();
                }
                slotWriter.startData(i2, obj, obj2);
            } else {
                SlotWriter slotWriter2 = this.writer;
                if (obj == null) {
                    obj = Composer.Companion.getEmpty();
                }
                slotWriter2.startGroup(i2, obj);
            }
            Pending pending2 = this.pending;
            if (pending2 != null) {
                KeyInfo keyInfo = new KeyInfo(i2, -1, insertedGroupVirtualIndex(currentGroup), -1, 0);
                pending2.registerInsert(keyInfo, this.nodeIndex - pending2.getStartIndex());
                pending2.recordUsed(keyInfo);
            }
            enterGroup(z, null);
            return;
        }
        if (this.pending == null) {
            if (this.reader.getGroupKey() == i2 && Intrinsics.areEqual(obj, this.reader.getGroupObjectKey())) {
                startReaderGroup(z, obj2);
            } else {
                this.pending = new Pending(this.reader.extractKeys(), this.nodeIndex);
            }
        }
        Pending pending3 = this.pending;
        if (pending3 != null) {
            KeyInfo next = pending3.getNext(i2, obj);
            if (next != null) {
                pending3.recordUsed(next);
                int location = next.getLocation();
                this.nodeIndex = pending3.nodePositionOf(next) + pending3.getStartIndex();
                int slotPositionOf = pending3.slotPositionOf(next);
                int groupIndex = slotPositionOf - pending3.getGroupIndex();
                pending3.registerMoveSlot(slotPositionOf, pending3.getGroupIndex());
                recordReaderMoving(location);
                this.reader.reposition(location);
                if (groupIndex > 0) {
                    recordSlotEditingOperation(new ComposerImpl$start$2(groupIndex));
                }
                startReaderGroup(z, obj2);
            } else {
                this.reader.beginEmpty();
                this.inserting = true;
                ensureWriter();
                this.writer.beginInsert();
                int currentGroup2 = this.writer.getCurrentGroup();
                if (z) {
                    this.writer.startNode(Composer.Companion.getEmpty());
                } else if (obj2 != null) {
                    SlotWriter slotWriter3 = this.writer;
                    if (obj == null) {
                        obj = Composer.Companion.getEmpty();
                    }
                    slotWriter3.startData(i2, obj, obj2);
                } else {
                    SlotWriter slotWriter4 = this.writer;
                    if (obj == null) {
                        obj = Composer.Companion.getEmpty();
                    }
                    slotWriter4.startGroup(i2, obj);
                }
                this.insertAnchor = this.writer.anchor(currentGroup2);
                KeyInfo keyInfo2 = new KeyInfo(i2, -1, insertedGroupVirtualIndex(currentGroup2), -1, 0);
                pending3.registerInsert(keyInfo2, this.nodeIndex - pending3.getStartIndex());
                pending3.recordUsed(keyInfo2);
                pending = new Pending(new ArrayList(), z ? 0 : this.nodeIndex);
            }
        }
        enterGroup(z, pending);
    }

    private final void startGroup(int i2) {
        start(i2, null, false, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startGroup(int i2, Object obj) {
        start(i2, obj, false, null);
    }

    private final void startReaderGroup(boolean z, Object obj) {
        if (z) {
            this.reader.startNode();
            return;
        }
        if (obj != null && this.reader.getGroupAux() != obj) {
            recordSlotTableOperation$default(this, false, new ComposerImpl$startReaderGroup$1(obj), 1, null);
        }
        this.reader.startGroup();
    }

    private final void startRoot() {
        int asInt;
        this.reader = this.slotTable.openReader();
        startGroup(100);
        this.parentContext.startComposing$runtime_release();
        this.parentProvider = this.parentContext.getCompositionLocalScope$runtime_release();
        IntStack intStack = this.providersInvalidStack;
        asInt = ComposerKt.asInt(this.providersInvalid);
        intStack.push(asInt);
        this.providersInvalid = changed(this.parentProvider);
        if (!this.collectParameterInformation) {
            this.collectParameterInformation = this.parentContext.getCollectingParameterInformation$runtime_release();
        }
        Set<CompositionData> set = (Set) resolveCompositionLocal(InspectionTablesKt.getLocalInspectionTables(), this.parentProvider);
        if (set != null) {
            set.add(this.slotTable);
            this.parentContext.recordInspectionTable$runtime_release(set);
        }
        startGroup(this.parentContext.getCompoundHashKey$runtime_release());
    }

    private final void updateCompoundKeyWhenWeEnterGroup(int i2, Object obj, Object obj2) {
        if (obj != null) {
            i2 = obj instanceof Enum ? ((Enum) obj).ordinal() : obj.hashCode();
        } else if (obj2 != null && i2 == 207 && !Intrinsics.areEqual(obj2, Composer.Companion.getEmpty())) {
            i2 = obj2.hashCode();
        }
        updateCompoundKeyWhenWeEnterGroupKeyHash(i2);
    }

    private final void updateCompoundKeyWhenWeEnterGroupKeyHash(int i2) {
        this.compoundKeyHash = i2 ^ Integer.rotateLeft(getCompoundKeyHash(), 3);
    }

    private final void updateCompoundKeyWhenWeExitGroup(int i2, Object obj, Object obj2) {
        if (obj != null) {
            i2 = obj instanceof Enum ? ((Enum) obj).ordinal() : obj.hashCode();
        } else if (obj2 != null && i2 == 207 && !Intrinsics.areEqual(obj2, Composer.Companion.getEmpty())) {
            i2 = obj2.hashCode();
        }
        updateCompoundKeyWhenWeExitGroupKeyHash(i2);
    }

    private final void updateCompoundKeyWhenWeExitGroupKeyHash(int i2) {
        this.compoundKeyHash = Integer.rotateRight(Integer.hashCode(i2) ^ getCompoundKeyHash(), 3);
    }

    private final void updateNodeCount(int i2, int i3) {
        if (updatedNodeCount(i2) != i3) {
            if (i2 < 0) {
                HashMap<Integer, Integer> hashMap = this.nodeCountVirtualOverrides;
                if (hashMap == null) {
                    hashMap = new HashMap<>();
                    this.nodeCountVirtualOverrides = hashMap;
                }
                hashMap.put(Integer.valueOf(i2), Integer.valueOf(i3));
                return;
            }
            int[] iArr = this.nodeCountOverrides;
            if (iArr == null) {
                iArr = new int[this.reader.getSize()];
                ArraysKt___ArraysJvmKt.fill$default(iArr, -1, 0, 0, 6, (Object) null);
                this.nodeCountOverrides = iArr;
            }
            iArr[i2] = i3;
        }
    }

    private final void updateNodeCountOverrides(int i2, int i3) {
        int updatedNodeCount = updatedNodeCount(i2);
        if (updatedNodeCount != i3) {
            int i4 = i3 - updatedNodeCount;
            int size = this.pendingStack.getSize() - 1;
            while (i2 != -1) {
                int updatedNodeCount2 = updatedNodeCount(i2) + i4;
                updateNodeCount(i2, updatedNodeCount2);
                if (size >= 0) {
                    int i5 = size;
                    while (true) {
                        int i6 = i5 - 1;
                        Pending peek = this.pendingStack.peek(i5);
                        if (peek != null && peek.updateNodeCount(i2, updatedNodeCount2)) {
                            size = i5 - 1;
                            break;
                        } else if (i6 < 0) {
                            break;
                        } else {
                            i5 = i6;
                        }
                    }
                }
                if (i2 < 0) {
                    i2 = this.reader.getParent();
                } else if (this.reader.isNode(i2)) {
                    return;
                } else {
                    i2 = this.reader.parent(i2);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final PersistentMap<CompositionLocal<Object>, State<Object>> updateProviderMapGroup(PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap, PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap2) {
        PersistentMap.Builder<CompositionLocal<Object>, ? extends State<? extends Object>> builder = persistentMap.builder();
        builder.putAll(persistentMap2);
        PersistentMap build = builder.build();
        startGroup(ComposerKt.providerMapsKey, ComposerKt.getProviderMaps());
        changed(build);
        changed(persistentMap2);
        endGroup();
        return build;
    }

    private final int updatedNodeCount(int i2) {
        int i3;
        Integer num;
        if (i2 >= 0) {
            int[] iArr = this.nodeCountOverrides;
            return (iArr == null || (i3 = iArr[i2]) < 0) ? this.reader.nodeCount(i2) : i3;
        }
        HashMap<Integer, Integer> hashMap = this.nodeCountVirtualOverrides;
        if (hashMap == null || (num = hashMap.get(Integer.valueOf(i2))) == null) {
            return 0;
        }
        return num.intValue();
    }

    private final void validateNodeExpected() {
        if (this.nodeExpected) {
            this.nodeExpected = false;
        } else {
            ComposerKt.composeRuntimeError("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
            throw new KotlinNothingValueException();
        }
    }

    private final void validateNodeNotExpected() {
        if (!this.nodeExpected) {
            return;
        }
        ComposerKt.composeRuntimeError("A call to createNode(), emitNode() or useNode() expected".toString());
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.Composer
    public <V, T> void apply(V v2, @NotNull Function2<? super T, ? super V, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        ComposerImpl$apply$operation$1 composerImpl$apply$operation$1 = new ComposerImpl$apply$operation$1(block, v2);
        if (getInserting()) {
            recordFixup(composerImpl$apply$operation$1);
        } else {
            recordApplierOperation(composerImpl$apply$operation$1);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @NotNull
    public CompositionContext buildContext() {
        startGroup(ComposerKt.referenceKey, ComposerKt.getReference());
        Object nextSlot = nextSlot();
        CompositionContextHolder compositionContextHolder = nextSlot instanceof CompositionContextHolder ? (CompositionContextHolder) nextSlot : null;
        if (compositionContextHolder == null) {
            compositionContextHolder = new CompositionContextHolder(new CompositionContextImpl(this, getCompoundKeyHash(), this.collectParameterInformation));
            updateValue(compositionContextHolder);
        }
        compositionContextHolder.getRef().updateCompositionLocalScope(currentCompositionLocalScope());
        endGroup();
        return compositionContextHolder.getRef();
    }

    @ComposeCompilerApi
    public final <T> T cache(boolean z, @NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        T t2 = (T) nextSlot();
        if (t2 == Composer.Companion.getEmpty() || z) {
            T invoke = block.invoke();
            updateValue(invoke);
            return invoke;
        }
        return t2;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(byte b2) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Byte) && b2 == ((Number) nextSlot).byteValue()) {
            return false;
        }
        updateValue(Byte.valueOf(b2));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(char c2) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Character) && c2 == ((Character) nextSlot).charValue()) {
            return false;
        }
        updateValue(Character.valueOf(c2));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(double d2) {
        Object nextSlot = nextSlot();
        if (nextSlot instanceof Double) {
            if (d2 == ((Number) nextSlot).doubleValue()) {
                return false;
            }
        }
        updateValue(Double.valueOf(d2));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(float f2) {
        Object nextSlot = nextSlot();
        if (nextSlot instanceof Float) {
            if (f2 == ((Number) nextSlot).floatValue()) {
                return false;
            }
        }
        updateValue(Float.valueOf(f2));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(int i2) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Integer) && i2 == ((Number) nextSlot).intValue()) {
            return false;
        }
        updateValue(Integer.valueOf(i2));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(long j2) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Long) && j2 == ((Number) nextSlot).longValue()) {
            return false;
        }
        updateValue(Long.valueOf(j2));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(@Nullable Object obj) {
        if (Intrinsics.areEqual(nextSlot(), obj)) {
            return false;
        }
        updateValue(obj);
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(short s2) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Short) && s2 == ((Number) nextSlot).shortValue()) {
            return false;
        }
        updateValue(Short.valueOf(s2));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(boolean z) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Boolean) && z == ((Boolean) nextSlot).booleanValue()) {
            return false;
        }
        updateValue(Boolean.valueOf(z));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public void collectParameterInformation() {
        this.collectParameterInformation = true;
    }

    public final void composeContent$runtime_release(@NotNull IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> invalidationsRequested, @NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(invalidationsRequested, "invalidationsRequested");
        Intrinsics.checkNotNullParameter(content, "content");
        if (this.changes.isEmpty()) {
            doCompose(invalidationsRequested, content);
        } else {
            ComposerKt.composeRuntimeError("Expected applyChanges() to have been called".toString());
            throw new KotlinNothingValueException();
        }
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public <T> T consume(@NotNull CompositionLocal<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) resolveCompositionLocal(key, currentCompositionLocalScope());
    }

    @Override // androidx.compose.runtime.Composer
    public <T> void createNode(@NotNull Function0<? extends T> factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        validateNodeExpected();
        if (!getInserting()) {
            ComposerKt.composeRuntimeError("createNode() can only be called when inserting".toString());
            throw new KotlinNothingValueException();
        }
        int peek = this.nodeIndexStack.peek();
        SlotWriter slotWriter = this.writer;
        Anchor anchor = slotWriter.anchor(slotWriter.getParent());
        this.groupNodeCount++;
        recordFixup(new ComposerImpl$createNode$2(factory, anchor, peek));
        recordInsertUpFixup(new ComposerImpl$createNode$3(anchor, peek));
    }

    @Override // androidx.compose.runtime.Composer
    public void disableReusing() {
        this.reusing = false;
    }

    public final void dispose$runtime_release() {
        Trace trace = Trace.INSTANCE;
        Object beginSection = trace.beginSection("Compose:Composer.dispose");
        try {
            this.parentContext.unregisterComposer$runtime_release(this);
            this.invalidateStack.clear();
            this.invalidations.clear();
            this.changes.clear();
            getApplier().clear();
            this.isDisposed = true;
            Unit unit = Unit.INSTANCE;
            trace.endSection(beginSection);
        } catch (Throwable th) {
            Trace.INSTANCE.endSection(beginSection);
            throw th;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void enableReusing() {
        this.reusing = this.reusingGroup >= 0;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endDefaults() {
        endGroup();
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release == null || !currentRecomposeScope$runtime_release.getUsed()) {
            return;
        }
        currentRecomposeScope$runtime_release.setDefaultsInScope(true);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endMovableGroup() {
        endGroup();
    }

    @Override // androidx.compose.runtime.Composer
    public void endNode() {
        end(true);
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void endProviders() {
        boolean asBool;
        endGroup();
        endGroup();
        asBool = ComposerKt.asBool(this.providersInvalidStack.pop());
        this.providersInvalid = asBool;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endReplaceableGroup() {
        endGroup();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    @Nullable
    public ScopeUpdateScope endRestartGroup() {
        Anchor anchor;
        Function1<Composition, Unit> end;
        RecomposeScopeImpl recomposeScopeImpl = null;
        RecomposeScopeImpl pop = this.invalidateStack.isNotEmpty() ? this.invalidateStack.pop() : null;
        if (pop != null) {
            pop.setRequiresRecompose(false);
        }
        if (pop != null && (end = pop.end(this.snapshot.getId())) != null) {
            record(new ComposerImpl$endRestartGroup$1$1(end, this));
        }
        if (pop != null && !pop.getSkipped$runtime_release() && (pop.getUsed() || this.collectParameterInformation)) {
            if (pop.getAnchor() == null) {
                if (getInserting()) {
                    SlotWriter slotWriter = this.writer;
                    anchor = slotWriter.anchor(slotWriter.getParent());
                } else {
                    SlotReader slotReader = this.reader;
                    anchor = slotReader.anchor(slotReader.getParent());
                }
                pop.setAnchor(anchor);
            }
            pop.setDefaultsInvalid(false);
            recomposeScopeImpl = pop;
        }
        end(false);
        return recomposeScopeImpl;
    }

    @Override // androidx.compose.runtime.Composer
    public void endReusableGroup() {
        if (this.reusing && this.reader.getParent() == this.reusingGroup) {
            this.reusingGroup = -1;
            this.reusing = false;
        }
        end(false);
    }

    @Override // androidx.compose.runtime.Composer
    @NotNull
    public Applier<?> getApplier() {
        return this.applier;
    }

    @Override // androidx.compose.runtime.Composer
    @NotNull
    public CoroutineContext getApplyCoroutineContext() {
        return this.parentContext.getEffectCoroutineContext$runtime_release();
    }

    public final boolean getAreChildrenComposing$runtime_release() {
        return this.childrenComposing > 0;
    }

    public final int getChangeCount$runtime_release() {
        return this.changes.size();
    }

    @Override // androidx.compose.runtime.Composer
    @NotNull
    public ControlledComposition getComposition() {
        return this.composition;
    }

    @Override // androidx.compose.runtime.Composer
    @NotNull
    public CompositionData getCompositionData() {
        return this.slotTable;
    }

    @Override // androidx.compose.runtime.Composer
    public int getCompoundKeyHash() {
        return this.compoundKeyHash;
    }

    @Nullable
    public final RecomposeScopeImpl getCurrentRecomposeScope$runtime_release() {
        Stack<RecomposeScopeImpl> stack = this.invalidateStack;
        if (this.childrenComposing == 0 && stack.isNotEmpty()) {
            return stack.peek();
        }
        return null;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getDefaultsInvalid() {
        if (!this.providersInvalid) {
            RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
            if (!(currentRecomposeScope$runtime_release != null && currentRecomposeScope$runtime_release.getDefaultsInvalid())) {
                return false;
            }
        }
        return true;
    }

    public final boolean getHasInvalidations() {
        return !this.invalidations.isEmpty();
    }

    public final boolean getHasPendingChanges$runtime_release() {
        return !this.changes.isEmpty();
    }

    @NotNull
    public final SlotTable getInsertTable$runtime_release() {
        return this.insertTable;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getInserting() {
        return this.inserting;
    }

    @Override // androidx.compose.runtime.Composer
    @Nullable
    public RecomposeScope getRecomposeScope() {
        return getCurrentRecomposeScope$runtime_release();
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getSkipping() {
        if (!getInserting() && !this.reusing && !this.providersInvalid) {
            RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
            if ((currentRecomposeScope$runtime_release == null || currentRecomposeScope$runtime_release.getRequiresRecompose()) ? false : true) {
                return true;
            }
        }
        return false;
    }

    public final boolean isComposing$runtime_release() {
        return this.isComposing;
    }

    public final boolean isDisposed$runtime_release() {
        return this.isDisposed;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    @NotNull
    public Object joinKey(@Nullable Object obj, @Nullable Object obj2) {
        Object key;
        key = ComposerKt.getKey(this.reader.getGroupObjectKey(), obj, obj2);
        return key == null ? new JoinedKey(obj, obj2) : key;
    }

    @PublishedApi
    @Nullable
    public final Object nextSlot() {
        if (getInserting()) {
            validateNodeNotExpected();
        } else {
            Object next = this.reader.next();
            if (!this.reusing) {
                return next;
            }
        }
        return Composer.Companion.getEmpty();
    }

    public final void prepareCompose$runtime_release(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (!(!this.isComposing)) {
            ComposerKt.composeRuntimeError("Preparing a composition while composing is not supported".toString());
            throw new KotlinNothingValueException();
        }
        this.isComposing = true;
        try {
            block.invoke();
        } finally {
            this.isComposing = false;
        }
    }

    public final boolean recompose$runtime_release(@NotNull IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> invalidationsRequested) {
        Intrinsics.checkNotNullParameter(invalidationsRequested, "invalidationsRequested");
        if (!this.changes.isEmpty()) {
            ComposerKt.composeRuntimeError("Expected applyChanges() to have been called".toString());
            throw new KotlinNothingValueException();
        } else if (invalidationsRequested.isNotEmpty() || (!this.invalidations.isEmpty())) {
            doCompose(invalidationsRequested, null);
            return !this.changes.isEmpty();
        } else {
            return false;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void recordSideEffect(@NotNull Function0<Unit> effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        record(new ComposerImpl$recordSideEffect$1(effect));
    }

    @Override // androidx.compose.runtime.Composer
    public void recordUsed(@NotNull RecomposeScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        RecomposeScopeImpl recomposeScopeImpl = scope instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) scope : null;
        if (recomposeScopeImpl == null) {
            return;
        }
        recomposeScopeImpl.setUsed(true);
    }

    @Override // androidx.compose.runtime.Composer
    @Nullable
    public Object rememberedValue() {
        return nextSlot();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void skipCurrentGroup() {
        if (this.invalidations.isEmpty()) {
            skipGroup();
            return;
        }
        SlotReader slotReader = this.reader;
        int groupKey = slotReader.getGroupKey();
        Object groupObjectKey = slotReader.getGroupObjectKey();
        Object groupAux = slotReader.getGroupAux();
        updateCompoundKeyWhenWeEnterGroup(groupKey, groupObjectKey, groupAux);
        startReaderGroup(slotReader.isNode(), null);
        recomposeToGroupEnd();
        slotReader.endGroup();
        updateCompoundKeyWhenWeExitGroup(groupKey, groupObjectKey, groupAux);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void skipToGroupEnd() {
        if (!(this.groupNodeCount == 0)) {
            ComposerKt.composeRuntimeError("No nodes can be emitted before calling skipAndEndGroup".toString());
            throw new KotlinNothingValueException();
        }
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release != null) {
            currentRecomposeScope$runtime_release.scopeSkipped();
        }
        if (this.invalidations.isEmpty()) {
            skipReaderToGroupEnd();
        } else {
            recomposeToGroupEnd();
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformation(@NotNull String sourceInformation) {
        Intrinsics.checkNotNullParameter(sourceInformation, "sourceInformation");
        if (getInserting()) {
            this.writer.insertAux(sourceInformation);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformationMarkerEnd() {
        end(false);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformationMarkerStart(int i2, @NotNull String sourceInformation) {
        Intrinsics.checkNotNullParameter(sourceInformation, "sourceInformation");
        start(i2, null, false, sourceInformation);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startDefaults() {
        start(-127, null, false, null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startMovableGroup(int i2, @Nullable Object obj) {
        start(i2, obj, false, null);
    }

    @Override // androidx.compose.runtime.Composer
    public void startNode() {
        boolean inserting = getInserting();
        int i2 = androidx.appcompat.R.styleable.AppCompatTheme_windowNoTitle;
        if (inserting || (!this.reusing ? this.reader.getGroupKey() != 126 : this.reader.getGroupKey() != 125)) {
            i2 = 125;
        }
        start(i2, null, true, null);
        this.nodeExpected = true;
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void startProviders(@NotNull ProvidedValue<?>[] values) {
        PersistentMap<CompositionLocal<Object>, State<Object>> updateProviderMapGroup;
        boolean z;
        int asInt;
        Intrinsics.checkNotNullParameter(values, "values");
        PersistentMap<CompositionLocal<Object>, State<Object>> currentCompositionLocalScope = currentCompositionLocalScope();
        startGroup(ComposerKt.providerKey, ComposerKt.getProvider());
        startGroup(ComposerKt.providerValuesKey, ComposerKt.getProviderValues());
        PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap = (PersistentMap) ComposerKt.invokeComposableForResult(this, new ComposerImpl$startProviders$currentProviders$1(values, currentCompositionLocalScope));
        endGroup();
        if (getInserting()) {
            updateProviderMapGroup = updateProviderMapGroup(currentCompositionLocalScope, persistentMap);
            this.hasProvider = true;
        } else {
            Object groupGet = this.reader.groupGet(0);
            if (groupGet == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            }
            PersistentMap<CompositionLocal<Object>, State<Object>> persistentMap2 = (PersistentMap) groupGet;
            Object groupGet2 = this.reader.groupGet(1);
            if (groupGet2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            }
            PersistentMap persistentMap3 = (PersistentMap) groupGet2;
            if (!getSkipping() || !Intrinsics.areEqual(persistentMap3, persistentMap)) {
                updateProviderMapGroup = updateProviderMapGroup(currentCompositionLocalScope, persistentMap);
                z = !Intrinsics.areEqual(updateProviderMapGroup, persistentMap2);
                if (z && !getInserting()) {
                    this.providerUpdates.put(Integer.valueOf(this.reader.getCurrentGroup()), updateProviderMapGroup);
                }
                IntStack intStack = this.providersInvalidStack;
                asInt = ComposerKt.asInt(this.providersInvalid);
                intStack.push(asInt);
                this.providersInvalid = z;
                start(ComposerKt.compositionLocalMapKey, ComposerKt.getCompositionLocalMap(), false, updateProviderMapGroup);
            }
            skipGroup();
            updateProviderMapGroup = persistentMap2;
        }
        z = false;
        if (z) {
            this.providerUpdates.put(Integer.valueOf(this.reader.getCurrentGroup()), updateProviderMapGroup);
        }
        IntStack intStack2 = this.providersInvalidStack;
        asInt = ComposerKt.asInt(this.providersInvalid);
        intStack2.push(asInt);
        this.providersInvalid = z;
        start(ComposerKt.compositionLocalMapKey, ComposerKt.getCompositionLocalMap(), false, updateProviderMapGroup);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startReplaceableGroup(int i2) {
        start(i2, null, false, null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    @NotNull
    public Composer startRestartGroup(int i2) {
        start(i2, null, false, null);
        addRecomposeScope();
        return this;
    }

    @Override // androidx.compose.runtime.Composer
    public void startReusableGroup(int i2, @Nullable Object obj) {
        if (this.reader.getGroupKey() == i2 && !Intrinsics.areEqual(this.reader.getGroupAux(), obj) && this.reusingGroup < 0) {
            this.reusingGroup = this.reader.getCurrentGroup();
            this.reusing = true;
        }
        start(i2, null, false, obj);
    }

    @Override // androidx.compose.runtime.Composer
    public void startReusableNode() {
        start(androidx.appcompat.R.styleable.AppCompatTheme_windowMinWidthMinor, null, true, null);
        this.nodeExpected = true;
    }

    public final boolean tryImminentInvalidation$runtime_release(@NotNull RecomposeScopeImpl scope, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Anchor anchor = scope.getAnchor();
        if (anchor == null) {
            return false;
        }
        int indexFor = anchor.toIndexFor(this.slotTable);
        if (!this.isComposing || indexFor < this.reader.getCurrentGroup()) {
            return false;
        }
        ComposerKt.insertIfMissing(this.invalidations, indexFor, scope, obj);
        return true;
    }

    @PublishedApi
    public final void updateCachedValue(@Nullable Object obj) {
        updateValue(obj);
    }

    @Override // androidx.compose.runtime.Composer
    public void updateRememberedValue(@Nullable Object obj) {
        updateValue(obj);
    }

    @PublishedApi
    public final void updateValue(@Nullable Object obj) {
        if (!getInserting()) {
            int groupSlotIndex = this.reader.getGroupSlotIndex() - 1;
            if (obj instanceof RememberObserver) {
                this.abandonSet.add(obj);
            }
            recordSlotTableOperation(true, new ComposerImpl$updateValue$2(obj, groupSlotIndex));
            return;
        }
        this.writer.update(obj);
        if (obj instanceof RememberObserver) {
            record(new ComposerImpl$updateValue$1(obj));
            this.abandonSet.add(obj);
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void useNode() {
        validateNodeExpected();
        if (!getInserting()) {
            recordDown(getNode(this.reader));
        } else {
            ComposerKt.composeRuntimeError("useNode() called while inserting".toString());
            throw new KotlinNothingValueException();
        }
    }
}
