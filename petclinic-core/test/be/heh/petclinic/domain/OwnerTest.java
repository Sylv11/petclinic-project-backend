package be.heh.petclinic.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class OwnerTest { 

    private Owner owner = new Owner(1, "James", "James", "25 Street of pets","Petcity","0444444444");

    @Test
    void test() {
        assertEquals(1, owner.getId());
        assertEquals("James", owner.getFirstname());
        assertEquals("James", owner.getLastname());
        assertEquals("25 Street of pets", owner.getAddress());
        assertEquals("Petcity", owner.getCity());
        assertEquals("0444444444", owner.getTelephone());
    }
}