package FinalActivity;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class EmployeeList extends Employee {


    public static void employeeListMaker() throws FileNotFoundException {
    Employee John = new Employee();
    John.setName("John");
    John.setLastname("Doe");
    Employee Donald = new Employee();
        Donald.setName("Donald");
        Donald.setLastname("Trumpy");

        PrintStream printedList = new PrintStream(new File("EmployeeList.txt"));
        PrintStream console = System.out;
        System.setOut(printedList);
        System.out.println("Employees are: \n" + John.getName() + " " + John.getlastName() + "\n" +Donald.getName() + " " +Donald.getlastName());
        System.setOut(console);
        System.out.println("Check the file in folder");
    }
}

