package in.ashokit.test;

import java.lang.reflect.Field;

public class MyApp {

	public static void main(String[] args) throws Exception {

		// Loading class using class.forName
		Class<?> clz = Class.forName("in.ashokit.test.Demo");

		// Getting field declared in class
		Field ageField = clz.getDeclaredField("age");

		// Making private variable accessible outside of the class also
		ageField.setAccessible(true);

		// Creating object for the class
		Object object = clz.newInstance();

		// Setting value to variable
		ageField.set(object, 30);

		// Getting value from the variable and printing
		System.out.println(ageField.get(object));
	}

}
