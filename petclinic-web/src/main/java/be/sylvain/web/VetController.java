package be.sylvain.web;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import be.heh.petclinic.component.vet.*;
import be.heh.petclinic.domain.Vet;

@RestController
public class VetController {

    @Autowired
    private VetComponent vetComponent;

    
    @RequestMapping("/vets")
    public ResponseEntity<ArrayList<Vet>> getVets() {
         ArrayList<Vet> vets = this.vetComponent.getVets();

         if(!vets.isEmpty()){
             return new ResponseEntity<>(vets,HttpStatus.OK);
         }else{
             return new ResponseEntity<>(HttpStatus.NOT_FOUND);
         }
    }
}
