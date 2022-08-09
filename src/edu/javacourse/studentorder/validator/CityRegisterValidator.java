package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.AnswerCityRegister;
import edu.javacourse.studentorder.domain.StudentOrd;

public class CityRegisterValidator
{
    String hostName;
    String login;
    String password;

    AnswerCityRegister checkCityRegister(StudentOrd so)
    {
        System.out.println("checkCityRegister is running:" + hostName+","+login+","+password);
        AnswerCityRegister ans = new AnswerCityRegister();
        ans.success = false;
        return ans;
    }
}
