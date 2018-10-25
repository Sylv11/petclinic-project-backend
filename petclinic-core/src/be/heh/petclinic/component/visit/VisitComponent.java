package be.heh.petclinic.component.visit;

import java.util.ArrayList;

import be.heh.petclinic.domain.Visit;;

public interface VisitComponent {
    public Visit getVisit(int id);
    public ArrayList<Visit> getVisitOfPet(int petId);
    public ArrayList<Visit> getVisits();
    public void addVisit(Visit visit);
}