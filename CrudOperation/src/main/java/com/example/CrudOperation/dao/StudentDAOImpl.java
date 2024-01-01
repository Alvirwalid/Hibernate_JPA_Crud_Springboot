package com.example.CrudOperation.dao;

import com.example.CrudOperation.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImpl implements  StudentDAO{


    //Define Entity Manager
    private EntityManager entityManager;


    //Inject Entity manager using constructor

   @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student student) {

       entityManager.persist(student);

    }
}
