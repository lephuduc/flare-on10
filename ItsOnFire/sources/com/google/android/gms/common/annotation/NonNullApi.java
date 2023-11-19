package com.google.android.gms.common.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.annotation.meta.TypeQualifierDefault;

@Target({ElementType.TYPE, ElementType.PACKAGE})
@TypeQualifierDefault({ElementType.METHOD, ElementType.PARAMETER})
@KeepForSdk
@Documented
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface NonNullApi {
}
