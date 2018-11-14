package be.heh.petclinic.component.pet;

import java.util.List;

import javax.sql.DataSource;

import be.heh.petclinic.domain.Pet;

class PetComponentImpl implements PetComponent {

    private PetDAO petDAO;

    public PetComponentImpl(DataSource datasource) {
        petDAO = new PetDAO(datasource);
    }

    public List<Pet> getPetsOfOwner(int ownerId) {
        return this.petDAO.getPetsOfOwner(ownerId);
    }

    public Pet getPet(int id) {
        return this.petDAO.getPet(id);
    }

    public void updatePet(int id, Pet pet) {
        this.petDAO.updatePets(id, pet);
    }

    public void addPet(int ownerId, Pet pet) {
        this.petDAO.addPet(ownerId, pet);
    }

}