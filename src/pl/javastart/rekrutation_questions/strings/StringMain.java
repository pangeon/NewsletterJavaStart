package pl.javastart.rekrutation_questions.strings;

import java.util.Scanner;

public class StringMain {
    public static void main(String[] args) {
        String agus = "AGNIESZKA";
        String agus2 = new String("AGNIESZKA");
        String agus3 = "AGNIE" + "SZKA";

        System.out.println(agus == agus2); // false
        agus2 = agus.intern();
        System.out.println(agus == agus2); // true
        System.out.println(agus == agus3); // true

        Scanner sc = new Scanner(System.in);
        String agus_ = sc.nextLine(); // napis
        String agus_2 = sc.nextLine(); // napis

        System.out.println(agus_ == agus_2); // false

        /*
        napisy utworzone na bazie constant expressions są internowane,
        co oznacza, że wirtualna maszyna Javy przeprowadza w przypadku
        takich wyrażeń optymalizację i przed utworzeniem nowego obiektu
        typu String sprawdza, czy nie znajduje się on już w obszarze
        pamięci zwanym String constant pool. Jeżeli tak jest to zamiast
        tworzenia nowego obiektu, referencja będzie wskazywała na
        ten już istniejący.

        @documentation
        https://docs.oracle.com/javase/specs/jls/se12/html/jls-3.html#jls-3.10.5
         */
        agus_2 = agus_.intern();
        System.out.println(agus_ == agus_2); // true
    }
}
