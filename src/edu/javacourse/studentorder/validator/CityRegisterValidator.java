package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.AnswerCityRegister;
import edu.javacourse.studentorder.domain.CityRegisterCheckerResponse;
import edu.javacourse.studentorder.domain.StudentOrd;
import edu.javacourse.studentorder.exception.CityRegisterException;

public class CityRegisterValidator
{
    public String hostName;
    private String login;
    String password;

    private CityRegisterChecker personChecker;

    public CityRegisterValidator() {
        personChecker = new FakeCityRegisterChecker();
    }

    public AnswerCityRegister checkCityRegister(StudentOrd so)
    {
        try {
            CityRegisterCheckerResponse hans = personChecker.checkPerson(so.getHusband());
            CityRegisterCheckerResponse wans =  personChecker.checkPerson(so.getWife());
            CityRegisterCheckerResponse cans =  personChecker.checkPerson(so.getChild());
        } catch (CityRegisterException e) {
            e.printStackTrace();
        }


        AnswerCityRegister ans = new AnswerCityRegister();

        return ans;
    }
}
