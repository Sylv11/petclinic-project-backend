package be.heh.petclinic.component.visit;

import org.springframework.jdbc.core.RowMapper;
import java.sql.SQLException;
import java.sql.ResultSet;
import be.heh.petclinic.domain.Visit;

public class VisitRowMapper implements RowMapper<Visit> {
    @Override
    public Visit mapRow(ResultSet rs, int i) throws SQLException {
        return new Visit(rs.getInt("id"),
                         rs.getInt("petId"),
                         rs.getString("date"),
                         rs.getString("description"));
    }
}
