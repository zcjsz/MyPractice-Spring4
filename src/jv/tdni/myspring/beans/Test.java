package jv.tdni.myspring.beans;

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
		
		Car car3 = (Car) cntx.getBean("car3");
		System.out.println(car3);
		
		Car car4 = (Car) cntx.getBean("car4");
		System.out.println(car4);
		
		Person person1 = (Person) cntx.getBean("person1");
		System.out.println(person1);

		Person person2 = (Person) cntx.getBean("person2");
		System.out.println(person2);
		
		Person person3 = (Person) cntx.getBean("person3");
		System.out.println(person3);
		
		Person person4 = (Person) cntx.getBean("person4");
		System.out.println(person4);

		Person person5 = (Person) cntx.getBean("person5");
		System.out.println(person5);
		
	}
	

    
}
