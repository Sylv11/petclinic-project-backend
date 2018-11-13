package be.heh.petclinic.component.owner;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.InvalidResultSetAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import be.heh.petclinic.domain.Owner;
import java.util.List;
import javax.sql.DataSource;

public class OwnerDAO {
    private DataSource dataSource;

    public OwnerDAO(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Owner> getOwners() {
        JdbcTemplate template = new JdbcTemplate(dataSource);
        
        return template.query("SELECT * FROM owners", new OwnerRowMapper());
    }

    public Owner getOwner(int id) {
        JdbcTemplate template = new JdbcTemplate(dataSource);
        Owner owner = null;

        try {

            owner = (Owner) template.queryForObject("SELECT * FROM owners WHERE id = ?", new Object[] { id },
                    new OwnerRowMapper());

        } catch (InvalidResultSetAccessException e) {
            e.printStackTrace();
        } catch (DataAccessException e) {
            e.printStackTrace();
        }

        return owner;
    }

    public Owner getOwnerByLastname(String lastname) {
        JdbcTemplate template = new JdbcTemplate(dataSource);
        Owner owner = null;

        try {

            owner = (Owner) template.queryForObject("SELECT * FROM owners WHERE lastname = ?", new Object[] { lastname },
                    new OwnerRowMapper());

        } catch (InvalidResultSetAccessException e) {
            e.printStackTrace();
        } catch (DataAccessException e) {
            e.printStackTrace();
        }

        return owner;
    }

    public void updateOwner(int id, Owner owner) {
        JdbcTemplate template = new JdbcTemplate(dataSource);

        try {

            template.update(
                    "UPDATE owners SET firstname = ?, lastname = ?, address = ?, city = ?, telephone = ? WHERE id = ?",
                    owner.getFirstname(), owner.getLastname(), owner.getAddress(), owner.getCity(), owner.getTelephone(),
                    id);

        } catch (InvalidResultSetAccessException e) {
            e.printStackTrace();
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
    }

    public void addOwner(Owner owner) {
        JdbcTemplate template = new JdbcTemplate(dataSource);

        try {

            template.update("INSERT INTO owners(firstname, lastname, address, city, telephone) VALUES (?, ?, ?, ?, ?)",
                    owner.getFirstname(), owner.getLastname(), owner.getAddress(), owner.getCity(),
                    owner.getTelephone());

        } catch (InvalidResultSetAccessException e) {
            e.printStackTrace();
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
    }
}