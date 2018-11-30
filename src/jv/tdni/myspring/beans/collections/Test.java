package jv.tdni.myspring.beans.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		DataSource dataSource = (DataSource) appCtx.getBean("dataSource");
		System.out.println(dataSource);
		
		Person person6 = (Person) appCtx.getBean("person6");
		System.out.println(person6);

		Person2 person7 = (Person2) appCtx.getBean("person7");
		System.out.println(person7);

		Person person8 = (Person) appCtx.getBean("person8");
		System.out.println(person8);

		Person person9 = (Person) appCtx.getBean("person9");
		System.out.println(person9);		
		
	}
	
	
}
