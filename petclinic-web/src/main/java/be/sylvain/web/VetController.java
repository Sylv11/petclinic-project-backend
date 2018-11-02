package be.sylvain.web;

import java.util.List;

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
    public ResponseEntity<List<Vet>> getVets() {
        List<Vet> vets = this.vetComponent.getVets();

        if (!vets.isEmpty()) {
            return new ResponseEntity<List<Vet>>(vets, HttpStatus.OK);
        } else {
            return new ResponseEntity<List<Vet>>(HttpStatus.NOT_FOUND);
        }
    }
}
