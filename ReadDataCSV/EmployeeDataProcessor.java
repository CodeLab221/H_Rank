import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDataProcessor {
    public static void main(String[] args) {
        // Set the name of the CSV file to be read
        String csvFile = "employee_data.csv";

        // Create an empty list to hold the employee data
        List<Employee> employees = new ArrayList<>();

        // Read data from CSV file using Java I/O
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            // Read each line of the file
            String line;
            while ((line = br.readLine()) != null) {
                // Split the line into fields using a comma as the delimiter
                String[] data = line.split(",");

                // Check that there are exactly 5 fields in the line
                if (data.length != 5) {
                    // If the line is invalid, skip it and move on to the next line
                    continue;
                }

                // Create a new Employee object using the fields in the line
                Employee employee = new Employee(
                    data[0],
                    data[1],
                    Integer.parseInt(data[2]),
                    Boolean.parseBoolean(data[3]),
                    Double.parseDouble(data[4])
                );

                // Add the new Employee object to the list of employees
                employees.add(employee);
            }
        } catch (IOException e) {
            // If there is an error reading the file, print the stack trace
            e.printStackTrace();
        }

        // Filter out inactive employees using streams and lambda expressions
        List<Employee> activeEmployees = employees.stream()
            .filter(Employee::isActive)
            .collect(Collectors.toList());

        // Sort employees by their salary using streams and lambda expressions
        List<Employee> sortedEmployees = activeEmployees.stream()
            .sorted(Comparator.comparing(Employee::getSalary))
            .collect(Collectors.toList());

        // Calculate the average age of the remaining employees using streams and lambda expressions
        double averageAge = activeEmployees.stream()
            .mapToInt(Employee::getAge)
            .average()
            .orElse(Double.NaN);

        // Print the sorted list of active employees and their average age
        System.out.println("Active Employees Sorted by Salary:");
        sortedEmployees.forEach(System.out::println);
        System.out.println("Average Age of Active Employees: " + averageAge);
    }
}

class Employee {
    // Define the fields for an employee
    private String firstName;
    private String lastName;
    private int age;
    private boolean active;
    private double salary;

    // Create a constructor to initialize the fields of an employee
    public Employee(String firstName, String lastName, int age, boolean active, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.active = active;
        this.salary = salary;
    }

    // Create getters for the fields of an employee
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isActive() {
        return active;
    }

    public double getSalary() {
        return salary;
    }
      @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", active=" + active +
                ", salary=" + salary +
                '}';
    }
}

