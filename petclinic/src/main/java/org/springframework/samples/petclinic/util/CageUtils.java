package org.springframework.samples.petclinic.util;

import org.springframework.samples.petclinic.Pet;
import org.springframework.samples.petclinic.domain.Cage;

public class CageUtils {

    public static boolean canAddMorePetInCage(Cage cage) {
        return cage.getPetCapacity() > cage.getPets().size();
    }

    public static void addPetInCage(Pet pet, Cage cage) {
        if(canAddMorePetInCage(cage)) {
            cage.getPets().add(pet);
        } else {
            throw new RuntimeException("Plus de place dans la cage");
        }
    }

}
