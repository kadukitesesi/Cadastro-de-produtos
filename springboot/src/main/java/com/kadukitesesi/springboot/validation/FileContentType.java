package com.kadukitesesi.springboot.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({METHOD, FIELD, ANNOTATION_TYPE, PARAMETER, TYPE_USE})
@Retention(RUNTIME)
@Constraint(validatedBy = FileContentTypeValidator.class )
public @interface FileContentType {

    String message() default  "Arquivo deve ser do formato PNG ou JPEG";
    String[] allowed();

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
