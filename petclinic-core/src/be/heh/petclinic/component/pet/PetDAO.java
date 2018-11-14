package be.heh.petclinic.component.pet;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.InvalidResultSetAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import be.heh.petclinic.domain.Pet;
import java.util.List;
import javax.sql.DataSource;

public class PetDAO {
    private DataSource dataSource;

    public PetDAO(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Pet> getPetsOfOwner(int ownerId) {
        JdbcTemplate template = new JdbcTemplate(dataSource);

        return template.query("SELECT * FROM pets WHERE ownerId = ?", new Object[] { ownerId }, new PetRowMapper());
    }

    public Pet getPet(int id) {
        JdbcTemplate template = new JdbcTemplate(dataSource);
        Pet pet = null;

        try {

            pet = (Pet) template.queryForObject("SELECT * FROM pets WHERE id = ?", new Object[] { id },
                    new PetRowMapper());

        } catch (InvalidResultSetAccessException e) {
            e.printStackTrace();
        } catch (DataAccessException e) {
            e.printStackTrace();
        }

        return pet;
    }

    public void updatePets(int id, Pet pet) {
        JdbcTemplate template = new JdbcTemplate(dataSource);

        try {

            template.update(
                    "UPDATE pets SET ownerId = ?, name = ?, dateBirth = ?, type = ? WHERE id = ?",
                    pet.getOwnerId(), pet.getName(), pet.getDateBirth(), pet.getType(),
                    id);

        } catch (InvalidResultSetAccessException e) {
            e.printStackTrace();
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
    }

    public void addPet(int ownerId, Pet pet) {
        JdbcTemplate template = new JdbcTemplate(dataSource);

        try {

            template.update("INSERT INTO pets(ownerId, name, dateBirth, type) VALUES (?, ?, ?, ?) WHERE ownerId = ?",
                    pet.getOwnerId(), pet.getName(), pet.getDateBirth(), pet.getType(), ownerId);

        } catch (InvalidResultSetAccessException e) {
            e.printStackTrace();
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
    }
}