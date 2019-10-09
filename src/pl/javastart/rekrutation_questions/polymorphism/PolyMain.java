package pl.javastart.rekrutation_questions.polymorphism;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class PolyMain {
    public static void main(String[] args) {
        //  KSIĄŻKA - ROK WYD.
        Map<String, Integer> books = new HashMap<>();
        books.put("Cudowna Podróż", 1910);
        books.put("Pan Tadeusz", 1834);
        books.put("Krzyżacy", 1900);
        books.put("Lalka", 1890);
        books.put("Romeo i Julia", 1597);

        showBooks(books);
    }
    /*
    polimorfizm inkluzyjny jest oparty o dziedziczenie, który daje
    możliwość przekazania do metody obiektu dowolnego typu
    implementującego interfejs Map.
     */
    private static void showBooks(Map<String, Integer> map) {
        for(String key: map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
    /*
    Polimorfizm ad hoc polega na tym, że o wywołaniu odpowiedniej wersji
    metody decyduje wirtualna maszyna na podstawie typów parametrów.
     */
    private static void showBooks(HashMap<String, Integer> map) {
        for(String key: map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
    private static void showBooks(LinkedHashMap<String, Integer> map) {
        for(String key: map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
    /*
    Polimorfizm parametryczny jest w Javie realizowany przy pomocy
    typów generycznych.
     */
    private static <T, S>void genericShowBooks(HashMap<T, S> map) {
        for(T key: map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
    /*
    Polimorfizm parametryczny można łączyć z polimorfizmem
    ograniczeniowym, co pozwala narzucić dodatkowe
    ograniczenia na typ
     */
    private static <T, S extends Number>void paramGenShowBooks(HashMap<T, S> map) {
        for(T key: map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
