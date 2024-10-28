package main;

/**
 * <p>The {@code EmployeeBuilder} interface defines a builder pattern for creating {@code Employee} objects.
 * It provides a fluent API for setting various properties and ensures that the final object is built
 * only after all necessary properties have been set.</p>
 *
 * <p>This interface allows for a step-by-step construction of {@code Employee} objects, making it
 * easier to manage complex object creation processes.</p>
 *
 * @author DanialSamadi
 * @since 1.0
 */
public interface EmployeeBuilder {

    /**
     * Sets the ID of the employee.
     *
     * @param id the unique identifier to set for the employee
     * @return the current {@code EmployeeBuilder} instance for method chaining
     */
    EmployeeBuilder setId(int id);

    /**
     * Sets the name of the employee.
     *
     * @param name the full name to set for the employee
     * @return the current {@code EmployeeBuilder} instance for method chaining
     */
    EmployeeBuilder setName(String name);

    /**
     * Sets the department of the employee.
     *
     * @param department the department to set for the employee
     * @return the current {@code EmployeeBuilder} instance for method chaining
     */
    EmployeeBuilder setDepartment(String department);

    /**
     * Sets the role or position of the employee.
     *
     * @param role the role to set for the employee
     * @return the current {@code EmployeeBuilder} instance for method chaining
     */
    EmployeeBuilder setRole(String role);

    /**
     * Sets the number of working hours per week for the employee.
     *
     * @param hours the number of working hours to set for the employee per week
     * @return the current {@code EmployeeBuilder} instance for method chaining
     */
    EmployeeBuilder setWorkingHoursPerWeek(int hours);

    /**
     * Sets the salary of the employee.
     *
     * @param salary the salary to set for the employee
     * @return the current {@code EmployeeBuilder} instance for method chaining
     */
    EmployeeBuilder setSalary(double salary);

    /**
     * Builds and returns the {@code Employee} object with the specified properties.
     *
     * @return the constructed {@code Employee} object
     */
    Employee build();
}
