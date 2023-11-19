package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.R;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.AndroidAutofill;
import androidx.compose.ui.autofill.AndroidAutofill_androidKt;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillCallback;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusManagerImpl;
import androidx.compose.ui.focus.FocusNodeUtilsKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.input.InputMode;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.InputModeManagerImpl;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifier;
import androidx.compose.ui.input.pointer.MotionEventAdapter;
import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerIconDefaults;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.input.pointer.PointerInputEvent;
import androidx.compose.ui.input.pointer.PointerInputEventData;
import androidx.compose.ui.input.pointer.PointerInputEventProcessor;
import androidx.compose.ui.input.pointer.PointerInputEventProcessorKt;
import androidx.compose.ui.input.pointer.PositionCalculator;
import androidx.compose.ui.input.pointer.ProcessResult;
import androidx.compose.ui.layout.RootMeasurePolicy;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.MeasureAndLayoutDelegate;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.node.RootForTest;
import androidx.compose.ui.platform.ViewLayer;
import androidx.compose.ui.semantics.SemanticsModifierCore;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.semantics.SemanticsWrapper;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputServiceAndroid;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.app.NotificationCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresApi(21)
@Metadata(d1 = {"\u0000¶\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006*\u0002\u0088\u0001\b\u0001\u0018\u0000 î\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0004î\u0002ï\u0002B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001b\u0010Ô\u0001\u001a\u00020-2\b\u0010¼\u0001\u001a\u00030Õ\u00012\b\u0010Ö\u0001\u001a\u00030\u008b\u0001J\u0019\u0010\u001c\u001a\u00020-2\u000f\u0010×\u0001\u001a\n\u0012\u0005\u0012\u00030Ù\u00010Ø\u0001H\u0016J\t\u0010Ú\u0001\u001a\u00020EH\u0002J\u0013\u0010Û\u0001\u001a\u00020-H\u0086@ø\u0001\u0000¢\u0006\u0003\u0010Ü\u0001J!\u0010Ý\u0001\u001a\u00020]2\u0007\u0010Þ\u0001\u001a\u00020]H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\bß\u0001\u0010à\u0001J!\u0010á\u0001\u001a\u00020]2\u0007\u0010â\u0001\u001a\u00020]H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\bã\u0001\u0010à\u0001J\u0013\u0010ä\u0001\u001a\u00020E2\b\u0010å\u0001\u001a\u00030æ\u0001H\u0016J\u0013\u0010ç\u0001\u001a\u00020E2\b\u0010å\u0001\u001a\u00030æ\u0001H\u0016J\u0012\u0010è\u0001\u001a\u00020-2\u0007\u0010é\u0001\u001a\u00020\u0001H\u0002J\u000f\u0010ê\u0001\u001a\u00020-H\u0000¢\u0006\u0003\bë\u0001J\"\u0010ì\u0001\u001a\u0011\u0012\u0005\u0012\u00030æ\u0001\u0012\u0005\u0012\u00030æ\u00010í\u00012\b\u0010î\u0001\u001a\u00030æ\u0001H\u0002J/\u0010ï\u0001\u001a\u00020;2\u0014\u0010ð\u0001\u001a\u000f\u0012\u0005\u0012\u00030ñ\u0001\u0012\u0004\u0012\u00020-0+2\u000e\u0010ò\u0001\u001a\t\u0012\u0004\u0012\u00020-0\u0086\u0001H\u0016J\u0013\u0010ó\u0001\u001a\u00020-2\b\u0010ô\u0001\u001a\u00030õ\u0001H\u0014J\u0013\u0010ö\u0001\u001a\u00020E2\b\u0010÷\u0001\u001a\u00030\u0083\u0001H\u0016J\u0013\u0010ø\u0001\u001a\u00020E2\b\u0010÷\u0001\u001a\u00030\u0083\u0001H\u0016J\u0013\u0010ù\u0001\u001a\u00020E2\b\u0010÷\u0001\u001a\u00030ú\u0001H\u0016J\u0013\u0010û\u0001\u001a\u00020E2\b\u0010ü\u0001\u001a\u00030\u0083\u0001H\u0016J\u001b\u0010ý\u0001\u001a\u00020-2\b\u0010¼\u0001\u001a\u00030Õ\u00012\b\u0010ô\u0001\u001a\u00030õ\u0001J \u0010þ\u0001\u001a\u0005\u0018\u00010½\u00012\b\u0010ÿ\u0001\u001a\u00030æ\u00012\b\u0010\u0080\u0002\u001a\u00030½\u0001H\u0002J\u0014\u0010\u0081\u0002\u001a\u0005\u0018\u00010½\u00012\b\u0010ÿ\u0001\u001a\u00030æ\u0001J\u0013\u0010\u0082\u0002\u001a\u00020-2\b\u0010Ö\u0001\u001a\u00030\u008b\u0001H\u0016J%\u0010\u0083\u0002\u001a\u0005\u0018\u00010\u0084\u00022\b\u0010\u0085\u0002\u001a\u00030\u0086\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0087\u0002\u0010\u0088\u0002J&\u0010\u0089\u0002\u001a\u00030\u008a\u00022\b\u0010ü\u0001\u001a\u00030\u0083\u0001H\u0002ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\b\u008b\u0002\u0010\u008c\u0002J\u001d\u0010\u008d\u0002\u001a\u00020E2\b\u0010÷\u0001\u001a\u00030\u0083\u00012\b\u0010\u008e\u0002\u001a\u00030\u0083\u0001H\u0002J\t\u0010\u008f\u0002\u001a\u00020-H\u0016J\u0013\u0010\u0090\u0002\u001a\u00020-2\b\u0010\u0091\u0002\u001a\u00030\u008b\u0001H\u0002J\u0013\u0010\u0092\u0002\u001a\u00020-2\b\u0010\u0091\u0002\u001a\u00030\u008b\u0001H\u0002J\u0013\u0010\u0093\u0002\u001a\u00020E2\b\u0010÷\u0001\u001a\u00030\u0083\u0001H\u0002J\u0013\u0010\u0094\u0002\u001a\u00020E2\b\u0010÷\u0001\u001a\u00030\u0083\u0001H\u0002J\u0013\u0010\u0095\u0002\u001a\u00020E2\b\u0010ü\u0001\u001a\u00030\u0083\u0001H\u0002J\u0013\u0010\u0096\u0002\u001a\u00020E2\b\u0010÷\u0001\u001a\u00030\u0083\u0001H\u0002J\u0013\u0010\u0097\u0002\u001a\u00020-H\u0086@ø\u0001\u0000¢\u0006\u0003\u0010Ü\u0001J!\u0010\u0098\u0002\u001a\u00020]2\u0007\u0010â\u0001\u001a\u00020]H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0099\u0002\u0010à\u0001J\u0012\u0010\u009a\u0002\u001a\u00020-2\u0007\u0010\u009b\u0002\u001a\u00020EH\u0016J!\u0010\u009c\u0002\u001a\u00020-2\u0007\u0010\u009d\u0002\u001a\u00020;2\u0007\u0010\u009e\u0002\u001a\u00020EH\u0000¢\u0006\u0003\b\u009f\u0002J\u0013\u0010 \u0002\u001a\u00020-2\b\u0010\u0091\u0002\u001a\u00030\u008b\u0001H\u0016J\t\u0010¡\u0002\u001a\u00020-H\u0014J\t\u0010¢\u0002\u001a\u00020EH\u0016J\u0012\u0010£\u0002\u001a\u00020-2\u0007\u0010¤\u0002\u001a\u00020,H\u0014J\u0016\u0010¥\u0002\u001a\u0005\u0018\u00010¦\u00022\b\u0010§\u0002\u001a\u00030¨\u0002H\u0016J\u0013\u0010©\u0002\u001a\u00020-2\b\u0010\u0091\u0002\u001a\u00030\u008b\u0001H\u0016J\t\u0010ª\u0002\u001a\u00020-H\u0014J\u0013\u0010«\u0002\u001a\u00020-2\b\u0010ô\u0001\u001a\u00030õ\u0001H\u0014J(\u0010¬\u0002\u001a\u00020-2\u0007\u0010\u00ad\u0002\u001a\u00020E2\b\u0010å\u0001\u001a\u00030æ\u00012\n\u0010®\u0002\u001a\u0005\u0018\u00010¯\u0002H\u0014J:\u0010°\u0002\u001a\u00020-2\u0007\u0010±\u0002\u001a\u00020E2\b\u0010²\u0002\u001a\u00030æ\u00012\b\u0010³\u0002\u001a\u00030æ\u00012\b\u0010´\u0002\u001a\u00030æ\u00012\b\u0010µ\u0002\u001a\u00030æ\u0001H\u0014J\u0013\u0010¶\u0002\u001a\u00020-2\b\u0010Ö\u0001\u001a\u00030\u008b\u0001H\u0016J\u001d\u0010·\u0002\u001a\u00020-2\b\u0010¸\u0002\u001a\u00030æ\u00012\b\u0010¹\u0002\u001a\u00030æ\u0001H\u0014J\u001f\u0010º\u0002\u001a\u00020-2\n\u0010»\u0002\u001a\u0005\u0018\u00010¼\u00022\b\u0010½\u0002\u001a\u00030æ\u0001H\u0016J\u0013\u0010¾\u0002\u001a\u00020-2\b\u0010Ö\u0001\u001a\u00030\u008b\u0001H\u0016J\u0013\u0010¿\u0002\u001a\u00020-2\b\u0010Ö\u0001\u001a\u00030\u008b\u0001H\u0016J\u0013\u0010À\u0002\u001a\u00020-2\b\u0010Á\u0002\u001a\u00030Â\u0002H\u0016J\u0012\u0010Ã\u0002\u001a\u00020-2\u0007\u0010i\u001a\u00030æ\u0001H\u0016J\t\u0010Ä\u0002\u001a\u00020-H\u0016J\u0012\u0010Å\u0002\u001a\u00020-2\u0007\u0010Æ\u0002\u001a\u00020EH\u0016J\t\u0010Ç\u0002\u001a\u00020-H\u0002J\u0013\u0010Ç\u0002\u001a\u00020-2\b\u0010ü\u0001\u001a\u00030\u0083\u0001H\u0002J\t\u0010È\u0002\u001a\u00020-H\u0002J\u0018\u0010É\u0002\u001a\u00020E2\u0007\u0010\u009d\u0002\u001a\u00020;H\u0000¢\u0006\u0003\bÊ\u0002J\u0011\u0010Ë\u0002\u001a\u00020-2\b\u0010¼\u0001\u001a\u00030Õ\u0001J\u0007\u0010Ì\u0002\u001a\u00020-J\u0017\u0010Í\u0002\u001a\u00020-2\f\b\u0002\u0010Î\u0002\u001a\u0005\u0018\u00010\u008b\u0001H\u0002J!\u0010Ï\u0002\u001a\u00020]2\u0007\u0010Ð\u0002\u001a\u00020]H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\bÑ\u0002\u0010à\u0001J\"\u0010Ò\u0002\u001a\u00020E2\b\u0010\u0085\u0002\u001a\u00030\u0086\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\bÓ\u0002\u0010Ô\u0002J&\u0010Õ\u0002\u001a\u00030\u008a\u00022\b\u0010ü\u0001\u001a\u00030\u0083\u0001H\u0002ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\bÖ\u0002\u0010\u008c\u0002J1\u0010×\u0002\u001a\u00020-2\b\u0010ü\u0001\u001a\u00030\u0083\u00012\b\u0010Ø\u0002\u001a\u00030æ\u00012\u0007\u0010Ù\u0002\u001a\u00020_2\t\b\u0002\u0010Ú\u0002\u001a\u00020EH\u0002J\u001c\u0010Û\u0002\u001a\u00020-2\u0013\u0010Ü\u0002\u001a\u000e\u0012\u0004\u0012\u00020z\u0012\u0004\u0012\u00020-0+J\t\u0010Ý\u0002\u001a\u00020EH\u0016J,\u0010Þ\u0002\u001a\u00020-2\b\u0010¼\u0001\u001a\u00030½\u00012\b\u0010ß\u0002\u001a\u00030¶\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\bà\u0002\u0010á\u0002J\t\u0010â\u0002\u001a\u00020-H\u0002J'\u0010ã\u0002\u001a\u00020-*\u00030¶\u00012\b\u0010ä\u0002\u001a\u00030å\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\bæ\u0002\u0010ç\u0002J1\u0010è\u0002\u001a\u00020-*\u00030¶\u00012\b\u0010é\u0002\u001a\u00030ê\u00022\b\u0010ë\u0002\u001a\u00030ê\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\bì\u0002\u0010í\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020!X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u00020'X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R&\u0010*\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001e\u00104\u001a\u0002032\u0006\u00102\u001a\u000203@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0010\u00107\u001a\u0004\u0018\u000108X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00109\u001a\b\u0012\u0004\u0012\u00020;0:X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010<\u001a\u00020=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020AX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u000e\u0010D\u001a\u00020EX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020GX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010H\u001a\u00020IX\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010JR\u0014\u0010K\u001a\u00020LX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0014\u0010O\u001a\u00020E8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u000e\u0010R\u001a\u00020EX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010S\u001a\u00020T8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u000e\u0010W\u001a\u00020EX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010X\u001a\u00020E8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010QR\u000e\u0010Y\u001a\u00020EX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u00020[X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\\\u001a\u00020]X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010JR$\u0010^\u001a\u00020_8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u0014\u0010f\u001a\b\u0012\u0004\u0012\u00020;0gX\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010i\u001a\u00020h2\u0006\u00102\u001a\u00020h8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u000e\u0010p\u001a\u00020qX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010r\u001a\u00020_8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bs\u0010cR\u000e\u0010t\u001a\u00020uX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010v\u001a\u00020EX\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010w\u001a\u0004\u0018\u00010xX\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0002\n\u0000R\u001c\u0010y\u001a\u0010\u0012\u0004\u0012\u00020z\u0012\u0004\u0012\u00020-\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010{\u001a\u00020|X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b}\u0010~R\u000f\u0010\u007f\u001a\u00030\u0080\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0081\u0001\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010:X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0083\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0084\u0001\u001a\u00020_X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0085\u0001\u001a\t\u0012\u0004\u0012\u00020-0\u0086\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0087\u0001\u001a\u00030\u0088\u0001X\u0082\u0004¢\u0006\u0005\n\u0003\u0010\u0089\u0001R\u0018\u0010\u008a\u0001\u001a\u00030\u008b\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0018\u0010\u008e\u0001\u001a\u00030\u008f\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0010\u0010\u0092\u0001\u001a\u00030\u0093\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0094\u0001\u001a\u00030\u0095\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0096\u0001\u001a\u00030\u0097\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0010\u0010\u009a\u0001\u001a\u00030\u009b\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u009c\u0001\u001a\u00030\u009d\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R%\u0010 \u0001\u001a\u00020EX\u0096\u000e¢\u0006\u0018\n\u0000\u0012\u0005\b¡\u0001\u0010a\u001a\u0005\b¢\u0001\u0010Q\"\u0006\b£\u0001\u0010¤\u0001R\u0018\u0010¥\u0001\u001a\u00030¦\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\b§\u0001\u0010¨\u0001R\u000f\u0010©\u0001\u001a\u00020EX\u0082\u000e¢\u0006\u0002\n\u0000R\u001f\u0010ª\u0001\u001a\u00030«\u0001X\u0096\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b¬\u0001\u0010a\u001a\u0006\b\u00ad\u0001\u0010®\u0001R\u0010\u0010¯\u0001\u001a\u00030°\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010±\u0001\u001a\u00030²\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\b³\u0001\u0010´\u0001R\u001c\u0010µ\u0001\u001a\u00030¶\u0001X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0005\n\u0003\u0010·\u0001R\u0010\u0010¸\u0001\u001a\u00030¹\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010º\u0001\u001a\u00030»\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010¼\u0001\u001a\u00030½\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¾\u0001\u0010¿\u0001R\u0018\u0010À\u0001\u001a\u00030Á\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\bÂ\u0001\u0010Ã\u0001R\u0012\u0010Ä\u0001\u001a\u0005\u0018\u00010Å\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010Æ\u0001\u001a\u00030¶\u0001X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0005\n\u0003\u0010·\u0001R5\u0010Ç\u0001\u001a\u0004\u0018\u00010z2\b\u00102\u001a\u0004\u0018\u00010z8F@BX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\bÌ\u0001\u0010o\u001a\u0006\bÈ\u0001\u0010É\u0001\"\u0006\bÊ\u0001\u0010Ë\u0001R\u000f\u0010Í\u0001\u001a\u00020EX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010Î\u0001\u001a\u00030Ï\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÐ\u0001\u0010Ñ\u0001R\u001a\u0010Ò\u0001\u001a\u00020]X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010JR\u001c\u0010Ó\u0001\u001a\u00030¶\u0001X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0005\n\u0003\u0010·\u0001\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006ð\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/ViewGroup;", "Landroidx/compose/ui/node/Owner;", "Landroidx/compose/ui/platform/ViewRootForTest;", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "_androidViewsHandler", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "_autofill", "Landroidx/compose/ui/autofill/AndroidAutofill;", "_focusManager", "Landroidx/compose/ui/focus/FocusManagerImpl;", "_inputModeManager", "Landroidx/compose/ui/input/InputModeManagerImpl;", "_windowInfo", "Landroidx/compose/ui/platform/WindowInfoImpl;", "accessibilityDelegate", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "accessibilityManager", "Landroidx/compose/ui/platform/AndroidAccessibilityManager;", "getAccessibilityManager", "()Landroidx/compose/ui/platform/AndroidAccessibilityManager;", "androidViewsHandler", "getAndroidViewsHandler$ui_release", "()Landroidx/compose/ui/platform/AndroidViewsHandler;", "autofill", "Landroidx/compose/ui/autofill/Autofill;", "getAutofill", "()Landroidx/compose/ui/autofill/Autofill;", "autofillTree", "Landroidx/compose/ui/autofill/AutofillTree;", "getAutofillTree", "()Landroidx/compose/ui/autofill/AutofillTree;", "canvasHolder", "Landroidx/compose/ui/graphics/CanvasHolder;", "clipboardManager", "Landroidx/compose/ui/platform/AndroidClipboardManager;", "getClipboardManager", "()Landroidx/compose/ui/platform/AndroidClipboardManager;", "configurationChangeObserver", "Lkotlin/Function1;", "Landroid/content/res/Configuration;", "", "getConfigurationChangeObserver", "()Lkotlin/jvm/functions/Function1;", "setConfigurationChangeObserver", "(Lkotlin/jvm/functions/Function1;)V", "<set-?>", "Landroidx/compose/ui/unit/Density;", "density", "getDensity", "()Landroidx/compose/ui/unit/Density;", "desiredPointerIcon", "Landroidx/compose/ui/input/pointer/PointerIcon;", "dirtyLayers", "", "Landroidx/compose/ui/node/OwnedLayer;", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "getFocusManager", "()Landroidx/compose/ui/focus/FocusManager;", "fontLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getFontLoader", "()Landroidx/compose/ui/text/font/Font$ResourceLoader;", "forceUseMatrixCache", "", "globalLayoutListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "globalPosition", "Landroidx/compose/ui/unit/IntOffset;", "J", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "hasPendingMeasureOrLayout", "getHasPendingMeasureOrLayout", "()Z", "hoverExitReceived", "inputModeManager", "Landroidx/compose/ui/input/InputModeManager;", "getInputModeManager", "()Landroidx/compose/ui/input/InputModeManager;", "isDrawingContent", "isLifecycleInResumedState", "isRenderNodeCompatible", "keyInputModifier", "Landroidx/compose/ui/input/key/KeyInputModifier;", "lastDownPointerPosition", "Landroidx/compose/ui/geometry/Offset;", "lastMatrixRecalculationAnimationTime", "", "getLastMatrixRecalculationAnimationTime$ui_release$annotations", "()V", "getLastMatrixRecalculationAnimationTime$ui_release", "()J", "setLastMatrixRecalculationAnimationTime$ui_release", "(J)V", "layerCache", "Landroidx/compose/ui/platform/WeakCache;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutDirection$delegate", "Landroidx/compose/runtime/MutableState;", "measureAndLayoutDelegate", "Landroidx/compose/ui/node/MeasureAndLayoutDelegate;", "measureIteration", "getMeasureIteration", "motionEventAdapter", "Landroidx/compose/ui/input/pointer/MotionEventAdapter;", "observationClearRequested", "onMeasureConstraints", "Landroidx/compose/ui/unit/Constraints;", "onViewTreeOwnersAvailable", "Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "pointerIconService", "Landroidx/compose/ui/input/pointer/PointerIconService;", "getPointerIconService", "()Landroidx/compose/ui/input/pointer/PointerIconService;", "pointerInputEventProcessor", "Landroidx/compose/ui/input/pointer/PointerInputEventProcessor;", "postponedDirtyLayers", "previousMotionEvent", "Landroid/view/MotionEvent;", "relayoutTime", "resendMotionEventOnLayout", "Lkotlin/Function0;", "resendMotionEventRunnable", "androidx/compose/ui/platform/AndroidComposeView$resendMotionEventRunnable$1", "Landroidx/compose/ui/platform/AndroidComposeView$resendMotionEventRunnable$1;", "root", "Landroidx/compose/ui/node/LayoutNode;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "rootForTest", "Landroidx/compose/ui/node/RootForTest;", "getRootForTest", "()Landroidx/compose/ui/node/RootForTest;", "scrollChangedListener", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "semanticsModifier", "Landroidx/compose/ui/semantics/SemanticsModifierCore;", "semanticsOwner", "Landroidx/compose/ui/semantics/SemanticsOwner;", "getSemanticsOwner", "()Landroidx/compose/ui/semantics/SemanticsOwner;", "sendHoverExitEvent", "Ljava/lang/Runnable;", "sharedDrawScope", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "getSharedDrawScope", "()Landroidx/compose/ui/node/LayoutNodeDrawScope;", "showLayoutBounds", "getShowLayoutBounds$annotations", "getShowLayoutBounds", "setShowLayoutBounds", "(Z)V", "snapshotObserver", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "superclassInitComplete", "textInputService", "Landroidx/compose/ui/text/input/TextInputService;", "getTextInputService$annotations", "getTextInputService", "()Landroidx/compose/ui/text/input/TextInputService;", "textInputServiceAndroid", "Landroidx/compose/ui/text/input/TextInputServiceAndroid;", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "tmpCalculationMatrix", "Landroidx/compose/ui/graphics/Matrix;", "[F", "tmpPositionArray", "", "touchModeChangeListener", "Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewLayersContainer", "Landroidx/compose/ui/platform/DrawChildContainer;", "viewToWindowMatrix", "viewTreeOwners", "getViewTreeOwners", "()Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "setViewTreeOwners", "(Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;)V", "viewTreeOwners$delegate", "wasMeasuredWithMultipleConstraints", "windowInfo", "Landroidx/compose/ui/platform/WindowInfo;", "getWindowInfo", "()Landroidx/compose/ui/platform/WindowInfo;", "windowPosition", "windowToViewMatrix", "addAndroidView", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "layoutNode", "values", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "autofillSupported", "boundsUpdatesEventLoop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calculateLocalPosition", "positionInWindow", "calculateLocalPosition-MK-Hz9U", "(J)J", "calculatePositionInWindow", "localPosition", "calculatePositionInWindow-MK-Hz9U", "canScrollHorizontally", "direction", "", "canScrollVertically", "clearChildInvalidObservations", "viewGroup", "clearInvalidObservations", "clearInvalidObservations$ui_release", "convertMeasureSpec", "Lkotlin/Pair;", "measureSpec", "createLayer", "drawBlock", "Landroidx/compose/ui/graphics/Canvas;", "invalidateParentLayer", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "dispatchGenericMotionEvent", NotificationCompat.CATEGORY_EVENT, "dispatchHoverEvent", "dispatchKeyEvent", "Landroid/view/KeyEvent;", "dispatchTouchEvent", "motionEvent", "drawAndroidView", "findViewByAccessibilityIdRootedAtCurrentView", "accessibilityId", "currentView", "findViewByAccessibilityIdTraversal", "forceMeasureTheSubtree", "getFocusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "keyEvent", "Landroidx/compose/ui/input/key/KeyEvent;", "getFocusDirection-P8AzH3I", "(Landroid/view/KeyEvent;)Landroidx/compose/ui/focus/FocusDirection;", "handleMotionEvent", "Landroidx/compose/ui/input/pointer/ProcessResult;", "handleMotionEvent-8iAsVTc", "(Landroid/view/MotionEvent;)I", "hasChangedDevices", "lastEvent", "invalidateDescendants", "invalidateLayers", "node", "invalidateLayoutNodeMeasurement", "isBadMotionEvent", "isDevicePressEvent", "isInBounds", "isPositionChanged", "keyboardVisibilityEventLoop", "localToScreen", "localToScreen-MK-Hz9U", "measureAndLayout", "sendPointerUpdate", "notifyLayerIsDirty", "layer", "isDirty", "notifyLayerIsDirty$ui_release", "onAttach", "onAttachedToWindow", "onCheckIsTextEditor", "onConfigurationChanged", "newConfig", "onCreateInputConnection", "Landroid/view/inputmethod/InputConnection;", "outAttrs", "Landroid/view/inputmethod/EditorInfo;", "onDetach", "onDetachedFromWindow", "onDraw", "onFocusChanged", "gainFocus", "previouslyFocusedRect", "Landroid/graphics/Rect;", "onLayout", "changed", "l", "t", "r", "b", "onLayoutChange", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onProvideAutofillVirtualStructure", "structure", "Landroid/view/ViewStructure;", "flags", "onRequestMeasure", "onRequestRelayout", "onResume", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onRtlPropertiesChanged", "onSemanticsChange", "onWindowFocusChanged", "hasWindowFocus", "recalculateWindowPosition", "recalculateWindowViewTransforms", "recycle", "recycle$ui_release", "removeAndroidView", "requestClearInvalidObservations", "scheduleMeasureAndLayout", "nodeToRemeasure", "screenToLocal", "positionOnScreen", "screenToLocal-MK-Hz9U", "sendKeyEvent", "sendKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "sendMotionEvent", "sendMotionEvent-8iAsVTc", "sendSimulatedEvent", "action", "eventTime", "forceHover", "setOnViewTreeOwnersAvailable", "callback", "shouldDelayChildPressedState", "transformMatrixToWindow", "matrix", "transformMatrixToWindow-EL8BTi8", "(Landroid/view/View;[F)V", "updatePositionCacheAndDispatch", "preConcat", "other", "Landroid/graphics/Matrix;", "preConcat-tU-YjHk", "([FLandroid/graphics/Matrix;)V", "preTranslate", "x", "", "y", "preTranslate-3XD1CNM", "([FFF)V", "Companion", "ViewTreeOwners", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@SuppressLint({"ViewConstructor", "VisibleForTests"})
/* loaded from: classes.dex */
public final class AndroidComposeView extends ViewGroup implements Owner, ViewRootForTest, PositionCalculator, DefaultLifecycleObserver {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int MaximumLayerCacheSize = 10;
    @Nullable
    private static Method getBooleanMethod;
    @Nullable
    private static Class<?> systemPropertiesClass;
    @Nullable
    private AndroidViewsHandler _androidViewsHandler;
    @Nullable
    private final AndroidAutofill _autofill;
    @NotNull
    private final FocusManagerImpl _focusManager;
    @NotNull
    private final InputModeManagerImpl _inputModeManager;
    @NotNull
    private final WindowInfoImpl _windowInfo;
    @NotNull
    private final AndroidComposeViewAccessibilityDelegateCompat accessibilityDelegate;
    @NotNull
    private final AndroidAccessibilityManager accessibilityManager;
    @NotNull
    private final AutofillTree autofillTree;
    @NotNull
    private final CanvasHolder canvasHolder;
    @NotNull
    private final AndroidClipboardManager clipboardManager;
    @NotNull
    private Function1<? super Configuration, Unit> configurationChangeObserver;
    @NotNull
    private Density density;
    @Nullable
    private PointerIcon desiredPointerIcon;
    @NotNull
    private final List<OwnedLayer> dirtyLayers;
    @NotNull
    private final Font.ResourceLoader fontLoader;
    private boolean forceUseMatrixCache;
    @NotNull
    private final ViewTreeObserver.OnGlobalLayoutListener globalLayoutListener;
    private long globalPosition;
    @NotNull
    private final HapticFeedback hapticFeedBack;
    private boolean hoverExitReceived;
    private boolean isDrawingContent;
    private boolean isRenderNodeCompatible;
    @NotNull
    private final KeyInputModifier keyInputModifier;
    private long lastDownPointerPosition;
    private long lastMatrixRecalculationAnimationTime;
    @NotNull
    private final WeakCache<OwnedLayer> layerCache;
    @NotNull
    private final MutableState layoutDirection$delegate;
    @NotNull
    private final MeasureAndLayoutDelegate measureAndLayoutDelegate;
    @NotNull
    private final MotionEventAdapter motionEventAdapter;
    private boolean observationClearRequested;
    @Nullable
    private Constraints onMeasureConstraints;
    @Nullable
    private Function1<? super ViewTreeOwners, Unit> onViewTreeOwnersAvailable;
    @NotNull
    private final PointerIconService pointerIconService;
    @NotNull
    private final PointerInputEventProcessor pointerInputEventProcessor;
    @Nullable
    private List<OwnedLayer> postponedDirtyLayers;
    @Nullable
    private MotionEvent previousMotionEvent;
    private long relayoutTime;
    @NotNull
    private final Function0<Unit> resendMotionEventOnLayout;
    @NotNull
    private final AndroidComposeView$resendMotionEventRunnable$1 resendMotionEventRunnable;
    @NotNull
    private final LayoutNode root;
    @NotNull
    private final RootForTest rootForTest;
    @NotNull
    private final ViewTreeObserver.OnScrollChangedListener scrollChangedListener;
    @NotNull
    private final SemanticsModifierCore semanticsModifier;
    @NotNull
    private final SemanticsOwner semanticsOwner;
    @NotNull
    private final Runnable sendHoverExitEvent;
    @NotNull
    private final LayoutNodeDrawScope sharedDrawScope;
    private boolean showLayoutBounds;
    @NotNull
    private final OwnerSnapshotObserver snapshotObserver;
    private boolean superclassInitComplete;
    @NotNull
    private final TextInputService textInputService;
    @NotNull
    private final TextInputServiceAndroid textInputServiceAndroid;
    @NotNull
    private final TextToolbar textToolbar;
    @NotNull
    private final float[] tmpCalculationMatrix;
    @NotNull
    private final int[] tmpPositionArray;
    @NotNull
    private final ViewTreeObserver.OnTouchModeChangeListener touchModeChangeListener;
    @NotNull
    private final ViewConfiguration viewConfiguration;
    @Nullable
    private DrawChildContainer viewLayersContainer;
    @NotNull
    private final float[] viewToWindowMatrix;
    @NotNull
    private final MutableState viewTreeOwners$delegate;
    private boolean wasMeasuredWithMultipleConstraints;
    private long windowPosition;
    @NotNull
    private final float[] windowToViewMatrix;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0003R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$Companion;", "", "()V", "MaximumLayerCacheSize", "", "getBooleanMethod", "Ljava/lang/reflect/Method;", "systemPropertiesClass", "Ljava/lang/Class;", "getIsShowingLayoutBounds", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @SuppressLint({"PrivateApi", "BanUncheckedReflection"})
        public final boolean getIsShowingLayoutBounds() {
            try {
                if (AndroidComposeView.systemPropertiesClass == null) {
                    AndroidComposeView.systemPropertiesClass = Class.forName("android.os.SystemProperties");
                    Class cls = AndroidComposeView.systemPropertiesClass;
                    AndroidComposeView.getBooleanMethod = cls == null ? null : cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
                }
                Method method = AndroidComposeView.getBooleanMethod;
                Object invoke = method == null ? null : method.invoke(null, "debug.layout", Boolean.FALSE);
                Boolean bool = invoke instanceof Boolean ? invoke : null;
                if (bool == null) {
                    return false;
                }
                return bool.booleanValue();
            } catch (Exception unused) {
                return false;
            }
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "savedStateRegistryOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/savedstate/SavedStateRegistryOwner;)V", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "getSavedStateRegistryOwner", "()Landroidx/savedstate/SavedStateRegistryOwner;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class ViewTreeOwners {
        public static final int $stable = 8;
        @NotNull
        private final LifecycleOwner lifecycleOwner;
        @NotNull
        private final SavedStateRegistryOwner savedStateRegistryOwner;

        public ViewTreeOwners(@NotNull LifecycleOwner lifecycleOwner, @NotNull SavedStateRegistryOwner savedStateRegistryOwner) {
            Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
            Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "savedStateRegistryOwner");
            this.lifecycleOwner = lifecycleOwner;
            this.savedStateRegistryOwner = savedStateRegistryOwner;
        }

        @NotNull
        public final LifecycleOwner getLifecycleOwner() {
            return this.lifecycleOwner;
        }

        @NotNull
        public final SavedStateRegistryOwner getSavedStateRegistryOwner() {
            return this.savedStateRegistryOwner;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r10v9, types: [androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1] */
    public AndroidComposeView(@NotNull Context context) {
        super(context);
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        Intrinsics.checkNotNullParameter(context, "context");
        Offset.Companion companion = Offset.Companion;
        this.lastDownPointerPosition = companion.m1176getUnspecifiedF1C5BW0();
        this.superclassInitComplete = true;
        this.sharedDrawScope = new LayoutNodeDrawScope(null, 1, null);
        this.density = AndroidDensity_androidKt.Density(context);
        SemanticsModifierCore semanticsModifierCore = new SemanticsModifierCore(SemanticsModifierCore.Companion.generateSemanticsId(), false, false, AndroidComposeView$semanticsModifier$1.INSTANCE);
        this.semanticsModifier = semanticsModifierCore;
        FocusManagerImpl focusManagerImpl = new FocusManagerImpl(null, 1, null);
        this._focusManager = focusManagerImpl;
        this._windowInfo = new WindowInfoImpl();
        KeyInputModifier keyInputModifier = new KeyInputModifier(new AndroidComposeView$keyInputModifier$1(this), null);
        this.keyInputModifier = keyInputModifier;
        this.canvasHolder = new CanvasHolder();
        LayoutNode layoutNode = new LayoutNode(false, 1, null);
        layoutNode.setMeasurePolicy(RootMeasurePolicy.INSTANCE);
        layoutNode.setModifier(Modifier.Companion.then(semanticsModifierCore).then(focusManagerImpl.getModifier()).then(keyInputModifier));
        layoutNode.setDensity(getDensity());
        this.root = layoutNode;
        this.rootForTest = this;
        this.semanticsOwner = new SemanticsOwner(getRoot());
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.accessibilityDelegate = androidComposeViewAccessibilityDelegateCompat;
        this.autofillTree = new AutofillTree();
        this.dirtyLayers = new ArrayList();
        this.motionEventAdapter = new MotionEventAdapter();
        this.pointerInputEventProcessor = new PointerInputEventProcessor(getRoot());
        this.configurationChangeObserver = AndroidComposeView$configurationChangeObserver$1.INSTANCE;
        this._autofill = autofillSupported() ? new AndroidAutofill(this, getAutofillTree()) : null;
        this.clipboardManager = new AndroidClipboardManager(context);
        this.accessibilityManager = new AndroidAccessibilityManager(context);
        this.snapshotObserver = new OwnerSnapshotObserver(new AndroidComposeView$snapshotObserver$1(this));
        this.measureAndLayoutDelegate = new MeasureAndLayoutDelegate(getRoot());
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        Intrinsics.checkNotNullExpressionValue(viewConfiguration, "get(context)");
        this.viewConfiguration = new AndroidViewConfiguration(viewConfiguration);
        this.globalPosition = IntOffset.Companion.m3453getZeronOccac();
        this.tmpPositionArray = new int[]{0, 0};
        this.viewToWindowMatrix = Matrix.m1560constructorimpl$default(null, 1, null);
        this.windowToViewMatrix = Matrix.m1560constructorimpl$default(null, 1, null);
        this.tmpCalculationMatrix = Matrix.m1560constructorimpl$default(null, 1, null);
        this.lastMatrixRecalculationAnimationTime = -1L;
        this.windowPosition = companion.m1175getInfiniteF1C5BW0();
        this.isRenderNodeCompatible = true;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.viewTreeOwners$delegate = mutableStateOf$default;
        this.globalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.compose.ui.platform.a
            {
                AndroidComposeView.this = this;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AndroidComposeView.m2906globalLayoutListener$lambda1(AndroidComposeView.this);
            }
        };
        this.scrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.compose.ui.platform.b
            {
                AndroidComposeView.this = this;
            }

            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                AndroidComposeView.m2910scrollChangedListener$lambda2(AndroidComposeView.this);
            }
        };
        this.touchModeChangeListener = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: androidx.compose.ui.platform.c
            {
                AndroidComposeView.this = this;
            }

            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z) {
                AndroidComposeView.m2913touchModeChangeListener$lambda3(AndroidComposeView.this, z);
            }
        };
        TextInputServiceAndroid textInputServiceAndroid = new TextInputServiceAndroid(this);
        this.textInputServiceAndroid = textInputServiceAndroid;
        this.textInputService = AndroidComposeView_androidKt.getTextInputServiceFactory().invoke(textInputServiceAndroid);
        this.fontLoader = new AndroidFontResourceLoader(context);
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "context.resources.configuration");
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AndroidComposeView_androidKt.getLocaleLayoutDirection(configuration), null, 2, null);
        this.layoutDirection$delegate = mutableStateOf$default2;
        this.hapticFeedBack = new PlatformHapticFeedback(this);
        this._inputModeManager = new InputModeManagerImpl(isInTouchMode() ? InputMode.Companion.m1945getTouchaOaMEAU() : InputMode.Companion.m1944getKeyboardaOaMEAU(), new AndroidComposeView$_inputModeManager$1(this), null);
        this.textToolbar = new AndroidTextToolbar(this);
        this.layerCache = new WeakCache<>();
        this.resendMotionEventRunnable = new Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1
            {
                AndroidComposeView.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                MotionEvent motionEvent;
                long j2;
                AndroidComposeView.this.removeCallbacks(this);
                motionEvent = AndroidComposeView.this.previousMotionEvent;
                if (motionEvent != null) {
                    boolean z = false;
                    boolean z2 = motionEvent.getToolType(0) == 3;
                    int actionMasked = motionEvent.getActionMasked();
                    if (!z2 ? actionMasked != 1 : !(actionMasked == 10 || actionMasked == 1)) {
                        z = true;
                    }
                    if (z) {
                        int i2 = 7;
                        if (actionMasked != 7 && actionMasked != 9) {
                            i2 = 2;
                        }
                        AndroidComposeView androidComposeView = AndroidComposeView.this;
                        j2 = androidComposeView.relayoutTime;
                        androidComposeView.sendSimulatedEvent(motionEvent, i2, j2, false);
                    }
                }
            }
        };
        this.sendHoverExitEvent = new Runnable() { // from class: androidx.compose.ui.platform.d
            {
                AndroidComposeView.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeView.m2911sendHoverExitEvent$lambda5(AndroidComposeView.this);
            }
        };
        this.resendMotionEventOnLayout = new AndroidComposeView$resendMotionEventOnLayout$1(this);
        setWillNotDraw(false);
        setFocusable(true);
        AndroidComposeViewVerificationHelperMethodsO.INSTANCE.focusable(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        setTransitionGroup(true);
        ViewCompat.setAccessibilityDelegate(this, androidComposeViewAccessibilityDelegateCompat);
        Function1<ViewRootForTest, Unit> onViewCreatedCallback = ViewRootForTest.Companion.getOnViewCreatedCallback();
        if (onViewCreatedCallback != null) {
            onViewCreatedCallback.invoke(this);
        }
        getRoot().attach$ui_release(this);
        AndroidComposeViewForceDarkModeQ.INSTANCE.disallowForceDark(this);
        this.pointerIconService = new PointerIconService() { // from class: androidx.compose.ui.platform.AndroidComposeView$pointerIconService$1
            @Override // androidx.compose.ui.input.pointer.PointerIconService
            @NotNull
            public PointerIcon getCurrent() {
                PointerIcon pointerIcon;
                pointerIcon = AndroidComposeView.this.desiredPointerIcon;
                return pointerIcon == null ? PointerIconDefaults.INSTANCE.getDefault() : pointerIcon;
            }

            @Override // androidx.compose.ui.input.pointer.PointerIconService
            public void setCurrent(@NotNull PointerIcon value) {
                Intrinsics.checkNotNullParameter(value, "value");
                AndroidComposeView.this.desiredPointerIcon = value;
            }
        };
    }

    private final boolean autofillSupported() {
        return true;
    }

    private final void clearChildInvalidObservations(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            int i3 = i2 + 1;
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).clearInvalidObservations$ui_release();
            } else if (childAt instanceof ViewGroup) {
                clearChildInvalidObservations((ViewGroup) childAt);
            }
            i2 = i3;
        }
    }

    private final Pair<Integer, Integer> convertMeasureSpec(int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            i3 = 0;
        } else if (mode == 0) {
            i3 = 0;
            size = Integer.MAX_VALUE;
        } else if (mode != 1073741824) {
            throw new IllegalStateException();
        } else {
            i3 = Integer.valueOf(size);
        }
        return TuplesKt.to(i3, Integer.valueOf(size));
    }

    private final View findViewByAccessibilityIdRootedAtCurrentView(int i2, View view) {
        return null;
    }

    @VisibleForTesting
    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public static /* synthetic */ void getTextInputService$annotations() {
    }

    /* renamed from: globalLayoutListener$lambda-1 */
    public static final void m2906globalLayoutListener$lambda1(AndroidComposeView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.updatePositionCacheAndDispatch();
    }

    /* renamed from: handleMotionEvent-8iAsVTc */
    private final int m2907handleMotionEvent8iAsVTc(MotionEvent motionEvent) {
        removeCallbacks(this.resendMotionEventRunnable);
        try {
            recalculateWindowPosition(motionEvent);
            boolean z = true;
            this.forceUseMatrixCache = true;
            measureAndLayout(false);
            this.desiredPointerIcon = null;
            Trace.beginSection("AndroidOwner:onTouch");
            int actionMasked = motionEvent.getActionMasked();
            MotionEvent motionEvent2 = this.previousMotionEvent;
            boolean z2 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
            if (motionEvent2 != null && hasChangedDevices(motionEvent, motionEvent2)) {
                if (isDevicePressEvent(motionEvent2)) {
                    this.pointerInputEventProcessor.processCancel();
                } else if (motionEvent2.getActionMasked() != 10 && z2) {
                    sendSimulatedEvent$default(this, motionEvent2, 10, motionEvent2.getEventTime(), false, 8, null);
                }
            }
            if (motionEvent.getToolType(0) != 3) {
                z = false;
            }
            if (!z2 && z && actionMasked != 3 && actionMasked != 9 && isInBounds(motionEvent)) {
                sendSimulatedEvent$default(this, motionEvent, 9, motionEvent.getEventTime(), false, 8, null);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            this.previousMotionEvent = MotionEvent.obtainNoHistory(motionEvent);
            int m2912sendMotionEvent8iAsVTc = m2912sendMotionEvent8iAsVTc(motionEvent);
            Trace.endSection();
            AndroidComposeViewVerificationHelperMethodsN.INSTANCE.setPointerIcon(this, this.desiredPointerIcon);
            return m2912sendMotionEvent8iAsVTc;
        } finally {
            this.forceUseMatrixCache = false;
        }
    }

    private final boolean hasChangedDevices(MotionEvent motionEvent, MotionEvent motionEvent2) {
        return (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true;
    }

    private final void invalidateLayers(LayoutNode layoutNode) {
        layoutNode.invalidateLayers$ui_release();
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            int i2 = 0;
            LayoutNode[] content = mutableVector.getContent();
            do {
                invalidateLayers(content[i2]);
                i2++;
            } while (i2 < size);
        }
    }

    private final void invalidateLayoutNodeMeasurement(LayoutNode layoutNode) {
        this.measureAndLayoutDelegate.requestRemeasure(layoutNode);
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            int i2 = 0;
            LayoutNode[] content = mutableVector.getContent();
            do {
                invalidateLayoutNodeMeasurement(content[i2]);
                i2++;
            } while (i2 < size);
        }
    }

    private final boolean isBadMotionEvent(MotionEvent motionEvent) {
        return Float.isNaN(motionEvent.getX()) || Float.isNaN(motionEvent.getY()) || Float.isNaN(motionEvent.getRawX()) || Float.isNaN(motionEvent.getRawY());
    }

    private final boolean isDevicePressEvent(MotionEvent motionEvent) {
        int actionMasked;
        return motionEvent.getButtonState() != 0 || (actionMasked = motionEvent.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6;
    }

    private final boolean isInBounds(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (0.0f <= x && x <= ((float) getWidth())) {
            if (0.0f <= y && y <= ((float) getHeight())) {
                return true;
            }
        }
        return false;
    }

    private final boolean isPositionChanged(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        if (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.previousMotionEvent) != null) {
            if (motionEvent.getRawX() == motionEvent2.getRawX()) {
                return !((motionEvent.getRawY() > motionEvent2.getRawY() ? 1 : (motionEvent.getRawY() == motionEvent2.getRawY() ? 0 : -1)) == 0);
            }
            return true;
        }
        return true;
    }

    /* renamed from: preConcat-tU-YjHk */
    private final void m2908preConcattUYjHk(float[] fArr, android.graphics.Matrix matrix) {
        AndroidMatrixConversions_androidKt.m1274setFromtUYjHk(this.tmpCalculationMatrix, matrix);
        AndroidComposeView_androidKt.m2923preTransformJiSxe2E(fArr, this.tmpCalculationMatrix);
    }

    /* renamed from: preTranslate-3XD1CNM */
    private final void m2909preTranslate3XD1CNM(float[] fArr, float f2, float f3) {
        Matrix.m1569resetimpl(this.tmpCalculationMatrix);
        Matrix.m1580translateimpl$default(this.tmpCalculationMatrix, f2, f3, 0.0f, 4, null);
        AndroidComposeView_androidKt.m2923preTransformJiSxe2E(fArr, this.tmpCalculationMatrix);
    }

    private final void recalculateWindowPosition() {
        if (this.forceUseMatrixCache) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.lastMatrixRecalculationAnimationTime) {
            this.lastMatrixRecalculationAnimationTime = currentAnimationTimeMillis;
            recalculateWindowViewTransforms();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            view.getLocationOnScreen(this.tmpPositionArray);
            int[] iArr = this.tmpPositionArray;
            view.getLocationInWindow(iArr);
            int[] iArr2 = this.tmpPositionArray;
            this.windowPosition = OffsetKt.Offset(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
        }
    }

    private final void recalculateWindowPosition(MotionEvent motionEvent) {
        this.lastMatrixRecalculationAnimationTime = AnimationUtils.currentAnimationTimeMillis();
        recalculateWindowViewTransforms();
        long m1566mapMKHz9U = Matrix.m1566mapMKHz9U(this.viewToWindowMatrix, OffsetKt.Offset(motionEvent.getX(), motionEvent.getY()));
        this.windowPosition = OffsetKt.Offset(motionEvent.getRawX() - Offset.m1161getXimpl(m1566mapMKHz9U), motionEvent.getRawY() - Offset.m1162getYimpl(m1566mapMKHz9U));
    }

    private final void recalculateWindowViewTransforms() {
        Matrix.m1569resetimpl(this.viewToWindowMatrix);
        m2914transformMatrixToWindowEL8BTi8(this, this.viewToWindowMatrix);
        InvertMatrixKt.m2941invertToJiSxe2E(this.viewToWindowMatrix, this.windowToViewMatrix);
    }

    private final void scheduleMeasureAndLayout(LayoutNode layoutNode) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (this.wasMeasuredWithMultipleConstraints && layoutNode != null) {
            while (layoutNode != null && layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock) {
                layoutNode = layoutNode.getParent$ui_release();
            }
            if (layoutNode == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public static /* synthetic */ void scheduleMeasureAndLayout$default(AndroidComposeView androidComposeView, LayoutNode layoutNode, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            layoutNode = null;
        }
        androidComposeView.scheduleMeasureAndLayout(layoutNode);
    }

    /* renamed from: scrollChangedListener$lambda-2 */
    public static final void m2910scrollChangedListener$lambda2(AndroidComposeView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.updatePositionCacheAndDispatch();
    }

    /* renamed from: sendHoverExitEvent$lambda-5 */
    public static final void m2911sendHoverExitEvent$lambda5(AndroidComposeView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hoverExitReceived = false;
        MotionEvent motionEvent = this$0.previousMotionEvent;
        Intrinsics.checkNotNull(motionEvent);
        if (!(motionEvent.getActionMasked() == 10)) {
            throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.".toString());
        }
        this$0.m2912sendMotionEvent8iAsVTc(motionEvent);
    }

    /* renamed from: sendMotionEvent-8iAsVTc */
    private final int m2912sendMotionEvent8iAsVTc(MotionEvent motionEvent) {
        PointerInputEventData pointerInputEventData;
        PointerInputEvent convertToPointerInputEvent$ui_release = this.motionEventAdapter.convertToPointerInputEvent$ui_release(motionEvent, this);
        if (convertToPointerInputEvent$ui_release == null) {
            this.pointerInputEventProcessor.processCancel();
            return PointerInputEventProcessorKt.ProcessResult(false, false);
        }
        List<PointerInputEventData> pointers = convertToPointerInputEvent$ui_release.getPointers();
        ListIterator<PointerInputEventData> listIterator = pointers.listIterator(pointers.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                pointerInputEventData = null;
                break;
            }
            pointerInputEventData = listIterator.previous();
            if (pointerInputEventData.getDown()) {
                break;
            }
        }
        PointerInputEventData pointerInputEventData2 = pointerInputEventData;
        if (pointerInputEventData2 != null) {
            this.lastDownPointerPosition = pointerInputEventData2.m2672getPositionF1C5BW0();
        }
        int m2677processBIzXfog = this.pointerInputEventProcessor.m2677processBIzXfog(convertToPointerInputEvent$ui_release, this, isInBounds(motionEvent));
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked == 0 || actionMasked == 5) && !ProcessResult.m2732getDispatchedToAPointerInputModifierimpl(m2677processBIzXfog)) {
            this.motionEventAdapter.endStream(motionEvent.getPointerId(motionEvent.getActionIndex()));
            return m2677processBIzXfog;
        }
        return m2677processBIzXfog;
    }

    public final void sendSimulatedEvent(MotionEvent motionEvent, int i2, long j2, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int i3 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i3 = motionEvent.getActionIndex();
            }
        } else if (i2 != 9 && i2 != 10) {
            i3 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i3 >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i4 = 0; i4 < pointerCount; i4++) {
            pointerPropertiesArr[i4] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i5 = 0; i5 < pointerCount; i5++) {
            pointerCoordsArr[i5] = new MotionEvent.PointerCoords();
        }
        int i6 = 0;
        while (i6 < pointerCount) {
            int i7 = i6 + 1;
            int i8 = ((i3 < 0 || i6 < i3) ? 0 : 1) + i6;
            motionEvent.getPointerProperties(i8, pointerPropertiesArr[i6]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i6];
            motionEvent.getPointerCoords(i8, pointerCoords);
            long mo2725localToScreenMKHz9U = mo2725localToScreenMKHz9U(OffsetKt.Offset(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = Offset.m1161getXimpl(mo2725localToScreenMKHz9U);
            pointerCoords.y = Offset.m1162getYimpl(mo2725localToScreenMKHz9U);
            i6 = i7;
        }
        MotionEvent event = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j2 : motionEvent.getDownTime(), j2, i2, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        MotionEventAdapter motionEventAdapter = this.motionEventAdapter;
        Intrinsics.checkNotNullExpressionValue(event, "event");
        PointerInputEvent convertToPointerInputEvent$ui_release = motionEventAdapter.convertToPointerInputEvent$ui_release(event, this);
        Intrinsics.checkNotNull(convertToPointerInputEvent$ui_release);
        this.pointerInputEventProcessor.m2677processBIzXfog(convertToPointerInputEvent$ui_release, this, true);
        event.recycle();
    }

    public static /* synthetic */ void sendSimulatedEvent$default(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i2, long j2, boolean z, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            z = true;
        }
        androidComposeView.sendSimulatedEvent(motionEvent, i2, j2, z);
    }

    private void setLayoutDirection(LayoutDirection layoutDirection) {
        this.layoutDirection$delegate.setValue(layoutDirection);
    }

    private final void setViewTreeOwners(ViewTreeOwners viewTreeOwners) {
        this.viewTreeOwners$delegate.setValue(viewTreeOwners);
    }

    /* renamed from: touchModeChangeListener$lambda-3 */
    public static final void m2913touchModeChangeListener$lambda3(AndroidComposeView this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0._inputModeManager.m1948setInputModeiuPiT84(z ? InputMode.Companion.m1945getTouchaOaMEAU() : InputMode.Companion.m1944getKeyboardaOaMEAU());
        this$0._focusManager.fetchUpdatedFocusProperties();
    }

    /* renamed from: transformMatrixToWindow-EL8BTi8 */
    private final void m2914transformMatrixToWindowEL8BTi8(View view, float[] fArr) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            m2914transformMatrixToWindowEL8BTi8((View) parent, fArr);
            m2909preTranslate3XD1CNM(fArr, -view.getScrollX(), -view.getScrollY());
            m2909preTranslate3XD1CNM(fArr, view.getLeft(), view.getTop());
        } else {
            view.getLocationInWindow(this.tmpPositionArray);
            m2909preTranslate3XD1CNM(fArr, -view.getScrollX(), -view.getScrollY());
            int[] iArr = this.tmpPositionArray;
            m2909preTranslate3XD1CNM(fArr, iArr[0], iArr[1]);
        }
        android.graphics.Matrix viewMatrix = view.getMatrix();
        if (viewMatrix.isIdentity()) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(viewMatrix, "viewMatrix");
        m2908preConcattUYjHk(fArr, viewMatrix);
    }

    private final void updatePositionCacheAndDispatch() {
        getLocationOnScreen(this.tmpPositionArray);
        boolean z = false;
        if (IntOffset.m3443getXimpl(this.globalPosition) != this.tmpPositionArray[0] || IntOffset.m3444getYimpl(this.globalPosition) != this.tmpPositionArray[1]) {
            int[] iArr = this.tmpPositionArray;
            this.globalPosition = IntOffsetKt.IntOffset(iArr[0], iArr[1]);
            z = true;
        }
        this.measureAndLayoutDelegate.dispatchOnPositionedCallbacks(z);
    }

    public final void addAndroidView(@NotNull AndroidViewHolder view, @NotNull final LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(view, layoutNode);
        getAndroidViewsHandler$ui_release().addView(view);
        getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(layoutNode, view);
        ViewCompat.setImportantForAccessibility(view, 1);
        ViewCompat.setAccessibilityDelegate(view, new AccessibilityDelegateCompat() { // from class: androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(@NotNull View host, @NotNull AccessibilityNodeInfoCompat info) {
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                SemanticsWrapper outerSemantics = SemanticsNodeKt.getOuterSemantics(LayoutNode.this);
                Intrinsics.checkNotNull(outerSemantics);
                SemanticsNode parent = new SemanticsNode(outerSemantics, false).getParent();
                Intrinsics.checkNotNull(parent);
                int id = parent.getId();
                if (id == this.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) {
                    id = -1;
                }
                info.setParent(this, id);
            }
        });
    }

    @Override // android.view.View
    public void autofill(@NotNull SparseArray<AutofillValue> values) {
        AndroidAutofill androidAutofill;
        Intrinsics.checkNotNullParameter(values, "values");
        if (!autofillSupported() || (androidAutofill = this._autofill) == null) {
            return;
        }
        AndroidAutofill_androidKt.performAutofill(androidAutofill, values);
    }

    @Nullable
    public final Object boundsUpdatesEventLoop(@NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object boundsUpdatesEventLoop = this.accessibilityDelegate.boundsUpdatesEventLoop(continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return boundsUpdatesEventLoop == coroutine_suspended ? boundsUpdatesEventLoop : Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.node.Owner
    /* renamed from: calculateLocalPosition-MK-Hz9U */
    public long mo2899calculateLocalPositionMKHz9U(long j2) {
        recalculateWindowPosition();
        return Matrix.m1566mapMKHz9U(this.windowToViewMatrix, j2);
    }

    @Override // androidx.compose.ui.node.Owner
    /* renamed from: calculatePositionInWindow-MK-Hz9U */
    public long mo2900calculatePositionInWindowMKHz9U(long j2) {
        recalculateWindowPosition();
        return Matrix.m1566mapMKHz9U(this.viewToWindowMatrix, j2);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        return this.accessibilityDelegate.m2919canScroll0AR0LA0$ui_release(false, i2, this.lastDownPointerPosition);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i2) {
        return this.accessibilityDelegate.m2919canScroll0AR0LA0$ui_release(true, i2, this.lastDownPointerPosition);
    }

    public final void clearInvalidObservations$ui_release() {
        if (this.observationClearRequested) {
            getSnapshotObserver().clearInvalidObservations$ui_release();
            this.observationClearRequested = false;
        }
        AndroidViewsHandler androidViewsHandler = this._androidViewsHandler;
        if (androidViewsHandler != null) {
            clearChildInvalidObservations(androidViewsHandler);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public OwnedLayer createLayer(@NotNull Function1<? super Canvas, Unit> drawBlock, @NotNull Function0<Unit> invalidateParentLayer) {
        DrawChildContainer viewLayerContainer;
        Intrinsics.checkNotNullParameter(drawBlock, "drawBlock");
        Intrinsics.checkNotNullParameter(invalidateParentLayer, "invalidateParentLayer");
        OwnedLayer pop = this.layerCache.pop();
        if (pop != null) {
            pop.reuseLayer(drawBlock, invalidateParentLayer);
            return pop;
        }
        if (isHardwareAccelerated() && this.isRenderNodeCompatible) {
            try {
                return new RenderNodeLayer(this, drawBlock, invalidateParentLayer);
            } catch (Throwable unused) {
                this.isRenderNodeCompatible = false;
            }
        }
        if (this.viewLayersContainer == null) {
            ViewLayer.Companion companion = ViewLayer.Companion;
            if (!companion.getHasRetrievedMethod()) {
                companion.updateDisplayList(new View(getContext()));
            }
            if (companion.getShouldUseDispatchDraw()) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                viewLayerContainer = new DrawChildContainer(context);
            } else {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "context");
                viewLayerContainer = new ViewLayerContainer(context2);
            }
            this.viewLayersContainer = viewLayerContainer;
            addView(viewLayerContainer);
        }
        DrawChildContainer drawChildContainer = this.viewLayersContainer;
        Intrinsics.checkNotNull(drawChildContainer);
        return new ViewLayer(this, drawChildContainer, drawBlock, invalidateParentLayer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (!isAttachedToWindow()) {
            invalidateLayers(getRoot());
        }
        Owner.DefaultImpls.measureAndLayout$default(this, false, 1, null);
        this.isDrawingContent = true;
        CanvasHolder canvasHolder = this.canvasHolder;
        android.graphics.Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
        getRoot().draw$ui_release(canvasHolder.getAndroidCanvas());
        canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        if (!this.dirtyLayers.isEmpty()) {
            int size = this.dirtyLayers.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.dirtyLayers.get(i2).updateDisplayList();
            }
        }
        if (ViewLayer.Companion.getShouldUseDispatchDraw()) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        this.dirtyLayers.clear();
        this.isDrawingContent = false;
        List<OwnedLayer> list = this.postponedDirtyLayers;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            this.dirtyLayers.addAll(list);
            list.clear();
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return event.getActionMasked() == 8 ? ProcessResult.m2732getDispatchedToAPointerInputModifierimpl(m2907handleMotionEvent8iAsVTc(event)) : super.dispatchGenericMotionEvent(event);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            this.sendHoverExitEvent.run();
        }
        if (isBadMotionEvent(event)) {
            return false;
        }
        if (event.isFromSource(InputDeviceCompat.SOURCE_TOUCHSCREEN) && event.getToolType(0) == 1) {
            return this.accessibilityDelegate.dispatchHoverEvent(event);
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && isInBounds(event)) {
                if (event.getToolType(0) != 3) {
                    MotionEvent motionEvent = this.previousMotionEvent;
                    if (motionEvent != null) {
                        motionEvent.recycle();
                    }
                    this.previousMotionEvent = MotionEvent.obtainNoHistory(event);
                    this.hoverExitReceived = true;
                    post(this.sendHoverExitEvent);
                    return false;
                } else if (event.getButtonState() != 0) {
                    return false;
                }
            }
        } else if (!isPositionChanged(event)) {
            return false;
        }
        return ProcessResult.m2732getDispatchedToAPointerInputModifierimpl(m2907handleMotionEvent8iAsVTc(event));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(@NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return isFocused() ? mo2905sendKeyEventZmokQxo(androidx.compose.ui.input.key.KeyEvent.m2531constructorimpl(event)) : super.dispatchKeyEvent(event);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            MotionEvent motionEvent2 = this.previousMotionEvent;
            Intrinsics.checkNotNull(motionEvent2);
            if (motionEvent.getActionMasked() != 0 || hasChangedDevices(motionEvent, motionEvent2)) {
                this.sendHoverExitEvent.run();
            } else {
                this.hoverExitReceived = false;
            }
        }
        if (isBadMotionEvent(motionEvent)) {
            return false;
        }
        if (motionEvent.getActionMasked() != 2 || isPositionChanged(motionEvent)) {
            int m2907handleMotionEvent8iAsVTc = m2907handleMotionEvent8iAsVTc(motionEvent);
            if (ProcessResult.m2731getAnyMovementConsumedimpl(m2907handleMotionEvent8iAsVTc)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            return ProcessResult.m2732getDispatchedToAPointerInputModifierimpl(m2907handleMotionEvent8iAsVTc);
        }
        return false;
    }

    public final void drawAndroidView(@NotNull AndroidViewHolder view, @NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        getAndroidViewsHandler$ui_release().drawView(view, canvas);
    }

    @Nullable
    public final View findViewByAccessibilityIdTraversal(int i2) {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, Integer.valueOf(i2));
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void forceMeasureTheSubtree(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.measureAndLayoutDelegate.forceMeasureTheSubtree(layoutNode);
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public AndroidAccessibilityManager getAccessibilityManager() {
        return this.accessibilityManager;
    }

    @NotNull
    public final AndroidViewsHandler getAndroidViewsHandler$ui_release() {
        if (this._androidViewsHandler == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            AndroidViewsHandler androidViewsHandler = new AndroidViewsHandler(context);
            this._androidViewsHandler = androidViewsHandler;
            addView(androidViewsHandler);
        }
        AndroidViewsHandler androidViewsHandler2 = this._androidViewsHandler;
        Intrinsics.checkNotNull(androidViewsHandler2);
        return androidViewsHandler2;
    }

    @Override // androidx.compose.ui.node.Owner
    @Nullable
    public Autofill getAutofill() {
        return this._autofill;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public AutofillTree getAutofillTree() {
        return this.autofillTree;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public AndroidClipboardManager getClipboardManager() {
        return this.clipboardManager;
    }

    @NotNull
    public final Function1<Configuration, Unit> getConfigurationChangeObserver() {
        return this.configurationChangeObserver;
    }

    @Override // androidx.compose.ui.node.Owner, androidx.compose.ui.node.RootForTest
    @NotNull
    public Density getDensity() {
        return this.density;
    }

    @Override // androidx.compose.ui.node.Owner
    @Nullable
    /* renamed from: getFocusDirection-P8AzH3I */
    public FocusDirection mo2901getFocusDirectionP8AzH3I(@NotNull KeyEvent keyEvent) {
        int m1114getOutdhqQ8s;
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        long m2547getKeyZmokQxo = KeyEvent_androidKt.m2547getKeyZmokQxo(keyEvent);
        Key.Companion companion = Key.Companion;
        if (Key.m1952equalsimpl0(m2547getKeyZmokQxo, companion.m2475getTabEK5gGoQ())) {
            m1114getOutdhqQ8s = KeyEvent_androidKt.m2553isShiftPressedZmokQxo(keyEvent) ? FocusDirection.Companion.m1115getPreviousdhqQ8s() : FocusDirection.Companion.m1113getNextdhqQ8s();
        } else if (Key.m1952equalsimpl0(m2547getKeyZmokQxo, companion.m2316getDirectionRightEK5gGoQ())) {
            m1114getOutdhqQ8s = FocusDirection.Companion.m1116getRightdhqQ8s();
        } else if (Key.m1952equalsimpl0(m2547getKeyZmokQxo, companion.m2315getDirectionLeftEK5gGoQ())) {
            m1114getOutdhqQ8s = FocusDirection.Companion.m1112getLeftdhqQ8s();
        } else if (Key.m1952equalsimpl0(m2547getKeyZmokQxo, companion.m2317getDirectionUpEK5gGoQ())) {
            m1114getOutdhqQ8s = FocusDirection.Companion.m1117getUpdhqQ8s();
        } else if (Key.m1952equalsimpl0(m2547getKeyZmokQxo, companion.m2312getDirectionDownEK5gGoQ())) {
            m1114getOutdhqQ8s = FocusDirection.Companion.m1110getDowndhqQ8s();
        } else {
            if (Key.m1952equalsimpl0(m2547getKeyZmokQxo, companion.m2311getDirectionCenterEK5gGoQ()) ? true : Key.m1952equalsimpl0(m2547getKeyZmokQxo, companion.m2325getEnterEK5gGoQ()) ? true : Key.m1952equalsimpl0(m2547getKeyZmokQxo, companion.m2417getNumPadEnterEK5gGoQ())) {
                m1114getOutdhqQ8s = FocusDirection.Companion.m1111getIndhqQ8s();
            } else {
                if (!(Key.m1952equalsimpl0(m2547getKeyZmokQxo, companion.m2254getBackEK5gGoQ()) ? true : Key.m1952equalsimpl0(m2547getKeyZmokQxo, companion.m2328getEscapeEK5gGoQ()))) {
                    return null;
                }
                m1114getOutdhqQ8s = FocusDirection.Companion.m1114getOutdhqQ8s();
            }
        }
        return FocusDirection.m1101boximpl(m1114getOutdhqQ8s);
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public FocusManager getFocusManager() {
        return this._focusManager;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public Font.ResourceLoader getFontLoader() {
        return this.fontLoader;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public boolean getHasPendingMeasureOrLayout() {
        return this.measureAndLayoutDelegate.getHasPendingMeasureOrLayout();
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public InputModeManager getInputModeManager() {
        return this._inputModeManager;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.lastMatrixRecalculationAnimationTime;
    }

    @Override // android.view.View, android.view.ViewParent, androidx.compose.ui.node.Owner
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return (LayoutDirection) this.layoutDirection$delegate.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    public long getMeasureIteration() {
        return this.measureAndLayoutDelegate.getMeasureIteration();
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public PointerIconService getPointerIconService() {
        return this.pointerIconService;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public LayoutNode getRoot() {
        return this.root;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public RootForTest getRootForTest() {
        return this.rootForTest;
    }

    @Override // androidx.compose.ui.node.RootForTest
    @NotNull
    public SemanticsOwner getSemanticsOwner() {
        return this.semanticsOwner;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public LayoutNodeDrawScope getSharedDrawScope() {
        return this.sharedDrawScope;
    }

    @Override // androidx.compose.ui.node.Owner
    public boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public OwnerSnapshotObserver getSnapshotObserver() {
        return this.snapshotObserver;
    }

    @Override // androidx.compose.ui.node.Owner, androidx.compose.ui.node.RootForTest
    @NotNull
    public TextInputService getTextInputService() {
        return this.textInputService;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    @NotNull
    public View getView() {
        return this;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    @Nullable
    public final ViewTreeOwners getViewTreeOwners() {
        return (ViewTreeOwners) this.viewTreeOwners$delegate.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public WindowInfo getWindowInfo() {
        return this._windowInfo;
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public void invalidateDescendants() {
        invalidateLayers(getRoot());
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public boolean isLifecycleInResumedState() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        Lifecycle.State state = null;
        if (viewTreeOwners != null && (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            state = lifecycle.getCurrentState();
        }
        return state == Lifecycle.State.RESUMED;
    }

    @Nullable
    public final Object keyboardVisibilityEventLoop(@NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object keyboardVisibilityEventLoop = this.textInputServiceAndroid.keyboardVisibilityEventLoop(continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return keyboardVisibilityEventLoop == coroutine_suspended ? keyboardVisibilityEventLoop : Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.input.pointer.PositionCalculator
    /* renamed from: localToScreen-MK-Hz9U */
    public long mo2725localToScreenMKHz9U(long j2) {
        recalculateWindowPosition();
        long m1566mapMKHz9U = Matrix.m1566mapMKHz9U(this.viewToWindowMatrix, j2);
        return OffsetKt.Offset(Offset.m1161getXimpl(m1566mapMKHz9U) + Offset.m1161getXimpl(this.windowPosition), Offset.m1162getYimpl(m1566mapMKHz9U) + Offset.m1162getYimpl(this.windowPosition));
    }

    @Override // androidx.compose.ui.node.Owner
    public void measureAndLayout(boolean z) {
        if (this.measureAndLayoutDelegate.measureAndLayout(z ? this.resendMotionEventOnLayout : null)) {
            requestLayout();
        }
        MeasureAndLayoutDelegate.dispatchOnPositionedCallbacks$default(this.measureAndLayoutDelegate, false, 1, null);
    }

    public final void notifyLayerIsDirty$ui_release(@NotNull OwnedLayer layer, boolean z) {
        Intrinsics.checkNotNullParameter(layer, "layer");
        if (!z) {
            if (!this.isDrawingContent && !this.dirtyLayers.remove(layer)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else if (!this.isDrawingContent) {
            this.dirtyLayers.add(layer);
        } else {
            List list = this.postponedDirtyLayers;
            if (list == null) {
                list = new ArrayList();
                this.postponedDirtyLayers = list;
            }
            list.add(layer);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void onAttach(@NotNull LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        AndroidAutofill androidAutofill;
        super.onAttachedToWindow();
        invalidateLayoutNodeMeasurement(getRoot());
        invalidateLayers(getRoot());
        getSnapshotObserver().startObserving$ui_release();
        if (autofillSupported() && (androidAutofill = this._autofill) != null) {
            AutofillCallback.INSTANCE.register(androidAutofill);
        }
        LifecycleOwner lifecycleOwner2 = ViewTreeLifecycleOwner.get(this);
        SavedStateRegistryOwner savedStateRegistryOwner = ViewTreeSavedStateRegistryOwner.get(this);
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || !(lifecycleOwner2 == null || savedStateRegistryOwner == null || (lifecycleOwner2 == viewTreeOwners.getLifecycleOwner() && savedStateRegistryOwner == viewTreeOwners.getLifecycleOwner()))) {
            if (lifecycleOwner2 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (savedStateRegistryOwner == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.removeObserver(this);
            }
            lifecycleOwner2.getLifecycle().addObserver(this);
            ViewTreeOwners viewTreeOwners2 = new ViewTreeOwners(lifecycleOwner2, savedStateRegistryOwner);
            setViewTreeOwners(viewTreeOwners2);
            Function1<? super ViewTreeOwners, Unit> function1 = this.onViewTreeOwnersAvailable;
            if (function1 != null) {
                function1.invoke(viewTreeOwners2);
            }
            this.onViewTreeOwnersAvailable = null;
        }
        ViewTreeOwners viewTreeOwners3 = getViewTreeOwners();
        Intrinsics.checkNotNull(viewTreeOwners3);
        viewTreeOwners3.getLifecycleOwner().getLifecycle().addObserver(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.globalLayoutListener);
        getViewTreeObserver().addOnScrollChangedListener(this.scrollChangedListener);
        getViewTreeObserver().addOnTouchModeChangeListener(this.touchModeChangeListener);
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        return this.textInputServiceAndroid.isEditorFocused();
    }

    @Override // android.view.View
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.density = AndroidDensity_androidKt.Density(context);
        this.configurationChangeObserver.invoke(newConfig);
    }

    @Override // android.view.View
    @Nullable
    public InputConnection onCreateInputConnection(@NotNull EditorInfo outAttrs) {
        Intrinsics.checkNotNullParameter(outAttrs, "outAttrs");
        return this.textInputServiceAndroid.createInputConnection(outAttrs);
    }

    @Override // androidx.compose.ui.node.Owner
    public void onDetach(@NotNull LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.measureAndLayoutDelegate.onNodeDetached(node);
        requestClearInvalidObservations();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        AndroidAutofill androidAutofill;
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        super.onDetachedFromWindow();
        getSnapshotObserver().stopObserving$ui_release();
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
        if (autofillSupported() && (androidAutofill = this._autofill) != null) {
            AutofillCallback.INSTANCE.unregister(androidAutofill);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.globalLayoutListener);
        getViewTreeObserver().removeOnScrollChangedListener(this.scrollChangedListener);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.touchModeChangeListener);
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i2, @Nullable Rect rect) {
        super.onFocusChanged(z, i2, rect);
        Log.d(FocusNodeUtilsKt.FocusTag, "Owner FocusChanged(" + z + ')');
        FocusManagerImpl focusManagerImpl = this._focusManager;
        if (z) {
            focusManagerImpl.takeFocus();
        } else {
            focusManagerImpl.releaseFocus();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        this.onMeasureConstraints = null;
        updatePositionCacheAndDispatch();
        if (this._androidViewsHandler != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i4 - i2, i5 - i3);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void onLayoutChange(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.accessibilityDelegate.onLayoutChange$ui_release(layoutNode);
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                invalidateLayoutNodeMeasurement(getRoot());
            }
            Pair<Integer, Integer> convertMeasureSpec = convertMeasureSpec(i2);
            int intValue = convertMeasureSpec.component1().intValue();
            int intValue2 = convertMeasureSpec.component2().intValue();
            Pair<Integer, Integer> convertMeasureSpec2 = convertMeasureSpec(i3);
            long Constraints = ConstraintsKt.Constraints(intValue, intValue2, convertMeasureSpec2.component1().intValue(), convertMeasureSpec2.component2().intValue());
            Constraints constraints = this.onMeasureConstraints;
            boolean z = false;
            if (constraints == null) {
                this.onMeasureConstraints = Constraints.m3281boximpl(Constraints);
                this.wasMeasuredWithMultipleConstraints = false;
            } else {
                if (constraints != null) {
                    z = Constraints.m3286equalsimpl0(constraints.m3299unboximpl(), Constraints);
                }
                if (!z) {
                    this.wasMeasuredWithMultipleConstraints = true;
                }
            }
            this.measureAndLayoutDelegate.m2887updateRootConstraintsBRTryo0(Constraints);
            this.measureAndLayoutDelegate.measureAndLayout(this.resendMotionEventOnLayout);
            setMeasuredDimension(getRoot().getWidth(), getRoot().getHeight());
            if (this._androidViewsHandler != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().getHeight(), 1073741824));
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(@Nullable ViewStructure viewStructure, int i2) {
        AndroidAutofill androidAutofill;
        if (!autofillSupported() || viewStructure == null || (androidAutofill = this._autofill) == null) {
            return;
        }
        AndroidAutofill_androidKt.populateViewStructure(androidAutofill, viewStructure);
    }

    @Override // androidx.compose.ui.node.Owner
    public void onRequestMeasure(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        if (this.measureAndLayoutDelegate.requestRemeasure(layoutNode)) {
            scheduleMeasureAndLayout(layoutNode);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void onRequestRelayout(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        if (this.measureAndLayoutDelegate.requestRelayout(layoutNode)) {
            scheduleMeasureAndLayout$default(this, null, 1, null);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public void onResume(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        setShowLayoutBounds(Companion.getIsShowingLayoutBounds());
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        LayoutDirection layoutDirectionFromInt;
        if (this.superclassInitComplete) {
            layoutDirectionFromInt = AndroidComposeView_androidKt.layoutDirectionFromInt(i2);
            setLayoutDirection(layoutDirectionFromInt);
            this._focusManager.setLayoutDirection(layoutDirectionFromInt);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void onSemanticsChange() {
        this.accessibilityDelegate.onSemanticsChange$ui_release();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        this._windowInfo.setWindowFocused(z);
        super.onWindowFocusChanged(z);
    }

    public final boolean recycle$ui_release(@NotNull OwnedLayer layer) {
        Intrinsics.checkNotNullParameter(layer, "layer");
        if (this.viewLayersContainer != null) {
            ViewLayer.Companion.getShouldUseDispatchDraw();
        }
        this.layerCache.push(layer);
        return true;
    }

    public final void removeAndroidView(@NotNull AndroidViewHolder view) {
        Intrinsics.checkNotNullParameter(view, "view");
        getAndroidViewsHandler$ui_release().removeView(view);
        getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().remove(getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(view));
        ViewCompat.setImportantForAccessibility(view, 0);
    }

    public final void requestClearInvalidObservations() {
        this.observationClearRequested = true;
    }

    @Override // androidx.compose.ui.input.pointer.PositionCalculator
    /* renamed from: screenToLocal-MK-Hz9U */
    public long mo2726screenToLocalMKHz9U(long j2) {
        recalculateWindowPosition();
        return Matrix.m1566mapMKHz9U(this.windowToViewMatrix, OffsetKt.Offset(Offset.m1161getXimpl(j2) - Offset.m1161getXimpl(this.windowPosition), Offset.m1162getYimpl(j2) - Offset.m1162getYimpl(this.windowPosition)));
    }

    @Override // androidx.compose.ui.node.RootForTest
    /* renamed from: sendKeyEvent-ZmokQxo */
    public boolean mo2905sendKeyEventZmokQxo(@NotNull KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        return this.keyInputModifier.m2554processKeyInputZmokQxo(keyEvent);
    }

    public final void setConfigurationChangeObserver(@NotNull Function1<? super Configuration, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.configurationChangeObserver = function1;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j2) {
        this.lastMatrixRecalculationAnimationTime = j2;
    }

    public final void setOnViewTreeOwnersAvailable(@NotNull Function1<? super ViewTreeOwners, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            callback.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.onViewTreeOwnersAvailable = callback;
    }

    @Override // androidx.compose.ui.node.Owner
    public void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
