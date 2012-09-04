package org.springframework.samples.petclinic.domain;

import org.springframework.samples.petclinic.Person;

public class Secretaire extends Person {
    protected Secretaire(String firstName, String lastName) {
        super(firstName, lastName);
    }
}
