package pl.javastart.rekrutation_questions.equals_hashcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static java.lang.System.*;

/**
 * Jeżeli w wyniku porównania dwóch obiektów przy pomocy metody equals()
 * otrzymamy wartość true (gdy obiekty są sobie równe),
 * to wynik metody hashCode() dla tych obiektów powinien być identyczny.
 *
 * Jeżeli dla dwóch obiektów metoda hashCode() zwraca taką samą wartość,
 * nie oznacza że obiekty te są sobie równe.
 */
public class Main {

    public static void main(String[] args) {
        String A, B;

        A = "Aa";
        B = "BB";

        Book bookProces = new Book("Proces", 9788205256620L);
        Book bookProces2 = new Book("Proces", 9788205256620L);
        Book bookIdiota = new Book("Idiota", 9780850670356L);

        out.println("..Litery hash..");
        hash("A: ",A); // 2112
        hash("B: ",B); // 2112
        eq(A, B);

        out.println("..Książki hash..");
        hash("Proces: ", bookProces); //1329922279
        hash("Idiota: ", bookIdiota);; //241734564
        hash("Proces 2: ", bookProces2);; //241734564
        eq(bookProces, bookIdiota);
        eq(bookProces, bookProces2);
        out.println(bookProces == bookProces2);

        // HashMap<key: String, value: String>
        printLettersAtList(A, B);

        // HashMap<key: String, value: Long>
        printBooksAtList(bookProces, bookIdiota, bookProces2);
    }
    private static void eq(Object o1, Object o2) {
        out.println("Czy równe: " + (o1.equals(o2) ? "TAK" : "NIE"));
    }
    private static void hash(String message, Object o) {
        out.println(message + " " + o.hashCode());
    }
    private static void printLettersAtList(String... item) {
        out.println("--Lista książek--");
        Map<String, String> bookList = new HashMap<>();
        bookList.put("A", item[0]);
        bookList.put("B", item[1]);

        out.println("Letters A: " + bookList.get("A"));
        out.println("Letters B: " + bookList.get("B"));
    }
    private static void printBooksAtList(Book... item) {
        out.println("--Lista książek--");
        Map<String, Long> bookList = new HashMap<>();
        bookList.put(item[0].getTitle(), item[0].getIsbn());
        bookList.put(item[1].getTitle(), item[1].getIsbn());
        bookList.put(item[2].getTitle(), item[2].getIsbn());

        out.println("ISBN: " + bookList.get(item[0].getTitle()));
        out.println("ISBN: " + bookList.get(item[1].getTitle()));
        out.println("ISBN: " + bookList.get(item[2].getTitle()));
    }
}
class Book {
    private String title;
    private long isbn;

    Book(String title, long isbn) {
        this.title = title;
        this.isbn = isbn;
    }
    String getTitle() { return title; }
    void setTitle(String title) { this.title = title; }
    long getIsbn() { return isbn; }
    void setIsbn(long isbn) { this.isbn = isbn; }

    @Override
    public boolean equals(Object o) {
        //błąd, równy hash nie gwarantuje równości obiektów
        return this.hashCode() == o.hashCode();
    }
    @Override
    public int hashCode() {
        return Objects.hash(title, isbn);
    }
}

