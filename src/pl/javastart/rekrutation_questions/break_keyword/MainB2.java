package pl.javastart.rekrutation_questions.break_keyword;

import java.util.Random;
import java.util.Scanner;

public class MainB2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.println("Podaj kolejną liczbę - 1");
            num = sc.nextInt();
            if (num >= new Random().nextInt(100)) { // num >= od 0 do 100
                break;
            } else {
                System.out.println("Podana liczba jest mniejsza od wylosowanej z zakresu (0-100)");
            }
        } while (true); // Nieskończona pętla zaciemnia sens kodu, gdyż przerywa ją instrukcja break
        System.out.println("Super ! Podana liczba jest większa od wylosowanej z zakresu (0-100)");

        // Zapisz upraszcza pętle ale pojawia się problem z warunkiem
        do {
            System.out.println("Podaj kolejną liczbę - 2");
        } while ((num = sc.nextInt()) <= new Random().nextInt(100)); // num >= od 0 do 100
        System.out.println("Super ! Podana liczba jest większa od wylosowanej z zakresu (0-100)");
    }
}
