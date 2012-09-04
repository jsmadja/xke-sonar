package org.springframework.samples.petclinic;

/**
 * Simple JavaBean domain object representing an person.
 *
 * @author Ken Krebs
 */
public class Person extends BaseEntity {

	private String firstName;

	private String lastName;

    protected Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

	protected String getFirstName() {
		return this.firstName;
	}

	protected String getLastName() {
		return this.lastName;
	}

}
