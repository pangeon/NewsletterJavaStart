package pl.javastart.challenge.names_statistics_1.code;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import static java.lang.System.out;


// pomoc: https://www.mkyong.com/java8/java-8-stream-read-a-file-line-by-line/
public class FileUtils implements FileOperations {
    @Override
    public void showFileContent(String fileName) {
        print("--zawartość pliku--\n");
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            stream.forEach(FileUtils::print);
            print("Operacja zakończona powodzeniem !\n");

        } catch(IOException e) {
            print("Błąd wczytywania pliku.");
            e.fillInStackTrace();
        }
    }
    // Jak działają strumienie ? Wyszukiwanie przy użyciu strumieni.
    @Override
    public void checkBasedCriteria(String... args) {
        print("--wyszukana zawartość--\n");
        try (Stream<String> stream = Files.lines(Paths.get(args[0]))) {
            print("Operacja zakończona powodzeniem !\n");
        } catch(IOException e) {
            print("Błąd wczytywania pliku.");
            e.fillInStackTrace();
        }
    }
    private static void print(String s) {
        out.println(s);
    }
}
