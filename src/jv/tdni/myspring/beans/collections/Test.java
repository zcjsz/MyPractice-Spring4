package jv.tdni.myspring.beans.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Person person6 = (Person) appCtx.getBean("person6");
		System.out.println(person6);
		
	}
	
	
}