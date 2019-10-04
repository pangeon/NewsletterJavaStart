package pl.javastart.rekrutation_questions.iterable_foreach;

import java.util.Iterator;
import java.util.Random;
import java.util.stream.IntStream;

class Range implements Iterable<Integer> {
    private int start;
    private int end;

    private Range(int a, int b) {
        Random r = new Random();
        this.start = r.nextInt(a);
        this.end = r.nextInt(b);
    }
    @Override
    public Iterator<Integer> iterator() {
        return IntStream.rangeClosed(getStart(), getEnd()).iterator();
    }
    private int getStart() {
        return start;
    }
    public void setStart(int start) {
        this.start = start;
    }
    private int getEnd() {
        return end;
    }
    private void setEnd(int end) {
        this.end = end;
    }
    public static void main(String[] args) {
            int i = 0;
            while (i < 15) {
                Range range = new Range(5, 15);
                for (i = range.getStart(); i <= range.getEnd(); i++) {
                    System.out.print(i + " ");
                }
                System.out.println();
                /*
                pętla for each jest odpowiednikiem tradycyjnej pętli for postaci:
                for(Iterator<Integer> it = range.iterator(); it.hasNext();) {
                    Integer next = it.next();
                    System.out.println(next);
                }
                 */
                Range rangeForeach = new Range(5, 15);
                for (Integer j : rangeForeach) {
                    System.out.print(j + " ");
                }
            }

    }
}

