package jv.tdni.myspring.beans.spel;

public class Car {

	private String brand;
	private double price;
	private double tyrePerimeter;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setTyrePerimeter(double tyrePerimeter) {
		this.tyrePerimeter = tyrePerimeter;
	}

	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;
	}

	public double getTyrePerimeter() {
		return tyrePerimeter;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", tyrePerimeter=" + tyrePerimeter + "]";
	}

}
