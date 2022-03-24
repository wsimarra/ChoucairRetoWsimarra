package utils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Se crea una anotaci�n personalizada porque necesitamos copiar todos los datos del archivo de Excel al archivo .feature antes de comenzar a ejecutar
 *
 */
//@Retention(RUNTIME)
//@Target(METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface BeforeSuite {

}


