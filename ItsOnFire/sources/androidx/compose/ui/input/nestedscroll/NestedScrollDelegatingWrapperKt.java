package androidx.compose.ui.input.nestedscroll;

import androidx.appcompat.R;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0002"}, d2 = {"NoOpConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class NestedScrollDelegatingWrapperKt {
    @NotNull
    private static final NestedScrollConnection NoOpConnection = new NestedScrollConnection() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollDelegatingWrapperKt$NoOpConnection$1
        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        @Nullable
        /* renamed from: onPostFling-RZ2iAVY */
        public Object mo282onPostFlingRZ2iAVY(long j2, long j3, @NotNull Continuation<? super Velocity> continuation) {
            return Velocity.m3541boximpl(Velocity.Companion.m3561getZero9UxMQ8M());
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPostScroll-DzOQY0M */
        public long mo283onPostScrollDzOQY0M(long j2, long j3, int i2) {
            return Offset.Companion.m1177getZeroF1C5BW0();
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        @Nullable
        /* renamed from: onPreFling-QWom1Mo */
        public Object mo284onPreFlingQWom1Mo(long j2, @NotNull Continuation<? super Velocity> continuation) {
            return Velocity.m3541boximpl(Velocity.Companion.m3561getZero9UxMQ8M());
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPreScroll-OzD1aCk */
        public long mo285onPreScrollOzD1aCk(long j2, int i2) {
            return Offset.Companion.m1177getZeroF1C5BW0();
        }
    };
}
