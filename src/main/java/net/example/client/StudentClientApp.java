package net.example.client;

import net.example.entity.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by AmarE on 10/24/2014.
 */
public class StudentClientApp {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();
        Student student = new Student();
        student.setFirstName("First");
        student.setLastName("Last");
        entityManager.persist(student);
        entityManager.getTransaction().commit();
        entityManager.close();

    }
}
