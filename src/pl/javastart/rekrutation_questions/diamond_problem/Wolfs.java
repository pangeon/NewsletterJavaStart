package pl.javastart.rekrutation_questions.diamond_problem;

public interface Wolfs extends CanineFamily {
    @Override
    default void voice() {
        System.out.println("Woof woof");
    }
}
