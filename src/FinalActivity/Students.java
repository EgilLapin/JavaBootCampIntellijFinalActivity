package FinalActivity;

public class Students extends Persons{

    public Students(String name, String lastName, int age) {
        super(name, lastName, age);
    }

    public static void introducePersons(){
        String schoolName = "BA";
        System.out.println("I study in university: " + schoolName);
        System.out.println("----------------------Task3 Completed-------------------------------");
    }
}
