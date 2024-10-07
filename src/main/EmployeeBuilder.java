package main;

public interface EmployeeBuilder {
    EmployeeBuilder setId(int id);
    EmployeeBuilder setName(String name);
    EmployeeBuilder setDepartment(String department);
    EmployeeBuilder setRole(String role);
    EmployeeBuilder setWorkingHoursPerWeek(int hours);
    EmployeeBuilder setSalary(double salary);
    Employee build();
}