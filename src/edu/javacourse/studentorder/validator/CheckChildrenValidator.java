package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.AnswerChildren;
import edu.javacourse.studentorder.domain.StudentOrd;

public class CheckChildrenValidator
{
    AnswerChildren checkChildren(StudentOrd so)
    {
        System.out.println("checkChildren is running");
        return new AnswerChildren();
    }

}
