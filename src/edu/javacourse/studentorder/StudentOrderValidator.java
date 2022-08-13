package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.*;
import edu.javacourse.studentorder.mail.MailSender;
import edu.javacourse.studentorder.validator.CheckChildrenValidator;
import edu.javacourse.studentorder.validator.CheckStudentValidator;
import edu.javacourse.studentorder.validator.CheckWeddingValidator;
import edu.javacourse.studentorder.validator.CityRegisterValidator;

public class StudentOrderValidator
{

    private CityRegisterValidator cityRegisterVal;
    private CheckWeddingValidator weddingVal;
    private CheckChildrenValidator childrenVal;
    private CheckStudentValidator studentVal;
    private MailSender mailSender;

    public StudentOrderValidator(){
        cityRegisterVal = new CityRegisterValidator();
        weddingVal = new CheckWeddingValidator();
        childrenVal = new CheckChildrenValidator();
        studentVal = new CheckStudentValidator();
        mailSender = new MailSender();
    }

   public static void main(String[] args)
    {
        StudentOrderValidator sov = new StudentOrderValidator();
        sov.checkAll();
    }

     public void checkAll()
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

    public StudentOrd readStudentOrd()
    {
        StudentOrd so = new StudentOrd();
        return so;
    }


    public AnswerCityRegister checkCityRegister(StudentOrd so)
    {

        return cityRegisterVal.checkCityRegister(so);
    }

    public AnswerWedding checkWedding(StudentOrd so)
    {

       return weddingVal.checkWedding(so);
    }

    public AnswerChildren checkChildren(StudentOrd so)
    {

        return childrenVal.checkChildren(so);
    }

    public AnswerStudent checkStudent(StudentOrd so)
    {

        return studentVal.checkStudent(so);
    }

    public void senMail(StudentOrd so)
    {

        mailSender.senMail(so);

    }
}
