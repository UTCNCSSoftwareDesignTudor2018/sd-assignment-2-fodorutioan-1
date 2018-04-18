//package com.sinu.sinu.repository;
//
//import com.sinu.sinu.entity.Course;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import java.util.List;
//
//public class CourseRepositoryImpl implements CourseRepository {
//
//    private static final Logger logger = LoggerFactory.getLogger(StudentRepositoryImpl.class);
//
//    private SessionFactory sessionFactory;
//
//    @Override
//    public List<Course> listCourses() {
//        List<Course> coursesList;
//        Session session = this.sessionFactory.getCurrentSession();
//        coursesList = session.createQuery("from students").list();
//        for (Course c : coursesList) {
//            logger.info("Courses List::" + c);
//        }
//        return coursesList;
//    }
//
//    @Override
//    public List<Course> getCoursesTakenByStudentId(Long studentId) {
//        return null;
//    }
//}
