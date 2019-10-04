package pl.javastart.rekrutation_questions.throw_throws;

import java.io.*;
import java.util.stream.Collectors;

public class ExceptionMain {
    public static void main(String[] args) {
        Calc c = new Calc(1, 1);
        c.add();
        c.min();
        c.mult();
        try {
            c.div();
            // ArithmeticException jest wyjątkiem
            // z grupy wyjątków niekontrolowanych
            // (dziedziczących po RuntimeException)
        } catch(ArithmeticException e) {
            System.out.println("Błąd ! nie można dzielić przez zero.");
        }
        try {
            System.out.println();
            String C = c.file();
            System.out.println(C);
            // IOException jest wyjątkiem z grupy wyjątków osbługiwanych
            // (checked exceptions), co oznacza, że dziedziczy bezpośredno
            // po klasie Exception i mamy obowiązek jego obsługi,
            // gdy jakaś metoda deklaruje go w swojej sygnaturze
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class Calc {
    private int a;
    private int b;

    Calc(int a, int b) {
        this.a = a;
        this.b = b;
    }
    int add() {
        System.out.println(a+b);
        return a+b;
    }
    int min() {
        System.out.println(a-b);
        return a-b;
    }
    int mult() throws ArithmeticException {
        System.out.println(a*b);
        return a*b;
    }
    void div() /* throws ArithmeticException */ {
        System.out.println(a/b);
    }
    /**
     * @exception IOException
     */
    String file() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File(
                "/home/cecherz/IdeaProjects/NewsletterJavaStart/"
                + "src/pl/javastart/rekrutation_questions/throw_throws/"
                + "file/numbers.txt"
        )));
        return br.lines().collect(Collectors.joining(System.lineSeparator()));
    }
}
