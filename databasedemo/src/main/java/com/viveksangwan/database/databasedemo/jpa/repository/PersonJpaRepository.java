package com.viveksangwan.database.databasedemo.jpa.repository;

import com.viveksangwan.database.databasedemo.jpa.Entity.PersonJPA;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
@Transactional
public class PersonJpaRepository {

    @PersistenceContext
    EntityManager entityManager;

    public PersonJPA insert(PersonJPA person){
        return entityManager.merge(person);
    }
    public PersonJPA update(PersonJPA person){
        return entityManager.merge(person);
    }
    public Collection<PersonJPA> findAllPerson(){
        Query findAllQuery = entityManager.createNamedQuery("find_all_persons");
        return (Collection<PersonJPA>) findAllQuery.getResultList();
    }
    public PersonJPA findById(int id){
        return entityManager.find(PersonJPA.class,id);
    }
    public void deleteById(int id){
        PersonJPA person = findById(id);
        entityManager.remove(person);
    }
    public void deleteByNameAndLocation(String name,String location){
        Query deleteByNameAndLocationQuery =
                entityManager.createQuery("delete from PersonJPA p where p.name = :name and p.location = :location");
        deleteByNameAndLocationQuery.setParameter("name",name);
        deleteByNameAndLocationQuery.setParameter("location",location);
        deleteByNameAndLocationQuery.executeUpdate();
    }
}
