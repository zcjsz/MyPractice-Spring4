package jv.tdni.myspring.day01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext cntx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
	    //HelloWorld helloWorld = (HelloWorld) cntx.getBean("helloWorld");
		//HelloWorld helloWorld = cntx.getBean(HelloWorld.class);
	    //helloWorld.hello();
		
		Car car1 = (Car) cntx.getBean("car1");
		System.out.println(car1);
		
		Car car2 = (Car) cntx.getBean("car2");
		System.out.println(car2);
	}
	

    
}
