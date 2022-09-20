package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.Adalt;
import edu.javacourse.studentorder.domain.StudentOrd;

public class SaveStudentOrd {

    public static void main(String[] args) {
     //    StudentOrd so; // обьявили переменную
     //    so = new StudentOrd(); //объявили ссылочную часть переменной. порадили so в памяти


      //  long an = SaveStudentOrd(so);
      //   System.out.println(an);


    }

      static long SaveStudentOrd(StudentOrd studOrd){ //(edu.javacourse.studentorder.domain.StudentOrd studOrd) означает что принимаются на входные данные
        // из edu.javacourse.studentorder.domain.StudentOrd и работать буду с этими данными через имя studOrd

       // System.out.println(studOrd.getmLastName());
           long ans = 199;
           return ans; //если static то обязателно return (возвратить)
      }

      public static StudentOrd buildStudOrd(long id){

          StudentOrd so = new StudentOrd();
          so.setStudentOrderId(id);
          /*Adalt husband = new Adalt();
          husband.setGivenName("Andrey");
          husband.setSurName("Petrov");
          husband.setPassportNumber("3453245");
          husband.setAddress("Dement street, 223");
          husband.setStudentId("87878");
          so.setHusband(husband);

          String ans = husband.getPersonString();
          System.out.println(ans);*/

        return so;
      }


}
