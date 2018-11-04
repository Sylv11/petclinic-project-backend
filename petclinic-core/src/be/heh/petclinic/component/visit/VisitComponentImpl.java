package be.heh.petclinic.component.visit;

import java.util.List;

import javax.sql.DataSource;

import be.heh.petclinic.domain.Visit;

class VisitComponentImpl implements VisitComponent {

    private VisitDAO visitDAO;

    public VisitComponentImpl(DataSource datasource) {
        visitDAO = new VisitDAO(datasource);
    }

    public List<Visit> getVisitsOfPet(int petId) {
        return this.visitDAO.getVisitsOfPet(petId);
    }

    public Visit getVisit(int id) {
        return this.visitDAO.getVisit(id);
    }

    public void addVisit(Visit visit) {
        this.visitDAO.addVisit(visit);
    }

}