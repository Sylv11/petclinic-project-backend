package be.sylvain.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import be.heh.petclinic.component.visit.*;
import be.heh.petclinic.domain.Visit;

@RestController
public class VisitController {

    @Autowired
    private VisitComponent visitComponent;

    @GetMapping("/getVisitsOfPet/{petId}")
    public ResponseEntity<List<Visit>> getVisitsOfPet(@PathVariable int petId) {
        List<Visit> visits = this.visitComponent.getVisitsOfPet(Integer.valueOf(petId));

        if (!visits.isEmpty()) {
            return new ResponseEntity<List<Visit>>(visits, HttpStatus.OK);
        } else {
            return new ResponseEntity<List<Visit>>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/getVisit/{id}")
    public ResponseEntity<Visit> getVisit(@PathVariable int id) {
        Visit visit = this.visitComponent.getVisit(Integer.valueOf(id));

        if (visit != null) {
            return new ResponseEntity<Visit>(visit, HttpStatus.OK);
        } else {
            return new ResponseEntity<Visit>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/addVisit")
    public ResponseEntity<String> addVisit(@RequestBody Visit newVisit) {

        if (this.visitComponent.getVisit(newVisit.getId()) == null) {
            this.visitComponent.addVisit(newVisit);
            return new ResponseEntity<String>("Visit added", HttpStatus.OK);
        } else {
            return new ResponseEntity<String>("This visit already exists", HttpStatus.NOT_FOUND);
        }
    }
}
