package pl.javastart.rekrutation_questions.inner_class;

public class User {
    private String login;
    private String email;

    User(String login, String email) {
        this.login = login;
        this.email = email;
    }
    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    public class Personality {
        private String name;
        private String surname;

        Personality(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }
        @Override
        public String toString() {
            return "Personality{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    '}';
        }
    }
    Personality personality(String name, String surname) {
        return new Personality(name, surname);
    }

    public static class Identity {
        private int code;

        Identity(int code) {
            this.code = code;
        }
        @Override
        public String toString() {
            return "Identity{" +
                    "code=" + code +
                    '}';
        }
    }
    Identity intentity(int code) {
        return new Identity(code);
    }
}
