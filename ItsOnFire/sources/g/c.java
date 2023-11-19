package g;

import androidx.appcompat.R;
import androidx.compose.material.Colors;
import androidx.compose.material.ColorsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a,\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\t\"\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\r"}, d2 = {"", "darkTheme", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", FirebaseAnalytics.Param.CONTENT, "a", "(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/material/Colors;", "Landroidx/compose/material/Colors;", "DarkColorPalette", "b", "LightColorPalette", "app_release"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class c {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final Colors f378a = ColorsKt.m787darkColors2qZNXz8$default(g.a.a(), g.a.c(), g.a.d(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 4088, null);
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public static final Colors f379b;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ boolean f380j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f381k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ int f382l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ int f383m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(boolean z, Function2<? super Composer, ? super Integer, Unit> function2, int i2, int i3) {
            super(2);
            this.f380j = z;
            this.f381k = function2;
            this.f382l = i2;
            this.f383m = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i2) {
            c.a(this.f380j, this.f381k, composer, this.f382l | 1, this.f383m);
        }
    }

    static {
        Colors m788lightColors2qZNXz8;
        m788lightColors2qZNXz8 = ColorsKt.m788lightColors2qZNXz8((r43 & 1) != 0 ? ColorKt.Color(4284612846L) : g.a.b(), (r43 & 2) != 0 ? ColorKt.Color(4281794739L) : g.a.c(), (r43 & 4) != 0 ? ColorKt.Color(4278442694L) : g.a.d(), (r43 & 8) != 0 ? ColorKt.Color(4278290310L) : 0L, (r43 & 16) != 0 ? Color.Companion.m1429getWhite0d7_KjU() : 0L, (r43 & 32) != 0 ? Color.Companion.m1429getWhite0d7_KjU() : 0L, (r43 & 64) != 0 ? ColorKt.Color(4289724448L) : 0L, (r43 & 128) != 0 ? Color.Companion.m1429getWhite0d7_KjU() : 0L, (r43 & 256) != 0 ? Color.Companion.m1418getBlack0d7_KjU() : 0L, (r43 & 512) != 0 ? Color.Companion.m1418getBlack0d7_KjU() : 0L, (r43 & 1024) != 0 ? Color.Companion.m1418getBlack0d7_KjU() : 0L, (r43 & 2048) != 0 ? Color.Companion.m1429getWhite0d7_KjU() : 0L);
        f379b = m788lightColors2qZNXz8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x005b, code lost:
        if ((r12 & 1) != 0) goto L34;
     */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(boolean r8, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r9, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r10, int r11, int r12) {
        /*
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 159754512(0x985a910, float:3.217757E-33)
            androidx.compose.runtime.Composer r10 = r10.startRestartGroup(r0)
            r0 = r11 & 14
            if (r0 != 0) goto L1f
            r0 = r12 & 1
            if (r0 != 0) goto L1c
            boolean r0 = r10.changed(r8)
            if (r0 == 0) goto L1c
            r0 = 4
            goto L1d
        L1c:
            r0 = 2
        L1d:
            r0 = r0 | r11
            goto L20
        L1f:
            r0 = r11
        L20:
            r1 = r12 & 2
            if (r1 == 0) goto L27
            r0 = r0 | 48
            goto L37
        L27:
            r1 = r11 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L37
            boolean r1 = r10.changed(r9)
            if (r1 == 0) goto L34
            r1 = 32
            goto L36
        L34:
            r1 = 16
        L36:
            r0 = r0 | r1
        L37:
            r1 = r0 & 91
            r1 = r1 ^ 18
            if (r1 != 0) goto L48
            boolean r1 = r10.getSkipping()
            if (r1 != 0) goto L44
            goto L48
        L44:
            r10.skipToGroupEnd()
            goto L87
        L48:
            r10.startDefaults()
            r1 = r11 & 1
            if (r1 == 0) goto L5e
            boolean r1 = r10.getDefaultsInvalid()
            if (r1 == 0) goto L56
            goto L5e
        L56:
            r10.skipToGroupEnd()
            r1 = r12 & 1
            if (r1 == 0) goto L69
            goto L67
        L5e:
            r1 = r12 & 1
            if (r1 == 0) goto L69
            r8 = 0
            boolean r8 = androidx.compose.foundation.DarkThemeKt.isSystemInDarkTheme(r10, r8)
        L67:
            r0 = r0 & (-15)
        L69:
            r10.endDefaults()
            if (r8 == 0) goto L71
            androidx.compose.material.Colors r1 = g.c.f378a
            goto L73
        L71:
            androidx.compose.material.Colors r1 = g.c.f379b
        L73:
            androidx.compose.material.Typography r2 = g.d.a()
            androidx.compose.material.Shapes r3 = g.b.a()
            int r0 = r0 << 6
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r6 = r0 | 432(0x1b0, float:6.05E-43)
            r7 = 0
            r4 = r9
            r5 = r10
            androidx.compose.material.MaterialThemeKt.MaterialTheme(r1, r2, r3, r4, r5, r6, r7)
        L87:
            androidx.compose.runtime.ScopeUpdateScope r10 = r10.endRestartGroup()
            if (r10 != 0) goto L8e
            goto L96
        L8e:
            g.c$a r0 = new g.c$a
            r0.<init>(r8, r9, r11, r12)
            r10.updateScope(r0)
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.a(boolean, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }
}
