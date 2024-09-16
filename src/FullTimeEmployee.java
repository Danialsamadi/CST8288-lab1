public class FullTimeEmployee extends Employee {
    @Override
    public void clockIn() {
        System.out.println("Full-time employee clocked in");
    }

    @Override
    public void clockOut() {
        System.out.println("Full-time employee clocked out");
    }

    @Override
    public void trackWorkHours() {
        System.out.println("Tracking full-time employee hours");
    }
}