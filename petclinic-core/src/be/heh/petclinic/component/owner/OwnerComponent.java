package be.heh.petclinic.component.owner;

import java.util.ArrayList;

import be.heh.petclinic.domain.Owner;

public interface OwnerComponent {
    public ArrayList<Owner> getOwners();
    public Owner getOwner(int id);
    public void addOwner(Owner owner);
    public void updateOwner(int id, Owner owner);
}