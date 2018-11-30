package jv.tdni.myspring.beans.collections;

import java.util.List;
import java.util.Map;

import jv.tdni.myspring.beans.Car;

public class Person2 {

	private String name;
	private int age;
	private Map<String, Car> cars;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setCars(Map<String, Car> cars) {
		this.cars = cars;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public Map<String, Car> getCars() {
		return cars;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", cars=" + cars + "]";
	}

}
