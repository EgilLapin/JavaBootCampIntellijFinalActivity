package FinalActivity;


import org.junit.ComparisonFailure;
import org.junit.Test;
import junit.framework.TestCase;

public class Tests extends TestCase {
@Test
//////////////////////Employee tests////////////////////
    public void testEmployeeName() throws ComparisonFailure {
        Employee emptest = new Employee();
        emptest.setName("TestEmployee");
        assertEquals("TestEmployee", emptest.getName());
    }

    public void testEmployeeLastname() throws ComparisonFailure {
        Employee emptest2 = new Employee();
        emptest2.setLastname("TestEmployee");
        assertEquals("TestEmployee", emptest2.getlastName());
    }

    public void testEmployeeAge() throws ComparisonFailure {
        Employee emptest3 = new Employee();
        emptest3.setAge(111);
        assertEquals(111, emptest3.getAge());
    }

    public void testEmployeeSalary() throws ComparisonFailure {
        Employee emptest4 = new Employee();
        emptest4.setSalary(1000.11);
        assertEquals(1000.11, emptest4.getAge());
    }

    public void testEmployeeCompanyName() throws ComparisonFailure {
        Employee emptest5 = new Employee();
        emptest5.setCompanyName("TestEmployee");
        assertEquals("TestEmployee", emptest5.getCompanyName());
    }

    public void testEmployeeJobTitle() throws ComparisonFailure {
        Employee emptest6 = new Employee();
        emptest6.setJobTitle("TestEmployee");
        assertEquals("TestEmployee", emptest6.getJobTitle());
    }

    //////////////////////Persons tests////////////////////
    public void testPersonName() throws ComparisonFailure {
        Persons emptest = new Persons("Testname","TestlastName",111);
        assertEquals("Testname", emptest.name);
    }

    public void testPersonLastName() throws ComparisonFailure {
        Persons emptest2 = new Persons("Testname","TestlastName",111);
        assertEquals("TestlastName", emptest2.lastName);
    }

    public void testPersonAge() throws ComparisonFailure {
        Persons emptest3 = new  Persons("Testname","TestlastName",111);
        assertEquals(111, emptest3.age);
    }
    ////////////////////Students Test////////////////////
    public void testIntroducePersons() throws ComparisonFailure{
        String statement = "I study in university: BA";
        assertEquals(statement,"I study in university: BA");
    }

    ///////////SecondActivity - Calculator Test///////////
    public void testAddition() throws ComparisonFailure{
        int addition1 = SecondActivity.addition(15,5);
        assertEquals(20,addition1);
    }
    public void testAddition2() throws ComparisonFailure{
        int addition1 = SecondActivity.addition(15,5);
        assertTrue(addition1 == 20);
    }

    public void testSubtract() throws ComparisonFailure{
        int subtraction1 = SecondActivity.subtract(15,5);
        assertEquals(10,subtraction1);
    }
    public void testMultiply() throws ComparisonFailure{
        int multi1 = SecondActivity.multiply(10,10);
        assertEquals(100,multi1);
    }
    public void testDivide() throws ComparisonFailure{
        int div1 = SecondActivity.divide(25,5);
        assertEquals(5,div1);
    }
}

