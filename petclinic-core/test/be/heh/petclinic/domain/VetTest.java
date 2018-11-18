package be.heh.petclinic.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class VetTest { 

    private Vet vet = new Vet("James", "James", "radiology");

    @Test
    void test() {
        assertEquals("James", vet.getFirstname());
        assertEquals("James", vet.getLastname());
        assertEquals("radiology", vet.getSpeciality());
    }
}