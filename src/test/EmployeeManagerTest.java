package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import main.EmployeeManager; // Update based on actual package
import main.Employee;
import main.FullTimeEmployeeBuilder;
import main.PartTimeEmployeeBuilder;

class EmployeeManagerTest {

    private EmployeeManager manager;

    @BeforeEach
    void setUp() {
        manager = EmployeeManager.getInstance();
        manager.getAllEmployees().clear();  // Ensure clean state before each test
    }

    @Test
    void testSingletonBehavior() {
        EmployeeManager anotherInstance = EmployeeManager.getInstance();
        assertSame(manager, anotherInstance, "EmployeeManager should return the same instance");
    }

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
