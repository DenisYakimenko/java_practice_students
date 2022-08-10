package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.StudentOrd;

public class SaveStudentOrd {

    public static void main(String[] args) {
         StudentOrd so; // обьявили переменную
         so = new StudentOrd(); //объявили ссылочную часть переменной. порадили so в памяти
         so.setmFirstName("Pavel"); // обращение к полям переменной so
         so.setmLastName("Petrov");

        long an = SaveStudentOrd(so);
         System.out.println(an);
    }

      static long SaveStudentOrd(StudentOrd studOrd){ //(edu.javacourse.studentorder.domain.StudentOrd studOrd) означает что принимаются на входные данные
        // из edu.javacourse.studentorder.domain.StudentOrd и работать буду с этими данными через имя studOrd

        System.out.println(studOrd.getmLastName());
           long ans = 199;
           return ans; //если static то обязателно return (возвратить)
      }
}
