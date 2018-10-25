package be.sylvain.web;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.heh.petclinic.component.visit.*;
import be.heh.petclinic.domain.Visit;;


@RestController
public class VisitController {

    VisitComponentImpl visitImpl = new VisitComponentImpl();
    
    /*@Autowired
    public VetController(VetComponentImpl vetC) {
        this.vetComp = vetC;
    }*/

    @RequestMapping("/visits/{petId}")
    public ArrayList<Visit> getVisitOfPet(@PathVariable String petId) {
         return this.visitImpl.getVisitOfPet(Integer.valueOf(petId));
    }
}
