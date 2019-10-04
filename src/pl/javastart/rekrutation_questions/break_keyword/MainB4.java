package pl.javastart.rekrutation_questions.break_keyword;

import java.util.Scanner;

// wyrażenia switch expressions dostępne od Java 12 (Preview)
public class MainB4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj swoje imię.");
        String name = sc.nextLine();

        int age = switch(name) {
            case "Kamil": break 33;
            case "Agnieszka": break 46;
            default:
                throw new IllegalStateException("Unexpected value: " + name);
        };
        // inny zapis
        int ages = switch(name) {
            case "Kamil" -> 33;
            case "Agnieszka" -> 46;
            default ->
                throw new IllegalStateException("Unexpected value: " + name);
        };
        System.out.printf("%s ma %d lat", name, ages);
    }
}
