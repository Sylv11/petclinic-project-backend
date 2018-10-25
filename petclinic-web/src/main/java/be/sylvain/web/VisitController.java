package be.sylvain.web;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<ArrayList<Visit>> getVisitOfPet(@PathVariable String petId) {
         ArrayList<Visit> visitsOfPets = this.visitComponent.getVisitOfPet(Integer.valueOf(petId));

         if(!visitsOfPets.isEmpty()){
             return new ResponseEntity<>(visitsOfPets,HttpStatus.OK);
         }else{
             return new ResponseEntity<>(HttpStatus.NOT_FOUND);
         }
    }
}
