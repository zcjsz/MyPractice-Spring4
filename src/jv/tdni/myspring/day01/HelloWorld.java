package jv.tdni.myspring.day01;

public class HelloWorld {

	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void hello() {
		System.out.println("hello " + name);
	}
	
}
