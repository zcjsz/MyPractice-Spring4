package jv.tdni.myspring.beans.spel;

public class Person {

	private String name;
	private Car car;
	private String city; // Address.city
	private String info; // car.price >= 30000 ? richer : worker
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCar(Car car) {
		this.car = car;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setInfo(String info) {
		this.info = info;
	}

	public String getName() {
		return name;
	}

	public Car getCar() {
		return car;
	}

	public String getCity() {
		return city;
	}

	public String getInfo() {
		return info;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", car=" + car + ", city=" + city + ", info=" + info + "]";
	}

}
