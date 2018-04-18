//package com.sinu.sinu.repository;
//
//import com.sinu.sinu.entity.Student;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public class StudentRepositoryImpl implements StudentRepository {
//
//    private static final Logger logger = LoggerFactory.getLogger(StudentRepositoryImpl.class);
//
//    private SessionFactory sessionFactory;
//
//    public void setSessionFactory(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }
//
//    @Override
//    public List<Student> listStudents() {
//        List<Student> studentsList;
//        Session session = this.sessionFactory.getCurrentSession();
//        studentsList = session.createQuery("from students").list();
//        for (Student s : studentsList) {
//            logger.info("Student List::" + s);
//        }
//        return studentsList;
//    }
//
//    @Override
//    public Student getStudentByUsername(String username) {
//        Session session = this.sessionFactory.getCurrentSession();
//        Student student = session.load(Student.class, username);
//        logger.info("Student loaded successfully, Student details=" + student);
//        return student;
//    }
//
//    @Override
//    public Student getStudentById(Long id) {
//        Session session = this.sessionFactory.getCurrentSession();
//        Student student = session.load(Student.class, id);
//        logger.info("Student loaded successfully, Student details=" + student);
//        return student;
//    }
//
//    @Override
//    public void updateStudent(Student student) {
//        Session session = this.sessionFactory.getCurrentSession();
//        session.update(student);
//        logger.info("Student updated successfully, Student Details=" + student);
//    }
//}
