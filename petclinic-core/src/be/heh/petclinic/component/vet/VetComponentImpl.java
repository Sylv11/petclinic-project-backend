package be.heh.petclinic.component.vet;

import java.util.ArrayList;
import be.heh.petclinic.domain.Vet;

public class VetComponentImpl implements VetComponent {
    public ArrayList<Vet> getVets() {
        ArrayList<Vet> vets = new ArrayList<>();
        
        vets.add(new Vet("Urbain1", "Sylvain1", "NAC"));

        return vets;
    }

    public int countVet()
    {
        ArrayList<Vet> vets = new ArrayList<>();
        
        vets.add(new Vet("Urbain1", "Sylvain1", "Beau1"));

        return vets.size();
    }
}