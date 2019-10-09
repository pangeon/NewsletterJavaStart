package pl.javastart.rekrutation_questions.types;

public class MainTypes {

    private static String name;

    public static void main(String[] args) {
        /*
            boolean - klasa Boolean,
            char - klasa Character,
            byte - klasa Byte,
            short - klasa Short,
            int - klasa Integer,
            long - klasa Long,
            float - klasa Float,
            double - klasa Double.
         */
        System.out.println("Char - MAX: " + Character.MAX_RADIX + " MIN: " + Character.MIN_RADIX);
        System.out.println("Byte - MAX: " + Byte.MAX_VALUE + " MIN: " + Byte.MIN_VALUE);
        System.out.println("Short - MAX: " + Short.MAX_VALUE + " MIN: " + Short.MIN_VALUE);
        System.out.println("Integer - MAX: " + Integer.MAX_VALUE + " MIN: " + Integer.MIN_VALUE);
        System.out.println("Long - MAX: " + Long.MAX_VALUE + " MIN: " + Long.MIN_VALUE);
        System.out.println("Float - MAX: " + Float.MAX_VALUE + " MIN: " + Float.MIN_VALUE);
        System.out.println("Double - MAX: " + Double.MAX_VALUE + " MIN: " + Double.MIN_VALUE);

        System.out.println(name == null ? Integer.parseInt("0") : name.length());
    }
}
