public class EmployeeFactory {
    public Employee createEmployee(String type) {
        if (type.equalsIgnoreCase("fulltime")) {
            return new FullTimeEmployee();
        } else if (type.equalsIgnoreCase("parttime")) {
            return new PartTimeEmployee();
        }
        throw new IllegalArgumentException("Invalid employee type");
    }
}