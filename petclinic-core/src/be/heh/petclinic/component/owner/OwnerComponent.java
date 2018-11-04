package be.heh.petclinic.component.owner;

import java.util.List;

import be.heh.petclinic.domain.Owner;

public interface OwnerComponent {
    public List<Owner> getOwners();
    public Owner getOwner(int id);
    public void updateOwner(int id, Owner owner);
    public void addOwner(Owner owner);
}