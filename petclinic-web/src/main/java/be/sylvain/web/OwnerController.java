package be.sylvain.web;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.heh.petclinic.component.owner.OwnerComponentImpl;
import be.heh.petclinic.domain.Owner;


@RestController
public class OwnerController {

    OwnerComponentImpl ownerImpl = new OwnerComponentImpl();
    
    /*@Autowired
    public VetController(VetComponentImpl vetC) {
        this.vetComp = vetC;
    }*/

    @RequestMapping("/owners")
    public ArrayList<Owner> getOwners() {
         return this.ownerImpl.getOwners();
    }
}
