package homeWorkOOP.Inheritance;

public class Employee extends Person{
	
	private static final String DNEVNA_NADNICA = "Dnevna nadnica: ";
	private static final int WORKING_HOURS_PER_DAY = 8;
	private static final double COEF_FOR_OVERTIME = 1.5;
	private static final int MIN_AGE_FOR_OVERTIMEWORK = 18;
	
	private double daySalary;

	Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		this.daySalary = daySalary > 0 ? daySalary : 0;
	}
	
	void showEmployeeInfo(){
		showPersonInfo();
		System.out.println(DNEVNA_NADNICA + daySalary);
	}
	
	double calculateOvertime(double overtimeHours){
		double salaryForHour = daySalary / WORKING_HOURS_PER_DAY;
		if(this.getAge() < MIN_AGE_FOR_OVERTIMEWORK){
			return 0;
		}else {
			return overtimeHours > 0 ? salaryForHour * COEF_FOR_OVERTIME : 0;
		}
	}

	double getDaySalary() {
		return daySalary;
	}

	void setDaySalary(double daySalary) {
		this.daySalary = daySalary;
	}
}
