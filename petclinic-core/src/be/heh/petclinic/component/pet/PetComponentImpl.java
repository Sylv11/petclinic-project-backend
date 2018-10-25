package be.heh.petclinic.component.pet;

import java.util.ArrayList;
import be.heh.petclinic.domain.Pet;

class PetComponentImpl implements PetComponent {

    private ArrayList<Pet> pets = new ArrayList<>();
    
    public PetComponentImpl(){
        this.pets.add(new Pet(1,1,"Sylvain","1998-12-23","dog"));
    }

    public ArrayList<Pet> getPets() {
        return this.pets;
    }

    public ArrayList<Pet> getPetsOfOwner(int ownerId){
        ArrayList<Pet> petsOfOwner = new ArrayList<Pet>();
        for (Pet p : this.pets) {
            if(p.getOwnerId() == ownerId){
                petsOfOwner.add(p);
            }
        }
        return petsOfOwner;
    }

    public Pet getPet(int id){
        for (Pet o : this.pets) {
            if(o.getId() == id){
                return o;
            }
        }
        return null;
    }

    public void updatePet(int id, Pet pet){
        for (int i = 0; i < this.pets.size(); i++) {
            if(this.pets.get(i).getId() == id){
                this.pets.remove(i);
                this.pets.add(pet);
            }
        }
    }

    public void addPet(Pet pet){
        this.pets.add(pet);
    }

}