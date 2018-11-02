package be.heh.petclinic.component.vet;

import org.springframework.jdbc.core.JdbcTemplate;
import be.heh.petclinic.domain.Vet;
import java.util.List;
import javax.sql.DataSource;

public class VetDAO {
    private DataSource dataSource;

    public VetDAO(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Vet> getVets() {
        JdbcTemplate template = new JdbcTemplate(dataSource);
        return template.query("SELECT * FROM vet", new VetRowMapper());
    }
}