package catchup_8;


import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.MODULE;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


//使JVM能够通过反射提取该annotation信息
@Retention(RetentionPolicy.RUNTIME)
@Target({METHOD})
public @interface MyTag {
	//定义两个成员变量，成员变量以方法的形式来定义
	String name() default "alex";
	int age() default 32;
}
