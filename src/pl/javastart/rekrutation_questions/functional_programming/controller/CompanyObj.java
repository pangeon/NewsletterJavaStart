package pl.javastart.rekrutation_questions.functional_programming.controller;

import pl.javastart.rekrutation_questions.functional_programming.model.Employee;
import pl.javastart.rekrutation_questions.functional_programming.model.Position;

import java.util.ArrayList;
import java.util.List;

public class CompanyObj {
    public double salaryByPosition(List<Employee> employees, Position position) {
        List<Employee> empByPos = filterByPos(employees, position);
        return calcSalary(empByPos);
    }
    private List<Employee> filterByPos(List<Employee> employees, Position position) {
       List<Employee> filteredEmp = new ArrayList<>();
       for (Employee e: employees) {
           if(e.getPosition() == position) {
               filteredEmp.add(e);
           }
       }
       return filteredEmp;
    }
    private double calcSalary(List<Employee> employees) {
        double sum = 0;
        for(Employee e: employees) {
            sum += e.getSalary();
        }
        return sum;
    }
}
