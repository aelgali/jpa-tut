package net.example.manager;

import net.example.entity.Student;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * StudentManagerImpl Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Oct 24, 2014</pre>
 */
public class StudentManagerTest {

    protected static EntityManagerFactory factory;
    protected EntityManager entityManager;

    protected StudentManager manager;

    @BeforeClass
    public static void beforeClass() {
        factory = Persistence.createEntityManagerFactory("default");
    }
    @Before
    public void before() throws Exception {
        entityManager = factory.createEntityManager();
        manager = new StudentManagerImpl(entityManager);
    }

    @After
    public void after() throws Exception {
        entityManager.close();
    }

    /**
     * Method: save(Student student)
     */
    @Test
    public void testSave() throws Exception {
        Student student = new Student();
        student.setFirstName("First");
        student.setLastName("Last");
        manager.save(student);
    }

    /**
     * Method: findStudentById(Long studentId)
     */
    @Test
    public void testFindStudentById() throws Exception {
//TODO: Test goes here... 
    }


} 
