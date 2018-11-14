package be.heh.petclinic.component.pet;

import java.util.List;

import be.heh.petclinic.domain.Pet;

public interface PetComponent {
    public Pet getPet(int id);
    public List<Pet> getPetsOfOwner(int ownerId);
    public void updatePet(int id, Pet pet);
    public void addPet(int ownerId, Pet pet);
}