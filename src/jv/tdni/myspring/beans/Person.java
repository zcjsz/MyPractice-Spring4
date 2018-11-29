package jv.tdni.myspring.beans;

public class Person {

	private String name;
	private int age;
	private Car car;
	
	public Person() {}
	
	public Person(String name, int age, Car car) {
		super();
		this.name = name;
		this.age = age;
		this.car = car;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setCar(Car car) {
		this.car = car;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Car getCar() {
		return car;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", car=" + car + "]";
	}
	
	
	
}
