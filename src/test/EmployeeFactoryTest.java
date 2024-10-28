package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.EmployeeFactory;
import main.Employee;
import main.FullTimeEmployee;
import main.PartTimeEmployee;

/**
 * <p>The {@code EmployeeFactoryTest} class contains unit tests to validate the behavior of the
 * {@code EmployeeFactory} class. It ensures that the factory correctly creates different types of
 * employees and handles invalid input gracefully.</p>
 *
 * <p>This class uses JUnit 5 for testing and includes assertions to verify that the objects created
 * by the factory meet the expected criteria.</p>
 *
 * @since 1.0
 */
class EmployeeFactoryTest {

    /**
     * Tests the creation of a full-time employee using the {@code EmployeeFactory}.
     *
     * <p>This test verifies that the created employee object is not {@code null} and is an instance
     * of the {@code FullTimeEmployee} class.</p>
     */
    @Test
    void testCreateFullTimeEmployee() {
        EmployeeFactory factory = new EmployeeFactory();
        Employee fullTimeEmployee = factory.createEmployee("Fulltime");

        assertNotNull(fullTimeEmployee, "Full-time employee should not be null");
        assertTrue(fullTimeEmployee instanceof FullTimeEmployee,
                "Employee should be of type FullTimeEmployee");
    }

    /**
     * Tests the creation of a part-time employee using the {@code EmployeeFactory}.
     *
     * <p>This test verifies that the created employee object is not {@code null} and is an instance
     * of the {@code PartTimeEmployee} class.</p>
     */
    @Test
    void testCreatePartTimeEmployee() {
        EmployeeFactory factory = new EmployeeFactory();
        Employee partTimeEmployee = factory.createEmployee("Parttime");

        assertNotNull(partTimeEmployee, "Part-time employee should not be null");
        assertTrue(partTimeEmployee instanceof PartTimeEmployee,
                "Employee should be of type PartTimeEmployee");
    }

    /**
     * Tests the behavior of the {@code EmployeeFactory} when given an invalid employee type.
     *
     * <p>This test ensures that an {@code IllegalArgumentException} is thrown with the appropriate
     * message when an invalid type is provided.</p>
     */
    @Test
    void testCreateInvalidEmployeeType() {
        EmployeeFactory factory = new EmployeeFactory();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            factory.createEmployee("InvalidType");
        });

        assertEquals("Invalid employee type", exception.getMessage(),
                "Exception message should match");
    }
}
