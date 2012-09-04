package org.springframework.samples.petclinic.util;

import org.springframework.samples.petclinic.Pet;
import org.springframework.samples.petclinic.PetType;

public class PetUtils {

    public static String getNameWithPrefix(Pet pet) {

        PetType type = pet.getType();
        String name = pet.getName();
        if(type.equals(PetType.LION)) {
            return "LION: "+ name;
        } else if (type.equals(PetType.CAT)) {
            return "CAT: "+ name;
        } else if (type.equals(PetType.DOG)) {
            return "DOG: "+ name;
        } else if (type.equals(PetType.PIG)) {
            return "PIG: "+ name;
        } else if (type.equals(PetType.BIRD)) {
            char[] typeInChar = new char[]{'B', 'I', 'R', 'D'};
            String typeInString = "";
            for (char c : typeInChar) {
                typeInString+= c;
            }
            return typeInString+": "+name;
        } else if (type.equals(PetType.SNAKE) || type.equals(PetType.CROCODILE)) {
            return "REPTILE: "+name;
        }
        return "UNKNOWN: "+name;
    }

}
