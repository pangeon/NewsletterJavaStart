package pl.javastart.rekrutation_questions.functional_programming.model;

public class Employee {
    private String name;
    private String surname;
    private Position position;
    private Double salary;

    public Employee(String name, String surname, Double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public Double getSalary() {
        return salary;
    }

    public Position getPosition() {
        return position;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public void setPosition(Position position) {
        this.position = position;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", position=" + position +
                ", salary=" + salary +
                '}';
    }
}
