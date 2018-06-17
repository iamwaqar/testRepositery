class Person{
	String name;
	int age;
	
	void info() {
		System.out.println("Name of Person is " + name);
	}
}
public class App {

	public static void main(String[] args) {

		Person p1 = new Person();
		p1.name = "Syed";
		p1.info();
	}

}
