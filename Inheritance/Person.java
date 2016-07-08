package homeWorkOOP.Inheritance;

public class Person {

	private String name;
	private int age;
	private boolean isMale;
	
	Person(String name, int age, boolean isMale){
		this.name = name != null && !name.equals("") ? name : "Invalid name";
		this.age = age >= 0 ? age : -1;
		this.isMale = isMale;
	}
	
	void showPersonInfo(){
		System.out.println("Ime: " + this.name);
		System.out.println("Godini: " + this.age);
		System.out.println(isMale ? "Muj" : "Jena");
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

	boolean isMale() {
		return isMale;
	}

	void setMale(boolean isMale) {
		this.isMale = isMale;
	}
}
