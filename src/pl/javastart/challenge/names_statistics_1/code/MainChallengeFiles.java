package pl.javastart.challenge.names_statistics_1.code;

public class MainChallengeFiles {
    private static FileUtils utils = new FileUtils();
    private static final String USER_PATH = "/home/cecherz/";
    private static final String PROJECT_PATH = "IdeaProjects/NewsletterJavaStart/";
    private static final String SOURCE_PATH = "src/pl/javastart/challenge/names_statistics_1/";
    private static final String FILE_PATH = "file/";
    private static final String FILE_NAME = "names.csv";
    private static final String FILE_URL =
            USER_PATH +
            PROJECT_PATH +
            SOURCE_PATH +
            FILE_PATH +
            FILE_NAME;

    public static void main(String[] args) {
        //utils.showFileContent(FILE_URL);
        utils.checkBasedCriteria(FILE_URL);
        printInfo();
    }
    private static void printInfo() {
        System.out.println("--Informacje na temat lokalizacji pliku.--\n");
        System.out.println("USER_PATH: " + USER_PATH);
        System.out.println("PROJECT_PATH: " + PROJECT_PATH);
        System.out.println("SOURCE_PATH: " + SOURCE_PATH);
        System.out.println("FILE_PATH: " + FILE_PATH);
        System.out.println("FILE_NAME: " + FILE_NAME);
    }
}
