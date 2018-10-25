package be.sylvain.web;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.heh.petclinic.component.owner.OwnerComponent;
import be.heh.petclinic.domain.Owner;


@RestController
public class OwnerController {

    @Autowired
    private OwnerComponent ownerComponent;


    @RequestMapping("/owners")
    public ResponseEntity<ArrayList<Owner>> getOwners() {
        ArrayList<Owner> owners =  this.ownerComponent.getOwners();

        if(!owners.isEmpty()){
            return new ResponseEntity<>(owners,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
