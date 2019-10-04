package pl.cecherz.fake_progessbar;

import java.util.Random;

import static java.lang.System.*;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        double i = 100;
        double random = new Random().nextDouble();
        out.println("Please wait systems check errors in your computer...");

        while (i > 0) {
            int time = new Random().nextInt(1000);
            Thread.sleep(time);
            i = i - random;

            if(i >= 90) out.print(" *******************  ");
            else if (i <= 90 && i >= 80) out.print(" ******************   ");
            else if (i <= 80 && i >= 70) out.print(" ****************     ");
            else if (i <= 70 && i >= 60) out.print(" **************       ");
            else if (i <= 60 && i >= 50) out.print(" ***********          ");
            else if (i <= 50 && i >= 40) out.print(" *********            ");
            else if (i <= 40 && i >= 30) out.print(" ******** (check RAM) ");
            else if (i <= 30 && i >= 20) out.print(" ******               ");
            else if (i <= 20 && i >= 10) out.print(" ****     (check CPU) ");
            else if (i <= 10 && i >= 0)  out.print(" **                   ");
            else if (i <= 0) {
                int errors = new Random().nextInt(100);
                out.println("Check in your system " + errors + " errors.");
            }
            if(i >= 0) out.format("%.2f%n", i);
        }
    }
}
