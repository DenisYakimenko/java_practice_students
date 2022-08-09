package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.AnswerStudent;
import edu.javacourse.studentorder.domain.StudentOrd;

public class CheckStudentValidator
{
    AnswerStudent checkStudent(StudentOrd so) {
        System.out.println("checkStudent is running");
        return new AnswerStudent();
    }
}
