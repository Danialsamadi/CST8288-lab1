package main;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private static EmployeeManager instance;
    private List<Employee> employees;

    private EmployeeManager() {
        employees = new ArrayList<>();
    }

    public static EmployeeManager getInstance() {
        if (instance == null) {
            instance = new EmployeeManager();
        }
        return instance;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public Employee getEmployee(int id) {
        return employees.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employees);
    }
}