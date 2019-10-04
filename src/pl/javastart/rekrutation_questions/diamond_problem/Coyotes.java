package pl.javastart.rekrutation_questions.diamond_problem;

public interface Coyotes extends Dogs, Wolfs {
    //Błąd, nie wiadomo, która z metod voice()
    //powinna być odziedziczona.
    //Coyotes inherits unrelated defaults for voice() from types Dogs and Wolfs

    //Błąd naprawia nadpisanie metody domyślnej dostępnej od Java 8
    //Nie do końca aktualne stwierdzenia że w interfejsach mogą być tylko metody abstrakcyjne.
    @Override
    default void voice() {
        System.out.println("Woof woof"); // słowo default sprawia iż metoda może mieć ciało
    }
}
