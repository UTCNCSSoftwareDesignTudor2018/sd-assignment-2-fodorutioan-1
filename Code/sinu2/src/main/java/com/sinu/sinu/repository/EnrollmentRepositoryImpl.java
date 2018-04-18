//package com.sinu.sinu.repository;
//
//import com.sinu.sinu.entity.Enrollment;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import java.util.List;
//
//public class EnrollmentRepositoryImpl implements EnrollmentRepository {
//
//    private static final Logger logger = LoggerFactory.getLogger(EnrollmentRepositoryImpl.class);
//
//    private SessionFactory sessionFactory;
//
//    public void setSessionFactory(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }
//
//    @Override
//    public List<Enrollment> getEnrollmentsByStudentId(Long studentId) {
//        List<Enrollment> enrollmentsList;
//        Session session = this.sessionFactory.getCurrentSession();
//        enrollmentsList = session.createQuery("from students where student_id="+studentId).list();
//        for (Enrollment e : enrollmentsList) {
//            logger.info("Enrollment List::" + e);
//        }
//        return enrollmentsList;
//    }
//
//    public void addEnrollment(Enrollment enrollment) {
//        Session session = this.sessionFactory.getCurrentSession();
//        session.persist(enrollment);
//        logger.info("Enrollment saved successfully, Enrollment Details=" + enrollment);
//    }
//}
