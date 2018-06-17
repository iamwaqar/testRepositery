class Person{
	String name;
	int age;
	
	void info() {
		System.out.println("Name of Person is " + name);
		System.out.println("Age is " + age);
	}
}
public class App {

	public static void main(String[] args) {

		Person p1 = new Person();
		p1.name = "Syed";
		p1.age = 20;
		p1.info();
	}

}
