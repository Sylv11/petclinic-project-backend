package be.heh.petclinic.component.owner;

import javax.sql.DataSource;
import java.util.List;
import be.heh.petclinic.domain.Owner;

class OwnerComponentImpl implements OwnerComponent {

    private OwnerDAO ownerDAO;

    public OwnerComponentImpl(DataSource datasource) {
        ownerDAO = new OwnerDAO(datasource);
    }

    public List<Owner> getOwners() {
        return this.ownerDAO.getOwners();
    }

    public Owner getOwner(int id) {
        return this.ownerDAO.getOwner(id);
    }

    public Owner getOwnerByLastname(String lastname) {
        return this.ownerDAO.getOwnerByLastname(lastname);
    }

    public void updateOwner(int id, Owner owner) {
        this.ownerDAO.updateOwner(id, owner);
    }

    public void addOwner(Owner owner) {
        this.ownerDAO.addOwner(owner);
    }
}