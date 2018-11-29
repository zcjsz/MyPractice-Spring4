package jv.tdni.myspring.beans.collections;

import java.util.List;

import jv.tdni.myspring.beans.Car;

public class Person {

	private String name;
	private int age;
	private List<Car> cars;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public List<Car> getCars() {
		return cars;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", cars=" + cars + "]";
	}

}
