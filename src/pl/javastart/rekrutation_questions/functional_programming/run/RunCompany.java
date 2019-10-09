package pl.javastart.rekrutation_questions.functional_programming.run;

import pl.javastart.rekrutation_questions.functional_programming.controller.CompanyFunc;
import pl.javastart.rekrutation_questions.functional_programming.controller.CompanyObj;
import pl.javastart.rekrutation_questions.functional_programming.model.Employee;
import pl.javastart.rekrutation_questions.functional_programming.model.Position;

import java.util.ArrayList;
import java.util.List;

public class RunCompany {
    public static void main(String[] args) {
        CompanyObj companyObj = new CompanyObj(); // kontroler gdzie wykorzystano programowanie obiektowe
        CompanyFunc companyFunc = new CompanyFunc(); // kontroler gdzie wykorzystano programowanie funkcyjne
        List<Employee> employeeList = new ArrayList<>(); // tworzenie pustej listy Pracowników

        // tworzenie obiektów klasy Pracownik
        Employee adam = new Employee("Adam", "Wolniewicz", 3300d);
        Employee marcin = new Employee("Marcin", "Kozak", 2950d);
        Employee maria = new Employee("Maria", "Frykowska", 6880d);

        // tworzenie obiektów klasy Stanowisko
        Position marketing = new Position("specjalista ds. marketingu w Internecie", Position.Rank.LOW);
        Position IT = new Position("junior java developer", Position.Rank.MEDIUM);

        // przypisanie stanowisk Pracownikom
        adam.setPosition(marketing);
        marcin.setPosition(marketing);
        maria.setPosition(IT);

        // dodawanie Pracowników do listy
        employeeList.add(adam);
        employeeList.add(marcin);
        employeeList.add(maria);

        // suma wypłat pracowników z określonych stanowisk

        // 1
        final double sum = companyObj.salaryByPosition(employeeList, marketing);
        final double sum2 = companyObj.salaryByPosition(employeeList, IT);
        // 2
        final double sum3 = companyFunc.salaryByPosition(employeeList, marketing);
        final double sum4 = companyFunc.salaryByPosition(employeeList, IT);

        // 1
        System.out.println("Pracownicy marketing: " + sum);
        System.out.println("Pracownicy IT: " + sum2);
        // 2
        System.out.println("Pracownicy marketing: " + sum3);
        System.out.println("Pracownicy IT: " + sum4);
    }
}
