package main;

public class EMS {
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