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
        crv.login = "Login";
        crv.password = "password";
        AnswerCityRegister ans = crv.checkCityRegister(so);

        CityRegisterValidator crv1 = new CityRegisterValidator();
        crv1.hostName = "Host1";
        crv1.login = "Login1";
        crv1.password = "password1";
        AnswerCityRegister ans1 = crv1.checkCityRegister(so);
        return ans;
    }

    static AnswerWedding checkWedding(StudentOrd so)
    {
        System.out.println("Wedding is running");

        return new AnswerWedding();
    }

    static AnswerChildren checkChildren(StudentOrd so)
    {
        System.out.println("checkChildren is running");
        return new AnswerChildren();
    }

    static AnswerStudent checkStudent(StudentOrd so)
    {
        System.out.println("checkStudent is running");
        return new AnswerStudent();
    }

    static void senMail(StudentOrd so)
    {
        System.out.println("Mail is running");
    }
}
