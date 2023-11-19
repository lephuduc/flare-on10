package androidx.compose.ui.tooling.preview;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.MustBeDocumented;
import kotlin.annotation.Repeatable;
import kotlin.jvm.internal.RepeatableContainer;

@Target({ElementType.METHOD})
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FUNCTION})
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0087\u0002\u0018\u00002\u00020\u0001Bx\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0003\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003R\u000f\u0010\u0005\u001a\u00020\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0013R\u000f\u0010\u000f\u001a\u00020\u0010¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0014R\u000f\u0010\u0012\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0015R\u000f\u0010\n\u001a\u00020\u000b¢\u0006\u0006\u001a\u0004\b\n\u0010\u0016R\u000f\u0010\u0004\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0015R\u000f\u0010\b\u001a\u00020\u0006¢\u0006\u0006\u001a\u0004\b\b\u0010\u0013R\u000f\u0010\t\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\t\u0010\u0015R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0015R\u000f\u0010\u000e\u001a\u00020\r¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0017R\u000f\u0010\f\u001a\u00020\r¢\u0006\u0006\u001a\u0004\b\f\u0010\u0017R\u000f\u0010\u0011\u001a\u00020\u0006¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013R\u000f\u0010\u0007\u001a\u00020\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0013¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/tooling/preview/Preview;", "", "name", "", "group", "apiLevel", "", "widthDp", "heightDp", "locale", "fontScale", "", "showSystemUi", "", "showBackground", "backgroundColor", "", "uiMode", "device", "()I", "()J", "()Ljava/lang/String;", "()F", "()Z", "ui-tooling-preview_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
@Repeatable
@Documented
@java.lang.annotation.Repeatable(Container.class)
/* loaded from: classes.dex */
public @interface Preview {

    @Target({ElementType.METHOD})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FUNCTION})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    @RepeatableContainer
    /* loaded from: classes.dex */
    public @interface Container {
        Preview[] value();
    }

    int apiLevel() default -1;

    long backgroundColor() default 0;

    String device() default "";

    float fontScale() default 1.0f;

    String group() default "";

    int heightDp() default -1;

    String locale() default "";

    String name() default "";

    boolean showBackground() default false;

    boolean showSystemUi() default false;

    int uiMode() default 0;

    int widthDp() default -1;
}