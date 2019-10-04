package pl.javastart.rekrutation_questions.main;

/**
 * Jeżeli metoda nie byłaby statyczna, tylko byłaby metodą instancji,
 * to przed jej wywołaniem wymagane byłoby utworzenie obiektu typu,
 * w którym metoda main jest zdefiniowana.
 *
 * W sytuacji, w której w klasie nie byłby zdefiniowany konstruktor
 * bezparametrowy nie byłoby wiadomo, który z konstruktorów wywołać
 * i/lub w jaki sposób dostarczyć do nich odpowiednie parametry
 */
public class Run {
    static {
        System.out.println("Program się uruchamia...");
    }
    public static void main(String string[]) throws InterruptedException {

        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println(i + " Program działa...");
        }
        System.out.println("Zakończenie programu...");
        System.exit(0);
    }
}
