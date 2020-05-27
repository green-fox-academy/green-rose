import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        String from = "../../src/my-file-list.txt";
        String to = "../../src/copied-list.txt";

        System.out.println(copyFiles(from, to));
    }

    private static boolean copyFiles(String from, String to) {

        List<String> content = new ArrayList();
        try {
            Path fromPath = Paths.get(from);
            List<String> lines = Files.readAllLines(fromPath);
            Path filePath = Paths.get(to);
            Files.write(filePath, lines);
        } catch (Exception e) {
          return false;
        }
        return true;
    }
}