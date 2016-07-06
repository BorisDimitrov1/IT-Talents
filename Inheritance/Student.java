package homeWorkOOP.Inheritance;

public class Student extends Person{

	private float score;
	
	Student(String name,int age, boolean isMale, float score){
		super(name, age, isMale);
		this.score = score >= 2 && score <= 6 ? score : 1;
	}
	
	void showStudentInfo(){
		showPersonInfo();
		System.out.println("Ocenka: " + this.score);
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

}
