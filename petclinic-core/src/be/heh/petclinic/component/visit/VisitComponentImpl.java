package be.heh.petclinic.component.visit;

import java.util.ArrayList;
import be.heh.petclinic.domain.Visit;

public class VisitComponentImpl implements VisitComponent {

    private ArrayList<Visit> visits = new ArrayList<>();
    
    public VisitComponentImpl(){
        this.visits.add(new Visit(1,1,"2019-12-23","Contrôle général"));
    }

    public ArrayList<Visit> getVisits() {
        return this.visits;
    }

    public ArrayList<Visit> getVisitOfPet(int petId){
        ArrayList<Visit> visitsOfPet = new ArrayList<Visit>();
        for (Visit v : this.visits) {
            if(v.getPetId() == petId){
                visitsOfPet.add(v);
            }
        }
        return visitsOfPet;
    }

    public Visit getVisit(int id){
        for (Visit v : this.visits) {
            if(v.getId() == id){
                return v;
            }
        }
        return null;
    }

    public void addVisit(Visit visit){
        this.visits.add(visit);
    }

}