package be.sylvain.web;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.heh.petclinic.component.owner.OwnerComponent;
import be.heh.petclinic.domain.Owner;


@RestController
public class OwnerController {

    @Autowired
    private OwnerComponent ownerComponent;


    @RequestMapping("/owners")
    public ArrayList<Owner> getOwners() {
         return this.ownerComponent.getOwners();
    }
}
