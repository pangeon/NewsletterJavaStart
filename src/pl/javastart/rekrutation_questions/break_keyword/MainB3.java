package pl.javastart.rekrutation_questions.break_keyword;

import java.util.Arrays;

public class MainB3 {
    public static void main(String[] args) {
        int[][] multiTab = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        out:
        for (int[] rows : multiTab) {
            System.out.println("out: " + Arrays.toString(rows));
            // out: [10, 20, 30]
            // out: [40, 50, 60]
            for (int colElem : rows) {
                if (colElem > 50) {
                    System.out.println("in: " + colElem);
                    break out; // in: 60 -> przerywa pętle o etykiecie out
                }
            }
        }
    }
}
