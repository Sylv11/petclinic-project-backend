package be.sylvain.web;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import be.heh.petclinic.component.vet.*;
import be.heh.petclinic.domain.Vet;

@RestController
public class VetController {

    VetComponentImpl vetComp = new VetComponentImpl();
    
    /*@Autowired
    public VetController(VetComponentImpl vetC) {
        this.vetComp = vetC;

    }*/
    @RequestMapping("/vets")
    public ArrayList<Vet> getVets() {
         return this.vetComp.getVets();
        
    }
}
