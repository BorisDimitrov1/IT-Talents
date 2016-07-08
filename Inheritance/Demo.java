package homeWorkOOP.Inheritance;

public class Demo {

	public static void main(String[] args) {
		Person[] arrayOfPersons = new Person[10];
		Person person1 = new Person("Person 1", 18, true);
		Person person2 = new Person("Person 2", 19, false);
		Student student1 = new Student("Student 1", 20, true, 3);
		Student student2 = new Student("Student 2", 20, true, 4);
		Employee employee1 = new Employee("Employee 1", 18, true, 30);
		Employee employee2 = new Employee("Employee 2", 17, true, 30);
		
		arrayOfPersons[0] = person1;
		arrayOfPersons[1] = person2;
		arrayOfPersons[2] = student1;
		arrayOfPersons[3] = student2;
		arrayOfPersons[4] = employee1;
		arrayOfPersons[5] = employee2;
		
		for (int index = 0; index < arrayOfPersons.length; index++) {
			if(arrayOfPersons[index] != null){
				if(arrayOfPersons[index] instanceof Student || arrayOfPersons[index] instanceof Employee){
					if(arrayOfPersons[index] instanceof Student){
						((Student)arrayOfPersons[index]).showStudentInfo();
					}else{
						((Employee)arrayOfPersons[index]).showEmployeeInfo();
					}
				}else{
					arrayOfPersons[index].showPersonInfo();
				}
				System.out.println();
			}
		}
		
		for (int index = 0; index < arrayOfPersons.length; index++) {
			if(arrayOfPersons[index] != null){
				if(arrayOfPersons[index] instanceof Employee){
					System.out.print("Pari za izvunreden trud: ");
					System.out.println(((Employee)arrayOfPersons[index]).calculateOvertime(2));
				}
			}
		}
		//Отговор на въпроса : Ако дефинираме конструктор без параметри в класа Student компилаторът
		//няма да го позволи защото нямаме дефиниран такъв в класа Person.
		//Може да се оправи като дефинираме конструктор без параметри в класа Person
	}
}
