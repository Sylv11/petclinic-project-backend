package be.heh.petclinic.component.owner;

import org.springframework.jdbc.core.RowMapper;
import java.sql.SQLException;
import java.sql.ResultSet;
import be.heh.petclinic.domain.Owner;

public class OwnerRowMapper implements RowMapper<Owner> {
    @Override
    public Owner mapRow(ResultSet rs, int i) throws SQLException {
        return new Owner(rs.getInt("id"),
                         rs.getString("firstname"),
                         rs.getString("lastname"),
                         rs.getString("address"), 
                         rs.getString("city"), 
                         rs.getString("telephone"));
    }
}