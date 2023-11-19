package o;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.List;
import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000l\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0006\u001a\u008a\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032F\u0010\f\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u008c\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032F\u0010\f\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u009d\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032Y\b\u0001\u0010\f\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0012\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0011¢\u0006\u0002\b\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u009f\u0001\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032Y\b\u0001\u0010\f\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0012\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0011¢\u0006\u0002\b\u0014ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0016\u001a\u008a\u0001\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00030\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u000320\b\u0001\u0010\f\u001a*\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0011ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u009b\u0001\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00030\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032A\b\u0001\u0010\f\u001a;\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001c¢\u0006\u0002\b\u0014ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a¢\u0001\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00040\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u001f\"\u0004\b\u0004\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00030\u000324\u0010\f\u001a0\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001cø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001aµ\u0001\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00040\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u001f\"\u0004\b\u0004\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00030\u00032G\b\u0001\u0010\f\u001aA\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0#¢\u0006\u0002\b\u0014ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a¼\u0001\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00050\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u001f\"\u0004\b\u0004\u0010&\"\u0004\b\u0005\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00030\u00032\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00040\u00032:\u0010\f\u001a6\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0#ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001aÏ\u0001\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00050\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u001f\"\u0004\b\u0004\u0010&\"\u0004\b\u0005\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00030\u00032\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00040\u00032M\b\u0001\u0010\f\u001aG\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00050\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0*¢\u0006\u0002\b\u0014ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001as\u00101\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010/\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030.\"\b\u0012\u0004\u0012\u00028\u00000\u00032*\b\u0004\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b00H\u0086\bø\u0001\u0000¢\u0006\u0004\b1\u00102\u001a\u0084\u0001\u00103\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010/\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030.\"\b\u0012\u0004\u0012\u00028\u00000\u00032;\b\u0005\u0010\f\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005¢\u0006\u0002\b\u0014H\u0086\bø\u0001\u0000¢\u0006\u0004\b3\u00104\u001as\u00105\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010/\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030.\"\b\u0012\u0004\u0012\u00028\u00000\u00032*\b\u0004\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b00H\u0082\bø\u0001\u0000¢\u0006\u0004\b5\u00102\u001a\u0084\u0001\u00106\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010/\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030.\"\b\u0012\u0004\u0012\u00028\u00000\u00032;\b\u0005\u0010\f\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005¢\u0006\u0002\b\u0014H\u0082\bø\u0001\u0000¢\u0006\u0004\b6\u00104\u001a#\u00108\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010.07\"\u0004\b\u0000\u0010-H\u0002¢\u0006\u0004\b8\u00109\u001ag\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u0012\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030:2*\b\u0004\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b00H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010;\u001ax\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u0012\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030:2;\b\u0005\u0010\f\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005¢\u0006\u0002\b\u0014H\u0086\bø\u0001\u0000¢\u0006\u0004\b<\u0010=\u001aj\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032(\u0010\f\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005ø\u0001\u0000¢\u0006\u0004\b?\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006@"}, d2 = {"T1", "T2", "R", "Lo/i;", "flow", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "a", "b", "Lkotlin/coroutines/Continuation;", "", "transform", "p", "(Lo/i;Lo/i;Lkotlin/jvm/functions/Function3;)Lo/i;", "flow2", "c", "Lkotlin/Function4;", "Lo/j;", "", "Lkotlin/ExtensionFunctionType;", "q", "(Lo/i;Lo/i;Lkotlin/jvm/functions/Function4;)Lo/i;", "i", "T3", "flow3", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "(Lo/i;Lo/i;Lo/i;Lkotlin/jvm/functions/Function4;)Lo/i;", "Lkotlin/Function5;", "j", "(Lo/i;Lo/i;Lo/i;Lkotlin/jvm/functions/Function5;)Lo/i;", "T4", "flow4", "e", "(Lo/i;Lo/i;Lo/i;Lo/i;Lkotlin/jvm/functions/Function5;)Lo/i;", "Lkotlin/Function6;", "k", "(Lo/i;Lo/i;Lo/i;Lo/i;Lkotlin/jvm/functions/Function6;)Lo/i;", "T5", "flow5", "f", "(Lo/i;Lo/i;Lo/i;Lo/i;Lo/i;Lkotlin/jvm/functions/Function6;)Lo/i;", "Lkotlin/Function7;", "l", "(Lo/i;Lo/i;Lo/i;Lo/i;Lo/i;Lkotlin/jvm/functions/Function7;)Lo/i;", "T", "", "flows", "Lkotlin/Function2;", "g", "([Lo/i;Lkotlin/jvm/functions/Function2;)Lo/i;", "m", "([Lo/i;Lkotlin/jvm/functions/Function3;)Lo/i;", "o", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "Lkotlin/Function0;", "r", "()Lkotlin/jvm/functions/Function0;", "", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function2;)Lo/i;", "h", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function3;)Lo/i;", "other", "s", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes2.dex */
public final /* synthetic */ class b0 {

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "o/b0$t"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class a implements o.i<R> {

        /* renamed from: j */
        public final /* synthetic */ o.i[] f1155j;

        /* renamed from: k */
        public final /* synthetic */ Function4 f1156k;

        @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¨\u0006\u0006"}, d2 = {"T", "R", "Lo/j;", "", "it", "", "o/b0$u", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", f = "Zip.kt", i = {}, l = {333, 333}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: o.b0$a$a */
        /* loaded from: classes2.dex */
        public static final class C0067a extends SuspendLambda implements Function3<o.j<? super R>, Object[], Continuation<? super Unit>, Object> {

            /* renamed from: j */
            public int f1157j;

            /* renamed from: k */
            public /* synthetic */ Object f1158k;

            /* renamed from: l */
            public /* synthetic */ Object f1159l;

            /* renamed from: m */
            public final /* synthetic */ Function4 f1160m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0067a(Continuation continuation, Function4 function4) {
                super(3, continuation);
                this.f1160m = function4;
            }

            @Override // kotlin.jvm.functions.Function3
            @Nullable
            /* renamed from: i */
            public final Object invoke(@NotNull o.j<? super R> jVar, @NotNull Object[] objArr, @Nullable Continuation<? super Unit> continuation) {
                C0067a c0067a = new C0067a(continuation, this.f1160m);
                c0067a.f1158k = jVar;
                c0067a.f1159l = objArr;
                return c0067a.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                o.j jVar;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f1157j;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    jVar = (o.j) this.f1158k;
                    Object[] objArr = (Object[]) this.f1159l;
                    Function4 function4 = this.f1160m;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    this.f1158k = jVar;
                    this.f1157j = 1;
                    InlineMarker.mark(6);
                    obj = function4.invoke(obj2, obj3, obj4, this);
                    InlineMarker.mark(7);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    jVar = (o.j) this.f1158k;
                    ResultKt.throwOnFailure(obj);
                }
                this.f1158k = null;
                this.f1157j = 2;
                if (jVar.emit(obj, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }

        public a(o.i[] iVarArr, Function4 function4) {
            this.f1155j = iVarArr;
            this.f1156k = function4;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull o.j jVar, @NotNull Continuation continuation) {
            Object coroutine_suspended;
            Object a2 = p.m.a(jVar, this.f1155j, b0.r(), new C0067a(null, this.f1156k), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return a2 == coroutine_suspended ? a2 : Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "o/b0$t"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class b implements o.i<R> {

        /* renamed from: j */
        public final /* synthetic */ o.i[] f1161j;

        /* renamed from: k */
        public final /* synthetic */ Function5 f1162k;

        @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¨\u0006\u0006"}, d2 = {"T", "R", "Lo/j;", "", "it", "", "o/b0$u", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", f = "Zip.kt", i = {}, l = {333, 333}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class a extends SuspendLambda implements Function3<o.j<? super R>, Object[], Continuation<? super Unit>, Object> {

            /* renamed from: j */
            public int f1163j;

            /* renamed from: k */
            public /* synthetic */ Object f1164k;

            /* renamed from: l */
            public /* synthetic */ Object f1165l;

            /* renamed from: m */
            public final /* synthetic */ Function5 f1166m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Continuation continuation, Function5 function5) {
                super(3, continuation);
                this.f1166m = function5;
            }

            @Override // kotlin.jvm.functions.Function3
            @Nullable
            /* renamed from: i */
            public final Object invoke(@NotNull o.j<? super R> jVar, @NotNull Object[] objArr, @Nullable Continuation<? super Unit> continuation) {
                a aVar = new a(continuation, this.f1166m);
                aVar.f1164k = jVar;
                aVar.f1165l = objArr;
                return aVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                o.j jVar;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f1163j;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    jVar = (o.j) this.f1164k;
                    Object[] objArr = (Object[]) this.f1165l;
                    Function5 function5 = this.f1166m;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    this.f1164k = jVar;
                    this.f1163j = 1;
                    InlineMarker.mark(6);
                    obj = function5.invoke(obj2, obj3, obj4, obj5, this);
                    InlineMarker.mark(7);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    jVar = (o.j) this.f1164k;
                    ResultKt.throwOnFailure(obj);
                }
                this.f1164k = null;
                this.f1163j = 2;
                if (jVar.emit(obj, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }

        public b(o.i[] iVarArr, Function5 function5) {
            this.f1161j = iVarArr;
            this.f1162k = function5;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull o.j jVar, @NotNull Continuation continuation) {
            Object coroutine_suspended;
            Object a2 = p.m.a(jVar, this.f1161j, b0.r(), new a(null, this.f1162k), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return a2 == coroutine_suspended ? a2 : Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "o/b0$t"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class c implements o.i<R> {

        /* renamed from: j */
        public final /* synthetic */ o.i[] f1167j;

        /* renamed from: k */
        public final /* synthetic */ Function6 f1168k;

        @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¨\u0006\u0006"}, d2 = {"T", "R", "Lo/j;", "", "it", "", "o/b0$u", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2", f = "Zip.kt", i = {}, l = {333, 333}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class a extends SuspendLambda implements Function3<o.j<? super R>, Object[], Continuation<? super Unit>, Object> {

            /* renamed from: j */
            public int f1169j;

            /* renamed from: k */
            public /* synthetic */ Object f1170k;

            /* renamed from: l */
            public /* synthetic */ Object f1171l;

            /* renamed from: m */
            public final /* synthetic */ Function6 f1172m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Continuation continuation, Function6 function6) {
                super(3, continuation);
                this.f1172m = function6;
            }

            @Override // kotlin.jvm.functions.Function3
            @Nullable
            /* renamed from: i */
            public final Object invoke(@NotNull o.j<? super R> jVar, @NotNull Object[] objArr, @Nullable Continuation<? super Unit> continuation) {
                a aVar = new a(continuation, this.f1172m);
                aVar.f1170k = jVar;
                aVar.f1171l = objArr;
                return aVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                o.j jVar;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f1169j;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    jVar = (o.j) this.f1170k;
                    Object[] objArr = (Object[]) this.f1171l;
                    Function6 function6 = this.f1172m;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    this.f1170k = jVar;
                    this.f1169j = 1;
                    InlineMarker.mark(6);
                    obj = function6.invoke(obj2, obj3, obj4, obj5, obj6, this);
                    InlineMarker.mark(7);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    jVar = (o.j) this.f1170k;
                    ResultKt.throwOnFailure(obj);
                }
                this.f1170k = null;
                this.f1169j = 2;
                if (jVar.emit(obj, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }

        public c(o.i[] iVarArr, Function6 function6) {
            this.f1167j = iVarArr;
            this.f1168k = function6;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull o.j jVar, @NotNull Continuation continuation) {
            Object coroutine_suspended;
            Object a2 = p.m.a(jVar, this.f1167j, b0.r(), new a(null, this.f1168k), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return a2 == coroutine_suspended ? a2 : Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class d implements o.i<R> {

        /* renamed from: j */
        public final /* synthetic */ o.i f1173j;

        /* renamed from: k */
        public final /* synthetic */ o.i f1174k;

        /* renamed from: l */
        public final /* synthetic */ Function3 f1175l;

        public d(o.i iVar, o.i iVar2, Function3 function3) {
            this.f1173j = iVar;
            this.f1174k = iVar2;
            this.f1175l = function3;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull o.j<? super R> jVar, @NotNull Continuation<? super Unit> continuation) {
            Object coroutine_suspended;
            Object a2 = p.m.a(jVar, new o.i[]{this.f1173j, this.f1174k}, b0.r(), new g(this.f1175l, null), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return a2 == coroutine_suspended ? a2 : Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class e implements o.i<R> {

        /* renamed from: j */
        public final /* synthetic */ o.i[] f1176j;

        /* renamed from: k */
        public final /* synthetic */ Function2 f1177k;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = 176)
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: j */
            public /* synthetic */ Object f1178j;

            /* renamed from: k */
            public int f1179k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Continuation continuation) {
                super(continuation);
                e.this = r1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1178j = obj;
                this.f1179k |= Integer.MIN_VALUE;
                return e.this.collect(null, this);
            }
        }

        public e(o.i[] iVarArr, Function2 function2) {
            this.f1176j = iVarArr;
            this.f1177k = function2;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull o.j<? super R> jVar, @NotNull Continuation<? super Unit> continuation) {
            Object coroutine_suspended;
            o.i[] iVarArr = this.f1176j;
            Intrinsics.needClassReification();
            h hVar = new h(this.f1176j);
            Intrinsics.needClassReification();
            Object a2 = p.m.a(jVar, iVarArr, hVar, new i(this.f1177k, null), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return a2 == coroutine_suspended ? a2 : Unit.INSTANCE;
        }

        @Nullable
        public Object e(@NotNull o.j jVar, @NotNull Continuation continuation) {
            InlineMarker.mark(4);
            new a(continuation);
            InlineMarker.mark(5);
            o.i[] iVarArr = this.f1176j;
            Intrinsics.needClassReification();
            h hVar = new h(this.f1176j);
            Intrinsics.needClassReification();
            i iVar = new i(this.f1177k, null);
            InlineMarker.mark(0);
            p.m.a(jVar, iVarArr, hVar, iVar, continuation);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class f implements o.i<R> {

        /* renamed from: j */
        public final /* synthetic */ o.i[] f1181j;

        /* renamed from: k */
        public final /* synthetic */ Function2 f1182k;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = 176)
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: j */
            public /* synthetic */ Object f1183j;

            /* renamed from: k */
            public int f1184k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Continuation continuation) {
                super(continuation);
                f.this = r1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1183j = obj;
                this.f1184k |= Integer.MIN_VALUE;
                return f.this.collect(null, this);
            }
        }

        public f(o.i[] iVarArr, Function2 function2) {
            this.f1181j = iVarArr;
            this.f1182k = function2;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull o.j<? super R> jVar, @NotNull Continuation<? super Unit> continuation) {
            Object coroutine_suspended;
            o.i[] iVarArr = this.f1181j;
            Intrinsics.needClassReification();
            j jVar2 = new j(this.f1181j);
            Intrinsics.needClassReification();
            Object a2 = p.m.a(jVar, iVarArr, jVar2, new k(this.f1182k, null), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return a2 == coroutine_suspended ? a2 : Unit.INSTANCE;
        }

        @Nullable
        public Object e(@NotNull o.j jVar, @NotNull Continuation continuation) {
            InlineMarker.mark(4);
            new a(continuation);
            InlineMarker.mark(5);
            o.i[] iVarArr = this.f1181j;
            Intrinsics.needClassReification();
            j jVar2 = new j(this.f1181j);
            Intrinsics.needClassReification();
            k kVar = new k(this.f1182k, null);
            InlineMarker.mark(0);
            p.m.a(jVar, iVarArr, jVar2, kVar, continuation);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u008a@"}, d2 = {"T1", "T2", "R", "Lo/j;", "", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", i = {}, l = {33, 33}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class g extends SuspendLambda implements Function3<o.j<? super R>, Object[], Continuation<? super Unit>, Object> {

        /* renamed from: j */
        public int f1186j;

        /* renamed from: k */
        public /* synthetic */ Object f1187k;

        /* renamed from: l */
        public /* synthetic */ Object f1188l;

        /* renamed from: m */
        public final /* synthetic */ Function3<T1, T2, Continuation<? super R>, Object> f1189m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3, Continuation<? super g> continuation) {
            super(3, continuation);
            this.f1189m = function3;
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* renamed from: i */
        public final Object invoke(@NotNull o.j<? super R> jVar, @NotNull Object[] objArr, @Nullable Continuation<? super Unit> continuation) {
            g gVar = new g(this.f1189m, continuation);
            gVar.f1187k = jVar;
            gVar.f1188l = objArr;
            return gVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            o.j jVar;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1186j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                jVar = (o.j) this.f1187k;
                Object[] objArr = (Object[]) this.f1188l;
                Function3<T1, T2, Continuation<? super R>, Object> function3 = this.f1189m;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                this.f1187k = jVar;
                this.f1186j = 1;
                obj = function3.invoke(obj2, obj3, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 != 1) {
                if (i2 == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                jVar = (o.j) this.f1187k;
                ResultKt.throwOnFailure(obj);
            }
            this.f1187k = null;
            this.f1186j = 2;
            if (jVar.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "a", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class h extends Lambda implements Function0<T[]> {

        /* renamed from: j */
        public final /* synthetic */ o.i<T>[] f1190j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(o.i<? extends T>[] iVarArr) {
            super(0);
            this.f1190j = iVarArr;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [T[], java.lang.Object[]] */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* renamed from: a */
        public final T[] invoke() {
            int length = this.f1190j.length;
            Intrinsics.reifiedOperationMarker(0, "T?");
            return new Object[length];
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, d2 = {"T", "R", "Lo/j;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$5$2", f = "Zip.kt", i = {}, l = {238, 238}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class i extends SuspendLambda implements Function3<o.j<? super R>, T[], Continuation<? super Unit>, Object> {

        /* renamed from: j */
        public int f1191j;

        /* renamed from: k */
        public /* synthetic */ Object f1192k;

        /* renamed from: l */
        public /* synthetic */ Object f1193l;

        /* renamed from: m */
        public final /* synthetic */ Function2<T[], Continuation<? super R>, Object> f1194m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(Function2<? super T[], ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super i> continuation) {
            super(3, continuation);
            this.f1194m = function2;
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* renamed from: i */
        public final Object invoke(@NotNull o.j<? super R> jVar, @NotNull T[] tArr, @Nullable Continuation<? super Unit> continuation) {
            i iVar = new i(this.f1194m, continuation);
            iVar.f1192k = jVar;
            iVar.f1193l = tArr;
            return iVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            o.j jVar;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1191j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                jVar = (o.j) this.f1192k;
                Function2<T[], Continuation<? super R>, Object> function2 = this.f1194m;
                this.f1192k = jVar;
                this.f1191j = 1;
                obj = function2.invoke((Object[]) this.f1193l, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 != 1) {
                if (i2 == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                jVar = (o.j) this.f1192k;
                ResultKt.throwOnFailure(obj);
            }
            this.f1192k = null;
            this.f1191j = 2;
            if (jVar.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Nullable
        public final Object j(@NotNull Object obj) {
            Object invoke = this.f1194m.invoke((Object[]) this.f1193l, this);
            InlineMarker.mark(0);
            ((o.j) this.f1192k).emit(invoke, this);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "a", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class j extends Lambda implements Function0<T[]> {

        /* renamed from: j */
        public final /* synthetic */ o.i<T>[] f1195j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(o.i<T>[] iVarArr) {
            super(0);
            this.f1195j = iVarArr;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [T[], java.lang.Object[]] */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* renamed from: a */
        public final T[] invoke() {
            int length = this.f1195j.length;
            Intrinsics.reifiedOperationMarker(0, "T?");
            return new Object[length];
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, d2 = {"T", "R", "Lo/j;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$6$2", f = "Zip.kt", i = {}, l = {292, 292}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class k extends SuspendLambda implements Function3<o.j<? super R>, T[], Continuation<? super Unit>, Object> {

        /* renamed from: j */
        public int f1196j;

        /* renamed from: k */
        public /* synthetic */ Object f1197k;

        /* renamed from: l */
        public /* synthetic */ Object f1198l;

        /* renamed from: m */
        public final /* synthetic */ Function2<T[], Continuation<? super R>, Object> f1199m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(Function2<? super T[], ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super k> continuation) {
            super(3, continuation);
            this.f1199m = function2;
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* renamed from: i */
        public final Object invoke(@NotNull o.j<? super R> jVar, @NotNull T[] tArr, @Nullable Continuation<? super Unit> continuation) {
            k kVar = new k(this.f1199m, continuation);
            kVar.f1197k = jVar;
            kVar.f1198l = tArr;
            return kVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            o.j jVar;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1196j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                jVar = (o.j) this.f1197k;
                Function2<T[], Continuation<? super R>, Object> function2 = this.f1199m;
                this.f1197k = jVar;
                this.f1196j = 1;
                obj = function2.invoke((Object[]) this.f1198l, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 != 1) {
                if (i2 == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                jVar = (o.j) this.f1197k;
                ResultKt.throwOnFailure(obj);
            }
            this.f1197k = null;
            this.f1196j = 2;
            if (jVar.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Nullable
        public final Object j(@NotNull Object obj) {
            Object invoke = this.f1199m.invoke((Object[]) this.f1198l, this);
            InlineMarker.mark(0);
            ((o.j) this.f1197k).emit(invoke, this);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¨\u0006\u0004"}, d2 = {"T", "R", "Lo/j;", "", "o/b0$s", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class l extends SuspendLambda implements Function2<o.j<? super R>, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        public int f1200j;

        /* renamed from: k */
        public /* synthetic */ Object f1201k;

        /* renamed from: l */
        public final /* synthetic */ o.i[] f1202l;

        /* renamed from: m */
        public final /* synthetic */ Function4 f1203m;

        @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¨\u0006\u0006"}, d2 = {"T", "R", "Lo/j;", "", "it", "", "o/b0$s$a", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1$1", f = "Zip.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class a extends SuspendLambda implements Function3<o.j<? super R>, Object[], Continuation<? super Unit>, Object> {

            /* renamed from: j */
            public int f1204j;

            /* renamed from: k */
            public /* synthetic */ Object f1205k;

            /* renamed from: l */
            public /* synthetic */ Object f1206l;

            /* renamed from: m */
            public final /* synthetic */ Function4 f1207m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Continuation continuation, Function4 function4) {
                super(3, continuation);
                this.f1207m = function4;
            }

            @Override // kotlin.jvm.functions.Function3
            @Nullable
            /* renamed from: i */
            public final Object invoke(@NotNull o.j<? super R> jVar, @NotNull Object[] objArr, @Nullable Continuation<? super Unit> continuation) {
                a aVar = new a(continuation, this.f1207m);
                aVar.f1205k = jVar;
                aVar.f1206l = objArr;
                return aVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f1204j;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Object[] objArr = (Object[]) this.f1206l;
                    Function4 function4 = this.f1207m;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    this.f1204j = 1;
                    InlineMarker.mark(6);
                    Object invoke = function4.invoke((o.j) this.f1205k, obj2, obj3, this);
                    InlineMarker.mark(7);
                    if (invoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(o.i[] iVarArr, Continuation continuation, Function4 function4) {
            super(2, continuation);
            this.f1202l = iVarArr;
            this.f1203m = function4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            l lVar = new l(this.f1202l, continuation, this.f1203m);
            lVar.f1201k = obj;
            return lVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull o.j<? super R> jVar, @Nullable Continuation<? super Unit> continuation) {
            return ((l) create(jVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1200j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                o.i[] iVarArr = this.f1202l;
                Function0 r2 = b0.r();
                a aVar = new a(null, this.f1203m);
                this.f1200j = 1;
                if (p.m.a((o.j) this.f1201k, iVarArr, r2, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¨\u0006\u0004"}, d2 = {"T", "R", "Lo/j;", "", "o/b0$s", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class m extends SuspendLambda implements Function2<o.j<? super R>, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        public int f1208j;

        /* renamed from: k */
        public /* synthetic */ Object f1209k;

        /* renamed from: l */
        public final /* synthetic */ o.i[] f1210l;

        /* renamed from: m */
        public final /* synthetic */ Function4 f1211m;

        @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¨\u0006\u0006"}, d2 = {"T", "R", "Lo/j;", "", "it", "", "o/b0$s$a", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2$1", f = "Zip.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class a extends SuspendLambda implements Function3<o.j<? super R>, Object[], Continuation<? super Unit>, Object> {

            /* renamed from: j */
            public int f1212j;

            /* renamed from: k */
            public /* synthetic */ Object f1213k;

            /* renamed from: l */
            public /* synthetic */ Object f1214l;

            /* renamed from: m */
            public final /* synthetic */ Function4 f1215m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Continuation continuation, Function4 function4) {
                super(3, continuation);
                this.f1215m = function4;
            }

            @Override // kotlin.jvm.functions.Function3
            @Nullable
            /* renamed from: i */
            public final Object invoke(@NotNull o.j<? super R> jVar, @NotNull Object[] objArr, @Nullable Continuation<? super Unit> continuation) {
                a aVar = new a(continuation, this.f1215m);
                aVar.f1213k = jVar;
                aVar.f1214l = objArr;
                return aVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f1212j;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Object[] objArr = (Object[]) this.f1214l;
                    Function4 function4 = this.f1215m;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    this.f1212j = 1;
                    InlineMarker.mark(6);
                    Object invoke = function4.invoke((o.j) this.f1213k, obj2, obj3, this);
                    InlineMarker.mark(7);
                    if (invoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(o.i[] iVarArr, Continuation continuation, Function4 function4) {
            super(2, continuation);
            this.f1210l = iVarArr;
            this.f1211m = function4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            m mVar = new m(this.f1210l, continuation, this.f1211m);
            mVar.f1209k = obj;
            return mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull o.j<? super R> jVar, @Nullable Continuation<? super Unit> continuation) {
            return ((m) create(jVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1208j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                o.i[] iVarArr = this.f1210l;
                Function0 r2 = b0.r();
                a aVar = new a(null, this.f1211m);
                this.f1208j = 1;
                if (p.m.a((o.j) this.f1209k, iVarArr, r2, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¨\u0006\u0004"}, d2 = {"T", "R", "Lo/j;", "", "o/b0$s", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class n extends SuspendLambda implements Function2<o.j<? super R>, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        public int f1216j;

        /* renamed from: k */
        public /* synthetic */ Object f1217k;

        /* renamed from: l */
        public final /* synthetic */ o.i[] f1218l;

        /* renamed from: m */
        public final /* synthetic */ Function5 f1219m;

        @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¨\u0006\u0006"}, d2 = {"T", "R", "Lo/j;", "", "it", "", "o/b0$s$a", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3$1", f = "Zip.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class a extends SuspendLambda implements Function3<o.j<? super R>, Object[], Continuation<? super Unit>, Object> {

            /* renamed from: j */
            public int f1220j;

            /* renamed from: k */
            public /* synthetic */ Object f1221k;

            /* renamed from: l */
            public /* synthetic */ Object f1222l;

            /* renamed from: m */
            public final /* synthetic */ Function5 f1223m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Continuation continuation, Function5 function5) {
                super(3, continuation);
                this.f1223m = function5;
            }

            @Override // kotlin.jvm.functions.Function3
            @Nullable
            /* renamed from: i */
            public final Object invoke(@NotNull o.j<? super R> jVar, @NotNull Object[] objArr, @Nullable Continuation<? super Unit> continuation) {
                a aVar = new a(continuation, this.f1223m);
                aVar.f1221k = jVar;
                aVar.f1222l = objArr;
                return aVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f1220j;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    o.j jVar = (o.j) this.f1221k;
                    Object[] objArr = (Object[]) this.f1222l;
                    Function5 function5 = this.f1223m;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    this.f1220j = 1;
                    InlineMarker.mark(6);
                    Object invoke = function5.invoke(jVar, obj2, obj3, obj4, this);
                    InlineMarker.mark(7);
                    if (invoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(o.i[] iVarArr, Continuation continuation, Function5 function5) {
            super(2, continuation);
            this.f1218l = iVarArr;
            this.f1219m = function5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            n nVar = new n(this.f1218l, continuation, this.f1219m);
            nVar.f1217k = obj;
            return nVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull o.j<? super R> jVar, @Nullable Continuation<? super Unit> continuation) {
            return ((n) create(jVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1216j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                o.i[] iVarArr = this.f1218l;
                Function0 r2 = b0.r();
                a aVar = new a(null, this.f1219m);
                this.f1216j = 1;
                if (p.m.a((o.j) this.f1217k, iVarArr, r2, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¨\u0006\u0004"}, d2 = {"T", "R", "Lo/j;", "", "o/b0$s", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class o extends SuspendLambda implements Function2<o.j<? super R>, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        public int f1224j;

        /* renamed from: k */
        public /* synthetic */ Object f1225k;

        /* renamed from: l */
        public final /* synthetic */ o.i[] f1226l;

        /* renamed from: m */
        public final /* synthetic */ Function6 f1227m;

        @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¨\u0006\u0006"}, d2 = {"T", "R", "Lo/j;", "", "it", "", "o/b0$s$a", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4$1", f = "Zip.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class a extends SuspendLambda implements Function3<o.j<? super R>, Object[], Continuation<? super Unit>, Object> {

            /* renamed from: j */
            public int f1228j;

            /* renamed from: k */
            public /* synthetic */ Object f1229k;

            /* renamed from: l */
            public /* synthetic */ Object f1230l;

            /* renamed from: m */
            public final /* synthetic */ Function6 f1231m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Continuation continuation, Function6 function6) {
                super(3, continuation);
                this.f1231m = function6;
            }

            @Override // kotlin.jvm.functions.Function3
            @Nullable
            /* renamed from: i */
            public final Object invoke(@NotNull o.j<? super R> jVar, @NotNull Object[] objArr, @Nullable Continuation<? super Unit> continuation) {
                a aVar = new a(continuation, this.f1231m);
                aVar.f1229k = jVar;
                aVar.f1230l = objArr;
                return aVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f1228j;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    o.j jVar = (o.j) this.f1229k;
                    Object[] objArr = (Object[]) this.f1230l;
                    Function6 function6 = this.f1231m;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    this.f1228j = 1;
                    InlineMarker.mark(6);
                    Object invoke = function6.invoke(jVar, obj2, obj3, obj4, obj5, this);
                    InlineMarker.mark(7);
                    if (invoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(o.i[] iVarArr, Continuation continuation, Function6 function6) {
            super(2, continuation);
            this.f1226l = iVarArr;
            this.f1227m = function6;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            o oVar = new o(this.f1226l, continuation, this.f1227m);
            oVar.f1225k = obj;
            return oVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull o.j<? super R> jVar, @Nullable Continuation<? super Unit> continuation) {
            return ((o) create(jVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1224j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                o.i[] iVarArr = this.f1226l;
                Function0 r2 = b0.r();
                a aVar = new a(null, this.f1227m);
                this.f1224j = 1;
                if (p.m.a((o.j) this.f1225k, iVarArr, r2, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¨\u0006\u0004"}, d2 = {"T", "R", "Lo/j;", "", "o/b0$s", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class p extends SuspendLambda implements Function2<o.j<? super R>, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        public int f1232j;

        /* renamed from: k */
        public /* synthetic */ Object f1233k;

        /* renamed from: l */
        public final /* synthetic */ o.i[] f1234l;

        /* renamed from: m */
        public final /* synthetic */ Function7 f1235m;

        @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¨\u0006\u0006"}, d2 = {"T", "R", "Lo/j;", "", "it", "", "o/b0$s$a", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5$1", f = "Zip.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class a extends SuspendLambda implements Function3<o.j<? super R>, Object[], Continuation<? super Unit>, Object> {

            /* renamed from: j */
            public int f1236j;

            /* renamed from: k */
            public /* synthetic */ Object f1237k;

            /* renamed from: l */
            public /* synthetic */ Object f1238l;

            /* renamed from: m */
            public final /* synthetic */ Function7 f1239m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Continuation continuation, Function7 function7) {
                super(3, continuation);
                this.f1239m = function7;
            }

            @Override // kotlin.jvm.functions.Function3
            @Nullable
            /* renamed from: i */
            public final Object invoke(@NotNull o.j<? super R> jVar, @NotNull Object[] objArr, @Nullable Continuation<? super Unit> continuation) {
                a aVar = new a(continuation, this.f1239m);
                aVar.f1237k = jVar;
                aVar.f1238l = objArr;
                return aVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f1236j;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    o.j jVar = (o.j) this.f1237k;
                    Object[] objArr = (Object[]) this.f1238l;
                    Function7 function7 = this.f1239m;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    this.f1236j = 1;
                    InlineMarker.mark(6);
                    Object invoke = function7.invoke(jVar, obj2, obj3, obj4, obj5, obj6, this);
                    InlineMarker.mark(7);
                    if (invoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(o.i[] iVarArr, Continuation continuation, Function7 function7) {
            super(2, continuation);
            this.f1234l = iVarArr;
            this.f1235m = function7;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            p pVar = new p(this.f1234l, continuation, this.f1235m);
            pVar.f1233k = obj;
            return pVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull o.j<? super R> jVar, @Nullable Continuation<? super Unit> continuation) {
            return ((p) create(jVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1232j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                o.i[] iVarArr = this.f1234l;
                Function0 r2 = b0.r();
                a aVar = new a(null, this.f1235m);
                this.f1232j = 1;
                if (p.m.a((o.j) this.f1233k, iVarArr, r2, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"T", "R", "Lo/j;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6", f = "Zip.kt", i = {}, l = {251}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class q extends SuspendLambda implements Function2<o.j<? super R>, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        public int f1240j;

        /* renamed from: k */
        public /* synthetic */ Object f1241k;

        /* renamed from: l */
        public final /* synthetic */ o.i<T>[] f1242l;

        /* renamed from: m */
        public final /* synthetic */ Function3<o.j<? super R>, T[], Continuation<? super Unit>, Object> f1243m;

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "a", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
        /* loaded from: classes2.dex */
        public static final class a extends Lambda implements Function0<T[]> {

            /* renamed from: j */
            public final /* synthetic */ o.i<T>[] f1244j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(o.i<? extends T>[] iVarArr) {
                super(0);
                this.f1244j = iVarArr;
            }

            /* JADX WARN: Type inference failed for: r2v3, types: [T[], java.lang.Object[]] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* renamed from: a */
            public final T[] invoke() {
                int length = this.f1244j.length;
                Intrinsics.reifiedOperationMarker(0, "T?");
                return new Object[length];
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, d2 = {"T", "R", "Lo/j;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$2", f = "Zip.kt", i = {}, l = {251}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class b extends SuspendLambda implements Function3<o.j<? super R>, T[], Continuation<? super Unit>, Object> {

            /* renamed from: j */
            public int f1245j;

            /* renamed from: k */
            public /* synthetic */ Object f1246k;

            /* renamed from: l */
            public /* synthetic */ Object f1247l;

            /* renamed from: m */
            public final /* synthetic */ Function3<o.j<? super R>, T[], Continuation<? super Unit>, Object> f1248m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(Function3<? super o.j<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super b> continuation) {
                super(3, continuation);
                this.f1248m = function3;
            }

            @Override // kotlin.jvm.functions.Function3
            @Nullable
            /* renamed from: i */
            public final Object invoke(@NotNull o.j<? super R> jVar, @NotNull T[] tArr, @Nullable Continuation<? super Unit> continuation) {
                b bVar = new b(this.f1248m, continuation);
                bVar.f1246k = jVar;
                bVar.f1247l = tArr;
                return bVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f1245j;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Function3<o.j<? super R>, T[], Continuation<? super Unit>, Object> function3 = this.f1248m;
                    this.f1246k = null;
                    this.f1245j = 1;
                    if (function3.invoke((o.j) this.f1246k, (Object[]) this.f1247l, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            @Nullable
            public final Object j(@NotNull Object obj) {
                this.f1248m.invoke((o.j) this.f1246k, (Object[]) this.f1247l, this);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public q(o.i<? extends T>[] iVarArr, Function3<? super o.j<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super q> continuation) {
            super(2, continuation);
            this.f1242l = iVarArr;
            this.f1243m = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            q qVar = new q(this.f1242l, this.f1243m, continuation);
            qVar.f1241k = obj;
            return qVar;
        }

        @Nullable
        public final Object i(@NotNull Object obj) {
            o.i<T>[] iVarArr = this.f1242l;
            Intrinsics.needClassReification();
            a aVar = new a(this.f1242l);
            Intrinsics.needClassReification();
            b bVar = new b(this.f1243m, null);
            InlineMarker.mark(0);
            p.m.a((o.j) this.f1241k, iVarArr, aVar, bVar, this);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull o.j<? super R> jVar, @Nullable Continuation<? super Unit> continuation) {
            return ((q) create(jVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1240j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                o.i<T>[] iVarArr = this.f1242l;
                Intrinsics.needClassReification();
                a aVar = new a(this.f1242l);
                Intrinsics.needClassReification();
                b bVar = new b(this.f1243m, null);
                this.f1240j = 1;
                if (p.m.a((o.j) this.f1241k, iVarArr, aVar, bVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"T", "R", "Lo/j;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7", f = "Zip.kt", i = {}, l = {308}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class r extends SuspendLambda implements Function2<o.j<? super R>, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        public int f1249j;

        /* renamed from: k */
        public /* synthetic */ Object f1250k;

        /* renamed from: l */
        public final /* synthetic */ o.i<T>[] f1251l;

        /* renamed from: m */
        public final /* synthetic */ Function3<o.j<? super R>, T[], Continuation<? super Unit>, Object> f1252m;

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "a", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
        /* loaded from: classes2.dex */
        public static final class a extends Lambda implements Function0<T[]> {

            /* renamed from: j */
            public final /* synthetic */ o.i<T>[] f1253j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(o.i<T>[] iVarArr) {
                super(0);
                this.f1253j = iVarArr;
            }

            /* JADX WARN: Type inference failed for: r2v3, types: [T[], java.lang.Object[]] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* renamed from: a */
            public final T[] invoke() {
                int length = this.f1253j.length;
                Intrinsics.reifiedOperationMarker(0, "T?");
                return new Object[length];
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, d2 = {"T", "R", "Lo/j;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2", f = "Zip.kt", i = {}, l = {308}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class b extends SuspendLambda implements Function3<o.j<? super R>, T[], Continuation<? super Unit>, Object> {

            /* renamed from: j */
            public int f1254j;

            /* renamed from: k */
            public /* synthetic */ Object f1255k;

            /* renamed from: l */
            public /* synthetic */ Object f1256l;

            /* renamed from: m */
            public final /* synthetic */ Function3<o.j<? super R>, T[], Continuation<? super Unit>, Object> f1257m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(Function3<? super o.j<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super b> continuation) {
                super(3, continuation);
                this.f1257m = function3;
            }

            @Override // kotlin.jvm.functions.Function3
            @Nullable
            /* renamed from: i */
            public final Object invoke(@NotNull o.j<? super R> jVar, @NotNull T[] tArr, @Nullable Continuation<? super Unit> continuation) {
                b bVar = new b(this.f1257m, continuation);
                bVar.f1255k = jVar;
                bVar.f1256l = tArr;
                return bVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f1254j;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Function3<o.j<? super R>, T[], Continuation<? super Unit>, Object> function3 = this.f1257m;
                    this.f1255k = null;
                    this.f1254j = 1;
                    if (function3.invoke((o.j) this.f1255k, (Object[]) this.f1256l, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            @Nullable
            public final Object j(@NotNull Object obj) {
                this.f1257m.invoke((o.j) this.f1255k, (Object[]) this.f1256l, this);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public r(o.i<T>[] iVarArr, Function3<? super o.j<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super r> continuation) {
            super(2, continuation);
            this.f1251l = iVarArr;
            this.f1252m = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            r rVar = new r(this.f1251l, this.f1252m, continuation);
            rVar.f1250k = obj;
            return rVar;
        }

        @Nullable
        public final Object i(@NotNull Object obj) {
            o.i<T>[] iVarArr = this.f1251l;
            Intrinsics.needClassReification();
            a aVar = new a(this.f1251l);
            Intrinsics.needClassReification();
            b bVar = new b(this.f1252m, null);
            InlineMarker.mark(0);
            p.m.a((o.j) this.f1250k, iVarArr, aVar, bVar, this);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull o.j<? super R> jVar, @Nullable Continuation<? super Unit> continuation) {
            return ((r) create(jVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1249j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                o.i<T>[] iVarArr = this.f1251l;
                Intrinsics.needClassReification();
                a aVar = new a(this.f1251l);
                Intrinsics.needClassReification();
                b bVar = new b(this.f1252m, null);
                this.f1249j = 1;
                if (p.m.a((o.j) this.f1250k, iVarArr, aVar, bVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"T", "R", "Lo/j;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class s extends SuspendLambda implements Function2<o.j<? super R>, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        public int f1258j;

        /* renamed from: k */
        public /* synthetic */ Object f1259k;

        /* renamed from: l */
        public final /* synthetic */ o.i<T>[] f1260l;

        /* renamed from: m */
        public final /* synthetic */ Function3<o.j<? super R>, T[], Continuation<? super Unit>, Object> f1261m;

        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, d2 = {"T", "R", "Lo/j;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1$1", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class a extends SuspendLambda implements Function3<o.j<? super R>, T[], Continuation<? super Unit>, Object> {

            /* renamed from: j */
            public int f1262j;

            /* renamed from: k */
            public /* synthetic */ Object f1263k;

            /* renamed from: l */
            public /* synthetic */ Object f1264l;

            /* renamed from: m */
            public final /* synthetic */ Function3<o.j<? super R>, T[], Continuation<? super Unit>, Object> f1265m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function3<? super o.j<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super a> continuation) {
                super(3, continuation);
                this.f1265m = function3;
            }

            @Override // kotlin.jvm.functions.Function3
            @Nullable
            /* renamed from: i */
            public final Object invoke(@NotNull o.j<? super R> jVar, @NotNull T[] tArr, @Nullable Continuation<? super Unit> continuation) {
                a aVar = new a(this.f1265m, continuation);
                aVar.f1263k = jVar;
                aVar.f1264l = tArr;
                return aVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f1262j;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Function3<o.j<? super R>, T[], Continuation<? super Unit>, Object> function3 = this.f1265m;
                    this.f1263k = null;
                    this.f1262j = 1;
                    if (function3.invoke((o.j) this.f1263k, (Object[]) this.f1264l, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            @Nullable
            public final Object j(@NotNull Object obj) {
                this.f1265m.invoke((o.j) this.f1263k, (Object[]) this.f1264l, this);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public s(o.i<? extends T>[] iVarArr, Function3<? super o.j<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super s> continuation) {
            super(2, continuation);
            this.f1260l = iVarArr;
            this.f1261m = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            s sVar = new s(this.f1260l, this.f1261m, continuation);
            sVar.f1259k = obj;
            return sVar;
        }

        @Nullable
        public final Object i(@NotNull Object obj) {
            o.i<T>[] iVarArr = this.f1260l;
            Function0 r2 = b0.r();
            Intrinsics.needClassReification();
            a aVar = new a(this.f1261m, null);
            InlineMarker.mark(0);
            p.m.a((o.j) this.f1259k, iVarArr, r2, aVar, this);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull o.j<? super R> jVar, @Nullable Continuation<? super Unit> continuation) {
            return ((s) create(jVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1258j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                o.i<T>[] iVarArr = this.f1260l;
                Function0 r2 = b0.r();
                Intrinsics.needClassReification();
                a aVar = new a(this.f1261m, null);
                this.f1258j = 1;
                if (p.m.a((o.j) this.f1259k, iVarArr, r2, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class t implements o.i<R> {

        /* renamed from: j */
        public final /* synthetic */ o.i[] f1266j;

        /* renamed from: k */
        public final /* synthetic */ Function2 f1267k;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: j */
            public /* synthetic */ Object f1268j;

            /* renamed from: k */
            public int f1269k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Continuation continuation) {
                super(continuation);
                t.this = r1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1268j = obj;
                this.f1269k |= Integer.MIN_VALUE;
                return t.this.collect(null, this);
            }
        }

        public t(o.i[] iVarArr, Function2 function2) {
            this.f1266j = iVarArr;
            this.f1267k = function2;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull o.j<? super R> jVar, @NotNull Continuation<? super Unit> continuation) {
            Object coroutine_suspended;
            o.i[] iVarArr = this.f1266j;
            Function0 r2 = b0.r();
            Intrinsics.needClassReification();
            Object a2 = p.m.a(jVar, iVarArr, r2, new u(this.f1267k, null), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return a2 == coroutine_suspended ? a2 : Unit.INSTANCE;
        }

        @Nullable
        public Object e(@NotNull o.j jVar, @NotNull Continuation continuation) {
            InlineMarker.mark(4);
            new a(continuation);
            InlineMarker.mark(5);
            o.i[] iVarArr = this.f1266j;
            Function0 r2 = b0.r();
            Intrinsics.needClassReification();
            u uVar = new u(this.f1267k, null);
            InlineMarker.mark(0);
            p.m.a(jVar, iVarArr, r2, uVar, continuation);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, d2 = {"T", "R", "Lo/j;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineUnsafe$1$1", f = "Zip.kt", i = {}, l = {262, 262}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class u extends SuspendLambda implements Function3<o.j<? super R>, T[], Continuation<? super Unit>, Object> {

        /* renamed from: j */
        public int f1271j;

        /* renamed from: k */
        public /* synthetic */ Object f1272k;

        /* renamed from: l */
        public /* synthetic */ Object f1273l;

        /* renamed from: m */
        public final /* synthetic */ Function2<T[], Continuation<? super R>, Object> f1274m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public u(Function2<? super T[], ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super u> continuation) {
            super(3, continuation);
            this.f1274m = function2;
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* renamed from: i */
        public final Object invoke(@NotNull o.j<? super R> jVar, @NotNull T[] tArr, @Nullable Continuation<? super Unit> continuation) {
            u uVar = new u(this.f1274m, continuation);
            uVar.f1272k = jVar;
            uVar.f1273l = tArr;
            return uVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            o.j jVar;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1271j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                jVar = (o.j) this.f1272k;
                Function2<T[], Continuation<? super R>, Object> function2 = this.f1274m;
                this.f1272k = jVar;
                this.f1271j = 1;
                obj = function2.invoke((Object[]) this.f1273l, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 != 1) {
                if (i2 == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                jVar = (o.j) this.f1272k;
                ResultKt.throwOnFailure(obj);
            }
            this.f1272k = null;
            this.f1271j = 2;
            if (jVar.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Nullable
        public final Object j(@NotNull Object obj) {
            Object invoke = this.f1274m.invoke((Object[]) this.f1273l, this);
            InlineMarker.mark(0);
            ((o.j) this.f1272k).emit(invoke, this);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "", "a", "()Ljava/lang/Void;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class v extends Lambda implements Function0 {

        /* renamed from: j */
        public static final v f1275j = new v();

        public v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* renamed from: a */
        public final Void invoke() {
            return null;
        }
    }

    public static final /* synthetic */ <T, R> o.i<R> b(Iterable<? extends o.i<? extends T>> iterable, Function2<? super T[], ? super Continuation<? super R>, ? extends Object> function2) {
        List list;
        list = CollectionsKt___CollectionsKt.toList(iterable);
        Object[] array = list.toArray(new o.i[0]);
        if (array != null) {
            Intrinsics.needClassReification();
            return new f((o.i[]) array, function2);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @NotNull
    public static final <T1, T2, R> o.i<R> c(@NotNull o.i<? extends T1> iVar, @NotNull o.i<? extends T2> iVar2, @NotNull Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3) {
        return o.k.J0(iVar, iVar2, function3);
    }

    @NotNull
    public static final <T1, T2, T3, R> o.i<R> d(@NotNull o.i<? extends T1> iVar, @NotNull o.i<? extends T2> iVar2, @NotNull o.i<? extends T3> iVar3, @BuilderInference @NotNull Function4<? super T1, ? super T2, ? super T3, ? super Continuation<? super R>, ? extends Object> function4) {
        return new a(new o.i[]{iVar, iVar2, iVar3}, function4);
    }

    @NotNull
    public static final <T1, T2, T3, T4, R> o.i<R> e(@NotNull o.i<? extends T1> iVar, @NotNull o.i<? extends T2> iVar2, @NotNull o.i<? extends T3> iVar3, @NotNull o.i<? extends T4> iVar4, @NotNull Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super Continuation<? super R>, ? extends Object> function5) {
        return new b(new o.i[]{iVar, iVar2, iVar3, iVar4}, function5);
    }

    @NotNull
    public static final <T1, T2, T3, T4, T5, R> o.i<R> f(@NotNull o.i<? extends T1> iVar, @NotNull o.i<? extends T2> iVar2, @NotNull o.i<? extends T3> iVar3, @NotNull o.i<? extends T4> iVar4, @NotNull o.i<? extends T5> iVar5, @NotNull Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super Continuation<? super R>, ? extends Object> function6) {
        return new c(new o.i[]{iVar, iVar2, iVar3, iVar4, iVar5}, function6);
    }

    public static final /* synthetic */ <T, R> o.i<R> h(Iterable<? extends o.i<? extends T>> iterable, @BuilderInference Function3<? super o.j<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3) {
        List list;
        list = CollectionsKt___CollectionsKt.toList(iterable);
        Object[] array = list.toArray(new o.i[0]);
        if (array != null) {
            Intrinsics.needClassReification();
            return o.k.I0(new r((o.i[]) array, function3, null));
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @NotNull
    public static final <T1, T2, R> o.i<R> i(@NotNull o.i<? extends T1> iVar, @NotNull o.i<? extends T2> iVar2, @BuilderInference @NotNull Function4<? super o.j<? super R>, ? super T1, ? super T2, ? super Continuation<? super Unit>, ? extends Object> function4) {
        return o.k.I0(new m(new o.i[]{iVar, iVar2}, null, function4));
    }

    @NotNull
    public static final <T1, T2, T3, R> o.i<R> j(@NotNull o.i<? extends T1> iVar, @NotNull o.i<? extends T2> iVar2, @NotNull o.i<? extends T3> iVar3, @BuilderInference @NotNull Function5<? super o.j<? super R>, ? super T1, ? super T2, ? super T3, ? super Continuation<? super Unit>, ? extends Object> function5) {
        return o.k.I0(new n(new o.i[]{iVar, iVar2, iVar3}, null, function5));
    }

    @NotNull
    public static final <T1, T2, T3, T4, R> o.i<R> k(@NotNull o.i<? extends T1> iVar, @NotNull o.i<? extends T2> iVar2, @NotNull o.i<? extends T3> iVar3, @NotNull o.i<? extends T4> iVar4, @BuilderInference @NotNull Function6<? super o.j<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super Continuation<? super Unit>, ? extends Object> function6) {
        return o.k.I0(new o(new o.i[]{iVar, iVar2, iVar3, iVar4}, null, function6));
    }

    @NotNull
    public static final <T1, T2, T3, T4, T5, R> o.i<R> l(@NotNull o.i<? extends T1> iVar, @NotNull o.i<? extends T2> iVar2, @NotNull o.i<? extends T3> iVar3, @NotNull o.i<? extends T4> iVar4, @NotNull o.i<? extends T5> iVar5, @BuilderInference @NotNull Function7<? super o.j<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super Continuation<? super Unit>, ? extends Object> function7) {
        return o.k.I0(new p(new o.i[]{iVar, iVar2, iVar3, iVar4, iVar5}, null, function7));
    }

    @JvmName(name = "flowCombine")
    @NotNull
    public static final <T1, T2, R> o.i<R> p(@NotNull o.i<? extends T1> iVar, @NotNull o.i<? extends T2> iVar2, @NotNull Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3) {
        return new d(iVar, iVar2, function3);
    }

    @JvmName(name = "flowCombineTransform")
    @NotNull
    public static final <T1, T2, R> o.i<R> q(@NotNull o.i<? extends T1> iVar, @NotNull o.i<? extends T2> iVar2, @BuilderInference @NotNull Function4<? super o.j<? super R>, ? super T1, ? super T2, ? super Continuation<? super Unit>, ? extends Object> function4) {
        return o.k.I0(new l(new o.i[]{iVar, iVar2}, null, function4));
    }

    public static final <T> Function0<T[]> r() {
        return v.f1275j;
    }

    @NotNull
    public static final <T1, T2, R> o.i<R> s(@NotNull o.i<? extends T1> iVar, @NotNull o.i<? extends T2> iVar2, @NotNull Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3) {
        return p.m.b(iVar, iVar2, function3);
    }
}
