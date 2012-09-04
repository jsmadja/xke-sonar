package org.springframework.samples.petclinic.domain;

import org.springframework.samples.petclinic.Owner;
import org.springframework.samples.petclinic.Pet;
import org.springframework.samples.petclinic.Vet;

import java.util.Date;

public class Appointment {

    private Pet pet;

    private Owner owner;

    private Date date;

    private Vet vet;

    public Appointment(Pet pet, Owner owner, Date date, Vet vet) {
        this.pet = pet;
        this.owner = owner;
        this.date = date;
        this.vet = vet;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Vet getVet() {
        return vet;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }
}
