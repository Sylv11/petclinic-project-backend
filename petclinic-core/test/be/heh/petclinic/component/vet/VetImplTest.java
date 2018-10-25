package be.heh.petclinic.component.vet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import be.heh.petclinic.component.vet.VetComponentImpl;
import be.heh.petclinic.domain.*;
import java.util.ArrayList;

class VetImplTest { 

    VetComponentImpl vetImpl = new VetComponentImpl();

    @Test
    void test() {
        ArrayList<Vet> vets = new VetComponentImpl().getVets();
        ArrayList<Vet> vetsComparator = new ArrayList<>();
        vetsComparator.add(new Vet("Urbain1", "Sylvain1", "Beau1"));
        assertTrue(this.compareVets(vets, vetsComparator));
    }

    boolean compareVets(ArrayList<Vet> v1, ArrayList<Vet> v2) {
        boolean result = true;

        if(v1.size() != v2.size()) result = false;
        else {
            for(int i = 0; i < v1.size(); i++) {
                if(!v1.get(i).getFirstname().equals(v2.get(i).getFirstname())) {
                    result = false;
                }

                if(!v1.get(i).getLastname().equals(v2.get(i).getLastname())) {
                    result = false;
                }

                if(!v1.get(i).getSpecialities().equals(v2.get(i).getSpecialities())) {
                    result = false;
                }
            }
        }

        return result;
    }
}