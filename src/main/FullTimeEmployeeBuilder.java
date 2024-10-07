package main;

public class FullTimeEmployeeBuilder implements EmployeeBuilder {
    private FullTimeEmployee employee = new FullTimeEmployee();

    @Override
    public EmployeeBuilder setId(int id) {
        employee.setId(id);
        return this;
    }

    @Override
    public EmployeeBuilder setName(String name) {
        employee.setName(name);
        return this;
    }

    @Override
    public EmployeeBuilder setDepartment(String department) {
        employee.setDepartment(department);
        return this;
    }

    @Override
    public EmployeeBuilder setRole(String role) {
        employee.setRole(role);
        return this;
    }

    @Override
    public EmployeeBuilder setWorkingHoursPerWeek(int hours) {
        employee.setWorkingHoursPerWeek(hours);
        return this;
    }

    @Override
    public EmployeeBuilder setSalary(double salary) {
        employee.setSalary(salary);
        return this;
    }

    @Override
    public Employee build() {
        return employee;
    }
}