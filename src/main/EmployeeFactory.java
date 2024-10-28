package main;

/**
 * <p>The {@code EmployeeFactory} class provides a factory method for creating different types
 * of {@code Employee} objects based on the provided type.</p>
 *
 * <p>This class follows the Factory design pattern, enabling the creation of objects without
 * specifying the exact class name. It simplifies object creation by handling the logic
 * for instantiating the appropriate subclass of {@code Employee}.</p>
 *
 * @author DanialSamadi
 * @since 1.0
 */
public class EmployeeFactory {

    /**
     * Creates and returns an {@code Employee} object based on the specified type.
     *
     * <p>The method supports two types:
     * <ul>
     *     <li><b>fulltime</b> - Creates a {@code FullTimeEmployee} object</li>
     *     <li><b>parttime</b> - Creates a {@code PartTimeEmployee} object</li>
     * </ul>
     * </p>
     *
     * @param type the type of employee to create ("fulltime" or "parttime")
     * @return the created {@code Employee} object
     * @throws IllegalArgumentException if the provided type is invalid
     */
    public Employee createEmployee(String type) {
        if (type.equalsIgnoreCase("fulltime")) {
            return new FullTimeEmployee();
        } else if (type.equalsIgnoreCase("parttime")) {
            return new PartTimeEmployee();
        }
        throw new IllegalArgumentException("Invalid employee type");
    }
}
