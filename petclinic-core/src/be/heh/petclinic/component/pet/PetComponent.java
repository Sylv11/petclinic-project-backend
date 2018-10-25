package be.heh.petclinic.component.pet;

import java.util.ArrayList;

import be.heh.petclinic.domain.Pet;

public interface PetComponent {
    public ArrayList<Pet> getPets();
    public Pet getPet(int id);
    public ArrayList<Pet> getPetsOfOwner(int ownerId);
    public void updatePet(int id, Pet pet);
    public void addPet(Pet pet);
}