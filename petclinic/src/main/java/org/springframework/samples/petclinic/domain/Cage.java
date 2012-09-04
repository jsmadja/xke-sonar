package org.springframework.samples.petclinic.domain;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.samples.petclinic.Pet;

import java.util.HashSet;
import java.util.Set;

public class Cage {

    private int hauteur;
    private int largeur;
    private int profondeur;

    private String id = RandomStringUtils.randomAlphanumeric(10);

    private Set<Pet> pets = new HashSet<Pet>();

    private int petCapacity;

    public Cage(int hauteur, int largeur, int profondeur, int petCapacity) {
        this.hauteur = hauteur;
        this.largeur = largeur;
        this.profondeur = profondeur;
        this.petCapacity = petCapacity;
    }

    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int getProfondeur() {
        return profondeur;
    }

    public void setProfondeur(int profondeur) {
        this.profondeur = profondeur;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }

    public int getPetCapacity() {
        return petCapacity;
    }

    public void setPetCapacity(int petCapacity) {
        this.petCapacity = petCapacity;
    }

    private class CageFactory {
        private String name = "CAGE_FACTORY";

        public Cage createCage() {
            return new Cage(5,5,5,10);
        }

        public void repair(Cage cage) {
            // do something to repair the cage
        }

        public void destroy(Cage cage) {
            // do something to destroy the cage
        }
    }

    private final CageFactory factory = new CageFactory();

    public Cage createCage() {
        return factory.createCage();
    }
    public void repairCage() {
        factory.repair(this);
    }
    public void destroyCage() {
        factory.destroy(this);
    }
}
