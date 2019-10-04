package pl.javastart.rekrutation_questions.inner_class;

public class UserMain {
    public static void main(String[] args) {
        User kamil = new User("pangeon", "pangeon@tlen.pl");
        User.Personality personality = kamil.new Personality("Kamil", "Cecherz");
        User.Personality personalitY2 = kamil.personality("Adam", "Artur");
        User.Identity identity = kamil.intentity(8879002);

        // NIE DA SIĘ - klasa statyczna
        // User.Identity identity2 = kamil.new Identity(9906);

        System.out.println(kamil.toString());
        System.out.println(personality.toString());
        System.out.println(personalitY2.toString());
        System.out.println(identity);
    }
}
