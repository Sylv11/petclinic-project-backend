package be.sylvain.web;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import be.heh.petclinic.component.vet.*;
import be.heh.petclinic.domain.Vet;

@RestController
public class VetController {

    VetComponentImpl vetComp = new VetComponentImpl();
    
    @RequestMapping("/vets")
    public ArrayList<Vet> getVets() {
         return this.vetComp.getVets();
    }
}
