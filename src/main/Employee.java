package main;

public abstract class Employee {
    protected int id;
    protected String name;
    protected String department;
    protected String role;
    protected int workingHoursPerWeek;
    protected double salary;

    public abstract void clockIn ();

    public abstract void clockOut ();

    public abstract void trackWorkHours ();

    // Getters and setters
    public int getId () {
        return id;
    }

    public void setId ( int id ) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public String getDepartment () {
        return department;
    }

    public void setDepartment ( String department ) {
        this.department = department;
    }

    public String getRole () {
        return role;
    }

    public void setRole ( String role ) {
        this.role = role;
    }

    public int getWorkingHoursPerWeek () {
        return workingHoursPerWeek;
    }

    public void setWorkingHoursPerWeek ( int workingHoursPerWeek ) {
        this.workingHoursPerWeek = workingHoursPerWeek;
    }

    public double getSalary () {
        return salary;
    }

    public void setSalary ( double salary ) {
        this.salary = salary;
    }
}