package com.enumerationsandAnnotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnno {
	int value();
}

class MyClass1 {
	@MyAnno(value = 100)
	public void toDoSomething() {
		System.out.println("Hello");
	}
}

public class CustomAnnotationDemo {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {

		MyClass1 myClass1 = new MyClass1();
		myClass1.toDoSomething();
		Method m = myClass1.getClass().getMethod("toDoSomething");
		MyAnno anno = m.getAnnotation(MyAnno.class);
		System.out.println("Value : " + anno.value());
	}
}
