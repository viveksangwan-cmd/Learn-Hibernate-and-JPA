package com.viveksangwan.database.databasedemo.jbdc;

import com.viveksangwan.database.databasedemo.entity.Person;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


// Custom RowMapper
public class PersonRowMapper implements RowMapper<Person> {
    @Override
    public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
        Person person = new Person();
        // rs.getInt() -> string params => Name of Column
        person.setId(rs.getInt("id"));
        person.setName(rs.getString("name"));
        person.setLocation(rs.getString("location"));
        person.setBirthDate(rs.getDate("birth_date"));
        return person;
    }
}
