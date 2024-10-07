package main;

public class EmployeeDirector {
    public Employee constructEmployee(EmployeeBuilder builder) {
        return builder.build();
    }
}