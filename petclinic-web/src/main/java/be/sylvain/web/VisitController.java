package be.sylvain.web;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.heh.petclinic.component.visit.*;
import be.heh.petclinic.domain.Visit;;


@RestController
public class VisitController {

    @Autowired
    private VisitComponent visitComponent;


    @RequestMapping("/visits/{petId}")
    public ArrayList<Visit> getVisitOfPet(@PathVariable String petId) {
         return this.visitComponent.getVisitOfPet(Integer.valueOf(petId));
    }
}
