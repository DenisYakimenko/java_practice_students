package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.*;
import edu.javacourse.studentorder.mail.MailSender;
import edu.javacourse.studentorder.validator.CheckChildrenValidator;
import edu.javacourse.studentorder.validator.CheckStudentValidator;
import edu.javacourse.studentorder.validator.CheckWeddingValidator;
import edu.javacourse.studentorder.validator.CityRegisterValidator;

public class StudentOrderValidator
{
   public static void main(String[] args)
    {
        checkAll();
    }

        static void checkAll()
    {
        while (true) {
            StudentOrd so = readStudentOrd();
            System.out.println("start");
            if(so ==null){
                break;
            }
            System.out.println("fin");
            AnswerCityRegister cityAnswer = checkCityRegister(so);
            if(!cityAnswer.success){
               // continue;//continue означает что если условие if совпадает то цикл возвращается в начало цикла
            break;
            }
            AnswerWedding wedAnswer = checkWedding(so);
            AnswerChildren childAns = checkChildren(so);
            AnswerStudent studAns = checkStudent(so);

            senMail(so);
        }
        System.out.println("fin2");
    }

    static StudentOrd readStudentOrd()
    {
        StudentOrd so = new StudentOrd();
        return so;
    }


    static AnswerCityRegister checkCityRegister(StudentOrd so)
    {
        CityRegisterValidator crv = new CityRegisterValidator();
        crv.hostName = "Host";
      //  crv.login = "Login";
       // crv.password = "password";
        AnswerCityRegister ans = crv.checkCityRegister(so);

       // edu.javacourse.studentorder.validator.CityRegisterValidator crv1 = new edu.javacourse.studentorder.validator.CityRegisterValidator();
       // crv1.hostName = "Host1";
       // crv1.login = "Login1";
       // crv1.password = "password1";
       // edu.javacourse.studentorder.domain.AnswerCityRegister ans1 = crv1.checkCityRegister(so);
        return ans;
    }

    static AnswerWedding checkWedding(StudentOrd so)
    {
       CheckWeddingValidator cwv = new CheckWeddingValidator();
       return cwv.checkWedding(so);
    }

    static AnswerChildren checkChildren(StudentOrd so)
    {
        CheckChildrenValidator ccv = new CheckChildrenValidator();
        return ccv.checkChildren(so);
    }

    static AnswerStudent checkStudent(StudentOrd so)
    {
        CheckStudentValidator csv = new CheckStudentValidator();
        return csv.checkStudent(so);
    }

    static void senMail(StudentOrd so)
    {

        //new edu.javacourse.studentorder.mail.MailSender().senMail(so);
        MailSender ms = new MailSender();
        ms.senMail(so);

    }
}
