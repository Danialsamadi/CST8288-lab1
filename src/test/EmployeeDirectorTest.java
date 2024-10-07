package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.EmployeeDirector; // Adjust package name if needed
import main.FullTimeEmployeeBuilder;
import main.Employee;

class EmployeeDirectorTest {

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
