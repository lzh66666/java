package nuc.ss.test.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *     Ԫע��
 * @author Administrator
 *
 */
@Target(value = {ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)

public @interface MyAnnotation01 {
	
	String studentName() default "";
	int age() default 0;
	int id() default -1;
	
	String [] schools() default{"�廪��ѧ","������ѧ��"};
}
