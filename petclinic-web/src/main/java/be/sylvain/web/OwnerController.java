package be.sylvain.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import be.heh.petclinic.component.owner.OwnerComponent;
import be.heh.petclinic.domain.Owner;

@RestController
public class OwnerController {

    @Autowired
    private OwnerComponent ownerComponent;

    @GetMapping("/getOwners")
    public ResponseEntity<List<Owner>> getOwners() {
        List<Owner> owners = this.ownerComponent.getOwners();

        if (!owners.isEmpty()) {
            return new ResponseEntity<List<Owner>>(owners, HttpStatus.OK);
        } else {
            return new ResponseEntity<List<Owner>>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/getOwner/{ownerId}")
    public ResponseEntity<Owner> getOwner(@PathVariable int ownerId) {
        Owner owner = this.ownerComponent.getOwner(Integer.valueOf(ownerId));

        if (owner != null) {
            return new ResponseEntity<Owner>(owner, HttpStatus.OK);
        } else {
            return new ResponseEntity<Owner>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/getOwnerByLastname/{ownerLastname}")
    public ResponseEntity<Owner> getOwner(@PathVariable String ownerLastname) {
        Owner owner = this.ownerComponent.getOwnerByLastname(String.valueOf(ownerLastname));

        if (owner != null) {
            return new ResponseEntity<Owner>(owner, HttpStatus.OK);
        } else {
            return new ResponseEntity<Owner>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/updateOwner/{ownerId}")
    public ResponseEntity<?> updateOwner(@PathVariable int ownerId, @RequestBody Owner ownerUpdated) {

        if (this.ownerComponent.getOwner(Integer.valueOf(ownerId)) != null) {
            this.ownerComponent.updateOwner(ownerId, ownerUpdated);
            Owner owner = this.ownerComponent.getOwner(ownerId);
            return new ResponseEntity<Owner>(owner, HttpStatus.OK);
        } else {
            return new ResponseEntity<String>("This owner doesn't exist", HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/addOwner")
    public ResponseEntity<String> addOwner(@RequestBody Owner newOwner) {

        if (this.ownerComponent.getOwner(newOwner.getId()) == null) {
            this.ownerComponent.addOwner(newOwner);
            return new ResponseEntity<String>("Owner added", HttpStatus.OK);
        } else {
            return new ResponseEntity<String>("This owner already exists", HttpStatus.NOT_FOUND);
        }
    }
}
