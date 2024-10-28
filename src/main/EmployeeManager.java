package main;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>The {@code EmployeeManager} class is a singleton that manages a collection of {@code Employee} objects.</p>
 *
 * <p>This class provides methods to add, remove, and retrieve employees, ensuring that only
 * one instance of the manager exists throughout the application. It uses the singleton pattern
 * to ensure centralized management of employees.</p>
 *
 * @since 1.0
 */
public class EmployeeManager {

    /** The single instance of the {@code EmployeeManager}. */
    private static EmployeeManager instance;

    /** The list of employees managed by the {@code EmployeeManager}. */
    private List<Employee> employees;

    /**
     * Private constructor to prevent instantiation from outside the class.
     * Initializes the employee list.
     */
    private EmployeeManager() {
        employees = new ArrayList<>();
    }

    /**
     * Returns the singleton instance of the {@code EmployeeManager}.
     * If the instance does not exist, it is created.
     *
     * @return the singleton instance of {@code EmployeeManager}
     */
    public static EmployeeManager getInstance() {
        if (instance == null) {
            instance = new EmployeeManager();
        }
        return instance;
    }

    /**
     * Adds a new employee to the list.
     *
     * @param employee the {@code Employee} object to add
     */
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    /**
     * Removes an employee from the list.
     *
     * @param employee the {@code Employee} object to remove
     */
    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    /**
     * Retrieves an employee by their ID.
     *
     * @param id the unique identifier of the employee to retrieve
     * @return the {@code Employee} object with the specified ID, or {@code null} if not found
     */
    public Employee getEmployee(int id) {
        return employees.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
    }

    /**
     * Retrieves a list of all employees.
     *
     * @return a new list containing all {@code Employee} objects
     */
    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employees);
    }
}
