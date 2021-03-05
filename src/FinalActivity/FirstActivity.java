package FinalActivity;

public class FirstActivity {


    public static void highestSalary() {
        Employee emp1 = new Employee();
        emp1.setName("Donald");
        emp1.setSalary(1000.51);

        Employee emp2 = new Employee();
        emp2.setName("John");
        emp2.setSalary(800.51);

        Employee emp3 = new Employee();
        emp2.setName("Bill");
        emp2.setSalary(900.33);
        // Probably not the best way to do this :)
        if (emp1.salary > emp2.salary && emp2.salary > emp3.salary) {
            System.out.println("Employee " + emp1.getName() + " is 1st with a salary of " + emp1.getSalary() + ".");
            System.out.println("Employee " + emp2.getName() + " is 2nd with a salary of " + emp2.getSalary() + ".");
            System.out.println("Employee " + emp3.getName() + " is 3rd with a salary of " + emp3.getSalary() + ".");
        } else if (emp3.salary > emp1.salary && emp1.salary > emp2.salary) {
            System.out.println("Employee " + emp3.getName() + " is 1st with a salary of " + emp3.getSalary() + ".");
            System.out.println("Employee " + emp1.getName() + " is 2nd with a salary of " + emp1.getSalary() + ".");
            System.out.println("Employee " + emp2.getName() + " is 3rd with a salary of " + emp2.getSalary() + ".");
        } else if (emp3.salary > emp2.salary && emp2.salary > emp1.salary) {
            System.out.println("Employee " + emp3.getName() + " is 1st with a salary of " + emp3.getSalary() + ".");
            System.out.println("Employee " + emp2.getName() + " is 2nd with a salary of " + emp2.getSalary() + ".");
            System.out.println("Employee " + emp1.getName() + " is 3rd with a salary of " + emp1.getSalary() + ".");
        } else if (emp1.salary > emp3.salary && emp3.salary > emp2.salary) {
            System.out.println("Employee " + emp1.getName() + " is 1st with a salary of " + emp1.getSalary() + ".");
            System.out.println("Employee " + emp3.getName() + " is 2nd with a salary of " + emp3.getSalary() + ".");
            System.out.println("Employee " + emp2.getName() + " is 3rd with a salary of " + emp2.getSalary() + ".");
        }else if (emp2.salary > emp1.salary && emp1.salary > emp3.salary) {
            System.out.println("Employee " + emp2.getName() + " is 1st with a salary of " + emp2.getSalary() + ".");
            System.out.println("Employee " + emp1.getName() + " is 2nd with a salary of " + emp1.getSalary() + ".");
            System.out.println("Employee " + emp3.getName() + " is 3rd with a salary of " + emp3.getSalary() + ".");
        }else if  (emp2.salary > emp3.salary && emp3.salary > emp1.salary) {
            System.out.println("Employee " + emp2.getName() + " is 1st with a salary of " + emp2.getSalary() + ".");
            System.out.println("Employee " + emp3.getName() + " is 2nd with a salary of " + emp3.getSalary() + ".");
            System.out.println("Employee " + emp1.getName() + " is 3rd with a salary of " + emp1.getSalary() + ".");
        }
        System.out.println("----------------------Task4 Completed-------------------------------");
    }

}


