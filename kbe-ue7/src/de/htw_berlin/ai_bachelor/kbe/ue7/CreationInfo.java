package de.htw_berlin.ai_bachelor.kbe.ue7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Annotation steht zur Läufzeit zur Verfügung
@Retention(RetentionPolicy.RUNTIME)
// Annotation auf Klassen, Interfaces, Enums anwendbar
@Target(ElementType.TYPE)

/*  Die Annotation CreationInfo besteht aus den Parametern
 *  author, description, tags, baseClass und interfaces.
 */
public @interface CreationInfo 
{
	String author() default "Max Mustermann";
	String description();
	String[] tags() default {};
	Class<?> baseClass() default Object.class;
	Class<?>[] interfaces() default {};
}
