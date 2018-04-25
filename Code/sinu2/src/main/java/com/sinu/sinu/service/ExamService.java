package com.sinu.sinu.service;

import com.sinu.sinu.entity.Course;
import com.sinu.sinu.entity.Exam;
import com.sinu.sinu.entity.Student;
import com.sinu.sinu.repository.ExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ExamService {

    @Autowired
    private ExamRepository examRepository;

    public Optional<Exam> getExamById(Long examId) {
        return this.examRepository.findById(examId);
    }
    public List<Exam> getExamsNotRegisteredByStudent(Student student){

        List<Exam> examsList = examRepository.findAll();
        List<Exam> registeredExams = student.getExams();
        List<Exam> notRegisteredExams = new ArrayList<>();
        List<Course> enrolledCourses = student.getCourses();

        for (Exam exam: examsList) {
            if (!registeredExams.contains(exam) && enrolledCourses.contains(exam.getCourse())) {
                notRegisteredExams.add(exam);
            }
        }
        return notRegisteredExams;
    }


}
