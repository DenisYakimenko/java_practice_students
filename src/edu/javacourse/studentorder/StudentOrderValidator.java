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

     public void checkAll(){
            StudentOrd[] soArray = readStudentOrds();
            /*for (int c=0; c < soArray.length; c++){
                System.out.println("-------------------");
                checkOneOrder(soArray[c]);
            }*/
         //более короткий и правельный способ цикла for
         for (StudentOrd so : soArray){
             System.out.println("--------------------");
             checkOneOrder(so);
         }
    }

    public void checkOneOrder(StudentOrd so){

        AnswerCityRegister cityAnswer = checkCityRegister(so);

        AnswerWedding wedAnswer = checkWedding(so);
        AnswerChildren childAns = checkChildren(so);
        AnswerStudent studAns = checkStudent(so);

        senMail(so);
    }



    public StudentOrd[] readStudentOrds()
    {
        StudentOrd[] soArray = new StudentOrd[3]; // создали массив из 3 ячеек

        for(int c = 0; c < soArray.length; c++ ) {
          soArray[c] = SaveStudentOrd.buildStudOrd(c);
        }

        return soArray;
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
