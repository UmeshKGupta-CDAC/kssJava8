package ttn.kssJava8.session1.methodReference;


public class ConstructorReference {

    //Todo:4
    public static void main(String[] args) {

        EmployeeFactory empFactory = Employee::new;

        Employee emp = empFactory.getEmployee("testUser", 25);
        System.out.println(emp);
    }
}
