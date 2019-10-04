package pl.javastart.rekrutation_questions.break_keyword;

import java.util.Scanner;

public class MainB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String op = null;
        String name = null;
        System.out.println("Czy chcesz podać swoje imię TAK/NIE");
        op = sc.nextLine();
        switch (op) {
            case "NIE":
                System.out.println("Witaj nieznajomy.");
                break;
            case "TAK":
                System.out.println("Podaj swoje imię.");
                name = sc.nextLine();
                System.out.println("Witaj " + name);
                // break;
                // bez słowa break po name wykona się blok domyślny
            default:
                System.out.println("Miło, że zechciałeś się przedstawić.");
                break;
        }
    }
}
