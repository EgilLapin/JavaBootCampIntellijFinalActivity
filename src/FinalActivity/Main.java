package FinalActivity;

import java.io.FileNotFoundException;

public class Main {


    public static void main(String[] args) throws CustomException, FileNotFoundException {
    	//Task1 - Introduce a Person
	 Persons egils1 = new Persons("Egils", "Lapins", 27);
	 System.out.println(egils1);
	 System.out.println("----------------------Task1 Completed-------------------------------");
		//Task2 - Introduce a Employee
	 Employee empEgils = new Employee();
		empEgils.setName("Employee_Egils");
		empEgils.setLastname("Employee_Lapins");
		empEgils.setAge(27);
		empEgils.setCompanyName("Accenture");
		empEgils.setJobTitle("Test Engineer");

		System.out.println("My name is " + empEgils.getName() + " " + empEgils.getlastName() + " and i am " + empEgils.getAge() + " years old.");
		System.out.println("I work as a " +  empEgils.getJobTitle() + " in " + empEgils.getCompanyName() + "(Hopefully).");
		System.out.println("----------------------Task2 Completed-------------------------------");
		//Task3 - Introduce a Person - Students
		Students.introducePersons();
		//Task4 - Print highest salary
		FirstActivity.highestSalary();
		//Task 5 - Tests of all classes
		System.out.println("To see Tests, see Tests.java file");
		System.out.println("----------------------Task5 Completed-------------------------------");

		//Task6 - Create Calculator
		System.out.println("Addition result is: " + SecondActivity.addition(6,5));
		int subtraction1 = SecondActivity.subtract(6,5);
		System.out.println("Subtraction result is: " + subtraction1);
		int div1 = SecondActivity.divide(30,15);
		System.out.println("Division result is: " + div1);
		int multiply1 = SecondActivity.multiply(30,15);
		System.out.println("Multiplication result is: " + multiply1);
		System.out.println("----------------------Task6 Completed-------------------------------");
		//Task 7 - Tests for Calculator
		System.out.println("To see Tests, see Tests.java file");
		System.out.println("----------------------Task7 Completed-------------------------------");
		//Task 8&9 - add numbers check for the name and lastname in Person
		Persons.numberTester();
		//Bonus Tasks
		//Bonus Task 1 - Interface of Persons
		MotoPerson motoEgils = new Persons("MotoEgils", "motoLapins", 27);
		motoEgils.makeNoise();
		System.out.println("------------Bonus Task 1 Completed (Not sure about this)----------------");
		//Bonus Task 2 - Save Employee list
		EmployeeList.employeeListMaker();
		System.out.println("---------------------Bonus Task 2 Completed-----------------------------");
		//Bonus Task 3 - Fib maker
		FibonacciMaker300.fibMaker300();
		System.out.println("\n---------------------Bonus Task 3 Completed-----------------------------");

		System.out.println("-------------------Final Activity Completed-----------------------------");

	}
}


