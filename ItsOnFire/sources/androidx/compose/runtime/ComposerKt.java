package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000Ä\u0001\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0010\u001a\u0010\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0000\u001ai\u0010>\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010@\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010A0?j\u0002`B2\u0012\u0010C\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030E0D2&\u0010F\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010@\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010A0?j\u0002`BH\u0003¢\u0006\u0002\u0010G\u001a(\u0010H\u001a\u0004\u0018\u00010\u00012\b\u0010I\u001a\u0004\u0018\u00010\u00012\b\u0010J\u001a\u0004\u0018\u00010\u00012\b\u0010K\u001a\u0004\u0018\u00010\u0001H\u0002\u001a(\u0010L\u001a\u00020\u00142\u0006\u0010M\u001a\u00020N2\u0011\u0010O\u001a\r\u0012\u0004\u0012\u00020\u00140P¢\u0006\u0002\bQH\u0000¢\u0006\u0002\u0010R\u001a.\u0010S\u001a\u0002HT\"\u0004\b\u0000\u0010T2\u0006\u0010M\u001a\u00020N2\u0011\u0010O\u001a\r\u0012\u0004\u0012\u0002HT0P¢\u0006\u0002\bQH\u0000¢\u0006\u0002\u0010U\u001aP\u0010V\u001a>\u0012\u0004\u0012\u0002HX\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002HZ0Yj\b\u0012\u0004\u0012\u0002HZ`[0Wj\u001e\u0012\u0004\u0012\u0002HX\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002HZ0Yj\b\u0012\u0004\u0012\u0002HZ`[`\\\"\u0004\b\u0000\u0010X\"\u0004\b\u0001\u0010ZH\u0002\u001a\u0010\u0010]\u001a\u00020\u00142\u0006\u0010I\u001a\u00020^H\u0000\u001a\"\u0010]\u001a\u00020\u00142\u0006\u0010I\u001a\u00020^2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00010PH\u0080\bø\u0001\u0000\u001a\u0018\u0010`\u001a\u00020\u00142\u0006\u0010M\u001a\u00020N2\u0006\u0010`\u001a\u00020=H\u0007\u001a\u0010\u0010a\u001a\u00020\u00142\u0006\u0010M\u001a\u00020NH\u0007\u001a \u0010b\u001a\u00020\u00142\u0006\u0010M\u001a\u00020N2\u0006\u0010c\u001a\u00020\u00072\u0006\u0010`\u001a\u00020=H\u0007\u001a\f\u0010d\u001a\u00020^*\u00020\u0007H\u0002\u001a\f\u0010e\u001a\u00020\u0007*\u00020^H\u0002\u001a1\u0010f\u001a\u0002HT\"\u0004\b\u0000\u0010T*\u00020N2\u0006\u0010g\u001a\u00020^2\f\u0010h\u001a\b\u0012\u0004\u0012\u0002HT0PH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010i\u001a@\u0010j\u001a\u00020^\"\u0004\b\u0000\u0010T*\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010@\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010A0?j\u0002`B2\f\u0010c\u001a\b\u0012\u0004\u0012\u0002HT0@H\u0000\u001a\u001c\u0010k\u001a\u00020\u0007*\u00020l2\u0006\u0010m\u001a\u00020\u00072\u0006\u0010n\u001a\u00020\u0007H\u0002\u001a\u001a\u0010o\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020q0p2\u0006\u0010r\u001a\u00020\u0007H\u0002\u001a$\u0010s\u001a\u0004\u0018\u00010q*\b\u0012\u0004\u0012\u00020q0p2\u0006\u0010t\u001a\u00020\u00072\u0006\u0010u\u001a\u00020\u0007H\u0002\u001aE\u0010v\u001a\u0002HT\"\u0004\b\u0000\u0010T*\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010@\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010A0?j\u0002`B2\f\u0010c\u001a\b\u0012\u0004\u0012\u0002HT0@H\u0000¢\u0006\u0002\u0010w\u001a,\u0010x\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020q0p2\u0006\u0010r\u001a\u00020\u00072\u0006\u0010y\u001a\u00020z2\b\u0010{\u001a\u0004\u0018\u00010\u0001H\u0002\u001a\u0080\u0001\u0010|\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010@\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010A0?j\u0002`B*\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010@\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010A0?j\u0002`B2.\u0010}\u001a*\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010@\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010A0\u007f\u0012\u0004\u0012\u00020\u00140~H\u0080\bø\u0001\u0000\u001a(\u0010\u0080\u0001\u001a\u00020\u0007*\u00020l2\u0007\u0010\u0081\u0001\u001a\u00020\u00072\u0007\u0010\u0082\u0001\u001a\u00020\u00072\u0007\u0010\u0083\u0001\u001a\u00020\u0007H\u0002\u001a[\u0010\u0084\u0001\u001a\u0004\u0018\u0001HZ\"\u0004\b\u0000\u0010X\"\u0004\b\u0001\u0010Z*4\u0012\u0004\u0012\u0002HX\u0012\n\u0012\b\u0012\u0004\u0012\u0002HZ0Y0Wj\u001e\u0012\u0004\u0012\u0002HX\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002HZ0Yj\b\u0012\u0004\u0012\u0002HZ`[`\\2\u0006\u0010c\u001a\u0002HXH\u0002¢\u0006\u0003\u0010\u0085\u0001\u001aa\u0010\u0086\u0001\u001a\u00020^\"\u0004\b\u0000\u0010X\"\u0004\b\u0001\u0010Z*4\u0012\u0004\u0012\u0002HX\u0012\n\u0012\b\u0012\u0004\u0012\u0002HZ0Y0Wj\u001e\u0012\u0004\u0012\u0002HX\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002HZ0Yj\b\u0012\u0004\u0012\u0002HZ`[`\\2\u0006\u0010c\u001a\u0002HX2\u0006\u0010I\u001a\u0002HZH\u0002¢\u0006\u0003\u0010\u0087\u0001\u001ac\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0014\"\u0004\b\u0000\u0010X\"\u0004\b\u0001\u0010Z*4\u0012\u0004\u0012\u0002HX\u0012\n\u0012\b\u0012\u0004\u0012\u0002HZ0Y0Wj\u001e\u0012\u0004\u0012\u0002HX\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002HZ0Yj\b\u0012\u0004\u0012\u0002HZ`[`\\2\u0006\u0010c\u001a\u0002HX2\u0006\u0010I\u001a\u0002HZH\u0002¢\u0006\u0003\u0010\u0089\u0001\u001a\u0015\u0010\u008a\u0001\u001a\u00020\u0014*\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0000\u001a\u001d\u0010\u008b\u0001\u001a\u0004\u0018\u00010q*\b\u0012\u0004\u0012\u00020q0p2\u0006\u0010r\u001a\u00020\u0007H\u0002\u001a#\u0010\u008c\u0001\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020q0p2\u0006\u0010t\u001a\u00020\u00072\u0006\u0010u\u001a\u00020\u0007H\u0002\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0016\u0010\u0006\u001a\u00020\u00078\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003\"\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"[\u0010\n\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\u000bj\u0002`\u0015X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001c\u0010\u0016\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0003\u001a\u0004\b\u0018\u0010\u0005\"\u0016\u0010\u0019\u001a\u00020\u00078\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u001a\u0010\u0003\"\u000e\u0010\u001b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u001c\u0010\u001d\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001f\u0010\u0005\"\u0016\u0010 \u001a\u00020\u00078\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b!\u0010\u0003\"\u001c\u0010\"\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0003\u001a\u0004\b$\u0010\u0005\"\u0016\u0010%\u001a\u00020\u00078\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b&\u0010\u0003\"\u001c\u0010'\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u0003\u001a\u0004\b)\u0010\u0005\"\u0016\u0010*\u001a\u00020\u00078\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b+\u0010\u0003\"\u001c\u0010,\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010\u0003\u001a\u0004\b.\u0010\u0005\"\u0016\u0010/\u001a\u00020\u00078\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b0\u0010\u0003\"[\u00101\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\u000bj\u0002`\u0015X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0016\u00102\u001a\u00020\u00078\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b3\u0010\u0003\"\u000e\u00104\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"[\u00105\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\u000bj\u0002`\u0015X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0018\u00106\u001a\u00020\u0001*\u0002078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109*\u009f\u0001\b\u0000\u0010\u008d\u0001\"K\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\u000b2K\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\u000b*E\b\u0000\u0010\u008e\u0001\"\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010@\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010A0?2\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010@\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010A0?\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u008f\u0001"}, d2 = {"compositionLocalMap", "", "getCompositionLocalMap$annotations", "()V", "getCompositionLocalMap", "()Ljava/lang/Object;", "compositionLocalMapKey", "", "getCompositionLocalMapKey$annotations", "defaultsKey", "endGroupInstance", "Lkotlin/Function3;", "Landroidx/compose/runtime/Applier;", "Lkotlin/ParameterName;", "name", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "Landroidx/compose/runtime/Change;", "invocation", "getInvocation$annotations", "getInvocation", "invocationKey", "getInvocationKey$annotations", "nodeKey", "nodeKeyReplace", "provider", "getProvider$annotations", "getProvider", "providerKey", "getProviderKey$annotations", "providerMaps", "getProviderMaps$annotations", "getProviderMaps", "providerMapsKey", "getProviderMapsKey$annotations", "providerValues", "getProviderValues$annotations", "getProviderValues", "providerValuesKey", "getProviderValuesKey$annotations", "reference", "getReference$annotations", "getReference", "referenceKey", "getReferenceKey$annotations", "removeCurrentGroupInstance", "reuseKey", "getReuseKey$annotations", "rootKey", "startRootGroup", "joinedKey", "Landroidx/compose/runtime/KeyInfo;", "getJoinedKey", "(Landroidx/compose/runtime/KeyInfo;)Ljava/lang/Object;", "composeRuntimeError", "", "message", "", "compositionLocalMapOf", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "Landroidx/compose/runtime/CompositionLocal;", "Landroidx/compose/runtime/State;", "Landroidx/compose/runtime/CompositionLocalMap;", "values", "", "Landroidx/compose/runtime/ProvidedValue;", "parentScope", "([Landroidx/compose/runtime/ProvidedValue;Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "getKey", "value", "left", "right", "invokeComposable", "composer", "Landroidx/compose/runtime/Composer;", "composable", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/runtime/Composer;Lkotlin/jvm/functions/Function2;)V", "invokeComposableForResult", "T", "(Landroidx/compose/runtime/Composer;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "multiMap", "Ljava/util/HashMap;", "K", "Ljava/util/LinkedHashSet;", "V", "Lkotlin/collections/LinkedHashSet;", "Lkotlin/collections/HashMap;", "runtimeCheck", "", "lazyMessage", "sourceInformation", "sourceInformationMarkerEnd", "sourceInformationMarkerStart", "key", "asBool", "asInt", "cache", "invalid", "block", "(Landroidx/compose/runtime/Composer;ZLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "contains", "distanceFrom", "Landroidx/compose/runtime/SlotReader;", FirebaseAnalytics.Param.INDEX, "root", "findLocation", "", "Landroidx/compose/runtime/Invalidation;", FirebaseAnalytics.Param.LOCATION, "firstInRange", "start", "end", "getValueOf", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "insertIfMissing", "scope", "Landroidx/compose/runtime/RecomposeScopeImpl;", "instance", "mutate", "mutator", "Lkotlin/Function1;", "", "nearestCommonRootOf", "a", "b", "common", "pop", "(Ljava/util/HashMap;Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/util/HashMap;Ljava/lang/Object;Ljava/lang/Object;)Z", "remove", "(Ljava/util/HashMap;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Unit;", "removeCurrentGroup", "removeLocation", "removeRange", "Change", "CompositionLocalMap", "runtime_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ComposerKt {
    public static final int compositionLocalMapKey = 202;
    private static final int defaultsKey = -127;
    public static final int invocationKey = 200;
    private static final int nodeKey = 125;
    private static final int nodeKeyReplace = 126;
    public static final int providerKey = 201;
    public static final int providerMapsKey = 204;
    public static final int providerValuesKey = 203;
    public static final int referenceKey = 206;
    public static final int reuseKey = 207;
    private static final int rootKey = 100;
    @NotNull
    private static final Function3<Applier<?>, SlotWriter, RememberManager, Unit> removeCurrentGroupInstance = ComposerKt$removeCurrentGroupInstance$1.INSTANCE;
    @NotNull
    private static final Function3<Applier<?>, SlotWriter, RememberManager, Unit> endGroupInstance = ComposerKt$endGroupInstance$1.INSTANCE;
    @NotNull
    private static final Function3<Applier<?>, SlotWriter, RememberManager, Unit> startRootGroup = ComposerKt$startRootGroup$1.INSTANCE;
    @NotNull
    private static final Object invocation = new OpaqueKey("provider");
    @NotNull
    private static final Object provider = new OpaqueKey("provider");
    @NotNull
    private static final Object compositionLocalMap = new OpaqueKey("compositionLocalMap");
    @NotNull
    private static final Object providerValues = new OpaqueKey("providerValues");
    @NotNull
    private static final Object providerMaps = new OpaqueKey("providers");
    @NotNull
    private static final Object reference = new OpaqueKey("reference");

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean asBool(int i2) {
        return i2 != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int asInt(boolean z) {
        return z ? 1 : 0;
    }

    @ComposeCompilerApi
    public static final <T> T cache(@NotNull Composer composer, boolean z, @NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(composer, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        T t2 = (T) composer.rememberedValue();
        if (z || t2 == Composer.Companion.getEmpty()) {
            T invoke = block.invoke();
            composer.updateRememberedValue(invoke);
            return invoke;
        }
        return t2;
    }

    @NotNull
    public static final Void composeRuntimeError(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        throw new IllegalStateException(("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + message + "). Please report to Google or use https://goo.gle/compose-feedback").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final PersistentMap<CompositionLocal<Object>, State<Object>> compositionLocalMapOf(ProvidedValue<?>[] providedValueArr, PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap, Composer composer, int i2) {
        composer.startReplaceableGroup(680852469);
        PersistentMap.Builder builder = ExtensionsKt.persistentHashMapOf().builder();
        int length = providedValueArr.length;
        int i3 = 0;
        while (i3 < length) {
            ProvidedValue<?> providedValue = providedValueArr[i3];
            i3++;
            if (providedValue.getCanOverride() || !contains(persistentMap, providedValue.getCompositionLocal())) {
                builder.put(providedValue.getCompositionLocal(), providedValue.getCompositionLocal().provided$runtime_release(providedValue.getValue(), composer, 72));
            }
        }
        PersistentMap<CompositionLocal<Object>, State<Object>> build = builder.build();
        composer.endReplaceableGroup();
        return build;
    }

    public static final <T> boolean contains(@NotNull PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap, @NotNull CompositionLocal<T> key) {
        Intrinsics.checkNotNullParameter(persistentMap, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return persistentMap.containsKey(key);
    }

    private static final int distanceFrom(SlotReader slotReader, int i2, int i3) {
        int i4 = 0;
        while (i2 > 0 && i2 != i3) {
            i2 = slotReader.parent(i2);
            i4++;
        }
        return i4;
    }

    private static final int findLocation(List<Invalidation> list, int i2) {
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int compare = Intrinsics.compare(list.get(i4).getLocation(), i2);
            if (compare < 0) {
                i3 = i4 + 1;
            } else if (compare <= 0) {
                return i4;
            } else {
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Invalidation firstInRange(List<Invalidation> list, int i2, int i3) {
        int findLocation = findLocation(list, i2);
        if (findLocation < 0) {
            findLocation = -(findLocation + 1);
        }
        if (findLocation < list.size()) {
            Invalidation invalidation = list.get(findLocation);
            if (invalidation.getLocation() < i3) {
                return invalidation;
            }
            return null;
        }
        return null;
    }

    @NotNull
    public static final Object getCompositionLocalMap() {
        return compositionLocalMap;
    }

    @PublishedApi
    public static /* synthetic */ void getCompositionLocalMap$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getCompositionLocalMapKey$annotations() {
    }

    @NotNull
    public static final Object getInvocation() {
        return invocation;
    }

    @PublishedApi
    public static /* synthetic */ void getInvocation$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getInvocationKey$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getJoinedKey(KeyInfo keyInfo) {
        return keyInfo.getObjectKey() != null ? new JoinedKey(Integer.valueOf(keyInfo.getKey()), keyInfo.getObjectKey()) : Integer.valueOf(keyInfo.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getKey(Object obj, Object obj2, Object obj3) {
        JoinedKey joinedKey = obj instanceof JoinedKey ? (JoinedKey) obj : null;
        if (joinedKey == null) {
            return null;
        }
        if ((!Intrinsics.areEqual(joinedKey.getLeft(), obj2) || !Intrinsics.areEqual(joinedKey.getRight(), obj3)) && (obj = getKey(joinedKey.getLeft(), obj2, obj3)) == null) {
            obj = getKey(joinedKey.getRight(), obj2, obj3);
        }
        return obj;
    }

    @NotNull
    public static final Object getProvider() {
        return provider;
    }

    @PublishedApi
    public static /* synthetic */ void getProvider$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getProviderKey$annotations() {
    }

    @NotNull
    public static final Object getProviderMaps() {
        return providerMaps;
    }

    @PublishedApi
    public static /* synthetic */ void getProviderMaps$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getProviderMapsKey$annotations() {
    }

    @NotNull
    public static final Object getProviderValues() {
        return providerValues;
    }

    @PublishedApi
    public static /* synthetic */ void getProviderValues$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getProviderValuesKey$annotations() {
    }

    @NotNull
    public static final Object getReference() {
        return reference;
    }

    @PublishedApi
    public static /* synthetic */ void getReference$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getReferenceKey$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getReuseKey$annotations() {
    }

    public static final <T> T getValueOf(@NotNull PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap, @NotNull CompositionLocal<T> key) {
        Intrinsics.checkNotNullParameter(persistentMap, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        State<? extends Object> state = persistentMap.get(key);
        if (state == null) {
            return null;
        }
        return (T) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void insertIfMissing(List<Invalidation> list, int i2, RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        int findLocation = findLocation(list, i2);
        IdentityArraySet identityArraySet = null;
        if (findLocation < 0) {
            int i3 = -(findLocation + 1);
            if (obj != null) {
                identityArraySet = new IdentityArraySet();
                identityArraySet.add(obj);
            }
            list.add(i3, new Invalidation(recomposeScopeImpl, i2, identityArraySet));
            return;
        }
        Invalidation invalidation = list.get(findLocation);
        if (obj == null) {
            invalidation.setInstances(null);
            return;
        }
        IdentityArraySet<Object> instances = invalidation.getInstances();
        if (instances == null) {
            return;
        }
        instances.add(obj);
    }

    public static final void invokeComposable(@NotNull Composer composer, @NotNull Function2<? super Composer, ? super Integer, Unit> composable) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(composable, "composable");
        ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(composable, 2)).invoke(composer, 1);
    }

    public static final <T> T invokeComposableForResult(@NotNull Composer composer, @NotNull Function2<? super Composer, ? super Integer, ? extends T> composable) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(composable, "composable");
        return (T) ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(composable, 2)).invoke(composer, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> HashMap<K, LinkedHashSet<V>> multiMap() {
        return new HashMap<>();
    }

    @NotNull
    public static final PersistentMap<CompositionLocal<Object>, State<Object>> mutate(@NotNull PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap, @NotNull Function1<? super Map<CompositionLocal<Object>, State<Object>>, Unit> mutator) {
        Intrinsics.checkNotNullParameter(persistentMap, "<this>");
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        PersistentMap.Builder<CompositionLocal<Object>, ? extends State<? extends Object>> builder = persistentMap.builder();
        mutator.invoke(builder);
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nearestCommonRootOf(SlotReader slotReader, int i2, int i3, int i4) {
        if (i2 == i3) {
            return i2;
        }
        if (i2 == i4 || i3 == i4) {
            return i4;
        }
        if (slotReader.parent(i2) == i3) {
            return i3;
        }
        if (slotReader.parent(i3) == i2) {
            return i2;
        }
        if (slotReader.parent(i2) == slotReader.parent(i3)) {
            return slotReader.parent(i2);
        }
        int distanceFrom = distanceFrom(slotReader, i2, i4);
        int distanceFrom2 = distanceFrom(slotReader, i3, i4);
        int i5 = distanceFrom - distanceFrom2;
        int i6 = 0;
        int i7 = 0;
        while (i7 < i5) {
            i7++;
            i2 = slotReader.parent(i2);
        }
        int i8 = distanceFrom2 - distanceFrom;
        while (i6 < i8) {
            i6++;
            i3 = slotReader.parent(i3);
        }
        while (i2 != i3) {
            i2 = slotReader.parent(i2);
            i3 = slotReader.parent(i3);
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> V pop(HashMap<K, LinkedHashSet<V>> hashMap, K k2) {
        Object firstOrNull;
        LinkedHashSet<V> linkedHashSet = hashMap.get(k2);
        if (linkedHashSet == null) {
            return null;
        }
        firstOrNull = CollectionsKt___CollectionsKt.firstOrNull(linkedHashSet);
        V v2 = (V) firstOrNull;
        if (v2 == null) {
            return null;
        }
        remove(hashMap, k2, v2);
        return v2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> boolean put(HashMap<K, LinkedHashSet<V>> hashMap, K k2, V v2) {
        LinkedHashSet<V> linkedHashSet = hashMap.get(k2);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet<>();
            hashMap.put(k2, linkedHashSet);
        }
        return linkedHashSet.add(v2);
    }

    private static final <K, V> Unit remove(HashMap<K, LinkedHashSet<V>> hashMap, K k2, V v2) {
        LinkedHashSet<V> linkedHashSet = hashMap.get(k2);
        if (linkedHashSet == null) {
            return null;
        }
        linkedHashSet.remove(v2);
        if (linkedHashSet.isEmpty()) {
            hashMap.remove(k2);
        }
        return Unit.INSTANCE;
    }

    public static final void removeCurrentGroup(@NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
        RecomposeScopeImpl recomposeScopeImpl;
        CompositionImpl composition;
        Intrinsics.checkNotNullParameter(slotWriter, "<this>");
        Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
        Iterator<Object> groupSlots = slotWriter.groupSlots();
        while (groupSlots.hasNext()) {
            Object next = groupSlots.next();
            if (next instanceof RememberObserver) {
                rememberManager.forgetting((RememberObserver) next);
            } else if ((next instanceof RecomposeScopeImpl) && (composition = (recomposeScopeImpl = (RecomposeScopeImpl) next).getComposition()) != null) {
                composition.setPendingInvalidScopes$runtime_release(true);
                recomposeScopeImpl.setComposition(null);
            }
        }
        slotWriter.removeGroup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Invalidation removeLocation(List<Invalidation> list, int i2) {
        int findLocation = findLocation(list, i2);
        if (findLocation >= 0) {
            return list.remove(findLocation);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeRange(List<Invalidation> list, int i2, int i3) {
        int findLocation = findLocation(list, i2);
        if (findLocation < 0) {
            findLocation = -(findLocation + 1);
        }
        while (findLocation < list.size() && list.get(findLocation).getLocation() < i3) {
            list.remove(findLocation);
        }
    }

    public static final void runtimeCheck(boolean z) {
        if (z) {
            return;
        }
        composeRuntimeError("Check failed".toString());
        throw new KotlinNothingValueException();
    }

    public static final void runtimeCheck(boolean z, @NotNull Function0<? extends Object> lazyMessage) {
        Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
        if (z) {
            return;
        }
        composeRuntimeError(lazyMessage.invoke().toString());
        throw new KotlinNothingValueException();
    }

    @ComposeCompilerApi
    public static final void sourceInformation(@NotNull Composer composer, @NotNull String sourceInformation) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(sourceInformation, "sourceInformation");
        composer.sourceInformation(sourceInformation);
    }

    @ComposeCompilerApi
    public static final void sourceInformationMarkerEnd(@NotNull Composer composer) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        composer.sourceInformationMarkerEnd();
    }

    @ComposeCompilerApi
    public static final void sourceInformationMarkerStart(@NotNull Composer composer, int i2, @NotNull String sourceInformation) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(sourceInformation, "sourceInformation");
        composer.sourceInformationMarkerStart(i2, sourceInformation);
    }
}
