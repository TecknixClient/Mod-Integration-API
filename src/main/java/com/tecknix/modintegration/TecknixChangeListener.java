package com.tecknix.modintegration;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Tecknix Software
 * @see TecknixChangeListener
 * Annotation for listener methods.
 * @see ListenType gives you the option to pass through a String or a JsonObject.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TecknixChangeListener {
    ListenType type() default ListenType.JSON_GSON;

    String settingName();
}
