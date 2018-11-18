package be.heh.petclinic.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PetTest {

    private Pet pet = new Pet(1, 2, "Eugene", "23-12-1998", "hamster");

    @Test
    void test() {
        assertEquals(1, pet.getId());
        assertEquals(2, pet.getOwnerId());
        assertEquals("Eugene", pet.getName());
        assertEquals("23-12-1998", pet.getDateBirth());
        assertEquals("hamster", pet.getType());
    }
}