package main;

/**
 * <p>The {@code FullTimeEmployee} class represents a full-time employee and extends the
 * abstract {@code Employee} class. This class provides concrete implementations of the
 * abstract methods for clocking in, clocking out, and tracking work hours.</p>
 *
 * <p>Instances of this class represent employees with full-time working schedules.</p>
 *
 * @since 1.0
 */
public class FullTimeEmployee extends Employee {

    /**
     * Records that the full-time employee has clocked in.
     *
     * <p>This method prints a message indicating the employee has started their work shift.</p>
     */
    @Override
    public void clockIn() {
        System.out.println("Full-time employee clocked in");
    }

    /**
     * Records that the full-time employee has clocked out.
     *
     * <p>This method prints a message indicating the employee has ended their work shift.</p>
     */
    @Override
    public void clockOut() {
        System.out.println("Full-time employee clocked out");
    }

    /**
     * Tracks the working hours of the full-time employee.
     *
     * <p>This method prints a message indicating that the system is tracking the employee's hours.</p>
     */
    @Override
    public void trackWorkHours() {
        System.out.println("Tracking full-time employee hours");
    }
}
