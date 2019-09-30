package pl.javastart.rekrutation_questions.final_keyword;

import pl.javastart.rekrutation_questions.final_keyword.immutable_bean.Person;

import java.util.Arrays;
import java.util.Random;

// dziedziczenie z tej klasy jest niemożliwe
public final class MainF {
    public static void main(String[] args) {
        MainF initializer = new MainF();
        initializer.finalValue(10);
        pow2(15);

        RandValue randValue = new RandValue();
        randValue.generateInt();

        RandLongValue randLongValue = new RandLongValue();
        randLongValue.generateLong();

        Person person = new Person("ARh+", "86021506099");
        System.out.println(person.getBLOOD_GROUP());
        System.out.println(person.getPESEL());
    }

    private void finalValue(int z) {
        final var x = 1;
        print(x);
        final int y;
        print(y = z);
    }
    // parametr funkcji jest finalny, zapis x = x*x jest niemożliwy
    private static void pow2(final int x) {
        int y = 0;
        y = x*x;
        print(y);
    }
    // konwersja typów może zachodzić od góry: long -> int, jednak nie: int -> long
    static void print(long... args) {
        System.out.println(Arrays.toString(args));
    }
}
class RandValue {
    final void generateInt() {
        int r = new Random().nextInt();
        MainF.print(r);
    }
}
class RandLongValue extends RandValue {
    // @Override nadpisanie metody w klasie dziedziczącej jest niemożliwe
    void generateLong() {
        long r = new Random().nextLong();
        MainF.print(r);
    }
}
