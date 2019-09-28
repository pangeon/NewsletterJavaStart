package pl.javastart.rekrutation_questions.final_keyword;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main initializer = new Main();
        initializer.finalValue(10);

    }
    private void finalValue(int z) {
        final var x = 1;
        print(x);
        final int y;
        print(y = z);
    }
    private static void print(int... ints) {
        System.out.println(Arrays.toString(ints));
    }
}
