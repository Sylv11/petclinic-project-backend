package be.heh.petclinic.component.owner;

import java.util.ArrayList;
import be.heh.petclinic.domain.Owner;

public class OwnerComponentImpl implements OwnerComponent {

    private ArrayList<Owner> owners = new ArrayList<>();
    
    public OwnerComponentImpl(){
        this.owners.add(new Owner(1,"Urbain1", "Sylvain1", "Rue de Binche","Mons","044444444"));
    }

    public ArrayList<Owner> getOwners() {
        return this.owners;
    }

    public Owner getOwner(int id){
        for (Owner o : this.owners) {
            if(o.getId() == id){
                return o;
            }
        }

        return null;
    }

    public void updateOwner(int id, Owner owner){
        for (int i = 0; i < this.owners.size(); i++) {
            if(this.owners.get(i).getId() == id){
                this.owners.remove(i);
                this.owners.add(owner);
            }
        }
    }

    public void addOwner(Owner owner){
        this.owners.add(owner);
    }
}