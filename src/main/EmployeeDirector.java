package main;

/**
 * <p>The {@code EmployeeDirector} class is responsible for directing the construction of
 * {@code Employee} objects using the {@code EmployeeBuilder} interface.</p>
 *
 * <p>This class follows the director role in the builder pattern, ensuring that the process
 * of building an {@code Employee} object is managed and encapsulated within a single method.</p>
 *
 * @author DanialSamadi
 * @since 1.0
 */
public class EmployeeDirector {

    /**
     * Constructs an {@code Employee} object using the specified {@code EmployeeBuilder}.
     *
     * <p>This method delegates the construction process to the {@code EmployeeBuilder} instance
     * by invoking its {@code build()} method.</p>
     *
     * @param builder the {@code EmployeeBuilder} instance used to construct the {@code Employee}
     * @return the fully constructed {@code Employee} object
     */
    public Employee constructEmployee(EmployeeBuilder builder) {
        return builder.build();
    }
}
