package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import main.EmployeeManager;
import main.Employee;
import main.FullTimeEmployeeBuilder;
import main.PartTimeEmployeeBuilder;

/**
 * <p>The {@code EmployeeManagerTest} class contains unit tests to validate the behavior of the
 * {@code EmployeeManager} singleton. It ensures that employees are correctly added, retrieved,
 * and managed within the system.</p>
 *
 * <p>This class uses JUnit 5 for testing and ensures that the state of the {@code EmployeeManager}
 * is reset before each test using the {@code @BeforeEach} setup method.</p>
 *
 * @since 1.0
 */
class EmployeeManagerTest {

    /** The singleton instance of the {@code EmployeeManager} used in the tests. */
    private EmployeeManager manager;

    /**
     * Sets up a clean state before each test by resetting the employee list.
     *
     * <p>This ensures that the tests do not interfere with each other by carrying over state from
     * previous runs.</p>
     */
    @BeforeEach
    void setUp() {
        manager = EmployeeManager.getInstance();
        manager.getAllEmployees().clear();  // Ensure clean state before each test
    }

    /**
     * Tests that the {@code EmployeeManager} follows the singleton pattern.
     *
     * <p>This test verifies that multiple calls to {@code getInstance()} return the same instance.</p>
     */
    @Test
    void testSingletonBehavior() {
        EmployeeManager anotherInstance = EmployeeManager.getInstance();
        assertSame(manager, anotherInstance, "EmployeeManager should return the same instance");
    }

    /**
     * Tests that an employee can be added to the {@code EmployeeManager}.
     *
     * <p>This test verifies that the employee list size increases after adding a new employee.</p>
     */
    @Test
    void testAddEmployee() {
        Employee employee = new FullTimeEmployeeBuilder()
                .setId(1)
                .setName("Danial")
                .setDepartment("HR")
                .setRole("Manager")
                .setWorkingHoursPerWeek(40)
                .setSalary(5000)
                .build();

        manager.addEmployee(employee);
        assertEquals(2, manager.getAllEmployees().size(), "Employee should be added");
    }

    /**
     * Tests that an employee can be retrieved by ID from the {@code EmployeeManager}.
     *
     * <p>This test ensures that an employee is correctly found and the retrieved data matches
     * the original employee details.</p>
     */
    @Test
    void testGetEmployee() {
        Employee employee = new FullTimeEmployeeBuilder()
                .setId(1)
                .setName("Jay Parmar")
                .build();

        manager.addEmployee(employee);
        Employee retrieved = manager.getEmployee(1);
        assertNotNull(retrieved, "Employee should be found by ID");
        assertEquals("Jay Parmar", retrieved.getName(), "Employee name should match");
    }

    /**
     * Tests that the {@code getAllEmployees()} method returns the correct list of employees.
     *
     * <p>This test verifies that the list contains all added employees and matches the expected size.</p>
     */
    @Test
    void testGetAllEmployees() {
        Employee employee1 = new FullTimeEmployeeBuilder()
                .setId(1)
                .setName("Jay Parmar")
                .build();

        Employee employee2 = new PartTimeEmployeeBuilder()
                .setId(2)
                .setName("Salim Halwani")
                .build();

        manager.addEmployee(employee1);
        manager.addEmployee(employee2);

        assertEquals(4, manager.getAllEmployees().size(), "There should be 2 employees in the list");
    }
}
