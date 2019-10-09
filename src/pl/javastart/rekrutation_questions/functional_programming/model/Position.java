package pl.javastart.rekrutation_questions.functional_programming.model;

public class Position {
    private String name;
    public enum Rank {
        LOW, MEDIUM, HIGH
    }
    private Rank rank;

    public Position(String name, Rank rank) {
        this.name = name;
        this.rank = rank;
    }
    public String getName() {
        return name;
    }
    public Rank getRank() {
        return rank;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRank(Rank rank) {
        this.rank = rank;
    }
    @Override
    public String toString() {
        return "Position{" +
                "name='" + name + '\'' +
                ", rank=" + rank +
                '}';
    }
}
