package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.Child;
import edu.javacourse.studentorder.domain.register.AnswerCityRegister;
import edu.javacourse.studentorder.domain.register.CityRegisterCheckerResponse;
import edu.javacourse.studentorder.domain.StudentOrder;
import edu.javacourse.studentorder.exception.CityRegisterException;
import edu.javacourse.studentorder.validator.register.CityRegisterChecker;
import edu.javacourse.studentorder.validator.register.FakeCityRegisterChecker;

import java.util.Iterator;
import java.util.List;

public class CityRegisterValidator
{
    private CityRegisterChecker personChecker;

    public CityRegisterValidator() {
        personChecker = new FakeCityRegisterChecker();
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        try {
            CityRegisterCheckerResponse hans = personChecker.checkPerson(so.getHusband());
            CityRegisterCheckerResponse wans = personChecker.checkPerson(so.getWife());

            List<Child> children = so.getChildren();

            // применим цикл for для получения списка
            for(int i=0; i<children.size(); i++){

            CityRegisterCheckerResponse cans =
                    personChecker.checkPerson(children.get(i));
            }

            // применим Iterator для получения того же списка
            for(Iterator<Child>it = children.iterator(); it.hasNext();){
                Child child = it.next();
                CityRegisterCheckerResponse cans =
                        personChecker.checkPerson(child);
            }

            // применим цикл for iche для получения списка
            for (Child child : children){
                CityRegisterCheckerResponse cans =
                        personChecker.checkPerson(child);
            }

        } catch (CityRegisterException ex) {
            ex.printStackTrace(System.out);
        }

        AnswerCityRegister ans = new AnswerCityRegister();
        return ans;
    }
}
