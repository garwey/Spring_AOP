import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.Hello;

public class m {
	public static void main(String[] args) {
		// ´´½¨SpringÈÝÆ÷
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Hello hello = ctx.getBean("hello", Hello.class);
		hello.foo();
		hello.addUser("ËïÎò¿Õ", "7788");
	}
}
