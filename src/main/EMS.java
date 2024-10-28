package main;

/**
 * <p>The {@code EMS} class serves as the entry point for the Employee Management System.</p>
 *
 * <p>This class demonstrates the creation and management of employee objects using various
 * design patterns, including the Builder, Factory, Singleton, and Director patterns.</p>
 *
 * @since 1.0
 */
public class EMS {

    /**
     * The main method that serves as the entry point for the application.
     *
     * <p>In this method:
     * <ul>
     *   <li>A full-time employee is created using the Builder pattern via the {@code FullTimeEmployeeBuilder}.</li>
     *   <li>A part-time employee is created using the Factory pattern via the {@code EmployeeFactory}.</li>
     *   <li>Both employees are added to the {@code EmployeeManager} instance, which follows the Singleton pattern.</li>
     *   <li>The program prints the list of employees and demonstrates their ability to clock in.</li>
     * </ul>
     * </p>
     *
     * @param args the command-line arguments (not used in this application)
     */
    public static void main(String[] args) {
        EmployeeManager manager = EmployeeManager.getInstance();
        EmployeeFactory factory = new EmployeeFactory();
        EmployeeDirector director = new EmployeeDirector();

        // Create employees using Builder
        EmployeeBuilder fullTimeBuilder = new FullTimeEmployeeBuilder()
                .setId(1)
                .setName("Jay Parmar")
                .setDepartment("IT")
                .setRole("Full Stack Developer")
                .setWorkingHoursPerWeek(40)
                .setSalary(7000);
        Employee fullTimeEmployee = director.constructEmployee(fullTimeBuilder);
        manager.addEmployee(fullTimeEmployee);

        // Create employees using Factory
        Employee partTimeEmployee = factory.createEmployee("parttime");
        partTimeEmployee.setId(2);
        partTimeEmployee.setName("Salim Halwani");
        partTimeEmployee.setDepartment("HR");
        partTimeEmployee.setRole("Manager");
        partTimeEmployee.setWorkingHoursPerWeek(20);
        partTimeEmployee.setSalary(2500);
        manager.addEmployee(partTimeEmployee);

        // Demonstrate usage
        System.out.println("All Employees:");
        for (Employee emp : manager.getAllEmployees()) {
            System.out.println(emp.getName() + " - " + emp.getRole());
        }

        fullTimeEmployee.clockIn();
        partTimeEmployee.clockIn();
    }
}
