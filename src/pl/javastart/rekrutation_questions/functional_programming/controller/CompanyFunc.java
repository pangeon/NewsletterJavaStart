package pl.javastart.rekrutation_questions.functional_programming.controller;

import pl.javastart.rekrutation_questions.functional_programming.model.Employee;
import pl.javastart.rekrutation_questions.functional_programming.model.Position;

import java.util.List;

/*
Klasa jeśli chodzi o fukcjonalność stanowi odpowiednik CompanyObj
różni się tylko zapis

Metoda filter() przyjmuje parametr typu Predicate, który jest interfejsem funkcyjnym.
Sprowadza się on do funkcji przekształcającej argument typu T na wartość typu boolean.
Z tego powodu można w jego miejsce przekazać wyrażenie lambda e -> e.getPosition() == position,
które przekształca obiekt typu Employee (e) na wartość boolean (wynik porównania).

Metoda mapToDouble() przyjmuje parametr typu ToDoubleFunction, który także jest interfejsem funkcyjnym
przekształcającym obiekt typu T na wartość typu double.
W miejsce takiego parametru można przekazać albo wyrażenie lambda, albo tak jak w naszym przykładzie
referencję do metody zgodnej z zadaną funkcją. Referencje do metod lub konstruktorów
zapisujemy używając notacji podwójnego dwukropka.
 */
public class CompanyFunc {
    public double salaryByPosition(List<Employee> employees, Position position) {
        return employees.stream()
                .filter(e -> e.getPosition() == position)
                .mapToDouble(Employee::getSalary).sum();
    }
}
