import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Employee {

    private String firstName;
    private String lastName;
    private double salary;
    private String department;

    public Employee(String firstName, String lastName, double salary, String department){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString(){

        return String.format("%-8s %-8s %8,2f %s", getFirstName(), getLastName(), getSalary(), getDepartment());
    }


    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Jason", "Radisson", 5000, "IT" ),
                new Employee("Denish", "Raj", 7600, "IT"),
                new Employee("Fannekin", "Jess", 1660, "HR")
        };

        List<Employee> list = Arrays.asList(employees);

        System.out.println("Complete Employee list");
        list.stream().forEach(System.out::println);

        Predicate<Employee> fourToSixThousand = e -> (e.getSalary() >= 4000 && e.getSalary() <= 6000);


//        System.out.printf("%n Employees earning $4000-$6000 per month sorted by salary: %n", list.stream()
//                                                                                             .filter(fourToSixThousand)
//                                                                                             .sorted(Comparator.comparing(Employee::getSalary))
//                                                                                             .forEach(System.out::println);

        System.out.printf("%nFirst employee who earns $4000-$6000: %n%s%n", list.stream()
                                                                             .filter(fourToSixThousand)
                                                                              .findFirst()
                                                                            .get());


        //Function<Employee, String> byFirst
    }
}
