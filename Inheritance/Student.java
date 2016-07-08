package homeWorkOOP.Inheritance;

public class Student extends Person{
	
	private static final int INVALID_SCORE_INPUT = 1;
	private static final float MIN_SCORE = 2;
	private static final float MAX_SCORE = 6;
	private static final String OCENKA = "Ocenka: ";

	private float score;
	
	Student(String name,int age, boolean isMale, float score){
		super(name, age, isMale);
		this.score = score >= MIN_SCORE && score <= MAX_SCORE ? score : INVALID_SCORE_INPUT;
	}
	
	void showStudentInfo(){
		showPersonInfo();
		System.out.println(OCENKA + this.score);
	}

    float getScore() {
		return score;
	}

	void setScore(float score) {
		this.score = score;
	}
}
