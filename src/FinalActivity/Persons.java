package FinalActivity;

public class Persons implements MotoPerson {
    String name;
    String lastName;
    int age;


    public Persons(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        System.out.println("My name is " + name + " " + lastName + " and i am " + age + " years old.");
    }



    public static void numberTester() throws CustomException {
            Persons EgilsNumber = new Persons("3g1l5", "L4p1n5", 27);
        try {
            if (EgilsNumber.name.matches(".*\\d.*") || EgilsNumber.lastName.matches(".*\\d.*") ) {
                throw new CustomException("<<<<<<<Custom Exceptiopn found: There is a number in the name or lastname>>>>>>> \n ----------------------Task 8&9 Completed-------------------------------\n");
            } else {
                System.out.println("No numbers found");
            }
        } catch (CustomException e){
            System.out.print( e );
        }
    }


    ///////GETTERS AND SETTERS //////////////
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getlastName() {
        return lastName;
    }

    public void setLastname(String lastName) {
        this.lastName = lastName;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }
    /////////////////////////////////////
}
