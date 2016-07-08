package homeWorkOOP.Inheritance;

public class Employee extends Person{
	private double daySalary;

	Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		this.daySalary = daySalary > 0 ? daySalary : 0;
	}
	
	void showEmployeeInfo(){
		showPersonInfo();
		System.out.println("Dnevna nadnica: " + daySalary);
	}
	
	double calculateOvertime(double overtimeHours){
		double salaryForHour = daySalary / 8;
		if(this.getAge() < 18){
			return 0;
		}else {
			return overtimeHours > 0 ? salaryForHour * 1.5 : 0;
		}
	}

	double getDaySalary() {
		return daySalary;
	}

	void setDaySalary(double daySalary) {
		this.daySalary = daySalary;
	}
}
