package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.AnswerWedding;
import edu.javacourse.studentorder.domain.StudentOrd;

public class CheckWeddingValidator
{
   public AnswerWedding checkWedding(StudentOrd so) {

        System.out.println("Wedding is running");

        return new AnswerWedding();
    }

}
