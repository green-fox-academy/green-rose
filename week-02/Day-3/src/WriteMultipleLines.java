import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
    public static void main(String[] args) {
        String path = "../../src/my-file-list.txt";
        String word = "apple";
        int number = 5;
        writeToPath(path,word,number);
    }

    private static void writeToPath(String path, String word, int number) {

        List<String> content = new ArrayList();
        for (int i = 0; i < number; i++) {
            content.add(word);
        }
        try {
            Path filePath = Paths.get(path);
            Files.write(filePath, content);
        } catch (Exception e) {

        }
    }
}
