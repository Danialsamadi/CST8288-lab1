package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.EmployeeDirector;
import main.FullTimeEmployeeBuilder;
import main.Employee;

/**
 * <p>The {@code EmployeeDirectorTest} class contains unit tests to validate the behavior of the
 * {@code EmployeeDirector} class, ensuring that it correctly constructs employee objects using
 * the builder pattern.</p>
 *
 * <p>This class uses JUnit 5 for testing and includes assertions to verify that the constructed
 * employee objects meet the expected criteria.</p>
 *
 * @since 1.0
 */
class EmployeeDirectorTest {

    /**
     * Tests the construction of a full-time employee using the {@code EmployeeDirector} and
     * {@code FullTimeEmployeeBuilder}.
     *
     * <p>This test verifies that the employee object is not {@code null}, and it also checks
     * if the employee's name and role are set correctly.</p>
     */
    @Test
    void testConstructFullTimeEmployee() {
        EmployeeDirector director = new EmployeeDirector();
        Employee fullTimeEmployee = director.constructEmployee(
                new FullTimeEmployeeBuilder()
                        .setId(1)
                        .setName("Jay Parmar")
                        .setDepartment("IT")
                        .setRole("Full Stack Developer")
                        .setWorkingHoursPerWeek(40)
                        .setSalary(7000)
        );

        assertNotNull(fullTimeEmployee, "Employee should not be null");
        assertEquals("Jay Parmar", fullTimeEmployee.getName(), "Employee name should match");
        assertEquals("Full Stack Developer", fullTimeEmployee.getRole(), "Employee role should match");
    }
}
