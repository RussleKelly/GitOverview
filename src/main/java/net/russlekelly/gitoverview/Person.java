package net.russlekelly.gitoverview;

/**
 * Created by RuslanKuleshov on 25.10.16.
 */
public class Person extends BaseEntity{
    private String firstName;

    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;

    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + super.getId() + '\'' +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
                '}';

                some info on develop branch
                second commit on develop branch
    }
}

