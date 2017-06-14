package ttn.kssJava8.session1.methodReference;

public class Employee {

    String name;
    Integer age;

    public Employee(String name, Integer age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
