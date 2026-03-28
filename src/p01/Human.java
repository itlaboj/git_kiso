package p01;

public class Human extends Member {
	String name;
	int age;
	
	public Human() {
		
	}

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void introduce() {
		System.out.println("CCC");
	}
}
