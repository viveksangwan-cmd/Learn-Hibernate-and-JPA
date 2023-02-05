package com.viveksangwan.database.databasedemo.jpa.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
// @Table(name=""), Not required because class_name are table_name matches
@NamedQuery(name="find_all_persons",query="select p from PersonJPA p")
public class PersonJPA {
    //@Column(name="id"), Not required as column_name and field_name matches
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String location;
    private Date birthDate;

    @Override
    public String toString() {
        return "\nPerson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    public PersonJPA(String name, String location, Date birthDate) {
        this.name = name;
        this.location = location;
        this.birthDate = birthDate;
    }

    public PersonJPA() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public PersonJPA(int id, String name, String location, Date birthDate) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.birthDate = birthDate;
    }
}
