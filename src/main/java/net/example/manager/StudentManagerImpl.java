package net.example.manager;

import net.example.entity.Student;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by AmarE on 10/24/2014.
 */
public class StudentManagerImpl implements StudentManager {

    @PersistenceContext
    protected EntityManager entityManager;

    public StudentManagerImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override
    public Student findStudentById(Long studentId) {
        return entityManager.find(Student.class, studentId);
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
