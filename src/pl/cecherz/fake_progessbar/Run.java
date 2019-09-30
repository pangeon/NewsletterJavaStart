package pl.cecherz.fake_progessbar;

import java.util.Random;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        double i = 100;
        double random = new Random().nextDouble();
        System.out.println("Please wait systems check errors in your computer...");


        while (i > 0) {
            int time = new Random().nextInt(500);
            Thread.sleep(time);
            i = i - random;

            if(i >= 90) {
                System.out.print(" *******************  ");
            } else if (i <= 90 && i >= 80) {
                System.out.print(" ******************   ");
            } else if (i <= 80 && i >= 70) {
                System.out.print(" ****************     ");
            } else if (i <= 70 && i >= 60) {
                System.out.print(" **************       ");
            } else if (i <= 60 && i >= 50) {
                System.out.print(" ***********          ");
            } else if (i <= 50 && i >= 40) {
                System.out.print(" *********            ");
            } else if (i <= 40 && i >= 30) {
                System.out.print(" ******** (check RAM) ");
            } else if (i <= 30 && i >= 20) {
                System.out.print(" ******               ");
            } else if (i <= 20 && i >= 10) {
                System.out.print(" ****     (check CPU) ");
            } else if (i <= 10 && i >= 0) {
                System.out.print(" **                   ");
            } else if (i <= 0){
                int errors = new Random().nextInt(100);
                System.out.println("Check in your system " + errors + " errors.");
            }
            if(i >= 0) System.out.format("%.2f%n", i);
        }

    }
}
