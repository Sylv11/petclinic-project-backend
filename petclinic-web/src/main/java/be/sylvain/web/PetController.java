package be.sylvain.web;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

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
    public ArrayList<Pet> getPetsOfOwner(@PathVariable String ownerId) {
         return this.petComponent.getPetsOfOwner(Integer.valueOf(ownerId));
    }
}
