package main;

public class PartTimeEmployee extends Employee {
    @Override
    public void clockIn() {
        System.out.println("Part-time employee clocked in");
    }

    @Override
    public void clockOut() {
        System.out.println("Part-time employee clocked out");
    }

    @Override
    public void trackWorkHours() {
        System.out.println("Tracking part-time employee hours");
    }
}