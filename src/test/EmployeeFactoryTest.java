package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.EmployeeFactory; // Adjust package name if needed
import main.Employee;
import main.FullTimeEmployee;
import main.PartTimeEmployee;

class EmployeeFactoryTest {

    @Test
    void testCreateFullTimeEmployee() {
        EmployeeFactory factory = new EmployeeFactory();
        Employee fullTimeEmployee = factory.createEmployee("Fulltime");

        assertNotNull(fullTimeEmployee, "Full-time employee should not be null");
        assertTrue(fullTimeEmployee instanceof FullTimeEmployee, "Employee should be of type FullTimeEmployee");
    }

    @Test
    void testCreatePartTimeEmployee() {
        EmployeeFactory factory = new EmployeeFactory();
        Employee partTimeEmployee = factory.createEmployee("Parttime");

        assertNotNull(partTimeEmployee, "Part-time employee should not be null");
        assertTrue(partTimeEmployee instanceof PartTimeEmployee, "Employee should be of type PartTimeEmployee");
    }

    @Test
    void testCreateInvalidEmployeeType() {
        EmployeeFactory factory = new EmployeeFactory();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            factory.createEmployee("InvalidType");
        });

        assertEquals("Invalid employee type", exception.getMessage(), "Exception message should match");
    }
}
