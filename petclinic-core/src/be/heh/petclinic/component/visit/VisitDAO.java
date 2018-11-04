package be.heh.petclinic.component.visit;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.InvalidResultSetAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import be.heh.petclinic.domain.Visit;
import java.util.List;
import javax.sql.DataSource;

public class VisitDAO {
    private DataSource dataSource;

    public VisitDAO(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Visit> getVisitsOfPet(int petId) {
        JdbcTemplate template = new JdbcTemplate(dataSource);

        return template.query("SELECT * FROM visits WHERE petId = ?", new Object[] { petId }, new VisitRowMapper());
    }

    public Visit getVisit(int id) {
        JdbcTemplate template = new JdbcTemplate(dataSource);
        Visit visit = null;

        try {

            visit = (Visit) template.queryForObject("SELECT * FROM visits WHERE id = ?", new Object[] { id },
                    new VisitRowMapper());

        } catch (InvalidResultSetAccessException e) {
            e.printStackTrace();
        } catch (DataAccessException e) {
            e.printStackTrace();
        }

        return visit;
    }

    public void addVisit(Visit visit) {
        JdbcTemplate template = new JdbcTemplate(dataSource);

        try {

            template.update("INSERT INTO visits(petId, date, description) VALUES (?, ?, ?)",
                    visit.getPetId(), visit.getDate(), visit.getDescription());

        } catch (InvalidResultSetAccessException e) {
            e.printStackTrace();
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
    }
}