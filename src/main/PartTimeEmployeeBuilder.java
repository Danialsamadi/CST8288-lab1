package main;

/**
 * <p>The {@code PartTimeEmployeeBuilder} class implements the {@code EmployeeBuilder} interface
 * to provide a concrete builder for creating {@code PartTimeEmployee} objects.</p>
 *
 * <p>This class follows the Builder design pattern, allowing the construction of
 * {@code PartTimeEmployee} instances through a fluent API. Each method sets a specific property
 * of the employee and returns the builder instance for method chaining.</p>
 *
 * @since 1.0
 */
public class PartTimeEmployeeBuilder implements EmployeeBuilder {

    /** The {@code PartTimeEmployee} instance being constructed. */
    private PartTimeEmployee employee = new PartTimeEmployee();

    /**
     * Sets the ID for the part-time employee.
     *
     * @param id the unique identifier for the employee
     * @return the current {@code PartTimeEmployeeBuilder} instance for method chaining
     */
    @Override
    public EmployeeBuilder setId(int id) {
        employee.setId(id);
        return this;
    }

    /**
     * Sets the name of the part-time employee.
     *
     * @param name the full name of the employee
     * @return the current {@code PartTimeEmployeeBuilder} instance for method chaining
     */
    @Override
    public EmployeeBuilder setName(String name) {
        employee.setName(name);
        return this;
    }

    /**
     * Sets the department of the part-time employee.
     *
     * @param department the department where the employee works
     * @return the current {@code PartTimeEmployeeBuilder} instance for method chaining
     */
    @Override
    public EmployeeBuilder setDepartment(String department) {
        employee.setDepartment(department);
        return this;
    }

    /**
     * Sets the role of the part-time employee.
     *
     * @param role the role or position of the employee
     * @return the current {@code PartTimeEmployeeBuilder} instance for method chaining
     */
    @Override
    public EmployeeBuilder setRole(String role) {
        employee.setRole(role);
        return this;
    }

    /**
     * Sets the number of working hours per week for the part-time employee.
     *
     * @param hours the number of hours the employee works per week
     * @return the current {@code PartTimeEmployeeBuilder} instance for method chaining
     */
    @Override
    public EmployeeBuilder setWorkingHoursPerWeek(int hours) {
        employee.setWorkingHoursPerWeek(hours);
        return this;
    }

    /**
     * Sets the salary of the part-time employee.
     *
     * @param salary the salary of the employee
     * @return the current {@code PartTimeEmployeeBuilder} instance for method chaining
     */
    @Override
    public EmployeeBuilder setSalary(double salary) {
        employee.setSalary(salary);
        return this;
    }

    /**
     * Builds and returns the constructed {@code PartTimeEmployee} instance.
     *
     * @return the fully constructed {@code PartTimeEmployee} object
     */
    @Override
    public Employee build() {
        return employee;
    }
}
