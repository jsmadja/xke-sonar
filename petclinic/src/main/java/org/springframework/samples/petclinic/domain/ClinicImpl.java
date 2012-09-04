package org.springframework.samples.petclinic.domain;

import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class ClinicImpl implements Clinic {

    private Collection<Vet> vets;
    private Collection<Visit> visits;
    private Collection<Appointment> appointments;
    private Collection<Secretaire> secretaires;
    private Map<Integer, Owner> ownersById;
    private Map<Integer, Pet> petsById;
    private Set<Owner> owners;

    private Collection<PetType> petTypes = new ArrayList<PetType>() {
        {
        add(PetType.LION);
        }
    };

    public Collection<Vet> getVets() throws DataAccessException {
        return vets;
    }

    public Collection<PetType> getPetTypes() throws DataAccessException {
        return petTypes;
    }

    public Collection<Owner> findOwners(String lastName) throws DataAccessException {
        return owners;
    }

    public Owner loadOwner(int id) throws DataAccessException {
        return ownersById.get(id);
    }

    public Pet loadPet(int id) throws DataAccessException {
        return petsById.get(id);
    }

    public void storeOwner(Owner owner) throws DataAccessException {
        owners.add(owner);
        ownersById.put(owner.getId(), owner);
    }

    public void storePet(Pet pet) throws DataAccessException {
        petsById.put(pet.getId(), pet);
    }

    public void storeVisit(Visit visit) throws DataAccessException {
        visits.add(visit);
    }

    public void deletePet(int id) throws DataAccessException {
        petsById.remove(loadPet(id));
    }

    public void listAllClients() {
        for (Owner owner : owners) {
            System.err.println(owner.getFullName());
        }
    }
}
