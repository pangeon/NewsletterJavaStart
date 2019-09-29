package pl.javastart.rekrutation_questions.final_keyword.immutable_bean;

public final class Person {
    private final String PESEL;
    private final String BLOOD_GROUP;

    public Person(String pesel, String blood_group) {
        PESEL = pesel;
        BLOOD_GROUP = blood_group;
    }
    public String getPESEL() {
        return PESEL;
    }
    public String getBLOOD_GROUP() {
        return BLOOD_GROUP;
    }
}
