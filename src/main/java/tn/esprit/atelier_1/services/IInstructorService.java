package tn.esprit.atelier_1.services;

import tn.esprit.atelier_1.entity.Instructor;

import java.util.List;

public interface IInstructorService {
    Instructor addInstructor(Instructor instructor);
    Instructor updateInstructor(Instructor instructor);
    Instructor retrieveInstructor(Long numInstructor);
    List<Instructor> retrieveAll();
    void removeInstructor(Long numInstructor);
    Instructor addInstructorAndAssignToCourses(Instructor instructor, List<Long> numCourses);
    Instructor addAndAssignCourses(Instructor instructor);

    Instructor addInstructorAndAssignToCourse(Instructor instructor, Long numCourse);
}
