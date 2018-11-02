package be.heh.petclinic.component.vet;

import javax.sql.DataSource;

import java.util.List;
import be.heh.petclinic.domain.Vet;

class VetComponentImpl implements VetComponent {

    private VetDAO vetDAO;

    public VetComponentImpl(DataSource datasource) {
        vetDAO = new VetDAO(datasource);
    }

    public List<Vet> getVets() {
        return this.vetDAO.getVets();
    }
}