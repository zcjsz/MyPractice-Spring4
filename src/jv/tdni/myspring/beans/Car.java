package jv.tdni.myspring.beans;

public class Car {

	private String brand;
	private String crop;
	private double price;
	private int maxSpeed;
	
	public Car() {}
	
	public Car(String brand, String crop, double price) {
		super();
		this.brand = brand;
		this.crop = crop;
		this.price = price;
	}

	public Car(String brand, String crop, int maxSpeed) {
		super();
		this.brand = brand;
		this.crop = crop;
		this.maxSpeed = maxSpeed;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setCrop(String crop) {
		this.crop = crop;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	
	public String getBrand() {
		return brand;
	}

	public String getCrop() {
		return crop;
	}

	public double getPrice() {
		return price;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", crop=" + crop + ", price=" + price + ", maxSpeed=" + maxSpeed + "]";
	}

	
	
	
	
}
