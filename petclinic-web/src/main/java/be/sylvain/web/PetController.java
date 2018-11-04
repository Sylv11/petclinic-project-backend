package be.sylvain.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import be.heh.petclinic.component.pet.*;
import be.heh.petclinic.domain.Pet;

@RestController
public class PetController {

    @Autowired
    private PetComponent petComponent;

    @GetMapping("/getPetsOfOwner/{ownerId}")
    public ResponseEntity<List<Pet>> getOwners(@PathVariable int ownerId) {
        List<Pet> pets = this.petComponent.getPetsOfOwner(Integer.valueOf(ownerId));

        if (!pets.isEmpty()) {
            return new ResponseEntity<List<Pet>>(pets, HttpStatus.OK);
        } else {
            return new ResponseEntity<List<Pet>>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/getPet/{id}")
    public ResponseEntity<Pet> getPetsOfOwner(@PathVariable int id) {
        Pet pet = this.petComponent.getPet(Integer.valueOf(id));

        if (pet != null) {
            return new ResponseEntity<Pet>(pet, HttpStatus.OK);
        } else {
            return new ResponseEntity<Pet>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/updatePet/{id}")
    public ResponseEntity<String> updatePet(@PathVariable int id, @RequestBody Pet petUpdated) {

        if (this.petComponent.getPet(Integer.valueOf(id)) != null) {
            this.petComponent.updatePet(id, petUpdated);
            return new ResponseEntity<String>("Pet updated", HttpStatus.OK);
        } else {
            return new ResponseEntity<String>("This pet doesn't exist", HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/addPet")
    public ResponseEntity<String> addPet(@RequestBody Pet newPet) {

        if (this.petComponent.getPet(newPet.getId()) == null) {
            this.petComponent.addPet(newPet);
            return new ResponseEntity<String>("Pet added", HttpStatus.OK);
        } else {
            return new ResponseEntity<String>("This pet already exists", HttpStatus.NOT_FOUND);
        }
    }
}
