package jv.tdni.myspring.beans.relation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-relation.xml");
		
		//Address address1 = (Address) ctx.getBean("address1");
		//System.out.println(address1);
		
		Address address2 = (Address) ctx.getBean("address2");
		System.out.println(address2);

		
	}
	
}
