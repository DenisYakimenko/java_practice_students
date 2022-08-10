package edu.javacourse.studentorder.domain;

import java.time.LocalDate;

public class Adalt extends Person //extends означает что Adalt содержит(унаследовал) поля от Person
{
    private String passportSeria;
    private String passportNumber;
    private LocalDate issueDepartment;
}
