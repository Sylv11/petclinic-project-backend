package be.sylvain.web;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.heh.petclinic.component.pet.*;
import be.heh.petclinic.domain.Pet;


@RestController
public class PetController {

    PetComponentImpl petImpl = new PetComponentImpl();
    
    /*@Autowired
    public VetController(VetComponentImpl vetC) {
        this.vetComp = vetC;
    }*/

    @RequestMapping("/pets/{ownerId}")
    public ArrayList<Pet> getPetsOfOwner(@PathVariable String ownerId) {
         return this.petImpl.getPetsOfOwner(Integer.valueOf(ownerId));
    }
}
