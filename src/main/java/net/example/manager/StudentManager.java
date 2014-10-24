package net.example.manager;

import net.example.entity.Student;

/**
 * Created by AmarE on 10/24/2014.
 */
public interface StudentManager {

    void save(Student student);

    Student findStudentById(Long studentId);
}
