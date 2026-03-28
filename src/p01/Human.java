package p01;

public class Human extends Member {
	String name;
	int age;
	
	public Human() {
		System.out.println("Main");
	}

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void introduce() {
		
	}
}
