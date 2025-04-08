package solid_violation.dip;

import java.time.LocalDate;

public class Employee {
    private final String firstName;
    private final String lastName;
    private final LocalDate dateOfBirth;
    private final String email;

    public Employee(String firstName, String lastName, LocalDate dateOfBirth, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }
}