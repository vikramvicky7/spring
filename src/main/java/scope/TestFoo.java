package scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFoo {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("foo.xml");
		Foo f1 = (Foo) context.getBean("foo");
		Foo f2 = (Foo) context.getBean("foo");

	}
}