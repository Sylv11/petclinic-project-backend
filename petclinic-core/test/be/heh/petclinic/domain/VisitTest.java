package be.heh.petclinic.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class VisitTest { 

    private Visit visit = new Visit(1, 2, "10-11-2018", "Controle general");

    @Test
    void test() {
        assertEquals(1, visit.getId());
        assertEquals(2, visit.getPetId());
        assertEquals("10-11-2018", visit.getDate());
        assertEquals("Controle general", visit.getDescription());
    }
}