package androidx.compose.ui.input.nestedscroll;

import androidx.appcompat.R;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public interface NestedScrollConnection {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Nullable
        /* renamed from: onPostFling-RZ2iAVY  reason: not valid java name */
        public static Object m2556onPostFlingRZ2iAVY(@NotNull NestedScrollConnection nestedScrollConnection, long j2, long j3, @NotNull Continuation<? super Velocity> continuation) {
            return Velocity.m3541boximpl(Velocity.Companion.m3561getZero9UxMQ8M());
        }

        /* renamed from: onPostScroll-DzOQY0M  reason: not valid java name */
        public static long m2557onPostScrollDzOQY0M(@NotNull NestedScrollConnection nestedScrollConnection, long j2, long j3, int i2) {
            Intrinsics.checkNotNullParameter(nestedScrollConnection, "this");
            return Offset.Companion.m1177getZeroF1C5BW0();
        }

        @Nullable
        /* renamed from: onPreFling-QWom1Mo  reason: not valid java name */
        public static Object m2558onPreFlingQWom1Mo(@NotNull NestedScrollConnection nestedScrollConnection, long j2, @NotNull Continuation<? super Velocity> continuation) {
            return Velocity.m3541boximpl(Velocity.Companion.m3561getZero9UxMQ8M());
        }

        /* renamed from: onPreScroll-OzD1aCk  reason: not valid java name */
        public static long m2559onPreScrollOzD1aCk(@NotNull NestedScrollConnection nestedScrollConnection, long j2, int i2) {
            Intrinsics.checkNotNullParameter(nestedScrollConnection, "this");
            return Offset.Companion.m1177getZeroF1C5BW0();
        }
    }

    @Nullable
    /* renamed from: onPostFling-RZ2iAVY */
    Object mo282onPostFlingRZ2iAVY(long j2, long j3, @NotNull Continuation<? super Velocity> continuation);

    /* renamed from: onPostScroll-DzOQY0M */
    long mo283onPostScrollDzOQY0M(long j2, long j3, int i2);

    @Nullable
    /* renamed from: onPreFling-QWom1Mo */
    Object mo284onPreFlingQWom1Mo(long j2, @NotNull Continuation<? super Velocity> continuation);

    /* renamed from: onPreScroll-OzD1aCk */
    long mo285onPreScrollOzD1aCk(long j2, int i2);
}
