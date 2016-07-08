package homeWorkOOP.Inheritance;

public class Person {

	private static final String INVALID_NAME = "Invalid name";
	private static final int INVALID_AGE = -1;
	private static final String NAME = "Ime: ";
	private static final String AGE = "Godini: ";
	private static final String MUJ = "Muj";
	private static final String JENA = "Jena";
	
	private String name;
	private int age;
	private boolean isMale;
	
	Person(String name, int age, boolean isMale){
		this.name = name != null && !name.equals("") ? name : INVALID_NAME;
		this.age = age >= 0 ? age : INVALID_AGE;
		this.isMale = isMale;
	}
	
	void showPersonInfo(){
		System.out.println(NAME + this.name);
		System.out.println(AGE + this.age);
		System.out.println(isMale ? MUJ : JENA);
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
