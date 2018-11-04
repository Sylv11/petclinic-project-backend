package be.heh.petclinic.component.visit;

import java.util.List;

import be.heh.petclinic.domain.Visit;;

public interface VisitComponent {
    public Visit getVisit(int id);
    public List<Visit> getVisitsOfPet(int petId);
    public void addVisit(Visit visit);
}