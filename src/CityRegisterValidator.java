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
