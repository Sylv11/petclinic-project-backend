package be.sylvain.web;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.heh.petclinic.component.pet.*;
import be.heh.petclinic.domain.Pet;


@RestController
public class PetController {

    @Autowired
    private PetComponent petComponent;


    @RequestMapping("/pets/{ownerId}")
    public ResponseEntity<ArrayList<Pet>> getPetsOfOwner(@PathVariable String ownerId) {
         ArrayList<Pet> pets = this.petComponent.getPetsOfOwner(Integer.valueOf(ownerId));

         if(!pets.isEmpty()){
             return new ResponseEntity<>(pets,HttpStatus.OK);
         }else{
             return new ResponseEntity<>(HttpStatus.NOT_FOUND);
         }
    }
}
