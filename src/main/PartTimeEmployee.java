package main;

/**
 * <p>The {@code PartTimeEmployee} class represents a part-time employee and extends the
 * abstract {@code Employee} class. It provides concrete implementations for clocking in,
 * clocking out, and tracking work hours for part-time employees.</p>
 *
 * <p>Instances of this class are used to represent employees with part-time working schedules.</p>
 *
 * @since 1.0
 */
public class PartTimeEmployee extends Employee {

    /**
     * Records that the part-time employee has clocked in.
     *
     * <p>This method prints a message indicating that the employee has started their work shift.</p>
     */
    @Override
    public void clockIn() {
        System.out.println("Part-time employee clocked in");
    }

    /**
     * Records that the part-time employee has clocked out.
     *
     * <p>This method prints a message indicating that the employee has ended their work shift.</p>
     */
    @Override
    public void clockOut() {
        System.out.println("Part-time employee clocked out");
    }

    /**
     * Tracks the working hours of the part-time employee.
     *
     * <p>This method prints a message indicating that the system is tracking the employee's hours.</p>
     */
    @Override
    public void trackWorkHours() {
        System.out.println("Tracking part-time employee hours");
    }
}
