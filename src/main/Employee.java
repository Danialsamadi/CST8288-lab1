package main;

/**
 * <p>The {@code Employee} class serves as an abstract base class for different types of employees.
 * It contains common fields and methods shared across various employee types, such as ID, name,
 * department, and role. Subclasses must implement the abstract methods to define specific behaviors
 * for clocking in, clocking out, and tracking work hours.</p>
 *
 * @author DanialSamadi
 * @since 1.0
 */
public abstract class Employee {

    /** The unique identifier for the employee. */
    protected int id;

    /** The full name of the employee. */
    protected String name;

    /** The department where the employee works. */
    protected String department;

    /** The role or position of the employee in the organization. */
    protected String role;

    /** The number of working hours per week assigned to the employee. */
    protected int workingHoursPerWeek;

    /** The salary of the employee. */
    protected double salary;

    /**
     * <p>Abstract method to record when the employee clocks in.
     * Subclasses must provide the specific implementation of this behavior.</p>
     */
    public abstract void clockIn();

    /**
     * <p>Abstract method to record when the employee clocks out.
     * Subclasses must provide the specific implementation of this behavior.</p>
     */
    public abstract void clockOut();

    /**
     * <p>Abstract method to track the working hours of the employee.
     * Subclasses must provide the specific implementation of this behavior.</p>
     */
    public abstract void trackWorkHours();

    /**
     * Retrieves the employee's ID.
     *
     * @return the unique identifier of the employee
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the employee's ID.
     *
     * @param id the unique identifier to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Retrieves the employee's name.
     *
     * @return the full name of the employee
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the employee's name.
     *
     * @param name the full name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the department of the employee.
     *
     * @return the department where the employee works
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the department of the employee.
     *
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Retrieves the employee's role.
     *
     * @return the role or position of the employee
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the employee's role.
     *
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * Retrieves the number of working hours per week.
     *
     * @return the working hours assigned to the employee per week
     */
    public int getWorkingHoursPerWeek() {
        return workingHoursPerWeek;
    }

    /**
     * Sets the number of working hours per week.
     *
     * @param workingHoursPerWeek the working hours to set
     */
    public void setWorkingHoursPerWeek(int workingHoursPerWeek) {
        this.workingHoursPerWeek = workingHoursPerWeek;
    }

    /**
     * Retrieves the employee's salary.
     *
     * @return the salary of the employee
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Sets the employee's salary.
     *
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
